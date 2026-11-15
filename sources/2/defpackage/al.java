package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:al.class */
public final class al {
    public static final int d(int i, int i2) {
        return (int) ((((long) i) << 12) / ((long) i2));
    }

    public static final int e(int i, int i2) {
        return (int) ((((long) i) * ((long) i2)) >> 12);
    }

    public static final int f(int i, int i2) {
        return d(i << 12, i2 << 12);
    }
}
