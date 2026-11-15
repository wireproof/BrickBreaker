package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:m.class */
public final class m {
    byte[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    short f152a;
    short b;

    public m(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.a = new byte[]{bArr[i], bArr[i2]};
        int i4 = i3 + 1;
        int i5 = bArr[i3] << 8;
        int i6 = i4 + 1;
        this.f152a = (short) (i5 | (bArr[i4] & 255));
        int i7 = i6 + 1;
        this.b = (short) ((bArr[i6] << 8) | (bArr[i7] & 255));
        iArr[0] = i7 + 1;
    }
}
