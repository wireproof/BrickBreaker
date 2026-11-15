package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:at.class */
public final class at {
    byte[] f;
    byte[] g;
    byte c;

    public at(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.f = new byte[]{bArr[i], bArr[i2]};
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        this.g = new byte[]{bArr[i3], bArr[i4]};
        this.c = bArr[i5];
        iArr[0] = i5 + 1;
    }
}
