package defpackage;

import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: sequel-3d-java.jar:s.class */
public final class s {
    Object[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    byte[] f269a;
    private short[] f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    short[] f270a;
    byte[] b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int f271a = -1;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    int f272b = -1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    n f273a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    short[] f274b;
    short[] c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    n[] f275a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    short[][] f276a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    short[][] f277b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    short[][] f278c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    int f279c;
    int d;
    int e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    int f280f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    boolean f281a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    boolean f282b;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    short[] f283d;
    int g;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    boolean f284c;
    int h;
    int i;
    int j;
    int k;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    boolean f285d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    short[] f286e;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    byte[] f287c;
    static int l;

    public s(int i, Object[] objArr) {
        a(i, objArr);
    }

    private void a(int i, Object[] objArr) {
        this.a = objArr;
        byte[] bArrM96a = t.m96a(i);
        this.f269a = bArrM96a;
        int i2 = bArrM96a[0] & 255;
        int i3 = 2;
        this.f = new short[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3;
            int i6 = i3 + 1;
            i3 = i6 + 1;
            this.f[i4] = (short) (((bArrM96a[i5] & 255) << 8) | (bArrM96a[i6] & 255));
        }
        int i7 = i3 + 1;
        int i8 = i7 + 1;
        this.f279c = bArrM96a[i7] & 255;
        this.d = this.f279c;
        int i9 = i8 + 1;
        this.e = bArrM96a[i8] & 255;
        this.f280f = this.d + this.e;
        int i10 = i9 + 1;
        int i11 = bArrM96a[i9] & 255;
        int i12 = this.f279c + this.e + i11;
        this.b = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10;
            i10++;
            this.b[i13] = bArrM96a[i14];
        }
        this.f270a = new short[i12];
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i10;
            int i17 = i10 + 1;
            i10 = i17 + 1;
            this.f270a[i15] = (short) (((bArrM96a[i16] & 255) << 8) | (bArrM96a[i17] & 255));
        }
        this.f272b = bArrM96a[i10] & 255;
        this.f275a = new n[this.f279c];
        this.f276a = new short[this.f279c][];
        this.f277b = new short[this.e][];
        this.f278c = new short[i11][];
        this.f287c = new byte[this.f279c];
        int i18 = this.f279c;
        int i19 = 0;
        while (i19 < this.e) {
            m81a(i18);
            i19++;
            i18++;
        }
        int i20 = 0;
        while (i20 < i11) {
            b(i18);
            i20++;
            i18++;
        }
        this.f283d = new short[this.f279c + i11 + this.e];
        this.g = 0;
        this.f282b = false;
    }

    final boolean a(int i) {
        return i < this.f279c;
    }

    static int a(byte[] bArr, int i, int i2, Image[][] imageArr, b[] bVarArr) {
        imageArr[0] = null;
        bVarArr[0] = null;
        int[] iArr = new int[i2];
        byte[] bArr2 = new byte[i2];
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i;
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 16);
            int i8 = i6 + 1;
            int i9 = i7 | ((bArr[i6] & 255) << 8);
            int i10 = i8 + 1;
            iArr[i3] = i9 | (bArr[i8] & 255);
            z2 |= iArr[i3] != -1;
            i = i10 + 1;
            bArr2[i3] = bArr[i10];
            z |= bArr2[i3] == 2 || bArr2[i3] == 3;
        }
        if (z2) {
            if (z) {
                bVarArr[0] = new b(a.a(iArr, false));
            } else {
                imageArr[0] = new Image[i2];
                for (int i11 = 0; i11 < i2; i11++) {
                    Image imageM8a = null;
                    if (bArr2[i11] == 0) {
                        imageM8a = t.a(iArr[i11]);
                    } else if (bArr2[i11] == 1) {
                        imageM8a = a.m8a(iArr[i11]);
                    }
                    imageArr[0][i11] = imageM8a;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    final void m81a(int i) {
        byte[] bArr = this.f269a;
        short s = this.f270a[this.f279c + (i - this.d)];
        int i2 = s + 1;
        int i3 = bArr[s] & 255;
        short[] sArr = new short[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2;
            i2++;
            sArr[i4] = (short) (bArr[i5] & 255);
            if (sArr[i4] == 255) {
                sArr[i4] = -1;
            }
        }
        this.f277b[i - this.d] = sArr;
    }

    final void b(int i) {
        byte[] bArr = this.f269a;
        short s = this.f270a[this.f279c + this.e + (i - this.f280f)];
        short[] sArr = {(short) (bArr[s] & 255), (short) (bArr[s + 1] & 255)};
        if (sArr[0] == 255) {
            sArr[0] = -1;
        }
        if (sArr[1] == 255) {
            sArr[1] = -1;
        }
        this.f278c[i - this.f280f] = sArr;
    }

    final void c(int i) {
        short s = -1;
        if (this.g > 0) {
            s = this.f283d[this.g - 1];
        }
        if (i != -1) {
            if (i == -2) {
                if (this.f274b == null || this.f274b.length <= 0) {
                    return;
                }
                c(this.f274b[0]);
                return;
            }
            if (i == -3) {
                this.f281a = false;
                this.f272b = s;
                this.g--;
                return;
            }
            if (i >= 0) {
                short s2 = this.f[i];
                if (s2 != -1) {
                    this.f281a = true;
                    this.f272b = s2;
                    if (a(this.f271a)) {
                        this.f287c[this.f271a] = (byte) this.f273a.d();
                        if (this.f271a == 0 && this.f273a.d() == 1) {
                            this.f287c[this.f271a] = 6;
                        }
                    }
                    if (s == s2) {
                        this.f281a = false;
                        this.g--;
                    } else if (this.f282b) {
                        short[] sArr = this.f283d;
                        int i2 = this.g;
                        this.g = i2 + 1;
                        sArr[i2] = (short) this.f271a;
                    }
                }
                DCWall3D.m2a(this.a, this.f271a, i);
            }
        }
    }

    final void d(int i) {
        if (this.f275a[i] != null) {
            this.f275a[i].m78d();
            this.f275a[i] = null;
        }
    }

    public final int a() {
        if (this.f284c) {
            return (this.i * 100) / this.h;
        }
        return -1;
    }
}
