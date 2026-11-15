package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:t.class */
public final class t {
    byte[] a;
    byte b;
    boolean Z;

    public t(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.a = new byte[]{bArr[i], bArr[i2]};
        int i4 = i3 + 1;
        this.b = bArr[i3];
        int i5 = i4 + 1;
        this.Z = bArr[i4] != 0;
        iArr[0] = i5;
    }
}
