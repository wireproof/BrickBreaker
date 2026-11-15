"""Extract original 2D layouts from a supplied reference JAR without executing it.

Corroborated by decompiled k.java loadLevel and d.java resource slicing.
Usage: python3 scripts/extract_levels.py /path/to/original-2d.jar
"""
import hashlib
import json
from pathlib import Path
import struct
import sys
import zipfile

source=Path(sys.argv[1])
out=Path(__file__).resolve().parents[1]/'Resources'
out.mkdir(exist_ok=True)
with zipfile.ZipFile(source) as archive:
    pack=archive.read('r1')
    size,count=struct.unpack_from('>II',pack)
    assert size==len(pack) and 0<count<(len(pack)-8)//4
    offsets=list(struct.unpack_from('>'+str(count)+'I',pack,8))+[len(pack)]
    assert offsets==sorted(offsets) and offsets[0]==8+count*4
    payload=pack[offsets[2]:offsets[3]]
    levels=[]
    for i in range(payload[0]):
        table=1+4*i
        start=table+4+struct.unpack_from('>I',payload,table)[0]
        assert start+2<=len(payload)
        w,h=payload[start:start+2]
        cells=list(payload[start+2:start+2+w*h])
        assert w>0 and h>0 and len(cells)==w*h and all(0<=v<=18 for v in cells)
        levels.append(dict(columns=w,rows=h,cells=cells))
    (out/'levels.json').write_text(json.dumps(levels))
    (out/'original-title.png').write_bytes(pack[offsets[21]:offsets[22]])
    (out/'original-resource-provenance.json').write_text(json.dumps({
        'archive_sha256':hashlib.sha256(source.read_bytes()).hexdigest(),
        'pack':'r1','level_entry':2,'title_entry':21,'level_count':len(levels),
        'paddle_and_ball':'Prototype-drawn geometry, not recovered sprites',
        'decoder_reference':'decompiled-original-2d/sources/defpackage/k.java:4298 and d.java resource slicing'
    },indent=2))
print('Extracted',len(levels),'original layouts')
