package defpackage;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: loaded from: bbr-2.jar:bd.class */
public abstract class bd extends MIDlet implements Runnable {
    private long b;
    private int eD;
    private int[] aH;
    private int eE;
    private boolean aB;
    private boolean aC;
    protected boolean aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;

    /* JADX INFO: renamed from: aH, reason: collision with other field name */
    private boolean f60aH;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    static bd f61b;
    static boolean aI;

    protected bd() {
        f61b = this;
        ba.a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.aC) {
                this.aH = new int[8];
                aa();
                ba.initialize();
                o(2);
                this.aC = true;
            }
            if (this.aG) {
                o(1);
                ba.D(1);
                this.aF = false;
                this.aG = false;
                ba.V();
            }
            if (!this.aF && !this.aD) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i = (int) (jCurrentTimeMillis - this.b);
                this.b = jCurrentTimeMillis;
                this.eE -= Math.min(this.aH[this.eD], 500);
                this.eE += Math.min(i, 500);
                this.aH[this.eD] = i;
                this.eD = (this.eD + 1) & 7;
                int i2 = this.eE >> 3;
                if (!aI) {
                    ap apVarA = ba.a();
                    int iJ = J();
                    if (apVarA.ai && apVarA.dK != 0) {
                        apVarA.dJ += iJ;
                        if (apVarA.dJ > apVarA.dK) {
                            apVarA.dI = 1;
                            apVarA.ai = false;
                            f61b.o(5);
                        }
                    }
                }
                aI = false;
                ba.S();
                n(i2);
                ba.D(2);
                ba.V();
            }
            Thread.sleep(1L);
            if (this.aD || this.aF) {
                synchronized (this) {
                    this.f60aH = false;
                }
            } else {
                Display.getDisplay(this).callSerially(this);
            }
        } catch (Exception unused) {
            if (this.aD || this.aF) {
                synchronized (this) {
                    this.f60aH = false;
                }
            } else {
                Display.getDisplay(this).callSerially(this);
            }
        } catch (Throwable th) {
            if (this.aD || this.aF) {
                synchronized (this) {
                    this.f60aH = false;
                }
            } else {
                Display.getDisplay(this).callSerially(this);
            }
            throw th;
        }
        if (!this.aD || this.aE) {
            return;
        }
        ba.R();
        ba.T();
        o(3);
        notifyDestroyed();
    }

    protected void destroyApp(boolean z) {
        ba.R();
        ba.T();
        this.aE = z;
        this.aD = true;
        if (z) {
            o(3);
        }
    }

    protected void pauseApp() {
        if (this.aF) {
            return;
        }
        ba.Q();
        ba.R();
        o(0);
        ba.D(0);
        this.aF = true;
    }

    protected void startApp() {
        if (this.aB && this.aF) {
            this.b = System.currentTimeMillis();
            this.aG = true;
            synchronized (this) {
                if (this.aF && !this.f60aH) {
                    this.f60aH = true;
                    Display.getDisplay(this).callSerially(this);
                }
            }
            return;
        }
        if (this.aB) {
            return;
        }
        ba.setVisible(true);
        synchronized (this) {
            if (!this.f60aH) {
                this.f60aH = true;
                Display.getDisplay(this).callSerially(this);
            }
        }
        this.aB = true;
    }

    public abstract void b(Graphics graphics);

    public abstract void n(int i);

    public abstract void b(int i, int i2);

    public abstract void o(int i);

    public abstract String[][] a();

    public abstract String a(int i);

    protected final void aa() {
        this.b = System.currentTimeMillis();
        this.eD = 0;
        for (int i = 0; i < 8; i++) {
            this.aH[i] = 40;
        }
        this.eE = 320;
    }

    public final int J() {
        int i = this.eD - 1;
        int i2 = i;
        if (i < 0) {
            i2 = 7;
        }
        return this.aH[i2];
    }

    public static boolean b(String str) {
        boolean z = true;
        try {
            if (f61b.platformRequest(str)) {
                f61b.destroyApp(false);
            }
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }
}
