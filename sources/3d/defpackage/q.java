package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.Transform;

/* JADX INFO: loaded from: bbr-3d.jar:q.class */
public final class q {
    public static int cL;
    private static int cM;
    public static int cN;
    public static int cO;
    private static int cP;
    private static int cR;
    private static int cS;
    public static int cT;
    public static int cU;
    private static int cV;
    public static Object[] d;
    public static int cY;
    public static int cZ;
    public static int da;
    public static int db;
    public static int dc;
    private static int dd;
    public static float m;
    public static f f;
    private static int dg;
    public static int dh;
    public static int di;
    private static boolean ad;
    public static int dl;
    public static int dm;
    public static int dn;
    public static int dq;
    public static int ds;
    public static int dt;
    private static int[] as;
    private static int du;
    private static boolean ae;
    public static int dB;
    public static int dC;
    public static int dD;
    public static int dE;
    public static int dF;
    public static int dG;
    public static int dH;
    public static int dI;
    public static int dJ;
    public static int dK;
    public static int dL;
    public static int dM;
    public static int dN;
    public static int dO;
    public static int dP;
    public static int dQ;
    private static final int[] at;
    private static final int dR;
    private static int dS;
    private static boolean ak;
    private static boolean al;
    private static int dT;
    public static int dU;
    public static int dV;
    private static int[] au;
    private static int dW;
    public static final int dX;
    private static int dY;
    private static int dZ;
    private static int ea;
    private static final int[] av;
    private static final int[][] p;
    public static int[][] q;
    public static int[][] r;
    public static int[][] s;
    private static boolean am;
    public static int eb;
    private static int ec;
    public static int ed;
    public static int ee;
    private static int ef;
    private static int eg;
    private static int eh;
    private static int ei;
    public static int ej;
    private static int ek;
    private static int el;
    private static int em;
    private static int en;
    public static int eo;
    public static int ep;
    public static int eq;
    private static int er;
    public static int es;
    private static int et;
    private static int eu;
    private static int ev;
    public static int ew;
    private static int ex;
    private static int ey;
    private static int ez;
    private static int eA;
    private static int eB;
    private static int eC;
    private static int eD;
    private static int eE;
    private static int eF;
    private static int[] aw;
    public static final int[] ax;
    private static boolean[] e;
    private static int[] ay;
    private static int[][] t;
    private static int eG;
    private static int eH;
    private static final int eI;
    private static int[][] u;
    private static int[] az;
    private static int[] aA;
    private static boolean an;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static boolean[] f147f;
    private static boolean ao;
    public static int eJ;
    private static int eK;
    public static int[][] v;
    private static int[] aB;
    private static int[] aC;
    public static int[][] w;
    private static int eL;
    private static int eM;
    public static int[][] x;
    private static int eN;
    private static int eO;
    public static int eP;
    private static int eQ;
    private static int eR;
    public static int eS;
    private static int eT;
    private static int[][] y;
    public static boolean[] g;
    private static int eU;
    public static int[][] z;
    public static int eV;
    public static int eW;
    public static boolean ap;
    private static boolean aq;
    private static int eX;
    private static int eY;
    private static int eZ;
    private static int fa;
    public static int[][] A;
    public static Object[][] c;
    private static int fb;
    private static int fc;
    public static int fd;
    public static int fe;
    public static int ff;
    public static int fg;
    private static int fh;
    private static int[] aD;
    private static int fi;
    private static int[] aE;
    private static int fj;
    public static int fk;
    public static int[] aI;
    public static final int[][] B;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static f[] f151e;

