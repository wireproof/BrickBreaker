package defpackage;

import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: loaded from: bbr-3d.jar:m.class */
public final class m extends t {
    private byte[] d;
    private TriangleStripArray a;
    private TriangleStripArray b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private VertexArray f134a;

    public final void G() {
        int i = 0;
        short sA = (short) (h.a(20) + 14);
        short sB = (short) (h.b(17) + 14);
        this.m = new short[48];
        this.d = new byte[48];
        int[][] iArr = {new int[]{-28, 0, 56, sB}, new int[]{sA - 28, 0, 56, sB}, new int[]{0, -28, sA, 56}, new int[]{0, sB - 28, sA, 56}};
        for (int i2 = 0; i2 < 4; i2++) {
            short s = (short) iArr[i2][0];
            short s2 = (short) iArr[i2][1];
            short s3 = (short) (s + ((short) iArr[i2][2]));
            short s4 = (short) (s2 + ((short) iArr[i2][3]));
            int i3 = i;
            int i4 = i + 1;
            this.m[i3] = s;
            int i5 = i4 + 1;
            this.m[i4] = 0;
            int i6 = i5 + 1;
            this.m[i5] = s2;
            int i7 = i6 + 1;
            this.m[i6] = s3;
            int i8 = i7 + 1;
            this.m[i7] = 0;
            int i9 = i8 + 1;
            this.m[i8] = s2;
            int i10 = i9 + 1;
            this.m[i9] = s;
            int i11 = i10 + 1;
            this.m[i10] = 0;
            int i12 = i11 + 1;
            this.m[i11] = s4;
            int i13 = i12 + 1;
            this.m[i12] = s3;
            int i14 = i13 + 1;
            this.m[i13] = 0;
            i = i14 + 1;
            this.m[i14] = s4;
        }
        this.a = new TriangleStripArray(0, new int[]{4, 4, 4, 4});
        this.b = new TriangleStripArray(0, new int[]{4, 4});
        this.f163a = this.a;
        this.f166b = new VertexArray(this.m.length / 3, 3, 2);
        this.f134a = new VertexArray(this.d.length / 3, 3, 1);
        this.a = new VertexBuffer();
        this.f166b.set(0, this.m.length / 3, this.m);
        this.a.setPositions(this.f166b, 1.0f, (float[]) null);
        aB();
    }

    public final void b(boolean z) {
        this.f163a = z ? this.a : this.b;
        super.aF();
    }

    public final void b(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = i6;
            int i9 = i6 + 1;
            this.d[i8] = (byte) (i >> 16);
            int i10 = i9 + 1;
            this.d[i9] = (byte) (i >> 8);
            i6 = i10 + 1;
            this.d[i10] = (byte) i;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i6;
            int i13 = i6 + 1;
            this.d[i12] = (byte) (i2 >> 16);
            int i14 = i13 + 1;
            this.d[i13] = (byte) (i2 >> 8);
            i6 = i14 + 1;
            this.d[i14] = (byte) i2;
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i6;
            int i17 = i6 + 1;
            this.d[i16] = (byte) (i3 >> 16);
            int i18 = i17 + 1;
            this.d[i17] = (byte) (i3 >> 8);
            i6 = i18 + 1;
            this.d[i18] = (byte) i3;
        }
        for (int i19 = 0; i19 < 4; i19++) {
            int i20 = i6;
            int i21 = i6 + 1;
            this.d[i20] = (byte) (i4 >> 16);
            int i22 = i21 + 1;
            this.d[i21] = (byte) (i4 >> 8);
            i6 = i22 + 1;
            this.d[i22] = (byte) i4;
        }
        this.f134a.set(0, this.d.length / 3, this.d);
        this.a.setColors(this.f134a);
    }
}
