package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:e.class */
public final class e {
    static ay a;
    static ay b;
    private static ay c;
    private static ay d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f64a;
    static int t;
    static int u;
    private int v;
    private int w;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    static ay e;
    static ay f;
    static int F;
    static int G;
    private int H;
    private int I;
    private int J;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static ax f65a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    static ax f66b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    static ax f67c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    static ax f68d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private ax f69e;
    private int K;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private ax f70f;
    private int L;
    private ax g;
    private ax h;
    private int M;
    private static ax i;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    ax[] f71a;
    int N;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f72b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private boolean f73c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private boolean f74d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private boolean f75e;
    private int O;
    private int P;
    private int Q;
    private int R;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private boolean f76f;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private int aa;
    private int ab;
    int ac;
    int ad;
    int ae;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private boolean f77g;

    /* JADX INFO: renamed from: u, reason: collision with other field name */
    private final int[] f78u = new int[2];

    /* JADX INFO: renamed from: v, reason: collision with other field name */
    final int[] f79v = new int[2];

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private boolean f80h;
    private int af;
    private int ag;
    private int ah;
    private int ai;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f81a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[] f82a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Image f83b;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private ay f84g;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;

    /* JADX INFO: renamed from: w, reason: collision with other field name */
    int[] f85w;
    private int[] x;
    private int[] y;

    /* JADX INFO: renamed from: z, reason: collision with other field name */
    private int[] f86z;

    /* JADX INFO: renamed from: A, reason: collision with other field name */
    private int[] f87A;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Image[][] f88a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    ay[] f89a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String[] f90b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[][] f91a;
    int as;

    /* JADX INFO: renamed from: B, reason: collision with other field name */
    private int[] f92B;

    /* JADX INFO: renamed from: C, reason: collision with other field name */
    private int[] f93C;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;

    /* JADX INFO: renamed from: D, reason: collision with other field name */
    private int[] f94D;

    /* JADX INFO: renamed from: E, reason: collision with other field name */
    private int[] f95E;

    /* JADX INFO: renamed from: F, reason: collision with other field name */
    int[] f96F;

    /* JADX INFO: renamed from: G, reason: collision with other field name */
    int[] f97G;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String[][] f98b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Image[][] f99b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    ay[] f100b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    e[] f101a;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private boolean f102i;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    int[][] f103e;
    private int ay;

    public final void b(int i2, int i3, int i4) {
        this.Z = i2;
        this.as = -1;
        this.w = 0;
        this.v = 0;
        this.ar = i4;
        this.z = 0;
        this.af = i4;
        this.f85w = new int[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            this.f85w[i5] = -1;
        }
        this.f90b = new String[i3];
        this.f91a = new String[i3][];
        this.f93C = new int[i3];
        this.f92B = new int[i3];
        this.f88a = new Image[i3][];
        this.f89a = new ay[i3];
        c = a.a();
        d = b.a();
        this.ae = i3;
        this.ah = 1;
        this.f80h = false;
        this.aw = 1;
        if (i2 == 3) {
            this.f101a = new e[i3];
        }
        this.f79v[0] = -1;
        this.f79v[1] = -1;
        a(f65a, f66b, f67c, f68d);
        e(2);
        this.W = ba.E();
        this.X = ba.H();
        this.Y = ba.G();
    }

    public final void e(int i2) {
        switch (i2) {
            case 1:
                this.f72b = true;
                this.O = 16777215;
                this.P = 16777215;
                this.f74d = false;
                this.f75e = false;
                this.f73c = false;
                this.f76f = true;
                break;
            case 2:
                this.f72b = false;
                this.f74d = true;
                this.f73c = false;
                this.f76f = true;
                break;
            case 3:
                this.f72b = true;
                this.O = 13434828;
                this.P = 10092441;
                this.f74d = false;
                this.f75e = true;
                this.Q = 13421823;
                this.R = 10066431;
                this.f73c = false;
                this.f76f = true;
                break;
            case 4:
                this.f72b = true;
                this.O = 13434828;
                this.P = 10092441;
                this.f74d = true;
                this.f75e = true;
                this.Q = 13421823;
                this.R = 10066431;
                this.f73c = true;
                this.f76f = false;
                break;
            case 5:
                this.f72b = true;
                this.O = 13434828;
                this.P = 10092441;
                this.f74d = false;
                this.f75e = true;
                this.f73c = true;
                this.f76f = false;
                break;
            case 6:
                this.f72b = false;
                this.f74d = false;
                this.f73c = false;
                this.f76f = false;
                break;
            case 7:
                this.f72b = false;
                this.f74d = false;
                this.f75e = true;
                this.Q = 13421823;
                this.R = 10066431;
                this.f73c = true;
                this.f76f = false;
                break;
        }
        if (this.f73c) {
            this.S = 1;
            this.T = 1;
        } else {
            this.S = 5;
            this.T = 5;
        }
        this.N = i2;
    }

    public final void a(String str, Image image, int i2) {
        this.f80h = (str == null && image == null) ? false : true;
        this.f81a = str;
        this.f83b = image;
        this.af = i2;
    }

    public final void a(String str, ay ayVar, int i2) {
        a(str, (Image) null, i2);
        this.f80h = this.f80h || ayVar != null;
        this.f84g = ayVar;
    }

    public final void a(int i2, int i3, String str, Image[] imageArr, int i4) {
        if (this.f85w[i2] != -1) {
            f(i2);
        }
        if (i3 == 0 || i3 == 5 || i3 == 4) {
            str = str.toUpperCase();
        }
        this.f85w[i2] = i3;
        this.f93C[i2] = i4;
        this.f88a[i2] = imageArr;
        this.f90b[i2] = str;
    }

    public final void a(int i2, int i3, String str, ay ayVar, int i4) {
        a(i2, i3, str, (Image[]) null, i4);
        this.f89a[i2] = ayVar;
    }

    public final void a(int i2, String str, Image[] imageArr, String[] strArr, Image[] imageArr2, int i3) {
        a(i2, 5, str, imageArr, i3);
        if (strArr != null) {
            for (int i4 = 0; i4 < strArr.length; i4++) {
                strArr[i4] = strArr[i4].toUpperCase();
            }
        }
        if (this.f96F == null) {
            this.f96F = new int[this.ae];
            this.f97G = new int[this.ae];
        }
        this.f96F[i2] = 0;
        this.f97G[i2] = strArr != null ? strArr.length : 0;
        if (this.f98b == null) {
            this.f98b = new String[this.ae][];
        }
        this.f98b[i2] = strArr;
        this.f97G[i2] = Math.max(this.f97G[i2], imageArr2 != null ? imageArr2.length : 0);
        if (this.f99b == null) {
            this.f99b = new Image[this.ae][];
        }
        this.f99b[i2] = imageArr2;
        if (this.f100b == null) {
            this.f100b = new ay[this.ae];
        }
    }

