package defpackage;

import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:ap.class */
public final class ap implements Runnable {
    e f;
    private e[] c;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private String f19f = ba.d(10);
    int dI;
    int dJ;
    int dK;
    boolean ai;
    private int dL;
    private int dM;
    private boolean aj;
    boolean ak;
    boolean al;

    public ap() {
        this.dI = 0;
        this.ak = this.f19f != null;
        this.aj = !"nolink".equals(this.f19f);
        String strD = ba.d(11);
        if (strD != null) {
            this.dK = Integer.parseInt(strD) * 1000;
        }
        String strD2 = ba.d(12);
        if (strD2 != null) {
            this.dM = Integer.parseInt(strD2);
            if (this.dM != 0) {
                byte[] bArrM24a = ba.m24a("pc");
                byte[] bArr = bArrM24a;
                if (bArrM24a != null) {
                    this.dL = bArr[0];
                } else {
                    bArr = new byte[1];
                }
                this.dL++;
                bArr[0] = (byte) this.dL;
                ba.a("pc", bArr, 1);
                if (this.dL > this.dM) {
                    this.dI = 1;
                }
            }
        }
    }

    public final boolean j(int i) {
        if (!this.ak) {
            return false;
        }
        if (i != 2) {
            if (i != 4) {
                return false;
            }
            this.ai = false;
            this.dI = 2;
            return true;
        }
        ba.W();
        if (this.dL > this.dM) {
            this.dI = 1;
            return true;
        }
        this.dI = 0;
        return true;
    }

    public final int g(int i) {
        if (!this.ak) {
            return 2;
        }
        if (this.al) {
            return 0;
        }
        int i2 = 0;
        if (this.c == null) {
            L();
        }
        if (this.f == null || this.f != this.c[this.dI]) {
            this.f = this.c[this.dI];
            this.f.d();
        } else {
            int[] iArrA = this.f.a(i);
            if (iArrA != null) {
                if (iArrA[1] == 1) {
                    this.ai = true;
                    i2 = 4;
                } else if (iArrA[1] == 24) {
                    bd.b(this.f19f);
                    this.al = true;
                } else if (iArrA[1] == 5) {
                    this.ai = true;
                    i2 = 4;
                } else if (iArrA[1] == 6) {
                    this.al = true;
                }
            }
        }
        if (i2 != 0) {
            this.dI = 0;
            ba.U();
            this.f = null;
            this.c = null;
        }
        if (this.al) {
            try {
                bd.f61b.destroyApp(false);
            } catch (Exception unused) {
            }
        }
        return i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final void L() {
        String strC;
        String strC2;
        String string;
        String strC3 = ba.c(327699);
        if (this.dM > 0) {
            strC3 = new StringBuffer().append(strC3).append("\\n").append(ba.a(ba.c(327700), new String[]{new StringBuffer().append("").append((this.dM - this.dL) + 1).toString()})).toString();
            strC = this.dL > this.dM ? ba.c(327701) : ba.c(327702);
        } else {
            strC = ba.c(327702);
        }
        if (this.aj) {
            ba.a(24, 327703, null, 0);
            string = new StringBuffer().append(strC).append("\\n").append(ba.c(42)).toString();
            strC2 = ba.c(48);
        } else {
            strC2 = ba.c(327704);
            string = new StringBuffer().append(strC).append("\\n").append(strC2).toString();
        }
        this.c = new e[3];
        String strC4 = ba.c(327705);
        this.c[0] = new e();
        this.c[0].b(1, 2, 0);
        this.c[0].a(strC4, (Image) null, 1);
        this.c[0].a(1, 1, strC3, (Image[]) null, 0);
        this.c[0].f79v[0] = 1;
        this.c[0].a(ba.E(), ba.H(), false);
        this.c[1] = new e();
        this.c[1].b(1, 2, 0);
        this.c[1].a(strC4, (Image) null, 1);
        this.c[1].a(1, 1, string, (Image[]) null, 0);
        if (this.aj) {
            this.c[1].f79v[0] = 24;
        }
        this.c[1].f79v[1] = 6;
        this.c[1].a(ba.E(), ba.H(), false);
        this.c[2] = new e();
        this.c[2].b(1, 2, 0);
        this.c[2].a(strC4, (Image) null, 1);
        this.c[2].a(1, 1, strC2, (Image[]) null, 0);
        if (this.aj) {
            this.c[2].f79v[0] = 24;
        }
        if (this.dL > this.dM) {
            this.c[2].f79v[1] = 6;
        } else {
            this.c[2].f79v[1] = 5;
        }
        this.c[2].a(ba.E(), ba.H(), false);
    }

    public final String a() {
        if (this.ak) {
            return ba.c(47);
        }
        return null;
    }

    public final int y() {
        return this.ak ? 4 : 2;
    }
}
