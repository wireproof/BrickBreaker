import SwiftUI
import Combine

@main struct BrickBreakerApp: App {
    @StateObject private var session = GameSession()
    var body: some Scene { WindowGroup { LibraryView().environmentObject(session).preferredColorScheme(.dark) } }
}

final class GameSession: ObservableObject {
    @Published var state = GameState()
    @Published var message = ""
    @Published var playing = false
    let levels: [OriginalLevel]
    private let saveURL: URL
    private var saveClock = 0.0
    private var savingAllowed = true
    init() {
        if let url = Bundle.main.url(forResource: "levels", withExtension: "json") {
            levels = (try? Data(contentsOf: url).decoded()) ?? []
        } else { levels = [] }
        saveURL = FileManager.default.urls(for: .applicationSupportDirectory,in:.userDomainMask)[0]
            .appendingPathComponent("original-2d-prototype-v1.json")
        state.load(levels,index:0)
        if FileManager.default.fileExists(atPath: saveURL.path) {
            do {
                let restored = try SaveCodec.decode(Data(contentsOf:saveURL))
                guard restored.level < levels.count else { throw CocoaError(.coderReadCorrupt) }
                state=restored; state.paused=true
            } catch {
                savingAllowed=false
                message="An existing save could not be read. It has been preserved; this session will not overwrite it."
            }
        }
        if levels.isEmpty { message="Original level resources could not be loaded." }
    }
    func start() { state.paused=false; playing=true }
    func newGame() { state=GameState(); state.load(levels,index:0); save(); start() }
    func tick(_ dt: Double) {
        guard playing else { return }
        state.step(dt,levels:levels); saveClock += dt
        if saveClock>=2 { saveClock=0; save() }
    }
    func pause() { state.paused=true; save() }
    func save() {
        guard savingAllowed else { return }
        do {
            try FileManager.default.createDirectory(at:saveURL.deletingLastPathComponent(),withIntermediateDirectories:true)
            try JSONEncoder().encode(state).write(to:saveURL,options:.atomic)
        } catch { message="Progress could not be saved. Keep the app open and retry later." }
    }
}
private extension Data {
    func decoded() throws -> [OriginalLevel] { try JSONDecoder().decode([OriginalLevel].self,from:self) }
}

struct LibraryView: View {
    @EnvironmentObject var game: GameSession
    @State private var reset=false
    var body: some View {
        NavigationStack {
            ScrollView {
                VStack(alignment:.leading,spacing:18) {
                    Text("REVOLUTION COLLECTION").font(.caption.weight(.bold)).foregroundStyle(.cyan)
                    Text("Brick Breaker").font(.largeTitle.bold())
                    Text("Prototype 0.1 · Original 2D playable").font(.headline)
                    Text("Original level layouts and recovered artwork. Physics are newly implemented; power-ups, bosses, sound and the other three games are still in development.")
                        .foregroundStyle(.secondary)
                    if !game.message.isEmpty { Text(game.message).foregroundStyle(.orange) }
                    VStack(spacing:14) {
                        Image("original-title").interpolation(.none).resizable().scaledToFit().frame(height:120).accessibilityHidden(true)
                        Text("Brick Breaker Revolution").font(.title2.bold())
                        Text("2D · \(game.levels.count) recovered layouts").foregroundStyle(.secondary)
                        Button(game.state.finished ? "Review completed session" : "Play / Continue") { game.start() }
                            .buttonStyle(.borderedProminent).controlSize(.large).disabled(game.levels.isEmpty)
                        Button("Start new game") { reset=true }.buttonStyle(.bordered).controlSize(.large)
                    }.frame(maxWidth:.infinity).padding(24).background(.blue.opacity(0.15),in:RoundedRectangle(cornerRadius:22))
                    ForEach(["Brick Breaker Revolution 2 · 2D","3D Brick Breaker Revolution","3D Brick Breaker Revolution 2"],id:\.self) { title in
                        VStack(alignment:.leading,spacing:5) {
                            Text(title).font(.headline)
                            Text("Research resources preserved · Not playable yet").font(.subheadline).foregroundStyle(.secondary)
                        }.frame(maxWidth:.infinity,alignment:.leading).padding(20).background(.white.opacity(0.06),in:RoundedRectangle(cornerRadius:18))
                    }
                    Text("Saves stay on this device.").font(.footnote).foregroundStyle(.secondary)
                }.padding(24).frame(maxWidth:700).frame(maxWidth:.infinity)
            }.background(Color(red:0.025,green:0.045,blue:0.09))
                .fullScreenCover(isPresented:$game.playing) { PlayView().environmentObject(game) }
                .confirmationDialog("Replace this prototype's current progress?",isPresented:$reset,titleVisibility:.visible) {
                    Button("Start new game",role:.destructive) { game.newGame() }
                }
        }
    }
}

