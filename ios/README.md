# Brick Breaker — native prototype

Version 0.1.2, build 3. Intended bundle ID: `com.wireproof.bbrevolution`.

This is an early native iOS reconstruction, not a finished port. The collection selector identifies all four requested games; **only the original 2D prototype is playable**. The other three entries are labeled research-only. PalmOS work remains separate.

The first module uses 60 decoded original level layouts and the recovered original title image. Paddle, ball and bricks are prototype-drawn geometry. Physics, scoring and level progression are newly implemented approximations, not validated replicas of the Java engine. Basic multi-hit and solid bricks work; original power-ups, boss behavior, audio and special-brick behavior are not implemented. The app icon is remastered from the supplied original reference.

Controls: drag horizontally to steer, then tap Launch ball. Pause and Games are always available. Progress saves locally under a versioned prototype save file; leaving gameplay or backgrounding pauses it. Unreadable saves are preserved and not overwritten. Start new game asks before replacing prototype progress.

## Build and tests

Generate with `xcodegen generate`, then build the BrickBreaker scheme for iOS or iOS Simulator. Signing assets are external and must never be committed. The app supports iPhone and iPad, portrait and landscape, with a minimum iOS version of 17.

Core verification:

```sh
swiftc Sources/GameCore.swift Tests/main.swift -o /tmp/brickbreaker-core-tests
/tmp/brickbreaker-core-tests Resources/levels.json
```

The UI test target is intended for disposable simulators only. It launches, plays, pauses, rotates and restores progress. Physical-device delivery must not launch the app during the current campaign.

Resource extraction is reproducible with `python3 scripts/extract_levels.py /path/to/original-2d.jar`. Resource provenance is recorded in Resources. Reference archives and the full four-title research collection remain in the project Research directory.

Installation and version readback succeeded on both intended physical devices; neither was launched. Core and iPhone 17 Pro/iPad simulator UI tests passed. Local device records are excluded from this public repository. A successful build or simulated test does not establish physical-device gameplay or visual compatibility.

Version 0.1.2 sets both CFBundleDisplayName and CFBundleName to `Brick Breaker`. The supplied Home Screen screenshot showed the joined fallback name despite the correct display-name field. The bundle has no localized InfoPlist.strings overrides. This metadata correction preserves the bundle ID and remastered icon; installed version evidence is separate from Home Screen visual confirmation.
