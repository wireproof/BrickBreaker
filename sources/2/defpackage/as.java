package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:as.class */
public final class as {
    final ai[] a;

    public as(int i, h hVar) {
        byte[] bArrA = ba.a(i);
        int i2 = 0 + 1;
        int i3 = bArrA[0] & 255;
        this.a = new ai[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2;
            int i6 = i2 + 1;
            int i7 = bArrA[i5] & 255;
            int i8 = i6 + 1;
            int i9 = bArrA[i6] & 255;
            i2 = i8 + 1;
            int i10 = bArrA[i8] & 255;
            az[] azVarArr = new az[i7];
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = i2;
                int i13 = i2 + 1;
                int i14 = i13 + 1;
                int i15 = (bArrA[i12] << 24) | ((bArrA[i13] & 255) << 16);
                int i16 = i14 + 1;
                int i17 = i15 | ((bArrA[i14] & 255) << 8);
                i2 = i16 + 1;
                int i18 = i17 | (bArrA[i16] & 255);
                if (i18 != -1) {
                    azVarArr[i11] = new az(i18);
                }
            }
            this.a[i4] = new ai(azVarArr, i9, i10);
        }
    }
}
