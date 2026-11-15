package defpackage;

import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: loaded from: bbr-3d.jar:r.class */
public final class r extends t {
    public int fL;
    public static final short[] l = {0, 0, 32, 0, 64, 0, 96, 0, 128, 0, 160, 0, 192, 0, 224, 0, 0, 64, 32, 64, 64, 64, 96, 64, 128, 64, 160, 64, 192, 64, 224, 64, 32, 192, 224, 128, 0, 192, 32, 128, 64, 128, 96, 128, 128, 128, 160, 128, 192, 128, 0, 128};
    private static TriangleStripArray[] a;
    private int fM;

    public final void b(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = {50, 100, 100};
        int[] iArr2 = {75, 75, 150};
        int[] iArr3 = {50, 75, 100};
        int i7 = 2 - i4;
        int iAbs = 0;
        if (i5 == 25) {
            iAbs = (int) (iArr3[i7] * 1.7f * ((float) Math.abs(Math.sin((3.141592653589793d * ((double) ((int) (System.currentTimeMillis() % 5000)))) / 5000.0d))));
        }
        short s = l[i5 << 1];
        short s2 = l[(i5 << 1) + 1];
        short s3 = s;
        short s4 = (short) (s + 32);
        short s5 = (short) (s2 + 56);
        short s6 = (short) (s2 + 64);
        short s7 = s;
        short s8 = (short) (s + 32);
        short s9 = s2;
        short s10 = (short) (s2 + 40);
        short s11 = s;
        short s12 = (short) (s + 32);
        short s13 = (short) (s2 + 56);
        short s14 = (short) (s2 + 64);
        short s15 = s;
        short s16 = (short) (s + 32);
        short s17 = (short) (s2 + 56);
        int i8 = i6 * 3;
        int i9 = i6 << 1;
        int i10 = i8 + 1;
        this.m[i8] = (short) (i - iArr[i7]);
        int i11 = i10 + 1;
        this.m[i10] = (short) (i2 + iArr3[i7] + iAbs);
        int i12 = i11 + 1;
        this.m[i11] = (short) (i3 - iArr2[i7]);
        int i13 = i12 + 1;
        this.m[i12] = (short) (i + iArr[i7]);
        int i14 = i13 + 1;
        this.m[i13] = (short) (i2 + iArr3[i7] + iAbs);
        int i15 = i14 + 1;
        this.m[i14] = (short) (i3 - iArr2[i7]);
        int i16 = i15 + 1;
        this.m[i15] = (short) (i - iArr[i7]);
        int i17 = i16 + 1;
        this.m[i16] = (short) (i2 + iArr3[i7] + iAbs);
        int i18 = i17 + 1;
        this.m[i17] = (short) (i3 + iArr2[i7]);
        int i19 = i18 + 1;
        this.m[i18] = (short) (i + iArr[i7]);
        int i20 = i19 + 1;
        this.m[i19] = (short) (i2 + iArr3[i7] + iAbs);
        int i21 = i20 + 1;
        this.m[i20] = (short) (i3 + iArr2[i7]);
        int i22 = i9 + 1;
        this.f165n[i9] = s7;
        int i23 = i22 + 1;
        this.f165n[i22] = s9;
        int i24 = i23 + 1;
        this.f165n[i23] = s8;
        int i25 = i24 + 1;
        this.f165n[i24] = s9;
        int i26 = i25 + 1;
        this.f165n[i25] = s7;
        int i27 = i26 + 1;
        this.f165n[i26] = s10;
        int i28 = i27 + 1;
        this.f165n[i27] = s8;
        int i29 = i28 + 1;
        this.f165n[i28] = s10;
        int i30 = i21 + 1;
        this.m[i21] = (short) (i - iArr[i7]);
        int i31 = i30 + 1;
        this.m[i30] = (short) (i2 - iArr3[i7]);
        int i32 = i31 + 1;
        this.m[i31] = (short) (i3 + iArr2[i7]);
        int i33 = i32 + 1;
        this.m[i32] = (short) (i + iArr[i7]);
        int i34 = i33 + 1;
        this.m[i33] = (short) (i2 - iArr3[i7]);
        int i35 = i34 + 1;
        this.m[i34] = (short) (i3 + iArr2[i7]);
        int i36 = i29 + 1;
        this.f165n[i29] = s15;
        int i37 = i36 + 1;
        this.f165n[i36] = s17;
        int i38 = i37 + 1;
        this.f165n[i37] = s16;
        int i39 = i38 + 1;
        this.f165n[i38] = s17;
        int i40 = i35 + 1;
        this.m[i35] = (short) (i - iArr[i7]);
        int i41 = i40 + 1;
        this.m[i40] = (short) (i2 + iArr3[i7] + iAbs);
        int i42 = i41 + 1;
        this.m[i41] = (short) (i3 - iArr2[i7]);
        int i43 = i42 + 1;
        this.m[i42] = (short) (i - iArr[i7]);
        int i44 = i43 + 1;
        this.m[i43] = (short) (i2 + iArr3[i7] + iAbs);
        int i45 = i44 + 1;
        this.m[i44] = (short) (i3 + iArr2[i7]);
        int i46 = i45 + 1;
        this.m[i45] = (short) (i - iArr[i7]);
        int i47 = i46 + 1;
        this.m[i46] = (short) (i2 - iArr3[i7]);
        int i48 = i47 + 1;
        this.m[i47] = (short) (i3 - iArr2[i7]);
        int i49 = i48 + 1;
        this.m[i48] = (short) (i - iArr[i7]);
        int i50 = i49 + 1;
        this.m[i49] = (short) (i2 - iArr3[i7]);
        int i51 = i50 + 1;
        this.m[i50] = (short) (i3 + iArr2[i7]);
        int i52 = i39 + 1;
        this.f165n[i39] = s3;
        int i53 = i52 + 1;
        this.f165n[i52] = s5;
        int i54 = i53 + 1;
        this.f165n[i53] = s4;
        int i55 = i54 + 1;
        this.f165n[i54] = s5;
        int i56 = i55 + 1;
        this.f165n[i55] = s3;
        int i57 = i56 + 1;
        this.f165n[i56] = s6;
        int i58 = i57 + 1;
        this.f165n[i57] = s4;
        int i59 = i58 + 1;
        this.f165n[i58] = s6;
        int i60 = i51 + 1;
        this.m[i51] = (short) (i + iArr[i7]);
        int i61 = i60 + 1;
        this.m[i60] = (short) (i2 + iArr3[i7] + iAbs);
        int i62 = i61 + 1;
        this.m[i61] = (short) (i3 + iArr2[i7]);
        int i63 = i62 + 1;
        this.m[i62] = (short) (i + iArr[i7]);
        int i64 = i63 + 1;
        this.m[i63] = (short) (i2 + iArr3[i7] + iAbs);
        int i65 = i64 + 1;
        this.m[i64] = (short) (i3 - iArr2[i7]);
        int i66 = i65 + 1;
        this.m[i65] = (short) (i + iArr[i7]);
        int i67 = i66 + 1;
        this.m[i66] = (short) (i2 - iArr3[i7]);
        int i68 = i67 + 1;
        this.m[i67] = (short) (i3 + iArr2[i7]);
        int i69 = i68 + 1;
        this.m[i68] = (short) (i + iArr[i7]);
        this.m[i69] = (short) (i2 - iArr3[i7]);
        this.m[i69 + 1] = (short) (i3 - iArr2[i7]);
        int i70 = i59 + 1;
        this.f165n[i59] = s11;
        int i71 = i70 + 1;
        this.f165n[i70] = s13;
        int i72 = i71 + 1;
        this.f165n[i71] = s12;
        int i73 = i72 + 1;
        this.f165n[i72] = s13;
        int i74 = i73 + 1;
        this.f165n[i73] = s11;
        int i75 = i74 + 1;
        this.f165n[i74] = s14;
        this.f165n[i75] = s12;
        this.f165n[i75 + 1] = s14;
    }