    public final void a(int i2, String str, Image[] imageArr, int i3, int i4, int i5) {
        a(i2, 4, str, imageArr, i5);
        if (this.f96F == null) {
            this.f96F = new int[this.ae];
            this.f97G = new int[this.ae];
        }
        this.f96F[i2] = i3;
        this.f97G[i2] = i4 + 1;
    }

    public final void f(int i2) {
        if (this.f85w[i2] != -1 && this.as == i2) {
            this.as = m34e(i2);
            if (this.as < i2) {
                this.as = m35f(i2);
            }
        }
        if (this.f88a != null) {
            this.f88a[i2] = null;
        }
        if (this.f99b != null) {
            this.f99b[i2] = null;
        }
        if (this.f89a != null && this.f89a[i2] != null) {
            this.f89a[i2].m();
            this.f89a[i2] = null;
        }
        if (this.f100b != null && this.f100b[i2] != null) {
            this.f100b[i2].m();
            this.f100b[i2] = null;
        }
        this.f90b[i2] = null;
        this.f91a[i2] = null;
        this.f85w[i2] = -1;
        if (this.f98b != null) {
            this.f98b[i2] = null;
        }
        if (this.f101a == null || this.f101a[i2] == null) {
            return;
        }
        this.f101a[i2].f();
        this.f101a[i2] = null;
    }

    public final void a(ax axVar, ax axVar2, ax axVar3, ax axVar4) {
        if (axVar != null) {
            this.f69e = axVar;
            this.K = axVar.getHeight();
        }
        if (axVar2 != null) {
            this.f70f = axVar2;
            this.L = axVar2.getHeight();
        }
        if (axVar3 != null) {
            this.g = axVar3;
            this.M = axVar3.getHeight();
        }
        if (axVar4 != null) {
            this.h = axVar4;
        }
    }

    public final int d(int i2) {
        int iMax;
        a(i2, Integer.MAX_VALUE, true);
        int iMax2 = this.f74d ? 0 : Math.max(0, this.al + this.am);
        if (this.Z == 3) {
            if (this.f73c) {
                i2 -= 8;
            }
            int i3 = (this.f102i ? F + G : 0) + (this.S << 1);
            int iMax3 = 0;
            for (int i4 = 0; i4 < this.ae; i4++) {
                e eVar = this.f101a[i4];
                if (eVar != null) {
                    iMax3 = Math.max(iMax3, eVar.d(i2 - i3));
                }
            }
            iMax = Math.max(iMax2, iMax3 + i3);
        } else {
            int iMax4 = 0;
            for (int i5 = 0; i5 < this.ae; i5++) {
                iMax4 = Math.max(iMax4, this.x[(i5 << 2) + 2]);
            }
            iMax = Math.max(iMax2, this.ac - (this.ap - iMax4));
        }
        if (this.f73c) {
            iMax += 8;
        }
        return iMax;
    }

    public final int b(int i2, int i3) {
        int i4;
        a(i2, i3, true);
        if (this.Z == 3) {
            if (this.f73c) {
                i2 -= 8;
                i3 -= 8;
            }
            int i5 = (this.f102i ? F + G : 0) + (this.S << 1);
            int i6 = this.ak;
            int iMax = 0;
            for (int i7 = 0; i7 < this.ae; i7++) {
                e eVar = this.f101a[i7];
                if (eVar != null) {
                    iMax = Math.max(iMax, eVar.b(i2 - i5, i3 - i6));
                }
            }
            i4 = iMax + i6;
        } else {
            int iMin = Math.min(this.aq, this.A);
            if (this.Z == 1) {
                boolean z = false;
                int i8 = this.ae;
                while (true) {
                    i8--;
                    if (i8 < 0) {
                        break;
                    }
                    z = z || this.f91a[i8] != null;
                }
                if (z) {
                    int i9 = this.L;
                    int i10 = (iMin / i9) * i9;
                    int i11 = i10;
                    if (i10 < iMin) {
                        i11 += i9;
                    }
                    iMin = i11;
                }
            } else if (this.Z == 0) {
                int i12 = this.au;
                iMin = (iMin / i12) * i12;
            }
            i4 = this.ad - (this.aq - iMin);
        }
        if (this.f73c) {
            i4 += 8;
        }
        return i4;
    }

