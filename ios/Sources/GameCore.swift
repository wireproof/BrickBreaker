import Foundation

struct OriginalLevel: Codable { let columns: Int; let rows: Int; let cells: [Int] }
struct Brick: Codable, Equatable {
    var x: Double; var y: Double; var width: Double; var height: Double
    var hits: Int; let kind: Int
    var solid: Bool { kind == 5 }
}
struct GameState: Codable {
    var schema = 1
    var level = 0; var score = 0; var lives = 3
    var paddleX = 120.0
    var ballX = 120.0; var ballY = 278.0
    var vx = 75.0; var vy = -130.0
    var launched = false; var paused = false; var finished = false
    var bricks: [Brick] = []
    static let paddleY = 290.0, paddleWidth = 46.0, radius = 3.0

    mutating func load(_ levels: [OriginalLevel], index: Int) {
        guard !levels.isEmpty else { finished = true; return }
        level = min(max(0,index),levels.count-1)
        let original = levels[level]
        let width = 224.0 / Double(original.columns)
        // Keep original cell arrangement. Scale tall levels to the prototype playfield.
        let height = min(12.0, 180.0 / Double(original.rows))
        bricks = original.cells.enumerated().compactMap { i,v in
            guard v > 0 && v <= 18 else { return nil }
            return Brick(x: 8 + Double(i % original.columns)*width,
                         y: 18 + Double(i / original.columns)*height,
                         width: width-1, height: height-1, hits: (v-1)%3+1, kind: (v-1)/3)
        }
        resetBall()
    }
    mutating func resetBall() {
        launched = false; ballX = paddleX; ballY = Self.paddleY-10
        vx = 75; vy = -130
    }
    mutating func movePaddle(_ x: Double) {
        paddleX = min(240-Self.paddleWidth/2,max(Self.paddleWidth/2,x))
        if !launched { ballX = paddleX }
    }
    mutating func launch() { if !paused && !finished && lives > 0 { launched = true } }
    mutating func step(_ elapsed: Double, levels: [OriginalLevel]) {
        guard launched && !paused && !finished else { return }
        let delta = min(max(elapsed,0),0.05)
        let steps = max(1,Int(ceil(delta/0.004)))
        for _ in 0..<steps {
            guard launched && !finished else { break }
            let oldX=ballX, oldY=ballY, dt=delta/Double(steps)
            ballX += vx*dt; ballY += vy*dt
            if ballX < 3 { ballX=3; vx=abs(vx) }
            if ballX > 237 { ballX=237; vx = -abs(vx) }
            if ballY < 3 { ballY=3; vy=abs(vy) }
            if vy > 0 && oldY+3 <= Self.paddleY && ballY+3 >= Self.paddleY && abs(ballX-paddleX) <= Self.paddleWidth/2+3 {
                ballY=Self.paddleY-3
                let fraction=max(-1.0,min(1.0,(ballX-paddleX)/(Self.paddleWidth/2)))
                vx=fraction*135; vy = -sqrt(max(2500,22500-vx*vx))
            }
            for i in bricks.indices where bricks[i].hits > 0 {
                let b=bricks[i]
                guard ballX+3>=b.x && ballX-3<=b.x+b.width && ballY+3>=b.y && ballY-3<=b.y+b.height else { continue }
                if !b.solid { bricks[i].hits -= 1; score += bricks[i].hits == 0 ? 100 : 10 }
                if oldY+3<=b.y { ballY=b.y-3; vy = -abs(vy) }
                else if oldY-3>=b.y+b.height { ballY=b.y+b.height+3; vy=abs(vy) }
                else if oldX < b.x { ballX=b.x-3; vx = -abs(vx) }
                else { ballX=b.x+b.width+3; vx=abs(vx) }
                break
            }
            if ballY > 326 { lives -= 1; resetBall(); if lives<=0 { finished=true }; break }
            if !bricks.contains(where: { $0.hits>0 && !$0.solid }) {
                if level+1 < levels.count { load(levels,index:level+1) }
                else { finished=true; launched=false }
                break
            }
        }
    }
}

enum SaveCodec {
    static func decode(_ data: Data) throws -> GameState {
        let s = try JSONDecoder().decode(GameState.self,from:data)
        guard s.schema==1, s.level>=0, s.lives>=0, s.lives<=3,
              [s.paddleX,s.ballX,s.ballY,s.vx,s.vy].allSatisfy({ $0.isFinite }),
              s.bricks.count<=10000 else { throw CocoaError(.coderReadCorrupt) }
        return s
    }
}
