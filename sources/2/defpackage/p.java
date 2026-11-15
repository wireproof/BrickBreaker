package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: loaded from: bbr-2.jar:p.class */
public final class p {
    private int aV;
    private int aW;
    private int ci;
    private int cj;
    private int ck;
    private int cl;
    private int cm;
    private int cn;
    private int co;
    private int cp;
    private int cq;
    private int cr;
    private ay[] l;
    private ay[] m;
    private int cs;
    public int[][][] b;
    private int[][][] c;
    private int ct;
    private int cu;
    public int cv;
    public int cw;
    private boolean A;
    private int cx;
    private int cy;
    private r a;
    public int cz;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    private int cA;
    private int cB;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private h f154a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ag f155a;
    public boolean G;
    public int cC;
    public int cD;
    private int cE;
    private int[] Y;
    private int[] Z;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private boolean f156m;
    private int bT;
    private boolean H;
    public int cF;
    public int cG;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final Random f157a = new Random();
    private int aX = -1;
    private int[] W = new int[5];
    private int[] X = new int[5];
    public boolean[] i = new boolean[am.aq.length];
    private int[] U = new int[4];
    private int[] V = new int[4];

    public p(r rVar) {
        this.a = rVar;
        u();
        v();
    }

    public final int m() {
        return (!this.C || this.l == null) ? 10 : 0;
    }

