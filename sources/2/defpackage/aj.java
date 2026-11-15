package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:aj.class */
public final class aj {
    ac[] a;

    public aj(int i, h hVar) {
        ac acVar;
        byte[] bArrA = ba.a(i);
        int i2 = 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        this.a = new ac[(bArrA[16] << 8) | (bArrA[17] & 255)];
        for (int i3 = 0; i3 < this.a.length; i3++) {
            int i4 = bArrA[i2] & 255;
            int[] iArr = {i2 + 1};
            ac[] acVarArr = this.a;
            int i5 = i3;
            switch (i4) {
                case 0:
                    acVar = new ac(new av(bArrA, iArr));
                    break;
                case 1:
                    acVar = new ac(new m(bArrA, iArr));
                    break;
                case 2:
                    acVar = new ac(new y(bArrA, iArr));
                    break;
                case 3:
                    acVar = new ac(new s(bArrA, iArr));
                    break;
                case 4:
                    acVar = new ac(new t(bArrA, iArr));
                    break;
                default:
                    acVar = null;
                    break;
            }
            acVarArr[i5] = acVar;
            i2 = iArr[0];
        }
    }
}
