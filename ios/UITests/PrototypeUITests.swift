import XCTest

final class PrototypeUITests: XCTestCase {
    func capture(_ name: String) {
        let attachment=XCTAttachment(screenshot:XCUIScreen.main.screenshot())
        attachment.name=name;attachment.lifetime = .keepAlways;add(attachment)
    }
    func testPlayPauseSaveAndRotate() {
        continueAfterFailure=false
        let app=XCUIApplication();app.launch()
        XCTAssertTrue(app.buttons["Play / Continue"].waitForExistence(timeout:20))
        capture("library-portrait")
        app.buttons["Play / Continue"].tap()
        XCTAssertTrue(app.buttons["Launch ball"].waitForExistence(timeout:5))
        capture("original-level-portrait")
        app.buttons["Launch ball"].tap()
        XCTAssertTrue(app.buttons["Drag to steer"].exists)
        app.buttons["Move right"].tap();app.buttons["Move left"].tap()
        app.buttons["Pause"].tap()
        XCTAssertTrue(app.staticTexts["Paused"].exists)
        capture("paused-portrait")
        XCUIDevice.shared.orientation = .landscapeLeft
        XCTAssertTrue(app.buttons["Resume"].waitForExistence(timeout:5))
        capture("paused-landscape")
        app.buttons["Games"].tap()
        XCTAssertTrue(app.buttons["Play / Continue"].waitForExistence(timeout:5))
        app.terminate();app.launch()
        app.buttons["Play / Continue"].tap()
        XCTAssertTrue(app.buttons["Pause"].waitForExistence(timeout:5))
        capture("restored-landscape")
        app.terminate();XCUIDevice.shared.orientation = .portrait
    }
}