    public final void c(int i, int i2) {
        if (i2 != 0) {
            if (i2 == 1 && this.l == null && i == 40) {
                this.l = new ay[13];
                this.l[0] = new ay(ar.a(1376272), false);
                this.l[1] = new ay(ar.a(2031646), false);
                this.l[2] = new ay(ar.a(1572904), false);
                this.l[3] = new ay(ar.a(1638408), false);
                this.l[4] = new ay(ar.a(2097169), false);
                this.l[5] = new ay(ar.a(1900563), false);
                this.l[6] = new ay(ar.a(1966095), false);
                this.l[7] = new ay(ar.a(2162712), false);
                this.l[8] = new ay(ar.a(2228256), false);
                this.l[9] = new ay(ar.a(2228257), false);
                this.l[10] = new ay(ar.a(1638420), false);
                this.l[11] = new ay(ar.a(1638421), false);
                this.l[12] = new ay(ar.a(1900575), false);
            } else if (i2 == 2 && this.m == null && i == 40) {
                this.m = new ay[17];
                this.m[0] = new ay(ar.a(2293782), false);
                this.m[1] = new ay(ar.a(2293785), false);
                this.m[2] = new ay(ar.a(2293788), false);
                this.m[3] = new ay(ar.a(2293786), false);
                this.m[4] = new ay(ar.a(2293780), false);
                this.m[5] = new ay(ar.a(2293789), false);
                this.m[6] = new ay(ar.a(2293779), false);
                this.m[7] = new ay(ar.a(2293777), false);
                this.m[8] = new ay(ar.a(2293787), false);
                this.m[9] = new ay(ar.a(2293783), false);
                this.m[10] = new ay(ar.a(2293772), false);
                this.m[11] = new ay(ar.a(2293775), false);
                this.m[12] = new ay(ar.a(2293773), false);
                this.m[13] = new ay(ar.a(2293774), false);
                this.m[14] = new ay(ar.a(2293784), false);
                this.m[15] = new ay(ar.a(2293776), false);
                this.m[16] = new ay(ar.a(2293790), false);
            }
        }
        if (this.C) {
            return;
        }
        if (this.F) {
            if (i2 == 3) {
                o();
                this.C = true;
                return;
            }
            return;
        }
        if (i2 == 3) {
            this.f154a = new h();
            return;
        }
        if (i2 == 4) {
            return;
        }
        if (i2 == 5) {
            this.f155a = new ag(am.an[this.cz % am.an.length], this.f154a, null);
            this.f154a = null;
            return;
        }
        if (i2 == 6) {
            this.cy = 0;
            x xVar = (x) this.f155a.a[0].b;
            this.cm = xVar.ac;
            this.cn = xVar.ad;
            this.co = xVar.di;
            this.cp = xVar.dj;
            this.b = new int[this.cn][this.cm][5];
            this.c = new int[this.cn][this.cm][];
            for (int i3 = 0; i3 < this.cn; i3++) {
                for (int i4 = 0; i4 < this.cm; i4++) {
                    this.b[i3][i4][0] = 0;
                    this.b[i3][i4][1] = 0;
                }
            }
            u[] uVarArr = xVar.a;
            for (int i5 = 0; i5 < uVarArr.length; i5++) {
                switch (uVarArr[i5].r) {
                    case 0:
                        an anVar = (an) uVarArr[i5].a;
                        byte b = anVar.a[0];
                        byte b2 = anVar.a[1];
                        this.b[b2][b][0] = 1;
                        this.b[b2][b][2] = am.am[anVar.c];
                        this.c[b2][b] = anVar.af;
                        if (this.cj < 0) {
                            this.cj = b;
                            this.ck = b2;
                            this.cv = this.cj;
                            this.cw = this.ck;
                            this.ct = this.cj;
                            this.cu = this.ck;
                        }
                        break;
                    case 1:
                        ae aeVar = (ae) uVarArr[i5].a;
                        byte b3 = aeVar.a[0];
                        byte b4 = aeVar.a[1];
                        this.b[b4][b3][0] = 1;
                        this.b[b4][b3][2] = am.am[aeVar.c];
                        this.c[b4][b3] = aeVar.af;
                        break;
                    case 2:
                        au auVar = (au) uVarArr[i5].a;
                        byte b5 = auVar.a[0];
                        byte b6 = auVar.a[1];
                        this.b[b6][b5][0] = 2;
                        this.b[b6][b5][2] = am.am[auVar.c];
                        this.b[b6][b5][4] = auVar.e;
                        break;
                    case 3:
                        j jVar = (j) uVarArr[i5].a;
                        byte b7 = jVar.a[0];
                        byte b8 = jVar.a[1];
                        this.b[b8][b7][0] = 3;
                        this.b[b8][b7][2] = jVar.f104a;
                        break;
                    case 4:
                        at atVar = (at) uVarArr[i5].a;
                        byte b9 = atVar.f[0];
                        byte b10 = atVar.f[1];
                        byte b11 = atVar.g[0];
                        byte b12 = atVar.g[1];
                        this.b[b10][b9][0] = 4;
                        this.b[b12][b11][0] = 5;
                        for (int i6 = b10 - 1; i6 > b12; i6--) {
                            this.b[i6][b9][0] = 6;
                        }
                        this.b[b10][b9][2] = am.am[atVar.c];
                        break;
                }
            }
            if (this.Z != null) {
                int i7 = 0;
                for (int i8 = 0; i8 < this.cn; i8++) {
                    for (int i9 = 0; i9 < this.cm; i9++) {
                        if (this.b[i8][i9][0] != 0) {
                            int i10 = i7;
                            i7++;
                            this.b[i8][i9][1] = this.Z[i10];
                        }
                    }
                }
            }
            this.Z = null;
            for (int i11 = 0; i11 < this.cn; i11++) {
                for (int i12 = 0; i12 < this.cm; i12++) {
                    if (this.b[i11][i12][0] == 1 || this.b[i11][i12][0] == 2 || this.b[i11][i12][0] == 4) {
                        this.b[i11][i12][3] = j(am.d[this.cz % 4].length);
                    }
                }
            }
            this.b[this.ck][this.cj][3] = 0;
            this.U[0] = am.d[this.cz % 4][0][0];
            this.U[1] = am.d[this.cz % 4][0][1];
            this.U[2] = am.d[this.cz % 4][0][2];
            this.U[3] = am.d[this.cz % 4][0][3];
            o();
            m39t();
            this.C = true;
        }
    }

