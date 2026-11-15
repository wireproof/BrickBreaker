package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:ah.class */
public final class ah {
    int ac;
    int ad;
    int dl;
    az[] a;
    final int di;
    final int dj;

    public ah(int i, h hVar, as asVar) {
        ai aiVar;
        int length;
        int i2;
        byte[] bArrA = ba.a(i);
        this.ac = (bArrA[0] << 24) | ((bArrA[1] & 255) << 16) | ((bArrA[2] & 255) << 8) | (bArrA[3] & 255);
        this.ad = (bArrA[4] << 24) | ((bArrA[5] & 255) << 16) | ((bArrA[6] & 255) << 8) | (bArrA[7] & 255);
        this.dl = (bArrA[8] << 24) | ((bArrA[9] & 255) << 16) | ((bArrA[10] & 255) << 8) | (bArrA[11] & 255);
        int i3 = 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        int i4 = bArrA[12] & 255;
        ai[] aiVarArr = new ai[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i3;
            i3++;
            aiVarArr[i5] = asVar.a[bArrA[i6] & 255];
        }
        this.di = aiVarArr[0].di;
        this.dj = aiVarArr[0].dj;
        this.a = new az[this.ac * this.ad];
        for (int i7 = 0; i7 < this.a.length; i7++) {
            int i8 = i3;
            i3++;
            byte b = bArrA[i8];
            int i9 = b;
            if (b != -1) {
                int i10 = -1;
                do {
                    i10++;
                    aiVar = aiVarArr[i10];
                    length = aiVar.a.length;
                    i2 = i9 - length;
                    i9 = i2;
                } while (i2 >= 0);
                az azVar = aiVar.a[i9 + length];
                azVar.a(hVar);
                this.a[i7] = azVar;
            }
        }
    }
}