    /* JADX INFO: renamed from: r, reason: collision with other field name */
    private static n f152r;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static Transform f153d;
    public static String[] h;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static char f154a;
    private static int fn;
    private static int fo;
    private static int fp;
    private static int[] aL;
    private static int[] aM;
    private static int fq;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static o[] f156a;
    private static int fr;
    private static int fs;
    private static int ft;
    private static int fu;
    private static int fv;
    private static int[] aN;
    public static int fw;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static String f157h;
    private static int fx;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static byte[][] f158a;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static f f159g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static f f160h;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static r f161b;
    private static int[] aQ;
    private static int fC;
    private static int[] bH = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65};
    private static int[] bI = {66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140};
    public static int fK = 0;
    private static f i = new f();
    private static int[] bG = {469, 470, 466, 467, 468};

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static boolean[] f162h = new boolean[5];
    private static int[] aS = {80, 90, 100, 100, 50};
    private static int[] aT = {100, 100, 100, 100, 250};
    private static int[] aU = {200, 200, 200, 200, 80};
    private static int[] aV = {70, 80, 90, 120, 50};
    private static int[] aW = {200, 200, 200, 200, 60};
    private static int[] aX = {250, 250, 250, 250, 80};
    private static int[] aY = {140, 120, 100, 80, 50};
    private static int[] aZ = {150, 150, 150, 150, 100};
    private static int[] ba = {200, 200, 200, 200, 80};
    private static int[] bb = {200, 200, 200, 200, 80};
    private static int[] bc = {200, 200, 200, 200, 80};
    private static int[] bd = {200, 200, 200, 200, 80};
    private static int[] be = {70, 90, 100, 120, 80};
    private static int[] bf = {100, 100, 100, 100, 80};
    private static int[] bg = {50, 50, 50, 50, 80};
    private static int[] bh = {200, 200, 200, 200, 100};
    private static int[] bi = {100, 100, 100, 100, 150};
    private static int[] bj = {250, 250, 250, 250, 100};
    private static int[] bk = {150, 180, 200, 200, 250};
    private static int[] bl = {150, 200, 200, 200, 250};
    private static int[] bm = {140, 120, 100, 80, 0};
    private static int[] bn = {100, 100, 100, 100, 250};
    private static int[] bo = {200, 200, 200, 200, 100};
    private static int[] bp = {150, 200, 250, 250, 100};
    private static int[] bq = {7, 6, 5, 4};
    private static int[] br = {400, 600, 800, 1200};
    private static int[] bs = {400, 500, 800, 1200};
    private static int[] bt = {6, 6, 5, 4};
    private static int[] bu = {500, 600, 800, 1200};
    private static int[] bv = {500, 600, 800, 1200};
    private static int[] bw = {7, 6, 5, 4};
    private static int[] bx = {5, 6, 6, 7};
    private static int[] by = {600, 800, 1000, 1200};
    private static int[] bz = {100, 160, 250, 350};
    private static int[] bA = {35000, 35000, 35000, 35000};
    private static int[] bB = {6000, 7000, 8000, 9000};
    private static int[] bC = {1, 1, 1, 1};
    private static int[] bD = {6000, 6000, 6000, 6000};
    public static final int[] bE = {30, 30, 32, 32};
    public static final int[][] D = {new int[]{h.m26c(0, 50, 255), 0, h.m26c(0, 241, 241), 100}, new int[]{h.m26c(1, 197, 14), 0, h.m26c(182, 242, 16), 100}, new int[]{h.m26c(255, 145, 0), 0, h.m26c(236, 235, 0), 100}, new int[]{h.m26c(237, 20, 20), 0, h.m26c(237, 18, 194), 100}};
    public static final int[] bF = {3413829, 0, 9390034, 100};
    private static int[] aO = {0, 200, 400, 600, 800, 1000, 2000, 4000, 6000, 8000, 10000, 20000, 40000, 60000, 80000, 100000, Integer.MAX_VALUE};
    private static int[] aP = {231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246};
    private static int fy = 0;
    private static int fz = 0;
    private static int fA = 0;
    private static int fB = 0;
    private static int[][] C = {new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 524288, -2147024892, -268181501, 2080504833, 520109568, 3968}, new int[]{0, 0, 0, 0, 0, 402653184, 100666368, 25166592, 6291648, 1572912, 393228, -1073643517, 805330944, 201332736, 3840}, new int[]{0, 0, 0, 0, 1610612736, 1006645248, 100670976, 25166592, 6291648, 1572912, 393228, -536772605, 2080436225, 1065369088, 16368}, new int[]{0, 0, 0, -1072726010, -268181497, 2080438273, 520109568, 65013696, 16253424, 4063356, -535855073, -134090745, 1040219136, 260054784, 1984}, new int[]{4194304, 1048608, 786440, -2147287034, -536756221, 402665472, 100666368, 25166592, 15728832, 3932412, -2146500578, -536625145, -67047423, -2031872, 65521}, new int[]{0, 0, 0, -134217728, -33031153, -4063485, 1071710177, 267919344, 59639740, -1058831929, 1882775665, 470693916, -956068345, 1908466561, 32240}, new int[]{4194432, 1048608, 917512, -1073512441, 1879105537, 469776384, 117444096, 29361024, 7340256, 4063288, -1072725985, -133963769, -33424381, 1065385728, 8128}, new int[]{4194304, 1048608, 262152, -2147418110, 536887296, 134221824, 117444096, 20972160, 5243040, 4063272, -1072725985, 403140615, -2097050621, 1623245185, 28784}, new int[]{4194432, 1048608, 917512, -1073512441, -134160383, 1040219136, 260054784, 65013696, 16253424, 4063356, -1072725985, -133963769, -33424381, 1065385728, 8128}, new int[]{0, 0, 0, 0, 0, 0, 58721024, 31457728, 8257788, -29364097, -34604129, -12583297, -1048673, -9, 131071}, new int[]{34078720, 8519940, -534740927, 941387832, -1912136690, -478034173, 954233280, 246947824, 59639740, -1058831929, 1882775665, 470693916, -956068345, 2143347585, 16352}, new int[]{0, 0, 276832256, 69208128, 60557072, -1637938, -532938757, 940470300, -838624249, 1937827585, 484456896, 121114224, -939524132, -520109569, 127103}, new int[]{0, 0, 0, 1048576, 917512, -536363001, -66848765, -8192251, -917533, -65539, -32769, -16385, -8193, -4097, 129023}, new int[]{4194304, 1048608, -2146566116, -536362993, -100273149, -8257790, -1075216432, 1073643516, -807428097, -203167801, 2096691697, 524172924, -942698593, -793625, 65529}, new int[]{0, 0, 29361024, 15728864, 3407992, -2146500578, -536625145, -71567497, -547, -1118209, -1, -1, -1, -1, 131071}, new int[]{0, 0, 0, 0, 0, 0, 2029019328, -202932484, -126816031, -470290820, 7365105, 0, 0, 0, 0, 0}};
    private static int[] aR = {45, 40, 69, 123, 109, 175, 117, 80, 137, 180, 172, 183, 247, 255, 268, Integer.MAX_VALUE};
    private static int fD = 0;
    private static int fE = 0;
    private static int fF = 0;
    private static int fG = 0;
    private static int fH = 0;
    private static int fI = 0;
    private static int fJ = 0;
    public static int fl = 0;
    private static int fm = 0;
    private static Vector b = new Vector(5);
    private static int[] aJ = {369, 370, 372, 371, 373, 374};
    private static int[] aK = {39, 19, 41, 42, 43, 44};

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static char[] f155b = new char[16];

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static float[] f148c = {9.43f, 8.99f, 9.04f, 17.36f, 17.36f, 8.83f, 8.81f, 9.01f, 8.67f, 10.18f, 10.31f, 7.36f, 9.72f, 9.67f, 9.56f, 9.53f, 10.24f, 9.56f, 11.28f, 9.93f, 10.0f, 10.07f, 10.68f, 10.62f};
    private static int[] aF = {8430, 0, 8900, 0, 9300, 2, 9860, 2, 11200, 1, 15570, 0};
    private static int[] aG = {3500, 3780, 14250, 14500};

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static float[] f149d = {14.25f, 14.9f, 1000.0f, 1800.0f, 3.5f, 4.5f, 790.0f, 1900.0f};
    private static int[] aH = {0, 65544, 1, 65543, 2, 65545, 2, 65546, 2, 65547, 2, 65548, 2, 65549, 2, 65550, 2, 65551, 2, 65552, 2, 65553, 2, 65554, 2, 65555, 2, 65556, 2, 65557, 2, 65558, 2, 65559, 2, 65560, 2, 65561, 2, 65562, 2, 65563, 2, 65564, 2, 65565, 2, 65566, 2, 65567, 2, 131072};

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static float[] f150e = new float[6];
    public static boolean Z = false;
    public static int cQ = 0;
    private static boolean aa = false;
    public static int cW = 0;
    public static int cX = 0;
    public static int de = -1;
    public static int df = -1;
    public static boolean ab = false;
    public static boolean ac = false;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static boolean[] f145d = new boolean[41];
    public static int dj = 0;
    public static int dk = 0;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static int f146do = -1;
    public static int dp = 5;
    public static int dr = 5;
    public static Random a = new Random();
    private static int dv = 12;
    private static int dw = 18;
    public static final int dx = dv * 30;
    public static final int dy = dv * 30;
    public static final int dz = dw * 30;
    private static int dA = 0;
    public static boolean af = false;
    public static boolean ag = false;
    private static boolean ah = false;
    private static boolean ai = false;
    private static boolean aj = false;

    public static final int n() {
        return dC + dD + dE + dF;
    }

    public static final void S() {
        dB = 0;
        dC = 0;
        dD = 0;
        dE = 0;
        dF = 0;
        dG = 0;
        dH = 0;
        dI = 0;
        dJ = 0;
        dL = 0;
        dK = 0;
        dM = 0;
        dN = 0;
        dO = 0;
    }

    public static final void l(int i2, int i3) {
        dm = i2;
        dn = i3;
        af = false;
        ag = false;
        aa = false;
        dA = 0;
        eb = 1;
        eu = 1;
        ev = -1;
        U();
    }

    public static void T() {
        eb = 1;
        eo = 5;
        ep = 0;
        eq = 0;
        cW = 0;
        er = 0;
        ew = 0;
        cL = 0;
    }

    public static void init() {
        dm = p.i();
        dn = p.m();
        f fVar = new f();
        f = fVar;
        fVar.a(1, 1, 3);
        f.a(2);
        g.init();
    }

    private static void G(int i2) {
        er = ep;
        et = 0;
        int i3 = ep + i2;
        ep = i3;
        ep = Math.min(i3, 999999999);
        h.bi = 6000;
        h.bj++;
    }

    public static final int a(int i2) {
        int i3;
        int i4;
        if (ab) {
            f.m14a(25);
            cL = 0;
        } else {
            ab();
            cL = Math.max(0, cL - 25);
            et += 25;
            en += 25;
            dS += 25;
            if (cL <= 0) {
                if (de == 3) {
                    cZ += 25;
                }
                if (A[fd][2] == 0) {
                    en = 0;
                }
                if (en > 8000 && e[4]) {
                    en = 0;
                    e(b(fd, (20 * dy) / 2, true), b(fd, dz, false), 4);
                }
                if (et < 500) {
                    es = er + (((ep - er) * et) / 500);
                } else {
                    es = ep;
                }
                int i5 = dA + 25;
                dA = i5;
                if (i5 >= 250) {
                    dA -= 250;
                    ae = true;
                } else {
                    ae = false;
                }
                if (eb != 14 && eb != 15 && eb != 16) {
                    cM += 25;
                    if (ae) {
                        int i6 = A[fd][7];
                        int i7 = A[fd][1];
                        for (int i8 = i6; i8 < i6 + i7; i8++) {
                            Object[] objArr = c[i8];
                            if (m44a(objArr)) {
                                int iE = e(objArr);
                                int iMax = Math.max(((((int[]) objArr[0])[0] >> 15) & 31) - 1, 0);
                                boolean z2 = iMax == 0;
                                f(objArr, iMax);
                                switch (iE) {
                                    case 1:
                                        if (z2) {
                                            g(objArr, 2);
                                        }
                                        break;
                                    case 2:
                                        g(objArr, 0);
                                        break;
                                }
                                c[i8] = objArr;
                            }
                        }
                    }
                    switch (fg) {
                        case 0:
                        case 3:
                            if (aq && fc > 3) {
                                int[] iArr = {0, 0, 0};
                                int i9 = A[fd][7];
                                int i10 = A[fd][1];
                                for (int i11 = i9; i11 < i9 + i10; i11++) {
                                    Object[] objArr2 = c[i11];
                                    if (m44a(objArr2) && m46c(objArr2) != 2) {
                                        switch (m45b(objArr2)) {
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
                                for (int i12 = 0; i12 < iArr2.length; i12++) {
                                    int i13 = iArr[iArr2[i12] - 1];
                                    if (i13 > 2) {
                                        int iAbs3 = Math.abs(a.nextInt()) % i13;
                                        int iAbs4 = (iAbs3 + ((Math.abs(a.nextInt()) % (i13 - 2)) + 1)) % i13;
                                        int i14 = 0;
                                        int i15 = 0;
                                        int i16 = 0;
                                        for (int i17 = i9; i17 < i9 + i10; i17++) {
                                            Object[] objArr3 = c[i17];
                                            if (m44a(objArr3) && m46c(objArr3) != 2 && m45b(objArr3) == iArr2[i12]) {
                                                if (iAbs3 == i16) {
                                                    i14 = i17;
                                                } else if (iAbs4 == i16) {
                                                    i15 = i17;
                                                }
                                                i16++;
                                            }
                                        }
                                        int iG = g(c[i14]);
                                        int iJ = j(c[i14]);
                                        int iG2 = g(c[i15]);
                                        int iJ2 = j(c[i15]);
                                        i(c[i14], iG2);
                                        j(c[i14], iJ2);
                                        i(c[i15], iG);
                                        j(c[i15], iJ);
                                    }
                                }
                            }
                            break;
                        case 1:
                            if (eb != 9 && eb != 7 && !f()) {
                                switch (fn) {
                                    case 0:
                                        if (a(aM, 25)) {
                                            int i18 = aL[4];
                                            int i19 = aL[5];
                                            a(aM, i18 + (r() % (((aL[4] + aL[6]) - aL[2]) - i18)), i19 + (r() % (((aL[5] + aL[7]) - aL[3]) - i19)), fp);
                                        }
                                        int i20 = aM[4] - aL[0];
                                        int i21 = aM[5] - aL[1];
                                        int[] iArr3 = aL;
                                        iArr3[0] = iArr3[0] + i20;
                                        int[] iArr4 = aL;
                                        iArr4[1] = iArr4[1] + i21;
                                        b(0, fo, i20, i21);
                                        break;
                                    case 1:
                                        if (a(aM, 25)) {
                                            int i22 = aL[4];
                                            a(aM, i22 + (r() % (((aL[4] + aL[6]) - aL[2]) - i22)), aL[1], fp);
                                        }
                                        int i23 = aM[4] - aL[0];
                                        int[] iArr5 = aL;
                                        iArr5[0] = iArr5[0] + i23;
                                        b(0, fs, i23, 0);
                                        for (int i24 = 0; i24 < 3; i24++) {
                                            o oVar = f156a[i24];
                                            int i25 = fs + (i24 * fr);
                                            if (oVar.Q) {
                                                if (a(oVar.ap, 25)) {
                                                    int i26 = oVar.ao[5];
                                                    a(oVar.ap, oVar.ao[0], i26 + (r() % (((oVar.ao[5] + oVar.ao[7]) - oVar.ao[3]) - i26)), fp);
                                                }
                                                int i27 = oVar.ap[5] - oVar.ao[1];
                                                int[] iArr6 = oVar.ao;
                                                iArr6[1] = iArr6[1] + i27;
                                                for (int i28 = i25; i28 < i25 + fr; i28++) {
                                                    Object[] objArr4 = c[i28];
                                                    ((int[]) objArr4[0])[2] = ((int[]) objArr4[0])[2] + i27;
                                                }
                                            } else {
                                                oVar.cu += 25;
                                                if (oVar.cu >= 3000) {
                                                    oVar.cu = 0;
                                                    oVar.Q = true;
                                                    for (int i29 = i25; i29 < i25 + fr; i29++) {
                                                        m49f(c[i29]);
                                                        int[] iArr7 = A[fd];
                                                        iArr7[2] = iArr7[2] + 1;
                                                        fc++;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        int i30 = fu + 25;
                                        fu = i30;
                                        float fSin = 2 * dz * ((float) Math.sin((3.141592653589793d * ((double) i30)) / 10000.0d));
                                        float fSin2 = 12.0f + (6.0f * ((float) Math.sin((3.141592653589793d * ((double) i30)) / 20000.0d)));
                                        for (int i31 = 0; i31 < ft; i31++) {
                                            int iSin = (int) (((double) (fSin * 2.0f)) * Math.sin((3.141592653589793d * ((double) (fu + (i31 << 8)))) / ((double) (fSin2 * 512.0f))));
                                            int i32 = (17 * dz) << 1;
                                            for (int i33 = 3; i33 >= 0; i33--) {
                                                int i34 = (i33 * ft) + i31;
                                                Object[] objArr5 = c[i34];
                                                if (i33 % 2 == 1) {
                                                    if (m44a(objArr5)) {
                                                        ((int[]) objArr5[0])[2] = fv + iSin + (i33 * dz);
                                                        i32 = ((int[]) objArr5[0])[2] - dz;
                                                    }
                                                } else if (m44a(objArr5)) {
                                                    int i35 = ((int[]) objArr5[0])[2] + 78;
                                                    if (!(i33 == 2 && m44a(c[ft + i31]) && m44a(c[(3 * ft) + i31])) && i35 <= i32) {
                                                        ((int[]) objArr5[0])[2] = i35;
                                                    } else {
                                                        ((int[]) objArr5[0])[2] = i32;
                                                    }
                                                    if (((int[]) objArr5[0])[2] > 17 * dz) {
                                                        m39a(5, i34, 5, true);
                                                    }
                                                    if (a(q[0], false, 0, ((int[]) objArr5[0])[1], ((int[]) objArr5[0])[2], h(objArr5), i(objArr5))) {
                                                        ac();
                                                        m39a(5, i34, 5, true);
                                                        for (int i36 = 0; i36 < fo; i36++) {
                                                            Object[] objArr6 = c[i36];
                                                            if (m44a(objArr6) && m47d(objArr6) == 2 && ((int[]) objArr6[0])[2] > 13 * dz) {
                                                                m39a(5, i36, 5, true);
                                                            }
                                                        }
                                                    }
                                                    i32 = ((int[]) objArr5[0])[2] - dz;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        if (a(aM, 25)) {
                                            int i37 = aL[4];
                                            int i38 = aL[5];
                                            int i39 = (aL[4] + aL[6]) - aL[2];
                                            int i40 = (aL[5] + aL[7]) - aL[3];
                                            if (aM[4] == i37 && aM[5] == i38) {
                                                i3 = i37;
                                                i4 = i40;
                                            } else if (aM[4] == i37 && aM[5] == i40) {
                                                i3 = i39;
                                                i4 = i40;
                                            } else if (aM[4] == i39 && aM[5] == i40) {
                                                i3 = i39;
                                                i4 = i38;
                                            } else {
                                                i3 = i37;
                                                i4 = i38;
                                            }
                                            a(aM, i3, i4, fp);
                                        }
                                        int i41 = aM[4] - aL[0];
                                        int i42 = aM[5] - aL[1];
                                        int[] iArr8 = aL;
                                        iArr8[0] = iArr8[0] + i41;
                                        int[] iArr9 = aL;
                                        iArr9[1] = iArr9[1] + i42;
                                        b(0, fo, i41, i42);
                                        break;
                                    case 4:
                                        if (a(aM, 25)) {
                                            int i43 = aL[4];
                                            a(aM, aM[4] == i43 ? (aL[4] + aL[6]) - aL[2] : i43, aL[1], fp);
                                        }
                                        int i44 = aM[4] - aL[0];
                                        int i45 = aM[5] - aL[1];
                                        int[] iArr10 = aL;
                                        iArr10[0] = iArr10[0] + i44;
                                        int[] iArr11 = aL;
                                        iArr11[1] = iArr11[1] + i45;
                                        b(0, fo, i44, i45);
                                        break;
                                    case 5:
                                        for (int i46 = 0; i46 < 3; i46++) {
                                            o oVar2 = f156a[i46];
                                            int i47 = fs + (i46 * fr);
                                            if (oVar2.Q) {
                                                if (a(oVar2.ap, 25)) {
                                                    a(oVar2.ap, oVar2.ap[4] < 10 * dy ? (18 * dy) - oVar2.ao[2] : 2 * dy, oVar2.ao[1], fp);
                                                }
                                                int i48 = oVar2.ap[4] - oVar2.ao[0];
                                                int[] iArr12 = oVar2.ao;
                                                iArr12[0] = iArr12[0] + i48;
                                                for (int i49 = i47; i49 < i47 + fr; i49++) {
                                                    Object[] objArr7 = c[i49];
                                                    ((int[]) objArr7[0])[1] = ((int[]) objArr7[0])[1] + i48;
                                                }
                                            } else {
                                                oVar2.cu += 25;
                                                if (oVar2.cu >= 3000) {
                                                    oVar2.cu = 0;
                                                    oVar2.Q = true;
                                                    for (int i50 = i47; i50 < i47 + fr; i50++) {
                                                        m49f(c[i50]);
                                                        int[] iArr13 = A[fd];
                                                        iArr13[2] = iArr13[2] + 1;
                                                        fc++;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 6:
                                        for (int i51 = 0; i51 < fo; i51++) {
                                            Object[] objArr8 = c[i51];
                                            int iM46c = m46c(objArr8);
                                            if (iM46c == 5 && aN[i51] > 0) {
                                                int[] iArr14 = aN;
                                                int i52 = i51;
                                                iArr14[i52] = iArr14[i52] - 25;
                                                if (aN[i51] <= 0) {
                                                    aN[i51] = 0;
                                                    h(objArr8, w(iM46c));
                                                    m49f(objArr8);
                                                    int[] iArr15 = A[fd];
                                                    iArr15[2] = iArr15[2] + 1;
                                                    fc++;
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                    }
                }
                H(25);
                V();
                h.k(25);
                if (ag) {
                    a(true, false, de == 1 || de == 2);
                    if (de == 1 || de == 3 || de == 4) {
                        cW += 5;
                        fd = 0;
                        if (de == 1) {
                            cX = cW;
                            aa = true;
                            dV = 5;
                        } else {
                            ag = false;
                        }
                    } else {
                        dh++;
                        dM++;
                        G(1000);
                        if (dh < 60) {
                            dg = 1;
                        } else if (dh == 60) {
                            dV = 6;
                            dg = 1;
                        } else if (dh == 61) {
                            fB = n() - fy;
                            dV = 7;
                            DCWall3D.cG = 0;
                        }
                    }
                }
                if (af) {
                    a(true, false, true);
                    aa = false;
                    fB = n() - fy;
                    if (de == 1) {
                        di = cW;
                    }
                    dV = 5;
                }
                aj = false;
                an = false;
            }
        }
        return dV;
    }

    public static final void b(int i2, int i3) {
        if (ab) {
            if ((i3 != 3 || i2 != 1) && (i3 != 0 || p.i(i2) != 53)) {
                f.m15b(i2, i3);
                return;
            }
            ab = false;
            p.L();
            p.k(9, 0);
            af();
        }
        int i4 = p.i(i2);
        if (i3 == 3) {
            if (i2 == 9) {
                dV = 4;
                return;
            }
            return;
        }
        if (i3 != 0) {
            if (i3 == 1) {
                switch (i4) {
                    case 52:
                        ah = false;
                        break;
                    case 54:
                        ai = false;
                        break;
                }
            }
            return;
        }
        if (cL <= 0) {
            switch (i4) {
                case 49:
                    if (Z && de == 2) {
                        eb = 8;
                        break;
                    }
                    break;
                case 50:
                    int iP = p();
                    if (iP > 1) {
                        cT--;
                        cU = -500;
                        if (cT < 0) {
                            cT = iP - 1;
                        }
                    }
                    break;
                case 52:
                    ah = true;
                    break;
                case 53:
                    aj = true;
                    break;
                case 54:
                    ai = true;
                    break;
                case 55:
                    if (Z) {
                        while (true) {
                            int i5 = eH + 1;
                            eH = i5;
                            if (i5 >= e.length) {
                                eH = 0;
                            }
                            if (e[eH] && eH != 22) {
                                h.h(eH);
                                break;
                            }
                        }
                    }
                    break;
                case 56:
                    int iP2 = p();
                    if (iP2 > 1) {
                        cT++;
                        cU = 500;
                        if (cT >= iP2) {
                            cT = 0;
                        }
                    }
                    break;
                case 57:
                    if (Z) {
                        e(b(fd, (20 * dy) / 2, true), b(fd, dz, false), eH);
                    }
                    break;
            }
        }
    }

    public static final void U() {
        ah = false;
        ai = false;
        aj = false;
    }

    private static void d(int i2, int i3, int i4) {
        if (dW >= 147) {
            new StringBuffer().append("NOTE: event queue is full and will be cleared ").append(i2).toString();
            V();
        }
        switch (i2 & 255) {
            case 10:
                int[] iArr = au;
                int i5 = dW;
                dW = i5 + 1;
                iArr[i5] = (i2 << 24) | (i2 >> 8);
                int[] iArr2 = au;
                int i6 = dW;
                dW = i6 + 1;
                iArr2[i6] = i3;
                au[dW] = i4;
                break;
            case 11:
            case 12:
            case 13:
            case 15:
            case 35:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                au[dW] = (i2 << 24) | ((i3 & 255) << 16) | (i4 & 65535);
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
            case 83:
            case 84:
            case 85:
                au[dW] = (i2 << 24) | ((i4 & 255) << 16) | (i3 & 65535);
                break;
        }
        dW++;
    }

    private static void V() {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < dW) {
            int i5 = au[i4] >> 24;
            int i6 = i5;
            switch (i5) {
                case 10:
                    int i7 = i4;
                    int i8 = i4 + 1;
                    i6 |= au[i7] << 8;
                    i4 = i8 + 1;
                    i2 = au[i8];
                    i3 = au[i4];
                    break;
                case 11:
                case 12:
                case 13:
                case 15:
                case 35:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                    i2 = (au[i4] >> 16) & 255;
                    i3 = au[i4] & 65535;
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
                case 83:
                case 84:
                case 85:
                    i2 = au[i4] & 65535;
                    i3 = (au[i4] >> 16) & 255;
                    break;
            }
            h.c(i6, i2, i3);
            i4++;
        }
        dW = 0;
    }

    public static void W() {
        h.j(2);
        dT = -1;
        dU = -1;
        X();
        h.o();
        Z();
        h.m21e(ed);
        aa();
        h.p();
        h.m(0);
        h.y();
        int i2 = -1;
        switch (de) {
            case 1:
                if (ds == 0) {
                    i2 = 1;
                }
                break;
            case 2:
                if (dq == 0) {
                    i2 = 0;
                }
                break;
            case 3:
                i2 = 26;
                break;
            case 4:
                i2 = 27;
                break;
        }
        if (i2 != -1) {
            b(i2, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:366:0x0e5e  */
    /* JADX WARN: Code duplicated, block: B:396:0x0fcf  */
    /* JADX WARN: Code duplicated, block: B:438:0x1173  */
    /* JADX WARN: Code duplicated, block: B:440:0x1189  */
    /* JADX WARN: Code duplicated, block: B:564:0x1733  */
    /* JADX WARN: Code duplicated, block: B:578:0x178c  */
    /* JADX WARN: Code duplicated, block: B:580:0x1792  */
    /* JADX WARN: Code duplicated, block: B:582:0x179e  */
    /* JADX WARN: Code duplicated, block: B:884:0x1193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:922:0x19a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:923:0x19a7 A[SYNTHETIC] */
    private static void H(int i2) {
        int i3;
        int i4;
        int i5;
        int iMax;
        int iMin;
        int i6;
        boolean z2;
        int i7;
        am = ee == 0;
        ee = Math.min(ee + i2, ed);
        if (cU != 0) {
            if (cU > 0) {
                cU = Math.max(0, cU - i2);
            } else {
                cU = Math.min(0, cU + i2);
            }
        }
        if (eb != ec) {
            d(40, eb, ed);
        }
        ec = eb;
        switch (eb) {
            case 1:
                X();
                break;
            case 2:
                break;
            case 3:
                aa();
                return;
            case 4:
                cT = Math.max(0, Math.min(p() - 1, cT));
                cV = Math.max(0, cV - i2);
                boolean z3 = true;
                for (int i8 = 0; i8 < 3; i8++) {
                    if (r[i8][1] == 18 || r[i8][1] == 17) {
                        z3 = false;
                    }
                }
                if (z3 && aj) {
                    an = true;
                    if (p() > 0) {
                        int iL = l(cT);
                        for (int i9 = 0; i9 < 1; i9++) {
                            if (an) {
                                boolean z4 = true;
                                switch (iL) {
                                    case 4:
                                        if (f147f[4] && an && w[0][0] == 0) {
                                            f147f[4] = false;
                                            ah();
                                            eL = 3000;
                                            w[0][0] = 1;
                                            h.g(1200);
                                            h.aZ = 1500;
                                        }
                                        break;
                                    case 5:
                                        if (f147f[5] && an && x[0][0] == 0) {
                                            f147f[5] = false;
                                            x[0][0] = 1;
                                            x[0][5] = 0;
                                            x[0][1] = q[0][4] + (q[0][14] / 2);
                                            x[0][3] = q[0][5] - dz;
                                            x[0][2] = x[0][1];
                                            x[0][4] = 0;
                                            x[0][6] = 0;
                                            z4 = false;
                                        }
                                        break;
                                    case 6:
                                        if (f147f[6] && an) {
                                            f147f[6] = false;
                                            if (eN == 0) {
                                                eN = 1;
                                                eO = 1600;
                                                eP = 0;
                                                dI++;
                                                M(6);
                                            }
                                        }
                                        break;
                                    case 11:
                                        if (f147f[11] && an && z[0][0] == 0) {
                                            f147f[11] = false;
                                            z[0][0] = 1;
                                            z[0][6] = 1;
                                            z[0][1] = q[0][4] + (q[0][14] / 2);
                                            z[0][2] = q[0][5] - dz;
                                            z[0][3] = z[0][2];
                                            z[0][4] = eU;
                                            z[0][5] = 3000;
                                            z[0][7] = 0;
                                            z4 = false;
                                        }
                                        break;
                                    case 12:
                                        if (f147f[12] && an && eS == 0) {
                                            f147f[12] = false;
                                            eS = 1;
                                            eT = 2000;
                                        }
                                        break;
                                    case 13:
                                        if (f147f[13] && an && eJ == 0) {
                                            ak();
                                            ao = true;
                                            f147f[13] = false;
                                        }
                                        break;
                                    case 23:
                                        if (f147f[23] && an && da <= 0) {
                                            f147f[23] = false;
                                            da = 1000;
                                        }
                                        break;
                                }
                                if (z4) {
                                }
                            }
                        }
                    }
                }
                for (int i10 = 0; i10 < em; i10++) {
                    if (s[i10][1] == 1) {
                        int[] iArr = q[0];
                        int[] iArr2 = s[i10];
                        if (iArr == null || iArr2 == null) {
                            z2 = false;
                        } else {
                            int i11 = iArr[4];
                            int i12 = iArr[5];
                            int i13 = iArr[14] + i11;
                            int i14 = iArr[15] + i12;
                            int i15 = iArr2[4] - (iArr2[14] / 2);
                            int i16 = iArr2[5] - (iArr2[15] / 2);
                            z2 = i15 <= i13 && iArr2[14] + i15 >= i11 && i16 <= i14 && iArr2[15] + i16 >= i12;
                        }
                        if (z2) {
                            int i17 = i10;
                            boolean z5 = false;
                            if (s[i17][2] == 21) {
                                s[i17][2] = a(false);
                                z5 = true;
                            }
                            int i18 = s[i17][2];
                            int i19 = i18;
                            switch (i18) {
                                case 0:
                                    ei = 6;
                                    break;
                                case 1:
                                    ei = 12;
                                    break;
                                case 2:
                                    int i20 = 0;
                                    for (int i21 = 0; i21 < 3; i21++) {
                                        if (r[i21][1] != 0) {
                                            i20 = i21;
                                            int i22 = 0;
                                            for (i7 = 0; i7 < 3; i7++) {
                                                if (i7 == i20 && r[i7][1] == 0) {
                                                    r[i7][4] = q[0][4] + q[0][14];
                                                    r[i7][5] = q[0][5] - 330;
                                                    if (r[i7][4] - 195 < 0) {
                                                        System.out.println("safety check");
                                                        r[i7][4] = 196;
                                                    } else if (r[i7][4] + 195 >= dy * 20) {
                                                        System.out.println("safety check");
                                                        r[i7][4] = ((dy * 20) - 195) - 1;
                                                    }
                                                    int i23 = (-64) + (i22 << 7);
                                                    int iS = (s(i23) << 4) >> 8;
                                                    int i24 = ((-t(i23)) << 4) >> 8;
                                                    r[i7][1] = 16;
                                                    r[i7][6] = ((iS * ej) * ei) >> 11;
                                                    r[i7][7] = ((i24 * ej) * ei) >> 11;
                                                    g[i7] = false;
                                                    i22++;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    int i25 = 0;
                                    while (i7 < 3) {
                                        if (i7 == i20) {
                                        }
                                    }
                                    break;
                                case 3:
                                    ap = true;
                                    break;
                                case 4:
                                    f147f[4] = true;
                                    break;
                                case 5:
                                    f147f[5] = true;
                                    break;
                                case 6:
                                    f147f[6] = true;
                                    break;
                                case 7:
                                    eQ = 1;
                                    break;
                                case 10:
                                    eW = 5000;
                                    break;
                                case 11:
                                    f147f[11] = true;
                                    break;
                                case 12:
                                    if (!f147f[12]) {
                                        f147f[12] = true;
                                        for (int i26 = 0; i26 < 3; i26++) {
                                            if (r[i26][1] != 0) {
                                                g[i26] = true;
                                            }
                                        }
                                    }
                                    break;
                                case 13:
                                    f147f[13] = true;
                                    break;
                                case 14:
                                    eX = 6000;
                                    break;
                                case 15:
                                    eZ = 2;
                                    eY = 10000;
                                    break;
                                case 16:
                                    eZ = 4;
                                    eY = 10000;
                                    break;
                                case 17:
                                    if (cP < 4) {
                                        cP++;
                                        int i27 = (2220 - q[0][14]) / 2;
                                        int[] iArr3 = q[0];
                                        iArr3[4] = iArr3[4] - 138;
                                        q[0][14] = 1380 + (((cP * 1380) * 20) / 100);
                                        int[] iArr4 = q[1];
                                        iArr4[4] = iArr4[4] - i27;
                                        q[1][14] = q[0][14];
                                    }
                                    break;
                                case 18:
                                    int i28 = (q[0][14] - 820) / 2;
                                    int[] iArr5 = q[0];
                                    iArr5[4] = iArr5[4] + i28;
                                    q[0][14] = 820;
                                    int[] iArr6 = q[1];
                                    iArr6[4] = iArr6[4] + i28;
                                    q[1][14] = 820;
                                    for (int i29 = 0; i29 < 3; i29++) {
                                        if (r[i29][1] == 17 || r[i29][1] == 18) {
                                            if (r[i29][9] < 0) {
                                                r[i29][9] = 0;
                                            }
                                            if (r[i29][9] > 820) {
                                                r[i29][9] = 820;
                                            }
                                        }
                                    }
                                    break;
                                case 19:
                                    eo++;
                                    dO++;
                                    M(3);
                                    break;
                                case 20:
                                    fa = 10000;
                                    break;
                                case 23:
                                    f147f[23] = true;
                                    break;
                                case 24:
                                    db = 8000;
                                    dc = 1;
                                    break;
                                case 25:
                                    dd = 8000;
                                    break;
                                case 26:
                                    eV = 15000;
                                    break;
                            }
                            for (int i30 = 0; i30 < aw.length; i30++) {
                                int[] iArr7 = aw;
                                int i31 = i30;
                                iArr7[i31] = iArr7[i31] + 1;
                            }
                            aw[i19] = 0;
                            d(10 | (s[i17][2] << 8), s[i17][4], s[i17][5]);
                            dB++;
                            s[i17][1] = 0;
                            int i32 = 0;
                            if (z5) {
                                i19 = 21;
                            }
                            switch (i19) {
                                case 0:
                                    i32 = 7;
                                    break;
                                case 1:
                                    i32 = 8;
                                    break;
                                case 2:
                                    i32 = 28;
                                    break;
                                case 3:
                                    i32 = 11;
                                    break;
                                case 4:
                                    i32 = 2;
                                    break;
                                case 5:
                                    i32 = 6;
                                    break;
                                case 6:
                                    i32 = 3;
                                    break;
                                case 7:
                                    i32 = 5;
                                    break;
                                case 10:
                                    i32 = 4;
                                    break;
                                case 11:
                                    i32 = 9;
                                    break;
                                case 12:
                                    i32 = 13;
                                    break;
                                case 13:
                                    i32 = 14;
                                    break;
                                case 14:
                                    i32 = 15;
                                    break;
                                case 15:
                                    i32 = 16;
                                    break;
                                case 16:
                                    i32 = 17;
                                    break;
                                case 17:
                                    i32 = 18;
                                    break;
                                case 18:
                                    i32 = 19;
                                    break;
                                case 19:
                                    i32 = 21;
                                    break;
                                case 20:
                                    i32 = 22;
                                    break;
                                case 21:
                                    i32 = 23;
                                    break;
                                case 23:
                                    i32 = 29;
                                    break;
                                case 24:
                                    i32 = 30;
                                    break;
                                case 25:
                                    i32 = 31;
                                    break;
                                case 26:
                                    i32 = 32;
                                    break;
                            }
                            b(i32, true);
                        }
                    }
                }
                if (p() >= 2) {
                    b(40, true);
                }
                for (int i33 = 0; i33 < 3; i33++) {
                    if (r[i33][1] != 0) {
                        for (int i34 = 0; i34 < 2; i34++) {
                            if (q[i34][1] != 0 && da <= 100 && r[i33][1] != 17 && a(r[i33], q[i34], i2, false)) {
                                d(12, i33, i34);
                            }
                        }
                    }
                }
                boolean z6 = false;
                for (int i35 = 0; i35 < 3; i35++) {
                    if (r[i35][1] != 0 && r[i35][1] != 17 && a(r[i35], (int[]) null, i2, true)) {
                        z6 = true;
                        J(i35);
                    }
                }
                for (int i36 = 0; i36 < 2; i36++) {
                    a(q[i36], i36, i2);
                }
                for (int i37 = 0; i37 < 3; i37++) {
                    if (r[i37][1] != 0) {
                        int iSqrt = sqrt((r[i37][6] * r[i37][6]) + (r[i37][7] * r[i37][7]));
                        int i38 = ei * ej;
                        int i39 = i38;
                        if (i38 > 8 * dx * 20) {
                            i39 = 8 * dx * 20;
                        }
                        if (iSqrt != 0) {
                            r[i37][6] = ((i39 * r[i37][6]) / iSqrt) >> 3;
                            r[i37][7] = ((i39 * r[i37][7]) / iSqrt) >> 3;
                        }
                        if (Math.abs(r[i37][7]) < 250) {
                            if (r[i37][7] == 0) {
                                r[i37][7] = 1;
                            }
                            r[i37][7] = 250 * (r[i37][7] / Math.abs(r[i37][7]));
                        }
                    }
                }
                for (int i40 = 0; i40 < 3; i40++) {
                    a(r[i40], i40, i2);
                }
                for (int i41 = 0; i41 < em; i41++) {
                    a(s[i41], i41, i2);
                }
                if (fg == 1 && !z6) {
                    for (int i42 = 0; i42 < 3; i42++) {
                        if (r[i42][1] != 0 && r[i42][1] != 17 && a(r[i42], (int[]) null, i2, true)) {
                            J(i42);
                        }
                    }
                }
                if (eb != 9 && eb != 7) {
                    for (int i43 = 0; i43 < 27; i43++) {
                        for (int i44 = 0; i44 < 1; i44++) {
                            int i45 = i44;
                            boolean z7 = false;
                            switch (i43) {
                                case 4:
                                    if (w[i45][0] == 1) {
                                        w[i45][1] = q[0][4] + (q[0][14] >> 1);
                                        w[i45][2] = q[0][5];
                                        if (ff == 1) {
                                            w[i45][3] = 1;
                                        } else {
                                            w[i45][3] = q[1][5];
                                        }
                                        int i46 = (int) (h.f111f / 2.0f);
                                        int i47 = A[fd][7];
                                        int i48 = A[fd][1];
                                        int i49 = -1;
                                        int i50 = 0;
                                        for (int i51 = i47; i51 < i47 + i48; i51++) {
                                            Object[] objArr = c[i51];
                                            if (m44a(objArr)) {
                                                int i52 = ((int[]) objArr[0])[1];
                                                int i53 = ((int[]) objArr[0])[2];
                                                int iH = i52 + h(objArr);
                                                int i54 = i53 + i(objArr);
                                                int i55 = w[i45][1] - i46;
                                                do {
                                                    if (b(i52, i54, iH, i54, i55, w[i45][3], w[i45][2]) && i54 > i50) {
                                                        i50 = i54;
                                                        i49 = i51;
                                                    }
                                                    i6 = i55 + ((dy << 2) / 5);
                                                    i55 = i6;
                                                } while (i6 < w[i45][1] + i46);
                                            }
                                        }
                                        if (i49 != -1) {
                                            z7 = true;
                                            u[0][7] = (i49 << 16) | 5;
                                            u[0][2] = i50;
                                        }
                                        if (z7) {
                                            w[i45][3] = u[0][2];
                                            w[i45][5] = 1;
                                        } else {
                                            w[i45][5] = 0;
                                        }
                                    }
                                    break;
                                case 5:
                                    if (x[i45][0] == 1 && x[i45][5] != 1) {
                                        int i56 = x[i45][1];
                                        int i57 = x[i45][2];
                                        int i58 = dy;
                                        int i59 = i57 > i56 ? 1 : -1;
                                        int i60 = i56;
                                        do {
                                            int iD = d(i60 / dy, (x[i45][3] - A[fd][4]) / dz);
                                            int i61 = iD & 65535;
                                            if (i61 > 2) {
                                                x[i45][0] = 0;
                                                x[i45][5] = 1;
                                                x[i45][6] = i61 < 5 ? -1 : (iD >> 16) & 65535;
                                                z7 = true;
                                            } else {
                                                int i62 = i60 + (i59 * i58);
                                                iMin = i59 == 1 ? Math.min(i62, i57) : Math.max(i62, i57);
                                                i60 = iMin;
                                            }
                                            if (z7) {
                                                x[i45][2] = i60;
                                            }
                                            break;
                                        } while (iMin != i57);
                                        if (z7) {
                                            x[i45][2] = i60;
                                        }
                                    }
                                    break;
                                case 7:
                                    if (eQ == 2) {
                                        eQ = 0;
                                        z7 = true;
                                    }
                                    break;
                                case 11:
                                    boolean z8 = z[0][0] == 1;
                                    int i63 = z[0][6];
                                    if (!z8 && f147f[11] && l(cT) == 11) {
                                        z[i45][1] = q[0][4] + (q[0][14] / 2);
                                        z[i45][2] = q[0][5] - 1;
                                        z[i45][3] = A[fd][4] + dz + q[0][15] + 1;
                                        if (a(u[0], z[i45][1], z[i45][2], z[i45][1], z[i45][3], false)) {
                                            z[i45][3] = u[0][2];
                                        }
                                    }
                                    if (i63 == 1) {
                                        int i64 = z[i45][2];
                                        int i65 = z[i45][3];
                                        int i66 = -dz;
                                        int i67 = i64 + dz;
                                        do {
                                            int iE = e(z[i45][1], i67 - A[fd][4]);
                                            int i68 = iE & 65535;
                                            if (i68 == 0 || i68 <= 4) {
                                                iMax = Math.max(i67 + i66, i65);
                                                i67 = iMax;
                                            } else {
                                                z[i45][6] = 3;
                                                z[i45][0] = 0;
                                                z[i45][7] = i68 < 5 ? -1 : (iE >> 16) & 65535;
                                                z7 = true;
                                            }
                                            if (z7) {
                                                z[i45][3] = i67;
                                            }
                                            break;
                                        } while (iMax != i65);
                                        if (z7) {
                                            z[i45][3] = i67;
                                        }
                                    }
                                    break;
                                case 12:
                                    if (eS == 2) {
                                        eS = 0;
                                        z7 = true;
                                    }
                                    break;
                                case 13:
                                    for (int i69 = 0; i69 < v.length; i69++) {
                                        if (v[i69][3] == 1) {
                                            int i70 = v[i69][0];
                                            int i71 = v[i69][1];
                                            int iO = v[i69][0] - (o(i69) * i2);
                                            int iP = v[i69][1] - (p(i69) * i2);
                                            if (i70 <= 0 || i70 >= 20 * dy || i71 <= 0) {
                                                v[i69][3] = 2;
                                            } else {
                                                int i72 = A[fd][7];
                                                int i73 = A[fd][1];
                                                for (int i74 = i72; i74 < i72 + i73; i74++) {
                                                    Object[] objArr2 = c[i74];
                                                    if (m44a(objArr2)) {
                                                        int i75 = ((int[]) objArr2[0])[1];
                                                        int i76 = ((int[]) objArr2[0])[2];
                                                        int iH2 = i75 + h(objArr2);
                                                        int i77 = i76 + i(objArr2);
                                                        if (b(i70, i71, iO, iP, i75, i76, i77) || b(i70, i71, iO, iP, iH2, i76, i77)) {
                                                            v[i69][3] = 2;
                                                            if (m46c(c[i74]) != 2) {
                                                                m39a(5, i74, 6, false);
                                                            }
                                                        } else {
                                                            int iMin2 = Math.min(i71, iP);
                                                            int iMax2 = Math.max(i71, iP);
                                                            boolean z9 = iMax2 > i77 && iMin2 < i77 && iMin2 != iMax2 && (i5 = i70 + (((iO - i70) * (i77 - i71)) / (iP - i71))) > Math.min(i75, iH2) && i5 < Math.max(i75, iH2);
                                                            if (z9) {
                                                                v[i69][3] = 2;
                                                                if (m46c(c[i74]) != 2) {
                                                                    m39a(5, i74, 6, false);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                            }
                            if (z7) {
                                int i78 = i44;
                                switch (i43) {
                                    case 4:
                                        boolean z10 = false;
                                        int i79 = (u[0][7] >> 16) & 65535;
                                        if (i79 != w[i78][7]) {
                                            w[i78][4] = 1;
                                            w[i78][5] = 1;
                                            w[i78][7] = i79;
                                        } else if (w[i78][6] == 0) {
                                            w[i78][5] = 0;
                                            w[i78][7] = -1;
                                            z10 = true;
                                        }
                                        if (z10) {
                                            m39a(u[0][7] & 65535, (u[0][7] >> 16) & 65535, 2, true);
                                        }
                                        break;
                                    case 5:
                                        int i80 = x[i78][6];
                                        if (i80 < c.length) {
                                            a(g(c[i80]), j(c[i80]), 2, true);
                                        }
                                        break;
                                    case 7:
                                        Object[] objArr3 = c[eR];
                                        int iM47d = m47d(objArr3);
                                        int iM46c = m46c(objArr3);
                                        int i81 = A[fd][7];
                                        int i82 = A[fd][1];
                                        for (int i83 = i81; i83 < i82 + i81; i83++) {
                                            Object[] objArr4 = c[i83];
                                            if (m44a(objArr4) && m47d(objArr4) == iM47d && m46c(objArr4) == iM46c) {
                                                m39a(5, i83, 4, false);
                                            }
                                        }
                                        break;
                                    case 11:
                                        int i84 = z[i78][7];
                                        if (i84 < c.length) {
                                            int i85 = ((int[]) c[i84][0])[1];
                                            int i86 = ((int[]) c[i84][0])[2];
                                            int i87 = 0;
                                            int i88 = 2 * dy;
                                            int i89 = i86 + dz;
                                            while (true) {
                                                int i90 = i89;
                                                if (i90 <= (-dz)) {
                                                    h.aZ = 500;
                                                    h.g(500);
                                                    h.a(1, (int) h.c(z[0][1]), 0, (int) h.c(z[0][3]), 1, 1);
                                                } else {
                                                    int i91 = i87;
                                                    while (true) {
                                                        int i92 = i91;
                                                        if (i92 < i88) {
                                                            int iE2 = e(i92 + i85, i90);
                                                            int i93 = iE2 & 65535;
                                                            if (i93 > 4) {
                                                                int i94 = (i89 - i90) / (dz * 3);
                                                                int iMin3 = Math.min(20, i94);
                                                                int i95 = (iE2 >> 16) & 65535;
                                                                Object[] objArr5 = c[i95];
                                                                if (m46c(objArr5) == 2) {
                                                                    i87 = i88;
                                                                } else if (i94 == 0) {
                                                                    m39a(i93, i95, 5, true);
                                                                } else {
                                                                    g(objArr5, 1);
                                                                    f(objArr5, iMin3);
                                                                    c[i95] = objArr5;
                                                                }
                                                            }
                                                            i91 = i92 + dy;
                                                        }
                                                    }
                                                    i89 = i90 - dz;
                                                }
                                            }
                                        }
                                        break;
                                    case 12:
                                        for (int i96 = 0; i96 < 3; i96++) {
                                            if (r[i96][1] != 0 && g[i96]) {
                                                a(m(i96) / dy, n(i96) / dz, 4, true);
                                                h.a(1, (int) h.c(m(i96)), 0, (int) h.d(n(i96)), 1, 1);
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    for (int i97 = 0; i97 < 27; i97++) {
                        for (int i98 = 0; i98 < 1; i98++) {
                            int i99 = i98;
                            switch (i97) {
                                case 4:
                                    if (w[i99][0] == 1) {
                                        if (w[i99][5] == 1) {
                                            if (w[i99][4] == 1) {
                                                w[i99][6] = m46c(c[w[i99][7]]) == 2 ? 2000 : 250;
                                            } else {
                                                w[i99][6] = Math.max(0, w[i99][6] - i2);
                                            }
                                            w[i99][4] = 0;
                                        }
                                        if (i99 == 0) {
                                            eL -= i2;
                                        }
                                    }
                                    if (eL <= 0) {
                                        w[i99][0] = 0;
                                    }
                                    break;
                                case 5:
                                    boolean z11 = x[i99][0] == 1;
                                    int i100 = x[i99][5];
                                    if (z11 && i100 == 0) {
                                        x[i99][1] = x[i99][2];
                                        int[] iArr8 = x[i99];
                                        iArr8[2] = iArr8[2] + ((x[i99][4] * i2) >> 10);
                                        int[] iArr9 = x[i99];
                                        iArr9[3] = iArr9[3] + ((eM * i2) >> 10);
                                        int i101 = (x[i99][1] - (q[0][4] + (q[0][14] / 2))) / dy;
                                        int[] iArr10 = x[i99];
                                        iArr10[4] = iArr10[4] + ((i101 > 0 ? -1 : 1) * ((((i101 << 8) * i101) * i2) >> 10));
                                    }
                                    break;
                                case 6:
                                    K(i2);
                                    break;
                                case 10:
                                    eW = Math.max(0, eW - i2);
                                    break;
                                case 11:
                                    if (z[i99][0] == 1 && z[i99][6] == 1) {
                                        z[i99][2] = z[i99][3];
                                        int[] iArr11 = z[i99];
                                        iArr11[3] = iArr11[3] + ((z[i99][4] * i2) >> 10);
                                        int[] iArr12 = z[i99];
                                        iArr12[4] = iArr12[4] + ((i2 * (-5000)) >> 10);
                                        int[] iArr13 = z[i99];
                                        iArr13[5] = iArr13[5] - i2;
                                        if (z[i99][5] < 0) {
                                            z[i99][6] = 3;
                                            z[i99][0] = 0;
                                        }
                                    }
                                    break;
                                case 12:
                                    int i102 = eS;
                                    boolean z12 = false;
                                    for (int i103 = 0; i103 < 3; i103++) {
                                        if (r[i103][1] != 0 && g[i103]) {
                                            z12 = true;
                                            if (!z12) {
                                                f147f[12] = false;
                                            }
                                            if (!f147f[12] && eS == 0) {
                                                for (int i104 = 0; i104 < 3; i104++) {
                                                    if (r[i104][1] != 0 && g[i104]) {
                                                        y[i104][0] = r[i104][4];
                                                        y[i104][1] = r[i104][5];
                                                    }
                                                }
                                            } else if (i102 == 1) {
                                                i4 = eT - i2;
                                                eT = i4;
                                                if (i4 < 0) {
                                                    eS = 2;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    if (!z12) {
                                        f147f[12] = false;
                                    }
                                    if (!f147f[12]) {
                                        if (i102 == 1) {
                                            i4 = eT - i2;
                                            eT = i4;
                                            if (i4 < 0) {
                                                eS = 2;
                                            }
                                        }
                                    } else if (i102 == 1) {
                                        i4 = eT - i2;
                                        eT = i4;
                                        if (i4 < 0) {
                                            eS = 2;
                                        }
                                    }
                                    break;
                                case 13:
                                    boolean z13 = false;
                                    for (int i105 = 0; i105 < v.length; i105++) {
                                        if (v[i105][3] == 1) {
                                            int[] iArr14 = v[i105];
                                            iArr14[0] = iArr14[0] + (o(i105) * i2);
                                            int[] iArr15 = v[i105];
                                            iArr15[1] = iArr15[1] + (p(i105) * i2);
                                            z13 = true;
                                        }
                                    }
                                    eJ = Math.max(0, Math.min(900, eJ + (ao ? i2 : -i2)));
                                    if (!z13 && eK == 35 && ao) {
                                        ao = false;
                                    } else if (eJ >= 900) {
                                        for (int i106 = 0; i106 < aC.length; i106++) {
                                            int[] iArr16 = aC;
                                            int i107 = i106;
                                            iArr16[i107] = iArr16[i107] + i2;
                                            int[] iArr17 = aB;
                                            int i108 = i106;
                                            iArr17[i108] = iArr17[i108] + i2;
                                            if (aB[i106] >= 60) {
                                                int[] iArr18 = aB;
                                                int i109 = i106;
                                                iArr18[i109] = iArr18[i109] - 60;
                                                int i110 = i106;
                                                if (eK < 35) {
                                                    v[eK][3] = 1;
                                                    int i111 = q[0][4] + (i110 == 1 ? q[0][14] : 0);
                                                    int i112 = q[0][5];
                                                    v[eK][0] = i111;
                                                    v[eK][1] = i112;
                                                    v[eK][2] = q(i110);
                                                    eK++;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 14:
                                    aq = eX / 300 != (eX - i2) / 300;
                                    int iMax3 = Math.max(0, eX - i2);
                                    eX = iMax3;
                                    if (iMax3 == 0) {
                                        aq = false;
                                    }
                                    break;
                                case 15:
                                case 16:
                                    int iMax4 = Math.max(0, eY - i2);
                                    eY = iMax4;
                                    if (iMax4 == 0) {
                                        eZ = 1;
                                    }
                                    break;
                                case 20:
                                    fa = Math.max(0, fa - i2);
                                    break;
                                case 23:
                                    da = Math.max(0, da - i2);
                                    break;
                                case 24:
                                    db = Math.max(0, db - i2);
                                    break;
                                case 25:
                                    dd = Math.max(0, dd - i2);
                                    m += ((dd > 0 ? 1.0f : -1.0f) * i2) / 1000.0f;
                                    m = Math.min(Math.max(0.0f, m), 1.0f);
                                    break;
                                case 26:
                                    eV = Math.max(0, eV - i2);
                                    break;
                            }
                        }
                    }
                    int i113 = A[fd][7];
                    int i114 = A[fd][1];
                    for (int i115 = i113; i115 < i113 + i114; i115++) {
                        Object[] objArr6 = c[i115];
                        if (m44a(objArr6) && e(objArr6) == 2) {
                            m39a(5, i115, 5, false);
                        }
                    }
                }
                if (de != 2) {
                    if (r[q()][1] != 18) {
                        cR += i2;
                    }
                    if (cS > bD[df - 1] || cR < bA[df - 1] + bB[df - 1]) {
                        cS = 0;
                    } else {
                        cS += i2;
                        I(dP + bC[df - 1]);
                        cR = bA[df - 1];
                    }
                }
                ew = Math.max(0, Math.min(999, ew + ey));
                ey = 0;
                if (ae && r[0][1] != 18) {
                    ew = Math.max(0, ew - 1);
                    if (de == 3 && ew == 0) {
                        d(33, 0, 0);
                        eb = 9;
                        ed = 1000;
                        ee = 0;
                    }
                }
                if (de == 2 && fg == 1 && !ad) {
                    ad = true;
                    b(33 + fn, true);
                    cV = 2500;
                    h.i(fn);
                    h.aZ = 2000;
                }
                if (ed == 0 || ee != ed || fe == 0) {
                    return;
                }
                if (fe == 1 || fe == 2) {
                    ei = ek;
                }
                fe = 0;
                if (fg == 1) {
                    b(33 + fn, true);
                    cV = 2500;
                    h.i(fn);
                    h.aZ = 2000;
                    dK++;
                } else if (fg == 3) {
                    b(25, true);
                    h.i(7);
                    dJ++;
                }
                M(2);
                M(7);
                if (ff == 2) {
                    d(74, 0, 0);
                    return;
                }
                return;
            case 5:
                switch (fe) {
                    case 1:
                        fd = (fd + 1) % fb;
                        M(5);
                        M(20);
                        M(19);
                        if (de == 3 && fd > ex) {
                            ex = fd;
                            ey += eD;
                            eF += eD;
                            d(84, ed, eD);
                        }
                        break;
                    case 2:
                        fd = (fd - 1) % fb;
                        break;
                    case 3:
                        fd = fh;
                        e(true);
                        break;
                    case 4:
                        fh = fd;
                        fd = fb;
                        e(true);
                        break;
                }
                a(fd, fe == 3);
                a(false, fg == 1, false);
                if (de != 2 && (fe == 1 || fe == 2)) {
                    if (de == 1 && f146do < (i3 = cW + fd)) {
                        f146do = i3;
                    }
                    ek = ei;
                    ei = 1;
                }
                q[0][5] = A[fd][4] + (dz << 4);
                if (ff != 2) {
                    q[1][1] = 0;
                }
                eb = 4;
                ed = Math.max(1, ed - i2);
                ee = 0;
                return;
            case 6:
            case 10:
            case 13:
            default:
                return;
            case 7:
                if (de == 1 && df == 4) {
                    g.a().d(fd);
                }
                if (am) {
                    a(true, false, true);
                }
                if (ee == ed) {
                    eb = 3;
                    return;
                }
                return;
            case 8:
                if (de == 1 && df == 4) {
                    g.a().d(fd);
                }
                if (ee == ed) {
                    if (de != 2) {
                        g.a().m();
                        if (de == 1) {
                            eb = 1;
                        } else if (de == 3) {
                            eb = 2;
                            ed = 1000;
                            ee = 0;
                        } else {
                            fe = 1;
                            eb = 2;
                            ed = 1000;
                            ee = 0;
                        }
                        ag = true;
                    } else {
                        eb = 1;
                        ag = true;
                    }
                    o();
                    return;
                }
                return;
            case 9:
                if (ee == ed) {
                    if (de != 2) {
                        g.a().m();
                    }
                    eb = 1;
                    af = true;
                    dV = 5;
                    return;
                }
                return;
            case 11:
                if (ee == ed) {
                    eb = ef;
                    ed = eg;
                    ee = 0;
                    ef = 4;
                    eg = 0;
                    ab();
                    return;
                }
                return;
            case 12:
                K(i2);
                if (ee == ed) {
                    eP = 0;
                    eb = 11;
                    ed = 3300;
                    ee = 0;
                    fe = 3;
                    ef = 5;
                    eg = 250;
                    return;
                }
                return;
            case 14:
                int i116 = cY + i2;
                cY = i116;
                if (i116 > 1000) {
                    ad();
                    for (int i117 = 0; i117 < 3; i117++) {
                        r[i117][16] = -1;
                        r[i117][5] = (dz << 4) - dz;
                        r[i117][7] = -Math.abs(r[0][7]);
                    }
                    fe = 1;
                    eb = 5;
                    ed = 1000;
                    ee = 0;
                    cY = 0;
                    H(1);
                    return;
                }
                return;
            case 15:
                int i118 = cY + i2;
                cY = i118;
                if (i118 > 1000) {
                    for (int i119 = 0; i119 < 3; i119++) {
                        r[i119][16] = -1;
                        r[i119][5] = dz;
                        r[i119][7] = Math.abs(r[0][7]);
                    }
                    ad();
                    fe = 2;
                    System.out.println(new StringBuffer().append("scrollState ").append(fe).toString());
                    eb = 5;
                    ed = 1000;
                    ee = 0;
                    cY = 0;
                    H(1);
                    return;
                }
                return;
            case 16:
                int i120 = cY + i2;
                cY = i120;
                if (i120 > 1000) {
                    cY = 0;
                    fe = 4;
                    ef = 5;
                    eb = 5;
                    eg = 1000;
                    ed = 1000;
                    ee = 0;
                    b(24, true);
                    return;
                }
                return;
            case 17:
                int i121 = cY + i2;
                cY = i121;
                if (i121 > 1000) {
                    fe = 3;
                    eb = 5;
                    ed = 250;
                    ee = 0;
                    cY = 0;
                    return;
                }
                return;
        }
        Z();
    }

    private static void X() {
        switch (de) {
            case 1:
                em = 1;
                break;
            case 2:
                em = 1;
                break;
            case 3:
                em = 2;
                break;
            case 4:
                em = 2;
                break;
        }
        if (de == 1) {
            int i2 = 0;
            while (i2 < at.length && dP > at[i2]) {
                i2++;
            }
            df = Math.min(i2 + 1, 4);
            if (f146do < 0) {
                f146do = 0;
            }
        }
        int i3 = 0;
        if (de != 2) {
            switch (de) {
                case 1:
                    if (df == 1) {
                        i3 = 12;
                    } else if (df != 2) {
                        i3 = df != 3 ? 16 : 14;
                    } else {
                        i3 = 13;
                    }
                    break;
                case 3:
                    if (df == 1) {
                        i3 = 13;
                    } else if (df != 2) {
                        i3 = df != 3 ? 15 : 15;
                    } else {
                        i3 = 14;
                    }
                    break;
                case 4:
                    i3 = (df != 1 && df != 2 && df != 3) ? 17 : 15;
                    break;
            }
        } else {
            i3 = 15;
        }
        ej = ((i3 * dx) * 100) / 100;
        ah();
        ag();
        eS = 0;
        eT = 0;
        aj();
        ap = false;
        aq = false;
        eX = 0;
        am();
        eV = 0;
        da = 0;
        db = 0;
        dd = 0;
        m = 0.0f;
        eW = 0;
        al();
        ak();
        eZ = 1;
        eY = 0;
        ai();
        cR = 0;
        cS = 0;
        ad = false;
        e(true);
        b.removeAllElements();
        if (de != 2) {
            g.a().j();
        }
        ef = 4;
        eg = 0;
        fe = 0;
        switch (df) {
            case 1:
                ew = 400;
                ez = 4;
                eA = 3;
                eB = 40;
                eC = 100;
                eE = 60;
                eD = 40;
                break;
            case 2:
                ew = 400;
                ez = 4;
                eA = 3;
                eB = 40;
                eC = 100;
                eE = 60;
                eD = 40;
                break;
            case 3:
                ew = 560;
                ez = 4;
                eA = 3;
                eB = 60;
                eC = 140;
                eE = 80;
                eD = 40;
                break;
            case 4:
                ew = 600;
                ez = 4;
                eA = 3;
                eB = 60;
                eC = 140;
                eE = 100;
                eD = 40;
                break;
        }
        eF = 0;
    }

    public static final void Y() {
        dg = 1;
    }

    private static final void I(int i2) {
        if (de == 1) {
            dP = Math.max(0, Math.min(dR, i2));
        }
    }

    private static void Z() {
        af = false;
        ag = false;
        aa = false;
        ex = 0;
        ek = 0;
        if (de != 2) {
            boolean z2 = (de == 4 || de == 3) ? false : true;
            boolean z3 = z2;
            int i2 = z2 ? 4 : 5;
            int iA = 0;
            if (z3) {
                iA = f(4, el);
            }
            int iB = g.a().b();
            int iAbs = (de == 3 || de == 4) ? -1 : Math.abs(a.nextInt()) % i2;
            int i3 = 0;
            while (i3 < i2) {
                iA += g.a().a(i3, iA, iB, i3 == iAbs);
                i3++;
            }
            g.a().l();
            int i4 = 0;
            switch (df) {
                case 2:
                    i4 = 15;
                    break;
                case 3:
                    i4 = 30;
                    break;
                case 4:
                    i4 = 45;
                    break;
            }
            a(p.m32a(65537), i4 + (Math.abs(a.nextInt()) % 15), 5, iA, 3);
            h.by = (cW / 5) % D.length;
            fb = 5;
            dS = 100000;
            ak = false;
            al = false;
        }
        if (de == 1 && f146do < cW) {
            f146do = cW;
        }
        a(0, false);
        e(true);
        d(30, 0, 0);
        eb = 3;
        ed = 0;
        ee = 0;
    }

    public static int o() {
        dT = 131112;
        dU = -1;
        return dT;
    }

    private static void aa() {
        M(0);
        M(11);
        M(14);
        U();
        ei = 8;
        fe = 0;
        a(fd, false);
        e(false);
        eb = 4;
        ed = 0;
        d(31, 0, 0);
        if (ff == 2) {
            ae();
            d(74, 0, 0);
        }
        af();
    }

    public static final int l(int i2) {
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < i2 + 1; i5++) {
            int i6 = 9999;
            for (int i7 = 0; i7 < aw.length; i7++) {
                int i8 = aw[i7];
                if (!f147f[i7] || !h.m23c(i7)) {
                    i8 = i7 + 1000;
                }
                if (i8 <= i6 && i8 > i3) {
                    i6 = i8;
                    i4 = i7;
                }
            }
            i3 = i6;
        }
        return i4;
    }

    public static final int p() {
        int i2 = 0;
        for (int i3 = 0; i3 < ax.length; i3++) {
            if (f147f[ax[i3]]) {
                i2++;
            }
        }
        return i2;
    }

    private static final void ab() {
        switch (dg) {
            case 0:
                return;
            case 1:
                if (de == 2) {
                    L(dh);
                    l(p.i(), p.m());
                    dp = eo;
                    dq = ep;
                    DCWall3D.Q();
                }
                break;
        }
        dg = 0;
        af();
    }

    private static void J(int i2) {
        boolean z2 = false;
        int i3 = r[i2][23];
        int i4 = i3 & 65535;
        int i5 = (i3 >> 16) & 65535;
        if (eb == 14 || eb == 15 || eb == 16 || eb == 17) {
            return;
        }
        if (i4 == 3) {
            h.l(2);
        } else if (i4 == 4) {
            h.l(3);
        } else if (i4 == 1) {
            h.l(0);
        } else if (i4 == 2) {
            h.l(1);
        }
        if (ff == 2) {
            if (i4 == 3 || i4 == 4) {
                if (!(fd == 0 && i4 == 4) && (fd < fb - 1 || i4 != 3)) {
                    if (i4 == 3) {
                        cY = 0;
                        for (int i6 = 0; i6 < 3; i6++) {
                            if (i6 != i2) {
                                r[i6][1] = 0;
                            }
                        }
                        eb = 14;
                        h.bz = 1000;
                        if (!ak) {
                            I(dP + 2);
                        }
                        ak = false;
                        return;
                    }
                    int i7 = 0;
                    for (int i8 = 0; i8 < 3; i8++) {
                        if (r[i8][1] != 0) {
                            i7++;
                        }
                    }
                    if (i7 > 1) {
                        r[i2][1] = 0;
                        return;
                    }
                    cY = 0;
                    eb = 15;
                    h.bz = 1000;
                    ak = true;
                    return;
                }
                if (fd == 0 && i4 == 4) {
                    r[i2][1] = 0;
                    z2 = true;
                    for (int i9 = 0; i9 < 3; i9++) {
                        if (r[i9][1] != 0) {
                            z2 = false;
                        }
                    }
                } else if ((de == 4 || de == 3) && fd == fb - 1) {
                    eb = 11;
                    ed = 3000;
                    ee = 0;
                    ef = 8;
                    eg = 0;
                    if (de == 3) {
                        ey += eC;
                        eF += eC;
                        d(83, ed, ey);
                    }
                }
            }
        } else if (ff == 1 && i4 == 4) {
            r[i2][1] = 0;
            z2 = true;
            for (int i10 = 0; i10 < 3; i10++) {
                if (r[i10][1] != 0) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            ac();
            return;
        }
        if (i4 > 4) {
            if (m46c(c[i5]) == 2 && da > 0) {
                da = 1000;
                return;
            }
            Object[] objArr = c[i5];
            if (eV > 0) {
                int iE = e(((int[]) objArr[0])[1] - 1, ((int[]) objArr[0])[2]);
                if (iE >= 5) {
                    m39a(i4, (iE >> 16) & 65535, 0, false);
                }
                int iE2 = e(((int[]) objArr[0])[1] + h(objArr), ((int[]) objArr[0])[2]);
                if (iE2 >= 5) {
                    m39a(i4, (iE2 >> 16) & 65535, 0, false);
                }
                int iE3 = e(((int[]) objArr[0])[1], ((int[]) objArr[0])[2] - 1);
                if (iE3 >= 5) {
                    m39a(i4, (iE3 >> 16) & 65535, 0, false);
                }
                int iE4 = e(((int[]) objArr[0])[1], ((int[]) objArr[0])[2] + i(objArr));
                if (iE4 >= 5) {
                    m39a(i4, (iE4 >> 16) & 65535, 0, false);
                }
            }
            m39a(i4, i5, 0, false);
        }
    }

    private static void ac() {
        dG++;
        eu = 1;
        ev = -1;
        ak = true;
        al = true;
        int i2 = -2;
        if (dS < 6000) {
            i2 = (-2) - 15;
        } else if (dS < 15000) {
            i2 = (-2) - 10;
        }
        I(dP + i2);
        dS = 0;
        if (fg == 3) {
            eb = 17;
            cY = 0;
            r[0][1] = 18;
            return;
        }
        cR = 0;
        cS = 0;
        if (de == 2 || de == 1 || de == 4) {
            int iMax = Math.max(eo - 1, 0);
            eo = iMax;
            if (iMax <= 0) {
                eb = 9;
                ed = 550;
                ee = 0;
            } else {
                eb = 7;
                ed = 1000;
                ee = 0;
            }
        } else if (de == 3) {
            ey -= eE;
            if (Math.max(0, ew + ey) == 0) {
                eb = 9;
                ed = 550;
                ee = 0;
            } else {
                eb = 7;
                ed = 1000;
                ee = 0;
            }
            d(85, ed, eE);
        }
        if (de == 1) {
            dr = eo;
            ds = ep;
            dt = eq;
        } else if (de == 2) {
            dp = eo;
            dq = ep;
            if (eo <= 0) {
                DCWall3D.cG--;
                dq = 0;
                dp = 5;
            }
        }
        for (int i3 = 1; i3 < 2; i3++) {
            q[i3][1] = 0;
        }
        for (int i4 = 0; i4 < 3; i4++) {
            r[i4][1] = 0;
        }
        d(33, 0, 0);
        if (de == 2 || fg != 0) {
            return;
        }
        g.a().k();
    }

    private static void a(int i2, int i3, int i4, boolean z2) {
        for (int i5 = -i4; i5 <= i4; i5++) {
            for (int i6 = -i4; i6 <= i4; i6++) {
                int iD = d(i6 + i2, i5 + i3);
                int i7 = iD & 65535;
                if (i7 > 4) {
                    int iAbs = Math.abs(i6) + Math.abs(i5);
                    int i8 = (iD >> 16) & 65535;
                    Object[] objArr = c[i8];
                    boolean z3 = m46c(objArr) != 2;
                    if (iAbs != 0 && fg != 1) {
                        g(objArr, 1);
                        f(objArr, 0);
                        c[i8] = objArr;
                    } else if (z3) {
                        m39a(i7, i8, 1, false);
                    }
                }
            }
        }
    }

    public static final int m(int i2) {
        return y[i2][0] + (((s(dl >> 2) * 195) * 3) >> 12);
    }

    public static final int n(int i2) {
        return y[i2][1] + (((t(dl >> 2) * 195) * 3) >> 12);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02af  */
    /* JADX WARN: Code duplicated, block: B:238:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x028e  */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m39a(int i2, int i3, int i4, boolean z2) {
        int i5;
        boolean z3 = false;
        if (i2 > 4) {
            char c2 = 2;
            Object[] objArr = c[i3];
            if (m44a(objArr)) {
                int iF = f(objArr);
                int iM46c = m46c(objArr);
                if (((boolean[]) objArr[1])[0] && i4 == 0) {
                    iM46c = a(objArr) >= cN ? 2 : m46c(objArr);
                }
                if ((iF == 0 && iM46c != 2) || z2) {
                    if (fc > 0 && iM46c != 2) {
                        int[] iArr = A[fd];
                        iArr[2] = iArr[2] - 1;
                        fc--;
                    }
                    m48e(c[i3]);
                    c2 = 0;
                } else if (iF != 0 && iM46c != 2) {
                    h(c[i3], iF - 1);
                    c2 = 1;
                }
            }
            char c3 = c2;
            int iM46c2 = m46c(c[i3]);
            z3 = c3 == 0;
            if (c3 == 0) {
                Object[] objArr2 = c[i3];
                if (de != 2 && fg == 0) {
                    g.a().a(A[fd][5], m45b(objArr2), m46c(objArr2), g(objArr2), j(objArr2));
                }
                d(34, i3, i4);
                if (fg == 1) {
                    switch (fn) {
                        case 0:
                        case 2:
                        case 3:
                        case 4:
                            Object[] objArr3 = c[i3];
                            if (m46c(objArr3) == 3 && m47d(objArr3) == 2) {
                                fq--;
                            }
                            break;
                        case 1:
                        case 5:
                            Object[] objArr4 = c[i3];
                            if (m46c(objArr4) == 3 && m47d(objArr4) == 2 && i3 < fs) {
                                fq--;
                            }
                            if (fq > 0) {
                                for (int i6 = fs; i6 < fo; i6++) {
                                    if (i3 == i6) {
                                        int i7 = (i6 - fs) / fr;
                                        if (f156a[i7].Q) {
                                            if (m47d(c[i6]) == 2) {
                                                f156a[i7].Q = false;
                                                for (int i8 = 0; i8 < fr; i8++) {
                                                    if (i8 != i3) {
                                                        int i9 = fs + (i7 * fr) + i8;
                                                        if (m44a(c[i9])) {
                                                            m39a(5, i9, 5, true);
                                                        }
                                                    }
                                                }
                                            }
                                            boolean z4 = true;
                                            for (int i10 = 0; i10 < fr; i10++) {
                                                if (m44a(c[fs + (i7 * fr) + i10])) {
                                                    z4 = false;
                                                    if (z4) {
                                                        f156a[i7].Q = false;
                                                        int iR = r() % fq;
                                                        int i11 = 0;
                                                        for (i5 = 0; i5 < fs; i5++) {
                                                            if (!m44a(c[i5]) && m47d(c[i5]) == 2) {
                                                                int i12 = i11;
                                                                i11++;
                                                                if (i12 == iR) {
                                                                    m39a(5, i5, 5, true);
                                                                }
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (z4) {
                                                f156a[i7].Q = false;
                                                int iR2 = r() % fq;
                                                int i13 = 0;
                                                while (i5 < fs) {
                                                    if (!m44a(c[i5])) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 6:
                            Object[] objArr5 = c[i3];
                            if (m46c(objArr5) == 3 && m47d(objArr5) == 2) {
                                fq--;
                            }
                            if (m46c(objArr5) == 5) {
                                aN[i3] = 15000;
                            }
                            break;
                    }
                }
                if (Math.abs(a.nextInt() % 101) < 65 && A[fd][2] > 1) {
                    e(b(fd, ((int[]) objArr2[0])[1], true), b(fd, ((int[]) objArr2[0])[2], false), -1);
                }
                cS = 0;
                int i14 = 0;
                int iM46c3 = m46c(objArr2);
                char c4 = 0;
                switch (df) {
                    case 1:
                        c4 = 0;
                        break;
                    case 2:
                        c4 = 1;
                        break;
                    case 3:
                        c4 = 2;
                        break;
                    case 4:
                        c4 = 3;
                        break;
                }
                int i15 = p[iM46c3][c4];
                switch (iM46c3) {
                    case 2:
                        i14 = 1000;
                        dF++;
                        M(13);
                        break;
                    case 3:
                        i14 = 100;
                        dC++;
                        M(10);
                        break;
                    case 4:
                        i14 = 200;
                        dD++;
                        M(9);
                        break;
                    case 5:
                        i14 = 300;
                        dE++;
                        M(12);
                        break;
                }
                if (de == 2) {
                    i15 = i14;
                }
                if (i4 == 0) {
                    int iM47d = m47d(objArr2);
                    if (iM47d == ev || iM46c2 == 1) {
                        int i16 = eu + 1;
                        eu = i16;
                        eu = Math.min(i16, 20);
                        if (de != 3) {
                            d(35, eu, i3);
                        }
                        if (de == 3 && eu >= eA) {
                            ey += ez;
                            eF += ez;
                        }
                    } else {
                        ev = iM47d;
                        eu = 1;
                    }
                    i15 *= eu;
                }
                if (iM46c3 == 2 || iM46c3 == 3 || iM46c3 == 4 || iM46c3 == 5) {
                    eq++;
                }
                G(eZ * i15);
                if (de != 2) {
                    M(7);
                } else {
                    M(1);
                }
                if (de != 2) {
                    if (m46c(c[i3]) == 1) {
                        ae();
                        ff = 2;
                        b(10, true);
                    } else if (m46c(c[i3]) == 6 && i4 != 3) {
                        eb = 16;
                    }
                    if (fg == 1) {
                        if (f() && eb != 11) {
                            int i17 = A[fd][7];
                            int i18 = A[fd][1];
                            dH++;
                            G(10000);
                            eb = 11;
                            ed = 3300;
                            ee = 0;
                            ef = 8;
                            eg = 1000;
                            M(4);
                            int i19 = al ? 0 : 0 + 15;
                            if (!ak) {
                                i19 += 10;
                            }
                            if (eo > 2) {
                                i19 += 10;
                            }
                            if (eo < 2) {
                                i19 -= 20;
                            }
                            I(dP + i19);
                            for (int i20 = i17; i20 < i17 + i18; i20++) {
                                if (m44a(c[i20])) {
                                    m39a(5, i20, 5, true);
                                }
                            }
                        }
                    } else if (fg == 3 && fc == 0) {
                        G(7500);
                        dL++;
                        eo++;
                        eb = 12;
                        ed = Math.max(0, eP);
                        ee = 0;
                    } else if (fc == 0 && iM46c3 != 2 && eb != 16) {
                        G(5000);
                        I(dP + 4);
                        eb = 11;
                        ed = 3300;
                        ee = 0;
                        if (fe != 4) {
                            ef = 4;
                            eg = 0;
                        }
                        if (de == 3) {
                            ey += eB;
                            d(83, ed, eB);
                        }
                    }
                } else {
                    boolean z5 = false;
                    if (fg == 1) {
                        if (f() && eb != 11) {
                            int i21 = A[fd][7];
                            int i22 = A[fd][1];
                            for (int i23 = i21; i23 < i21 + i22; i23++) {
                                if (m44a(c[i23])) {
                                    m39a(5, i23, 5, true);
                                }
                            }
                            z5 = true;
                        }
                    } else if (fc == 0) {
                        z5 = true;
                    }
                    if (z5) {
                        eb = 11;
                        ed = 3000;
                        ee = 0;
                        ef = 8;
                        eg = 1000;
                    }
                }
            } else if (c3 == 1) {
                d(37, i3, i4);
            }
        }
        return z3;
    }

    private static void a(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            ai();
        }
        for (int i2 = 0; i2 < 27; i2++) {
            for (int i3 = 0; i3 < 1; i3++) {
                int i4 = i2;
                switch (i4) {
                    case 0:
                    case 1:
                        ei = 8;
                        break;
                    case 3:
                        ap = false;
                        break;
                    case 4:
                        ah();
                        break;
                    case 5:
                        ag();
                        break;
                    case 6:
                        al();
                        break;
                    case 7:
                        if (z3) {
                            eQ = 0;
                        }
                        break;
                    case 10:
                        if (z3) {
                            eW = 0;
                        }
                        break;
                    case 11:
                        aj();
                        break;
                    case 12:
                        eS = 0;
                        eT = 0;
                        break;
                    case 13:
                        boolean z5 = ao;
                        ak();
                        if (z5) {
                            eK = 35;
                        }
                        break;
                    case 14:
                        eX = 0;
                        aq = false;
                        break;
                    case 17:
                    case 18:
                        am();
                        break;
                }
                if (z2) {
                    switch (i4) {
                        case 4:
                            eL = 0;
                            break;
                        case 7:
                            eQ = 0;
                            break;
                        case 10:
                            eW = 0;
                            break;
                        case 15:
                        case 16:
                            eZ = 1;
                            eY = 0;
                            break;
                        case 20:
                            fa = 0;
                            break;
                        case 23:
                            da = 0;
                            break;
                        case 24:
                            db = 0;
                            break;
                        case 25:
                            dd = 0;
                            break;
                        case 26:
                            eV = 0;
                            break;
                    }
                }
            }
        }
        en = 0;
    }

    private static void ad() {
        for (int i2 = 0; i2 < em; i2++) {
            s[i2][1] = 0;
        }
    }

    private static void e(int i2, int i3, int i4) {
        for (int i5 = 0; i5 < em; i5++) {
            int iA = i4 >= 0 ? i4 : a(true);
            if (iA == 22) {
                return;
            }
            if (s[i5][1] == 0) {
                a(s[i5], 4098, 1, iA, Math.min(Math.max(i2, 330), (20 * dy) - 330), i3, 0, ((3 * dz) * 100) / 100, 0, 165, 330);
                return;
            }
        }
    }

    private static final int a(boolean z2) {
        int i2;
        int[] iArr;
        if (cQ < 2) {
            if (cQ == 0) {
                cQ++;
                return 13;
            }
            if (fd >= 1) {
                cQ++;
                return 10;
            }
        }
        int i3 = 0;
        do {
            if (de == 2 || fg == 1) {
                if (fg == 1) {
                    i2 = fj;
                    iArr = aE;
                } else {
                    i2 = fi;
                    iArr = aD;
                }
                if (!z2) {
                    while (true) {
                        int iAbs = Math.abs(a.nextInt()) % e.length;
                        i3 = iAbs;
                        if (f(iAbs) && e[i3] && i3 != 22) {
                            break;
                        }
                    }
                } else {
                    i3 = iArr[Math.abs(a.nextInt()) % i2];
                }
            } else {
                int i4 = 0;
                int iAbs2 = Math.abs(a.nextInt() % eG);
                int i5 = de == 4 ? 4 : df - 1;
                for (int i6 = 0; i6 < t.length; i6++) {
                    i4 += t[i6][i5];
                    if (iAbs2 < i4 && f(i6) && t[i6][i5] > 0) {
                        i3 = i6;
                        break;
                    }
                }
            }
            if (z2) {
                break;
            }
        } while (i3 == 21);
        return i3;
    }

    private static boolean f(int i2) {
        if (de == 3 && (i2 == 19 || i2 == 20 || i2 == 15 || i2 == 16)) {
            return false;
        }
        if (fg == 1) {
            return (i2 == 14 || i2 == 7) ? false : true;
        }
        return true;
    }

    private static void ae() {
        a(q[1], 4096, 1, 0, q[0][4], A[fd][4] + dz, q[0][6], 0, q[0][13], q[0][14], q[0][15]);
    }

    private static void e(boolean z2) {
        a(q[0], 4096, 1, 0, ((dy * 20) - 1380) / 2, dz << 4, dY, 0, 0, 1380, 330);
        a(q[1], 4096, 0, 0, q[0][4], dz, q[0][6], 0, 0, 1380, 330);
        int i2 = 0;
        while (i2 < 3) {
            a(r[i2], 4097, i2 == 0 ? 18 : 0, 0, q[0][4] + (q[0][14] / 2), (dz << 4) - (dz / 4), 0, 0, 195, 390, 390);
            g[i2] = false;
            i2++;
        }
        if (f147f[12]) {
            g[0] = true;
        }
        if (z2) {
            for (int i3 = 0; i3 < dX; i3++) {
                a(s[i3], 4098, 0, 0, 0, 0, 0, 0, 0, 165, 330);
            }
        }
    }

    public static final boolean d() {
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (r[i3][1] != 0) {
                i2++;
            }
        }
        int i4 = fd;
        int i5 = A[i4][1];
        int i6 = A[i4][7];
        int i7 = 0;
        for (int i8 = i6; i8 < i6 + i5; i8++) {
            Object[] objArr = c[i8];
            if (m44a(objArr) && m46c(objArr) != 2) {
                d = objArr;
                i7++;
            }
        }
        return (i7 == 1) && i2 == 1 && h.a(true) - h.a(false) > 0.0f;
    }

    public static int a(Object[] objArr) {
        int i2 = cM + ((int[]) objArr[0])[3];
        if (!((boolean[]) objArr[1])[1]) {
            return i2 % (cN + cO);
        }
        int i3 = 2 * (cN + cO);
        return (i3 / 2) - Math.abs((i3 / 2) - (i2 % i3));
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

    private static void af() {
        s.b.aA();
        System.currentTimeMillis();
    }

    private static void a(int[] iArr, int i2, int i3) {
        if (iArr[1] != 0) {
            switch (iArr[0]) {
                case 4096:
                    iArr[9] = iArr[4];
                    if (i2 != 0) {
                        iArr[4] = q[0][4];
                        iArr[6] = q[0][6];
                        break;
                    } else {
                        boolean z2 = fa > 0;
                        boolean z3 = z2;
                        boolean z4 = z2 ? ai : ah;
                        boolean z5 = z3 ? ah : ai;
                        switch (iArr[1]) {
                            case 1:
                                if (z4 && iArr[6] > 0) {
                                    eh = -ea;
                                    iArr[6] = -dZ;
                                }
                                if (z5 && iArr[6] < 0) {
                                    eh = ea;
                                    iArr[6] = dZ;
                                }
                                if (z4 || z5) {
                                    int i4 = (iArr[6] * i3) >> 10;
                                    boolean zA = a(true, true, 0);
                                    boolean zA2 = a(true, false, 0);
                                    boolean zA3 = a(false, true, 0);
                                    boolean zA4 = a(false, false, 0);
                                    boolean zA5 = a(iArr, false, i4, false, true);
                                    boolean zA6 = a(iArr, false, i4, false, false);
                                    boolean z6 = q[1][1] == 1;
                                    if ((iArr[6] < 0 && !(zA5 && ((z6 || zA3) && (zA || zA3)))) || (iArr[6] > 0 && !(zA6 && ((z6 || zA4) && (zA2 || zA4))))) {
                                        iArr[4] = iArr[4] + i4;
                                        iArr[6] = iArr[6] + ((eh * i3) >> 10);
                                    } else if (iArr[6] < 0 && zA5 && ((z6 && zA) || zA3)) {
                                        iArr[4] = 420;
                                    } else if (iArr[6] > 0 && zA6 && ((z6 && zA2) || zA4)) {
                                        iArr[4] = (((20 * dy) - iArr[14]) - 390) - 30;
                                    }
                                } else {
                                    iArr[6] = (iArr[6] > 0 ? 1 : -1) * dZ;
                                }
                                int i5 = iArr[14] / 2;
                                int i6 = iArr[14] / 2;
                                for (int i7 = 0; i7 < 3; i7++) {
                                    if (r[i7][1] == 18 || r[i7][1] == 17) {
                                        en = 0;
                                    }
                                }
                                if (iArr[4] < (-i5)) {
                                    iArr[4] = -i5;
                                } else if (iArr[4] > (dy * 20) - i6) {
                                    iArr[4] = (dy * 20) - i6;
                                }
                                if (Math.abs(iArr[6]) > dY) {
                                    iArr[6] = (iArr[6] > 0 ? 1 : -1) * dY;
                                }
                                break;
                            case 2:
                                if (iArr[3] > 100) {
                                    iArr[1] = 1;
                                    iArr[6] = (iArr[6] > 0 ? 1 : -1) * dZ;
                                } else {
                                    iArr[3] = iArr[3] + i3;
                                }
                                break;
                        }
                    }
                    break;
                case 4097:
                    if (d()) {
                        i3 = (int) (i3 * (1.0f - (h.a(true) * 0.8f)));
                    }
                    int i8 = i3;
                    switch (iArr[1]) {
                        case 16:
                            if (iArr[16] != -1) {
                                int i9 = iArr[23];
                                int i10 = i9 & 65535;
                                int i11 = (i9 >> 16) & 65535;
                                int iM46c = 0;
                                if (i9 != 4096 && i10 > 4) {
                                    iM46c = m46c(c[i11]);
                                }
                                if (i9 != 4096) {
                                    if (eQ == 1) {
                                        int iM46c2 = i11 == -1 ? 0 : m46c(c[i11]);
                                        int i12 = iM46c2;
                                        if (iM46c2 != 1 && i12 != 6 && i12 != 2 && i10 > 4) {
                                            eR = i11;
                                            eQ = 2;
                                        }
                                    }
                                    if (iM46c != 2 && iM46c != 0) {
                                        en = 0;
                                    }
                                } else if (ap) {
                                    if (q[r[i2][5] <= (dz << 2) ? 1 : 0][1] != 2) {
                                        r[i2][1] = 17;
                                    }
                                }
                                if (i9 == 4096) {
                                    iArr[6] = (((ej * ei) * iArr[19]) >> 3) / dx;
                                    iArr[7] = (((ej * ei) * iArr[20]) >> 3) / dx;
                                    iArr[9] = (iArr[17] + iArr[21]) - q[0][9];
                                } else if (eW == 0 || i10 < 5 || iM46c == 2) {
                                    int iC = c(iArr[6], iArr[7], iArr[19], iArr[20]);
                                    int iC2 = c(iArr[6], iArr[7], -iArr[20], iArr[19]);
                                    iArr[6] = (((-iC2) * iArr[20]) - (iC * iArr[19])) / dx;
                                    iArr[7] = ((iC2 * iArr[19]) - (iC * iArr[20])) / dx;
                                }
                                iArr[4] = iArr[17] + iArr[21];
                                iArr[5] = iArr[18] + iArr[22];
                            } else {
                                int i13 = iArr[6];
                                int i14 = iArr[7];
                                if (eP > 0) {
                                    i13 = 0;
                                    i14 = 0;
                                } else if (cV > 0) {
                                    i13 >>= 2;
                                    i14 >>= 2;
                                }
                                iArr[4] = iArr[4] + ((i13 * i8) >> 10);
                                iArr[5] = iArr[5] + ((i14 * i8) >> 10);
                            }
                            break;
                        case 17:
                            if (aj || iArr[2] == 1) {
                                iArr[1] = 16;
                            }
                            iArr[4] = q[0][4] + iArr[9];
                            int i15 = iArr[13] + (iArr[13] >> 1);
                            if (iArr[4] <= i15) {
                                iArr[4] = i15;
                            }
                            if (iArr[4] >= (dy * 20) - i15) {
                                iArr[4] = (dy * 20) - i15;
                            }
                            if (iArr[5] > (dz << 2)) {
                                iArr[5] = (dz << 4) - (dz >> 2);
                            } else {
                                iArr[5] = 330 + dz + (dz >> 2);
                            }
                            break;
                        case 18:
                            if (aj) {
                                iArr[1] = 16;
                                int iAbs = ((Math.abs(a.nextInt()) % 199) / 8) + 128;
                                int iS = (s(iAbs == 128 ? 127 : iAbs) << 4) >> 8;
                                int iT = (t(iAbs == 128 ? 127 : iAbs) << 4) >> 8;
                                iArr[7] = (((-ej) * ei) * iS) >> 11;
                                iArr[6] = ((ej * ei) * iT) >> 11;
                            }
                            iArr[4] = q[0][4] + (2 * dy);
                            int i16 = iArr[13] + (iArr[13] >> 1);
                            if (iArr[4] <= i16) {
                                iArr[4] = i16;
                            }
                            if (iArr[4] >= (dy * 20) - i16) {
                                iArr[4] = (dy * 20) - i16;
                            }
                            break;
                    }
                    iArr[2] = 0;
                    break;
                case 4098:
                    if (iArr[1] != 0) {
                        if (iArr[3] > 12000) {
                            iArr[1] = 0;
                        } else {
                            iArr[4] = iArr[4] + ((iArr[6] * i3) >> 10);
                            iArr[5] = iArr[5] + ((iArr[7] * i3) >> 10);
                            iArr[3] = iArr[3] + i3;
                        }
                    }
                    break;
            }
        }
        iArr[16] = -1;
    }

    private static boolean a(boolean z2, boolean z3, int i2) {
        boolean z4 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            boolean z5 = (z2 && r[i3][7] < 0) || (!z2 && r[i3][7] > 0);
            if (r[i3][1] != 18 && r[i3][1] != 17 && z5 && a(r[i3], true, 0, z2, z3)) {
                z4 = true;
                break;
            }
        }
        return z4;
    }

    private static boolean a(int[] iArr, boolean z2, int i2, boolean z3, boolean z4) {
        return a(iArr, z2, i2, z4 ? -dY : ((20 * dy) - 195) - 30, z3 ? q[1][5] : q[0][5], eI, 330);
    }

    private static boolean a(int[] iArr, boolean z2, int i2, int i3, int i4, int i5, int i6) {
        if (iArr == null) {
            return false;
        }
        int i7 = (iArr[4] - (z2 ? iArr[13] : 0)) + i2;
        int i8 = iArr[5] - (z2 ? iArr[13] : 0);
        return i3 <= iArr[14] + i7 && i3 + i5 >= i7 && i4 <= iArr[15] + i8 && i4 + i6 >= i8;
    }

    private static boolean a(int[] iArr, int[] iArr2, int i2, boolean z2) {
        boolean zA;
        boolean z3 = false;
        int i3 = -1;
        int i4 = z2 ? iArr[16] : -1;
        int i5 = iArr[4] + ((iArr[6] * i2) >> 10);
        int i6 = iArr[5] + ((iArr[7] * i2) >> 10);
        for (int i7 = 0; i7 < 3; i7++) {
            u[i7][0] = -1;
        }
        if (iArr[6] != 0 || iArr[7] != 0) {
            int iSqrt = sqrt((iArr[6] * iArr[6]) + (iArr[7] * iArr[7]));
            int i8 = (iArr[13] * iArr[6]) / iSqrt;
            int i9 = (iArr[13] * iArr[7]) / iSqrt;
            if (iArr2 == null) {
                az[0] = -i9;
                az[1] = i8;
                az[2] = i8;
                az[3] = i9;
                az[4] = i9;
                az[5] = -i8;
            } else {
                az[0] = 0;
                az[1] = (-iArr[13]) / 2;
                az[2] = 0;
                az[3] = iArr[13] / 2;
                az[4] = ((iArr[6] > 0 ? 1 : -1) * iArr[13]) / 2;
                az[5] = 0;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                if (iArr2 == null) {
                    zA = a(u[i10], iArr[4] + az[i10 << 1], iArr[5] + az[(i10 << 1) + 1], i5 + az[i10 << 1], i6 + az[(i10 << 1) + 1], true);
                } else {
                    int[] iArr3 = u[i10];
                    int i11 = iArr[4] + az[i10 << 1];
                    int i12 = iArr[5] + az[(i10 << 1) + 1];
                    int i13 = i5 + az[i10 << 1];
                    int i14 = i6 + az[(i10 << 1) + 1];
                    int i15 = i11;
                    boolean z4 = false;
                    int iMin = Math.min(i15, i13);
                    int iMax = Math.max(i15, i13);
                    int iMin2 = Math.min(i12, i14);
                    int iMax2 = Math.max(i12, i14);
                    int i16 = iArr2[4];
                    int i17 = iArr2[5];
                    int i18 = i16 + iArr2[14];
                    int i19 = i17 + iArr2[15];
                    if (iMin <= i18 && iMax >= i16 && iMin2 <= i19 && iMax2 >= i17) {
                        int i20 = i13 - i15 < 0 ? -1 : i13 - i15 > 0 ? 1 : 0;
                        int i21 = i14 - i12 < 0 ? -1 : i14 - i12 > 0 ? 1 : 0;
                        int i22 = 0;
                        if (i15 > i18 || i15 < i16 || i12 > i19 || i12 < i17) {
                            if (i20 != 0) {
                                aA[0] = i20 == 1 ? i16 : i18;
                                aA[1] = (((i14 - i12) * (aA[0] - i15)) / (i13 - i15)) + i12;
                            }
                            if (i21 != 0) {
                                aA[3] = i21 == 1 ? i17 : i19;
                                aA[2] = (((i13 - i15) * (aA[3] - i12)) / (i14 - i12)) + i15;
                            }
                            if (aA[0] >= i16 && aA[0] <= i18 && aA[1] >= i17 && aA[1] <= i19) {
                                i21 = 0;
                                i22 = 0;
                                z4 = true;
                            } else if (aA[2] >= i16 && aA[2] <= i18 && aA[3] >= i17 && aA[3] <= i19) {
                                i20 = 0;
                                i22 = 2;
                                z4 = true;
                            }
                        } else {
                            if (iArr2[6] > 0) {
                                int i23 = (i18 - i15) + 10;
                                if (i18 < (20 * dy) - 390) {
                                    i15 += i23;
                                } else {
                                    int[] iArr4 = q[0];
                                    iArr4[4] = iArr4[4] - i23;
                                }
                            } else {
                                int i24 = (i15 + 10) - i16;
                                if (i16 > 390) {
                                    i15 -= i24;
                                } else {
                                    int[] iArr5 = q[0];
                                    iArr5[4] = iArr5[4] + i24;
                                }
                            }
                            q[0][3] = 0;
                            q[0][1] = 2;
                            i20 = 0;
                            i21 = 1;
                            i22 = 0;
                            aA[0] = i15;
                            aA[1] = i12;
                            z4 = true;
                        }
                        if (z4) {
                            boolean z5 = true;
                            if (iArr2[0] == 4096) {
                                i21 = iArr2 == q[0] ? 1 : -1;
                                int i25 = (((aA[i22] - i16) * (-199)) / iArr2[14]) + 227;
                                int iT = ((t(i25 == 128 ? 127 : i25) << 4) * dx) >> 16;
                                int iS = (((s(i25 == 128 ? 127 : i25) << 4) * dx) * i21) >> 16;
                                int i26 = aA[i22] - i15;
                                int i27 = aA[i22 + 1] - i12;
                                a(iArr3, (i26 * i26) + (i27 * i27), aA[i22], aA[i22 + 1], iT, -iS, -i20, -i21);
                                iArr3[7] = 0 | iArr2[0];
                                z5 = false;
                            }
                            if (z5) {
                                int i28 = aA[i22] - i15;
                                int i29 = aA[i22 + 1] - i12;
                                a(iArr3, (i28 * i28) + (i29 * i29), aA[i22], aA[i22 + 1], (-i20) * dx, (-i21) * dx, -i20, -i21);
                                iArr3[7] = 0 | iArr2[0];
                            }
                        }
                    }
                    zA = z4;
                }
                if (zA && (i4 == -1 || i4 > u[i10][0])) {
                    i3 = i10;
                    i4 = u[i10][0];
                }
            }
        }
        if (i3 != -1 && (!z2 || iArr[16] < 0 || iArr[16] > u[i3][0])) {
            iArr[16] = u[i3][0];
            iArr[17] = u[i3][1] - az[i3 << 1];
            iArr[18] = u[i3][2] - az[(i3 << 1) + 1];
            iArr[19] = u[i3][3];
            iArr[20] = u[i3][4];
            iArr[21] = u[i3][5];
            iArr[22] = u[i3][6];
            iArr[23] = u[i3][7];
            z3 = true;
        }
        return z3;
    }

    private static void ag() {
        for (int i2 = 0; i2 < 1; i2++) {
            x[0][0] = 0;
            x[0][1] = 0;
            x[0][2] = 0;
            x[0][3] = 0;
            x[0][4] = 0;
            x[0][5] = 0;
            x[0][6] = 0;
        }
    }

    private static void ah() {
        eL = 0;
        for (int i2 = 0; i2 < 1; i2++) {
            w[0][0] = 0;
            w[0][1] = 0;
            w[0][2] = 0;
            w[0][3] = 0;
            w[0][4] = 0;
            w[0][5] = 0;
            w[0][6] = 0;
            w[0][7] = 0;
        }
    }

    private static void ai() {
        for (int i2 = 0; i2 < f147f.length; i2++) {
            f147f[i2] = false;
        }
    }

    private static void aj() {
        for (int i2 = 0; i2 < 1; i2++) {
            z[0][0] = 0;
            z[0][1] = 0;
            z[0][2] = 0;
            z[0][3] = 0;
            z[0][4] = 0;
            z[0][5] = 0;
            z[0][6] = 0;
            z[0][7] = 0;
        }
    }

    public static boolean g(int i2) {
        switch (i2) {
            case 3:
                return ap;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            default:
                return false;
            case 7:
                return eQ == 1;
            case 10:
                return eW > 0;
            case 15:
                return eZ == 2 && eY > 0;
            case 16:
                return eZ == 4 && eY > 0;
            case 20:
                return fa > 0;
            case 24:
                return db > 0;
            case 25:
                return dd > 0;
            case 26:
                return eV > 0;
        }
    }

    public static final int q() {
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (r[i3][1] != 0) {
                i2 = i3;
                break;
            }
        }
        return i2;
    }

    public static int c(int i2, int i3) {
        int iAbs = Math.abs(i3);
        int iAbs2 = Math.abs(i2);
        return Math.max(iAbs2, iAbs) + ((Math.min(iAbs2, iAbs) * 53) >> 7);
    }

    private static void K(int i2) {
        if (eN == 1 && fe == 0) {
            eO -= i2;
            eP = 1600 - eO;
            if (eO < 0) {
                al();
                h.aZ = 1500;
                h.g(500);
                ee = 0;
            }
        }
        if (eP > 0) {
            h.aZ = 500;
            h.g(500);
            int i3 = A[fd][1];
            int i4 = A[fd][7];
            for (int i5 = i4; i5 < i4 + i3; i5++) {
                if (m44a(c[i5]) && m46c(c[i5]) != 2) {
                    Object[] objArr = c[i5];
                    int iQ = q();
                    if (((c((r[iQ][4] - ((int[]) objArr[0])[1]) / dy, (r[iQ][5] - ((int[]) objArr[0])[2]) / dz) * 60) - eP) + 20 < 0.0f) {
                        m39a(5, i5, 3, true);
                    }
                }
            }
        }
    }

    private static final int o(int i2) {
        return (10 * t(v[i2][2])) >> 12;
    }

    private static final int p(int i2) {
        return ((-10) * s(v[i2][2])) >> 12;
    }

    public static int q(int i2) {
        return (i2 == 0 ? 128 : 64) + ((64 * Math.abs(s(aC[i2] / 2))) >> 12);
    }

    private static void ak() {
        ao = false;
        eJ = 0;
        eK = 0;
        for (int i2 = 0; i2 < v.length; i2++) {
            v[i2][3] = 0;
        }
        aC[0] = 0;
        aC[1] = 0;
        aB[0] = 0;
        aB[1] = 30;
    }

    private static void al() {
        eP = 0;
        eN = 0;
        eO = 0;
    }

    private static void am() {
        int i2 = (q[0][14] - 1380) / 2;
        int[] iArr = q[0];
        iArr[4] = iArr[4] + i2;
        q[0][14] = 1380;
        int[] iArr2 = q[1];
        iArr2[4] = iArr2[4] + i2;
        q[1][14] = 1380;
        cP = 0;
    }

    private static void a(int i2, boolean z2) {
        int i3;
        fd = i2;
        fc = A[fd][2];
        ff = 1;
        fg = (de != 2 || dh < 60) ? A[fd][0] : 1;
        if (dT != -1 && dU != (i3 = dT)) {
            dU = i3;
            p.j(i3, -1);
        }
        boolean z3 = false;
        int i4 = A[fd][7];
        int i5 = A[fd][1];
        boolean z4 = false;
        int i6 = -1;
        for (int i7 = i4; i7 < i4 + i5; i7++) {
            Object[] objArr = c[i7];
            g(objArr, 0);
            f(objArr, 0);
            if (de != 2 && m46c(objArr) == 1) {
                if (!m44a(objArr)) {
                    int[] iArr = A[fd];
                    iArr[2] = iArr[2] + 1;
                    fc++;
                    m49f(objArr);
                    z3 = true;
                }
                z4 = true;
                i6 = i7;
            }
            c[i7] = objArr;
        }
        if (de != 2 && fc == 1 && z4 && z3 && !z2) {
            m48e(c[i6]);
            ae();
            ff = 2;
            A[fd][2] = 0;
            fc = 0;
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static boolean m40b(int i2, int i3) {
        int i4 = A[fd][3];
        int i5 = (255 & (i4 >> 24)) * dy;
        int i6 = ((255 & (i4 >> 16)) * dz) + A[fd][4];
        return (i2 >= i5 && i2 <= i5 + ((255 & (i4 >> 8)) * dy) && i3 >= i6 && i3 <= i6 + ((255 & i4) * dz)) || i2 <= 0 || i2 >= 20 * dy || i3 - A[fd][4] <= 0 || i3 - A[fd][4] >= 17 * dz;
    }

    public static int d(int i2, int i3) {
        return e(i2 * dy, i3 * dz);
    }

    public static int r(int i2) {
        return i2 & 65535;
    }

    private static int e(int i2, int i3) {
        int i4 = 0;
        if (i3 < 0) {
            i4 = 3;
        } else if (i3 > 17 * dz) {
            i4 = 4;
        } else if (i2 < 0) {
            i4 = 1;
        } else if (i2 > 20 * dy) {
            i4 = 2;
        } else {
            int i5 = A[fd][7];
            int i6 = A[fd][1];
            for (int i7 = i5; i7 < i5 + i6; i7++) {
                Object[] objArr = c[i7];
                if (m44a(objArr)) {
                    int i8 = ((int[]) objArr[0])[1];
                    int i9 = ((int[]) objArr[0])[2];
                    int iH = i8 + h(objArr);
                    int i10 = i9 + i(objArr);
                    if (i2 >= i8 && i2 < iH && i3 >= i9 && i3 < i10) {
                        switch (m45b(objArr)) {
                            case 1:
                                return (i7 << 16) | 5;
                            case 2:
                                return i2 < i8 + dy ? (i7 << 16) | 6 : (i7 << 16) | 7;
                            case 3:
                                if (i2 < i8 + dy) {
                                    return i3 < i9 + dz ? (i7 << 16) | 8 : (i7 << 16) | 10;
                                }
                                return i3 < i9 + dz ? (i7 << 16) | 9 : (i7 << 16) | 11;
                        }
                    }
                }
            }
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0456, code lost:
    
        if (r33 == r23) goto L121;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01f6 -> B:88:0x01f8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int[] r12, int r13, int r14, int r15, int r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.a(int[], int, int, int, int, boolean):boolean");
    }

    private static int a(int i2, int i3, boolean z2) {
        int i4 = i2 >= 0 ? 1 : -1;
        return ((i2 < 0 || z2) && (i2 >= 0 || !z2)) ? (((i2 - i4) / i3) + i4) * i3 : (i2 / i3) * i3;
    }

    private static int b(int i2, int i3, boolean z2) {
        return z2 ? i3 : A[i2][4] + i3;
    }

    private static void b(int i2, boolean z2) {
        if (f145d[i2] || ab || !ac) {
            return;
        }
        U();
        String strC = p.c(av[i2]);
        ab = true;
        if (z2) {
            p.L();
        }
        f.a(0, 1, strC, (Image[]) null, 0);
        int i3 = p.i();
        int iM = p.m();
        int i4 = (i3 * 5) / 6;
        int i5 = (iM * 3) / 5;
        dj = (i3 - i4) >> 1;
        dk = (iM - i5) >> 1;
        f.a(i4, i5, false);
        f.g();
        if (z2) {
            p.k(1, 0);
        }
        f145d[i2] = true;
        DCWall3D.Q();
    }

    public static final int r() {
        return Math.abs(a.nextInt());
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
        if (z2 && i4 <= 0) {
            i8 = -1;
        } else if (z3 && i4 >= dy) {
            i8 = 1;
        } else if (z4 && i5 <= 0) {
            i9 = -1;
        } else if (!z5 || i5 < dz) {
            z6 = false;
        } else {
            i9 = 1;
        }
        if (z6) {
            a(iArr, 0, i2 + i4, i3 + i5, i8 * dx, i9 * dx, i8, i9);
        }
        return z6;
    }

    public static void an() {
        int i2 = 0;
        int i3 = 4096;
        if (as == null) {
            as = new int[512];
            for (int i4 = 0; i4 < 512; i4++) {
                as[i4] = i2;
                i3 -= (i2 * 50) >> 12;
                i2 += (i3 * 50) >> 12;
            }
        }
        eG = 0;
        df = 1;
        for (int i5 = 0; i5 < t.length; i5++) {
            eG += t[i5][df - 1];
        }
    }

    public static final int s() {
        int i2 = ((-1644122275) * du) - 1644122275;
        du = i2;
        return i2;
    }

    public static final int s(int i2) {
        return as[i2 & 511];
    }

    public static final int t(int i2) {
        return as[(i2 + 128) & 511];
    }

    private static int sqrt(int i2) {
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

    private static int c(int i2, int i3, int i4, int i5) {
        return ((i2 * i4) + (i3 * i5)) / dx;
    }

    private static boolean b(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int iMin = Math.min(i2, i4);
        int iMax = Math.max(i2, i4);
        return iMax > i6 && iMin < i6 && iMin != iMax && (i9 = i3 + (((i5 - i3) * (i6 - i2)) / (i4 - i2))) > Math.min(i7, i8) && i9 < Math.max(i7, i8);
    }

    public static void L(int i2) {
        new StringBuffer().append("***Setting ").append(i2).append(" ").append(60).append(" ").append(61).toString();
        if (i2 < 60) {
            a(p.m32a(65537), i2, 0, 0, 0);
        } else {
            f(0, 6);
        }
    }

    private static void a(DataInputStream dataInputStream, int i2, int i3, int i4, int i5) {
        int i6;
        try {
            dataInputStream.read();
            dataInputStream.skip(i2 << 2);
            dataInputStream.skip(dataInputStream.readInt());
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i8; i11++) {
                for (int i12 = 0; i12 < i7; i12++) {
                    byte b2 = dataInputStream.readByte();
                    if (b2 > 0) {
                        int i13 = ((b2 - 1) % 3) + 1;
                        int i14 = (b2 - 1) / 3;
                        switch (i14) {
                            case 0:
                            case 1:
                            case 2:
                                i6 = 3;
                                i10++;
                                Object[] objArr = new Object[2];
                                d(objArr);
                                c[i4 + i9] = objArr;
                                a(c[i4 + i9], i13, i6, i14, 0, i12, i11);
                                i9++;
                                break;
                            case 3:
                                i6 = 4;
                                i10++;
                                Object[] objArr2 = new Object[2];
                                d(objArr2);
                                c[i4 + i9] = objArr2;
                                a(c[i4 + i9], i13, i6, i14, 0, i12, i11);
                                i9++;
                                break;
                            case 4:
                                i6 = 5;
                                i10++;
                                Object[] objArr3 = new Object[2];
                                d(objArr3);
                                c[i4 + i9] = objArr3;
                                a(c[i4 + i9], i13, i6, i14, 0, i12, i11);
                                i9++;
                                break;
                            case 5:
                                i6 = 2;
                                Object[] objArr4 = new Object[2];
                                d(objArr4);
                                c[i4 + i9] = objArr4;
                                a(c[i4 + i9], i13, i6, i14, 0, i12, i11);
                                i9++;
                                break;
                        }
                    }
                }
            }
            A[i3][0] = i5 == 3 ? 3 : 0;
            A[i3][1] = i9;
            A[i3][2] = i10;
            A[i3][4] = 0;
            A[i3][7] = i4;
            A[i3][3] = 0 | (i7 << 8) | i8;
            short s2 = dataInputStream.readShort();
            int i15 = 0;
            while (i15 < s2) {
                if (dataInputStream.read() == 0) {
                    h.bx = dataInputStream.read();
                    if (i5 != 2) {
                        int i16 = dataInputStream.read();
                        int[] iArr = i5 == 1 ? aE : aD;
                        int i17 = 0;
                        for (int i18 = 0; i18 < i16; i18++) {
                            int i19 = dataInputStream.read();
                            if (e[i19]) {
                                iArr[i17] = i19;
                                i17++;
                            }
                        }
                        if (i17 == 0) {
                            int i20 = i17;
                            i17++;
                            iArr[i20] = 10;
                        }
                        int i21 = i17;
                        if (i5 == 1) {
                            fj = i21;
                        } else {
                            fi = i21;
                        }
                        cN = dataInputStream.readShort();
                        cO = dataInputStream.readShort();
                        int i22 = dataInputStream.read();
                        i15 = 0;
                        while (i15 < i22) {
                            int i23 = dataInputStream.read();
                            short s3 = dataInputStream.readShort();
                            int i24 = A[i3][1];
                            int i25 = A[i3][7];
                            int i26 = cN;
                            for (int i27 = i25; i27 < i25 + i24; i27++) {
                                Object[] objArr5 = c[i27];
                                int iG = g(objArr5);
                                if (j(objArr5) == s3) {
                                    ((boolean[]) objArr5[1])[0] = true;
                                    if (i23 == 1) {
                                        ((int[]) objArr5[0])[3] = (i26 * ((iG << 2) / 20)) / 2;
                                    } else if (i23 == 2) {
                                        ((int[]) objArr5[0])[3] = (i26 * ((iG << 2) / 20)) / 4;
                                    } else if (i23 == 3) {
                                        ((int[]) objArr5[0])[3] = i26 - ((i26 * ((iG << 2) / 20)) / 4);
                                    } else if (i23 == 4) {
                                        int i28 = iG;
                                        if (iG >= 10) {
                                            i28 = 19 - i28;
                                        }
                                        ((int[]) objArr5[0])[3] = (i26 * Math.abs(10 - ((i28 / 2) << 1))) / 8;
                                    }
                                }
                            }
                            i15++;
                        }
                    }
                }
                i15++;
            }
            dataInputStream.close();
            new StringBuffer().append("tileIndex:").append(i9).append(" numOfTiles:").append(i10).toString();
        } catch (IOException unused) {
        }
    }

    static {
        int[] iArr = {0, 0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0, 0};
        int[] iArr3 = {100, 100, 100, 100, 100};
        int[][] iArr4 = {new int[]{5, 5, 249, 250}, new int[]{0, 10, 257, 258}, new int[]{0, 30, 259, 260}, new int[]{0, 61, 261, 262}, new int[]{1, 50000, 263, 264}, new int[]{1, 100000, 265, 266}, new int[]{1, 500000, 267, 268}, new int[]{1, 1000000, 269, 270}, new int[]{2, 1, 271, 272}, new int[]{3, 100, 273, 274}, new int[]{4, 1, 275, 276}, new int[]{4, 10, 277, 278}, new int[]{4, 50, 279, 280}, new int[]{5, 25, 281, 282}, new int[]{5, 50, 283, 284}, new int[]{5, 100, 285, 286}, new int[]{5, 150, 287, 288}, new int[]{5, 200, 289, 290}, new int[]{5, 250, 291, 292}, new int[]{5, 300, 293, 294}, new int[]{6, 50, 295, 296}, new int[]{7, 100000, 297, 298}, new int[]{7, 500000, 299, 300}, new int[]{7, 1000000, 301, 302}, new int[]{7, 9999999, 303, 304}, new int[]{8, 1, 305, 306}, new int[]{8, 2, 307, 308}, new int[]{8, 3, 309, 310}, new int[]{8, 4, 311, 312}, new int[]{8, 5, 313, 314}, new int[]{8, 6, 315, 316}, new int[]{8, 7, 317, 318}, new int[]{8, 8, 319, 320}, new int[]{8, 9, 321, 322}, new int[]{8, 10, 323, 324}, new int[]{8, 11, 325, 326}, new int[]{8, 12, 327, 328}, new int[]{8, 13, 329, 330}, new int[]{8, 14, 331, 332}, new int[]{8, 15, 333, 334}, new int[]{14, 100, 335, 336}, new int[]{10, 5000, 337, 338}, new int[]{9, 1000, 339, 340}, new int[]{12, 500, 341, 342}, new int[]{13, 100, 343, 344}, new int[]{11, 50, 345, 346}, new int[]{2, 100, 347, 348}, new int[]{15, 200, 251, 252}, new int[]{16, 350, 253, 254}, new int[]{17, 500, 359, 360}, new int[]{18, 600, 361, 362}, new int[]{18, 750, 363, 364}, new int[]{18, 900, 365, 366}, new int[]{18, 1200, 367, 368}, new int[]{19, 4, 255, 256}, new int[]{20, 10, 349, 350}, new int[]{20, 25, 351, 352}, new int[]{20, 50, 353, 354}, new int[]{20, 75, 355, 356}, new int[]{20, 100, 357, 358}};
        B = iArr4;
        aI = new int[iArr4.length];
        int[] iArr5 = bz;
        at = iArr5;
        dR = iArr5[iArr5.length - 1];
        int[] iArr6 = {131112, -1};
        au = new int[150];
        dW = 0;
        dX = Math.max(Math.max(1, 1), Math.max(2, 2));
        dY = ((20 * dx) * 100) / 100;
        dZ = ((2 * dx) * 100) / 100;
        ea = ((128 * dx) * 100) / 100;
        av = new int[]{157, 158, 167, 169, 187, 178, 174, 170, 172, 180, 159, 204, 247, 176, 189, 182, 195, 197, 199, 201, 248, 212, 191, 193, 160, 161, 162, 163, 185, 207, 211, 209, 184, 216, 218, 220, 222, 224, 226, 228, 166};
        p = new int[][]{new int[]{0, 0, 0, 0}, new int[]{10, 10, 10, 10}, new int[]{1000, 1000, 1000, 1000}, new int[]{50, 100, 150, 200}, new int[]{100, 200, 300, 400}, new int[]{200, 400, 600, 800}, new int[]{10, 10, 10, 10}};
        q = new int[2][25];
        r = new int[3][25];
        s = new int[dX][25];
        am = true;
        eb = 1;
        ec = 0;
        ed = 0;
        ee = 0;
        ef = 4;
        eg = 0;
        eh = ea;
        ei = 8;
        ej = ((12 * dx) * 100) / 100;
        em = 1;
        en = 0;
        eo = 5;
        ep = 0;
        eq = 0;
        er = 0;
        es = 0;
        et = 0;
        eu = 1;
        ev = -1;
        ew = 0;
        ex = 0;
        ey = 0;
        ez = 0;
        eA = 0;
        eB = 0;
        eC = 0;
        eD = 0;
        eE = 0;
        eF = 0;
        aw = new int[27];
        ax = new int[]{12, 11, 4, 6, 5, 23, 13};
        int[][] iArr7 = {new int[]{7, 10}, new int[]{2, 12}};
        e = new boolean[]{true, true, true, true, true, true, true, true, false, false, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true};
        ay = new int[]{0, 0, 0, 0, 0};
        t = new int[][]{aS, aT, aU, aV, aW, aX, aY, aZ, ay, ay, ba, bb, bc, bd, be, bf, bg, bh, bi, bm, bn, bo, ay, bj, bk, bl, bp};
        eH = 6;
        eI = dY + 195 + 30;
        u = new int[3][8];
        az = new int[6];
        aA = new int[]{-1, -1, -1, -1};
        an = false;
        f147f = new boolean[27];
        v = new int[35][4];
        aB = new int[2];
        aC = new int[2];
        w = new int[1][8];
        eL = 0;
        eM = (-5) * dz;
        x = new int[1][7];
        eS = 0;
        y = new int[3][2];
        g = new boolean[3];
        eU = (-5) * dz;
        z = new int[1][8];
        eW = 0;
        aq = false;
        eX = 0;
        eY = 0;
        eZ = 1;
        fa = 0;
        A = new int[9][8];
        c = new Object[700][];
        fe = 0;
        ff = 1;
        fg = 0;
        aD = new int[27];
        aE = new int[27];
    }

    public static void b(Object[] objArr) {
        objArr[0] = new float[7];
        objArr[8] = new int[4];
        objArr[13] = new boolean[1];
        ((int[]) objArr[8])[2] = 0;
        objArr[2] = new float[]{2.9f, 3.4f, 10887.996f, 486.42352f, -5099.3315f, 0.3f, 12.85f, 13.45f, -997.2001f, 5117.213f, 40.731f, 0.3f, 13.0f, 13.65f, 3997.2002f, 5117.213f, 3040.731f, 0.1f};
        objArr[12] = new float[80][4];
        objArr[4] = new float[2];
        ((boolean[]) objArr[13])[0] = true;
    }

    public static final void c(Object[] objArr) {
        ((int[]) objArr[8])[0] = 0;
        ((int[]) objArr[8])[3] = 0;
        ((int[]) objArr[8])[2] = 0;
        de = 5;
        eb = 1;
        objArr[11] = new float[26][];
        for (int i2 = 0; i2 < 26; i2++) {
            boolean z2 = aH[i2 << 1] != 0;
            ((float[][]) objArr[11])[i2] = m41a(aH[(i2 << 1) + 1], z2);
            a(((float[][]) objArr[11])[i2], z2);
        }
        objArr[1] = new r();
        ((r) objArr[1]).o(2, 15);
        h.f85g.aD();
        e.f28b = 75.0f;
        e.a(75.0f);
        float[] fArrM41a = m41a(131073, false);
        a(fArrM41a, false);
        int length = fArrM41a.length / 3;
        float[] fArr = new float[length * 6];
        for (int i3 = 0; i3 < length; i3++) {
            fArr[i3 * 6] = fArrM41a[i3 * 3];
            fArr[(i3 * 6) + 1] = fArrM41a[(i3 * 3) + 1];
            fArr[(i3 * 6) + 2] = fArrM41a[(i3 * 3) + 2];
        }
        float[] fArrM41a2 = m41a(131074, false);
        a(fArrM41a2, false);
        for (int i4 = 0; i4 < length; i4++) {
            fArr[(i4 * 6) + 3] = fArrM41a2[i4 * 3];
            fArr[(i4 * 6) + 4] = fArrM41a2[(i4 * 3) + 1];
            fArr[(i4 * 6) + 5] = fArrM41a2[(i4 * 3) + 2];
        }
        objArr[3] = fArr;
        a(objArr, 0.01f);
        objArr[10] = new t();
        ((t) objArr[10]).b(new int[][]{new int[]{-100, -100, 200, 200}});
        objArr[6] = new Transform();
        ((t) objArr[10]).R(327783);
        objArr[9] = new t(131095);
        objArr[7] = new boolean[24];
        objArr[5] = new n(c.a(new int[]{262160}), true);
        p.L();
        p.k(14, 0);
    }

    public static void ao() {
        h.f85g.aE();
    }

    public static final int b(Object[] objArr, int i2) {
        if (!((boolean[]) objArr[13])[0]) {
            return -1;
        }
        int i3 = (((int[]) objArr[8])[0] >= 3500 && ((int[]) objArr[8])[0] < 4250) || (((int[]) objArr[8])[0] >= 19100 && ((int[]) objArr[8])[0] < 20200) ? 8 : 25;
        ((int[]) objArr[8])[0] = ((int[]) objArr[8])[0] + i3;
        ((int[]) objArr[8])[1] = ((int[]) objArr[8])[1] + i3;
        if (((int[]) objArr[8])[0] > 12480 && ((int[]) objArr[8])[0] < 12840) {
            ((int[]) objArr[8])[0] = 12840;
        }
        for (int i4 = 0; i4 < (aG.length >> 1); i4++) {
            if (((int[]) objArr[8])[0] >= aG[i4 << 1] && ((int[]) objArr[8])[0] < aG[(i4 << 1) + 1]) {
                int i5 = (aG[i4 << 1] + 500) - ((int[]) objArr[8])[0];
                h.f90d = (((r() % 2000) - 1000) * i5) / 10000.0f;
                h.f91e = (((r() % 2000) - 1000) * i5) / 10000.0f;
            }
        }
        float f2 = (1.0f * ((int[]) objArr[8])[0]) / 1000.0f;
        for (int i6 = 0; i6 < ((float[][]) objArr[12]).length; i6++) {
            if (f2 > 8.45f + (0.03f * i6) && ((int[]) objArr[8])[3] <= i6) {
                float f3 = 10.0f * f2;
                int length = (int) f3;
                float f4 = f3 - length;
                float[] fArr = ((float[][]) objArr[11])[1];
                if ((length + 2) * 7 > fArr.length) {
                    length = (fArr.length / 7) - 2;
                }
                a(objArr, fArr, length, length + 1, f4, true);
                boolean z2 = i6 % 2 != 0;
                ((float[][]) objArr[12])[i6][0] = ((float[]) objArr[0])[4] + (z2 ? 150.0f : -150.0f);
                ((float[][]) objArr[12])[i6][1] = ((float[]) objArr[0])[6] + 80.0f;
                ((float[][]) objArr[12])[i6][2] = ((float[]) objArr[0])[5] + 10.0f;
                ((float[][]) objArr[12])[i6][3] = ((float[]) objArr[4])[z2 ? 1 : 0];
                ((int[]) objArr[8])[3] = ((int[]) objArr[8])[3] + 1;
            }
        }
        for (int i7 = 0; i7 < h.U.length; i7++) {
            h.U[i7] = Math.max(0, h.U[i7] - i3);
        }
        if (((int[]) objArr[8])[2] < aF.length && ((int[]) objArr[8])[0] >= aF[((int[]) objArr[8])[2]]) {
            h.l(aF[((int[]) objArr[8])[2] + 1]);
            ((int[]) objArr[8])[2] = ((int[]) objArr[8])[2] + 2;
        }
        h.n(i3);
        return ((int[]) objArr[8])[0] >= 25000 ? -2 : -1;
    }

    private static void a(Object[] objArr, float f2) {
        float length = (1.0f * ((float[]) objArr[3]).length) / 180.0f;
        float[] fArr = (float[]) objArr[3];
        float fMin = Math.min(f2 / length, 1.0f);
        int length2 = (fArr.length / 6) - 3;
        float f3 = fMin * length2;
        int iMin = Math.min((int) f3, length2 - 1);
        float f4 = f3 - iMin;
        int i2 = iMin * 6;
        float f5 = f4 * f4;
        for (int i3 = 0; i3 < 6; i3++) {
            float f6 = fArr[i2];
            float f7 = fArr[i2 + 6];
            float f8 = fArr[i2 + 12];
            float f9 = fArr[i2 + 18];
            f150e[i3] = 0.5f * ((f7 * 2.0f) + (((-f6) + f8) * f4) + (((((f6 * 2.0f) - (5.0f * f7)) + (4.0f * f8)) - f9) * f5) + (((((-f6) + (3.0f * f7)) - (3.0f * f8)) + f9) * f5 * f4));
            i2++;
        }
        h.f116g = f150e[0];
        h.f117h = f150e[2];
        h.f118i = f150e[1];
        h.f119j = f150e[3];
        h.f120k = f150e[5];
        h.f121l = f150e[4];
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0514  */
    /* JADX WARN: Code duplicated, block: B:115:0x052d  */
    /* JADX WARN: Code duplicated, block: B:123:0x056b  */
    /* JADX WARN: Code duplicated, block: B:126:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:129:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:132:0x0632  */
    /* JADX WARN: Code duplicated, block: B:201:0x082b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static final void a(Object[] objArr, Graphics graphics) {
        float f2;
        int i2;
        float f3 = (1.0f * ((int[]) objArr[8])[0]) / 1000.0f;
        a(objArr, f3);
        graphics.setColor(0);
        graphics.fillRect(0, 0, dm, dn);
        e.a(graphics);
        h.q(((int[]) objArr[8])[1]);
        if (f3 < 20.4f) {
            h.a(1.2f * ((float) Math.sin(2.151990975199149d * ((double) Math.min(f3, 1.0f)))), ((int[]) objArr[8])[0] < 11300 || ((int[]) objArr[8])[0] > 13000);
        }
        for (int i3 = 0; i3 < f149d.length; i3 += 4) {
            if (f3 >= f149d[i3] && f3 < f149d[i3 + 1]) {
                h.a(f149d[i3 + 2], 0.0f, f149d[i3 + 3], (int) ((f3 - f149d[i3]) * 6.0f * 256.0f));
            }
        }
        for (int i4 = 0; i4 < ((float[]) objArr[2]).length; i4 += 6) {
            if (f3 >= ((float[]) objArr[2])[i4] && f3 < ((float[]) objArr[2])[i4 + 1]) {
                float fSin = ((float[]) objArr[2])[i4 + 5] * ((float) Math.sin((3.141592653589793d * ((double) (f3 - ((float[]) objArr[2])[i4]))) / ((double) (((float[]) objArr[2])[i4 + 1] - ((float[]) objArr[2])[i4]))));
                ((t) objArr[9]).setIdentity();
                ((t) objArr[9]).az = true;
                ((t) objArr[9]).n = 45.0f;
                ((t) objArr[9]).postTranslate(((float[]) objArr[2])[i4 + 2], ((float[]) objArr[2])[i4 + 3], ((float[]) objArr[2])[i4 + 4]);
                ((t) objArr[9]).postScale(fSin, fSin, fSin);
                ((t) objArr[9]).aF();
            }
        }
        for (int i5 = 0; i5 < 26; i5++) {
            int i6 = i5;
            float[] fArr = ((float[][]) objArr[11])[i5];
            float f4 = f3;
            int i7 = aH[i6 << 1];
            if ((i7 == 2 || f4 < 20.4f) && (i7 != 2 || f4 < 20.4f || f4 >= 20.7f)) {
                int i8 = i6 - 2;
                t tVar = null;
                switch (i7) {
                    case 0:
                        t tVar2 = h.y;
                        tVar = tVar2;
                        tVar2.az = true;
                        break;
                    case 1:
                        tVar = h.f84f;
                        break;
                    case 2:
                        r rVar = (r) objArr[1];
                        tVar = rVar;
                        r rVar2 = rVar;
                        int i9 = i8 + 1;
                        if (f4 < 13.0f) {
                            i2 = (i9 < 10 || i9 > 15) ? 8 : 9;
                        } else if (f4 >= 20.5f) {
                            switch (i9) {
                                case 1:
                                case 14:
                                case 23:
                                    i2 = 1;
                                    break;
                                case 2:
                                case 5:
                                case 8:
                                case 9:
                                case 13:
                                case 15:
                                case 16:
                                case 20:
                                case 21:
                                default:
                                    i2 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 6:
                                case 10:
                                case 11:
                                case 19:
                                case 22:
                                    i2 = 0;
                                    break;
                                case 7:
                                case 12:
                                case 17:
                                case 18:
                                    i2 = 2;
                                    break;
                            }
                        } else if (i9 > 8) {
                            switch (i9) {
                                case 9:
                                case 16:
                                    i2 = 19;
                                    break;
                                case 10:
                                case 11:
                                case 14:
                                case 15:
                                case 19:
                                case 22:
                                default:
                                    i2 = 7;
                                    break;
                                case 12:
                                case 13:
                                case 20:
                                case 21:
                                    i2 = 6;
                                    break;
                                case 17:
                                case 24:
                                    i2 = 5;
                                    break;
                                case 18:
                                case 23:
                                    i2 = 4;
                                    break;
                            }
                        } else {
                            i2 = 18;
                        }
                        rVar2.N(i2);
                        tVar.setColor(16777215);
                        if (f4 > 7.0f && f4 < 12.0f) {
                            f4 = 7.0f;
                        }
                        break;
                }
                float f5 = (i7 == 0 ? 30.0f : 10.0f) * f4;
                int i10 = i7 != 0 ? 7 : 3;
                int i11 = (int) f5;
                int i12 = i11;
                int i13 = i11 + 1;
                float f6 = f5 - i12;
                if ((i12 + 2) * i10 > fArr.length) {
                    int length = (fArr.length / i10) - 1;
                    i13 = length;
                    i12 = length;
                }
                a(objArr, fArr, i12, i13, f6, i7 != 0);
                if (tVar != null) {
                    tVar.setIdentity();
                    tVar.postTranslate(((float[]) objArr[0])[4], ((float[]) objArr[0])[6], ((float[]) objArr[0])[5]);
                    if (i7 != 0) {
                        tVar.postRotateQuat(((float[]) objArr[0])[0], ((float[]) objArr[0])[2], -((float[]) objArr[0])[1], ((float[]) objArr[0])[3]);
                    }
                    if (i7 == 2) {
                        tVar.postTranslate(0.0f, 100.0f, 0.0f);
                        if (f4 <= 7.0f || f4 >= 12.0f) {
                            tVar.aF();
                            f2 = 54;
                            if (((float[]) objArr[0])[4] >= f2 && ((float[]) objArr[0])[4] <= h.a(20) - f2 && ((float[]) objArr[0])[5] >= f2 && ((float[]) objArr[0])[5] <= h.b(17) - f2) {
                                if (i7 == 0) {
                                    t tVar3 = h.A;
                                    tVar3.setIdentity();
                                    tVar3.postTranslate(((float[]) objArr[0])[4], -50.0f, ((float[]) objArr[0])[5]);
                                    tVar3.postScale(0.8f, 0.8f, 0.8f);
                                    tVar3.aF();
                                }
                                if (i7 == 1) {
                                    t tVar4 = h.f85g;
                                    tVar4.setIdentity();
                                    tVar4.postTranslate(((float[]) objArr[0])[4], -50.0f, ((float[]) objArr[0])[5] + 100.0f);
                                    tVar4.postRotateQuat(((float[]) objArr[0])[0], 0.0f, ((float[]) objArr[0])[1], ((float[]) objArr[0])[3]);
                                    tVar4.aF();
                                }
                            }
                            if (i7 == 0) {
                                h.z.setIdentity();
                                h.z.postTranslate(((float[]) objArr[0])[4], ((float[]) objArr[0])[6], ((float[]) objArr[0])[5]);
                                h.z.az = true;
                                h.z.aF();
                            }
                            if (i7 != 1 && f4 < 12.0f) {
                                float f7 = f4;
                                float f8 = f7 - 7.8f;
                                if (f8 >= 0.0f) {
                                    t tVar5 = h.x;
                                    float fSin2 = 1.0f * ((float) Math.sin(3.141592653589793d * ((double) Math.min(f8, 0.5f))));
                                    tVar5.setIdentity();
                                    tVar5.postTranslate(((float[]) objArr[0])[4], ((float[]) objArr[0])[6] + 40.0f, ((float[]) objArr[0])[5] + 100.0f);
                                    tVar5.postScale(1.0f, fSin2, fSin2);
                                    tVar5.postTranslate(0.0f, 0.0f, -30.0f);
                                    tVar5.aF();
                                    t tVar6 = h.w;
                                    float f9 = f8 - 0.3f;
                                    int i14 = 0;
                                    while (i14 < 2) {
                                        if (f9 > 0.0f) {
                                            float f10 = i14 == 1 ? 150.0f : -150.0f;
                                            float fSin3 = (i14 == 0 ? 0.0625f : -0.0625f) + (0.0625f * ((float) Math.sin(6.283185307179586d * ((double) f9))));
                                            float fSin4 = 1.4f * ((float) Math.sin(2.356194490192345d * ((double) Math.min(f9, 1.0f))));
                                            tVar6.setIdentity();
                                            tVar6.postTranslate(((float[]) objArr[0])[4] + f10, ((float[]) objArr[0])[6] + 60.0f, ((float[]) objArr[0])[5] + 10.0f);
                                            tVar6.postRotate(fSin3, 0.0f, 1.0f, 0.0f);
                                            tVar6.postScale(fSin4, fSin4, fSin4);
                                            tVar6.aF();
                                            ((float[]) objArr[4])[i14] = fSin3;
                                        }
                                        i14++;
                                    }
                                    for (int i15 = 0; i15 < ((float[][]) objArr[12]).length; i15++) {
                                        float f11 = 8.45f + (0.03f * i15);
                                        if (f7 > f11 && f7 < f11 + 1.0f && i15 < ((int[]) objArr[8])[3]) {
                                            float f12 = ((float[][]) objArr[12])[i15][3];
                                            h.l.az = true;
                                            h.l.setIdentity();
                                            h.l.postTranslate(((float[][]) objArr[12])[i15][0], ((float[][]) objArr[12])[i15][1], ((float[][]) objArr[12])[i15][2]);
                                            h.l.postRotate(f12, 0.0f, 1.0f, 0.0f);
                                            h.l.postTranslate(0.0f, 0.0f, ((-3000.0f) * (f7 - f11)) - 120.0f);
                                            h.l.postScale(0.2f, 0.2f, 0.2f);
                                            h.l.aF();
                                        }
                                    }
                                }
                            }
                        } else {
                            if (f4 >= f148c[i8] && f4 < f148c[i8] + 0.2f) {
                                if (!((boolean[]) objArr[7])[i8]) {
                                    h.h((int) ((float[]) objArr[0])[4], (int) ((float[]) objArr[0])[5]);
                                    ((boolean[]) objArr[7])[i6 - 2] = true;
                                }
                                int i16 = 255 - ((int) ((f4 - f148c[i8]) * 380.0f));
                                tVar.setColor((i16 << 16) | (i16 << 8) | i16);
                                tVar.setAppearance(h.f83a);
                            } else if (f4 < f148c[i8] + 0.2f) {
                            }
                            tVar.aF();
                            f2 = 54;
                            if (((float[]) objArr[0])[4] >= f2) {
                                if (i7 == 0) {
                                    t tVar7 = h.A;
                                    tVar7.setIdentity();
                                    tVar7.postTranslate(((float[]) objArr[0])[4], -50.0f, ((float[]) objArr[0])[5]);
                                    tVar7.postScale(0.8f, 0.8f, 0.8f);
                                    tVar7.aF();
                                }
                                if (i7 == 1) {
                                    t tVar8 = h.f85g;
                                    tVar8.setIdentity();
                                    tVar8.postTranslate(((float[]) objArr[0])[4], -50.0f, ((float[]) objArr[0])[5] + 100.0f);
                                    tVar8.postRotateQuat(((float[]) objArr[0])[0], 0.0f, ((float[]) objArr[0])[1], ((float[]) objArr[0])[3]);
                                    tVar8.aF();
                                }
                            }
                            if (i7 == 0) {
                                h.z.setIdentity();
                                h.z.postTranslate(((float[]) objArr[0])[4], ((float[]) objArr[0])[6], ((float[]) objArr[0])[5]);
                                h.z.az = true;
                                h.z.aF();
                            }
                            if (i7 != 1) {
                            }
                        }
                    } else {
                        tVar.aF();
                        f2 = 54;
                        if (((float[]) objArr[0])[4] >= f2) {
                            if (i7 == 0) {
                                t tVar9 = h.A;
                                tVar9.setIdentity();
                                tVar9.postTranslate(((float[]) objArr[0])[4], -50.0f, ((float[]) objArr[0])[5]);
                                tVar9.postScale(0.8f, 0.8f, 0.8f);
                                tVar9.aF();
                            }
                            if (i7 == 1) {
                                t tVar10 = h.f85g;
                                tVar10.setIdentity();
                                tVar10.postTranslate(((float[]) objArr[0])[4], -50.0f, ((float[]) objArr[0])[5] + 100.0f);
                                tVar10.postRotateQuat(((float[]) objArr[0])[0], 0.0f, ((float[]) objArr[0])[1], ((float[]) objArr[0])[3]);
                                tVar10.aF();
                            }
                        }
                        if (i7 == 0) {
                            h.z.setIdentity();
                            h.z.postTranslate(((float[]) objArr[0])[4], ((float[]) objArr[0])[6], ((float[]) objArr[0])[5]);
                            h.z.az = true;
                            h.z.aF();
                        }
                        if (i7 != 1) {
                        }
                    }
                }
            }
        }
        h.A();
        if (f3 < 20.4f) {
            e.f24a.getProjection((Transform) objArr[6]);
            e.f24a.setParallel(200.0f, 1.0f, 0.0f, 10000.0f);
            e.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2000.0f, 0.0f, 1.0f, 0.0f);
            ((t) objArr[10]).az = true;
            ((t) objArr[10]).setIdentity();
            ((t) objArr[10]).postTranslate(0.0f, 0.0f, 2000.0f);
            ((t) objArr[10]).postScale(1.0f, 0.835f, 1.0f);
            ((t) objArr[10]).aF();
            e.f24a.setGeneric((Transform) objArr[6]);
            h.y();
        }
        if (f3 >= 19.1f && f3 < 21.05f) {
            float f13 = f3 - 19.1f;
            h.e.setIdentity();
            h.e.az = true;
            h.e.postTranslate(1020.0f, 720.0f, 1000.0f);
            float f14 = f13 < 1.2999992f ? 10.0f * f13 : 20.0f * ((1.2999992f + 0.65f) - f13);
            h.e.postScale(f14, f14, f14);
            h.e.aF();
        }
        e.b(graphics);
        int iM = p.m();
        if (((int[]) objArr[8])[0] >= 22200) {
            int iMin = Math.min((iM - ((n) objArr[5]).k[3]) / 2, ((((int[]) objArr[8])[0] - 22200) / 2) - ((n) objArr[5]).k[3]);
            int i17 = ((p.i() - ((n) objArr[5]).k[2]) >> 1) + ((n) objArr[5]).k[0];
            if (((int[]) objArr[8])[0] >= 22600 && ((int[]) objArr[8])[0] < 23000) {
                i17 += (r() % 6) - 3;
                iMin += (r() % 6) - 3;
            }
            ((n) objArr[5]).c(graphics, i17, iMin);
        }
        int iMax = iM / 12;
        if (((int[]) objArr[8])[0] >= 22800) {
            iMax = Math.max(0, iMax - ((((int[]) objArr[8])[0] - 22800) / 20));
        }
        graphics.setColor(0);
        graphics.fillRect(0, 0, p.i(), iMax);
        graphics.fillRect(0, p.m() - iMax, p.i(), iMax);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static float[] m41a(int i2, boolean z2) {
        float[] fArr = null;
        short s2 = z2 ? (short) 7 : (short) 3;
        try {
            DataInputStream dataInputStreamM32a = p.m32a(i2);
            short sA = a(dataInputStreamM32a);
            fArr = new float[sA * s2];
            new StringBuffer().append("rid ").append(i2).append(" anim len: ").append((int) sA).toString();
            for (int i3 = 0; i3 < sA; i3++) {
                for (int i4 = 0; i4 < 3; i4++) {
                    fArr[(i3 * s2) + i4] = a(dataInputStreamM32a) / 10.0f;
                }
                if (z2) {
                    for (int i5 = 3; i5 < s2; i5++) {
                        fArr[(i3 * s2) + i5] = a(dataInputStreamM32a) / 32000.0f;
                    }
                }
            }
            dataInputStreamM32a.close();
        } catch (Throwable th) {
            new StringBuffer().append("e: ").append(th).toString();
        }
        return fArr;
    }

    private static short a(DataInputStream dataInputStream) {
        short s2 = 0;
        for (int i2 = 0; i2 < 16; i2 += 8) {
            s2 = (short) (s2 | ((dataInputStream.readByte() & 255) << i2));
        }
        return s2;
    }

    private static void a(float[] fArr, boolean z2) {
        int i2 = z2 ? 7 : 3;
        int length = fArr.length / i2;
        float fA2 = h.a(20) / 2.0f;
        float fB2 = h.b(17) / 2.0f;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * i2;
            fArr[i4] = fArr[i4] * 11.111111f;
            int i5 = (i3 * i2) + 1;
            fArr[i5] = fArr[i5] * (-11.111111f);
            int i6 = (i3 * i2) + 2;
            fArr[i6] = fArr[i6] * 11.111111f;
            int i7 = i3 * i2;
            fArr[i7] = fArr[i7] + fA2;
            int i8 = (i3 * i2) + 1;
            fArr[i8] = fArr[i8] + fB2;
            if (z2) {
                for (int i9 = 0; i9 < 4; i9++) {
                    float f2 = fArr[(i3 * i2) + 3 + i9];
                    float f3 = f2;
                    if (Math.abs(f2) < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[(i3 * i2) + 3 + i9] = f3;
                }
            }
        }
    }

    private static void a(Object[] objArr, float[] fArr, int i2, int i3, float f2, boolean z2) {
        float f3 = 1.0f - f2;
        int i4 = z2 ? 7 : 3;
        int i5 = i2 * i4;
        int i6 = i3 * i4;
        ((float[]) objArr[0])[4] = (f3 * fArr[i5]) + (f2 * fArr[i6]);
        ((float[]) objArr[0])[5] = (f3 * fArr[i5 + 1]) + (f2 * fArr[i6 + 1]);
        ((float[]) objArr[0])[6] = (f3 * fArr[i5 + 2]) + (f2 * fArr[i6 + 2]);
        if (z2) {
            float f4 = fArr[i5 + 3];
            float f5 = fArr[i5 + 4];
            float f6 = fArr[i5 + 5];
            float f7 = fArr[i5 + 6];
            float f8 = fArr[i6 + 3];
            float f9 = fArr[i6 + 4];
            float f10 = fArr[i6 + 5];
            float f11 = fArr[i6 + 6];
            if ((f5 * f9) + (f6 * f10) + (f7 * f11) + (f4 * f8) < 0.0f) {
                f2 = -f2;
            }
            ((float[]) objArr[0])[3] = (f3 * f4) + (f2 * f8);
            ((float[]) objArr[0])[0] = (f3 * f5) + (f2 * f9);
            ((float[]) objArr[0])[1] = (f3 * f6) + (f2 * f10);
            ((float[]) objArr[0])[2] = (f3 * f7) + (f2 * f11);
            float f12 = ((float[]) objArr[0])[3];
            float f13 = ((float[]) objArr[0])[0];
            float f14 = ((float[]) objArr[0])[1];
            float f15 = ((float[]) objArr[0])[2];
            float f16 = f14;
            float f17 = f13;
            float f18 = f12;
            if (Math.abs(f12) < 1.0E-4f) {
                f18 = 0.0f;
            }
            if (Math.abs(f17) < 1.0E-4f) {
                f17 = 0.0f;
            }
            if (Math.abs(f16) < 1.0E-4f) {
                f16 = 0.0f;
            }
            if (Math.abs(f15) < 1.0E-4f) {
                f15 = 0.0f;
            }
            float fSqrt = 1.0f / ((float) Math.sqrt((((f18 * f18) + (f17 * f17)) + (f16 * f16)) + (f15 * f15)));
            ((float[]) objArr[0])[3] = ((float[]) objArr[0])[3] * fSqrt;
            ((float[]) objArr[0])[0] = ((float[]) objArr[0])[0] * fSqrt;
            ((float[]) objArr[0])[1] = ((float[]) objArr[0])[1] * fSqrt;
            ((float[]) objArr[0])[2] = ((float[]) objArr[0])[2] * fSqrt;
        }
    }

    private static boolean h(int i2) {
        for (int i3 = 0; i3 < B.length; i3++) {
            if (B[i3][0] == i2 && aI[i3] > 0) {
                return true;
            }
        }
        return false;
    }

    private static void M(int i2) {
        if (u(i2) >= 0) {
            d(71, 0, 0);
            b(20, true);
        }
    }

    public static final int u(int i2) {
        boolean z2;
        int i3 = -1;
        for (int i4 = 0; i4 < B.length; i4++) {
            if (B[i4][0] == i2 || i2 == -1) {
                int i5 = i4;
                if (aI[i5] != 0) {
                    z2 = false;
                } else {
                    int i6 = B[i5][1];
                    boolean z3 = false;
                    int i7 = cW + fd;
                    switch (B[i5][0]) {
                        case 0:
                            z3 = de == 2 && dh >= i6;
                            break;
                        case 1:
                            z3 = de == 2 && ep >= i6;
                            break;
                        case 2:
                            z3 = de == 1 && dL >= i6;
                            break;
                        case 3:
                            z3 = dO >= i6;
                            break;
                        case 4:
                            z3 = de == 1 && dH >= i6;
                            break;
                        case 5:
                            z3 = de == 1 && i7 + 1 >= i6;
                            break;
                        case 6:
                            z3 = dI >= i6;
                            break;
                        case 7:
                            z3 = de == 1 && ep >= i6;
                            break;
                        case 8:
                            z3 = x(n()) >= i6;
                            break;
                        case 9:
                            z3 = dD >= i6;
                            break;
                        case 10:
                            z3 = dC >= i6;
                            break;
                        case 11:
                            z3 = dG >= i6;
                            break;
                        case 12:
                            z3 = dE >= i6;
                            break;
                        case 13:
                            z3 = dF >= i6;
                            break;
                        case 14:
                            z3 = dN >= i6;
                            break;
                        case 15:
                            z3 = de == 3 && df == 1 && cZ >= i6 * 1000;
                            break;
                        case 16:
                            z3 = de == 3 && df == 2 && cZ >= i6 * 1000;
                            break;
                        case 17:
                            z3 = de == 3 && df == 3 && cZ >= i6 * 1000;
                            break;
                        case 18:
                            z3 = de == 3 && df == 4 && cZ >= i6 * 1000;
                            break;
                        case 19:
                            z3 = de == 3 && !af && ew < (i6 << 2);
                            break;
                        case 20:
                            z3 = de == 4 && i7 + 1 >= i6;
                            break;
                    }
                    if (z3) {
                        aI[i5] = 1;
                        new StringBuffer().append("Completed achievement ").append(i5).append(" ").append(p.c(B[i5][3])).toString();
                        b.addElement(new Integer(i5));
                    }
                    z2 = z3;
                }
                if (z2) {
                    i3 = i4;
                }
            }
        }
        return i3;
    }

    public static void f(boolean z2) {
        String string;
        int i2;
        if (f151e == null) {
            f151e = new f[3];
            f153d = new Transform();
            h.s();
        }
        if (!z2) {
            b.size();
            fm = ((Integer) b.elementAt(0)).intValue();
            b.removeElement(new Integer(fm));
        }
        if (f151e[0] == null) {
            f151e[0] = new f();
            f151e[0].a(1, 1, 1);
            f151e[0].a(p.c(424), null);
            f151e[0].a(0, 1, "", (Image[]) null, 0);
            f151e[0].a(2);
            f151e[0].a(p.i(), p.m(), false);
        }
        if (z2) {
            f151e[0].f38m[0] = -1;
            f151e[0].f38m[1] = 5;
        } else {
            f151e[0].f38m[0] = 1;
            f151e[0].f38m[1] = -1;
        }
        f151e[0].g();
        int i3 = z2 ? fl : fm;
        f151e[1] = new f();
        f151e[1].a(0, 1, 1);
        f151e[1].a(2);
        f151e[1].a(DCWall3D.i, DCWall3D.i, DCWall3D.i);
        f151e[1].a(new StringBuffer().append(Integer.toString(i3 + 1)).append(". ").append(p.c(B[i3][2])).toString(), null);
        f151e[1].a(p.i() - (4 * h.f77i.k[2]), p.m() / 4, false);
        f151e[2] = new f();
        f151e[2].a(1, 1, 1);
        f fVar = f151e[2];
        StringBuffer stringBufferAppend = new StringBuffer().append(p.a(p.c(B[i3][3]), new String[]{m43g(B[i3][1])}));
        if (aI[i3] == 0) {
            int i4 = B[i3][1];
            switch (B[i3][0]) {
                case 2:
                    i2 = dL;
                    string = new StringBuffer().append(" (").append(m43g(i2)).append("/").append(m43g(i4)).append(")").toString();
                    break;
                case 3:
                    i2 = dO;
                    string = new StringBuffer().append(" (").append(m43g(i2)).append("/").append(m43g(i4)).append(")").toString();
                    break;
                case 4:
                    i2 = dH;
                    string = new StringBuffer().append(" (").append(m43g(i2)).append("/").append(m43g(i4)).append(")").toString();
                    break;
                case 5:
                case 7:
                case 8:
                default:
                    string = "";
                    break;
                case 6:
                    i2 = dI;
                    string = new StringBuffer().append(" (").append(m43g(i2)).append("/").append(m43g(i4)).append(")").toString();
                    break;
                case 9:
                    i2 = dD;
                    string = new StringBuffer().append(" (").append(m43g(i2)).append("/").append(m43g(i4)).append(")").toString();
                    break;
                case 10:
                    i2 = dC;
                    string = new StringBuffer().append(" (").append(m43g(i2)).append("/").append(m43g(i4)).append(")").toString();
                    break;
                case 11:
                    i2 = dG;
                    string = new StringBuffer().append(" (").append(m43g(i2)).append("/").append(m43g(i4)).append(")").toString();
                    break;
                case 12:
                    i2 = dE;
                    string = new StringBuffer().append(" (").append(m43g(i2)).append("/").append(m43g(i4)).append(")").toString();
                    break;
                case 13:
                    i2 = dF;
                    string = new StringBuffer().append(" (").append(m43g(i2)).append("/").append(m43g(i4)).append(")").toString();
                    break;
                case 14:
                    i2 = dN;
                    string = new StringBuffer().append(" (").append(m43g(i2)).append("/").append(m43g(i4)).append(")").toString();
                    break;
            }
        } else {
            string = "";
        }
        fVar.a(0, 1, stringBufferAppend.append(string).toString(), (Image[]) null, 0);
        f151e[2].a(2);
        f151e[2].a(p.i(), ((9 * dn) / 10) - ((dn * 52) / 100), false);
    }

    public static int v(int i2) {
        h.p(i2);
        for (int i3 = 0; i3 < 3; i3++) {
            if (f151e[i3] != null) {
                f151e[i3].m14a(i2);
            }
        }
        return fk;
    }

    public static final void c(int i2, int i3, boolean z2) {
        if (f151e[2] != null) {
            f151e[2].m15b(i2, i3);
        }
        if (i3 == 0) {
            int i4 = p.i(i2);
            if (z2) {
                if (i4 == 52 || i4 == 54) {
                    if (i4 == 52) {
                        int i5 = fl - 1;
                        fl = i5;
                        if (i5 < 0) {
                            fl = B.length - 1;
                        }
                    }
                    if (i4 == 54) {
                        int i6 = fl + 1;
                        fl = i6;
                        if (i6 >= B.length) {
                            fl = 0;
                        }
                    }
                    f(true);
                }
            } else if (i4 == 53) {
                fk = 1;
            }
        }
        if (i3 == 3) {
            if (i2 == 1) {
                fk = 1;
            } else if (i2 == 5) {
                fk = 2;
            }
        }
    }

    public static boolean e() {
        return b.size() > 0;
    }

    public static void a(Graphics graphics, boolean z2) {
        e.a(graphics);
        h.B();
        e.f24a.getProjection(f153d);
        e.f24a.setParallel(3000.0f, 1.0f, 0.0f, 10000.0f);
        e.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2000.0f, 0.0f, 1.0f, 0.0f);
        int height = DCWall3D.k.getHeight() + 12;
        int height2 = ((DCWall3D.k.getHeight() + 12) + DCWall3D.j.getHeight()) - (h.f77i.k[3] >> 1);
        if (aI[z2 ? fl : fm] != 0) {
            h.q.a(h.f98a);
            h.r.a(h.f98a);
        } else {
            h.q.setColor(13421772);
            h.q.a((Texture2D) null);
            h.r.setColor(13421772);
            h.r.a((Texture2D) null);
        }
        h.q.setIdentity();
        h.q.postTranslate(0.0f, 280.0f, 2000.0f);
        h.q.postRotate(h.be / 4000.0f, 0.0f, 1.0f, 0.0f);
        h.q.aF();
        h.r.setIdentity();
        h.r.postTranslate(0.0f, 280.0f, 2000.0f);
        h.r.postRotate(h.be / 5000.0f, 0.0f, 1.0f, 0.0f);
        h.r.postRotate((0.03f * ((float) Math.sin((3.141592653589793d * ((double) h.be)) / 10000.0d))) - 0.55f, 1.0f, 0.0f, 0.0f);
        h.r.aF();
        e.f24a.setGeneric(f153d);
        e.b(graphics);
        f151e[0].a(graphics, 0, 0);
        if (f151e[1] != null) {
            f151e[1].a(graphics, 2 * h.f77i.k[2], height);
        }
        if (z2) {
            int iAbs = ((dm >> 5) * Math.abs(((int) System.currentTimeMillis()) % 600)) / 600;
            h.f77i.c(graphics, h.f77i.k[2] + iAbs, height2);
            h.j.c(graphics, (p.i() - h.j.k[2]) - iAbs, height2);
        }
        f151e[2].a(graphics, 0, (dn * 52) / 100);
        if (z2) {
            a(graphics, (dn * 9) / 10, fl, false);
        }
    }

    public static final void b(f fVar) {
        fVar.a(1, 15, 0);
        fVar.a(p.c(423), null);
        int i2 = dl / 1000;
        int i3 = i2 / 3600;
        int i4 = i2 - (i3 * 3600);
        int i5 = i4 / 60;
        fVar.a(0, 1, p.a(p.c(449), new String[]{m43g(b.f14a[1][0][0])}), (Image[]) null, 0);
        fVar.a(1, 1, p.a(p.c(450), new String[]{m43g(b.f14a[2][0][0])}), (Image[]) null, 0);
        fVar.a(2, 1, p.a(p.c(459), new String[]{m43g(b.f14a[3][0][0])}), (Image[]) null, 0);
        fVar.a(3, 1, p.a(p.c(460), new String[]{m43g(b.f14a[4][0][0])}), (Image[]) null, 0);
        fVar.a(4, 1, p.a(p.c(456), new String[]{m43g(dJ)}), (Image[]) null, 0);
        fVar.a(5, 1, p.a(p.c(457), new String[]{m43g(dK)}), (Image[]) null, 0);
        fVar.a(6, 1, p.a(p.c(447), new String[]{new StringBuffer().append("").append(i3).toString(), new StringBuffer().append("").append(i5).toString(), new StringBuffer().append("").append(i4 - (i5 * 60)).toString()}), (Image[]) null, 0);
        fVar.a(7, 1, p.a(p.c(446), new String[]{m43g(dB)}), (Image[]) null, 0);
        fVar.a(8, 1, p.a(p.c(448), new String[]{m43g(f146do + 1)}), (Image[]) null, 0);
        fVar.a(9, 1, p.a(p.c(458), new String[]{m43g(dM)}), (Image[]) null, 0);
        fVar.a(10, 1, p.a(p.c(452), new String[]{m43g(dC), m43g(dD), m43g(dE), m43g(dF)}), (Image[]) null, 0);
        fVar.a(11, 1, p.a(p.c(453), new String[]{m43g(dG)}), (Image[]) null, 0);
        fVar.a(12, 1, p.a(p.c(454), new String[]{m43g(dH)}), (Image[]) null, 0);
        fVar.a(13, 1, p.a(p.c(455), new String[]{m43g(dI)}), (Image[]) null, 0);
        fVar.a(14, 1, p.a(p.c(461), new String[]{Integer.toString(t())}), (Image[]) null, 0);
        fVar.f38m[0] = -1;
        fVar.f38m[1] = 5;
        fVar.a(p.i(), p.m(), false);
        fVar.g();
    }

    private static int t() {
        int i2 = 0;
        for (int i3 = 0; i3 < B.length; i3++) {
            if (aI[i3] > 0) {
                i2++;
            }
        }
        return i2;
    }

    private static int u() {
        int iR;
        boolean z2 = false;
        for (int i2 = 0; i2 < aK.length; i2++) {
            if (aI[aK[i2]] == 0) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            return -1;
        }
        do {
            iR = r() % aK.length;
        } while (aI[aK[iR]] != 0);
        return iR;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    private static String m42f(int i2) {
        String strC = p.c(aJ[i2]);
        int i3 = aK[i2];
        int iN = 0;
        int i4 = 0;
        int i5 = -1;
        switch (i2) {
            case 0:
                int i6 = -1;
                int iX = x(n());
                for (int i7 = 0; i7 <= i3; i7++) {
                    if (B[i7][0] == 8) {
                        if (i6 >= 0) {
                            if (iX >= B[i6][1] && iX < B[i7][1]) {
                                i3 = i7;
                                iN = n();
                                i4 = aO[B[i3][1]] - iN;
                                i5 = B[i3][2];
                            }
                            i6 = i7;
                        } else {
                            if (iX == 0) {
                                i3 = i7;
                                iN = n();
                                i4 = aO[B[i3][1]] - iN;
                                i5 = B[i3][2];
                            }
                            i6 = i7;
                        }
                        break;
                    }
                }
                iN = n();
                i4 = aO[B[i3][1]] - iN;
                i5 = B[i3][2];
                break;
            case 1:
                int i8 = -1;
                int i9 = f146do + 1;
                for (int i10 = 0; i10 <= i3; i10++) {
                    if (B[i10][0] == 5) {
                        if (i8 >= 0 && i9 >= B[i8][1] && i9 < B[i10][1]) {
                            i3 = i10;
                            iN = i9;
                        } else {
                            i8 = i10;
                        }
                        break;
                    }
                }
                iN = i9;
                break;
            case 2:
                iN = dC;
                break;
            case 3:
                iN = dD;
                break;
            case 4:
                iN = dE;
                break;
            case 5:
                iN = dF;
                break;
        }
        if (i2 != 0) {
            i4 = B[i3][1] - iN;
            i5 = B[i3][2];
        }
        return p.a(strC, new String[]{m43g(iN), m43g(i4), p.c(i5)});
    }

    public static void ap() {
        if (f152r == null) {
            f152r = new n(c.a(new int[]{196639}), true);
            f153d = new Transform();
        }
        int iU = u();
        if (iU >= 0) {
            h = f.a(m42f(iU), DCWall3D.i, p.i() - 8);
        } else {
            h = null;
        }
    }

    public static void d(Graphics graphics) {
        graphics.setColor(47851);
        graphics.fillRect(0, 0, dm, dn);
        DCWall3D.k.a(graphics, p.c(463), dm >> 1, 6, 17);
        int height = 6 + DCWall3D.i.getHeight() + 8;
        if (f152r != null) {
            f152r.c(graphics, ((dm - f152r.k[2]) >> 1) + f152r.k[0], height + f152r.k[1]);
            height += f152r.k[3];
        }
        int height2 = height + 8;
        for (int i2 = 0; i2 < h.length; i2++) {
            DCWall3D.i.a(graphics, h[i2], dm >> 1, height2, 17);
            System.out.println(new StringBuffer().append("1111  ").append(h[i2]).toString());
            height2 += DCWall3D.i.getHeight();
        }
    }

    public static void aq() {
        String strC = p.c(477);
        if (strC == null || strC == "" || strC == " ") {
            f154a = ' ';
        } else {
            f154a = strC.charAt(0);
        }
    }

    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    private static String m43g(int i2) {
        if (f154a == ' ' || i2 < 1000) {
            return Integer.toString(i2);
        }
        for (int i3 = 0; i3 < f155b.length; i3++) {
            f155b[i3] = ' ';
        }
        int length = f155b.length - 1;
        do {
            int i4 = length;
            length = i4 - 1;
            f155b[i4] = (char) (((byte) (i2 % 10)) + 48);
            i2 /= 10;
            if (length % 4 == 0) {
                length--;
                f155b[length] = f154a;
            }
        } while (i2 > 0);
        int i5 = length + 1;
        if (f155b[i5] == f154a) {
            i5++;
        }
        return String.valueOf(f155b, i5, f155b.length - i5);
    }

    private static int f(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int[] iArr2;
        fn = i3;
        switch (i3) {
            case 0:
            case 3:
            case 4:
                switch (fn) {
                    case 0:
                        i6 = 0;
                        iArr = bq;
                        iArr2 = br;
                        break;
                    case 1:
                    case 2:
                    default:
                        i6 = -1;
                        iArr = null;
                        iArr2 = null;
                        break;
                    case 3:
                        i6 = 4;
                        iArr = bt;
                        iArr2 = bu;
                        break;
                    case 4:
                        i6 = 5;
                        iArr = null;
                        iArr2 = bv;
                        break;
                }
                aL = new int[8];
                aM = new int[8];
                fq = 0;
                a(p.m32a(65538), i6, i2, 0, 1);
                fo = A[i2][2];
                b(aL, 0, fo);
                fp = iArr2[df - 1];
                if (fn == 0) {
                    aL[5] = dz;
                } else {
                    aL[5] = aL[1];
                }
                aL[4] = 2 * dy;
                aL[6] = 16 * dy;
                if (fn == 4) {
                    aL[7] = aL[3];
                } else {
                    aL[7] = (16 - iArr[df - 1]) * dz;
                }
                aM[4] = aL[0];
                aM[5] = aL[1];
                a(aM, aM[4], aM[5], fp);
                m(i2, fo);
                for (int i7 = 0; i7 < fo; i7++) {
                    Object[] objArr = c[i7];
                    int iM47d = m47d(objArr);
                    int i8 = 3;
                    if (iM47d == 2) {
                        fq++;
                    }
                    switch (df) {
                        case 2:
                            if (iM47d == 1) {
                                i8 = 4;
                            }
                            break;
                        case 3:
                            if (iM47d == 1) {
                                i8 = 5;
                            }
                            break;
                        case 4:
                            i8 = iM47d == 0 ? 4 : 3;
                            if (iM47d == 1) {
                                i8 = 5;
                            }
                            break;
                    }
                    d(objArr, i8);
                    h(objArr, w(i8));
                }
                return fo;
            case 1:
            case 5:
                switch (fn) {
                    case 5:
                        i4 = 6;
                        i5 = 7;
                        fp = by[df - 1];
                        break;
                    default:
                        i4 = 1;
                        i5 = 3;
                        fp = bs[df - 1];
                        break;
                }
                aL = new int[8];
                aM = new int[8];
                fq = 0;
                a(p.m32a(65538), i4, i2, 0, 1);
                int i9 = A[i2][2];
                fs = i9;
                fo = i9;
                b(aL, 0, fo);
                if (fn == 1) {
                    aL[4] = 2 * dy;
                    aL[5] = dz;
                    aL[6] = 16 * dy;
                    aL[7] = aL[3];
                } else {
                    aL[4] = aL[0];
                    aL[5] = aL[1];
                    aL[6] = aL[2];
                    aL[7] = aL[3];
                }
                aM[4] = aL[0];
                aM[5] = aL[1];
                a(aM, aM[4], aM[5], fp);
                f156a = new o[3];
                for (int i10 = 0; i10 < 3; i10++) {
                    o oVar = new o(null);
                    f156a[i10] = oVar;
                    a(p.m32a(65538), i5, i2, fo, 2);
                    fr = A[i2][2];
                    int[] iArr3 = oVar.ao;
                    if (fn == 1) {
                        iArr3[0] = (1 + (i10 * 6)) * dy;
                        iArr3[1] = 10 * dz;
                        b(fo, fr, iArr3[0], iArr3[1]);
                        b(iArr3, fo, fr);
                        iArr3[4] = iArr3[0];
                        iArr3[5] = iArr3[1] - dz;
                        iArr3[6] = iArr3[2];
                        iArr3[7] = 5 * dz;
                    } else {
                        iArr3[0] = (1 + (i10 * 6)) * dy;
                        iArr3[1] = (bx[df - 1] + (i10 << 1)) * dz;
                        b(fo, fr, iArr3[0], iArr3[1]);
                        b(iArr3, fo, fr);
                        iArr3[4] = 2 * dy;
                        iArr3[5] = iArr3[1];
                        iArr3[6] = 16 * dy;
                        iArr3[7] = iArr3[3];
                    }
                    oVar.ap[4] = iArr3[0];
                    oVar.ap[5] = iArr3[1];
                    a(oVar.ap, iArr3[0], iArr3[1], fp);
                    fo += fr;
                }
                m(i2, fo);
                for (int i11 = 0; i11 < fo; i11++) {
                    Object[] objArr2 = c[i11];
                    int iM47d2 = m47d(objArr2);
                    int i12 = 3;
                    if (iM47d2 == 2 && i11 < fs) {
                        fq++;
                    }
                    switch (df) {
                        case 2:
                            if (iM47d2 == 0) {
                                i12 = 4;
                            }
                            break;
                        case 3:
                            if (iM47d2 == 0) {
                                i12 = 5;
                            }
                            break;
                        case 4:
                            if (iM47d2 == 0) {
                                i12 = 2;
                            }
                            break;
                    }
                    d(objArr2, i12);
                    h(objArr2, w(i12));
                }
                return fo;
            case 2:
                fq = 0;
                fu = 0;
                a(p.m32a(65538), 2, i2, 0, 1);
                fo = A[i2][2];
                m(i2, fo);
                for (int i13 = 0; i13 < fo; i13++) {
                    Object[] objArr3 = c[i13];
                    int iM47d3 = m47d(objArr3);
                    int i14 = 3;
                    if (iM47d3 == 2) {
                        fq++;
                    }
                    switch (df) {
                        case 2:
                        case 3:
                            if (iM47d3 == 0) {
                                i14 = 4;
                            }
                            break;
                        case 4:
                            if (iM47d3 == 0) {
                                i14 = 5;
                            }
                            break;
                    }
                    d(objArr3, i14);
                    h(objArr3, w(i14));
                }
                ft = fo >> 2;
                fv = (10 - bw[df - 1]) * dz;
                b(0, fo, 0, fv - dz);
                return fo;
            case 6:
                fq = 0;
                a(p.m32a(65538), 8, i2, 0, 1);
                fo = A[i2][1];
                m(i2, fo);
                for (int i15 = 0; i15 < fo; i15++) {
                    if (m47d(c[i15]) == 2) {
                        fq++;
                    }
                }
                aN = new int[fo];
                return fo;
            default:
                return 0;
        }
    }

    private static boolean f() {
        return fq <= 0;
    }

    private static int w(int i2) {
        if (i2 == 4) {
            return 1;
        }
        return i2 == 5 ? 3 : 0;
    }

    private static void m(int i2, int i3) {
        A[i2][0] = 1;
        A[i2][4] = 0;
        A[i2][7] = 0;
        A[i2][5] = 0;
        A[i2][6] = 0;
        A[i2][3] = 5137;
        A[i2][1] = i3;
        A[i2][2] = i3;
    }

    private static void b(int[] iArr, int i2, int i3) {
        int iMin = 20 * dy;
        int iMin2 = 17 * dz;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            Object[] objArr = c[i4];
            iMin = Math.min(iMin, ((int[]) objArr[0])[1]);
            iMin2 = Math.min(iMin2, ((int[]) objArr[0])[2]);
            iMax2 = Math.max(iMax2, ((int[]) objArr[0])[1] + h(objArr));
            iMax = Math.max(iMax, ((int[]) objArr[0])[2] + i(objArr));
        }
        iArr[3] = iMax - iMin2;
        iArr[2] = iMax2 - iMin;
        iArr[0] = iMin;
        iArr[1] = iMin2;
    }

    private static void b(int i2, int i3, int i4, int i5) {
        for (int i6 = i2; i6 < i2 + i3; i6++) {
            Object[] objArr = c[i6];
            if (m44a(objArr)) {
                int i7 = ((int[]) objArr[0])[1] + i4;
                int i8 = ((int[]) objArr[0])[2] + i5;
                ((int[]) objArr[0])[1] = i7;
                ((int[]) objArr[0])[2] = i8;
            }
        }
    }

    private static void a(int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[4];
        int i6 = iArr[5];
        int iAbs = Math.abs(i5 - i2);
        int iAbs2 = Math.abs(i6 - i3);
        int iMin = Math.min(iAbs, iAbs2);
        int iMax = Math.max(iAbs, iAbs2) + (((((iMin << 5) + (iMin << 4)) + (iMin << 2)) + iMin) >> 7);
        iArr[6] = 0;
        if (iMax != 0) {
            iArr[7] = (iMax * 1000) / i4;
            iArr[0] = iArr[4];
            iArr[1] = iArr[5];
            iArr[2] = i2;
            iArr[3] = i3;
            return;
        }
        iArr[7] = 0;
        int i7 = iArr[4];
        iArr[2] = i7;
        iArr[0] = i7;
        int i8 = iArr[5];
        iArr[3] = i8;
        iArr[1] = i8;
    }

    private static boolean a(int[] iArr, int i2) {
        iArr[6] = iArr[6] + 25;
        if (iArr[6] >= iArr[7]) {
            iArr[4] = iArr[2];
            iArr[5] = iArr[3];
            return true;
        }
        int i3 = 0;
        while (i3 < 2) {
            boolean z2 = i3 != 0;
            char c2 = i3 == 0 ? (char) 2 : (char) 3;
            char c3 = i3 == 0 ? (char) 4 : (char) 5;
            if (iArr[z2 ? 1 : 0] < iArr[c2]) {
                iArr[c3] = iArr[z2 ? 1 : 0] + (((iArr[c2] - iArr[z2 ? 1 : 0]) * iArr[6]) / iArr[7]);
                iArr[c3] = Math.min(iArr[c3], iArr[c2]);
            } else if (iArr[z2 ? 1 : 0] > iArr[c2]) {
                iArr[c3] = iArr[z2 ? 1 : 0] - (((iArr[z2 ? 1 : 0] - iArr[c2]) * iArr[6]) / iArr[7]);
                iArr[c3] = Math.max(iArr[c3], iArr[c2]);
            }
            i3++;
        }
        return false;
    }

    public static final void ar() {
        int iN = n();
        fy = iN;
        int iX = x(iN);
        fx = iX;
        fz = iX;
    }

    private static void a(Graphics graphics, float f2, int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        if (z2) {
            i5 = 0;
            i6 = 875;
        } else {
            i5 = (int) (1400.0f * f2);
            i6 = 980;
        }
        int i7 = i5;
        int i8 = i6;
        int i9 = i4;
        int i10 = i3;
        int i11 = i2;
        e.a(0.0f, -3000.0f, -500.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        if (i9 >= 15) {
            i9 = 15;
            i11 = 0;
            i10 = 1000000;
        }
        int i12 = 0;
        int i13 = aR[i9];
        float f3 = (1.0f * i10) / i13;
        int i14 = i10 == 0 ? 0 : (i13 * i11) / i10;
        int i15 = 464;
        graphics.setColor(0);
        int i16 = 14;
        int i17 = 31;
        int iD = h.d(16634626, 16735245, 255);
        int i18 = iD;
        int iD2 = h.d(iD, 16777215, 255);
        int i19 = 0;
        while (i15 > 0) {
            if (f158a[i9][i15] != 0) {
                boolean z3 = false;
                if (i12 > i14 || i11 == 0) {
                    r rVar = h.f78a[2][0];
                    rVar.setColor(12303291);
                    rVar.setAppearance(h.f83a);
                } else {
                    int iMin = Math.min(((i14 - i12) * 255) / 20, 255);
                    i12++;
                    r rVar2 = h.f78a[2][5];
                    rVar2.N(12);
                    rVar2.setColor(h.d(iD2, i18, iMin));
                    z3 = true;
                }
                float f4 = 1.0f;
                if (i14 == i12 - 1 && z3) {
                    f4 = (i11 - ((i12 - 1) * f3)) / f3;
                }
                int i20 = i19;
                int i21 = i19 + 1;
                aQ[i20] = z3 ? 1 : 0;
                int i22 = i21 + 1;
                aQ[i21] = i7 + (100 * (i16 - 7));
                int i23 = i22 + 1;
                aQ[i22] = i8 - (i17 * 54);
                i19 = i23 + 1;
                aQ[i23] = (int) (150.0f * f4);
            }
            i15--;
            i16--;
            if (i16 < 0) {
                i16 = 14;
                i17--;
                int iD3 = h.d(16634626, 16735245, (i17 * 255) / 31);
                i18 = iD3;
                iD2 = h.d(iD3, 16777215, 255);
            }
        }
        float fCos = z2 ? (float) Math.cos((3.141592653589793d * (System.currentTimeMillis() % 16000)) / 8000.0d) : 0.5f;
        int i24 = 0;
        while (i24 < 2) {
            int i25 = 0;
            for (int i26 = 0; i26 < i19; i26 += 4) {
                if (aQ[i26] == i24) {
                    f161b.a(aQ[i26 + 1], aQ[i26 + 2], aQ[i26 + 3], i25, aQ[i26] == 1, fCos);
                    i25++;
                }
            }
            if (i25 > 0) {
                f161b.fL = i25;
                f161b.g(i24 == 1);
                f161b.setIdentity();
                f161b.postRotate(0.15f * fCos, 0.0f, 0.0f, 1.0f);
                if (i24 == 1) {
                    f161b.N(12);
                    f161b.setColor(16735245);
                } else {
                    f161b.setAppearance(h.f83a);
                    f161b.setColor(12303291);
                }
                f161b.aF();
            }
            i24++;
        }
    }

    public static final void as() {
        f158a = new byte[16][];
        for (int i2 = 0; i2 < 16; i2++) {
            f158a[i2] = new byte[465];
            int[] iArr = C[i2];
            byte[] bArr = f158a[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0 + 1;
            int i6 = iArr[0];
            while (i3 < 465) {
                int i7 = i3;
                i3++;
                bArr[i7] = (byte) ((i6 >> i4) & 1);
                i4++;
                if (i4 >= 32) {
                    int i8 = i5;
                    i5++;
                    i6 = iArr[i8];
                    i4 = 0;
                }
            }
        }
    }

    public static final int x(int i2) {
        for (int i3 = 0; i3 < aO.length; i3++) {
            if (i2 >= aO[i3] && i2 < aO[i3 + 1]) {
                return i3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void at() {
        h.r();
        h.q();
        if (f161b == null) {
            r rVar = new r();
            f161b = rVar;
            rVar.az();
            aQ = new int[1080];
        }
    }

    public static void au() {
        f161b = null;
        aQ = null;
    }

    public static void a(boolean z2, int i2) {
        f fVar = new f();
        f159g = fVar;
        fVar.a(1, 1, 0);
        f157h = p.a(p.c(376), new String[]{new StringBuffer().append("").append(n()).toString()});
        f159g.a(p.c(397), null);
        f159g.a(2);
        f159g.a(p.i(), p.m(), false);
        f159g.a(DCWall3D.i, DCWall3D.i, DCWall3D.i);
        f fVar2 = new f();
        f160h = fVar2;
        fVar2.a(1, 1, 0);
        f160h.a(2);
        if (z2) {
            ar();
            fA = i2;
            f160h.a(p.c(aP[fA]), null);
            f160h.f38m[0] = -1;
            f160h.f38m[1] = 5;
        } else {
            int iN = n() - fy;
            fB = iN;
            fG = iN;
            f160h.a(p.c(aP[fx]), null);
            f160h.f38m[1] = -1;
            f160h.f38m[0] = 14;
        }
        f160h.a(p.i(), p.m(), false);
        f160h.g();
        fC = 0;
        fE = 0;
        fD = 0;
    }

    public static int c(int i2, boolean z2) {
        h.p(i2);
        if (z2) {
            f160h.m14a(i2);
        } else {
            f159g.m14a(i2);
            switch (fC) {
                case 1:
                case 2:
                case 6:
                    fE += i2;
                    break;
                case 3:
                case 4:
                case 5:
                    fF += i2;
                    break;
            }
            switch (fC) {
                case 0:
                    fC = 1;
                    fI = aO[fx + 1] - aO[fx];
                    fJ = fy - aO[fx];
                    fE = 0;
                    int iX = x(fy);
                    if (iX > fx) {
                        fx = iX;
                        fH = aO[iX];
                        fC = 3;
                    }
                    break;
                case 1:
                    fH = fy;
                    fG = fB;
                    fI = aO[fx + 1] - aO[fx];
                    fJ = fy - aO[fx];
                    if (fE >= 500) {
                        fC = 2;
                        fE = 0;
                    }
                    break;
                case 2:
                    fD = (fB * fE) / 3000;
                    fG = fB - fD;
                    fH = fy + fD;
                    int iX2 = x(fD + fy);
                    if (iX2 > fx) {
                        fx = iX2;
                        fH = aO[iX2];
                        fC = 3;
                    } else if (fE >= 3000) {
                        fE = 0;
                        fC = 6;
                        fy += fB;
                        fB = 0;
                    }
                    if (fC != 6) {
                        fI = aO[fx + 1] - aO[fx];
                        fJ = (fy + fD) - aO[fx];
                    } else {
                        fI = aO[fx + 1] - aO[fx];
                        fJ = fy - aO[fx];
                    }
                    break;
                case 3:
                    if (fF >= 500) {
                        fF = 0;
                        fC = 4;
                    }
                    break;
                case 4:
                    if (fF >= 500) {
                        fF = 0;
                        fC = 5;
                    }
                    break;
                case 5:
                    if (fF >= 1000) {
                        fC = 2;
                        fz++;
                        f160h.a(p.c(aP[fx]), null);
                        f160h.a(p.i(), p.m(), false);
                    }
                    break;
                case 6:
                    fG = 0;
                    fH = fy;
                    fI = aO[fx + 1] - aO[fx];
                    fJ = fy - aO[fx];
                    DCWall3D.R();
                    break;
            }
            f160h.m14a(i2);
        }
        return fw;
    }

    public static final void d(int i2, int i3, boolean z2) {
        if (i3 == 0) {
            int i4 = p.i(i2);
            if (z2) {
                if (i4 == 52 || i4 == 54) {
                    switch (i4) {
                        case 52:
                            fA--;
                            break;
                        case 54:
                            fA++;
                            break;
                    }
                    if (fA < 0) {
                        fA = aP.length - 2;
                    }
                    if (fA >= aP.length - 1) {
                        fA = 0;
                    }
                    a(true, fA);
                }
            } else if (i4 == 53) {
                fw = 1;
            }
        }
        if (i3 == 3) {
            if (i2 == 14 || i2 == 1) {
                fw = 1;
            } else if (i2 == 5) {
                fw = 2;
            }
        }
    }

    public static void b(Graphics graphics, boolean z2) {
        if (z2) {
            int iM = p.m();
            int iN = n();
            e.a(graphics);
            h.B();
            if (fA == aP.length - 1) {
                fA = aP.length - 2;
            }
            int i2 = 25600;
            int i3 = aO[fA + 1];
            int i4 = aO[fA];
            if (iN < i3) {
                i2 = iN > i4 ? (25600 * (iN - i4)) / (i3 - i4) : 0;
            }
            a(graphics, 0.0f, i2, 25600, fA, true);
            e.b(graphics);
            graphics.setColor(0);
            f160h.a(graphics, 0, 0);
            DCWall3D.i.a(graphics, f157h, p.i() / 2, DCWall3D.k.getHeight() + 8, 17);
            int iAbs = ((dm >> 5) * Math.abs(((int) System.currentTimeMillis()) % 600)) / 600;
            h.f77i.c(graphics, h.f77i.k[2] + iAbs, p.m() >> 1);
            h.j.c(graphics, (p.i() - h.j.k[2]) - iAbs, p.m() >> 1);
            a(graphics, (iM * 9) / 10, fA, true);
            return;
        }
        int i5 = p.i();
        int iM2 = p.m();
        int i6 = 256;
        graphics.setColor(16777215);
        e.a(graphics);
        h.B();
        switch (fC) {
            case 0:
            case 1:
                a(graphics, 0.0f, fJ, fI, fz, false);
                i6 = 768 - ((512 * fE) / 500);
                break;
            case 2:
                a(graphics, 0.0f, fJ, fI, fz, false);
                break;
            case 3:
                a(graphics, 0.0f, 100, 100, fz, false);
                break;
            case 4:
                a(graphics, 0.0f, 100, 100, fz, false);
                break;
            case 5:
                float f2 = (1.0f * fF) / 1000.0f;
                a(graphics, -f2, 100, 100, fz, false);
                a(graphics, 1.0f - f2, 0, 100, fz + 1, false);
                break;
            case 6:
                a(graphics, 0.0f, fJ, fI, fz, false);
                break;
        }
        e.b(graphics);
        f160h.a(graphics, 0, 0);
        graphics.setColor(0);
        if (fG < 0) {
            fG = 0;
        }
        if (fH < 0) {
            fH = 0;
        }
        int i7 = ((iM2 * 83) / 100) + 2;
        if (fG != 0) {
            graphics.setColor(16777215);
            h.a(graphics, h.g, i5 >> 1, iM2 / 7, fG, i6, false, true);
        }
        h.a(graphics, h.f76h, i5 >> 1, i7, fH, 256, false, true);
        f159g.a(graphics, 0, i7 + h.f76h.k[3]);
        if (fC == 4) {
            int i8 = (4000 * fF) / 500;
            h.a(graphics, h.f76h, i5 >> 1, i7 - (((iM2 >> 1) * i8) / 4000), fH, i8 + 256, false, true);
        }
    }

    private static void a(Graphics graphics, int i2, int i3, boolean z2) {
        boolean z3;
        int i4 = p.i();
        int length = z2 ? aP.length - 1 : B.length;
        int i5 = z2 ? 2 : 1;
        int i6 = z2 ? 3 : 2;
        int i7 = (i4 >> 1) - ((length * (i6 + i5)) >> 1);
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8;
            if (z2) {
                z3 = i8 <= x(n()) - 1;
            } else {
                z3 = aI[i8] != 0;
            }
            boolean z4 = z3;
            if (i9 == i3) {
                if (i5 > 1) {
                    graphics.setColor(5345940);
                    graphics.fillRect(i7 - 2, i2 - 2, i6 + 4, i6 + 4);
                }
                graphics.setColor(7654562);
                graphics.fillRect(i7 - 1, i2 - 1, i6 + 2, i6 + 2);
                graphics.setColor(16773574);
            } else if (z4) {
                graphics.setColor(16764006);
            } else {
                graphics.setColor(6776679);
            }
            graphics.fillRect(i7, i2, i6, i6);
            i7 += i5 + i6;
            i8++;
        }
    }

    public static final boolean g() {
        System.out.println(new StringBuffer().append("points ").append(t() * 20).toString());
        boolean z2 = false;
        i.a(1, 5, 1);
        i.a(p.c(465), null);
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            if (!f162h[i3] && i(i3)) {
                int i4 = i2;
                i2++;
                i.a(i4, 1, p.c(bG[i3]), (Image[]) null, -1);
                z2 = true;
                f162h[i3] = true;
            }
        }
        i.f38m[0] = 1;
        i.a(p.i(), p.m(), false);
        if (z2) {
            DCWall3D.Q();
        }
        System.out.println(new StringBuffer().append("menuCreated ").append(z2).toString());
        return z2;
    }

    public static final void av() {
        i.g();
    }

    public static final void e(Graphics graphics) {
        i.a(graphics);
    }

    public static final int y(int i2) {
        i.m14a(i2);
        return fK;
    }

    public static final boolean i(int i2) {
        switch (i2) {
            case 0:
            case 1:
                return t() * 20 >= (i2 == 0 ? 50 : 180);
            case 2:
                return h(15);
            case 3:
                return h(16);
            case 4:
                return h(17);
            default:
                return false;
        }
    }

    public static final void n(int i2, int i3) {
        i.m15b(i2, i3);
        if (i3 == 0 && p.i(i2) == 53) {
            fK = 1;
        }
        if (i3 == 3 && i2 == 1) {
            fK = 1;
        }
    }

    public static void d(Object[] objArr) {
        objArr[0] = new int[4];
        objArr[1] = new boolean[2];
    }

    public static void c(Object[] objArr, int i2) {
        objArr[0] = new int[4];
        objArr[1] = new boolean[2];
        ((int[]) objArr[0])[0] = i2 & (-1024);
        i(objArr, (i2 & 992) >> 5);
        j(objArr, i2 & 31);
    }

    public static void a(Object[] objArr, Object[] objArr2) {
        objArr[0] = new int[4];
        objArr[1] = new boolean[2];
        ((int[]) objArr[0])[0] = ((int[]) objArr2[0])[0];
        ((int[]) objArr[0])[1] = ((int[]) objArr2[0])[1];
        ((int[]) objArr[0])[2] = ((int[]) objArr2[0])[2];
        ((boolean[]) objArr[1])[0] = ((boolean[]) objArr2[1])[0];
        ((int[]) objArr[0])[3] = ((int[]) objArr2[0])[3];
        ((boolean[]) objArr[1])[1] = ((boolean[]) objArr2[1])[1];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final boolean m44a(Object[] objArr) {
        return ((((int[]) objArr[0])[0] >> 31) & 1) == 0;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static final int m45b(Object[] objArr) {
        return (((int[]) objArr[0])[0] >> 29) & 3;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static final int m46c(Object[] objArr) {
        return (((int[]) objArr[0])[0] >> 23) & 63;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static final int m47d(Object[] objArr) {
        return (((int[]) objArr[0])[0] >> 20) & 7;
    }

    private static int e(Object[] objArr) {
        return (((int[]) objArr[0])[0] >> 12) & 7;
    }

    public static final int f(Object[] objArr) {
        return (((int[]) objArr[0])[0] >> 10) & 3;
    }

    public static final int g(Object[] objArr) {
        return ((int[]) objArr[0])[1] / dy;
    }

    private static int h(Object[] objArr) {
        switch (m45b(objArr)) {
            case 1:
                return dy;
            case 2:
            case 3:
                return 2 * dy;
            default:
                return 0;
        }
    }

    private static int i(Object[] objArr) {
        switch (m45b(objArr)) {
            case 1:
            case 2:
                return dz;
            case 3:
                return 2 * dz;
            default:
                return 0;
        }
    }

    public static final int j(Object[] objArr) {
        return ((int[]) objArr[0])[2] / dz;
    }

    public static final void d(Object[] objArr, int i2) {
        ((int[]) objArr[0])[0] = (((int[]) objArr[0])[0] & (-528482305)) | ((i2 & 63) << 23);
    }

    public static final void e(Object[] objArr, int i2) {
        ((int[]) objArr[0])[0] = (((int[]) objArr[0])[0] & (-7340033)) | ((i2 & 7) << 20);
    }

    private static void f(Object[] objArr, int i2) {
        ((int[]) objArr[0])[0] = (((int[]) objArr[0])[0] & (-1015809)) | ((i2 & 31) << 15);
    }

    private static void g(Object[] objArr, int i2) {
        ((int[]) objArr[0])[0] = (((int[]) objArr[0])[0] & (-28673)) | ((i2 & 7) << 12);
    }

    public static final void h(Object[] objArr, int i2) {
        ((int[]) objArr[0])[0] = (((int[]) objArr[0])[0] & (-3073)) | ((i2 & 3) << 10);
    }

    public static final void i(Object[] objArr, int i2) {
        ((int[]) objArr[0])[1] = i2 * dy;
    }

    public static final void j(Object[] objArr, int i2) {
        ((int[]) objArr[0])[2] = i2 * dz;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    private static void m48e(Object[] objArr) {
        ((int[]) objArr[0])[0] = ((int[]) objArr[0])[0] | Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    private static void m49f(Object[] objArr) {
        ((int[]) objArr[0])[0] = ((int[]) objArr[0])[0] & Integer.MAX_VALUE;
    }

    public static final void a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        switch (i3) {
            case 3:
                i8 = 0;
                break;
            case 4:
                i8 = 1;
                break;
            case 5:
                i8 = 3;
                break;
            default:
                i8 = 0;
                break;
        }
        ((int[]) objArr[0])[0] = 0 | ((i2 & 3) << 29) | ((i3 & 63) << 23) | ((i4 & 7) << 20) | ((i8 & 3) << 10);
        i(objArr, i6);
        j(objArr, i7);
        ((boolean[]) objArr[1])[0] = false;
        ((int[]) objArr[0])[3] = 0;
        ((boolean[]) objArr[1])[1] = false;
    }

    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public static void m50g(Object[] objArr) {
        objArr[1] = new float[2];
        objArr[4] = new int[10];
        ((float[]) objArr[1])[0] = 0.0f;
    }

    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public static final void m51h(Object[] objArr) {
        if (((Image) objArr[2]) == null) {
            objArr[2] = c.a(327805, 0, 65536);
        }
        if (((k) objArr[0]) == null) {
            objArr[0] = new k();
            ((k) objArr[0]).E();
            ((k) objArr[0]).aE();
        }
    }

    /* JADX INFO: renamed from: i, reason: collision with other method in class */
    public static final void m52i(Object[] objArr) {
        objArr[2] = null;
        objArr[3] = null;
    }

    public static final void c(Object[] objArr, int i2, int i3) {
        ((int[]) objArr[4])[1] = i3;
        ((int[]) objArr[4])[2] = i2;
        if (i3 == 2 && (i2 == 3 || i2 == 1)) {
            p.k(15, 0);
        } else {
            p.k(14, 0);
        }
        if (i2 == 1) {
            p.k(13, 0);
        } else if (i3 == 2 && i2 == 3) {
            p.k(37, 0);
        }
        String strA = "";
        switch (((int[]) objArr[4])[1]) {
            case 1:
                if (((int[]) objArr[4])[2] == 0) {
                    strA = p.c(141);
                } else if (((int[]) objArr[4])[2] == 1) {
                    el = r() % 6;
                    String string = new StringBuffer().append(p.c(bI[r() % bI.length])).append("\\n").append(p.c(142)).toString();
                    int i4 = dP - dQ;
                    dQ = dP;
                    String[] strArr = new String[6];
                    strArr[0] = m43g(eq);
                    strArr[1] = m43g(ep);
                    strArr[2] = new StringBuffer().append(i4 >= 0 ? "+" : "-").append(Math.abs(i4)).toString();
                    strArr[3] = h.m25a(el);
                    strArr[4] = Integer.toString((cW / 5) + 1);
                    strArr[5] = Integer.toString(cW + 1);
                    strA = p.a(string, strArr);
                } else if (((int[]) objArr[4])[2] == 3) {
                    el = r() % 6;
                    String strC = p.c(144);
                    dQ = dP;
                    strA = p.a(strC, new String[]{m43g(eq), m43g(ep), h.m25a(el), Integer.toString((cW / 5) + 1), Integer.toString(cW + 1)});
                } else if (((int[]) objArr[4])[2] == 2) {
                    strA = p.a(new StringBuffer().append(p.c(bH[r() % bH.length])).append("\\n").append(p.c(143)).toString(), new String[]{m43g(eq), m43g(ep)});
                }
                break;
            case 2:
                if (((int[]) objArr[4])[2] == 0) {
                    strA = p.a(p.c(145), new String[]{Integer.toString(5)});
                } else if (((int[]) objArr[4])[2] == 2) {
                    strA = p.a(new StringBuffer().append(p.c(bH[r() % bH.length])).append("\\n").append(p.c(146)).toString(), new String[]{Integer.toString(DCWall3D.cG), Integer.toString(dh + 1), m43g(ep)});
                } else if (((int[]) objArr[4])[2] == 1) {
                    strA = p.a(p.c(150), new String[]{Integer.toString(DCWall3D.cG)});
                } else if (((int[]) objArr[4])[2] == 4) {
                    strA = p.c(147);
                } else if (((int[]) objArr[4])[2] == 5) {
                    strA = p.a(p.c(148), new String[]{m43g(ep)});
                } else if (((int[]) objArr[4])[2] == 3) {
                    strA = p.a(p.c(149), new String[]{Integer.toString(dh + 1), m43g(ep), Integer.toString(DCWall3D.cG)});
                }
                break;
            case 3:
                if (((int[]) objArr[4])[2] == 0) {
                    strA = p.a(p.c(151), new String[]{Integer.toString(new int[]{100, 100, 140, 150}[df - 1]), p.c(new int[]{389, 390, 391, 392}[df - 1])});
                } else if (((int[]) objArr[4])[2] == 2) {
                    strA = p.a(new StringBuffer().append(p.c(bH[r() % bH.length])).append("\\n").append(p.c(152)).toString(), new String[]{Integer.toString(cW + fd + 1), Integer.toString(eF >> 2), Integer.toString(cZ / 1000)});
                }
                break;
            case 4:
                if (((int[]) objArr[4])[2] == 0) {
                    strA = p.c(153);
                } else if (((int[]) objArr[4])[2] == 2) {
                    strA = p.a(new StringBuffer().append(p.c(bH[r() % bH.length])).append("\\n").append(p.c(154)).toString(), new String[]{Integer.toString(cW + fd + 1), m43g(eq), m43g(ep)});
                }
                break;
        }
        ((int[]) objArr[4])[6] = 0;
        ((int[]) objArr[4])[7] = 0;
        objArr[3] = f.a(strA, DCWall3D.l, dm - 16);
        ((k) objArr[0]).a(((String[]) objArr[3])[0]);
        int iR = 3;
        switch (((int[]) objArr[4])[2]) {
            case 1:
                iR = r() % 4;
                break;
            case 2:
                iR = 0;
                break;
            case 4:
                iR = 2;
                break;
            case 5:
                iR = 1;
                break;
        }
        ((k) objArr[0]).x(iR);
        ((int[]) objArr[4])[3] = 0;
        ((int[]) objArr[4])[4] = 0;
        ((int[]) objArr[4])[5] = 0;
        ((int[]) objArr[4])[9] = 0;
        ((int[]) objArr[4])[8] = 0;
        ((int[]) objArr[4])[0] = -1;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static final int m53c(Object[] objArr, int i2) {
        ((int[]) objArr[4])[9] = ((int[]) objArr[4])[9] + i2;
        switch (((int[]) objArr[4])[8]) {
            case 0:
                if (((int[]) objArr[4])[9] >= 500) {
                    ((int[]) objArr[4])[9] = 0;
                    ((int[]) objArr[4])[8] = 1;
                }
                break;
            case 1:
                ((int[]) objArr[4])[3] = ((int[]) objArr[4])[3] + i2;
                ((int[]) objArr[4])[5] = ((int[]) objArr[4])[5] + i2;
                ((float[]) objArr[1])[1] = i2;
                h.p(i2);
                if (((int[]) objArr[4])[7] >= ((String[]) objArr[3]).length) {
                    if (((int[]) objArr[4])[2] == 5) {
                        ((k) objArr[0]).F();
                    }
                    DCWall3D.R();
                } else if (((int[]) objArr[4])[6] >= ((String[]) objArr[3])[((int[]) objArr[4])[7]].length()) {
                    ((int[]) objArr[4])[4] = ((int[]) objArr[4])[4] + i2;
                    if (((int[]) objArr[4])[4] >= 700) {
                        ((int[]) objArr[4])[4] = 0;
                        ((int[]) objArr[4])[3] = 0;
                        ((int[]) objArr[4])[6] = 0;
                        ((int[]) objArr[4])[7] = ((int[]) objArr[4])[7] + 1;
                        if (((int[]) objArr[4])[7] < ((String[]) objArr[3]).length) {
                            ((k) objArr[0]).a(((String[]) objArr[3])[((int[]) objArr[4])[7]]);
                        }
                    }
                } else {
                    while (((int[]) objArr[4])[3] > 0) {
                        ((int[]) objArr[4])[3] = ((int[]) objArr[4])[3] - 40;
                        ((int[]) objArr[4])[6] = ((int[]) objArr[4])[6] + 1;
                    }
                }
                ((k) objArr[0]).d(i2);
                break;
        }
        int i3 = -1;
        if (((int[]) objArr[4])[0] == 3) {
            i3 = 7;
        } else if (((int[]) objArr[4])[0] == 1) {
            switch (((int[]) objArr[4])[2]) {
                case 2:
                case 5:
                    i3 = 5;
                    break;
            }
        }
        if (i3 == -1) {
            if (((int[]) objArr[4])[1] == 1) {
                if (((int[]) objArr[4])[2] == 3) {
                    if (((int[]) objArr[4])[0] == 1) {
                        i3 = 11;
                    }
                } else if (((int[]) objArr[4])[2] == 0 && ((int[]) objArr[4])[0] == 1) {
                    i3 = 10;
                }
            } else if (((int[]) objArr[4])[1] == 3) {
                if (((int[]) objArr[4])[0] == 1) {
                    i3 = 12;
                }
            } else if (((int[]) objArr[4])[1] == 4) {
                if (((int[]) objArr[4])[0] == 1) {
                    i3 = 13;
                }
            } else if (((int[]) objArr[4])[1] == 2) {
                if (((int[]) objArr[4])[2] == 3 || ((int[]) objArr[4])[2] == 1) {
                    if (((int[]) objArr[4])[0] == 1) {
                        i3 = 9;
                    } else if (((int[]) objArr[4])[0] == 2) {
                        i3 = 8;
                    }
                } else if (((int[]) objArr[4])[2] == 0 && ((int[]) objArr[4])[0] == 1) {
                    i3 = 8;
                }
            }
        }
        if (i3 == -1 && ((int[]) objArr[4])[0] == 1) {
            switch (((int[]) objArr[4])[2]) {
                case 0:
                case 1:
                case 3:
                case 4:
                    i3 = 6;
                    break;
            }
        }
        ((int[]) objArr[4])[0] = -1;
        return i3;
    }

    public static final void b(Object[] objArr, Graphics graphics) {
        switch (((int[]) objArr[4])[8]) {
            case 0:
                graphics.setColor(0);
                graphics.fillRect(0, 0, dm, dn);
                graphics.setColor(16777215);
                if (((int[]) objArr[4])[9] < 200) {
                    graphics.drawLine(dm >> 1, dn >> 1, dm >> 1, dn >> 1);
                } else if (((int[]) objArr[4])[9] >= 200 && ((int[]) objArr[4])[9] < 300) {
                    graphics.drawLine(dm >> 2, dn >> 1, (dm * 3) >> 2, dn >> 1);
                } else if (((int[]) objArr[4])[9] < 300 || ((int[]) objArr[4])[9] >= 400) {
                    graphics.fillRect(0, 0, dm, dn);
                } else {
                    graphics.fillRect(0, (dn * 3) >> 3, dm, dn >> 2);
                }
                break;
            case 1:
                graphics.setColor(0);
                e.a(graphics);
                h.o(800 + (((int[]) objArr[4])[5] % 3500));
                e.a(0.0f, -4000.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
                boolean zB = ((k) objArr[0]).b();
                int iF = ((k) objArr[0]).f();
                if (!zB || iF < 6000) {
                    h.f80b.setIdentity();
                    h.f80b.postRotate(((int[]) objArr[4])[5] / 40000.0f, 0.0f, 1.0f, 0.0f);
                    h.f80b.postRotate(0.5f, 1.0f, 0.0f, 0.0f);
                    h.f80b.postScale(0.6f, 0.6f, 0.6f);
                    h.f80b.aF();
                }
                float fSin = 0.03f * ((float) Math.sin((1.0f * ((int[]) objArr[4])[5]) / 1000.0f));
                float f2 = 15000.0f;
                boolean z2 = true;
                if (zB) {
                    f2 = 1000.0f;
                    fSin *= Math.max((1000.0f - iF) / 1000.0f, 0.0f);
                    z2 = iF <= 5000;
                    if (iF > 1000) {
                        f2 = 1000.0f + ((20000.0f * (iF - 1000)) / 2000.0f);
                    }
                }
                if (z2) {
                    ((float[]) objArr[1])[0] = ((float[]) objArr[1])[0] + (((float[]) objArr[1])[1] / f2);
                }
                h.f79a.setIdentity();
                h.f79a.postRotate(((float[]) objArr[1])[0], 0.0f, 0.0f, 1.0f);
                h.f79a.postRotate(fSin, 1.0f, 0.0f, 0.0f);
                h.f79a.aF();
                ((k) objArr[0]).setIdentity();
                ((k) objArr[0]).postRotate(((float[]) objArr[1])[0], 0.0f, 0.0f, 1.0f);
                ((k) objArr[0]).postRotate(fSin, 1.0f, 0.0f, 0.0f);
                ((k) objArr[0]).postTranslate(0.0f, -500.0f, 0.0f);
                ((k) objArr[0]).aF();
                ((k) objArr[0]).setIdentity();
                ((k) objArr[0]).postRotate(((float[]) objArr[1])[0], 0.0f, 0.0f, 1.0f);
                ((k) objArr[0]).postRotate(fSin, 1.0f, 0.0f, 0.0f);
                ((k) objArr[0]).postTranslate(0.0f, 500.0f, 0.0f);
                ((k) objArr[0]).postRotate(0.5f, 0.0f, 0.0f, 1.0f);
                ((k) objArr[0]).aF();
                e.b(graphics);
                a(objArr, graphics, false);
                graphics.setClip(0, 0, dm, dn);
                for (int i2 = 1; i2 < dn; i2 += 32) {
                    for (int i3 = 0; i3 < dm; i3 += 32) {
                        graphics.drawImage((Image) objArr[2], i3, i2, 20);
                    }
                }
                a(objArr, graphics, true);
                break;
        }
    }

    public static final void d(Object[] objArr, int i2, int i3) {
        if (i3 == 0 && p.i(i2) == 53) {
            ((int[]) objArr[4])[0] = 1;
        }
        if (i3 == 3) {
            if (i2 == 1 || i2 == 14 || i2 == 15) {
                ((int[]) objArr[4])[0] = 1;
            } else if (i2 == 13) {
                ((int[]) objArr[4])[0] = 3;
            } else if (i2 == 37) {
                ((int[]) objArr[4])[0] = 2;
            }
        }
    }

    public static void aw() {
        if (!Z) {
            b.a(0, new int[]{n()}, null);
            if (de == 1) {
                b.a(2, new int[]{ep}, null);
            } else if (de == 2) {
                b.a(1, new int[]{ep}, null);
            } else if (de == 3) {
                b.a(3, new int[]{cZ / 1000}, null);
            } else if (de == 4) {
                b.a(4, new int[]{cW + fd + 1}, null);
            }
        }
        if (de == 1) {
            if (!aa) {
                ds = 0;
                dt = 0;
            } else {
                ds = ep;
                dr = eo;
                dt = eq;
            }
        }
    }

    private static void a(Object[] objArr, Graphics graphics, boolean z2) {
        int height = (DCWall3D.l.getHeight() >> 1) << 1;
        int i2 = (dn >> 1) + height;
        int iMin = Math.min(((int[]) objArr[4])[7], ((String[]) objArr[3]).length - 1);
        while (iMin >= 0) {
            int i3 = i2 - height;
            i2 = i3;
            if (i3 < 0) {
                return;
            }
            if ((!z2 || iMin == ((int[]) objArr[4])[7]) && (z2 || iMin != ((int[]) objArr[4])[7])) {
                String strSubstring = ((String[]) objArr[3])[iMin].substring(0, Math.min(((int[]) objArr[4])[7] == iMin ? ((int[]) objArr[4])[6] : ((String[]) objArr[3])[iMin].length(), ((String[]) objArr[3])[iMin].length()));
                DCWall3D.l.a(graphics, strSubstring, 8, i2, 20);
                if (((int[]) objArr[4])[7] == iMin && ((int[]) objArr[4])[5] % 200 < 100) {
                    DCWall3D.l.a(graphics, "_", 8 + DCWall3D.l.stringWidth(strSubstring), i2, 20);
                }
            }
            iMin--;
        }
    }
}