    public final void b(int i, int i2) {
        if (i2 != 0 && i2 != 1) {
            if (i2 == 3) {
                this.aX = i;
                return;
            }
            return;
        }
        int i3 = 0;
        switch (ba.q(i)) {
            case 50:
                i3 = 4;
                break;
            case 52:
                i3 = 1;
                break;
            case 53:
                i3 = 16;
                break;
            case 54:
                i3 = 2;
                break;
            case 56:
                i3 = 8;
                break;
        }
        if (i2 != 0) {
            this.aV &= i3 ^ (-1);
        } else {
            this.aV |= i3;
            this.aW |= i3;
        }
    }

    private void k() {
        this.aX = -1;
        this.aV = 0;
        this.aW = 0;
        this.ci = -1;
    }

    public final void l() {
        ba.U();
        if (this.b[this.ck][this.cj][0] != 5) {
            ba.h(0, 0);
        }
        ba.h(13, 0);
    }

    public final void n() {
        k();
        this.A = false;
        this.cl = 0;
        for (int i = 0; i < this.l.length; i++) {
            this.l[i].z(0);
        }
        this.bT = 1000;
    }

    private void o() {
        this.W[0] = 7;
        if (this.F) {
            this.W[2] = 27262996;
        } else {
            this.W[2] = am.am[this.f155a.d];
        }
        this.W[3] = 0;
    }

    public final void p() {
        this.Y = null;
        int i = am.j[this.cC][0];
        this.X[0] = i;
        if (i != 3) {
            this.X[2] = am.j[this.cC][1];
            if (i == 1) {
                this.Y = new int[am.j[this.cC].length - 2];
                for (int i2 = 0; i2 < this.Y.length; i2++) {
                    this.Y[i2] = am.j[this.cC][i2 + 2];
                }
            }
        } else {
            this.X[2] = am.j[this.cC][1];
        }
        int i3 = this.cC % 4;
        int iJ = j(am.d[i3].length);
        this.X[3] = iJ;
        this.V[0] = am.d[i3][iJ][0];
        this.V[1] = am.d[i3][iJ][1];
        this.V[2] = am.d[i3][iJ][2];
        this.V[3] = am.d[i3][iJ][3];
    }