struct PlayView: View {
    @EnvironmentObject var game: GameSession
    @Environment(\.scenePhase) private var phase
    @State private var last: Date?
    private let timer=Timer.publish(every:1.0/60,on:.main,in:.common).autoconnect()
    var body: some View {
        VStack(spacing:8) {
            HStack {
                Button("Games") { game.pause(); game.playing=false }.buttonStyle(.bordered).frame(minHeight:44)
                Spacer()
                Text("\(game.state.score) pts · ♥ \(game.state.lives)").monospacedDigit()
                Spacer()
                Button(game.state.paused ? "Resume" : "Pause") {
                    if game.state.paused { game.state.paused=false } else { game.pause() }
                }.buttonStyle(.bordered).frame(minHeight:44)
            }.padding(.horizontal)
            Text("Original 2D · Level \(game.state.level+1) · Prototype rules").font(.caption).foregroundStyle(.secondary)
            GeometryReader { geo in
                let scale=min(geo.size.width/240,geo.size.height/320)
                let width=240*scale, height=320*scale
                let x=(geo.size.width-width)/2, y=(geo.size.height-height)/2
                Canvas { context,size in
                    context.translateBy(x:x,y:y); context.scaleBy(x:scale,y:scale)
                    context.fill(Path(CGRect(x:0,y:0,width:240,height:320)),with:.color(Color(red:0.02,green:0.16,blue:0.32)))
                    for b in game.state.bricks where b.hits>0 {
                        let colors:[Color]=[.cyan,.blue,.orange,.red,.purple,.gray]
                        let rect=CGRect(x:b.x,y:b.y,width:b.width,height:b.height)
                        context.fill(Path(roundedRect:rect,cornerRadius:1),with:.color(colors[min(5,b.kind)].opacity(b.solid ? 0.8 : 0.5+Double(b.hits)*0.16)))
                        context.fill(Path(CGRect(x:b.x+1,y:b.y+1,width:max(1,b.width-2),height:1)),with:.color(.white.opacity(0.55)))
                    }
                    context.fill(Path(roundedRect:CGRect(x:game.state.paddleX-23,y:290,width:46,height:7),cornerRadius:3),with:.color(.cyan))
                    context.fill(Path(ellipseIn:CGRect(x:game.state.ballX-3,y:game.state.ballY-3,width:6,height:6)),with:.color(.white))
                }.gesture(DragGesture(minimumDistance:0).onChanged { value in
                    guard !game.state.paused && !game.state.finished else { return }
                    game.state.movePaddle((value.location.x-x)/scale)
                }).accessibilityLabel("Game field. Drag horizontally to move the paddle.")
                if game.state.paused || game.state.finished {
                    Text(game.state.finished ? (game.state.lives==0 ? "Game over" : "Layouts completed") : "Paused")
                        .font(.title.bold()).padding(24).background(.ultraThinMaterial,in:RoundedRectangle(cornerRadius:20))
                        .frame(width:geo.size.width,height:geo.size.height)
                }
            }
            HStack {
                Button("Move left") { game.state.movePaddle(game.state.paddleX-18) }.disabled(game.state.paused)
                Spacer()
                Button(game.state.launched ? "Drag to steer" : "Launch ball") { game.state.launch() }
                    .buttonStyle(.borderedProminent).disabled(game.state.launched || game.state.paused || game.state.finished)
                Spacer()
                Button("Move right") { game.state.movePaddle(game.state.paddleX+18) }.disabled(game.state.paused)
            }.controlSize(.large).padding(.horizontal).padding(.bottom,8)
        }.background(Color(red:0.025,green:0.045,blue:0.09))
            .onReceive(timer) { now in
                let dt=last.map { now.timeIntervalSince($0) } ?? 0;last=now;game.tick(dt)
            }
            .onChange(of:phase) { _,newPhase in if newPhase != .active { game.pause();last=nil } }
            .onDisappear { game.pause();last=nil }
    }
}
