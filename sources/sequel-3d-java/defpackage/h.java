package defpackage;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

/* JADX INFO: loaded from: sequel-3d-java.jar:h.class */
public abstract class h extends MIDlet implements Runnable {
    private long a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f89a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[] f90a;
    private int b;
    private boolean d;
    private boolean e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected boolean f91a;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static h f92a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    static boolean f93b;
    static boolean c;

    protected h() {
        f92a = this;
        t.a(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h.run():void");
    }

    protected void destroyApp(boolean z) {
        t.g();
        t.m91d();
        this.f = z;
        this.f91a = true;
        if (z) {
            b(3);
        }
    }

    protected void pauseApp() {
        if (this.g) {
            return;
        }
        t.m89c();
        t.g();
        b(0);
        t.m103c(0);
        this.g = true;
    }

    protected void startApp() {
        if (this.d && this.g) {
            this.a = System.currentTimeMillis();
            this.h = true;
            synchronized (this) {
                if (this.g && !this.i) {
                    this.i = true;
                    Display.getDisplay(this).callSerially(this);
                }
            }
            return;
        }
        if (this.d) {
            return;
        }
        t.a(true);
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                Display.getDisplay(this).callSerially(this);
            }
        }
        this.d = true;
    }

    public abstract void a(Graphics graphics);

    public abstract void a(int i);

    public abstract void a(int i, int i2);

    public abstract void b(int i);

    public abstract String[][] a();

    /* JADX INFO: renamed from: a */
    public abstract String mo1a(int i);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m38a() {
        this.a = System.currentTimeMillis();
        this.f89a = 0;
        for (int i = 0; i < 8; i++) {
            this.f90a[i] = 40;
        }
        this.b = 320;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private int m39a() {
        int i = this.f89a - 1;
        int i2 = i;
        if (i < 0) {
            i2 = 7;
        }
        return this.f90a[i2];
    }

    public static boolean a(String str) {
        boolean z = true;
        try {
            f93b = true;
            if (f92a.platformRequest(str)) {
                f92a.destroyApp(false);
            }
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }
}