    final void a(int i2, int i3, boolean z) {
        int i4;
        if (this.f73c) {
            i2 -= 8;
            i3 -= 8;
        }
        this.ac = i2;
        this.ad = i3;
        if (this.Z == 3) {
            int i5 = 0;
            for (int i6 = 0; i6 < this.f101a.length; i6++) {
                i5 += this.f101a[i6] != null ? 1 : 0;
            }
            this.f102i = i5 > 1;
        }
        this.an = this.S;
        this.ap = i2 - (this.S << 1);
        if (this.Z == 3 && this.f102i) {
            this.ap -= F + G;
            this.an += F;
        }
        if (this.f80h) {
            int width = 0;
            int height = 0;
            if (this.f83b != null) {
                width = this.f83b.getWidth() + 6;
                height = this.f83b.getHeight();
            }
            if (this.f84g != null) {
                width = this.f84g.getWidth() + 6;
                height = this.f84g.getHeight();
            }
            this.am = width;
            this.ak = Math.max(this.K, height);
            int i7 = width;
            int i8 = this.f74d ? this.W : this.ac;
            if (this.f81a != null) {
                this.f82a = new String[]{this.f81a};
            }
            int iMax = 0;
            boolean z2 = false;
            if (this.f82a != null) {
                for (int i9 = 0; i9 < this.f82a.length; i9++) {
                    iMax = Math.max(iMax, this.f69e.stringWidth(this.f82a[i9]));
                }
                z2 = true;
                if (!z) {
                    this.f81a = null;
                }
            }
            if (z2) {
                this.al = Math.min(iMax, (i8 - i7) - 6) + 6;
                i7 += this.al;
            } else {
                this.al = 0;
            }
            this.aj = 0;
            if ((this.af & 1) != 0) {
                this.aj = (i8 - i7) >> 1;
            }
        } else {
            this.ak = 0;
        }
        if (this.f80h) {
            i4 = this.ak;
            if (this.f74d) {
                i4 += this.T;
            }
        } else {
            i4 = this.T;
        }
        this.ao = i4;
        int i10 = (this.V + this.X) - this.Y;
        int i11 = this.ad;
        int iMin = Math.min((i11 - this.ao) - this.T, i10 - this.ao);
        int iMin2 = (Math.min((i11 - this.T) - u, i10) - this.ao) - t;
        int iMax2 = 0;
        int iMax3 = 0;
        boolean z3 = false;
        if (this.Z == 0) {
            for (int i12 = 0; i12 < this.ae; i12++) {
                Image[] imageArr = this.f88a[i12];
                if (imageArr != null) {
                    for (int i13 = 0; i13 < imageArr.length; i13++) {
                        if (imageArr[i13] != null) {
                            iMax2 = Math.max(iMax2, imageArr[i13].getWidth() + 6);
                            iMax3 = Math.max(iMax3, imageArr[i13].getHeight());
                        }
                    }
                }
                ay ayVar = this.f89a[i12];
                if (ayVar != null) {
                    for (int i14 = 0; i14 < ayVar.D(); i14++) {
                        ayVar.b(i14, -2, true);
                        iMax2 = Math.max(iMax2, ayVar.getWidth() + 6);
                        iMax3 = Math.max(iMax3, ayVar.getHeight());
                    }
                }
                z3 = z3 || this.f85w[i12] == 4 || this.f85w[i12] == 5;
                if (this.f85w[i12] == 5) {
                    Image[] imageArr2 = this.f99b[i12];
                    if (imageArr2 != null) {
                        for (int i15 = 0; i15 < imageArr2.length; i15++) {
                            if (imageArr2[i15] != null) {
                                iMax3 = Math.max(iMax3, imageArr2[i15].getHeight());
                            }
                        }
                    }
                    ay ayVar2 = this.f100b[i12];
                    if (ayVar2 != null) {
                        for (int i16 = 0; i16 < ayVar2.D(); i16++) {
                            ayVar2.b(i16, -2, true);
                            iMax3 = Math.max(iMax3, ayVar2.getHeight());
                        }
                    }
                }
            }
        }
        this.x = new int[this.ae << 2];
        this.f87A = new int[this.ae];
        this.f86z = new int[this.ae];
        if (this.Z == 1) {
            this.y = new int[this.ae];
        }
        if (z3) {
            this.f95E = new int[this.ae];
            this.f94D = new int[this.ae];
        }
        if (this.Z == 0) {
            this.au = Math.max(iMax3, this.M);
            if (this.f71a != null) {
                for (int i17 = 0; i17 < this.ae; i17++) {
                    if (this.f71a[i17] != null) {
                        this.au = Math.max(this.au, this.f71a[i17].getHeight());
                    }
                }
            }
        }
        if (this.Z != 3) {
            int i18 = iMax2;
            int i19 = iMax3;
            for (int i20 = 0; i20 < this.ae; i20++) {
                ax axVarM33a = m33a(i20);
                int height2 = axVarM33a.getHeight();
                int width2 = 0;
                int height3 = 0;
                if (this.Z == 0) {
                    width2 = i18;
                    height3 = i19;
                } else {
                    if (this.f88a[i20] != null) {
                        width2 = this.f88a[i20][0].getWidth() + 6;
                        height3 = this.f88a[i20][0].getHeight();
                    }
                    if (this.f89a[i20] != null) {
                        width2 = this.f89a[i20].getWidth() + 6;
                        height3 = this.f89a[i20].getHeight();
                    }
                }
                this.f87A[i20] = width2;
                int i21 = 0;
                if (this.f85w[i20] == 5) {
                    int iMax4 = 0;
                    Image[] imageArr3 = this.f99b[i20];
                    if (imageArr3 != null) {
                        for (int i22 = 0; i22 < imageArr3.length; i22++) {
                            if (imageArr3[i22] != null) {
                                iMax4 = Math.max(iMax4, imageArr3[i22].getWidth() + 6);
                            }
                        }
                    }
                    ay ayVar3 = this.f100b[i20];
                    if (ayVar3 != null) {
                        for (int i23 = 0; i23 < ayVar3.D(); i23++) {
                            ayVar3.b(i23, -2, true);
                            iMax4 = Math.max(iMax4, ayVar3.getWidth() + 6);
                        }
                    }
                    this.f95E[i20] = iMax4;
                    int iMax5 = 0;
                    if (this.f98b[i20] != null) {
                        for (int i24 = 0; i24 < this.f98b[i20].length; i24++) {
                            String str = this.f98b[i20][i24];
                            if (str != null) {
                                iMax5 = Math.max(iMax5, axVarM33a.stringWidth(str));
                            }
                        }
                        iMax5 += 6;
                    }
                    this.f94D[i20] = iMax5;
                    i21 = 0 + iMax4 + iMax5;
                } else if (this.f85w[i20] == 4) {
                    int i25 = 9 + ((this.f97G[i20] - 2) * 10) + 6;
                    this.f95E[i20] = i25;
                    this.f94D[i20] = 0;
                    i21 = i25;
                }
                int width3 = 0;
                int height4 = 0;
                if (this.Z == 1) {
                    if (this.f88a[i20] != null) {
                        width3 = this.f88a[i20][0].getWidth() + 6;
                        height4 = ((this.f88a[i20][0].getHeight() - 1) / this.L) + 1;
                    }
                    if (this.f89a[i20] != null) {
                        width3 = this.f89a[i20].getWidth() + 6;
                        height4 = ((this.f89a[i20].getHeight() - 1) / this.L) + 1;
                    }
                    this.y[i20] = height4;
                } else if (this.Z == 0) {
                    i21 += width2;
                }
                String[] strArrA = this.f91a[i20];
                String str2 = this.f90b[i20];
                if (str2 != null) {
                    if (this.Z == 0) {
                        strArrA = new String[]{str2};
                    } else {
                        int i26 = (this.ap - 6) - i21;
                        i = this.Z == 0 ? axVarM33a : this.f70f;
                        strArrA = a(str2, i26, width3, height4);
                    }
                }
                if (strArrA != null) {
                    int iMax6 = 0;
                    for (int i27 = 0; i27 < strArrA.length; i27++) {
                        String str3 = strArrA[i27];
                        int iStringWidth = this.Z == 0 ? axVarM33a.stringWidth(str3) : this.f70f.stringWidth(str3);
                        if (i27 < height4) {
                            iStringWidth += width3;
                        }
                        iMax6 = Math.max(iMax6, iStringWidth);
                    }
                    this.f86z[i20] = Math.min(iMax6, (this.ap - i21) - 6) + 6;
                    i21 += this.f86z[i20];
                    height3 = Math.max(height3, this.Z == 0 ? height2 : (this.L * strArrA.length) + (0 * strArrA.length));
                    if (!z) {
                        this.f90b[i20] = null;
                    }
                    this.f91a[i20] = strArrA;
                } else if (this.f88a[i20] == null && this.f89a[i20] == null) {
                    height3 = 0;
                }
                if (this.Z == 1 && strArrA == null) {
                    i21 += width2;
                }
                if (this.Z == 0 && height3 > 0) {
                    height3 = this.au;
                }
                this.x[(i20 << 2) + 2] = i21;
                this.x[(i20 << 2) + 3] = height3;
            }
            for (int i28 = 0; i28 < this.ae; i28++) {
                if ((this.ar & 1) != 0) {
                    this.x[i28 << 2] = (this.ap - this.x[(i28 << 2) + 2]) >> 1;
                }
            }
            boolean z4 = false;
            do {
                if (z4) {
                    this.ao = i4 + t;
                    this.aq = iMin2;
                    this.B = this.ac >> 1;
                    this.C = (this.ao - t) + (t >> 1);
                    this.D = this.ao + this.aq + (u >> 1);
                } else {
                    this.aq = iMin;
                }
                if (this.Z == 1) {
                    this.ao = this.ao;
                    this.aq = this.aq;
                    if (!z) {
                        boolean z5 = false;
                        int i29 = this.ae;
                        while (true) {
                            i29--;
                            if (i29 < 0) {
                                break;
                            } else {
                                z5 = z5 || this.f91a[i29] != null;
                            }
                        }
                        if (z5) {
                            int i30 = this.L;
                            this.ao += (this.aq % i30) >> 1;
                            this.aq = (this.aq / i30) * i30;
                        }
                    }
                }
                int i31 = 0;
                for (int i32 = 0; i32 < this.ae; i32++) {
                    this.x[(i32 << 2) + 1] = i31;
                    i31 += this.x[(i32 << 2) + 3];
                    if (this.Z == 1 && i31 != 0) {
                        i31 = (((i31 - 1) / this.L) + 1) * this.L;
                    }
                }
                if (this.ae > 0) {
                    this.A = this.x[((this.ae - 1) << 2) + 1] + this.x[((this.ae - 1) << 2) + 3];
                }
                if (z4) {
                    z4 = false;
                } else if (this.A > this.aq) {
                    z4 = true;
                } else if (this.f76f) {
                    if (this.Z == 0 && iMin2 / this.au >= 3) {
                        z4 = true;
                    } else if (this.Z == 1 && iMin2 / this.L >= 3) {
                        z4 = true;
                    }
                }
            } while (z4);
        } else if (!z) {
            this.ao = this.ak;
            this.aq = this.ad - this.ak;
            int i33 = 0;
            int i34 = this.ao;
            int i35 = this.ac;
            int i36 = this.aq;
            if (this.f73c) {
                i33 = 0 + 4;
                i34 += 4;
            }
            for (int i37 = 0; i37 < this.ae; i37++) {
                e eVar = this.f101a[i37];
                if (eVar != null) {
                    int i38 = this.Y;
                    eVar.U = i33;
                    eVar.V = i34;
                    eVar.W = i35;
                    eVar.X = i36;
                    eVar.Y = i38;
                    eVar.a(this.ap, i36, false);
                }
            }
        }
        if (z) {
            return;
        }
        if (this.Z == 0) {
            this.at = this.aq / this.au;
            if (this.aq < this.A) {
                this.ao += (this.aq - (this.at * this.au)) >> 1;
            }
        }
        if (this.as == -1) {
            this.as = 0;
        }
        this.as = m34e(this.as);
        if (this.as != -1) {
            this.as = m35f(this.as);
        }
        this.w = 0;
        if (this.as != -1) {
            g(this.as);
        }
    }

