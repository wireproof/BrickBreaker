package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:s.class */
public final class s {
    private o[] a;

    /* JADX WARN: Multi-variable type inference failed */
    public s(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        byte[] bArr2 = {bArr[i] ? 1 : 0, bArr[i2] ? 1 : 0};
        int i3 = i2 + 1 + 1 + 1;
        int i4 = i3 + 1;
        this.a = new o[bArr[i3]];
        for (int i5 = 0; i5 < this.a.length; i5++) {
            int[] iArr2 = {i4};
            this.a[i5] = new o(iArr2);
            i4 = iArr2[0];
        }
        iArr[0] = i4;
    }
}
