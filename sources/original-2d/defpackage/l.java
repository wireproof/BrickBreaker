package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: original-2d.jar:l.class */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static b f328a;
    private static b b;
    private static int e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static a f329a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static a f330b;
    public static a c;
    public static a d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static a f331e;
    public static a f;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public byte f335d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image f336a;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private int f337f;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f338b;
    private int g;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public int f339c;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f340a;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public int f342d;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[] f343b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private StringBuffer[] f344a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private char[] f345a;
    private int v;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f346b;
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private b f349c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private boolean f350c;
    private int C;
    private int D;
    private int E;
    private int F;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f351a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[] f352a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Image f353b;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private a f354g;
    private int G;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private int[] f355d;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private int[] f356e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private int[] f357f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private int[] f358g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private int[] f359h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private int[] f360i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private int[] f361j;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Image[][] f362a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private a[] f363a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String[] f364b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[][] f365a;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private int[] f366k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private int[] f367l;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private int[] f368m;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String[][] f369b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Image[][] f370b;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private int[] f371n;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private int[] f372o;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private a[] f373b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[][] f374a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[][] f375b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private String[][] f376c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private Image[][] f377c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private a[][] f378a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[][][] f379a;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int[][] f380c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private int[][] f381d;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static b f382d;
    private int N;
    private int O;
    private int P;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static byte f332a = 1;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static byte f333b = 2;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static byte f334c = 3;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final char[][][] f347a = {new char[][]{new char[]{'0'}, new char[]{'1'}, new char[]{'A', 'B', 'C', '2'}, new char[]{'D', 'E', 'F', '3'}, new char[]{'G', 'H', 'I', '4'}, new char[]{'J', 'K', 'L', '5'}, new char[]{'M', 'N', 'O', '6'}, new char[]{'P', 'Q', 'R', 'S', '7'}, new char[]{'T', 'U', 'V', '8'}, new char[]{'W', 'X', 'Y', 'Z', '9'}}, new char[][]{new char[]{'0'}, new char[]{'1'}, new char[]{'2'}, new char[]{'3'}, new char[]{'4'}, new char[]{'5'}, new char[]{'6'}, new char[]{'7'}, new char[]{'8'}, new char[]{'9'}}, new char[][]{new char[]{'0'}, new char[]{'1'}, new char[]{'2'}, new char[]{'3'}, new char[]{'4'}, new char[]{'5'}, new char[]{'6'}, new char[]{'7'}, new char[]{'8'}, new char[]{'9'}}};
    public int a = 300;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int[] f341a = new int[2];

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private final int[] f348c = new int[2];

    public final void a(int i, int i2, int i3) {
        if (f336a == null) {
            f336a = d.m26a(65551);
        }
        e();
        this.f337f = i;
        this.J = -1;
        this.o = 0;
        this.f342d = 0;
        this.A = i3;
        this.p = 0;
        this.f335d = f332a;
        this.C = i3;
        this.f338b = 0;
        this.f346b = false;
        this.f356e = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            this.f356e[i4] = -1;
        }
        this.f364b = new String[i2];
        this.f365a = new String[i2][];
        this.f357f = new int[i2];
        this.f366k = new int[i2];
        this.f362a = new Image[i2][];
        this.f363a = new a[i2];
        this.h = i2;
        this.F = 1;
        this.f350c = false;
        this.L = 1;
        this.f348c[0] = -1;
        this.f348c[1] = -1;
        a(b);
    }

    public final void a(int i, int i2) {
        this.f348c[i2] = i;
    }

    public final void a(String str, Image image) {
        this.f350c = true;
        this.f351a = str;
        this.f353b = image;
        this.C = 1;
    }

    public final void a(String str, a aVar, int i) {
        this.f350c = true;
        this.f351a = str;
        this.f354g = aVar;
        this.C = i;
    }

    public final void a(int i, int i2, String str, Image[] imageArr, int i3) {
        if (this.f356e[i] != -1) {
            a(i);
        }
        this.f356e[i] = i2;
        this.f357f[i] = i3;
        this.f362a[i] = imageArr;
        this.f364b[i] = str;
    }

    public final void a(int i, int i2, String str, a aVar, int i3) {
        a(i, i2, str, (Image[]) null, i3);
        this.f363a[i] = aVar;
    }

    public final void a(int i, int i2, String str, String str2, Image[] imageArr, int i3, int i4) {
        a(i, 3, str2, imageArr, i4);
        if (this.f343b == null) {
            this.f343b = new int[this.h];
            this.f344a = new StringBuffer[this.h];
        }
        if (this.f345a == null || i3 > this.f345a.length) {
            this.f345a = new char[i3];
        }
        this.f344a[i] = new StringBuffer(i3);
        switch (i2) {
            case 0:
                this.f343b[i] = 0;
                break;
            case 2:
                this.f343b[i] = 1;
                break;
            case 3:
                this.f343b[i] = 2;
                break;
        }
        if (str != null) {
            this.f344a[i].append(str);
        }
    }

    public final void a(int i, String str, a aVar, String[] strArr, a aVar2, int i2) {
        int iMax = Math.max(strArr != null ? strArr.length : 0, aVar2 != null ? aVar2.m13a() : 0);
        a(i, 5, str, aVar, i2);
        a(i, strArr, (Image[]) null, 0, iMax);
        this.f373b[i] = aVar2;
    }

    public final void a(int i) {
        if (this.f356e[i] != -1 && this.J == i) {
            this.J = m109b(i);
            if (this.J < i) {
                this.J = m110c(i);
            }
        }
        if (this.f362a != null) {
            this.f362a[i] = null;
        }
        if (this.f370b != null) {
            this.f370b[i] = null;
        }
        if (this.f363a != null) {
            this.f363a[i] = null;
        }
        if (this.f373b != null) {
            this.f373b[i] = null;
        }
        this.f365a[i] = null;
        this.f356e[i] = -1;
    }

    public final void b(int i, int i2) {
        this.g = i;
        this.f339c = i2;
        this.i = 4;
        this.k = i - 8;
        c();
        d();
        this.m = this.l / this.n;
        if (this.J == -1) {
            this.J = m109b(this.J);
        }
        this.J = m109b(this.J);
        if (this.J != -1) {
            this.J = m110c(this.J);
        }
        this.o = 0;
        if (this.J != -1) {
            b(this.J);
        }
    }

    private void c() {
        if (!this.f350c) {
            this.G = 0;
            return;
        }
        int iD = 0;
        int iE = 0;
        if (this.f353b != null) {
            iD = this.f353b.getWidth() + 4;
            iE = this.f353b.getHeight();
        }
        if (this.f354g != null) {
            iD = this.f354g.d() + 4;
            iE = this.f354g.e();
        }
        this.I = iD;
        this.G = Math.max(e, iE) + 8;
        int i = iD;
        if (this.f351a != null) {
            this.f352a = new String[]{this.f351a};
        }
        if (this.f352a != null) {
            int iMax = 0;
            for (int i2 = 0; i2 < this.f352a.length; i2++) {
                iMax = Math.max(iMax, f328a.a(this.f352a[i2]));
            }
            this.H = Math.min(iMax, (this.g - i) - 4) + 4;
            i += this.H;
            this.f351a = null;
        }
        this.f355d = new int[]{(this.C & 1) != 0 ? (this.g - i) >> 1 : 0, 0, i, this.G};
    }

    private void d() {
        int height = (f336a.getHeight() >> 1) + 2;
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        if (this.f337f == 0) {
            for (int i = 0; i < this.h; i++) {
                Image[] imageArr = this.f362a[i];
                if (imageArr != null) {
                    for (int i2 = 0; i2 < imageArr.length; i2++) {
                        if (imageArr[i2] != null) {
                            iMax = Math.max(iMax, imageArr[i2].getWidth() + 4);
                            iMax2 = Math.max(iMax2, imageArr[i2].getHeight() + 8);
                        }
                    }
                }
                a aVar = this.f363a[i];
                if (aVar != null) {
                    for (int i3 = 0; i3 < aVar.m13a(); i3++) {
                        aVar.a(i3, true, true);
                        iMax = Math.max(iMax, aVar.d() + 4);
                        iMax2 = Math.max(iMax2, aVar.e() + 8);
                    }
                }
                z |= this.f356e[i] == 3;
                z2 |= this.f356e[i] == 4 || this.f356e[i] == 5;
                if (this.f356e[i] == 5) {
                    Image[] imageArr2 = this.f370b[i];
                    if (imageArr2 != null) {
                        for (int i4 = 0; i4 < imageArr2.length; i4++) {
                            if (imageArr2[i4] != null) {
                                iMax2 = Math.max(iMax2, imageArr2[i4].getHeight() + 8);
                            }
                        }
                    }
                    a aVar2 = this.f373b[i];
                    if (aVar2 != null) {
                        for (int i5 = 0; i5 < aVar2.m13a(); i5++) {
                            aVar2.a(i5, true, true);
                            iMax2 = Math.max(iMax2, aVar2.e() + 8);
                        }
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.h; i6++) {
                z3 |= this.f356e[i6] == 6;
            }
        }
        this.f358g = new int[this.h * 4];
        this.f361j = new int[this.h];
        this.f360i = new int[this.h];
        if (this.f337f != 0) {
            this.f359h = new int[this.h];
        }
        if (z2) {
            this.f368m = new int[this.h];
            this.f367l = new int[this.h];
        }
        if (z3) {
            this.f380c = new int[this.h][];
            this.f381d = new int[this.h][];
            this.f379a = new String[this.h][][];
        }
        this.n = Math.max(iMax2, this.B + 8);
        if (z) {
            this.u = this.B + 4 + 4;
            this.n += this.u;
        }
        f(iMax, iMax2);
        int i7 = this.f350c ? 0 : 0 + 6;
        for (int i8 = 0; i8 < this.h; i8++) {
            if ((this.A & 1) != 0) {
                this.f358g[(i8 * 4) + 0] = (this.k - this.f358g[(i8 * 4) + 2]) >> 1;
            }
        }
        this.j = this.G + i7;
        int iMin = Math.min((this.f339c - this.j) - 6, (d.a() - this.j) - d.m29b());
        int iMin2 = (Math.min((this.f339c - 6) - height, d.a() - d.m29b()) - this.j) - height;
        boolean z4 = false;
        do {
            this.j = this.G + i7;
            if (z4) {
                this.j += height;
                this.l = iMin2;
                this.r = this.g >> 1;
                this.s = this.j - (height >> 1);
                this.t = this.j + this.l + (height >> 1);
            } else {
                this.l = iMin;
            }
            if (this.f337f != 0) {
                this.j += 4;
                this.l -= 8;
                int i9 = this.B + 2;
                this.j += (this.l % i9) >> 1;
                this.l = (this.l / i9) * i9;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.h; i11++) {
                this.f358g[(i11 * 4) + 1] = i10;
                i10 += this.f358g[(i11 * 4) + 3];
                if (this.f337f != 0 && i10 != 0) {
                    i10 = (((i10 - 1) / (this.B + 2)) + 1) * (this.B + 2);
                }
            }
            if (this.h > 0) {
                this.q = this.f358g[((this.h - 1) * 4) + 1] + this.f358g[((this.h - 1) * 4) + 3];
            }
            if (z4) {
                z4 = false;
            } else if (this.q > this.l) {
                z4 = true;
            } else if (this.f337f == 0 && iMin2 / this.n >= 3) {
                z4 = true;
            } else if (this.f337f != 0 && iMin2 / (this.B + 2) >= 3) {
                z4 = true;
            }
        } while (z4);
    }

    private void c(int i) {
        int i2 = this.k - 4;
        int i3 = 0;
        int[] iArr = this.f374a[i];
        int length = iArr.length;
        int length2 = 0;
        if (this.f376c[i] != null) {
            length2 = this.f376c[i].length;
        } else if (this.f377c[i] != null) {
            length2 = this.f377c[i].length;
        } else if (this.f378a[i] != null) {
            length2 = this.f378a[i].length;
        }
        int i4 = length2 / length;
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[i4];
        String[][] strArr = new String[length2][];
        this.f380c[i] = iArr2;
        this.f381d[i] = iArr3;
        this.f379a[i] = strArr;
        int i5 = i2;
        for (int i6 = 0; i6 < length; i6++) {
            if (iArr[i6] == -1) {
                int iMax = 0;
                int i7 = i6;
                while (true) {
                    int i8 = i7;
                    if (i8 >= length2) {
                        break;
                    }
                    if (this.f376c[i] != null && this.f376c[i][i8] != null) {
                        String str = this.f376c[i][i8];
                        iMax = Math.max(iMax, this.f349c.a(str));
                        strArr[i8] = new String[]{str};
                    }
                    if (this.f377c[i] != null && this.f377c[i][i8] != null) {
                        iMax = Math.max(iMax, this.f377c[i][i8].getWidth());
                    }
                    if (this.f378a[i] != null && this.f378a[i][i8] != null) {
                        iMax = Math.max(iMax, this.f378a[i][i8].d());
                    }
                    i7 = i8 + length;
                }
                int i9 = iMax + 4;
                iArr2[i6] = i9;
                i5 -= i9;
            }
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (iArr[i10] != -1) {
                iArr2[i10] = (i5 * iArr[i10]) / 100;
            }
        }
        int i11 = i2;
        for (int i12 = 0; i12 < length; i12++) {
            i11 -= iArr2[i12];
        }
        int i13 = length - 1;
        iArr2[i13] = iArr2[i13] + i11;
        int i14 = 0;
        for (int i15 = 0; i15 < i4; i15++) {
            int iMax2 = 0;
            int i16 = 0;
            while (i16 < length) {
                if (iArr[i16] != -1) {
                    int i17 = iArr2[i16] - 4;
                    if (this.f376c[i] != null && this.f376c[i][i14] != null) {
                        this.f379a[i][i14] = a(this.f376c[i][i14], this.f349c, i17);
                    }
                }
                if (this.f378a[i] != null && this.f378a[i][i14] != null) {
                    iMax2 = Math.max(iMax2, this.f378a[i][i14].e());
                } else if (this.f377c[i] != null && this.f377c[i][i14] != null) {
                    iMax2 = Math.max(iMax2, this.f377c[i][i14].getHeight());
                } else if (this.f376c[i] != null && this.f376c[i][i14] != null) {
                    iMax2 = Math.max(iMax2, this.f379a[i][i14].length * this.B);
                }
                i16++;
                i14++;
            }
            int i18 = ((((iMax2 + 2) - 1) / (this.B + 2)) + 1) * (this.B + 2);
            this.f381d[i][i15] = i18;
            i3 += i18;
        }
        this.f358g[(i * 4) + 2] = i2 + 4;
        this.f358g[(i * 4) + 3] = i3;
    }

    private void f(int i, int i2) {
        int i3 = 0;
        while (i3 < this.h) {
            if (this.f356e[i3] == 6) {
                c(i3);
            } else {
                int iD = 0;
                int iE = 0;
                if (this.f337f == 0) {
                    iD = i;
                    iE = i2;
                } else {
                    if (this.f362a[i3] != null) {
                        iD = this.f362a[i3][0].getWidth() + 4;
                        iE = this.f362a[i3][0].getHeight();
                    }
                    if (this.f363a[i3] != null) {
                        iD = this.f363a[i3].d() + 4;
                        iE = this.f363a[i3].e();
                    }
                }
                this.f361j[i3] = iD;
                int i4 = 0;
                int iMax = iE;
                if (this.f356e[i3] == 5) {
                    int iMax2 = 0;
                    Image[] imageArr = this.f370b[i3];
                    if (imageArr != null) {
                        for (int i5 = 0; i5 < imageArr.length; i5++) {
                            if (imageArr[i5] != null) {
                                iMax2 = Math.max(iMax2, imageArr[i5].getWidth() + 4);
                            }
                        }
                    }
                    a aVar = this.f373b[i3];
                    if (aVar != null) {
                        for (int i6 = 0; i6 < aVar.m13a(); i6++) {
                            aVar.a(i6, true, true);
                            iMax2 = Math.max(iMax2, aVar.d() + 4);
                        }
                    }
                    this.f368m[i3] = iMax2;
                    int iMax3 = 0;
                    if (this.f369b[i3] != null) {
                        for (int i7 = 0; i7 < this.f369b[i3].length; i7++) {
                            String str = this.f369b[i3][i7];
                            if (str != null) {
                                iMax3 = Math.max(iMax3, this.f349c.a(str));
                            }
                        }
                        iMax3 += 4;
                    }
                    this.f367l[i3] = iMax3;
                    i4 = 0 + iMax2 + iMax3;
                }
                if (this.f356e[i3] == 4) {
                    int i8 = 6 + ((this.f372o[i3] - 2) * 7) + 4;
                    this.f368m[i3] = i8;
                    this.f367l[i3] = 0;
                    i4 += i8;
                }
                int iD2 = 0;
                int iE2 = 0;
                if (this.f337f != 0) {
                    if (this.f362a[i3] != null) {
                        iD2 = this.f362a[i3][0].getWidth() + 4;
                        iE2 = ((this.f362a[i3][0].getHeight() - 1) / (this.B + 2)) + 1;
                    }
                    if (this.f363a[i3] != null) {
                        iD2 = this.f363a[i3].d() + 4;
                        iE2 = ((this.f363a[i3].e() - 1) / (this.B + 2)) + 1;
                    }
                    this.f359h[i3] = iE2;
                }
                if (this.f337f == 0) {
                    i4 += iD;
                }
                String[] strArrA = this.f365a[i3];
                if (this.f364b[i3] != null) {
                    if (this.f337f == 0) {
                        strArrA = new String[]{this.f364b[i3]};
                    } else {
                        int i9 = (this.k - 4) - i4;
                        f382d = this.f349c;
                        strArrA = a(this.f364b[i3], i9, iD2, iE2);
                    }
                }
                if (strArrA != null) {
                    int iMax4 = 0;
                    for (int i10 = 0; i10 < strArrA.length; i10++) {
                        int iA = this.f349c.a(strArrA[i10]);
                        if (i10 < iE2) {
                            iA += iD2;
                        }
                        iMax4 = Math.max(iMax4, iA);
                    }
                    this.f360i[i3] = Math.min(iMax4, (this.k - i4) - 4) + 4;
                    i4 += this.f360i[i3];
                    iMax = Math.max(iMax, (i3 == -2 || this.f337f == 0) ? this.B + 8 : (this.B * strArrA.length) + (2 * strArrA.length));
                    this.f364b[i3] = null;
                    this.f365a[i3] = strArrA;
                } else if (this.f362a[i3] == null && this.f363a[i3] == null) {
                    iMax = 0;
                }
                if (this.f337f != 0 && strArrA == null) {
                    i4 += iD;
                }
                if (this.f356e[i3] == 5 || this.f356e[i3] == 4) {
                    i4 = this.k;
                }
                if (this.f337f == 0 && iMax > 0) {
                    iMax = this.n;
                }
                this.f358g[(i3 * 4) + 2] = i4;
                this.f358g[(i3 * 4) + 3] = iMax;
            }
            i3++;
        }
    }

    public final void a() {
        d.b();
        if (this.J != -1 && this.f356e[this.J] == 3) {
            d.b(3, 0);
        } else if (this.f348c[0] != -1) {
            d.b(this.f348c[0], 0);
        }
        if (this.f348c[1] != -1) {
            d.b(this.f348c[1], 0);
        }
        if (this.f337f != 0) {
            this.o = 0;
        }
        this.E = 0;
        this.M = 0;
    }

    public final void b() {
        this.J = m109b(-1);
        this.o = 0;
    }

    private void e() {
        if (this.f356e != null) {
            for (int i = 0; i < this.h; i++) {
                a(i);
            }
        }
        this.f352a = null;
        this.f353b = null;
        this.f354g = null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int[] m105a(int i) {
        if (this.w > 0) {
            this.w -= i;
        }
        this.z += i;
        if (this.f342d != 0 && this.q > this.l) {
            this.p += i;
            int i2 = (this.p * (this.B + 2)) / this.a;
            this.p -= (i2 * this.a) / (this.B + 2);
            if (this.f342d == 2) {
                this.o -= i2;
            } else if (this.f342d == 1) {
                this.o += i2;
            }
            this.o = Math.max(this.o, 0);
            this.o = Math.min(this.o, this.q - this.l);
        }
        if (this.f350c && this.f352a != null) {
            d(i);
        }
        for (int i3 = 0; i3 < this.h; i3++) {
            g(i3, i);
        }
        if (!this.f340a) {
            return null;
        }
        this.f340a = false;
        return this.f341a;
    }

    public final void a(Graphics graphics, int i, int i2) {
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        if (this.f337f == 2) {
            graphics.setColor(DCWall.a == 3 ? f.f196b[f.f195c][0] : 8947848);
            graphics.fillRect(i + 6, i2 + 6, this.g, this.f339c);
        }
        graphics.setClip(i, i2, this.g, this.f339c);
        if (this.f350c && this.f335d != f334c) {
            graphics.setClip(0, 0, this.g, this.G);
            a(graphics);
            graphics.setClip(0, 0, d.d(), d.a());
        }
        if (this.f335d == f332a) {
            if (this.f337f == 2) {
                b(graphics, i, i2);
            } else {
                a(graphics);
            }
        } else if (this.f335d == f333b) {
            graphics.setColor(16777215);
            graphics.fillRect(0, 0, d.d(), d.a());
        }
        if (this.f350c) {
            a(graphics, i + this.f355d[0], i2 + this.f355d[1], this.f355d[3]);
        }
        if ((this.A & 2) != 0 && this.q < this.l) {
            i2 += (this.l - this.q) >> 1;
        }
        if (this.f337f == 0) {
            for (int i3 = 0; i3 < this.h; i3++) {
                int i4 = i + this.i + this.f358g[(i3 * 4) + 0];
                int i5 = this.f358g[(i3 * 4) + 1] - this.o;
                int i6 = this.f358g[(i3 * 4) + 2];
                int i7 = this.f358g[(i3 * 4) + 3];
                if (i5 >= 0 && i5 + i7 <= this.l) {
                    int i8 = i5 + i2 + this.j;
                    graphics.setClip(i + this.i, i2 + this.j, this.k, this.l);
                    c(graphics, i3, i4, i8, i6, i7);
                }
            }
        } else {
            for (int i9 = 0; i9 < this.h; i9++) {
                int i10 = this.i + this.f358g[(i9 * 4) + 0];
                int i11 = (this.j + this.f358g[(i9 * 4) + 1]) - this.o;
                int i12 = this.f358g[(i9 * 4) + 2];
                int i13 = this.f358g[(i9 * 4) + 3];
                if (i11 + i13 >= this.j && i11 < this.j + this.l) {
                    graphics.setClip(i + this.i, i2 + this.j, this.k, this.l);
                    c(graphics, i9, i + i10, i2 + i11, i12, i13);
                }
            }
        }
        boolean z = this.o > 0;
        boolean z2 = this.o + this.l < this.q;
        if (z) {
            int i14 = i + this.r;
            int i15 = i2 + this.s;
            int width = i14 - (f336a.getWidth() >> 1);
            int height = i15 - (f336a.getHeight() >> 1);
            graphics.setClip(width, height, f336a.getWidth(), f336a.getHeight() >> 1);
            graphics.drawImage(f336a, width, height, 20);
        }
        if (z2) {
            int i16 = i + this.r;
            int i17 = i2 + this.t;
            int width2 = i16 - (f336a.getWidth() >> 1);
            int height2 = i17 - (f336a.getHeight() >> 1);
            graphics.setClip(width2, height2, f336a.getWidth(), f336a.getHeight() >> 1);
            graphics.drawImage(f336a, width2, height2 - (f336a.getHeight() >> 1), 20);
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    public final void c(int i, int i2) {
        int i3 = -1;
        if (!this.f340a) {
            switch (i2) {
                case 0:
                    int iM28a = d.m28a(i);
                    if (!this.f346b) {
                        if (this.f337f == 0 && (this.f356e[this.J] == 4 || this.f356e[this.J] == 5)) {
                            int i4 = this.f371n[this.J];
                            if (iM28a == 52) {
                                int[] iArr = this.f371n;
                                int i5 = this.J;
                                iArr[i5] = iArr[i5] - 1;
                            } else if (iM28a == 54) {
                                int[] iArr2 = this.f371n;
                                int i6 = this.J;
                                iArr2[i6] = iArr2[i6] + 1;
                            }
                            if (this.f356e[this.J] == 4) {
                                this.f371n[this.J] = Math.max(Math.min(this.f371n[this.J], this.f372o[this.J] - 1), 0);
                            } else {
                                this.f371n[this.J] = (this.f371n[this.J] + this.f372o[this.J]) % this.f372o[this.J];
                            }
                            if (this.f371n[this.J] != i4) {
                                i3 = 1;
                            }
                        }
                        if (iM28a != 53) {
                            if (iM28a != 50) {
                                if (iM28a == 56) {
                                    if (this.f337f != 0) {
                                        this.f342d = 1;
                                    } else {
                                        int iM109b = m109b(this.J);
                                        if (iM109b != -1) {
                                            b(iM109b);
                                            a();
                                        }
                                    }
                                }
                            } else if (this.f337f != 0) {
                                this.f342d = 2;
                            } else {
                                int iM110c = m110c(this.J);
                                if (iM110c != -1) {
                                    b(iM110c);
                                    a();
                                }
                            }
                        } else if (this.f337f != 0) {
                            i3 = 0;
                            i = this.f348c[0];
                        } else if (this.f356e[this.J] == 0) {
                            i3 = 1;
                        } else if (this.f356e[this.J] == 5 || this.f356e[this.J] == 4) {
                            this.f371n[this.J] = (this.f371n[this.J] + 1) % this.f372o[this.J];
                            i3 = 1;
                        } else if (this.f356e[this.J] == 3) {
                            a(!this.f346b);
                            if (!this.f346b) {
                                i3 = 1;
                            }
                        }
                    } else if (i >= 48 && i <= 57) {
                        int i7 = this.f343b[this.J];
                        int i8 = i - 48;
                        if (i == this.y && this.w > 0 && f347a[i7][i8].length > 1) {
                            this.x++;
                            if (this.x >= f347a[i7][i8].length) {
                                this.x = 0;
                            }
                            this.f344a[this.J].setCharAt(this.v - 1, f347a[i7][i8][this.x]);
                        } else if (this.f344a[this.J].length() < this.f344a[this.J].capacity()) {
                            this.x = 0;
                            this.f344a[this.J].insert(this.v, f347a[i7][i8][this.x]);
                            this.v++;
                        }
                        this.w = 750;
                        this.y = i;
                    } else if (iM28a != 52) {
                        if (iM28a != 54) {
                            if (iM28a == 53) {
                                a(!this.f346b);
                            } else if (i == -8 && this.v > 0) {
                                StringBuffer stringBuffer = this.f344a[this.J];
                                int i9 = this.v - 1;
                                this.v = i9;
                                stringBuffer.deleteCharAt(i9);
                            }
                        } else if (this.f346b) {
                            this.v = Math.min(this.v + 1, this.f344a[this.J].length());
                        }
                    } else if (this.f346b) {
                        this.v = Math.max(this.v - 1, 0);
                    }
                    break;
                case 1:
                    this.f342d = 0;
                    break;
                case 3:
                    if (this.f337f != 0) {
                        i3 = 0;
                    } else {
                        if (i == 3 && this.f356e[this.J] == 3) {
                            a(true);
                        } else if (i == 1 && this.f346b) {
                            a(false);
                        } else if (i == 8 && this.f346b && this.v > 0) {
                            StringBuffer stringBuffer2 = this.f344a[this.J];
                            int i10 = this.v - 1;
                            this.v = i10;
                            stringBuffer2.deleteCharAt(i10);
                        }
                        if (i == this.f348c[0]) {
                            if (this.f356e[this.J] == 4 || this.f356e[this.J] == 5) {
                                this.f371n[this.J] = (this.f371n[this.J] + 1) % this.f372o[this.J];
                            }
                            i3 = 1;
                        } else if (i == this.f348c[1]) {
                            i3 = 0;
                        }
                    }
                    break;
            }
        }
        if (i3 != -1) {
            this.f340a = true;
            this.f341a[0] = i3;
            if (i3 != 1) {
                this.f341a[1] = i;
            } else if (this.f366k[this.J] == 0 || DCWall.f36b) {
                this.f341a[1] = this.f357f[this.J];
            } else {
                this.f340a = false;
            }
        }
    }

    public final void b(int i) {
        this.J = i;
        this.M = 0;
        this.K = 0;
        this.L = 0;
        if (this.q > this.l) {
            int i2 = this.o / this.n;
            int i3 = this.q / this.n;
            int i4 = this.f358g[(i * 4) + 1] / this.n;
            this.o = Math.min(Math.max(Math.min(Math.max(i2, i4 - (this.m >> 1)), i4 - ((this.m - 1) >> 1)), 0), i3 - this.m) * this.n;
        } else {
            this.o = 0;
        }
        this.L = 0;
        this.K = 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m106a() {
        return this.J;
    }

    public final void d(int i, int i2) {
        this.f366k[i] = i2;
    }

    public final void e(int i, int i2) {
        this.f371n[i] = i2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m107a(int i) {
        return this.f371n[i];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String m108a(int i) {
        if (this.f356e[i] == 3) {
            return this.f344a[i].toString();
        }
        return null;
    }

    private void a(b bVar) {
        this.f349c = bVar;
        this.B = bVar.a();
    }

    public static void a(b bVar, b bVar2) {
        f328a = bVar;
        e = f328a.a();
        b = bVar2;
    }

    private static String[] a(String str, int i, int i2, int i3) {
        char[] cArr = {'.', '/'};
        int i4 = 0;
        int i5 = 0;
        int length = str.length();
        Vector vector = new Vector();
        int i6 = 0;
        while (i5 < length) {
            int iIndexOf = str.indexOf("\\n", i4);
            i5 = iIndexOf;
            if (iIndexOf == -1) {
                i5 = length;
            }
            boolean z = false;
            while (!z) {
                int i7 = i4;
                int iA = 0;
                int i8 = -1;
                int i9 = i;
                if (i6 < i3) {
                    i9 -= i2;
                }
                while (iA < i9 && i7 < i5) {
                    char cCharAt = str.charAt(i7);
                    iA += f382d.a(cCharAt);
                    i7++;
                    if (cCharAt == ' ') {
                        i8 = i7;
                    }
                }
                if (i7 == i5 && iA <= i9) {
                    z = true;
                } else if (i8 != -1) {
                    i7 = i8 - 1;
                } else {
                    i7--;
                    for (int i10 = i7; i10 > i4; i10--) {
                        char cCharAt2 = str.charAt(i10);
                        int length2 = cArr.length;
                        while (true) {
                            length2--;
                            if (length2 >= 0) {
                                if (cCharAt2 == cArr[length2]) {
                                    i7 = i10 + 1;
                                    break;
                                }
                            }
                        }
                    }
                }
                vector.addElement(str.substring(i4, i7));
                i6++;
                if (z && i7 < length) {
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
        f382d = null;
        return strArr;
    }

    private static String[] a(String str, b bVar, int i) {
        f382d = bVar;
        return a(str, i, 0, 0);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private int m109b(int i) {
        int i2 = this.h;
        do {
            i = (i + 1) % this.h;
            int i3 = i2;
            i2 = i3 - 1;
            if (i3 <= 0) {
                return -1;
            }
        } while (!m111a(i));
        return i;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private int m110c(int i) {
        if (i == -1) {
            i = 0;
        }
        int i2 = this.h;
        do {
            i = ((i + this.h) - 1) % this.h;
            int i3 = i2;
            i2 = i3 - 1;
            if (i3 <= 0) {
                return -1;
            }
        } while (!m111a(i));
        return i;
    }

    private void a(boolean z) {
        if (!z) {
            this.f346b = false;
            b(this.J);
            a();
        } else {
            this.f346b = true;
            d.b();
            d.b(1, 0);
            d.b(8, 0);
            this.v = this.f344a[this.J].length();
        }
    }

    private void a(int i, String[] strArr, Image[] imageArr, int i2, int i3) {
        if (this.f371n == null) {
            this.f371n = new int[this.h];
            this.f372o = new int[this.h];
            this.f369b = new String[this.h][];
            this.f370b = new Image[this.h][];
            this.f373b = new a[this.h];
        }
        this.f369b[i] = strArr;
        this.f371n[i] = i2;
        this.f372o[i] = i3;
        this.f370b[i] = imageArr;
    }

    private void a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        a aVar;
        Image image = null;
        if (i == -2) {
            image = this.f353b;
        } else if (this.f362a[i] != null) {
            if (this.f366k[i] == 0) {
                image = this.J == i ? this.f362a[i][1] : this.f362a[i][0];
            } else if (this.f366k[i] == 1) {
                image = this.f362a[i][2];
            }
        }
        if (image != null) {
            int width = i2 + ((i4 - image.getWidth()) >> 1);
            int height = i3;
            if (this.f337f == 0) {
                height += (i5 - image.getHeight()) >> 1;
            } else if (i != -2 && this.f365a[i] != null && this.f365a[i].length > this.f359h[i]) {
                int i6 = (this.f359h[i] * (this.B + 2)) - 2;
                if (image.getHeight() > i6) {
                    i6 += 2;
                }
                height += (i6 - image.getHeight()) >> 1;
            }
            graphics.drawImage(image, width, height, 20);
        }
        int i7 = -1;
        if (i == -2) {
            aVar = this.f354g;
            i7 = 0;
        } else {
            a aVar2 = this.f363a[i];
            aVar = aVar2;
            if (aVar2 != null) {
                if (this.f366k[i] == 0) {
                    i7 = this.J == i ? 1 : 0;
                } else if (this.f366k[i] == 1) {
                    i7 = 2;
                }
                if (i7 != -1 && this.f337f != 0 && i7 != aVar.f47a) {
                    aVar.a(i7, true, true);
                }
            }
        }
        if (aVar == null || i7 == -1) {
            return;
        }
        if (i7 != aVar.f47a) {
            aVar.a(i7, true, true);
        }
        int iD = i2 + ((i4 - aVar.d()) >> 1);
        int iE = i3;
        if (this.f337f == 0) {
            iE += (i5 - aVar.e()) >> 1;
        } else if (i != -2 && this.f365a[i] != null && this.f365a[i].length > this.f359h[i]) {
            int i8 = (this.f359h[i] * (this.B + 2)) - 2;
            if (aVar.e() > i8) {
                i8 += 2;
            }
            iE += (i8 - aVar.e()) >> 1;
        }
        aVar.a(graphics, iD + aVar.b(), iE + aVar.c());
    }

    private void b(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6;
        b bVar;
        String[] strArr = i == -2 ? this.f352a : this.f365a[i];
        if (strArr != null) {
            int iMin = i2 + 2;
            if (i == -2) {
                i6 = e;
                bVar = f328a;
            } else {
                i6 = this.B;
                bVar = this.f349c;
            }
            if (i == this.J || i == -2) {
                graphics.setColor(0);
            } else if (this.f366k[i] == 0) {
                graphics.setColor(this.f338b);
            } else if (this.f366k[i] == 1) {
                graphics.setColor(8355711);
            }
            if (i == -2 || this.f337f == 0) {
                int i7 = i3 + ((i5 - i6) >> 1);
                int iA = bVar.a(strArr[0]);
                boolean z = iA <= i4 - 4;
                int clipX = graphics.getClipX();
                int clipY = graphics.getClipY();
                int clipWidth = graphics.getClipWidth();
                int clipHeight = graphics.getClipHeight();
                if (!z) {
                    int i8 = clipX + clipWidth;
                    int i9 = clipY + clipHeight;
                    int iMax = Math.max(clipX, iMin);
                    int iMax2 = Math.max(clipY, i3);
                    graphics.setClip(iMax, iMax2, Math.max(iMax, Math.min(i8, iMin + (i4 - 4))) - iMax, Math.max(iMax2, Math.min(i9, i3 + i5)) - iMax2);
                    if (i == -2) {
                        if (this.D >= 0) {
                            iMin -= Math.min(iA - (this.H - 4), this.D);
                        }
                    } else if (i == this.J && this.K >= 0) {
                        iMin -= Math.min(iA - (this.f360i[i] - 4), this.K);
                    }
                }
                bVar.a(graphics, strArr[0], iMin, i7, 20);
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
                return;
            }
            int i10 = i6 + 2;
            int clipY2 = graphics.getClipY();
            int clipHeight2 = graphics.getClipHeight();
            int i11 = i3 < clipY2 ? (clipY2 - i3) / i10 : 0;
            int i12 = (clipY2 + clipHeight2) - (i3 + (i11 * i10));
            int iMin2 = Math.min(i11 + (i12 == 0 ? 0 : ((i12 - 1) / i10) + 1), this.f365a[i].length);
            int i13 = 0;
            int i14 = 0;
            if (this.f337f != 0) {
                i13 = this.f361j[i];
                i14 = this.f359h[i];
            }
            for (int i15 = i11; i15 < iMin2; i15++) {
                String str = this.f365a[i][i15];
                int iA2 = iMin;
                int i16 = i3 + (i10 * i15);
                if (i15 < i14) {
                    iA2 += i13;
                } else if ((this.A & 1) != 0) {
                    iA2 += ((i4 - bVar.a(str)) >> 1) - 2;
                }
                bVar.a(graphics, str, iA2, i16, 20);
            }
        }
    }

    private void a(Graphics graphics, int i, int i2, int i3) {
        int i4 = this.H;
        int i5 = this.I;
        a(graphics, -2, i, i2, i5, i3);
        b(graphics, -2, i + i5, i2, i4, i3);
    }

    private void c(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6 = this.f360i[i];
        int i7 = this.f361j[i];
        if (this.f337f != 0 && i6 > 0) {
            i7 = 0;
        }
        if (this.f337f == 0 && i == this.J) {
            int iD = d.d();
            int iA = d.a();
            graphics.setColor(8975103);
            int clipX = graphics.getClipX();
            int clipY = graphics.getClipY();
            int clipWidth = graphics.getClipWidth();
            int clipHeight = graphics.getClipHeight();
            graphics.setClip(0, 0, iD, iA);
            graphics.fillRect(2, i3, iD - 4, i5);
            graphics.setClip(clipX, clipY, clipWidth, clipHeight);
        }
        if (this.f356e[i] == 3) {
            i5 -= this.u;
        }
        if (this.f356e[i] == 6) {
            b(graphics, i, i2, i3);
            return;
        }
        a(graphics, i, i2, i3, this.f361j[i], i5);
        b(graphics, i, i2 + i7, i3, i6, i5);
        if (this.f356e[i] == 5) {
            f(graphics, i, i2, i3, i4, i5);
        }
        if (this.f356e[i] == 4) {
            e(graphics, i, i2, i3, i4, i5);
        }
        if (this.f356e[i] == 3) {
            d(graphics, i, i2 + 2, i3 + i5, this.k - 4, this.u - 4);
        }
    }

    private void d(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.f346b && this.J == i) {
            i6 = 10748416;
            i7 = 16747008;
            i8 = 16777215;
            i9 = 9372160;
        } else {
            i6 = 16777215;
            i7 = 3355443;
            i8 = 11711154;
            i9 = 4325632;
        }
        graphics.setColor(i6);
        graphics.drawRect(i2, i3, i4 - 1, i5 - 1);
        graphics.setColor(i7);
        graphics.drawRect(i2 + 1, i3 + 1, i4 - 3, i5 - 3);
        graphics.setColor(i8);
        graphics.fillRect(i2 + 2, i3 + 2, i4 - 4, i5 - 4);
        graphics.setColor(i9);
        boolean z = this.z % 1000 > 500;
        int iA = i2 + 4;
        int i10 = i3 + 2;
        int i11 = i4 - 8;
        this.f344a[i].getChars(0, this.f344a[i].length(), this.f345a, 0);
        int i12 = 0;
        int iA2 = this.f343b[i] == 1 ? 0 + this.f349c.a('+') : 0;
        for (int i13 = 0; i13 < this.f344a[i].length(); i13++) {
            iA2 += this.f349c.a(this.f345a[i13]);
            if (i13 == this.v - 1) {
                i12 = iA2;
            }
        }
        if (this.f346b && i == this.J) {
            iA2 += this.f349c.a('_');
        }
        boolean z2 = iA2 <= i11;
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        if (!z2) {
            int i14 = clipX + clipWidth;
            int iMax = Math.max(clipX, iA);
            graphics.setClip(iMax, clipY, Math.max(iMax, Math.min(i14, iA + i11)) - iMax, clipHeight);
            if (this.f346b && i == this.J) {
                iA -= Math.max(Math.min((i12 + (i11 >> 1)) - i11, iA2 - i11), 0);
            }
        }
        if (this.f343b[i] == 1) {
            this.f349c.a(graphics, '+', iA, i10, 20);
            iA += this.f349c.a('+');
        }
        int iA3 = iA;
        for (int i15 = 0; i15 < this.f344a[i].length(); i15++) {
            this.f349c.a(graphics, this.f345a[i15], iA3, i10, 20);
            iA3 += this.f349c.a(this.f345a[i15]);
        }
        if (this.f346b && i == this.J && z && this.w <= 0 && this.v < this.f344a[i].capacity()) {
            for (int i16 = 0; i16 < this.v; i16++) {
                iA += this.f349c.a(this.f345a[i16]);
            }
            this.f349c.a(graphics, '_', iA, i10, 20);
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    private void e(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i2 + i4) - this.f367l[i]) - this.f368m[i];
        int i7 = this.f372o[i] - 1;
        int i8 = this.f371n[i];
        for (int i9 = 1; i9 <= i7; i9++) {
            int i10 = i6 + ((i9 - 1) * 7) + 2;
            int i11 = i3 + ((i5 + this.B) >> 1);
            int i12 = (this.B / i7) * i9;
            if (i8 >= i9) {
                graphics.setColor(16777215);
            } else {
                graphics.setColor(0);
            }
            graphics.fillRect(i10, i11 - i12, 6, i12);
        }
    }

    private void f(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        String str;
        Image image;
        int i6 = this.f367l[i];
        int i7 = this.f368m[i];
        int i8 = ((i2 + i4) - i6) - i7;
        int i9 = this.f371n[i];
        if (this.f370b[i] != null && (image = this.f370b[i][i9]) != null) {
            graphics.drawImage(image, i8 + (i7 >> 1), i3 + (i5 >> 1), 3);
        }
        if (this.f373b[i] != null) {
            a aVar = this.f373b[i];
            if (i9 != aVar.f47a) {
                aVar.a(i9, true, true);
            }
            aVar.a(graphics, i8 + aVar.b() + ((i7 - aVar.d()) >> 1), i3 + aVar.c() + ((i5 - aVar.e()) >> 1));
        }
        if (this.f369b[i] == null || (str = this.f369b[i][i9]) == null) {
            return;
        }
        this.f349c.a(graphics, str, i8 + i7 + 2, i3 + ((i5 - this.B) >> 1), 20);
    }

    private void b(Graphics graphics, int i, int i2, int i3) {
        int[] iArr = this.f380c[i];
        int[] iArr2 = this.f381d[i];
        int[] iArr3 = this.f375b[i];
        int length = iArr.length;
        int length2 = iArr2.length;
        graphics.setColor(0);
        int i4 = i3;
        int i5 = 0;
        for (int i6 = 0; i6 < length2; i6++) {
            int i7 = iArr2[i6] - 2;
            int i8 = i2 + 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = iArr[i9] - 4;
                int i11 = iArr3[i9];
                int width = i8 + 2;
                int height = i4;
                if (this.f378a[i] != null && this.f378a[i][i5] != null) {
                    a aVar = this.f378a[i][i5];
                    if ((i11 & 1) != 0) {
                        width += (i10 - aVar.d()) >> 1;
                    } else if ((i11 & 4) != 0) {
                        width += i10 - aVar.d();
                    }
                    if ((i11 & 2) != 0) {
                        height += (i7 - aVar.e()) >> 1;
                    } else if ((i11 & 8) != 0) {
                        height += i7 - aVar.e();
                    }
                    aVar.a(graphics, width + aVar.b(), height + aVar.c());
                } else if (this.f377c[i] != null && this.f377c[i][i5] != null) {
                    Image image = this.f377c[i][i5];
                    if ((i11 & 1) != 0) {
                        width += (i10 - image.getWidth()) >> 1;
                    } else if ((i11 & 4) != 0) {
                        width += i10 - image.getWidth();
                    }
                    if ((i11 & 2) != 0) {
                        height += (i7 - image.getHeight()) >> 1;
                    } else if ((i11 & 8) != 0) {
                        height += i7 - image.getHeight();
                    }
                    graphics.drawImage(image, width, height, 20);
                } else if (this.f379a[i] != null && this.f379a[i][i5] != null) {
                    String[] strArr = this.f379a[i][i5];
                    int length3 = strArr.length * this.B;
                    if ((i11 & 2) != 0) {
                        height += (i7 - length3) >> 1;
                    } else if ((i11 & 8) != 0) {
                        height += i7 - length3;
                    }
                    int i12 = height;
                    for (String str : strArr) {
                        int i13 = width;
                        if ((i11 & 5) != 0) {
                            int iA = this.f349c.a(str);
                            if ((i11 & 1) != 0) {
                                i13 += (i10 - iA) >> 1;
                            } else if ((i11 & 4) != 0) {
                                i13 += i10 - iA;
                            }
                        }
                        this.f349c.a(graphics, str, i13, i12, 20);
                        i12 += this.B;
                    }
                }
                i8 += iArr[i9];
                i9++;
                i5++;
            }
            i4 += iArr2[i6];
        }
    }

    private void b(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 <= 0) {
            this.N = 0;
            return;
        }
        int i5 = i4 + 25;
        this.P -= i;
        while (this.P < 0) {
            if (this.O == 1) {
                this.N++;
            } else {
                this.N--;
            }
            if (this.N > i5) {
                this.N = i5;
                this.O = 0;
            } else if (this.N < -25) {
                this.N = -25;
                this.O = 1;
            }
            this.P += 40;
        }
    }

    private void d(int i) {
        if (this.f354g != null) {
            this.f354g.m12a(i);
        }
        if (this.f352a != null) {
            this.P = this.E;
            this.N = this.D;
            this.O = this.F;
            b(i, f328a.a(this.f352a[0]), this.H - 4);
            this.D = this.N;
            this.F = this.O;
            this.E = this.P;
        }
    }

    private void g(int i, int i2) {
        if (this.f363a[i] != null && this.f363a[i] != null) {
            this.f363a[i].m12a(i2);
        }
        if (this.f373b != null && this.f373b[i] != null) {
            this.f373b[i].m12a(i2);
        }
        if (this.f378a != null && this.f378a[i] != null) {
            for (int i3 = 0; i3 < this.f378a[i].length; i3++) {
                a aVar = this.f378a[i][i3];
                if (aVar != null) {
                    aVar.m12a(i2);
                }
            }
        }
        if (i != this.J || this.f365a[i] == null) {
            return;
        }
        this.P = this.M;
        String[] strArr = this.f365a[i];
        if (strArr != null) {
            this.N = this.K;
            this.O = this.L;
            b(i2, this.f349c.a(strArr[0]), this.f360i[i] - 4);
            this.K = this.N;
            this.L = this.O;
        }
        this.M = this.P;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m111a(int i) {
        return this.f356e[i] == 0 || this.f356e[i] == 3 || this.f356e[i] == 4 || this.f356e[i] == 5;
    }

    private void b(Graphics graphics, int i, int i2) {
        int i3 = 13421772;
        if (DCWall.a == 3) {
            i3 = f.f196b[f.f195c][3];
        }
        graphics.setColor(i3);
        graphics.fillRect(i, i2, this.g, this.f339c);
        graphics.setColor(16777215);
        graphics.fillRect(i - 1, i2, this.g + 2, 1);
        graphics.fillRect(i, (i2 + this.f339c) - 1, this.g + 2, 1);
        graphics.fillRect(i, i2, 1, this.f339c);
        graphics.fillRect((i + this.g) - 1, i2, 1, this.f339c);
    }

    public static void a(Graphics graphics) {
        int iD = d.d();
        int iA = d.a();
        graphics.setColor(47851);
        graphics.fillRect(0, 0, iD, iA);
        int iD2 = f331e.d();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= iD) {
                f330b.a(graphics, 0, 0);
                f329a.a(graphics, 0, iA);
                d.a(graphics, iD, 0);
                c.a(graphics, iD, iA);
                return;
            }
            f.a(graphics, i2, 0);
            f331e.a(graphics, i2, iA);
            i = i2 + iD2;
        }
    }
}
