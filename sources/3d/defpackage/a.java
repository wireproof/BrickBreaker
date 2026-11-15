package defpackage;

import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-3d.jar:a.class */
public final class a implements Runnable {
    f a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private f[] f6a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f7a = p.d(10);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int f8a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f9a;
    private boolean b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    int f10b;
    int c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    boolean f11c;
    private int d;
    private int e;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private boolean f12d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    boolean f13e;
    boolean f;

    public a() {
        this.f8a = 0;
        this.f13e = this.f7a != null;
        this.f12d = !"nolink".equals(this.f7a);
        String strD = p.d(11);
        if (strD != null) {
            this.c = Integer.parseInt(strD) * 1000;
        }
        String strD2 = p.d(12);
        if (strD2 != null) {
            this.e = Integer.parseInt(strD2);
            if (this.e != 0) {
                byte[] bArrM34a = p.m34a("pc");
                byte[] bArr = bArrM34a;
                if (bArrM34a != null) {
                    this.d = bArr[0];
                } else {
                    bArr = new byte[1];
                }
                this.d++;
                bArr[0] = (byte) this.d;
                p.b("pc", bArr);
                if (this.d > this.e) {
                    this.f8a = 1;
                }
            }
        }
    }

    public final boolean a(int i) {
        if (!this.f13e) {
            return false;
        }
        if (i != 2) {
            if (i != 4) {
                return false;
            }
            this.f11c = false;
            this.f8a = 2;
            return true;
        }
        p.N();
        if (this.d > this.e) {
            this.f8a = 1;
            return true;
        }
        this.f8a = 0;
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m8a(int i) {
        if (!this.f13e) {
            return 2;
        }
        if (this.f) {
            return 0;
        }
        int i2 = 0;
        if (this.f6a == null) {
            a();
        }
        if (this.a == null || this.a != this.f6a[this.f8a]) {
            this.a = this.f6a[this.f8a];
            this.a.g();
        } else {
            int[] iArrM14a = this.a.m14a(i);
            if (iArrM14a != null) {
                if (iArrM14a[1] == 1) {
                    this.f11c = true;
                    i2 = 4;
                } else if (iArrM14a[1] == 24) {
                    if (!this.f9a) {
                        this.f9a = true;
                        new Thread(this).start();
                    }
                } else if (iArrM14a[1] == 5) {
                    this.f11c = true;
                    i2 = 4;
                } else if (iArrM14a[1] == 6) {
                    this.f = true;
                }
            }
        }
        if (this.f9a && this.b) {
            this.f9a = false;
            this.f = true;
        }
        if (i2 != 0) {
            this.f8a = 0;
            p.L();
            this.a = null;
            this.f6a = null;
        }
        if (this.f) {
            try {
                s.b.destroyApp(false);
            } catch (Exception unused) {
            }
        }
        return i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b = false;
        s.b(this.f7a);
        this.b = true;
    }

    public final void a() {
        String strC;
        String strC2;
        String string;
        String strC3 = p.c(537);
        if (this.e > 0) {
            strC3 = new StringBuffer().append(strC3).append("\\n").append(p.a(p.c(538), new String[]{new StringBuffer().append("").append((this.e - this.d) + 1).toString()})).toString();
            strC = this.d > this.e ? p.c(539) : p.c(540);
        } else {
            strC = p.c(540);
        }
        if (this.f12d) {
            p.a(24, 541, null, 0);
            string = new StringBuffer().append(strC).append("\\n").append(p.c(542)).toString();
            strC2 = p.c(543);
        } else {
            strC2 = p.c(544);
            string = new StringBuffer().append(strC).append("\\n").append(strC2).toString();
        }
        this.f6a = new f[3];
        String strC4 = p.c(545);
        this.f6a[0] = new f();
        this.f6a[0].a(1, 2, 0);
        this.f6a[0].a(strC4, null);
        this.f6a[0].a(1, 1, strC3, (Image[]) null, 0);
        this.f6a[0].f38m[0] = 1;
        this.f6a[0].a(p.i(), p.m(), false);
        this.f6a[1] = new f();
        this.f6a[1].a(1, 2, 0);
        this.f6a[1].a(strC4, null);
        this.f6a[1].a(1, 1, string, (Image[]) null, 0);
        if (this.f12d) {
            this.f6a[1].f38m[0] = 24;
        }
        this.f6a[1].f38m[1] = 6;
        this.f6a[1].a(p.i(), p.m(), false);
        this.f6a[2] = new f();
        this.f6a[2].a(1, 2, 0);
        this.f6a[2].a(strC4, null);
        this.f6a[2].a(1, 1, strC2, (Image[]) null, 0);
        if (this.f12d) {
            this.f6a[2].f38m[0] = 24;
        }
        if (this.d > this.e) {
            this.f6a[2].f38m[1] = 6;
        } else {
            this.f6a[2].f38m[1] = 5;
        }
        this.f6a[2].a(p.i(), p.m(), false);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String m9a() {
        if (this.f13e) {
            return p.c(546);
        }
        return null;
    }
}