    public final void b(int i2, int i3, int i4, int i5) {
        this.aa = 0;
        this.ab = 0;
        a(i4, i5, false);
        this.aa = i2;
        this.ab = i3;
    }

    public final void d() {
        e();
        this.v = 0;
        this.ai = 0;
        this.ay = 0;
        c.b(0, -1, true);
        d.b(0, -1, true);
    }

    public final int[] a(int i2) {
        this.ay += i2;
        this.ay &= 268435455;
        if (this.v != 0 && this.A > this.aq) {
            this.z += i2;
            int i3 = (this.z * this.L) / 300;
            this.z -= (i3 * 300) / this.L;
            if (this.v == 2) {
                this.w -= i3;
            } else if (this.v == 1) {
                this.w += i3;
            }
            if (this.E == 2) {
                this.v = 0;
            } else {
                this.E = 1;
            }
            this.w = Math.max(this.w, 0);
            this.w = Math.min(this.w, this.A - this.aq);
        }
        if (this.f80h) {
            if (this.f84g != null) {
                this.f84g.n(i2);
            }
            String[] strArr = this.f82a != null ? this.f82a : null;
            if (strArr != null) {
                this.J = this.ai;
                this.H = this.ag;
                this.I = this.ah;
                c(i2, this.f69e.stringWidth(strArr[0]), this.al - 6);
                this.ag = this.H;
                this.ah = this.I;
                this.ai = this.J;
            }
        }
        for (int i4 = 0; i4 < this.ae; i4++) {
            int i5 = i4;
            if (this.f89a[i5] != null && this.f89a[i5] != null) {
                this.f89a[i5].n(i2);
            }
            if (this.f100b != null && this.f100b[i5] != null) {
                this.f100b[i5].n(i2);
            }
            if (i5 == this.as && this.f91a[i5] != null) {
                this.J = this.ax;
                String[] strArr2 = this.f91a[i5];
                if (strArr2 != null) {
                    this.H = this.av;
                    this.I = this.aw;
                    c(i2, m33a(i5).stringWidth(strArr2[0]), this.f86z[i5] - 6);
                    this.av = this.H;
                    this.aw = this.I;
                }
                this.ax = this.J;
            }
        }
        if (!f64a) {
            c.n(i2);
            d.n(i2);
        }
        if (this.Z == 1) {
            int i6 = this.v == 2 ? 2 : 0;
            int i7 = i6;
            if (i6 != c.C()) {
                c.b(i7, -1, true);
            }
            int i8 = this.v == 1 ? 2 : 0;
            int i9 = i8;
            if (i8 != d.C()) {
                d.b(i9, -1, true);
            }
        } else {
            if (c.h()) {
                c.b(0, -1, true);
            }
            if (d.h()) {
                d.b(0, -1, true);
            }
        }
        if (this.Z == 3 && this.f102i && e != null) {
            if (!f64a) {
                e.n(i2);
                f.n(i2);
            }
            if (e.h()) {
                e.b(0, -1, true);
            }
            if (f.h()) {
                f.b(0, -1, true);
            }
        }
        if (this.Z != 3 || this.as == -1) {
            if (!this.f77g) {
                return null;
            }
            this.f77g = false;
            return this.f78u;
        }
        e eVar = this.f101a[this.as];
        f64a = true;
        int[] iArrA = eVar.a(i2);
        f64a = false;
        return iArrA;
    }

