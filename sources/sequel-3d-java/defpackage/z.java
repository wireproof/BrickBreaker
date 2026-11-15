package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: sequel-3d-java.jar:z.class */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int f350a;
    private static int ar;
    public static int b;
    public static int c;
    private static int as;
    private static int at;
    private static int au;
    public static int e;
    private static int av;
    private static int aw;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static Object[] f351a;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static int f352h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    private static int ax;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static float f353a;
    private static int ay;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static n f358a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static n f359b;
    private static int az;
    public static int o;
    public static int p;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static boolean f360i;
    public static int s;
    private static int aA;
    private static int aB;
    public static int v;
    public static int x;
    public static int y;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static int[] f361f;
    private static int aC;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static boolean f363j;
    public static int B;
    public static int C;
    public static int D;
    public static int E;
    public static int F;
    public static int G;
    public static int H;
    public static int I;
    public static int J;
    public static int K;
    public static int L;
    public static int M;
    public static int N;
    public static int O;
    public static int P;
    public static int Q;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static final int[] f369g;
    private static final int aH;
    private static int aI;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private static boolean f370n;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private static boolean f371o;
    private static int aJ;
    public static int R;
    private static int aK;
    private static int aL;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static boolean f372f;
    private static int aM;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    private static boolean f373p;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    private static boolean f374q;

    /* JADX INFO: renamed from: r, reason: collision with other field name */
    private static boolean f375r;

    /* JADX INFO: renamed from: s, reason: collision with other field name */
    private static boolean f376s;
    public static int S;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static int[] f377h;
    private static int aN;
    public static final int T;
    private static int aO;
    private static int aP;
    private static int aQ;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static final int[] f378i;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private static final int[][] f379k;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int[][] f380a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static int[][] f381b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static int[][] f382c;

    /* JADX INFO: renamed from: t, reason: collision with other field name */
    private static boolean f383t;
    public static int U;
    private static int aR;
    public static int V;
    public static int W;
    private static int aS;
    private static int aT;
    private static int aU;
    private static int aV;
    private static int aW;
    private static int aX;
    private static int aY;
    private static int aZ;
    private static int ba;
    public static int X;
    public static int Y;
    public static int Z;
    private static int bb;
    public static int aa;
    private static int bc;
    private static int bd;
    private static int be;
    public static int ab;
    private static int bf;
    private static int bg;
    private static int bh;
    private static int bi;
    private static int bj;
    private static int bk;
    private static int bl;
    private static int bm;
    private static int bn;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static int[] f384j;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final int[] f385a;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static boolean[] f386e;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private static int[][] f387l;
    private static int bo;
    private static int bp;
    private static final int bq;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private static int[][] f388m;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private static int[] f389k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private static int[] f390l;

    /* JADX INFO: renamed from: u, reason: collision with other field name */
    private static boolean f391u;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static boolean[] f392c;

    /* JADX INFO: renamed from: v, reason: collision with other field name */
    private static boolean f393v;
    public static int ac;
    private static int br;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static int[][] f394d;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private static int[] f395m;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private static int[] f396n;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static int[][] f397e;
    private static int bs;
    private static int bt;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static int[][] f398f;
    private static int bu;
    private static int bv;
    public static int ad;

    /* JADX INFO: renamed from: w, reason: collision with other field name */
    private static boolean f399w;
    private static int bw;
    private static int bx;
    public static int ae;
    private static int by;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private static int[][] f400n;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static boolean[] f401d;
    private static int bz;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public static int[][] f402g;
    public static int af;
    public static int ag;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public static boolean f403g;
    public static int ah;

    /* JADX INFO: renamed from: x, reason: collision with other field name */
    private static boolean f404x;
    private static int bA;
    private static int bB;
    private static int bC;
    private static int bD;

    /* JADX INFO: renamed from: y, reason: collision with other field name */
    private static boolean f405y;
    private static int bE;
    private static int bF;
    private static int bG;
    public static int ai;
    public static int aj;

    /* JADX INFO: renamed from: z, reason: collision with other field name */
    private static boolean f406z;
    public static int ak;

    /* JADX INFO: renamed from: A, reason: collision with other field name */
    private static boolean f407A;
    private static int bH;

    /* JADX INFO: renamed from: B, reason: collision with other field name */
    private static boolean f408B;

    /* JADX INFO: renamed from: C, reason: collision with other field name */
    private static boolean f409C;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static int[][] f410h;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static Object[][] f411a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static int[] f412b;
    private static int bI;
    private static int bJ;
    public static int al;
    public static int am;
    public static int an;
    public static int ao;
    private static int bK;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private static int[] f413o;
    private static int bL;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    private static int[] f414p;
    private static int bM;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static char f415a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static char[] f416a;
    public static int ap;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static int[] f417c;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public static final int[][] f418i;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static n[] f419a;

    /* JADX INFO: renamed from: D, reason: collision with other field name */
    private static boolean f421D;

    /* JADX INFO: renamed from: E, reason: collision with other field name */
    private static boolean f422E;
    private static int bN;
    private static int bP;
    private static int bQ;
    private static int bR;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    private static int[] f423q;

    /* JADX INFO: renamed from: r, reason: collision with other field name */
    private static int[] f424r;
    private static int bS;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static o[] f425a;
    private static int bT;
    private static int bU;
    private static int bV;
    private static int bW;
    private static int bX;

    /* JADX INFO: renamed from: s, reason: collision with other field name */
    private static int[] f426s;

    /* JADX INFO: renamed from: al, reason: collision with other field name */
    private static int[] f474al = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65};

    /* JADX INFO: renamed from: am, reason: collision with other field name */
    private static int[] f475am = {66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140};

    /* JADX INFO: renamed from: t, reason: collision with other field name */
    private static int[] f427t = {80, 90, 100, 100, 50};

    /* JADX INFO: renamed from: u, reason: collision with other field name */
    private static int[] f428u = {100, 100, 100, 100, 250};

    /* JADX INFO: renamed from: v, reason: collision with other field name */
    private static int[] f429v = {200, 200, 200, 200, 80};

    /* JADX INFO: renamed from: w, reason: collision with other field name */
    private static int[] f430w = {70, 80, 90, 120, 50};

    /* JADX INFO: renamed from: x, reason: collision with other field name */
    private static int[] f431x = {200, 200, 200, 200, 60};

    /* JADX INFO: renamed from: y, reason: collision with other field name */
    private static int[] f432y = {250, 250, 250, 250, 80};

    /* JADX INFO: renamed from: z, reason: collision with other field name */
    private static int[] f433z = {140, 120, 100, 80, 50};

    /* JADX INFO: renamed from: A, reason: collision with other field name */
    private static int[] f434A = {150, 150, 150, 150, 100};

    /* JADX INFO: renamed from: B, reason: collision with other field name */
    private static int[] f435B = {150, 150, 150, 150, 100};

    /* JADX INFO: renamed from: C, reason: collision with other field name */
    private static int[] f436C = {200, 200, 200, 200, 80};

    /* JADX INFO: renamed from: D, reason: collision with other field name */
    private static int[] f437D = {200, 200, 200, 200, 80};

    /* JADX INFO: renamed from: E, reason: collision with other field name */
    private static int[] f438E = {200, 200, 200, 200, 80};

    /* JADX INFO: renamed from: F, reason: collision with other field name */
    private static int[] f439F = {200, 200, 200, 200, 80};

    /* JADX INFO: renamed from: G, reason: collision with other field name */
    private static int[] f440G = {70, 90, 100, 120, 80};

    /* JADX INFO: renamed from: H, reason: collision with other field name */
    private static int[] f441H = {100, 100, 100, 100, 80};

    /* JADX INFO: renamed from: I, reason: collision with other field name */
    private static int[] f442I = {50, 50, 50, 50, 80};

    /* JADX INFO: renamed from: J, reason: collision with other field name */
    private static int[] f443J = {200, 200, 200, 200, 100};

    /* JADX INFO: renamed from: K, reason: collision with other field name */
    private static int[] f444K = {100, 100, 100, 100, 150};

    /* JADX INFO: renamed from: L, reason: collision with other field name */
    private static int[] f445L = {250, 250, 250, 250, 100};

    /* JADX INFO: renamed from: M, reason: collision with other field name */
    private static int[] f446M = {150, 180, 200, 200, 250};

    /* JADX INFO: renamed from: N, reason: collision with other field name */
    private static int[] f447N = {150, 200, 200, 200, 250};

    /* JADX INFO: renamed from: O, reason: collision with other field name */
    private static int[] f448O = {140, 120, 100, 80, 0};

    /* JADX INFO: renamed from: P, reason: collision with other field name */
    private static int[] f449P = {100, 100, 100, 100, 250};

    /* JADX INFO: renamed from: Q, reason: collision with other field name */
    private static int[] f450Q = {200, 200, 200, 200, 100};

    /* JADX INFO: renamed from: R, reason: collision with other field name */
    private static int[] f451R = {150, 200, 250, 250, 100};

    /* JADX INFO: renamed from: S, reason: collision with other field name */
    private static int[] f452S = {150, 180, 200, 200, 250};

    /* JADX INFO: renamed from: T, reason: collision with other field name */
    private static int[] f453T = {150, 180, 200, 200, 250};

    /* JADX INFO: renamed from: U, reason: collision with other field name */
    private static int[] f454U = {150, 180, 200, 200, 250};

    /* JADX INFO: renamed from: V, reason: collision with other field name */
    private static int[] f455V = {150, 180, 200, 200, 250};

    /* JADX INFO: renamed from: W, reason: collision with other field name */
    private static int[] f456W = {250, 250, 250, 250, 100};

    /* JADX INFO: renamed from: X, reason: collision with other field name */
    private static int[] f457X = {7, 6, 5, 4};

    /* JADX INFO: renamed from: Y, reason: collision with other field name */
    private static int[] f458Y = {400, 600, 800, 1200};

    /* JADX INFO: renamed from: Z, reason: collision with other field name */
    private static int[] f459Z = {400, 500, 800, 1200};

    /* JADX INFO: renamed from: aa, reason: collision with other field name */
    private static int[] f460aa = {6, 6, 5, 4};

    /* JADX INFO: renamed from: ab, reason: collision with other field name */
    private static int[] f461ab = {500, 600, 800, 1200};

    /* JADX INFO: renamed from: ac, reason: collision with other field name */
    private static int[] f462ac = {500, 600, 800, 1200};

    /* JADX INFO: renamed from: ad, reason: collision with other field name */
    private static int[] f463ad = {7, 6, 5, 4};

    /* JADX INFO: renamed from: ae, reason: collision with other field name */
    private static int[] f464ae = {5, 6, 6, 7};

    /* JADX INFO: renamed from: af, reason: collision with other field name */
    private static int[] f465af = {600, 800, 1000, 1200};

    /* JADX INFO: renamed from: ag, reason: collision with other field name */
    private static int[] f466ag = {100, 160, 250, 350};

    /* JADX INFO: renamed from: ah, reason: collision with other field name */
    private static int[] f467ah = {35000, 35000, 35000, 35000};

    /* JADX INFO: renamed from: ai, reason: collision with other field name */
    private static int[] f468ai = {6000, 7000, 8000, 9000};

    /* JADX INFO: renamed from: aj, reason: collision with other field name */
    private static int[] f469aj = {1, 1, 1, 1};

    /* JADX INFO: renamed from: ak, reason: collision with other field name */
    private static int[] f470ak = {6000, 6000, 6000, 6000};

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static final int[] f471d = {30, 30, 32, 32};

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public static final int[][] f472j = {new int[]{j.m54a(0, 0, 255), 0, j.m54a(0, 241, 241), 100}, new int[]{j.m54a(1, 197, 14), 0, j.m54a(182, 242, 16), 100}, new int[]{j.m54a(255, 0, 0), 0, j.m54a(236, 235, 0), 100}, new int[]{j.m54a(237, 20, 20), 0, j.m54a(237, 18, 194), 100}};

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static final int[] f473e = {1550798, 0, 9390034, 100};
    public static int aq = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Vector f420a = new Vector(5);
    private static int bO = 0;
    public static boolean a = false;
    public static int d = 0;
    private static boolean h = false;
    public static int f = 0;
    public static int g = 0;
    public static int m = -1;
    public static int n = -1;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static boolean f354b = false;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static boolean f355c = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static boolean[] f356a = new boolean[9];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static boolean[] f357b = new boolean[30];
    public static int q = 0;
    public static int r = 0;
    public static int t = -1;
    public static int u = 5;
    public static int w = 5;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static Random f362a = new Random();
    private static int aD = 12;
    private static int aE = 18;
    private static int aF = aD * 30;
    public static final int z = aD * 30;
    public static final int A = aE * 30;
    private static int aG = 0;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static boolean f364d = false;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static boolean f365e = false;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private static boolean f366k = false;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private static boolean f367l = false;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private static boolean f368m = false;

    public static final void a() {
        B = 0;
        C = 0;
        D = 0;
        E = 0;
        F = 0;
        G = 0;
        H = 0;
        J = 0;
        L = 0;
        K = 0;
        I = 0;
        M = 0;
        N = 0;
        O = 0;
    }

    public static final void a(int i2, int i3) {
        aA = i2;
        aB = i3;
        f364d = false;
        f365e = false;
        h = false;
        aG = 0;
        U = 1;
        bd = 1;
        be = -1;
        d();
    }

    public static void b() {
        U = 1;
        X = 5;
        Y = 0;
        Z = 0;
        f = 0;
        bb = 0;
        ab = 0;
        f350a = 0;
    }

    public static void c() {
        aA = t.m98e();
        aB = t.a();
        n nVar = new n();
        f358a = nVar;
        nVar.a(1, 2, 3);
        f358a.a(2);
        y.m118a();
    }

    private static void c(int i2) {
        bb = Y;
        bc = 0;
        int i3 = Y + i2;
        Y = i3;
        Y = Math.min(i3, 999999999);
        j.f136c = 6000;
        j.f137d++;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int a(int i2) {
        int i3;
        int i4;
        if (!f354b) {
            if (f350a > 0) {
                t.m85b();
                t.a(14, 1);
            } else {
                t.m85b();
                t.a(9, 0);
            }
        }
        if (f354b && j.f138e == 1 && j.f125b > 1000) {
            if (f372f) {
                f359b.m73a(25);
            } else {
                f358a.m73a(25);
            }
            f350a = 0;
        } else {
            p();
            f350a = Math.max(0, f350a - 25);
            bc += 25;
            ba += 25;
            aI += 25;
            if (f350a <= 0) {
                if (m == 3) {
                    i += 25;
                }
                if (f410h[al][2] == 0) {
                    ba = 0;
                }
                if (ba > 12000 && f386e[4]) {
                    ba = 0;
                    b(b(al, (20 * z) / 2, true), b(al, A, false), 4);
                }
                if (bc < 500) {
                    aa = bb + (((Y - bb) * bc) / 500);
                } else {
                    aa = Y;
                }
                int i5 = aG + 25;
                aG = i5;
                if (i5 >= 250) {
                    aG -= 250;
                    f363j = true;
                } else {
                    f363j = false;
                }
                if (U != 14 && U != 15 && U != 16) {
                    ar += 25;
                    if (f363j) {
                        int i6 = f410h[al][7];
                        int i7 = f410h[al][1];
                        for (int i8 = i6; i8 < i6 + i7; i8++) {
                            Object[] objArr = f411a[i8];
                            if (m150a(objArr)) {
                                int iH = h(objArr);
                                int iMax = Math.max(((((int[]) objArr[1])[0] >> 15) & 31) - 1, 0);
                                boolean z2 = iMax == 0;
                                g(objArr, iMax);
                                switch (iH) {
                                    case 1:
                                        if (z2) {
                                            h(objArr, 2);
                                        }
                                        f411a[i8] = objArr;
                                        break;
                                    case 2:
                                        h(objArr, 0);
                                        f411a[i8] = objArr;
                                        break;
                                    default:
                                        f411a[i8] = objArr;
                                        break;
                                }
                            }
                        }
                    }
                    switch (ao) {
                        case 0:
                        case 3:
                            if (f404x && bJ > 3) {
                                int[] iArr = {0, 0, 0};
                                int i9 = f410h[al][7];
                                int i10 = f410h[al][1];
                                for (int i11 = i9; i11 < i9 + i10; i11++) {
                                    Object[] objArr2 = f411a[i11];
                                    if (m150a(objArr2) && c(objArr2) != 2) {
                                        switch (b(objArr2)) {
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
                                int iAbs = Math.abs(f362a.nextInt()) % 3;
                                int iAbs2 = ((iAbs + (Math.abs(f362a.nextInt()) % 2)) + 1) % 3;
                                int[] iArr2 = {iAbs + 1, iAbs2 + 1, (iAbs + iAbs2 == 3 ? 0 : iAbs + iAbs2 == 2 ? 1 : 2) + 1};
                                for (int i12 = 0; i12 < iArr2.length; i12++) {
                                    int i13 = iArr[iArr2[i12] - 1];
                                    if (i13 > 2) {
                                        int iAbs3 = Math.abs(f362a.nextInt()) % i13;
                                        int iAbs4 = (iAbs3 + ((Math.abs(f362a.nextInt()) % (i13 - 2)) + 1)) % i13;
                                        int i14 = 0;
                                        int i15 = 0;
                                        int i16 = 0;
                                        for (int i17 = i9; i17 < i9 + i10; i17++) {
                                            Object[] objArr3 = f411a[i17];
                                            if (m150a(objArr3) && c(objArr3) != 2 && b(objArr3) == iArr2[i12]) {
                                                if (iAbs3 == i16) {
                                                    i14 = i17;
                                                } else if (iAbs4 == i16) {
                                                    i15 = i17;
                                                }
                                                i16++;
                                            }
                                        }
                                        int iF = f(f411a[i14]);
                                        int iG = g(f411a[i14]);
                                        int iF2 = f(f411a[i15]);
                                        int iG2 = g(f411a[i15]);
                                        e(f411a[i14], iF2);
                                        f(f411a[i14], iG2);
                                        e(f411a[i15], iF);
                                        f(f411a[i15], iG);
                                    }
                                }
                            }
                            break;
                        case 1:
                            if (U != 9 && U != 7 && !m146b()) {
                                switch (bP) {
                                    case 0:
                                        if (a(f424r, 25)) {
                                            int i18 = f423q[4];
                                            int i19 = f423q[5];
                                            a(f424r, i18 + (m135d() % (((f423q[4] + f423q[6]) - f423q[2]) - i18)), i19 + (m135d() % (((f423q[5] + f423q[7]) - f423q[3]) - i19)), bR);
                                        }
                                        int i20 = f424r[4] - f423q[0];
                                        int i21 = f424r[5] - f423q[1];
                                        int[] iArr3 = f423q;
                                        iArr3[0] = iArr3[0] + i20;
                                        int[] iArr4 = f423q;
                                        iArr4[1] = iArr4[1] + i21;
                                        m148a(0, bQ, i20, i21);
                                        break;
                                    case 1:
                                        if (a(f424r, 25)) {
                                            int i22 = f423q[4];
                                            a(f424r, i22 + (m135d() % (((f423q[4] + f423q[6]) - f423q[2]) - i22)), f423q[1], bR);
                                        }
                                        int i23 = f424r[4] - f423q[0];
                                        int[] iArr5 = f423q;
                                        iArr5[0] = iArr5[0] + i23;
                                        m148a(0, bU, i23, 0);
                                        for (int i24 = 0; i24 < 3; i24++) {
                                            o oVar = f425a[i24];
                                            int i25 = bU + (i24 * bT);
                                            if (oVar.f261a) {
                                                if (a(oVar.b, 25)) {
                                                    int i26 = oVar.a[5];
                                                    a(oVar.b, oVar.a[0], i26 + (m135d() % (((oVar.a[5] + oVar.a[7]) - oVar.a[3]) - i26)), bR);
                                                }
                                                int i27 = oVar.b[5] - oVar.a[1];
                                                int[] iArr6 = oVar.a;
                                                iArr6[1] = iArr6[1] + i27;
                                                for (int i28 = i25; i28 < i25 + bT; i28++) {
                                                    Object[] objArr4 = f411a[i28];
                                                    ((int[]) objArr4[1])[2] = ((int[]) objArr4[1])[2] + i27;
                                                }
                                            } else {
                                                oVar.f260a += 25;
                                                if (oVar.f260a >= 3000) {
                                                    oVar.f260a = 0;
                                                    oVar.f261a = true;
                                                    for (int i29 = i25; i29 < i25 + bT; i29++) {
                                                        m152e(f411a[i29]);
                                                        int[] iArr7 = f410h[al];
                                                        iArr7[2] = iArr7[2] + 1;
                                                        bJ++;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        int i30 = bW + 25;
                                        bW = i30;
                                        float fSin = 2 * A * ((float) Math.sin((3.141592653589793d * ((double) i30)) / 10000.0d));
                                        float fSin2 = 12.0f + (6.0f * ((float) Math.sin((3.141592653589793d * ((double) i30)) / 20000.0d)));
                                        for (int i31 = 0; i31 < bV; i31++) {
                                            int iSin = (int) (((double) (fSin * 2.0f)) * Math.sin((3.141592653589793d * ((double) (bW + (i31 << 8)))) / ((double) (fSin2 * 512.0f))));
                                            int i32 = (17 * A) << 1;
                                            for (int i33 = 3; i33 >= 0; i33--) {
                                                int i34 = (i33 * bV) + i31;
                                                Object[] objArr5 = f411a[i34];
                                                if (i33 % 2 == 1) {
                                                    if (m150a(objArr5)) {
                                                        ((int[]) objArr5[1])[2] = bX + iSin + (i33 * A);
                                                        i32 = ((int[]) objArr5[1])[2] - A;
                                                    }
                                                } else if (m150a(objArr5)) {
                                                    int i35 = ((int[]) objArr5[1])[2] + 78;
                                                    if (!(i33 == 2 && m150a(f411a[bV + i31]) && m150a(f411a[(3 * bV) + i31])) && i35 <= i32) {
                                                        ((int[]) objArr5[1])[2] = i35;
                                                    } else {
                                                        ((int[]) objArr5[1])[2] = i32;
                                                    }
                                                    if (((int[]) objArr5[1])[2] > 17 * A) {
                                                        m126a(5, i34, 5, true);
                                                    }
                                                    if (a(f380a[0], false, 0, ((int[]) objArr5[1])[1], ((int[]) objArr5[1])[2], i(objArr5), j(objArr5))) {
                                                        q();
                                                        m126a(5, i34, 5, true);
                                                        for (int i36 = 0; i36 < bQ; i36++) {
                                                            Object[] objArr6 = f411a[i36];
                                                            if (m150a(objArr6) && d(objArr6) == 2 && ((int[]) objArr6[1])[2] > 13 * A) {
                                                                m126a(5, i36, 5, true);
                                                            }
                                                        }
                                                    }
                                                    i32 = ((int[]) objArr5[1])[2] - A;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        if (a(f424r, 25)) {
                                            int i37 = f423q[4];
                                            int i38 = f423q[5];
                                            int i39 = (f423q[4] + f423q[6]) - f423q[2];
                                            int i40 = (f423q[5] + f423q[7]) - f423q[3];
                                            if (f424r[4] == i37 && f424r[5] == i38) {
                                                i3 = i37;
                                                i4 = i40;
                                            } else if (f424r[4] == i37 && f424r[5] == i40) {
                                                i3 = i39;
                                                i4 = i40;
                                            } else if (f424r[4] == i39 && f424r[5] == i40) {
                                                i3 = i39;
                                                i4 = i38;
                                            } else {
                                                i3 = i37;
                                                i4 = i38;
                                            }
                                            a(f424r, i3, i4, bR);
                                        }
                                        int i41 = f424r[4] - f423q[0];
                                        int i42 = f424r[5] - f423q[1];
                                        int[] iArr8 = f423q;
                                        iArr8[0] = iArr8[0] + i41;
                                        int[] iArr9 = f423q;
                                        iArr9[1] = iArr9[1] + i42;
                                        m148a(0, bQ, i41, i42);
                                        break;
                                    case 4:
                                        if (a(f424r, 25)) {
                                            int i43 = f423q[4];
                                            a(f424r, f424r[4] == i43 ? (f423q[4] + f423q[6]) - f423q[2] : i43, f423q[1], bR);
                                        }
                                        int i44 = f424r[4] - f423q[0];
                                        int i45 = f424r[5] - f423q[1];
                                        int[] iArr10 = f423q;
                                        iArr10[0] = iArr10[0] + i44;
                                        int[] iArr11 = f423q;
                                        iArr11[1] = iArr11[1] + i45;
                                        m148a(0, bQ, i44, i45);
                                        break;
                                    case 5:
                                        for (int i46 = 0; i46 < 3; i46++) {
                                            o oVar2 = f425a[i46];
                                            int i47 = bU + (i46 * bT);
                                            if (oVar2.f261a) {
                                                if (a(oVar2.b, 25)) {
                                                    a(oVar2.b, oVar2.b[4] < 10 * z ? (18 * z) - oVar2.a[2] : 2 * z, oVar2.a[1], bR);
                                                }
                                                int i48 = oVar2.b[4] - oVar2.a[0];
                                                int[] iArr12 = oVar2.a;
                                                iArr12[0] = iArr12[0] + i48;
                                                for (int i49 = i47; i49 < i47 + bT; i49++) {
                                                    Object[] objArr7 = f411a[i49];
                                                    ((int[]) objArr7[1])[1] = ((int[]) objArr7[1])[1] + i48;
                                                }
                                            } else {
                                                oVar2.f260a += 25;
                                                if (oVar2.f260a >= 3000) {
                                                    oVar2.f260a = 0;
                                                    oVar2.f261a = true;
                                                    for (int i50 = i47; i50 < i47 + bT; i50++) {
                                                        m152e(f411a[i50]);
                                                        int[] iArr13 = f410h[al];
                                                        iArr13[2] = iArr13[2] + 1;
                                                        bJ++;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 6:
                                        for (int i51 = 0; i51 < bQ; i51++) {
                                            Object[] objArr8 = f411a[i51];
                                            int iC = c(objArr8);
                                            if (iC == 5 && f426s[i51] > 0) {
                                                int[] iArr14 = f426s;
                                                int i52 = i51;
                                                iArr14[i52] = iArr14[i52] - 25;
                                                if (f426s[i51] <= 0) {
                                                    f426s[i51] = 0;
                                                    d(objArr8, n(iC));
                                                    m152e(objArr8);
                                                    int[] iArr15 = f410h[al];
                                                    iArr15[2] = iArr15[2] + 1;
                                                    bJ++;
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                    }
                }
                d(25);
                l();
                j.g(25);
                if (f365e) {
                    a(true, false, m == 1 || m == 2);
                    if (m == 1 || m == 3) {
                        f += 5;
                        al = 0;
                        if (m == 1) {
                            g = f;
                            h = true;
                            S = 5;
                        } else {
                            f365e = false;
                        }
                    } else {
                        o++;
                        M++;
                        c(1000);
                        if (o < 99) {
                            az = 1;
                        } else if (o == 99) {
                            S = 6;
                            az = 1;
                        } else if (o == 100) {
                            S = 7;
                            DCWall3D.f8a = 0;
                        }
                    }
                }
                if (f364d) {
                    a(true, false, true);
                    h = false;
                    if (m == 1) {
                        p = f;
                    }
                    S = 5;
                }
                f368m = false;
                f391u = false;
            }
        }
        return S;
    }

    public static final void b(int i2, int i3) {
        if (f350a > 0 && ((i3 == 3 && i2 == 14) || (i3 == 0 && t.m86a(i2) == 53))) {
            f350a = 0;
            t.m85b();
            t.a(9, 0);
        }
        if (f354b) {
            if ((i3 != 3 || i2 != 1) && (i3 != 0 || t.m86a(i2) != 53)) {
                if (f372f) {
                    f359b.c(i2, i3);
                    return;
                } else {
                    f358a.c(i2, i3);
                    return;
                }
            }
            f354b = false;
            t.m85b();
            t.a(9, 0);
            t();
            if (f356a[ay] || !f355c) {
                return;
            }
            f356a[ay] = true;
            DCWall3D.b();
        }
        int iM86a = t.m86a(i2);
        if (i3 == 3) {
            if (i2 == 9) {
                S = 4;
                return;
            }
            return;
        }
        if (i3 != 0) {
            if (i3 == 1) {
                switch (iM86a) {
                    case 52:
                        f366k = false;
                        break;
                    case 54:
                        f367l = false;
                        break;
                }
            }
            return;
        }
        if (f350a <= 0) {
            switch (iM86a) {
                case 48:
                    if (m == 3) {
                        ab += 400;
                    }
                    break;
                case 49:
                    if (a && m == 2) {
                        U = 8;
                    } else if (a) {
                        if (m == 1 || m == 3) {
                            U = 14;
                        }
                    }
                    break;
                case 50:
                    int iM123b = m123b();
                    if (iM123b > 1) {
                        e--;
                        av = -500;
                        if (e < 0) {
                            e = iM123b - 1;
                        }
                    }
                    break;
                case 51:
                    if (a) {
                        if (m == 1 || m == 3) {
                            U = 8;
                        }
                    }
                    break;
                case 52:
                    f366k = true;
                    break;
                case 53:
                    f368m = true;
                    break;
                case 54:
                    f367l = true;
                    break;
                case 55:
                    if (a) {
                        do {
                            int i4 = bp + 1;
                            bp = i4;
                            if (i4 >= f386e.length) {
                                bp = 0;
                            }
                        } while (!f386e[bp]);
                        j.m52d(bp);
                    }
                    break;
                case 56:
                    int iM123b2 = m123b();
                    if (iM123b2 > 1) {
                        e++;
                        av = 500;
                        if (e >= iM123b2) {
                            e = 0;
                        }
                    }
                    break;
                case 57:
                    if (a) {
                        b(b(al, (20 * z) / 2, true), b(al, A, false), bp);
                    }
                    break;
            }
        }
    }

    public static final void d() {
        f366k = false;
        f367l = false;
        f368m = false;
    }

    private static void a(int i2, int i3, int i4) {
        if (aN >= 147) {
            new StringBuffer().append("NOTE: event queue is full and will be cleared ").append(i2).toString();
            l();
        }
        switch (i2 & 255) {
            case 10:
                int[] iArr = f377h;
                int i5 = aN;
                aN = i5 + 1;
                iArr[i5] = (i2 << 24) | (i2 >> 8);
                int[] iArr2 = f377h;
                int i6 = aN;
                aN = i6 + 1;
                iArr2[i6] = i3;
                f377h[aN] = i4;
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
                f377h[aN] = (i2 << 24) | ((i3 & 255) << 16) | (i4 & 65535);
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
                f377h[aN] = (i2 << 24) | ((i4 & 255) << 16) | (i3 & 65535);
                break;
        }
        aN++;
    }

    private static void l() {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < aN) {
            int i5 = f377h[i4] >> 24;
            int i6 = i5;
            switch (i5) {
                case 10:
                    int i7 = i4;
                    int i8 = i4 + 1;
                    i6 |= f377h[i7] << 8;
                    i4 = i8 + 1;
                    i2 = f377h[i8];
                    i3 = f377h[i4];
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
                    i2 = (f377h[i4] >> 16) & 255;
                    i3 = f377h[i4] & 65535;
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
                    i2 = f377h[i4] & 65535;
                    i3 = (f377h[i4] >> 16) & 255;
                    break;
            }
            j.a(i6, i2, i3);
            i4++;
        }
        aN = 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m121a(int i2) {
        switch (i2 - 15) {
            case 0:
                j.f(2);
                aJ = -1;
                R = -1;
                break;
            case 1:
                m();
                break;
            case 2:
                j.b();
                break;
            case 3:
                n();
                break;
            case 4:
                j.m41a(V);
                break;
            case 5:
                o();
                break;
            case 6:
                j.c();
                break;
            case 7:
                j.i(0);
                break;
            case 8:
                j.m62h();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x060a  */
    /* JADX WARN: Code duplicated, block: B:359:0x0e1a  */
    /* JADX WARN: Code duplicated, block: B:389:0x0f8b  */
    /* JADX WARN: Code duplicated, block: B:431:0x112f  */
    /* JADX WARN: Code duplicated, block: B:433:0x1145  */
    /* JADX WARN: Code duplicated, block: B:565:0x170f  */
    /* JADX WARN: Code duplicated, block: B:579:0x1768  */
    /* JADX WARN: Code duplicated, block: B:581:0x176e  */
    /* JADX WARN: Code duplicated, block: B:583:0x177a  */
    /* JADX WARN: Code duplicated, block: B:931:0x114f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:971:0x1ad0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:972:0x1ad0 A[SYNTHETIC] */
    private static void d(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iMax;
        int iMin;
        int i7;
        boolean z2;
        int i8;
        f383t = W == 0;
        W = Math.min(W + i2, V);
        if (av != 0) {
            if (av > 0) {
                av = Math.max(0, av - i2);
            } else {
                av = Math.min(0, av + i2);
            }
        }
        if (U != aR) {
            a(40, U, V);
        }
        aR = U;
        switch (U) {
            case 1:
                m();
                break;
            case 2:
                break;
            case 3:
                o();
                return;
            case 4:
                e = Math.max(0, Math.min(m123b() - 1, e));
                aw = Math.max(0, aw - i2);
                boolean z3 = true;
                for (int i9 = 0; i9 < 3; i9++) {
                    if (f381b[i9][1] == 18 || f381b[i9][1] == 17) {
                        z3 = false;
                    }
                }
                if (z3 && f368m) {
                    f391u = true;
                    if (m123b() > 0) {
                        int iB = b(e);
                        for (int i10 = 0; i10 < 1; i10++) {
                            if (f391u) {
                                boolean z4 = true;
                                switch (iB) {
                                    case 4:
                                        if (f392c[4] && f391u && f397e[0][0] == 0) {
                                            f392c[4] = false;
                                            v();
                                            bs = 3000;
                                            f397e[0][0] = 1;
                                            j.m51c(1200);
                                            j.f110a = 1500;
                                        }
                                        break;
                                    case 5:
                                        if (f392c[5] && f391u && f398f[0][0] == 0) {
                                            f392c[5] = false;
                                            f398f[0][0] = 1;
                                            f398f[0][5] = 0;
                                            f398f[0][1] = f380a[0][4] + (f380a[0][14] / 2);
                                            f398f[0][3] = f380a[0][5] - A;
                                            f398f[0][2] = f398f[0][1];
                                            f398f[0][4] = 0;
                                            f398f[0][6] = 0;
                                            z4 = false;
                                        }
                                        break;
                                    case 6:
                                        if (f392c[6] && f391u) {
                                            f392c[6] = false;
                                            if (bu == 0) {
                                                bu = 1;
                                                bv = 1600;
                                                ad = 0;
                                                I++;
                                                m142h(6);
                                            }
                                        }
                                        break;
                                    case 10:
                                        if (f392c[10] && f391u && f402g[0][0] == 0) {
                                            f392c[10] = false;
                                            f402g[0][0] = 1;
                                            f402g[0][6] = 1;
                                            f402g[0][1] = f380a[0][4] + (f380a[0][14] / 2);
                                            f402g[0][2] = f380a[0][5] - A;
                                            f402g[0][3] = f402g[0][2];
                                            f402g[0][4] = bz;
                                            f402g[0][5] = 3000;
                                            f402g[0][7] = 0;
                                            z4 = false;
                                        }
                                        break;
                                    case 11:
                                        if (f392c[11] && f391u && ae == 0) {
                                            f392c[11] = false;
                                            ae = 1;
                                            by = 2000;
                                        }
                                        break;
                                    case 12:
                                        if (f392c[12] && f391u && ac == 0) {
                                            y();
                                            f393v = true;
                                            f392c[12] = false;
                                        }
                                        break;
                                    case 21:
                                        if (f392c[21] && f391u && j <= 0) {
                                            f392c[21] = false;
                                            j = 1000;
                                        }
                                        break;
                                }
                                if (z4) {
                                }
                            }
                        }
                    }
                }
                for (int i11 = 0; i11 < aZ; i11++) {
                    if (f382c[i11][1] == 1) {
                        int[] iArr = f380a[0];
                        int[] iArr2 = f382c[i11];
                        if (iArr == null || iArr2 == null) {
                            z2 = false;
                        } else {
                            int i12 = iArr[4];
                            int i13 = iArr[5];
                            int i14 = iArr[14] + i12;
                            int i15 = iArr[15] + i13;
                            int i16 = iArr2[4] - (iArr2[14] / 2);
                            int i17 = iArr2[5] - (iArr2[15] / 2);
                            z2 = i16 <= i14 && iArr2[14] + i16 >= i12 && i17 <= i15 && iArr2[15] + i17 >= i13;
                        }
                        if (z2) {
                            int i18 = i11;
                            if (f382c[i18][2] == 20) {
                                f382c[i18][2] = a(false);
                            }
                            int i19 = f382c[i18][2];
                            switch (i19) {
                                case 0:
                                    f405y = true;
                                    bD = 15000;
                                    aV = 4;
                                    break;
                                case 1:
                                    bE = 15000;
                                    aV = 12;
                                    break;
                                case 2:
                                    int i20 = 0;
                                    for (int i21 = 0; i21 < 3; i21++) {
                                        if (f381b[i21][1] != 0) {
                                            i20 = i21;
                                            int i22 = 0;
                                            for (i8 = 0; i8 < 3; i8++) {
                                                if (i8 == i20 && f381b[i8][1] == 0) {
                                                    f381b[i8][4] = f380a[0][4] + f380a[0][14];
                                                    f381b[i8][5] = f380a[0][5] - 330;
                                                    if (f381b[i8][4] - 195 < 0) {
                                                        System.out.println("safety check");
                                                        f381b[i8][4] = 196;
                                                    } else if (f381b[i8][4] + 195 >= z * 20) {
                                                        System.out.println("safety check");
                                                        f381b[i8][4] = ((z * 20) - 195) - 1;
                                                    }
                                                    int i23 = (-64) + (i22 << 7);
                                                    int iM137f = (m137f(i23) << 4) >> 8;
                                                    int i24 = ((-m138g(i23)) << 4) >> 8;
                                                    f381b[i8][1] = 16;
                                                    f381b[i8][6] = ((iM137f * aW) * aV) >> 11;
                                                    f381b[i8][7] = ((i24 * aW) * aV) >> 11;
                                                    f401d[i8] = false;
                                                    i22++;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    int i25 = 0;
                                    while (i8 < 3) {
                                        if (i8 == i20) {
                                        }
                                    }
                                    break;
                                case 3:
                                    f403g = true;
                                    aM = 20000;
                                    break;
                                case 4:
                                    f392c[4] = true;
                                    break;
                                case 5:
                                    f392c[5] = true;
                                    break;
                                case 6:
                                    f392c[6] = true;
                                    break;
                                case 7:
                                    bw = 1;
                                    break;
                                case 8:
                                    if (ah <= 0) {
                                        C();
                                    }
                                    ah = 15000;
                                    break;
                                case 9:
                                    ag = 5000;
                                    break;
                                case 10:
                                    f392c[10] = true;
                                    break;
                                case 11:
                                    if (!f392c[11]) {
                                        f392c[11] = true;
                                        for (int i26 = 0; i26 < 3; i26++) {
                                            if (f381b[i26][1] != 0) {
                                                f401d[i26] = true;
                                            }
                                        }
                                    }
                                    break;
                                case 12:
                                    f392c[12] = true;
                                    break;
                                case 13:
                                    bA = 6000;
                                    break;
                                case 14:
                                    bC = 2;
                                    bB = 10000;
                                    break;
                                case 15:
                                    bC = 4;
                                    bB = 10000;
                                    break;
                                case 16:
                                    if (as < 4) {
                                        as++;
                                        f373p = true;
                                        bF = 15000;
                                        int i27 = (2220 - f380a[0][14]) / 2;
                                        int[] iArr3 = f380a[0];
                                        iArr3[4] = iArr3[4] - 138;
                                        f380a[0][14] = 1380 + (((as * 1380) * 20) / 100);
                                        int[] iArr4 = f380a[1];
                                        iArr4[4] = iArr4[4] - i27;
                                        f380a[1][14] = f380a[0][14];
                                    }
                                    break;
                                case 17:
                                    f374q = true;
                                    bF = 15000;
                                    int i28 = (f380a[0][14] - 820) / 2;
                                    int[] iArr5 = f380a[0];
                                    iArr5[4] = iArr5[4] + i28;
                                    f380a[0][14] = 820;
                                    int[] iArr6 = f380a[1];
                                    iArr6[4] = iArr6[4] + i28;
                                    f380a[1][14] = 820;
                                    for (int i29 = 0; i29 < 3; i29++) {
                                        if (f381b[i29][1] == 17 || f381b[i29][1] == 18) {
                                            if (f381b[i29][9] < 0) {
                                                f381b[i29][9] = 0;
                                            }
                                            if (f381b[i29][9] > 820) {
                                                f381b[i29][9] = 820;
                                            }
                                        }
                                    }
                                    break;
                                case 18:
                                    X++;
                                    O++;
                                    m142h(3);
                                    break;
                                case 19:
                                    bG = 10000;
                                    break;
                                case 21:
                                    f392c[21] = true;
                                    break;
                                case 22:
                                    k = 8000;
                                    l = 1;
                                    break;
                                case 23:
                                    ax = 8000;
                                    break;
                                case 24:
                                    af = 15000;
                                    break;
                                case 25:
                                    ai = 10000;
                                    break;
                                case 26:
                                    float fD = j.d(0);
                                    float fC = j.c(((z * 20) - 1380) / 2);
                                    j.f110a = 2000;
                                    if (fD >= fC) {
                                        j.f140f = 0;
                                    } else {
                                        j.f140f = 1;
                                    }
                                    break;
                                case 27:
                                    aj = 10000;
                                    f406z = true;
                                    break;
                                case 28:
                                    if (!f408B) {
                                        bH = 10000;
                                        f409C = true;
                                        int i30 = f410h[al][1];
                                        int i31 = f410h[al][7];
                                        for (int i32 = i31; i32 < i31 + i30; i32++) {
                                            Object[] objArr = f411a[i32];
                                            if (m150a(objArr) && c(objArr) == 1) {
                                                m151d(objArr);
                                            }
                                        }
                                    }
                                    break;
                                case 29:
                                    ak = 10000;
                                    f407A = true;
                                    break;
                            }
                            for (int i33 = 0; i33 < f384j.length; i33++) {
                                int[] iArr7 = f384j;
                                int i34 = i33;
                                iArr7[i34] = iArr7[i34] + 1;
                            }
                            f384j[i19] = 0;
                            a(10 | (f382c[i18][2] << 8), f382c[i18][4], f382c[i18][5]);
                            B++;
                            f382c[i18][1] = 0;
                            h(8);
                        }
                    }
                }
                if (m123b() >= 2) {
                    h(8);
                }
                for (int i35 = 0; i35 < 3; i35++) {
                    if (f381b[i35][1] != 0) {
                        for (int i36 = 0; i36 < 2; i36++) {
                            if (f380a[i36][1] != 0 && j <= 100 && f381b[i35][1] != 17 && a(f381b[i35], f380a[i36], i2, false)) {
                                a(12, i35, i36);
                            }
                        }
                    }
                }
                boolean z5 = false;
                for (int i37 = 0; i37 < 3; i37++) {
                    if (f381b[i37][1] != 0 && f381b[i37][1] != 17 && a(f381b[i37], (int[]) null, i2, true)) {
                        z5 = true;
                        f(i37);
                    }
                }
                for (int i38 = 0; i38 < 2; i38++) {
                    a(f380a[i38], i38, i2);
                }
                for (int i39 = 0; i39 < 3; i39++) {
                    if (f381b[i39][1] != 0) {
                        int iL = l((f381b[i39][6] * f381b[i39][6]) + (f381b[i39][7] * f381b[i39][7]));
                        int i40 = aV * aW;
                        int i41 = i40;
                        if (i40 > 8 * aF * 20) {
                            i41 = 8 * aF * 20;
                        }
                        if (iL != 0) {
                            f381b[i39][6] = ((i41 * f381b[i39][6]) / iL) >> 3;
                            f381b[i39][7] = ((i41 * f381b[i39][7]) / iL) >> 3;
                        }
                        if (Math.abs(f381b[i39][7]) < 250) {
                            if (f381b[i39][7] == 0) {
                                f381b[i39][7] = 1;
                            }
                            f381b[i39][7] = 250 * (f381b[i39][7] / Math.abs(f381b[i39][7]));
                        }
                    }
                }
                for (int i42 = 0; i42 < 3; i42++) {
                    a(f381b[i42], i42, i2);
                }
                for (int i43 = 0; i43 < aZ; i43++) {
                    a(f382c[i43], i43, i2);
                }
                if (ao == 1 && !z5) {
                    for (int i44 = 0; i44 < 3; i44++) {
                        if (f381b[i44][1] != 0 && f381b[i44][1] != 17 && a(f381b[i44], (int[]) null, i2, true)) {
                            f(i44);
                        }
                    }
                }
                if (U != 9 && U != 7) {
                    for (int i45 = 0; i45 < 31; i45++) {
                        for (int i46 = 0; i46 < 1; i46++) {
                            int i47 = i46;
                            boolean z6 = false;
                            switch (i45) {
                                case 4:
                                    if (f397e[i47][0] == 1) {
                                        f397e[i47][1] = f380a[0][4] + (f380a[0][14] >> 1);
                                        f397e[i47][2] = f380a[0][5];
                                        if (an == 1) {
                                            f397e[i47][3] = 1;
                                        } else {
                                            f397e[i47][3] = f380a[1][5];
                                        }
                                        int i48 = (int) (j.f170a / 2.0f);
                                        int i49 = f410h[al][7];
                                        int i50 = f410h[al][1];
                                        int i51 = -1;
                                        int i52 = 0;
                                        for (int i53 = i49; i53 < i49 + i50; i53++) {
                                            Object[] objArr2 = f411a[i53];
                                            if (m150a(objArr2)) {
                                                int i54 = ((int[]) objArr2[1])[1];
                                                int i55 = ((int[]) objArr2[1])[2];
                                                int i56 = i54 + i(objArr2);
                                                int iJ = i55 + j(objArr2);
                                                int i57 = f397e[i47][1] - i48;
                                                do {
                                                    if (a(i54, iJ, i56, iJ, i57, f397e[i47][3], f397e[i47][2]) && iJ > i52) {
                                                        i52 = iJ;
                                                        i51 = i53;
                                                    }
                                                    i7 = i57 + ((z << 2) / 5);
                                                    i57 = i7;
                                                } while (i7 < f397e[i47][1] + i48);
                                            }
                                        }
                                        if (i51 != -1) {
                                            z6 = true;
                                            f388m[0][7] = (i51 << 16) | 5;
                                            f388m[0][2] = i52;
                                        }
                                        if (z6) {
                                            f397e[i47][3] = f388m[0][2];
                                            f397e[i47][5] = 1;
                                        } else {
                                            f397e[i47][5] = 0;
                                        }
                                    }
                                    break;
                                case 5:
                                    if (f398f[i47][0] == 1 && f398f[i47][5] != 1) {
                                        int i58 = f398f[i47][1];
                                        int i59 = f398f[i47][2];
                                        int i60 = z;
                                        int i61 = i59 > i58 ? 1 : -1;
                                        int i62 = i58;
                                        do {
                                            int iM134b = m134b(i62 / z, (f398f[i47][3] - f410h[al][4]) / A);
                                            int i63 = iM134b & 65535;
                                            if (i63 > 2) {
                                                f398f[i47][0] = 0;
                                                f398f[i47][5] = 1;
                                                f398f[i47][6] = i63 < 5 ? -1 : (iM134b >> 16) & 65535;
                                                z6 = true;
                                            } else {
                                                int i64 = i62 + (i61 * i60);
                                                iMin = i61 == 1 ? Math.min(i64, i59) : Math.max(i64, i59);
                                                i62 = iMin;
                                            }
                                            if (z6) {
                                                f398f[i47][2] = i62;
                                            }
                                            break;
                                        } while (iMin != i59);
                                        if (z6) {
                                            f398f[i47][2] = i62;
                                        }
                                    }
                                    break;
                                case 7:
                                    if (bw == 2) {
                                        bw = 0;
                                        z6 = true;
                                    }
                                    break;
                                case 10:
                                    boolean z7 = f402g[0][0] == 1;
                                    int i65 = f402g[0][6];
                                    if (!z7 && f392c[10] && b(e) == 10) {
                                        f402g[i47][1] = f380a[0][4] + (f380a[0][14] / 2);
                                        f402g[i47][2] = f380a[0][5] - 1;
                                        f402g[i47][3] = f410h[al][4] + A + f380a[0][15] + 1;
                                        if (a(f388m[0], f402g[i47][1], f402g[i47][2], f402g[i47][1], f402g[i47][3], false)) {
                                            f402g[i47][3] = f388m[0][2];
                                        }
                                    }
                                    if (i65 == 1) {
                                        int i66 = f402g[i47][2];
                                        int i67 = f402g[i47][3];
                                        int i68 = -A;
                                        int i69 = i66 + A;
                                        do {
                                            int iC = c(f402g[i47][1], i69 - f410h[al][4]);
                                            int i70 = iC & 65535;
                                            if (i70 == 0 || i70 <= 4) {
                                                iMax = Math.max(i69 + i68, i67);
                                                i69 = iMax;
                                            } else {
                                                f402g[i47][6] = 3;
                                                f402g[i47][0] = 0;
                                                f402g[i47][7] = i70 < 5 ? -1 : (iC >> 16) & 65535;
                                                z6 = true;
                                            }
                                            if (z6) {
                                                f402g[i47][3] = i69;
                                            }
                                            break;
                                        } while (iMax != i67);
                                        if (z6) {
                                            f402g[i47][3] = i69;
                                        }
                                    }
                                    break;
                                case 11:
                                    if (ae == 2) {
                                        ae = 0;
                                        z6 = true;
                                    }
                                    break;
                                case 12:
                                    for (int i71 = 0; i71 < f394d.length; i71++) {
                                        if (f394d[i71][3] == 1) {
                                            int i72 = f394d[i71][0];
                                            int i73 = f394d[i71][1];
                                            int iJ2 = f394d[i71][0] - (j(i71) * i2);
                                            int iK = f394d[i71][1] - (k(i71) * i2);
                                            if (i72 <= 0 || i72 >= 20 * z || i73 <= 0) {
                                                f394d[i71][3] = 2;
                                            } else {
                                                int i74 = f410h[al][7];
                                                int i75 = f410h[al][1];
                                                for (int i76 = i74; i76 < i74 + i75; i76++) {
                                                    Object[] objArr3 = f411a[i76];
                                                    if (m150a(objArr3)) {
                                                        int i77 = ((int[]) objArr3[1])[1];
                                                        int i78 = ((int[]) objArr3[1])[2];
                                                        int i79 = i77 + i(objArr3);
                                                        int iJ3 = i78 + j(objArr3);
                                                        if (a(i72, i73, iJ2, iK, i77, i78, iJ3) || a(i72, i73, iJ2, iK, i79, i78, iJ3)) {
                                                            f394d[i71][3] = 2;
                                                            if (c(f411a[i76]) != 2) {
                                                                m126a(5, i76, 6, false);
                                                            }
                                                        } else {
                                                            int iMin2 = Math.min(i73, iK);
                                                            int iMax2 = Math.max(i73, iK);
                                                            boolean z8 = iMax2 > iJ3 && iMin2 < iJ3 && iMin2 != iMax2 && (i6 = i72 + (((iJ2 - i72) * (iJ3 - i73)) / (iK - i73))) > Math.min(i77, i79) && i6 < Math.max(i77, i79);
                                                            if (z8) {
                                                                f394d[i71][3] = 2;
                                                                if (c(f411a[i76]) != 2) {
                                                                    m126a(5, i76, 6, false);
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
                            if (z6) {
                                int i80 = i46;
                                switch (i45) {
                                    case 4:
                                        boolean z9 = false;
                                        int i81 = (f388m[0][7] >> 16) & 65535;
                                        if (i81 != f397e[i80][7]) {
                                            f397e[i80][4] = 1;
                                            f397e[i80][5] = 1;
                                            f397e[i80][7] = i81;
                                        } else if (f397e[i80][6] == 0) {
                                            f397e[i80][5] = 0;
                                            f397e[i80][7] = -1;
                                            z9 = true;
                                        }
                                        if (z9) {
                                            m126a(f388m[0][7] & 65535, (f388m[0][7] >> 16) & 65535, 2, true);
                                        }
                                        break;
                                    case 5:
                                        if (i80 < f398f.length && (i5 = f398f[i80][6]) < f411a.length) {
                                            a(f(f411a[i5]), g(f411a[i5]), 2, true);
                                        }
                                        break;
                                    case 7:
                                        Object[] objArr4 = f411a[bx];
                                        int iD = d(objArr4);
                                        int iC2 = c(objArr4);
                                        int i82 = f410h[al][7];
                                        int i83 = f410h[al][1];
                                        for (int i84 = i82; i84 < i83 + i82; i84++) {
                                            Object[] objArr5 = f411a[i84];
                                            if (m150a(objArr5) && d(objArr5) == iD && c(objArr5) == iC2) {
                                                m126a(5, i84, 4, false);
                                            }
                                        }
                                        break;
                                    case 10:
                                        int i85 = f402g[i80][7];
                                        if (i85 < f411a.length) {
                                            int i86 = ((int[]) f411a[i85][1])[1];
                                            int i87 = ((int[]) f411a[i85][1])[2];
                                            int i88 = 0;
                                            int i89 = 2 * z;
                                            int i90 = i87 + A;
                                            while (true) {
                                                int i91 = i90;
                                                if (i91 <= (-A)) {
                                                    j.f110a = 500;
                                                    j.m51c(500);
                                                } else {
                                                    int i92 = i88;
                                                    while (true) {
                                                        int i93 = i92;
                                                        if (i93 < i89) {
                                                            int iC3 = c(i93 + i86, i91);
                                                            int i94 = iC3 & 65535;
                                                            if (i94 > 4) {
                                                                int i95 = (i90 - i91) / (A * 3);
                                                                int iMin3 = Math.min(20, i95);
                                                                int i96 = (iC3 >> 16) & 65535;
                                                                Object[] objArr6 = f411a[i96];
                                                                if (c(objArr6) == 2) {
                                                                    i88 = i89;
                                                                } else if (i95 == 0) {
                                                                    m126a(i94, i96, 1, true);
                                                                } else {
                                                                    h(objArr6, 1);
                                                                    g(objArr6, iMin3);
                                                                    f411a[i96] = objArr6;
                                                                }
                                                            }
                                                            i92 = i93 + z;
                                                        }
                                                    }
                                                    i90 = i91 - A;
                                                }
                                            }
                                        }
                                        break;
                                    case 11:
                                        for (int i97 = 0; i97 < 3; i97++) {
                                            if (f381b[i97][1] != 0 && f401d[i97]) {
                                                a(m124c(i97) / z, m125d(i97) / A, 4, true);
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    for (int i98 = 0; i98 < 31; i98++) {
                        for (int i99 = 0; i99 < 1; i99++) {
                            int i100 = i99;
                            switch (i98) {
                                case 0:
                                    bD = Math.max(0, bD - i2);
                                    if (f405y && bD == 0) {
                                        f405y = false;
                                        aV = 8;
                                    }
                                    break;
                                case 1:
                                    bE = Math.max(0, bE - i2);
                                    break;
                                case 3:
                                    int iMax3 = Math.max(0, aM - i2);
                                    aM = iMax3;
                                    if (iMax3 == 0) {
                                        f403g = false;
                                    }
                                    break;
                                case 4:
                                    if (f397e[i100][0] == 1) {
                                        if (f397e[i100][5] == 1) {
                                            if (f397e[i100][4] == 1) {
                                                f397e[i100][6] = c(f411a[f397e[i100][7]]) == 2 ? 2000 : 250;
                                            } else {
                                                f397e[i100][6] = Math.max(0, f397e[i100][6] - i2);
                                            }
                                            f397e[i100][4] = 0;
                                        }
                                        m135d();
                                        m135d();
                                        int i101 = aL - i2;
                                        aL = i101;
                                        if (i101 <= 0) {
                                            aL += 40;
                                        }
                                        if (i100 == 0) {
                                            bs -= i2;
                                        }
                                    }
                                    if (bs <= 0) {
                                        f397e[i100][0] = 0;
                                    }
                                    break;
                                case 5:
                                    boolean z10 = f398f[i100][0] == 1;
                                    int i102 = f398f[i100][5];
                                    if (z10 && i102 == 0) {
                                        f398f[i100][1] = f398f[i100][2];
                                        int[] iArr8 = f398f[i100];
                                        iArr8[2] = iArr8[2] + ((f398f[i100][4] * i2) >> 10);
                                        int[] iArr9 = f398f[i100];
                                        iArr9[3] = iArr9[3] + ((bt * i2) >> 10);
                                        int i103 = (f398f[i100][1] - (f380a[0][4] + (f380a[0][14] / 2))) / z;
                                        int[] iArr10 = f398f[i100];
                                        iArr10[4] = iArr10[4] + ((i103 > 0 ? -1 : 1) * ((((i103 << 8) * i103) * i2) >> 10));
                                    }
                                    break;
                                case 6:
                                    g(i2);
                                    break;
                                case 8:
                                    ah = Math.max(0, ah - i2);
                                    break;
                                case 9:
                                    ag = Math.max(0, ag - i2);
                                    break;
                                case 10:
                                    if (f402g[i100][0] == 1 && f402g[i100][6] == 1) {
                                        f402g[i100][2] = f402g[i100][3];
                                        int[] iArr11 = f402g[i100];
                                        iArr11[3] = iArr11[3] + ((f402g[i100][4] * i2) >> 10);
                                        int[] iArr12 = f402g[i100];
                                        iArr12[4] = iArr12[4] + ((i2 * (-5000)) >> 10);
                                        int[] iArr13 = f402g[i100];
                                        iArr13[5] = iArr13[5] - i2;
                                        if (f402g[i100][5] < 0) {
                                            f402g[i100][6] = 3;
                                            f402g[i100][0] = 0;
                                        }
                                        int i104 = aK - i2;
                                        aK = i104;
                                        if (i104 <= 0) {
                                            aK += 40;
                                        }
                                    }
                                    break;
                                case 11:
                                    int i105 = ae;
                                    boolean z11 = false;
                                    for (int i106 = 0; i106 < 3; i106++) {
                                        if (f381b[i106][1] != 0 && f401d[i106]) {
                                            z11 = true;
                                            if (!z11) {
                                                f392c[11] = false;
                                            }
                                            if (!f392c[11] && ae == 0) {
                                                for (int i107 = 0; i107 < 3; i107++) {
                                                    if (f381b[i107][1] != 0 && f401d[i107]) {
                                                        f400n[i107][0] = f381b[i107][4];
                                                        f400n[i107][1] = f381b[i107][5];
                                                    }
                                                }
                                            } else if (i105 == 1) {
                                                i4 = by - i2;
                                                by = i4;
                                                if (i4 < 0) {
                                                    ae = 2;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    if (!z11) {
                                        f392c[11] = false;
                                    }
                                    if (!f392c[11]) {
                                        if (i105 == 1) {
                                            i4 = by - i2;
                                            by = i4;
                                            if (i4 < 0) {
                                                ae = 2;
                                            }
                                        }
                                    } else if (i105 == 1) {
                                        i4 = by - i2;
                                        by = i4;
                                        if (i4 < 0) {
                                            ae = 2;
                                        }
                                    }
                                    break;
                                case 12:
                                    boolean z12 = false;
                                    for (int i108 = 0; i108 < f394d.length; i108++) {
                                        if (f394d[i108][3] == 1) {
                                            int[] iArr14 = f394d[i108];
                                            iArr14[0] = iArr14[0] + (j(i108) * i2);
                                            int[] iArr15 = f394d[i108];
                                            iArr15[1] = iArr15[1] + (k(i108) * i2);
                                            z12 = true;
                                        }
                                    }
                                    ac = Math.max(0, Math.min(900, ac + (f393v ? i2 : -i2)));
                                    if (!z12 && br == 35 && f393v) {
                                        f393v = false;
                                    } else if (ac >= 900) {
                                        for (int i109 = 0; i109 < f396n.length; i109++) {
                                            int[] iArr16 = f396n;
                                            int i110 = i109;
                                            iArr16[i110] = iArr16[i110] + i2;
                                            int[] iArr17 = f395m;
                                            int i111 = i109;
                                            iArr17[i111] = iArr17[i111] + i2;
                                            if (f395m[i109] >= 60) {
                                                int[] iArr18 = f395m;
                                                int i112 = i109;
                                                iArr18[i112] = iArr18[i112] - 60;
                                                int i113 = i109;
                                                if (br < 35) {
                                                    f394d[br][3] = 1;
                                                    int i114 = f380a[0][4] + (i113 == 1 ? f380a[0][14] : 0);
                                                    int i115 = f380a[0][5];
                                                    f394d[br][0] = i114;
                                                    f394d[br][1] = i115;
                                                    f394d[br][2] = m132e(i113);
                                                    br++;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 13:
                                    f404x = bA / 300 != (bA - i2) / 300;
                                    int iMax4 = Math.max(0, bA - i2);
                                    bA = iMax4;
                                    if (iMax4 == 0) {
                                        f404x = false;
                                    }
                                    break;
                                case 14:
                                case 15:
                                    int iMax5 = Math.max(0, bB - i2);
                                    bB = iMax5;
                                    if (iMax5 == 0) {
                                        bC = 1;
                                    }
                                    break;
                                case 16:
                                    int iMax6 = Math.max(0, bF - i2);
                                    bF = iMax6;
                                    if (iMax6 == 0) {
                                        f373p = false;
                                        A();
                                    }
                                    break;
                                case 17:
                                    int iMax7 = Math.max(0, bF - i2);
                                    bF = iMax7;
                                    if (iMax7 == 0) {
                                        f374q = false;
                                        A();
                                    }
                                    break;
                                case 19:
                                    bG = Math.max(0, bG - i2);
                                    break;
                                case 21:
                                    j = Math.max(0, j - i2);
                                    break;
                                case 22:
                                    k = Math.max(0, k - i2);
                                    break;
                                case 23:
                                    ax = Math.max(0, ax - i2);
                                    f353a += ((ax > 0 ? 1.0f : -1.0f) * i2) / 1000.0f;
                                    f353a = Math.min(Math.max(0.0f, f353a), 1.0f);
                                    break;
                                case 24:
                                    af = Math.max(0, af - i2);
                                    break;
                                case 25:
                                    ai = Math.max(0, ai - i2);
                                    break;
                                case 27:
                                    int iMax8 = Math.max(0, aj - i2);
                                    aj = iMax8;
                                    if (iMax8 == 0) {
                                        f406z = false;
                                    }
                                    break;
                                case 29:
                                    int iMax9 = Math.max(0, ak - i2);
                                    ak = iMax9;
                                    if (iMax9 == 0) {
                                        f407A = false;
                                        break;
                                    }
                                case 28:
                                    bH = Math.max(0, bH - i2);
                                    if (f409C && bH == 0) {
                                        f409C = false;
                                        if (!f408B) {
                                            int i116 = f410h[al][1];
                                            int i117 = f410h[al][7];
                                            for (int i118 = i117; i118 < i117 + i116; i118++) {
                                                Object[] objArr7 = f411a[i118];
                                                if (c(objArr7) == 1 && !m150a(objArr7)) {
                                                    m152e(objArr7);
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    int i119 = f410h[al][7];
                    int i120 = f410h[al][1];
                    for (int i121 = i119; i121 < i119 + i120; i121++) {
                        Object[] objArr8 = f411a[i121];
                        if (m150a(objArr8) && h(objArr8) == 2) {
                            m126a(5, i121, 5, false);
                        }
                    }
                }
                if (m != 2) {
                    if (f381b[m130c()][1] != 18) {
                        at += i2;
                    }
                    if (au > f470ak[n - 1] || at < f467ah[n - 1] + f468ai[n - 1]) {
                        au = 0;
                    } else {
                        au += i2;
                        e(P + f469aj[n - 1]);
                        at = f467ah[n - 1];
                    }
                }
                ab = Math.max(0, Math.min(999, ab + bh));
                bh = 0;
                if (f363j && f381b[0][1] != 18) {
                    ab = Math.max(0, ab - 1);
                    if (m == 3 && ab == 0) {
                        a(33, 0, 0);
                        U = 9;
                        V = 1000;
                        W = 0;
                    }
                }
                if (m == 2 && ao == 1 && !f360i) {
                    f360i = true;
                    h(7);
                    aw = 2500;
                    j.e(bP);
                    j.f110a = 2000;
                }
                if (V == 0 || W != V || am == 0) {
                    return;
                }
                if (am == 1 || am == 2) {
                    aV = aX;
                }
                am = 0;
                if (ao == 1) {
                    if (K == 0) {
                        h(6 + bP);
                    }
                    aw = 2500;
                    j.e(bP);
                    j.f110a = 2000;
                    K++;
                } else if (ao == 3) {
                    h(4);
                    j.e(7);
                    J++;
                }
                m142h(2);
                m142h(7);
                if (an == 2) {
                    a(74, 0, 0);
                    return;
                }
                return;
            case 5:
                switch (am) {
                    case 1:
                        al = (al + 1) % bI;
                        m142h(5);
                        m142h(13);
                        if (m == 3) {
                            int i122 = bg + 1;
                            bg = i122;
                            if (i122 > bf) {
                                bf = bg;
                                bh += bl;
                                bn += bl;
                                a(84, V, bl);
                            }
                        }
                        break;
                    case 2:
                        if (m == 3 && bg == 1) {
                            bg--;
                        }
                        al = (al - 1) % bI;
                        break;
                    case 3:
                        al = bK;
                        b(true);
                        break;
                    case 4:
                        bK = al;
                        al = bI;
                        b(true);
                        break;
                }
                a(al, am == 3);
                a(false, ao == 1, false);
                if (m != 2 && (am == 1 || am == 2)) {
                    if (m == 1 && t < (i3 = f + al)) {
                        t = i3;
                    }
                    aX = aV;
                    aV = 1;
                }
                f380a[0][5] = f410h[al][4] + (A << 4);
                if (an != 2) {
                    f380a[1][1] = 0;
                }
                U = 4;
                V = Math.max(1, V - i2);
                W = 0;
                return;
            case 6:
            case 10:
            case 13:
            default:
                return;
            case 7:
                if (f383t) {
                    a(true, false, true);
                }
                if (W == V) {
                    U = 3;
                    return;
                }
                return;
            case 8:
                if (W == V) {
                    if (m != 2) {
                        y.a().d();
                        if (m == 1) {
                            U = 1;
                        } else if (m == 3) {
                            U = 2;
                            V = 1000;
                            W = 0;
                        } else {
                            am = 1;
                            U = 2;
                            V = 1000;
                            W = 0;
                        }
                        f365e = true;
                    } else {
                        U = 1;
                        f365e = true;
                    }
                    m122a();
                    return;
                }
                return;
            case 9:
                if (W == V) {
                    if (m != 2) {
                        y.a().d();
                    }
                    U = 1;
                    f364d = true;
                    S = 5;
                    return;
                }
                return;
            case 11:
                if (W == V) {
                    U = aS;
                    V = aT;
                    W = 0;
                    aS = 4;
                    aT = 0;
                    p();
                    return;
                }
                return;
            case 12:
                g(i2);
                if (W == V) {
                    ad = 0;
                    U = 11;
                    V = 800;
                    W = 0;
                    am = 3;
                    aS = 5;
                    aT = 250;
                    return;
                }
                return;
            case 14:
                int i123 = f352h + i2;
                f352h = i123;
                if (i123 > 1000) {
                    r();
                    for (int i124 = 0; i124 < 3; i124++) {
                        f381b[i124][16] = -1;
                        f381b[i124][5] = (A << 4) - A;
                        f381b[i124][7] = -Math.abs(f381b[0][7]);
                    }
                    am = 1;
                    U = 5;
                    V = 0;
                    W = 0;
                    f352h = 0;
                    d(1);
                    return;
                }
                return;
            case 15:
                int i125 = f352h + i2;
                f352h = i125;
                if (i125 > 1000) {
                    for (int i126 = 0; i126 < 3; i126++) {
                        f381b[i126][16] = -1;
                        f381b[i126][5] = A;
                        f381b[i126][7] = Math.abs(f381b[0][7]);
                    }
                    r();
                    am = 2;
                    U = 5;
                    V = 1000;
                    W = 0;
                    f352h = 0;
                    d(1);
                    return;
                }
                return;
            case 16:
                int i127 = f352h + i2;
                f352h = i127;
                if (i127 > 1000) {
                    f352h = 0;
                    am = 4;
                    aS = 5;
                    U = 5;
                    aT = 1000;
                    V = 1000;
                    W = 0;
                    h(3);
                    return;
                }
                return;
            case 17:
                int i128 = f352h + i2;
                f352h = i128;
                if (i128 > 1000) {
                    am = 3;
                    U = 5;
                    V = 250;
                    W = 0;
                    f352h = 0;
                    return;
                }
                return;
        }
        n();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    private static void m() {
        switch (m) {
            case 1:
                aZ = 1;
                break;
            case 2:
                aZ = 1;
                break;
            case 3:
                aZ = 2;
                break;
        }
        if (m == 1) {
            int i2 = 0;
            while (i2 < f369g.length && P > f369g[i2]) {
                i2++;
            }
            n = Math.min(i2 + 1, 4);
            if (t < 0) {
                t = 0;
            }
        }
        int i3 = 0;
        if (m != 2) {
            switch (m) {
                case 1:
                    if (n == 1) {
                        i3 = 12;
                    } else if (n != 2) {
                        i3 = n != 3 ? 16 : 14;
                    } else {
                        i3 = 13;
                    }
                    break;
                case 3:
                    if (n == 1) {
                        i3 = 13;
                    } else if (n != 2) {
                        i3 = 15;
                    } else {
                        i3 = 14;
                    }
                    break;
            }
        } else {
            i3 = 15;
        }
        aW = ((i3 * aF) * 100) / 100;
        v();
        u();
        ae = 0;
        by = 0;
        x();
        f403g = false;
        f404x = false;
        bA = 0;
        A();
        f373p = false;
        f374q = false;
        af = 0;
        j = 0;
        k = 0;
        ax = 0;
        f353a = 0.0f;
        ag = 0;
        bF = 0;
        aM = 0;
        aj = 0;
        ak = 0;
        ah = 0;
        f375r = false;
        bD = 0;
        f405y = false;
        z();
        y();
        bC = 1;
        bB = 0;
        w();
        at = 0;
        au = 0;
        f360i = false;
        f354b = false;
        b(true);
        f420a.removeAllElements();
        if (m != 2) {
            y.a().b();
        }
        aS = 4;
        aT = 0;
        am = 0;
        switch (n) {
            case 1:
                ab = 400;
                bi = 4;
                bj = 3;
                bk = 40;
                bm = 60;
                bl = 40;
                break;
            case 2:
                ab = 400;
                bi = 4;
                bj = 3;
                bk = 40;
                bm = 60;
                bl = 40;
                break;
            case 3:
                ab = 560;
                bi = 4;
                bj = 3;
                bk = 60;
                bm = 80;
                bl = 40;
                break;
            case 4:
                ab = 600;
                bi = 4;
                bj = 3;
                bk = 60;
                bm = 100;
                bl = 40;
                break;
        }
        bn = 0;
    }

    public static final void e() {
        az = 1;
    }

    private static final void e(int i2) {
        if (m == 1) {
            P = Math.max(0, Math.min(aH, i2));
        }
    }

    private static void n() {
        f364d = false;
        f365e = false;
        h = false;
        bf = 0;
        bg = 0;
        aX = 0;
        f399w = false;
        if (m != 2) {
            boolean z2 = m != 3;
            boolean z3 = z2;
            int i2 = z2 ? 4 : 5;
            int iA = 0;
            if (z3) {
                iA = d(4, aY);
            }
            int iM119a = y.a().m119a();
            int iAbs = m == 3 ? -1 : Math.abs(f362a.nextInt()) % i2;
            int i3 = 0;
            while (i3 < i2) {
                iA += y.a().a(i3, iA, iM119a, i3 == iAbs);
                i3++;
            }
            int i4 = 0;
            switch (n) {
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
            a(t.m93a(65543), i4 + (Math.abs(f362a.nextInt()) % 15), 5, iA, 3);
            j.f158h = (f / 5) % f472j.length;
            bI = 5;
            aI = 100000;
            f370n = false;
            f371o = false;
        }
        if (m == 1 && t < f) {
            t = f;
        }
        a(0, false);
        b(true);
        a(30, 0, 0);
        U = 3;
        V = 0;
        W = 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m122a() {
        aJ = 65540;
        R = -1;
        return aJ;
    }

    private static void o() {
        m142h(0);
        m142h(10);
        m142h(14);
        d();
        aV = 8;
        am = 0;
        a(al, false);
        b(false);
        U = 4;
        V = 0;
        a(31, 0, 0);
        if (an == 2) {
            s();
            a(74, 0, 0);
        }
        t();
    }

    public static final void f() {
        int i2 = -1;
        switch (m) {
            case 1:
                if (x == 0) {
                    i2 = 1;
                }
                break;
            case 2:
                if (v == 0) {
                    i2 = 0;
                }
                break;
            case 3:
                i2 = 5;
                break;
        }
        if (i2 != -1) {
            h(i2);
        }
    }

    public static final int b(int i2) {
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < i2 + 1; i5++) {
            int i6 = 9999;
            for (int i7 = 0; i7 < f384j.length; i7++) {
                int i8 = f384j[i7];
                if (!f392c[i7] || !j.m48a(i7)) {
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

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static final int m123b() {
        int i2 = 0;
        for (int i3 = 0; i3 < f385a.length; i3++) {
            if (f392c[f385a[i3]]) {
                i2++;
            }
        }
        return i2;
    }

    private static final void p() {
        switch (az) {
            case 0:
                return;
            case 1:
                if (m == 2) {
                    m139b(o);
                    a(t.m98e(), t.a());
                    u = X;
                    v = Y;
                    DCWall3D.b();
                }
                break;
        }
        az = 0;
        t();
    }

    private static void f(int i2) {
        boolean z2 = false;
        int i3 = f381b[i2][23];
        int i4 = i3 & 65535;
        int i5 = (i3 >> 16) & 65535;
        if (U == 14 || U == 15 || U == 16 || U == 17) {
            return;
        }
        if (i4 == 3) {
            j.h(2);
        } else if (i4 == 4) {
            j.h(3);
        } else if (i4 == 1) {
            j.h(0);
        } else if (i4 == 2) {
            j.h(1);
        }
        if (an == 2) {
            if (i4 == 3 || i4 == 4) {
                if (!(al == 0 && i4 == 4) && (al < bI - 1 || i4 != 3)) {
                    if (i4 != 3) {
                        int i6 = 0;
                        for (int i7 = 0; i7 < 3; i7++) {
                            if (f381b[i7][1] != 0) {
                                i6++;
                            }
                        }
                        if (i6 > 1) {
                            f381b[i2][1] = 0;
                            return;
                        }
                        f352h = 0;
                        U = 15;
                        j.f159i = 1000;
                        f370n = true;
                        return;
                    }
                    f352h = 0;
                    for (int i8 = 0; i8 < 3; i8++) {
                        if (i8 != i2) {
                            f381b[i8][1] = 0;
                        }
                    }
                    U = 14;
                    j.f159i = 1000;
                    if (!f370n) {
                        e(P + 2);
                    }
                    f370n = false;
                    if (m == 3 && al == 1) {
                        m140c(1, 0);
                        m140c(2, 1);
                        m140c(3, 2);
                        m140c(4, 3);
                        int i9 = 37500;
                        int i10 = i / 1000;
                        if (i10 > 300) {
                            n = 4;
                            i9 = 90000;
                        } else if (i10 > 200) {
                            n = 3;
                            i9 = 67500;
                        } else if (i10 > 100) {
                            n = 2;
                            i9 = 50000;
                        }
                        y.a().b(i9, 4, 480, false);
                        al--;
                        return;
                    }
                    return;
                }
                if (al == 0 && i4 == 4) {
                    f381b[i2][1] = 0;
                    z2 = true;
                    for (int i11 = 0; i11 < 3; i11++) {
                        if (f381b[i11][1] != 0) {
                            z2 = false;
                        }
                    }
                } else if (m == 3 && al == bI - 1) {
                    U = 11;
                    V = 500;
                    W = 0;
                    aS = 8;
                    aT = 0;
                }
            }
        } else if (an == 1 && i4 == 4) {
            f381b[i2][1] = 0;
            z2 = true;
            for (int i12 = 0; i12 < 3; i12++) {
                if (f381b[i12][1] != 0) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            q();
            return;
        }
        if (i4 > 4) {
            if (c(f411a[i5]) == 2 && j > 0) {
                j = 1000;
                return;
            }
            Object[] objArr = f411a[i5];
            if (af > 0) {
                int iC = c(((int[]) objArr[1])[1] - 1, ((int[]) objArr[1])[2]);
                if (iC >= 5) {
                    m126a(i4, (iC >> 16) & 65535, 0, false);
                }
                int iC2 = c(((int[]) objArr[1])[1] + i(objArr), ((int[]) objArr[1])[2]);
                if (iC2 >= 5) {
                    m126a(i4, (iC2 >> 16) & 65535, 0, false);
                }
                int iC3 = c(((int[]) objArr[1])[1], ((int[]) objArr[1])[2] - 1);
                if (iC3 >= 5) {
                    m126a(i4, (iC3 >> 16) & 65535, 0, false);
                }
                int iC4 = c(((int[]) objArr[1])[1], ((int[]) objArr[1])[2] + j(objArr));
                if (iC4 >= 5) {
                    m126a(i4, (iC4 >> 16) & 65535, 0, false);
                }
            }
            m126a(i4, i5, 0, false);
        }
    }

    private static void q() {
        G++;
        bd = 1;
        be = -1;
        f370n = true;
        f371o = true;
        int i2 = -2;
        if (aI < 6000) {
            i2 = (-2) - 15;
        } else if (aI < 15000) {
            i2 = (-2) - 10;
        }
        e(P + i2);
        aI = 0;
        if (ao == 3) {
            U = 17;
            f352h = 0;
            f381b[0][1] = 0;
            return;
        }
        at = 0;
        au = 0;
        if (m == 2 || m == 1) {
            int iMax = Math.max(X - 1, 0);
            X = iMax;
            if (iMax <= 0) {
                U = 9;
                V = 550;
                W = 0;
            } else {
                U = 7;
                V = 1000;
                W = 0;
            }
        } else if (m == 3) {
            bh -= bm;
            if (Math.max(0, ab + bh) == 0) {
                U = 9;
                V = 2000;
                W = 0;
            } else {
                U = 7;
                V = 1000;
                W = 0;
            }
            a(85, V, bm);
        }
        if (m == 1) {
            w = X;
            x = Y;
            y = Z;
        } else if (m == 2) {
            u = X;
            v = Y;
            if (X <= 0) {
                DCWall3D.f8a--;
                v = 0;
                u = 5;
            }
        }
        for (int i3 = 1; i3 < 2; i3++) {
            f380a[i3][1] = 0;
        }
        for (int i4 = 0; i4 < 3; i4++) {
            f381b[i4][1] = 0;
        }
        a(33, 0, 0);
        if (m == 2 || ao != 0) {
            return;
        }
        y.a().c();
    }

    private static void a(int i2, int i3, int i4, boolean z2) {
        for (int i5 = -i4; i5 <= i4; i5++) {
            for (int i6 = -i4; i6 <= i4; i6++) {
                int iM134b = m134b(i6 + i2, i5 + i3);
                int i7 = iM134b & 65535;
                if (i7 > 4) {
                    int iAbs = Math.abs(i6) + Math.abs(i5);
                    int i8 = (iM134b >> 16) & 65535;
                    Object[] objArr = f411a[i8];
                    boolean z3 = c(objArr) != 2;
                    if (iAbs != 0 && ao != 1) {
                        h(objArr, 1);
                        g(objArr, 0);
                        f411a[i8] = objArr;
                    } else if (z3) {
                        m126a(i7, i8, 1, false);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static final int m124c(int i2) {
        return f400n[i2][0] + (((m137f(s >> 2) * 195) * 3) >> 12);
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static final int m125d(int i2) {
        return f400n[i2][1] + (((m138g(s >> 2) * 195) * 3) >> 12);
    }

    /* JADX WARN: Code duplicated, block: B:149:0x042a  */
    /* JADX WARN: Code duplicated, block: B:152:0x044b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0480 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m126a(int i2, int i3, int i4, boolean z2) {
        char c2;
        int i5;
        boolean z3 = false;
        if (i2 > 4) {
            char c3 = 2;
            Object[] objArr = f411a[i3];
            int iC = c(objArr);
            if (aj > 0) {
                c2 = 2;
            } else if (ah <= 0 || !m150a(objArr) || iC == 2 || f375r) {
                if (m150a(objArr)) {
                    int iE = e(objArr);
                    if (ak > 0) {
                        iE = 0;
                    }
                    if (((boolean[]) objArr[0])[0] && i4 == 0) {
                        iC = a(objArr) >= b ? 2 : c(objArr);
                    }
                    if ((iE == 0 && (ak > 0 || iC != 2)) || z2) {
                        if (bJ > 0 && (iC != 2 || (ak > 0 && ((boolean[]) objArr[0])[0]))) {
                            int[] iArr = f410h[al];
                            iArr[2] = iArr[2] - 1;
                            bJ--;
                        }
                        m151d(f411a[i3]);
                        c3 = 0;
                    } else if (iE != 0 && iC != 2) {
                        d(f411a[i3], iE - 1);
                        c3 = 1;
                    }
                }
                c2 = c3;
            } else {
                if (f412b[i3] != 1) {
                    f412b[i3] = 1;
                    int iC2 = c(((int[]) objArr[1])[1] - 1, ((int[]) objArr[1])[2]);
                    if (iC2 >= 5) {
                        int i6 = (iC2 >> 16) & 65535;
                        if (m(i6) != 2) {
                            f412b[i6] = 1;
                        }
                    }
                    int iC3 = c(((int[]) objArr[1])[1] + i(objArr), ((int[]) objArr[1])[2]);
                    if (iC3 >= 5) {
                        int i7 = (iC3 >> 16) & 65535;
                        if (m(i7) != 2) {
                            f412b[i7] = 1;
                        }
                    }
                    int iC4 = c(((int[]) objArr[1])[1], ((int[]) objArr[1])[2] - 1);
                    if (iC4 >= 5) {
                        int i8 = (iC4 >> 16) & 65535;
                        if (m(i8) != 2) {
                            f412b[i8] = 1;
                        }
                    }
                    int iC5 = c(((int[]) objArr[1])[1], ((int[]) objArr[1])[2] + j(objArr));
                    if (iC5 >= 5) {
                        int i9 = (iC5 >> 16) & 65535;
                        if (m(i9) != 2) {
                            f412b[i9] = 1;
                        }
                    }
                } else {
                    f375r = true;
                    int i10 = f410h[al][1];
                    int i11 = f410h[al][7];
                    for (int i12 = i11; i12 < i11 + i10; i12++) {
                        if (f412b[i12] == 1) {
                            m126a(5, i12, 4, true);
                        }
                    }
                    f375r = false;
                    C();
                }
                c2 = 2;
            }
            char c4 = c2;
            int iC6 = c(f411a[i3]);
            z3 = c4 == 0;
            if (c4 == 0) {
                Object[] objArr2 = f411a[i3];
                if (m != 2 && ao == 0) {
                    y.a().a(f410h[al][5], b(objArr2), c(objArr2), f(objArr2), g(objArr2));
                }
                a(34, i3, i4);
                if (ao == 1) {
                    switch (bP) {
                        case 0:
                        case 2:
                        case 3:
                        case 4:
                            Object[] objArr3 = f411a[i3];
                            if (c(objArr3) == 3 && d(objArr3) == 2) {
                                bS--;
                            }
                            break;
                        case 1:
                        case 5:
                            Object[] objArr4 = f411a[i3];
                            if (c(objArr4) == 3 && d(objArr4) == 2 && i3 < bU) {
                                bS--;
                            }
                            if (bS > 0) {
                                for (int i13 = bU; i13 < bQ; i13++) {
                                    if (i3 == i13) {
                                        int i14 = (i13 - bU) / bT;
                                        if (f425a[i14].f261a) {
                                            if (d(f411a[i13]) == 2) {
                                                f425a[i14].f261a = false;
                                                for (int i15 = 0; i15 < bT; i15++) {
                                                    if (i15 != i3) {
                                                        int i16 = bU + (i14 * bT) + i15;
                                                        if (m150a(f411a[i16])) {
                                                            m126a(5, i16, 5, true);
                                                        }
                                                    }
                                                }
                                            }
                                            boolean z4 = true;
                                            for (int i17 = 0; i17 < bT; i17++) {
                                                if (m150a(f411a[bU + (i14 * bT) + i17])) {
                                                    z4 = false;
                                                    if (z4) {
                                                        f425a[i14].f261a = false;
                                                        int iM135d = m135d() % bS;
                                                        int i18 = 0;
                                                        for (i5 = 0; i5 < bU; i5++) {
                                                            if (!m150a(f411a[i5]) && d(f411a[i5]) == 2) {
                                                                int i19 = i18;
                                                                i18++;
                                                                if (i19 == iM135d) {
                                                                    m126a(5, i5, 5, true);
                                                                }
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (z4) {
                                                f425a[i14].f261a = false;
                                                int iM135d2 = m135d() % bS;
                                                int i110 = 0;
                                                while (i5 < bU) {
                                                    if (!m150a(f411a[i5])) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 6:
                            Object[] objArr5 = f411a[i3];
                            if (c(objArr5) == 3 && d(objArr5) == 2) {
                                bS--;
                            }
                            if (c(objArr5) == 5) {
                                f426s[i3] = 15000;
                            }
                            break;
                    }
                }
                if (Math.abs(f362a.nextInt() % 101) < 65 && f410h[al][2] > 1) {
                    b(b(al, ((int[]) objArr2[1])[1], true), b(al, ((int[]) objArr2[1])[2], false), -1);
                }
                au = 0;
                int i20 = 0;
                int iC7 = c(objArr2);
                if (aj > 0) {
                    iC7 = 2;
                }
                if (ak > 0) {
                    iC7 = 3;
                }
                char c5 = 0;
                switch (n) {
                    case 1:
                        c5 = 0;
                        break;
                    case 2:
                        c5 = 1;
                        break;
                    case 3:
                        c5 = 2;
                        break;
                    case 4:
                        c5 = 3;
                        break;
                }
                int i21 = f379k[iC7][c5];
                switch (iC7) {
                    case 2:
                        i20 = 1000;
                        F++;
                        m142h(12);
                        break;
                    case 3:
                        i20 = 100;
                        C++;
                        m142h(9);
                        break;
                    case 4:
                        i20 = 200;
                        D++;
                        m142h(8);
                        break;
                    case 5:
                        i20 = 300;
                        E++;
                        m142h(11);
                        break;
                }
                if (m == 2) {
                    i21 = i20;
                }
                if (i4 == 0) {
                    int iD = d(objArr2);
                    if (iD == be || iC6 == 1) {
                        int i22 = bd + 1;
                        bd = i22;
                        bd = Math.min(i22, 20);
                        if (m != 3) {
                            a(35, bd, i3);
                        }
                        if (m == 3 && bd >= bj) {
                            bh += bi;
                            bn += bi;
                        }
                    } else {
                        be = iD;
                        bd = 1;
                    }
                    i21 *= bd;
                }
                if (iC7 == 2 || iC7 == 3 || iC7 == 4 || iC7 == 5) {
                    Z++;
                }
                c(bC * i21);
                if (m != 2) {
                    m142h(7);
                } else {
                    m142h(1);
                }
                if (m != 2) {
                    if (c(f411a[i3]) == 1) {
                        f408B = true;
                        s();
                        an = 2;
                        h(2);
                    } else if (c(f411a[i3]) == 6 && i4 != 3) {
                        U = 16;
                    }
                    if (ao == 1) {
                        if (m146b() && U != 11) {
                            int i23 = f410h[al][7];
                            int i24 = f410h[al][1];
                            H++;
                            c(10000);
                            U = 11;
                            V = 800;
                            W = 0;
                            aS = 8;
                            aT = 1000;
                            m142h(4);
                            int i25 = f371o ? 0 : 0 + 15;
                            if (!f370n) {
                                i25 += 10;
                            }
                            if (X > 2) {
                                i25 += 10;
                            }
                            if (X < 2) {
                                i25 -= 20;
                            }
                            e(P + i25);
                            for (int i26 = i23; i26 < i23 + i24; i26++) {
                                if (m150a(f411a[i26])) {
                                    m126a(5, i26, 5, true);
                                }
                            }
                        }
                    } else if (ao == 3 && bJ == 0) {
                        c(7500);
                        L++;
                        X++;
                        U = 12;
                        V = Math.max(0, ad);
                        W = 0;
                    } else if (bJ == 0 && iC7 != 2 && U != 16) {
                        c(5000);
                        e(P + 4);
                        U = 11;
                        V = 800;
                        W = 0;
                        if (am != 4) {
                            aS = 4;
                            aT = 0;
                        }
                        if (m == 3) {
                            bh += bk;
                            a(83, V, bk);
                        }
                    }
                } else {
                    boolean z5 = false;
                    if (ao == 1) {
                        if (m146b() && U != 11) {
                            int i27 = f410h[al][7];
                            int i28 = f410h[al][1];
                            for (int i29 = i27; i29 < i27 + i28; i29++) {
                                if (m150a(f411a[i29])) {
                                    m126a(5, i29, 5, true);
                                }
                            }
                            z5 = true;
                        }
                    } else if (bJ == 0) {
                        z5 = true;
                    }
                    if (z5) {
                        U = 11;
                        V = 500;
                        W = 0;
                        aS = 8;
                        aT = 1000;
                    }
                }
            } else if (c4 == 1) {
                a(37, i3, i4);
            }
        }
        return z3;
    }

    private static void a(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            w();
        }
        for (int i2 = 0; i2 < 31; i2++) {
            for (int i3 = 0; i3 < 1; i3++) {
                int i4 = i2;
                switch (i4) {
                    case 0:
                        bD = 0;
                        f405y = false;
                        aV = 8;
                        break;
                    case 1:
                        aV = 8;
                        break;
                    case 3:
                        f403g = false;
                        aM = 0;
                        break;
                    case 4:
                        v();
                        break;
                    case 5:
                        u();
                        break;
                    case 6:
                        z();
                        break;
                    case 7:
                        if (z3) {
                            bw = 0;
                        }
                        break;
                    case 8:
                        if (z3) {
                            ah = 0;
                            f375r = false;
                        }
                        break;
                    case 9:
                        if (z3) {
                            ag = 0;
                        }
                        break;
                    case 10:
                        x();
                        break;
                    case 11:
                        ae = 0;
                        by = 0;
                        break;
                    case 12:
                        boolean z5 = f393v;
                        y();
                        if (z5) {
                            br = 35;
                        }
                        break;
                    case 13:
                        bA = 0;
                        f404x = false;
                        break;
                    case 16:
                    case 17:
                        A();
                        break;
                }
                if (z2) {
                    switch (i4) {
                        case 0:
                            bD = 0;
                            f405y = false;
                            aV = 8;
                            break;
                        case 1:
                            bE = 0;
                            break;
                        case 4:
                            bs = 0;
                            break;
                        case 8:
                            ah = 0;
                            f375r = false;
                        case 7:
                            bw = 0;
                            break;
                        case 9:
                            ag = 0;
                            break;
                        case 14:
                        case 15:
                            bC = 1;
                            bB = 0;
                            break;
                        case 16:
                            bF = 0;
                            f373p = false;
                            break;
                        case 17:
                            bF = 0;
                            f374q = false;
                            break;
                        case 19:
                            bG = 0;
                            break;
                        case 21:
                            j = 0;
                            break;
                        case 22:
                            k = 0;
                            break;
                        case 23:
                            ax = 0;
                            break;
                        case 24:
                            af = 0;
                            break;
                        case 25:
                            ai = 0;
                            break;
                        case 26:
                            j.f140f = -1;
                            break;
                        case 27:
                            aj = 0;
                            break;
                        case 28:
                            bH = 0;
                            break;
                        case 29:
                            ak = 0;
                            break;
                    }
                }
            }
        }
        ba = 0;
    }

    private static void r() {
        for (int i2 = 0; i2 < aZ; i2++) {
            f382c[i2][1] = 0;
        }
    }

    private static void b(int i2, int i3, int i4) {
        for (int i5 = 0; i5 < aZ; i5++) {
            int iA = i4 >= 0 ? i4 : a(true);
            if (iA == 28 && (f408B || m == 2 || ao == 3)) {
                return;
            }
            if ((iA == 29 || iA == 20) && !f376s) {
                return;
            }
            if (f382c[i5][1] == 0) {
                a(f382c[i5], 4098, 1, iA, Math.min(Math.max(i2, 330), (20 * z) - 330), i3, 0, ((3 * A) * 100) / 100, 0, 165, 330);
                return;
            }
        }
    }

    private static final int a(boolean z2) {
        int i2;
        int[] iArr;
        if (d < 2) {
            if (d == 0) {
                d++;
                return 12;
            }
            if (al >= 1) {
                d++;
                return 9;
            }
        }
        int i3 = 0;
        do {
            if (m == 2 || ao == 1) {
                if (ao == 1) {
                    i2 = bM;
                    iArr = f414p;
                } else {
                    i2 = bL;
                    iArr = f413o;
                }
                if (!z2) {
                    while (true) {
                        int iAbs = Math.abs(f362a.nextInt()) % f386e.length;
                        i3 = iAbs;
                        if (m127b(iAbs) && f386e[i3]) {
                            break;
                        }
                    }
                } else {
                    i3 = iArr[Math.abs(f362a.nextInt()) % i2];
                }
            } else {
                int i4 = 0;
                int iAbs2 = Math.abs(f362a.nextInt() % bo);
                int i5 = n - 1;
                for (int i6 = 0; i6 < f387l.length; i6++) {
                    i4 += f387l[i6][i5];
                    if (iAbs2 < i4 && m127b(i6) && f387l[i6][i5] > 0) {
                        i3 = i6;
                        break;
                    }
                }
            }
            if (z2) {
                break;
            }
        } while (i3 == 20);
        return i3;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static boolean m127b(int i2) {
        if (m == 3 && (i2 == 18 || i2 == 19 || i2 == 14 || i2 == 15)) {
            return false;
        }
        if (ao == 1) {
            return (i2 == 13 || i2 == 7 || i2 == 8) ? false : true;
        }
        return true;
    }

    private static void s() {
        a(f380a[1], 4096, 1, 0, f380a[0][4], f410h[al][4] + A, f380a[0][6], 0, f380a[0][13], f380a[0][14], f380a[0][15]);
    }

    private static void b(boolean z2) {
        a(f380a[0], 4096, 1, 0, ((z * 20) - 1380) / 2, A << 4, aO, 0, 0, 1380, 330);
        a(f380a[1], 4096, 0, 0, f380a[0][4], A, f380a[0][6], 0, 0, 1380, 330);
        int i2 = 0;
        while (i2 < 3) {
            a(f381b[i2], 4097, i2 == 0 ? 18 : 0, 0, f380a[0][4] + (f380a[0][14] / 2), (A << 4) - (A / 4), 0, 0, 195, 390, 390);
            f401d[i2] = false;
            i2++;
        }
        if (f392c[11]) {
            f401d[0] = true;
        }
        if (z2) {
            for (int i3 = 0; i3 < T; i3++) {
                a(f382c[i3], 4098, 0, 0, 0, 0, 0, 0, 0, 165, 330);
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final boolean m128a() {
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (f381b[i3][1] != 0) {
                i2++;
            }
        }
        int i4 = al;
        int i5 = f410h[i4][1];
        int i6 = f410h[i4][7];
        int i7 = 0;
        for (int i8 = i6; i8 < i6 + i5; i8++) {
            Object[] objArr = f411a[i8];
            if (m150a(objArr) && c(objArr) != 2) {
                f351a = objArr;
                i7++;
            }
        }
        return (i7 == 1) && i2 == 1 && j.a(true) - j.a(false) > 0.0f;
    }

    public static int a(Object[] objArr) {
        int i2 = ar + ((int[]) objArr[1])[3];
        if (!((boolean[]) objArr[0])[1]) {
            return i2 % (b + c);
        }
        int i3 = 2 * (b + c);
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

    private static void t() {
        h.f92a.m38a();
        System.currentTimeMillis();
    }

    private static void a(int[] iArr, int i2, int i3) {
        if (iArr[1] != 0) {
            switch (iArr[0]) {
                case 4096:
                    iArr[9] = iArr[4];
                    if (i2 != 0) {
                        iArr[4] = f380a[0][4];
                        iArr[6] = f380a[0][6];
                        break;
                    } else {
                        boolean z2 = bG > 0;
                        boolean z3 = z2;
                        boolean z4 = z2 ? f367l : f366k;
                        boolean z5 = z3 ? f366k : f367l;
                        switch (iArr[1]) {
                            case 1:
                                if (z4 && iArr[6] > 0) {
                                    aU = -aQ;
                                    iArr[6] = -aP;
                                }
                                if (z5 && iArr[6] < 0) {
                                    aU = aQ;
                                    iArr[6] = aP;
                                }
                                if (z4 || z5) {
                                    int i4 = (iArr[6] * i3) >> 10;
                                    boolean zA = a(true, true, 0);
                                    boolean zA2 = a(true, false, 0);
                                    boolean zA3 = a(false, true, 0);
                                    boolean zA4 = a(false, false, 0);
                                    boolean zA5 = a(iArr, false, i4, false, true);
                                    boolean zA6 = a(iArr, false, i4, false, false);
                                    boolean z6 = f380a[1][1] == 1;
                                    if ((iArr[6] < 0 && !(zA5 && ((z6 || zA3) && (zA || zA3)))) || (iArr[6] > 0 && !(zA6 && ((z6 || zA4) && (zA2 || zA4))))) {
                                        iArr[4] = iArr[4] + i4;
                                        iArr[6] = iArr[6] + ((aU * i3) >> 10);
                                    } else if (iArr[6] < 0 && zA5 && ((z6 && zA) || zA3)) {
                                        iArr[4] = 420;
                                    } else if (iArr[6] > 0 && zA6 && ((z6 && zA2) || zA4)) {
                                        iArr[4] = (((20 * z) - iArr[14]) - 390) - 30;
                                    }
                                } else {
                                    iArr[6] = (iArr[6] > 0 ? 1 : -1) * aP;
                                }
                                int i5 = iArr[14] / 2;
                                int i6 = iArr[14] / 2;
                                for (int i7 = 0; i7 < 3; i7++) {
                                    if (f381b[i7][1] == 18 || f381b[i7][1] == 17) {
                                        ba = 0;
                                    }
                                }
                                if (iArr[4] < (-i5)) {
                                    iArr[4] = -i5;
                                } else if (iArr[4] > (z * 20) - i6) {
                                    iArr[4] = (z * 20) - i6;
                                }
                                if (Math.abs(iArr[6]) > aO) {
                                    iArr[6] = (iArr[6] > 0 ? 1 : -1) * aO;
                                }
                                break;
                            case 2:
                                if (iArr[3] > 100) {
                                    iArr[1] = 1;
                                    iArr[6] = (iArr[6] > 0 ? 1 : -1) * aP;
                                } else {
                                    iArr[3] = iArr[3] + i3;
                                }
                                break;
                        }
                    }
                    break;
                case 4097:
                    if (m128a()) {
                        i3 = (int) (i3 * (1.0f - (j.a(true) * 0.8f)));
                    }
                    int i8 = i3;
                    switch (iArr[1]) {
                        case 16:
                            if (iArr[16] != -1) {
                                int i9 = iArr[23];
                                int i10 = i9 & 65535;
                                int i11 = (i9 >> 16) & 65535;
                                int iC = 0;
                                if (i9 != 4096 && i10 > 4) {
                                    iC = c(f411a[i11]);
                                }
                                if (i9 != 4096) {
                                    if (bw == 1) {
                                        int iC2 = i11 == -1 ? 0 : c(f411a[i11]);
                                        int i12 = iC2;
                                        if (iC2 != 1 && i12 != 6 && i12 != 2 && i10 > 4) {
                                            bx = i11;
                                            bw = 2;
                                        }
                                    }
                                    if (iC != 2 && iC != 0) {
                                        ba = 0;
                                    }
                                } else if (f403g) {
                                    if (f380a[f381b[i2][5] <= (A << 2) ? 1 : 0][1] != 2) {
                                        f381b[i2][1] = 17;
                                    }
                                }
                                if (i9 == 4096) {
                                    iArr[6] = (((aW * aV) * iArr[19]) >> 3) / aF;
                                    iArr[7] = (((aW * aV) * iArr[20]) >> 3) / aF;
                                    iArr[9] = (iArr[17] + iArr[21]) - f380a[0][9];
                                } else if (ag == 0 || i10 < 5 || iC == 2) {
                                    int iA = a(iArr[6], iArr[7], iArr[19], iArr[20]);
                                    int iA2 = a(iArr[6], iArr[7], -iArr[20], iArr[19]);
                                    iArr[6] = (((-iA2) * iArr[20]) - (iA * iArr[19])) / aF;
                                    iArr[7] = ((iA2 * iArr[19]) - (iA * iArr[20])) / aF;
                                }
                                iArr[4] = iArr[17] + iArr[21];
                                iArr[5] = iArr[18] + iArr[22];
                            } else {
                                int i13 = iArr[6];
                                int i14 = iArr[7];
                                if (ad > 0) {
                                    i13 = 0;
                                    i14 = 0;
                                } else if (aw > 0) {
                                    i13 >>= 2;
                                    i14 >>= 2;
                                }
                                iArr[4] = iArr[4] + ((i13 * i8) >> 10);
                                iArr[5] = iArr[5] + ((i14 * i8) >> 10);
                            }
                            break;
                        case 17:
                            if (f368m || iArr[2] == 1) {
                                iArr[1] = 16;
                            }
                            iArr[4] = f380a[0][4] + iArr[9];
                            int i15 = iArr[13] + (iArr[13] >> 1);
                            if (iArr[4] <= i15) {
                                iArr[4] = i15;
                            }
                            if (iArr[4] >= (z * 20) - i15) {
                                iArr[4] = (z * 20) - i15;
                            }
                            if (iArr[5] > (A << 2)) {
                                iArr[5] = (A << 4) - (A >> 2);
                            } else {
                                iArr[5] = 330 + A + (A >> 2);
                            }
                            break;
                        case 18:
                            if (f368m) {
                                iArr[1] = 16;
                                int iAbs = ((Math.abs(f362a.nextInt()) % 199) / 8) + 128;
                                int iM137f = (m137f(iAbs == 128 ? 127 : iAbs) << 4) >> 8;
                                int iM138g = (m138g(iAbs == 128 ? 127 : iAbs) << 4) >> 8;
                                iArr[7] = (((-aW) * aV) * iM137f) >> 11;
                                iArr[6] = ((aW * aV) * iM138g) >> 11;
                            }
                            iArr[4] = f380a[0][4] + (2 * z);
                            int i16 = iArr[13] + (iArr[13] >> 1);
                            if (iArr[4] <= i16) {
                                iArr[4] = i16;
                            }
                            if (iArr[4] >= (z * 20) - i16) {
                                iArr[4] = (z * 20) - i16;
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
            boolean z5 = (z2 && f381b[i3][7] < 0) || (!z2 && f381b[i3][7] > 0);
            if (f381b[i3][1] != 18 && f381b[i3][1] != 17 && z5 && a(f381b[i3], true, 0, z2, z3)) {
                z4 = true;
                break;
            }
        }
        return z4;
    }

    private static boolean a(int[] iArr, boolean z2, int i2, boolean z3, boolean z4) {
        return a(iArr, z2, i2, z4 ? -aO : ((20 * z) - 195) - 30, z3 ? f380a[1][5] : f380a[0][5], bq, 330);
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
            f388m[i7][0] = -1;
        }
        if (iArr[6] != 0 || iArr[7] != 0) {
            int iL = l((iArr[6] * iArr[6]) + (iArr[7] * iArr[7]));
            int i8 = (iArr[13] * iArr[6]) / iL;
            int i9 = (iArr[13] * iArr[7]) / iL;
            if (iArr2 == null) {
                f389k[0] = -i9;
                f389k[1] = i8;
                f389k[2] = i8;
                f389k[3] = i9;
                f389k[4] = i9;
                f389k[5] = -i8;
            } else {
                f389k[0] = 0;
                f389k[1] = (-iArr[13]) / 2;
                f389k[2] = 0;
                f389k[3] = iArr[13] / 2;
                f389k[4] = ((iArr[6] > 0 ? 1 : -1) * iArr[13]) / 2;
                f389k[5] = 0;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                if (iArr2 == null) {
                    zA = a(f388m[i10], iArr[4] + f389k[i10 << 1], iArr[5] + f389k[(i10 << 1) + 1], i5 + f389k[i10 << 1], i6 + f389k[(i10 << 1) + 1], true);
                } else {
                    int[] iArr3 = f388m[i10];
                    int i11 = iArr[4] + f389k[i10 << 1];
                    int i12 = iArr[5] + f389k[(i10 << 1) + 1];
                    int i13 = i5 + f389k[i10 << 1];
                    int i14 = i6 + f389k[(i10 << 1) + 1];
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
                                f390l[0] = i20 == 1 ? i16 : i18;
                                f390l[1] = (((i14 - i12) * (f390l[0] - i15)) / (i13 - i15)) + i12;
                            }
                            if (i21 != 0) {
                                f390l[3] = i21 == 1 ? i17 : i19;
                                f390l[2] = (((i13 - i15) * (f390l[3] - i12)) / (i14 - i12)) + i15;
                            }
                            if (f390l[0] >= i16 && f390l[0] <= i18 && f390l[1] >= i17 && f390l[1] <= i19) {
                                i21 = 0;
                                i22 = 0;
                                z4 = true;
                            } else if (f390l[2] >= i16 && f390l[2] <= i18 && f390l[3] >= i17 && f390l[3] <= i19) {
                                i20 = 0;
                                i22 = 2;
                                z4 = true;
                            }
                        } else {
                            if (iArr2[6] > 0) {
                                int i23 = (i18 - i15) + 10;
                                if (i18 < (20 * z) - 390) {
                                    i15 += i23;
                                } else {
                                    int[] iArr4 = f380a[0];
                                    iArr4[4] = iArr4[4] - i23;
                                }
                            } else {
                                int i24 = (i15 + 10) - i16;
                                if (i16 > 390) {
                                    i15 -= i24;
                                } else {
                                    int[] iArr5 = f380a[0];
                                    iArr5[4] = iArr5[4] + i24;
                                }
                            }
                            f380a[0][3] = 0;
                            f380a[0][1] = 2;
                            i20 = 0;
                            i21 = 1;
                            i22 = 0;
                            f390l[0] = i15;
                            f390l[1] = i12;
                            z4 = true;
                        }
                        if (z4) {
                            boolean z5 = true;
                            if (iArr2[0] == 4096) {
                                i21 = iArr2 == f380a[0] ? 1 : -1;
                                int i25 = (((f390l[i22] - i16) * (-199)) / iArr2[14]) + 227;
                                int iM138g = ((m138g(i25 == 128 ? 127 : i25) << 4) * aF) >> 16;
                                int iM137f = (((m137f(i25 == 128 ? 127 : i25) << 4) * aF) * i21) >> 16;
                                int i26 = f390l[i22] - i15;
                                int i27 = f390l[i22 + 1] - i12;
                                a(iArr3, (i26 * i26) + (i27 * i27), f390l[i22], f390l[i22 + 1], iM138g, -iM137f, -i20, -i21);
                                iArr3[7] = 0 | iArr2[0];
                                z5 = false;
                            }
                            if (z5) {
                                int i28 = f390l[i22] - i15;
                                int i29 = f390l[i22 + 1] - i12;
                                a(iArr3, (i28 * i28) + (i29 * i29), f390l[i22], f390l[i22 + 1], (-i20) * aF, (-i21) * aF, -i20, -i21);
                                iArr3[7] = 0 | iArr2[0];
                            }
                        }
                    }
                    zA = z4;
                }
                if (zA && (i4 == -1 || i4 > f388m[i10][0])) {
                    i3 = i10;
                    i4 = f388m[i10][0];
                }
            }
        }
        if (i3 != -1 && (!z2 || iArr[16] < 0 || iArr[16] > f388m[i3][0])) {
            iArr[16] = f388m[i3][0];
            iArr[17] = f388m[i3][1] - f389k[i3 << 1];
            iArr[18] = f388m[i3][2] - f389k[(i3 << 1) + 1];
            iArr[19] = f388m[i3][3];
            iArr[20] = f388m[i3][4];
            iArr[21] = f388m[i3][5];
            iArr[22] = f388m[i3][6];
            iArr[23] = f388m[i3][7];
            z3 = true;
        }
        return z3;
    }

    private static void u() {
        for (int i2 = 0; i2 < 1; i2++) {
            f398f[0][0] = 0;
            f398f[0][1] = 0;
            f398f[0][2] = 0;
            f398f[0][3] = 0;
            f398f[0][4] = 0;
            f398f[0][5] = 0;
            f398f[0][6] = 0;
        }
    }

    private static void v() {
        bs = 0;
        for (int i2 = 0; i2 < 1; i2++) {
            f397e[0][0] = 0;
            f397e[0][1] = 0;
            f397e[0][2] = 0;
            f397e[0][3] = 0;
            f397e[0][4] = 0;
            f397e[0][5] = 0;
            f397e[0][6] = 0;
            f397e[0][7] = 0;
        }
    }

    private static void w() {
        for (int i2 = 0; i2 < f392c.length; i2++) {
            f392c[i2] = false;
        }
    }

    private static void x() {
        for (int i2 = 0; i2 < 1; i2++) {
            f402g[0][0] = 0;
            f402g[0][1] = 0;
            f402g[0][2] = 0;
            f402g[0][3] = 0;
            f402g[0][4] = 0;
            f402g[0][5] = 0;
            f402g[0][6] = 0;
            f402g[0][7] = 0;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m129a(int i2) {
        switch (i2) {
            case 0:
                return bD > 0;
            case 1:
                return bE > 0;
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 18:
            case 20:
            case 21:
            case 26:
            default:
                return false;
            case 3:
                return f403g;
            case 7:
                return bw == 1;
            case 9:
                return ag > 0;
            case 14:
                return bC == 2 && bB > 0;
            case 15:
                return bC == 4 && bB > 0;
            case 16:
                return f373p;
            case 17:
                return f374q;
            case 19:
                return bG > 0;
            case 22:
                return k > 0;
            case 23:
                return ax > 0;
            case 24:
                return af > 0;
            case 25:
                return ai > 0;
            case 27:
                return f406z;
            case 28:
                return bH > 0;
            case 29:
                return f407A;
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static final int m130c() {
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (f381b[i3][1] != 0) {
                i2 = i3;
                break;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m131a(int i2, int i3) {
        int iAbs = Math.abs(i3);
        int iAbs2 = Math.abs(i2);
        return Math.max(iAbs2, iAbs) + ((Math.min(iAbs2, iAbs) * 53) >> 7);
    }

    private static void g(int i2) {
        if (bu == 1 && am == 0) {
            bv -= i2;
            ad = 1600 - bv;
            if (bv < 0) {
                z();
                j.f110a = 1500;
                j.m51c(500);
                W = 0;
                if (f399w) {
                    U = 16;
                    f399w = false;
                }
            }
        }
        if (ad > 0) {
            j.f110a = 500;
            j.m51c(500);
            int i3 = f410h[al][1];
            int i4 = f410h[al][7];
            for (int i5 = i4; i5 < i4 + i3; i5++) {
                if (m150a(f411a[i5]) && c(f411a[i5]) != 2) {
                    Object[] objArr = f411a[i5];
                    int iM130c = m130c();
                    if (((m131a((f381b[iM130c][4] - ((int[]) objArr[1])[1]) / z, (f381b[iM130c][5] - ((int[]) objArr[1])[2]) / A) * 60) - ad) + 20 < 0.0f) {
                        m126a(5, i5, 3, true);
                    }
                    if (c(f411a[i5]) == 6) {
                        f399w = true;
                    }
                }
            }
        }
    }

    private static final int j(int i2) {
        return (10 * m138g(f394d[i2][2])) >> 12;
    }

    private static final int k(int i2) {
        return ((-10) * m137f(f394d[i2][2])) >> 12;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static int m132e(int i2) {
        return (i2 == 0 ? 128 : 64) + ((64 * Math.abs(m137f(f396n[i2] / 2))) >> 12);
    }

    private static void y() {
        f393v = false;
        ac = 0;
        br = 0;
        for (int i2 = 0; i2 < f394d.length; i2++) {
            f394d[i2][3] = 0;
        }
        f396n[0] = 0;
        f396n[1] = 0;
        f395m[0] = 0;
        f395m[1] = 30;
    }

    private static void z() {
        ad = 0;
        bu = 0;
        bv = 0;
    }

    private static void A() {
        int i2 = (f380a[0][14] - 1380) / 2;
        int[] iArr = f380a[0];
        iArr[4] = iArr[4] + i2;
        f380a[0][14] = 1380;
        int[] iArr2 = f380a[1];
        iArr2[4] = iArr2[4] + i2;
        f380a[1][14] = 1380;
        as = 0;
        bF = 0;
    }

    private static void a(int i2, boolean z2) {
        int i3;
        al = i2;
        bJ = f410h[al][2];
        an = 1;
        ao = (m != 2 || o < 99) ? f410h[al][0] : 1;
        if (aJ != -1 && R != (i3 = aJ)) {
            R = i3;
            t.b(i3, -1);
        }
        boolean z3 = false;
        f376s = false;
        int i4 = f410h[al][7];
        int i5 = f410h[al][1];
        boolean z4 = false;
        int i6 = -1;
        boolean z5 = false;
        int i7 = 0;
        int i8 = -1;
        for (int i9 = i4; i9 < i4 + i5; i9++) {
            Object[] objArr = f411a[i9];
            h(objArr, 0);
            g(objArr, 0);
            if (m != 2 && c(objArr) == 1) {
                if (!m150a(objArr)) {
                    int[] iArr = f410h[al];
                    iArr[2] = iArr[2] + 1;
                    bJ++;
                    m152e(objArr);
                    z3 = true;
                }
                f408B = false;
                z4 = true;
                i6 = i9;
                i7++;
                if (i7 > 1) {
                    z5 = true;
                    i8 = i9;
                }
            }
            if ((c(f411a[i9]) == 4 || c(f411a[i9]) == 5 || c(f411a[i9]) == 2) && m150a(f411a[i9])) {
                f376s = true;
            }
            f411a[i9] = objArr;
        }
        if (m != 2) {
            if (bJ == 1 && z4 && z3 && !z2) {
                m151d(f411a[i6]);
                s();
                an = 2;
                f410h[al][2] = 0;
                bJ = 0;
            }
            if (z5) {
                m151d(f411a[i8]);
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m133a(int i2, int i3) {
        int i4 = f410h[al][3];
        int i5 = (255 & (i4 >> 24)) * z;
        int i6 = ((255 & (i4 >> 16)) * A) + f410h[al][4];
        return (i2 >= i5 && i2 <= i5 + ((255 & (i4 >> 8)) * z) && i3 >= i6 && i3 <= i6 + ((255 & i4) * A)) || i2 <= 0 || i2 >= 20 * z || i3 - f410h[al][4] <= 0 || i3 - f410h[al][4] >= 17 * A;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static int m134b(int i2, int i3) {
        return c(i2 * z, i3 * A);
    }

    private static int c(int i2, int i3) {
        int i4 = 0;
        if (i3 < 0) {
            i4 = 3;
        } else if (i3 > 17 * A) {
            i4 = 4;
        } else if (i2 < 0) {
            i4 = 1;
        } else if (i2 > 20 * z) {
            i4 = 2;
        } else {
            int i5 = f410h[al][7];
            int i6 = f410h[al][1];
            for (int i7 = i5; i7 < i5 + i6; i7++) {
                Object[] objArr = f411a[i7];
                if (m150a(objArr)) {
                    int i8 = ((int[]) objArr[1])[1];
                    int i9 = ((int[]) objArr[1])[2];
                    int i10 = i8 + i(objArr);
                    int iJ = i9 + j(objArr);
                    if (i2 >= i8 && i2 < i10 && i3 >= i9 && i3 < iJ) {
                        switch (b(objArr)) {
                            case 1:
                                return (i7 << 16) | 5;
                            case 2:
                                return i2 < i8 + z ? (i7 << 16) | 6 : (i7 << 16) | 7;
                            case 3:
                                if (i2 < i8 + z) {
                                    return i3 < i9 + A ? (i7 << 16) | 8 : (i7 << 16) | 10;
                                }
                                return i3 < i9 + A ? (i7 << 16) | 9 : (i7 << 16) | 11;
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
    private static boolean a(int[] r12, int r13, int r14, int r15, int r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z.a(int[], int, int, int, int, boolean):boolean");
    }

    private static int a(int i2, int i3, boolean z2) {
        int i4 = i2 >= 0 ? 1 : -1;
        return ((i2 < 0 || z2) && (i2 >= 0 || !z2)) ? (((i2 - i4) / i3) + i4) * i3 : (i2 / i3) * i3;
    }

    private static int b(int i2, int i3, boolean z2) {
        return z2 ? i3 : f410h[i2][4] + i3;
    }

    private static void h(int i2) {
        if (f356a[i2] || f354b || !f355c) {
            return;
        }
        d();
        f372f = false;
        a(t.m87a(f378i[i2]), (String) null);
        ay = i2;
    }

    public static void g() {
        n nVar = new n();
        f359b = nVar;
        nVar.a(1, 3, 3);
        f359b.a(2);
        j.f168i = new b(a.a(131095), true);
        f359b.a(0, 1, (String) null, j.f168i, 0);
        f359b.a(1, 1, t.m87a(306), (Image[]) null, 0);
    }

    private static void a(String str, String str2) {
        f354b = true;
        t.m85b();
        if (f372f) {
            f359b.a(2, 1, str, (Image[]) null, 0);
            B();
            f359b.m72b();
        } else {
            f358a.a(0, 1, str2, (Image[]) null, 0);
            f358a.a(1, 1, str, (Image[]) null, 0);
            B();
            f358a.m72b();
        }
        t.a(1, 0);
    }

    private static void B() {
        int iM98e = t.m98e();
        int iA = t.a();
        int i2 = (iM98e * 75) / 100;
        int i3 = iA >> 1;
        q = (iM98e - i2) >> 1;
        r = (iA - i3) >> 1;
        if (f372f) {
            f359b.b(i2, i3);
        } else {
            f358a.b(i2, i3);
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static final int m135d() {
        return Math.abs(f362a.nextInt());
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
        } else if (z3 && i4 >= z) {
            i8 = 1;
        } else if (z4 && i5 <= 0) {
            i9 = -1;
        } else if (!z5 || i5 < A) {
            z6 = false;
        } else {
            i9 = 1;
        }
        if (z6) {
            a(iArr, 0, i2 + i4, i3 + i5, i8 * aF, i9 * aF, i8, i9);
        }
        return z6;
    }

    public static void h() {
        int i2 = 0;
        int i3 = 4096;
        if (f361f == null) {
            f361f = new int[512];
            for (int i4 = 0; i4 < 512; i4++) {
                f361f[i4] = i2;
                i3 -= (i2 * 50) >> 12;
                i2 += (i3 * 50) >> 12;
            }
        }
        bo = 0;
        n = 1;
        for (int i5 = 0; i5 < f387l.length; i5++) {
            bo += f387l[i5][n - 1];
        }
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static final int m136e() {
        int i2 = ((-1644122275) * aC) - 1644122275;
        aC = i2;
        return i2;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public static final int m137f(int i2) {
        return f361f[i2 & 511];
    }

    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public static final int m138g(int i2) {
        return f361f[(i2 + 128) & 511];
    }

    private static int l(int i2) {
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

    private static int a(int i2, int i3, int i4, int i5) {
        return ((i2 * i4) + (i3 * i5)) / aF;
    }

    private static boolean a(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int iMin = Math.min(i2, i4);
        int iMax = Math.max(i2, i4);
        return iMax > i6 && iMin < i6 && iMin != iMax && (i9 = i3 + (((i5 - i3) * (i6 - i2)) / (i4 - i2))) > Math.min(i7, i8) && i9 < Math.max(i7, i8);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m139b(int i2) {
        new StringBuffer().append("***Setting ").append(i2).append(" ").append(99).append(" ").append(100).toString();
        if (i2 < 99) {
            a(t.m93a(65543), i2, 0, 0, 0);
        } else {
            d(0, 6);
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
                                m149a(objArr);
                                f411a[i4 + i9] = objArr;
                                a(f411a[i4 + i9], i13, i6, i14, 0, i12, i11);
                                i9++;
                                break;
                            case 3:
                                i6 = 4;
                                i10++;
                                Object[] objArr2 = new Object[2];
                                m149a(objArr2);
                                f411a[i4 + i9] = objArr2;
                                a(f411a[i4 + i9], i13, i6, i14, 0, i12, i11);
                                i9++;
                                break;
                            case 4:
                                i6 = 5;
                                i10++;
                                Object[] objArr3 = new Object[2];
                                m149a(objArr3);
                                f411a[i4 + i9] = objArr3;
                                a(f411a[i4 + i9], i13, i6, i14, 0, i12, i11);
                                i9++;
                                break;
                            case 5:
                                i6 = 2;
                                Object[] objArr4 = new Object[2];
                                m149a(objArr4);
                                f411a[i4 + i9] = objArr4;
                                a(f411a[i4 + i9], i13, i6, i14, 0, i12, i11);
                                i9++;
                                break;
                        }
                    }
                }
            }
            f410h[i3][0] = i5 == 3 ? 3 : 0;
            f410h[i3][1] = i9;
            f410h[i3][2] = i10;
            f410h[i3][4] = 0;
            f410h[i3][7] = i4;
            f410h[i3][3] = 0 | (i7 << 8) | i8;
            short s2 = dataInputStream.readShort();
            int i15 = 0;
            while (i15 < s2) {
                if (dataInputStream.read() == 0) {
                    j.f157g = dataInputStream.read();
                    if (i5 != 2) {
                        int i16 = dataInputStream.read();
                        int[] iArr = i5 == 1 ? f414p : f413o;
                        int i17 = 0;
                        for (int i18 = 0; i18 < i16; i18++) {
                            int i19 = dataInputStream.read();
                            if (f386e[i19]) {
                                iArr[i17] = i19;
                                i17++;
                            }
                        }
                        if (i17 == 0) {
                            int i20 = i17;
                            i17++;
                            iArr[i20] = 9;
                        }
                        int i21 = i17;
                        if (i5 == 1) {
                            aV = 10;
                            bM = i21;
                        } else {
                            bL = i21;
                        }
                        b = dataInputStream.readShort();
                        c = dataInputStream.readShort();
                        int i22 = dataInputStream.read();
                        i15 = 0;
                        while (i15 < i22) {
                            int i23 = dataInputStream.read();
                            short s3 = dataInputStream.readShort();
                            int i24 = f410h[i3][1];
                            int i25 = f410h[i3][7];
                            int i26 = b;
                            for (int i27 = i25; i27 < i25 + i24; i27++) {
                                Object[] objArr5 = f411a[i27];
                                int iF = f(objArr5);
                                if (g(objArr5) == s3) {
                                    ((boolean[]) objArr5[0])[0] = true;
                                    if (i23 == 1) {
                                        ((int[]) objArr5[1])[3] = (i26 * ((iF << 2) / 20)) / 2;
                                    } else if (i23 == 2) {
                                        ((int[]) objArr5[1])[3] = (i26 * ((iF << 2) / 20)) / 4;
                                    } else if (i23 == 3) {
                                        ((int[]) objArr5[1])[3] = i26 - ((i26 * ((iF << 2) / 20)) / 4);
                                    } else if (i23 == 4) {
                                        int i28 = iF;
                                        if (iF >= 10) {
                                            i28 = 19 - i28;
                                        }
                                        ((int[]) objArr5[1])[3] = (i26 * Math.abs(10 - ((i28 / 2) << 1))) / 8;
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

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static void m140c(int i2, int i3) {
        int i4 = f410h[i2][7];
        int i5 = f410h[i2][1];
        int i6 = f410h[i3][7];
        for (int i7 = 0; i7 < i5; i7++) {
            f411a[i6 + i7] = f411a[i4 + i7];
        }
        for (int i8 = 0; i8 < 8; i8++) {
            f410h[i3][i8] = f410h[i2][i8];
        }
        f410h[i3][7] = i6;
    }

    private static void C() {
        for (int i2 = 0; i2 < 600; i2++) {
            f412b[i2] = -1;
        }
    }

    private static int m(int i2) {
        return c(f411a[i2]);
    }

    public static void i() {
        String strM87a = t.m87a(406);
        if (strM87a == null || strM87a == "" || strM87a == " ") {
            f415a = ' ';
        } else {
            f415a = strM87a.charAt(0);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static String m141a(int i2) {
        if (f415a == ' ' || i2 < 1000) {
            return Integer.toString(i2);
        }
        for (int i3 = 0; i3 < f416a.length; i3++) {
            f416a[i3] = ' ';
        }
        int length = f416a.length - 1;
        do {
            int i4 = length;
            length = i4 - 1;
            f416a[i4] = (char) (((byte) (i2 % 10)) + 48);
            i2 /= 10;
            if (length % 4 == 0) {
                length--;
                f416a[length] = f415a;
            }
        } while (i2 > 0);
        int i5 = length + 1;
        if (f416a[i5] == f415a) {
            i5++;
        }
        return String.valueOf(f416a, i5, f416a.length - i5);
    }

    public static final void a(n nVar) {
        nVar.a(1, 15, 0);
        nVar.a(t.m87a(358), (Image) null);
        int i2 = s / 1000;
        int i3 = i2 / 3600;
        int i4 = i2 - (i3 * 3600);
        int i5 = i4 / 60;
        nVar.a(0, 1, t.a(t.m87a(383), new String[]{m141a(e.f69a[1][0][0])}), (Image[]) null, 0);
        nVar.a(1, 1, t.a(t.m87a(384), new String[]{m141a(e.f69a[2][0][0])}), (Image[]) null, 0);
        nVar.a(2, 1, t.a(t.m87a(393), new String[]{m141a(e.f69a[3][0][0])}), (Image[]) null, 0);
        nVar.a(3, 1, t.a(t.m87a(390), new String[]{m141a(J)}), (Image[]) null, 0);
        nVar.a(4, 1, t.a(t.m87a(391), new String[]{m141a(K)}), (Image[]) null, 0);
        nVar.a(5, 1, t.a(t.m87a(381), new String[]{new StringBuffer().append("").append(i3).toString(), new StringBuffer().append("").append(i5).toString(), new StringBuffer().append("").append(i4 - (i5 * 60)).toString()}), (Image[]) null, 0);
        nVar.a(6, 1, t.a(t.m87a(380), new String[]{m141a(B)}), (Image[]) null, 0);
        nVar.a(7, 1, t.a(t.m87a(382), new String[]{m141a(t + 1)}), (Image[]) null, 0);
        nVar.a(8, 1, t.a(t.m87a(392), new String[]{m141a(M)}), (Image[]) null, 0);
        nVar.a(9, 1, t.a(t.m87a(386), new String[]{m141a(C), m141a(D), m141a(E), m141a(F)}), (Image[]) null, 0);
        nVar.a(10, 1, t.a(t.m87a(387), new String[]{m141a(G)}), (Image[]) null, 0);
        nVar.a(11, 1, t.a(t.m87a(388), new String[]{m141a(H)}), (Image[]) null, 0);
        nVar.a(12, 1, t.a(t.m87a(389), new String[]{m141a(I)}), (Image[]) null, 0);
        nVar.a(13, 1, t.a(t.m87a(394), new String[]{Integer.toString(m145f())}), (Image[]) null, 0);
        nVar.a(-1, 0);
        nVar.a(5, 1);
        nVar.b(t.m98e(), t.a());
        nVar.m72b();
    }

    static {
        int[] iArr = {250, 250, 250, 250, 100};
        int[] iArr2 = {250, 250, 250, 250, 100};
        int[][] iArr3 = {new int[]{5, 5, 240, 241}, new int[]{0, 10, 242, 243}, new int[]{0, 30, 244, 245}, new int[]{0, 100, 246, 247}, new int[]{1, 50000, 248, 249}, new int[]{1, 100000, 250, 251}, new int[]{1, 500000, 252, 253}, new int[]{1, 1000000, 254, 255}, new int[]{2, 1, 256, 257}, new int[]{3, 100, 258, 259}, new int[]{4, 1, 260, 261}, new int[]{4, 10, 262, 263}, new int[]{4, 50, 264, 265}, new int[]{5, 25, 266, 267}, new int[]{5, 50, 268, 269}, new int[]{5, 100, 270, 271}, new int[]{5, 150, 272, 273}, new int[]{5, 200, 274, 275}, new int[]{5, 250, 276, 277}, new int[]{5, 300, 278, 279}, new int[]{6, 50, 280, 281}, new int[]{7, 100000, 282, 283}, new int[]{7, 500000, 284, 285}, new int[]{7, 1000000, 286, 287}, new int[]{7, 9999999, 288, 289}, new int[]{14, 100, 290, 291}, new int[]{9, 5000, 292, 293}, new int[]{8, 1000, 294, 295}, new int[]{11, 500, 296, 297}, new int[]{12, 100, 298, 299}, new int[]{10, 50, 300, 301}, new int[]{2, 100, 302, 303}, new int[]{13, 4, 304, 305}};
        f418i = iArr3;
        f417c = new int[iArr3.length];
        int[] iArr4 = f466ag;
        f369g = iArr4;
        aH = iArr4[iArr4.length - 1];
        int[] iArr5 = {65540, -1};
        f377h = new int[150];
        aN = 0;
        T = Math.max(Math.max(1, 1), Math.max(2, 2));
        aO = ((20 * aF) * 100) / 100;
        aP = ((2 * aF) * 100) / 100;
        aQ = ((128 * aF) * 100) / 100;
        f378i = new int[]{156, 157, 158, 159, 160, 161, 231, 238, 166};
        f379k = new int[][]{new int[]{0, 0, 0, 0}, new int[]{10, 10, 10, 10}, new int[]{1000, 1000, 1000, 1000}, new int[]{50, 100, 150, 200}, new int[]{100, 200, 300, 400}, new int[]{200, 400, 600, 800}, new int[]{10, 10, 10, 10}};
        f380a = new int[2][25];
        f381b = new int[3][25];
        f382c = new int[T][25];
        f383t = true;
        U = 1;
        aR = 0;
        V = 0;
        W = 0;
        aS = 4;
        aT = 0;
        aU = aQ;
        aV = 8;
        aW = ((12 * aF) * 100) / 100;
        aZ = 1;
        ba = 0;
        X = 5;
        Y = 0;
        Z = 0;
        bb = 0;
        aa = 0;
        bc = 0;
        bd = 1;
        be = -1;
        ab = 0;
        bf = 0;
        bg = 0;
        bh = 0;
        bi = 0;
        bj = 0;
        bk = 0;
        bl = 0;
        bm = 0;
        bn = 0;
        f384j = new int[31];
        f385a = new int[]{11, 10, 4, 6, 5, 21, 12};
        int[][] iArr6 = {new int[]{7, 8, 9}, new int[]{2, 11}};
        f386e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
        int[] iArr7 = {0, 0, 0, 0, 0};
        f387l = new int[][]{f427t, f428u, f429v, f430w, f431x, f432y, f433z, f434A, f435B, f436C, f437D, f438E, f439F, f440G, f441H, f442I, f443J, f444K, f448O, f449P, f450Q, f445L, f446M, f447N, f451R, f452S, f453T, f454U, f455V, f456W};
        bp = 6;
        bq = aO + 195 + 30;
        f388m = new int[3][8];
        f389k = new int[6];
        f390l = new int[]{-1, -1, -1, -1};
        f391u = false;
        f392c = new boolean[31];
        f394d = new int[35][4];
        f395m = new int[2];
        f396n = new int[2];
        f397e = new int[1][8];
        bs = 0;
        bt = (-5) * A;
        f398f = new int[1][7];
        f399w = false;
        ae = 0;
        f400n = new int[3][2];
        f401d = new boolean[3];
        bz = (-5) * A;
        f402g = new int[1][8];
        ag = 0;
        ah = 0;
        f404x = false;
        bA = 0;
        bB = 0;
        bC = 1;
        bD = 0;
        f405y = false;
        bE = 0;
        bF = 0;
        bG = 0;
        ai = 0;
        aj = 0;
        ak = 0;
        bH = 0;
        f408B = false;
        f409C = false;
        f410h = new int[8][8];
        f411a = new Object[600][];
        f412b = new int[600];
        am = 0;
        an = 1;
        ao = 0;
        f413o = new int[31];
        f414p = new int[31];
        f416a = new char[16];
    }

    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public static final int m142h(int i2) {
        boolean z2;
        int i3 = -1;
        for (int i4 = 0; i4 < f418i.length; i4++) {
            if (f418i[i4][0] == i2 || i2 == -1) {
                int i5 = i4;
                if (f417c[i5] != 0) {
                    z2 = false;
                } else {
                    int i6 = f418i[i5][1];
                    boolean z3 = false;
                    int i7 = f + al;
                    switch (f418i[i5][0]) {
                        case 0:
                            z3 = m == 2 && o >= i6;
                            break;
                        case 1:
                            z3 = m == 2 && Y >= i6;
                            break;
                        case 2:
                            z3 = m == 1 && L >= i6;
                            break;
                        case 3:
                            z3 = O >= i6;
                            break;
                        case 4:
                            z3 = m == 1 && H >= i6;
                            break;
                        case 5:
                            z3 = m == 1 && i7 + 1 >= i6;
                            break;
                        case 6:
                            z3 = I >= i6;
                            break;
                        case 7:
                            z3 = m == 1 && Y >= i6;
                            break;
                        case 8:
                            z3 = D >= i6;
                            break;
                        case 9:
                            z3 = C >= i6;
                            break;
                        case 10:
                            z3 = G >= i6;
                            break;
                        case 11:
                            z3 = E >= i6;
                            break;
                        case 12:
                            z3 = F >= i6;
                            break;
                        case 13:
                            z3 = m == 3 && !f364d && ab < (i6 << 2);
                            break;
                        case 14:
                            z3 = N >= i6;
                            break;
                    }
                    if (z3) {
                        f417c[i5] = 1;
                        new StringBuffer().append("Completed achievement ").append(i5).append(" ").append(t.m87a(f418i[i5][3])).toString();
                        f420a.addElement(new Integer(i5));
                        DCWall3D.b();
                        String strM87a = t.m87a(306);
                        if (!f357b[i5] && !f354b) {
                            f372f = true;
                            a(t.m87a(f418i[i5][2]), strM87a);
                            f357b[i5] = true;
                            DCWall3D.b();
                        }
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

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m143a(boolean z2) {
        String string;
        int i2;
        if (f419a == null) {
            f419a = new n[4];
        }
        f419a[0] = new n();
        f419a[0].a(1, 1, 1);
        f419a[0].a(t.m87a(359), (Image) null);
        f419a[0].a(0, 1, "", (Image[]) null, 0);
        f419a[0].a(2);
        f419a[0].b(t.m98e(), t.a());
        if (z2) {
            f419a[0].a(-1, 0);
            f419a[0].a(5, 1);
        }
        f419a[0].m72b();
        int i3 = aq;
        f419a[1] = new n();
        f419a[1].a(0, 1, 1);
        f419a[1].a(2);
        f419a[1].b(DCWall3D.f5a, DCWall3D.f5a, DCWall3D.f5a, DCWall3D.f5a);
        f419a[1].a(new StringBuffer().append(Integer.toString(i3 + 1)).append(". ").append(t.m87a(f418i[i3][2])).toString(), (Image) null);
        f419a[1].b(j.f163f.g() - 40, j.f163f.h() - 8);
        f419a[2] = new n();
        f419a[2].a(1, 1, 1);
        n nVar = f419a[2];
        StringBuffer stringBufferAppend = new StringBuffer().append(t.a(t.m87a(f418i[i3][3]), new String[]{m141a(f418i[i3][1])}));
        if (f417c[i3] == 0) {
            int i4 = f418i[i3][1];
            switch (f418i[i3][0]) {
                case 2:
                    i2 = L;
                    string = new StringBuffer().append(" (").append(m141a(i2)).append("/").append(m141a(i4)).append(")").toString();
                    break;
                case 3:
                    i2 = O;
                    string = new StringBuffer().append(" (").append(m141a(i2)).append("/").append(m141a(i4)).append(")").toString();
                    break;
                case 4:
                    i2 = H;
                    string = new StringBuffer().append(" (").append(m141a(i2)).append("/").append(m141a(i4)).append(")").toString();
                    break;
                case 5:
                case 7:
                case 13:
                default:
                    string = "";
                    break;
                case 6:
                    i2 = I;
                    string = new StringBuffer().append(" (").append(m141a(i2)).append("/").append(m141a(i4)).append(")").toString();
                    break;
                case 8:
                    i2 = D;
                    string = new StringBuffer().append(" (").append(m141a(i2)).append("/").append(m141a(i4)).append(")").toString();
                    break;
                case 9:
                    i2 = C;
                    string = new StringBuffer().append(" (").append(m141a(i2)).append("/").append(m141a(i4)).append(")").toString();
                    break;
                case 10:
                    i2 = G;
                    string = new StringBuffer().append(" (").append(m141a(i2)).append("/").append(m141a(i4)).append(")").toString();
                    break;
                case 11:
                    i2 = E;
                    string = new StringBuffer().append(" (").append(m141a(i2)).append("/").append(m141a(i4)).append(")").toString();
                    break;
                case 12:
                    i2 = F;
                    string = new StringBuffer().append(" (").append(m141a(i2)).append("/").append(m141a(i4)).append(")").toString();
                    break;
                case 14:
                    i2 = N;
                    string = new StringBuffer().append(" (").append(m141a(i2)).append("/").append(m141a(i4)).append(")").toString();
                    break;
            }
        } else {
            string = "";
        }
        nVar.a(0, 1, stringBufferAppend.append(string).toString(), (Image[]) null, 0);
        f419a[2].a(2);
        n nVar2 = f419a[2];
        int iG = j.f163f.g() - 8;
        int iH = j.f163f.h() - 8;
        nVar2.b(iG, ((iH * 9) / 10) - ((iH * 52) / 100));
    }

    public static int i(int i2) {
        if (f421D || f422E) {
            bN += i2;
            j.f161d.b(i2);
            j.f162e.b(i2);
            bO++;
        }
        j.j(i2);
        r.a(i2);
        for (int i3 = 0; i3 < 4; i3++) {
            if (f419a[i3] != null) {
                f419a[i3].m73a(i2);
            }
        }
        return ap;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final void m144a(int i2, int i3, boolean z2) {
        if (f419a[2] != null) {
            f419a[2].c(i2, i3);
        }
        if (i3 == 0) {
            int iM86a = t.m86a(i2);
            if (z2) {
                if (iM86a == 52 || iM86a == 54) {
                    bN = 0;
                    if (iM86a == 52) {
                        f421D = true;
                        int i4 = aq - 1;
                        aq = i4;
                        if (i4 < 0) {
                            aq = f418i.length - 1;
                        }
                    }
                    if (iM86a == 54) {
                        f422E = true;
                        int i5 = aq + 1;
                        aq = i5;
                        if (i5 >= f418i.length) {
                            aq = 0;
                        }
                    }
                    m143a(true);
                }
            } else if (iM86a == 53) {
                ap = 1;
            }
        }
        if (i3 == 3) {
            if (i2 == 1) {
                ap = 1;
            } else if (i2 == 5) {
                ap = 2;
            }
        }
    }

    public static void a(Graphics graphics, boolean z2) {
        j.a(graphics, DCWall3D.f19a);
        m.a(graphics);
        j.b(graphics);
        m.b(graphics);
        int iB = DCWall3D.f6b.b() + 20;
        int iG = 2 * j.a.g();
        if (f421D) {
            if (bN < 600) {
                iG -= t.m98e() - ((t.m98e() * bN) / 600);
            }
        } else if (f422E && bN < 600) {
            iG += t.m98e() - ((t.m98e() * bN) / 600);
        }
        if (f421D) {
            j.f162e.c(bO);
            j.f162e.a(graphics, t.m98e() >> 1, t.a() >> 1);
            if (bO == j.f162e.a() - 1) {
                bO = 0;
                f421D = false;
            }
        } else if (f422E) {
            j.f161d.c(bO);
            j.f161d.a(graphics, t.m98e() >> 1, t.a() >> 1);
            if (bO == j.f161d.a() - 1) {
                bO = 0;
                f422E = false;
            }
        } else {
            j.f163f.a(graphics, t.m98e() >> 1, t.a() >> 1);
        }
        int iA = (t.a() * 9) / 10;
        if (f417c[aq] != 0) {
            j.f167h.a(graphics, (t.m98e() + iG) >> 1, t.a() >> 1);
        } else {
            j.f166g.a(graphics, (t.m98e() + iG) >> 1, t.a() >> 1);
        }
        f419a[0].a(graphics, 0, 0);
        if (f419a[1] != null) {
            f419a[1].a(graphics, iG + 40 + 16, iB);
        }
        if (z2) {
            int iAbs = ((aA >> 5) * Math.abs(((int) System.currentTimeMillis()) % 600)) / 600;
            j.a.a(graphics, j.a.g() + iAbs, iA);
            j.b.a(graphics, (t.m98e() - j.b.g()) - iAbs, iA);
        }
        f419a[2].a(graphics, iG + 40, (aB * 52) / 100);
        if (z2) {
            int i2 = (aB * 9) / 10;
            int i3 = aq;
            int iM98e = t.m98e();
            int length = f418i.length;
            int i4 = (iM98e >> 1) - ((length * 6) >> 1);
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = i5;
                boolean z3 = f417c[i5] != 0;
                if (i6 == i3) {
                    graphics.setColor(16711680);
                    graphics.fillRect(i4 - 1, i2 - 1, 7, 7);
                    graphics.setColor(16773574);
                } else if (z3) {
                    graphics.setColor(16764006);
                } else {
                    graphics.setColor(6776679);
                }
                graphics.fillRect(i4, i2, 5, 5);
                i4 += 6;
            }
        }
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public static final int m145f() {
        int i2 = 0;
        for (int i3 = 0; i3 < f418i.length; i3++) {
            if (f417c[i3] > 0) {
                i2++;
            }
        }
        return i2;
    }

    private static int d(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int[] iArr2;
        bP = i3;
        switch (i3) {
            case 0:
            case 3:
            case 4:
                switch (bP) {
                    case 0:
                        i6 = 0;
                        iArr = f457X;
                        iArr2 = f458Y;
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
                        iArr = f460aa;
                        iArr2 = f461ab;
                        break;
                    case 4:
                        i6 = 5;
                        iArr = null;
                        iArr2 = f462ac;
                        break;
                }
                f423q = new int[8];
                f424r = new int[8];
                bS = 0;
                a(t.m93a(65544), i6, i2, 0, 1);
                bQ = f410h[i2][2];
                b(f423q, 0, bQ);
                bR = iArr2[n - 1];
                if (bP == 0) {
                    f423q[5] = A;
                } else {
                    f423q[5] = f423q[1];
                }
                f423q[4] = 2 * z;
                f423q[6] = 16 * z;
                if (bP == 4) {
                    f423q[7] = f423q[3];
                } else {
                    f423q[7] = (16 - iArr[n - 1]) * A;
                }
                f424r[4] = f423q[0];
                f424r[5] = f423q[1];
                a(f424r, f424r[4], f424r[5], bR);
                m147d(i2, bQ);
                for (int i7 = 0; i7 < bQ; i7++) {
                    Object[] objArr = f411a[i7];
                    int iD = d(objArr);
                    int i8 = 3;
                    if (iD == 2) {
                        bS++;
                    }
                    switch (n) {
                        case 2:
                            if (iD == 1) {
                                i8 = 4;
                            }
                            break;
                        case 3:
                            if (iD == 1) {
                                i8 = 5;
                            }
                            break;
                        case 4:
                            i8 = iD == 0 ? 4 : 3;
                            if (iD == 1) {
                                i8 = 5;
                            }
                            break;
                    }
                    b(objArr, i8);
                    d(objArr, n(i8));
                }
                return bQ;
            case 1:
            case 5:
                switch (bP) {
                    case 5:
                        i4 = 6;
                        i5 = 7;
                        bR = f465af[n - 1];
                        break;
                    default:
                        i4 = 1;
                        i5 = 3;
                        bR = f459Z[n - 1];
                        break;
                }
                f423q = new int[8];
                f424r = new int[8];
                bS = 0;
                a(t.m93a(65544), i4, i2, 0, 1);
                int i9 = f410h[i2][2];
                bU = i9;
                bQ = i9;
                b(f423q, 0, bQ);
                if (bP == 1) {
                    f423q[4] = 2 * z;
                    f423q[5] = A;
                    f423q[6] = 16 * z;
                    f423q[7] = f423q[3];
                } else {
                    f423q[4] = f423q[0];
                    f423q[5] = f423q[1];
                    f423q[6] = f423q[2];
                    f423q[7] = f423q[3];
                }
                f424r[4] = f423q[0];
                f424r[5] = f423q[1];
                a(f424r, f424r[4], f424r[5], bR);
                f425a = new o[3];
                for (int i10 = 0; i10 < 3; i10++) {
                    o oVar = new o(null);
                    f425a[i10] = oVar;
                    a(t.m93a(65544), i5, i2, bQ, 2);
                    bT = f410h[i2][2];
                    int[] iArr3 = oVar.a;
                    if (bP == 1) {
                        iArr3[0] = (1 + (i10 * 6)) * z;
                        iArr3[1] = 10 * A;
                        m148a(bQ, bT, iArr3[0], iArr3[1]);
                        b(iArr3, bQ, bT);
                        iArr3[4] = iArr3[0];
                        iArr3[5] = iArr3[1] - A;
                        iArr3[6] = iArr3[2];
                        iArr3[7] = 5 * A;
                    } else {
                        iArr3[0] = (1 + (i10 * 6)) * z;
                        iArr3[1] = (f464ae[n - 1] + (i10 << 1)) * A;
                        m148a(bQ, bT, iArr3[0], iArr3[1]);
                        b(iArr3, bQ, bT);
                        iArr3[4] = 2 * z;
                        iArr3[5] = iArr3[1];
                        iArr3[6] = 16 * z;
                        iArr3[7] = iArr3[3];
                    }
                    oVar.b[4] = iArr3[0];
                    oVar.b[5] = iArr3[1];
                    a(oVar.b, iArr3[0], iArr3[1], bR);
                    bQ += bT;
                }
                m147d(i2, bQ);
                for (int i11 = 0; i11 < bQ; i11++) {
                    Object[] objArr2 = f411a[i11];
                    int iD2 = d(objArr2);
                    int i12 = 3;
                    if (iD2 == 2 && i11 < bU) {
                        bS++;
                    }
                    switch (n) {
                        case 2:
                            if (iD2 == 0) {
                                i12 = 4;
                            }
                            break;
                        case 3:
                            if (iD2 == 0) {
                                i12 = 5;
                            }
                            break;
                        case 4:
                            if (iD2 == 0) {
                                i12 = 2;
                            }
                            break;
                    }
                    b(objArr2, i12);
                    d(objArr2, n(i12));
                }
                return bQ;
            case 2:
                bS = 0;
                bW = 0;
                a(t.m93a(65544), 2, i2, 0, 1);
                bQ = f410h[i2][2];
                m147d(i2, bQ);
                for (int i13 = 0; i13 < bQ; i13++) {
                    Object[] objArr3 = f411a[i13];
                    int iD3 = d(objArr3);
                    int i14 = 3;
                    if (iD3 == 2) {
                        bS++;
                    }
                    switch (n) {
                        case 2:
                        case 3:
                            if (iD3 == 0) {
                                i14 = 4;
                            }
                            break;
                        case 4:
                            if (iD3 == 0) {
                                i14 = 5;
                            }
                            break;
                    }
                    b(objArr3, i14);
                    d(objArr3, n(i14));
                }
                bV = bQ >> 2;
                bX = (10 - f463ad[n - 1]) * A;
                m148a(0, bQ, 0, bX - A);
                return bQ;
            case 6:
                bS = 0;
                a(t.m93a(65544), 8, i2, 0, 1);
                bQ = f410h[i2][1];
                m147d(i2, bQ);
                for (int i15 = 0; i15 < bQ; i15++) {
                    if (d(f411a[i15]) == 2) {
                        bS++;
                    }
                }
                f426s = new int[bQ];
                return bQ;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static boolean m146b() {
        return bS <= 0;
    }

    private static int n(int i2) {
        if (i2 == 4) {
            return 1;
        }
        return i2 == 5 ? 3 : 0;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    private static void m147d(int i2, int i3) {
        f410h[i2][0] = 1;
        f410h[i2][4] = 0;
        f410h[i2][7] = 0;
        f410h[i2][5] = 0;
        f410h[i2][6] = 0;
        f410h[i2][3] = 5137;
        f410h[i2][1] = i3;
        f410h[i2][2] = i3;
    }

    private static void b(int[] iArr, int i2, int i3) {
        int iMin = 20 * z;
        int iMin2 = 17 * A;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            Object[] objArr = f411a[i4];
            iMin = Math.min(iMin, ((int[]) objArr[1])[1]);
            iMin2 = Math.min(iMin2, ((int[]) objArr[1])[2]);
            iMax2 = Math.max(iMax2, ((int[]) objArr[1])[1] + i(objArr));
            iMax = Math.max(iMax, ((int[]) objArr[1])[2] + j(objArr));
        }
        iArr[3] = iMax - iMin2;
        iArr[2] = iMax2 - iMin;
        iArr[0] = iMin;
        iArr[1] = iMin2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static void m148a(int i2, int i3, int i4, int i5) {
        for (int i6 = i2; i6 < i2 + i3; i6++) {
            Object[] objArr = f411a[i6];
            if (m150a(objArr)) {
                int i7 = ((int[]) objArr[1])[1] + i4;
                int i8 = ((int[]) objArr[1])[2] + i5;
                ((int[]) objArr[1])[1] = i7;
                ((int[]) objArr[1])[2] = i8;
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

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m149a(Object[] objArr) {
        objArr[0] = new boolean[2];
        objArr[1] = new int[4];
    }

    public static void a(Object[] objArr, int i2) {
        objArr[0] = new boolean[2];
        objArr[1] = new int[4];
        ((int[]) objArr[1])[0] = i2 & (-1024);
        e(objArr, (i2 & 992) >> 5);
        f(objArr, i2 & 31);
    }

    public static void a(Object[] objArr, Object[] objArr2) {
        objArr[0] = new boolean[2];
        objArr[1] = new int[4];
        ((int[]) objArr[1])[0] = ((int[]) objArr2[1])[0];
        ((int[]) objArr[1])[1] = ((int[]) objArr2[1])[1];
        ((int[]) objArr[1])[2] = ((int[]) objArr2[1])[2];
        ((boolean[]) objArr[0])[0] = ((boolean[]) objArr2[0])[0];
        ((int[]) objArr[1])[3] = ((int[]) objArr2[1])[3];
        ((boolean[]) objArr[0])[1] = ((boolean[]) objArr2[0])[1];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final boolean m150a(Object[] objArr) {
        return ((((int[]) objArr[1])[0] >> 31) & 1) == 0;
    }

    public static final int b(Object[] objArr) {
        return (((int[]) objArr[1])[0] >> 29) & 3;
    }

    public static final int c(Object[] objArr) {
        return (((int[]) objArr[1])[0] >> 23) & 63;
    }

    public static final int d(Object[] objArr) {
        return (((int[]) objArr[1])[0] >> 20) & 7;
    }

    private static int h(Object[] objArr) {
        return (((int[]) objArr[1])[0] >> 12) & 7;
    }

    public static final int e(Object[] objArr) {
        return (((int[]) objArr[1])[0] >> 10) & 3;
    }

    public static final int f(Object[] objArr) {
        return ((int[]) objArr[1])[1] / z;
    }

    private static int i(Object[] objArr) {
        switch (b(objArr)) {
            case 1:
                return z;
            case 2:
            case 3:
                return 2 * z;
            default:
                return 0;
        }
    }

    private static int j(Object[] objArr) {
        switch (b(objArr)) {
            case 1:
            case 2:
                return A;
            case 3:
                return 2 * A;
            default:
                return 0;
        }
    }

    public static final int g(Object[] objArr) {
        return ((int[]) objArr[1])[2] / A;
    }

    public static final void b(Object[] objArr, int i2) {
        ((int[]) objArr[1])[0] = (((int[]) objArr[1])[0] & (-528482305)) | ((i2 & 63) << 23);
    }

    public static final void c(Object[] objArr, int i2) {
        ((int[]) objArr[1])[0] = (((int[]) objArr[1])[0] & (-7340033)) | ((i2 & 7) << 20);
    }

    private static void g(Object[] objArr, int i2) {
        ((int[]) objArr[1])[0] = (((int[]) objArr[1])[0] & (-1015809)) | ((i2 & 31) << 15);
    }

    private static void h(Object[] objArr, int i2) {
        ((int[]) objArr[1])[0] = (((int[]) objArr[1])[0] & (-28673)) | ((i2 & 7) << 12);
    }

    public static final void d(Object[] objArr, int i2) {
        ((int[]) objArr[1])[0] = (((int[]) objArr[1])[0] & (-3073)) | ((i2 & 3) << 10);
    }

    public static final void e(Object[] objArr, int i2) {
        ((int[]) objArr[1])[1] = i2 * z;
    }

    public static final void f(Object[] objArr, int i2) {
        ((int[]) objArr[1])[2] = i2 * A;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    private static void m151d(Object[] objArr) {
        ((int[]) objArr[1])[0] = ((int[]) objArr[1])[0] | Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    private static void m152e(Object[] objArr) {
        ((int[]) objArr[1])[0] = ((int[]) objArr[1])[0] & Integer.MAX_VALUE;
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
        ((int[]) objArr[1])[0] = 0 | ((i2 & 3) << 29) | ((i3 & 63) << 23) | ((i4 & 7) << 20) | ((i8 & 3) << 10);
        e(objArr, i6);
        f(objArr, i7);
        ((boolean[]) objArr[0])[0] = false;
        ((int[]) objArr[1])[3] = 0;
        ((boolean[]) objArr[0])[1] = false;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m153b(Object[] objArr) {
        objArr[0] = new int[10];
    }

    public static void j() {
        r.a();
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static final void m154c(Object[] objArr) {
        objArr[1] = null;
        r.b();
    }

    public static final void a(Object[] objArr, int i2, int i3) {
        ((int[]) objArr[0])[1] = i3;
        ((int[]) objArr[0])[2] = i2;
        if ((i3 == 2 || i3 == 1) && (i2 == 3 || i2 == 1)) {
            t.a(15, 0);
        } else {
            t.a(14, 0);
        }
        if (i2 == 1) {
            t.a(13, 0);
        } else if ((i3 == 2 || i3 == 1) && i2 == 3) {
            t.a(37, 0);
        }
        String strA = "";
        switch (((int[]) objArr[0])[1]) {
            case 1:
                if (((int[]) objArr[0])[2] == 0) {
                    strA = t.m87a(141);
                } else if (((int[]) objArr[0])[2] == 1) {
                    aY = m135d() % 6;
                    String string = new StringBuffer().append(t.m87a(f475am[m135d() % f475am.length])).append("\\n").append(t.m87a(142)).toString();
                    int i4 = P - Q;
                    Q = P;
                    String[] strArr = new String[6];
                    strArr[0] = m141a(Z);
                    strArr[1] = m141a(Y);
                    strArr[2] = new StringBuffer().append(i4 >= 0 ? "+" : "-").append(Math.abs(i4)).toString();
                    strArr[3] = j.m53a(aY);
                    strArr[4] = Integer.toString((f / 5) + 1);
                    strArr[5] = Integer.toString(f + 1);
                    strA = t.a(string, strArr);
                } else if (((int[]) objArr[0])[2] == 3) {
                    aY = m135d() % 6;
                    String strM87a = t.m87a(144);
                    Q = P;
                    strA = t.a(strM87a, new String[]{m141a(Z), m141a(Y), j.m53a(aY), Integer.toString((f / 5) + 1), Integer.toString(f + 1)});
                } else if (((int[]) objArr[0])[2] == 2) {
                    strA = t.a(new StringBuffer().append(t.m87a(f474al[m135d() % f474al.length])).append("\\n").append(t.m87a(143)).toString(), new String[]{m141a(Z), m141a(Y)});
                }
                break;
            case 2:
                if (((int[]) objArr[0])[2] == 0) {
                    strA = t.a(t.m87a(145), new String[]{Integer.toString(5)});
                } else if (((int[]) objArr[0])[2] == 2) {
                    strA = t.a(new StringBuffer().append(t.m87a(f474al[m135d() % f474al.length])).append("\\n").append(t.m87a(146)).toString(), new String[]{Integer.toString(DCWall3D.f8a), Integer.toString(o + 1), m141a(Y)});
                } else if (((int[]) objArr[0])[2] == 1) {
                    strA = t.a(t.m87a(150), new String[]{Integer.toString(DCWall3D.f8a)});
                } else if (((int[]) objArr[0])[2] == 4) {
                    strA = t.m87a(147);
                } else if (((int[]) objArr[0])[2] == 5) {
                    strA = t.a(t.m87a(148), new String[]{m141a(Y)});
                } else if (((int[]) objArr[0])[2] == 3) {
                    strA = t.a(t.m87a(149), new String[]{Integer.toString(o + 1), m141a(Y), Integer.toString(DCWall3D.f8a)});
                }
                break;
            case 3:
                if (((int[]) objArr[0])[2] == 0) {
                    strA = t.a(t.m87a(151), new String[]{Integer.toString(new int[]{100, 100, 140, 150}[n - 1]), t.m87a(new int[]{327, 328, 329, 330}[n - 1])});
                } else if (((int[]) objArr[0])[2] == 2) {
                    strA = t.a(new StringBuffer().append(t.m87a(f474al[m135d() % f474al.length])).append("\\n").append(t.m87a(152)).toString(), new String[]{Integer.toString(bf + 1), Integer.toString(bn >> 2), Integer.toString(i / 1000)});
                }
                break;
        }
        ((int[]) objArr[0])[6] = 0;
        ((int[]) objArr[0])[7] = 0;
        objArr[1] = n.a(strA, DCWall3D.f7c, aA - 16);
        r.a(((String[]) objArr[1])[0]);
        int iM135d = 1;
        switch (((int[]) objArr[0])[2]) {
            case 1:
                iM135d = m135d() % 4;
                break;
            case 2:
                iM135d = 4;
                break;
            case 4:
                iM135d = 3;
                break;
            case 5:
                iM135d = 2;
                break;
        }
        r.b(iM135d);
        ((int[]) objArr[0])[3] = 0;
        ((int[]) objArr[0])[4] = 0;
        ((int[]) objArr[0])[5] = 0;
        ((int[]) objArr[0])[9] = 0;
        ((int[]) objArr[0])[8] = 0;
        ((int[]) objArr[0])[0] = -1;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final int m155a(Object[] objArr, int i2) {
        ((int[]) objArr[0])[9] = ((int[]) objArr[0])[9] + i2;
        switch (((int[]) objArr[0])[8]) {
            case 0:
                if (((int[]) objArr[0])[9] >= 500) {
                    ((int[]) objArr[0])[9] = 0;
                    ((int[]) objArr[0])[8] = 1;
                }
                break;
            case 1:
                ((int[]) objArr[0])[3] = ((int[]) objArr[0])[3] + i2;
                ((int[]) objArr[0])[5] = ((int[]) objArr[0])[5] + i2;
                j.j(i2);
                if (((int[]) objArr[0])[7] >= ((String[]) objArr[1]).length) {
                    if (((int[]) objArr[0])[2] == 5) {
                        if (r.f266a != 5) {
                            r.b(5);
                        }
                    } else if (r.f266a != 0) {
                        r.b(0);
                    }
                    DCWall3D.c();
                } else if (((int[]) objArr[0])[6] >= ((String[]) objArr[1])[((int[]) objArr[0])[7]].length()) {
                    ((int[]) objArr[0])[4] = ((int[]) objArr[0])[4] + i2;
                    if (((int[]) objArr[0])[4] >= 700) {
                        ((int[]) objArr[0])[4] = 0;
                        ((int[]) objArr[0])[3] = 0;
                        ((int[]) objArr[0])[6] = 0;
                        ((int[]) objArr[0])[7] = ((int[]) objArr[0])[7] + 1;
                        if (((int[]) objArr[0])[7] < ((String[]) objArr[1]).length) {
                            r.a(((String[]) objArr[1])[((int[]) objArr[0])[7]]);
                        }
                    }
                } else {
                    while (((int[]) objArr[0])[3] > 0) {
                        ((int[]) objArr[0])[3] = ((int[]) objArr[0])[3] - 40;
                        ((int[]) objArr[0])[6] = ((int[]) objArr[0])[6] + 1;
                    }
                }
                r.a(i2);
                break;
        }
        int i3 = -1;
        if (((int[]) objArr[0])[0] == 3) {
            i3 = 6;
        } else if (((int[]) objArr[0])[0] == 1) {
            switch (((int[]) objArr[0])[2]) {
                case 2:
                case 5:
                    i3 = 4;
                    break;
            }
        }
        if (i3 == -1) {
            if (((int[]) objArr[0])[1] == 1) {
                if (((int[]) objArr[0])[2] == 3) {
                    if (((int[]) objArr[0])[0] == 1) {
                        i3 = 10;
                    } else if (((int[]) objArr[0])[0] == 2) {
                        i3 = 9;
                    }
                } else if (((int[]) objArr[0])[2] == 0 && ((int[]) objArr[0])[0] == 1) {
                    i3 = 9;
                }
            } else if (((int[]) objArr[0])[1] == 3) {
                if (((int[]) objArr[0])[0] == 1) {
                    i3 = 11;
                }
            } else if (((int[]) objArr[0])[1] == 2) {
                if (((int[]) objArr[0])[2] == 3 || ((int[]) objArr[0])[2] == 1) {
                    if (((int[]) objArr[0])[0] == 1) {
                        i3 = 8;
                    } else if (((int[]) objArr[0])[0] == 2) {
                        i3 = 7;
                    }
                } else if (((int[]) objArr[0])[2] == 0 && ((int[]) objArr[0])[0] == 1) {
                    i3 = 7;
                }
            }
        }
        if (i3 == -1 && ((int[]) objArr[0])[0] == 1) {
            switch (((int[]) objArr[0])[2]) {
                case 0:
                case 1:
                case 3:
                case 4:
                    i3 = 5;
                    break;
            }
        }
        ((int[]) objArr[0])[0] = -1;
        return i3;
    }

    public static final void a(Object[] objArr, Graphics graphics) {
        switch (((int[]) objArr[0])[8]) {
            case 0:
                graphics.setColor(0);
                graphics.fillRect(0, 0, aA, aB);
                graphics.setColor(16777215);
                if (((int[]) objArr[0])[9] < 200) {
                    graphics.drawLine(aA >> 1, aB >> 1, aA >> 1, aB >> 1);
                } else if (((int[]) objArr[0])[9] >= 200 && ((int[]) objArr[0])[9] < 300) {
                    graphics.drawLine(aA >> 2, aB >> 1, (aA * 3) >> 2, aB >> 1);
                } else if (((int[]) objArr[0])[9] >= 300 && ((int[]) objArr[0])[9] < 400) {
                    graphics.fillRect(0, (aB * 3) >> 3, aA, aB >> 2);
                } else {
                    graphics.fillRect(0, 0, aA, aB);
                }
                break;
            case 1:
                j.a(graphics, DCWall3D.f19a);
                m.a(graphics);
                r.a(graphics);
                m.b(graphics);
                a(objArr, graphics, false);
                a(objArr, graphics, true);
                break;
        }
    }

    public static final void b(Object[] objArr, int i2, int i3) {
        if (i3 == 0 && t.m86a(i2) == 53) {
            ((int[]) objArr[0])[0] = 1;
        }
        if (i3 == 3) {
            if (i2 == 1 || i2 == 14 || i2 == 15) {
                ((int[]) objArr[0])[0] = 1;
            } else if (i2 == 13) {
                ((int[]) objArr[0])[0] = 3;
            } else if (i2 == 37) {
                ((int[]) objArr[0])[0] = 2;
            }
        }
    }

    public static void k() {
        if (!a) {
            e.a(0, new int[]{C + D + E + F}, null);
            if (m == 1) {
                e.a(2, new int[]{Y}, null);
            } else if (m == 2) {
                e.a(1, new int[]{Y}, null);
            } else if (m == 3) {
                e.a(3, new int[]{i / 1000}, null);
            }
        }
        if (m == 1) {
            if (!h) {
                x = 0;
                y = 0;
            } else {
                x = Y;
                w = X;
                y = Z;
            }
        }
    }

    private static void a(Object[] objArr, Graphics graphics, boolean z2) {
        int iB = (DCWall3D.f7c.b() >> 1) << 1;
        int i2 = (aB >> 1) + iB;
        int iMin = Math.min(((int[]) objArr[0])[7], ((String[]) objArr[1]).length - 1);
        while (iMin >= 0) {
            int i3 = i2 - iB;
            i2 = i3;
            if (i3 < 0) {
                return;
            }
            if ((!z2 || iMin == ((int[]) objArr[0])[7]) && (z2 || iMin != ((int[]) objArr[0])[7])) {
                String strSubstring = ((String[]) objArr[1])[iMin].substring(0, Math.min(((int[]) objArr[0])[7] == iMin ? ((int[]) objArr[0])[6] : ((String[]) objArr[1])[iMin].length(), ((String[]) objArr[1])[iMin].length()));
                DCWall3D.f7c.a(graphics, strSubstring, 8, i2, 20);
                if (((int[]) objArr[0])[7] == iMin && ((int[]) objArr[0])[5] % 200 < 100) {
                    DCWall3D.f7c.a(graphics, "_", 8 + DCWall3D.f7c.a(strSubstring), i2, 20);
                }
            }
            iMin--;
        }
    }
}
