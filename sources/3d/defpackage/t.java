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

/* JADX INFO: loaded from: bbr-3d.jar:t.class */
public class t {
    private static byte[] j;
    private static int fP;
    protected VertexBuffer a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected IndexBuffer f163a;
    private Appearance b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private CompositingMode f164a;
    private float[] f;
    public float n;
    protected short[] m;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    protected short[] f165n;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    protected VertexArray f166b;
    protected VertexArray c;
    private static float[] g = new float[16];
    private static float[] h = new float[16];
    private Transform e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private Transform f167f;
    public boolean az;

    public t() {
        this.f = new float[3];
        this.f167f = new Transform();
        this.e = new Transform();
        this.f167f = new Transform();
        this.f164a = new CompositingMode();
    }

    public t(int i) {
        this.f = new float[3];
        this.f167f = new Transform();
        this.e = new Transform();
        this.f167f = new Transform();
        this.f164a = new CompositingMode();
        Q(i);
    }

    private static int readInt() {
        int i = (j[fP] & 255) | ((j[fP + 1] & 255) << 8) | ((j[fP + 2] & 255) << 16) | ((j[fP + 3] & 255) << 24);
        fP += 4;
        return i;
    }

    public final void a(n nVar) {
        short[] sArr = nVar.k;
        if (sArr == null) {
            return;
        }
        int i = nVar.cq + (sArr[nVar.cq] * 5) + 1;
        short s = sArr[i];
        int i2 = s;
        int[][] iArr = new int[s][4];
        int i3 = 0;
        while (true) {
            i2--;
            if (i2 < 0) {
                b(iArr);
                return;
            }
            int i4 = i + 3 + 1;
            int i5 = (sArr[i4] * 1280) >> 8;
            int i6 = i4 + 1;
            int i7 = (sArr[i6] * 1280) >> 8;
            int i8 = i6 + 1;
            int i9 = (sArr[i8] * 1280) >> 8;
            i = i8 + 1;
            int i10 = (sArr[i] * 1280) >> 8;
            iArr[i3][0] = i5;
            iArr[i3][1] = i7;
            iArr[i3][2] = i9;
            iArr[i3][3] = i10;
            i3++;
        }
    }

    public final VertexBuffer getVertexBuffer() {
        return this.a;
    }

    public final void b(int[][] iArr) {
        this.m = new short[(3 * iArr.length) << 2];
        this.f165n = new short[(2 * iArr.length) << 2];
        for (int i = 0; i < iArr.length; i++) {
            short s = (short) iArr[i][0];
            short s2 = (short) iArr[i][1];
            short s3 = (short) (s + ((short) iArr[i][2]));
            short s4 = (short) (s2 + ((short) iArr[i][3]));
            this.m[i * 12] = s;
            this.m[(i * 12) + 1] = 0;
            this.m[(i * 12) + 2] = s2;
            this.m[(i * 12) + 3] = s3;
            this.m[(i * 12) + 4] = 0;
            this.m[(i * 12) + 5] = s2;
            this.m[(i * 12) + 6] = s;
            this.m[(i * 12) + 7] = 0;
            this.m[(i * 12) + 8] = s4;
            this.m[(i * 12) + 9] = s3;
            this.m[(i * 12) + 10] = 0;
            this.m[(i * 12) + 11] = s4;
            this.f165n[i << 3] = 0;
            this.f165n[(i << 3) + 1] = 0;
            this.f165n[(i << 3) + 2] = 256;
            this.f165n[(i << 3) + 3] = 0;
            this.f165n[(i << 3) + 4] = 0;
            this.f165n[(i << 3) + 5] = 256;
            this.f165n[(i << 3) + 6] = 256;
            this.f165n[(i << 3) + 7] = 256;
        }
        VertexArray vertexArray = new VertexArray(this.m.length / 3, 3, 2);
        vertexArray.set(0, this.m.length / 3, this.m);
        VertexArray vertexArray2 = new VertexArray(this.f165n.length / 2, 2, 2);
        vertexArray2.set(0, this.f165n.length / 2, this.f165n);
        this.a = new VertexBuffer();
        this.a.setPositions(vertexArray, 1.0f, (float[]) null);
        this.a.setDefaultColor(-1);
        this.a.setTexCoords(0, vertexArray2, 0.00390625f, (float[]) null);
        this.f163a = new TriangleStripArray(0, a(this.m, 4));
        aB();
    }

