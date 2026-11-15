package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: loaded from: original-2d.jar:k.class */
public final class k {
    private static int[] d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int f284a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static boolean f286a;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static int v;
    private static int aT;
    public static int w;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    private static boolean f294p;
    public static int S;
    public static int al;
    public static int am;
    public static int an;
    public static int ao;
    public static int ax;
    public static int az;
    public static int aK;
    public static int aL;
    public static int aM;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    public static boolean f322n;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    public static boolean f323o;
    public static int aQ;
    public static int aR;
    private static int aY;
    private static int aZ;
    private static int ba;
    private static int bb;
    private static int bc;
    private static int bd;
    private static int be;
    private static int bf;
    private static int bg;
    private static int bh;
    private static int bi;
    private static int bj;
    private static int bk;
    private static int bl;
    private static int bm;
    private static int bn;
    private static int bo;
    private static int bp;
    private static int bC;
    public static Random a = new Random();
    public static int b = 6;
    public static int c = 8;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static int f285d = b;
    public static final int e = f285d * 30;
    public static final int f = b * 30;
    public static final int g = c * 30;
    public static int h = 0;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static boolean f287b = false;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static boolean f288c = false;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static boolean f289d = false;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static boolean f290e = false;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static boolean f291f = false;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public static boolean f292g = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int[] f293a = {65542, 65543, 65544};

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static int[] f295e = new int[150];
    private static int aU = 0;
    public static int x = 0;
    public static int y = 0;
    public static int z = 0;
    public static int A = 0;
    public static int B = 0;
    public static int C = 0;
    public static int D = 0;
    public static final int E = Math.max(Math.max(1, 1), Math.max(2, 2));
    public static final int F = ((20 * e) * 85) / 100;
    public static final int G = ((2 * e) * 85) / 100;
    public static final int H = ((128 * e) * 85) / 100;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private static final int[][] f296m = {new int[]{0, 0, 0, 0}, new int[]{10, 10, 10, 10}, new int[]{1000, 1000, 1000, 1000}, new int[]{50, 100, 150, 200}, new int[]{100, 200, 300, 400}, new int[]{200, 400, 600, 800}, new int[]{10, 10, 10, 10}, new int[]{50, 300, 1050, 2400}, new int[]{50, 300, 1050, 2400}, new int[]{50, 300, 1050, 2400}, new int[]{50, 300, 1050, 2400}, new int[]{50, 300, 1050, 2400}, new int[]{50, 50, 50, 50}, new int[]{300, 300, 300, 300}, new int[]{1050, 1050, 1050, 1050}};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int[][] f297a = new int[2][25];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static int[][] f298b = new int[1][25];

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static int[][] f299c = new int[E][25];

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static boolean f300h = true;
    public static int I = 1;
    public static int J = 1;
    public static int K = 0;
    public static int L = 0;
    public static int M = 0;
    public static int N = 4;
    public static int O = 0;
    public static int P = H;
    public static int Q = 6;
    public static int R = ((12 * e) * 75) / 100;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    private static boolean f301q = true;
    private static int aV = 1;
    public static int T = 0;
    public static int U = 5;
    public static int V = 0;
    public static int W = 0;
    public static int X = 0;
    public static int Y = 0;
    public static int Z = 1;
    public static int aa = -1;
    public static int ab = 0;
    public static int ac = 0;
    public static int ad = 0;
    public static int ae = 0;
    public static int af = 0;
    public static int ag = 0;
    public static int ah = 0;
    public static int ai = 0;
    public static int aj = 0;
    public static int ak = 0;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public static boolean f302i = true;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public static boolean f303j = false;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static final int[][] f304d = {new int[]{7, 8, 10}, new int[]{4, 5, 11, 12}};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final boolean[] f305a = {true, true, false, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true};

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static final int[] f306b = {100, 100, 0, 250, 300, 300, 180, 150, 150, 150, 300, 300, 300, 0, 100, 0, 0, 200, 100, 130, 100, 220};
    private static final int aW = ((F * 1) + 90) + 30;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private static int[][] f307n = new int[3][8];

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static int[] f308f = new int[6];
    private static int aX = 0;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static int[] f309g = {-1, -1, -1, -1};

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public static boolean f310k = false;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static int[][] f311e = new int[3][4];
    public static int ap = 0;
    public static final int aq = (-6) * g;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static int[][] f312f = new int[3][5];
    public static int ar = 0;
    public static int as = 3;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public static int[][] f313g = new int[1][1];
    public static int at = 0;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static int[][] f314h = new int[1][1];
    public static int au = 0;
    public static int av = 0;
    public static final int aw = (3 * f) / 2;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public static int[][] f315i = new int[1][6];
    public static final int ay = (-5) * g;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public static int[][] f316j = new int[1][6];
    public static int aA = 0;
    public static int aB = 0;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public static boolean f317l = false;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    public static boolean f318m = false;
    public static int aC = 0;
    public static int aD = 0;
    public static int aE = 1;
    public static int aF = 0;
    public static int aG = 0;
    public static int aH = 1;
    public static int aI = 1;
    public static int aJ = 2;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public static int[][] f319k = new int[12][8];

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public static int[][] f320l = (int[][]) null;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static int[] f321c = new int[710];
    public static int aN = 0;
    public static int aO = 1;
    public static int aP = 0;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private static final int[][] f324o = {new int[]{65537, 786434, 0, 196608, 393216, 393218, 196610, 196612, 393220, 393222, 196614, 196616, 393224}, new int[]{65537, 458755, 0, 196608, 720896, 720902, 327686, 327682, 589826, 589828, 458756, 458754}, new int[]{65537, 327683, 3, 196611, 196608, 327680, 327686, 458758, 458752, 589824, 589830, 720902, 720899, 917507}};

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static int[] f325h = new int[20];

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static int[] f326i = new int[20];
    private static int bq = 0;
    private static int br = 0;
    private static int bs = 0;
    private static int bt = 0;
    private static int bu = 0;
    private static int bv = 0;
    private static int bw = 0;
    private static int bx = 0;
    private static int by = 0;
    private static int bz = 4;
    private static int bA = 0;
    private static int bB = 0;
    public static int aS = 0;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static int[] f327j = new int[22];

    public static final int a() {
        return j + (k * 1) + (l * 1) + (m * 1);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final void m69a() {
        i = 0;
        j = 0;
        k = 0;
        l = 0;
        m = 0;
        n = 0;
        o = 0;
        p = 0;
        q = 0;
        s = 0;
        r = 0;
        t = 0;
        u = 0;
        v = 0;
    }

    public static final void a(int i2, int i3) {
        f287b = false;
        f288c = false;
        x = 0;
        y = 0;
        z = 0;
        A = 0;
        B = 0;
        h = 0;
        J = 1;
        Z = 1;
        aa = -1;
        d();
    }

    public static void b() {
        J = 1;
        U = 5;
        V = 0;
        W = 0;
        ac = 0;
    }

    public static void c() {
        aH = 20;
        aI = 17;
        g();
        t();
    }

    public static final void a(int i2) {
        W = V;
        Y = 0;
        V += i2;
        V = Math.min(V, 999999999);
    }

    public static final void b(int i2) {
        Y += i2;
        T += i2;
        if (f319k[aM][2] == 0) {
            T = 0;
        }
        if (T > 8000 && f305a[4]) {
            T = 0;
            a(c(aM, aH / 2, true), c(aM, 1, false), true);
        }
        if (Y < 500) {
            X = W + (((V - W) * Y) / 500);
        } else {
            X = V;
        }
        e(i2);
        a(i2, true);
        f.b(i2);
        f291f = false;
        f292g = false;
        f310k = f291f;
    }

    private static void e(int i2) {
        h += i2;
        if (h < 250) {
            f286a = false;
        } else {
            h -= 250;
            f286a = true;
        }
    }

    public static final void b(int i2, int i3) {
        boolean z2 = i2 == 0;
        switch (i3) {
            case 50:
                if (DCWall.f36b) {
                    f294p = true;
                }
                break;
            case 52:
                f289d = z2;
                break;
            case 53:
                f291f = z2;
                f292g = !z2;
                break;
            case 54:
                f290e = z2;
                break;
            case 56:
                if (DCWall.f36b && DCWall.f14c != 2 && z2) {
                    aO = 2;
                }
                if (DCWall.f36b && DCWall.f14c == 2 && z2) {
                    J = 8;
                    break;
                }
                break;
        }
    }

    public static final void d() {
        f289d = false;
        f290e = false;
        f291f = false;
        f292g = false;
    }

    private static void a(int i2, boolean z2) {
        f(i2);
        g(i2);
        m83n(i2);
        if (z2) {
            f();
        } else {
            aU = 0;
        }
    }

    private static void a(int i2, int i3, int i4) {
        if (aU >= 147) {
            f();
        }
        switch (i2 & 255) {
            case 10:
                int[] iArr = f295e;
                int i5 = aU;
                aU = i5 + 1;
                iArr[i5] = (i2 << 24) | (i2 >> 8);
                int[] iArr2 = f295e;
                int i6 = aU;
                aU = i6 + 1;
                iArr2[i6] = i3;
                f295e[aU] = i4;
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 35:
            case 36:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 66:
            case 70:
                f295e[aU] = (i2 << 24) | ((i3 & 255) << 16) | (i4 & 65535);
                break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 37:
            case 71:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
                f295e[aU] = (i2 << 24) | ((i4 & 255) << 16) | (i3 & 65535);
                break;
        }
        aU++;
    }

    private static void f() {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < aU) {
            int i5 = f295e[i4] >> 24;
            int i6 = i5;
            switch (i5) {
                case 10:
                    int i7 = i4;
                    int i8 = i4 + 1;
                    i6 |= f295e[i7] << 8;
                    i4 = i8 + 1;
                    i2 = f295e[i8];
                    i3 = f295e[i4];
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 35:
                case 36:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 66:
                    i2 = (f295e[i4] >> 16) & 255;
                    i3 = f295e[i4] & 65535;
                    break;
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 37:
                case 71:
                case 74:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                    i2 = f295e[i4] & 65535;
                    i3 = (f295e[i4] >> 16) & 255;
                    break;
                case 70:
                    i2 = (f295e[i4] >> 16) & 255;
                    i3 = 0;
                    break;
            }
            f.a(i6, i2, i3);
            k(i6);
            i4++;
        }
        aU = 0;
    }

    private static void f(int i2) {
        D = Math.min(D + i2, C);
        switch (B) {
            case 1:
                if (D != C) {
                    x += ((z - x) * i2) / (C - D);
                    y += ((A - y) * i2) / (C - D);
                    return;
                }
                break;
            case 2:
                break;
            default:
                return;
        }
        x = z;
        y = A;
        B = 0;
    }

    private static void g() {
        v();
    }

    private static void g(int i2) {
        f300h = M == 0;
        M = Math.min(M + i2, L);
        if (J != K) {
            a(40, J, L);
        }
        K = J;
        switch (J) {
            case 1:
                h();
                break;
            case 2:
                break;
            case 3:
                j();
                return;
            case 4:
                h(i2);
                return;
            case 5:
                i(i2);
                return;
            case 6:
                o();
                return;
            case 7:
                m();
                return;
            case 8:
                l();
                return;
            case 9:
                n();
                return;
            case 10:
            default:
                return;
            case 11:
                k();
                return;
            case 12:
                p();
                return;
        }
        i();
    }

    private static void h() {
        switch (DCWall.f14c) {
            case 1:
                aV = 1;
                break;
            case 2:
                aV = 1;
                break;
            case 3:
                aV = 2;
                break;
            case 4:
                aV = 2;
                break;
        }
        s();
        u();
        a(0, false, true);
        if (DCWall.f14c != 2) {
            j.a();
        }
        N = 4;
        O = 0;
        aN = 0;
        switch (DCWall.f19h) {
            case 1:
                ac = 360;
                ae = 4;
                af = 3;
                ag = 60;
                ah = 120;
                aj = 60;
                ai = 40;
                break;
            case 2:
                ac = 480;
                ae = 4;
                af = 3;
                ag = 60;
                ah = 120;
                aj = 60;
                ai = 40;
                break;
            case 3:
                ac = 560;
                ae = 4;
                af = 3;
                ag = 60;
                ah = 140;
                aj = 80;
                ai = 40;
                break;
            case 4:
                ac = 600;
                ae = 4;
                af = 3;
                ag = 60;
                ah = 140;
                aj = 80;
                ai = 40;
                break;
        }
    }

    private static void i() {
        f287b = false;
        f288c = false;
        DCWall.f15d += DCWall.m4c();
        ab = 0;
        S = 0;
        A = 0;
        B = 1;
        if (DCWall.f14c != 2) {
            l(DCWall.f17f);
        }
        aT = f293a[Math.abs(a.nextInt()) % f293a.length];
        w = -1;
        if (!f302i || DCWall.f14c == 2) {
            m(0);
            a(0, true, true);
            a(30, 0, 0);
            J = 3;
            C = 0;
            L = 0;
            D = 0;
            M = 0;
            return;
        }
        switch (DCWall.f19h) {
            case 1:
                ak = 3;
                break;
            case 2:
                ak = 3;
                break;
            case 3:
                ak = 2;
                break;
            case 4:
                ak = 2;
                break;
        }
        m(DCWall.f17f - 1);
        a(0, true, true);
        y = f319k[aM][4];
        B = 0;
        J = 12;
        L = 500;
        M = 0;
        a(81, 0, 0);
        a(86, 0, 0);
        if (DCWall.f14c == 1) {
            a(77, 500, 0);
        }
    }

    private static void j() {
        m103o(4);
        m103o(16);
        m103o(19);
        d();
        Q = 8;
        aN = 0;
        m(aM);
        a(true, false, false);
        a(aM, true, false);
        J = 4;
        L = 0;
        A();
        a(31, 0, 0);
        if (aO == 2) {
            r();
            a(74, 0, 0);
        }
        if (f302i && DCWall.f14c != 2) {
            a(80, 1000, 3);
            f302i = false;
        }
        System.gc();
        DCWall.c();
    }

