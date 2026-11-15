package defpackage;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.Background;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.PolygonMode;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.Transform;

/* JADX INFO: loaded from: bbr-3d.jar:h.class */
public final class h {
    private static int h;
    private static int i;
    private static n f;
    public static n g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static n f76h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public static n f77i;
    public static n j;
    private static t[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static r[][] f78a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static t f79a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static t f80b;
    private static int aX;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static r f81a;
    private static int aY;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static Appearance[] f82a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static Appearance f83a;
    private static t c;
    private static t d;
    public static t e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static t f84f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public static t f85g;
    public static int aZ;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image[] f86a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static m f89a;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static float f90d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static float f91e;
    private static int ba;
    private static int bb;
    private static int bc;
    private static int bd;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static t f92h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static t f93i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static t f94j;
    private static t k;
    public static t l;
    private static t m;
    private static t n;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Texture2D[] f95a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Texture2D[] f96b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static Texture2D[] f97c;
    public static int be;
    private static int bf;
    private static t o;
    private static t p;
    public static t q;
    public static t r;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static Texture2D f98a;
    private static t s;
    private static t t;
    private static t u;
    private static t v;
    private static int bg;
    public static t w;
    public static t x;
    public static t y;
    public static t z;
    public static t A;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private static n f99k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private static n f100l;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private static n f101m;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private static n f102n;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static n[] f103c;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private static n f104o;
    private static int bh;
    public static int bi;
    public static int bj;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    private static n f105p;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    private static n f106q;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Background f107b;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static int[][] f108j;
    private static int bp;
    private static boolean E;
    private static int bq;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static String[] f109c;
    private static int bw;
    public static int by;
    public static int bz;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static float f111f;
    private static int bD;
    private static int bE;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static String f115c;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public static float f116g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static float f117h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public static float f118i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public static float f119j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public static float f120k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    public static float f121l;
    private static float[] b = new float[4];
    private static int[] T = new int[300];
    public static int[] U = new int[4];
    private static boolean B = false;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static Transform f87c = new Transform();

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static int[][] f88i = new int[3][3];
    private static int bk = 0;
    private static int bl = 0;
    private static boolean C = false;
    private static int bm = 0;
    private static int bn = 0;
    private static int bo = 0;
    private static final int[] V = {262336, 262338, 262340, 262342, 327681, 327683, 327685, 327687, 327689, 327691, 327693, 327695, 327697, 327699, 327701, 327703, 327705, 327707, 327709, 327711, 327713, 327715, 327717, 327719, 327721, 327723};
    private static int[] W = {262221, 262227, 262234, 262236, 262238, 262243, 262251, 262263, -1, -1, 262269, 262277, 262285, 262292, 262295, 262300, 262304, 262308, 262309, 262310, 262312, 262318, -1, 262323, 262327, 262328, 262329};
    private static int[] X = new int[300];
    private static boolean D = false;
    private static boolean F = false;
    private static int[] Y = new int[2];
    private static int[] Z = new int[2];
    private static int[] aa = new int[2];
    private static int[] ab = new int[2];
    private static int br = 0;
    private static int[] ac = new int[150];
    private static int[] ad = new int[150];
    private static int[] ae = new int[25];
    private static int bs = 0;
    private static int bt = 0;
    private static int bu = 0;
    private static int bv = 0;
    private static int[] af = new int[20];
    private static int[] ag = {171, 173, 186, 205, 168, 175, 203, 179, -1, -1, 188, 181, 177, 190, 183, 196, 198, 200, 202, 213, 192, 194, -1, 206, 210, 208, 230, 215, 217, 219, 221, 223, 225, 227, 229};
    public static int bx = 0;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private static final int[][] f110k = {new int[]{2236962, 0}, new int[]{2236962, 0}, new int[]{2236962, 0}, new int[]{2236962, 0}};

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private static final int[][] f112l = {new int[0], new int[]{0}, new int[]{0, 180}, new int[]{0, 90, 270}, new int[]{0, 90, 180, 270}, new int[]{0, 80, 150, 210, 280}, new int[]{0, 30, 110, 180, 255, 330}, new int[]{0, 30, 100, 150, 210, 260, 330}};
    private static int bA = 1000;
    private static int bB = 0;
    private static int bC = 0;
    private static boolean G = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean[] f113a = new boolean[7];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean[] f114b = new boolean[7];
    private static int[] ah = new int[7];
    private static int[] ai = new int[7];
    private static int[] aj = new int[7];
    private static int[] ak = new int[7];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final float[][] f122a = {new float[]{0.6f, 12.5f, 1.0f}, new float[]{12.0f, 13.5f, 0.5f}, new float[]{13.0f, 20.1f, 0.8f}, new float[]{19.5f, 1000.0f, 0.5f}};
    private static final int[] al = {2, 3, 1, 0};

    private static final void reset() {
        x();
        bD = 0;
        G = false;
        for (int i2 = 0; i2 < 30; i2++) {
            X[i2 * 10] = 0;
        }
        z();
        for (int i3 = 0; i3 < 5; i3++) {
            af[(i3 << 2) + 2] = 0;
        }
        u();
        v();
        bz = 0;
    }

    private static final float a(Object[] objArr) {
        switch (q.m45b(objArr)) {
            case 2:
                return 150.0f;
            case 3:
                return 200.0f;
            default:
                return 100.0f;
        }
    }

    public static final float a(int i2) {
        return i2 * q.dy * 0.277f;
    }

    public static final float b(int i2) {
        return i2 * q.dz * 0.277f;
    }

    public static final float c(int i2) {
        return i2 * 0.277f;
    }

    public static final float d(int i2) {
        return i2 * 0.277f;
    }

    private static float e(int i2) {
        return (q.q[i2][4] + (q.q[i2][14] / 2)) * 0.277f;
    }

    public static void c(int i2, int i3) {
        h = i2;
        i = i3;
        bw = 0;
        q.as();
        g = new n(c.a(new int[]{262210}), true);
        f76h = new n(c.a(new int[]{262207}), true);
        f = new n(c.a(new int[]{262159}), true);
        f77i = new n(c.a(262151));
        j = new n(c.a(196628));
        a = new t[g.k[4]];
        for (int i4 = 0; i4 < a.length; i4++) {
            a[i4] = new t();
            g.y(i4);
            a[i4].a(g);
            a[i4].aE();
        }
        f108j = new int[15][15];
        z();
    }

    public static final void n() {
        f109c = new String[ag.length];
        for (int i2 = 0; i2 < ag.length; i2++) {
            f109c[i2] = p.c(ag[i2]);
        }
        q.aq();
    }

    private static final void d(int i2, int i3) {
        float f2;
        float f3;
        a(6, true, 500, 2236962);
        Object[] objArr = q.c[i2];
        int i4 = ((int[]) objArr[0])[1];
        int i5 = ((int[]) objArr[0])[2];
        int iM45b = q.m45b(objArr);
        float f4 = i4 * 0.277f;
        switch (q.m45b(objArr)) {
            case 2:
            case 3:
                f2 = 200.0f;
                break;
            default:
                f2 = 90.0f;
                break;
        }
        int i6 = (int) (f4 + (f2 * 0.5f));
        int iA = (int) (a(objArr) * 0.5f);
        float f5 = i5 * 0.277f;
        switch (q.m45b(objArr)) {
            case 3:
                f3 = 300.0f;
                break;
            default:
                f3 = 150.0f;
                break;
        }
        int i7 = (int) (f5 + (f3 * 0.5f));
        bz = 700;
        int iM46c = q.m46c(objArr);
        if (iM46c == 1) {
            b(i6, i7, 512, 50, 400, 24, 0, 2);
            aX = 1500;
        } else if (iM46c == 6) {
            b(i6, i7, 512, 50, 400, 24, 0, 2);
        } else {
            if ((iM46c != 4 && iM46c != 5) || q.f(objArr) >= 1) {
                int i8 = bp * 10;
                X[i8] = 1;
                X[i8 + 1] = i6;
                X[i8 + 2] = iA;
                X[i8 + 3] = i7;
                X[i8 + 8] = iM45b + (i3 << 16);
                X[i8 + 4] = 0;
                X[i8 + 5] = 0;
                X[i8 + 6] = 0;
                X[i8 + 7] = 1;
                X[i8 + 9] = i2;
                int i9 = bp + 1;
                bp = i9;
                bp = i9 % 30;
            }
            a(0, i6, iA, i7, 3, 1);
        }
        if (q.ff == 2) {
            D = true;
        }
    }

    public static void o() {
        reset();
        E = false;
        F = false;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static void m21e(int i2) {
        if (q.fe == 1) {
            bm = 0;
            bn = i2;
            bo = 1;
        }
    }

    public static void p() {
        D = false;
        F = true;
        reset();
    }

    public static void c(int i2, int i3, int i4) {
        switch (i2 & 255) {
            case 10:
                int i5 = i2 >> 8;
                switch (i5) {
                    case 0:
                    case 1:
                    case 21:
                        break;
                    default:
                        a(3, true, 400, 1118481);
                        a(5, true, 400, 1118481);
                        break;
                }
                h(i5);
                break;
            case 12:
                if (q.ap) {
                    e((int) (b(1) / 3.0f), i4);
                } else {
                    e((int) (b(1) / 3.0f), i4);
                }
                break;
            case 30:
                j(2);
                break;
            case 33:
                j(3);
                x();
                a(0, false, 1000, 16777215);
                a(1, false, 1000, 16777215);
                a(2, false, 1000, 16777215);
                a(3, false, 1000, 16777215);
                a(4, false, 1000, 16777215);
                a(5, false, 1000, 16777215);
                u();
                v();
                break;
            case 34:
                d(i3, i4);
                break;
            case 35:
                Object[] objArr = q.c[i4];
                int i6 = ((int[]) objArr[0])[1];
                int i7 = ((int[]) objArr[0])[2];
                int i8 = (int) (i6 * 0.277f);
                int i9 = (int) (i7 * 0.277f);
                int i10 = bv << 2;
                af[i10] = i8;
                af[i10 + 1] = i9;
                af[i10 + 2] = 500;
                af[i10 + 3] = i3;
                int i11 = bv + 1;
                bv = i11;
                bv = i11 % 5;
                break;
            case 37:
                d(i3, i4);
                break;
            case 40:
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 5) {
                                if (i3 != 11) {
                                    if (i3 == 7) {
                                        F = false;
                                    } else if (i3 == 9) {
                                        F = false;
                                    }
                                    break;
                                } else {
                                    j(4);
                                    if (q.de == 1 && q.A[q.fd][0] == 3) {
                                        a(6, true, 400, 16777215);
                                        h(19);
                                        break;
                                    }
                                }
                            } else {
                                D = false;
                                for (int i12 = 0; i12 < 30; i12++) {
                                    int i13 = i12 * 10;
                                    if (X[i13] == 1 && X[i13 + 6] < X[i13 + 5] && (X[i13 + 9] != -1 || X[i13 + 9] == -1)) {
                                        X[i13] = 0;
                                    }
                                }
                                bm = 0;
                                bn = i4;
                                switch (q.fe) {
                                    case 1:
                                    case 3:
                                    case 4:
                                        bo = 1;
                                        break;
                                    case 2:
                                        bo = 2;
                                        break;
                                }
                            }
                        } else {
                            p();
                            break;
                        }
                    } else {
                        m21e(i4);
                        break;
                    }
                } else {
                    o();
                    break;
                }
                break;
            case 71:
                if (!E) {
                    E = true;
                }
                break;
            case 74:
                D = true;
                break;
            case 76:
                x();
                a(0, false, i3, 16777215);
                a(1, false, i3, 16777215);
                a(2, false, i3, 16777215);
                a(3, false, i3, 16777215);
                a(4, false, i3, 16777215);
                a(5, false, i3, 16777215);
                break;
            case 77:
                x();
                a(0, true, i3, 16777215);
                a(1, true, i3, 16777215);
                a(2, true, i3, 16777215);
                a(3, true, i3, 16777215);
                a(4, true, i3, 16777215);
                a(5, true, i3, 16777215);
                break;
            case 78:
                bm = 0;
                bn = i3;
                bo = 2;
                break;
            case 83:
                f(i4 / 4, i3);
                break;
            case 84:
                f(i4 / 4, i3);
                break;
            case 85:
                f((-i4) / 4, i3);
                break;
        }
    }

    private static final void e(int i2, int i3) {
        Y[i3] = 200;
        Z[i3] = 200;
        aa[i3] = i2;
    }

    public static final void q() {
        if (f82a == null || f83a == null) {
            CompositingMode compositingMode = new CompositingMode();
            compositingMode.setBlending(68);
            compositingMode.setDepthTestEnable(true);
            compositingMode.setDepthWriteEnable(true);
            compositingMode.setAlphaWriteEnable(false);
            PolygonMode polygonMode = new PolygonMode();
            polygonMode.setCulling(161);
            if (f83a == null) {
                Appearance appearance = new Appearance();
                f83a = appearance;
                appearance.setPolygonMode(polygonMode);
                f83a.setCompositingMode(compositingMode);
            }
            if (f82a == null) {
                Appearance[] appearanceArr = new Appearance[V.length];
                f82a = appearanceArr;
                appearanceArr[0] = new Appearance();
                f82a[0].setPolygonMode(polygonMode);
                Image imageCreateImage = Image.createImage(256, 256);
                Graphics graphics = imageCreateImage.getGraphics();
                for (int i2 = 0; i2 < V.length; i2++) {
                    graphics.drawImage(c.a(V[i2], 0, 65536), r.l[i2 << 1], r.l[(i2 << 1) + 1], 20);
                }
                f82a[0].setTexture(0, new Texture2D(new Image2D(99, imageCreateImage)));
                f82a[0].setCompositingMode(compositingMode);
                System.gc();
            }
        }
    }

    public static final void r() {
        if (f78a == null) {
            f78a = new r[3][8];
            for (int i2 = 0; i2 < 8; i2++) {
                if (i2 == 7) {
                    f78a[0][i2] = new r();
                    f78a[0][i2].o(2, i2);
                    f78a[1][i2] = new r();
                    f78a[1][i2].o(1, i2);
                }
                if (i2 == 7 || i2 == 0 || i2 == 5) {
                    f78a[2][i2] = new r();
                    f78a[2][i2].o(0, i2);
                }
            }
        }
    }

    public static final void s() {
        if (q == null) {
            q = new t(131077);
            f98a = t.a(327787, false);
            q.a(f98a);
            t tVar = new t(131100);
            r = tVar;
            tVar.a(f98a);
            r.aC();
            Background background = new Background();
            f107b = background;
            background.setDepthClearEnable(true);
            f107b.setColorClearEnable(false);
        }
    }

    public static final void t() {
        if (n == null) {
            n = new t(65539);
            Texture2D[] texture2DArr = new Texture2D[7];
            f95a = texture2DArr;
            texture2DArr[0] = t.a(327729, true);
            f95a[1] = t.a(327735, true);
            f95a[2] = t.a(327725, true);
            f95a[3] = t.a(327739, true);
            f95a[4] = t.a(327761, true);
            f95a[5] = t.a(327807, true);
            n.a(f95a[0]);
            n.aE();
        }
    }

    private static void b(Graphics graphics, int i2, int i3) {
        if (i2 >= i3) {
            return;
        }
        int iMax = Math.max(0, (f86a.length * ((i3 - 1) - i2)) / i3);
        int height = f86a[0].getHeight();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= i) {
                return;
            }
            graphics.drawImage(f86a[iMax], 0, i5, 20);
            i4 = i5 + height;
        }
    }

    public static void f(int i2) {
        if (B) {
            return;
        }
        switch (i2) {
            case 0:
                int i3 = h;
                int i4 = (i + 8) / 8;
                f86a = new Image[16];
                for (int i5 = 0; i5 < 16; i5++) {
                    byte[] bArr = new byte[(i3 * i4) << 2];
                    int i6 = (127 * (i5 + 1)) / 16;
                    int i7 = 0;
                    for (int i8 = 0; i8 < i3 * i4; i8++) {
                        int i9 = i7;
                        int i10 = i7 + 1;
                        bArr[i9] = -1;
                        int i11 = i10 + 1;
                        bArr[i10] = -1;
                        int i12 = i11 + 1;
                        bArr[i11] = -1;
                        i7 = i12 + 1;
                        bArr[i12] = (byte) i6;
                    }
                    byte[] bArrA = c.a(null, bArr, i3, i4, 255, 0, 0, 65536);
                    f86a[i5] = Image.createImage(bArrA, 0, bArrA.length);
                }
                f84f = new t(131088);
                f85g = new t(131089);
                f84f.a(t.a(327757, false));
                f85g.setColor(0);
                f85g.aE();
                y = new t(65540);
                Texture2D[] texture2DArr = new Texture2D[5];
                f96b = texture2DArr;
                texture2DArr[0] = t.a(327727, false);
                f96b[1] = t.a(327731, false);
                f96b[2] = t.a(327737, false);
                f96b[3] = t.a(327733, false);
                y.a(f96b[0]);
                t tVar = new t(131093);
                A = tVar;
                tVar.setColor(0);
                t tVar2 = new t(65541);
                z = tVar2;
                tVar2.setColor(16777215);
                z.aE();
                s();
                c = new t(131097);
                d = new t(131098);
                m mVar = new m();
                f89a = mVar;
                mVar.G();
                f89a.aE();
                new t().P(54);
                break;
            case 1:
                t tVar3 = new t(131094);
                e = tVar3;
                tVar3.R(327781);
                break;
            case 2:
                t tVar4 = new t(131092);
                f94j = tVar4;
                tVar4.aE();
                f94j.aC();
                k = new t(131096);
                t tVar5 = new t();
                f92h = tVar5;
                tVar5.b(new int[][]{new int[]{0, 0, (int) (a(1) * 0.2f), (int) b(1)}});
                t tVar6 = new t(131091);
                f93i = tVar6;
                tVar6.a(t.a(327745, false));
                short sA = (short) a(1);
                short sB = (short) b(1);
                t tVar7 = new t();
                l = tVar7;
                tVar7.b(new int[][]{new int[]{-sA, -sB, sA << 1, sB}});
                l.a(t.a(327763, false));
                l.aC();
                l.aE();
                t tVar8 = new t();
                m = tVar8;
                tVar8.b(new int[][]{new int[]{-sA, -sB, sA << 1, sB}});
                m.aC();
                m.aE();
                t tVar9 = new t();
                o = tVar9;
                tVar9.O(200);
                o.setColor(16777215);
                t tVar10 = new t();
                p = tVar10;
                tVar10.b(new int[][]{new int[]{-54, -54, 108, 108}});
                p.aC();
                break;
            case 3:
                Texture2D[] texture2DArr2 = new Texture2D[4];
                f97c = texture2DArr2;
                texture2DArr2[0] = t.a(327741, false);
                f97c[1] = t.a(327753, false);
                f97c[2] = t.a(327749, false);
                f97c[3] = t.a(327747, false);
                break;
            case 4:
                t tVar11 = new t(131078);
                s = tVar11;
                tVar11.a(t.a(327751, false));
                t = new t(131079);
                u = new t(131080);
                t.a(t.a(327755, false));
                u.a(t.a(327755, false));
                t tVar12 = new t(131081);
                v = tVar12;
                tVar12.a(t.a(327743, false));
                w = new t(131083);
                x = new t(131082);
                w.a(t.a(327759, false));
                x.a(t.a(327759, false));
                break;
            case 5:
                r();
                break;
            case 6:
                q();
                break;
            case 7:
                t();
                t tVar13 = new t(131099);
                f79a = tVar13;
                tVar13.setColor(0);
                f79a.a(f95a[5]);
                f79a.aE();
                t tVar14 = new t(131101);
                f80b = tVar14;
                tVar14.R(327809);
                break;
            case 8:
                f99k = new n(c.a(new int[]{262187}), true);
                f100l = new n(c.a(new int[]{262191}), true);
                f101m = new n(c.a(new int[]{262195}), true);
                f102n = new n(c.a(new int[]{196643}), true);
                f103c = new n[W.length];
                for (int i13 = 0; i13 < W.length; i13++) {
                    if (W[i13] != -1) {
                        f103c[i13] = new n(c.a(new int[]{W[i13]}), true);
                    }
                }
                f105p = new n(c.a(new int[]{327767, 327777, 327771, 327779, 327773, 327769, 327765, 327775}), true);
                bx = 0;
                break;
            case 9:
                f104o = new n(c.a(196626));
                if (f81a == null) {
                    r rVar = new r();
                    f81a = rVar;
                    rVar.ax();
                }
                break;
            case 10:
                B = true;
                break;
        }
    }

    private static void u() {
        for (int i2 = 0; i2 < 50; i2++) {
            int i3 = (int) (q.r[0][4] * 0.277f);
            int i4 = (int) (q.r[0][5] * 0.277f);
            int i5 = i2 << 1;
            ad[i5] = i3;
            ad[i5 + 1] = i4;
        }
    }

    private static boolean a() {
        return q.eW > 0;
    }

    private static void v() {
        for (int i2 = 0; i2 < 5; i2++) {
            ae[(i2 << 2) + 2] = -100;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static final float m22a() {
        return q.r[m29d()][4] * 0.277f;
    }

    private static final float b() {
        float f2 = q.da / 1000.0f;
        return (((-f2) * f2) + f2) * 2000.0f;
    }

    private static final float c() {
        return q.r[m29d()][5] * 0.277f;
    }

    private static void a(int i2, int i3, int i4, int i5, int i6, int i7, Graphics graphics) {
        graphics.setColor(16777215);
        graphics.fillRect(i2 - 1, i3 - 1, i4 + 2, 1);
        graphics.fillRect(i2, i3 - 2, i4, 1);
        graphics.fillRect(i2 - 1, i3, 1, i5);
        graphics.fillRect(i2 - 2, i3 + 1, 1, i5 - 2);
        graphics.fillRect(i2 + i4, i3, 1, i5);
        graphics.fillRect(i2 + i4 + 1, i3 + 1, 1, i5 - 2);
        graphics.fillRect(i2 - 1, i3 + i5, i4 + 2, 1);
        graphics.fillRect(i2, i3 + i5 + 1, i4, 1);
        graphics.setColor(i7);
        graphics.fillRect(i2, i3, i4, i5);
        f103c[i6].c(graphics, i2 + f103c[6].k[0], i3 + f103c[6].k[1]);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static final boolean m23c(int i2) {
        for (int i3 = 0; i3 < q.ax.length; i3++) {
            if (q.ax[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static void a(float f2, float f3, float f4, int i2) {
        o.setIdentity();
        o.postTranslate(f2, f3, f4);
        o.postScale(0.1f + (i2 * 0.0078125f), 1.0f, 0.1f + (i2 * 0.0078125f));
        o.aF();
    }

    public static final void w() {
        e.a(p.i(), p.m());
    }

    private static final void a(int i2, float f2, float f3, float f4, boolean z2) {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i2; i5 > 0; i5 /= 10) {
            i4 *= 10;
            i3++;
        }
        float fA = a(1) * 1.8f;
        float f5 = f2 - (i3 * fA);
        if (z2) {
            f5 += (i3 - 1) * fA;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            i4 /= 10;
            int i7 = (i2 / i4) % 10;
            a[i7].setIdentity();
            a[i7].postTranslate(f5, 0.0f, f4);
            a[i7].postScale(0.7f, 0.7f, 0.7f);
            a[i7].aF();
            f5 += fA;
        }
    }

    private static int b(int i2, int i3, int i4) {
        int i5 = i - i3;
        int iMin = ((bz * 60) / 1000) + ((Math.min(aZ, 500) * 60) / 1000);
        if (q.eP > 0) {
            iMin += ((1600 - q.eP) * 255) / 1600;
        }
        int i6 = (i5 * 100) / i;
        int[] iArr = q.D[i2];
        if (q.fg == 3 || q.eb == 16) {
            iArr = q.bF;
        }
        for (int i7 = 1; i7 < iArr.length / 2; i7++) {
            if (i5 < (iArr[(i7 << 1) + 1] * i) / 100) {
                int i8 = iArr[(i7 - 1) << 1];
                int i9 = iArr[i7 << 1];
                int i10 = i8 >> 16;
                int i11 = (i8 >> 8) & 255;
                int i12 = i8 & 255;
                int i13 = i9 >> 16;
                int i14 = (i9 >> 8) & 255;
                int i15 = i9 & 255;
                int i16 = iArr[(i7 << 1) + 1] - iArr[((i7 - 1) << 1) + 1];
                int i17 = i6 - iArr[((i7 - 1) << 1) + 1];
                return (Math.max(0, Math.min(255, ((i4 + iMin) + i10) + (((i13 - i10) * i17) / i16))) << 16) | (Math.max(0, Math.min(255, ((i4 + iMin) + i11) + (((i14 - i11) * i17) / i16))) << 8) | Math.max(0, Math.min(255, i4 + iMin + i12 + (((i15 - i12) * i17) / i16)));
            }
        }
        return iArr[iArr.length - 1];
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static int m24c() {
        return q.de == 2 ? bx % q.D.length : by;
    }

    private static final void f(int i2, int i3) {
        bB = i2;
        bA = i3;
        bC = 0;
        G = true;
    }

    public static final void g(int i2) {
        bz = i2;
    }

    private static final void a(int i2, boolean z2, int i3, int i4) {
        if (f113a[i2]) {
            return;
        }
        f113a[i2] = true;
        f114b[i2] = z2;
        ai[i2] = 0;
        aj[i2] = i3;
        ah[i2] = 1;
        ak[i2] = i4;
    }

    private static final void x() {
        for (int i2 = 0; i2 < 7; i2++) {
            f113a[i2] = false;
        }
    }

    public static final void h(int i2) {
        bD = 1;
        f115c = f109c[i2];
        bE = 0;
    }

    public static final void i(int i2) {
        bD = 1;
        f115c = m25a(i2);
        bE = 500;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final String m25a(int i2) {
        return f109c[(i2 + ag.length) - 8];
    }

    private static void a(n nVar, Graphics graphics, int i2, int i3, int i4) {
        short[] sArr = nVar.k;
        if (sArr == null) {
            return;
        }
        int i5 = i2 - ((sArr[0] * i4) >> 8);
        int i6 = i3 - ((sArr[1] * i4) >> 8);
        int i7 = nVar.cq + (sArr[nVar.cq] * 5) + 1;
        int i8 = sArr[i7];
        while (true) {
            i8--;
            if (i8 < 0) {
                return;
            }
            int i9 = i7 + 1;
            short s2 = sArr[i9];
            int i10 = i9 + 2 + 1;
            int i11 = (sArr[i10] * i4) >> 8;
            int i12 = i10 + 1;
            int i13 = (sArr[i12] * i4) >> 8;
            int i14 = i12 + 1;
            int i15 = (sArr[i14] * i4) >> 8;
            i7 = i14 + 1;
            int i16 = (sArr[i7] * i4) >> 8;
            if (s2 == 4) {
                graphics.drawLine(i5 + i11, i6 + i13, i5 + i15, i6 + i16);
            } else if (s2 == 3) {
                graphics.drawRect(i5 + i11, i6 + i13, i15, i16);
            } else if (s2 == 2) {
                graphics.fillRect(i5 + i11, i6 + i13, i15, i16);
            } else if (s2 == 5) {
            }
        }
    }

    private static final void b(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = br * 10;
        ac[i10] = i2;
        ac[i10 + 1] = i3;
        ac[i10 + 2] = i4;
        ac[i10 + 3] = i5;
        ac[i10 + 4] = 0;
        ac[i10 + 5] = i6;
        ac[i10 + 7] = i7;
        ac[i10 + 6] = i9;
        ac[i10 + 8] = i8;
        ac[i10 + 9] = 0;
        int i11 = br + 1;
        br = i11;
        br = i11 % 15;
    }

    public static final void j(int i2) {
        switch (i2) {
            case 2:
                C = false;
                break;
        }
        bl = i2;
        bk = 0;
    }

    public static void k(int i2) {
        bi = Math.max(0, bi - 25);
        bh = Math.max(0, bh - 25);
        if (bi <= 0) {
            bj = 0;
        }
        if (bj > 10) {
            bj = 0;
            bh = 10000;
        }
        bk += 25;
        switch (bl) {
            case 2:
                if (bk > 500 && !C) {
                    C = true;
                }
                if (bk > 1300) {
                    j(1);
                }
                break;
            case 3:
                if (bk > 1000) {
                    j(1);
                }
                break;
            case 4:
                if (bk > 3000) {
                    j(1);
                }
                break;
        }
        m(25);
        aX = Math.max(0, aX - 25);
        for (int i3 = 0; i3 < U.length; i3++) {
            U[i3] = Math.max(0, U[i3] - 25);
        }
        if (bo != 0) {
            int i4 = bm + 25;
            bm = i4;
            if (i4 >= bn) {
                bo = 0;
            }
        }
        bg += 25;
        if (q.eb == 14) {
            if (bg > 100) {
                bg = 0;
                a(3, 0, 0, 0, 1, 1);
            }
        } else if (q.eb == 15) {
            if (bg > 100) {
                bg = 0;
                a(2, 0, 0, 0, 1, 1);
            }
        } else if (E && bg > 100) {
            bg = 0;
            a(5, 0, 0, 0, 1, 1);
        }
        int iMax = Math.max(0, bf - 25);
        bf = iMax;
        if (iMax == 0) {
            bf = 100;
            for (int i5 = 0; i5 < 3; i5++) {
                if (q.r[i5][1] != 0 && a()) {
                    a(i5 + 6, f88i[i5][0], f88i[i5][1], f88i[i5][2], 2, 1);
                }
            }
        }
        f90d = 0.0f;
        f91e = 0.0f;
        if (aZ > 0) {
            int iMin = Math.min(500, aZ);
            f90d = (((q.r() % 2000) - 1000) * iMin) / 10000.0f;
            f91e = (((q.r() % 2000) - 1000) * iMin) / 10000.0f;
        }
        if (q.eV > 0) {
            f90d = (((q.r() % 2000) - 1000) * 400) / 10000.0f;
            f91e = (((q.r() % 2000) - 1000) * 400) / 10000.0f;
        }
        aZ = Math.max(0, aZ - 25);
        for (int i6 = 0; i6 < W.length; i6++) {
            if (f103c[i6] != null) {
                f103c[i6].k(25);
            }
        }
        bw += 25;
        for (int i7 = 0; i7 < 30; i7++) {
            int i8 = i7 * 10;
            if (X[i8] == 1) {
                if (X[i8 + 6] < X[i8 + 5]) {
                    int[] iArr = X;
                    int i9 = i8 + 6;
                    iArr[i9] = iArr[i9] + 25;
                    if (X[i8 + 6] >= X[i8 + 5] && ((X[i8 + 8] >> 16) & 65535) == 1) {
                        b(X[i8 + 1], X[i8 + 2], 10, 200, 300 + Math.abs(q.s() % 200), 10, 0, 1);
                        b(X[i8 + 1], X[i8 + 2], 10, 200, 300 + Math.abs(q.s() % 200), 15, 150 + Math.abs(q.s() % 100), 1);
                    }
                } else {
                    int[] iArr2 = X;
                    int i10 = i8 + 4;
                    iArr2[i10] = iArr2[i10] + 25;
                    if (X[i8 + 4] > 600) {
                        X[i8] = 0;
                    }
                }
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (Y[i11] > 0) {
                int[] iArr3 = Y;
                int i12 = i11;
                iArr3[i12] = iArr3[i12] - 25;
                if (Y[i11] > 0) {
                    ab[i11] = (Y[i11] * aa[i11]) / Z[i11];
                }
            } else {
                ab[i11] = 0;
            }
        }
        for (int i13 = 0; i13 < 15; i13++) {
            int i14 = i13 * 10;
            if (ac[i14 + 9] < ac[i14 + 8]) {
                int[] iArr4 = ac;
                int i15 = i14 + 9;
                iArr4[i15] = iArr4[i15] + 25;
            } else {
                int[] iArr5 = ac;
                int i16 = i14 + 4;
                iArr5[i16] = iArr5[i16] + 25;
            }
        }
        bu += 25;
        while (bu > 30) {
            int i17 = bs * 3;
            int i18 = ad[i17];
            int i19 = ad[i17 + 1];
            int i20 = ad[i17 + 2];
            int i21 = bt * 5;
            if (a()) {
                ae[i21] = i18 + (q.s() % 3);
                ae[i21 + 1] = i19 + (q.s() % 3);
                ae[i21 + 2] = i20 + (q.s() % 3);
            } else {
                ae[i21] = i18;
                ae[i21 + 1] = i19;
                ae[i21 + 2] = i20;
            }
            if (a()) {
                ae[i21 + 3] = 150 + Math.abs(q.s() % 200);
            } else {
                ae[i21 + 3] = 100 + Math.abs(q.s() % 200);
            }
            ae[i21 + 4] = ae[i21 + 3];
            int i22 = bt + 1;
            bt = i22;
            bt = i22 % 5;
            bu -= 30;
        }
        int i23 = bs + 1;
        bs = i23;
        bs = i23 % 50;
        for (int i24 = 0; i24 < 5; i24++) {
            int[] iArr6 = ae;
            int i25 = (i24 * 5) + 3;
            iArr6[i25] = iArr6[i25] - 25;
        }
        bE += 25;
        switch (bD) {
            case 1:
                bD = 3;
                bE = 0;
                break;
            case 2:
                if (bE >= 500) {
                    bE = 0;
                    bD = 3;
                }
                break;
            case 3:
                if (bE >= 2000) {
                    bE = 0;
                    bD = 0;
                }
                break;
            case 4:
                if (bE >= 500) {
                    bE = 0;
                    bD = 0;
                }
                break;
        }
        n(25);
        for (int i26 = 0; i26 < 5; i26++) {
            int[] iArr7 = af;
            int i27 = (i26 << 2) + 2;
            iArr7[i27] = iArr7[i27] - 25;
        }
        int i28 = bC + 25;
        bC = i28;
        if (i28 > bA) {
            G = false;
        }
        bz = Math.max(0, bz - 25);
        if (E) {
            int i29 = bq + 25;
            bq = i29;
            if (i29 > 2000) {
                E = false;
                bq = 0;
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static final int m26c(int i2, int i3, int i4) {
        return (i2 << 16) | (i3 << 8) | i4;
    }

    public static final void l(int i2) {
        U[i2] = 300;
    }

    public static final int d(int i2, int i3, int i4) {
        return (((((i3 >> 8) & 255) * i4) + (((i2 >> 8) & 255) * (255 - i4))) & 65280) + (((((i3 & 16711935) * i4) + ((i2 & 16711935) * (255 - i4))) >> 8) & 16711935);
    }

    public static void a(Graphics graphics, n nVar, int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        int i6 = (nVar.k[2] * i5) >> 8;
        if (z3) {
            int i7 = 0;
            if (i4 == 0) {
                i7 = 1;
            } else {
                int i8 = i4;
                while (i8 != 0) {
                    i8 /= 10;
                    i7++;
                }
            }
            i2 += ((i7 * i6) + (i7 - 1)) >> 1;
        }
        int i9 = i2;
        if (i4 == 0) {
            nVar.y(0);
            a(nVar, graphics, i9, i3, i5);
        } else {
            while (i4 > 0) {
                int i10 = i4 % 10;
                i4 /= 10;
                if (i10 >= 0 && i10 < 10) {
                    nVar.y(i10);
                    a(nVar, graphics, i9, i3, i5);
                }
                i9 -= i6 + 1;
            }
        }
        if (z2) {
            nVar.y(10);
            a(nVar, graphics, i9, i3, i5);
        }
    }

    public static float a(boolean z2) {
        float fA;
        float f2;
        float fB;
        if (z2) {
            fA = a(q.g(q.d)) - m22a();
            f2 = -b();
            fB = b(q.j(q.d)) - c();
        } else {
            int i2 = q.r[m29d()][4] - ((q.r[m29d()][6] * 25) >> 8);
            int i3 = q.r[m29d()][5] - ((q.r[m29d()][7] * 25) >> 8);
            fA = a(q.g(q.d)) - (i2 * 0.277f);
            f2 = -b();
            fB = b(q.j(q.d)) - (i3 * 0.277f);
        }
        float fSqrt = 1.0f - (((float) Math.sqrt(((fA * fA) + (f2 * f2)) + (fB * fB))) / b(3));
        float f3 = fSqrt;
        if (fSqrt < 0.0f) {
            f3 = 0.0f;
        }
        float f4 = 1.0f - f3;
        return (1.0f - (f4 * f4)) * 0.8f;
    }

    private static float d() {
        float fA = a(10) + ((e(0) - a(10)) * 0.6f) + f90d;
        return q.d() ? fA + ((m22a() - fA) * a(true)) : fA;
    }

    private static float e() {
        if (q.d()) {
            return 2810.0f + ((b() - 2810.0f) * a(true));
        }
        return 2810.0f;
    }

    private static float f() {
        float fB = 1551.0f + b(10) + (q.r[0][5] * 0.277f * 0.1f) + f91e;
        return q.d() ? fB + ((c() - fB) * a(true)) : fB;
    }

    private static float g() {
        return e() - ((q.cY * 2510) / 1000);
    }

    private static float h() {
        return f() - ((q.cY * 510) / 1000);
    }

    private static float i() {
        return b(10) - ((q.cY * 1000) / 1000);
    }

    private static float j() {
        float f2 = (q.ed - q.ee) / q.ed;
        return e() - ((f2 * f2) * 4000.0f);
    }

    private static float k() {
        return f() + ((b(15) * (q.ed - q.ee)) / q.ed);
    }

    private static float l() {
        return e() - ((q.cY * 2810) / 1000);
    }

    private static float m() {
        return f() + ((q.cY * 510) / 1000);
    }

    /* JADX INFO: renamed from: n, reason: collision with other method in class */
    private static float m27n() {
        return e() - (((q.ed - q.ee) * 2510) / q.ed);
    }

    /* JADX INFO: renamed from: o, reason: collision with other method in class */
    private static float m28o() {
        return f() - (((q.ed - q.ee) * 510) / q.ed);
    }

    public static void y() {
        e.a(f116g + f90d, f117h, f118i + f91e, f119j, f120k, f121l, 0.0f, 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    private static int m29d() {
        for (int i2 = 0; i2 < 3; i2++) {
            if (q.r[i2][1] != 0) {
                return i2;
            }
        }
        return 0;
    }

    public static void m(int i2) {
        float f2 = 4.0f;
        boolean z2 = false;
        float fD = d();
        float fE = e();
        float f3 = f();
        float fA = a(10) + ((e(0) - a(10)) * 0.4f);
        float fB = 0.0f;
        float fB2 = b(10);
        if (q.d()) {
            int i3 = 0;
            for (int i4 = 0; i4 < 3; i4++) {
                if (q.r[i4][1] != 0) {
                    i3++;
                }
            }
            if (i3 == 1) {
                f2 = 3.0f;
                fA += (m22a() - fA) * a(true);
                fB = 0.0f + (b() * a(true));
                fB2 += (c() - fB2) * a(true);
            }
        }
        if (q.eb == 14) {
            fD = d();
            fE = g();
            f3 = h();
            fB += (q.cY * b(10)) / 1000.0f;
            fB2 = i();
            q.m = Math.max(q.m - ((2.5f * i2) / 1000.0f), 0.0f);
        } else if (q.eb == 15) {
            fD = d();
            fE = l();
            f3 = m();
            fB -= (q.cY * b(10)) / 1000.0f;
            fB2 = i();
        } else if (q.eb != 16 && q.eb != 17) {
            int iA = (int) a(10);
            int iB = (int) b(8);
            if (q.m > 0.01f) {
                int i5 = 0;
                while (i5 < 3 && q.r[i5][1] == 0) {
                    i5++;
                }
                if (i5 == 3) {
                    i5 = 0;
                }
                float f4 = q.r[i5][4] * 0.277f;
                float f5 = q.r[i5][5] * 0.277f;
                float fE2 = f4 + ((e(0) - f4) * 0.3f);
                float fE3 = 0.4f * e();
                float f6 = f5 + (7 * q.dz * 0.277f);
                fD += (fE2 - fD) * q.m;
                fE += (fE3 - fE) * q.m;
                f3 += (f6 - f3) * q.m;
                fA += (f4 - fA) * q.m;
                fB2 += (f5 - fB2) * q.m;
            }
            if (q.db > 0) {
                int iS = ((q.db << 9) << 1) / 8000;
                int iS2 = 256;
                if (q.dc == 1) {
                    float f7 = iS / 1024.0f;
                    float f8 = f7 * f7 * 2048.0f;
                    iS = (q.s((int) f8) * 48) >> 12;
                    iS2 = ((q.s(((int) f8) << 1) << 6) >> 12) + 256;
                }
                int i6 = (((int) (fD - iA)) * iS2) >> 8;
                int i7 = (((int) (f3 - iB)) * iS2) >> 8;
                fD = (((q.t(iS) * i6) >> 12) - ((q.s(iS) * i7) >> 12)) + iA;
                f3 = ((q.s(iS) * i6) >> 12) + ((q.t(iS) * i7) >> 12) + iB;
            }
            if (bl == 2) {
                z2 = true;
                fE = 500.0f + (((fE - 500.0f) * bk) / 1300.0f);
            }
            if (q.ed != 0) {
                switch (q.fe) {
                    case 1:
                        z2 = true;
                        float f9 = fB - (((q.ed - q.ee) / q.ed) * 2000.0f);
                        fD = d();
                        fE = j();
                        f3 = k();
                        fB = f9;
                        break;
                    case 2:
                        z2 = true;
                        float f10 = fB + (((q.ed - q.ee) / q.ed) * 2000.0f);
                        fD = d();
                        fE = m27n();
                        f3 = m28o();
                        fB = f10;
                        break;
                }
            }
        } else {
            fE += (q.cY * b(20)) / 1000.0f;
            fB += (q.cY * b(20)) / 1000.0f;
        }
        float fMin = Math.min(0.5f, (f2 * i2) / 1000.0f);
        if (!z2) {
            f116g = (f116g * (1.0f - fMin)) + (fD * fMin);
            f117h = (f117h * (1.0f - fMin)) + (fE * fMin);
            f118i = (f118i * (1.0f - fMin)) + (f3 * fMin);
            f119j = (f119j * (1.0f - fMin)) + (fA * fMin);
            f120k = (f120k * (1.0f - fMin)) + (fB * fMin);
            f121l = (f121l * (1.0f - fMin)) + (fB2 * fMin);
            return;
        }
        q.m = 0.0f;
        f116g = fD;
        f117h = fE;
        f118i = f3;
        f119j = fA;
        f120k = fB;
        f121l = fB2;
    }

    public static void a(Graphics graphics) {
        int i2;
        float f2;
        float f3;
        float f4;
        int iB;
        int i3;
        if (q.af || q.ag) {
            return;
        }
        System.currentTimeMillis();
        h = p.i();
        i = p.m();
        int iM24c = m24c();
        for (int i4 = 0; i4 < i; i4 += 8) {
            int iB2 = b(iM24c, i4 + 1, 0);
            if (bl == 3) {
                int i5 = iB2 >> 16;
                int i6 = (iB2 >> 8) & 255;
                int i7 = iB2 & 255;
                iB2 = ((i5 + (((0 - i5) * bk) / 1000)) << 16) | ((i6 + (((0 - i6) * bk) / 1000)) << 8) | (i7 + (((0 - i7) * bk) / 1000));
            } else if (q.cY != 0) {
                int i8 = iB2;
                if (q.eb == 16) {
                    i8 = 16777215;
                }
                int i9 = iB2 >> 16;
                int i10 = (iB2 >> 8) & 255;
                int i11 = iB2 & 255;
                iB2 = ((i9 + ((((i8 >> 16) - i9) * q.cY) / 1000)) << 16) | ((i10 + (((((i8 >> 8) & 255) - i10) * q.cY) / 1000)) << 8) | (i11 + ((((i8 & 255) - i11) * q.cY) / 1000));
            }
            graphics.setColor(iB2);
            graphics.fillRect(0, i4, h, 8);
        }
        for (int i12 = 0; i12 < 15; i12++) {
            int i13 = i12 * 10;
            if (ac[i13 + 4] < ac[i13 + 5] && ac[i13 + 9] >= ac[i13 + 8]) {
                int i14 = ac[i13 + 4];
                int i15 = ac[i13 + 5];
                int i16 = ac[i13 + 2];
                int i17 = ac[i13 + 3];
                int i18 = ac[i13];
                int i19 = ac[i13 + 1];
                b[0] = i18;
                b[1] = 0.0f;
                b[2] = i19;
                b[3] = 1.0f;
                e.a(b);
                int i20 = (int) b[0];
                int i21 = (int) b[1];
                int i22 = ac[i13 + 7];
                int i23 = ac[i13 + 6];
                graphics.setColor(16777215);
                if (i23 == 2) {
                    int i24 = i16 + (((i17 - i16) * i14) / i15);
                    int i25 = 8192 / i24;
                    int i26 = 8192 / i24;
                    int i27 = 8192 / (i24 - i22);
                    int i28 = 8192 / (i24 - i22);
                    graphics.fillRect(i20 - i27, i21 - i28, 2 * Math.abs(i27), Math.abs(i28 - i26));
                    graphics.fillRect(i20 - i27, i21 + i26, 2 * Math.abs(i27), Math.abs(i28 - i26));
                    graphics.fillRect(i20 - i27, i21 - i26, i27 - i25, i26 << 1);
                    graphics.fillRect(i20 + i25, i21 - i26, i27 - i25, i26 << 1);
                } else if (i23 == 1) {
                    int i29 = i16 + (((i17 - i16) * i14) / i15);
                    graphics.fillRect((i20 - i29) - i22, (i21 - i29) - i22, (i29 + i22) << 1, i22);
                    graphics.fillRect((i20 - i29) - i22, i21 + i29, (i29 + i22) << 1, i22);
                    graphics.fillRect((i20 - i29) - i22, i21 - i29, i22, i29 << 1);
                    graphics.fillRect(i20 + i29, i21 - i29, i22, i29 << 1);
                }
            }
        }
        graphics.setColor(16777215);
        for (int i30 = 0; i30 < 15; i30++) {
            if (f108j[i30][10] > 0) {
                int i31 = f108j[i30][12] + ((f108j[i30][0] * h) >> 16);
                int i32 = f108j[i30][13] + ((f108j[i30][1] * i) >> 16);
                int i33 = f108j[i30][11] & 255;
                if (i33 == 3 || i33 == 2 || i33 == 5) {
                    f104o.c(graphics, i31, i32);
                }
            }
        }
        if (bl != 3) {
            b[0] = a(10);
            b[1] = b(-25);
            b[2] = b(1);
            b[3] = 1.0f;
            e.a(b);
            int iA = (h / 2) + ((((int) (a(10) - d())) * (h / 8)) / ((int) a(10)));
            int i34 = (int) b[1];
            int iM24c2 = m24c();
            int iB3 = b(iM24c2, i34, -80);
            if (q.cY != 0) {
                int iB4 = b((iM24c2 + 1) % q.D.length, i34, 0);
                int i35 = iB3 >> 16;
                int i36 = (iB3 >> 8) & 255;
                int i37 = iB3 & 255;
                iB = ((i35 + ((((iB4 >> 16) - i35) * q.cY) / 1000)) << 16) | ((i36 + (((((iB4 >> 8) & 255) - i36) * q.cY) / 1000)) << 8) | (i37 + ((((iB4 & 255) - i37) * q.cY) / 1000));
            } else {
                iB = b(iM24c2, i34, -80);
            }
            graphics.setColor(iB);
            int i38 = i34 + 1;
            if (bD != 0) {
                if (bD == 3) {
                    String str = f115c;
                    int length = str.length();
                    int i39 = (f.k[2] * 200) / 256;
                    int i40 = i39 / 6;
                    int i41 = (length * i39) + ((length - 1) * i40);
                    for (int i42 = 0; i42 < length; i42++) {
                        if (str.toUpperCase().charAt(i42) == ' ') {
                            i41 -= (i40 + i39) / 2;
                        }
                    }
                    int i43 = iA - (i41 >> 1);
                    int i44 = i43;
                    if (i43 < 0) {
                        i44 = 0;
                    }
                    for (int i45 = 0; i45 < length; i45++) {
                        char cCharAt = str.toUpperCase().charAt(i45);
                        if (cCharAt != ' ') {
                            int i46 = cCharAt - 'A';
                            if (i46 >= 0 && i46 < f.k[4]) {
                                f.y(i46);
                                a(f, graphics, i44, i38, 200);
                            }
                            i3 = i40 + i39;
                        } else {
                            i3 = (i40 + i39) / 2;
                        }
                        i44 += i3;
                    }
                }
            } else if (q.de == 3) {
                a(graphics, g, iA, i38, q.ew / 4, 100, false, true);
            } else if (q.es > 0) {
                a(graphics, g, iA, i38, q.es, 100, false, true);
            }
        }
        e.a(graphics);
        y();
        if (bl != 3) {
            int i47 = q.fd;
            int iB5 = b(m24c(), i / 2, 0);
            int iMin = (Math.min(255, (iB5 >> 16) + 24) << 16) | (Math.min(255, ((iB5 >> 8) & 255) + 24) << 8) | Math.min(255, (iB5 & 255) + 24);
            int iD = d(iMin, 16777215, 128);
            for (t tVar : a) {
                tVar.setColor(iD);
            }
            if (q.de == 2 || q.de == 1 || q.de == 4) {
                k.setIdentity();
                k.setColor(iD);
                k.postTranslate(a(2), 0.0f, b(16) - (b(1) * 0.5f));
                k.aF();
                a(q.eo, a(5), 0.0f, b(15), true);
            }
            if (q.de == 1 || (q.de == 2 && q.fg == 1)) {
                float fA = a(18);
                float fB = b(15);
                if (q.fg == 3) {
                    c.setIdentity();
                    c.setColor(iD);
                    c.postTranslate(fA, 0.0f, fB + (b(1) * 0.5f));
                    c.aF();
                } else if (q.fg == 1) {
                    d.setIdentity();
                    d.setColor(iD);
                    d.postTranslate(fA, 0.0f, fB + (b(1) * 0.5f));
                    d.aF();
                } else {
                    a(q.cW + q.fd + 1, a(18), 0.0f, b(15), false);
                }
            } else if (q.de == 4) {
                a(q.cW + q.fd + 1, a(18), 0.0f, b(15), false);
            } else if (q.de == 2) {
                a(q.dh + 1, a(13), 0.0f, b(15), false);
                f92h.setIdentity();
                f92h.postTranslate(a(14), 0.0f, b(15));
                f92h.setColor(iD);
                f92h.postRotate(-0.05f, 0.0f, 1.0f, 0.0f);
                f92h.aF();
                a(60, a(18), 0.0f, b(15), false);
            }
            f89a.setIdentity();
            f89a.b(d(iMin, 16777215, (U[0] << 8) / 300), d(iMin, 16777215, (U[1] << 8) / 300), d(iMin, 16777215, (U[2] << 8) / 300), d(iMin, 16777215, (U[3] << 8) / 300), iMin);
            f89a.b(!D);
            int i48 = q.A[i47][1];
            int i49 = q.A[i47][7];
            float f5 = -50.0f;
            float f6 = -75.0f;
            float f7 = -100.0f;
            int i50 = 49344;
            aY = 0;
            for (int i51 = i49; i51 < i49 + i48; i51++) {
                Object[] objArr = q.c[i51];
                if (q.m44a(objArr)) {
                    int i52 = ((int[]) objArr[0])[1];
                    int i53 = ((int[]) objArr[0])[2];
                    float f8 = i52 * 0.277f;
                    float f9 = i53 * 0.277f;
                    if (q.eP > 0) {
                        float fAbs = 20.0f - (Math.abs(((q.c(10 - q.g(objArr), 8 - q.j(objArr)) * 80) - q.eP) + 400) / 20.0f);
                        if (fAbs > 0.0f) {
                            f5 -= fAbs;
                            f6 -= fAbs;
                            f7 -= fAbs;
                        }
                    }
                    if (bl == 2 || q.fe == 4) {
                        int i54 = (i50 * 71) + 1377;
                        i50 = i54;
                        int iAbs = Math.abs(i54) % 1000;
                        if (q.fe == 4) {
                            float f10 = iAbs - q.ee;
                            float f11 = (-f10) * 10.0f;
                            if (f10 > 0.0f) {
                                f5 -= f11;
                                f6 -= f11;
                                f7 -= f11;
                            }
                        } else {
                            float f12 = iAbs - bk;
                            float f13 = f12 * 4.0f;
                            if (f12 > 0.0f) {
                                f5 -= f13;
                                f6 -= f13;
                                f7 -= f13;
                            }
                        }
                    }
                    int iM46c = q.m46c(objArr);
                    switch (q.m45b(objArr)) {
                        case 2:
                            i2 = 1;
                            f2 = 100.0f;
                            f3 = -f6;
                            f4 = 75.0f;
                            break;
                        case 3:
                            i2 = 0;
                            f2 = 100.0f;
                            f3 = -f7;
                            f4 = 150.0f;
                            break;
                        default:
                            i2 = 2;
                            f2 = 50.0f;
                            f3 = -f5;
                            f4 = 75.0f;
                            break;
                    }
                    float fMin = Math.min(15000.0f, f3);
                    if (iM46c == 3) {
                        boolean z2 = q.fg == 1;
                        int iM47d = q.m47d(objArr) + (m24c() << 2);
                        if (z2 && q.m47d(objArr) == 2) {
                            iM47d = 25;
                        }
                        if (((boolean[]) objArr[1])[0]) {
                            f78a[i2][7].getVertexBuffer().setDefaultColor(16777215);
                            f78a[i2][7].setIdentity();
                            f78a[i2][7].N(iM47d);
                            f78a[i2][7].postTranslate(f8 + f2, fMin, f9 + f4);
                        } else {
                            int[] iArr = T;
                            int i55 = aY;
                            aY = i55 + 1;
                            iArr[i55] = iM47d;
                            int[] iArr2 = T;
                            int i56 = aY;
                            aY = i56 + 1;
                            iArr2[i56] = (int) (f8 + f2);
                            int[] iArr3 = T;
                            int i57 = aY;
                            aY = i57 + 1;
                            iArr3[i57] = (int) fMin;
                            int[] iArr4 = T;
                            int i58 = aY;
                            aY = i58 + 1;
                            iArr4[i58] = (int) (f9 + f4);
                            int[] iArr5 = T;
                            int i59 = aY;
                            aY = i59 + 1;
                            iArr5[i59] = i2;
                        }
                        if (((boolean[]) objArr[1])[0]) {
                            int iA2 = q.a(objArr);
                            if (iA2 < q.cN) {
                                float f14 = (iA2 - q.cN) - 150;
                                float f15 = iA2 - 150;
                                if (f15 < 0.0f) {
                                    f78a[i2][7].postRotate((f15 * 0.5f) / 150.0f, 1.0f, 0.0f, 0.0f);
                                }
                                f78a[i2][7].aF();
                                if (f15 < 0.0f || f14 > 0.0f) {
                                    f78a[i2][7].postRotate(0.5f, 1.0f, 0.0f, 0.0f);
                                    f78a[i2][7].N(18);
                                    f78a[i2][7].aF();
                                }
                            } else {
                                f78a[i2][7].N(18);
                                float f16 = iA2 - ((q.cN + q.cO) - 150);
                                float f17 = iA2 - (q.cN + 150);
                                if (f17 < 0.0f) {
                                    f78a[i2][7].postRotate((f17 * 0.5f) / 150.0f, 1.0f, 0.0f, 0.0f);
                                }
                                f78a[i2][7].aF();
                                if (f17 < 0.0f || f16 > 0.0f) {
                                    f78a[i2][7].postRotate(-0.5f, 1.0f, 0.0f, 0.0f);
                                    f78a[i2][7].N(iM47d);
                                    f78a[i2][7].aF();
                                }
                            }
                        }
                    } else if (iM46c == 6 || iM46c == 1) {
                        int i60 = iM46c == 1 ? 16 : 17;
                        int[] iArr6 = T;
                        int i61 = aY;
                        aY = i61 + 1;
                        iArr6[i61] = i60;
                        int[] iArr7 = T;
                        int i62 = aY;
                        aY = i62 + 1;
                        iArr7[i62] = (int) (f8 + f2);
                        int[] iArr8 = T;
                        int i63 = aY;
                        aY = i63 + 1;
                        iArr8[i63] = (int) fMin;
                        int[] iArr9 = T;
                        int i64 = aY;
                        aY = i64 + 1;
                        iArr9[i64] = (int) (f9 + f4);
                        int[] iArr10 = T;
                        int i65 = aY;
                        aY = i65 + 1;
                        iArr10[i65] = i2;
                        if (iM46c == 1) {
                            float fS = ((((q.s(bw >> 2) * ((int) a(objArr))) >> 12) * 0.5f) + a(objArr)) * 0.5f;
                            ba = (int) (f8 + 100.0f);
                            bb = (int) ((a(objArr) * 2.0f) + fS);
                            bc = (int) (f9 + 150.0f);
                            bd = (int) ((a(objArr) * 2.0f) - fS);
                            f94j.setIdentity();
                            f94j.postTranslate(ba, bb, bc);
                            f94j.postRotate(0.25f, 1.0f, 0.0f, 0.0f);
                            f94j.postScale(0.5f, 0.5f, 0.5f);
                            f94j.aD();
                            f94j.aF();
                            if (q.fd != 0) {
                                f94j.setIdentity();
                                f94j.postTranslate(ba, bd, bc);
                                f94j.postRotate(0.75f, 1.0f, 0.0f, 0.0f);
                                f94j.postScale(0.5f, 0.5f, 0.5f);
                                f94j.aF();
                            }
                            f94j.aE();
                        } else if (iM46c == 6) {
                            float fS2 = ((((q.s(bw >> 2) * ((int) a(objArr))) >> 12) * 0.5f) + a(objArr)) * 0.5f;
                            f93i.setIdentity();
                            f93i.postTranslate(f8 + 100.0f, a(objArr) + fS2, f9 + 150.0f);
                            f93i.postRotate(bw / 1500.0f, 0.0f, 1.0f, 0.0f);
                            f93i.aF();
                        }
                    } else if (iM46c == 4 || iM46c == 5 || iM46c == 2) {
                        int iF = q.f(objArr);
                        int i66 = -1;
                        switch (iM46c) {
                            case 2:
                                i66 = 18;
                                break;
                            case 4:
                                i66 = 19;
                                if (iF > -1 && iF != 1) {
                                    i66 = 20;
                                }
                                break;
                            case 5:
                                if (iF > -1) {
                                    i66 = iF == 2 ? 22 : 21;
                                    if (iF == 1) {
                                        i66 = 23;
                                    }
                                    if (iF == 0) {
                                        i66 = 24;
                                    }
                                }
                                break;
                        }
                        if (i66 >= 0) {
                            int[] iArr11 = T;
                            int i67 = aY;
                            aY = i67 + 1;
                            iArr11[i67] = i66;
                            int[] iArr12 = T;
                            int i68 = aY;
                            aY = i68 + 1;
                            iArr12[i68] = (int) (f8 + f2);
                            int[] iArr13 = T;
                            int i69 = aY;
                            aY = i69 + 1;
                            iArr13[i69] = (int) fMin;
                            int[] iArr14 = T;
                            int i70 = aY;
                            aY = i70 + 1;
                            iArr14[i70] = (int) (f9 + f4);
                            int[] iArr15 = T;
                            int i71 = aY;
                            aY = i71 + 1;
                            iArr15[i71] = i2;
                        }
                    }
                }
            }
            f81a.fL = 0;
            int i72 = 0;
            for (int i73 = 0; i73 < aY; i73 += 5) {
                if (i72 < 50) {
                    f81a.b((short) T[i73 + 1], (short) T[i73 + 2], (short) T[i73 + 3], (short) T[i73 + 4], (short) T[i73], i72 * 14);
                    i72++;
                }
            }
            if (i72 > 0) {
                f81a.fL = i72;
                f81a.ay();
                f81a.setAppearance(f82a[0]);
                f81a.aF();
            }
            if (D) {
                float fS3 = ((q.s(bw >> 2) * ((int) b(1))) >> 12) >> 1;
                float f18 = aX / 1500.0f;
                float f19 = f18 * f18;
                float f20 = 1.0f - f19;
                float fA2 = a(10) + ((ba - a(10)) * f19);
                if (q.fd != 0) {
                    float fB2 = b(18) + fS3;
                    float f21 = bd * f19;
                    float f22 = fB2 + ((bc - fB2) * f19);
                    f94j.setIdentity();
                    f94j.postTranslate(fA2, f21, f22);
                    f94j.postRotate(0.5f + (f19 * 0.25f), 1.0f, 0.0f, 0.0f);
                    f94j.postScale(0.5f + (f20 * 0.5f), 0.5f + (f20 * 0.5f), 0.5f + (f20 * 0.5f));
                    f94j.aF();
                }
                float fB3 = b(-1) - fS3;
                float f23 = bb * f19;
                float f24 = fB3 + ((bc - fB3) * f19);
                f94j.setIdentity();
                f94j.postTranslate(fA2, f23, f24);
                f94j.postRotate(f19 * 0.25f, 1.0f, 0.0f, 0.0f);
                f94j.postScale(0.5f + (f20 * 0.5f), 0.5f + (f20 * 0.5f), 0.5f + (f20 * 0.5f));
                f94j.aF();
            }
        }
        for (int i74 = 0; i74 < 30; i74++) {
            int i75 = i74 * 10;
            if (X[i75] == 1) {
                int i76 = X[i75 + 8] & 65535;
                r rVar = f78a[2][7];
                switch (i76) {
                    case 2:
                        rVar = f78a[1][7];
                        break;
                    case 3:
                        rVar = f78a[0][7];
                        break;
                }
                if (X[i75 + 6] >= X[i75 + 5] && X[i75 + 4] < 150) {
                    f87c.setIdentity();
                    f87c.postTranslate(X[i75 + 1], X[i75 + 2], X[i75 + 3]);
                    int i77 = 255 - ((X[i75 + 4] * 255) / 600);
                    rVar.setColor((i77 << 16) | (i77 << 8) | i77);
                    rVar.setIdentity();
                    rVar.postTranslate(X[i75 + 1], X[i75 + 2], X[i75 + 3]);
                    rVar.setAppearance(f83a);
                    rVar.aF();
                    rVar.setColor(16777215);
                    rVar.setAppearance(f82a[0]);
                }
            }
        }
        if ((q.f147f[12] && q.l(q.cT) == 12) || q.eS != 0) {
            for (int i78 = 0; i78 < 3; i78++) {
                if (q.r[i78][1] != 0 && q.g[i78]) {
                    v.setIdentity();
                    v.postTranslate(q.m(i78) * 0.277f, 0.0f, q.n(i78) * 0.277f);
                    v.postRotate((q.dl % 1000) / 1000.0f, -1.0f, 0.0f, 0.0f);
                    v.aF();
                }
            }
        }
        if (q.w[0][0] == 1) {
            int iE = (int) e(0);
            int i79 = (int) (q.w[0][2] * 0.277f);
            int i80 = (int) (q.w[0][3] * 0.277f);
            float fS4 = 1.0f + (((q.s(bw >> 2) * 100) >> 12) / 300.0f);
            f111f = fS4 * q.dy;
            l.setIdentity();
            l.az = false;
            l.postTranslate(iE, 0.0f, i79);
            l.postScale(fS4, 0.0f, (i79 - i80) / b(1));
            l.setColor(16777215);
            l.aF();
        }
        for (int i81 = 0; i81 < 1; i81++) {
            boolean z3 = q.z[0][0] == 1;
            int i82 = q.z[0][6];
            if (!z3 && q.f147f[11] && q.l(q.cT) == 11) {
                int iE2 = (int) e(0);
                int i83 = (int) (q.z[0][2] * 0.277f);
                int i84 = (int) (q.z[0][3] * 0.277f);
                m.setColor((((q.s((bw << 9) / 1500) * 63) >> 12) + 196) << 16);
                m.setIdentity();
                m.postTranslate(iE2, 0.0f, i83);
                m.az = false;
                m.postScale(0.2f, 0.0f, (i83 - i84) / b(1));
                m.aF();
            }
            if (z3 && i82 == 1) {
                int i85 = (int) (q.z[0][1] * 0.277f);
                int i86 = (int) (q.z[0][2] * 0.277f);
                float fS5 = 0.3f + (((q.s(bw) * 100) >> 12) / 900.0f);
                f87c.postScale(fS5, 0.0f, 15.0f);
                l.setIdentity();
                l.setColor(16777215);
                l.postTranslate(i85, 0.0f, i86 + b(15));
                l.postScale(fS5, 0.0f, 15.0f);
                l.aF();
                s.setIdentity();
                s.postTranslate(i85, 0.0f, i86);
                s.aF();
            }
        }
        for (int i87 = 0; i87 < 1; i87++) {
            if (q.x[0][0] == 1) {
                float f25 = q.x[0][1] * 0.277f;
                float f26 = q.x[0][3] * 0.277f;
                float f27 = (q.q[0][4] + (q.q[0][14] / 2)) * 0.277f;
                float f28 = q.q[0][5] * 0.277f;
                int iS = (q.s((bw << 9) / 2000) * 30) >> 12;
                t.setIdentity();
                t.postTranslate(f25, 0.0f, f26);
                t.postRotate(iS / 4000.0f, 0.2f, 1.0f, 0.2f);
                t.aF();
                for (int i88 = 0; i88 < 10; i88++) {
                    u.setIdentity();
                    u.postTranslate(((f25 * i88) / 10.0f) + ((f27 * (10 - i88)) / 10.0f), 0.0f, ((f26 * i88) / 10.0f) + ((f28 * (10 - i88)) / 10.0f));
                    u.aF();
                }
            }
        }
        int i89 = 0;
        while (i89 < 2) {
            if (q.eJ > 200) {
                int i90 = q.q[0][4] + (i89 == 1 ? q.q[0][14] : 0);
                int i91 = q.q[0][5];
                float fQ = (1.0f * (q.q(i89) - 128)) / 512.0f;
                float fSin = 1.4f * ((float) Math.sin((2.356194490192345d * ((double) Math.min(1000, (1000 * (q.eJ - 200)) / 700))) / 1000.0d));
                w.setIdentity();
                w.postTranslate(i90 * 0.277f, 100.0f, (i91 * 0.277f) + 20.0f);
                w.postRotate(fQ, 0.0f, 1.0f, 0.0f);
                w.postScale(fSin, fSin, fSin);
                w.aF();
            }
            i89++;
        }
        l.aD();
        for (int i92 = 0; i92 < q.v.length; i92++) {
            if (q.v[i92][3] == 1) {
                float f29 = q.v[i92][0] * 0.277f;
                float f30 = q.v[i92][1] * 0.277f;
                l.setIdentity();
                l.postTranslate(f29, 0.0f, f30);
                l.postScale(0.2f, 0.2f, 0.2f);
                l.aF();
            }
        }
        l.aE();
        A();
        for (int i93 = 0; i93 < 3; i93++) {
            int[] iArr16 = q.r[i93];
            int i94 = i93;
            if (iArr16[1] != 0) {
                float f31 = q.da / 1000.0f;
                float fD = iArr16[4] * 0.277f;
                float fM27n = (((-f31) * f31) + f31) * 2000.0f;
                float fM28o = iArr16[5] * 0.277f;
                if (q.eb == 14) {
                    float f32 = q.cY / 1000.0f;
                    float f33 = f32 * f32;
                    fD += (d() - fD) * f33;
                    fM27n += (((1500.0f + g()) - fM27n) * q.cY) / 1000.0f;
                    fM28o += (((-(3 * 0.277f)) + h()) - fM28o) * f33;
                } else if (q.eb == 15) {
                    float f34 = q.cY / 1000.0f;
                    float f35 = f34 * f34;
                    fD += (d() - fD) * f35;
                    fM27n += ((((-500.0f) + l()) - fM27n) * q.cY) / 1000.0f;
                    fM28o += (((-(3 * 0.277f)) + m()) - fM28o) * f35;
                } else if (q.ed != 0) {
                    if (q.fe == 1) {
                        int i95 = q.ed - q.ee;
                        fD += ((d() - fD) * i95) / q.ed;
                        fM27n += (((500.0f + j()) - fM27n) * i95) / q.ed;
                        fM28o += ((((-(1.0f * 0.277f)) + k()) - fM28o) * i95) / q.ed;
                    } else if (q.fe == 2) {
                        int i96 = q.ed - q.ee;
                        fD += ((d() - fD) * i96) / q.ed;
                        fM27n += (((700.0f + m27n()) - fM27n) * i96) / q.ed;
                        fM28o += ((((-(1.0f * 0.277f)) + m28o()) - fM28o) * i96) / q.ed;
                    }
                }
                f88i[i94][0] = (int) fD;
                f88i[i94][1] = (int) fM27n;
                f88i[i94][2] = (int) fM28o;
                if (a()) {
                    y.setIdentity();
                    y.postTranslate(fD, fM27n + 54, fM28o);
                    int i97 = (bw % 1000) / 125;
                    int i98 = i97;
                    if (i97 > 3) {
                        i98 = 7 - i98;
                    }
                    y.a(f97c[i98]);
                    y.n = 0.0f;
                    float fS6 = ((((q.s(bw) << 6) >> 12) + 256) + 64) / 256.0f;
                    if (q.eV > 0) {
                        fS6 *= 2.0f;
                    }
                    y.postScale(fS6, fS6, fS6);
                    y.az = true;
                    y.aF();
                } else {
                    float f36 = q.eV > 0 ? 2.0f : 1.0f;
                    float fS7 = (q.s(((int) (fD + fM28o)) >> 1) << 5) >> 12;
                    y.setIdentity();
                    y.postTranslate(fD, fM27n + 54, fM28o);
                    y.a(f96b[m24c()]);
                    y.n = fS7;
                    y.az = true;
                    y.postScale(f36, f36, f36);
                    y.aF();
                    float fA3 = ((a(10) - fD) * (-45.0f)) / a(10);
                    z.setIdentity();
                    z.postTranslate(fD, fM27n + 54, fM28o);
                    z.az = true;
                    z.n = fA3;
                    z.aF();
                }
            }
        }
        for (int i99 = 0; i99 < 2; i99++) {
            int[] iArr17 = q.q[i99];
            int i100 = i99;
            if (iArr17[1] != 0) {
                int i101 = iArr17[14];
                float fE = e(i100);
                float fJ = 0.0f;
                float fK = iArr17[5] * 0.277f;
                float f37 = 0.0f;
                if (bl == 3) {
                    fE += ((d() - fE) * bk) / 1000.0f;
                    fJ = 0.0f + (((e() + b(5)) * bk) / 1000.0f);
                    fK += (((f() - fK) - b(4)) * bk) / 1000.0f;
                    f37 = (360 * bk) / 1000;
                }
                if (q.ed != 0 && q.fe == 1) {
                    int i102 = q.ed - q.ee;
                    fE += ((d() - fE) * i102) / q.ed;
                    fJ += (((500.0f + j()) - fJ) * i102) / q.ed;
                    fK += ((((-(1.0f * 0.277f)) + k()) - fK) * i102) / q.ed;
                }
                int i103 = ab[i100] * (i100 == 0 ? 1 : -1);
                f84f.setIdentity();
                f84f.postTranslate(fE, fJ + i103, fK);
                f84f.postRotate(f37 / 360.0f, 1.0f, 0.1f, 0.5f);
                f84f.postScale(i101 / 1380.0f, 1.0f, 1.0f);
                if (i100 > 0) {
                    f84f.postTranslate(0.0f, 0.0f, 50.0f);
                    f84f.postRotate(0.5f, 0.0f, 1.0f, 0.0f);
                }
                f84f.aF();
                if (i100 == 0 && q.eJ > 0) {
                    float fS8 = (1.0f * q.s(Math.min(128, (128 * q.eJ) / 250))) / 4096.0f;
                    x.setIdentity();
                    x.postTranslate(fE, fJ + i103 + 60.0f, fK + 100.0f);
                    x.postScale(i101 / 1380.0f, 1.0f, fS8);
                    x.postTranslate(0.0f, 0.0f, -30.0f);
                    x.aF();
                }
            }
        }
        if (E) {
            e.a().clear(f107b);
            q.a(f98a);
            q.setIdentity();
            q.postTranslate(a(10), b(-3), b(11));
            q.postRotate(0.9f, 1.0f, 0.0f, 0.0f);
            q.postRotate(bw / 4000.0f, 0.0f, 1.0f, 0.0f);
            q.postScale(0.8f, 0.8f, 0.8f);
            q.aF();
            r.a(f98a);
            r.setIdentity();
            r.postTranslate(a(10), b(-3), b(11));
            r.postRotate(0.3f, 1.0f, 0.0f, 0.0f);
            r.postRotate(bw / 2000.0f, 0.0f, 1.0f, 0.0f);
            r.postScale(0.7f, 0.7f, 0.7f);
            r.aF();
        }
        if (q.eP > 0) {
            int i104 = ((q.eP << 2) * 300) / 1600;
            int iQ = q.q();
            float f38 = q.r[iQ][4] * 0.277f;
            float f39 = q.r[iQ][5] * 0.277f;
            e.az = false;
            e.setIdentity();
            e.postTranslate(f38, 0.0f, f39);
            e.postScale(0.1f + (i104 * 0.0078125f), 1.0f, 0.1f + (i104 * 0.0078125f));
            e.aF();
        }
        e.b(graphics);
        for (int i105 = 0; i105 < q.dX; i105++) {
            if (F) {
                int[] iArr18 = q.s[i105];
                if (iArr18[1] != 0) {
                    b[0] = iArr18[4] * 0.277f;
                    b[1] = 0.0f;
                    b[2] = iArr18[5] * 0.277f;
                    b[3] = 1.0f;
                    e.a(b);
                    int i106 = (int) b[0];
                    int i107 = (int) b[1];
                    if (i106 >= -50 && i106 <= h + 50 && i107 >= -50 && i107 <= i + 50) {
                        int i108 = i107 - 11;
                        int i109 = iArr18[2];
                        f102n.c(graphics, i106, i108);
                        switch (i109) {
                            case 0:
                            case 1:
                            case 14:
                            case 21:
                                f99k.c(graphics, i106, i108);
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 15:
                            case 16:
                            case 17:
                            case 19:
                            case 22:
                            case 23:
                            default:
                                f100l.c(graphics, i106, i108);
                                break;
                            case 18:
                            case 20:
                            case 24:
                            case 25:
                                f101m.c(graphics, i106, i108);
                                break;
                        }
                        f103c[i109].c(graphics, i106, i108);
                    }
                }
            }
        }
        if (bl == 4) {
            graphics.setColor(16777215);
            int i110 = (1500 * bk) / 2500;
            if (bk <= 2500) {
                int i111 = 5000;
                int i112 = q.A[q.fd][0];
                if (q.de == 2) {
                    i111 = 1000;
                } else if (q.de == 1 || q.de == 4) {
                    i111 = i112 == 0 ? 5000 : i112 == 3 ? 7500 : 10000;
                }
                if (q.de != 3) {
                    a(graphics, g, h >> 1, i >> 1, i111, i110, false, true);
                }
            }
        }
        for (int i113 = 0; i113 < 5; i113++) {
            int i114 = i113 << 2;
            if (af[i114 + 2] > 0) {
                int i115 = 1000 - ((1000 * af[i114 + 2]) / 500);
                graphics.setColor(16777215);
                float[] fArr = {af[i114], 0.0f, af[i114 + 1], 1.0f};
                e.a(fArr);
                a(graphics, f76h, (int) fArr[0], (int) fArr[1], af[i114 + 3], i115, true, false);
            }
        }
        if (!q.ab) {
            int i116 = f103c[6].k[2] - 1;
            short s2 = f103c[6].k[3];
            int i117 = (s2 * 3) / 2;
            int i118 = 2;
            for (int i119 = 0; i119 < 27; i119++) {
                if (q.g(i119)) {
                    a(2, i118, i116, s2, i119, 0, graphics);
                    i118 += i117 + 2;
                }
            }
            int i120 = (i - f103c[6].k[3]) - (i >> 5);
            int i121 = p.i() / 2;
            int i122 = i116 << 2;
            int i123 = i116 << 1;
            int iP = q.p();
            int[] iArr19 = f112l[iP];
            int i124 = 0;
            int i125 = 0;
            while (i125 < iP) {
                int iL = q.l((i125 + q.cT) % iP);
                if (iP > 0) {
                    if (q.cU >= 0) {
                        i124 = (((q.cU * ((i125 == iP - 1 ? 360 : iArr19[i125 + 1]) - iArr19[i125])) / 500) << 9) / 360;
                    } else {
                        i124 = (((q.cU * (iArr19[i125] - (i125 == 0 ? iArr19[iP - 1] - 360 : iArr19[i125 - 1]))) / 500) << 9) / 360;
                    }
                }
                int iS2 = (q.s(((iArr19[i125] << 9) / 360) + i124) * i122) >> 12;
                int i126 = (((-q.t(((iArr19[i125] << 9) / 360) + i124)) * i123) >> 2) >> 12;
                if (q.f147f[iL] && m23c(iL)) {
                    a((i121 + iS2) - (i116 / 2), (i120 + i126) - (s2 / 2), i116, s2, iL, i125 == 0 ? 104448 : 0, graphics);
                }
                i125++;
            }
        }
        if (G) {
            int i127 = 128 + ((640 * bC) / bA);
            int i128 = bB;
            if (i128 != 0) {
                short s3 = g.k[2];
                short s4 = g.k[3];
                int i129 = (s3 * i127) >> 8;
                int i130 = (s4 * i127) >> 8;
                int i131 = 0;
                int i132 = i128;
                while (i132 != 0) {
                    i132 /= 10;
                    i131++;
                }
                int i133 = i131 + 1;
                int i134 = (i133 * i129) + (i133 - 1);
                int i135 = i128 > 0 ? 10 : 11;
                int iAbs2 = Math.abs(i128);
                int i136 = (h + i134) >> 1;
                int i137 = (i >> 1) - ((i130 - s4) >> 1);
                graphics.setColor(16777215);
                while (iAbs2 != 0) {
                    int i138 = iAbs2 % 10;
                    iAbs2 /= 10;
                    g.y(i138);
                    a(g, graphics, i136, i137, i127);
                    i136 -= i129 + 1;
                }
                g.y(i135);
                a(g, graphics, i136, i137, i127);
            }
        }
        if (bl == 3) {
            b(graphics, bk, 900);
        } else if (q.eP > 0) {
            b(graphics, q.eP, 800);
        }
        graphics.setColor(0);
        System.currentTimeMillis();
        if (q.cL > 0) {
            int i139 = 1 + (q.cL / 1000);
            int i140 = q.cL % 1000;
            g.y(i139);
            int i141 = h >> 1;
            int i142 = i / 3;
            graphics.setColor(3355443);
            a(graphics, g, i141, i142, i139, i140 + 256 + 70, false, true);
            graphics.setColor(16777215);
            a(graphics, g, i141, i142, i139, i140 + 256, false, true);
        }
        if (q.ab) {
            int i143 = q.f.S;
            int i144 = q.f.T;
            int i145 = q.dj;
            int i146 = q.dk;
            f.a(graphics, i145 + 4, i146 + 4 + 16, i143 - 8, (i144 - 8) - 32, 44799, 55551, 1);
            graphics.setColor(44799);
            graphics.fillRect(i145 + 4, i146 + 4, i143 - 8, 16);
            graphics.setColor(55551);
            graphics.fillRect(i145 + 4, ((i146 + i144) - 4) - 16, i143 - 8, 16);
            a(graphics, f105p, i145, i146, i143, i144);
            q.f.a(graphics, q.dj, q.dk);
        }
    }

    private static void a(Graphics graphics, n nVar, int i2, int i3, int i4, int i5) {
        int i6 = q.dm;
        int i7 = q.dn;
        graphics.setClip(0, 0, i6, i7);
        nVar.b(3, 1, false);
        int i8 = i5 - nVar.k[3];
        nVar.c(graphics, i2 + nVar.k[0], i3 + nVar.k[1]);
        int i9 = i2 + nVar.k[2];
        int i10 = i3 + nVar.k[3];
        nVar.b(2, 1, false);
        nVar.c(graphics, ((i2 + nVar.k[0]) + i4) - nVar.k[2], i3 + nVar.k[1]);
        int i11 = i4 - nVar.k[2];
        nVar.b(3, 1, false);
        int i12 = i11 - nVar.k[2];
        graphics.setClip(i9, 0, i12, i7);
        nVar.b(5, 1, false);
        short s2 = nVar.k[0];
        short s3 = nVar.k[1];
        short s4 = nVar.k[2];
        int i13 = 0;
        while (true) {
            int i14 = i13;
            if (i14 > i12) {
                break;
            }
            nVar.c(graphics, i9 + s2 + i14, i3 + s3);
            i13 = i14 + s4;
        }
        graphics.setClip(0, 0, i6, i7);
        nVar.b(1, 1, false);
        nVar.c(graphics, i2 + nVar.k[0], ((i3 + nVar.k[1]) + i5) - nVar.k[3]);
        nVar.b(0, 1, false);
        short s5 = nVar.k[0];
        short s6 = nVar.k[1];
        int i15 = i8 - nVar.k[3];
        nVar.c(graphics, ((i2 + s5) + i4) - nVar.k[2], ((i3 + s6) + i5) - nVar.k[3]);
        int i16 = i4 - nVar.k[2];
        nVar.b(1, 1, false);
        int i17 = i16 - nVar.k[2];
        graphics.setClip(i9, 0, i17, i7);
        nVar.b(4, 1, false);
        short s7 = nVar.k[0];
        short s8 = nVar.k[1];
        short s9 = nVar.k[2];
        int i18 = 0;
        while (true) {
            int i19 = i18;
            if (i19 > i17) {
                break;
            }
            nVar.c(graphics, i9 + s7 + i19, ((i3 + s8) + i5) - nVar.k[3]);
            i18 = i19 + s9;
        }
        graphics.setClip(0, i10, i6, i15);
        nVar.b(6, 1, false);
        short s10 = nVar.k[0];
        short s11 = nVar.k[1];
        short s12 = nVar.k[3];
        int i20 = 0;
        while (true) {
            int i21 = i20;
            if (i21 > i15) {
                break;
            }
            nVar.c(graphics, i2 + s10, i10 + s11 + i21);
            i20 = i21 + s12;
        }
        nVar.b(7, 1, false);
        short s13 = nVar.k[0];
        short s14 = nVar.k[1];
        short s15 = nVar.k[3];
        int i22 = 0;
        while (true) {
            int i23 = i22;
            if (i23 > i15) {
                graphics.setClip(0, 0, i6, i7);
                return;
            } else {
                nVar.c(graphics, ((i2 + s13) + i4) - nVar.k[2], i10 + s14 + i23);
                i22 = i23 + s15;
            }
        }
    }

    private static final void z() {
        for (int i2 = 0; i2 < 15; i2++) {
            for (int i3 = 0; i3 < 15; i3++) {
                f108j[i2][i3] = 0;
            }
        }
    }

    public static final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i6;
        for (int i9 = 0; i9 < 15; i9++) {
            if (f108j[i9][10] <= 0) {
                i8--;
                f108j[i9][12] = i3;
                f108j[i9][13] = i4;
                f108j[i9][14] = i5;
                f108j[i9][10] = 1;
                g(i9, i2);
            }
            if (i8 <= 0) {
                return;
            }
        }
    }

    public static final void n(int i2) {
        for (int i3 = 0; i3 < 15; i3++) {
            int[] iArr = f108j[i3];
            if (iArr[10] > 0) {
                int i4 = iArr[3];
                int i5 = iArr[4];
                int i6 = iArr[5];
                iArr[3] = iArr[3] + (iArr[6] * i2);
                iArr[4] = iArr[4] + (iArr[7] * i2);
                iArr[5] = iArr[5] + (iArr[8] * i2);
                iArr[0] = iArr[0] + (i4 * i2);
                iArr[1] = iArr[1] + (i5 * i2);
                iArr[2] = iArr[2] + (i6 * i2);
                iArr[9] = iArr[9] - i2;
                if (iArr[9] < 0) {
                    iArr[10] = iArr[10] - 1;
                    g(i3, iArr[11]);
                }
            }
        }
    }

    private static void g(int i2, int i3) {
        f108j[i2][11] = i3;
        char c2 = 0;
        int i4 = i3 & 255;
        switch (i4) {
            case 0:
                f108j[i2][0] = 0;
                f108j[i2][1] = 0;
                f108j[i2][2] = 0;
                int iR = q.r() % 512;
                int iR2 = q.r() % 3000;
                f108j[i2][3] = (q.t(iR) * iR2) >> 12;
                f108j[i2][4] = Math.min(6000 + Math.abs(((q.s(iR) * iR2) * 6) >> 12), 14000);
                f108j[i2][5] = (q.s(iR) * iR2) >> 12;
                f108j[i2][6] = 0;
                f108j[i2][7] = -30;
                f108j[i2][8] = 0;
                f108j[i2][9] = 500 + (q.r() % 500);
                break;
            case 1:
                f108j[i2][0] = 0;
                f108j[i2][1] = 0;
                f108j[i2][2] = 0;
                f108j[i2][3] = 0;
                f108j[i2][4] = 0;
                f108j[i2][5] = 0;
                f108j[i2][6] = 0;
                f108j[i2][7] = 0;
                f108j[i2][8] = 0;
                f108j[i2][9] = 400;
                break;
            case 2:
                f108j[i2][0] = q.r() % 65536;
                f108j[i2][1] = 65536 + (q.r() % 65536);
                f108j[i2][2] = 0;
                f108j[i2][3] = 0;
                f108j[i2][4] = (-100) - Math.abs(q.r() % 100);
                f108j[i2][5] = 0;
                f108j[i2][6] = 0;
                f108j[i2][7] = 0;
                f108j[i2][8] = 0;
                f108j[i2][9] = 1000 + (q.r() % 500);
                break;
            case 3:
                f108j[i2][0] = q.r() % 65536;
                f108j[i2][1] = 0 - (q.r() % 65536);
                f108j[i2][2] = 0;
                f108j[i2][3] = 0;
                f108j[i2][4] = 100 + Math.abs(q.r() % 100);
                f108j[i2][5] = 0;
                f108j[i2][6] = 0;
                f108j[i2][7] = 0;
                f108j[i2][8] = 0;
                f108j[i2][9] = 1000 + (q.r() % 500);
                break;
            case 4:
                f108j[i2][0] = 0;
                f108j[i2][1] = 0;
                f108j[i2][2] = 0;
                f108j[i2][3] = 0;
                f108j[i2][4] = 0;
                f108j[i2][5] = 0;
                f108j[i2][6] = 0;
                f108j[i2][7] = 0;
                f108j[i2][8] = 0;
                f108j[i2][9] = 200;
                break;
            case 5:
                f108j[i2][0] = q.r() % 65536;
                f108j[i2][1] = 65536 + (q.r() % 65536);
                f108j[i2][2] = 0;
                f108j[i2][3] = 0;
                f108j[i2][4] = ((-100) - Math.abs(q.r() % 100)) / 2;
                f108j[i2][5] = 0;
                f108j[i2][6] = 0;
                f108j[i2][7] = 0;
                f108j[i2][8] = 0;
                f108j[i2][9] = 1000 + (q.r() % 500);
                break;
            case 8:
                c2 = 2;
            case 7:
                if (i4 != 8) {
                    c2 = 1;
                    break;
                }
            case 6:
                f108j[i2][0] = 0;
                f108j[i2][1] = 0;
                f108j[i2][2] = 0;
                int iR3 = q.r() % 512;
                int iR4 = q.r() % 3000;
                int i5 = -q.r[c2][6];
                int i6 = -q.r[c2][7];
                f108j[i2][3] = i5 + ((q.t(iR3) * iR4) >> 12);
                f108j[i2][4] = 0;
                f108j[i2][5] = i6 + ((q.s(iR3) * iR4) >> 12);
                f108j[i2][6] = 0;
                f108j[i2][7] = 0;
                f108j[i2][8] = 0;
                f108j[i2][9] = 350 + (q.r() % 350);
                break;
        }
    }

    private static void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f6 / 150.0f;
        float f9 = f7 / 150.0f;
        p.setIdentity();
        p.postTranslate(f2, f3, f4);
        p.postScale(f5, f5, f5);
        p.postRotate(f8, 1.0f, 0.0f, 0.0f);
        p.postRotate(f9, 0.0f, 0.0f, 1.0f);
        p.postRotate(f9 - f8, 0.0f, 1.0f, 0.0f);
        p.aF();
    }

    public static final void A() {
        for (int i2 = 0; i2 < 15; i2++) {
            if (f108j[i2][10] > 0) {
                int i3 = f108j[i2][12] + ((f108j[i2][0] * 15) >> 16);
                int i4 = f108j[i2][13] + ((f108j[i2][1] * 15) >> 16);
                int i5 = f108j[i2][14] + ((f108j[i2][2] * 15) >> 16);
                int i6 = f108j[i2][9];
                int i7 = f108j[i2][11] & 255;
                if (i7 == 0) {
                    p.setColor(16777215);
                    a(i3, i4, i5, 0.5f + ((i6 / 1000.0f) * 2.0f), (0.3f + (((i6 + (i2 * 100)) * 5000) / 100000.0f)) / 2.0f, ((((i6 << 1) + (i2 * 100)) + f108j[i2][12]) * 5000) / 100000.0f);
                } else if (i7 == 1) {
                    a(i3, i4, i5, ((400 - f108j[i2][9]) << 8) / 400);
                } else if (i7 == 6 || i7 == 7 || i7 == 8) {
                    p.setColor((255 << 16) | ((64 + ((((700 - i6) - 350) * 191) / 350)) << 8));
                    a(i3, i4, i5, 0.2f + ((i6 / 1000.0f) * 2.0f), (0.3f + (((i6 + (i2 * 100)) * 5000) / 100000.0f)) / 2.0f, ((((i6 << 1) + (i2 * 100)) + f108j[i2][12]) * 5000) / 100000.0f);
                }
            }
        }
    }

    public static final void B() {
        e.a((q.s(be / 11) * 1000) >> 12, 4000.0f, (q.t(be / 11) * 1000) >> 12, (q.s(be / 13) * 500) >> 12, 0.0f, (q.t(be / 21) * 500) >> 12, 0.0f, 1.0f, 0.0f);
        n.setIdentity();
        n.S(((be % 25600) << 5) / 1000);
        n.setColor(0);
        n.a(f95a[0]);
        n.aF();
    }

    public static final void o(int i2) {
        e.a(0.0f, 4000.0f, 0.0f, 0.0f, 0.0f, -400.0f, 0.0f, 1.0f, 0.0f);
        n.setIdentity();
        n.S(((i2 % 12800) << 5) / 1000);
        n.setColor(0);
        n.a(f95a[5]);
        n.aF();
    }

    public static final void p(int i2) {
        be += i2;
    }

    public static void q(int i2) {
        float f2 = (1.0f * i2) / 1000.0f;
        float f3 = (-(((q.s(bw >> 5) * 50) >> 12) - 50)) / 100.0f;
        e.a(a(10) + f90d, 6400.0f - (f3 * 4000.0f), (b(17) + f91e) - (f3 * b(8)), a(10), f3 * 2000.0f, b(13) - (f3 * b(8)), 0.0f, 1.0f, 0.0f);
        for (int i3 = 0; i3 < al.length; i3++) {
            if (f2 >= f122a[i3][0] && f2 < f122a[i3][1]) {
                float fMax = Math.max(0.0f, Math.min(((double) f122a[i3][2]) < 0.01d ? 1.0f : (f2 - f122a[i3][0]) / f122a[i3][2], 1.0f));
                int i4 = al[i3];
                n.setIdentity();
                n.postTranslate(a(10), -4000.0f, b(8));
                n.postScale(fMax, fMax, fMax);
                int i5 = q.fd % 5;
                int i6 = f110k[i4][0];
                int i7 = f110k[i4][1];
                int i8 = i6 >> 16;
                int i9 = (i6 >> 8) & 255;
                int i10 = i6 & 255;
                n.setColor(((i8 + ((((i7 >> 16) - i8) * i5) / 4)) << 16) | ((i9 + (((((i7 >> 8) & 255) - i9) * i5) / 4)) << 8) | (i10 + ((((i7 & 255) - i10) * i5) / 4)));
                n.a(f95a[i4]);
                n.S((i2 << 6) / 1000);
                n.aF();
            }
        }
        y();
    }

    public static void a(float f2, boolean z2) {
        f89a.setIdentity();
        f89a.postTranslate(a(20), 0.0f, 0.0f);
        f89a.postScale(f2, 1.0f, 1.02f * f2);
        f89a.postTranslate(-a(20), 0.0f, 0.0f);
        f89a.b(d(16776991, 16777215, (U[0] << 8) / 300), d(16776991, 16777215, (U[1] << 8) / 300), d(16776991, 16777215, (U[2] << 8) / 300), d(16776991, 16777215, (U[3] << 8) / 300), 6781706);
        f89a.b(z2);
    }

    public static void h(int i2, int i3) {
        a(0, i2, 100, i3, 3, 1);
    }

    public static void b(Graphics graphics) {
        if (f106q != null) {
            a(graphics, f106q, 0, 0, q.dm, q.dn);
        }
    }

    public static void C() {
        f106q = new n(c.a(new int[]{327803, 327789, 327799, 327795, 327791, 327797, 327801, 327793}), true);
    }

    static {
        int[][] iArr = {new int[]{0, 0}, new int[]{32, 0}, new int[]{64, 0}, new int[]{96, 0}, new int[]{128, 0}, new int[]{160, 0}, new int[]{192, 0}, new int[]{224, 0}, new int[]{0, 64}, new int[]{32, 64}, new int[]{64, 64}, new int[]{96, 64}, new int[]{128, 64}, new int[]{160, 64}, new int[]{192, 64}, new int[]{224, 64}, new int[]{128, 192}, new int[]{224, 128}, new int[]{0, 192}, new int[]{32, 128}, new int[]{64, 128}, new int[]{96, 128}, new int[]{128, 128}, new int[]{160, 128}, new int[]{192, 128}, new int[]{192, 192}, new int[]{32, 192}, new int[]{48, 192}, new int[]{64, 192}, new int[]{80, 192}, new int[]{196, 212, 57, 8}, new int[]{160, 224, 16, 32}, new int[]{96, 192, 32, 32}, new int[]{32, 224}, new int[]{48, 224}, new int[]{64, 224}, new int[]{80, 224}, new int[]{160, 192, 32, 32}, new int[]{176, 224, 16, 32}, new int[]{0, 128}, new int[]{96, 224, 32, 32}};
    }
}
