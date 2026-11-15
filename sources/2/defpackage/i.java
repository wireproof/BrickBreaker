package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:i.class */
public final class i {
    int aA;
    int aB;
    int aC;
    int aD;
    int aE;
    int aF;
    int aG;
    int aH;
    int aI;
    int aJ;
    int aK;
    int aL;
    int aM;
    int aN;
    int aO;
    int aP;
    int aQ;
    int aR;
    int aS;
    int aT;
    int aU;
    final w[] a;

    public i(int i, h hVar, as asVar) {
        w wVar;
        byte[] bArrA = ba.a(i);
        this.aA = (bArrA[0] << 24) | ((bArrA[1] & 255) << 16) | ((bArrA[2] & 255) << 8) | (bArrA[3] & 255);
        this.aB = (bArrA[4] << 24) | ((bArrA[5] & 255) << 16) | ((bArrA[6] & 255) << 8) | (bArrA[7] & 255);
        this.aC = (bArrA[8] << 24) | ((bArrA[9] & 255) << 16) | ((bArrA[10] & 255) << 8) | (bArrA[11] & 255);
        this.aD = (bArrA[12] << 24) | ((bArrA[13] & 255) << 16) | ((bArrA[14] & 255) << 8) | (bArrA[15] & 255);
        this.aE = (bArrA[16] << 24) | ((bArrA[17] & 255) << 16) | ((bArrA[18] & 255) << 8) | (bArrA[19] & 255);
        this.aF = (bArrA[20] << 24) | ((bArrA[21] & 255) << 16) | ((bArrA[22] & 255) << 8) | (bArrA[23] & 255);
        this.aG = (bArrA[24] << 24) | ((bArrA[25] & 255) << 16) | ((bArrA[26] & 255) << 8) | (bArrA[27] & 255);
        this.aH = (bArrA[28] << 24) | ((bArrA[29] & 255) << 16) | ((bArrA[30] & 255) << 8) | (bArrA[31] & 255);
        this.aI = (bArrA[32] << 24) | ((bArrA[33] & 255) << 16) | ((bArrA[34] & 255) << 8) | (bArrA[35] & 255);
        this.aJ = (bArrA[36] << 24) | ((bArrA[37] & 255) << 16) | ((bArrA[38] & 255) << 8) | (bArrA[39] & 255);
        this.aK = (bArrA[40] << 24) | ((bArrA[41] & 255) << 16) | ((bArrA[42] & 255) << 8) | (bArrA[43] & 255);
        this.aL = (bArrA[44] << 24) | ((bArrA[45] & 255) << 16) | ((bArrA[46] & 255) << 8) | (bArrA[47] & 255);
        this.aM = (bArrA[48] << 24) | ((bArrA[49] & 255) << 16) | ((bArrA[50] & 255) << 8) | (bArrA[51] & 255);
        this.aN = (bArrA[52] << 24) | ((bArrA[53] & 255) << 16) | ((bArrA[54] & 255) << 8) | (bArrA[55] & 255);
        this.aO = (bArrA[56] << 24) | ((bArrA[57] & 255) << 16) | ((bArrA[58] & 255) << 8) | (bArrA[59] & 255);
        this.aP = (bArrA[60] << 24) | ((bArrA[61] & 255) << 16) | ((bArrA[62] & 255) << 8) | (bArrA[63] & 255);
        this.aQ = (bArrA[64] << 24) | ((bArrA[65] & 255) << 16) | ((bArrA[66] & 255) << 8) | (bArrA[67] & 255);
        this.aR = (bArrA[68] << 24) | ((bArrA[69] & 255) << 16) | ((bArrA[70] & 255) << 8) | (bArrA[71] & 255);
        this.aS = (bArrA[72] << 24) | ((bArrA[73] & 255) << 16) | ((bArrA[74] & 255) << 8) | (bArrA[75] & 255);
        this.aT = (bArrA[76] << 24) | ((bArrA[77] & 255) << 16) | ((bArrA[78] & 255) << 8) | (bArrA[79] & 255);
        this.aU = (bArrA[80] << 24) | ((bArrA[81] & 255) << 16) | ((bArrA[82] & 255) << 8) | (bArrA[83] & 255);
        int i2 = 0 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        this.a = new w[bArrA[84] & 255];
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
                    wVar = new w(new ah(i11, hVar, asVar));
                    break;
                case 1:
                    wVar = new w(new ad(i11, hVar, asVar));
                    break;
                case 2:
                    wVar = new w(new ak(i11, hVar, asVar));
                    break;
                case 3:
                    wVar = new w(new aq(i11, hVar, asVar));
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
