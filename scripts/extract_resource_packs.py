"""Offline, bounds-checked extraction of observed Digital Chocolate resource packs.

Format corroborated by original Java d.b/m35b and iOS sequel Toolkit
getResourceBytesFromLoadedFile (REA ev_30bd24fd20efbf9d208abb77a8bd2bf4d14e49b3e7333b4ad36168b23e2d017d).
No game code executes. Unknown payloads remain .bin; no level semantics inferred.
"""
from pathlib import Path
import hashlib
import json
import re
import struct
import zipfile

ROOT = Path(__file__).resolve().parents[1] / "reference"

def unpack(data):
    if len(data) < 8:
        raise ValueError('short header')
    size, count = struct.unpack_from('>II', data)
    if size != len(data) or count > (len(data) - 8) // 4:
        raise ValueError('invalid size/count')
    offsets = list(struct.unpack_from('>' + 'I' * count, data, 8))
    if count and (offsets[0] != 8 + 4 * count or offsets != sorted(offsets) or offsets[-1] > size):
        raise ValueError('invalid offset table')
    offsets.append(size)
    return [(offsets[i], data[offsets[i]:offsets[i + 1]]) for i in range(count)]

def main():
    targets = {
        '2d-original': 'original-2d.jar', '2d-sequel': 'bbr-2.jar',
        '3d-original-java': 'bbr-3d.jar', '3d-sequel-java': 'sequel-3d-java.jar',
        '3d-original-ios': '3D_Brick_Breaker_Revolution_1.1.7_ios_3.0.ipa',
        '3d-sequel-ios': '3D_Brick_Breaker_Revolution_2_1.0.8_ios_3.0.ipa',
    }
    manifest = []
    for tag, name in targets.items():
        with zipfile.ZipFile(ROOT / name) as archive:
            for member in archive.namelist():
                leaf = Path(member).name
                if not re.fullmatch(r'r\d+|l\d+_\d+', leaf):
                    continue
                data = archive.read(member)
                out = ROOT / 'decoded-resources' / tag / leaf
                out.mkdir(parents=True, exist_ok=True)
                for index, (offset, payload) in enumerate(unpack(data)):
                    ext = '.png' if payload.startswith(b'\x89PNG\r\n\x1a\n') else '.mid' if payload.startswith(b'MThd') else '.bin'
                    file = out / (str(index).zfill(4) + ext)
                    file.write_bytes(payload)
                    record = dict(game=tag, archive=name, member=member, index=index,
                                  offset=offset, bytes=len(payload), sha256=hashlib.sha256(payload).hexdigest(),
                                  output=str(file.relative_to(ROOT)))
                    if leaf.startswith('l') and len(payload) >= 2:
                        length = int.from_bytes(payload[:2], 'big')
                        if length == len(payload) - 2:
                            record['text_utf8_preview'] = payload[2:].decode('utf-8', errors='replace')
                    manifest.append(record)
    (ROOT / 'decoded-resources' / 'manifest.json').write_text(json.dumps(manifest, indent=2))
    from collections import Counter
    print(Counter(r['game'] for r in manifest))
    print(Counter(Path(r['output']).suffix for r in manifest))

if __name__ == '__main__':
    main()
