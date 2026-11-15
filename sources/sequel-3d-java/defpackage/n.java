package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: sequel-3d-java.jar:n.class */
public final class n {
    private static b a;
    private static b b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f205a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int f206b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static b f207c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static b f208d;
    private static int k;
    private static int l;
    private int m;
    private int n;
    private int o;
    private int p;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static f f209a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static f f210b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static f f211c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private f f212d;
    private int q;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private f f213e;
    private int r;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private f f214f;
    private int s;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static f f215g;
    private int t;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f216a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f217b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private boolean f218c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private boolean f219d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private boolean f220e;
    private int u;
    private int v;
    private int w;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private boolean f221f;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private boolean f222g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private boolean f225h;
    private int K;
    private int L;
    private int M;
    private int N;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f226a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[] f227a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Image f228a;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private b f229e;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int[] f230c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private int[] f231d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private int[] f232e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private int[] f233f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private int[] f234g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Image[][] f235a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private b[] f236a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String[] f237b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[][] f238a;
    private int X;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private int[] f239h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private int[] f240i;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private int[] f241j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private int[] f242k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private int[] f243l;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private int[] f244m;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String[][] f245b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Image[][] f246b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private b[] f247b;
    private int ad;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private int[] f248n;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private StringBuffer[] f249a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private char[] f250a;
    private int ae;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private boolean f251i;
    private int af;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private boolean f252j;
    private int ag;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[][][] f253a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[][] f254a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[][] f255b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private n[] f256a;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private boolean f257k;
    private static int ai;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static f f258h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private f f259i;
    private static int aj = -1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int[] f223a = new int[2];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final int[] f224b = new int[2];
    private int ah = -1;

    public static void a(f fVar, f fVar2, f fVar3, f fVar4) {
        f209a = fVar;
        f210b = fVar2;
        f211c = fVar3;
        f258h = fVar4;
    }

    public static void a(b bVar, b bVar2) {
        a = bVar;
        b = bVar2;
        f205a = 0;
        for (int i = 0; i < bVar.c(); i++) {
            bVar.a(i, -1, true);
            f205a = Math.max(f205a, bVar.h() + 2);
        }
        f206b = 0;
        for (int i2 = 0; i2 < bVar2.c(); i2++) {
            bVar2.a(i2, -1, true);
            f206b = Math.max(f206b, bVar2.h() + 2);
        }
    }

    public static void b(b bVar, b bVar2) {
        k = 0;
        l = 0;
        for (int i = 0; i < bVar.c(); i++) {
            bVar.a(i, -1, true);
            k = Math.max(k, bVar.g() + 2);
        }
        for (int i2 = 0; i2 < bVar2.c(); i2++) {
            bVar2.a(i2, -1, true);
            l = Math.max(l, bVar2.g() + 2);
        }
        f207c = bVar;
        f208d = bVar2;
    }