    public final int g(int i) {
        int iE = ba.E();
        int iH = ba.H();
        if (this.bT > 0) {
            this.bT -= i;
            if (this.bT <= 0) {
                this.a.h(8);
                if (this.H) {
                    this.a.h(7);
                    this.H = false;
                }
            }
        }
        if (this.A) {
            this.cx += i;
            this.l[11].n(i);
            this.l[12].n(i);
            if (this.cx > 400) {
                if (this.b[this.ck][this.cj][0] == 3) {
                    this.U[0] = am.B[this.cz % 4][0];
                    this.U[1] = am.B[this.cz % 4][1];
                    this.U[2] = am.B[this.cz % 4][2];
                    this.U[3] = am.B[this.cz % 4][3];
                    return 1;
                }
                int i2 = this.b[this.ck][this.cj][3];
                this.U[0] = am.d[this.cz % 4][i2][0];
                this.U[1] = am.d[this.cz % 4][i2][1];
                this.U[2] = am.d[this.cz % 4][i2][2];
                this.U[3] = am.d[this.cz % 4][i2][3];
                return 1;
            }
        } else {
            int i3 = this.b[this.ck][this.cj][0];
            boolean z = false;
            if (this.ci >= 0) {
                int i4 = this.cq + (this.cj * this.co);
                int i5 = this.cr + (this.ck * this.cp);
                z = this.ci > i4 && this.ci < i4 + this.co && 0 > i5 && 0 < i5 + this.cp;
            }
            if ((this.aX == 0 || (this.aW & 16) != 0 || z) && (i3 == 1 || i3 == 2 || i3 == 4 || i3 == 3)) {
                this.cx = 0;
                this.l[11].z(0);
                this.l[12].z(0);
                this.A = true;
                this.ci = -1;
            }
            if (this.aX == 13) {
                return 2;
            }
            if (this.cl <= 0) {
                int i6 = this.cj;
                int i7 = this.ck;
                int i8 = 0;
                if (this.ci >= 0) {
                    int i9 = this.cq + (this.ct * this.co);
                    int i10 = this.cr + (this.cu * this.cp);
                    if (this.ci > i9 && this.ci < i9 + this.co && 0 > i10 && 0 < i10 + this.cp) {
                        i6 = this.ct;
                        i7 = this.cu;
                        if (this.cj > i6) {
                            i8 = 2;
                        } else if (this.cj < i6) {
                            i8 = 3;
                        } else if (this.ck > i7) {
                            i8 = 0;
                        } else if (this.ck < i7) {
                            i8 = 1;
                        }
                    } else if (this.ci <= i9 || this.ci >= i9 + this.co) {
                        if (0 > i10 && 0 < i10 + this.cp) {
                            if (this.ci > i9 - this.co && this.ci < i9) {
                                i6 = this.ct - 1;
                                i7 = this.cu;
                                i8 = 2;
                            } else if (this.ci > i9 + this.co && this.ci < i9 + (this.co << 1)) {
                                i6 = this.ct + 1;
                                i7 = this.cu;
                                i8 = 3;
                            }
                        }
                    } else if (0 > i10 - this.cp && 0 < i10) {
                        i6 = this.ct;
                        i7 = this.cu - 1;
                        i8 = 0;
                    } else if (0 > i10 + this.cp && 0 < i10 + (this.cp << 1)) {
                        i6 = this.ct;
                        i7 = this.cu + 1;
                        i8 = 1;
                    }
                } else if ((this.aW & 4) != 0) {
                    i7--;
                    i8 = 0;
                } else if ((this.aW & 8) != 0) {
                    i7++;
                    i8 = 1;
                } else if ((this.aW & 1) != 0) {
                    i6--;
                    i8 = 2;
                } else if ((this.aW & 2) != 0) {
                    i6++;
                    i8 = 3;
                }
                if ((i6 != this.cj || i7 != this.ck) && i6 >= 0 && i6 < this.cm && i7 >= 0 && i7 < this.cn) {
                    int i11 = this.cm * this.co;
                    int i12 = this.cn * this.cp;
                    int i13 = this.b[i7][i6][0];
                    if ((i6 == this.ct && i7 == this.cu) || ((((this.cj == this.ct && this.ck == this.cu) || this.ci >= 0) && (i13 == 1 || i13 == 2 || i13 == 4 || i13 == 3)) || this.f156m)) {
                        this.cj = i6;
                        this.ck = i7;
                        this.cy = i8;
                        l();
                        if (i13 == 2) {
                            this.a.h(9);
                        } else if (i13 == 4) {
                            this.a.h(10);
                        } else if (i13 == 3) {
                            this.a.h(11);
                        }
                    } else if ((this.cq < 0 && i8 == 2) || (((-this.cq) + iE < i11 && i8 == 3) || ((this.cr < 0 && i8 == 0) || ((-this.cr) + iH < i12 && i8 == 1)))) {
                        this.cl = 1000;
                    }
                }
                this.cq = -((this.cj * this.co) - ((iE >> 1) - (this.co >> 1)));
                this.cr = -((this.ck * this.cp) - ((iH >> 1) - (this.cp >> 1)));
                q();
            }
            if (this.cl > 0) {
                if ((this.aW & 4) != 0) {
                    this.cr += this.cp;
                    this.cl = 1000;
                } else if ((this.aW & 8) != 0) {
                    this.cr -= this.cp;
                    this.cl = 1000;
                } else if ((this.aW & 1) != 0) {
                    this.cq += this.co;
                    this.cl = 1000;
                } else if ((this.aW & 2) != 0) {
                    this.cq -= this.co;
                    this.cl = 1000;
                }
                q();
                this.cl -= i;
            }
        }
        for (int i14 = 0; i14 < this.l.length; i14++) {
            this.l[i14].n(i);
            if (this.l[i14].h()) {
                this.l[i14].z(this.l[i14].r() - 1);
            }
        }
        k();
        return 0;
    }

