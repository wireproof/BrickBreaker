package defpackage;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

/* JADX INFO: loaded from: original-2d.jar:c.class */
public abstract class c extends MIDlet implements Runnable {
    private long a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f69a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[] f70a;
    private int b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f71b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f72a;
    private boolean c;
    private boolean d;
    private boolean e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static c f73a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Thread f74a;
    private static boolean f;

    public c() {
        f73a = this;
        d.a(this);
        d.c(true);
    }

    public static c a() {
        return f73a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f71b) {
                this.f70a = new int[8];
                m18a();
                d.f();
                b(2);
                this.f71b = true;
            } else if (this.e) {
                b(1);
                this.d = false;
                this.e = false;
                d.m25a();
            }
            if (!this.d && !this.f72a) {
                int iM19a = m19a();
                if (!f) {
                    d.m39a().m43a(b());
                }
                f = false;
                mo2a(iM19a);
                d.m25a();
            }
            Thread.sleep(2L);
            if (!this.f72a && !this.d) {
                Display.getDisplay(this).callSerially(this);
            }
        } catch (Exception unused) {
            if (!this.f72a && !this.d) {
                Display.getDisplay(this).callSerially(this);
            }
        } catch (Throwable th) {
            if (!this.f72a && !this.d) {
                Display.getDisplay(this).callSerially(this);
            }
            throw th;
        }
        if (!this.f72a || this.c) {
            return;
        }
        d.m33d();
        d.e();
        b(3);
        notifyDestroyed();
    }

    public void destroyApp(boolean z) throws MIDletStateChangeException {
        d.m33d();
        d.e();
        this.c = z;
        this.f72a = true;
        if (z) {
            b(3);
            try {
                if (f74a != null) {
                    f74a.join();
                    f74a = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    public void pauseApp() {
        if (this.d) {
            return;
        }
        d.m32c();
        d.m33d();
        b(0);
        this.d = true;
    }

    public void startApp() throws MIDletStateChangeException {
        if (this.f71b) {
            this.a = System.currentTimeMillis();
            this.e = true;
            if (!this.d) {
                return;
            }
        }
        Display.getDisplay(this).callSerially(this);
    }

    public abstract void a(Graphics graphics);

    /* JADX INFO: renamed from: a */
    public abstract void mo2a(int i);

    public abstract void a(int i, int i2);

    public abstract void b(int i);

    /* JADX INFO: renamed from: a */
    public abstract String[][] mo1a();

    public abstract String a(int i);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public l mo17a() {
        return new l();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m18a() {
        this.a = System.currentTimeMillis();
        this.f69a = 0;
        for (int i = 0; i < 8; i++) {
            this.f70a[i] = 40;
        }
        this.b = 320;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m19a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = (int) (jCurrentTimeMillis - this.a);
        this.a = jCurrentTimeMillis;
        this.b -= Math.min(this.f70a[this.f69a], 500);
        this.b += Math.min(i, 500);
        this.f70a[this.f69a] = i;
        this.f69a = (this.f69a + 1) & 7;
        return this.b >> 3;
    }

    public final int b() {
        int i = this.f69a - 1;
        int i2 = i;
        if (i < 0) {
            i2 = 7;
        }
        return this.f70a[i2];
    }

    public static void a(Displayable displayable) {
        Display.getDisplay(f73a).setCurrent(displayable);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.microedition.midlet.MIDletStateChangeException */
    public static boolean a(String str) throws MIDletStateChangeException {
        boolean z = true;
        try {
            f73a.platformRequest(str);
            f73a.destroyApp(false);
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m20b() {
        f = true;
    }
}