    public final void a(Graphics graphics, int i2, int i3) {
        if (this.f73c) {
            i2 += 4;
            i3 += 4;
        }
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = i2;
        int i9 = i3;
        int i10 = this.ac;
        int i11 = this.ad;
        if (this.f80h) {
            if (this.f74d) {
                i4 = this.U;
                i5 = this.V;
                i6 = this.W;
            } else {
                i4 = i2;
                i5 = i3;
                i6 = this.ac;
            }
            i7 = this.ak;
        }
        if (this.f80h && this.f75e) {
            graphics.setClip(i4, i5, i6, i7);
            a(graphics, i4, i5, i6, i7, this.Q, this.R, 2);
            i9 += i7;
            i11 -= i7;
        }
        if (this.f72b) {
            graphics.setClip(i8, i9, i10, i11);
            a(graphics, i8, i9, i10, i11, this.O, this.P, 1);
        }
        if (this.f73c) {
            if (!this.f74d && this.f75e) {
                i9 -= i7;
                i11 += i7;
            }
            int i12 = i8 - 4;
            int i13 = i9 - 4;
            int i14 = i10 + 8;
            int i15 = i11 + 8;
            int clipX2 = graphics.getClipX();
            int clipY2 = graphics.getClipY();
            int clipWidth2 = graphics.getClipWidth();
            int clipHeight2 = graphics.getClipHeight();
            graphics.setClip(i12, i13, i14, i15);
            graphics.setColor(255);
            graphics.drawRect(i12, i13, i14 - 1, i15 - 1);
            graphics.drawRect(i12 + 1, i13 + 1, i14 - 3, i15 - 3);
            graphics.drawRect(i12 + 3, i13 + 3, i14 - 7, i15 - 7);
            graphics.setColor(this.O);
            graphics.drawRect(i12 + 2, i13 + 2, i14 - 5, i15 - 5);
            graphics.setClip(clipX2, clipY2, clipWidth2, clipHeight2);
        }
        int i16 = i3;
        if (this.f80h) {
            int i17 = i4 + this.aj;
            graphics.setClip(i17, i5, i6, this.ak);
            int i18 = i5;
            int i19 = i7;
            int i20 = this.al;
            int i21 = this.am;
            b(graphics, -2, i17, i18, i21, i19);
            c(graphics, -2, i17 + i21, i18, i20, i19);
            i16 += this.ak;
        }
        graphics.setClip(i2, i16, this.ac, this.ad - this.ak);
        if ((this.ar & 2) != 0 && this.A < this.aq && this.Z != 3) {
            i3 += (this.aq - this.A) >> 1;
        }
        if (this.Z == 0) {
            for (int i22 = 0; i22 < this.ae; i22++) {
                int i23 = i2 + this.an + this.x[i22 << 2];
                int i24 = this.x[(i22 << 2) + 1] - this.w;
                int i25 = this.x[(i22 << 2) + 2];
                int i26 = this.x[(i22 << 2) + 3];
                if (i24 >= 0 && i24 + i26 <= this.aq) {
                    int i27 = i24 + i3 + this.ao;
                    graphics.setClip(i2 + this.an, i3 + this.ao, this.ap, this.aq);
                    a(graphics, i22, i23, i27, i25, i26);
                }
            }
        } else if (this.Z == 1) {
            for (int i28 = 0; i28 < this.ae; i28++) {
                int i29 = this.an + this.x[i28 << 2];
                int i30 = (this.ao + this.x[(i28 << 2) + 1]) - this.w;
                int i31 = this.x[(i28 << 2) + 2];
                int i32 = this.x[(i28 << 2) + 3];
                if (i30 + i32 >= this.ao && i30 < this.ao + this.aq) {
                    graphics.setClip(i2 + this.an, i3 + this.ao, this.ap, this.aq);
                    a(graphics, i28, i2 + i29, i3 + i30, i31, i32);
                }
            }
        } else if (this.Z == 3) {
            int i33 = i2;
            int i34 = i3;
            if (this.as != -1) {
                e eVar = this.f101a[this.as];
                graphics.setClip(i33 + this.an, i34 + this.ao, this.ap, this.aq);
                eVar.a(graphics, i33 + this.an, i34 + this.ao);
            }
            if (this.f102i) {
                graphics.setClip((i33 + this.an) - F, i34 + this.ao, this.ap + F + G, this.aq);
                int i35 = ((i33 + this.an) - F) + (F >> 1);
                int i36 = ((((i33 + this.an) + this.ap) + G) - F) + (F >> 1);
                int i37 = i34 + this.ao + (this.aq >> 1);
                e.c(graphics, (i35 - (e.getWidth() >> 1)) + e.i(), (i37 - (e.getHeight() >> 1)) + e.j());
                f.c(graphics, (i36 - (f.getWidth() >> 1)) + f.i(), (i37 - (f.getHeight() >> 1)) + f.j());
            }
        }
        boolean z = this.w > 0;
        boolean z2 = this.w + this.aq < this.A;
        boolean z3 = z || c.C() == 1;
        boolean z4 = z2 || d.C() == 1;
        if (z3) {
            int i38 = i2 + this.B;
            int i39 = i3 + this.C;
            int width = i38 - (c.getWidth() >> 1);
            int height = i39 - (c.getHeight() >> 1);
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            c.c(graphics, width + c.i(), height + c.j());
        }
        if (z4) {
            int i40 = i2 + this.B;
            int i41 = i3 + this.D;
            int width2 = i40 - (d.getWidth() >> 1);
            int height2 = i41 - (d.getHeight() >> 1);
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            d.c(graphics, width2 + d.i(), height2 + d.j());
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    public final void b(Graphics graphics) {
        a(graphics, this.aa, this.ab);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void m32b(int i2, int i3) {
        if (this.Z == 3) {
            if (this.f102i && i3 == 0) {
                int iQ = ba.q(i2);
                if (iQ == 52) {
                    int iM35f = m35f(this.as);
                    if (iM35f != -1) {
                        g(iM35f);
                        e();
                    }
                    e.b(1, 1, true);
                } else if (iQ == 54) {
                    int iM34e = m34e(this.as);
                    if (iM34e != -1) {
                        g(iM34e);
                        e();
                    }
                    f.b(1, 1, true);
                }
            }
            if (this.as != -1) {
                this.f101a[this.as].m32b(i2, i3);
                return;
            }
        }
        int i4 = -1;
        if (!this.f77g) {
            switch (i3) {
                case 0:
                    int iQ2 = ba.q(i2);
                    if (this.Z == 0 && this.as != -1 && ((this.f85w[this.as] == 4 || this.f85w[this.as] == 5) && this.f92B[this.as] != 1)) {
                        int i5 = this.f96F[this.as];
                        if (iQ2 == 52) {
                            int[] iArr = this.f96F;
                            int i6 = this.as;
                            iArr[i6] = iArr[i6] - 1;
                        } else if (iQ2 == 54) {
                            int[] iArr2 = this.f96F;
                            int i7 = this.as;
                            iArr2[i7] = iArr2[i7] + 1;
                        }
                        if (this.f85w[this.as] == 4) {
                            this.f96F[this.as] = Math.max(Math.min(this.f96F[this.as], this.f97G[this.as] - 1), 0);
                        } else {
                            this.f96F[this.as] = (this.f96F[this.as] + this.f97G[this.as]) % this.f97G[this.as];
                        }
                        if (this.f96F[this.as] != i5) {
                            i4 = 1;
                        }
                    }
                    if (iQ2 != 53) {
                        if (iQ2 != 50) {
                            if (iQ2 == 56) {
                                if (this.Z == 0) {
                                    int iM34e2 = m34e(this.as);
                                    if (iM34e2 != -1) {
                                        g(iM34e2);
                                        if (this.w + this.aq < this.A) {
                                            d.b(1, 1, true);
                                        }
                                        e();
                                    }
                                } else if (this.Z == 1) {
                                    this.v = 1;
                                    this.E = 0;
                                }
                            }
                        } else if (this.Z == 0) {
                            int iM35f2 = m35f(this.as);
                            if (iM35f2 != -1) {
                                g(iM35f2);
                                if (this.w > 0) {
                                    c.b(1, 1, true);
                                }
                                e();
                            }
                        } else if (this.Z == 1) {
                            this.v = 2;
                            this.E = 0;
                        }
                    } else if (this.Z != 0) {
                        i4 = 0;
                        i2 = this.f79v[0];
                    } else if (this.as != -1 && this.f92B[this.as] != 1) {
                        if (this.f85w[this.as] == 0) {
                            i4 = 1;
                        } else if (this.f85w[this.as] == 5 || this.f85w[this.as] == 4) {
                            this.f96F[this.as] = (this.f96F[this.as] + 1) % this.f97G[this.as];
                            i4 = 1;
                        }
                    }
                    break;
                case 1:
                    if (this.E != 1) {
                        this.E = 2;
                    } else {
                        this.v = 0;
                    }
                    break;
                case 3:
                    if (this.Z != 0) {
                        i4 = 0;
                    } else {
                        i4 = i2 == this.f79v[1] ? 0 : -1;
                        if (this.as != -1 && this.f92B[this.as] != 1 && i2 == this.f79v[0]) {
                            if (this.f85w[this.as] == 4 || this.f85w[this.as] == 5) {
                                this.f96F[this.as] = (this.f96F[this.as] + 1) % this.f97G[this.as];
                            }
                            i4 = 1;
                        }
                    }
                    break;
            }
        }
        if (i4 != -1) {
            this.f77g = true;
            this.f78u[0] = i4;
            if (i4 == 1) {
                this.f78u[1] = this.f93C[this.as];
            } else {
                this.f78u[1] = i2;
            }
        }
    }

    public final void g(int i2) {
        this.as = m34e(i2 - 1);
        if (this.as == -1) {
            return;
        }
        this.ax = 0;
        this.av = 0;
        this.aw = 0;
        if (this.A > this.aq) {
            int i3 = this.w / this.au;
            int i4 = this.A / this.au;
            int i5 = this.x[(i2 << 2) + 1] / this.au;
            this.w = Math.min(Math.max(Math.min(Math.max(i3, i5 - (this.at >> 1)), i5 - ((this.at - 1) >> 1)), 0), i4 - this.at) * this.au;
        } else {
            this.w = 0;
        }
        this.aw = 0;
        this.av = 0;
    }

    public static void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i6 == i7 || i5 <= 1) {
            graphics.setColor(i6);
            graphics.fillRect(i2, i3, i4, i5);
            return;
        }
        int i9 = (i6 >> 16) & 255;
        int i10 = (i6 >> 8) & 255;
        int i11 = i6 & 255;
        int i12 = ((i7 >> 16) & 255) - i9;
        int i13 = ((i7 >> 8) & 255) - i10;
        int i14 = (i7 & 255) - i11;
        int i15 = 0;
        while (true) {
            int i16 = i15;
            if (i16 >= i5) {
                return;
            }
            if (i16 + i8 > i5) {
                i8 = i5 - i16;
            }
            graphics.setColor(i9 + ((i16 * i12) / (i5 - 1)), i10 + ((i16 * i13) / (i5 - 1)), i11 + ((i16 * i14) / (i5 - 1)));
            graphics.fillRect(i2, i3 + i16, i4, i8);
            i15 = i16 + i8;
        }
    }

    public static String[] a(String str, ax axVar, int i2) {
        i = axVar;
        return a(str, i2, 0, 0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private ax m33a(int i2) {
        return (this.f71a == null || this.f71a[i2] == null) ? this.g : this.f71a[i2];
    }

    private void c(int i2, int i3, int i4) {
        int i5 = i3 - i4;
        if (i5 <= 0) {
            this.H = 0;
            return;
        }
        int i6 = i5 + 25;
        this.J -= i2;
        while (this.J < 0) {
            if (this.I == 1) {
                this.H++;
            } else {
                this.H--;
            }
            if (this.H > i6) {
                this.H = i6;
                this.I = 0;
            } else if (this.H < -25) {
                this.H = -25;
                this.I = 1;
            }
            this.J += 40;
        }
    }

    private void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        Image image;
        int[] iArr;
        int i7 = this.f86z[i2];
        int i8 = this.f87A[i2];
        if (this.Z == 1 && i7 > 0) {
            i8 = 0;
        }
        if (this.f103e == null || (iArr = this.f103e[i2]) == null) {
            z = false;
            break;
        }
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        int i11 = this.ay % i9;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= iArr.length) {
                z = false;
                break;
            }
            i12 += iArr[i13];
            if (i11 < i12) {
                if ((i13 & 1) == 1) {
                    z = true;
                    break;
                } else {
                    z = false;
                    break;
                }
            }
            i13++;
        }
        if (z) {
            return;
        }
        b(graphics, i2, i3, i4, this.f87A[i2], i6);
        c(graphics, i2, i3 + i8, i4, i7, i6);
        if (this.f85w[i2] != 5) {
            if (this.f85w[i2] == 4) {
                int i14 = ((i3 + i5) - this.f94D[i2]) - this.f95E[i2];
                int i15 = this.f97G[i2] - 1;
                int i16 = this.f96F[i2];
                int height = m33a(i2).getHeight() - 3;
                for (int i17 = 1; i17 <= i15; i17++) {
                    int i18 = i14 + ((i17 - 1) * 10) + 3;
                    int i19 = i4 + ((i6 + height) >> 1);
                    int i20 = (height * i17) / i15;
                    if (i16 >= i17) {
                        graphics.setColor(13421772);
                    } else {
                        graphics.setColor(0);
                    }
                    graphics.fillRect(i18, i19 - i20, 9, i20);
                }
                return;
            }
            return;
        }
        int i21 = this.f94D[i2];
        int i22 = this.f95E[i2];
        int i23 = ((i3 + i5) - i21) - i22;
        int i24 = this.f96F[i2];
        if (this.f99b[i2] != null && (image = this.f99b[i2][i24]) != null) {
            graphics.drawImage(image, i23 + (i22 >> 1), i4 + (i6 >> 1), 3);
        }
        if (this.f100b[i2] != null) {
            ay ayVar = this.f100b[i2];
            if (i24 != ayVar.C()) {
                ayVar.b(i24, -2, true);
            }
            ayVar.c(graphics, i23 + ayVar.i() + ((i22 - ayVar.getWidth()) >> 1), i4 + ayVar.j() + ((i6 - ayVar.getHeight()) >> 1));
        }
        if (this.f98b[i2] != null) {
            ax axVarM33a = m33a(i2);
            int height2 = axVarM33a.getHeight();
            String str = this.f98b[i2][i24];
            if (str != null) {
                axVarM33a.a(graphics, str, i23 + i22 + 3, i4 + ((i6 - height2) >> 1), 20);
            }
        }
    }

