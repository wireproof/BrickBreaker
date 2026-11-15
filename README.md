# Brick Breaker

Research foundation for one modern iOS application containing four distinct games:

- Brick Breaker Revolution (2D)
- Brick Breaker Revolution 2 (2D)
- 3D Brick Breaker Revolution
- 3D Brick Breaker Revolution 2

## Current status

This is an experimental reverse-engineering and resource-recovery project. **Version 0.1.2 is a native ARM64 prototype of the original 2D game with 60 recovered layouts and title artwork. The other three games are research-only menu entries.** PalmOS versions are a separate planned effort and may be individual applications.

The intended modern app name is **Brick Breaker**, with bundle ID `com.wireproof.bbrevolution`. The app icon is remastered from the supplied original reference. Preserve each game's original presentation and mechanics.

## Build

See `ios/README.md`; generate the Xcode project with XcodeGen in `ios/`. Version 0.1.2 updates the app icon; gameplay remains the original 2D prototype.

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

The prerelease includes an unsigned modern Brick Breaker IPA requiring recipient signing. Legacy IPAs remain research references. Version 0.1.2 build 3 was installed on both intended physical devices and its identity/version read back. Neither physical app was launched; physical runtime and visual tests were not performed. Personal recordings, device delivery records, local tool logs, account metadata and saves are not publication assets.

## Prototype verification

Core tests cover all 60 layouts, collision cases, pause and save serialization. iPhone 17 Pro and iPad simulator UI tests passed play, controls, pause, rotation and reopening; portrait and landscape screenshots were inspected. Physical installation and version readback succeeded on iPhone Duo and 11-inch iPad Pro. The Duo-specific simulator runtime stalled; phone UI coverage used iPhone 17 Pro. No physical launch or runtime verification is claimed.

![iPad prototype](docs/screenshots/ipad-original-level-portrait.png)

## Remastered icon

![Remastered app icon](ios/Resources/Assets.xcassets/AppIcon.appiconset/AppIcon.png)

Version 0.1.2 sets both CFBundleDisplayName and CFBundleName to `Brick Breaker`. The supplied Home Screen screenshot showed the joined fallback name despite the correct display-name field. The bundle has no localized InfoPlist.strings overrides. This metadata correction preserves the bundle ID and remastered icon; installed version evidence is separate from Home Screen visual confirmation.
