package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:av.class */
public final class av {
    byte[] a;

    public av(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        this.a = new byte[]{bArr[i], bArr[i2]};
        iArr[0] = i2 + 1;
    }
}