    public final void O(int i) {
        this.m = new short[192];
        for (int i2 = 0; i2 < 16; i2++) {
            this.m[i2 * 12] = (short) ((q.s((i2 << 9) / 16) * 160) >> 12);
            this.m[(i2 * 12) + 1] = 0;
            this.m[(i2 * 12) + 2] = (short) (((-q.t((i2 << 9) / 16)) * 160) >> 12);
            this.m[(i2 * 12) + 3] = (short) ((q.s((i2 << 9) / 16) * 200) >> 12);
            this.m[(i2 * 12) + 4] = 0;
            this.m[(i2 * 12) + 5] = (short) (((-q.t((i2 << 9) / 16)) * 200) >> 12);
            this.m[(i2 * 12) + 6] = (short) ((q.s(((i2 + 1) << 9) / 16) * 160) >> 12);
            this.m[(i2 * 12) + 7] = 0;
            this.m[(i2 * 12) + 8] = (short) (((-q.t(((i2 + 1) << 9) / 16)) * 160) >> 12);
            this.m[(i2 * 12) + 9] = (short) ((q.s(((i2 + 1) << 9) / 16) * 200) >> 12);
            this.m[(i2 * 12) + 10] = 0;
            this.m[(i2 * 12) + 11] = (short) (((-q.t(((i2 + 1) << 9) / 16)) * 200) >> 12);
        }
        VertexArray vertexArray = new VertexArray(this.m.length / 3, 3, 2);
        vertexArray.set(0, this.m.length / 3, this.m);
        this.a = new VertexBuffer();
        this.a.setPositions(vertexArray, 1.0f, (float[]) null);
        this.a.setDefaultColor(-1);
        this.f163a = new TriangleStripArray(0, a(this.m, 4));
        aB();
    }

