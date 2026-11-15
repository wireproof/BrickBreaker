package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:x.class */
public final class x {
    int ac;
    int ad;
    u[] a;
    final int di;
    final int dj;

    public x(int i, h hVar) {
        u uVar;
        byte[] bArrA = ba.a(i);
        this.ac = (bArrA[0] << 24) | ((bArrA[1] & 255) << 16) | ((bArrA[2] & 255) << 8) | (bArrA[3] & 255);
        this.ad = (bArrA[4] << 24) | ((bArrA[5] & 255) << 16) | ((bArrA[6] & 255) << 8) | (bArrA[7] & 255);
        this.di = (bArrA[8] << 24) | ((bArrA[9] & 255) << 16) | ((bArrA[10] & 255) << 8) | (bArrA[11] & 255);
        this.dj = (bArrA[12] << 24) | ((bArrA[13] & 255) << 16) | ((bArrA[14] & 255) << 8) | (bArrA[15] & 255);
        int i2 = 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        this.a = new u[(bArrA[16] << 8) | (bArrA[17] & 255)];
        for (int i3 = 0; i3 < this.a.length; i3++) {
            int i4 = bArrA[i2] & 255;
            int[] iArr = {i2 + 1};
            u[] uVarArr = this.a;
            int i5 = i3;
            switch (i4) {
                case 0:
                    uVar = new u(new an(bArrA, iArr));
                    break;
                case 1:
                    uVar = new u(new ae(bArrA, iArr));
                    break;
                case 2:
                    uVar = new u(new au(bArrA, iArr));
                    break;
                case 3:
                    uVar = new u(new j(bArrA, iArr));
                    break;
                case 4:
                    uVar = new u(new at(bArrA, iArr));
                    break;
                default:
                    uVar = null;
                    break;
            }
            uVarArr[i5] = uVar;
            i2 = iArr[0];
        }
    }
}