    private void q() {
        int iE = ba.E();
        int iH = ba.H();
        int i = this.cm * this.co;
        int i2 = this.cn * this.cp;
        if (i <= iE) {
            this.cq = (iE - i) >> 1;
        } else if (this.cq > this.co) {
            this.cq = this.co;
        } else if (this.cq < (-((i - iE) + this.co))) {
            this.cq = -((i - iE) + this.co);
        }
        if (i2 <= iH) {
            this.cr = (iH - i2) >> 1;
        } else if (this.cr > this.cp) {
            this.cr = this.cp;
        } else if (this.cr < (-((i2 - iH) + this.cp))) {
            this.cr = -((i2 - iH) + this.cp);
        }
    }

    public final void b(Graphics graphics) {
        ba.E();
        ba.H();
        e.a(graphics, 0, 0, ba.E(), ba.H(), this.U[0], this.U[1], 1);
        if (this.A) {
            this.a.a(16777215, this.cx, 400, graphics);
        }
        int i = this.cq + (this.co >> 1);
        int i2 = this.cr + (this.cp >> 1);
        for (int i3 = 0; i3 < this.cn; i3++) {
            for (int i4 = 0; i4 < this.cm; i4++) {
                char c = 0;
                int i5 = i + (i4 * this.co);
                int i6 = i2 + (i3 * this.cp);
                if (!this.A) {
                    switch (this.b[i3][i4][0]) {
                        case 0:
                            c = '\n';
                            break;
                        case 1:
                            c = this.b[i3][i4][1] == 1 ? (char) 6 : (char) 5;
                            break;
                        case 2:
                            if (this.b[i3][i4][1] == 1) {
                                c = '\t';
                            } else if (this.b[i3][i4][4] > 0) {
                                c = '\b';
                            } else {
                                c = 7;
                            }
                            break;
                        case 3:
                            c = 0;
                            break;
                        case 4:
                            c = 1;
                            break;
                        case 5:
                            c = 2;
                            break;
                        case 6:
                            c = 3;
                            break;
                    }
                } else {
                    int iH = (ba.H() * this.cx) / 400;
                    if (this.cy == 0) {
                        c = '\f';
                        i6 += iH;
                    } else if (this.cy == 1) {
                        c = '\f';
                        i6 -= iH;
                    } else if (this.cy == 2) {
                        c = 11;
                        i5 += iH;
                    } else if (this.cy == 3) {
                        c = 11;
                        i5 -= iH;
                    }
                }
                this.l[c].c(graphics, i5, i6);
            }
        }
        if (this.A) {
            return;
        }
        this.m[this.cs].c(graphics, i + (this.ct * this.co), i2 + (this.cu * this.cp));
        this.l[4].c(graphics, i + (this.cj * this.co), i2 + (this.ck * this.cp));
    }

    public final int[] a() {
        if (this.G) {
            return this.X;
        }
        return this.E ? this.W : this.b[this.ck][this.cj];
    }

    public final int[] b() {
        if (this.G) {
            return this.Y;
        }
        if (this.E) {
            return null;
        }
        return this.c[this.ck][this.cj];
    }

    public final int s() {
        if (this.G) {
            return this.cC % 4;
        }
        if (this.E) {
            return 4;
        }
        return this.cz % 4;
    }

    public static final int j(int i) {
        return Math.abs(f157a.nextInt()) % i;
    }

    public static final int t() {
        return f157a.nextInt() % 5;
    }