    public final void P(int i) {
        short[] sArr = new short[90];
        short[] sArr2 = new short[60];
        for (int i2 = 0; i2 < 10; i2++) {
            sArr[i2 * 9] = 0;
            sArr[(i2 * 9) + 1] = 0;
            sArr[(i2 * 9) + 2] = 0;
            sArr[(i2 * 9) + 3] = (short) ((q.s((i2 << 9) / 10) * 54) >> 12);
            sArr[(i2 * 9) + 5] = 0;
            sArr[(i2 * 9) + 4] = (short) (((-q.t((i2 << 9) / 10)) * 54) >> 12);
            sArr[(i2 * 9) + 6] = (short) ((q.s(((i2 + 1) << 9) / 10) * 54) >> 12);
            sArr[(i2 * 9) + 8] = 0;
            sArr[(i2 * 9) + 7] = (short) (((-q.t(((i2 + 1) << 9) / 10)) * 54) >> 12);
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
        this.a = new VertexBuffer();
        this.a.setPositions(vertexArray, 1.0f, (float[]) null);
        this.a.setTexCoords(0, vertexArray2, 1.0f, (float[]) null);
        this.a.setDefaultColor(-1);
        this.f163a = new TriangleStripArray(0, a(sArr, 3));
        aB();
        aE();
        aC();
    }

    public final void o(int i, int i2) {
        int[] iArr = {50, 100, 100};
        int[] iArr2 = {75, 75, 150};
        int[] iArr3 = {50, 75, 100};
        this.m = new short[12 + ((i2 & 4) != 0 ? 6 : 0) + ((i2 & 1) != 0 ? 12 : 0) + ((i2 & 2) != 0 ? 12 : 0) + ((i2 & 8) != 0 ? 18 : 0)];
        this.f165n = new short[(this.m.length << 1) / 3];
        for (int i3 = 0; i3 < this.f165n.length; i3++) {
            this.f165n[i3] = 0;
        }
        int i4 = 1;
        this.m[0] = (short) (-iArr[i]);
        this.m[1] = (short) iArr3[i];
        this.m[2] = (short) (-iArr2[i]);
        this.m[3] = (short) iArr[i];
        this.m[4] = (short) iArr3[i];
        this.m[5] = (short) (-iArr2[i]);
        this.m[6] = (short) (-iArr[i]);
        this.m[7] = (short) iArr3[i];
        this.m[8] = (short) iArr2[i];
        this.m[9] = (short) iArr[i];
        this.m[10] = (short) iArr3[i];
        int i5 = 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        this.m[11] = (short) iArr2[i];
        this.f165n[0] = 0;
        this.f165n[1] = 0;
        this.f165n[2] = 32;
        this.f165n[3] = 0;
        this.f165n[4] = 0;
        this.f165n[5] = 40;
        this.f165n[6] = 32;
        int i6 = 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        this.f165n[7] = 40;
        if ((i2 & 4) != 0) {
            this.m[12] = (short) (-iArr[i]);
            this.m[13] = (short) (-iArr3[i]);
            this.m[14] = (short) iArr2[i];
            this.m[15] = (short) iArr[i];
            this.m[16] = (short) (-iArr3[i]);
            i5 = i5 + 1 + 1 + 1 + 1 + 1 + 1;
            this.m[17] = (short) iArr2[i];
            this.f165n[8] = 0;
            this.f165n[9] = 56;
            this.f165n[10] = 32;
            i6 = i6 + 1 + 1 + 1 + 1;
            this.f165n[11] = 56;
        }
        if ((i2 & 1) != 0) {
            i4 = 1 + 1;
            int i7 = i5;
            int i8 = i5 + 1;
            this.m[i7] = (short) (-iArr[i]);
            int i9 = i8 + 1;
            this.m[i8] = (short) iArr3[i];
            int i10 = i9 + 1;
            this.m[i9] = (short) (-iArr2[i]);
            int i11 = i10 + 1;
            this.m[i10] = (short) (-iArr[i]);
            int i12 = i11 + 1;
            this.m[i11] = (short) iArr3[i];
            int i13 = i12 + 1;
            this.m[i12] = (short) iArr2[i];
            int i14 = i13 + 1;
            this.m[i13] = (short) (-iArr[i]);
            int i15 = i14 + 1;
            this.m[i14] = (short) (-iArr3[i]);
            int i16 = i15 + 1;
            this.m[i15] = (short) (-iArr2[i]);
            int i17 = i16 + 1;
            this.m[i16] = (short) (-iArr[i]);
            int i18 = i17 + 1;
            this.m[i17] = (short) (-iArr3[i]);
            i5 = i18 + 1;
            this.m[i18] = (short) iArr2[i];
            int i19 = i6;
            int i20 = i6 + 1;
            this.f165n[i19] = 0;
            int i21 = i20 + 1;
            this.f165n[i20] = 56;
            int i22 = i21 + 1;
            this.f165n[i21] = 32;
            int i23 = i22 + 1;
            this.f165n[i22] = 56;
            int i24 = i23 + 1;
            this.f165n[i23] = 0;
            int i25 = i24 + 1;
            this.f165n[i24] = 64;
            int i26 = i25 + 1;
            this.f165n[i25] = 32;
            i6 = i26 + 1;
            this.f165n[i26] = 64;
        }
        if ((i2 & 2) != 0) {
            i4++;
            int i27 = i5;
            int i28 = i5 + 1;
            this.m[i27] = (short) iArr[i];
            int i29 = i28 + 1;
            this.m[i28] = (short) iArr3[i];
            int i30 = i29 + 1;
            this.m[i29] = (short) iArr2[i];
            int i31 = i30 + 1;
            this.m[i30] = (short) iArr[i];
            int i32 = i31 + 1;
            this.m[i31] = (short) iArr3[i];
            int i33 = i32 + 1;
            this.m[i32] = (short) (-iArr2[i]);
            int i34 = i33 + 1;
            this.m[i33] = (short) iArr[i];
            int i35 = i34 + 1;
            this.m[i34] = (short) (-iArr3[i]);
            int i36 = i35 + 1;
            this.m[i35] = (short) iArr2[i];
            int i37 = i36 + 1;
            this.m[i36] = (short) iArr[i];
            int i38 = i37 + 1;
            this.m[i37] = (short) (-iArr3[i]);
            i5 = i38 + 1;
            this.m[i38] = (short) (-iArr2[i]);
            int i39 = i6;
            int i40 = i6 + 1;
            this.f165n[i39] = 0;
            int i41 = i40 + 1;
            this.f165n[i40] = 56;
            int i42 = i41 + 1;
            this.f165n[i41] = 32;
            int i43 = i42 + 1;
            this.f165n[i42] = 56;
            int i44 = i43 + 1;
            this.f165n[i43] = 0;
            int i45 = i44 + 1;
            this.f165n[i44] = 64;
            int i46 = i45 + 1;
            this.f165n[i45] = 32;
            i6 = i46 + 1;
            this.f165n[i46] = 64;
        }
        if ((i2 & 8) != 0) {
            i4++;
            int i47 = i5;
            int i48 = i5 + 1;
            this.m[i47] = (short) (-iArr[i]);
            int i49 = i48 + 1;
            this.m[i48] = (short) (-iArr3[i]);
            int i50 = i49 + 1;
            this.m[i49] = (short) iArr2[i];
            int i51 = i50 + 1;
            this.m[i50] = (short) iArr[i];
            int i52 = i51 + 1;
            this.m[i51] = (short) (-iArr3[i]);
            int i53 = i52 + 1;
            this.m[i52] = (short) iArr2[i];
            int i54 = i53 + 1;
            this.m[i53] = (short) (-iArr[i]);
            int i55 = i54 + 1;
            this.m[i54] = (short) (-iArr3[i]);
            int i56 = i55 + 1;
            this.m[i55] = (short) (-iArr2[i]);
            int i57 = i56 + 1;
            this.m[i56] = (short) iArr[i];
            int i58 = i57 + 1;
            this.m[i57] = (short) (-iArr3[i]);
            int i59 = i58 + 1;
            this.m[i58] = (short) (-iArr2[i]);
            int i60 = i59 + 1;
            this.m[i59] = (short) (-iArr[i]);
            int i61 = i60 + 1;
            this.m[i60] = (short) iArr3[i];
            int i62 = i61 + 1;
            this.m[i61] = (short) (-iArr2[i]);
            int i63 = i62 + 1;
            this.m[i62] = (short) iArr[i];
            this.m[i63] = (short) iArr3[i];
            this.m[i63 + 1] = (short) (-iArr2[i]);
            int i64 = i6;
            int i65 = i6 + 1;
            this.f165n[i64] = 32;
            int i66 = i65 + 1;
            this.f165n[i65] = 64;
            int i67 = i66 + 1;
            this.f165n[i66] = 0;
            int i68 = i67 + 1;
            this.f165n[i67] = 64;
            int i69 = i68 + 1;
            this.f165n[i68] = 32;
            int i70 = i69 + 1;
            this.f165n[i69] = 56;
            int i71 = i70 + 1;
            this.f165n[i70] = 0;
            int i72 = i71 + 1;
            this.f165n[i71] = 56;
            int i73 = i72 + 1;
            this.f165n[i72] = 32;
            int i74 = i73 + 1;
            this.f165n[i73] = 40;
            this.f165n[i74] = 0;
            this.f165n[i74 + 1] = 40;
        }
        int[] iArr4 = new int[i4];
        for (int i75 = 0; i75 < i4; i75++) {
            if ((i75 != 0 || (i2 & 4) == 0) && (i75 != i4 - 1 || (i2 & 8) == 0)) {
                iArr4[i75] = 4;
            } else {
                iArr4[i75] = 6;
            }
        }
        VertexArray vertexArray = new VertexArray(this.m.length / 3, 3, 2);
        vertexArray.set(0, this.m.length / 3, this.m);
        this.c = new VertexArray(this.f165n.length / 2, 2, 2);
        this.c.set(0, this.f165n.length / 2, this.f165n);
        this.a = new VertexBuffer();
        this.a.setPositions(vertexArray, 1.0f, (float[]) null);
        this.a.setTexCoords(0, this.c, 1.0f / 256.0f, (float[]) null);
        this.f163a = new TriangleStripArray(0, iArr4);
        aB();
    }

    private void Q(int i) {
        j = p.a(i);
        fP = 0;
        int i2 = readInt();
        int i3 = readInt();
        short[] sArr = new short[i2 * 3];
        short[] sArr2 = new short[i3 * 3];
        for (int i4 = 0; i4 < i2; i4++) {
            sArr[i4 * 3] = (short) readInt();
            sArr[(i4 * 3) + 2] = (short) (-readInt());
            sArr[(i4 * 3) + 1] = (short) readInt();
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sArr2[i5 * 3] = (short) readInt();
            sArr2[(i5 * 3) + 1] = (short) readInt();
            sArr2[(i5 * 3) + 2] = (short) readInt();
        }
        int i6 = readInt();
        short[] sArr3 = new short[i6 << 1];
        for (int i7 = 0; i7 < i6; i7++) {
            sArr3[i7 << 1] = (short) readInt();
            sArr3[(i7 << 1) + 1] = (short) (256 - readInt());
        }
        int i8 = readInt();
        int[] iArr = new int[i8 * 3];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9 * 3] = readInt();
            iArr[(i9 * 3) + 1] = readInt();
            iArr[(i9 * 3) + 2] = readInt();
        }
        this.m = new short[i3 * 3 * 3];
        this.f165n = new short[(i3 * 3) << 1];
        for (int i10 = 0; i10 < this.m.length / 9; i10++) {
            short s = sArr2[i10 * 3];
            short s2 = sArr2[(i10 * 3) + 2];
            short s3 = sArr2[(i10 * 3) + 1];
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            if (i8 > 0) {
                i11 = iArr[i10 * 3];
                i12 = iArr[(i10 * 3) + 2];
                i13 = iArr[(i10 * 3) + 1];
            }
            this.m[i10 * 9] = sArr[s * 3];
            this.m[(i10 * 9) + 1] = sArr[(s * 3) + 1];
            this.m[(i10 * 9) + 2] = sArr[(s * 3) + 2];
            this.m[(i10 * 9) + 3] = sArr[s2 * 3];
            this.m[(i10 * 9) + 4] = sArr[(s2 * 3) + 1];
            this.m[(i10 * 9) + 5] = sArr[(s2 * 3) + 2];
            this.m[(i10 * 9) + 6] = sArr[s3 * 3];
            this.m[(i10 * 9) + 7] = sArr[(s3 * 3) + 1];
            this.m[(i10 * 9) + 8] = sArr[(s3 * 3) + 2];
            if (i6 > 0) {
                this.f165n[i10 * 6] = sArr3[i11 << 1];
                this.f165n[(i10 * 6) + 1] = sArr3[(i11 << 1) + 1];
                this.f165n[(i10 * 6) + 2] = sArr3[i12 << 1];
                this.f165n[(i10 * 6) + 3] = sArr3[(i12 << 1) + 1];
                this.f165n[(i10 * 6) + 4] = sArr3[i13 << 1];
                this.f165n[(i10 * 6) + 5] = sArr3[(i13 << 1) + 1];
            }
        }
        VertexArray vertexArray = new VertexArray(this.m.length / 3, 3, 2);
        vertexArray.set(0, this.m.length / 3, this.m);
        this.c = new VertexArray(this.f165n.length / 2, 2, 2);
        this.c.set(0, this.f165n.length / 2, this.f165n);
        this.a = new VertexBuffer();
        this.a.setPositions(vertexArray, 1.0f, (float[]) null);
        this.a.setDefaultColor(-1);
        if (i6 > 0) {
            this.a.setTexCoords(0, this.c, 0.00390625f, (float[]) null);
        }
        this.f163a = new TriangleStripArray(0, a(this.m, 3));
        aB();
    }

    public final void setColor(int i) {
        this.a.setDefaultColor(i);
    }

    protected final void aB() {
        this.f164a.setBlending(68);
        this.f164a.setDepthTestEnable(true);
        this.f164a.setDepthWriteEnable(true);
        this.f164a.setAlphaWriteEnable(false);
        PolygonMode polygonMode = new PolygonMode();
        polygonMode.setCulling(161);
        this.b = new Appearance();
        this.b.setPolygonMode(polygonMode);
        this.b.setCompositingMode(this.f164a);
    }

    public final void aC() {
        PolygonMode polygonMode = new PolygonMode();
        polygonMode.setCulling(162);
        this.b.setPolygonMode(polygonMode);
    }

    public final void aD() {
        this.f164a.setBlending(68);
        this.f164a.setDepthTestEnable(true);
        this.f164a.setDepthWriteEnable(true);
        this.f164a.setAlphaWriteEnable(false);
        this.b.setCompositingMode(this.f164a);
    }

    public final void aE() {
        this.f164a.setBlending(68);
        this.f164a.setDepthTestEnable(false);
        this.f164a.setDepthWriteEnable(false);
        this.f164a.setAlphaWriteEnable(false);
        this.b.setCompositingMode(this.f164a);
    }

    public static final Texture2D a(int i, boolean z) {
        Texture2D texture2D = new Texture2D(new Image2D(99, c.a(i, 0, 65536)));
        texture2D.setBlending(z ? 224 : 228);
        return texture2D;
    }

    public final void a(Texture2D texture2D) {
        this.b.setTexture(0, texture2D);
    }

    public final void R(int i) {
        Texture2D texture2D = new Texture2D(new Image2D(100, c.a(i, 0, 65536)));
        texture2D.setBlending(228);
        this.f164a.setBlending(64);
        this.f164a.setDepthTestEnable(false);
        this.f164a.setDepthWriteEnable(false);
        this.f164a.setAlphaWriteEnable(true);
        PolygonMode polygonMode = new PolygonMode();
        polygonMode.setCulling(161);
        this.b = new Appearance();
        this.b.setTexture(0, texture2D);
        this.b.setPolygonMode(polygonMode);
        this.b.setCompositingMode(this.f164a);
    }

    public final void setAppearance(Appearance appearance) {
        this.b = appearance;
    }

    private static final int[] a(short[] sArr, int i) {
        int[] iArr = new int[(sArr.length / 3) / i];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = i;
        }
        return iArr;
    }

    public final void setIdentity() {
        float[] fArr = this.f;
        float[] fArr2 = this.f;
        this.f[2] = 1.0f;
        fArr2[1] = 1.0f;
        fArr[0] = 1.0f;
        this.e.setIdentity();
    }

    public final void postTranslate(float f, float f2, float f3) {
        if (f < 1.0E-4f && f > -1.0E-4f) {
            f = 0.0f;
        }
        if (f2 < 1.0E-4f && f2 > -1.0E-4f) {
            f2 = 0.0f;
        }
        if (f3 < 1.0E-4f && f3 > -1.0E-4f) {
            f3 = 0.0f;
        }
        this.e.postTranslate(f, f2, f3);
    }

    public final void postRotateQuat(float f, float f2, float f3, float f4) {
        this.e.postRotateQuat(f, f2, f3, f4);
    }

    public final void S(int i) {
        for (int i2 = 0; i2 < this.f165n.length / 2; i2++) {
            short[] sArr = this.f165n;
            int i3 = (i2 << 1) + 1;
            sArr[i3] = (short) (sArr[i3] + i);
        }
        this.c.set(0, this.f165n.length / 2, this.f165n);
        for (int i4 = 0; i4 < this.f165n.length / 2; i4++) {
            short[] sArr2 = this.f165n;
            int i5 = (i4 << 1) + 1;
            sArr2[i5] = (short) (sArr2[i5] - i);
        }
    }

    public final void aF() {
        if (!this.az) {
            e.a().render(this.a, this.f163a, this.b, this.e);
            return;
        }
        Transform transform = this.e;
        e.m12a().get(g);
        transform.get(h);
        g[3] = h[3];
        g[7] = h[7];
        g[11] = h[11];
        this.f167f.set(g);
        this.f167f.postScale(this.f[0], this.f[1], this.f[2]);
        this.f167f.postRotate(90.0f, 1.0f, 0.0f, 0.0f);
        this.f167f.postRotate(this.n, 0.0f, 1.0f, 0.0f);
        e.a().render(this.a, this.f163a, this.b, this.f167f);
    }

    public final void postRotate(float f, float f2, float f3, float f4) {
        this.e.postRotate(f * 360.0f, f2, f3, f4);
    }

    public final void postScale(float f, float f2, float f3) {
        this.e.postScale(f, f2, f3);
        this.f[0] = f;
        this.f[1] = f2;
        this.f[2] = f3;
    }
}
