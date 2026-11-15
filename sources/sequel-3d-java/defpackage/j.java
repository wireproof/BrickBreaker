package defpackage;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.PolygonMode;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.Transform;

/* JADX INFO: loaded from: sequel-3d-java.jar:j.class */
public final class j {
    private static int j;
    private static int k;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static b f95j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private static b f96k;
    private static b l;
    public static b a;
    public static b b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static g[] f97a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static g[] f98b;
    private static g[] c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static l[][] f100a;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private static int f101l;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static l f103a;
    private static int m;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static Appearance[] f104a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Appearance f105a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static g f107a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static g f108b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static g f109c;
    private static g d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int f110a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image[] f111a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ab f114a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static float f115b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static float f116c;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static g e;
    private static g f;
    private static g g;
    private static g h;
    private static g i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static g f117j;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Texture2D[] f118a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Texture2D[] f119b;
    private static int r;
    private static int s;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private static g f120k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private static g f121l;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private static g f122m;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private static g f123n;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private static g f124o;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static int f125b;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    private static g f126p;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    private static g f127q;

    /* JADX INFO: renamed from: r, reason: collision with other field name */
    private static g f128r;

    /* JADX INFO: renamed from: s, reason: collision with other field name */
    private static g f129s;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private static b f130m;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private static b f131n;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private static b f132o;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    private static b f133p;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static b[] f134a;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    private static b f135q;
    private static int t;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static int f136c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static int f137d;
    private static int y;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static boolean f145c;
    private static int z;
    private static int A;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static int[] f151j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private static int[] f152k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private static int[] f153l;
    private static int B;
    private static int C;
    private static int D;
    private static int E;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private static int[] f154m;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private static int[] f155n;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String[] f156a;
    private static int F;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public static int f157g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static int f158h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public static int f159i;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static b f160c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static b f161d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static b f162e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static b f163f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Texture2D f164a;

    /* JADX INFO: renamed from: r, reason: collision with other field name */
    private static b f165r;
    private static int G;
    private static int H;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public static b f166g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static b f167h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public static b f168i;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Texture2D f169b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static float f170a;
    private static int I;
    private static int J;
    private static int K;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static boolean f171e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean[] f172a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean[] f173b;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private static int[] f174o;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    private static int[] f175p;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    private static int[] f176q;

    /* JADX INFO: renamed from: r, reason: collision with other field name */
    private static int[] f177r;
    private static int L;
    private static int M;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f178a;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static float f179d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static float f180e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static float f181f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static float f182g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static float f183h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static float f184i;

    /* JADX INFO: renamed from: s, reason: collision with other field name */
    private static int[] f185s;
    private static int N;
    private static int O;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static float[] f99a = new float[4];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f102a = new int[750];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int[] f106b = new int[4];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Transform f112a = new Transform();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[][] f113a = new int[3][3];
    private static int u = 0;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static int f138e = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f139a = false;
    private static int v = 0;
    private static int w = 0;
    private static int x = 0;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static int f140f = -1;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static final int[] f141c = {196633, 196634, 196635, 196636, 196637, 196638, 196639, 196640, 196641, 196642, 196643, 196644, 196645, 196646, 196647, 196648, 196649, 196650, 196651, 196652, 196653, 196654, 196655, 196656, 196657, 196658, 196659};

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static int[] f142d = {131106, 131107, 131108, 131109, 131110, 196608, 196609, 196610, 196629, 196611, 196612, 196613, 196614, 196615, 196616, 196617, 196618, 196619, 196620, 196621, 196622, 196623, 196624, 196625, 196626, 196628, 196631, 196627, 196632, 196630};

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static int[] f143e = new int[300];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean f144b = false;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static boolean f146d = false;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static int[] f147f = new int[2];

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static int[] f148g = new int[2];

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static int[] f149h = new int[2];

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static int[] f150i = new int[2];

    private static final void j() {
        n();
        L = 0;
        f171e = false;
        for (int i2 = 0; i2 < 30; i2++) {
            f143e[i2 * 10] = 0;
        }
        for (int i3 = 0; i3 < 5; i3++) {
            f154m[(i3 << 2) + 2] = 0;
        }
        l();
        m();
        f159i = 0;
    }

    private static final float a(Object[] objArr) {
        switch (z.b(objArr)) {
            case 2:
                return 150.0f;
            case 3:
                return 200.0f;
            default:
                return 100.0f;
        }
    }

    public static final float a(int i2) {
        return i2 * z.z * 0.277f;
    }

    public static final float b(int i2) {
        return i2 * z.A * 0.277f;
    }

    public static final float c(int i2) {
        return i2 * 0.277f;
    }

    public static final float d(int i2) {
        return (z.f380a[i2][4] + (z.f380a[i2][14] / 2)) * 0.277f;
    }

    public static void a(int i2, int i3) {
        j = i2;
        k = i3;
        F = 0;
        f96k = new b(a.a(new int[]{131100}));
        l = new b(a.a(new int[]{131101}));
        f95j = new b(a.a(new int[]{131099}));
        a = new b(a.a(131088), true);
        b = new b(a.a(131086), true);
        c = new g[l.a()];
        for (int i4 = 0; i4 < c.length; i4++) {
            c[i4] = new g();
            l.c(i4);
            c[i4].a(l);
            c[i4].d();
        }
        f97a = new g[f95j.a()];
        for (int i5 = 0; i5 < f97a.length; i5++) {
            f97a[i5] = new g();
            f95j.c(i5);
            f97a[i5].a(f95j);
            f97a[i5].d();
        }
        f98b = new g[f96k.a()];
        for (int i6 = 0; i6 < f98b.length; i6++) {
            f98b[i6] = new g();
            f96k.c(i6);
            f98b[i6].a(f96k);
            f98b[i6].d();
        }
    }

    public static final void a() {
        f156a = new String[f155n.length];
        for (int i2 = 0; i2 < f155n.length; i2++) {
            f156a[i2] = t.m87a(f155n[i2]);
        }
        z.i();
    }