    public final void ax() {
        if (a == null) {
            a = new TriangleStripArray[50];
            for (int i = 1; i < 50; i++) {
                TriangleStripArray[] triangleStripArrayArr = a;
                int i2 = i;
                int i3 = i;
                int[] iArr = new int[i3 * 3];
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = i4;
                    int i7 = i4 + 1;
                    iArr[i6] = 6;
                    int i8 = i7 + 1;
                    iArr[i7] = 4;
                    i4 = i8 + 1;
                    iArr[i8] = 4;
                }
                triangleStripArrayArr[i2] = new TriangleStripArray(0, iArr);
            }
        }
        this.m = new short[2100];
        this.f165n = new short[1400];
        this.f166b = new VertexArray(this.m.length / 3, 3, 2);
        this.c = new VertexArray(this.f165n.length / 2, 2, 2);
        this.a = new VertexBuffer();
    }

    public final void ay() {
        this.f166b.set(0, this.m.length / 3, this.m);
        this.c.set(0, this.f165n.length / 2, this.f165n);
        this.a.setPositions(this.f166b, 1.0f, (float[]) null);
        this.a.setTexCoords(0, this.c, 1.0f / 256.0f, (float[]) null);
        this.f163a = a[this.fL];
    }

    public final void N(int i) {
        setAppearance(h.f82a[0]);
        if (i == this.fM) {
            return;
        }
        short s = l[2 * this.fM];
        short s2 = l[(2 * this.fM) + 1];
        short s3 = l[i << 1];
        short s4 = l[(i << 1) + 1];
        for (int i2 = 0; i2 < this.f165n.length; i2 += 2) {
            short[] sArr = this.f165n;
            int i3 = i2;
            sArr[i3] = (short) (sArr[i3] + (s3 - s));
            short[] sArr2 = this.f165n;
            int i4 = i2 + 1;
            sArr2[i4] = (short) (sArr2[i4] + (s4 - s2));
        }
        this.c.set(0, this.f165n.length / 2, this.f165n);
        this.fM = i;
    }

    public final void az() {
        this.m = new short[8100];
        this.f165n = new short[5400];
        this.f166b = new VertexArray(this.m.length / 3, 3, 2);
        this.c = new VertexArray(this.f165n.length / 2, 2, 2);
        this.a = new VertexBuffer();
    }

    public final void a(int i, int i2, int i3, int i4, boolean z, float f) {
        short s = l[24];
        short s2 = l[25];
        short s3 = s;
        short s4 = (short) (s + 32);
        short s5 = (short) (s2 + 56);
        short s6 = (short) (s2 + 64);
        short s7 = s;
        short s8 = (short) (s + 32);
        short s9 = s2;
        short s10 = (short) (s2 + 40);
        short s11 = s;
        short s12 = (short) (s + 32);
        short s13 = (short) (s2 + 56);
        if (!z) {
            int i5 = i4 * 12;
            int i6 = i5 + 1;
            this.m[i5] = (short) (i - 40);
            int i7 = i6 + 1;
            this.m[i6] = 0;
            int i8 = i7 + 1;
            this.m[i7] = (short) (i2 + 20);
            int i9 = i8 + 1;
            this.m[i8] = (short) (i + 40);
            int i10 = i9 + 1;
            this.m[i9] = 0;
            int i11 = i10 + 1;
            this.m[i10] = (short) (i2 + 20);
            int i12 = i11 + 1;
            this.m[i11] = (short) (i - 40);
            int i13 = i12 + 1;
            this.m[i12] = 0;
            int i14 = i13 + 1;
            this.m[i13] = (short) (i2 - 20);
            int i15 = i14 + 1;
            this.m[i14] = (short) (i + 40);
            this.m[i15] = 0;
            this.m[i15 + 1] = (short) (i2 - 20);
            return;
        }
        int i16 = i4 * 30;
        int i17 = i4 * 20;
        int i18 = i16 + 1;
        this.m[i16] = (short) (i - 40);
        int i19 = i18 + 1;
        this.m[i18] = (short) (-i3);
        int i20 = i19 + 1;
        this.m[i19] = (short) (i2 + 20);
        int i21 = i20 + 1;
        this.m[i20] = (short) (i + 40);
        int i22 = i21 + 1;
        this.m[i21] = (short) (-i3);
        int i23 = i22 + 1;
        this.m[i22] = (short) (i2 + 20);
        int i24 = i23 + 1;
        this.m[i23] = (short) (i - 40);
        int i25 = i24 + 1;
        this.m[i24] = (short) (-i3);
        int i26 = i25 + 1;
        this.m[i25] = (short) (i2 - 20);
        int i27 = i26 + 1;
        this.m[i26] = (short) (i + 40);
        int i28 = i27 + 1;
        this.m[i27] = (short) (-i3);
        int i29 = i28 + 1;
        this.m[i28] = (short) (i2 - 20);
        int i30 = i17 + 1;
        this.f165n[i17] = s7;
        int i31 = i30 + 1;
        this.f165n[i30] = s9;
        int i32 = i31 + 1;
        this.f165n[i31] = s8;
        int i33 = i32 + 1;
        this.f165n[i32] = s9;
        int i34 = i33 + 1;
        this.f165n[i33] = s7;
        int i35 = i34 + 1;
        this.f165n[i34] = s10;
        int i36 = i35 + 1;
        this.f165n[i35] = s8;
        int i37 = i36 + 1;
        this.f165n[i36] = s10;
        int i38 = i29 + 1;
        this.m[i29] = (short) (i - 40);
        int i39 = i38 + 1;
        this.m[i38] = 0;
        int i40 = i39 + 1;
        this.m[i39] = (short) (i2 - 20);
        int i41 = i40 + 1;
        this.m[i40] = (short) (i + 40);
        int i42 = i41 + 1;
        this.m[i41] = 0;
        int i43 = i42 + 1;
        this.m[i42] = (short) (i2 - 20);
        int i44 = i37 + 1;
        this.f165n[i37] = s11;
        int i45 = i44 + 1;
        this.f165n[i44] = s13;
        int i46 = i45 + 1;
        this.f165n[i45] = s12;
        int i47 = i46 + 1;
        this.f165n[i46] = s13;
        if (f >= 0.0f) {
            int i48 = i43 + 1;
            this.m[i43] = (short) (i - 40);
            int i49 = i48 + 1;
            this.m[i48] = 0;
            int i50 = i49 + 1;
            this.m[i49] = (short) (i2 + 20);
            int i51 = i50 + 1;
            this.m[i50] = (short) (i - 40);
            int i52 = i51 + 1;
            this.m[i51] = (short) (-i3);
            int i53 = i52 + 1;
            this.m[i52] = (short) (i2 + 20);
            int i54 = i53 + 1;
            this.m[i53] = (short) (i - 40);
            int i55 = i54 + 1;
            this.m[i54] = 0;
            int i56 = i55 + 1;
            this.m[i55] = (short) (i2 - 20);
            int i57 = i56 + 1;
            this.m[i56] = (short) (i - 40);
            this.m[i57] = (short) (-i3);
            this.m[i57 + 1] = (short) (i2 - 20);
        } else {
            int i58 = i43 + 1;
            this.m[i43] = (short) (i + 40);
            int i59 = i58 + 1;
            this.m[i58] = (short) (-i3);
            int i60 = i59 + 1;
            this.m[i59] = (short) (i2 + 20);
            int i61 = i60 + 1;
            this.m[i60] = (short) (i + 40);
            int i62 = i61 + 1;
            this.m[i61] = 0;
            int i63 = i62 + 1;
            this.m[i62] = (short) (i2 + 20);
            int i64 = i63 + 1;
            this.m[i63] = (short) (i + 40);
            int i65 = i64 + 1;
            this.m[i64] = (short) (-i3);
            int i66 = i65 + 1;
            this.m[i65] = (short) (i2 - 20);
            int i67 = i66 + 1;
            this.m[i66] = (short) (i + 40);
            this.m[i67] = 0;
            this.m[i67 + 1] = (short) (i2 - 20);
        }
        int i68 = i47 + 1;
        this.f165n[i47] = s4;
        int i69 = i68 + 1;
        this.f165n[i68] = s5;
        int i70 = i69 + 1;
        this.f165n[i69] = s4;
        int i71 = i70 + 1;
        this.f165n[i70] = s6;
        int i72 = i71 + 1;
        this.f165n[i71] = s3;
        int i73 = i72 + 1;
        this.f165n[i72] = s5;
        this.f165n[i73] = s3;
        this.f165n[i73 + 1] = s6;
    }

    public final void g(boolean z) {
        int[] iArr;
        this.f166b.set(0, this.m.length / 3, this.m);
        this.c.set(0, this.f165n.length / 2, this.f165n);
        this.a.setPositions(this.f166b, 1.0f, (float[]) null);
        this.a.setTexCoords(0, this.c, 1.0f / 256.0f, (float[]) null);
        if (z) {
            iArr = new int[this.fL << 1];
            int i = 0;
            for (int i2 = 0; i2 < this.fL; i2++) {
                int i3 = i;
                int i4 = i + 1;
                iArr[i3] = 6;
                i = i4 + 1;
                iArr[i4] = 4;
            }
        } else {
            iArr = new int[this.fL];
            int i5 = 0;
            for (int i6 = 0; i6 < this.fL; i6++) {
                int i7 = i5;
                i5++;
                iArr[i7] = 4;
            }
        }
        this.f163a = new TriangleStripArray(0, iArr);
    }
}
