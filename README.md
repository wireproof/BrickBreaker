# Brick Breaker

Research foundation for one modern iOS application containing four distinct games:

- Brick Breaker Revolution (2D)
- Brick Breaker Revolution 2 (2D)
- 3D Brick Breaker Revolution
- 3D Brick Breaker Revolution 2

## Current status

This is an experimental reverse-engineering and resource-recovery project. **Version 0.1.0 is a native ARM64 prototype of the original 2D game with 60 recovered layouts and title artwork. The other three games are research-only menu entries.** PalmOS versions are a separate planned effort and may be individual applications.

The intended modern app name is **Brick Breaker**, with bundle ID `com.wireproof.bbrevolution`. A final custom icon has not been established. Preserve each game's original presentation and mechanics.

## Build

See `ios/README.md`; generate the Xcode project with XcodeGen in `ios/`. The custom icon is deferred.

## Included material

- `sources/`: JADX-recovered Java code for all four games. These are decompiler outputs, not original publisher source. Errors, obfuscated names and missing methods remain; they are not a verified compilable port.
- `scripts/extract_resource_packs.py`: bounds-checked extractor for the observed big-endian resource-pack format.
- `reference/`: four Java archives, two sanitized legacy iOS reference IPAs and all 15,683 extracted resource payloads in `decoded-resources.zip`. The manifest retains member offsets and payload SHA-256 values. Payloads include text, images, MIDI and still-opaque data; this is not a count of unique visual assets.
- `docs/reference-ipa-sanitization.json`: source/publication hashes and exact metadata removals.

The two reference IPAs are original-era 3D editions (1.1.7 and sequel 1.0.8), **not the intended four-game app**. They contain only ARMv6/ARMv7 code and cannot run natively on current ARM64-only iOS merely by resigning. Publication copies have purchase metadata, provisioning/signature material where present, and analytics configuration removed. They are preserved for offline analysis and have not been installation-tested. Original research copies remain separate.

## Findings and limitations

REA/Ghidra static analysis recovered named native engine functions, including resource selection, ball speed and level loading. The resource-pack format is corroborated by Java and native code. Each of the 15,683 extracted payloads was checked against its original archive-member byte range and SHA-256. Static analysis and title-artwork comparison do not establish gameplay fidelity, exact video-build identity or device compatibility.

Original 2D code produced no explicit failed-method markers in the inspected decompilation. Other variants retain decompiler errors. Both native iOS 3D releases require platform reconstruction. The native prototype uses approximate physics and drawn paddle, ball and bricks. Power-ups, bosses, sound and original special-brick behavior are not implemented.

## Reproduce resource extraction

Use Python 3 and run `python3 scripts/extract_resource_packs.py` from the repository. It writes `reference/decoded-resources/` and its manifest. It does not execute the games. Sources were acquired from the Archive.org items listed below; Java redistribution manifests may include third-party modifications, so publisher authenticity is not established.

## Reference downloads

- https://archive.org/details/j2me-game-brick-breaker-revolution-multiscreen
- https://archive.org/details/j2me-game-brick-breaker-revolution-2
- https://archive.org/details/j2me-game-brick-breaker-revolution-3d
- https://archive.org/details/j2me-game-brick-breaker-revolution-2-3d
- https://archive.org/details/3D_Brick_Breaker_Revolution_1.1.7_ios_3.0
- https://archive.org/details/3D_Brick_Breaker_Revolution_2_1.0.8_ios_3.0

## Release status

The prerelease includes an unsigned modern Brick Breaker IPA requiring recipient signing. Legacy IPAs remain research references. No installation, physical-device launch, runtime test or visual verification is claimed. Personal recordings, device delivery records, local tool logs, account metadata and saves are not publication assets.

## Prototype verification

Core tests cover all 60 layouts, collision cases, pause and save serialization. iPad simulator UI tests passed play, controls, pause, rotation and reopening; portrait and landscape screenshots were inspected. Physical-device installation is pending a shared transfer lock held by another project. No physical launch or runtime verification is claimed.

![iPad prototype](docs/screenshots/ipad-original-level-portrait.png)