    public final void a(int i, int i2, int i3) {
        this.E = i;
        this.X = -1;
        this.d = 0;
        this.c = 0;
        this.W = i3;
        this.e = 0;
        this.K = 1;
        this.f251i = false;
        this.f230c = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            this.f230c[i4] = -1;
        }
        this.f237b = new String[i2];
        this.f238a = new String[i2][];
        this.f240i = new int[i2];
        this.f239h = new int[i2];
        this.f235a = new Image[i2][];
        this.f236a = new b[i2];
        this.J = i2;
        this.M = 1;
        this.f225h = false;
        this.ab = 1;
        if (i == 3) {
            this.f256a = new n[i2];
        }
        this.f224b[0] = -1;
        this.f224b[1] = -1;
        b(f209a, f210b, f211c, f258h);
        a(8);
        this.B = t.m98e();
        this.C = t.a();
        this.D = t.c();
    }

    public final void a(int i, int i2) {
        this.f224b[i2] = i;
    }

    public final void a(int i) {
        switch (i) {
            case 1:
                this.f216a = true;
                this.f217b = false;
                this.u = 16777215;
                this.f219d = false;
                this.f220e = false;
                this.f218c = false;
                this.f221f = true;
                break;
            case 2:
                this.f216a = false;
                this.f219d = false;
                this.f218c = false;
                this.f221f = true;
                break;
            case 3:
                this.f216a = true;
                this.u = 47851;
                this.f219d = false;
                this.f220e = true;
                this.v = 11579584;
                this.w = 1052704;
                this.f218c = false;
                this.f221f = true;
                break;
            case 4:
                this.f216a = true;
                this.f217b = true;
                this.u = 47851;
                this.f219d = true;
                this.f220e = true;
                this.v = 11579584;
                this.w = 1052704;
                this.f218c = true;
                this.f221f = false;
                break;
            case 5:
                this.f216a = true;
                this.u = 47851;
                this.f217b = true;
                this.f219d = false;
                this.f220e = true;
                this.f218c = true;
                this.f221f = false;
                break;
            case 6:
                this.f216a = false;
                this.f219d = false;
                this.f220e = true;
                this.v = 11579584;
                this.w = 1052704;
                this.f218c = false;
                this.f221f = false;
                break;
            case 7:
                this.f216a = false;
                this.f219d = false;
                this.f220e = true;
                this.v = 11579584;
                this.w = 1052704;
                this.f218c = true;
                this.f221f = false;
                break;
            case 8:
                this.f216a = true;
                this.f217b = true;
                this.u = 47851;
                this.f219d = false;
                this.f218c = false;
                this.f221f = true;
                break;
        }
        if (this.f218c) {
            this.x = 1;
            this.y = 1;
        } else {
            this.x = 6;
            this.y = 6;
        }
        this.t = i;
    }

    public final int a() {
        return this.t;
    }

    public final void a(String str, Image image) {
        this.f225h = (str == null && image == null) ? false : true;
        this.f226a = str;
        this.f228a = image;
        this.K = 1;
    }

    public final void a(String str, b bVar) {
        a(str, (Image) null);
        this.f225h |= bVar != null;
        this.f229e = bVar;
    }

    public final void a(int i, int i2, String str, Image[] imageArr, int i3) {
        if (this.f230c[i] != -1) {
            d(i);
        }
        this.f230c[i] = i2;
        this.f240i[i] = i3;
        this.f235a[i] = imageArr;
        this.f237b[i] = str;
    }

    public final void a(String str) {
        this.f237b[0] = str;
    }

    public final void a(int i, int i2, String str, b bVar, int i3) {
        a(i, i2, str, (Image[]) null, i3);
        this.f236a[i] = bVar;
    }

    public final void a(int i, int i2, String str, String str2, Image[] imageArr, int i3, int i4) {
        a(i, 3, str2, imageArr, i4);
        if (this.f248n == null) {
            this.f248n = new int[this.J];
            this.f249a = new StringBuffer[this.J];
        }
        int iMax = Math.max(2, i3);
        if (this.f250a == null || iMax > this.f250a.length) {
            this.f250a = new char[iMax];
        }
        this.f249a[i] = new StringBuffer(iMax);
        switch (i2) {
            case 0:
                this.f248n[i] = 0;
                break;
            case 1:
                this.f248n[i] = 1;
                break;
            case 2:
                this.f248n[i] = 3;
                break;
            case 3:
                this.f248n[i] = 2;
                break;
        }
        if (str != null) {
            this.f249a[i].append(str);
        }
    }

    public final void a(int i, int i2, String str, String str2, b bVar, int i3, int i4) {
        a(i, i2, str, str2, (Image[]) null, i3, i4);
        this.f236a[i] = bVar;
    }

    public final void a(int i, String str, Image[] imageArr, String[] strArr, Image[] imageArr2, int i2) {
        a(i, 5, str, imageArr, i2);
        if (this.f243l == null) {
            this.f243l = new int[this.J];
            this.f244m = new int[this.J];
        }
        this.f243l[i] = 0;
        this.f244m[i] = strArr != null ? strArr.length : 0;
        if (this.f245b == null) {
            this.f245b = new String[this.J][];
        }
        this.f245b[i] = strArr;
        this.f244m[i] = Math.max(this.f244m[i], imageArr2 != null ? imageArr2.length : 0);
        if (this.f246b == null) {
            this.f246b = new Image[this.J][];
        }
        this.f246b[i] = imageArr2;
        if (this.f247b == null) {
            this.f247b = new b[this.J];
        }
    }

    public final void a(int i, String str, b bVar, String[] strArr, b bVar2, int i2) {
        a(i, str, (Image[]) null, strArr, (Image[]) null, i2);
        this.f244m[i] = Math.max(this.f244m[i], bVar2 != null ? bVar2.c() : 0);
        this.f236a[i] = bVar;
        this.f247b[i] = bVar2;
    }

    public final void a(int i, String str, Image[] imageArr, int i2, int i3, int i4) {
        a(i, 4, str, imageArr, i4);
        if (this.f243l == null) {
            this.f243l = new int[this.J];
            this.f244m = new int[this.J];
        }
        this.f243l[i] = i2;
        this.f244m[i] = i3 + 1;
    }

    public final void a(int i, String str, b bVar, int i2, int i3, int i4) {
        a(i, str, (Image[]) null, i2, i3, i4);
        this.f236a[i] = bVar;
    }

    private void d(int i) {
        if (this.f230c[i] != -1 && this.X == i) {
            this.X = c(i);
            if (this.X < i) {
                this.X = m76d(i);
            }
        }
        if (this.f235a != null) {
            this.f235a[i] = null;
        }
        if (this.f246b != null) {
            this.f246b[i] = null;
        }
        if (this.f236a != null && this.f236a[i] != null) {
            this.f236a[i].m24a();
            this.f236a[i] = null;
        }
        if (this.f247b != null && this.f247b[i] != null) {
            this.f247b[i].m24a();
            this.f247b[i] = null;
        }
        this.f237b[i] = null;
        this.f238a[i] = null;
        this.f230c[i] = -1;
        if (this.f245b != null) {
            this.f245b[i] = null;
        }
        if (this.f254a != null) {
            this.f254a[i] = null;
            this.f255b[i] = null;
            this.f253a[i] = null;
        }
        if (this.f256a == null || this.f256a[i] == null) {
            return;
        }
        this.f256a[i].m78d();
        this.f256a[i] = null;
    }

    public final void b(f fVar, f fVar2, f fVar3, f fVar4) {
        if (fVar != null) {
            this.f212d = fVar;
            this.q = fVar.b();
        }
        if (fVar2 != null) {
            this.f213e = fVar2;
            this.r = fVar2.b();
        }
        if (fVar3 != null) {
            this.f214f = fVar3;
            this.s = fVar3.b();
        }
        if (fVar4 != null) {
            this.f259i = fVar4;
            fVar4.b();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m69a(int i) {
        int iMax;
        a(i, Integer.MAX_VALUE, true);
        int iMax2 = this.f219d ? 0 : Math.max(0, this.Q + this.R);
        if (this.E == 3) {
            if (this.f218c) {
                i -= 8;
            }
            int i2 = (this.f257k ? k + l : 0) + (this.x << 1);
            int iMax3 = 0;
            for (int i3 = 0; i3 < this.J; i3++) {
                n nVar = this.f256a[i3];
                if (nVar != null) {
                    iMax3 = Math.max(iMax3, nVar.m69a(i - i2));
                }
            }
            iMax = Math.max(iMax2, iMax3 + i2);
        } else {
            int iMax4 = 0;
            for (int i4 = 0; i4 < this.J; i4++) {
                iMax4 = Math.max(iMax4, this.f231d[(i4 << 2) + 2]);
            }
            iMax = Math.max(iMax2, this.H - (this.U - iMax4));
        }
        if (this.f218c) {
            iMax += 8;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m70a(int i, int i2) {
        int i3;
        a(i, i2, true);
        if (this.E == 3) {
            if (this.f218c) {
                i -= 8;
                i2 -= 8;
            }
            int i4 = (this.f257k ? k + l : 0) + (this.x << 1);
            int i5 = this.P;
            int iMax = 0;
            for (int i6 = 0; i6 < this.J; i6++) {
                n nVar = this.f256a[i6];
                if (nVar != null) {
                    iMax = Math.max(iMax, nVar.m70a(i - i4, i2 - i5));
                }
            }
            i3 = iMax + i5;
        } else {
            int iMin = Math.min(this.V, this.f);
            if (this.E == 1) {
                int i7 = this.r + 2;
                iMin = (iMin / i7) * i7;
            } else if (this.E == 0) {
                int i8 = this.Z;
                iMin = (iMin / i8) * i8;
            }
            i3 = this.I - (this.V - iMin);
        }
        if (this.f218c) {
            i3 += 8;
        }
        return i3;
    }

    public final void b(int i, int i2) {
        a(i, i2, false);
    }

    private void a(int i, int i2, boolean z) {
        int i3;
        if (this.f218c) {
            i -= 8;
            i2 -= 8;
        }
        this.H = i;
        this.I = i2;
        if (this.E == 3) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.f256a.length; i5++) {
                i4 += this.f256a[i5] != null ? 1 : 0;
            }
            this.f257k = i4 > 1;
        }
        this.S = this.x;
        this.U = i - (this.x << 1);
        if (this.E == 3 && this.f257k) {
            this.U -= k + l;
            this.S += k;
        }
        if (this.f225h) {
            int iG = 0;
            int iH = 0;
            if (this.f228a != null) {
                iG = this.f228a.getWidth() + 8;
                iH = this.f228a.getHeight();
            }
            if (this.f229e != null) {
                iG = this.f229e.g() + 8;
                iH = this.f229e.h();
            }
            this.R = iG;
            this.P = Math.max(this.q, iH) + 8;
            int i6 = iG;
            int i7 = this.f219d ? this.B : this.H;
            if (this.f226a != null) {
                this.f227a = new String[]{this.f226a};
            }
            int iMax = 0;
            boolean z2 = false;
            if (this.f227a != null) {
                for (int i8 = 0; i8 < this.f227a.length; i8++) {
                    iMax = Math.max(iMax, this.f212d.a(this.f227a[i8]));
                }
                z2 = true;
                if (!z) {
                    this.f226a = null;
                }
            }
            if (z2) {
                this.Q = Math.min(iMax, (i7 - i6) - 8) + 8;
                i6 += this.Q;
            } else {
                this.Q = 0;
            }
            this.O = 0;
            if ((this.K & 1) != 0) {
                this.O = (i7 - i6) >> 1;
            }
        } else {
            this.P = 0;
        }
        if (this.f225h) {
            i3 = this.P;
            if (this.f219d) {
                i3 += this.y;
            }
        } else {
            i3 = this.y;
        }
        this.T = i3;
        int i9 = (this.A + this.C) - this.D;
        int i10 = this.G + this.I;
        int iMin = Math.min((i10 - this.T) - this.y, i9 - this.T);
        int iMin2 = (Math.min((i10 - this.y) - f206b, i9) - this.T) - f205a;
        int iMax2 = 0;
        int iMax3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        if (this.E == 0) {
            for (int i11 = 0; i11 < this.J; i11++) {
                Image[] imageArr = this.f235a[i11];
                if (imageArr != null) {
                    for (int i12 = 0; i12 < imageArr.length; i12++) {
                        if (imageArr[i12] != null) {
                            iMax2 = Math.max(iMax2, imageArr[i12].getWidth() + 8);
                            iMax3 = Math.max(iMax3, imageArr[i12].getHeight() + 8);
                        }
                    }
                }
                b bVar = this.f236a[i11];
                if (bVar != null) {
                    for (int i13 = 0; i13 < bVar.c(); i13++) {
                        bVar.a(i13, -1, true);
                        iMax2 = Math.max(iMax2, bVar.g() + 8);
                        iMax3 = Math.max(iMax3, bVar.h() + 8);
                    }
                }
                z3 |= this.f230c[i11] == 3;
                z4 |= this.f230c[i11] == 4 || this.f230c[i11] == 5;
                if (this.f230c[i11] == 5) {
                    Image[] imageArr2 = this.f246b[i11];
                    if (imageArr2 != null) {
                        for (int i14 = 0; i14 < imageArr2.length; i14++) {
                            if (imageArr2[i14] != null) {
                                iMax3 = Math.max(iMax3, imageArr2[i14].getHeight() + 8);
                            }
                        }
                    }
                    b bVar2 = this.f247b[i11];
                    if (bVar2 != null) {
                        for (int i15 = 0; i15 < bVar2.c(); i15++) {
                            bVar2.a(i15, -1, true);
                            iMax3 = Math.max(iMax3, bVar2.h() + 8);
                        }
                    }
                }
            }
        } else if (this.E == 1) {
            for (int i16 = 0; i16 < this.J; i16++) {
                z5 |= this.f230c[i16] == 6;
            }
        }
        this.f231d = new int[this.J << 2];
        this.f234g = new int[this.J];
        this.f233f = new int[this.J];
        if (this.E == 1) {
            this.f232e = new int[this.J];
        }
        if (z4) {
            this.f242k = new int[this.J];
            this.f241j = new int[this.J];
        }
        if (z5) {
            this.f254a = new int[this.J][];
            this.f255b = new int[this.J][];
            this.f253a = new String[this.J][][];
        }
        if (this.E == 0) {
            this.Z = Math.max(iMax3, this.s + 8);
            if (z3) {
                this.ad = this.r + 4 + 5;
                this.Z += this.ad;
            }
        }
        if (this.E != 3) {
            int i17 = iMax2;
            int i18 = iMax3;
            for (int i19 = 0; i19 < this.J; i19++) {
                if (this.f230c[i19] == 6) {
                    int i20 = i19;
                    int i21 = this.U - 8;
                    int i22 = 0;
                    Object[] objArr = null;
                    int length = objArr.length;
                    int i23 = 0 / length;
                    int[] iArr = new int[length];
                    int[] iArr2 = new int[i23];
                    this.f254a[i20] = iArr;
                    this.f255b[i20] = iArr2;
                    this.f253a[i20] = new String[0][];
                    int i24 = i21;
                    for (int i25 = 0; i25 < length; i25++) {
                        byte[] bArr = null;
                        if (bArr[i25] == -1) {
                            iArr[i25] = 12;
                            i24 -= 12;
                        }
                    }
                    for (int i26 = 0; i26 < length; i26++) {
                        byte[] bArr2 = null;
                        if (bArr2[i26] != -1) {
                            int[] iArr3 = null;
                            iArr[i26] = (i24 * iArr3[i26]) / 100;
                        }
                    }
                    int i27 = i21;
                    for (int i28 = 0; i28 < length; i28++) {
                        i27 -= iArr[i28];
                    }
                    int i29 = length - 1;
                    iArr[i29] = iArr[i29] + i27;
                    for (int i30 = 0; i30 < i23; i30++) {
                        int i31 = ((1 / (this.r + 2)) + 1) * (this.r + 2);
                        iArr2[i30] = i31;
                        i22 += i31;
                    }
                    if (z) {
                        int iMax4 = 0;
                        int i32 = 0;
                        for (int i33 = 0; i33 < length; i33++) {
                            byte[] bArr3 = null;
                            if (bArr3[i33] != -1) {
                                int iMax5 = 0;
                                int i34 = 0;
                                while (i34 < i23) {
                                    if (this.f253a[i20] != null && this.f253a[i20][i32] != null) {
                                        for (String str : this.f253a[i20][i32]) {
                                            iMax5 = Math.max(iMax5, this.f213e.a(str));
                                        }
                                    }
                                    i34++;
                                    i32++;
                                }
                                int[] iArr4 = null;
                                int i35 = (((iMax5 + 12) * 100) + iArr4[i33]) - 1;
                                int[] iArr5 = null;
                                iMax4 = Math.max(iMax4, i35 / iArr5[i33]);
                            }
                        }
                        int i36 = iMax4;
                        int i37 = 0;
                        for (int i38 = 0; i38 < length; i38++) {
                            byte[] bArr4 = null;
                            if (bArr4[i38] != -1) {
                                int[] iArr6 = null;
                                iArr[i38] = (iMax4 * iArr6[i38]) / 100;
                                i36 -= iArr[i38];
                            }
                            i37 += iArr[i38];
                        }
                        int i39 = length - 1;
                        iArr[i39] = iArr[i39] + i36;
                        i21 = i37 + i36;
                    }
                    if (!z) {
                        Object[] objArr2 = null;
                        objArr2[i20] = null;
                    }
                    this.f231d[(i20 << 2) + 2] = i21 + 8;
                    this.f231d[(i20 << 2) + 3] = i22;
                } else {
                    int iG2 = 0;
                    int iH2 = 0;
                    if (this.E == 0) {
                        iG2 = i17;
                        iH2 = i18;
                    } else {
                        if (this.f235a[i19] != null) {
                            iG2 = this.f235a[i19][0].getWidth() + 8;
                            iH2 = this.f235a[i19][0].getHeight();
                        }
                        if (this.f236a[i19] != null) {
                            iG2 = this.f236a[i19].g() + 8;
                            iH2 = this.f236a[i19].h();
                        }
                    }
                    this.f234g[i19] = iG2;
                    int i40 = 0;
                    if (this.f230c[i19] == 5) {
                        int iMax6 = 0;
                        Image[] imageArr3 = this.f246b[i19];
                        if (imageArr3 != null) {
                            for (int i41 = 0; i41 < imageArr3.length; i41++) {
                                if (imageArr3[i41] != null) {
                                    iMax6 = Math.max(iMax6, imageArr3[i41].getWidth() + 8);
                                }
                            }
                        }
                        b bVar3 = this.f247b[i19];
                        if (bVar3 != null) {
                            for (int i42 = 0; i42 < bVar3.c(); i42++) {
                                bVar3.a(i42, -1, true);
                                iMax6 = Math.max(iMax6, bVar3.g() + 8);
                            }
                        }
                        this.f242k[i19] = iMax6;
                        int iMax7 = 0;
                        if (this.f245b[i19] != null) {
                            for (int i43 = 0; i43 < this.f245b[i19].length; i43++) {
                                String str2 = this.f245b[i19][i43];
                                if (str2 != null) {
                                    iMax7 = Math.max(iMax7, this.f214f.a(str2));
                                }
                            }
                            iMax7 += 8;
                        }
                        this.f241j[i19] = iMax7;
                        i40 = 0 + iMax6 + iMax7;
                    }
                    if (this.f230c[i19] == 4) {
                        int i44 = 6 + ((this.f244m[i19] - 2) * 7) + 8;
                        this.f242k[i19] = i44;
                        this.f241j[i19] = 0;
                        i40 += i44;
                    }
                    int iG3 = 0;
                    int iH3 = 0;
                    if (this.E == 1) {
                        if (this.f235a[i19] != null) {
                            iG3 = this.f235a[i19][0].getWidth() + 8;
                            iH3 = ((this.f235a[i19][0].getHeight() - 1) / (this.r + 2)) + 1;
                        }
                        if (this.f236a[i19] != null) {
                            iG3 = this.f236a[i19].g() + 8;
                            iH3 = ((this.f236a[i19].h() - 1) / (this.r + 2)) + 1;
                        }
                        this.f232e[i19] = iH3;
                    }
                    if (this.E == 0) {
                        i40 += iG2;
                    }
                    String[] strArrA = this.f238a[i19];
                    String str3 = this.f237b[i19];
                    if (str3 != null) {
                        if (this.E == 0) {
                            strArrA = new String[]{str3};
                        } else {
                            int i45 = (this.U - 8) - i40;
                            f215g = this.E == 0 ? this.f214f : this.f213e;
                            strArrA = a(str3, i45, iG3, iH3, true);
                        }
                    }
                    if (strArrA != null) {
                        int iMax8 = 0;
                        for (int i46 = 0; i46 < strArrA.length; i46++) {
                            String str4 = strArrA[i46];
                            int iA = this.E == 0 ? this.f214f.a(str4) : this.f213e.a(str4);
                            if (i46 < iH3) {
                                iA += iG3;
                            }
                            iMax8 = Math.max(iMax8, iA);
                        }
                        this.f233f[i19] = Math.min(iMax8, (this.U - i40) - 8) + 8;
                        i40 += this.f233f[i19];
                        iH2 = Math.max(iH2, this.E == 0 ? this.s + 8 : (this.r * strArrA.length) + (2 * strArrA.length));
                        if (!z) {
                            this.f237b[i19] = null;
                        }
                        this.f238a[i19] = strArrA;
                    } else if (this.f235a[i19] == null && this.f236a[i19] == null) {
                        iH2 = 0;
                    }
                    if (this.E == 1 && strArrA == null) {
                        i40 += iG2;
                    }
                    if (!z && (this.f230c[i19] == 5 || this.f230c[i19] == 4)) {
                        i40 = this.U;
                    }
                    if (this.E == 0 && iH2 > 0) {
                        iH2 = this.Z;
                    }
                    this.f231d[(i19 << 2) + 2] = i40;
                    this.f231d[(i19 << 2) + 3] = iH2;
                }
            }
            for (int i47 = 0; i47 < this.J; i47++) {
                if ((this.W & 1) != 0) {
                    this.f231d[i47 << 2] = (this.U - this.f231d[(i47 << 2) + 2]) >> 1;
                }
            }
            boolean z6 = false;
            do {
                if (z6) {
                    this.T = i3 + f205a;
                    this.V = iMin2;
                    this.g = this.H >> 1;
                    this.h = (this.T - f205a) + (f205a >> 1);
                    this.i = this.T + this.V + (f206b >> 1);
                } else {
                    this.V = iMin;
                }
                if (this.E == 1) {
                    this.T += 4;
                    this.V -= 8;
                    if (!z) {
                        int i48 = this.r + 2;
                        this.T += (this.V % i48) >> 1;
                        this.V = (this.V / i48) * i48;
                    }
                }
                int i49 = 0;
                for (int i50 = 0; i50 < this.J; i50++) {
                    this.f231d[(i50 << 2) + 1] = i49;
                    i49 += this.f231d[(i50 << 2) + 3];
                    if (this.E == 1 && i49 != 0) {
                        i49 = (((i49 - 1) / (this.r + 2)) + 1) * (this.r + 2);
                    }
                }
                if (this.J > 0) {
                    this.f = this.f231d[((this.J - 1) << 2) + 1] + this.f231d[((this.J - 1) << 2) + 3];
                }
                if (z6) {
                    z6 = false;
                } else if (this.f > this.V) {
                    z6 = true;
                } else if (!z && this.f221f) {
                    if (this.E == 0 && iMin2 / this.Z >= 3) {
                        z6 = true;
                    } else if (this.E == 1 && iMin2 / (this.r + 2) >= 3) {
                        z6 = true;
                    }
                }
            } while (z6);
        } else if (!z) {
            this.T = this.P;
            this.V = this.I - this.P;
            int i51 = 0;
            int i52 = this.T;
            int i53 = this.H;
            int i54 = this.V;
            if (this.f218c) {
                i51 = 0 + 4;
                i52 += 4;
            }
            for (int i55 = 0; i55 < this.J; i55++) {
                n nVar = this.f256a[i55];
                if (nVar != null) {
                    int i56 = this.D;
                    nVar.z = i51;
                    nVar.A = i52;
                    nVar.B = i53;
                    nVar.C = i54;
                    nVar.D = i56;
                    nVar.a(this.U, i54, false);
                }
            }
        }
        if (z) {
            return;
        }
        if (this.E == 0) {
            this.Y = this.V / this.Z;
            if (this.V < this.f) {
                this.T += (this.V - (this.Y * this.Z)) >> 1;
            }
        }
        if (this.X == -1) {
            this.X = 0;
        }
        this.X = c(this.X);
        if (this.X != -1) {
            this.X = m76d(this.X);
        }
        this.d = 0;
        if (this.X != -1) {
            b(this.X);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        a(i3, i4, false);
        this.F = i;
        this.G = i2;
    }

    public final int b() {
        return this.H;
    }

    public final int c() {
        return this.I;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m71a() {
        a(this.H, this.I, false);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void m72b() {
        e();
        this.c = 0;
        this.N = 0;
        this.L = 0;
        a.a(0, -1, true);
        b.a(0, -1, true);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int[] m73a(int i) {
        this.m = Math.min(this.m + i, 400);
        if (this.f216a) {
            j.j(i);
        }
        if (this.f252j && this.af > 0) {
            this.af -= i;
        }
        this.ag += i;
        this.f252j = true;
        if (this.c != 0 && this.f > this.V) {
            this.e += i;
            int i2 = (this.e * (this.r + 2)) / 300;
            this.e -= (i2 * 300) / (this.r + 2);
            if (this.c == 2) {
                this.d -= i2;
            } else if (this.c == 1) {
                this.d += i2;
            }
            if (this.j == 2) {
                this.c = 0;
            } else {
                this.j = 1;
            }
            this.d = Math.max(this.d, 0);
            this.d = Math.min(this.d, this.f - this.V);
        }
        if (this.f225h) {
            if (this.f229e != null) {
                this.f229e.b(i);
            }
            String[] strArr = this.f227a != null ? this.f227a : null;
            if (strArr != null) {
                this.p = this.N;
                this.n = this.L;
                this.o = this.M;
                b(i, this.f212d.a(strArr[0]), this.Q - 8);
                this.L = this.n;
                this.M = this.o;
                this.N = this.p;
            }
            if (this.f212d != null) {
                int i3 = f.f74a + (i >> 1);
                f.f74a = i3;
                if (i3 > 1073741823) {
                    f.f74a = 0;
                }
            }
        }
        for (int i4 = 0; i4 < this.J; i4++) {
            int i5 = i4;
            if (this.f236a[i5] != null && this.f236a[i5] != null) {
                this.f236a[i5].b(i);
            }
            if (this.f247b != null && this.f247b[i5] != null) {
                this.f247b[i5].b(i);
            }
            if (i5 == this.X && this.f238a[i5] != null) {
                this.p = this.ac;
                String[] strArr2 = this.f238a[i5];
                if (strArr2 != null) {
                    this.n = this.aa;
                    this.o = this.ab;
                    b(i, this.f214f.a(strArr2[0]), this.f233f[i5] - 8);
                    this.aa = this.n;
                    this.ab = this.o;
                }
                this.ac = this.p;
            }
            if (i5 == this.ah) {
                ai += i;
            }
        }
        a.b(i);
        b.b(i);
        if (this.E == 1) {
            int i6 = this.c == 2 ? 2 : 0;
            int i7 = i6;
            if (i6 != a.b()) {
                a.a(i7, -1, true);
            }
            int i8 = this.c == 1 ? 2 : 0;
            int i9 = i8;
            if (i8 != b.b()) {
                b.a(i9, -1, true);
            }
        } else {
            if (a.m23a()) {
                a.a(0, -1, true);
            }
            if (b.m23a()) {
                b.a(0, -1, true);
            }
        }
        if (this.E == 3 && this.f257k && f207c != null) {
            f207c.b(i);
            if (f207c.m23a()) {
                f207c.a(0, -1, true);
            }
            f208d.b(i);
            if (f208d.m23a()) {
                f208d.a(0, -1, true);
            }
        }
        if (this.E == 3 && this.X != -1) {
            return this.f256a[this.X].m73a(i);
        }
        if (!this.f222g) {
            return null;
        }
        this.f222g = false;
        return this.f223a;
    }

    public final void a(Graphics graphics, int i, int i2) {
        if (this.f218c) {
            i += 4;
            i2 += 4;
        }
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = i;
        int i8 = i2;
        int i9 = this.H;
        int i10 = this.I;
        if (this.f225h) {
            if (this.f219d) {
                i3 = this.z;
                i4 = this.A;
                i5 = this.B;
            } else {
                i3 = i;
                i4 = i2;
                i5 = this.H;
            }
            i6 = this.P;
        }
        if (this.f225h && this.f220e) {
            graphics.setClip(i3, i4, i5, i6);
            a(graphics, i3, i4, i5, i6, this.v, this.w, 1);
            i8 += i6;
            i10 -= i6;
        }
        if (this.f216a) {
            if (!this.f217b) {
                graphics.setColor(16777215);
                graphics.fillRect(i7, i8, i9, i10);
            } else if (aj == 8 || aj == 17) {
                j.a(graphics);
                j.a(graphics, 0, 0, t.m98e(), t.a());
            } else {
                if (DCWall3D.f19a == null || aj == 26) {
                    a(graphics, 0, 0, t.m98e(), t.a(), 1981423, 65873, 1);
                } else {
                    j.a(graphics, DCWall3D.f19a);
                }
                if (r.f262a != null) {
                    m.a(graphics);
                    j.b(graphics);
                    m.b(graphics);
                }
            }
        }
        if (this.f218c) {
            if (!this.f219d && this.f220e) {
                i8 -= i6;
                i10 += i6;
            }
            int i11 = i7 - 4;
            int i12 = i8 - 4;
            int i13 = i9 + 8;
            int i14 = i10 + 8;
            int clipX2 = graphics.getClipX();
            int clipY2 = graphics.getClipY();
            int clipWidth2 = graphics.getClipWidth();
            int clipHeight2 = graphics.getClipHeight();
            graphics.setClip(i11, i12, i13, i14);
            graphics.setColor(0);
            graphics.drawRect(i11, i12, i13 - 1, i14 - 1);
            graphics.drawRect(i11 + 1, i12 + 1, i13 - 3, i14 - 3);
            graphics.drawRect(i11 + 3, i12 + 3, i13 - 7, i14 - 7);
            graphics.setColor(this.u);
            graphics.drawRect(i11 + 2, i12 + 2, i13 - 5, i14 - 5);
            graphics.setClip(clipX2, clipY2, clipWidth2, clipHeight2);
        }
        int i15 = i2;
        if (this.f225h) {
            int i16 = i3 + this.O;
            graphics.setClip(i16, i4, i5, this.P);
            int i17 = i4;
            a(graphics, -2, i16, i17, this.R, i6);
            if (this.f227a != null && this.f227a.length > 0) {
                graphics.setClip(0, 0, t.m98e(), t.a());
                f fVar = this.f212d;
                String str = this.f227a[0];
                int i18 = this.Q;
                int iA = fVar.a(str);
                if (iA <= i18) {
                    fVar.a(graphics, str, i16, i17, 20);
                } else {
                    int clipX3 = graphics.getClipX();
                    int clipY3 = graphics.getClipY();
                    int clipWidth3 = graphics.getClipWidth();
                    int clipHeight3 = graphics.getClipHeight();
                    graphics.setClip(i16, clipY3, i18, clipHeight3);
                    int i19 = iA - i18;
                    int i20 = (i19 * 5000) / i18;
                    int i21 = i20;
                    if (i20 < 600) {
                        i21 = 2000;
                    } else if ((i19 << 1) < i18) {
                        i21 = (5000 * ((i18 / 4) + i19)) / i18;
                    } else if (i21 < 5000) {
                        i21 = 5000;
                    }
                    if (i21 > 12000) {
                        i21 = 12000;
                    }
                    int i22 = f.f74a % i21;
                    int i23 = 0;
                    if (i22 > (i21 >> 2) && i22 <= (i21 >> 1)) {
                        i23 = (i19 * (i22 - (i21 >> 2))) / (i21 >> 2);
                    } else if (i22 > (i21 >> 1) && i22 <= (i21 * 3) / 4) {
                        i23 = i19;
                    } else if (i22 > (i21 * 3) / 4) {
                        i23 = i19 - ((i19 * (i22 - ((i21 * 3) / 4))) / (i21 >> 2));
                    }
                    fVar.a(graphics, str, i16 - i23, i17, 20);
                    graphics.setClip(clipX3, clipY3, clipWidth3, clipHeight3);
                }
            }
            i15 += this.P;
        }
        graphics.setClip(i, i15, this.H, this.I - this.P);
        if (this.f < this.V && this.E != 3) {
            if ((this.W & 2) != 0) {
                i2 += (this.V - this.f) >> 1;
            } else if ((this.W & 8) != 0) {
                i2 += this.V - this.f;
            }
        }
        if (this.E == 0) {
            for (int i24 = 0; i24 < this.J; i24++) {
                if (this.f231d != null) {
                    int i25 = i + this.S + this.f231d[i24 << 2];
                    int i26 = this.f231d[(i24 << 2) + 1] - this.d;
                    int i27 = this.f231d[(i24 << 2) + 2];
                    int i28 = this.f231d[(i24 << 2) + 3];
                    if (i26 >= 0 && i26 + i28 <= this.V) {
                        int i29 = i26 + i2 + this.T;
                        graphics.setClip(i + this.S, i2 + this.T, this.U, this.V);
                        a(graphics, i24, i25, i29, i27, i28, i);
                    }
                }
            }
        } else if (this.E == 1) {
            for (int i30 = 0; i30 < this.J; i30++) {
                if (this.f231d != null) {
                    int i31 = this.S + this.f231d[i30 << 2];
                    int i32 = (this.T + this.f231d[(i30 << 2) + 1]) - this.d;
                    int i33 = this.f231d[(i30 << 2) + 2];
                    int i34 = this.f231d[(i30 << 2) + 3];
                    if (i32 + i34 >= this.T && i32 < this.T + this.V) {
                        graphics.setClip(i + this.S, i2 + this.T, this.U, this.V);
                        a(graphics, i30, i + i31, i2 + i32, i33, i34, i);
                    }
                }
            }
        } else if (this.E == 3) {
            int i35 = i;
            int i36 = i2;
            if (this.X != -1) {
                n nVar = this.f256a[this.X];
                graphics.setClip(i35 + this.S, i36 + this.T, this.U, this.V);
                nVar.a(graphics, i35 + this.S, i36 + this.T);
            }
            if (this.f257k) {
                graphics.setClip((i35 + this.S) - k, i36 + this.T, this.U + k + l, this.V);
                int i37 = ((i35 + this.S) - k) + (k >> 1);
                int i38 = ((((i35 + this.S) + this.U) + l) - k) + (k >> 1);
                int i39 = i36 + this.T + (this.V >> 1);
                f207c.a(graphics, (i37 - (f207c.g() >> 1)) + f207c.e(), (i39 - (f207c.h() >> 1)) + f207c.f());
                f208d.a(graphics, (i38 - (f208d.g() >> 1)) + f208d.e(), (i39 - (f208d.h() >> 1)) + f208d.f());
            }
        }
        boolean z = this.d > 0;
        boolean z2 = this.d + this.V < this.f;
        if (z) {
            int i40 = i + this.g;
            int i41 = i2 + this.h;
            int iG = i40 - (a.g() >> 1);
            int iH = i41 - (a.h() >> 1);
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            a.a(graphics, iG + a.e(), iH + a.f());
        }
        if (z2) {
            int i42 = i + this.g;
            int i43 = i2 + this.i;
            int iG2 = i42 - (b.g() >> 1);
            int iH2 = i43 - (b.h() >> 1);
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            b.a(graphics, iG2 + b.e(), iH2 + b.f());
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    public final void a(Graphics graphics) {
        a(graphics, this.F, this.G);
    }

    public final void c(int i, int i2) {
        if (this.E == 3) {
            if (this.f257k && i2 == 0) {
                int iM86a = t.m86a(i);
                if (iM86a == 52) {
                    int iM76d = m76d(this.X);
                    if (iM76d != -1) {
                        b(iM76d);
                        e();
                    }
                    f207c.a(1, 1, true);
                } else if (iM86a == 54) {
                    int iC = c(this.X);
                    if (iC != -1) {
                        b(iC);
                        e();
                    }
                    f208d.a(1, 1, true);
                }
            }
            if (this.X != -1) {
                this.f256a[this.X].c(i, i2);
                return;
            }
        }
        int i3 = -1;
        if (!this.f222g) {
            switch (i2) {
                case 0:
                    int iM86a2 = t.m86a(i);
                    if (!this.f251i) {
                        if (this.E == 0 && this.X != -1 && ((this.f230c[this.X] == 4 || this.f230c[this.X] == 5) && this.f239h[this.X] != 1)) {
                            int i4 = this.f243l[this.X];
                            if (iM86a2 == 52) {
                                int[] iArr = this.f243l;
                                int i5 = this.X;
                                iArr[i5] = iArr[i5] - 1;
                            } else if (iM86a2 == 54) {
                                int[] iArr2 = this.f243l;
                                int i6 = this.X;
                                iArr2[i6] = iArr2[i6] + 1;
                            }
                            if (this.f230c[this.X] == 4) {
                                this.f243l[this.X] = Math.max(Math.min(this.f243l[this.X], this.f244m[this.X] - 1), 0);
                            } else {
                                this.f243l[this.X] = (this.f243l[this.X] + this.f244m[this.X]) % this.f244m[this.X];
                            }
                            if (this.f243l[this.X] != i4) {
                                i3 = 1;
                            }
                        }
                        if (iM86a2 != 53) {
                            if (iM86a2 != 50) {
                                if (iM86a2 == 56) {
                                    if (this.E == 0) {
                                        int iC2 = c(this.X);
                                        if (iC2 != -1) {
                                            b(iC2);
                                            if (this.d + this.V < this.f) {
                                                b.a(1, 1, true);
                                            }
                                            e();
                                        }
                                    } else if (this.E == 1) {
                                        this.c = 1;
                                        this.j = 0;
                                    }
                                }
                            } else if (this.E == 0) {
                                int iM76d2 = m76d(this.X);
                                if (iM76d2 != -1) {
                                    b(iM76d2);
                                    if (this.d > 0) {
                                        a.a(1, 1, true);
                                    }
                                    e();
                                }
                            } else if (this.E == 1) {
                                this.c = 2;
                                this.j = 0;
                            }
                        } else if (this.E != 0) {
                            i3 = 0;
                            i = this.f224b[0];
                        } else if (this.X != -1 && this.f239h[this.X] != 1) {
                            if (this.f230c[this.X] == 0) {
                                i3 = 1;
                            } else if (this.f230c[this.X] == 5 || this.f230c[this.X] == 4) {
                                this.f243l[this.X] = (this.f243l[this.X] + 1) % this.f244m[this.X];
                                i3 = 1;
                            } else if (this.f230c[this.X] == 3) {
                                a(!this.f251i);
                                if (!this.f251i) {
                                    i3 = 1;
                                }
                            }
                        }
                    } else if (iM86a2 == 52) {
                        this.ae = Math.max(this.ae - 1, 0);
                    } else if (iM86a2 == 54) {
                        this.ae = Math.min(this.ae + 1, this.f249a[this.X].length());
                    } else if (iM86a2 == 53) {
                        a(!this.f251i);
                    } else if (i == -8 && this.ae > 0) {
                        StringBuffer stringBuffer = this.f249a[this.X];
                        int i7 = this.ae - 1;
                        this.ae = i7;
                        stringBuffer.deleteCharAt(i7);
                    }
                    break;
                case 1:
                    if (this.j != 1) {
                        this.j = 2;
                    } else {
                        this.c = 0;
                    }
                    break;
                case 3:
                    if (this.E != 0) {
                        i3 = 0;
                    } else {
                        i3 = i == this.f224b[1] ? 0 : -1;
                        if (this.X != -1 && this.f239h[this.X] != 1) {
                            if (i == 3 && this.f230c[this.X] == 3) {
                                a(true);
                            } else if (i == 1 && this.f251i) {
                                a(false);
                            } else if (i == 8 && this.f251i && this.ae > 0) {
                                StringBuffer stringBuffer2 = this.f249a[this.X];
                                int i8 = this.ae - 1;
                                this.ae = i8;
                                stringBuffer2.deleteCharAt(i8);
                            }
                            if (i == this.f224b[0]) {
                                if (this.f230c[this.X] == 4 || this.f230c[this.X] == 5) {
                                    this.f243l[this.X] = (this.f243l[this.X] + 1) % this.f244m[this.X];
                                }
                                i3 = 1;
                            }
                        }
                    }
                    break;
            }
        }
        if (i3 != -1) {
            this.f222g = true;
            this.f223a[0] = i3;
            if (i3 == 1) {
                this.f223a[1] = this.f240i[this.X];
            } else {
                this.f223a[1] = i;
            }
        }
    }

    public final void b(int i) {
        this.X = c(i - 1);
        if (this.X == -1) {
            return;
        }
        this.ac = 0;
        this.aa = 0;
        this.ab = 0;
        if (this.f > this.V) {
            int i2 = this.d / this.Z;
            int i3 = this.f / this.Z;
            int i4 = this.f231d[(i << 2) + 1] / this.Z;
            this.d = Math.min(Math.max(Math.min(Math.max(i2, i4 - (this.Y >> 1)), i4 - ((this.Y - 1) >> 1)), 0), i3 - this.Y) * this.Z;
        } else {
            this.d = 0;
        }
        this.ab = 0;
        this.aa = 0;
    }

    public final int d() {
        return this.X;
    }

    public final void d(int i, int i2) {
        this.f243l[i] = i2;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final int m74b(int i) {
        return this.f243l[i];
    }

    public static void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i5 == i6) {
            graphics.setColor(i5);
            graphics.fillRect(i, i2, i3, i4);
            return;
        }
        int i8 = (i5 >> 16) & 255;
        int i9 = (i5 >> 8) & 255;
        int i10 = i5 & 255;
        int i11 = ((i6 >> 16) & 255) - i8;
        int i12 = ((i6 >> 8) & 255) - i9;
        int i13 = (i6 & 255) - i10;
        int i14 = 0;
        while (true) {
            int i15 = i14;
            if (i15 >= i4) {
                return;
            }
            if (i15 + i7 > i4) {
                i7 = i4 - i15;
            }
            graphics.setColor(i8 + ((i15 * i11) / (i4 - 1)), i9 + ((i15 * i12) / (i4 - 1)), i10 + ((i15 * i13) / (i4 - 1)));
            graphics.fillRect(i, i2 + i15, i3, i7);
            i14 = i15 + i7;
        }
    }

    public static String[] a(String str, f fVar, int i) {
        f215g = fVar;
        return a(str, i, 0, 0, true);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public final void m75c() {
        this.ah = 1;
    }

    private void b(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 <= 0) {
            this.n = 0;
            return;
        }
        int i5 = i4 + 25;
        this.p -= i;
        while (this.p < 0) {
            if (this.o == 1) {
                this.n++;
            } else {
                this.n--;
            }
            if (this.n > i5) {
                this.n = i5;
                this.o = 0;
            } else if (this.n < -25) {
                this.n = -25;
                this.o = 1;
            }
            this.p += 40;
        }
    }

    private void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        f fVar;
        int i8;
        int i9;
        int i10;
        String str;
        Image image;
        int i11 = this.f233f[i];
        int i12 = this.f234g[i];
        if (this.E == 1 && i11 > 0) {
            i12 = 0;
        }
        if (this.f230c[i] == 3) {
            i5 -= this.ad;
        }
        if (this.f230c[i] == 6) {
            int[] iArr = this.f254a[i];
            int[] iArr2 = this.f255b[i];
            int length = iArr.length;
            int length2 = iArr2.length;
            graphics.setColor(0);
            int i13 = i3;
            int i14 = 0;
            for (int i15 = 0; i15 < length2; i15++) {
                int i16 = iArr2[i15] - 2;
                int i17 = i2 + 4;
                int i18 = 0;
                while (i18 < length) {
                    int i19 = iArr[i18] - 12;
                    char[] cArr = null;
                    char c = cArr[i18];
                    int i20 = i17 + 6;
                    int i21 = i13;
                    if (this.f253a[i] != null && this.f253a[i][i14] != null) {
                        String[] strArr = this.f253a[i][i14];
                        int length3 = strArr.length * this.r;
                        if ((c & 2) != 0) {
                            i21 += (i16 - length3) >> 1;
                        } else if ((c & '\b') != 0) {
                            i21 += i16 - length3;
                        }
                        int i22 = i21;
                        for (String str2 : strArr) {
                            int i23 = i20;
                            if ((c & 5) != 0) {
                                int iA = this.f213e.a(str2);
                                if ((c & 1) != 0) {
                                    i23 += (i19 - iA) >> 1;
                                } else if ((c & 4) != 0) {
                                    i23 += i19 - iA;
                                }
                            }
                            this.f213e.a(graphics, str2, i23, i22, 20);
                            i22 += this.r;
                        }
                    }
                    i17 += iArr[i18];
                    i18++;
                    i14++;
                }
                i13 += iArr2[i15];
            }
            return;
        }
        int i24 = ai % 3500;
        boolean z = i24 >= 1500 || i24 % 500 < 300;
        if (this.ah != i || z) {
            a(graphics, i, i2, i3, this.f234g[i], i5);
            int i25 = i2 + i12;
            int i26 = i5;
            String[] strArr2 = i == -2 ? this.f227a : this.f238a[i];
            if (strArr2 != null) {
                int iMin = i25 + 4;
                if (i == -2) {
                    i7 = this.q;
                    fVar = this.f212d;
                } else if (this.E == 0) {
                    i7 = this.s;
                    fVar = i == this.X ? this.f259i : this.f214f;
                } else {
                    i7 = this.r;
                    fVar = this.f213e;
                }
                if (i == -2 || this.E != 1) {
                    int i27 = i3 + ((i26 - i7) >> 1);
                    int iA2 = fVar.a(strArr2[0]);
                    boolean z2 = iA2 <= i11 - 8;
                    int clipX = graphics.getClipX();
                    int clipY = graphics.getClipY();
                    int clipWidth = graphics.getClipWidth();
                    int clipHeight = graphics.getClipHeight();
                    if (!z2) {
                        int i28 = clipX + clipWidth;
                        int i29 = clipY + clipHeight;
                        int iMax = Math.max(clipX, iMin);
                        int iMax2 = Math.max(clipY, i3);
                        graphics.setClip(iMax, iMax2, Math.max(iMax, Math.min(i28, iMin + (i11 - 8))) - iMax, Math.max(iMax2, Math.min(i29, i3 + i26)) - iMax2);
                        if (i == -2) {
                            if (this.L >= 0) {
                                iMin -= Math.min(iA2 - (this.Q - 8), this.L);
                            }
                        } else if (i == this.X && this.aa >= 0) {
                            iMin -= Math.min(iA2 - (this.f233f[i] - 8), this.aa);
                        }
                    }
                    if (strArr2[0].equals(t.m87a(332))) {
                        fVar.a(graphics, strArr2[0], t.m98e() >> 1, i27, 17);
                    } else {
                        fVar.a(graphics, strArr2[0], iMin, i27, 20);
                    }
                    graphics.setClip(clipX, clipY, clipWidth, clipHeight);
                } else {
                    int i30 = i7 + 2;
                    int clipY2 = graphics.getClipY();
                    int clipHeight2 = graphics.getClipHeight();
                    int i31 = i3 < clipY2 ? (clipY2 - i3) / i30 : 0;
                    int i32 = (clipY2 + clipHeight2) - (i3 + (i31 * i30));
                    int iMin2 = Math.min(i31 + (i32 == 0 ? 0 : ((i32 - 1) / i30) + 1), this.f238a[i].length);
                    int i33 = 0;
                    int i34 = 0;
                    if (this.E == 1) {
                        i33 = this.f234g[i];
                        i34 = this.f232e[i];
                    }
                    for (int i35 = i31; i35 < iMin2; i35++) {
                        String str3 = this.f238a[i][i35];
                        int iA3 = iMin;
                        int i36 = i3 + (i30 * i35);
                        if (i35 < i34) {
                            iA3 += i33;
                        } else if ((this.W & 1) != 0) {
                            iA3 += ((i11 - fVar.a(str3)) >> 1) - 4;
                        }
                        fVar.a(graphics, str3, iA3, i36, 20);
                    }
                }
            }
        }
        if (this.f230c[i] == 5) {
            int i37 = i5;
            int i38 = this.f241j[i];
            int i39 = this.f242k[i];
            int i40 = ((i2 + i4) - i38) - i39;
            int i41 = this.f243l[i];
            if (this.f246b[i] != null && (image = this.f246b[i][i41]) != null) {
                graphics.drawImage(image, i40 + (i39 >> 1), i3 + (i37 >> 1), 3);
            }
            if (this.f247b[i] != null) {
                b bVar = this.f247b[i];
                if (i41 != bVar.b()) {
                    bVar.a(i41, -1, true);
                }
                bVar.a(graphics, i40 + bVar.e() + ((i39 - bVar.g()) >> 1), i3 + bVar.f() + ((i37 - bVar.h()) >> 1));
            }
            if (this.f245b[i] != null && (str = this.f245b[i][i41]) != null) {
                this.f214f.a(graphics, str, i40 + i39 + 4, i3 + ((i37 - this.s) >> 1), 20);
            }
        }
        if (this.f230c[i] == 4) {
            int i42 = i5;
            int i43 = ((i2 + i4) - this.f241j[i]) - this.f242k[i];
            int i44 = this.f244m[i] - 1;
            int i45 = this.f243l[i];
            for (int i46 = 1; i46 <= i44; i46++) {
                int i47 = i43 + ((i46 - 1) * 7) + 4;
                int i48 = i3 + ((i42 + this.s) >> 1);
                int i49 = (this.s * i46) / i44;
                if (i45 >= i46) {
                    graphics.setColor(16777215);
                } else {
                    graphics.setColor(0);
                }
                graphics.fillRect(i47, i48 - i49, 6, i49);
            }
        }
        if (this.f230c[i] == 3) {
            int i50 = i6 + this.S;
            int i51 = i3 + i5;
            int i52 = this.U - 8;
            int i53 = this.ad - 4;
            int i54 = i50 + 4;
            if (this.f251i && this.X == i) {
                i8 = 10748416;
                i9 = 16747008;
                i10 = 16777215;
            } else {
                i8 = 16777215;
                i9 = 3355443;
                i10 = 11711154;
            }
            graphics.setColor(i8);
            graphics.drawRect(i54, i51, i52 - 1, i53 - 1);
            graphics.setColor(i9);
            graphics.drawRect(i54 + 1, i51 + 1, i52 - 3, i53 - 3);
            graphics.setColor(i10);
            graphics.fillRect(i54 + 2, i51 + 2, i52 - 4, i53 - 4);
            boolean z3 = this.ag % 1000 > 500;
            int iA4 = i54 + 4;
            int i55 = i51 + 3;
            int iA5 = (i52 - 8) - this.f213e.a();
            int length4 = this.f249a[i].length();
            if (length4 == 0) {
                this.f250a[0] = 0;
            } else {
                this.f249a[i].getChars(0, length4, this.f250a, 0);
            }
            int i56 = 0;
            int iA6 = this.f248n[i] == 3 ? 0 + this.f213e.a('+') : 0;
            for (int i57 = 0; i57 < length4; i57++) {
                iA6 += this.f213e.a(this.f250a[i57]);
                if (i57 == this.ae - 1) {
                    i56 = iA6;
                }
            }
            if (this.f251i && i == this.X) {
                iA6 += 2;
            }
            boolean z4 = iA6 <= iA5;
            int clipX2 = graphics.getClipX();
            int clipY3 = graphics.getClipY();
            int clipWidth2 = graphics.getClipWidth();
            int clipHeight3 = graphics.getClipHeight();
            if (!z4) {
                int i58 = clipX2 + clipWidth2;
                int iMax3 = Math.max(clipX2, iA4);
                graphics.setClip(iMax3, clipY3, Math.max(iMax3, Math.min(i58, iA4 + iA5)) - iMax3, clipHeight3);
                if (this.f251i && i == this.X) {
                    iA4 -= Math.max(Math.min((i56 + (iA5 >> 1)) - iA5, iA6 - iA5), 0);
                }
            }
            if (this.f248n[i] == 3) {
                this.f213e.a(graphics, '+', iA4, i55, 20);
                iA4 += this.f213e.a('+');
            }
            int iA7 = iA4;
            for (int i59 = 0; i59 < length4; i59++) {
                this.f213e.a(graphics, this.f250a[i59], iA7, i55, 20);
                iA7 += this.f213e.a(this.f250a[i59]);
            }
            if (this.f251i && i == this.X && z3 && this.af <= 0 && this.ae < this.f249a[i].capacity()) {
                for (int i60 = 0; i60 < this.ae; i60++) {
                    iA4 += this.f213e.a(this.f250a[i60]);
                }
                graphics.fillRect(iA4, i55, 2, i53 - 6);
            }
            graphics.setClip(clipX2, clipY3, clipWidth2, clipHeight3);
        }
    }

    private void a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6;
        boolean z = i == -2;
        boolean z2 = z;
        if (z || this.E == 1) {
            i6 = 0;
        } else {
            if (this.f239h[i] == 0) {
                i6 = this.X == i ? 1 : 0;
            } else {
                i6 = 2;
            }
            if ((this.f230c[i] == 5 || this.f230c[i] == 4) && this.f243l[i] == 0) {
                i6 = 3;
            }
        }
        Image image = null;
        if (z2) {
            image = this.f228a;
        } else if (this.f235a[i] != null) {
            image = this.f235a[i][i6];
        }
        if (image != null) {
            int width = i2 + ((i4 - image.getWidth()) >> 1);
            int height = i3;
            if (z2 || this.E == 0) {
                height += (i5 - image.getHeight()) >> 1;
            } else if (this.f238a[i] != null && this.f238a[i].length > this.f232e[i]) {
                int i7 = (this.f232e[i] * (this.r + 2)) - 2;
                if (image.getHeight() > i7) {
                    i7 += 2;
                }
                height += (i7 - image.getHeight()) >> 1;
            }
            graphics.drawImage(image, width, height, 20);
        }
        b bVar = z2 ? this.f229e : this.f236a[i];
        if (bVar != null) {
            if (i6 != bVar.b()) {
                bVar.a(i6, -1, true);
            }
            int iG = i2 + ((i4 - bVar.g()) >> 1);
            int iH = i3;
            if (z2 || this.E == 0) {
                iH += (i5 - bVar.h()) >> 1;
            } else if (this.f238a[i] != null && this.f238a[i].length > this.f232e[i]) {
                int i8 = (this.f232e[i] * (this.r + 2)) - 2;
                if (bVar.h() > i8) {
                    i8 += 2;
                }
                iH += (i8 - bVar.h()) >> 1;
            }
            bVar.a(graphics, iG + bVar.e(), iH + bVar.f());
        }
    }

    private void e() {
        t.m85b();
        this.m = 0;
        if (this.E != 3) {
            int i = -1;
            if (this.f230c != null && this.X < this.f230c.length && this.X != -1) {
                i = this.f230c[this.X];
            }
            if (i == 3) {
                t.a(3, 0);
            } else {
                int i2 = 0;
                if (this.f239h != null && this.X < this.f239h.length && this.X != -1) {
                    i2 = this.f239h[this.X];
                }
                if (this.f224b[0] != -1 && i2 != 1) {
                    t.a(this.f224b[0], 0);
                }
            }
            if (this.f224b[1] != -1) {
                t.a(this.f224b[1], 0);
            }
            if (this.E == 1) {
                this.d = 0;
            }
            this.ac = 0;
        } else if (this.X != -1) {
            this.f256a[this.X].m72b();
        }
        if (this.E == 3 && this.f257k) {
            f207c.a(0, -1, true);
            f208d.a(0, -1, true);
        }
    }

    private int c(int i) {
        if (this.J == 0) {
            return -1;
        }
        int i2 = this.J;
        do {
            i = (i + 1) % this.J;
            int i3 = i2;
            i2 = i3 - 1;
            if (i3 <= 0) {
                return -1;
            }
        } while (!m77a(i));
        return i;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    private int m76d(int i) {
        if (this.J == 0) {
            return -1;
        }
        if (i == -1) {
            i = 0;
        }
        int i2 = this.J;
        do {
            i = ((i + this.J) - 1) % this.J;
            int i3 = i2;
            i2 = i3 - 1;
            if (i3 <= 0) {
                return -1;
            }
        } while (!m77a(i));
        return i;
    }

    private void a(boolean z) {
        if (!z) {
            this.f251i = false;
            b(this.X);
            e();
        } else {
            this.f251i = true;
            t.m85b();
            t.a(1, 0);
            t.a(8, 0);
            this.ae = this.f249a[this.X].length();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m77a(int i) {
        return this.f230c[i] == 0 || this.f230c[i] == 3 || this.f230c[i] == 4 || this.f230c[i] == 5 || this.f230c[i] == 7;
    }

    private static String[] a(String str, int i, int i2, int i3, boolean z) {
        char[] cArr = {'.', '/'};
        int iA = i - f215g.a();
        int i4 = 0;
        int i5 = 0;
        int length = str.length();
        Vector vector = new Vector();
        int i6 = 0;
        if (str.length() == 0) {
            vector.addElement(str);
        }
        while (i5 < length) {
            int iIndexOf = str.indexOf("\\n", i4);
            i5 = iIndexOf;
            if (iIndexOf == -1) {
                i5 = length;
            }
            boolean z2 = false;
            while (!z2) {
                int i7 = i4;
                int iA2 = 0;
                int i8 = -1;
                int i9 = iA;
                if (i6 < i3) {
                    i9 -= i2;
                }
                while (iA2 <= i9 && i7 < i5) {
                    char cCharAt = str.charAt(i7);
                    iA2 += f215g.a(cCharAt);
                    i7++;
                    if (cCharAt == ' ') {
                        i8 = i7;
                    }
                }
                if (i7 == i5 && iA2 <= i9) {
                    z2 = true;
                } else if (i8 != -1) {
                    i7 = i8 - 1;
                } else {
                    i7--;
                    boolean z3 = false;
                    for (int i10 = i7; i10 > i4 && !z3; i10--) {
                        char cCharAt2 = str.charAt(i10);
                        int length2 = cArr.length;
                        while (true) {
                            length2--;
                            if (length2 < 0 || z3) {
                                break;
                            }
                            if (cCharAt2 == cArr[length2]) {
                                i7 = i10 + 1;
                                z3 = true;
                            }
                        }
                    }
                }
                vector.addElement(str.substring(i4, i7));
                i6++;
                if (z2 && i7 < length) {
                    i7 += 2;
                } else if (i8 != -1) {
                    i7++;
                }
                i4 = i7;
            }
        }
        String[] strArr = new String[vector.size()];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = (String) vector.elementAt(i11);
        }
        f215g = null;
        return strArr;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public final void m78d() {
        if (this.f230c != null) {
            for (int i = 0; i < this.J; i++) {
                d(i);
            }
        }
        if (this.f229e != null) {
            this.f229e.m24a();
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static void m79c(int i) {
        aj = i;
    }
}
