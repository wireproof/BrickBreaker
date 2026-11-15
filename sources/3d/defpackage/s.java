package defpackage;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: loaded from: bbr-3d.jar:s.class */
public abstract class s extends MIDlet implements Runnable {
    private long c;
    private int fN;
    private int[] bJ;
    private int fO;
    private boolean ar;
    private boolean as;
    protected boolean at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    static s b;
    static boolean ay;

    protected s() {
        b = this;
        p.a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.as) {
                this.bJ = new int[8];
                aA();
                p.initialize();
                D(2);
                this.as = true;
            }
            if (this.aw) {
                D(1);
                p.z(1);
                this.av = false;
                this.aw = false;
                p.M();
            }
            if (!this.av && !this.at) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i = (int) (jCurrentTimeMillis - this.c);
                this.c = jCurrentTimeMillis;
                this.fO -= Math.min(this.bJ[this.fN], 500);
                this.fO += Math.min(i, 500);
                this.bJ[this.fN] = i;
                this.fN = (this.fN + 1) & 7;
                int i2 = this.fO >> 3;
                if (!ay) {
                    a aVarM36a = p.m36a();
                    int i3 = this.fN - 1;
                    int i4 = i3;
                    if (i3 < 0) {
                        i4 = 7;
                    }
                    int i5 = this.bJ[i4];
                    if (aVarM36a.f11c && aVarM36a.c != 0) {
                        aVarM36a.f10b += i5;
                        if (aVarM36a.f10b > aVarM36a.c) {
                            aVarM36a.f8a = 1;
                            aVarM36a.f11c = false;
                            b.D(5);
                        }
                    }
                }
                ay = false;
                k(i2);
                p.z(2);
                p.M();
            }
            Thread.sleep(1L);
            if (this.at || this.av) {
                synchronized (this) {
                    this.ax = false;
                }
            } else {
                Display.getDisplay(this).callSerially(this);
            }
        } catch (Exception unused) {
            if (this.at || this.av) {
                synchronized (this) {
                    this.ax = false;
                }
            } else {
                Display.getDisplay(this).callSerially(this);
            }
        } catch (Throwable th) {
            if (this.at || this.av) {
                synchronized (this) {
                    this.ax = false;
                }
            } else {
                Display.getDisplay(this).callSerially(this);
            }
            throw th;
        }
        if (!this.at || this.au) {
            return;
        }
        p.K();
        p.J();
        D(3);
        notifyDestroyed();
    }

    protected void destroyApp(boolean z) {
        p.K();
        p.J();
        this.au = z;
        this.at = true;
        if (z) {
            D(3);
        }
    }

    protected void pauseApp() {
        if (this.av) {
            return;
        }
        p.I();
        p.K();
        D(0);
        p.z(0);
        this.av = true;
    }

    protected void startApp() {
        if (this.ar && this.av) {
            this.c = System.currentTimeMillis();
            this.aw = true;
            synchronized (this) {
                if (this.av && !this.ax) {
                    this.ax = true;
                    Display.getDisplay(this).callSerially(this);
                }
            }
            return;
        }
        if (this.ar) {
            return;
        }
        p.setVisible(true);
        synchronized (this) {
            if (!this.ax) {
                this.ax = true;
                Display.getDisplay(this).callSerially(this);
            }
        }
        this.ar = true;
    }

    public abstract void a(Graphics graphics);

    public abstract void k(int i);

    public abstract void b(int i, int i2);

    public abstract void D(int i);

    public abstract String[][] b();

    public abstract String e(int i);

    protected final void aA() {
        this.c = System.currentTimeMillis();
        this.fN = 0;
        for (int i = 0; i < 8; i++) {
            this.bJ[i] = 40;
        }
        this.fO = 320;
    }

    public static boolean b(String str) {
        boolean z = true;
        try {
            if (b.platformRequest(str)) {
                b.destroyApp(false);
            }
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }
}
