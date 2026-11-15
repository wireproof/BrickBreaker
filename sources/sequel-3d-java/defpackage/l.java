package defpackage;

import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: loaded from: sequel-3d-java.jar:l.class */
public final class l extends g {
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static TriangleStripArray[] f195a;

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = {50, 100, 100};
        int[] iArr2 = {75, 75, 150};
        int[] iArr3 = {50, 75, 100};
        int i7 = 2 - i4;
        int iAbs = 0;
        if (i5 == 25) {
            iAbs = (int) (iArr3[i7] * 1.7f * ((float) Math.abs(Math.sin((3.141592653589793d * ((double) ((int) (System.currentTimeMillis() % 5000)))) / 5000.0d))));
        }
        int i8 = i6 * 3;
        int i9 = i6 << 1;
        int i10 = i8 + 1;
        this.f82a[i8] = (short) (i - iArr[i7]);
        int i11 = i10 + 1;
        this.f82a[i10] = (short) (i2 + iArr3[i7] + iAbs);
        int i12 = i11 + 1;
        this.f82a[i11] = (short) (i3 - iArr2[i7]);
        int i13 = i12 + 1;
        this.f82a[i12] = (short) (i + iArr[i7]);
        int i14 = i13 + 1;
        this.f82a[i13] = (short) (i2 + iArr3[i7] + iAbs);
        int i15 = i14 + 1;
        this.f82a[i14] = (short) (i3 - iArr2[i7]);
        int i16 = i15 + 1;
        this.f82a[i15] = (short) (i - iArr[i7]);
        int i17 = i16 + 1;
        this.f82a[i16] = (short) (i2 + iArr3[i7] + iAbs);
        int i18 = i17 + 1;
        this.f82a[i17] = (short) (i3 + iArr2[i7]);
        int i19 = i18 + 1;
        this.f82a[i18] = (short) (i + iArr[i7]);
        int i20 = i19 + 1;
        this.f82a[i19] = (short) (i2 + iArr3[i7] + iAbs);
        int i21 = i20 + 1;
        this.f82a[i20] = (short) (i3 + iArr2[i7]);
        int i22 = i9 + 1;
        this.b[i9] = 0;
        int i23 = i22 + 1;
        this.b[i22] = 0;
        int i24 = i23 + 1;
        this.b[i23] = 64;
        int i25 = i24 + 1;
        this.b[i24] = 0;
        int i26 = i25 + 1;
        this.b[i25] = 0;
        int i27 = i26 + 1;
        this.b[i26] = 40;
        int i28 = i27 + 1;
        this.b[i27] = 64;
        int i29 = i28 + 1;
        this.b[i28] = 40;
        int i30 = i21 + 1;
        this.f82a[i21] = (short) (i - iArr[i7]);
        int i31 = i30 + 1;
        this.f82a[i30] = (short) (i2 - iArr3[i7]);
        int i32 = i31 + 1;
        this.f82a[i31] = (short) (i3 + iArr2[i7]);
        int i33 = i32 + 1;
        this.f82a[i32] = (short) (i + iArr[i7]);
        int i34 = i33 + 1;
        this.f82a[i33] = (short) (i2 - iArr3[i7]);
        int i35 = i34 + 1;
        this.f82a[i34] = (short) (i3 + iArr2[i7]);
        int i36 = i29 + 1;
        this.b[i29] = 0;
        int i37 = i36 + 1;
        this.b[i36] = 56;
        int i38 = i37 + 1;
        this.b[i37] = 64;
        int i39 = i38 + 1;
        this.b[i38] = 56;
        int i40 = i35 + 1;
        this.f82a[i35] = (short) (i - iArr[i7]);
        int i41 = i40 + 1;
        this.f82a[i40] = (short) (i2 + iArr3[i7] + iAbs);
        int i42 = i41 + 1;
        this.f82a[i41] = (short) (i3 - iArr2[i7]);
        int i43 = i42 + 1;
        this.f82a[i42] = (short) (i - iArr[i7]);
        int i44 = i43 + 1;
        this.f82a[i43] = (short) (i2 + iArr3[i7] + iAbs);
        int i45 = i44 + 1;
        this.f82a[i44] = (short) (i3 + iArr2[i7]);
        int i46 = i45 + 1;
        this.f82a[i45] = (short) (i - iArr[i7]);
        int i47 = i46 + 1;
        this.f82a[i46] = (short) (i2 - iArr3[i7]);
        int i48 = i47 + 1;
        this.f82a[i47] = (short) (i3 - iArr2[i7]);
        int i49 = i48 + 1;
        this.f82a[i48] = (short) (i - iArr[i7]);
        int i50 = i49 + 1;
        this.f82a[i49] = (short) (i2 - iArr3[i7]);
        int i51 = i50 + 1;
        this.f82a[i50] = (short) (i3 + iArr2[i7]);
        int i52 = i39 + 1;
        this.b[i39] = 0;
        int i53 = i52 + 1;
        this.b[i52] = 56;
        int i54 = i53 + 1;
        this.b[i53] = 64;
        int i55 = i54 + 1;
        this.b[i54] = 56;
        int i56 = i55 + 1;
        this.b[i55] = 0;
        int i57 = i56 + 1;
        this.b[i56] = 64;
        int i58 = i57 + 1;
        this.b[i57] = 64;
        int i59 = i58 + 1;
        this.b[i58] = 64;
        int i60 = i51 + 1;
        this.f82a[i51] = (short) (i + iArr[i7]);
        int i61 = i60 + 1;
        this.f82a[i60] = (short) (i2 + iArr3[i7] + iAbs);
        int i62 = i61 + 1;
        this.f82a[i61] = (short) (i3 + iArr2[i7]);
        int i63 = i62 + 1;
        this.f82a[i62] = (short) (i + iArr[i7]);
        int i64 = i63 + 1;
        this.f82a[i63] = (short) (i2 + iArr3[i7] + iAbs);
        int i65 = i64 + 1;
        this.f82a[i64] = (short) (i3 - iArr2[i7]);
        int i66 = i65 + 1;
        this.f82a[i65] = (short) (i + iArr[i7]);
        int i67 = i66 + 1;
        this.f82a[i66] = (short) (i2 - iArr3[i7]);
        int i68 = i67 + 1;
        this.f82a[i67] = (short) (i3 + iArr2[i7]);
        int i69 = i68 + 1;
        this.f82a[i68] = (short) (i + iArr[i7]);
        this.f82a[i69] = (short) (i2 - iArr3[i7]);
        this.f82a[i69 + 1] = (short) (i3 - iArr2[i7]);
        int i70 = i59 + 1;
        this.b[i59] = 0;
        int i71 = i70 + 1;
        this.b[i70] = 56;
        int i72 = i71 + 1;
        this.b[i71] = 64;
        int i73 = i72 + 1;
        this.b[i72] = 56;
        int i74 = i73 + 1;
        this.b[i73] = 0;
        int i75 = i74 + 1;
        this.b[i74] = 64;
        this.b[i75] = 64;
        this.b[i75 + 1] = 64;
    }

    public final void g() {
        if (f195a == null) {
            f195a = new TriangleStripArray[150];
            for (int i = 1; i < 150; i++) {
                TriangleStripArray[] triangleStripArrayArr = f195a;
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
        this.f82a = new short[6300];
        this.b = new short[4200];
        this.f83a = new VertexArray(this.f82a.length / 3, 3, 2);
        this.f84b = new VertexArray(this.b.length / 2, 2, 2);
        this.f76a = new VertexBuffer();
    }

    public final void h() {
        this.f83a.set(0, this.f82a.length / 3, this.f82a);
        this.f84b.set(0, this.b.length / 2, this.b);
        this.f76a.setPositions(this.f83a, 1.0f, (float[]) null);
        this.f76a.setTexCoords(0, this.f84b, 1.0f / 64.0f, (float[]) null);
        this.f77a = f195a[this.a];
    }

    public final void e(int i) {
        a(j.f104a[i]);
    }

    static {
        short[] sArr = {0, 0, 32, 0, 64, 0, 96, 0, 128, 0, 160, 0, 192, 0, 224, 0, 0, 64, 32, 64, 64, 64, 96, 64, 128, 64, 160, 64, 192, 64, 224, 64, 32, 192, 224, 128, 0, 192, 32, 128, 64, 128, 96, 128, 128, 128, 160, 128, 192, 128, 0, 128};
    }
}
