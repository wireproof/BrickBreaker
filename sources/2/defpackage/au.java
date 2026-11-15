package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:au.class */
public final class au {
    byte[] a;
    byte c;
    byte e;

    public au(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.a = new byte[]{bArr[i], bArr[i2]};
        int i4 = i3 + 1;
        this.c = bArr[i3];
        this.e = bArr[i4];
        iArr[0] = i4 + 1;
    }
}
