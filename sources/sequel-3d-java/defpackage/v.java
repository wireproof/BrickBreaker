package defpackage;

import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: sequel-3d-java.jar:v.class */
public final class v implements Runnable {
    n a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private n[] f315a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f316a = t.m92b(10);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int f317a;
    int b;
    int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    boolean f318a;
    private int d;
    private int e;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private boolean f319d;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    boolean f320b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    boolean f321c;

    public v() {
        this.f317a = 0;
        this.f320b = this.f316a != null;
        this.f319d = !"nolink".equals(this.f316a);
        String strM92b = t.m92b(11);
        if (strM92b != null) {
            this.c = Integer.parseInt(strM92b) * 1000;
        }
        String strM92b2 = t.m92b(12);
        if (strM92b2 != null) {
            this.e = Integer.parseInt(strM92b2);
            if (this.e != 0) {
                byte[] bArrM94a = t.m94a("pc");
                byte[] bArr = bArrM94a;
                if (bArrM94a != null) {
                    this.d = bArr[0];
                } else {
                    bArr = new byte[1];
                }
                this.d++;
                bArr[0] = (byte) this.d;
                t.a("pc", bArr);
                if (this.d > this.e) {
                    this.f317a = 1;
                }
            }
        }
    }

    public final boolean a(int i) {
        if (!this.f320b) {
            return false;
        }
        if (i != 2) {
            if (i != 4) {
                return false;
            }
            this.f318a = false;
            this.f317a = 2;
            return true;
        }
        t.m84a();
        if (this.d > this.e) {
            this.f317a = 1;
            return true;
        }
        this.f317a = 0;
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m112a(int i) {
        if (!this.f320b) {
            return 2;
        }
        if (this.f321c) {
            return 0;
        }
        int i2 = 0;
        if (this.f315a == null) {
            a();
        }
        if (this.a == null || this.a != this.f315a[this.f317a]) {
            this.a = this.f315a[this.f317a];
            this.a.m72b();
        } else {
            int[] iArrM73a = this.a.m73a(i);
            if (iArrM73a != null) {
                if (iArrM73a[1] == 1) {
                    this.f318a = true;
                    i2 = 4;
                } else if (iArrM73a[1] == 24) {
                    h.a(this.f316a);
                    this.f321c = true;
                } else if (iArrM73a[1] == 5) {
                    this.f318a = true;
                    i2 = 4;
                } else if (iArrM73a[1] == 6) {
                    this.f321c = true;
                }
            }
        }
        if (i2 != 0) {
            this.f317a = 0;
            t.m85b();
            this.a = null;
            this.f315a = null;
        }
        if (this.f321c) {
            try {
                h.f92a.destroyApp(false);
            } catch (Exception unused) {
            }
        }
        return i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final void a() {
        String strM87a;
        String strM87a2;
        String string;
        String strM87a3 = t.m87a(470);
        if (this.e > 0) {
            strM87a3 = new StringBuffer().append(strM87a3).append("\\n").append(t.a(t.m87a(471), new String[]{new StringBuffer().append("").append((this.e - this.d) + 1).toString()})).toString();
            strM87a = this.d > this.e ? t.m87a(472) : t.m87a(473);
        } else {
            strM87a = t.m87a(473);
        }
        if (this.f319d) {
            t.a(24, 474, null, 0);
            string = new StringBuffer().append(strM87a).append("\\n").append(t.m87a(475)).toString();
            strM87a2 = t.m87a(476);
        } else {
            strM87a2 = t.m87a(477);
            string = new StringBuffer().append(strM87a).append("\\n").append(strM87a2).toString();
        }
        this.f315a = new n[3];
        String strM87a4 = t.m87a(478);
        this.f315a[0] = new n();
        this.f315a[0].a(1, 2, 0);
        this.f315a[0].a(strM87a4, (Image) null);
        this.f315a[0].a(1, 1, strM87a3, (Image[]) null, 0);
        this.f315a[0].a(1, 0);
        this.f315a[0].b(t.m98e(), t.a());
        this.f315a[1] = new n();
        this.f315a[1].a(1, 2, 0);
        this.f315a[1].a(strM87a4, (Image) null);
        this.f315a[1].a(1, 1, string, (Image[]) null, 0);
        if (this.f319d) {
            this.f315a[1].a(24, 0);
        }
        this.f315a[1].a(6, 1);
        this.f315a[1].b(t.m98e(), t.a());
        this.f315a[2] = new n();
        this.f315a[2].a(1, 2, 0);
        this.f315a[2].a(strM87a4, (Image) null);
        this.f315a[2].a(1, 1, strM87a2, (Image[]) null, 0);
        if (this.f319d) {
            this.f315a[2].a(24, 0);
        }
        if (this.d > this.e) {
            this.f315a[2].a(6, 1);
        } else {
            this.f315a[2].a(5, 1);
        }
        this.f315a[2].b(t.m98e(), t.a());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String m113a() {
        if (this.f320b) {
            return t.m87a(479);
        }
        return null;
    }
}