    private void b(Graphics graphics, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        boolean z = i2 == -2;
        int clipX = 0;
        int clipY = 0;
        int clipWidth = 0;
        int clipHeight = 0;
        if (z) {
            clipX = graphics.getClipX();
            clipY = graphics.getClipY();
            clipWidth = graphics.getClipWidth();
            clipHeight = graphics.getClipHeight();
            graphics.setClip(0, 0, ba.E(), ba.H());
        }
        if (z || this.Z == 1) {
            i7 = 0;
        } else {
            if (this.f92B[i2] == 0) {
                i7 = this.as == i2 ? 1 : 0;
            } else {
                i7 = 2;
            }
            if ((this.f85w[i2] == 5 || this.f85w[i2] == 4) && this.f96F[i2] == 0) {
                i7 = 3;
            }
        }
        Image image = null;
        if (z) {
            image = this.f83b;
        } else if (this.f88a[i2] != null) {
            image = this.f88a[i2][i7];
        }
        if (image != null) {
            int width = i3 + ((i5 - image.getWidth()) >> 1);
            int height = i4;
            if (z || this.Z == 0) {
                height += (i6 - image.getHeight()) >> 1;
            } else if (this.f91a[i2] != null && this.f91a[i2].length > this.y[i2]) {
                int i8 = this.y[i2] * this.L;
                image.getHeight();
                height += (i8 - image.getHeight()) >> 1;
            }
            graphics.drawImage(image, width, height, 20);
        }
        ay ayVar = z ? this.f84g : this.f89a[i2];
        if (ayVar != null) {
            if (i7 != ayVar.C()) {
                ayVar.b(i7, -2, true);
            }
            int width2 = i3 + ((i5 - ayVar.getWidth()) >> 1);
            int height2 = i4;
            if (z || this.Z == 0) {
                height2 += (i6 - ayVar.getHeight()) >> 1;
            } else if (this.f91a[i2] != null && this.f91a[i2].length > this.y[i2]) {
                height2 += ((this.y[i2] * this.L) - ayVar.getHeight()) >> 1;
            }
            ayVar.c(graphics, width2 + ayVar.i(), height2 + ayVar.j());
        }
        if (z) {
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
        }
    }

