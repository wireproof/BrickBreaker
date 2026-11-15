package defpackage;

import javax.microedition.m3g.Appearance;
import javax.microedition.m3g.CompositingMode;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.IndexBuffer;
import javax.microedition.m3g.PolygonMode;
import javax.microedition.m3g.Texture2D;
import javax.microedition.m3g.Transform;
import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: loaded from: sequel-3d-java.jar:g.class */
public class g {
    private static byte[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f75a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected VertexBuffer f76a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected IndexBuffer f77a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Appearance f78a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private CompositingMode f79a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private float[] f80a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float f81a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected short[] f82a;
    protected short[] b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected VertexArray f83a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    protected VertexArray f84b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static float[] f85b = new float[16];
    private static float[] c = new float[16];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Transform f86a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Transform f87b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f88a;

    public g() {
        this.f80a = new float[3];
        this.f87b = new Transform();
        this.f86a = new Transform();
        this.f87b = new Transform();
        this.f79a = new CompositingMode();
    }

    public g(int i) {
        this.f80a = new float[3];
        this.f87b = new Transform();
        this.f86a = new Transform();
        this.f87b = new Transform();
        this.f79a = new CompositingMode();
        e(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static int a() {
        int i = (a[f75a] & 255) | ((a[f75a + 1] & 255) << 8) | ((a[f75a + 2] & 255) << 16) | ((a[f75a + 3] & 255) << 24);
        f75a += 4;
        return i;
    }

    public final void a(b bVar) {
        aa aaVarM21a = bVar.m21a();
        if (aaVarM21a == null) {
            return;
        }
        int[][] iArrA = aaVarM21a.m16a(bVar.d()).a();
        int length = iArrA.length;
        int[][] iArr = new int[length][4];
        for (int i = 0; i < length; i++) {
            int i2 = (iArrA[i][2] * 1280) >> 8;
            int i3 = (iArrA[i][3] * 1280) >> 8;
            int i4 = (iArrA[i][4] * 1280) >> 8;
            int i5 = (iArrA[i][5] * 1280) >> 8;
            iArr[i][0] = i2;
            iArr[i][1] = i3;
            iArr[i][2] = i4;
            iArr[i][3] = i5;
        }
        a(iArr);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final VertexBuffer m35a() {
        return this.f76a;
    }

    public final void a(int[][] iArr) {
        this.f82a = new short[(3 * iArr.length) << 2];
        this.b = new short[(2 * iArr.length) << 2];
        for (int i = 0; i < iArr.length; i++) {
            short s = (short) iArr[i][0];
            short s2 = (short) iArr[i][1];
            short s3 = (short) (s + ((short) iArr[i][2]));
            short s4 = (short) (s2 + ((short) iArr[i][3]));
            this.f82a[i * 12] = s;
            this.f82a[(i * 12) + 1] = 0;
            this.f82a[(i * 12) + 2] = s2;
            this.f82a[(i * 12) + 3] = s3;
            this.f82a[(i * 12) + 4] = 0;
            this.f82a[(i * 12) + 5] = s2;
            this.f82a[(i * 12) + 6] = s;
            this.f82a[(i * 12) + 7] = 0;
            this.f82a[(i * 12) + 8] = s4;
            this.f82a[(i * 12) + 9] = s3;
            this.f82a[(i * 12) + 10] = 0;
            this.f82a[(i * 12) + 11] = s4;
            this.b[i << 3] = 0;
            this.b[(i << 3) + 1] = 0;
            this.b[(i << 3) + 2] = 256;
            this.b[(i << 3) + 3] = 0;
            this.b[(i << 3) + 4] = 0;
            this.b[(i << 3) + 5] = 256;
            this.b[(i << 3) + 6] = 256;
            this.b[(i << 3) + 7] = 256;
        }
        VertexArray vertexArray = new VertexArray(this.f82a.length / 3, 3, 2);
        vertexArray.set(0, this.f82a.length / 3, this.f82a);
        VertexArray vertexArray2 = new VertexArray(this.b.length / 2, 2, 2);
        vertexArray2.set(0, this.b.length / 2, this.b);
        this.f76a = new VertexBuffer();
        this.f76a.setPositions(vertexArray, 1.0f, (float[]) null);
        this.f76a.setDefaultColor(-1);
        this.f76a.setTexCoords(0, vertexArray2, 0.00390625f, (float[]) null);
        this.f77a = new TriangleStripArray(0, a(this.f82a, 4));
        m36a();
    }

    public final void a(int i) {
        this.f82a = new short[192];
        for (int i2 = 0; i2 < 16; i2++) {
            this.f82a[i2 * 12] = (short) ((z.m137f((i2 << 9) / 16) * 160) >> 12);
            this.f82a[(i2 * 12) + 1] = 0;
            this.f82a[(i2 * 12) + 2] = (short) (((-z.m138g((i2 << 9) / 16)) * 160) >> 12);
            this.f82a[(i2 * 12) + 3] = (short) ((z.m137f((i2 << 9) / 16) * 200) >> 12);
            this.f82a[(i2 * 12) + 4] = 0;
            this.f82a[(i2 * 12) + 5] = (short) (((-z.m138g((i2 << 9) / 16)) * 200) >> 12);
            this.f82a[(i2 * 12) + 6] = (short) ((z.m137f(((i2 + 1) << 9) / 16) * 160) >> 12);
            this.f82a[(i2 * 12) + 7] = 0;
            this.f82a[(i2 * 12) + 8] = (short) (((-z.m138g(((i2 + 1) << 9) / 16)) * 160) >> 12);
            this.f82a[(i2 * 12) + 9] = (short) ((z.m137f(((i2 + 1) << 9) / 16) * 200) >> 12);
            this.f82a[(i2 * 12) + 10] = 0;
            this.f82a[(i2 * 12) + 11] = (short) (((-z.m138g(((i2 + 1) << 9) / 16)) * 200) >> 12);
        }
        VertexArray vertexArray = new VertexArray(this.f82a.length / 3, 3, 2);
        vertexArray.set(0, this.f82a.length / 3, this.f82a);
        this.f76a = new VertexBuffer();
        this.f76a.setPositions(vertexArray, 1.0f, (float[]) null);
        this.f76a.setDefaultColor(-1);
        this.f77a = new TriangleStripArray(0, a(this.f82a, 4));
        m36a();
    }

    public final void b(int i) {
        short[] sArr = new short[90];
        short[] sArr2 = new short[60];
        for (int i2 = 0; i2 < 10; i2++) {
            sArr[i2 * 9] = 0;
            sArr[(i2 * 9) + 1] = 0;
            sArr[(i2 * 9) + 2] = 0;
            sArr[(i2 * 9) + 3] = (short) ((z.m137f((i2 << 9) / 10) * 54) >> 12);
            sArr[(i2 * 9) + 5] = 0;
            sArr[(i2 * 9) + 4] = (short) (((-z.m138g((i2 << 9) / 10)) * 54) >> 12);
            sArr[(i2 * 9) + 6] = (short) ((z.m137f(((i2 + 1) << 9) / 10) * 54) >> 12);
            sArr[(i2 * 9) + 8] = 0;
            sArr[(i2 * 9) + 7] = (short) (((-z.m138g(((i2 + 1) << 9) / 10)) * 54) >> 12);
            sArr2[i2 * 6] = 0;
            sArr2[(i2 * 6) + 1] = 0;
            sArr2[(i2 * 6) + 2] = 1;
            sArr2[(i2 * 6) + 3] = 1;
            sArr2[(i2 * 6) + 4] = 1;
            sArr2[(i2 * 6) + 5] = 1;
        }
        VertexArray vertexArray = new VertexArray(sArr.length / 3, 3, 2);
        vertexArray.set(0, sArr.length / 3, sArr);
        VertexArray vertexArray2 = new VertexArray(sArr2.length / 2, 2, 2);
        vertexArray2.set(0, sArr2.length / 2, sArr2);
        this.f76a = new VertexBuffer();
        this.f76a.setPositions(vertexArray, 1.0f, (float[]) null);
        this.f76a.setTexCoords(0, vertexArray2, 1.0f, (float[]) null);
        this.f76a.setDefaultColor(-1);
        this.f77a = new TriangleStripArray(0, a(sArr, 3));
        m36a();
        d();
        b();
    }

    public final void a(int i, int i2) {
        int[] iArr = {50, 100, 100};
        int[] iArr2 = {75, 75, 150};
        int[] iArr3 = {50, 75, 100};
        this.f82a = new short[12 + ((i2 & 4) != 0 ? 6 : 0) + ((i2 & 1) != 0 ? 12 : 0) + ((i2 & 2) != 0 ? 12 : 0) + ((i2 & 8) != 0 ? 18 : 0)];
        this.b = new short[(this.f82a.length << 1) / 3];
        for (int i3 = 0; i3 < this.b.length; i3++) {
            this.b[i3] = 0;
        }
        int i4 = 1;
        this.f82a[0] = (short) (-iArr[i]);
        this.f82a[1] = (short) iArr3[i];
        this.f82a[2] = (short) (-iArr2[i]);
        this.f82a[3] = (short) iArr[i];
        this.f82a[4] = (short) iArr3[i];
        this.f82a[5] = (short) (-iArr2[i]);
        this.f82a[6] = (short) (-iArr[i]);
        this.f82a[7] = (short) iArr3[i];
        this.f82a[8] = (short) iArr2[i];
        this.f82a[9] = (short) iArr[i];
        this.f82a[10] = (short) iArr3[i];
        int i5 = 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        this.f82a[11] = (short) iArr2[i];
        this.b[0] = 0;
        this.b[1] = 0;
        this.b[2] = 64;
        this.b[3] = 0;
        this.b[4] = 0;
        this.b[5] = 40;
        this.b[6] = 64;
        int i6 = 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        this.b[7] = 40;
        if ((i2 & 4) != 0) {
            this.f82a[12] = (short) (-iArr[i]);
            this.f82a[13] = (short) (-iArr3[i]);
            this.f82a[14] = (short) iArr2[i];
            this.f82a[15] = (short) iArr[i];
            this.f82a[16] = (short) (-iArr3[i]);
            i5 = i5 + 1 + 1 + 1 + 1 + 1 + 1;
            this.f82a[17] = (short) iArr2[i];
            this.b[8] = 0;
            this.b[9] = 56;
            this.b[10] = 64;
            i6 = i6 + 1 + 1 + 1 + 1;
            this.b[11] = 56;
        }
        if ((i2 & 1) != 0) {
            i4 = 1 + 1;
            int i7 = i5;
            int i8 = i5 + 1;
            this.f82a[i7] = (short) (-iArr[i]);
            int i9 = i8 + 1;
            this.f82a[i8] = (short) iArr3[i];
            int i10 = i9 + 1;
            this.f82a[i9] = (short) (-iArr2[i]);
            int i11 = i10 + 1;
            this.f82a[i10] = (short) (-iArr[i]);
            int i12 = i11 + 1;
            this.f82a[i11] = (short) iArr3[i];
            int i13 = i12 + 1;
            this.f82a[i12] = (short) iArr2[i];
            int i14 = i13 + 1;
            this.f82a[i13] = (short) (-iArr[i]);
            int i15 = i14 + 1;
            this.f82a[i14] = (short) (-iArr3[i]);
            int i16 = i15 + 1;
            this.f82a[i15] = (short) (-iArr2[i]);
            int i17 = i16 + 1;
            this.f82a[i16] = (short) (-iArr[i]);
            int i18 = i17 + 1;
            this.f82a[i17] = (short) (-iArr3[i]);
            i5 = i18 + 1;
            this.f82a[i18] = (short) iArr2[i];
            int i19 = i6;
            int i20 = i6 + 1;
            this.b[i19] = 0;
            int i21 = i20 + 1;
            this.b[i20] = 56;
            int i22 = i21 + 1;
            this.b[i21] = 64;
            int i23 = i22 + 1;
            this.b[i22] = 56;
            int i24 = i23 + 1;
            this.b[i23] = 0;
            int i25 = i24 + 1;
            this.b[i24] = 64;
            int i26 = i25 + 1;
            this.b[i25] = 64;
            i6 = i26 + 1;
            this.b[i26] = 64;
        }
        if ((i2 & 2) != 0) {
            i4++;
            int i27 = i5;
            int i28 = i5 + 1;
            this.f82a[i27] = (short) iArr[i];
            int i29 = i28 + 1;
            this.f82a[i28] = (short) iArr3[i];
            int i30 = i29 + 1;
            this.f82a[i29] = (short) iArr2[i];
            int i31 = i30 + 1;
            this.f82a[i30] = (short) iArr[i];
            int i32 = i31 + 1;
            this.f82a[i31] = (short) iArr3[i];
            int i33 = i32 + 1;
            this.f82a[i32] = (short) (-iArr2[i]);
            int i34 = i33 + 1;
            this.f82a[i33] = (short) iArr[i];
            int i35 = i34 + 1;
            this.f82a[i34] = (short) (-iArr3[i]);
            int i36 = i35 + 1;
            this.f82a[i35] = (short) iArr2[i];
            int i37 = i36 + 1;
            this.f82a[i36] = (short) iArr[i];
            int i38 = i37 + 1;
            this.f82a[i37] = (short) (-iArr3[i]);
            i5 = i38 + 1;
            this.f82a[i38] = (short) (-iArr2[i]);
            int i39 = i6;
            int i40 = i6 + 1;
            this.b[i39] = 0;
            int i41 = i40 + 1;
            this.b[i40] = 56;
            int i42 = i41 + 1;
            this.b[i41] = 64;
            int i43 = i42 + 1;
            this.b[i42] = 56;
            int i44 = i43 + 1;
            this.b[i43] = 0;
            int i45 = i44 + 1;
            this.b[i44] = 64;
            int i46 = i45 + 1;
            this.b[i45] = 64;
            i6 = i46 + 1;
            this.b[i46] = 64;
        }
        if ((i2 & 8) != 0) {
            i4++;
            int i47 = i5;
            int i48 = i5 + 1;
            this.f82a[i47] = (short) (-iArr[i]);
            int i49 = i48 + 1;
            this.f82a[i48] = (short) (-iArr3[i]);
            int i50 = i49 + 1;
            this.f82a[i49] = (short) iArr2[i];
            int i51 = i50 + 1;
            this.f82a[i50] = (short) iArr[i];
            int i52 = i51 + 1;
            this.f82a[i51] = (short) (-iArr3[i]);
            int i53 = i52 + 1;
            this.f82a[i52] = (short) iArr2[i];
            int i54 = i53 + 1;
            this.f82a[i53] = (short) (-iArr[i]);
            int i55 = i54 + 1;
            this.f82a[i54] = (short) (-iArr3[i]);
            int i56 = i55 + 1;
            this.f82a[i55] = (short) (-iArr2[i]);
            int i57 = i56 + 1;
            this.f82a[i56] = (short) iArr[i];
            int i58 = i57 + 1;
            this.f82a[i57] = (short) (-iArr3[i]);
            int i59 = i58 + 1;
            this.f82a[i58] = (short) (-iArr2[i]);
            int i60 = i59 + 1;
            this.f82a[i59] = (short) (-iArr[i]);
            int i61 = i60 + 1;
            this.f82a[i60] = (short) iArr3[i];
            int i62 = i61 + 1;
            this.f82a[i61] = (short) (-iArr2[i]);
            int i63 = i62 + 1;
            this.f82a[i62] = (short) iArr[i];
            this.f82a[i63] = (short) iArr3[i];
            this.f82a[i63 + 1] = (short) (-iArr2[i]);
            int i64 = i6;
            int i65 = i6 + 1;
            this.b[i64] = 64;
            int i66 = i65 + 1;
            this.b[i65] = 64;
            int i67 = i66 + 1;
            this.b[i66] = 0;
            int i68 = i67 + 1;
            this.b[i67] = 64;
            int i69 = i68 + 1;
            this.b[i68] = 64;
            int i70 = i69 + 1;
            this.b[i69] = 56;
            int i71 = i70 + 1;
            this.b[i70] = 0;
            int i72 = i71 + 1;
            this.b[i71] = 56;
            int i73 = i72 + 1;
            this.b[i72] = 64;
            int i74 = i73 + 1;
            this.b[i73] = 40;
            this.b[i74] = 0;
            this.b[i74 + 1] = 40;
        }
        int[] iArr4 = new int[i4];
        for (int i75 = 0; i75 < i4; i75++) {
            if ((i75 != 0 || (i2 & 4) == 0) && (i75 != i4 - 1 || (i2 & 8) == 0)) {
                iArr4[i75] = 4;
            } else {
                iArr4[i75] = 6;
            }
        }
        VertexArray vertexArray = new VertexArray(this.f82a.length / 3, 3, 2);
        vertexArray.set(0, this.f82a.length / 3, this.f82a);
        this.f84b = new VertexArray(this.b.length / 2, 2, 2);
        this.f84b.set(0, this.b.length / 2, this.b);
        this.f76a = new VertexBuffer();
        this.f76a.setPositions(vertexArray, 1.0f, (float[]) null);
        this.f76a.setTexCoords(0, this.f84b, 1.0f / 64.0f, (float[]) null);
        this.f77a = new TriangleStripArray(0, iArr4);
        m36a();
    }

    private void e(int i) {
        a = t.m96a(i);
        f75a = 0;
        int iA = a();
        int iA2 = a();
        short[] sArr = new short[iA * 3];
        short[] sArr2 = new short[iA2 * 3];
        for (int i2 = 0; i2 < iA; i2++) {
            sArr[i2 * 3] = (short) a();
            sArr[(i2 * 3) + 2] = (short) (-a());
            sArr[(i2 * 3) + 1] = (short) a();
        }
        for (int i3 = 0; i3 < iA2; i3++) {
            sArr2[i3 * 3] = (short) a();
            sArr2[(i3 * 3) + 1] = (short) a();
            sArr2[(i3 * 3) + 2] = (short) a();
        }
        int iA3 = a();
        short[] sArr3 = new short[iA3 << 1];
        for (int i4 = 0; i4 < iA3; i4++) {
            sArr3[i4 << 1] = (short) a();
            sArr3[(i4 << 1) + 1] = (short) (256 - a());
        }
        int iA4 = a();
        int[] iArr = new int[iA4 * 3];
        for (int i5 = 0; i5 < iA4; i5++) {
            iArr[i5 * 3] = a();
            iArr[(i5 * 3) + 1] = a();
            iArr[(i5 * 3) + 2] = a();
        }
        this.f82a = new short[iA2 * 3 * 3];
        this.b = new short[(iA2 * 3) << 1];
        for (int i6 = 0; i6 < this.f82a.length / 9; i6++) {
            short s = sArr2[i6 * 3];
            short s2 = sArr2[(i6 * 3) + 2];
            short s3 = sArr2[(i6 * 3) + 1];
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            if (iA4 > 0) {
                i7 = iArr[i6 * 3];
                i8 = iArr[(i6 * 3) + 2];
                i9 = iArr[(i6 * 3) + 1];
            }
            this.f82a[i6 * 9] = sArr[s * 3];
            this.f82a[(i6 * 9) + 1] = sArr[(s * 3) + 1];
            this.f82a[(i6 * 9) + 2] = sArr[(s * 3) + 2];
            this.f82a[(i6 * 9) + 3] = sArr[s2 * 3];
            this.f82a[(i6 * 9) + 4] = sArr[(s2 * 3) + 1];
            this.f82a[(i6 * 9) + 5] = sArr[(s2 * 3) + 2];
            this.f82a[(i6 * 9) + 6] = sArr[s3 * 3];
            this.f82a[(i6 * 9) + 7] = sArr[(s3 * 3) + 1];
            this.f82a[(i6 * 9) + 8] = sArr[(s3 * 3) + 2];
            if (iA3 > 0) {
                this.b[i6 * 6] = sArr3[i7 << 1];
                this.b[(i6 * 6) + 1] = sArr3[(i7 << 1) + 1];
                this.b[(i6 * 6) + 2] = sArr3[i8 << 1];
                this.b[(i6 * 6) + 3] = sArr3[(i8 << 1) + 1];
                this.b[(i6 * 6) + 4] = sArr3[i9 << 1];
                this.b[(i6 * 6) + 5] = sArr3[(i9 << 1) + 1];
            }
        }
        VertexArray vertexArray = new VertexArray(this.f82a.length / 3, 3, 2);
        vertexArray.set(0, this.f82a.length / 3, this.f82a);
        this.f84b = new VertexArray(this.b.length / 2, 2, 2);
        this.f84b.set(0, this.b.length / 2, this.b);
        this.f76a = new VertexBuffer();
        this.f76a.setPositions(vertexArray, 1.0f, (float[]) null);
        this.f76a.setDefaultColor(-1);
        if (iA3 > 0) {
            this.f76a.setTexCoords(0, this.f84b, 0.00390625f, (float[]) null);
        }
        this.f77a = new TriangleStripArray(0, a(this.f82a, 3));
        m36a();
    }

    public final void c(int i) {
        this.f76a.setDefaultColor(i);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    protected final void m36a() {
        this.f79a.setBlending(68);
        this.f79a.setDepthTestEnable(true);
        this.f79a.setDepthWriteEnable(true);
        this.f79a.setAlphaWriteEnable(false);
        PolygonMode polygonMode = new PolygonMode();
        polygonMode.setCulling(161);
        this.f78a = new Appearance();
        this.f78a.setPolygonMode(polygonMode);
        this.f78a.setCompositingMode(this.f79a);
    }

    public final void b() {
        PolygonMode polygonMode = new PolygonMode();
        polygonMode.setCulling(162);
        this.f78a.setPolygonMode(polygonMode);
    }

    public final void c() {
        this.f79a.setBlending(68);
        this.f79a.setDepthTestEnable(true);
        this.f79a.setDepthWriteEnable(true);
        this.f79a.setAlphaWriteEnable(false);
        this.f78a.setCompositingMode(this.f79a);
    }

    public final void d() {
        this.f79a.setBlending(68);
        this.f79a.setDepthTestEnable(false);
        this.f79a.setDepthWriteEnable(false);
        this.f79a.setAlphaWriteEnable(false);
        this.f78a.setCompositingMode(this.f79a);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final Texture2D m37a(int i) {
        Texture2D texture2D = new Texture2D(new Image2D(99, a.b(i)));
        texture2D.setBlending(228);
        return texture2D;
    }

    public final void a(Texture2D texture2D) {
        this.f78a.setTexture(0, texture2D);
    }

    public final void d(int i) {
        Texture2D texture2D = new Texture2D(new Image2D(100, a.b(i)));
        texture2D.setBlending(228);
        this.f79a.setBlending(64);
        this.f79a.setDepthTestEnable(false);
        this.f79a.setDepthWriteEnable(false);
        this.f79a.setAlphaWriteEnable(true);
        PolygonMode polygonMode = new PolygonMode();
        polygonMode.setCulling(161);
        this.f78a = new Appearance();
        this.f78a.setTexture(0, texture2D);
        this.f78a.setPolygonMode(polygonMode);
        this.f78a.setCompositingMode(this.f79a);
    }

    public final void a(Appearance appearance) {
        this.f78a = appearance;
    }

    private static final int[] a(short[] sArr, int i) {
        int[] iArr = new int[(sArr.length / 3) / i];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = i;
        }
        return iArr;
    }

    public final void e() {
        float[] fArr = this.f80a;
        float[] fArr2 = this.f80a;
        this.f80a[2] = 1.0f;
        fArr2[1] = 1.0f;
        fArr[0] = 1.0f;
        this.f86a.setIdentity();
    }

    public final void a(float f, float f2, float f3) {
        if (f < 1.0E-4f && f > -1.0E-4f) {
            f = 0.0f;
        }
        if (f2 < 1.0E-4f && f2 > -1.0E-4f) {
            f2 = 0.0f;
        }
        if (f3 < 1.0E-4f && f3 > -1.0E-4f) {
            f3 = 0.0f;
        }
        this.f86a.postTranslate(f, f2, f3);
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.f86a.postRotateQuat(f, f2, f3, f4);
    }

    public final void f() {
        if (!this.f88a) {
            m.a().render(this.f76a, this.f77a, this.f78a, this.f86a);
            return;
        }
        Transform transform = this.f86a;
        m.m67a().get(f85b);
        transform.get(c);
        f85b[3] = c[3];
        f85b[7] = c[7];
        f85b[11] = c[11];
        this.f87b.set(f85b);
        this.f87b.postScale(this.f80a[0], this.f80a[1], this.f80a[2]);
        this.f87b.postRotate(90.0f, 1.0f, 0.0f, 0.0f);
        this.f87b.postRotate(this.f81a, 0.0f, 1.0f, 0.0f);
        m.a().render(this.f76a, this.f77a, this.f78a, this.f87b);
    }

    public final void b(float f, float f2, float f3, float f4) {
        this.f86a.postRotate(f * 360.0f, f2, f3, f4);
    }

    public final void b(float f, float f2, float f3) {
        this.f86a.postScale(f, f2, f3);
        this.f80a[0] = f;
        this.f80a[1] = f2;
        this.f80a[2] = f3;
    }
}
