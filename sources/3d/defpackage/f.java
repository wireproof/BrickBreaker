package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-3d.jar:f.class */
public final class f {
    static n a;
    static n b;
    static int k;
    static int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    static n c;
    static n d;
    static int u;
    static int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static l f29a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    static l f30b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    static l f31c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private l f32d;
    private int A;
    private l e;
    private int B;
    private l f;
    private int C;
    private static l g;
    int D;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private boolean f33g;
    private boolean h;
    private boolean i;
    private boolean j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private boolean f34k;
    private int E;
    private int F;
    private int G;
    private int H;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private boolean f35l;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    int S;
    int T;
    private int U;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private boolean f36m;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    boolean f39n;
    private int V;
    private int W;
    private int X;
    private int Y;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String f40b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[] f41a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Image f42a;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    n f43e;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private int[] f44n;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private int[] f45o;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    private int[] f46p;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    private int[] f47q;

    /* JADX INFO: renamed from: r, reason: collision with other field name */
    private int[] f48r;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Image[][] f49a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    n[] f50a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    String[] f51b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String[][] f52b;
    int ai;

    /* JADX INFO: renamed from: s, reason: collision with other field name */
    int[] f53s;

    /* JADX INFO: renamed from: t, reason: collision with other field name */
    private int[] f54t;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;

    /* JADX INFO: renamed from: u, reason: collision with other field name */
    private int[] f55u;

    /* JADX INFO: renamed from: v, reason: collision with other field name */
    private int[] f56v;

    /* JADX INFO: renamed from: w, reason: collision with other field name */
    int[] f57w;

    /* JADX INFO: renamed from: x, reason: collision with other field name */
    int[] f58x;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private String[][] f59c;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Image[][] f60b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    n[] f61b;
    private int ao;

    /* JADX INFO: renamed from: y, reason: collision with other field name */
    private int[] f62y;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private StringBuffer[] f63a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private char[] f64a;
    private int ap;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private boolean f65o;
    private int aq;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    private boolean f66p;
    private int ar;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[][][] f67a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[][] f68b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int[][] f69c;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private f[] f70b;

    /* JADX INFO: renamed from: q, reason: collision with other field name */
    private boolean f71q;
    private static int at;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private final int[] f37l = new int[2];

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    final int[] f38m = new int[2];
    int as = -1;

