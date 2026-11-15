package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:ag.class */
public final class ag {
    byte d;
    final w[] a;

    public ag(int i, h hVar, as asVar) {
        w wVar;
        byte[] bArrA = ba.a(i);
        this.d = bArrA[0];
        int i2 = 0 + 1 + 1;
        this.a = new w[bArrA[1] & 255];
        for (int i3 = 0; i3 < this.a.length; i3++) {
            int i4 = i2;
            int i5 = i2 + 1;
            int i6 = i5 + 1;
            int i7 = (bArrA[i4] << 24) | ((bArrA[i5] & 255) << 16);
            int i8 = i6 + 1;
            int i9 = i7 | ((bArrA[i6] & 255) << 8);
            int i10 = i8 + 1;
            int i11 = i9 | (bArrA[i8] & 255);
            i2 = i10 + 1;
            int i12 = bArrA[i10] & 255;
            w[] wVarArr = this.a;
            int i13 = i3;
            switch (i12) {
                case 0:
                    wVar = new w(new ah(i11, hVar, null));
                    break;
                case 1:
                    wVar = new w(new ad(i11, hVar, null));
                    break;
                case 2:
                    wVar = new w(new ak(i11, hVar, null));
                    break;
                case 3:
                    wVar = new w(new aq(i11, hVar, null));
                    break;
                case 4:
                    wVar = new w(new aj(i11, hVar));
                    break;
                case 5:
                    wVar = new w(new x(i11, hVar));
                    break;
                default:
                    wVar = null;
                    break;
            }
            wVarArr[i13] = wVar;
        }
    }
}