    private static final void b(int i2, int i3) {
        float f2;
        float f3;
        a(6, true, 500, 2236962);
        Object[] objArr = z.f411a[i2];
        int i4 = ((int[]) objArr[1])[1];
        int i5 = ((int[]) objArr[1])[2];
        int iB = z.b(objArr);
        float f4 = i4 * 0.277f;
        switch (z.b(objArr)) {
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
        switch (z.b(objArr)) {
            case 3:
                f3 = 300.0f;
                break;
            default:
                f3 = 150.0f;
                break;
        }
        int i7 = (int) (f5 + (f3 * 0.5f));
        f159i = 700;
        int iC = z.c(objArr);
        if (iC == 1) {
            a(i6, i7, 512, 50, 400, 24, 0, 2);
            f101l = 1500;
        } else if (iC == 6) {
            a(i6, i7, 512, 50, 400, 24, 0, 2);
        }
        if (!z.m150a(objArr)) {
            int i8 = y * 10;
            f143e[i8] = 1;
            f143e[i8 + 1] = i6;
            f143e[i8 + 2] = iA;
            f143e[i8 + 3] = i7;
            f143e[i8 + 8] = iB + (i3 << 16);
            f143e[i8 + 4] = 0;
            f143e[i8 + 5] = 0;
            f143e[i8 + 6] = 0;
            f143e[i8 + 7] = 1;
            f143e[i8 + 9] = i2;
            int i9 = y + 1;
            y = i9;
            y = i9 % 30;
        }
        if (z.an == 2) {
            f144b = true;
        }
    }

    public static void b() {
        j();
        f145c = false;
        f146d = false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m41a(int i2) {
        if (z.am == 1) {
            v = 0;
            w = i2;
            x = 1;
        }
    }

    public static void c() {
        f144b = false;
        f146d = true;
        j();
    }

    public static void a(int i2, int i3, int i4) {
        switch (i2 & 255) {
            case 10:
                int i5 = i2 >> 8;
                switch (i5) {
                    case 0:
                    case 1:
                    case 20:
                        break;
                    default:
                        a(3, true, 400, 1118481);
                        a(5, true, 400, 1118481);
                        break;
                }
                m52d(i5);
                break;
            case 12:
                if (z.f403g) {
                    c((int) (b(1) / 3.0f), i4);
                } else {
                    c((int) (b(1) / 3.0f), i4);
                }
                break;
            case 30:
                f(2);
                break;
            case 33:
                f(3);
                n();
                a(0, false, 1000, 16777215);
                a(1, false, 1000, 16777215);
                a(2, false, 1000, 16777215);
                a(3, false, 1000, 16777215);
                a(4, false, 1000, 16777215);
                a(5, false, 1000, 16777215);
                l();
                m();
                break;
            case 34:
                b(i3, i4);
                break;
            case 35:
                Object[] objArr = z.f411a[i4];
                int i6 = ((int[]) objArr[1])[1];
                int i7 = ((int[]) objArr[1])[2];
                int i8 = (int) (i6 * 0.277f);
                int i9 = (int) (i7 * 0.277f);
                int i10 = E << 2;
                f154m[i10] = i8;
                f154m[i10 + 1] = i9;
                f154m[i10 + 2] = 500;
                f154m[i10 + 3] = i3;
                int i11 = E + 1;
                E = i11;
                E = i11 % 5;
                break;
            case 37:
                b(i3, i4);
                break;
            case 40:
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 5) {
                                if (i3 != 11) {
                                    if (i3 == 7) {
                                        f146d = false;
                                    } else if (i3 == 9) {
                                        f146d = false;
                                    }
                                    break;
                                } else {
                                    f(4);
                                    if (z.m == 1 && z.f410h[z.al][0] == 3) {
                                        a(6, true, 400, 16777215);
                                        m52d(18);
                                        break;
                                    }
                                }
                            } else {
                                f144b = false;
                                for (int i12 = 0; i12 < 30; i12++) {
                                    int i13 = i12 * 10;
                                    if (f143e[i13] == 1 && f143e[i13 + 6] < f143e[i13 + 5] && (f143e[i13 + 9] != -1 || f143e[i13 + 9] == -1)) {
                                        f143e[i13] = 0;
                                    }
                                }
                                v = 0;
                                w = i4;
                                switch (z.am) {
                                    case 1:
                                    case 3:
                                    case 4:
                                        x = 1;
                                        break;
                                    case 2:
                                        x = 2;
                                        break;
                                }
                            }
                        } else {
                            c();
                            break;
                        }
                    } else {
                        m41a(i4);
                        break;
                    }
                } else {
                    b();
                    break;
                }
                break;
            case 71:
                if (!f145c) {
                    f145c = true;
                }
                break;
            case 74:
                f144b = true;
                break;
            case 76:
                n();
                a(0, false, i3, 16777215);
                a(1, false, i3, 16777215);
                a(2, false, i3, 16777215);
                a(3, false, i3, 16777215);
                a(4, false, i3, 16777215);
                a(5, false, i3, 16777215);
                break;
            case 77:
                n();
                a(0, true, i3, 16777215);
                a(1, true, i3, 16777215);
                a(2, true, i3, 16777215);
                a(3, true, i3, 16777215);
                a(4, true, i3, 16777215);
                a(5, true, i3, 16777215);
                break;
            case 78:
                v = 0;
                w = i3;
                x = 2;
                break;
            case 83:
                d(i4 / 4, i3);
                break;
            case 84:
                d(i4 / 4, i3);
                break;
            case 85:
                d((-i4) / 4, i3);
                break;
        }
    }

    private static final void c(int i2, int i3) {
        f147f[i3] = 200;
        f148g[i3] = 200;
        f149h[i3] = i2;
    }

    private static final void k() {
        CompositingMode compositingMode = new CompositingMode();
        compositingMode.setBlending(68);
        compositingMode.setDepthTestEnable(true);
        compositingMode.setDepthWriteEnable(true);
        compositingMode.setAlphaWriteEnable(false);
        PolygonMode polygonMode = new PolygonMode();
        polygonMode.setCulling(161);
        for (int i2 = 16; i2 < f141c.length; i2++) {
            if (f141c[i2] != -1) {
                f104a[i2] = new Appearance();
                f104a[i2].setPolygonMode(polygonMode);
                f104a[i2].setTexture(0, new Texture2D(new Image2D(99, a.b(f141c[i2]))));
                f104a[i2].setCompositingMode(compositingMode);
            }
        }
    }

    public static final void d() {
        f163f = new b(a.a(131098), true);
        f161d = new b(a.a(131096), true);
        f162e = new b(a.a(131097), true);
        f166g = new b(a.a(131091), true);
        f167h = new b(a.a(131090), true);
    }

    public static final void e() {
        if (f163f != null) {
            f163f.m24a();
        }
        if (f161d != null) {
            f161d.m24a();
        }
        if (f162e != null) {
            f162e.m24a();
        }
        if (f167h != null) {
            f167h.m24a();
        }
        if (f166g != null) {
            f166g.m24a();
        }
    }

    private static void a(Graphics graphics, int i2, int i3) {
        if (i2 >= i3) {
            return;
        }
        int iMax = Math.max(0, (f111a.length * ((i3 - 1) - i2)) / i3);
        int height = f111a[0].getHeight();
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= k) {
                return;
            }
            graphics.drawImage(f111a[iMax], 0, i5, 20);
            i4 = i5 + height;
        }
    }

    public static void f() {
        d = null;
        f128r = null;
        f118a = null;
        f164a = null;
        f129s = null;
        f107a = null;
        f114a = null;
        f109c = null;
        g = null;
        i = null;
        e = null;
        h = null;
        f = null;
        f117j = null;
        f120k = null;
        if (f130m != null) {
            f130m.m24a();
        }
        if (f132o != null) {
            f132o.m24a();
        }
        if (f131n != null) {
            f131n.m24a();
        }
        if (f133p != null) {
            f133p.m24a();
        }
        if (f134a != null) {
            f134a = null;
        }
        if (f135q != null) {
            f135q.m24a();
        }
        f103a = null;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m42b(int i2) {
        switch (i2) {
            case 0:
                int i3 = j;
                int i4 = (k + 8) / 8;
                f111a = new Image[16];
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
                    byte[] bArrA = a.a(null, bArr, i3, i4, 255, 0, 0, 1024);
                    f111a[i5] = Image.createImage(bArrA, 0, bArrA.length);
                }
                d = new g(65553);
                f169b = g.m37a(196669);
                d.a(f169b);
                f128r = new g(65545);
                Texture2D[] texture2DArr = new Texture2D[5];
                f118a = texture2DArr;
                texture2DArr[0] = g.m37a(196660);
                f118a[1] = g.m37a(196661);
                f118a[2] = g.m37a(196663);
                f118a[3] = g.m37a(196662);
                f128r.a(f118a[0]);
                f164a = g.m37a(196668);
                g gVar = new g(65546);
                f129s = gVar;
                gVar.c(16777215);
                f129s.d();
                f107a = new g(65559);
                f108b = new g(65560);
                ab abVar = new ab();
                f114a = abVar;
                abVar.g();
                f114a.d();
                new g().b(54);
                break;
            case 2:
                g gVar2 = new g(65556);
                g = gVar2;
                gVar2.d();
                g.b();
                i = new g(65558);
                g gVar3 = new g();
                e = gVar3;
                gVar3.a(new int[][]{new int[]{0, 0, (int) (a(1) * 0.2f), (int) b(1)}});
                g gVar4 = new g(65554);
                h = gVar4;
                gVar4.a(g.m37a(196678));
                g gVar5 = new g(65555);
                f = gVar5;
                gVar5.a(g.m37a(196676));
                short sA = (short) a(1);
                short sB = (short) b(1);
                g gVar6 = new g();
                f117j = gVar6;
                gVar6.a(new int[][]{new int[]{-sA, -sB, sA << 1, sB}});
                f117j.a(g.m37a(196674));
                f117j.b();
                f117j.d();
                g gVar7 = new g();
                f120k = gVar7;
                gVar7.a(200);
                f120k.c(16777215);
                break;
            case 3:
                Texture2D[] texture2DArr2 = new Texture2D[4];
                f119b = texture2DArr2;
                texture2DArr2[0] = g.m37a(196664);
                f119b[1] = g.m37a(196665);
                f119b[2] = g.m37a(196666);
                f119b[3] = g.m37a(196667);
                break;
            case 4:
                g gVar8 = new g(65547);
                f121l = gVar8;
                gVar8.a(g.m37a(196671));
                f122m = new g(65548);
                f123n = new g(65549);
                f122m.a(g.m37a(196672));
                f123n.a(g.m37a(196672));
                g gVar9 = new g(65550);
                f124o = gVar9;
                gVar9.a(g.m37a(196670));
                f126p = new g(65552);
                f127q = new g(65551);
                f126p.a(g.m37a(196673));
                f127q.a(g.m37a(196673));
                break;
            case 5:
                if (f100a == null) {
                    f100a = new l[3][8];
                    for (int i13 = 0; i13 < 8; i13++) {
                        if (i13 == 7) {
                            f100a[0][i13] = new l();
                            f100a[0][i13].a(2, i13);
                            f100a[1][i13] = new l();
                            f100a[1][i13].a(1, i13);
                        }
                        if (i13 == 7 || i13 == 0 || i13 == 5) {
                            f100a[2][i13] = new l();
                            f100a[2][i13].a(0, i13);
                        }
                    }
                }
                break;
            case 6:
                if (f104a == null || f105a == null) {
                    CompositingMode compositingMode = new CompositingMode();
                    compositingMode.setBlending(68);
                    compositingMode.setDepthTestEnable(true);
                    compositingMode.setDepthWriteEnable(true);
                    compositingMode.setAlphaWriteEnable(false);
                    PolygonMode polygonMode = new PolygonMode();
                    polygonMode.setCulling(161);
                    if (f105a == null) {
                        Appearance appearance = new Appearance();
                        f105a = appearance;
                        appearance.setPolygonMode(polygonMode);
                        f105a.setCompositingMode(compositingMode);
                    }
                    if (f104a == null) {
                        f104a = new Appearance[f141c.length];
                        for (int i14 = 0; i14 < 16; i14++) {
                            f104a[i14] = new Appearance();
                            f104a[i14].setPolygonMode(polygonMode);
                            f104a[i14].setTexture(0, new Texture2D(new Image2D(99, a.b(f141c[i14]))));
                            f104a[i14].setCompositingMode(compositingMode);
                        }
                    }
                }
                break;
            case 7:
                k();
                break;
            case 9:
                f130m = new b(a.a(new int[]{131102}));
                f131n = new b(a.a(new int[]{131103}));
                f132o = new b(a.a(new int[]{131104}));
                f133p = new b(a.a(new int[]{131105}));
                break;
            case 10:
                f134a = new b[f142d.length];
                for (int i15 = 0; i15 < f142d.length; i15++) {
                    if (f142d[i15] != -1) {
                        f134a[i15] = new b(a.a(new int[]{f142d[i15]}));
                    }
                }
                break;
            case 11:
                b bVar = new b(a.a(196682), true);
                f165r = bVar;
                bVar.c(1);
                G = f165r.m22a().a;
                f165r.c(3);
                H = f165r.m22a().b;
                f157g = 3;
                break;
            case 12:
                f135q = new b(a.a(196680), true);
                if (f103a == null) {
                    l lVar = new l();
                    f103a = lVar;
                    lVar.g();
                }
                break;
            case 13:
                g gVar10 = new g(65557);
                f109c = gVar10;
                gVar10.d(196675);
                break;
        }
    }

    private static void l() {
        for (int i2 = 0; i2 < 50; i2++) {
            int i3 = (int) (z.f381b[0][4] * 0.277f);
            int i4 = (int) (z.f381b[0][5] * 0.277f);
            int i5 = i2 << 1;
            f152k[i5] = i3;
            f152k[i5 + 1] = i4;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m43a() {
        return z.ag > 0;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static boolean m44b() {
        return z.ah > 0;
    }

    private static void m() {
        for (int i2 = 0; i2 < 5; i2++) {
            f153l[(i2 << 2) + 2] = -100;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static final float m45a() {
        return z.f381b[m63b()][4] * 0.277f;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static final float m46b() {
        float f2 = z.j / 1000.0f;
        return (((-f2) * f2) + f2) * 2000.0f;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static final float m47c() {
        return (z.f381b[m63b()][5] + 50) * 0.277f;
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
        f134a[i6].a(graphics, i2 + f134a[6].e(), i3 + f134a[6].f());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final boolean m48a(int i2) {
        for (int i3 = 0; i3 < z.f385a.length; i3++) {
            if (z.f385a[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static final void g() {
        m.a(t.m98e(), t.a());
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
            f98b[i7].e();
            f98b[i7].a(f5, 0.0f, f4);
            f98b[i7].b(0.7f, 0.7f, 0.7f);
            f98b[i7].f();
            f5 += fA;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static int m49a(int i2, int i3) {
        int i4 = k - i3;
        int iMin = ((f159i * 60) / 1000) + ((Math.min(f110a, 500) * 60) / 1000);
        if (z.ad > 0) {
            iMin += ((1600 - z.ad) * 255) / 1600;
        }
        int i5 = (i4 * 100) / k;
        int[] iArr = z.f472j[i2];
        if (z.ao == 3 || z.U == 16) {
            iArr = z.f473e;
        }
        for (int i6 = 1; i6 < iArr.length / 2; i6++) {
            if (i4 < (iArr[(i6 << 1) + 1] * k) / 100) {
                int i7 = iArr[(i6 - 1) << 1];
                int i8 = iArr[i6 << 1];
                int i9 = i7 >> 16;
                int i10 = (i7 >> 8) & 255;
                int i11 = i7 & 255;
                int i12 = i8 >> 16;
                int i13 = (i8 >> 8) & 255;
                int i14 = i8 & 255;
                int i15 = iArr[(i6 << 1) + 1] - iArr[((i6 - 1) << 1) + 1];
                int i16 = i5 - iArr[((i6 - 1) << 1) + 1];
                return (Math.max(0, Math.min(255, (iMin + i9) + (((i12 - i9) * i16) / i15))) << 16) | (Math.max(0, Math.min(255, (iMin + i10) + (((i13 - i10) * i16) / i15))) << 8) | Math.max(0, Math.min(255, iMin + i11 + (((i14 - i11) * i16) / i15)));
            }
        }
        return iArr[iArr.length - 1];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static int m50a() {
        return z.m == 2 ? f157g % z.f472j.length : f158h;
    }

    private static final void d(int i2, int i3) {
        J = i2;
        I = i3;
        K = 0;
        f171e = true;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static final void m51c(int i2) {
        f159i = i2;
    }

    private static final void a(int i2, boolean z2, int i3, int i4) {
        if (f172a[i2]) {
            return;
        }
        f172a[i2] = true;
        f173b[i2] = z2;
        f175p[i2] = 0;
        f176q[i2] = i3;
        f174o[i2] = 1;
        f177r[i2] = i4;
    }

    private static final void n() {
        for (int i2 = 0; i2 < 7; i2++) {
            f172a[i2] = false;
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static final void m52d(int i2) {
        L = 1;
        f178a = f156a[i2];
        M = 0;
    }

    public static final void e(int i2) {
        L = 1;
        f178a = m53a(i2);
        M = 500;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final String m53a(int i2) {
        return f156a[(i2 + f155n.length) - 8];
    }

    private static void a(b bVar, Graphics graphics, int i2, int i3, int i4) {
        aa aaVarM21a = bVar.m21a();
        if (aaVarM21a == null) {
            return;
        }
        int[][] iArrA = aaVarM21a.m16a(bVar.d()).a();
        int length = iArrA.length;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArrA[i5][0];
            int i7 = (iArrA[i5][2] * i4) >> 8;
            int i8 = (iArrA[i5][3] * i4) >> 8;
            int i9 = (iArrA[i5][4] * i4) >> 8;
            int i10 = (iArrA[i5][5] * i4) >> 8;
            if (i6 == 4) {
                graphics.drawLine(i2 + i7, i3 + i8, i2 + i9, i3 + i10);
            } else if (i6 == 3) {
                graphics.drawRect(i2 + i7, i3 + i8, i9, i10);
            } else if (i6 == 2) {
                graphics.fillRect(i2 + i7, i3 + i8, i9, i10);
            }
        }
    }

    private static final void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = A * 10;
        f151j[i10] = i2;
        f151j[i10 + 1] = i3;
        f151j[i10 + 2] = i4;
        f151j[i10 + 3] = i5;
        f151j[i10 + 4] = 0;
        f151j[i10 + 5] = i6;
        f151j[i10 + 7] = i7;
        f151j[i10 + 6] = i9;
        f151j[i10 + 8] = i8;
        f151j[i10 + 9] = 0;
        int i11 = A + 1;
        A = i11;
        A = i11 % 15;
    }

    private static final void c(Graphics graphics) {
        for (int i2 = 0; i2 < 15; i2++) {
            int i3 = i2 * 10;
            if (f151j[i3 + 4] < f151j[i3 + 5] && f151j[i3 + 9] >= f151j[i3 + 8]) {
                int i4 = f151j[i3 + 4];
                int i5 = f151j[i3 + 5];
                int i6 = f151j[i3 + 2];
                int i7 = f151j[i3 + 3];
                int i8 = f151j[i3];
                int i9 = f151j[i3 + 1];
                f99a[0] = i8;
                f99a[1] = 0.0f;
                f99a[2] = i9;
                f99a[3] = 1.0f;
                m.a(f99a);
                int i10 = (int) f99a[0];
                int i11 = (int) f99a[1];
                int i12 = f151j[i3 + 7];
                int i13 = f151j[i3 + 6];
                graphics.setColor(16777215);
                if (i13 == 2) {
                    int i14 = i6 + (((i7 - i6) * i4) / i5);
                    int i15 = 8192 / i14;
                    int i16 = 8192 / i14;
                    int i17 = 8192 / (i14 - i12);
                    int i18 = 8192 / (i14 - i12);
                    graphics.fillRect(i10 - i17, i11 - i18, 2 * Math.abs(i17), Math.abs(i18 - i16));
                    graphics.fillRect(i10 - i17, i11 + i16, 2 * Math.abs(i17), Math.abs(i18 - i16));
                    graphics.fillRect(i10 - i17, i11 - i16, i17 - i15, i16 << 1);
                    graphics.fillRect(i10 + i15, i11 - i16, i17 - i15, i16 << 1);
                } else if (i13 == 1) {
                    int i19 = i6 + (((i7 - i6) * i4) / i5);
                    graphics.fillRect((i10 - i19) - i12, (i11 - i19) - i12, (i19 + i12) << 1, i12);
                    graphics.fillRect((i10 - i19) - i12, i11 + i19, (i19 + i12) << 1, i12);
                    graphics.fillRect((i10 - i19) - i12, i11 - i19, i12, i19 << 1);
                    graphics.fillRect(i10 + i19, i11 - i19, i12, i19 << 1);
                }
            }
        }
        graphics.setColor(16777215);
    }

    public static final void f(int i2) {
        switch (i2) {
            case 2:
                f139a = false;
                break;
        }
        f138e = i2;
        u = 0;
    }

    public static void g(int i2) {
        f132o.b(25);
        f131n.b(25);
        f130m.b(25);
        f136c = Math.max(0, f136c - 25);
        t = Math.max(0, t - 25);
        if (f136c <= 0) {
            f137d = 0;
        }
        if (f137d > 10) {
            f137d = 0;
            t = 10000;
        }
        u += 25;
        switch (f138e) {
            case 2:
                if (u > 500 && !f139a) {
                    f139a = true;
                }
                if (u > 1300) {
                    z.f();
                    f(1);
                }
                break;
            case 3:
                if (u > 1000) {
                    f(1);
                }
                break;
            case 4:
                if (u > 500) {
                    f(1);
                }
                break;
        }
        i(25);
        f101l = Math.max(0, f101l - 25);
        for (int i3 = 0; i3 < f106b.length; i3++) {
            f106b[i3] = Math.max(0, f106b[i3] - 25);
        }
        if (x != 0) {
            int i4 = v + 25;
            v = i4;
            if (i4 >= w) {
                x = 0;
            }
        }
        f125b += 25;
        if (z.U == 14) {
            if (f125b > 100) {
                f125b = 0;
            }
        } else if (z.U == 15) {
            if (f125b > 100) {
                f125b = 0;
            }
        } else if (f145c && f125b > 100) {
            f125b = 0;
        }
        int iMax = Math.max(0, s - 25);
        s = iMax;
        if (iMax == 0) {
            s = 100;
        }
        f115b = 0.0f;
        f116c = 0.0f;
        if (f110a > 0) {
            int iMin = Math.min(500, f110a);
            f115b = (((z.m135d() % 2000) - 1000) * iMin) / 10000.0f;
            f116c = (((z.m135d() % 2000) - 1000) * iMin) / 10000.0f;
        }
        if (z.af > 0) {
            f115b = (((z.m135d() % 2000) - 1000) * 800) / 10000.0f;
            f116c = (((z.m135d() % 2000) - 1000) * 800) / 10000.0f;
        }
        f110a = Math.max(0, f110a - 25);
        for (int i5 = 0; i5 < f142d.length; i5++) {
            if (f134a[i5] != null) {
                f134a[i5].b(25);
            }
        }
        F += 25;
        for (int i6 = 0; i6 < 30; i6++) {
            int i7 = i6 * 10;
            if (f143e[i7] == 1) {
                if (f143e[i7 + 6] < f143e[i7 + 5]) {
                    int[] iArr = f143e;
                    int i8 = i7 + 6;
                    iArr[i8] = iArr[i8] + 25;
                    if (f143e[i7 + 6] >= f143e[i7 + 5] && ((f143e[i7 + 8] >> 16) & 65535) == 1) {
                        a(f143e[i7 + 1], f143e[i7 + 2], 10, 200, 300 + Math.abs(z.m136e() % 200), 10, 0, 1);
                        a(f143e[i7 + 1], f143e[i7 + 2], 10, 200, 300 + Math.abs(z.m136e() % 200), 15, 150 + Math.abs(z.m136e() % 100), 1);
                    }
                } else {
                    int[] iArr2 = f143e;
                    int i9 = i7 + 4;
                    iArr2[i9] = iArr2[i9] + 25;
                    if (f143e[i7 + 4] > 600) {
                        f143e[i7] = 0;
                    }
                }
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (f147f[i10] > 0) {
                int[] iArr3 = f147f;
                int i11 = i10;
                iArr3[i11] = iArr3[i11] - 25;
                if (f147f[i10] > 0) {
                    f150i[i10] = (f147f[i10] * f149h[i10]) / f148g[i10];
                }
            } else {
                f150i[i10] = 0;
            }
        }
        for (int i12 = 0; i12 < 15; i12++) {
            int i13 = i12 * 10;
            if (f151j[i13 + 9] < f151j[i13 + 8]) {
                int[] iArr4 = f151j;
                int i14 = i13 + 9;
                iArr4[i14] = iArr4[i14] + 25;
            } else {
                int[] iArr5 = f151j;
                int i15 = i13 + 4;
                iArr5[i15] = iArr5[i15] + 25;
            }
        }
        D += 25;
        while (D > 30) {
            int i16 = B * 3;
            int i17 = f152k[i16];
            int i18 = f152k[i16 + 1];
            int i19 = f152k[i16 + 2];
            int i20 = C * 5;
            if (m43a()) {
                f153l[i20] = i17 + (z.m136e() % 3);
                f153l[i20 + 1] = i18 + (z.m136e() % 3);
                f153l[i20 + 2] = i19 + (z.m136e() % 3);
            } else {
                f153l[i20] = i17;
                f153l[i20 + 1] = i18;
                f153l[i20 + 2] = i19;
            }
            if (m43a()) {
                f153l[i20 + 3] = 150 + Math.abs(z.m136e() % 200);
            } else {
                f153l[i20 + 3] = 100 + Math.abs(z.m136e() % 200);
            }
            f153l[i20 + 4] = f153l[i20 + 3];
            int i21 = C + 1;
            C = i21;
            C = i21 % 5;
            D -= 30;
        }
        int i22 = B + 1;
        B = i22;
        B = i22 % 50;
        for (int i23 = 0; i23 < 5; i23++) {
            int[] iArr6 = f153l;
            int i24 = (i23 * 5) + 3;
            iArr6[i24] = iArr6[i24] - 25;
        }
        M += 25;
        switch (L) {
            case 1:
                L = 3;
                M = 0;
                break;
            case 2:
                if (M >= 500) {
                    M = 0;
                    L = 3;
                }
                break;
            case 3:
                if (M >= 2000) {
                    M = 0;
                    L = 0;
                }
                break;
            case 4:
                if (M >= 500) {
                    M = 0;
                    L = 0;
                }
                break;
        }
        for (int i25 = 0; i25 < 5; i25++) {
            int[] iArr7 = f154m;
            int i26 = (i25 << 2) + 2;
            iArr7[i26] = iArr7[i26] - 25;
        }
        int i27 = K + 25;
        K = i27;
        if (i27 > I) {
            f171e = false;
        }
        f159i = Math.max(0, f159i - 25);
        if (f145c) {
            int i28 = z + 25;
            z = i28;
            if (i28 > 2000) {
                f145c = false;
                z = 0;
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final int m54a(int i2, int i3, int i4) {
        return (i2 << 16) | (i3 << 8) | i4;
    }

    public static final void h(int i2) {
        f106b[i2] = 300;
    }

    private static int b(int i2, int i3, int i4) {
        return (((i4 * 255) + (((i2 >> 8) & 255) * (255 - i4))) & 65280) + (((((i3 & 16711935) * i4) + ((i2 & 16711935) * (255 - i4))) >> 8) & 16711935);
    }

    private static void a(b bVar, g[] gVarArr, int i2, int i3, int i4, int i5, int i6) {
        bVar.c(5);
        int iG = ((bVar.g() * 5) << 8) >> 8;
        int i7 = i2 - (iG / 2);
        int i8 = 0;
        if (i5 == 0) {
            i8 = 1;
        } else {
            int i9 = i5;
            while (i9 != 0) {
                i9 /= 10;
                i8++;
            }
        }
        int i10 = i7 + (((i8 * iG) + ((i8 - 1) * 10)) >> 1);
        if (i5 == 0) {
            gVarArr[0].e();
            gVarArr[0].a(i10, -1500, i4);
            gVarArr[0].f();
            return;
        }
        while (i5 > 0) {
            int i11 = i5 % 10;
            i5 /= 10;
            if (i11 >= 0 && i11 < 10) {
                gVarArr[i11].e();
                gVarArr[i11].a(i10, -1500, i4);
                gVarArr[i11].f();
            }
            i10 -= iG + 10;
        }
    }

    private static void a(Graphics graphics, b bVar, int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        int iG = (bVar.g() * i5) >> 8;
        if (z3) {
            int i6 = 0;
            if (i4 == 0) {
                i6 = 1;
            } else {
                int i7 = i4;
                while (i7 != 0) {
                    i7 /= 10;
                    i6++;
                }
            }
            i2 += ((i6 * iG) + (i6 - 1)) >> 1;
        }
        int i8 = i2;
        if (i4 == 0) {
            bVar.c(0);
            a(bVar, graphics, i8, i3, i5);
        } else {
            while (i4 > 0) {
                int i9 = i4 % 10;
                i4 /= 10;
                if (i9 >= 0 && i9 < 10) {
                    bVar.c(i9);
                    a(bVar, graphics, i8, i3, i5);
                }
                i8 -= iG + 1;
            }
        }
        if (z2) {
            bVar.c(10);
            a(bVar, graphics, i8, i3, i5);
        }
    }

    public static float a(boolean z2) {
        float fA;
        float f2;
        float fB;
        if (z2) {
            fA = a(z.f(z.f351a)) - m45a();
            f2 = -m46b();
            fB = b(z.g(z.f351a)) - m47c();
        } else {
            int i2 = z.f381b[m63b()][4] - ((z.f381b[m63b()][6] * 25) >> 8);
            int i3 = z.f381b[m63b()][5] - ((z.f381b[m63b()][7] * 25) >> 8);
            fA = a(z.f(z.f351a)) - (i2 * 0.277f);
            f2 = -m46b();
            fB = b(z.g(z.f351a)) - (i3 * 0.277f);
        }
        float fSqrt = 1.0f - (((float) Math.sqrt(((fA * fA) + (f2 * f2)) + (fB * fB))) / b(3));
        float f3 = fSqrt;
        if (fSqrt < 0.0f) {
            f3 = 0.0f;
        }
        float f4 = 1.0f - f3;
        return (1.0f - (f4 * f4)) * 0.8f;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    private static float m55d() {
        float fA = a(10) + ((d(0) - a(10)) * 0.6f) + f115b;
        return z.m128a() ? fA + ((m45a() - fA) * a(true)) : fA;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    private static float m56e() {
        if (z.m128a()) {
            return 2810.0f + ((m46b() - 2810.0f) * a(true));
        }
        return 2810.0f;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    private static float m57f() {
        float fB = 1551.0f + b(10) + (z.f381b[0][5] * 0.277f * 0.1f) + f116c;
        return z.m128a() ? fB + ((m47c() - fB) * a(true)) : fB;
    }

    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    private static float m58g() {
        float f2 = (z.V - z.W) / z.V;
        return m56e() - ((f2 * f2) * 4000.0f);
    }

    private static float h() {
        return m57f() + ((b(15) * (z.V - z.W)) / z.V);
    }

    private static float i() {
        return m56e() - ((z.f352h * 2810) / 1000);
    }

    /* JADX INFO: renamed from: j, reason: collision with other method in class */
    private static float m59j() {
        return m57f() + ((z.f352h * 510) / 1000);
    }

    /* JADX INFO: renamed from: k, reason: collision with other method in class */
    private static float m60k() {
        return m56e() - (((z.V - z.W) * 2510) / z.V);
    }

    /* JADX INFO: renamed from: l, reason: collision with other method in class */
    private static float m61l() {
        return m57f() - (((z.V - z.W) * 510) / z.V);
    }

    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public static void m62h() {
        m.a(f179d + f115b, f180e, f181f + f116c, f182g, f183h, f184i, 0.0f, 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static int m63b() {
        for (int i2 = 0; i2 < 3; i2++) {
            if (z.f381b[i2][1] != 0) {
                return i2;
            }
        }
        return 0;
    }

    public static void i(int i2) {
        float f2 = 4.0f;
        boolean z2 = false;
        float fM55d = m55d();
        float fM56e = m56e();
        float fM57f = m57f();
        float fA = a(10) + ((d(0) - a(10)) * 0.4f);
        float fB = 0.0f;
        float fB2 = b(10);
        if (z.m128a()) {
            int i3 = 0;
            for (int i4 = 0; i4 < 3; i4++) {
                if (z.f381b[i4][1] != 0) {
                    i3++;
                }
            }
            if (i3 == 1) {
                f2 = 3.0f;
                fA += (m45a() - fA) * a(true);
                fB = 0.0f + (m46b() * a(true));
                fB2 += (m47c() - fB2) * a(true);
            }
        }
        if (z.U == 14) {
            fM57f -= (z.f352h * 3700) / 1000;
            fB2 -= (z.f352h * 3700) / 1000;
            z.f353a = Math.max(z.f353a - ((2.5f * i2) / 1000.0f), 0.0f);
        } else if (z.U == 15) {
            fM55d = m55d();
            fM56e = i();
            fM57f = m59j();
            fB -= (z.f352h * b(10)) / 1000.0f;
            fB2 = b(10) - ((z.f352h * 1000) / 1000);
        } else if (z.U != 16 && z.U != 17) {
            int iA = (int) a(10);
            int iB = (int) b(8);
            if (z.f353a > 0.01f) {
                int i5 = 0;
                while (i5 < 3 && z.f381b[i5][1] == 0) {
                    i5++;
                }
                if (i5 == 3) {
                    i5 = 0;
                }
                float f3 = z.f381b[i5][4] * 0.277f;
                float f4 = z.f381b[i5][5] * 0.277f;
                float fD = f3 + ((d(0) - f3) * 0.3f);
                float fM56e2 = 0.4f * m56e();
                float f5 = f4 + (7 * z.A * 0.277f);
                fM55d += (fD - fM55d) * z.f353a;
                fM56e += (fM56e2 - fM56e) * z.f353a;
                fM57f += (f5 - fM57f) * z.f353a;
                fA += (f3 - fA) * z.f353a;
                fB2 += (f4 - fB2) * z.f353a;
            }
            if (z.k > 0) {
                int iM137f = ((z.k << 9) << 1) / 8000;
                int iM137f2 = 256;
                if (z.l == 1) {
                    float f6 = iM137f / 1024.0f;
                    float f7 = f6 * f6 * 2048.0f;
                    iM137f = (z.m137f((int) f7) * 48) >> 12;
                    iM137f2 = ((z.m137f(((int) f7) << 1) << 6) >> 12) + 256;
                }
                int i6 = (((int) (fM55d - iA)) * iM137f2) >> 8;
                int i7 = (((int) (fM57f - iB)) * iM137f2) >> 8;
                fM55d = (((z.m138g(iM137f) * i6) >> 12) - ((z.m137f(iM137f) * i7) >> 12)) + iA;
                fM57f = ((z.m137f(iM137f) * i6) >> 12) + ((z.m138g(iM137f) * i7) >> 12) + iB;
            }
            if (f138e == 2) {
                z2 = true;
                fM56e = 500.0f + (((fM56e - 500.0f) * u) / 1300.0f);
            }
            if (z.V != 0) {
                switch (z.am) {
                    case 1:
                        z2 = true;
                        float f8 = fB - (((z.V - z.W) / z.V) * 2000.0f);
                        fM55d = m55d();
                        fM56e = m58g();
                        fM57f = h();
                        fB = f8;
                        break;
                    case 2:
                        z2 = true;
                        float f9 = fB + (((z.V - z.W) / z.V) * 2000.0f);
                        fM55d = m55d();
                        fM56e = m60k();
                        fM57f = m61l();
                        fB = f9;
                        break;
                }
            }
        } else {
            fM56e += (z.f352h * b(20)) / 1000.0f;
            fB += (z.f352h * b(20)) / 1000.0f;
        }
        float fMin = Math.min(0.5f, (f2 * i2) / 1000.0f);
        if (!z2) {
            f179d = (f179d * (1.0f - fMin)) + (fM55d * fMin);
            f180e = (f180e * (1.0f - fMin)) + (fM56e * fMin);
            f181f = (f181f * (1.0f - fMin)) + (fM57f * fMin);
            f182g = (f182g * (1.0f - fMin)) + (fA * fMin);
            f183h = (f183h * (1.0f - fMin)) + (fB * fMin);
            f184i = (f184i * (1.0f - fMin)) + (fB2 * fMin);
            return;
        }
        z.f353a = 0.0f;
        f179d = fM55d;
        f180e = fM56e;
        f181f = fM57f;
        f182g = fA;
        f183h = fB;
        f184i = fB2;
    }

    private static final void a(int i2, g[] gVarArr) {
        for (g gVar : gVarArr) {
            gVar.c(i2);
        }
    }

    public static void a(Graphics graphics) {
        int i2;
        float f2;
        float f3;
        float f4;
        int i3;
        graphics.setColor(0);
        graphics.fillRect(0, 0, t.m98e(), t.a());
        if (z.f364d || z.f365e) {
            return;
        }
        System.currentTimeMillis();
        j = t.m98e();
        k = t.a();
        int iM50a = m50a();
        int i4 = j;
        int i5 = k;
        for (int i6 = 0; i6 < i5; i6++) {
            int iM49a = m49a(iM50a, i6 + 1);
            if (f138e == 3) {
                int i7 = iM49a >> 16;
                int i8 = (iM49a >> 8) & 255;
                int i9 = iM49a & 255;
                iM49a = ((i7 + (((0 - i7) * u) / 1000)) << 16) | ((i8 + (((0 - i8) * u) / 1000)) << 8) | (i9 + (((0 - i9) * u) / 1000));
            } else if (z.f352h != 0) {
                int i10 = iM49a;
                if (z.U == 16) {
                    i10 = 16777215;
                }
                int i11 = iM49a >> 16;
                int i12 = (iM49a >> 8) & 255;
                int i13 = iM49a & 255;
                iM49a = ((i11 + ((((i10 >> 16) - i11) * z.f352h) / 1000)) << 16) | ((i12 + (((((i10 >> 8) & 255) - i12) * z.f352h) / 1000)) << 8) | (i13 + ((((i10 & 255) - i13) * z.f352h) / 1000));
            }
            graphics.setColor(iM49a);
            graphics.fillRect(0, i6, i4, 1);
        }
        c(graphics);
        m.a(graphics);
        if (f138e != 3) {
            m62h();
            f99a[0] = a(10);
            f99a[1] = b(-25);
            f99a[2] = b(1);
            f99a[3] = 1.0f;
            m.a(f99a);
            m55d();
            int iA = (int) a(10);
            int iB = (int) b(8);
            graphics.setColor(268435455);
            a(268435455, f97a);
            a(268435455, f98b);
            int i14 = iB + 1;
            if (L != 0) {
                if (L == 3) {
                    String str = f178a;
                    int length = str.length();
                    int iG = (f95j.g() * 5) << 1;
                    int i15 = iG / 6;
                    int i16 = (length * iG) + ((length - 1) * i15);
                    for (int i17 = 0; i17 < length; i17++) {
                        if (str.toUpperCase().charAt(i17) == ' ') {
                            i16 -= (i15 + iG) / 2;
                        }
                    }
                    int i18 = iA - (i16 >> 1);
                    for (int i19 = 0; i19 < length; i19++) {
                        char cCharAt = str.toUpperCase().charAt(i19);
                        if (cCharAt != ' ') {
                            int i20 = cCharAt - 'A';
                            if (cCharAt == 214) {
                                i20 = 26;
                            }
                            if (cCharAt == 220) {
                                i20 = 27;
                            }
                            if (i20 >= 0 && i20 < f97a.length) {
                                f97a[i20].e();
                                f97a[i20].a(i18, -1500.0f, i14);
                                f97a[i20].b(2.0f, 1.0f, 2.0f);
                                f97a[i20].f();
                            }
                            i3 = i15 + iG;
                        } else {
                            i3 = (i15 + iG) / 2;
                        }
                        i18 += i3;
                    }
                }
            } else if (z.m == 3) {
                a(f96k, f98b, iA, -1500, i14, z.ab / 4, 100);
            } else if (z.aa > 0) {
                a(f96k, f98b, iA, -1500, i14, z.aa, 100);
            }
        } else {
            m62h();
        }
        if (f138e != 3) {
            int i21 = z.al;
            int iM49a2 = m49a(m50a(), k / 2);
            int iMin = (Math.min(255, (iM49a2 >> 16) + 24) << 16) | (Math.min(255, ((iM49a2 >> 8) & 255) + 24) << 8) | Math.min(255, (iM49a2 & 255) + 24);
            a(16777215, f98b);
            if (z.m == 2 || z.m == 1) {
                i.e();
                i.c(16777215);
                i.a(a(1), 0.0f, b(16) - (b(1) * 0.5f));
                i.f();
                a(z.X, a(5), 0.0f, b(15), true);
            }
            if (z.m == 1 || (z.m == 2 && z.ao == 1)) {
                float fA = a(18);
                float fB = b(15);
                if (z.ao == 3) {
                    f107a.e();
                    f107a.c(16777215);
                    f107a.a(fA, 0.0f, fB + (b(1) * 0.5f));
                    f107a.f();
                } else if (z.ao == 1) {
                    f108b.e();
                    f108b.c(16777215);
                    f108b.a(fA, 0.0f, fB + (b(1) * 0.5f));
                    f108b.f();
                } else {
                    a(z.f + z.al + 1, a(20), 0.0f, b(15), false);
                }
            } else if (z.m == 2) {
                a(z.o + 1, a(16), 0.0f, b(15), false);
                e.e();
                e.a(a(15), 0.0f, b(15));
                e.c(16777215);
                e.b(-0.05f, 0.0f, 1.0f, 0.0f);
                e.f();
                a(99, a(21), 0.0f, b(15), false);
            }
            f114a.e();
            f114a.a(b(iMin, 16777215, (f106b[0] << 8) / 300), b(iMin, 16777215, (f106b[1] << 8) / 300), b(iMin, 16777215, (f106b[2] << 8) / 300), b(iMin, 16777215, (f106b[3] << 8) / 300), iMin);
            f114a.a(!f144b);
            if (z.ai <= 0) {
                int i22 = z.f410h[i21][1];
                int i23 = z.f410h[i21][7];
                float f5 = -50.0f;
                float f6 = -75.0f;
                float f7 = -100.0f;
                int i24 = 49344;
                m = 0;
                for (int i25 = i23; i25 < i23 + i22; i25++) {
                    Object[] objArr = z.f411a[i25];
                    if (z.m150a(objArr)) {
                        int i26 = ((int[]) objArr[1])[1];
                        int i27 = ((int[]) objArr[1])[2];
                        float f8 = i26 * 0.277f;
                        float f9 = i27 * 0.277f;
                        if (z.ad > 0) {
                            float fAbs = 20.0f - (Math.abs(((z.m131a(10 - z.f(objArr), 8 - z.g(objArr)) * 80) - z.ad) + 400) / 20.0f);
                            if (fAbs > 0.0f) {
                                f5 -= fAbs;
                                f6 -= fAbs;
                                f7 -= fAbs;
                            }
                        }
                        if (f138e == 2 || z.am == 4) {
                            int i28 = (i24 * 71) + 1377;
                            i24 = i28;
                            int iAbs = Math.abs(i28) % 1000;
                            if (z.am == 4) {
                                float f10 = iAbs - z.W;
                                float f11 = (-f10) * 10.0f;
                                if (f10 > 0.0f) {
                                    f5 -= f11;
                                    f6 -= f11;
                                    f7 -= f11;
                                }
                            } else {
                                float f12 = iAbs - u;
                                float f13 = f12 * 4.0f;
                                if (f12 > 0.0f) {
                                    f5 -= f13;
                                    f6 -= f13;
                                    f7 -= f13;
                                }
                            }
                        }
                        int iC = z.c(objArr);
                        if (z.aj > 0) {
                            iC = 2;
                        }
                        if (z.ak > 0 && iC != 1 && iC != 6) {
                            iC = 3;
                        }
                        switch (z.b(objArr)) {
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
                        if (z.ah > 0 && z.f412b[i25] == 1) {
                            int[] iArr = f102a;
                            int i29 = m;
                            m = i29 + 1;
                            iArr[i29] = 26;
                            int[] iArr2 = f102a;
                            int i30 = m;
                            m = i30 + 1;
                            iArr2[i30] = (int) (f8 + f2);
                            int[] iArr3 = f102a;
                            int i31 = m;
                            m = i31 + 1;
                            iArr3[i31] = (int) fMin;
                            int[] iArr4 = f102a;
                            int i32 = m;
                            m = i32 + 1;
                            iArr4[i32] = (int) (f9 + f4);
                            int[] iArr5 = f102a;
                            int i33 = m;
                            m = i33 + 1;
                            iArr5[i33] = i2;
                        } else if (iC == 3) {
                            boolean z2 = z.ao == 1;
                            int iD = z.d(objArr) + (m50a() << 2);
                            if (z.ak > 0) {
                                if (iD == 16) {
                                    iD--;
                                } else if (iD == 17) {
                                    iD -= 2;
                                } else if (iD == 18) {
                                    iD -= 3;
                                }
                            }
                            if (z2 && z.d(objArr) == 2) {
                                iD = 25;
                            }
                            if (!((boolean[]) objArr[0])[0] || z.ak > 0 || z.aj > 0) {
                                int[] iArr6 = f102a;
                                int i34 = m;
                                m = i34 + 1;
                                iArr6[i34] = iD;
                                int[] iArr7 = f102a;
                                int i35 = m;
                                m = i35 + 1;
                                iArr7[i35] = (int) (f8 + f2);
                                int[] iArr8 = f102a;
                                int i36 = m;
                                m = i36 + 1;
                                iArr8[i36] = (int) fMin;
                                int[] iArr9 = f102a;
                                int i37 = m;
                                m = i37 + 1;
                                iArr9[i37] = (int) (f9 + f4);
                                int[] iArr10 = f102a;
                                int i38 = m;
                                m = i38 + 1;
                                iArr10[i38] = i2;
                            } else {
                                f100a[i2][7].a().setDefaultColor(16777215);
                                f100a[i2][7].e();
                                f100a[i2][7].e(iD);
                                f100a[i2][7].a(f8 + f2, fMin, f9 + f4);
                            }
                            if (((boolean[]) objArr[0])[0] && z.ak <= 0 && z.aj <= 0) {
                                int iA2 = z.a(objArr);
                                if (iA2 < z.b) {
                                    float f14 = (iA2 - z.b) - 150;
                                    float f15 = iA2 - 150;
                                    if (f15 < 0.0f) {
                                        f100a[i2][7].b((f15 * 0.5f) / 150.0f, 1.0f, 0.0f, 0.0f);
                                    }
                                    f100a[i2][7].f();
                                    if (f15 < 0.0f || f14 > 0.0f) {
                                        f100a[i2][7].b(0.5f, 1.0f, 0.0f, 0.0f);
                                        f100a[i2][7].e(18);
                                        f100a[i2][7].f();
                                    }
                                } else {
                                    f100a[i2][7].e(18);
                                    float f16 = iA2 - ((z.b + z.c) - 150);
                                    float f17 = iA2 - (z.b + 150);
                                    if (f17 < 0.0f) {
                                        f100a[i2][7].b((f17 * 0.5f) / 150.0f, 1.0f, 0.0f, 0.0f);
                                    }
                                    f100a[i2][7].f();
                                    if (f17 < 0.0f || f16 > 0.0f) {
                                        f100a[i2][7].b(-0.5f, 1.0f, 0.0f, 0.0f);
                                        f100a[i2][7].e(iD);
                                        f100a[i2][7].f();
                                    }
                                }
                            }
                        } else if (iC == 6 || iC == 1) {
                            int i39 = iC == 1 ? 16 : 17;
                            int[] iArr11 = f102a;
                            int i40 = m;
                            m = i40 + 1;
                            iArr11[i40] = i39;
                            int[] iArr12 = f102a;
                            int i41 = m;
                            m = i41 + 1;
                            iArr12[i41] = (int) (f8 + f2);
                            int[] iArr13 = f102a;
                            int i42 = m;
                            m = i42 + 1;
                            iArr13[i42] = (int) fMin;
                            int[] iArr14 = f102a;
                            int i43 = m;
                            m = i43 + 1;
                            iArr14[i43] = (int) (f9 + f4);
                            int[] iArr15 = f102a;
                            int i44 = m;
                            m = i44 + 1;
                            iArr15[i44] = i2;
                            if (iC == 1) {
                                float fM137f = ((((z.m137f(F >> 2) * ((int) a(objArr))) >> 12) * 0.5f) + a(objArr)) * 0.5f;
                                n = (int) (f8 + 100.0f);
                                o = (int) ((a(objArr) * 2.0f) + fM137f);
                                p = (int) (f9 + 150.0f);
                                q = (int) ((a(objArr) * 2.0f) - fM137f);
                                h.e();
                                h.e();
                                h.a(n, o, p);
                                h.b((1.0f * F) / 4000.0f, 0.0f, 1.0f, 0.0f);
                                h.b(0.7f, 0.7f, 0.7f);
                                h.f();
                            } else if (iC == 6) {
                                float fM137f2 = ((((z.m137f(F >> 2) * ((int) a(objArr))) >> 12) * 0.5f) + a(objArr)) * 0.5f;
                                f.e();
                                f.a(f8 + 100.0f, a(objArr) + fM137f2, f9 + 150.0f);
                                f.b(F / 1500.0f, 0.0f, 1.0f, 0.0f);
                                f.f();
                            }
                        } else if (iC == 4 || iC == 5 || iC == 2) {
                            int iE = z.e(objArr);
                            int i45 = -1;
                            switch (iC) {
                                case 2:
                                    i45 = 18;
                                    break;
                                case 4:
                                    i45 = 19;
                                    if (iE > -1 && iE != 1) {
                                        i45 = 20;
                                    }
                                    break;
                                case 5:
                                    if (iE > -1) {
                                        i45 = iE == 2 ? 22 : 21;
                                        if (iE == 1) {
                                            i45 = 23;
                                        }
                                        if (iE == 0) {
                                            i45 = 24;
                                        }
                                    }
                                    break;
                            }
                            if (i45 >= 0) {
                                int[] iArr16 = f102a;
                                int i46 = m;
                                m = i46 + 1;
                                iArr16[i46] = i45;
                                int[] iArr17 = f102a;
                                int i47 = m;
                                m = i47 + 1;
                                iArr17[i47] = (int) (f8 + f2);
                                int[] iArr18 = f102a;
                                int i48 = m;
                                m = i48 + 1;
                                iArr18[i48] = (int) fMin;
                                int[] iArr19 = f102a;
                                int i49 = m;
                                m = i49 + 1;
                                iArr19[i49] = (int) (f9 + f4);
                                int[] iArr20 = f102a;
                                int i50 = m;
                                m = i50 + 1;
                                iArr20[i50] = i2;
                            }
                        }
                    }
                }
                f103a.a = 0;
                for (int i51 = 0; i51 < f104a.length; i51++) {
                    int i52 = 0;
                    for (int i53 = 0; i53 < m; i53 += 5) {
                        if (f102a[i53] == i51 && i52 < 150) {
                            f103a.a((short) f102a[i53 + 1], (short) f102a[i53 + 2], (short) f102a[i53 + 3], (short) f102a[i53 + 4], i51, i52 * 14);
                            i52++;
                        }
                    }
                    if (i52 != 0) {
                        f103a.a = i52;
                        f103a.h();
                        f103a.e(i51);
                        f103a.f();
                    }
                }
            }
            if (f144b) {
                float fM137f3 = ((z.m137f(F >> 2) * ((int) b(1))) >> 12) >> 1;
                float f18 = f101l / 1500.0f;
                float f19 = f18 * f18;
                float f20 = 1.0f - f19;
                float fA2 = a(10) + ((n - a(10)) * f19);
                g.c(iMin);
                if (z.al != 0) {
                    float fB2 = b(18) + fM137f3;
                    float f21 = q * f19;
                    float f22 = fB2 + ((p - fB2) * f19);
                    g.e();
                    g.a(fA2, f21, f22);
                    g.b(0.5f + (f19 * 0.25f), 1.0f, 0.0f, 0.0f);
                    g.b(0.5f + (f20 * 0.5f), 0.5f + (f20 * 0.5f), 0.5f + (f20 * 0.5f));
                    g.f();
                }
                float fB3 = b(-1) - fM137f3;
                float f23 = o * f19;
                float f24 = fB3 + ((p - fB3) * f19);
                g.e();
                g.a(fA2, f23, f24);
                g.b(f19 * 0.25f, 1.0f, 0.0f, 0.0f);
                g.b(0.5f + (f20 * 0.5f), 0.5f + (f20 * 0.5f), 0.5f + (f20 * 0.5f));
                g.f();
            }
        }
        for (int i54 = 0; i54 < 30; i54++) {
            int i55 = i54 * 10;
            if (f143e[i55] == 1) {
                int i56 = f143e[i55 + 8] & 65535;
                l lVar = f100a[2][7];
                switch (i56) {
                    case 2:
                        lVar = f100a[1][7];
                        break;
                    case 3:
                        lVar = f100a[0][7];
                        break;
                }
                if (f143e[i55 + 6] >= f143e[i55 + 5] && f143e[i55 + 4] < 150) {
                    f112a.setIdentity();
                    f112a.postTranslate(f143e[i55 + 1], f143e[i55 + 2], f143e[i55 + 3]);
                    int i57 = 255 - ((f143e[i55 + 4] * 255) / 600);
                    lVar.c((i57 << 16) | (i57 << 8) | i57);
                    lVar.e();
                    lVar.a(f143e[i55 + 1], f143e[i55 + 2], f143e[i55 + 3]);
                    lVar.a(f105a);
                    lVar.f();
                    lVar.c(16777215);
                }
            }
        }
        if ((z.f392c[11] && z.b(z.e) == 11) || z.ae != 0) {
            for (int i58 = 0; i58 < 3; i58++) {
                if (z.f381b[i58][1] != 0 && z.f401d[i58]) {
                    f124o.e();
                    f124o.a(z.m124c(i58) * 0.277f, 0.0f, z.m125d(i58) * 0.277f);
                    f124o.b((z.s % 1000) / 1000.0f, -1.0f, 0.0f, 0.0f);
                    f124o.f();
                }
            }
        }
        if (z.f397e[0][0] == 1) {
            int iD2 = (int) d(0);
            int i59 = (int) (z.f397e[0][2] * 0.277f);
            int i60 = (int) (z.f397e[0][3] * 0.277f);
            float fM137f4 = 1.0f + (((z.m137f(F >> 2) * 100) >> 12) / 300.0f);
            f170a = fM137f4 * z.z;
            f117j.e();
            f117j.f88a = false;
            f117j.a(iD2, 0.0f, i59);
            f117j.b(fM137f4, 0.0f, (i59 - i60) / b(1));
            f117j.c(16777215);
            f117j.f();
        }
        for (int i61 = 0; i61 < 1; i61++) {
            boolean z3 = z.f402g[0][0] == 1;
            int i62 = z.f402g[0][6];
            if (z3 && i62 == 1) {
                int i63 = (int) (z.f402g[0][1] * 0.277f);
                int i64 = (int) (z.f402g[0][2] * 0.277f);
                f112a.postScale(0.3f + (((z.m137f(F) * 100) >> 12) / 900.0f), 0.0f, 15.0f);
                f121l.e();
                f121l.a(i63, 0.0f, i64);
                f121l.f();
            }
        }
        for (int i65 = 0; i65 < 1; i65++) {
            if (z.f398f[0][0] == 1) {
                float f25 = z.f398f[0][1] * 0.277f;
                float f26 = z.f398f[0][3] * 0.277f;
                float f27 = (z.f380a[0][4] + (z.f380a[0][14] / 2)) * 0.277f;
                float f28 = z.f380a[0][5] * 0.277f;
                int iM137f = (z.m137f((F << 9) / 2000) * 30) >> 12;
                f122m.e();
                f122m.a(f25, 0.0f, f26);
                f122m.b(iM137f / 4000.0f, 0.2f, 1.0f, 0.2f);
                f122m.f();
                for (int i66 = 0; i66 < 10; i66++) {
                    f123n.e();
                    f123n.a(((f25 * i66) / 10.0f) + ((f27 * (10 - i66)) / 10.0f), 0.0f, ((f26 * i66) / 10.0f) + ((f28 * (10 - i66)) / 10.0f));
                    f123n.f();
                }
            }
        }
        int i67 = 0;
        while (i67 < 2) {
            if (z.ac > 200) {
                int i68 = z.f380a[0][4] + (i67 == 1 ? z.f380a[0][14] : 0);
                int i69 = z.f380a[0][5];
                float fM132e = (1.0f * (z.m132e(i67) - 128)) / 512.0f;
                float fSin = 1.4f * ((float) Math.sin((2.356194490192345d * ((double) Math.min(1000, (1000 * (z.ac - 200)) / 700))) / 1000.0d));
                f126p.e();
                f126p.a(i68 * 0.277f, 100.0f, (i69 * 0.277f) + 20.0f);
                f126p.b(fM132e, 0.0f, 1.0f, 0.0f);
                f126p.b(fSin, fSin, fSin);
                f126p.f();
            }
            i67++;
        }
        f117j.c();
        for (int i70 = 0; i70 < z.f394d.length; i70++) {
            if (z.f394d[i70][3] == 1) {
                float f29 = z.f394d[i70][0] * 0.277f;
                float f30 = z.f394d[i70][1] * 0.277f;
                f117j.e();
                f117j.a(f29, 0.0f, f30);
                f117j.b(0.2f, 0.2f, 0.2f);
                f117j.f();
            }
        }
        f117j.d();
        for (int i71 = 0; i71 < 3; i71++) {
            int[] iArr21 = z.f381b[i71];
            int i72 = i71;
            if (iArr21[1] != 0) {
                float f31 = z.j / 1000.0f;
                float fM55d = iArr21[4] * 0.277f;
                float fM60k = (((-f31) * f31) + f31) * 2000.0f;
                float fM61l = (iArr21[5] + 50) * 0.277f;
                if (z.U == 14) {
                    fM61l = (((((z.A * 15) * 0.277f) - 3700.0f) - fM61l) * z.f352h) / 1000.0f;
                } else if (z.U == 15) {
                    float f32 = z.f352h / 1000.0f;
                    float f33 = f32 * f32;
                    fM55d += (m55d() - fM55d) * f33;
                    fM60k += ((((-500.0f) + i()) - fM60k) * z.f352h) / 1000.0f;
                    fM61l += (((-(3 * 0.277f)) + m59j()) - fM61l) * f33;
                } else if (z.V != 0) {
                    if (z.am == 1) {
                        int i73 = z.V - z.W;
                        fM55d += ((m55d() - fM55d) * i73) / z.V;
                        fM60k += (((500.0f + m58g()) - fM60k) * i73) / z.V;
                        fM61l += ((((-(1.0f * 0.277f)) + h()) - fM61l) * i73) / z.V;
                    } else if (z.am == 2) {
                        int i74 = z.V - z.W;
                        fM55d += ((m55d() - fM55d) * i74) / z.V;
                        fM60k += (((700.0f + m60k()) - fM60k) * i74) / z.V;
                        fM61l += ((((-(1.0f * 0.277f)) + m61l()) - fM61l) * i74) / z.V;
                    }
                }
                f113a[i72][0] = (int) fM55d;
                f113a[i72][1] = (int) fM60k;
                f113a[i72][2] = (int) fM61l;
                if (m43a() || m44b()) {
                    f128r.e();
                    f128r.a(fM55d, fM60k + 54, fM61l);
                    int i75 = (F % 1000) / 125;
                    int i76 = i75;
                    if (i75 > 3) {
                        i76 = 7 - i76;
                    }
                    if (m43a()) {
                        f128r.a(f119b[i76]);
                    } else if (m44b()) {
                        f128r.a(f164a);
                    }
                    f128r.f81a = 0.0f;
                    float fM137f5 = ((((z.m137f(F) << 6) >> 12) + 256) + 64) / 256.0f;
                    if (z.af > 0) {
                        fM137f5 *= 2.0f;
                    }
                    f128r.b(fM137f5, fM137f5, fM137f5);
                    f128r.f88a = true;
                    f128r.f();
                } else {
                    float f34 = z.af > 0 ? 2.0f : 1.0f;
                    float fM137f6 = (z.m137f(((int) (fM55d + fM61l)) >> 1) << 5) >> 12;
                    f128r.e();
                    f128r.a(fM55d, fM60k + 54, fM61l);
                    f128r.a(f118a[m50a()]);
                    f128r.f81a = fM137f6;
                    f128r.f88a = true;
                    f128r.b(f34, f34, f34);
                    f128r.f();
                    float fA3 = ((a(10) - fM55d) * (-45.0f)) / a(10);
                    f129s.e();
                    f129s.a(fM55d, fM60k + 54, fM61l);
                    f129s.f88a = true;
                    f129s.f81a = fA3;
                    f129s.f();
                }
            }
        }
        for (int i77 = 0; i77 < 2; i77++) {
            int[] iArr22 = z.f380a[i77];
            int i78 = i77;
            if (iArr22[1] != 0) {
                if (f140f == 0) {
                    iArr22[4] = -(iArr22[14] / 2);
                    f140f = -1;
                } else if (f140f == 1) {
                    iArr22[4] = (z.z * 20) - (iArr22[14] / 2);
                    f140f = -1;
                }
                int i79 = iArr22[14];
                float fD = d(i78);
                float fM56e = 0.0f;
                float fM57f = iArr22[5] * 0.277f;
                float f35 = 0.0f;
                float f36 = 0.5f;
                if (z.U == 14) {
                    if (i78 == 1) {
                        fM57f = (((((z.A << 4) * 0.277f) - 3700.0f) - (z.f380a[1][5] * 0.277f)) * z.f352h) / 1000.0f;
                        f36 = 0.5f - ((0.5f * z.f352h) / 1000.0f);
                    }
                } else if (f138e == 3) {
                    fD += ((m55d() - fD) * u) / 1000.0f;
                    fM56e = 0.0f + (((m56e() + b(5)) * u) / 1000.0f);
                    fM57f += (((m57f() - fM57f) - b(4)) * u) / 1000.0f;
                    f35 = (360 * u) / 1000;
                }
                int i80 = f150i[i78] * (i78 == 0 ? 1 : -1);
                d.e();
                d.a(fD, fM56e - i80, fM57f);
                d.b(f35 / 360.0f, 1.0f, 0.1f, 0.5f);
                d.b(i79 / 1380.0f, 1.0f, 1.0f);
                if (i78 > 0) {
                    d.a(0.0f, 0.0f, 50.0f);
                    d.b(f36, 0.0f, 1.0f, 0.0f);
                }
                d.f();
                if (i78 == 0 && z.ac > 0) {
                    float fM137f7 = (1.0f * z.m137f(Math.min(128, (128 * z.ac) / 250))) / 4096.0f;
                    f127q.e();
                    f127q.a(fD, (fM56e - i80) + 60.0f, fM57f + 100.0f);
                    f127q.b(i79 / 1380.0f, 1.0f, fM137f7);
                    f127q.a(0.0f, 0.0f, -30.0f);
                    f127q.f();
                }
            }
        }
        if (z.ad > 0) {
            int i81 = ((z.ad << 2) * 300) / 1600;
            int iM130c = z.m130c();
            float f37 = z.f381b[iM130c][4] * 0.277f;
            float f38 = z.f381b[iM130c][5] * 0.277f;
            f109c.f88a = false;
            f109c.e();
            f109c.a(f37, 0.0f, f38);
            f109c.b(0.1f + (i81 * 0.0078125f), 1.0f, 0.1f + (i81 * 0.0078125f));
            f109c.f();
        }
        m.b(graphics);
        c(graphics);
        for (int i82 = 0; i82 < z.T; i82++) {
            if (f146d) {
                int[] iArr23 = z.f382c[i82];
                if (iArr23[1] != 0) {
                    f99a[0] = iArr23[4] * 0.277f;
                    f99a[1] = 0.0f;
                    f99a[2] = iArr23[5] * 0.277f;
                    f99a[3] = 1.0f;
                    m.a(f99a);
                    int i83 = (int) f99a[0];
                    int i84 = (int) f99a[1];
                    if (i83 >= -50 && i83 <= j + 50 && i84 >= -50 && i84 <= k + 50) {
                        int i85 = i84 - 11;
                        int i86 = iArr23[2];
                        f133p.a(graphics, i83, i85);
                        switch (i86) {
                            case 1:
                            case 13:
                            case 17:
                            case 19:
                            case 22:
                            case 23:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                                f132o.a(graphics, i83, i85);
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
                            case 14:
                            case 15:
                            case 16:
                            case 18:
                            case 21:
                            case 24:
                            default:
                                f131n.a(graphics, i83, i85);
                                break;
                            case 20:
                                f130m.a(graphics, i83, i85);
                                break;
                        }
                        f134a[i86].a(graphics, i83, i85);
                    }
                }
            }
        }
        for (int i87 = 0; i87 < 5; i87++) {
            int i88 = i87 << 2;
            if (f154m[i88 + 2] > 0) {
                int i89 = 1000 - ((1000 * f154m[i88 + 2]) / 500);
                graphics.setColor(16777215);
                float[] fArr = {f154m[i88], 0.0f, f154m[i88 + 1], 1.0f};
                m.a(fArr);
                a(graphics, l, (int) fArr[0], (int) fArr[1], f154m[i88 + 3], i89, true, false);
            }
        }
        if (!z.f354b) {
            int iG2 = f134a[6].g() - 1;
            int iH = f134a[6].h();
            int i90 = (iH * 3) / 2;
            int i91 = 2;
            for (int i92 = 0; i92 < 31; i92++) {
                if (z.m129a(i92)) {
                    a(2, i91, iG2, iH, i92, 0, graphics);
                    i91 += i90 + 2;
                }
            }
            t.m98e();
            int i93 = 2;
            int i94 = (k - iH) - 2;
            int i95 = 0;
            while (i95 < z.m123b()) {
                int iB2 = z.b((i95 + z.e) % z.m123b());
                if (z.f392c[iB2] && m48a(iB2)) {
                    a(i93, i94, iG2, iH, iB2, i95 == 0 ? 104448 : 0, graphics);
                    i93 += iG2 + 2;
                }
                i95++;
            }
        }
        if (f171e) {
            int i96 = 128 + ((640 * K) / I);
            int i97 = J;
            if (i97 != 0) {
                int iG3 = f96k.g();
                int iH2 = f96k.h();
                int i98 = (iG3 * i96) >> 8;
                int i99 = (iH2 * i96) >> 8;
                int i100 = 0;
                int i101 = i97;
                while (i101 != 0) {
                    i101 /= 10;
                    i100++;
                }
                int i102 = i100 + 1;
                int i103 = (i102 * i98) + (i102 - 1);
                int i104 = i97 > 0 ? 10 : 11;
                int iAbs2 = Math.abs(i97);
                int i105 = (j + i103) >> 1;
                int i106 = (k >> 1) - ((i99 - iH2) >> 1);
                graphics.setColor(16777215);
                while (iAbs2 != 0) {
                    int i107 = iAbs2 % 10;
                    iAbs2 /= 10;
                    f96k.c(i107);
                    a(f96k, graphics, i105, i106, i96);
                    i105 -= i98 + 1;
                }
                f96k.c(i104);
                a(f96k, graphics, i105, i106, i96);
            }
        }
        if (f138e == 3) {
            a(graphics, u, 900);
        } else if (z.ad > 0) {
            a(graphics, z.ad, 800);
        }
        graphics.setColor(0);
        System.currentTimeMillis();
        if (z.f350a > 0) {
            int i108 = 1 + (z.f350a / 1000);
            int i109 = z.f350a % 1000;
            f96k.c(i108);
            int i110 = j >> 1;
            int i111 = k / 3;
            graphics.setColor(16777215);
            a(graphics, f96k, i110, i111, i108, i109 + 256, false, true);
        }
        if (z.f354b) {
            int iB3 = z.f358a.b();
            int iC2 = z.f358a.c();
            if (z.f372f) {
                iB3 = z.f359b.b();
                iC2 = z.f359b.c();
            }
            int i112 = z.q;
            int i113 = z.r;
            int i114 = iB3;
            int i115 = iC2;
            a(graphics, i112, i113, i114, i115);
            if (f165r != null) {
                graphics.setClip(i112, 0, i114, t.a());
                int i116 = i112;
                while (true) {
                    int i117 = i116;
                    if (i117 <= i112 + i114) {
                        f165r.c(1);
                        f165r.a(graphics, i117, i113);
                        f165r.c(7);
                        f165r.a(graphics, i117, i113 + i115);
                        i116 = i117 + G;
                    } else {
                        graphics.setClip(0, i113, t.m98e(), i115);
                        int i118 = i113;
                        while (true) {
                            int i119 = i118;
                            if (i119 <= i113 + i115) {
                                f165r.c(3);
                                f165r.a(graphics, i112, i119);
                                f165r.c(5);
                                f165r.a(graphics, i112 + i114, i119);
                                i118 = i119 + H;
                            } else {
                                graphics.setClip(0, 0, t.m98e(), t.a());
                                f165r.c(0);
                                f165r.a(graphics, i112, i113);
                                f165r.c(2);
                                f165r.a(graphics, i112 + i114, i113);
                                f165r.c(6);
                                f165r.a(graphics, i112, i113 + i115);
                                f165r.c(8);
                                f165r.a(graphics, i112 + i114, i113 + i115);
                            }
                        }
                    }
                }
            }
            if (z.f372f) {
                z.f359b.a(graphics, z.q, z.r);
            } else {
                z.f358a.a(graphics, z.q, z.r);
            }
        }
    }

    public static final void a(Graphics graphics, int i2, int i3, int i4, int i5) {
        int iM98e = t.m98e();
        int iA = t.a();
        if (f185s == null) {
            int i6 = iM98e >> 3;
            N = i6;
            N = i6 + (iM98e % N);
            int i7 = iA >> 3;
            O = i7;
            O = i7 + (iA % O);
            int[] iArr = new int[N * O];
            f185s = iArr;
            int length = iArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                } else {
                    f185s[length] = -1509947318;
                }
            }
        }
        graphics.setClip(i2, i3, i4, i5);
        int i8 = i3;
        while (true) {
            int i9 = i8;
            if (i9 > i5 + (4 * O)) {
                return;
            }
            int i10 = i2;
            while (true) {
                int i11 = i10;
                if (i11 <= i4 + N) {
                    graphics.drawRGB(f185s, 0, N, i11, i9, N, O, true);
                    i10 = i11 + N;
                }
            }
            i8 = i9 + O;
        }
    }

    public static final void b(Graphics graphics) {
        r.a(graphics);
    }

    public static final void a(Graphics graphics, b bVar) {
        graphics.setColor(1578190);
        graphics.fillRect(0, 0, t.m98e(), t.a());
        if (bVar != null) {
            bVar.a(graphics, t.m98e() >> 1, t.a() >> 1);
        }
    }

    public static final void j(int i2) {
        r += i2;
    }

    /* JADX INFO: renamed from: i, reason: collision with other method in class */
    public static void m64i() {
        f160c = new b(a.a(131085), true);
    }

    static {
        t.m98e();
        t.m98e();
        t.m98e();
        t.a();
        t.a();
        t.a();
        int[][] iArr = {new int[]{0, 0}, new int[]{32, 0}, new int[]{64, 0}, new int[]{96, 0}, new int[]{128, 0}, new int[]{160, 0}, new int[]{192, 0}, new int[]{224, 0}, new int[]{0, 64}, new int[]{32, 64}, new int[]{64, 64}, new int[]{96, 64}, new int[]{128, 64}, new int[]{160, 64}, new int[]{192, 64}, new int[]{224, 64}, new int[]{128, 192}, new int[]{224, 128}, new int[]{0, 192}, new int[]{32, 128}, new int[]{64, 128}, new int[]{96, 128}, new int[]{128, 128}, new int[]{160, 128}, new int[]{192, 128}, new int[]{192, 192}, new int[]{32, 192}, new int[]{48, 192}, new int[]{64, 192}, new int[]{80, 192}, new int[]{196, 212, 57, 8}, new int[]{160, 224, 16, 32}, new int[]{96, 192, 32, 32}, new int[]{32, 224}, new int[]{48, 224}, new int[]{64, 224}, new int[]{80, 224}, new int[]{160, 192, 32, 32}, new int[]{176, 224, 16, 32}, new int[]{0, 128}, new int[]{96, 224, 32, 32}};
        int[][] iArr2 = {new int[]{16, 0}, new int[]{8, 0}, new int[]{0, 0}, new int[]{4, 0}, new int[]{12, 0}, new int[]{32, 0}, new int[]{48, 0}};
        A = 0;
        f151j = new int[150];
        f152k = new int[150];
        f153l = new int[25];
        B = 0;
        C = 0;
        D = 0;
        E = 0;
        f154m = new int[20];
        f155n = new int[]{170, 189, 176, 183, 169, 171, 182, 174, 184, 177, 175, 173, 178, 193, 179, 180, 181, 196, 188, 194, 195, 185, 198, 197, 186, 190, 187, 191, 192, 172, 168, 230, 232, 233, 234, 235, 236, 237, 239};
        f157g = 0;
        int[][] iArr3 = {new int[]{2236962, 0}, new int[]{2236962, 0}, new int[]{2236962, 0}, new int[]{2236962, 0}};
        int[][] iArr4 = {new int[0], new int[]{0}, new int[]{0, 180}, new int[]{0, 90, 270}, new int[]{0, 90, 180, 270}, new int[]{0, 80, 150, 210, 280}, new int[]{0, 30, 110, 180, 255, 330}, new int[]{0, 30, 100, 150, 210, 260, 330}};
        I = 1000;
        J = 0;
        K = 0;
        f171e = false;
        f172a = new boolean[7];
        f173b = new boolean[7];
        f174o = new int[7];
        f175p = new int[7];
        f176q = new int[7];
        f177r = new int[7];
        float[][] fArr = {new float[]{0.6f, 12.5f, 1.0f}, new float[]{12.0f, 13.5f, 0.5f}, new float[]{13.0f, 20.1f, 0.8f}, new float[]{19.5f, 1000.0f, 0.5f}};
        int[] iArr5 = {2, 3, 1, 0};
    }
}