    private static void h(int i2) {
        if (f298b[0][1] != 18 && f298b[0][1] != 17 && (f291f || f292g)) {
            f310k = f291f;
            for (int i3 = 0; i3 < 1; i3++) {
                int i4 = 0;
                int i5 = f297a[0][2];
                while (true) {
                    int i6 = i5;
                    if (i4 < 32) {
                        if ((i6 & 1) == 1) {
                            int iN = n(i4);
                            for (int i7 = 0; i7 < iN; i7++) {
                                if (f310k && (am & (1 << i4)) == 0) {
                                    a(60, i4, i7);
                                    if (!m74a(i4, i7)) {
                                        break;
                                    }
                                } else if (m75b(i4, i7)) {
                                    a(61, i4, i7);
                                }
                            }
                        }
                        i4++;
                        i5 = i6 >> 1;
                    }
                }
            }
        }
        for (int i8 = 0; i8 < aV; i8++) {
            if (f299c[i8][1] == 1 && (a(f297a[0], f299c[i8], false, true) || (f297a[1][1] == 1 && a(f297a[1], f299c[i8], false, true)))) {
                e(0, i8);
            }
        }
        for (int i9 = 0; i9 < 1; i9++) {
            if (f298b[0][1] != 0) {
                for (int i10 = 0; i10 < 2; i10++) {
                    if (f297a[i10][1] != 0 && f298b[0][1] != 17 && a(f298b[0], f297a[i10], i2, false)) {
                        c(0, i10);
                    }
                }
            }
        }
        for (int i11 = 0; i11 < 1; i11++) {
            if (f298b[i11][1] != 0 && f298b[i11][1] != 17 && a(f298b[i11], (int[]) null, i2, true)) {
                j(i11);
            }
        }
        for (int i12 = 0; i12 < 2; i12++) {
            a(f297a[i12], i12, i2);
        }
        for (int i13 = 0; i13 < 1; i13++) {
            a(f298b[i13], i13, i2);
        }
        for (int i14 = 0; i14 < aV; i14++) {
            a(f299c[i14], i14, i2);
        }
        if (J != 9 && J != 7) {
            for (int i15 = 0; i15 < 1; i15++) {
                int i16 = 0;
                int i17 = f297a[0][2];
                while (true) {
                    int i18 = i17;
                    if (i16 < 32) {
                        if ((i18 & 1) == 1) {
                            int iN2 = n(i16);
                            for (int i19 = 0; i19 < iN2; i19++) {
                                if (m76c(i16, i19)) {
                                    d(i16, i19);
                                }
                            }
                        }
                        i16++;
                        i17 = i18 >> 1;
                    }
                }
            }
            for (int i20 = 0; i20 < 1; i20++) {
                int i21 = 0;
                int i22 = f297a[0][2];
                while (true) {
                    int i23 = i22;
                    if (i21 < 32) {
                        if ((i23 & 1) == 1) {
                            int iN3 = n(i21);
                            for (int i24 = 0; i24 < iN3; i24++) {
                                int iM77a = m77a(i21, i24, i2);
                                if (iM77a != 0) {
                                    a(iM77a, i21, i24);
                                }
                                if ((f297a[0][2] & (1 << i21)) == 0) {
                                    a(61, i21, i24);
                                }
                                if (iM77a == 64) {
                                    p++;
                                    m103o(10);
                                    J = 6;
                                    L = 300;
                                    M = 0;
                                }
                            }
                        }
                        i21++;
                        i22 = i23 >> 1;
                    }
                }
            }
            int i25 = f319k[aM][7];
            int i26 = f319k[aM][1];
            for (int i27 = i25; i27 < i25 + i26; i27++) {
                int i28 = f321c[i27];
                if (m87a(i28) && B(i28) == 2) {
                    a(5, i27, 5, false);
                }
            }
            if (DCWall.f14c != 2) {
                switch (DCWall.f14c) {
                    case 1:
                        DCWall.c(2);
                        break;
                    case 3:
                        DCWall.c(32);
                        break;
                    case 4:
                        DCWall.c(33);
                        break;
                }
            } else {
                DCWall.c(1);
            }
        }
        ac = Math.max(0, Math.min(999, ac + ad));
        ad = 0;
        if (f286a && f298b[0][1] != 18) {
            ac = Math.max(0, ac - 1);
            if (I == 2 && ac == 0) {
                a(33, 0, 0);
                J = 9;
                L = 1000;
                M = 0;
            }
        }
        if (L == 0 || M != L || aN == 0) {
            return;
        }
        if (aN == 1 || aN == 2) {
            int iH = H(b(f298b[0][6], f298b[0][7], f298b[0][6], f298b[0][7]) * e);
            Q = S;
            f298b[0][6] = (((Q * R) * f298b[0][6]) / iH) >> 3;
            f298b[0][7] = (((Q * R) * f298b[0][7]) / iH) >> 3;
        }
        aN = 0;
        a(86, 0, 0);
        if (aP == 1) {
            DCWall.c(12);
            r++;
        } else if (aP == 3) {
            DCWall.c(30);
            q++;
        } else if (aP == 2) {
            DCWall.c(31);
            r++;
        }
        m103o(6);
        m103o(11);
        if (aO == 2) {
            a(74, 0, 0);
        }
    }

    private static void i(int i2) {
        int i3;
        switch (aN) {
            case 1:
                aM = (aM + 1) % aK;
                m103o(9);
                m103o(0);
                m103o(1);
                m103o(2);
                m103o(3);
                if (DCWall.f14c == 3 && aM > ab) {
                    ab = aM;
                    ad += ai;
                    a(84, L, ai);
                }
                break;
            case 2:
                aM = (aM - 1) % aK;
                break;
            case 3:
                aM = aY;
                a(aM, true, true);
                break;
            case 4:
                aY = aM;
                aM = aK;
                a(aM, true, true);
                break;
        }
        m(aM);
        a(false, aP == 1 || aP == 2, aP == 1);
        if (DCWall.f14c == 2 || !(aN == 1 || aN == 2)) {
            A = f319k[aM][4];
            B = 2;
        } else {
            if (DCWall.f14c == 1 && DCWall.m < (i3 = DCWall.f34k + aM)) {
                DCWall.m = i3;
            }
            A = f319k[aM][4];
            B = 1;
            int iH = H(b(f298b[0][6], f298b[0][7], f298b[0][6], f298b[0][7]) * e);
            S = Q;
            Q = 1;
            f298b[0][6] = (((Q * R) * f298b[0][6]) / iH) >> 3;
            f298b[0][7] = (((Q * R) * f298b[0][7]) / iH) >> 3;
        }
        f297a[0][5] = f319k[aM][4] + (g * (aI - 1));
        if (aO != 2) {
            f297a[1][1] = 0;
        }
        J = 4;
        int iMax = Math.max(1, L - i2);
        L = iMax;
        C = iMax;
        D = 0;
        M = 0;
    }

    private static void k() {
        if (M == L) {
            J = N;
            int i2 = O;
            C = i2;
            L = i2;
            D = 0;
            M = 0;
            N = 4;
            O = 0;
        }
    }

    private static void l() {
        if (DCWall.f14c == 1 && DCWall.f19h == 4) {
            j.m63a(aM);
        }
        if (M == L) {
            if (DCWall.f14c == 2) {
                J = 1;
                f288c = true;
                return;
            }
            j.c();
            if (I == 1) {
                J = 1;
            } else if (I == 2) {
                J = 2;
                L = 1000;
                M = 0;
            } else {
                aN = 1;
                J = 2;
                L = 1000;
                M = 0;
            }
            f288c = true;
        }
    }

    private static void m() {
        if (DCWall.f14c == 1 && DCWall.f19h == 4) {
            j.m63a(aM);
        }
        if (f300h) {
            a(true, false, false);
            for (int i2 = 0; i2 < 1; i2++) {
                int i3 = 0;
                int i4 = f297a[0][2];
                while (true) {
                    int i5 = i4;
                    if (i3 < 32) {
                        if ((i5 & 1) == 1) {
                            int iN = n(i3);
                            for (int i6 = 0; i6 < iN; i6++) {
                                m77a(i3, i6, 0);
                                if ((f297a[0][2] & (1 << i3)) == 0) {
                                    a(61, i3, i6);
                                }
                            }
                        }
                        i3++;
                        i4 = i5 >> 1;
                    }
                }
            }
        }
        if (M == L) {
            J = 3;
        }
    }

    private static void n() {
        if (f300h) {
            a(true, false, false);
        }
        if (M == L) {
            if (DCWall.f14c != 2) {
                j.c();
            }
            J = 1;
            f287b = true;
        }
    }

    private static void o() {
        int i2 = f319k[aM][1];
        int i3 = f319k[aM][7];
        for (int i4 = i3; i4 < i3 + i2; i4++) {
            if (m87a(f321c[i4])) {
                a(5, i4, 3, true);
            }
        }
        if (M == L) {
            J = 4;
        }
    }

    private static void p() {
        if (f303j) {
            boolean z2 = aM == 0;
            aM = 0;
            m(aM);
            A = f319k[aM][4];
            B = 2;
            if (!z2) {
                a(30, 1300, 0);
            }
            M = L;
        }
        if (M == L) {
            if (aM == 0) {
                J = 3;
                C = 0;
                L = 0;
                D = 0;
                M = 0;
                f303j = true;
                return;
            }
            aM--;
            m(aM);
            A = f319k[aM][4];
            B = 1;
            if (aM < ak) {
                int i2 = ((550 * (ak - aM)) / ak) + 750;
                C = i2;
                L = i2;
                D = 0;
                M = 0;
            } else {
                C = 750;
                L = 750;
                D = 0;
                M = 0;
            }
            aN = 2;
            a(78, L, 0);
            if (aM == 0) {
                a(30, L, 0);
            }
        }
    }

    private static void c(int i2, int i3) {
        a(12, i2, i3);
    }

    private static void d(int i2, int i3) {
        switch (i2) {
            case 4:
                if (a(i3, f307n[0])) {
                    a(m82e(f307n[0][7]), s(f307n[0][7]), 2, true);
                }
                break;
            case 5:
                int i4 = (f312f[i3][0] >> 0) & 65535;
                if (i4 < f321c.length) {
                    a(5, i3, m92j(f321c[i4]), m93k(f321c[i4]), 2, false, true);
                } else {
                    a(66, 5, i3);
                }
                break;
            case 7:
                int iM90h = m90h(f321c[(f314h[i3][0] >> 0) & 65535]);
                int i5 = f319k[aM][7];
                int i6 = f319k[aM][1];
                int i7 = 0;
                for (int i8 = i5; i8 < i6 + i5; i8++) {
                    int i9 = f321c[i8];
                    if (m87a(i9) && m90h(i9) == iM90h) {
                        if (i7 <= 100) {
                            a(5, i8, 4, false);
                            i7++;
                        }
                        break;
                    }
                }
                break;
            case 8:
                int i10 = (f314h[i3][0] >> 0) & 65535;
                if (i10 < f321c.length) {
                    a(8, i3, m92j(f321c[i10]), m93k(f321c[i10]), 2, true, false);
                }
                break;
            case 11:
                int i11 = (f316j[i3][0] >> 0) & 65535;
                if (i11 < f321c.length) {
                    b(i3, m92j(f321c[i11]), m93k(f321c[i11]));
                }
                break;
            case 12:
                a(12, i3, f315i[i3][3] / f, (f315i[i3][4] - f319k[aM][4]) / g, 4, false, true);
                a(66, i2, i3);
                break;
        }
    }

    private static void e(int i2, int i3) {
        boolean z2 = false;
        if (f299c[i3][2] == 21) {
            f299c[i3][2] = a(false);
            z2 = true;
        }
        int i4 = f299c[i3][2];
        int i5 = i4;
        int iN = n(i4);
        for (int i6 = 0; i6 < f304d.length; i6++) {
            for (int i7 = 0; i7 < f304d[i6].length; i7++) {
                if (i5 == f304d[i6][i7]) {
                    for (int i8 = 0; i8 < f304d[i6].length; i8++) {
                        if (i8 != i7 && (f297a[i2][2] & (1 << f304d[i6][i8])) != 0 && m73c(f304d[i6][i8])) {
                            int[] iArr = f297a[i2];
                            iArr[2] = iArr[2] & ((1 << f304d[i6][i8]) ^ (-1));
                        }
                    }
                }
            }
        }
        boolean z3 = (f297a[i2][2] & (1 << i5)) != 0;
        b(i5, z3);
        switch (i5) {
            case 0:
                Q = 6;
                break;
            case 1:
                Q = 10;
                break;
        }
        if ((i5 == 0 || i5 == 1) && !z3) {
            for (int i9 = 0; i9 < 1; i9++) {
                f298b[i9][6] = (Q * f298b[i9][6]) >> 3;
                f298b[i9][7] = (Q * f298b[i9][7]) >> 3;
            }
        } else {
            for (int i10 = 0; i10 < iN; i10++) {
                m74a(i5, i10);
            }
        }
        int[] iArr2 = f297a[i2];
        iArr2[2] = iArr2[2] | (1 << i5);
        am &= (1 << i5) ^ (-1);
        a(10 | (f299c[i3][2] << 8), f299c[i3][4], f299c[i3][5]);
        i++;
        f299c[i3][1] = 0;
        int i11 = 0;
        if (z2) {
            i5 = 21;
        }
        switch (i5) {
            case 0:
                i11 = 8;
                break;
            case 1:
                i11 = 9;
                break;
            case 3:
                i11 = 14;
                break;
            case 4:
                i11 = 3;
                break;
            case 5:
                i11 = 7;
                break;
            case 6:
                i11 = 4;
                break;
            case 7:
                i11 = 6;
                break;
            case 8:
                i11 = 10;
                break;
            case 9:
                i11 = 17;
                break;
            case 10:
                i11 = 5;
                break;
            case 11:
                i11 = 11;
                break;
            case 12:
                i11 = 18;
                break;
            case 14:
                i11 = 20;
                break;
            case 15:
                i11 = 21;
                break;
            case 16:
                i11 = 22;
                break;
            case 17:
                i11 = 23;
                break;
            case 18:
                i11 = 24;
                break;
            case 19:
                i11 = 26;
                break;
            case 20:
                i11 = 27;
                break;
            case 21:
                i11 = 28;
                break;
        }
        DCWall.c(i11);
    }

    private static void j(int i2) {
        boolean z2 = false;
        int i3 = f298b[i2][23];
        int iM82e = m82e(i3);
        int iS = s(i3);
        if (aO == 2) {
            if (iM82e == 3 || iM82e == 4) {
                if (!(aM == 0 && iM82e == 4) && (aM < aK - 1 || iM82e != 3)) {
                    f298b[i2][16] = -1;
                    aN = iM82e == 3 ? 1 : 2;
                    J = 5;
                    L = 1000;
                    M = 0;
                } else if (aM == 0 && iM82e == 4) {
                    z2 = true;
                } else if ((I == 3 || I == 2) && aM == aK - 1) {
                    J = 11;
                    L = 3000;
                    M = 0;
                    N = 8;
                    O = 0;
                    if (I == 2) {
                        ad += ah;
                        a(83, L, ad);
                    }
                }
            }
        } else if (aO == 1 && iM82e == 4) {
            z2 = true;
        }
        if (!z2) {
            if (iM82e <= 4) {
                a(16, i2, iM82e);
                return;
            }
            int i4 = f297a[0][2];
            int i5 = f314h[i2][0];
            int i6 = (i5 >> 24) & 127;
            boolean z3 = ((i5 >> 31) & 1) != 0;
            int iM89g = m89g(f321c[iS]);
            int iB = B(f321c[iS]);
            if ((i4 & 256) == 0 || !z3 || i6 != 1 || iM89g == 1 || iM89g == 6 || iB == 3 || iB == 4) {
                if (iB == 3 || iB == 4) {
                    q();
                    return;
                } else {
                    a(iM82e, iS, 0, false);
                    a(14, i2, iS);
                    return;
                }
            }
            return;
        }
        n++;
        Z = 1;
        aa = -1;
        if (aP == 3) {
            aN = 3;
            J = 5;
            L = 250;
            M = 0;
            return;
        }
        if (I == 0 || I == 1 || I == 3) {
            int i7 = U - 1;
            U = i7;
            if (i7 == 0) {
                J = 9;
                C = 550;
                L = 550;
                D = 0;
                M = 0;
            } else {
                J = 7;
                L = 1000;
                M = 0;
            }
        } else if (I == 2) {
            ad -= aj;
            if (Math.max(0, ac + ad) == 0) {
                J = 9;
                C = 550;
                L = 550;
                D = 0;
                M = 0;
            } else {
                J = 7;
                L = 1000;
                M = 0;
            }
            a(85, L, aj);
        }
        if (DCWall.f14c == 1) {
            DCWall.q = U;
            DCWall.r = V;
        } else if (DCWall.f14c == 2) {
            DCWall.o = U;
            DCWall.p = V;
        }
        for (int i8 = 1; i8 < 2; i8++) {
            f297a[i8][1] = 0;
        }
        for (int i9 = 0; i9 < 1; i9++) {
            f298b[i9][1] = 0;
        }
        a(33, 0, 0);
        if (DCWall.f14c == 2 || aP != 0) {
            return;
        }
        j.b();
    }

