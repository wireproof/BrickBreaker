package defpackage;

import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:v.class */
public final class v {
    r b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    byte[] f166b;
    private short[] a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    short[] f167b;
    byte[] c;
    int cK = -1;
    int cW = -1;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    e f168c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private short[] f169c;
    private short[] d;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    e[] f170b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    short[][] f171a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private short[][] f172b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private short[][] f173c;
    private int cX;
    private int cY;
    private int cZ;
    private int da;
    private int db;
    private boolean aa;
    private boolean ab;
    private short[] e;
    private int dc;
    int cH;
    int cI;
    int dd;
    int de;
    private int df;
    boolean ac;
    short[] f;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    byte[] f174d;
    private boolean[] k;
    boolean ad;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    long f175a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static Hashtable f176a;
    int dg;
    private int dh;
    boolean ae;

    public v(int i, r rVar) {
        a(i, rVar);
    }

    final boolean g() {
        return this.dg >= 2 && this.dg <= 4;
    }

    private void a(int i, r rVar) {
        this.b = rVar;
        byte[] bArrA = ba.a(i);
        this.f166b = bArrA;
        int i2 = bArrA[0] & 255;
        int i3 = 2;
        this.a = new short[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3;
            int i6 = i3 + 1;
            i3 = i6 + 1;
            this.a[i4] = (short) (((bArrA[i5] & 255) << 8) | (bArrA[i6] & 255));
        }
        int i7 = i3;
        int i8 = i3 + 1;
        this.k = new boolean[bArrA[i7] & 255];
        int i9 = i8 + 1;
        this.cX = bArrA[i8] & 255;
        this.cY = this.cX;
        int i10 = i9 + 1;
        this.cZ = bArrA[i9] & 255;
        this.da = this.cY + this.cZ;
        int i11 = i10 + 1;
        int i12 = bArrA[i10] & 255;
        int i13 = this.cX + this.cZ + i12;
        this.c = new byte[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i11;
            i11++;
            this.c[i14] = bArrA[i15];
        }
        this.f167b = new short[i13];
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = i11;
            int i18 = i11 + 1;
            i11 = i18 + 1;
            this.f167b[i16] = (short) (((bArrA[i17] & 255) << 8) | (bArrA[i18] & 255));
        }
        this.cW = bArrA[i11] & 255;
        this.f170b = new e[this.cX];
        this.f171a = new short[this.cX][];
        this.f172b = new short[this.cZ][];
        this.f173c = new short[i12][];
        this.f174d = new byte[this.cX];
        int i19 = this.cX;
        int i20 = 0;
        while (i20 < this.cZ) {
            u(i19);
            i20++;
            i19++;
        }
        int i21 = 0;
        while (i21 < i12) {
            int i22 = i19;
            byte[] bArr = this.f166b;
            short s = this.f167b[this.cX + this.cZ + (i22 - this.da)];
            this.f173c[i22 - this.da] = new short[]{a(bArr[s]), a(bArr[s + 1])};
            i21++;
            i19++;
        }
        this.db = i12;
        this.e = new short[this.cX + i12 + this.cZ];
        this.dc = 0;
        this.ab = false;
    }

    final void D() {
        int i = this.dg;
        do {
            switch (i) {
                case 1:
                    if (this.cK != -1) {
                        if (this.ae) {
                            this.ae = false;
                            int i2 = this.cX;
                            while (true) {
                                i2--;
                                if (i2 >= 0) {
                                    w(i2);
                                } else {
                                    f176a = null;
                                    this.f168c = null;
                                }
                            }
                        }
                        byte b = this.c[this.cW];
                        byte b2 = this.cK != -1 ? this.c[this.cK] : (byte) -1;
                        byte b3 = b2;
                        if (b2 != -1) {
                            if (b3 != b && !r.a(b3, b)) {
                                int length = this.k.length;
                                while (true) {
                                    length--;
                                    if (length >= 0) {
                                        if (this.k[length] && length != b) {
                                            this.b.r(length);
                                            int length2 = this.c.length;
                                            while (true) {
                                                length2--;
                                                if (length2 < 0) {
                                                    this.k[length] = false;
                                                } else if (this.c[length2] == length && i(length2)) {
                                                    w(length2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (i(this.cK)) {
                            w(this.cK);
                        }
                        this.f168c = null;
                        this.f169c = null;
                        this.d = null;
                        ba.U();
                    }
                    break;
                case 4:
                    byte b4 = this.c[this.cW];
                    if (b4 != -1) {
                        this.k[b4] = true;
                    }
                    f176a = null;
                    this.b.a(this.cW, false);
                    int i3 = this.cK;
                    this.cK = this.cW;
                    this.cW = -1;
                    int i4 = this.dc;
                    while (true) {
                        i4--;
                        if (i4 >= 0) {
                            if (this.e[i4] == this.cK) {
                                this.dc = i4;
                            }
                        }
                    }
                    int i5 = this.cK;
                    if (i(i5)) {
                        this.f168c = this.f170b[i5];
                        if (this.aa) {
                            this.f168c.g(0);
                        } else {
                            this.f168c.g(this.f174d[this.cK] & 255);
                        }
                        this.b.a(i5, this.f168c, 2);
                        this.f168c.d();
                        this.b.a(i5, this.f168c, 3);
                        this.ab = r.g(i5);
                    } else if (i5 >= this.cY && i5 < this.cY + this.cZ) {
                        if (this.f172b[i5 - this.cY] == null) {
                            u(i5);
                        }
                        this.f169c = this.f172b[i5 - this.cY];
                        this.ab = r.g(i5);
                    } else {
                        t(i5);
                    }
                    this.b.a(i3, this.cK, this.f168c);
                    break;
                case 5:
                    this.dg = 0;
                    return;
            }
            i++;
        } while (!(i == 3 ? this.cH > 0 : false));
        switch (i) {
            case 3:
                this.b.a(this.cW, true);
                this.cI = 0;
                this.ac = false;
                ba.U();
                break;
        }
        this.dg = i;
    }

    final void E() {
        this.dh = this.cK;
        while (true) {
            int i = this.cW;
            int i2 = this.cY + this.cZ;
            if (!(i >= i2 && i < i2 + this.db)) {
                break;
            }
            this.cK = this.cW;
            t(this.cW);
            if (this.b.e(this.cW)) {
                v(this.d[0]);
            } else {
                v(this.d[1]);
            }
        }
        this.cK = this.dh;
        this.dd = 0;
        byte b = this.c[this.cW];
        byte b2 = -1;
        if (!this.ae && this.cK != -1) {
            b2 = this.c[this.cK];
        }
        if (b == -1 || b == b2) {
            int i3 = this.cW;
            if (i(i3) && this.f170b[i3] == null) {
                this.f = new short[]{(short) i3};
            } else {
                this.f = new short[0];
            }
        } else {
            if (!r.a(b, b2)) {
                this.dd = this.b.k(b);
            }
            Vector vector = new Vector();
            for (int i4 = 0; i4 < this.c.length; i4++) {
                if (this.c[i4] == b && i(i4) && ((this.f170b[i4] == null || this.ae) && r.f(i4))) {
                    vector.addElement(new Short((short) i4));
                }
            }
            int size = vector.size();
            this.f = new short[size];
            for (int i5 = 0; i5 < size; i5++) {
                this.f[i5] = ((Short) vector.elementAt(i5)).shortValue();
            }
        }
        this.de = this.b.l(this.cW);
        this.cH = this.dd + this.de + this.f.length;
        this.df = 75;
        D();
    }

    private boolean i(int i) {
        return i < this.cX;
    }

    private void t(int i) {
        this.d = this.f173c[i - this.da];
        this.ab = false;
    }

    static int a(byte[] bArr, int i, int i2, Image[][] imageArr, ay[] ayVarArr) {
        imageArr[0] = null;
        ayVarArr[0] = null;
        int[] iArr = new int[i2];
        byte[] bArr2 = new byte[i2];
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = a(bArr, i);
            int i4 = i + 4;
            z2 = z2 || iArr[i3] != -1;
            i = i4 + 1;
            bArr2[i3] = bArr[i4];
            z = z || bArr2[i3] == 2 || bArr2[i3] == 3;
        }
        if (z2) {
            if (z) {
                n[] nVarArr = new n[i2];
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = iArr[i5];
                    Integer num = new Integer(i6);
                    n nVar = (n) f176a.get(num);
                    n nVarA = nVar;
                    if (nVar == null) {
                        nVarA = ar.a(i6);
                        f176a.put(num, nVarA);
                    }
                    nVarArr[i5] = nVarA;
                }
                ayVarArr[0] = new ay(nVarArr, true);
            } else {
                imageArr[0] = new Image[i2];
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = iArr[i7];
                    Integer num2 = new Integer(i8);
                    Image image = (Image) f176a.get(num2);
                    Image image2 = image;
                    if (image == null) {
                        if (bArr2[i7] == 0) {
                            image2 = ba.getImage(i8);
                        } else if (bArr2[i7] == 1) {
                            image2 = ar.getImage(i8);
                        }
                        if (image2 != null) {
                            f176a.put(num2, image2);
                        }
                    }
                    imageArr[0][i7] = image2;
                }
            }
        }
        return i;
    }

    private void u(int i) {
        byte[] bArr = this.f166b;
        short s = this.f167b[this.cX + (i - this.cY)];
        int i2 = s + 1;
        int i3 = bArr[s] & 255;
        short[] sArr = new short[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2;
            i2++;
            sArr[i4] = a(bArr[i5]);
        }
        this.f172b[i - this.cY] = sArr;
    }

    static short a(byte b) {
        short s = (short) (b & 255);
        if (s == 255) {
            return (short) -1;
        }
        return s;
    }

    public static int a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = bArr[i] << 24;
        int i4 = i2 + 1;
        return i3 | ((bArr[i2] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i4 + 1] & 255);
    }

    final void v(int i) {
        short s = -1;
        if (this.dc > 0) {
            s = this.e[this.dc - 1];
        }
        if (i != -1) {
            if (i == -2) {
                if (this.f169c == null || this.f169c.length <= 0) {
                    return;
                }
                v(this.f169c[0]);
                return;
            }
            if (i == -3) {
                this.aa = false;
                this.cW = s;
                this.dc--;
                return;
            }
            if (i >= 0) {
                short s2 = this.a[i];
                if (s2 != -1) {
                    this.aa = true;
                    this.cW = s2;
                    if (i(this.cK)) {
                        this.f174d[this.cK] = (byte) this.f168c.as;
                    }
                    if (s == s2) {
                        this.aa = false;
                        this.dc--;
                    } else if (this.ab) {
                        short[] sArr = this.e;
                        int i2 = this.dc;
                        this.dc = i2 + 1;
                        sArr[i2] = (short) this.cK;
                    }
                }
                this.b.q(i);
            }
        }
    }

    private void w(int i) {
        if (this.f170b[i] != null) {
            this.f170b[i].f();
            this.f170b[i] = null;
        }
    }

    public final int x() {
        int i = -1;
        if (this.dg == 3) {
            if (this.ad) {
                return 100;
            }
            int i2 = 100 - this.df;
            i = this.ac ? i2 + ((this.cI * this.df) / this.cH) : (this.cI * i2) / this.cH;
        }
        return i;
    }
}
