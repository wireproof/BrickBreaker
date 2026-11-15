import Foundation

func check(_ condition: @autoclosure () -> Bool,_ name: String) {
    if !condition() { fatalError("FAILED: \(name)") }
    print("PASS: \(name)")
}
let levels=try JSONDecoder().decode([OriginalLevel].self,from:Data(contentsOf:URL(fileURLWithPath:CommandLine.arguments[1])))
check(levels.count==60,"60 original levels decoded")
check(levels.allSatisfy { $0.cells.count==$0.columns*$0.rows && $0.cells.allSatisfy { (0...18).contains($0) } },"every layout has bounded original cell codes")
var state=GameState();state.load(levels,index:0)
check(state.bricks.count==levels[0].cells.filter({ $0>0 }).count,"all first-level cells preserved")
state.movePaddle(-100);check(state.paddleX==23,"left clamp")
state.movePaddle(500);check(state.paddleX==217,"right clamp")
state.movePaddle(120);state.launch();state.ballX=120;state.ballY=285;state.vx=0;state.vy=150
state.step(0.04,levels:levels);check(state.vy<0,"paddle collision rebounds")
state.bricks=[Brick(x:100,y:50,width:30,height:10,hits:1,kind:0)]
state.ballX=115;state.ballY=65;state.vx=0;state.vy = -150;state.launched=true
let prior=state.score;state.step(0.025,levels:levels)
check(state.score>prior && state.level==1 && !state.launched,"last brick scores and advances once")
state.bricks=[Brick(x:100,y:50,width:30,height:10,hits:1,kind:5),Brick(x:5,y:5,width:10,height:10,hits:1,kind:0)]
state.ballX=115;state.ballY=65;state.vx=0;state.vy = -150;state.launched=true
state.step(0.025,levels:levels);check(state.bricks[0].hits==1,"solid brick survives")
state.ballY=325;state.vy=150;state.launched=true;state.step(0.02,levels:levels)
check(state.lives==2 && !state.launched,"lost ball consumes one life")
state.paused=true;let y=state.ballY;state.launched=true;state.step(0.04,levels:levels);check(state.ballY==y,"pause freezes state")
let data=try JSONEncoder().encode(state);let restored=try SaveCodec.decode(data)
check(restored.bricks==state.bricks && restored.score==state.score && restored.lives==state.lives,"save round-trip preserves progress")
do { _=try SaveCodec.decode(Data("{}".utf8));fatalError("corrupt save accepted") } catch { print("PASS: corrupt save rejected") }
for i in levels.indices {
    state=GameState();state.load(levels,index:i);state.launch()
    for _ in 0..<1200 { state.movePaddle(state.ballX);state.step(1.0/60,levels:levels) }
    check(state.ballX.isFinite && state.ballY.isFinite && state.lives>=0,"level \(i+1) finite simulated state")
}
print("CORE TESTS COMPLETE")