    private void c(Graphics graphics, int i2, int i3, int i4, int i5, int i6) {
        String[] strArr = i2 == -2 ? this.f82a : this.f91a[i2];
        if (strArr != null) {
            int iMin = i3 + 3;
            int height = this.L;
            ax axVarM33a = this.f70f;
            if (i2 == -2) {
                height = this.K;
                axVarM33a = this.f69e;
            } else if (this.Z == 0) {
                axVarM33a = m33a(i2);
                if (this.Z == 0 && i2 != this.as) {
                    axVarM33a = this.h;
                }
                height = axVarM33a.getHeight();
            }
            if (i2 == -2 || this.Z != 1) {
                int i7 = i4 + ((i6 - height) >> 1);
                int iStringWidth = axVarM33a.stringWidth(strArr[0]);
                boolean z = iStringWidth <= i5 - 6;
                int clipX = graphics.getClipX();
                int clipY = graphics.getClipY();
                int clipWidth = graphics.getClipWidth();
                int clipHeight = graphics.getClipHeight();
                if (!z) {
                    int i8 = clipX + clipWidth;
                    int i9 = clipY + clipHeight;
                    int iMax = Math.max(clipX, iMin);
                    int iMax2 = Math.max(clipY, i4);
                    graphics.setClip(iMax, iMax2, Math.max(iMax, Math.min(i8, iMin + (i5 - 6))) - iMax, Math.max(iMax2, Math.min(i9, i4 + i6)) - iMax2);
                    if (i2 == -2) {
                        if (this.ag >= 0) {
                            iMin -= Math.min(iStringWidth - (this.al - 6), this.ag);
                        }
                    } else if (i2 == this.as && this.av >= 0) {
                        iMin -= Math.min(iStringWidth - (this.f86z[i2] - 6), this.av);
                    }
                }
                axVarM33a.a(graphics, strArr[0], iMin, i7, 20);
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
                return;
            }
            int i10 = height;
            int clipY2 = graphics.getClipY();
            int clipHeight2 = graphics.getClipHeight();
            int i11 = i4 < clipY2 ? (clipY2 - i4) / i10 : 0;
            int i12 = (clipY2 + clipHeight2) - (i4 + (i11 * i10));
            int iMin2 = Math.min(i11 + (i12 == 0 ? 0 : ((i12 - 1) / i10) + 1), this.f91a[i2].length);
            int i13 = 0;
            int i14 = 0;
            if (this.Z == 1) {
                i13 = this.f87A[i2];
                i14 = this.y[i2];
            }
            for (int i15 = i11; i15 < iMin2; i15++) {
                String str = this.f91a[i2][i15];
                int iStringWidth2 = iMin;
                int i16 = i4 + (i10 * i15);
                if (i15 < i14) {
                    iStringWidth2 += i13;
                } else if ((this.ar & 1) != 0) {
                    iStringWidth2 += ((i5 - axVarM33a.stringWidth(str)) >> 1) - 3;
                }
                axVarM33a.a(graphics, str, iStringWidth2, i16, 20);
            }
        }
    }

