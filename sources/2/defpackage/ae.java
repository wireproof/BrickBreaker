package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:ae.class */
public final class ae {
    byte[] a;
    byte c;
    int[] af;

    /* JADX WARN: Multi-variable type inference failed */
    public ae(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.a = new byte[]{bArr[i] ? 1 : 0, bArr[i2] ? 1 : 0};
        int i4 = i3 + 1;
        this.c = bArr[i3] ? (byte) 1 : (byte) 0;
        int i5 = i4 + 1;
        this.af = new int[bArr[i4]];
        for (int i6 = 0; i6 < this.af.length; i6++) {
            int i7 = i5;
            int i8 = i5 + 1;
            int i9 = i8 + 1;
            int i10 = ((bArr[i7] ? 1 : 0) << 24) | (((bArr[i8] ? 1 : 0) & 255) << 16);
            int i11 = i9 + 1;
            int i12 = i10 | (((bArr[i9] ? 1 : 0) & 255) << 8);
            i5 = i11 + 1;
            this.af[i6] = i12 | ((bArr[i11] ? 1 : 0) & 255);
        }
        iArr[0] = i5;
    }
}