    public final void r() {
        if (this.G) {
            this.cC++;
            return;
        }
        if (this.E) {
            this.B = true;
            this.D = true;
            this.E = false;
            this.C = false;
            this.cj = -1;
            this.ck = -1;
            if (this.F) {
                this.F = false;
                return;
            } else {
                this.cz++;
                return;
            }
        }
        int i = this.b[this.ck][this.cj][0];
        if (i == 3) {
            this.E = true;
        } else if (i == 4) {
            this.ck--;
            while (this.b[this.ck][this.cj][0] != 5) {
                this.ck--;
            }
        } else if (i == 2) {
            this.cv = this.cj;
            this.cw = this.ck;
            if (this.b[this.ck][this.cj][4] > 0) {
                this.i[this.b[this.ck][this.cj][4]] = true;
            }
        }
        this.b[this.ck][this.cj][1] = 1;
        this.D = false;
        this.ct = this.cj;
        this.cu = this.ck;
        m39t();
    }

    /* JADX INFO: renamed from: s, reason: collision with other method in class */
    public final void m38s() {
        this.cA = 3;
        this.cj = this.cv;
        this.ck = this.cw;
        this.ct = this.cv;
        this.cu = this.cw;
        m39t();
        this.H = true;
    }

    /* JADX INFO: renamed from: t, reason: collision with other method in class */
    private void m39t() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        if (this.cu > 0 && ((i4 = this.b[this.cu - 1][this.ct][0]) == 1 || i4 == 2 || i4 == 4 || i4 == 3)) {
            z = true;
        }
        if (this.cu < this.cn - 1 && ((i3 = this.b[this.cu + 1][this.ct][0]) == 1 || i3 == 2 || i3 == 4 || i3 == 3)) {
            z2 = true;
        }
        if (this.ct > 0 && ((i2 = this.b[this.cu][this.ct - 1][0]) == 1 || i2 == 2 || i2 == 4 || i2 == 3)) {
            z3 = true;
        }
        if (this.ct < this.cm - 1 && ((i = this.b[this.cu][this.ct + 1][0]) == 1 || i == 2 || i == 4 || i == 3)) {
            z4 = true;
        }
        if (z) {
            if (z2) {
                if (z3) {
                    if (z4) {
                        this.cs = 15;
                        return;
                    } else {
                        this.cs = 12;
                        return;
                    }
                }
                if (z4) {
                    this.cs = 11;
                    return;
                } else {
                    this.cs = 5;
                    return;
                }
            }
            if (z3) {
                if (z4) {
                    this.cs = 14;
                    return;
                } else {
                    this.cs = 8;
                    return;
                }
            }
            if (z4) {
                this.cs = 7;
                return;
            } else {
                this.cs = 1;
                return;
            }
        }
        if (z2) {
            if (z3) {
                if (z4) {
                    this.cs = 13;
                    return;
                } else {
                    this.cs = 9;
                    return;
                }
            }
            if (z4) {
                this.cs = 10;
                return;
            } else {
                this.cs = 2;
                return;
            }
        }
        if (z3) {
            if (z4) {
                this.cs = 6;
                return;
            } else {
                this.cs = 4;
                return;
            }
        }
        if (z4) {
            this.cs = 3;
        } else {
            this.cs = 0;
        }
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        this.cA = dataInputStream.read();
        this.cB = dataInputStream.readInt();
        this.cz = dataInputStream.read();
        this.cj = dataInputStream.readByte();
        this.ck = dataInputStream.readByte();
        this.ct = dataInputStream.read();
        this.cu = dataInputStream.read();
        this.cv = dataInputStream.read();
        this.cw = dataInputStream.read();
        this.B = dataInputStream.readBoolean();
        this.D = dataInputStream.readBoolean();
        this.E = dataInputStream.readBoolean();
        this.F = dataInputStream.readBoolean();
        this.cC = dataInputStream.read();
        this.cD = dataInputStream.read();
        this.cE = dataInputStream.readInt();
        for (int i = 0; i < this.i.length; i++) {
            this.i[i] = dataInputStream.readBoolean();
        }
        for (int i2 = 0; i2 < this.a.j.length; i2++) {
            this.a.j[i2] = dataInputStream.readBoolean();
        }
        int i3 = dataInputStream.readByte();
        if (i3 > 0) {
            if (this.C) {
                for (int i4 = 0; i4 < i3; i4++) {
                    dataInputStream.readByte();
                }
                return;
            }
            this.Z = new int[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                this.Z[i5] = dataInputStream.readByte();
            }
        }
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.cA);
        dataOutputStream.writeInt(this.cB);
        dataOutputStream.write(this.cz);
        dataOutputStream.writeByte(this.cj);
        dataOutputStream.writeByte(this.ck);
        dataOutputStream.write(this.ct);
        dataOutputStream.write(this.cu);
        dataOutputStream.write(this.cv);
        dataOutputStream.write(this.cw);
        dataOutputStream.writeBoolean(this.B);
        dataOutputStream.writeBoolean(this.D);
        dataOutputStream.writeBoolean(this.E);
        dataOutputStream.writeBoolean(this.F);
        dataOutputStream.write(this.cC);
        dataOutputStream.write(this.cD);
        dataOutputStream.writeInt(this.cE);
        for (int i = 0; i < this.i.length; i++) {
            dataOutputStream.writeBoolean(this.i[i]);
        }
        for (int i2 = 0; i2 < this.a.j.length; i2++) {
            dataOutputStream.writeBoolean(this.a.j[i2]);
        }
        if (this.b == null || !this.C) {
            dataOutputStream.writeByte(-1);
            return;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.cn; i4++) {
            for (int i5 = 0; i5 < this.cm; i5++) {
                if (this.b[i4][i5][0] != 0) {
                    i3++;
                }
            }
        }
        dataOutputStream.writeByte(i3);
        for (int i6 = 0; i6 < this.cn; i6++) {
            for (int i7 = 0; i7 < this.cm; i7++) {
                if (this.b[i6][i7][0] != 0) {
                    dataOutputStream.writeByte(this.b[i6][i7][1]);
                }
            }
        }
    }

    public final void u() {
        this.cA = 5;
        this.cB = 0;
        this.cz = 0;
        this.B = false;
        this.D = false;
        this.E = true;
        this.F = true;
        this.cF = -1;
        this.cG = -1;
        this.C = false;
        this.cj = -1;
        this.ck = -1;
        this.Z = null;
        for (int i = 0; i < this.i.length; i++) {
            this.i[i] = false;
        }
        for (int i2 = 0; i2 < this.a.j.length; i2++) {
            this.a.j[i2] = false;
        }
    }

    public final void v() {
        this.cC = 0;
        this.cD = 3;
        this.cE = 0;
    }

    public final void m(int i) {
        if (this.G) {
            this.cE += i;
        } else {
            this.cB += i;
        }
    }

    /* JADX INFO: renamed from: u, reason: collision with other method in class */
    public final int m40u() {
        return this.G ? this.cE : this.cB;
    }

    /* JADX INFO: renamed from: v, reason: collision with other method in class */
    public final int m41v() {
        return this.G ? this.cD : this.cA;
    }

    public final void w() {
        if (this.G) {
            this.cD++;
        } else {
            this.cA++;
        }
    }

    public final boolean f() {
        if (this.G) {
            this.cD--;
        } else {
            this.cA--;
        }
        if (this.G && this.cD == 0) {
            return true;
        }
        return !this.G && this.cA == 0;
    }

    /* JADX INFO: renamed from: w, reason: collision with other method in class */
    public final int m42w() {
        return am.ao[Math.min(this.cz, am.ao.length - 1)];
    }

    public final int[] c() {
        return this.G ? this.V : this.U;
    }

    public final void x() {
        this.f156m = true;
    }
}
