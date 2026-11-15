package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDletStateChangeException;

/* JADX INFO: loaded from: original-2d.jar:DCWall.class */
public class DCWall extends c {
    private static int u;
    public static int a;
    private static int v;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static l[] f0a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f1a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static l f2a;
    private static l b;
    private static int w;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static int f3b;
    private static l c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static a[] f8a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image[] f10a;
    private static int z;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static h f11a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static e f12a;
    private static boolean d;
    private static int A;
    private static boolean j;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public static int f18g;
    private static int C;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static a f23a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image f24a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static a f25b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static a f26c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static a f27d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static a f28e;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Image[] f29b;
    private static boolean k;
    private static int H;
    private static int L;
    private static int M;
    private static int N;
    public static int m;
    public static int n;
    public static int p;
    public static int r;
    private static int O;
    private static int P;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private static boolean f40m;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static long f41a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static long f42b;
    public static int s;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private static boolean f43n;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static boolean f4c = false;
    private static int x = 0;
    private static int y = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static b f5a = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static b f6b = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final Font f7a = Font.getFont(0, 0, 8);

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static final int[] f9b = {65594, 65645, 65635, 65598, 65624, 65626, 65610, 65580, 65615, 65660, 65621, 65613, 65619, 65602, 65632, 65634, 65582, 65658, 65578, 65623, 131472, 131472, 131470, 131478, 131468, 131474, 131476, 65598};

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static int[] f13c = new int[8];
    private static boolean e = false;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static int f14c = -1;
    private static int B = 0;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static int f15d = 0;
    private static boolean f = true;
    private static boolean g = true;
    private static boolean h = false;
    private static boolean i = false;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static int f16e = 0;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static int f17f = 0;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    public static int f19h = -1;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    public static int f20i = 1;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    public static int f21j = -1;
    private static int D = 0;
    private static int E = 0;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static final int[] f22d = {19, 21, -1, 66, 16, 23, 18, 27, 31, 29, 39, 33, 25, 45, 35, 57, 59, 61, 63, 73, 51, 53};
    private static int F = 34;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static final int[] f30e = {2, 3, 4, 16, 18, 39, 27, 23, 19, 21, 31, 33, 12, 5, 66, 107, 108, 29, 25, 45, 35, 57, 59, 61, 63, 109, 73, 51, 53, 6, 7, 10, 13, 14};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean[] f31a = new boolean[F];

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static final int[] f32f = {0, 200, 400, 600, 800, 1000, 2000, 4000, 6000, 8000, 10000, 20000, 40000, 60000, 80000, 100000, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static final int[] f33g = {91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106};
    private static int G = 1;
    private static int I = 0;
    private static int J = 0;
    private static int K = 0;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    public static int f34k = 0;
    public static int l = 0;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private static boolean f35l = false;
    public static int o = 5;
    public static int q = 5;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static boolean f36b = false;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static final int[] f37h = {20, 60, 100, 140, 180};

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static final int[] f38i = {309, 310, 312, 311, 313};

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean[] f39b = new boolean[5];
    private static int Q = 0;
    public static int t = 0;
    private static int R = 0;
    private static int S = 0;
    private static int T = 0;
    private static int U = 0;
    private static int V = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final int[][] f44a = {new int[]{0, 5, 110, 111, 20}, new int[]{1, 10, 112, 113, 20}, new int[]{2, 15, 114, 115, 20}, new int[]{3, 20, 116, 117, 20}, new int[]{4, 10, 118, 119, 20}, new int[]{4, 30, 120, 121, 20}, new int[]{4, 61, 122, 123, 20}, new int[]{5, 100000, 124, 125, 20}, new int[]{5, 500000, 126, 127, 20}, new int[]{5, 1000000, 128, 129, 20}, new int[]{6, 1, 130, 131, 20}, new int[]{7, 100, 132, 133, 20}, new int[]{8, 1, 134, 135, 20}, new int[]{8, 10, 136, 137, 20}, new int[]{8, 50, 138, 139, 20}, new int[]{8, 100, 140, 141, 20}, new int[]{9, 100, 142, 143, 20}, new int[]{9, 500, 144, 145, 20}, new int[]{9, 999, 146, 147, 20}, new int[]{10, 100, 148, 149, 20}, new int[]{11, 100000, 150, 151, 20}, new int[]{11, 500000, 152, 153, 20}, new int[]{11, 1000000, 154, 155, 20}, new int[]{11, 9999999, 156, 157, 20}, new int[]{12, 1, 158, 159, 20}, new int[]{12, 2, 160, 161, 20}, new int[]{12, 3, 162, 163, 20}, new int[]{12, 4, 164, 165, 20}, new int[]{12, 5, 166, 167, 20}, new int[]{12, 6, 168, 169, 20}, new int[]{12, 7, 170, 171, 20}, new int[]{12, 8, 172, 173, 20}, new int[]{12, 9, 174, 175, 20}, new int[]{12, 10, 176, 177, 20}, new int[]{12, 11, 178, 179, 20}, new int[]{12, 12, 180, 181, 20}, new int[]{12, 13, 182, 183, 20}, new int[]{12, 14, 184, 185, 20}, new int[]{12, 15, 186, 187, 20}, new int[]{19, 100, 188, 189, 20}, new int[]{6, 10, 190, 191, 20}, new int[]{13, 1000, 192, 193, 20}, new int[]{14, 5000, 194, 195, 20}, new int[]{15, 36000000, 196, 197, 20}, new int[]{15, 86400000, 198, 199, 20}, new int[]{16, 100, 200, 201, 20}, new int[]{17, 500, 202, 203, 20}, new int[]{18, 100, 204, 205, 20}, new int[]{6, 100, 206, 207, 20}, new int[]{15, 172800000, 208, 209, 20}};

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static int[] f45j = new int[f44a.length];
    private static int W = 0;
    private static int X = 0;

    @Override // defpackage.c
    /* JADX INFO: renamed from: a */
    public final l mo17a() {
        return new l();
    }

    private static void g() {
        c = new l();
        c.a(2, 1, 1);
        c.f338b = 0;
    }

    private static void a(String str) {
        f4c = true;
        d.b();
        c.a(0, 1, str, (Image[]) null, -1);
        h();
        c.a();
        d.b(1, 0);
    }

    private static final void h() {
        int iD = d.d();
        int iA = d.a();
        int i2 = (iD * 5) / 6;
        int i3 = (iA * 3) / 5;
        x = (iD - i2) >> 1;
        y = (iA - i3) >> 1;
        c.b(i2, i3);
    }

    public static void c(int i2) {
        if (f31a[i2] || f4c || !h) {
            return;
        }
        k.d();
        a(d.m30a(f30e[i2]));
        f31a[i2] = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.c
    public final void a(int i2, int i3) {
        int iM28a;
        if (!f4c) {
            switch (a) {
                case 1:
                    if (f13c[0] == 0) {
                        f13c[0] = 1;
                    }
                    f0a[f3b].c(i2, i3);
                    if (f3b == 17 && i3 == 0) {
                        switch (d.m28a(i2)) {
                            case 52:
                                G--;
                                break;
                            case 54:
                                G++;
                                break;
                        }
                        if (G < 0) {
                            G = f33g.length - 2;
                        }
                        if (G >= f33g.length - 1) {
                            G = 0;
                        }
                        f0a[17].a(d.m30a(f33g[G]), (Image) null);
                        f0a[17].b(d.d(), d.a());
                    }
                    if (f3b == 16 && i3 == 0 && ((iM28a = d.m28a(i2)) == 52 || iM28a == 54)) {
                        if (iM28a == 52) {
                            W--;
                            if (W < 0) {
                                W = f44a.length - 1;
                            }
                        }
                        if (iM28a == 54) {
                            W++;
                            if (W >= f44a.length) {
                                W = 0;
                            }
                        }
                        f(16);
                    }
                    if (f3b == 29) {
                        f0a[16].c(i2, i3);
                    }
                    if (f3b == 11 && i3 == 0) {
                        int iM28a2 = d.m28a(i2);
                        while (true) {
                            switch (iM28a2) {
                                case 52:
                                    E--;
                                    break;
                                case 54:
                                    E++;
                                    break;
                            }
                            if (E < 0) {
                                E = f22d.length - 1;
                            }
                            if (E > f22d.length - 1) {
                                E = 0;
                            }
                            if (d.m30a(f22d[E]) != null && k.f305a[E]) {
                                if (iM28a2 == 52 || iM28a2 == 54) {
                                    H();
                                }
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                case 10:
                    if (i3 == 0) {
                        z = 16;
                    }
                    i(a);
                    break;
                case 3:
                    if (i3 == 0) {
                        int iM28a3 = d.m28a(i2);
                        switch (iM28a3) {
                            case 50:
                                z |= 4;
                                k.b(i3, iM28a3);
                                break;
                            case 51:
                            case 55:
                            default:
                                k.b(i3, iM28a3);
                                break;
                            case 52:
                                z |= 1;
                                k.b(i3, iM28a3);
                                break;
                            case 53:
                                if (D <= 0) {
                                    z |= 16;
                                    k.b(i3, iM28a3);
                                } else {
                                    D = 0;
                                }
                                break;
                            case 54:
                                z |= 2;
                                k.b(i3, iM28a3);
                                break;
                            case 56:
                                z |= 8;
                                k.b(i3, iM28a3);
                                break;
                        }
                    }
                    if (i3 == 1) {
                        int iM28a4 = d.m28a(i2);
                        switch (iM28a4) {
                            case 50:
                                z &= -5;
                                break;
                            case 52:
                                z &= -2;
                                break;
                            case 53:
                                z &= -17;
                                break;
                            case 54:
                                z &= -3;
                                break;
                            case 56:
                                z &= -9;
                                break;
                        }
                        k.b(i3, iM28a4);
                    }
                    if (i3 == 3 || i3 == 0) {
                        if (i2 == 9) {
                            f(4);
                        } else if (i2 == 14 || (i3 == 0 && d.m28a(i2) == 53)) {
                            if (k.f302i) {
                                k.f303j = true;
                            }
                            d.b();
                            d.b(9, 0);
                        }
                    }
                    break;
                case 4:
                    if (d.m38b(6) != null) {
                        g.a(i2, i3);
                    }
                    break;
                case 5:
                    f11a.a(i2, i3);
                    break;
                case 6:
                    if (d.m38b(5) != null) {
                        i.a(i2, i3);
                    }
                    break;
                case 8:
                    f12a.a(i2, i3);
                    break;
            }
        } else if ((i3 == 3 && i2 == 1) || (i3 == 0 && d.m28a(i2) == 53)) {
            f4c = false;
            d.b();
            if (a == 3) {
                d.b(9, 0);
                if (k.f302i && f14c != 2) {
                    d.b(14, 0);
                }
            } else if (a == 1) {
                f0a[f3b].a();
            }
            d(3000);
            c();
        } else {
            c.c(i2, i3);
        }
        if (i3 == 0) {
            P <<= 4;
            P |= i2 & 15;
        }
        if (f36b && i2 == 48) {
            b(0);
        }
    }

    private static void i() {
        if (P != 1952740964 || f36b) {
            return;
        }
        P = 0;
        f36b = true;
        a(d.m30a(303));
    }

    @Override // defpackage.c
    public final void b(int i2) {
        if (i2 == 2) {
            c();
            v = 0;
            e(0);
            return;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                c();
                return;
            } else {
                if (i2 == 5) {
                    e(8);
                    return;
                }
                return;
            }
        }
        f13c[0] = 0;
        if (a == 1) {
            f0a[f3b].f342d = 0;
        }
        if (f4c) {
            c.f342d = 0;
        }
        k.d();
        f40m = true;
    }

    private static final void j() {
        if (a != 3 || f4c) {
            return;
        }
        f(4);
    }

    @Override // defpackage.c
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String[][] mo1a() {
        return new String[][]{new String[]{d.m30a(282)}, new String[]{d.m30a(283)}, new String[]{d.m30a(284)}, new String[]{d.m30a(285)}, new String[]{d.m30a(286)}};
    }

    @Override // defpackage.c
    public final String a(int i2) {
        return new StringBuffer().append("").append(i2).toString();
    }

    private static final void k() {
        new StringBuffer().append("sm_highscoreAchieved = ").append(f35l).toString();
        if (!f36b) {
            J();
        }
        if (f14c == 1 || f14c == 2) {
            if (f35l) {
                f0a[23].a(d.m30a(265), (Image) null);
            } else {
                f0a[23].a(d.m30a(264), (Image) null);
            }
            f0a[23].a(0, 1, "", (Image[]) null, -1);
        } else if (f14c == 3) {
            f0a[23].a(d.m30a(314), (Image) null);
            f0a[23].a(0, 1, d.a(d.m30a(315), new String[]{new StringBuffer().append("").append(B / 1000).toString()}), (Image[]) null, -1);
            f11a.a(3, new int[]{B / 1000}, null);
        } else if (f14c == 4) {
            f0a[23].a(d.m30a(316), (Image) null);
            f0a[23].a(0, 1, d.a(d.m30a(317), new String[]{new StringBuffer().append("").append(f15d + k.aM + 1).toString()}), (Image[]) null, -1);
            f11a.a(4, new int[]{f15d + k.aM + 1}, null);
        }
        f0a[23].b(d.d(), d.a());
        if (f14c == 4 || f14c == 3) {
            f0a[25].a(1, 2, 1);
            f0a[25].a(f14c == 4 ? d.m30a(215) : d.m30a(214), (Image) null);
            f0a[25].a(0, 1, d.m30a(232), (Image[]) null, -1);
            f0a[25].a(2, 0);
            f0a[25].a(7, 1);
        } else {
            f0a[25].a(0, 2, 0);
            f0a[25].a(d.m30a(230), (Image) null);
            if (f14c == 2) {
                C--;
                f0a[25].a(0, 0, d.a(d.m30a(231), new String[]{new StringBuffer().append("").append(C).toString()}), f8a[1], 211);
            } else {
                f0a[25].a(0, 0, d.m30a(233), f8a[1], 211);
            }
            f0a[25].a(1, 0, d.m30a(234), f8a[6], 210);
            f0a[25].a(0, 0);
        }
        f0a[25].b(d.d(), d.a());
        if (f14c != 1) {
            if (f14c == 2) {
                p = 0;
                o = 5;
                return;
            }
            return;
        }
        if (i) {
            r = k.V;
            q = k.U;
        } else {
            r = 0;
            q = 5;
        }
    }

    public static void d(int i2) {
        D = i2;
    }

    private static void l() {
        int i2 = f13c[1];
        switch (v) {
            case 0:
                if (i2 != 0) {
                    if (i2 == 20) {
                        x();
                        u();
                        y();
                        w();
                        k.e();
                        k.c();
                    } else if (i2 == 40) {
                        g();
                        f();
                    } else if (i2 == 60) {
                        f.a(d.d(), d.a());
                    } else if (i2 == 80) {
                        E();
                        B();
                    } else if (i2 == 100) {
                        f(2);
                        if (f12a.a(2)) {
                            e(8);
                            d = true;
                        } else {
                            f(1);
                        }
                        z = 0;
                    }
                }
                f13c[1] = Math.min(100, f13c[1] + 20);
                break;
            case 2:
            case 4:
                if (i2 != 0) {
                    if (i2 > 0 && i2 <= 80) {
                        f.m46a((i2 / 20) - 1);
                    } else if (i2 == 100) {
                        j = true;
                        e(3);
                    }
                }
                f13c[1] = Math.min(100, f13c[1] + 20);
                break;
        }
    }

    private static final void m() {
        if (!f36b) {
            if (f14c == 1) {
                if (k.V > f11a.m55a(2, 1)[0]) {
                    f35l = true;
                } else {
                    f35l = false;
                }
                f11a.a(2, new int[]{k.V}, null);
            } else if (f14c == 2) {
                if (k.V > f11a.m55a(1, 1)[0]) {
                    f35l = true;
                } else {
                    f35l = false;
                }
                f11a.a(1, new int[]{k.V}, null);
            }
        }
        new StringBuffer().append("sm_highScoreAchieved = ").append(f35l).toString();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.microedition.midlet.MIDletStateChangeException */
    @Override // defpackage.c
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void mo2a(int i2) throws MIDletStateChangeException {
        if (f40m && a != 0 && !f43n) {
            j();
            f40m = false;
        }
        f41a = System.currentTimeMillis();
        int i3 = (int) (f41a - f42b);
        if (i3 < 25) {
        }
        f42b = f41a;
        k.a.nextInt();
        if (f4c) {
            c.m105a(i3);
            return;
        }
        D -= i3;
        L += i3;
        o();
        n();
        i();
        switch (a) {
            case 0:
                l();
                break;
            case 1:
                q();
                if (f3b == 24) {
                    j(i3);
                }
                if (f3b == 2) {
                    f23a.m12a(i3);
                }
                if (f3b == 16 || f3b == 29) {
                    f0a[30].m105a(i3);
                    f0a[31].m105a(i3);
                    if (f3b == 29) {
                        f0a[16].m105a(i3);
                    }
                }
                break;
            case 2:
            case 10:
                i(a);
                break;
            case 3:
                N += i3;
                if (D <= 0 && !f4c) {
                    if (f14c == 3) {
                        B += i3;
                    }
                    k.b(Math.min(i3, 50));
                    if (k.f303j && k.J == 4) {
                        k.f303j = false;
                        d.b();
                        d.b(9, 0);
                    }
                }
                if (k.f288c) {
                    if (f14c == 1 || f14c == 3 || f14c == 4) {
                        f34k += f17f;
                        if (k.J == 1) {
                            l = f34k;
                            if (m < f34k) {
                                m = f34k;
                            }
                            i = true;
                            I = k.a() - J;
                            k();
                            v();
                            f(24);
                        } else {
                            k.f288c = false;
                        }
                    } else {
                        f18g++;
                        k.t++;
                        k.a(1000);
                        if (f18g < 61) {
                            e(3);
                        } else {
                            k.f287b = true;
                        }
                    }
                }
                if (k.f287b) {
                    i = false;
                    I = k.a() - J;
                    if (f14c == 1) {
                        O = f34k;
                    }
                    m();
                    k();
                    f(23);
                }
                break;
            case 4:
                if (d.m38b(6) != null && g.a(i3) != 0) {
                    a(2, false);
                    break;
                }
                break;
            case 5:
                if (f11a.m54a(i3) == 1) {
                    a(2, false);
                }
                break;
            case 6:
                if (d.m38b(5) != null && i.a(i3) != 0) {
                    a(2, false);
                    break;
                }
                break;
            case 7:
                r();
                break;
            case 8:
            case 9:
                int iM42a = f12a.m42a(i3);
                if (iM42a != 0) {
                    if (iM42a == 4) {
                        e = true;
                    }
                    if (d) {
                        f(1);
                    } else {
                        a(2, false);
                    }
                    d = false;
                }
                break;
        }
    }

    public static final void c() {
        c.a().m18a();
        f42b = System.currentTimeMillis();
    }

    private static final void e(int i2) {
        u = i2;
    }

    private static final void f(int i2) {
        a(i2, true);
    }

    private static final void a(int i2, boolean z2) {
        u = 1;
        w = i2;
        if (w == -1 || !z2 || f0a == null || f0a[w] == null) {
            return;
        }
        f0a[w].b();
    }

    private static final void n() {
        if (w == -1 || a != 1) {
            return;
        }
        I();
        f3b = w;
        f0a[f3b].a();
        w = -1;
        switch (f3b) {
            case 4:
            case 5:
                if (!h) {
                    f0a[f3b].e(7, 0);
                } else {
                    f0a[f3b].e(7, 1);
                }
                break;
            case 11:
                H();
                break;
            case 15:
                D();
                break;
            case 16:
                k(W);
                break;
            case 17:
                G = m3c(k.a());
                f0a[17].a(d.m30a(f33g[G]), (Image) null);
                f0a[17].b(d.d(), d.a());
                break;
            case 20:
                A();
                I();
                break;
            case 24:
                K = m3c(J);
                c(16);
                break;
            case 28:
                z();
                break;
            case 29:
                X = m7b(X);
                f45j[X] = 2;
                k(X);
                c(25);
                break;
        }
        if (f3b == 1 || f3b == 0) {
            return;
        }
        if (f3b == 4 || f3b == 5 || f3b == 6 || f3b == 18 || f3b == 35) {
            d.e();
            f13c[0] = 1;
        } else if (f13c[0] == 1) {
            d.m31a(65541, -1);
            f13c[0] = 2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final void o() {
        switch (u) {
            case -1:
                break;
            case 0:
                f13c[1] = 0;
                d.b();
                d.e();
                f13c[0] = 1;
                a = u;
                u = -1;
                System.gc();
                c();
                break;
            case 1:
                if (a == 3) {
                    e();
                    J();
                }
                a = u;
                u = -1;
                System.gc();
                c();
                break;
            case 2:
            case 10:
                A = 0;
                z = 0;
                f13c[1] = 0;
                d.b();
                d.e();
                f13c[0] = 1;
                a = u;
                u = -1;
                System.gc();
                c();
                break;
            case 3:
                if (j) {
                    if (k) {
                        d(3000);
                        k.d();
                    }
                    i = false;
                    new StringBuffer().append(".       difficulty = ").append(f19h).toString();
                    new StringBuffer().append(".       game mode = ").append(f14c).toString();
                    d.b();
                    f13c[0] = 1;
                    if (k) {
                        d.m31a(k.w, -1);
                    } else {
                        d.e();
                    }
                    if (f14c == 2 && !k) {
                        k.m102d(f18g);
                        k.a(d.d(), d.a());
                        new StringBuffer().append(".       current level = ").append(f18g).append("/").append(61).toString();
                        o = k.U;
                        p = k.V;
                    }
                    d.b(9, 0);
                    if (k.f302i && f14c != 2) {
                        d.b(14, 0);
                    }
                    k = false;
                } else {
                    v = 2;
                    u = 0;
                    A = 0;
                    z = 0;
                    f13c[1] = 0;
                    d.b();
                    d.e();
                    f13c[0] = 1;
                }
                a = u;
                u = -1;
                System.gc();
                c();
                break;
            case 4:
                if (d.m38b(6) != null) {
                    d.e();
                    f13c[0] = 1;
                    d.b();
                    g.a(d.m30a(275));
                }
                a = u;
                u = -1;
                System.gc();
                c();
                break;
            case 5:
                d.e();
                f13c[0] = 1;
                d.b();
                f11a.a(0);
                a = u;
                u = -1;
                System.gc();
                c();
                break;
            case 6:
                if (d.m38b(5) != null) {
                    d.e();
                    f13c[0] = 1;
                    d.b();
                    C();
                }
                a = u;
                u = -1;
                System.gc();
                c();
                break;
            case 7:
            case 8:
            case 9:
            default:
                a = u;
                u = -1;
                System.gc();
                c();
                break;
        }
    }

    private static final void p() {
        switch (f19h) {
            case 1:
                f17f = 5;
                break;
            case 2:
                f17f = 5;
                break;
            case 3:
                f17f = 5;
                break;
            case 4:
                f17f = 5;
                break;
        }
    }

    private static final void g(int i2) {
        if (i2 > 0 && i2 < 36) {
            f(i2);
        }
        if (i2 == 103) {
            e(5);
        }
        if (d.m38b(5) != null && i2 == 104) {
            e(6);
        }
        if (d.m38b(6) != null && i2 == 105) {
            e(4);
        }
        if (i2 == 212) {
            f12a.a(4);
            e(8);
        }
        if (i2 == 106) {
            d.m34b(f0a[f3b].m107a(4));
            f13c[3] = 1;
            s();
        }
        if (i2 == 110) {
            d.b(f0a[f3b].m107a(6) == 1);
            f13c[3] = 1;
            s();
        }
        if (i2 == 111) {
            h = f0a[f3b].m107a(7) == 1;
            for (int i3 = 0; i3 < F; i3++) {
                f31a[i3] = false;
            }
            f13c[3] = 1;
            s();
        }
        if (i2 == 201 || i2 == 200 || i2 == 202 || i2 == 202 || i2 == 203) {
            if (i2 == 201) {
                f14c = 2;
                a(false);
            } else if (i2 == 200) {
                f14c = 1;
            } else if (i2 == 202) {
                f14c = 3;
            } else if (i2 == 203) {
                f14c = 4;
            }
            k.a(d.d(), d.a());
            k.b();
            if (f && (f14c == 1 || f14c == 2)) {
                f(19);
            } else if (f14c == 1) {
                if (g) {
                    b(true);
                } else {
                    f(20);
                }
            } else if (f14c == 3 || f14c == 4) {
                f(20);
            }
        }
        if (i2 >= 204 && i2 <= 208) {
            boolean z2 = false;
            f21j = f19h;
            switch (i2 - 204) {
                case 0:
                    z2 = true;
                    f19h = f20i;
                    break;
                case 1:
                    f19h = 1;
                    break;
                case 2:
                    f19h = 2;
                    break;
                case 3:
                    f19h = 3;
                    break;
                case 4:
                    f19h = 4;
                    break;
            }
            if (f14c == 1) {
                if (z2) {
                    k.V = r;
                    k.U = q;
                    f34k = l;
                    b(false);
                } else if (q == 0) {
                    b(true);
                } else {
                    f(21);
                }
            } else if (f14c == 3) {
                p();
                c(true);
            } else if (f14c == 4) {
                p();
                d(true);
            }
        }
        if (i2 == 210) {
            e();
            f(2);
        }
        if (i2 == 211) {
            F();
        }
        if (i2 == 213 || i2 == 214) {
            if (i2 == 213) {
                f18g = 0;
                C = 4;
                p = 0;
                o = 5;
                k.u++;
            } else {
                k.U = o;
                k.V = p;
            }
            e(3);
        }
        if (i2 == 108) {
            k = true;
            f.a();
            if (f13c[3] == 1) {
                b(3, -1);
            } else {
                e(3);
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static final int m3c(int i2) {
        for (int i3 = 0; i3 < f32f.length; i3++) {
            if (i2 >= f32f[i3] && i2 < f32f[i3 + 1]) {
                return i3;
            }
        }
        return Integer.MAX_VALUE;
    }

    private static final void h(int i2) {
        if (i2 == 5) {
            if ((f3b == 4 || f3b == 5) && f13c[3] == 1) {
                b(1, f1a[f3b]);
            } else {
                a(f1a[f3b], false);
            }
        }
        if (i2 == 13) {
            if (f14c == 4 || f14c == 3) {
                f(35);
            } else {
                G();
            }
        }
        switch (f3b) {
            case 1:
                if (i2 == 2) {
                    if (d.c() == 0) {
                        d.m34b(3);
                    }
                    if (d.m37e() == 0) {
                        d.m23a(3);
                    }
                    b(2, -1);
                } else {
                    if (d.c() != 0 || d.m37e() != 0) {
                        d.m34b(0);
                        d.m23a(0);
                    }
                    b(2, -1);
                }
                s();
                break;
            case 2:
                if (i2 == 6) {
                    f(3);
                }
                break;
            case 3:
                if (i2 != 2) {
                    f(2);
                } else {
                    c.a().f72a = true;
                }
                break;
            case 7:
                if (i2 == 1) {
                    f(5);
                }
                break;
            case 18:
                if (i2 == 2) {
                    d();
                    e();
                    f(5);
                }
                if (i2 == 7) {
                    f(5);
                }
                break;
            case 19:
                if (i2 == 2) {
                    h = true;
                }
                if (i2 == 7) {
                    h = false;
                }
                if (f14c == 1) {
                    b(true);
                } else {
                    a(true);
                }
                f = false;
                break;
            case 21:
                if (i2 == 2) {
                    b(true);
                }
                if (i2 == 7) {
                    f19h = f21j;
                    f(20);
                }
                break;
            case 23:
            case 24:
            case 29:
            case 32:
                if (i2 == 1) {
                    boolean z2 = false;
                    if (f3b == 24) {
                        J += I;
                        m6a(-1);
                        X = 0;
                    }
                    if (f3b == 23) {
                        f35l = false;
                        f(24);
                        v();
                    } else if (f3b != 24 && f3b != 29) {
                        z2 = true;
                    } else if (m7b(X) < f44a.length) {
                        f(29);
                    } else if (m10a()) {
                        f(32);
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        if ((f14c == 1 && k.f287b) || f14c == 3 || f14c == 4) {
                            f(25);
                        } else if (f14c == 1) {
                            F();
                        } else if (C > 0 && f18g < 61) {
                            f(25);
                        } else {
                            if (f18g < 61) {
                                f(26);
                            } else {
                                f(27);
                            }
                            f18g = 0;
                            C = 0;
                            e();
                        }
                    }
                }
                break;
            case 25:
                if (i2 == 2) {
                    F();
                } else if (i2 == 7) {
                    e();
                    f(2);
                }
                break;
            case 26:
            case 27:
                if (i2 == 1) {
                    f(2);
                }
                break;
            case 35:
                if (i2 == 2) {
                    G();
                }
                if (i2 == 7) {
                    f(4);
                }
                break;
        }
    }

    private static final void q() {
        int[] iArrM105a = f0a[f3b].m105a(c.a().b());
        if (iArrM105a != null) {
            if (iArrM105a[0] == 1) {
                g(iArrM105a[1]);
            }
            if (iArrM105a[0] == 0) {
                h(iArrM105a[1]);
            }
        }
    }

    private static final void i(int i2) {
        A += c.a().b();
        if (A >= (i2 == 2 ? 3000 : 5000) || z != 0) {
            if (i2 == 2) {
                f10a[0] = null;
                e(10);
            } else {
                f10a[1] = null;
                f(2);
            }
        }
    }

    private static final void b(int i2, int i3) {
        f13c[4] = i2;
        f13c[5] = i3;
        f13c[1] = 0;
        e(7);
    }

    private static final void r() {
        if (f13c[1] == 0) {
            f13c[1] = 50;
            return;
        }
        if (f13c[4] == 1) {
            f(f13c[5]);
        } else {
            e(f13c[4]);
        }
        t();
    }

    private static final void s() {
        int i2 = d.c() == 0 ? 0 : 1;
        l lVar = f0a[5];
        if (lVar != null) {
            lVar.e(4, i2);
        }
        f0a[4].e(4, i2);
        f0a[5].e(6, d.m22a() ? 1 : 0);
        f0a[4].e(6, d.m22a() ? 1 : 0);
    }

    private static final void t() {
        d.a(true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(d.c());
            dataOutputStream.writeInt(d.m22a() ? 1 : 0);
            dataOutputStream.writeByte(h ? 1 : 0);
            for (int i2 = 0; i2 < F; i2++) {
                dataOutputStream.writeByte(f31a[i2] ? 1 : 0);
            }
        } catch (Exception unused) {
        }
        d.a("s", byteArrayOutputStream.toByteArray());
        f13c[3] = 0;
        d.a(!e);
    }

    private static final void u() {
        byte[] bArrA = d.a("s");
        d.m34b(3);
        d.b(true);
        if (bArrA != null) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArrA));
                d.m34b(dataInputStream.readInt());
                d.b(dataInputStream.readInt() == 1);
                h = dataInputStream.readByte() == 1;
                for (int i2 = 0; i2 < F; i2++) {
                    f31a[i2] = dataInputStream.readByte() == 1;
                }
            } catch (Exception unused) {
            }
            f13c[2] = 1;
        }
        if (d.m38b(7) != null) {
            f13c[2] = 1;
        }
    }

    private static final void c(Graphics graphics) {
        if (f14c == 2 || f14c == 1) {
            graphics.setColor(0);
            int iM100l = 256;
            if (f35l) {
                iM100l = 256 + (k.m100l((L >> 4) & 127) >> 6);
            }
            f.a(graphics, f.f167b, d.d() / 2, d.a() / 2, k.V, iM100l, false, true);
        }
    }

    private static final void d(Graphics graphics) {
        if (H >= 0) {
            int iD = d.d();
            int iA = d.a();
            J = k.a();
            int i2 = 100;
            int i3 = f32f[G + 1];
            int i4 = f32f[G];
            if (J < i3) {
                i2 = J >= i4 ? ((J - i4) * 100) / (i3 - i4) : 0;
            }
            f.a(graphics, (iD - f.m51b()) >> 1, (iA - ((f.m50a() * 115) / 100)) / 2, i2, 100, G);
            graphics.setColor(0);
            int i5 = (iA * 80) / 100;
            if (J < 100000) {
                f.a(graphics, f.f166a, iD, iA / 7, J, 256, false, true);
            } else {
                f.a(graphics, f.f167b, iD, iA / 7, J, 256, false, true);
            }
            f.a(graphics, f.f167b, iD, i5, f32f[G + 1], 256, false, true);
            int iA2 = d.a() >> 1;
            f25b.a(graphics, f25b.d(), iA2);
            f26c.a(graphics, d.d() - f26c.d(), iA2);
        }
    }

    private static final void v() {
        s = 0;
        t = 0;
        Q = 0;
    }

    private static final void j(int i2) {
        f2a.m105a(i2);
        switch (s) {
            case 1:
            case 2:
            case 6:
                t += i2;
                break;
            case 3:
            case 4:
            case 5:
                R += i2;
                break;
        }
        switch (s) {
            case 0:
                s = 1;
                U = f32f[H + 1] - f32f[H];
                V = J - f32f[H];
                t = 0;
                b.a(d.m30a(f33g[H]), (Image) null);
                b.b(d.d(), d.a());
                break;
            case 1:
                T = J;
                S = I;
                U = f32f[H + 1] - f32f[H];
                V = J - f32f[H];
                if (t >= 500) {
                    s = 2;
                    t = 0;
                }
                break;
            case 2:
                Q = (I * t) / 3000;
                S = I - Q;
                T = J + Q;
                int iM3c = m3c(Q + J);
                if (iM3c > H) {
                    H = iM3c;
                    T = f32f[iM3c];
                    s = 3;
                } else if (t >= 3000) {
                    t = 0;
                    s = 6;
                    J += I;
                    I = 0;
                }
                if (s != 6) {
                    U = f32f[H + 1] - f32f[H];
                    V = (J + Q) - f32f[H];
                } else {
                    U = f32f[H + 1] - f32f[H];
                    V = J - f32f[H];
                }
                break;
            case 3:
                if (R >= 2000) {
                    R = 0;
                    s = 4;
                }
                break;
            case 4:
                if (R >= 500) {
                    R = 0;
                    s = 5;
                }
                break;
            case 5:
                if (R >= 1000) {
                    s = 2;
                    K++;
                    b.a(d.m30a(f33g[H]), (Image) null);
                    b.b(d.d(), d.a());
                }
                break;
            case 6:
                S = 0;
                T = J;
                U = f32f[H + 1] - f32f[H];
                V = J - f32f[H];
                break;
        }
        b.m105a(i2);
    }

    private static final void e(Graphics graphics) {
        int iD = d.d();
        int iA = d.a();
        int i2 = 256;
        l.a(graphics);
        graphics.setColor(16777215);
        int i3 = iD >> 4;
        graphics.fillRect(i3, 0, iD - (i3 * 2), iA);
        int iM51b = (iD - f.m51b()) >> 1;
        int iM50a = (iA - ((f.m50a() * 125) / 100)) / 2;
        switch (s) {
            case 0:
            case 1:
                f.a(graphics, iM51b, iM50a, V, U, K);
                i2 = 768 - ((512 * t) / 500);
                break;
            case 2:
                f.a(graphics, iM51b, iM50a, V, U, K);
                break;
            case 3:
                f.a(graphics, iM51b, iM50a, 100, 100, K);
                break;
            case 4:
                f.a(graphics, iM51b, iM50a, 100, 100, K);
                break;
            case 5:
                int i4 = (iD * R) / 1000;
                f.a(graphics, iM51b - i4, iM50a, 100, 100, K);
                f.a(graphics, (iM51b + iD) - i4, iM50a, 0, 100, K + 1);
                break;
            case 6:
                f.a(graphics, iM51b, iM50a, V, U, K);
                break;
        }
        graphics.setColor(0);
        if (S < 0) {
            S = 0;
        }
        if (T < 0) {
            T = 0;
        }
        int i5 = ((iA * 75) / 100) + 2;
        if (S != 0) {
            f.a(graphics, f.f166a, iD, iA / 7, S, i2, false, true);
        }
        f.a(graphics, f.f167b, iD, i5, T, 256, false, true);
        f2a.a(graphics, 0, i5 + f.f167b.e());
        if (s == 4) {
            f.a(graphics, f.f167b, iD, (iA * 4) / 5, T, 256 + ((4000 * R) / 500), false, true);
        }
        b.a(graphics, 0, 0);
    }

    @Override // defpackage.c
    public final void a(Graphics graphics) {
        int iD;
        int i2;
        int iD2 = d.d();
        int iA = d.a();
        switch (a) {
            case 0:
                b(graphics);
                break;
            case 1:
                if (f3b == 24) {
                    e(graphics);
                } else if (f3b == 16 || f3b == 29) {
                    f0a[30].a(graphics, 0, 0);
                    int i3 = f0a[30].f339c;
                    int iA2 = (i3 + f5a.a()) - (f25b.e() / 2);
                    (f45j[f3b == 16 ? W : X] > 0 ? f28e : f27d).a(graphics, d.d() / 2, iA2);
                    f0a[31].a(graphics, 2 * f25b.d(), i3);
                    if (f3b == 16) {
                        f25b.a(graphics, f25b.d(), iA2);
                        f26c.a(graphics, d.d() - f26c.d(), iA2);
                        iD = 4;
                        i2 = 4;
                    } else {
                        iD = d.d() - 4;
                        i2 = 8;
                    }
                    f0a[16].a(graphics, 0, i3 + (f0a[31].f339c - 4));
                    f5a.a(graphics, new StringBuffer().append("").append(m8d()).append("/").append(1000).append(d.m30a(305)).toString(), iD, d.a() - (d.m29b() / 2), 32 | i2);
                } else if (f3b == 11) {
                    f0a[f3b].a(graphics, f26c.d(), 0);
                    int iA3 = d.a() >> 1;
                    f25b.a(graphics, f25b.b(), iA3);
                    f26c.a(graphics, (d.d() - f26c.d()) + f26c.b(), iA3);
                } else {
                    f0a[f3b].a(graphics, 0, 0);
                }
                if (f3b == 23) {
                    c(graphics);
                }
                if (f3b == 17) {
                    d(graphics);
                }
                break;
            case 2:
                f(graphics);
                break;
            case 3:
                f.a(graphics, d.d(), d.a());
                if (D > 0) {
                    int i4 = 1 + (D / 1000);
                    int i5 = D % 1000;
                    graphics.setColor(16777215);
                    f.f166a.b(i4);
                    f.a(graphics, f.f166a, iD2 >> 1, iA >> 1, i4, 256 + i5, false, true);
                }
                break;
            case 4:
                if (d.m38b(6) != null) {
                    g.a(graphics);
                }
                break;
            case 5:
                f11a.a(graphics);
                break;
            case 6:
                if (d.m38b(5) != null) {
                    l.a(graphics);
                    i.a(graphics);
                }
                break;
            case 8:
            case 9:
                f12a.a(graphics);
                break;
            case 10:
                g(graphics);
                break;
        }
        if (f4c) {
            c.a(graphics, x, y);
        }
    }

    public static final void b(Graphics graphics) {
        int i2;
        int i3;
        int iD = d.d();
        int iA = d.a();
        int i4 = iD >> 1;
        int iMax = Math.max(iA >> 5, 6);
        int i5 = (iD - i4) >> 1;
        int i6 = (iA - iMax) >> 1;
        if (v != 0 || f43n) {
            i2 = 47851;
            i3 = 16777215;
        } else {
            i2 = 16777215;
            i3 = 0;
        }
        graphics.setColor(i2);
        graphics.fillRect(0, 0, iD, iA);
        graphics.setColor(i3);
        graphics.fillRect(i5, i6, i4, iMax);
        graphics.setColor(i2);
        graphics.fillRect(i5 + 1, i6 + 1, i4 - 2, iMax - 2);
        graphics.setColor(i3);
        graphics.fillRect(i5 + 2, i6 + 2, ((i4 - 4) * f13c[1]) / 100, iMax - 4);
    }

    private static final void f(Graphics graphics) {
        int iD = d.d();
        int iA = d.a();
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, iD, iA);
        if (f10a[0] != null) {
            graphics.drawImage(f10a[0], iD >> 1, iA >> 1, 3);
        }
    }

    private static final void g(Graphics graphics) {
        int iD = d.d();
        int iA = d.a();
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, iD, iA);
        if (f10a[1] != null) {
            graphics.drawImage(f10a[1], iD >> 1, iA >> 1, 3);
        }
    }

    private static final void w() {
        d.a(0, 328, null, 0);
        d.a(1, 327, null, 0);
        d.a(2, 329, null, 0);
        d.a(3, 330, null, 1);
        d.a(4, 331, null, 1);
        d.a(5, 332, null, 2);
        d.a(6, 333, null, 3);
        d.a(7, 334, null, 2);
        d.a(8, 335, null, 4);
        d.a(9, 336, d.m26a(65550), 2);
        d.a(10, 337, null, 2);
        d.a(11, 338, null, 2);
        d.a(12, 340, null, 0);
        d.a(13, 318, null, 2);
        d.a(14, 341, null, 0);
    }

    private static final void x() {
        f10a = new Image[2];
        f10a[0] = d.m26a(65547);
        f10a[1] = d.m26a(65557);
    }

    private static final void y() {
        try {
            a.m16a();
        } catch (Exception unused) {
        }
        f23a = new a(a.a(new int[]{131298}), true);
        f24a = d.m26a(65548);
        l.f329a = new a(a.a(new int[]{131305}), false);
        l.f330b = new a(a.a(new int[]{131304}), false);
        l.c = new a(a.a(new int[]{131301}), false);
        l.d = new a(a.a(new int[]{131303}), false);
        l.f331e = new a(a.a(new int[]{131452}), false);
        l.f = new a(a.a(new int[]{131454}), false);
        f8a = new a[f9b.length];
        for (int i2 = 0; i2 < f9b.length; i2++) {
            f8a[i2] = new a(a.a(new int[]{f9b[i2], f9b[i2], f9b[5]}), false);
        }
        f27d = new a(a.a(new int[]{131459}), true);
        f28e = new a(a.a(new int[]{131461}), true);
        try {
            f5a = new b(d.m26a(-1), d.a(65536), f7a, 0, 16777215);
            f6b = new b(d.m26a(-1), d.a(65537), f7a, 0, -1);
        } catch (IOException unused2) {
        }
        l.a(f5a, f6b);
    }

    private static final void z() {
        f0a[28].a(0, 0, d.a(d.m30a(231), new String[]{new StringBuffer().append("").append(C).toString()}), f8a[11], 214);
        f0a[28].a(1, 0, d.m30a(273), f8a[11], 213);
        f0a[28].b(d.d(), d.a());
    }

    private static final void A() {
        f0a[20].a(0, 5, 0);
        f0a[20].a(d.m30a(219), (Image) null);
        if (f14c == 1 && q > 0) {
            f0a[20].a(0, 0, d.m30a(220), f8a[1], 204);
        }
        f0a[20].a(1, 0, d.m30a(221), f8a[11], 205);
        f0a[20].a(2, 0, d.m30a(222), f8a[11], 206);
        f0a[20].a(3, 0, d.m30a(223), f8a[11], 207);
        f0a[20].a(4, 0, d.m30a(224), f8a[11], 208);
        f0a[20].a(0, 0);
        f0a[20].a(5, 1);
        f0a[20].b(d.d(), d.a());
    }

    private static final void B() {
        if (a != 5) {
            f11a = d.m40a();
        }
        f12a = d.m39a();
        f25b = new a(a.a(65604), true);
        f26c = new a(a.a(65592), true);
        f0a[2] = new l();
        f0a[2].a(0, 13, 0);
        f0a[2].a((String) null, f23a, 1);
        f0a[2].a(0, 0);
        f0a[2].a(6, 1);
        String strM44a = f12a.m44a();
        if (strM44a != null) {
            f0a[2].a(0, 0, strM44a, f8a[2], 212);
        }
        f0a[2].a(1, 0, d.m30a(212), f8a[11], 200);
        f0a[2].a(2, 0, d.m30a(213), f8a[22], 201);
        f0a[2].a(3, 0, d.m30a(214), f8a[23], 202);
        f0a[2].a(4, 0, d.m30a(215), f8a[24], 203);
        f0a[2].a(5, 0, d.m30a(254), f8a[20], 14);
        if (d.m38b(3) != null) {
            f0a[2].a(6, 0, d.m30a(353), f8a[7], 103);
        } else {
            f0a[2].a(6, 0, d.m30a(211), f8a[7], 103);
        }
        f0a[2].a(7, 0, d.m30a(237), f8a[14], 5);
        if (d.m38b(5) != null) {
            f0a[2].a(8, 0, d.m30a(345), f8a[2], 104);
        }
        if (d.m38b(6) != null) {
            f0a[2].a(9, 0, d.m30a(348), f8a[17], 105);
        }
        f0a[2].a(10, 0, d.m30a(243), f8a[3], 8);
        f0a[2].a(11, 0, d.m30a(258), f8a[0], 13);
        f0a[2].b(d.d(), d.a());
        f0a[23] = new l();
        f1a[23] = 2;
        f0a[23].a(1, 1, 0);
        f0a[23].a(0, 1, "", (Image[]) null, -1);
        f0a[23].a(1, 0);
        f0a[23].b(d.d(), d.a());
        f0a[24] = new l();
        f1a[24] = 2;
        f0a[24].a(1, 1, 0);
        f0a[24].a(d.m30a(228), (Image) null);
        f0a[24].a(0, 1, "", (Image[]) null, -1);
        f0a[24].a(1, 0);
        f0a[24].b(d.d(), d.a());
        f2a = new l();
        f2a.a(0, 1, 0);
        f2a.f335d = l.f334c;
        f2a.a(d.m30a(229), (Image) null);
        f2a.b(d.d(), d.a());
        b = new l();
        b.a(1, 1, 0);
        b.f335d = l.f334c;
        f0a[25] = new l();
        f1a[25] = 2;
        f0a[25].a(1, 2, 1);
        f0a[29] = new l();
        f0a[29].a(1, 1, 1);
        f0a[29].a(0, 1, "", (Image[]) null, -1);
        f0a[29].a(1, 0);
        f0a[29].b(d.d(), d.a());
        f0a[20] = new l();
        f1a[20] = 2;
        A();
        f0a[21] = new l();
        f1a[21] = 2;
        f0a[21].a(1, 1, 0);
        f0a[21].a(d.m30a(225), (Image) null);
        f0a[21].a(0, 1, d.m30a(226), (Image[]) null, -1);
        f0a[21].a(2, 0);
        f0a[21].a(7, 1);
        f0a[21].b(d.d(), d.a());
        f0a[19] = new l();
        f1a[19] = 2;
        f0a[19].a(1, 1, 0);
        f0a[19].a(d.m30a(217), (Image) null);
        f0a[19].a(0, 1, d.m30a(218), (Image[]) null, -1);
        f0a[19].a(2, 0);
        f0a[19].a(7, 1);
        f0a[19].b(d.d(), d.a());
        f0a[14] = new l();
        f1a[14] = 2;
        f0a[14].a(0, 3, 0);
        f0a[14].a(d.m30a(254), (Image) null);
        f0a[14].a(0, 0, d.m30a(255), f8a[20], 15);
        f0a[14].a(1, 0, d.m30a(256), f8a[25], 16);
        f0a[14].a(2, 0, d.m30a(257), f8a[26], 17);
        f0a[14].a(0, 0);
        f0a[14].a(5, 1);
        f0a[14].b(d.d(), d.a());
        f0a[15] = new l();
        f1a[15] = 14;
        f0a[15].a(1, 15, 0);
        f0a[15].a(d.m30a(255), (Image) null);
        f0a[15].a(0, 1, "", (Image[]) null, -1);
        f0a[15].a(5, 1);
        f0a[15].b(d.d(), d.a());
        f0a[30] = new l();
        f0a[30].a(1, 1, 1);
        f0a[30].a(d.m30a(256), (Image) null);
        f0a[30].a(0, 1, "", (Image[]) null, -1);
        f0a[30].b(d.d(), d.a() / 6);
        f0a[31] = new l();
        f0a[31].a(0, 1, 1);
        f0a[31].f335d = l.f334c;
        f0a[16] = new l();
        f1a[16] = 14;
        f0a[16].a(1, 1, 1);
        f0a[16].a(0, 1, "", (Image[]) null, -1);
        f0a[16].f335d = l.f334c;
        f0a[16].a(5, 1);
        f0a[17] = new l();
        f1a[17] = 14;
        f0a[17].a(1, 1, 0);
        f0a[17].a(d.m30a(257), (Image) null);
        f0a[17].a(5, 1);
        f0a[17].b(d.d(), d.a());
        f0a[8] = new l();
        f1a[8] = 2;
        f0a[8].a(0, 5, 0);
        f0a[8].a(d.m30a(243), (Image) null);
        f0a[8].a(0, 0, d.m30a(244), f8a[3], 9);
        f0a[8].a(1, 0, d.m30a(248), f8a[3], 10);
        f0a[8].a(2, 0, d.m30a(250), f8a[3], 11);
        f0a[8].a(3, 0, d.m30a(252), f8a[3], 12);
        f0a[8].a(4, 0, d.m30a(246), f8a[3], 33);
        f0a[8].a(0, 0);
        f0a[8].a(5, 1);
        f0a[8].b(d.d(), d.a());
        f0a[9] = new l();
        f1a[9] = 8;
        f0a[9].a(1, 1, 0);
        f0a[9].a(d.m30a(244), (Image) null);
        f0a[9].a(0, 1, d.m30a(245), (Image[]) null, -1);
        f0a[9].a(5, 1);
        f0a[9].b(d.d(), d.a());
        f0a[10] = new l();
        f1a[10] = 8;
        f0a[10].a(1, 1, 0);
        f0a[10].a(d.m30a(248), (Image) null);
        f0a[10].a(0, 1, d.m30a(249), (Image[]) null, -1);
        f0a[10].a(5, 1);
        f0a[10].b(d.d(), d.a());
        f0a[11] = new l();
        f1a[11] = 8;
        f0a[11].a(1, 1, 0);
        f0a[11].a(d.m30a(250), (Image) null);
        f0a[11].a(5, 1);
        while (!k.f305a[E]) {
            E++;
        }
        f0a[12] = new l();
        f1a[12] = 8;
        f0a[12].a(1, 1, 0);
        f0a[12].a(d.m30a(252), (Image) null);
        f0a[12].a(0, 1, d.m30a(253), (Image[]) null, -1);
        f0a[12].a(5, 1);
        f0a[12].b(d.d(), d.a());
        f0a[33] = new l();
        f1a[33] = 8;
        f0a[33].a(1, 1, 0);
        f0a[33].a(d.m30a(246), (Image) null);
        f0a[33].a(0, 1, d.m30a(247), (Image[]) null, -1);
        f0a[33].a(5, 1);
        f0a[33].b(d.d(), d.a());
        f0a[32] = new l();
        f1a[32] = 2;
        f0a[32].a(1, 5, 1);
        f0a[13] = new l();
        f1a[13] = 2;
        f0a[13].a(1, 4, 0);
        f0a[13].a(d.m30a(258), (Image) null);
        if (d.m38b(10) == null) {
            f0a[13].a(0, 1, d.m30a(259), (Image[]) null, -1);
        } else {
            f0a[13].a(0, 1, d.m30a(260), (Image[]) null, -1);
        }
        Image imageM26a = d.m26a(65549);
        f0a[13].a(2, 1, (String) null, new Image[]{imageM26a, imageM26a, imageM26a}, -1);
        f0a[13].a(3, 1, d.m30a(261), (Image[]) null, -1);
        f0a[13].a = 150;
        f0a[13].a(5, 1);
        f0a[13].b(d.d(), d.a());
        f0a[3] = new l();
        f0a[3].a(1, 1, 0);
        f0a[3].a(2, 0);
        f0a[3].a(7, 1);
        f0a[3].a(0, 1, d.m30a(263), (Image[]) null, -1);
        f0a[3].b(d.d(), d.a());
        f0a[4] = new l();
        f1a[4] = 2;
        f0a[4].a(0, 9, 0);
        f0a[4].a(d.m30a(235), (Image) null);
        f0a[4].a(0, 0);
        f0a[4].a(13, 1);
        f0a[4].a(0, 0, d.m30a(236), f8a[11], 108);
        a(f0a[4]);
        f0a[4].b(d.d(), d.a());
        f0a[5] = new l();
        f1a[5] = 2;
        f0a[5].a(0, 10, 0);
        f0a[5].a(d.m30a(237), (Image) null);
        f0a[5].a(0, 0);
        f0a[5].a(5, 1);
        a(f0a[5]);
        f0a[5].a(8, 0, d.m30a(238), f8a[12], 18);
        f0a[5].b(d.d(), d.a());
        f0a[18] = new l();
        f0a[18].a(1, 1, 0);
        f0a[18].a(d.m30a(238), (Image) null);
        f0a[18].a(2, 0);
        f0a[18].a(7, 1);
        f0a[18].a(0, 1, d.m30a(239), (Image[]) null, -1);
        f0a[18].b(d.d(), d.a());
        f0a[26] = new l();
        f0a[26].a(1, 1, 3);
        f0a[26].a(d.m30a(269), (Image) null);
        f0a[26].a(0, 1, d.m30a(270), (Image[]) null, -1);
        f0a[26].a(1, 0);
        f0a[26].b(d.d(), d.a());
        f0a[27] = new l();
        f0a[27].a(1, 1, 3);
        f0a[27].a(d.m30a(271), (Image) null);
        f0a[27].a(0, 1, d.m30a(272), (Image[]) null, -1);
        f0a[27].a(1, 0);
        f0a[27].b(d.d(), d.a());
        f0a[28] = new l();
        f1a[28] = 2;
        f0a[28].a(0, 2, 0);
        f0a[28].a(d.m30a(213), (Image) null);
        f0a[28].a(0, 0);
        f0a[28].a(5, 1);
        f0a[35] = new l();
        f0a[35].a(1, 1, 0);
        f0a[35].a(d.m30a(240), (Image) null);
        f0a[35].a(2, 0);
        f0a[35].a(7, 1);
        f0a[35].a(0, 1, d.m30a(241), (Image[]) null, -1);
        f0a[35].b(d.d(), d.a());
        d.b();
    }

    private static final void C() {
        String[] strArr = {d.m30a(276), d.m30a(277), d.m30a(278), d.m30a(345)};
        String[] strArr2 = {d.m30a(279), d.m30a(280), d.m30a(281), d.m30a(343)};
        if (f29b == null) {
            f29b = new Image[]{d.m26a(65554), d.m26a(65555), d.m26a(65556), null};
        }
        i.a(strArr, null, strArr2, f29b);
    }

    public static final void d() {
        k.m69a();
        N = 0;
        m = 0;
        f = true;
        f19h = -1;
        f20i = 1;
        f16e = 0;
        H = 0;
        J = 0;
        K = 0;
        f34k = 0;
        l = 0;
        f15d = 0;
        h = false;
        for (int i2 = 0; i2 < F; i2++) {
            f31a[i2] = false;
        }
        f18g = 0;
        C = 0;
        p = 0;
        o = 5;
        r = 0;
        q = 5;
        g = true;
        n = 0;
        O = 0;
        for (int i3 = 0; i3 < f44a.length; i3++) {
            f45j[i3] = 0;
        }
        for (int i4 = 0; i4 < 5; i4++) {
            f39b[i4] = false;
        }
        M = 0;
    }

    public static final void e() {
        if (f36b) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(k.i);
            dataOutputStream.writeInt(k.j);
            dataOutputStream.writeInt(k.k);
            dataOutputStream.writeInt(k.l);
            dataOutputStream.writeInt(k.m);
            dataOutputStream.writeInt(k.n);
            dataOutputStream.writeInt(k.o);
            dataOutputStream.writeInt(k.p);
            dataOutputStream.writeInt(k.v);
            dataOutputStream.writeInt(k.q);
            dataOutputStream.writeInt(k.s);
            dataOutputStream.writeInt(k.r);
            dataOutputStream.writeInt(H);
            dataOutputStream.writeInt(J);
            dataOutputStream.writeInt(K);
            dataOutputStream.writeInt(f16e);
            dataOutputStream.writeInt(O);
            dataOutputStream.writeInt(k.t);
            dataOutputStream.writeInt(k.u);
            dataOutputStream.writeInt(N);
            dataOutputStream.writeInt(n);
            dataOutputStream.writeByte(f ? 1 : 0);
            dataOutputStream.writeInt(f20i);
            dataOutputStream.writeInt(f18g);
            dataOutputStream.writeInt(C);
            dataOutputStream.writeInt(p);
            dataOutputStream.writeInt(o);
            dataOutputStream.writeInt(r);
            dataOutputStream.writeInt(q);
            dataOutputStream.writeByte(g ? 1 : 0);
            dataOutputStream.writeInt(f34k);
            dataOutputStream.writeInt(m);
            for (int i2 = 0; i2 < f44a.length; i2++) {
                dataOutputStream.writeByte(f45j[i2]);
            }
            for (int i3 = 0; i3 < 5; i3++) {
                dataOutputStream.writeByte(f39b[i3] ? 1 : 0);
            }
        } catch (IOException unused) {
        }
        d.a("g", byteArrayOutputStream.toByteArray());
        t();
    }

    public static final void f() {
        byte[] bArrA = d.a("g");
        if (bArrA != null) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArrA));
                k.i = dataInputStream.readInt();
                k.j = dataInputStream.readInt();
                k.k = dataInputStream.readInt();
                k.l = dataInputStream.readInt();
                k.m = dataInputStream.readInt();
                k.n = dataInputStream.readInt();
                k.o = dataInputStream.readInt();
                k.p = dataInputStream.readInt();
                k.v = dataInputStream.readInt();
                k.q = dataInputStream.readInt();
                k.s = dataInputStream.readInt();
                k.r = dataInputStream.readInt();
                H = dataInputStream.readInt();
                J = dataInputStream.readInt();
                K = dataInputStream.readInt();
                f16e = dataInputStream.readInt();
                O = dataInputStream.readInt();
                k.t = dataInputStream.readInt();
                k.u = dataInputStream.readInt();
                N = dataInputStream.readInt();
                n = dataInputStream.readInt();
                f = dataInputStream.readByte() == 1;
                f20i = dataInputStream.readInt();
                f18g = dataInputStream.readInt();
                C = dataInputStream.readInt();
                p = dataInputStream.readInt();
                o = dataInputStream.readInt();
                r = dataInputStream.readInt();
                q = dataInputStream.readInt();
                g = dataInputStream.readByte() == 1;
                f34k = dataInputStream.readInt();
                l = f34k;
                m = dataInputStream.readInt();
                for (int i2 = 0; i2 < f44a.length; i2++) {
                    f45j[i2] = dataInputStream.readByte();
                }
                for (int i3 = 0; i3 < 5; i3++) {
                    f39b[i3] = dataInputStream.readByte() == 1;
                }
                if (d.m38b(3) != null) {
                    M = k.a();
                }
            } catch (IOException unused) {
            }
        }
    }

    private static final void D() {
        int i2 = N / 1000;
        int i3 = i2 / 3600;
        int i4 = i2 - (i3 * 3600);
        int i5 = i4 / 60;
        f0a[15].a(0, 1, d.a(d.m30a(288), new String[]{new StringBuffer().append("").append(i3).toString(), new StringBuffer().append("").append(i5).toString(), new StringBuffer().append("").append(i4 - (i5 * 60)).toString()}), (Image[]) null, -1);
        f0a[15].a(1, 1, d.a(d.m30a(287), new String[]{new StringBuffer().append("").append(k.i).toString()}), (Image[]) null, -1);
        f0a[15].a(2, 1, d.a(d.m30a(289), new String[]{new StringBuffer().append("").append(m + 1).toString()}), (Image[]) null, -1);
        f0a[15].a(3, 1, d.a(d.m30a(290), new String[]{new StringBuffer().append("").append(f11a.m55a(1, 1)[0]).toString()}), (Image[]) null, -1);
        f0a[15].a(4, 1, d.a(d.m30a(291), new String[]{new StringBuffer().append("").append(f11a.m55a(2, 1)[0]).toString()}), (Image[]) null, -1);
        f0a[15].a(5, 1, d.a(d.m30a(300), new String[]{new StringBuffer().append("").append(f11a.m55a(3, 1)[0]).toString()}), (Image[]) null, -1);
        f0a[15].a(6, 1, d.a(d.m30a(301), new String[]{new StringBuffer().append("").append(f11a.m55a(4, 1)[0]).toString()}), (Image[]) null, -1);
        f0a[15].a(7, 1, d.a(d.m30a(297), new String[]{new StringBuffer().append("").append(k.q).toString()}), (Image[]) null, -1);
        f0a[15].a(8, 1, d.a(d.m30a(298), new String[]{new StringBuffer().append("").append(k.r).toString()}), (Image[]) null, -1);
        f0a[15].a(9, 1, d.a(d.m30a(299), new String[]{new StringBuffer().append("").append(k.t).toString()}), (Image[]) null, -1);
        f0a[15].a(10, 1, d.a(d.m30a(293), new String[]{new StringBuffer().append("").append(k.j).toString(), new StringBuffer().append("").append(k.k).toString(), new StringBuffer().append("").append(k.l).toString(), new StringBuffer().append("").append(k.m).toString()}), (Image[]) null, -1);
        f0a[15].a(11, 1, d.a(d.m30a(294), new String[]{new StringBuffer().append("").append(k.n).toString()}), (Image[]) null, -1);
        f0a[15].a(12, 1, d.a(d.m30a(295), new String[]{new StringBuffer().append("").append(k.o).toString()}), (Image[]) null, -1);
        f0a[15].a(13, 1, d.a(d.m30a(296), new String[]{new StringBuffer().append("").append(k.p).toString()}), (Image[]) null, -1);
        f0a[15].a(14, 1, d.a(d.m30a(302), new String[]{new StringBuffer().append("").append(m9e()).toString()}), (Image[]) null, -1);
        f0a[15].a = 150;
        f0a[15].b(d.d(), d.a());
    }

    private static final void a(l lVar) {
        l lVar2 = lVar;
        lVar2.a(4, d.m30a(322), f8a[9], new String[]{d.m30a(320), d.m30a(319)}, (a) null, 106);
        lVar2.e(4, d.c() == 0 ? 0 : 1);
        lVar2.a(6, d.m30a(325), f8a[18], new String[]{d.m30a(320), d.m30a(319)}, (a) null, 110);
        if (d.m22a()) {
            lVar2.e(6, 1);
        } else {
            lVar2.e(6, 0);
        }
        lVar2.a(7, d.m30a(274), f8a[27], new String[]{d.m30a(320), d.m30a(319)}, (a) null, 111);
        if (h) {
            lVar2.e(7, 1);
        } else {
            lVar2.e(7, 0);
        }
    }

    private static final void E() {
        f0a = new l[36];
        f1a = new int[36];
        f0a[1] = new l();
        f0a[1].a(1, 2, 3);
        f0a[1].a(2, 0);
        f0a[1].a(7, 1);
        f0a[1].a(0, 1, (String) null, new Image[]{f24a}, -1);
        f0a[1].a(1, 1, d.m30a(326), (Image[]) null, -1);
        f0a[1].f335d = l.f333b;
        f0a[1].f338b = 0;
        f0a[1].b(d.d(), d.a());
    }

    private static final void a(boolean z2) {
        new StringBuffer().append("sm_currentLevel = ").append(f18g).toString();
        new StringBuffer().append("sm_numOfContinues = ").append(C).toString();
        new StringBuffer().append("sm_firstTime = ").append(f).toString();
        k.I = 0;
        k.J = 1;
        if (o == 0) {
            C--;
            o = 5;
        }
        if (C > 0 && !z2) {
            f(28);
            return;
        }
        f18g = 0;
        C = 4;
        p = 0;
        o = 5;
        k.u++;
        e(3);
    }

    private static final void b(boolean z2) {
        if (g) {
            g = false;
            f19h = 1;
        }
        if (z2) {
            r = 0;
            q = 5;
            O = 0;
            l = 0;
            f34k = 0;
        }
        f20i = f19h;
        p();
        k.f302i = z2;
        k.f303j = false;
        k.I = 1;
        k.J = 1;
        e(3);
    }

    private static final void c(boolean z2) {
        k.f302i = z2;
        k.f303j = false;
        k.I = 2;
        k.J = 1;
        e(3);
        B = 0;
    }

    private static final void d(boolean z2) {
        k.f302i = z2;
        k.f303j = false;
        k.I = 3;
        k.J = 1;
        e(3);
        f15d = -m4c();
        for (int i2 = 0; i2 < 10; i2++) {
            int iAbs = Math.abs(k.a.nextInt() % 17);
            int iAbs2 = Math.abs(k.a.nextInt() % 17);
            int i3 = f.f197c[iAbs];
            f.f197c[iAbs] = f.f197c[iAbs2];
            f.f197c[iAbs2] = i3;
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static final int m4c() {
        int i2 = -1;
        switch (f19h) {
            case 1:
                i2 = 5;
                break;
            case 2:
                i2 = 5;
                break;
            case 3:
                i2 = 5;
                break;
            case 4:
                i2 = 5;
                break;
        }
        return i2;
    }

    private static final void F() {
        k.a(d.d(), d.a());
        k.b();
        if (f14c == 1) {
            k.U = q;
            k.V = r;
        } else if (f14c == 3) {
            B = 0;
        } else if (f14c == 4) {
            f15d = -m4c();
        }
        e(3);
    }

    private static final void G() {
        if (f13c[3] == 1) {
            b(1, 2);
        } else {
            f(2);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final boolean m5a(int i2) {
        if (f45j[i2] > 0) {
            return false;
        }
        int i3 = f44a[i2][1];
        boolean z2 = false;
        int i4 = a == 3 ? f34k + k.aM : f34k;
        switch (f44a[i2][0]) {
            case 0:
                z2 = f14c == 1 && f19h == 1 && i4 + 1 >= i3;
                break;
            case 1:
                z2 = f14c == 1 && f19h == 2 && i4 - O >= i3;
                break;
            case 2:
                z2 = f14c == 1 && f19h == 3 && i4 - O >= i3;
                break;
            case 3:
                z2 = f14c == 1 && f19h == 4 && i4 - O >= i3;
                break;
            case 4:
                z2 = f18g >= i3;
                break;
            case 5:
                z2 = f14c == 2 && k.V >= i3;
                break;
            case 6:
                z2 = k.s >= i3;
                break;
            case 7:
                z2 = k.v >= i3;
                break;
            case 8:
                z2 = k.o >= i3;
                break;
            case 9:
                z2 = i4 + 1 >= i3;
                break;
            case 10:
                z2 = k.p >= i3;
                break;
            case 11:
                z2 = f14c == 1 && k.V >= i3;
                break;
            case 12:
                z2 = m3c(k.a()) >= i3;
                break;
            case 13:
                z2 = k.k >= i3;
                break;
            case 14:
                z2 = k.j >= i3;
                break;
            case 15:
                z2 = N >= i3;
                break;
            case 16:
                z2 = k.n >= i3;
                break;
            case 17:
                z2 = k.l >= i3;
                break;
            case 18:
                z2 = k.m >= i3;
                break;
            case 19:
                z2 = k.u >= i3;
                break;
        }
        if (z2) {
            f45j[i2] = 1;
            new StringBuffer().append("Completed achievement ").append(i2).append(" ").append(d.m30a(f44a[i2][3])).toString();
        }
        return z2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final int m6a(int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < f44a.length; i4++) {
            if ((f44a[i4][0] == i2 || i2 == -1) && m5a(i4)) {
                i3 = i4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static final int m7b(int i2) {
        int i3 = i2;
        while (i3 < f44a.length && f45j[i3] != 1) {
            i3++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static final int m8d() {
        int i2 = 0;
        for (int i3 = 0; i3 < f44a.length; i3++) {
            if (f45j[i3] > 0) {
                i2 += f44a[i3][4];
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static final int m9e() {
        int i2 = 0;
        for (int i3 = 0; i3 < f44a.length; i3++) {
            if (f45j[i3] > 0) {
                i2++;
            }
        }
        return i2;
    }

    private static final void k(int i2) {
        f0a[31].a(d.m30a(f44a[i2][2]), (Image) null);
        f0a[16].a(0, 1, new StringBuffer().append(d.m30a(f44a[i2][3])).append(" (").append(f44a[i2][4]).append(d.m30a(305)).append(")").toString(), (Image[]) null, -1);
        f0a[31].b(d.d() - (4 * f25b.d()), d.a() / 4);
        f0a[16].b(d.d(), d.a() / 2);
    }

    private static final void H() {
        f0a[11].a(0, 1, d.m30a(f22d[E]), f.f177a[E], -1);
        f0a[11].b(d.d() - (f26c.d() << 1), d.a());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static final boolean m10a() {
        int iM8d = m8d();
        boolean z2 = false;
        f0a[32].a(1, 5, 1);
        f0a[32].a(d.m30a(308), (Image) null);
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            if (!f39b[i3] && iM8d >= f37h[i3]) {
                int i4 = i2;
                i2++;
                f0a[32].a(i4, 1, d.m30a(f38i[i3]), (Image[]) null, -1);
                z2 = true;
                f39b[i3] = true;
            }
        }
        f0a[32].a(1, 0);
        f0a[32].b(d.d(), d.a());
        if (z2) {
            e();
        }
        return z2;
    }

    private static final void I() {
        f0a[20].d(2, f39b[0] ? 0 : 1);
        f0a[20].d(3, f39b[1] ? 0 : 1);
        f0a[20].d(4, f39b[3] ? 0 : 1);
        f0a[2].d(3, f39b[2] ? 0 : 1);
        f0a[2].d(4, f39b[4] ? 0 : 1);
    }

    private static final void J() {
        if (d.m38b(3) != null) {
            f11a.a(-1, new int[]{((k.a() - M) * 100) / 100}, null);
            M = k.a();
        }
        f11a.a(0, new int[]{k.a()}, null);
        if (f14c == 1) {
            f11a.a(2, new int[]{k.V}, null);
        }
    }
}