    public final void a(int i, int i2, int i3) {
        this.P = i;
        this.ai = -1;
        this.n = 0;
        this.m = 0;
        this.ah = i3;
        this.o = 0;
        this.V = 1;
        this.f65o = false;
        this.f44n = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            this.f44n[i4] = -1;
        }
        this.f51b = new String[i2];
        this.f52b = new String[i2][];
        this.f54t = new int[i2];
        this.f53s = new int[i2];
        this.f49a = new Image[i2][];
        this.f50a = new n[i2];
        this.U = i2;
        this.X = 1;
        this.f39n = false;
        this.am = 1;
        if (i == 3) {
            this.f70b = new f[i2];
        }
        this.f38m[0] = -1;
        this.f38m[1] = -1;
        a(f29a, f30b, f31c);
        a(8);
        this.M = p.i();
        this.N = p.m();
        this.O = p.l();
    }

    public final void a(int i) {
        switch (i) {
            case 1:
                this.f33g = true;
                this.h = false;
                this.E = 16777215;
                this.j = false;
                this.f34k = false;
                this.H = 9486550;
                this.i = false;
                this.f35l = true;
                break;
            case 2:
                this.f33g = false;
                this.j = false;
                this.H = 65520;
                this.i = false;
                this.f35l = true;
                break;
            case 3:
                this.f33g = true;
                this.E = 47851;
                this.j = false;
                this.f34k = true;
                this.F = 11579584;
                this.G = 1052704;
                this.H = 65520;
                this.i = false;
                this.f35l = true;
                break;
            case 4:
                this.f33g = true;
                this.E = 47851;
                this.j = true;
                this.f34k = true;
                this.F = 11579584;
                this.G = 1052704;
                this.H = 65520;
                this.i = true;
                this.f35l = false;
                break;
            case 5:
                this.f33g = true;
                this.E = 47851;
                this.j = false;
                this.f34k = true;
                this.H = 65520;
                this.i = true;
                this.f35l = false;
                break;
            case 6:
                this.f33g = false;
                this.j = false;
                this.f34k = true;
                this.F = 11579584;
                this.G = 1052704;
                this.H = 65520;
                this.i = false;
                this.f35l = false;
                break;
            case 7:
                this.f33g = false;
                this.j = false;
                this.f34k = true;
                this.F = 11579584;
                this.G = 1052704;
                this.H = 65520;
                this.i = true;
                this.f35l = false;
                break;
            case 8:
                this.f33g = true;
                this.h = true;
                this.E = 47851;
                this.j = false;
                this.H = 65520;
                this.i = false;
                this.f35l = true;
                break;
        }
        if (this.i) {
            this.I = 1;
            this.J = 1;
        } else {
            this.I = 6;
            this.J = 6;
        }
        this.D = i;
    }

    public final void a(String str, Image image) {
        this.f39n = (str == null && image == null) ? false : true;
        this.f40b = str;
        this.f42a = image;
        this.V = 1;
    }

    public final void a(int i, int i2, String str, Image[] imageArr, int i3) {
        if (this.f44n[i] != -1) {
            b(i);
        }
        this.f44n[i] = i2;
        this.f54t[i] = i3;
        this.f49a[i] = imageArr;
        this.f51b[i] = str;
    }

    public final void a(int i, int i2, String str, String str2, Image[] imageArr, int i3, int i4) {
        a(i, 3, str2, imageArr, i4);
        if (this.f62y == null) {
            this.f62y = new int[this.U];
            this.f63a = new StringBuffer[this.U];
        }
        int iMax = Math.max(2, i3);
        if (this.f64a == null || iMax > this.f64a.length) {
            this.f64a = new char[iMax];
        }
        this.f63a[i] = new StringBuffer(iMax);
        switch (i2) {
            case 0:
                this.f62y[i] = 0;
                break;
            case 1:
                this.f62y[i] = 1;
                break;
            case 2:
                this.f62y[i] = 3;
                break;
            case 3:
                this.f62y[i] = 2;
                break;
        }
        if (str != null) {
            this.f63a[i].append(str);
        }
    }

    public final void a(int i, String str, Image[] imageArr, String[] strArr, Image[] imageArr2, int i2) {
        a(i, 5, str, imageArr, i2);
        if (this.f57w == null) {
            this.f57w = new int[this.U];
            this.f58x = new int[this.U];
        }
        this.f57w[i] = 0;
        this.f58x[i] = strArr != null ? strArr.length : 0;
        if (this.f59c == null) {
            this.f59c = new String[this.U][];
        }
        this.f59c[i] = strArr;
        this.f58x[i] = Math.max(this.f58x[i], imageArr2 != null ? imageArr2.length : 0);
        if (this.f60b == null) {
            this.f60b = new Image[this.U][];
        }
        this.f60b[i] = imageArr2;
        if (this.f61b == null) {
            this.f61b = new n[this.U];
        }
    }

    public final void a(int i, String str, Image[] imageArr, int i2, int i3, int i4) {
        a(i, 4, str, imageArr, i4);
        if (this.f57w == null) {
            this.f57w = new int[this.U];
            this.f58x = new int[this.U];
        }
        this.f57w[i] = i2;
        this.f58x[i] = i3 + 1;
    }

    private void b(int i) {
        if (this.f44n[i] != -1 && this.ai == i) {
            this.ai = m16c(i);
            if (this.ai < i) {
                this.ai = d(i);
            }
        }
        if (this.f49a != null) {
            this.f49a[i] = null;
        }
        if (this.f60b != null) {
            this.f60b[i] = null;
        }
        if (this.f50a != null && this.f50a[i] != null) {
            this.f50a[i].H();
            this.f50a[i] = null;
        }
        if (this.f61b != null && this.f61b[i] != null) {
            this.f61b[i].H();
            this.f61b[i] = null;
        }
        this.f51b[i] = null;
        this.f52b[i] = null;
        this.f44n[i] = -1;
        if (this.f59c != null) {
            this.f59c[i] = null;
        }
        if (this.f68b != null) {
            this.f68b[i] = null;
            this.f69c[i] = null;
            this.f67a[i] = null;
        }
        if (this.f70b == null || this.f70b[i] == null) {
            return;
        }
        this.f70b[i].i();
        this.f70b[i] = null;
    }

    public final void a(l lVar, l lVar2, l lVar3) {
        if (lVar != null) {
            this.f32d = lVar;
            this.A = lVar.getHeight();
        }
        if (lVar2 != null) {
            this.e = lVar2;
            this.B = lVar2.getHeight();
        }
        if (lVar3 != null) {
            this.f = lVar3;
            this.C = lVar3.getHeight();
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final int m13b(int i) {
        int iMax;
        a(i, Integer.MAX_VALUE, true);
        int iMax2 = this.j ? 0 : Math.max(0, this.ab + this.ac);
        if (this.P == 3) {
            if (this.i) {
                i -= 8;
            }
            int i2 = (this.f71q ? u + v : 0) + (this.I << 1);
            int iMax3 = 0;
            for (int i3 = 0; i3 < this.U; i3++) {
                f fVar = this.f70b[i3];
                if (fVar != null) {
                    iMax3 = Math.max(iMax3, fVar.m13b(i - i2));
                }
            }
            iMax = Math.max(iMax2, iMax3 + i2);
        } else {
            int iMax4 = 0;
            for (int i4 = 0; i4 < this.U; i4++) {
                iMax4 = Math.max(iMax4, this.f45o[(i4 << 2) + 2]);
            }
            iMax = Math.max(iMax2, this.S - (this.af - iMax4));
        }
        if (this.i) {
            iMax += 8;
        }
        return iMax;
    }

    public final int b(int i, int i2) {
        int i3;
        a(i, i2, true);
        if (this.P == 3) {
            if (this.i) {
                i -= 8;
                i2 -= 8;
            }
            int i4 = (this.f71q ? u + v : 0) + (this.I << 1);
            int i5 = this.aa;
            int iMax = 0;
            for (int i6 = 0; i6 < this.U; i6++) {
                f fVar = this.f70b[i6];
                if (fVar != null) {
                    iMax = Math.max(iMax, fVar.b(i - i4, i2 - i5));
                }
            }
            i3 = iMax + i5;
        } else {
            int iMin = Math.min(this.ag, this.p);
            if (this.P == 1) {
                int i7 = this.B + 2;
                iMin = (iMin / i7) * i7;
            } else if (this.P == 0) {
                int i8 = this.ak;
                iMin = (iMin / i8) * i8;
            }
            i3 = this.T - (this.ag - iMin);
        }
        if (this.i) {
            i3 += 8;
        }
        return i3;
    }

    final void a(int i, int i2, boolean z) {
        int i3;
        if (this.i) {
            i -= 8;
            i2 -= 8;
        }
        this.S = i;
        this.T = i2;
        if (this.P == 3) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.f70b.length; i5++) {
                i4 += this.f70b[i5] != null ? 1 : 0;
            }
            this.f71q = i4 > 1;
        }
        this.ad = this.I;
        this.af = i - (this.I << 1);
        if (this.P == 3 && this.f71q) {
            this.af -= u + v;
            this.ad += u;
        }
        if (this.f39n) {
            int width = 0;
            int height = 0;
            if (this.f42a != null) {
                width = this.f42a.getWidth() + 8;
                height = this.f42a.getHeight();
            }
            if (this.f43e != null) {
                width = this.f43e.k[2] + 8;
                height = this.f43e.k[3];
            }
            this.ac = width;
            this.aa = Math.max(this.A, height) + 8;
            int i6 = width;
            int i7 = this.j ? this.M : this.S;
            if (this.f40b != null) {
                this.f41a = new String[]{this.f40b};
            }
            int iMax = 0;
            boolean z2 = false;
            if (this.f41a != null) {
                for (int i8 = 0; i8 < this.f41a.length; i8++) {
                    iMax = Math.max(iMax, this.f32d.stringWidth(this.f41a[i8]));
                }
                z2 = true;
                if (!z) {
                    this.f40b = null;
                }
            }
            if (z2) {
                this.ab = Math.min(iMax, (i7 - i6) - 8) + 8;
                i6 += this.ab;
            } else {
                this.ab = 0;
            }
            this.Z = 0;
            if ((this.V & 1) != 0) {
                this.Z = (i7 - i6) >> 1;
            }
        } else {
            this.aa = 0;
        }
        if (this.f39n) {
            i3 = this.aa;
            if (this.j) {
                i3 += this.J;
            }
        } else {
            i3 = this.J;
        }
        this.ae = i3;
        int i9 = (this.L + this.N) - this.O;
        int i10 = this.R + this.T;
        int iMin = Math.min((i10 - this.ae) - this.J, i9 - this.ae);
        int iMin2 = (Math.min((i10 - this.J) - l, i9) - this.ae) - k;
        int iMax2 = 0;
        int iMax3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        if (this.P == 0) {
            for (int i11 = 0; i11 < this.U; i11++) {
                Image[] imageArr = this.f49a[i11];
                if (imageArr != null) {
                    for (int i12 = 0; i12 < imageArr.length; i12++) {
                        if (imageArr[i12] != null) {
                            iMax2 = Math.max(iMax2, imageArr[i12].getWidth() + 8);
                            iMax3 = Math.max(iMax3, imageArr[i12].getHeight() + 8);
                        }
                    }
                }
                n nVar = this.f50a[i11];
                if (nVar != null) {
                    for (int i13 = 0; i13 < nVar.d.length; i13++) {
                        nVar.b(i13, -1, true);
                        iMax2 = Math.max(iMax2, nVar.k[2] + 8);
                        iMax3 = Math.max(iMax3, nVar.k[3] + 8);
                    }
                }
                z3 |= this.f44n[i11] == 3;
                z4 |= this.f44n[i11] == 4 || this.f44n[i11] == 5;
                if (this.f44n[i11] == 5) {
                    Image[] imageArr2 = this.f60b[i11];
                    if (imageArr2 != null) {
                        for (int i14 = 0; i14 < imageArr2.length; i14++) {
                            if (imageArr2[i14] != null) {
                                iMax3 = Math.max(iMax3, imageArr2[i14].getHeight() + 8);
                            }
                        }
                    }
                    n nVar2 = this.f61b[i11];
                    if (nVar2 != null) {
                        for (int i15 = 0; i15 < nVar2.d.length; i15++) {
                            nVar2.b(i15, -1, true);
                            iMax3 = Math.max(iMax3, nVar2.k[3] + 8);
                        }
                    }
                }
            }
        } else if (this.P == 1) {
            for (int i16 = 0; i16 < this.U; i16++) {
                z5 |= this.f44n[i16] == 6;
            }
        }
        this.f45o = new int[this.U << 2];
        this.f48r = new int[this.U];
        this.f47q = new int[this.U];
        if (this.P == 1) {
            this.f46p = new int[this.U];
        }
        if (z4) {
            this.f56v = new int[this.U];
            this.f55u = new int[this.U];
        }
        if (z5) {
            this.f68b = new int[this.U][];
            this.f69c = new int[this.U][];
            this.f67a = new String[this.U][][];
        }
        if (this.P == 0) {
            this.ak = Math.max(iMax3, this.C + 8);
            if (z3) {
                this.ao = this.B + 4 + 5;
                this.ak += this.ao;
            }
        }
        if (this.P != 3) {
            int i17 = iMax2;
            int i18 = iMax3;
            for (int i19 = 0; i19 < this.U; i19++) {
                if (this.f44n[i19] == 6) {
                    int i20 = i19;
                    int i21 = this.af - 8;
                    int i22 = 0;
                    Object[] objArr = null;
                    int length = objArr.length;
                    int i23 = 0 / length;
                    int[] iArr = new int[length];
                    int[] iArr2 = new int[i23];
                    this.f68b[i20] = iArr;
                    this.f69c[i20] = iArr2;
                    this.f67a[i20] = new String[0][];
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
                        int i31 = ((1 / (this.B + 2)) + 1) * (this.B + 2);
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
                                    if (this.f67a[i20] != null && this.f67a[i20][i32] != null) {
                                        for (String str : this.f67a[i20][i32]) {
                                            iMax5 = Math.max(iMax5, this.e.stringWidth(str));
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
                    this.f45o[(i20 << 2) + 2] = i21 + 8;
                    this.f45o[(i20 << 2) + 3] = i22;
                } else {
                    int width2 = 0;
                    int height2 = 0;
                    if (this.P == 0) {
                        width2 = i17;
                        height2 = i18;
                    } else {
                        if (this.f49a[i19] != null) {
                            width2 = this.f49a[i19][0].getWidth() + 8;
                            height2 = this.f49a[i19][0].getHeight();
                        }
                        if (this.f50a[i19] != null) {
                            width2 = this.f50a[i19].k[2] + 8;
                            height2 = this.f50a[i19].k[3];
                        }
                    }
                    this.f48r[i19] = width2;
                    int i40 = 0;
                    if (this.f44n[i19] == 5) {
                        int iMax6 = 0;
                        Image[] imageArr3 = this.f60b[i19];
                        if (imageArr3 != null) {
                            for (int i41 = 0; i41 < imageArr3.length; i41++) {
                                if (imageArr3[i41] != null) {
                                    iMax6 = Math.max(iMax6, imageArr3[i41].getWidth() + 8);
                                }
                            }
                        }
                        n nVar3 = this.f61b[i19];
                        if (nVar3 != null) {
                            for (int i42 = 0; i42 < nVar3.d.length; i42++) {
                                nVar3.b(i42, -1, true);
                                iMax6 = Math.max(iMax6, nVar3.k[2] + 8);
                            }
                        }
                        this.f56v[i19] = iMax6;
                        int iMax7 = 0;
                        if (this.f59c[i19] != null) {
                            for (int i43 = 0; i43 < this.f59c[i19].length; i43++) {
                                String str2 = this.f59c[i19][i43];
                                if (str2 != null) {
                                    iMax7 = Math.max(iMax7, this.f.stringWidth(str2));
                                }
                            }
                            iMax7 += 8;
                        }
                        this.f55u[i19] = iMax7;
                        i40 = 0 + iMax6 + iMax7;
                    }
                    if (this.f44n[i19] == 4) {
                        int i44 = 6 + ((this.f58x[i19] - 2) * 7) + 8;
                        this.f56v[i19] = i44;
                        this.f55u[i19] = 0;
                        i40 += i44;
                    }
                    int width3 = 0;
                    int height3 = 0;
                    if (this.P == 1) {
                        if (this.f49a[i19] != null) {
                            width3 = this.f49a[i19][0].getWidth() + 8;
                            height3 = ((this.f49a[i19][0].getHeight() - 1) / (this.B + 2)) + 1;
                        }
                        if (this.f50a[i19] != null) {
                            width3 = this.f50a[i19].k[2] + 8;
                            height3 = ((this.f50a[i19].k[3] - 1) / (this.B + 2)) + 1;
                        }
                        this.f46p[i19] = height3;
                    }
                    if (this.P == 0) {
                        i40 += width2;
                    }
                    String[] strArrA = this.f52b[i19];
                    String str3 = this.f51b[i19];
                    if (str3 != null) {
                        if (this.P == 0) {
                            strArrA = new String[]{str3};
                        } else {
                            int i45 = (this.af - 8) - i40;
                            g = this.P == 0 ? this.f : this.e;
                            strArrA = a(str3, i45, width3, height3, true);
                        }
                    }
                    if (strArrA != null) {
                        int iMax8 = 0;
                        for (int i46 = 0; i46 < strArrA.length; i46++) {
                            String str4 = strArrA[i46];
                            int iStringWidth = this.P == 0 ? this.f.stringWidth(str4) : this.e.stringWidth(str4);
                            if (i46 < height3) {
                                iStringWidth += width3;
                            }
                            iMax8 = Math.max(iMax8, iStringWidth);
                        }
                        this.f47q[i19] = Math.min(iMax8, (this.af - i40) - 8) + 8;
                        i40 += this.f47q[i19];
                        height2 = Math.max(height2, this.P == 0 ? this.C + 8 : (this.B * strArrA.length) + (2 * strArrA.length));
                        if (!z) {
                            this.f51b[i19] = null;
                        }
                        this.f52b[i19] = strArrA;
                    } else if (this.f49a[i19] == null && this.f50a[i19] == null) {
                        height2 = 0;
                    }
                    if (this.P == 1 && strArrA == null) {
                        i40 += width2;
                    }
                    if (!z && (this.f44n[i19] == 5 || this.f44n[i19] == 4)) {
                        i40 = this.af;
                    }
                    if (this.P == 0 && height2 > 0) {
                        height2 = this.ak;
                    }
                    this.f45o[(i19 << 2) + 2] = i40;
                    this.f45o[(i19 << 2) + 3] = height2;
                }
            }
            for (int i47 = 0; i47 < this.U; i47++) {
                if ((this.ah & 1) != 0) {
                    this.f45o[i47 << 2] = (this.af - this.f45o[(i47 << 2) + 2]) >> 1;
                }
            }
            boolean z6 = false;
            do {
                if (z6) {
                    this.ae = i3 + k;
                    this.ag = iMin2;
                    this.q = this.S >> 1;
                    this.r = (this.ae - k) + (k >> 1);
                    this.s = this.ae + this.ag + (l >> 1);
                } else {
                    this.ag = iMin;
                }
                if (this.P == 1) {
                    this.ae += 4;
                    this.ag -= 8;
                    if (!z) {
                        int i48 = this.B + 2;
                        this.ae += (this.ag % i48) >> 1;
                        this.ag = (this.ag / i48) * i48;
                    }
                }
                int i49 = 0;
                for (int i50 = 0; i50 < this.U; i50++) {
                    this.f45o[(i50 << 2) + 1] = i49;
                    i49 += this.f45o[(i50 << 2) + 3];
                    if (this.P == 1 && i49 != 0) {
                        i49 = (((i49 - 1) / (this.B + 2)) + 1) * (this.B + 2);
                    }
                }
                if (this.U > 0) {
                    this.p = this.f45o[((this.U - 1) << 2) + 1] + this.f45o[((this.U - 1) << 2) + 3];
                }
                if (z6) {
                    z6 = false;
                } else if (this.p > this.ag) {
                    z6 = true;
                } else if (!z && this.f35l) {
                    if (this.P == 0 && iMin2 / this.ak >= 3) {
                        z6 = true;
                    } else if (this.P == 1 && iMin2 / (this.B + 2) >= 3) {
                        z6 = true;
                    }
                }
            } while (z6);
        } else if (!z) {
            this.ae = this.aa;
            this.ag = this.T - this.aa;
            int i51 = 0;
            int i52 = this.ae;
            int i53 = this.S;
            int i54 = this.ag;
            if (this.i) {
                i51 = 0 + 4;
                i52 += 4;
            }
            for (int i55 = 0; i55 < this.U; i55++) {
                f fVar = this.f70b[i55];
                if (fVar != null) {
                    int i56 = this.O;
                    fVar.K = i51;
                    fVar.L = i52;
                    fVar.M = i53;
                    fVar.N = i54;
                    fVar.O = i56;
                    fVar.a(this.af, i54, false);
                }
            }
        }
        if (z) {
            return;
        }
        if (this.P == 0) {
            this.aj = this.ag / this.ak;
        }
        if (this.ai == -1) {
            this.ai = 0;
        }
        this.ai = m16c(this.ai);
        if (this.ai != -1) {
            this.ai = d(this.ai);
        }
        this.n = 0;
        if (this.ai != -1) {
            c(this.ai);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        a(i3, i4, false);
        this.Q = i;
        this.R = i2;
    }

    public final void f() {
        a(this.S, this.T, false);
    }

    public final void g() {
        h();
        this.m = 0;
        this.Y = 0;
        at = 0;
        a.b(0, -1, true);
        b.b(0, -1, true);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int[] m14a(int i) {
        this.w = Math.min(this.w + i, 400);
        if (this.f33g) {
            h.p(i);
        }
        if (this.f66p && this.aq > 0) {
            this.aq -= i;
        }
        this.ar += i;
        this.f66p = true;
        if (this.m != 0 && this.p > this.ag) {
            this.o += i;
            int i2 = (this.o * (this.B + 2)) / 300;
            this.o -= (i2 * 300) / (this.B + 2);
            if (this.m == 2) {
                this.n -= i2;
            } else if (this.m == 1) {
                this.n += i2;
            }
            if (this.t == 2) {
                this.m = 0;
            } else {
                this.t = 1;
            }
            this.n = Math.max(this.n, 0);
            this.n = Math.min(this.n, this.p - this.ag);
        }
        if (this.f39n) {
            if (this.f43e != null) {
                this.f43e.k(i);
            }
            String[] strArr = this.f41a != null ? this.f41a : null;
            if (strArr != null) {
                this.z = this.Y;
                this.x = this.W;
                this.y = this.X;
                b(i, this.f32d.stringWidth(strArr[0]), this.ab - 8);
                this.W = this.x;
                this.X = this.y;
                this.Y = this.z;
            }
        }
        for (int i3 = 0; i3 < this.U; i3++) {
            int i4 = i3;
            if (this.f50a[i4] != null && this.f50a[i4] != null) {
                this.f50a[i4].k(i);
            }
            if (this.f61b != null && this.f61b[i4] != null) {
                this.f61b[i4].k(i);
            }
            if (i4 == this.ai && this.f52b[i4] != null) {
                this.z = this.an;
                String[] strArr2 = this.f52b[i4];
                if (strArr2 != null) {
                    this.x = this.al;
                    this.y = this.am;
                    b(i, this.f.stringWidth(strArr2[0]), this.f47q[i4] - 8);
                    this.al = this.x;
                    this.am = this.y;
                }
                this.an = this.z;
            }
            if (i4 == this.as) {
                at += i;
            }
        }
        a.k(i);
        b.k(i);
        if (this.P == 1) {
            int i5 = this.m == 2 ? 2 : 0;
            int i6 = i5;
            if (i5 != a.h()) {
                a.b(i6, -1, true);
            }
            int i7 = this.m == 1 ? 2 : 0;
            int i8 = i7;
            if (i7 != b.h()) {
                b.b(i8, -1, true);
            }
        } else {
            if (a.c()) {
                a.b(0, -1, true);
            }
            if (b.c()) {
                b.b(0, -1, true);
            }
        }
        if (this.P == 3 && this.f71q && c != null) {
            c.k(i);
            if (c.c()) {
                c.b(0, -1, true);
            }
            d.k(i);
            if (d.c()) {
                d.b(0, -1, true);
            }
        }
        if (this.P == 3 && this.ai != -1) {
            return this.f70b[this.ai].m14a(i);
        }
        if (!this.f36m) {
            return null;
        }
        this.f36m = false;
        return this.f37l;
    }

    public final void a(Graphics graphics, int i, int i2) {
        if (this.i) {
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
        int i9 = this.S;
        int i10 = this.T;
        if (this.f39n) {
            if (this.j) {
                i3 = this.K;
                i4 = this.L;
                i5 = this.M;
            } else {
                i3 = i;
                i4 = i2;
                i5 = this.S;
            }
            i6 = this.aa;
        }
        if (this.f39n && this.f34k) {
            graphics.setClip(i3, i4, i5, i6);
            a(graphics, i3, i4, i5, i6, this.F, this.G, 1);
            i8 += i6;
            i10 -= i6;
        }
        if (this.f33g) {
            graphics.setClip(i7, i8, i9, i10);
            if (this.h) {
                e.a(graphics);
                h.B();
                e.b(graphics);
            } else {
                graphics.setColor(16777215);
                graphics.fillRect(i7, i8, i9, i10);
            }
        }
        if (this.i) {
            if (!this.j && this.f34k) {
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
            graphics.setColor(this.E);
            graphics.drawRect(i11 + 2, i12 + 2, i13 - 5, i14 - 5);
            graphics.setClip(clipX2, clipY2, clipWidth2, clipHeight2);
        }
        int i15 = i2;
        if (this.f39n) {
            int i16 = i3 + this.Z;
            graphics.setClip(i16, i4, i5, this.aa);
            int i17 = i4;
            int i18 = i6;
            int i19 = this.ab;
            int i20 = this.ac;
            a(graphics, -2, i16, i17, i20, i18);
            b(graphics, -2, i16 + i20, i17, i19, i18);
            i15 += this.aa;
        }
        graphics.setClip(i, i15, this.S, this.T - this.aa);
        if ((this.ah & 2) != 0 && this.p < this.ag && this.P != 3) {
            i2 += (this.ag - this.p) >> 1;
        }
        if (this.P == 0) {
            for (int i21 = 0; i21 < this.U; i21++) {
                if (this.f45o != null) {
                    int i22 = i + this.ad + this.f45o[i21 << 2];
                    int i23 = this.f45o[(i21 << 2) + 1] - this.n;
                    int i24 = this.f45o[(i21 << 2) + 2];
                    int i25 = this.f45o[(i21 << 2) + 3];
                    if (i23 >= 0 && i23 + i25 <= this.ag) {
                        int i26 = i23 + i2 + this.ae;
                        graphics.setClip(i + this.ad, i2 + this.ae, this.af, this.ag);
                        a(graphics, i21, i22, i26, i24, i25, i);
                    }
                }
            }
        } else if (this.P == 1) {
            for (int i27 = 0; i27 < this.U; i27++) {
                if (this.f45o != null) {
                    int i28 = this.ad + this.f45o[i27 << 2];
                    int i29 = (this.ae + this.f45o[(i27 << 2) + 1]) - this.n;
                    int i30 = this.f45o[(i27 << 2) + 2];
                    int i31 = this.f45o[(i27 << 2) + 3];
                    if (i29 + i31 >= this.ae && i29 < this.ae + this.ag) {
                        graphics.setClip(i + this.ad, i2 + this.ae, this.af, this.ag);
                        a(graphics, i27, i + i28, i2 + i29, i30, i31, i);
                    }
                }
            }
        } else if (this.P == 3) {
            int i32 = i;
            int i33 = i2;
            if (this.ai != -1) {
                f fVar = this.f70b[this.ai];
                graphics.setClip(i32 + this.ad, i33 + this.ae, this.af, this.ag);
                fVar.a(graphics, i32 + this.ad, i33 + this.ae);
            }
            if (this.f71q) {
                graphics.setClip((i32 + this.ad) - u, i33 + this.ae, this.af + u + v, this.ag);
                int i34 = ((i32 + this.ad) - u) + (u >> 1);
                int i35 = ((((i32 + this.ad) + this.af) + v) - u) + (u >> 1);
                int i36 = i33 + this.ae + (this.ag >> 1);
                c.c(graphics, (i34 - (c.k[2] >> 1)) + c.k[0], (i36 - (c.k[3] >> 1)) + c.k[1]);
                d.c(graphics, (i35 - (d.k[2] >> 1)) + d.k[0], (i36 - (d.k[3] >> 1)) + d.k[1]);
            }
        }
        boolean z = this.n > 0;
        boolean z2 = this.n + this.ag < this.p;
        if (z) {
            int i37 = i + this.q;
            int i38 = i2 + this.r;
            int i39 = i37 - (a.k[2] >> 1);
            int i40 = i38 - (a.k[3] >> 1);
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            a.c(graphics, i39 + a.k[0], i40 + a.k[1]);
        }
        if (z2) {
            int i41 = i + this.q;
            int i42 = i2 + this.s;
            int i43 = i41 - (b.k[2] >> 1);
            int i44 = i42 - (b.k[3] >> 1);
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            b.c(graphics, i43 + b.k[0], i44 + b.k[1]);
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    public final void a(Graphics graphics) {
        a(graphics, this.Q, this.R);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void m15b(int i, int i2) {
        if (this.P == 3) {
            if (this.f71q && i2 == 0) {
                int i3 = p.i(i);
                if (i3 == 52) {
                    int iD = d(this.ai);
                    if (iD != -1) {
                        c(iD);
                        h();
                    }
                    c.b(1, 1, true);
                } else if (i3 == 54) {
                    int iM16c = m16c(this.ai);
                    if (iM16c != -1) {
                        c(iM16c);
                        h();
                    }
                    d.b(1, 1, true);
                }
            }
            if (this.ai != -1) {
                this.f70b[this.ai].m15b(i, i2);
                return;
            }
        }
        int i4 = -1;
        if (!this.f36m) {
            switch (i2) {
                case 0:
                    int i5 = p.i(i);
                    if (!this.f65o) {
                        if (this.P == 0 && this.ai != -1 && ((this.f44n[this.ai] == 4 || this.f44n[this.ai] == 5) && this.f53s[this.ai] != 1)) {
                            int i6 = this.f57w[this.ai];
                            if (i5 == 52) {
                                int[] iArr = this.f57w;
                                int i7 = this.ai;
                                iArr[i7] = iArr[i7] - 1;
                            } else if (i5 == 54) {
                                int[] iArr2 = this.f57w;
                                int i8 = this.ai;
                                iArr2[i8] = iArr2[i8] + 1;
                            }
                            if (this.f44n[this.ai] == 4) {
                                this.f57w[this.ai] = Math.max(Math.min(this.f57w[this.ai], this.f58x[this.ai] - 1), 0);
                            } else {
                                this.f57w[this.ai] = (this.f57w[this.ai] + this.f58x[this.ai]) % this.f58x[this.ai];
                            }
                            if (this.f57w[this.ai] != i6) {
                                i4 = 1;
                            }
                        }
                        if (i5 != 53) {
                            if (i5 != 50) {
                                if (i5 == 56) {
                                    if (this.P == 0) {
                                        int iM16c2 = m16c(this.ai);
                                        if (iM16c2 != -1) {
                                            c(iM16c2);
                                            if (this.n + this.ag < this.p) {
                                                b.b(1, 1, true);
                                            }
                                            h();
                                        }
                                    } else if (this.P == 1) {
                                        this.m = 1;
                                        this.t = 0;
                                    }
                                }
                            } else if (this.P == 0) {
                                int iD2 = d(this.ai);
                                if (iD2 != -1) {
                                    c(iD2);
                                    if (this.n > 0) {
                                        a.b(1, 1, true);
                                    }
                                    h();
                                }
                            } else if (this.P == 1) {
                                this.m = 2;
                                this.t = 0;
                            }
                        } else if (this.P != 0) {
                            i4 = 0;
                            i = this.f38m[0];
                        } else if (this.ai != -1 && this.f53s[this.ai] != 1) {
                            if (this.f44n[this.ai] == 0) {
                                i4 = 1;
                            } else if (this.f44n[this.ai] == 5 || this.f44n[this.ai] == 4) {
                                this.f57w[this.ai] = (this.f57w[this.ai] + 1) % this.f58x[this.ai];
                                i4 = 1;
                            } else if (this.f44n[this.ai] == 3) {
                                a(!this.f65o);
                                if (!this.f65o) {
                                    i4 = 1;
                                }
                            }
                        }
                    } else if (i5 == 52) {
                        this.ap = Math.max(this.ap - 1, 0);
                    } else if (i5 == 54) {
                        this.ap = Math.min(this.ap + 1, this.f63a[this.ai].length());
                    } else if (i5 == 53) {
                        a(!this.f65o);
                    } else if (i == 8 && this.ap > 0) {
                        StringBuffer stringBuffer = this.f63a[this.ai];
                        int i9 = this.ap - 1;
                        this.ap = i9;
                        stringBuffer.deleteCharAt(i9);
                    }
                    break;
                case 1:
                    if (this.t != 1) {
                        this.t = 2;
                    } else {
                        this.m = 0;
                    }
                    break;
                case 3:
                    if (this.P != 0) {
                        i4 = 0;
                    } else {
                        i4 = i == this.f38m[1] ? 0 : -1;
                        if (this.ai != -1 && this.f53s[this.ai] != 1) {
                            if (i == 3 && this.f44n[this.ai] == 3) {
                                a(true);
                            } else if (i == 1 && this.f65o) {
                                a(false);
                            } else if (i == 8 && this.f65o && this.ap > 0) {
                                StringBuffer stringBuffer2 = this.f63a[this.ai];
                                int i10 = this.ap - 1;
                                this.ap = i10;
                                stringBuffer2.deleteCharAt(i10);
                            }
                            if (i == this.f38m[0]) {
                                if (this.f44n[this.ai] == 4 || this.f44n[this.ai] == 5) {
                                    this.f57w[this.ai] = (this.f57w[this.ai] + 1) % this.f58x[this.ai];
                                }
                                i4 = 1;
                            }
                        }
                    }
                    break;
            }
        }
        if (i4 != -1) {
            this.f36m = true;
            this.f37l[0] = i4;
            if (i4 == 1) {
                this.f37l[1] = this.f54t[this.ai];
            } else {
                this.f37l[1] = i;
            }
        }
    }

    public final void c(int i) {
        this.ai = m16c(i - 1);
        if (this.ai == -1) {
            return;
        }
        this.an = 0;
        this.al = 0;
        this.am = 0;
        if (this.p > this.ag) {
            int i2 = this.n / this.ak;
            int i3 = this.p / this.ak;
            int i4 = this.f45o[(i << 2) + 1] / this.ak;
            this.n = Math.min(Math.max(Math.min(Math.max(i2, i4 - (this.aj >> 1)), i4 - ((this.aj - 1) >> 1)), 0), i3 - this.aj) * this.ak;
        } else {
            this.n = 0;
        }
        this.am = 0;
        this.al = 0;
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

    public static String[] a(String str, l lVar, int i) {
        g = lVar;
        return a(str, i, 0, 0, true);
    }

    private void b(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 <= 0) {
            this.x = 0;
            return;
        }
        int i5 = i4 + 25;
        this.z -= i;
        while (this.z < 0) {
            if (this.y == 1) {
                this.x++;
            } else {
                this.x--;
            }
            if (this.x > i5) {
                this.x = i5;
                this.y = 0;
            } else if (this.x < -25) {
                this.x = -25;
                this.y = 1;
            }
            this.z += 40;
        }
    }

    private void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        String str;
        Image image;
        int i10 = this.f47q[i];
        int i11 = this.f48r[i];
        if (this.P == 1 && i10 > 0) {
            i11 = 0;
        }
        if (i == this.ai && this.P == 0) {
            int i12 = this.H >> 16;
            int i13 = (this.H >> 8) & 255;
            int i14 = this.H & 255;
            int i15 = 400 - this.w;
            graphics.setColor((((((255 - i12) * i15) / 400) + i12) << 16) | (((((255 - i13) * i15) / 400) + i13) << 8) | ((((255 - i14) * i15) / 400) + i14));
            graphics.fillRect(i6 + this.ad + 1, i3, this.af - 2, 1);
            graphics.fillRect(i6 + this.ad, i3 + 1, this.af, i5 - 2);
            graphics.fillRect(i6 + this.ad + 1, (i3 + i5) - 1, this.af - 2, 1);
        }
        if (this.f44n[i] == 3) {
            i5 -= this.ao;
        }
        if (this.f44n[i] == 6) {
            int[] iArr = this.f68b[i];
            int[] iArr2 = this.f69c[i];
            int length = iArr.length;
            int length2 = iArr2.length;
            graphics.setColor(0);
            int i16 = i3;
            int i17 = 0;
            for (int i18 = 0; i18 < length2; i18++) {
                int i19 = iArr2[i18] - 2;
                int i20 = i2 + 4;
                int i21 = 0;
                while (i21 < length) {
                    int i22 = iArr[i21] - 12;
                    char[] cArr = null;
                    char c2 = cArr[i21];
                    int i23 = i20 + 6;
                    int i24 = i16;
                    if (this.f67a[i] != null && this.f67a[i][i17] != null) {
                        String[] strArr = this.f67a[i][i17];
                        int length3 = strArr.length * this.B;
                        if ((c2 & 2) != 0) {
                            i24 += (i19 - length3) >> 1;
                        } else if ((c2 & '\b') != 0) {
                            i24 += i19 - length3;
                        }
                        int i25 = i24;
                        for (String str2 : strArr) {
                            int i26 = i23;
                            if ((c2 & 5) != 0) {
                                int iStringWidth = this.e.stringWidth(str2);
                                if ((c2 & 1) != 0) {
                                    i26 += (i22 - iStringWidth) >> 1;
                                } else if ((c2 & 4) != 0) {
                                    i26 += i22 - iStringWidth;
                                }
                            }
                            this.e.a(graphics, str2, i26, i25, 20);
                            i25 += this.B;
                        }
                    }
                    i20 += iArr[i21];
                    i21++;
                    i17++;
                }
                i16 += iArr2[i18];
            }
            return;
        }
        int i27 = at % 3500;
        boolean z = i27 >= 1500 || i27 % 500 < 300;
        if (this.as != i || z) {
            a(graphics, i, i2, i3, this.f48r[i], i5);
            b(graphics, i, i2 + i11, i3, i10, i5);
        }
        if (this.f44n[i] == 5) {
            int i28 = i5;
            int i29 = this.f55u[i];
            int i30 = this.f56v[i];
            int i31 = ((i2 + i4) - i29) - i30;
            int i32 = this.f57w[i];
            if (this.f60b[i] != null && (image = this.f60b[i][i32]) != null) {
                graphics.drawImage(image, i31 + (i30 >> 1), i3 + (i28 >> 1), 3);
            }
            if (this.f61b[i] != null) {
                n nVar = this.f61b[i];
                if (i32 != nVar.h()) {
                    nVar.b(i32, -1, true);
                }
                nVar.c(graphics, i31 + nVar.k[0] + ((i30 - nVar.k[2]) >> 1), i3 + nVar.k[1] + ((i28 - nVar.k[3]) >> 1));
            }
            if (this.f59c[i] != null && (str = this.f59c[i][i32]) != null) {
                this.f.a(graphics, str, i31 + i30 + 4, i3 + ((i28 - this.C) >> 1), 20);
            }
        }
        if (this.f44n[i] == 4) {
            int i33 = i5;
            int i34 = ((i2 + i4) - this.f55u[i]) - this.f56v[i];
            int i35 = this.f58x[i] - 1;
            int i36 = this.f57w[i];
            for (int i37 = 1; i37 <= i35; i37++) {
                int i38 = i34 + ((i37 - 1) * 7) + 4;
                int i39 = i3 + ((i33 + this.C) >> 1);
                int i40 = (this.C * i37) / i35;
                if (i36 >= i37) {
                    graphics.setColor(16777215);
                } else {
                    graphics.setColor(0);
                }
                graphics.fillRect(i38, i39 - i40, 6, i40);
            }
        }
        if (this.f44n[i] == 3) {
            int i41 = i6 + this.ad;
            int i42 = i3 + i5;
            int i43 = this.af - 8;
            int i44 = this.ao - 4;
            int i45 = i41 + 4;
            if (this.f65o && this.ai == i) {
                i7 = 10748416;
                i8 = 16747008;
                i9 = 16777215;
            } else {
                i7 = 16777215;
                i8 = 3355443;
                i9 = 11711154;
            }
            graphics.setColor(i7);
            graphics.drawRect(i45, i42, i43 - 1, i44 - 1);
            graphics.setColor(i8);
            graphics.drawRect(i45 + 1, i42 + 1, i43 - 3, i44 - 3);
            graphics.setColor(i9);
            graphics.fillRect(i45 + 2, i42 + 2, i43 - 4, i44 - 4);
            boolean z2 = this.ar % 1000 > 500;
            int iCharWidth = i45 + 4;
            int i46 = i42 + 3;
            int iG = (i43 - 8) - this.e.g();
            int length4 = this.f63a[i].length();
            if (length4 == 0) {
                this.f64a[0] = 0;
            } else {
                this.f63a[i].getChars(0, length4, this.f64a, 0);
            }
            int i47 = 0;
            int iCharWidth2 = this.f62y[i] == 3 ? 0 + this.e.charWidth('+') : 0;
            for (int i48 = 0; i48 < length4; i48++) {
                iCharWidth2 += this.e.charWidth(this.f64a[i48]);
                if (i48 == this.ap - 1) {
                    i47 = iCharWidth2;
                }
            }
            if (this.f65o && i == this.ai) {
                iCharWidth2 += 2;
            }
            boolean z3 = iCharWidth2 <= iG;
            int clipX = graphics.getClipX();
            int clipY = graphics.getClipY();
            int clipWidth = graphics.getClipWidth();
            int clipHeight = graphics.getClipHeight();
            if (!z3) {
                int i49 = clipX + clipWidth;
                int iMax = Math.max(clipX, iCharWidth);
                graphics.setClip(iMax, clipY, Math.max(iMax, Math.min(i49, iCharWidth + iG)) - iMax, clipHeight);
                if (this.f65o && i == this.ai) {
                    iCharWidth -= Math.max(Math.min((i47 + (iG >> 1)) - iG, iCharWidth2 - iG), 0);
                }
            }
            if (this.f62y[i] == 3) {
                this.e.a(graphics, '+', iCharWidth, i46, 20);
                iCharWidth += this.e.charWidth('+');
            }
            int iCharWidth3 = iCharWidth;
            for (int i50 = 0; i50 < length4; i50++) {
                this.e.a(graphics, this.f64a[i50], iCharWidth3, i46, 20);
                iCharWidth3 += this.e.charWidth(this.f64a[i50]);
            }
            if (this.f65o && i == this.ai && z2 && this.aq <= 0 && this.ap < this.f63a[i].capacity()) {
                for (int i51 = 0; i51 < this.ap; i51++) {
                    iCharWidth += this.e.charWidth(this.f64a[i51]);
                }
                graphics.fillRect(iCharWidth, i46, 2, i44 - 6);
            }
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
        }
    }

    private void a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6;
        boolean z = i == -2;
        boolean z2 = z;
        if (z || this.P == 1) {
            i6 = 0;
        } else {
            if (this.f53s[i] == 0) {
                i6 = this.ai == i ? 1 : 0;
            } else {
                i6 = 2;
            }
            if ((this.f44n[i] == 5 || this.f44n[i] == 4) && this.f57w[i] == 0) {
                i6 = 3;
            }
        }
        Image image = null;
        if (z2) {
            image = this.f42a;
        } else if (this.f49a[i] != null) {
            image = this.f49a[i][i6];
        }
        if (image != null) {
            int width = i2 + ((i4 - image.getWidth()) >> 1);
            int height = i3;
            if (z2 || this.P == 0) {
                height += (i5 - image.getHeight()) >> 1;
            } else if (this.f52b[i] != null && this.f52b[i].length > this.f46p[i]) {
                int i7 = (this.f46p[i] * (this.B + 2)) - 2;
                if (image.getHeight() > i7) {
                    i7 += 2;
                }
                height += (i7 - image.getHeight()) >> 1;
            }
            graphics.drawImage(image, width, height, 20);
        }
        n nVar = z2 ? this.f43e : this.f50a[i];
        if (nVar != null) {
            if (i6 != nVar.h()) {
                nVar.b(i6, -1, true);
            }
            int i8 = i2 + ((i4 - nVar.k[2]) >> 1);
            int i9 = i3;
            if (z2 || this.P == 0) {
                i9 += (i5 - nVar.k[3]) >> 1;
            } else if (this.f52b[i] != null && this.f52b[i].length > this.f46p[i]) {
                int i10 = (this.f46p[i] * (this.B + 2)) - 2;
                if (nVar.k[3] > i10) {
                    i10 += 2;
                }
                i9 += (i10 - nVar.k[3]) >> 1;
            }
            nVar.c(graphics, i8 + nVar.k[0], i9 + nVar.k[1]);
        }
    }

    private void b(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6;
        l lVar;
        String[] strArr = i == -2 ? this.f41a : this.f52b[i];
        if (strArr != null) {
            int iMin = i2 + 4;
            if (i == -2) {
                i6 = this.A;
                lVar = this.f32d;
            } else if (this.P == 0) {
                i6 = this.C;
                lVar = this.f;
            } else {
                i6 = this.B;
                lVar = this.e;
            }
            if (i == -2 || this.P != 1) {
                int i7 = i3 + ((i5 - i6) >> 1);
                int iStringWidth = lVar.stringWidth(strArr[0]);
                boolean z = iStringWidth <= i4 - 8;
                int clipX = graphics.getClipX();
                int clipY = graphics.getClipY();
                int clipWidth = graphics.getClipWidth();
                int clipHeight = graphics.getClipHeight();
                if (!z) {
                    int i8 = clipX + clipWidth;
                    int i9 = clipY + clipHeight;
                    int iMax = Math.max(clipX, iMin);
                    int iMax2 = Math.max(clipY, i3);
                    graphics.setClip(iMax, iMax2, Math.max(iMax, Math.min(i8, iMin + (i4 - 8))) - iMax, Math.max(iMax2, Math.min(i9, i3 + i5)) - iMax2);
                    if (i == -2) {
                        if (this.W >= 0) {
                            iMin -= Math.min(iStringWidth - (this.ab - 8), this.W);
                        }
                    } else if (i == this.ai && this.al >= 0) {
                        iMin -= Math.min(iStringWidth - (this.f47q[i] - 8), this.al);
                    }
                }
                lVar.a(graphics, strArr[0], iMin, i7, 20);
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
                return;
            }
            int i10 = i6 + 2;
            int clipY2 = graphics.getClipY();
            int clipHeight2 = graphics.getClipHeight();
            int i11 = i3 < clipY2 ? (clipY2 - i3) / i10 : 0;
            int i12 = (clipY2 + clipHeight2) - (i3 + (i11 * i10));
            int iMin2 = Math.min(i11 + (i12 == 0 ? 0 : ((i12 - 1) / i10) + 1), this.f52b[i].length);
            int i13 = 0;
            int i14 = 0;
            if (this.P == 1) {
                i13 = this.f48r[i];
                i14 = this.f46p[i];
            }
            for (int i15 = i11; i15 < iMin2; i15++) {
                String str = this.f52b[i][i15];
                int iStringWidth2 = iMin;
                int i16 = i3 + (i10 * i15);
                if (i15 < i14) {
                    iStringWidth2 += i13;
                } else if ((this.ah & 1) != 0) {
                    iStringWidth2 += ((i4 - lVar.stringWidth(str)) >> 1) - 4;
                }
                lVar.a(graphics, str, iStringWidth2, i16, 20);
            }
        }
    }

    private void h() {
        p.L();
        this.w = 0;
        if (this.P != 3) {
            int i = -1;
            if (this.f44n != null && this.ai < this.f44n.length && this.ai != -1) {
                i = this.f44n[this.ai];
            }
            if (i == 3) {
                p.k(3, 0);
            } else {
                int i2 = 0;
                if (this.f53s != null && this.ai < this.f53s.length && this.ai != -1) {
                    i2 = this.f53s[this.ai];
                }
                if (this.f38m[0] != -1 && i2 != 1) {
                    p.k(this.f38m[0], 0);
                }
            }
            if (this.f38m[1] != -1) {
                p.k(this.f38m[1], 0);
            }
            if (this.P == 1) {
                this.n = 0;
            }
            this.an = 0;
        } else if (this.ai != -1) {
            this.f70b[this.ai].g();
        }
        if (this.P == 3 && this.f71q) {
            c.b(0, -1, true);
            d.b(0, -1, true);
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private int m16c(int i) {
        if (this.U == 0) {
            return -1;
        }
        int i2 = this.U;
        do {
            i = (i + 1) % this.U;
            int i3 = i2;
            i2 = i3 - 1;
            if (i3 <= 0) {
                return -1;
            }
        } while (!m17b(i));
        return i;
    }

    private int d(int i) {
        if (this.U == 0) {
            return -1;
        }
        if (i == -1) {
            i = 0;
        }
        int i2 = this.U;
        do {
            i = ((i + this.U) - 1) % this.U;
            int i3 = i2;
            i2 = i3 - 1;
            if (i3 <= 0) {
                return -1;
            }
        } while (!m17b(i));
        return i;
    }

    private void a(boolean z) {
        if (!z) {
            this.f65o = false;
            c(this.ai);
            h();
        } else {
            this.f65o = true;
            p.L();
            p.k(1, 0);
            p.k(8, 0);
            this.ap = this.f63a[this.ai].length();
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private boolean m17b(int i) {
        return this.f44n[i] == 0 || this.f44n[i] == 3 || this.f44n[i] == 4 || this.f44n[i] == 5 || this.f44n[i] == 7;
    }

    private static String[] a(String str, int i, int i2, int i3, boolean z) {
        char[] cArr = {'.', '/'};
        int iG = i - g.g();
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
                int iCharWidth = 0;
                int i8 = -1;
                int i9 = iG;
                if (i6 < i3) {
                    i9 -= i2;
                }
                while (iCharWidth <= i9 && i7 < i5) {
                    char cCharAt = str.charAt(i7);
                    iCharWidth += g.charWidth(cCharAt);
                    i7++;
                    if (cCharAt == ' ') {
                        i8 = i7;
                    }
                }
                if (i7 == i5 && iCharWidth <= i9) {
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
        g = null;
        return strArr;
    }

    public final void i() {
        if (this.f44n != null) {
            for (int i = 0; i < this.U; i++) {
                b(i);
            }
        }
        if (this.f43e != null) {
            this.f43e.H();
        }
    }
}
