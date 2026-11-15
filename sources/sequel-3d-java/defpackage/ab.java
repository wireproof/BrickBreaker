package defpackage;

import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: loaded from: sequel-3d-java.jar:ab.class */
public final class ab extends g {
    private byte[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private TriangleStripArray f43a;
    private TriangleStripArray b;
    private VertexArray c;

    public final void g() {
        int i = 0;
        short sA = (short) (j.a(20) + 14);
        short sB = (short) (j.b(17) + 14);
        this.f82a = new short[48];
        this.a = new byte[48];
        int[][] iArr = {new int[]{-28, 0, 56, sB}, new int[]{sA - 28, 0, 56, sB}, new int[]{0, -28, sA, 56}, new int[]{0, sB - 28, sA, 56}};
        for (int i2 = 0; i2 < 4; i2++) {
            short s = (short) iArr[i2][0];
            short s2 = (short) iArr[i2][1];
            short s3 = (short) (s + ((short) iArr[i2][2]));
            short s4 = (short) (s2 + ((short) iArr[i2][3]));
            int i3 = i;
            int i4 = i + 1;
            this.f82a[i3] = s;
            int i5 = i4 + 1;
            this.f82a[i4] = 0;
            int i6 = i5 + 1;
            this.f82a[i5] = s2;
            int i7 = i6 + 1;
            this.f82a[i6] = s3;
            int i8 = i7 + 1;
            this.f82a[i7] = 0;
            int i9 = i8 + 1;
            this.f82a[i8] = s2;
            int i10 = i9 + 1;
            this.f82a[i9] = s;
            int i11 = i10 + 1;
            this.f82a[i10] = 0;
            int i12 = i11 + 1;
            this.f82a[i11] = s4;
            int i13 = i12 + 1;
            this.f82a[i12] = s3;
            int i14 = i13 + 1;
            this.f82a[i13] = 0;
            i = i14 + 1;
            this.f82a[i14] = s4;
        }
        this.f43a = new TriangleStripArray(0, new int[]{4, 4, 4, 4});
        this.b = new TriangleStripArray(0, new int[]{4, 4});
        this.f77a = this.f43a;
        this.f83a = new VertexArray(this.f82a.length / 3, 3, 2);
        this.c = new VertexArray(this.a.length / 3, 3, 1);
        this.f76a = new VertexBuffer();
        this.f83a.set(0, this.f82a.length / 3, this.f82a);
        this.f76a.setPositions(this.f83a, 1.0f, (float[]) null);
        a();
    }

    public final void a(boolean z) {
        this.f77a = z ? this.f43a : this.b;
        super.f();
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = i6;
            int i9 = i6 + 1;
            this.a[i8] = (byte) (i >> 16);
            int i10 = i9 + 1;
            this.a[i9] = (byte) (i >> 8);
            i6 = i10 + 1;
            this.a[i10] = (byte) i;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i6;
            int i13 = i6 + 1;
            this.a[i12] = (byte) (i2 >> 16);
            int i14 = i13 + 1;
            this.a[i13] = (byte) (i2 >> 8);
            i6 = i14 + 1;
            this.a[i14] = (byte) i2;
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i6;
            int i17 = i6 + 1;
            this.a[i16] = (byte) (i3 >> 16);
            int i18 = i17 + 1;
            this.a[i17] = (byte) (i3 >> 8);
            i6 = i18 + 1;
            this.a[i18] = (byte) i3;
        }
        for (int i19 = 0; i19 < 4; i19++) {
            int i20 = i6;
            int i21 = i6 + 1;
            this.a[i20] = (byte) (i4 >> 16);
            int i22 = i21 + 1;
            this.a[i21] = (byte) (i4 >> 8);
            i6 = i22 + 1;
            this.a[i22] = (byte) i4;
        }
        this.c.set(0, this.a.length / 3, this.a);
        this.f76a.setColors(this.c);
    }
}