    private void e() {
        ba.U();
        if (this.Z != 3) {
            int i2 = 0;
            if (this.f92B != null && this.as < this.f92B.length && this.as != -1) {
                i2 = this.f92B[this.as];
            }
            if (this.f79v[0] != -1 && i2 != 1) {
                ba.h(this.f79v[0], 0);
            }
            if (this.f79v[1] != -1) {
                ba.h(this.f79v[1], 0);
            }
            if (this.Z == 1) {
                this.w = 0;
            }
            this.ax = 0;
        } else if (this.as != -1) {
            this.f101a[this.as].d();
        }
        if (this.Z == 3 && this.f102i) {
            e.b(0, -1, true);
            f.b(0, -1, true);
        }
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    private int m34e(int i2) {
        if (this.ae == 0) {
            return -1;
        }
        int i3 = this.ae;
        do {
            i2 = (i2 + 1) % this.ae;
            int i4 = i3;
            i3 = i4 - 1;
            if (i4 <= 0) {
                return -1;
            }
        } while (!b(i2));
        return i2;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    private int m35f(int i2) {
        if (this.ae == 0) {
            return -1;
        }
        if (i2 == -1) {
            i2 = 0;
        }
        int i3 = this.ae;
        do {
            i2 = ((i2 + this.ae) - 1) % this.ae;
            int i4 = i3;
            i3 = i4 - 1;
            if (i4 <= 0) {
                return -1;
            }
        } while (!b(i2));
        return i2;
    }

    private boolean b(int i2) {
        return this.f85w[i2] == 0 || this.f85w[i2] == 4 || this.f85w[i2] == 5 || this.f85w[i2] == 7;
    }

    private static String[] a(String str, int i2, int i3, int i4) {
        char[] cArr = {'.', '/'};
        ax axVar = i;
        int i5 = i2 - ((axVar.f == null && axVar.am) ? 2 : 0);
        int i6 = 0;
        int i7 = 0;
        int length = str.length();
        Vector vector = new Vector();
        int i8 = 0;
        if (str.length() == 0) {
            vector.addElement(str);
        }
        while (i7 < length) {
            int iIndexOf = str.indexOf("\\n", i6);
            i7 = iIndexOf;
            if (iIndexOf == -1) {
                i7 = length;
            }
            boolean z = false;
            while (!z) {
                int i9 = i6;
                int iCharWidth = 0;
                int i10 = -1;
                int i11 = i5;
                if (i8 < i4) {
                    i11 -= i3;
                }
                while (iCharWidth <= i11 && i9 < i7) {
                    char cCharAt = str.charAt(i9);
                    int i12 = iCharWidth;
                    ax axVar2 = i;
                    iCharWidth = i12 + (axVar2.f != null ? axVar2.i[axVar2.a(cCharAt)] + axVar2.dX : axVar2.a.charWidth(cCharAt));
                    i9++;
                    if (cCharAt == ' ') {
                        i10 = i9;
                    }
                }
                if (i9 == i7 && iCharWidth <= i11) {
                    z = true;
                } else if (i10 != -1) {
                    i9 = i10 - 1;
                } else {
                    i9--;
                    boolean z2 = false;
                    for (int i13 = i9; i13 > i6 && !z2; i13--) {
                        char cCharAt2 = str.charAt(i13);
                        int length2 = cArr.length;
                        while (true) {
                            length2--;
                            if (length2 < 0 || z2) {
                                break;
                            }
                            if (cCharAt2 == cArr[length2]) {
                                i9 = i13 + 1;
                                z2 = true;
                            }
                        }
                    }
                }
                vector.addElement(str.substring(i6, i9));
                i8++;
                if (z && i9 < length) {
                    i9 += 2;
                } else if (i10 != -1) {
                    i9++;
                }
                i6 = i9;
            }
        }
        String[] strArr = new String[vector.size()];
        for (int i14 = 0; i14 < strArr.length; i14++) {
            strArr[i14] = (String) vector.elementAt(i14);
        }
        i = null;
        return strArr;
    }

    public final void f() {
        if (this.f85w != null) {
            for (int i2 = 0; i2 < this.ae; i2++) {
                f(i2);
            }
        }
        if (this.f84g != null) {
            this.f84g.m();
        }
    }
}