    private static void a(int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3) {
        for (int i7 = -i6; i7 <= i6; i7++) {
            for (int i8 = -i6; i8 <= i6; i8++) {
                int iM80a = m80a(i8 + i4, i7 + i5);
                int iM82e = m82e(iM80a);
                if (iM82e > 4) {
                    int iAbs = Math.abs(i8) + Math.abs(i7);
                    int iMin = z3 ? 0 : Math.min(20, 1 * iAbs);
                    int iS = s(iM80a);
                    int i9 = f321c[iS];
                    boolean z4 = m89g(i9) != 2;
                    if (z2 && z4) {
                        a(45, 3, iS);
                        f321c[iS] = s(t(i9, 3), iMin);
                    } else if (iAbs != 0 && aP != 1 && aP != 2) {
                        a(45, 1, iS);
                        f321c[iS] = s(t(i9, 1), iMin);
                    } else if (z4) {
                        a(iM82e, iS, 1, false);
                    } else {
                        a(66, i2, i3);
                    }
                }
            }
        }
    }

    private static void b(int i2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = i4; i6 > -1; i6--) {
            for (int i7 = i5; i7 < 2; i7++) {
                int iM80a = m80a(i7 + i3, i6);
                int iM82e = m82e(iM80a);
                if (iM82e > 4) {
                    int i8 = (i4 - i6) / 3;
                    int iMin = Math.min(20, 1 * i8);
                    int iS = s(iM80a);
                    int i9 = f321c[iS];
                    if (m89g(i9) == 2) {
                        i5 = 2;
                    } else if (i8 == 0) {
                        a(66, 11, i2);
                        a(iM82e, iS, 5, true);
                    } else {
                        a(45, 1, iS);
                        f321c[iS] = s(t(i9, 1), iMin);
                    }
                }
            }
        }
    }

    private static void q() {
        int i2 = f319k[aM][7];
        int i3 = f319k[aM][1];
        for (int i4 = i2; i4 < i3 + i2; i4++) {
            int i5 = f321c[i4];
            if (m87a(i5) && (B(i5) == 3 || B(i5) == 4)) {
                a(5, i4, 5, true);
            }
        }
    }

    private static boolean a(int i2, int i3, int i4, boolean z2) {
        boolean z3 = false;
        if (i2 > 4) {
            int iM81a = m81a(i3, z2);
            int iM89g = m89g(f321c[i3]);
            if (iM89g == 7 || iM89g == 8 || iM89g == 9 || iM89g == 10) {
                z();
            }
            z3 = iM81a == 0;
            if (iM81a == 0) {
                int i5 = f321c[i3];
                if (DCWall.f14c != 2 && aP == 0) {
                    j.a(f319k[aM][5], m88f(i5), m89g(i5), m92j(i5), m93k(i5));
                }
                a(34, i3, i4);
                if (Math.abs(a.nextInt() % 101) < 65 && f319k[aM][2] > 1) {
                    a(c(aM, m92j(i5), true), c(aM, m93k(i5), false), false);
                }
                int i6 = 0;
                int iM89g2 = m89g(i5);
                char c2 = 0;
                switch (DCWall.f19h) {
                    case 1:
                        c2 = 0;
                        break;
                    case 2:
                        c2 = 1;
                        break;
                    case 3:
                        c2 = 2;
                        break;
                    case 4:
                        c2 = 3;
                        break;
                }
                int i7 = f296m[iM89g2][c2];
                switch (iM89g2) {
                    case 2:
                        i6 = 1000;
                        m++;
                        m103o(18);
                        break;
                    case 3:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        i6 = 100;
                        j++;
                        m103o(14);
                        break;
                    case 4:
                        i6 = 200;
                        k++;
                        m103o(13);
                        break;
                    case 5:
                        i6 = 300;
                        l++;
                        m103o(17);
                        break;
                }
                int i8 = DCWall.f14c != 2 ? i7 : i6;
                if (i4 == 0) {
                    int iM90h = m90h(i5);
                    if (iM90h == aa || iM89g == 1) {
                        Z++;
                        Z = Math.min(Z, 20);
                        a(35, Z, i3);
                        if (DCWall.f14c == 3 && Z >= af) {
                            ad += ae;
                        }
                    } else {
                        aa = iM90h;
                        Z = 1;
                    }
                    i8 *= Z;
                }
                a(aE * i8);
                if (DCWall.f14c != 2) {
                    m103o(11);
                } else {
                    m103o(5);
                }
                if (DCWall.f14c != 2) {
                    if (m89g(f321c[i3]) == 1) {
                        r();
                        aO = 2;
                        DCWall.c(13);
                    } else if (f294p || m89g(f321c[i3]) == 6) {
                        f294p = false;
                        aN = 4;
                        N = 5;
                        J = 5;
                        O = 250;
                        L = 250;
                        M = 0;
                        DCWall.c(29);
                    }
                    if ((aP == 1 && bh == bg - 1) || (aP == 2 && aL == 0)) {
                        o++;
                        a(10000);
                        J = 11;
                        L = 3300;
                        M = 0;
                        N = 8;
                        O = 1000;
                        m103o(8);
                    } else if (aP == 3 && aL == 0) {
                        a(7500);
                        s++;
                        U++;
                        J = 11;
                        L = 3300;
                        M = 0;
                        aN = 3;
                        N = 5;
                        O = 250;
                        a(65, -1, -1);
                    } else if (aL == 0 && iM89g2 != 2) {
                        a(5000);
                        J = 11;
                        L = 3300;
                        M = 0;
                        if (aN != 4) {
                            N = 4;
                            O = 0;
                        }
                        if (I == 2) {
                            ad += ag;
                            a(83, L, ag);
                        }
                    }
                } else if ((aP == 1 && bh == bg - 1) || aL == 0) {
                    J = 11;
                    L = 3000;
                    M = 0;
                    N = 8;
                    O = 1000;
                }
            } else if (iM81a == 1) {
                a(37, i3, i4);
            }
        }
        return z3;
    }

    private static void a(boolean z2, boolean z3, boolean z4) {
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = 0;
            int i4 = f297a[0][2];
            while (true) {
                int i5 = i4;
                if (i3 < 32) {
                    if ((i5 & 1) == 1) {
                        int iN = n(i3);
                        for (int i6 = 0; i6 < iN; i6++) {
                            int iA = a(i3, i6, z2, z3, z4);
                            if (iA != 0) {
                                a(iA, i3, i6);
                            }
                            m77a(i3, i6, 0);
                            if ((f297a[0][2] & (1 << i3)) == 0 && (!z2 || (i3 != 17 && i3 != 18))) {
                                a(61, i3, i6);
                            }
                        }
                    }
                    i3++;
                    i4 = i5 >> 1;
                }
            }
        }
    }

    private static void k(int i2) {
        switch (i2) {
            case 12:
                d.c(50);
                break;
            case 34:
                d.c(100);
                break;
        }
    }

    private static void a(int i2, int i3, boolean z2) {
        for (int i4 = 0; i4 < aV; i4++) {
            int iA = z2 ? 4 : a(true);
            if (f299c[i4][1] == 0) {
                a(f299c[i4], 4098, 1, iA, Math.min(Math.max(i2, 224), (aH * f) - 224), i3, 0, ((3 * g) * 100) / 100, 0, 112, 210);
                a(36, i4, 0);
                return;
            }
        }
    }

    private static final int a(boolean z2) {
        int i2 = 0;
        do {
            if (DCWall.f14c != 2) {
                int i3 = 0;
                int iAbs = Math.abs(a.nextInt() % al);
                for (int i4 = 0; i4 < f306b.length; i4++) {
                    i3 += f306b[i4];
                    if (iAbs < i3 && m70b(i4) && f306b[i4] > 0) {
                        i2 = i4;
                        break;
                    }
                }
            } else if (!z2) {
                while (true) {
                    int iAbs2 = Math.abs(a.nextInt()) % f305a.length;
                    i2 = iAbs2;
                    if (m70b(iAbs2) && f305a[i2]) {
                        break;
                    }
                }
            } else {
                i2 = f327j[Math.abs(a.nextInt()) % bC];
            }
            if (z2) {
                break;
            }
        } while (i2 == 21);
        return i2;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static boolean m70b(int i2) {
        boolean z2 = false;
        if (((i2 != 14 && i2 != 8 && i2 != 7) || (aP != 1 && aP != 2)) && (((i2 != 19 && i2 != 20) || I != 2) && (f297a[0][2] & (1 << i2)) == 0 && (i2 != 10 || aP != 1))) {
            z2 = true;
        }
        return z2;
    }

    private static void r() {
        a(f297a[1], 4096, 1, 0, f297a[0][4], f319k[aM][4] + (g * 1), f297a[0][6], 0, f297a[0][13], f297a[0][14], f297a[0][15]);
    }

    private static void a(int i2, boolean z2, boolean z3) {
        a(f297a[0], 4096, 1, z2 ? f297a[0][2] : 0, ((f * aH) - 660) / 2, f319k[i2][4] + (g * (aI - 1)), F, 0, 0, 660, 180);
        a(f297a[1], 4096, 0, z2 ? f297a[1][2] : 0, f297a[0][4], f319k[i2][4] + (g * 1), f297a[0][6], 0, 0, 660, 180);
        for (int i3 = 0; i3 < 1; i3++) {
            a(f298b[0], 4097, 18, 0, f297a[0][4] + (f297a[0][14] / 2), (f319k[i2][4] + (g * (aI - 1))) - (g / 2), 0, 0, 90, 180, 180);
        }
        if (z3) {
            for (int i4 = 0; i4 < E; i4++) {
                a(f299c[i4], 4098, 0, 0, 0, 0, 0, 0, 0, 112, 210);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[ADDED_TO_REGION, REMOVE] */
    private static void s() {
        int i2 = 0;
        if (DCWall.f14c != 2) {
            switch (DCWall.f14c) {
                case 1:
                    if (DCWall.f19h == 1) {
                        i2 = 12;
                    } else if (DCWall.f19h != 2) {
                        i2 = DCWall.f19h != 3 ? 15 : 14;
                    } else {
                        i2 = 13;
                    }
                    break;
                case 3:
                    if (DCWall.f19h == 1 || DCWall.f19h == 2 || DCWall.f19h != 3) {
                        i2 = 15;
                    }
                    break;
                case 4:
                    if (DCWall.f19h != 1 && DCWall.f19h != 2 && DCWall.f19h == 3) {
                    }
                    i2 = 15;
                    break;
            }
        } else {
            i2 = 15;
        }
        R = ((i2 * e) * 75) / 100;
    }

    private static final void t() {
        int iM71a = m71a(0);
        int iM71a2 = m71a(aH * b * 30);
        aX = (d.d() - (iM71a2 - iM71a)) / 2;
        an = Math.max((iM71a + aX) - 2, 0);
        ao = Math.min(iM71a2 + aX + 1, d.d());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final int m71a(int i2) {
        return ((i2 - x) / 30) + aX;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static final int m72b(int i2) {
        return ((i2 - y) / 30) + 10;
    }

    public static final int c(int i2) {
        return (i2 * b) + aX;
    }

    public static final int d(int i2) {
        return (i2 * c) + 10;
    }

    private static void a(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = 0;
        iArr[4] = i5;
        iArr[5] = i6;
        iArr[6] = i7;
        iArr[7] = i8;
        iArr[9] = 0;
        iArr[8] = 0;
        iArr[13] = i9;
        iArr[14] = i10;
        iArr[15] = i11;
        iArr[16] = -1;
    }

    private static void a(int[] iArr, int i2) {
        switch (i2) {
            case 1:
                int iAbs = ((Math.abs(a.nextInt()) % 100) / 8) + 64;
                int iM100l = m100l(iAbs == 64 ? 63 : iAbs) >> 8;
                int iM101m = m101m(iAbs == 64 ? 63 : iAbs) >> 8;
                iArr[7] = iArr[7] - (((R * Q) * iM100l) >> 11);
                iArr[6] = iArr[6] + (((R * Q) * iM101m) >> 11);
                break;
        }
    }

    private static void a(int[] iArr, int i2, int i3) {
        if (iArr[1] != 0) {
            switch (iArr[0]) {
                case 4096:
                    b(iArr, i2, i3);
                    break;
                case 4097:
                    c(iArr, i2, i3);
                    break;
                case 4098:
                    b(iArr, i3);
                    break;
            }
        }
        iArr[16] = -1;
    }

    /* JADX WARN: Code duplicated, block: B:188:0x0383  */
    /* JADX WARN: Code duplicated, block: B:189:0x038c  */
    /* JADX WARN: Code duplicated, block: B:191:0x039c  */
    /* JADX WARN: Code duplicated, block: B:194:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:196:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:197:0x03c4  */
    private static void b(int[] iArr, int i2, int i3) {
        int i4;
        iArr[9] = iArr[4];
        if (i2 != 0) {
            iArr[4] = f297a[0][4];
            iArr[6] = f297a[0][6];
        }
        boolean z2 = (f297a[0][2] & 1048576) != 0;
        boolean z3 = z2;
        boolean z4 = z2 ? f290e : f289d;
        boolean z5 = z3 ? f289d : f290e;
        switch (iArr[1]) {
            case 1:
                if (z4 && iArr[6] > 0) {
                    P = -H;
                    iArr[6] = -G;
                }
                if (z5 && iArr[6] < 0) {
                    P = H;
                    iArr[6] = G;
                }
                if (z4 || z5) {
                    int i5 = (iArr[6] * i3) >> 10;
                    boolean zA = a(true, true, 0);
                    boolean zA2 = a(true, false, 0);
                    boolean zA3 = a(false, true, 0);
                    boolean zA4 = a(false, false, 0);
                    boolean zA5 = a(iArr, false, i5, false, true);
                    boolean zA6 = a(iArr, false, i5, false, false);
                    boolean z6 = f297a[1][1] == 1;
                    boolean z7 = f298b[0][1] == 17;
                    boolean zA7 = a(true, true, i5);
                    boolean zA8 = a(true, false, i5);
                    boolean zA9 = a(false, true, i5);
                    boolean zA10 = a(false, false, i5);
                    if ((iArr[6] < 0 && !((zA5 || z7) && ((z6 || z7 || zA3) && (z7 || zA || zA3)))) || (iArr[6] > 0 && !((zA6 || z7) && ((z6 || z7 || zA4) && (z7 || zA2 || zA4))))) {
                        iArr[4] = iArr[4] + i5;
                        iArr[6] = iArr[6] + ((P * i3) >> 10);
                    } else if (iArr[6] < 0 && zA5 && !z7 && ((z6 && zA) || zA3)) {
                        iArr[4] = 210;
                    } else if (iArr[6] > 0 && zA6 && !z7 && ((z6 && zA2) || zA4)) {
                        iArr[4] = (((aH * f) - iArr[14]) - 180) - 30;
                    } else if (iArr[6] < 0 && z7 && (zA9 || (z6 && zA7))) {
                        iArr[4] = (f298b[0][13] - f298b[0][9]) + 60;
                    } else if (iArr[6] > 0 && z7 && (zA10 || (z6 && zA8))) {
                        iArr[4] = (aH * f) - ((f298b[0][13] + f298b[0][9]) + 60);
                    } else if ((iArr[6] < 0 && ((!zA5 && z7) || ((!z6 && z7 && !zA9) || (z7 && !zA7 && !zA9)))) || (iArr[6] > 0 && ((!zA6 && z7) || ((!z6 && z7 && !zA10) || (z7 && !zA8 && !zA10))))) {
                        iArr[4] = iArr[4] + i5;
                        iArr[6] = iArr[6] + ((P * i3) >> 10);
                    }
                } else {
                    iArr[6] = (iArr[6] > 0 ? 1 : -1) * G;
                }
                if (z4) {
                    a(70, 1, 0);
                } else if (z5) {
                    a(70, 2, 0);
                } else {
                    a(70, 0, 0);
                }
                int i6 = iArr[14] / 2;
                int i7 = iArr[14] / 2;
                for (int i8 = 0; i8 < 1; i8++) {
                    if (f298b[i8][1] == 18 || f298b[i8][1] == 17) {
                        T = 0;
                    }
                    if (f298b[i8][1] == 18) {
                        i6 = 0;
                        i7 = iArr[14] + 30;
                        if (iArr[4] < (-i6)) {
                            iArr[4] = -i6;
                        } else if (iArr[4] > (f * aH) - i7) {
                            iArr[4] = (f * aH) - i7;
                        }
                        if (Math.abs(iArr[6]) > F) {
                            if (iArr[6] > 0) {
                                i4 = 1;
                            } else {
                                i4 = -1;
                            }
                            iArr[6] = i4 * F;
                        }
                    }
                    break;
                }
                if (iArr[4] < (-i6)) {
                    iArr[4] = -i6;
                } else if (iArr[4] > (f * aH) - i7) {
                    iArr[4] = (f * aH) - i7;
                }
                if (Math.abs(iArr[6]) > F) {
                    if (iArr[6] > 0) {
                        i4 = 1;
                    } else {
                        i4 = -1;
                    }
                    iArr[6] = i4 * F;
                }
                break;
            case 2:
                if (iArr[3] > 100) {
                    iArr[1] = 1;
                    iArr[6] = (iArr[6] > 0 ? 1 : -1) * G;
                } else {
                    iArr[3] = iArr[3] + i3;
                }
                break;
        }
    }

    private static void c(int[] iArr, int i2, int i3) {
        switch (iArr[1]) {
            case 16:
                if (iArr[16] == -1) {
                    iArr[4] = iArr[4] + ((iArr[6] * i3) >> 10);
                    iArr[5] = iArr[5] + ((iArr[7] * i3) >> 10);
                    iArr[6] = iArr[6] + iArr[10];
                    iArr[10] = 0;
                } else {
                    int i4 = iArr[23];
                    int iM82e = m82e(i4);
                    int iS = s(i4);
                    int iM89g = 0;
                    if (i4 != 4096 && iM82e > 4) {
                        iM89g = m89g(f321c[iS]);
                    }
                    if (i4 == 4096) {
                        a(i2, 12, -1, -1, false);
                    } else {
                        a(i2, 14, iM82e, iS, false);
                        if (iM89g != 2 && iM89g != 0) {
                            T = 0;
                        }
                    }
                    if (i4 == 4096) {
                        iArr[6] = (((R * Q) * iArr[19]) >> 3) / e;
                        iArr[7] = (((R * Q) * iArr[20]) >> 3) / e;
                        iArr[9] = (iArr[17] + iArr[21]) - f297a[0][9];
                    } else if ((f297a[0][2] & 1024) == 0 || iM82e < 5 || iM89g == 2 || iM89g == 7 || iM89g == 8 || iM89g == 9 || iM89g == 10 || iM89g == 11) {
                        int iB = b(iArr[6], iArr[7], iArr[19], iArr[20]);
                        int iB2 = b(iArr[6], iArr[7], -iArr[20], iArr[19]);
                        iArr[6] = (((-iB2) * iArr[20]) - (iB * iArr[19])) / e;
                        iArr[7] = ((iB2 * iArr[19]) - (iB * iArr[20])) / e;
                    }
                    iArr[4] = iArr[17] + iArr[21];
                    iArr[5] = iArr[18] + iArr[22];
                }
                break;
            case 17:
                if (f291f || f297a[0][1] == 2 || iArr[2] == 1) {
                    iArr[1] = 16;
                    a(i2, 12, -1, -1, true);
                }
                iArr[4] = f297a[0][4] + iArr[9];
                break;
            case 18:
                if (f291f) {
                    Q = 8;
                    iArr[1] = 16;
                    a(iArr, 1);
                    f291f = false;
                    a(i2, 12, -1, -1, true);
                }
                iArr[4] = f297a[0][4] + (2 * f);
                break;
        }
        iArr[2] = 0;
    }

    private static void b(int[] iArr, int i2) {
        if (iArr[1] != 0) {
            if (iArr[3] > 12000) {
                iArr[1] = 0;
                return;
            }
            iArr[4] = iArr[4] + ((iArr[6] * i2) >> 10);
            iArr[5] = iArr[5] + ((iArr[7] * i2) >> 10);
            iArr[3] = iArr[3] + i2;
        }
    }

    private static boolean a(boolean z2, boolean z3, int i2) {
        boolean z4 = false;
        for (int i3 = 0; i3 < 1; i3++) {
            if (a(f298b[0], true, i2, z2, z3)) {
                z4 = true;
                break;
            }
        }
        return z4;
    }

    private static boolean a(int[] iArr, boolean z2, int i2, boolean z3, boolean z4) {
        return a(iArr, z2, i2, z4 ? -(F * 1) : ((aH * f) - 90) - 30, z3 ? f297a[1][5] : f297a[0][5], aW, 180);
    }

    private static boolean a(int[] iArr, boolean z2, int i2, int i3, int i4, int i5, int i6) {
        if (iArr == null) {
            return false;
        }
        int i7 = (iArr[4] - (z2 ? iArr[13] : 0)) + i2;
        int i8 = iArr[5] - (z2 ? iArr[13] : 0);
        return i3 <= iArr[14] + i7 && i3 + i5 >= i7 && i4 <= iArr[15] + i8 && i4 + i6 >= i8;
    }

    private static boolean a(int[] iArr, int[] iArr2, boolean z2, boolean z3) {
        if (iArr == null || iArr2 == null) {
            return false;
        }
        int i2 = iArr[4] - (z2 ? iArr[14] / 2 : 0);
        int i3 = iArr[5] - (z2 ? iArr[15] / 2 : 0);
        int i4 = iArr[14] + i2;
        int i5 = iArr[15] + i3;
        int i6 = iArr2[4] - (z3 ? iArr2[14] / 2 : 0);
        int i7 = iArr2[5] - (z3 ? iArr2[15] / 2 : 0);
        return i6 <= i4 && iArr2[14] + i6 >= i2 && i7 <= i5 && iArr2[15] + i7 >= i3;
    }

    private static boolean a(int[] iArr, int[] iArr2, int i2, boolean z2) {
        boolean z3 = false;
        int i3 = -1;
        int i4 = z2 ? iArr[16] : -1;
        int i5 = iArr[4] + ((iArr[6] * i2) >> 10);
        int i6 = iArr[5] + ((iArr[7] * i2) >> 10);
        for (int i7 = 0; i7 < 3; i7++) {
            f307n[i7][0] = -1;
        }
        if (iArr[6] != 0 || iArr[7] != 0) {
            int iH = H((iArr[6] * iArr[6]) + (iArr[7] * iArr[7]));
            int i8 = (iArr[13] * iArr[6]) / iH;
            int i9 = (iArr[13] * iArr[7]) / iH;
            if (iArr2 == null) {
                f308f[0] = -i9;
                f308f[1] = i8;
                f308f[2] = i8;
                f308f[3] = i9;
                f308f[4] = i9;
                f308f[5] = -i8;
            } else {
                f308f[0] = 0;
                f308f[1] = (-iArr[13]) / 2;
                f308f[2] = 0;
                f308f[3] = iArr[13] / 2;
                f308f[4] = ((iArr[6] > 0 ? 1 : -1) * iArr[13]) / 2;
                f308f[5] = 0;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                if ((iArr2 == null ? a(f307n[i10], iArr[4] + f308f[2 * i10], iArr[5] + f308f[(2 * i10) + 1], i5 + f308f[2 * i10], i6 + f308f[(2 * i10) + 1], true) : a(f307n[i10], iArr2, iArr[4] + f308f[2 * i10], iArr[5] + f308f[(2 * i10) + 1], i5 + f308f[2 * i10], i6 + f308f[(2 * i10) + 1])) && (i4 == -1 || i4 > f307n[i10][0])) {
                    i3 = i10;
                    i4 = f307n[i10][0];
                }
            }
        }
        if (i3 != -1 && (!z2 || iArr[16] < 0 || iArr[16] > f307n[i3][0])) {
            iArr[16] = f307n[i3][0];
            iArr[17] = f307n[i3][1] - f308f[2 * i3];
            iArr[18] = f307n[i3][2] - f308f[(2 * i3) + 1];
            iArr[19] = f307n[i3][3];
            iArr[20] = f307n[i3][4];
            iArr[21] = f307n[i3][5];
            iArr[22] = f307n[i3][6];
            iArr[23] = f307n[i3][7];
            z3 = true;
        }
        return z3;
    }

    private static boolean a(int[] iArr, int[] iArr2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        boolean z2 = false;
        int iMin = Math.min(i2, i4);
        int iMax = Math.max(i2, i4);
        int iMin2 = Math.min(i3, i5);
        int iMax2 = Math.max(i3, i5);
        int i8 = iArr2[4];
        int i9 = iArr2[5];
        int i10 = i8 + iArr2[14];
        int i11 = i9 + iArr2[15];
        if (iMin <= i10 && iMax >= i8 && iMin2 <= i11 && iMax2 >= i9) {
            if (i4 - i2 < 0) {
                i6 = -1;
            } else {
                i6 = i4 - i2 > 0 ? 1 : 0;
            }
            int i12 = i6;
            if (i5 - i3 < 0) {
                i7 = -1;
            } else {
                i7 = i5 - i3 > 0 ? 1 : 0;
            }
            int i13 = i7;
            int i14 = 0;
            if (i2 > i10 || i2 < i8 || i3 > i11 || i3 < i9) {
                if (i12 != 0) {
                    f309g[0] = i12 == 1 ? i8 : i10;
                    f309g[1] = (((i5 - i3) * (f309g[0] - i2)) / (i4 - i2)) + i3;
                }
                if (i13 != 0) {
                    f309g[3] = i13 == 1 ? i9 : i11;
                    f309g[2] = (((i4 - i2) * (f309g[3] - i3)) / (i5 - i3)) + i2;
                }
                if (f309g[0] >= i8 && f309g[0] <= i10 && f309g[1] >= i9 && f309g[1] <= i11) {
                    i13 = 0;
                    i14 = 0;
                    z2 = true;
                } else if (f309g[2] >= i8 && f309g[2] <= i10 && f309g[3] >= i9 && f309g[3] <= i11) {
                    i12 = 0;
                    i14 = 2;
                    z2 = true;
                }
            } else {
                if (iArr2[6] > 0) {
                    int i15 = (i10 - i2) + 10;
                    if (i10 < (aH * f) - 180) {
                        i2 += i15;
                    } else {
                        iArr2[4] = iArr2[4] - i15;
                    }
                } else {
                    int i16 = (i2 + 10) - i8;
                    if (i8 > 180) {
                        i2 -= i16;
                    } else {
                        iArr2[4] = iArr2[4] + i16;
                    }
                }
                f297a[0][3] = 0;
                f297a[0][1] = 2;
                i12 = 0;
                i13 = 1;
                i14 = 0;
                f309g[0] = i2;
                f309g[1] = i3;
                z2 = true;
            }
            if (z2) {
                boolean z3 = true;
                if (iArr2[0] == 4096) {
                    i13 = iArr2 == f297a[0] ? 1 : -1;
                    int i17 = (((-100) * (f309g[i14] - i8)) / iArr2[14]) + 114;
                    int iM101m = (m101m(i17 == 64 ? 63 : i17) * e) >> 16;
                    int iM100l = ((m100l(i17 == 64 ? 63 : i17) * e) * i13) >> 16;
                    int i18 = f309g[i14] - i2;
                    int i19 = f309g[i14 + 1] - i3;
                    a(iArr, (i18 * i18) + (i19 * i19), f309g[i14], f309g[i14 + 1], iM101m, -iM100l, -i12, -i13);
                    iArr[7] = n(0, iArr2[0]);
                    z3 = false;
                }
                if (z3) {
                    int i20 = f309g[i14] - i2;
                    int i21 = f309g[i14 + 1] - i3;
                    a(iArr, (i20 * i20) + (i21 * i21), f309g[i14], f309g[i14 + 1], (-i12) * e, (-i13) * e, -i12, -i13);
                    iArr[7] = n(0, iArr2[0]);
                }
            }
        }
        return z2;
    }

    private static int n(int i2) {
        int i3 = 1;
        switch (i2) {
            case 4:
                i3 = 3;
                break;
            case 5:
                i3 = 3;
                break;
            case 6:
                i3 = at;
                break;
            case 7:
            case 8:
                i3 = 1;
                break;
            case 11:
                i3 = 1;
                break;
            case 12:
                i3 = 1;
                break;
        }
        return i3;
    }

    private static void u() {
        ap = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            f311e[i2][0] = 0;
            f311e[i2][1] = 0;
            f311e[i2][2] = 0;
            f311e[i2][3] = 0;
        }
        for (int i3 = 0; i3 < 3; i3++) {
            f312f[i3][0] = 0;
            f312f[i3][1] = 0;
            f312f[i3][2] = 0;
            f312f[i3][3] = 0;
            f312f[i3][4] = 0;
        }
        ar = 0;
        as = 3;
        for (int i4 = 0; i4 < 1; i4++) {
            f315i[0][0] = 0;
            f315i[0][1] = 0;
            f315i[0][2] = 0;
            f315i[0][3] = 0;
            f315i[0][4] = 0;
            f315i[0][5] = 0;
        }
        ax = 0;
        for (int i5 = 0; i5 < 1; i5++) {
            f316j[0][0] = 0;
            f316j[0][1] = 0;
            f316j[0][2] = 0;
            f316j[0][3] = 0;
            f316j[0][4] = 0;
            f316j[0][5] = 0;
            az = 0;
        }
        aA = 0;
        f317l = false;
        f318m = false;
        aC = 0;
        aF = 0;
        aE = 1;
    }

    private static void b(int i2, boolean z2) {
        switch (i2) {
            case 3:
                f317l = true;
                break;
            case 4:
                ap = 3000;
                if (!z2) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        f311e[i3][0] = 0;
                        f311e[i3][1] = 0;
                        f311e[i3][2] = 0;
                        f311e[i3][3] = 0;
                    }
                }
                break;
            case 5:
                ar = 0;
                as = 3;
                for (int i4 = 0; i4 < 3; i4++) {
                    int i5 = (f312f[i4][0] >> 31) & 1;
                    if (!z2 || i5 == 0) {
                        ar++;
                        as--;
                        f312f[i4][0] = 0;
                        f312f[i4][1] = 0;
                        f312f[i4][2] = 0;
                        f312f[i4][3] = 0;
                        f312f[i4][4] = 0;
                    } else if (i5 == 1) {
                        as--;
                    }
                }
                break;
            case 6:
                if (at < 1) {
                    int[][] iArr = f313g;
                    int i6 = at;
                    at = i6 + 1;
                    iArr[i6][0] = 0;
                }
                break;
            case 7:
                for (int i7 = 0; i7 < 1; i7++) {
                    f314h[0][0] = 0;
                }
                av = 0;
                au = 0;
                break;
            case 8:
                for (int i8 = 0; i8 < 1; i8++) {
                    f314h[0][0] = 0;
                    int[] iArr2 = f314h[0];
                    iArr2[0] = iArr2[0] | Integer.MIN_VALUE;
                    int[] iArr3 = f314h[0];
                    iArr3[0] = iArr3[0] | 16777216;
                    int[] iArr4 = f314h[0];
                    iArr4[0] = iArr4[0] | 196608;
                }
                av = 0;
                au = 0;
                break;
            case 9:
                aA = 10000;
                break;
            case 10:
                aB = 5000;
                break;
            case 11:
                if (!z2) {
                    for (int i9 = 0; i9 < 1; i9++) {
                        f316j[0][0] = Integer.MIN_VALUE;
                        int[] iArr5 = f316j[0];
                        iArr5[0] = iArr5[0] | 0;
                        f316j[0][1] = 0;
                        f316j[0][2] = 0;
                        f316j[0][3] = 0;
                        f316j[0][4] = 0;
                        f316j[0][5] = 3000;
                        az = 1;
                    }
                }
                break;
            case 12:
                if (!z2) {
                    for (int i10 = 0; i10 < 1; i10++) {
                        f315i[0][0] = Integer.MIN_VALUE;
                        int[] iArr6 = f315i[0];
                        iArr6[0] = iArr6[0] | 0;
                        f315i[0][1] = f298b[0][4];
                        f315i[0][2] = f298b[0][5];
                        f315i[0][3] = 0;
                        f315i[0][4] = 0;
                        f315i[0][5] = 0;
                    }
                    ax = 2000;
                }
                break;
            case 14:
                aC = 6000;
                break;
            case 15:
                aE = 2;
                aD = 10000;
                break;
            case 16:
                aE = 4;
                aD = 10000;
                break;
            case 17:
                aF = 10000;
                break;
            case 18:
                aF = 10000;
                break;
            case 19:
                U++;
                v++;
                m103o(7);
                break;
            case 20:
                aG = 10000;
                break;
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static final boolean m73c(int i2) {
        boolean z2 = false;
        switch (i2) {
            case 4:
                if (ap == 3000) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        int[] iArr = f311e[i3];
                        iArr[0] = iArr[0] & Integer.MAX_VALUE;
                        z2 = true;
                    }
                }
                break;
            case 7:
            case 8:
                for (int i4 = 0; i4 < 1; i4++) {
                    int[] iArr2 = f314h[0];
                    iArr2[0] = iArr2[0] & Integer.MAX_VALUE;
                    a(61, i2, 0);
                }
            case 10:
                aB = 0;
                a(61, i2, 0);
                z2 = true;
                break;
            case 11:
                for (int i5 = 0; i5 < 1; i5++) {
                    if (((f316j[0][0] >> 16) & 255) == 0) {
                        int[] iArr3 = f316j[0];
                        iArr3[0] = iArr3[0] & Integer.MAX_VALUE;
                        z2 = true;
                    }
                }
                break;
            case 12:
                for (int i6 = 0; i6 < 1; i6++) {
                    if (((f315i[0][0] >> 16) & 255) == 0) {
                        f315i[0][0] = 0;
                        a(61, i2, 0);
                    }
                }
                break;
        }
        if (!z2) {
            am |= 1 << i2;
        }
        return z2;
    }

    private static int a(int i2, int i3, boolean z2, boolean z3, boolean z4) {
        int i4 = 0;
        switch (i2) {
            case 0:
            case 1:
                Q = 8;
                for (int i5 = 0; i5 < 1; i5++) {
                    f298b[0][6] = (Q * f298b[0][6]) >> 3;
                    f298b[0][7] = (Q * f298b[0][7]) >> 3;
                }
                break;
            case 3:
                f317l = false;
                break;
            case 4:
                if (((f311e[i3][0] >> 31) & 1) != 0) {
                    ap = 0;
                }
                break;
            case 5:
                if (((f312f[i3][0] >> 31) & 1) == 1) {
                    f312f[i3][0] = (((f312f[i3][0] & (-16711681)) | 65536) & (-65536)) | 65535;
                    i4 = 66;
                }
                break;
            case 7:
            case 8:
                if (z3) {
                    f314h[i3][0] = (f314h[i3][0] & (-2130706433)) | 50331648;
                }
                break;
            case 10:
                if (z3 && z4) {
                    aB = 0;
                }
                break;
            case 14:
                aC = 0;
                break;
            case 17:
                aF = 0;
                break;
            case 18:
                aF = 0;
                break;
        }
        if (z2) {
            switch (i2) {
                case 4:
                    ap = 0;
                    break;
                case 5:
                    int i6 = f312f[i3][0];
                    int i7 = (i6 >> 31) & 1;
                    int i8 = (i6 >> 16) & 255;
                    if (i7 == 0 && i8 == 0) {
                        ar--;
                        as++;
                    }
                    break;
                case 6:
                    f313g[i3][0] = (f313g[i3][0] & (-16711681)) | 0;
                    at = 0;
                    break;
                case 7:
                case 8:
                    f314h[i3][0] = (f314h[i3][0] & (-2130706433)) | 50331648;
                    break;
                case 9:
                    aA = 0;
                    break;
                case 10:
                    aB = 0;
                    break;
                case 11:
                    if (((f316j[i3][0] >> 16) & 255) == 0) {
                        f316j[i3][0] = (f316j[i3][0] & (-16711681)) | 131072;
                    }
                    break;
                case 12:
                    if (((f315i[i3][0] >> 16) & 255) == 0) {
                        int[] iArr = f315i[i3];
                        iArr[0] = iArr[0] & Integer.MAX_VALUE;
                        f315i[i3][0] = (f315i[i3][0] & (-16711681)) | 196608;
                    }
                    break;
                case 20:
                    aG = 0;
                    break;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m74a(int i2, int i3) {
        boolean z2 = true;
        switch (i2) {
            case 4:
                if (f310k) {
                    int[] iArr = f311e[i3];
                    iArr[0] = iArr[0] | Integer.MIN_VALUE;
                }
                break;
            case 5:
                if (f310k && ar > 0 && ((f312f[i3][0] >> 31) & 1) == 0) {
                    f312f[i3][0] = Integer.MIN_VALUE;
                    int[] iArr2 = f312f[i3];
                    iArr2[0] = iArr2[0] | 0;
                    f312f[i3][1] = f297a[0][4] + (f297a[0][14] / 2);
                    f312f[i3][3] = f297a[0][5] - g;
                    f312f[i3][2] = f312f[i3][1];
                    f312f[i3][4] = 0;
                    ar--;
                    z2 = false;
                }
                break;
            case 6:
                if (f310k) {
                    f313g[at - 1][0] = (((f313g[at - 1][0] & (-16711681)) | 65536) & (-65536)) | 300;
                    z2 = false;
                }
                break;
            case 7:
                av = 1;
                au = 1;
                break;
            case 8:
                au = 1;
                av = 0;
                break;
            case 11:
                if (f310k && ((f316j[i3][0] >> 16) & 255) == 0) {
                    int[] iArr3 = f316j[i3];
                    iArr3[0] = iArr3[0] | Integer.MIN_VALUE;
                    int[] iArr4 = f316j[i3];
                    iArr4[0] = iArr4[0] | 65536;
                    f316j[i3][1] = f297a[0][4] + (f297a[0][14] / 2);
                    f316j[i3][2] = f297a[0][5] - g;
                    f316j[i3][3] = f316j[i3][2];
                    f316j[i3][4] = ay;
                    z2 = false;
                }
                break;
            case 12:
                if (f310k && ((f315i[i3][0] >> 16) & 255) == 0) {
                    f315i[i3][0] = (f315i[i3][0] & (-16711681)) | 65536;
                    f315i[i3][3] = f298b[i3][4];
                    f315i[i3][4] = f298b[i3][5];
                }
                break;
            case 17:
                int i4 = (900 - f297a[0][14]) / 2;
                int[] iArr5 = f297a[0];
                iArr5[4] = iArr5[4] - i4;
                f297a[0][14] = 900;
                int[] iArr6 = f297a[1];
                iArr6[4] = iArr6[4] - i4;
                f297a[1][14] = 900;
                f298b[0][2] = 1;
                break;
            case 18:
                int i5 = (420 - f297a[0][14]) / 2;
                int[] iArr7 = f297a[0];
                iArr7[4] = iArr7[4] - i5;
                f297a[0][14] = 420;
                int[] iArr8 = f297a[1];
                iArr8[4] = iArr8[4] - i5;
                f297a[1][14] = 420;
                f298b[0][2] = 1;
                break;
        }
        return z2;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static boolean m75b(int i2, int i3) {
        switch (i2) {
            case 6:
                f313g[i3][0] = (f313g[i3][0] & (-16711681)) | 0;
                break;
        }
        return false;
    }

    private static boolean a(int i2, int[] iArr) {
        boolean z2 = false;
        int iS = s(iArr[7]);
        int i3 = f311e[i2][0];
        if (iS != ((i3 >> 0) & 65535)) {
            i3 = (((((i3 & (-1073741825)) | 1073741824) & (-1056964609)) | 16777216) & (-65536)) | ((iS & 65535) << 0);
        } else if (((i3 >> 20) & 15) == 0) {
            i3 = (((i3 & (-1056964609)) | 0) & (-65536)) | 65535;
            z2 = true;
        }
        f311e[i2][0] = i3;
        f311e[i2][3] = iArr[2];
        return z2;
    }

    private static void a(int i2, int i3, int i4, int i5, boolean z2) {
        int i6 = f297a[0][2];
        if ((i6 & 128) != 0 || (i6 & 256) != 0) {
            int iM89g = i5 == -1 ? 0 : m89g(f321c[i5]);
            int i7 = iM89g;
            if (iM89g != 1 && i7 != 6 && i7 != 2) {
                int i8 = f314h[i2][0];
                int i9 = i8;
                boolean z3 = ((i8 >> 31) & 1) != 0;
                boolean z4 = z3;
                if (!z3 && av > 0) {
                    i9 = i9 | Integer.MIN_VALUE | 0 | ((((i6 & 128) != 0 ? 1 : 3) & 127) << 16);
                    av--;
                    z4 = true;
                }
                if (z4) {
                    int i10 = (i9 >> 24) & 127;
                    int i11 = i10;
                    if (i10 == 0 && i3 == 12) {
                        i11 = 1;
                    } else if (i11 == 1 && i3 == 14 && i4 > 4) {
                        i9 = (i9 & (-65536)) | ((i5 & 65535) << 0);
                        i11 = 2;
                    }
                    i9 = (i9 & (-2130706433)) | ((i11 & 127) << 24);
                }
                f314h[i2][0] = i9;
            }
        }
        if ((i6 & 8) == 0 || i3 != 12 || z2) {
            return;
        }
        f298b[i2][1] = 17;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x021c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0378  */
    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static boolean m76c(int i2, int i3) {
        int iMax;
        int iMin;
        int[] iArr;
        char c2;
        int i4;
        int i5;
        boolean z2 = false;
        switch (i2) {
            case 4:
                int i6 = f311e[i3][0];
                int i7 = i6;
                if (((i6 >> 31) & 1) == 1) {
                    int i8 = i3 / 3;
                    f311e[i3][1] = f297a[i8][4] + (f297a[i8][14] / 4) + ((i3 * f297a[i8][14]) / 4);
                    f311e[i3][2] = f297a[i8][5] + (i8 == 0 ? -1 : f297a[i8][15] + 1);
                    if (aO == 1) {
                        iArr = f311e[i3];
                        c2 = 3;
                        i4 = f319k[aM][4];
                        i5 = 1;
                    } else {
                        iArr = f311e[i3];
                        c2 = 3;
                        i4 = f319k[aM][4];
                        i5 = i8 == 0 ? (g * 1) + f297a[i8][15] + 1 : ((aI - 1) * g) - 1;
                    }
                    iArr[c2] = i4 + i5;
                    boolean zA = a(f307n[0], f311e[i3][1], f311e[i3][2], f311e[i3][1], f311e[i3][3], false);
                    z2 = zA;
                    if (!zA && ((i7 >> 24) & 63) == 1) {
                        i7 = (i7 & (-1056964609)) | 33554432;
                    }
                }
                f311e[i3][0] = i7;
                break;
            case 5:
                if (((f312f[i3][0] >> 31) & 1) == 1 && ((f312f[i3][0] >> 16) & 255) != 2) {
                    int i9 = f312f[i3][1];
                    int i10 = f312f[i3][2];
                    int i11 = f;
                    int i12 = i10 > i9 ? 1 : -1;
                    int i13 = i9;
                    do {
                        int iM80a = m80a(i13 / f, (f312f[i3][3] - f319k[aM][4]) / g);
                        int iM82e = m82e(iM80a);
                        if (iM82e > 2) {
                            f312f[i3][0] = (((f312f[i3][0] & (-16711681)) | 65536) & (-65536)) | (((iM82e < 5 ? -1 : s(iM80a)) & 65535) << 0);
                            z2 = true;
                        } else {
                            int i14 = i13 + (i12 * i11);
                            iMin = i12 == 1 ? Math.min(i14, i10) : Math.max(i14, i10);
                            i13 = iMin;
                        }
                        if (z2) {
                            f312f[i3][2] = i13;
                        }
                        break;
                    } while (iMin != i10);
                    if (z2) {
                        f312f[i3][2] = i13;
                    }
                }
                break;
            case 7:
            case 8:
                int i15 = f314h[i3][0];
                if (((i15 >> 31) & 1) != 0 && ((i15 >> 24) & 127) == 2) {
                    int i16 = ((i15 >> 16) & 127) - 1;
                    f314h[i3][0] = i16 == 0 ? (i15 & (-2130706433)) | 50331648 : (((i15 & (-2130706433)) | 16777216) & (-8323073)) | ((i16 & 127) << 16);
                    z2 = true;
                }
                break;
            case 11:
                int i17 = f316j[i3][0];
                if (((i17 >> 31) & 1) != 0) {
                    int i18 = (i17 >> 16) & 255;
                    if (i18 == 0) {
                        f316j[i3][1] = f297a[0][4] + (f297a[0][14] / 2);
                        f316j[i3][2] = f297a[0][5] - 1;
                        f316j[i3][3] = f319k[aM][4] + (g * 1) + f297a[0][15] + 1;
                        if (a(f307n[0], f316j[i3][1], f316j[i3][2], f316j[i3][1], f316j[i3][3], false)) {
                            f316j[i3][3] = f307n[0][2];
                        }
                    } else if (i18 == 1) {
                        int i19 = f316j[i3][2];
                        int i20 = f316j[i3][3];
                        int i21 = -f;
                        int i22 = i19;
                        do {
                            int iM80a2 = m80a(f316j[i3][1] / f, (i22 - f319k[aM][4]) / g);
                            int iM82e2 = m82e(iM80a2);
                            if (iM82e2 == 0 || iM82e2 <= 4) {
                                iMax = Math.max(i22 + i21, i20);
                                i22 = iMax;
                            } else {
                                f316j[i3][0] = (((i17 & (-16711681)) | (2 << 16)) & (-65536)) | (((iM82e2 < 5 ? -1 : s(iM80a2)) & 65535) << 0);
                                z2 = true;
                            }
                            if (z2) {
                                f316j[i3][3] = i22;
                            }
                            break;
                        } while (iMax != i20);
                        if (z2) {
                            f316j[i3][3] = i22;
                        }
                    }
                }
                break;
            case 12:
                int i23 = f315i[i3][0];
                int i24 = (i23 >> 16) & 255;
                int i25 = i24;
                if (i24 == 2) {
                    i25 = 3;
                    z2 = true;
                }
                f315i[i3][0] = (i23 & (-16711681)) | ((i25 & 255) << 16);
                break;
        }
        return z2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static int m77a(int i2, int i3, int i4) {
        int iR = 0;
        switch (i2) {
            case 3:
                if (!f317l) {
                    int[] iArr = f297a[0];
                    iArr[2] = iArr[2] ^ 8;
                }
                break;
            case 4:
                iR = g(i3, i4);
                break;
            case 5:
                iR = h(i3, i4);
                break;
            case 6:
                iR = k(i3, i4);
                break;
            case 7:
            case 8:
                iR = l(i2, i3);
                break;
            case 9:
                iR = p(i4);
                break;
            case 10:
                iR = o(i4);
                break;
            case 11:
                iR = i(i3, i4);
                break;
            case 12:
                iR = j(i3, i4);
                break;
            case 14:
                iR = q(i4);
                break;
            case 15:
            case 16:
                iR = m(i2, i4);
                break;
            case 17:
                if (aF == 0) {
                    int[] iArr2 = f297a[0];
                    iArr2[4] = iArr2[4] + 120;
                    f297a[0][14] = 660;
                    int[] iArr3 = f297a[1];
                    iArr3[4] = iArr3[4] + 120;
                    f297a[1][14] = 660;
                    int[] iArr4 = f297a[0];
                    iArr4[2] = iArr4[2] ^ 131072;
                }
                break;
            case 18:
                if (aF == 0) {
                    int[] iArr5 = f297a[0];
                    iArr5[4] = iArr5[4] - 120;
                    f297a[0][14] = 660;
                    int[] iArr6 = f297a[1];
                    iArr6[4] = iArr6[4] - 120;
                    f297a[1][14] = 660;
                    int[] iArr7 = f297a[0];
                    iArr7[2] = iArr7[2] ^ 262144;
                }
                break;
            case 20:
                iR = r(i4);
                break;
        }
        return iR;
    }

    private static int g(int i2, int i3) {
        int i4;
        int i5 = 0;
        int i6 = f311e[i2][0];
        int i7 = i6;
        if (((i6 >> 31) & 1) != 0) {
            int i8 = (i7 >> 24) & 63;
            if (i8 == 1) {
                if (((i7 >> 30) & 1) != 0) {
                    i7 = (i7 & (-15728641)) | (((m89g(f321c[(i7 >> 0) & 65535]) == 2 ? 4 : 1) & 15) << 20);
                    i5 = 63;
                } else if (f286a && (i4 = ((i7 >> 20) & 15) - 1) >= 0) {
                    i7 = (i7 & (-15728641)) | ((i4 & 15) << 20);
                }
                i7 &= -1073741825;
            } else if (i8 == 2) {
                i7 = (i7 & (-1056964609)) | 0;
                i5 = 62;
            }
            if (i2 == 0) {
                ap -= i3;
            }
        }
        if (ap <= 0) {
            if (i2 == 2) {
                int[] iArr = f297a[0];
                iArr[2] = iArr[2] ^ 16;
            }
            i7 &= Integer.MAX_VALUE;
        }
        f311e[i2][0] = i7;
        return i5;
    }

    private static int h(int i2, int i3) {
        int i4 = 0;
        int i5 = f312f[i2][0];
        int i6 = i5;
        if (((i5 >> 31) & 1) == 1) {
            int i7 = (i6 >> 16) & 255;
            if (i7 == 1) {
                i6 = (i6 & Integer.MAX_VALUE & (-16711681)) | 131072;
                i4 = 63;
                as++;
            } else if (i7 == 0) {
                f312f[i2][1] = f312f[i2][2];
                int[] iArr = f312f[i2];
                iArr[2] = iArr[2] + ((f312f[i2][4] * i3) >> 10);
                int[] iArr2 = f312f[i2];
                iArr2[3] = iArr2[3] + ((aq * i3) >> 10);
                int i8 = (f312f[i2][1] - (f297a[0][4] + (f297a[0][14] / 2))) / f;
                int[] iArr3 = f312f[i2];
                iArr3[4] = iArr3[4] + ((i8 > 0 ? -1 : 1) * ((((256 * i8) * i8) * i3) >> 10));
            }
        }
        if (as == 3) {
            int[] iArr4 = f297a[0];
            iArr4[2] = iArr4[2] ^ 32;
        }
        f312f[i2][0] = i6;
        return i4;
    }

    private static int i(int i2, int i3) {
        int i4 = f316j[i2][0];
        if (((i4 >> 31) & 1) == 1) {
            int i5 = (i4 >> 16) & 255;
            int i6 = i5;
            if (i5 == 1) {
                f316j[i2][2] = f316j[i2][3];
                int[] iArr = f316j[i2];
                iArr[3] = iArr[3] + ((f316j[i2][4] * i3) >> 10);
                int[] iArr2 = f316j[i2];
                iArr2[4] = iArr2[4] + (((-5000) * i3) >> 10);
                int[] iArr3 = f316j[i2];
                iArr3[5] = iArr3[5] - i3;
                if (f316j[i2][5] < 0) {
                    i6 = 3;
                    az--;
                }
            } else if (i6 == 2) {
                i6 = 3;
                az--;
            }
            f316j[i2][0] = (i4 & (-16711681)) | ((i6 & 255) << 16);
        }
        if (az != 0) {
            return 0;
        }
        int[] iArr4 = f297a[0];
        iArr4[2] = iArr4[2] ^ 2048;
        return 0;
    }

    private static int j(int i2, int i3) {
        int i4 = f315i[i2][0];
        int i5 = i4;
        int i6 = (i4 >> 16) & 255;
        int i7 = i6;
        if (i6 == 0) {
            f315i[i2][1] = f298b[i2][4];
            f315i[i2][2] = f298b[i2][5];
            int[] iArr = f315i[i2];
            iArr[5] = iArr[5] + ((384 * i3) >> 10);
            int[] iArr2 = f315i[i2];
            iArr2[1] = iArr2[1] + ((aw * m101m(f315i[i2][5] % 256)) >> 16);
            int[] iArr3 = f315i[i2];
            iArr3[2] = iArr3[2] + ((aw * m100l(f315i[i2][5] % 256)) >> 16);
        } else if (i7 == 1) {
            int[] iArr4 = f315i[i2];
            iArr4[5] = iArr4[5] + ((384 * i3) >> 10);
            f315i[i2][1] = f315i[i2][3] + ((aw * m101m(f315i[i2][5] % 256)) >> 16);
            f315i[i2][2] = f315i[i2][4] + ((aw * m100l(f315i[i2][5] % 256)) >> 16);
            if (i2 == 0) {
                ax -= i3;
            }
            if (ax < 0) {
                i7 = 2;
            }
        } else if (i7 == 3) {
            i5 &= Integer.MAX_VALUE;
            int[] iArr5 = f297a[0];
            iArr5[2] = iArr5[2] ^ 4096;
        }
        f315i[i2][0] = (i5 & (-16711681)) | ((i7 & 255) << 16);
        return 0;
    }

    private static int k(int i2, int i3) {
        int i4 = 0;
        int i5 = f313g[i2][0];
        int i6 = i5;
        if (((i5 >> 16) & 255) == 1 && aN == 0) {
            int i7 = ((i6 >> 0) & 65535) - i3;
            if (i7 >= 0) {
                i6 = (i6 & (-65536)) | ((i7 & 65535) << 0);
            } else {
                i6 = (i6 & (-16711681)) | 0;
                i4 = 64;
                at--;
            }
        }
        if (at == 0) {
            int[] iArr = f297a[0];
            iArr[2] = iArr[2] ^ 64;
        }
        f313g[i2][0] = i6;
        return i4;
    }

    private static int l(int i2, int i3) {
        int i4 = f314h[i3][0];
        int i5 = i4;
        int i6 = (i4 >> 24) & 127;
        if (((i5 >> 31) & 1) != 0 && i6 == 3) {
            i5 &= Integer.MAX_VALUE;
            int i7 = au - 1;
            au = i7;
            if (i7 <= 0) {
                if (i2 == 7) {
                    int[] iArr = f297a[0];
                    iArr[2] = iArr[2] ^ 128;
                } else {
                    int[] iArr2 = f297a[0];
                    iArr2[2] = iArr2[2] ^ 256;
                }
                av = 0;
            }
        }
        f314h[i3][0] = i5;
        return 0;
    }

    private static int o(int i2) {
        aB = Math.max(0, aB - i2);
        if (aB != 0) {
            return 0;
        }
        int[] iArr = f297a[0];
        iArr[2] = iArr[2] ^ 1024;
        return 0;
    }

    private static int p(int i2) {
        aA = Math.max(0, aA - i2);
        if (aA == 0) {
            int[] iArr = f297a[0];
            iArr[2] = iArr[2] ^ 512;
            return 0;
        }
        int i3 = f297a[0][4] + (f297a[0][14] / 2);
        for (int i4 = 0; i4 < 1; i4++) {
            int i5 = f298b[0][4] - i3;
            f298b[0][10] = ((i5 > 0 ? -1 : 1) * (((((32 * i5) * i5) / f) * i2) >> 10)) / f;
        }
        return 0;
    }

    private static int q(int i2) {
        f318m = aC / 300 != (aC - i2) / 300;
        aC = Math.max(0, aC - i2);
        if (aC != 0) {
            return 0;
        }
        f318m = false;
        int[] iArr = f297a[0];
        iArr[2] = iArr[2] ^ 16384;
        return 0;
    }

    private static int m(int i2, int i3) {
        aD = Math.max(0, aD - i3);
        if (aD != 0) {
            return 0;
        }
        aE = 1;
        int[] iArr = f297a[0];
        iArr[2] = iArr[2] ^ (1 << i2);
        return 0;
    }

    private static int r(int i2) {
        aG = Math.max(0, aG - i2);
        if (aG != 0) {
            return 0;
        }
        int[] iArr = f297a[0];
        iArr[2] = iArr[2] ^ 1048576;
        return 0;
    }

    private static void v() {
        f320l = new int[aH][aI];
    }

    private static void l(int i2) {
        int i3 = 0;
        switch (DCWall.f19h) {
            case 1:
                i3 = 50;
                break;
            case 2:
                i3 = 50;
                break;
            case 3:
                i3 = 50;
                break;
            case 4:
                i3 = 50;
                break;
        }
        f301q = (I == 3 || I == 2) ? false : true;
        int i4 = f301q ? i2 - 1 : i2;
        int iA = 0;
        if (f301q) {
            iA = Math.abs(a.nextInt()) % 100 < i3 ? y(i4) : z(i4);
        }
        int iM61a = j.m61a();
        int iAbs = (I == 2 || I == 3) ? -1 : Math.abs(a.nextInt()) % i4;
        int i5 = 0;
        while (i5 < i4) {
            iA += j.a(i5, iA, iM61a, i5 == iAbs);
            i5++;
        }
        if (j.f272j == 5) {
            j.f272j = 0;
        }
        int i6 = 0;
        switch (DCWall.f19h) {
            case 2:
                i6 = 15;
                break;
            case 3:
                i6 = 30;
                break;
            case 4:
                i6 = 45;
                break;
        }
        a(d.a(65538), i6 + (Math.abs(a.nextInt()) % 15), i2 - 0, iA, true);
        aK = i2;
    }

    private static void m(int i2) {
        aM = i2;
        aL = f319k[aM][2];
        aO = 1;
        aP = (DCWall.f14c == 2 && DCWall.f18g >= 60) ? 1 : f319k[aM][0];
        int i3 = aT;
        if (!f302i && (aP == 3 || aP == 1 || aP == 2)) {
            i3 = 65545;
        }
        if (w != i3) {
            w = i3;
            d.m31a(i3, -1);
        }
        w();
        m78c(aM);
    }

    private static void w() {
        boolean z2 = false;
        int i2 = f319k[aM][7];
        int i3 = f319k[aM][1];
        f322n = false;
        aQ = -1;
        f323o = false;
        aR = -1;
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            int iS = s(t(f321c[i4], 0), 0);
            if (DCWall.f14c != 2) {
                if (m89g(iS) == 1) {
                    if (!m87a(iS)) {
                        int[] iArr = f319k[aM];
                        iArr[2] = iArr[2] + 1;
                        aL++;
                        iS = D(iS);
                        z2 = true;
                    }
                    f322n = true;
                    aQ = i4;
                } else if (m89g(iS) == 6 && m87a(iS)) {
                    f323o = true;
                    aR = i4;
                }
            }
            f321c[i4] = iS;
        }
        if (DCWall.f14c != 2 && aL == 1 && f322n && z2) {
            f321c[aQ] = C(f321c[aQ]);
            f322n = false;
            aQ = -1;
            r();
            aO = 2;
            f319k[aM][2] = 0;
            aL = 0;
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static void m78c(int i2) {
        for (int i3 = 0; i3 < aI; i3++) {
            for (int i4 = 0; i4 < aH; i4++) {
                f320l[i4][i3] = 0;
            }
        }
        int i5 = f319k[i2][7];
        int i6 = f319k[i2][1];
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            int iM92j = m92j(f321c[i7]);
            int iM93k = m93k(f321c[i7]);
            if (m87a(f321c[i7])) {
                switch (m88f(f321c[i7])) {
                    case 1:
                        f320l[iM92j][iM93k] = n(i7, 5);
                        break;
                    case 2:
                        f320l[iM92j + 1][iM93k] = n(i7, 7);
                        f320l[iM92j][iM93k] = n(i7, 6);
                        break;
                    case 3:
                        f320l[iM92j + 1][iM93k + 1] = n(i7, 11);
                        f320l[iM92j][iM93k + 1] = n(i7, 10);
                        f320l[iM92j + 1][iM93k] = n(i7, 9);
                        f320l[iM92j][iM93k] = n(i7, 8);
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    private static boolean m79d(int i2, int i3) {
        int i4 = f319k[aM][3];
        int i5 = (255 & (i4 >> 24)) * f;
        int i6 = ((255 & (i4 >> 16)) * g) + f319k[aM][4];
        return (i2 >= i5 && i2 <= i5 + ((255 & (i4 >> 8)) * f) && i3 >= i6 && i3 <= i6 + ((255 & i4) * g)) || i2 <= 0 || i2 >= aH * f || i3 - f319k[aM][4] <= 0 || i3 - f319k[aM][4] >= aI * g;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m80a(int i2, int i3) {
        int i4;
        if (i3 < 0) {
            i4 = 3;
        } else if (i3 >= aI) {
            i4 = 4;
        } else if (i2 < 0) {
            i4 = 1;
        } else {
            i4 = i2 >= aH ? 2 : f320l[i2][i3];
        }
        return i4;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static int m81a(int i2, boolean z2) {
        int i3 = 2;
        int i4 = f321c[i2];
        if (m87a(i4)) {
            if (aP == 1) {
                f321c[i2] = C(i4);
                bh++;
                i3 = 0;
            } else {
                int iM91i = m91i(i4);
                if ((iM91i == 0 && m89g(i4) != 2) || z2) {
                    if (aL > 0 && m89g(i4) != 2) {
                        int[] iArr = f319k[aM];
                        iArr[2] = iArr[2] - 1;
                        aL--;
                    }
                    int iM92j = m92j(i4);
                    int iM93k = m93k(i4);
                    switch (m88f(i4)) {
                        case 3:
                            f320l[iM92j + 1][iM93k + 1] = 0;
                            f320l[iM92j][iM93k + 1] = 0;
                        case 2:
                            f320l[iM92j + 1][iM93k] = 0;
                        case 1:
                            f320l[iM92j][iM93k] = 0;
                            break;
                    }
                    f321c[i2] = C(i4);
                    i3 = 0;
                } else if (iM91i != 0 && m89g(i4) != 2) {
                    f321c[i2] = m96d(i4, iM91i - 1);
                    i3 = 1;
                }
            }
        }
        return i3;
    }

    private static int s(int i2) {
        return (i2 >> 16) & 65535;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static int m82e(int i2) {
        return i2 & 65535;
    }

    private static int n(int i2, int i3) {
        return (i2 << 16) | i3;
    }

    /* JADX INFO: renamed from: n, reason: collision with other method in class */
    private static void m83n(int i2) {
        if (f286a) {
            int i3 = f319k[aM][7];
            int i4 = f319k[aM][1];
            for (int i5 = i3; i5 < i3 + i4; i5++) {
                int i6 = f321c[i5];
                if (m87a(i6)) {
                    int iB = B(i6);
                    int iMax = Math.max(A(i6) - 1, 0);
                    boolean z2 = iMax == 0;
                    int iS = s(i6, iMax);
                    switch (iB) {
                        case 1:
                            if (z2) {
                                iS = t(iS, 2);
                            }
                            break;
                        case 2:
                            iS = t(iS, 0);
                            break;
                        case 3:
                            if (z2) {
                                iS = s(t(iS, 4), 20);
                            }
                            break;
                        case 4:
                            if (z2) {
                                iS = t(iS, 0);
                            }
                            break;
                    }
                    if (iB != B(iS)) {
                        a(45, B(iS), i5);
                    }
                    f321c[i5] = iS;
                }
            }
        }
        switch (aP) {
            case 0:
            case 3:
                x();
                break;
            case 1:
                y();
                break;
            case 2:
                B();
                break;
        }
    }

    public static boolean a(int[] iArr, int i2, int i3, int i4, int i5, boolean z2) {
        int i6 = i2;
        int i7 = i3;
        int i8 = i2;
        int iM84a = i3;
        int iM84a2 = i2;
        int i9 = i3;
        int i10 = i4 - i2;
        int i11 = i5 - i3;
        int i12 = i10 >= 0 ? f : -f;
        int i13 = i11 >= 0 ? g : -g;
        boolean zM98a = false;
        boolean z3 = false;
        if (z2) {
            for (int i14 = 0; i14 < 1; i14++) {
                if (m79d(i2, i3) || m79d(i4, i5)) {
                    z3 = true;
                    break;
                }
            }
            if (!z3) {
                return false;
            }
        }
        if (i11 != 0) {
            iM84a = m84a(i3, g, i11 > 0);
            i8 = (((i4 - i2) * (iM84a - i3)) / (i5 - i3)) + i2;
        }
        if (i10 != 0) {
            iM84a2 = m84a(i2, f, i10 > 0);
            i9 = (((i5 - i3) * (iM84a2 - i2)) / (i4 - i2)) + i3;
        }
        do {
            if (i6 == i4 && i7 == i5) {
                return false;
            }
            int i15 = i6;
            int i16 = i7;
            boolean z4 = false;
            boolean z5 = false;
            if (i10 == 0 || (i11 != 0 && Math.abs(i2 - i8) <= Math.abs(i2 - iM84a2) && Math.abs(i3 - iM84a) <= Math.abs(i3 - i9))) {
                i6 = i8;
                i7 = iM84a;
                z4 = true;
            }
            if (i11 == 0 || (i10 != 0 && Math.abs(i2 - i8) >= Math.abs(i2 - iM84a2) && Math.abs(i3 - iM84a) >= Math.abs(i3 - i9))) {
                i6 = iM84a2;
                i7 = i9;
                z5 = true;
            }
            iM84a = z4 ? iM84a + i13 : iM84a;
            i8 = z4 ? (((i4 - i2) * (iM84a - i3)) / (i5 - i3)) + i2 : i8;
            iM84a2 = z5 ? iM84a2 + i12 : iM84a2;
            i9 = z5 ? (((i5 - i3) * (iM84a2 - i2)) / (i4 - i2)) + i3 : i9;
            if (Math.abs(i6 - i2) > Math.abs(i4 - i2) || Math.abs(i7 - i3) > Math.abs(i5 - i3)) {
                i6 = i4;
                i7 = i5;
            }
            int i17 = (z4 && z5) ? i16 : i7;
            while (true) {
                int i18 = i17;
                int iB = b(i6, f, i10 > 0);
                int iB2 = b(i18 - f319k[aM][4], g, i11 > 0);
                int i19 = iB * f;
                int i20 = (iB2 * g) + f319k[aM][4];
                int iM80a = m80a(iB, iB2);
                int iM82e = m82e(iM80a);
                if (iM82e != 0) {
                    zM98a = m98a(iArr, i19, i20, i15 - i19, i16 - i20, i6 - i19, i18 - i20, iM82e);
                }
                if (zM98a && iArr != null) {
                    int i21 = iArr[1] - i2;
                    int i22 = iArr[2] - i3;
                    iArr[0] = (i21 * i21) + (i22 * i22);
                    iArr[7] = iM80a;
                    break;
                }
                if (i18 == i7) {
                    break;
                }
                i17 = i7;
            }
        } while (!zM98a);
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static int m84a(int i2, int i3, boolean z2) {
        int i4 = i2 >= 0 ? 1 : -1;
        return ((i2 < 0 || z2) && (i2 >= 0 || !z2)) ? (((i2 - i4) / i3) + i4) * i3 : (i2 / i3) * i3;
    }

    private static int b(int i2, int i3, boolean z2) {
        if (i2 >= 0) {
            return z2 ? (i2 - 1) / i3 : i2 / i3;
        }
        return z2 ? (i2 / i3) - 1 : ((i2 + 1) / i3) - 1;
    }

    private static int c(int i2, int i3, boolean z2) {
        return z2 ? f * i3 : f319k[i2][4] + (g * i3);
    }

    private static void x() {
        if (!f318m || aL <= 3) {
            return;
        }
        int[] iArr = {0, 0, 0};
        int i2 = f319k[aM][7];
        int i3 = f319k[aM][1];
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            int i5 = f321c[i4];
            if (m87a(i5) && m89g(i5) != 2) {
                switch (m88f(i5)) {
                    case 1:
                        iArr[0] = iArr[0] + 1;
                        break;
                    case 2:
                        iArr[1] = iArr[1] + 1;
                        break;
                    case 3:
                        iArr[2] = iArr[2] + 1;
                        break;
                }
            }
        }
        int iAbs = Math.abs(a.nextInt()) % 3;
        int iAbs2 = ((iAbs + (Math.abs(a.nextInt()) % 2)) + 1) % 3;
        int[] iArr2 = {iAbs + 1, iAbs2 + 1, (iAbs + iAbs2 == 3 ? 0 : iAbs + iAbs2 == 2 ? 1 : 2) + 1};
        for (int i6 = 0; i6 < iArr2.length; i6++) {
            int i7 = iArr[iArr2[i6] - 1];
            if (i7 > 2) {
                int iAbs3 = Math.abs(a.nextInt()) % i7;
                int iAbs4 = (iAbs3 + ((Math.abs(a.nextInt()) % (i7 - 2)) + 1)) % i7;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                for (int i11 = i2; i11 < i2 + i3; i11++) {
                    int i12 = f321c[i11];
                    if (m87a(i12) && m89g(i12) != 2 && m88f(i12) == iArr2[i6]) {
                        if (iAbs3 == i10) {
                            i8 = i11;
                        } else if (iAbs4 == i10) {
                            i9 = i11;
                        }
                        i10++;
                    }
                }
                int iM92j = m92j(f321c[i8]);
                int iM93k = m93k(f321c[i8]);
                int iM92j2 = m92j(f321c[i9]);
                int iM93k2 = m93k(f321c[i9]);
                f321c[i8] = m97e(f321c[i8], iM92j2);
                f321c[i8] = f(f321c[i8], iM93k2);
                f321c[i9] = m97e(f321c[i9], iM92j);
                f321c[i9] = f(f321c[i9], iM93k);
                a(45, 5, i8);
                a(45, 5, i9);
                m78c(aM);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    private static boolean m85d(int i2) {
        return ((i2 >> 13) & 3) == 0;
    }

    private static int t(int i2) {
        return (i2 >> 10) & 7;
    }

    private static int u(int i2) {
        return (i2 >> 0) & 31;
    }

    private static int v(int i2) {
        return (i2 >> 5) & 31;
    }

    private static int o(int i2, int i3) {
        return (i2 & (-7169)) | ((i3 & 7) << 10);
    }

    private static int p(int i2, int i3) {
        return (i2 & (-32)) | ((i3 & 31) << 0);
    }

    private static int q(int i2, int i3) {
        return (i2 & (-993)) | ((i3 & 31) << 5);
    }

    private static int a(int i2, int i3, int i4, int i5) {
        return ((i2 & 3) << 13) | ((i3 & 7) << 10) | ((i5 & 31) << 5) | ((i4 & 31) << 0);
    }

    private static int w(int i2) {
        return (i2 >> 16) & 65535;
    }

    private static int x(int i2) {
        return (i2 >> 0) & 65535;
    }

    private static int r(int i2, int i3) {
        return ((i2 & 65535) << 16) | ((i3 & 65535) << 0);
    }

    private static int y(int i2) {
        int i3;
        bf = 2;
        bc = bf;
        bd = 0;
        bh = 0;
        bi = 3;
        bj = 2;
        if (DCWall.f14c == 2 || DCWall.f19h == 1) {
            bg = 10;
            bk = 30;
            bl = 10;
            bm = 7;
            bn = 3;
            bo = 4;
            bp = 6;
            be = 360;
        } else if (DCWall.f19h == 2) {
            bg = 14;
            bk = 25;
            bl = 20;
            bm = 8;
            bn = 3;
            bo = 5;
            bp = 7;
            be = 240;
        } else if (DCWall.f19h == 3) {
            bg = 18;
            bk = 25;
            bl = 50;
            bm = 9;
            bn = 3;
            bo = 6;
            bp = 8;
            be = 200;
        } else if (DCWall.f19h == 4) {
            bg = 20;
            bk = 20;
            bl = 70;
            bm = 10;
            bn = 3;
            bo = 6;
            bp = 9;
            be = 160;
        }
        bg = Math.min(bg, 20);
        f319k[i2][0] = 1;
        f319k[i2][1] = bg;
        f319k[i2][2] = bg;
        f319k[i2][4] = i2 * ((-aI) + aJ) * g;
        f319k[i2][7] = 0;
        f319k[i2][5] = 0;
        f319k[i2][6] = 0;
        f319k[i2][3] = 0 | (aH << 8) | aI;
        int i4 = 0;
        int i5 = 0;
        int i6 = 2 * bj;
        int i7 = 0;
        while (i7 < bg) {
            if (i7 == 0) {
                i3 = 1;
            } else {
                i3 = i7 == bg - 1 ? 0 : 2;
            }
            int i8 = i3;
            int i9 = i3 != 0 ? i7 + 1 : 0;
            int iA = a(i8, 0, i5, i6);
            int i10 = 0;
            int i11 = 11;
            if (i7 == bg - 1) {
                iA = a(i8, 3, i5 + bj, i6 + bj);
                i10 = 1;
                i11 = 10;
            }
            f325h[i7] = c(i7, i9, iA);
            f321c[i7] = a(bi, i11, i10, 0, 0, i5, i6);
            if (i7 < bg - 1) {
                if (i4 % 2 == 0) {
                    int i12 = i5 + bj;
                    i5 = i12;
                    if (i12 >= aH) {
                        i4++;
                        i6 += bj;
                        i5 -= bj;
                    }
                } else {
                    int i13 = i5 - bj;
                    i5 = i13;
                    if (i13 < 0) {
                        i4++;
                        i6 += bj;
                        i5 += bj;
                    }
                }
            }
            i7++;
        }
        bb = 0;
        aZ = 0;
        ba = 1;
        f326i[0] = r(i5, i6);
        return bg;
    }

    private static void y() {
        if (f286a) {
            be = Math.max(be - 1, 0);
            if (be == 0) {
                bf = 1;
            }
            bd = Math.max(bd - 1, 0);
            bc = Math.max(bc - 1, 0);
            if (bd == 0 && bc == 0) {
                int i2 = bh;
                int iF = F(f325h[i2]);
                int iG = G(f325h[i2]);
                int iG2 = G(f325h[iF]);
                while (true) {
                    int i3 = iG2;
                    if (m85d(iG)) {
                        break;
                    }
                    int iU = u(i3);
                    int iV = v(i3);
                    int i4 = f325h[i2];
                    int iP = p(iG, iU);
                    f325h[i2] = u(i4, iP);
                    f325h[i2] = u(f325h[i2], q(iP, iV));
                    i2 = iF;
                    iF = F(f325h[iF]);
                    iG = G(f325h[i2]);
                    iG2 = G(f325h[iF]);
                }
                int iG3 = G(f325h[i2]);
                int iU2 = u(iG3);
                int iV2 = v(iG3);
                int iM86b = m86b(t(iG3), iU2, iV2);
                int i5 = 0;
                int i6 = 0;
                if (iM86b == 2) {
                    i5 = -bj;
                } else if (iM86b == 3) {
                    i5 = bj;
                } else if (iM86b == 0) {
                    i6 = -bj;
                } else if (iM86b == 1) {
                    i6 = bj;
                }
                int i7 = f325h[i2];
                int iO = o(iG3, iM86b);
                f325h[i2] = u(i7, iO);
                int i8 = f325h[i2];
                int iP2 = p(iO, iU2 + i5);
                f325h[i2] = u(i8, iP2);
                f325h[i2] = u(f325h[i2], q(iP2, iV2 + i6));
                bc = bf;
            }
            for (int i9 = 0; i9 < bg; i9++) {
                int iU3 = u(G(f325h[i9])) - bj;
                int iV3 = v(G(f325h[i9])) - bj;
                int iE = E(f325h[i9]);
                if (i9 <= bh || iU3 < 0 || iU3 >= aH || iV3 < 0 || iV3 >= aI) {
                    f321c[iE] = C(f321c[iE]);
                } else {
                    if (!m87a(f321c[iE])) {
                        f321c[iE] = D(f321c[iE]);
                    }
                    f321c[iE] = m97e(f321c[iE], iU3);
                    f321c[iE] = f(f321c[iE], iV3);
                }
            }
            m78c(aM);
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static int m86b(int i2, int i3, int i4) {
        int iW = w(f326i[aZ]) - i3;
        int iX = x(f326i[aZ]) - i4;
        if (Math.abs(iW) < bj && Math.abs(iX) < bj) {
            aZ++;
            if (aZ >= ba) {
                int iAbs = Math.abs(a.nextInt()) % 100;
                if (iAbs < bk) {
                    bb = 1;
                } else if (iAbs - bk >= bl || bg - bh <= 8 || f302i) {
                    bb = 0;
                } else {
                    bb = 2;
                }
                switch (bb) {
                    case 0:
                        f326i[0] = r(bj + (Math.abs(a.nextInt()) % aH), bj + (Math.abs(a.nextInt()) % 10));
                        ba = 1;
                        break;
                    case 1:
                        int iAbs2 = Math.abs(a.nextInt()) % f324o.length;
                        int iW2 = w(f324o[iAbs2][0]);
                        int iX2 = x(f324o[iAbs2][0]);
                        int iW3 = w(f324o[iAbs2][1]);
                        int iX3 = x(f324o[iAbs2][1]);
                        int iAbs3 = bj + iW2 + (Math.abs(a.nextInt()) % iW3);
                        int iAbs4 = bj + iX2 + (Math.abs(a.nextInt()) % iX3);
                        ba = f324o[iAbs2].length - 2;
                        for (int i5 = 0; i5 < ba; i5++) {
                            f326i[i5] = r(iAbs3 + w(f324o[iAbs2][i5 + 2]), iAbs4 + x(f324o[iAbs2][i5 + 2]));
                        }
                        break;
                    case 2:
                        int i6 = i2;
                        if (i2 == 1) {
                            i6 = Math.abs(a.nextInt()) % 100 < 50 ? 2 : 3;
                        }
                        int iAbs5 = bj + bn + (Math.abs(a.nextInt()) % (aH - bn));
                        int iAbs6 = bj + bo + (Math.abs(a.nextInt()) % (bp - bo));
                        int i7 = ((bj << 1) + aH) - 1;
                        if (i6 == 2) {
                            f326i[0] = r(0, i4);
                            f326i[1] = r(0, 0);
                            f326i[2] = r(iAbs5, 0);
                            f326i[3] = r(iAbs5, bj + bm);
                        } else if (i6 == 3) {
                            f326i[0] = r(i7, i4);
                            f326i[1] = r(i7, 0);
                            f326i[2] = r(iAbs5, 0);
                            f326i[3] = r(iAbs5, bj + bm);
                        } else {
                            f326i[0] = r(i3, 0);
                            if (Math.abs(a.nextInt()) % 100 < 50) {
                                f326i[1] = r(0, 0);
                                f326i[2] = r(0, iAbs6);
                                f326i[3] = r((bj + aH) - 2, iAbs6);
                            } else {
                                f326i[1] = r(i7, 0);
                                f326i[2] = r(i7, iAbs6);
                                f326i[3] = r(bj + 2, iAbs6);
                            }
                        }
                        ba = 4;
                        break;
                }
                aZ = 0;
            }
            iW = w(f326i[aZ]) - i3;
            iX = x(f326i[aZ]) - i4;
        }
        if ((iW > (-bj) || i2 != 2) && ((iW < bj || i2 != 3) && ((iX > (-bj) || i2 != 0) && (iX < bj || i2 != 1)))) {
            i2 = (i2 == 2 || i2 == 3) ? iX < 0 ? 0 : 1 : iW < 0 ? 2 : 3;
            int i8 = 0;
            switch (i2) {
                case 0:
                    i8 = 7;
                    break;
                case 1:
                    i8 = 8;
                    break;
                case 2:
                    i8 = 9;
                    break;
                case 3:
                    i8 = 10;
                    break;
            }
            int iE = E(f325h[bg - 1]);
            f321c[iE] = m94b(f321c[iE], i8);
        }
        return i2;
    }

    private static void z() {
        bd = 8;
    }

    private static void A() {
        bd = 0;
    }

    private static int z(int i2) {
        bq = 3;
        bs = 0;
        bv = 0;
        bw = 0;
        a(d.a(65539), Math.abs(a.nextInt()) % 3, i2, 0, false);
        int i3 = 0;
        int i4 = 0;
        switch (DCWall.f19h) {
            case 1:
                i3 = 0;
                i4 = 0;
                bz = 7;
                bu = 360;
                break;
            case 2:
                i3 = 50;
                i4 = 0;
                bz = 6;
                bu = 120;
                break;
            case 3:
                i3 = 30;
                i4 = 30;
                bz = 5;
                bu = 60;
                break;
            case 4:
                i3 = 50;
                i4 = 50;
                bz = 4;
                bu = 20;
                break;
        }
        bt = f319k[i2][2];
        bv = aH;
        bw = aI;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < bt; i5++) {
            bv = Math.min(bv, m92j(f321c[i5]));
            bw = Math.min(bw, m93k(f321c[i5]));
            iMax2 = Math.max(iMax2, m92j(f321c[i5]) + 2);
            iMax = Math.max(iMax, m93k(f321c[i5]) + 2);
        }
        bB = iMax - bw;
        bA = iMax2 - bv;
        f319k[i2][0] = 2;
        f319k[i2][4] = i2 * ((-aI) + aJ) * g;
        f319k[i2][7] = 0;
        f319k[i2][5] = 0;
        f319k[i2][6] = 0;
        f319k[i2][3] = 0 | (aH << 8) | aI;
        for (int i6 = 0; i6 < bt; i6++) {
            int i7 = 12;
            int iAbs = Math.abs(a.nextInt()) % 100;
            if (iAbs < i3) {
                i7 = 13;
            } else if (iAbs < i3 + i4) {
                i7 = 14;
            }
            int i8 = 0;
            if (i7 == 13) {
                i8 = 1;
            } else if (i7 == 14) {
                i8 = 3;
            }
            f321c[i6] = m94b(f321c[i6], i7);
            f321c[i6] = m96d(f321c[i6], i8);
        }
        return bt;
    }

    private static void B() {
        if (f286a) {
            aS++;
            bu = Math.max(bu - 1, 0);
            if (bu == 0) {
                bq = 1;
            }
            br = Math.max(br - 1, 0);
            if (br == 0) {
                int i2 = 0;
                int i3 = 0;
                switch (bs) {
                    case 0:
                        if (bv + bA < aH - bx) {
                            i2 = 1;
                        } else {
                            bs = 1;
                            if (bw + bB < aI - bz) {
                                i3 = 1;
                            } else {
                                i2 = -1;
                            }
                        }
                        break;
                    case 1:
                        if (bv > bx) {
                            i2 = -1;
                        } else if (bw + bB >= aI - bz) {
                            bs = 3;
                            i3 = -1;
                        } else {
                            bs = 0;
                            i3 = 1;
                        }
                        break;
                    case 3:
                        if (bw > by) {
                            i3 = -1;
                        } else {
                            bs = 0;
                            i2 = 1;
                        }
                        break;
                }
                bv += i2;
                bw += i3;
                br = bq;
                for (int i4 = 0; i4 < bt; i4++) {
                    if (m87a(f321c[i4])) {
                        int iM92j = m92j(f321c[i4]) + i2;
                        int iM93k = m93k(f321c[i4]) + i3;
                        f321c[i4] = m97e(f321c[i4], iM92j);
                        f321c[i4] = f(f321c[i4], iM93k);
                    }
                }
                m78c(aM);
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m87a(int i2) {
        return ((i2 >> 31) & 1) == 0;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public static int m88f(int i2) {
        return (i2 >> 29) & 3;
    }

    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public static int m89g(int i2) {
        return (i2 >> 23) & 63;
    }

    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public static int m90h(int i2) {
        return (i2 >> 20) & 7;
    }

    private static int A(int i2) {
        return (i2 >> 15) & 31;
    }

    private static int B(int i2) {
        return (i2 >> 12) & 7;
    }

    /* JADX INFO: renamed from: i, reason: collision with other method in class */
    public static int m91i(int i2) {
        return (i2 >> 10) & 3;
    }

    /* JADX INFO: renamed from: j, reason: collision with other method in class */
    public static int m92j(int i2) {
        return (i2 >> 5) & 31;
    }

    /* JADX INFO: renamed from: k, reason: collision with other method in class */
    public static int m93k(int i2) {
        return (i2 >> 0) & 31;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static int m94b(int i2, int i3) {
        return (i2 & (-528482305)) | ((i3 & 63) << 23);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static int m95c(int i2, int i3) {
        return (i2 & (-7340033)) | ((i3 & 7) << 20);
    }

    private static int s(int i2, int i3) {
        return (i2 & (-1015809)) | ((i3 & 31) << 15);
    }

    private static int t(int i2, int i3) {
        return (i2 & (-28673)) | ((i3 & 7) << 12);
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static int m96d(int i2, int i3) {
        return (i2 & (-3073)) | ((i3 & 3) << 10);
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static int m97e(int i2, int i3) {
        return (i2 & (-993)) | ((i3 & 31) << 5);
    }

    public static int f(int i2, int i3) {
        return (i2 & (-32)) | ((i3 & 31) << 0);
    }

    private static int C(int i2) {
        return i2 | Integer.MIN_VALUE;
    }

    private static int D(int i2) {
        return i2 & Integer.MAX_VALUE;
    }

    public static int a(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        switch (i3) {
            case 3:
            case 12:
                i9 = 0;
                break;
            case 4:
            case 13:
                i9 = 1;
                break;
            case 5:
            case 14:
                i9 = 3;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                i9 = 0;
                break;
        }
        return 0 | ((i2 & 3) << 29) | ((i3 & 63) << 23) | ((i4 & 7) << 20) | ((i5 & 31) << 15) | ((i6 & 7) << 12) | ((i9 & 3) << 10) | ((i7 & 31) << 5) | ((i8 & 31) << 0);
    }

    private static void a(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i3;
            iArr[2] = i4;
            iArr[3] = i5;
            iArr[4] = i6;
            iArr[5] = i7;
            iArr[6] = i8;
            iArr[7] = -1;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m98a(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean zA = true;
        switch (i8) {
            case 0:
                zA = false;
                break;
            case 1:
                a(iArr, 0, i2 + i4, i3 + i5, e, 0, 1, 0);
                break;
            case 2:
                a(iArr, 0, i2 + i4, i3 + i5, -e, 0, -1, 0);
                break;
            case 3:
                a(iArr, 0, i2 + i4, i3 + i5, 0, e, 0, 1);
                break;
            case 4:
                a(iArr, 0, i2 + i4, i3 + i5, 0, -e, 0, -1);
                break;
            case 5:
                zA = a(iArr, i2, i3, i4, i5, i6, i7, true, true, true, true);
                break;
            case 6:
                zA = a(iArr, i2, i3, i4, i5, i6, i7, true, false, true, true);
                break;
            case 7:
                zA = a(iArr, i2, i3, i4, i5, i6, i7, false, true, true, true);
                break;
            case 8:
                zA = a(iArr, i2, i3, i4, i5, i6, i7, true, false, true, false);
                break;
            case 9:
                zA = a(iArr, i2, i3, i4, i5, i6, i7, false, true, true, false);
                break;
            case 10:
                zA = a(iArr, i2, i3, i4, i5, i6, i7, true, false, false, true);
                break;
            case 11:
                zA = a(iArr, i2, i3, i4, i5, i6, i7, false, true, false, true);
                break;
        }
        return zA;
    }

    private static boolean a(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        int i8 = 0;
        int i9 = 0;
        if (i4 == i6) {
            z3 = false;
            z2 = false;
        }
        if (i5 == i7) {
            z5 = false;
            z4 = false;
        }
        if (z2 && i4 == 0) {
            i8 = -1;
        } else if (z3 && i4 == f) {
            i8 = 1;
        } else if (z4 && i5 == 0) {
            i9 = -1;
        } else if (z5 && i5 == g) {
            i9 = 1;
        } else {
            z6 = false;
        }
        if (z6) {
            a(iArr, 0, i2 + i4, i3 + i5, i8 * e, i9 * e, i8, i9);
        }
        return z6;
    }

    private static int E(int i2) {
        return (i2 >> 23) & 255;
    }

    private static int F(int i2) {
        return (i2 >> 15) & 255;
    }

    private static int G(int i2) {
        return (i2 >> 0) & 32767;
    }

    private static int u(int i2, int i3) {
        return (i2 & (-32768)) | ((i3 & 32767) << 0);
    }

    private static int c(int i2, int i3, int i4) {
        return Integer.MIN_VALUE | ((i2 & 255) << 23) | ((i3 & 255) << 15) | ((i4 & 32767) << 0);
    }

    public static void e() {
        int i2 = 0;
        int i3 = 32768;
        d = new int[256];
        for (int i4 = 0; i4 < 128; i4++) {
            d[i4] = i2 << 1;
            i3 -= (i2 * 804) >> 15;
            i2 += (i3 * 804) >> 15;
        }
        for (int i5 = 128; i5 < 256; i5++) {
            d[i5] = -d[i5 - 128];
        }
        al = 0;
        for (int i6 = 0; i6 < f306b.length; i6++) {
            al += f306b[i6];
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static final int m99b() {
        f284a = ((-1644122275) * f284a) - 1644122275;
        return f284a;
    }

    /* JADX INFO: renamed from: l, reason: collision with other method in class */
    public static final int m100l(int i2) {
        return d[i2 & 255];
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static final int m101m(int i2) {
        return d[(i2 + 64) & 255];
    }

    private static int H(int i2) {
        int i3 = 0;
        int i4 = 268435456;
        while (true) {
            int i5 = i4;
            if (i5 == 0) {
                return i3;
            }
            int i6 = i3 + i5;
            i3 >>= 1;
            if (i6 <= i2) {
                i2 -= i6;
                i3 += i5;
            }
            i4 = i5 >> 2;
        }
    }

    private static int b(int i2, int i3, int i4, int i5) {
        return ((i2 * i4) + (i3 * i5)) / e;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static void m102d(int i2) {
        new StringBuffer().append("Setting ").append(i2).append(" ").append(60).append(" ").append(61).toString();
        if (i2 < 60) {
            a(d.a(65538), i2, 0, 0, false);
            return;
        }
        y(0);
        f.f195c = 0;
        bC = 0;
        for (int i3 = 0; i3 < f305a.length; i3++) {
            if (f305a[i3] && m70b(i3)) {
                int[] iArr = f327j;
                int i4 = bC;
                bC = i4 + 1;
                iArr[i4] = i3;
            }
        }
    }

    private static void a(DataInputStream dataInputStream, int i2, int i3, int i4, boolean z2) {
        int i5;
        try {
            dataInputStream.read();
            dataInputStream.skip(i2 << 2);
            dataInputStream.skip(dataInputStream.readInt());
            int i6 = dataInputStream.read();
            int i7 = dataInputStream.read();
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                for (int i11 = 0; i11 < i6; i11++) {
                    byte b2 = dataInputStream.readByte();
                    if (b2 > 0) {
                        int i12 = ((b2 - 1) % 3) + 1;
                        int i13 = (b2 - 1) / 3;
                        switch (i13) {
                            case 0:
                            case 1:
                            case 2:
                                i5 = 3;
                                i9++;
                                f321c[i4 + i8] = a(i12, i5, i13, 0, 0, i11, i10);
                                i8++;
                                break;
                            case 3:
                                i5 = 4;
                                i9++;
                                f321c[i4 + i8] = a(i12, i5, i13, 0, 0, i11, i10);
                                i8++;
                                break;
                            case 4:
                                i5 = 5;
                                i9++;
                                f321c[i4 + i8] = a(i12, i5, i13, 0, 0, i11, i10);
                                i8++;
                                break;
                            case 5:
                                i5 = 2;
                                f321c[i4 + i8] = a(i12, i5, i13, 0, 0, i11, i10);
                                i8++;
                                break;
                        }
                    }
                }
            }
            short s2 = dataInputStream.readShort();
            for (int i14 = 0; i14 < s2; i14++) {
                if (dataInputStream.read() == 0) {
                    f.f195c = dataInputStream.read();
                    bC = dataInputStream.read();
                    int i15 = 0;
                    for (int i16 = 0; i16 < bC; i16++) {
                        int i17 = dataInputStream.read();
                        if (f305a[i17]) {
                            f327j[i15] = i17;
                            i15++;
                        }
                    }
                    if (i15 == 0) {
                        int i18 = i15;
                        i15++;
                        f327j[i18] = 10;
                    }
                    bC = i15;
                }
            }
            dataInputStream.close();
            f319k[i3][0] = z2 ? 3 : 0;
            f319k[i3][1] = i8;
            f319k[i3][2] = i9;
            f319k[i3][4] = i3 * ((-aI) + aJ) * g;
            f319k[i3][7] = i4;
            f319k[i3][3] = 0 | (i6 << 8) | i7;
            new StringBuffer().append("tileIndex:").append(i8).append(" numOfTiles:").append(i9).toString();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: o, reason: collision with other method in class */
    private static final void m103o(int i2) {
        if (DCWall.m6a(i2) >= 0) {
            a(71, 0, 0);
            DCWall.c(25);
        }
    }
}
