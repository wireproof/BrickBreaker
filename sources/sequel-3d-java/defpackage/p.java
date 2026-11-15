package defpackage;

/* JADX INFO: loaded from: sequel-3d-java.jar:p.class */
public final class p {
    private static int[] a;

    public static final int a(int i) {
        if (a == null) {
            a = new int[256];
            int i2 = 0;
            int i3 = 32768;
            int i4 = 0;
            while (i4 < 64) {
                a[i4] = i2;
                i3 -= (i2 * 804) >> 15;
                i2 += (i3 * 804) >> 15;
                i4++;
            }
            int i5 = i4;
            int i6 = i4 + 1;
            a[i5] = 32768;
            while (i6 <= 128) {
                a[i6] = a[64 - (i6 - 64)];
                i6++;
            }
            while (i6 < 256) {
                a[i6] = -a[i6 - 128];
                i6++;
            }
        }
        int i7 = i & 255;
        int i8 = i >> 8;
        return ((a[(i8 + 1) & 255] * i7) + (a[i8 & 255] * (256 - i7))) >> 8;
    }

    public static final int b(int i) {
        return a(i + 16384);
    }
}
