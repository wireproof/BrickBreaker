package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:ab.class */
public final class ab {
    private static int[] ae;

    public static final int sin(int i) {
        if (ae == null) {
            ae = new int[256];
            int i2 = 0;
            int i3 = 32768;
            int i4 = 0;
            while (i4 < 64) {
                ae[i4] = i2;
                i3 -= (i2 * 804) >> 15;
                i2 += (i3 * 804) >> 15;
                i4++;
            }
            int i5 = i4;
            int i6 = i4 + 1;
            ae[i5] = 32768;
            while (i6 <= 128) {
                ae[i6] = ae[64 - (i6 - 64)];
                i6++;
            }
            while (i6 < 256) {
                ae[i6] = -ae[i6 - 128];
                i6++;
            }
        }
        int i7 = i & 255;
        int i8 = i >> 8;
        return ((ae[(i8 + 1) & 255] * i7) + (ae[i8 & 255] * (256 - i7))) >> 8;
    }

    public static final int cos(int i) {
        return sin(i + 16384);
    }
}
