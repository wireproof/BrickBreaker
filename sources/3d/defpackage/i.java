package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-3d.jar:i.class */
public final class i {
    Object[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte[] f123a;
    private short[] d;
    private short[] e;
    private byte[] b;
    int bF = -1;
    int bG = -1;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    f f124b;
    private short[] f;
    private short[] g;
    private f[] c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    short[][] f125a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private short[][] f126b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private short[][] f127c;
    int bH;
    private int bI;
    private int bJ;
    private int bK;
    private boolean H;
    private boolean I;
    private short[] h;
    private int bL;
    boolean J;
    int bM;
    int bN;
    private int bO;
    private int bP;
    boolean K;
    private short[] i;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    byte[] f128c;
    static int bQ;

    public i(int i, Object[] objArr) {
        a(i, objArr);
    }

    private void a(int i, Object[] objArr) {
        this.a = objArr;
        byte[] bArrA = p.a(i);
        this.f123a = bArrA;
        int i2 = bArrA[0] & 255;
        int i3 = 2;
        this.d = new short[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3;
            int i6 = i3 + 1;
            i3 = i6 + 1;
            this.d[i4] = (short) (((bArrA[i5] & 255) << 8) | (bArrA[i6] & 255));
        }
        int i7 = i3 + 1;
        int i8 = i7 + 1;
        this.bH = bArrA[i7] & 255;
        this.bI = this.bH;
        int i9 = i8 + 1;
        this.bJ = bArrA[i8] & 255;
        this.bK = this.bI + this.bJ;
        int i10 = i9 + 1;
        int i11 = bArrA[i9] & 255;
        int i12 = this.bH + this.bJ + i11;
        this.b = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10;
            i10++;
            this.b[i13] = bArrA[i14];
        }
        this.e = new short[i12];
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i10;
            int i17 = i10 + 1;
            i10 = i17 + 1;
            this.e[i15] = (short) (((bArrA[i16] & 255) << 8) | (bArrA[i17] & 255));
        }
        this.bG = bArrA[i10] & 255;
        this.c = new f[this.bH];
        this.f125a = new short[this.bH][];
        this.f126b = new short[this.bJ][];
        this.f127c = new short[i11][];
        this.f128c = new byte[this.bH];
        int i18 = this.bH;
        int i19 = 0;
        while (i19 < this.bJ) {
            r(i18);
            i19++;
            i18++;
        }
        int i20 = 0;
        while (i20 < i11) {
            s(i18);
            i20++;
            i18++;
        }
        this.h = new short[this.bH + i11 + this.bJ];
        this.bL = 0;
        this.I = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void D() {
        int iCurrentTimeMillis;
        int i;
        while (this.bG != -1) {
            if (!this.J) {
                byte b = this.bF != -1 ? this.b[this.bF] : (byte) -1;
                byte b2 = this.b[this.bG];
                if (this.bF != -1) {
                    if (b != -1) {
                        if (b != b2 && !DCWall3D.a(b, b2)) {
                            DCWall3D.m2a(this.a, (int) b);
                            int length = this.b.length;
                            while (true) {
                                length--;
                                if (length < 0) {
                                    break;
                                } else if (this.b[length] == b && d(length)) {
                                    u(length);
                                }
                            }
                        }
                    } else if (d(this.bF)) {
                        u(this.bF);
                    }
                    DCWall3D.F(this.bF);
                    this.f124b = null;
                    this.f = null;
                    this.g = null;
                    p.L();
                }
                this.bO = 0;
                if (b2 == -1 || b2 == b) {
                    int i2 = this.bG;
                    if (d(i2) && this.c[i2] == null) {
                        this.i = new short[]{(short) i2};
                    } else {
                        this.i = new short[0];
                    }
                } else {
                    if (!DCWall3D.a(b2, b)) {
                        this.bO = DCWall3D.m1a(this.a, (int) b2);
                    }
                    int i3 = 0;
                    for (int i4 = 0; i4 < this.b.length; i4++) {
                        if (this.b[i4] == b2 && d(i4) && this.c[i4] == null) {
                            i3++;
                        }
                    }
                    this.i = new short[i3];
                    int i5 = 0;
                    for (int i6 = 0; i6 < this.b.length; i6++) {
                        if (this.b[i6] == b2 && d(i6) && this.c[i6] == null) {
                            int i7 = i5;
                            i5++;
                            this.i[i7] = (short) i6;
                        }
                    }
                }
                this.bP = DCWall3D.m3k(this.bG);
                this.bM = this.bO + this.bP + this.i.length;
                if (this.bM > 0) {
                    DCWall3D.a(this.a, true);
                    this.bN = 0;
                    this.J = true;
                    switch (this.bG) {
                        case 44:
                            i = DCWall3D.f3b.a(2) ? 0 : 100;
                            break;
                        case 45:
                        case 47:
                        case 50:
                        default:
                            i = -1;
                            break;
                        case 46:
                        case 48:
                        case 49:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            i = 0;
                            break;
                    }
                    bQ = i;
                    this.K = false;
                    p.L();
                    return;
                }
            } else {
                if (this.bN < this.bM) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    do {
                        if (this.K) {
                            c.d();
                        } else if (this.bN >= this.bO) {
                            if (this.bN < this.bP) {
                                DCWall3D.b(this.a, this.bG, this.bN - this.bO);
                            } else {
                                short s = this.i[(this.bN - this.bO) - this.bP];
                                if (DCWall3D.b(this.a, (int) s)) {
                                    byte[] bArr = this.f123a;
                                    short s2 = this.e[s];
                                    int i8 = s2 + 1;
                                    byte b3 = bArr[s2];
                                    Vector vector = new Vector();
                                    Image[][] imageArr = new Image[1][];
                                    n[] nVarArr = new n[1];
                                    int i9 = i8 + 1;
                                    boolean z = bArr[i8];
                                    int i10 = i9 + 1;
                                    boolean z2 = bArr[i9];
                                    f fVar = new f();
                                    DCWall3D.a(this.a, s, fVar, 0);
                                    DCWall3D.a(s, fVar, z ? 1 : 0, b3 == true ? 1 : 0, z2 ? 1 : 0);
                                    int i11 = i10 + 1;
                                    DCWall3D.a(fVar, bArr[i10] ? 1 : 0);
                                    int i12 = i11 + 1;
                                    int i13 = ((bArr[i11] ? 1 : 0) & 255) << 24;
                                    int i14 = i12 + 1;
                                    int i15 = i13 | (((bArr[i12] ? 1 : 0) & 255) << 16);
                                    int i16 = i14 + 1;
                                    String strA = DCWall3D.a(this.a, s, i15 | (((bArr[i14] ? 1 : 0) & 255) << 8) | ((bArr[i16] ? 1 : 0) & 255), -1);
                                    int iA = a(bArr, i16 + 1, 1, imageArr, nVarArr);
                                    Image image = imageArr[0] == null ? null : imageArr[0][0];
                                    n nVar = nVarArr[0];
                                    int i17 = iA + 1;
                                    if ((strA != null && strA.length() != 0) || nVar != null || image != null) {
                                        if (nVar != null) {
                                            DCWall3D.a(fVar, strA, nVar);
                                        } else {
                                            DCWall3D.a(fVar, strA, image);
                                        }
                                    }
                                    int i18 = i17 + 1;
                                    boolean z3 = bArr[i17];
                                    int i19 = i18 + 1;
                                    int i20 = (bArr[i18] ? 1 : 0) & 255;
                                    if (i20 != 255) {
                                        vector.addElement(new Integer(z3 ? 1 : 0));
                                        vector.addElement(new Integer(i20));
                                    }
                                    DCWall3D.a(fVar, z3 ? 1 : 0, 0);
                                    int i21 = i19 + 1;
                                    boolean z4 = bArr[i19];
                                    int iA2 = i21 + 1;
                                    int i22 = (bArr[i21] ? 1 : 0) & 255;
                                    if (i22 != 255) {
                                        vector.addElement(new Integer(z4 ? 1 : 0));
                                        vector.addElement(new Integer(i22));
                                    }
                                    DCWall3D.a(fVar, z4 ? 1 : 0, 1);
                                    for (int i23 = 0; i23 < b3; i23++) {
                                        int i24 = iA2;
                                        iA2++;
                                        boolean z5 = bArr[i24];
                                        switch (z5 ? 1 : 0) {
                                            case 0:
                                                int i25 = iA2 + 1;
                                                int i26 = ((bArr[iA2] ? 1 : 0) & 255) << 24;
                                                int i27 = i25 + 1;
                                                int i28 = i26 | (((bArr[i25] ? 1 : 0) & 255) << 16);
                                                int i29 = i27 + 1;
                                                String strA2 = DCWall3D.a(this.a, s, i28 | (((bArr[i27] ? 1 : 0) & 255) << 8) | ((bArr[i29] ? 1 : 0) & 255), i23);
                                                int iA3 = a(bArr, i29 + 1, 3, imageArr, nVarArr);
                                                Image[] imageArr2 = imageArr[0];
                                                n nVar2 = nVarArr[0];
                                                iA2 = iA3 + 1;
                                                int i30 = (bArr[iA3] ? 1 : 0) & 255;
                                                int i31 = i30;
                                                if (i30 == 255) {
                                                    i31 = -1;
                                                }
                                                DCWall3D.a(this.a, s, fVar, i23, z5 ? 1 : 0, strA2, nVar2, imageArr2, i31);
                                                break;
                                            case 1:
                                                int i32 = iA2 + 1;
                                                int i33 = ((bArr[iA2] ? 1 : 0) & 255) << 24;
                                                int i34 = i32 + 1;
                                                int i35 = i33 | (((bArr[i32] ? 1 : 0) & 255) << 16);
                                                int i36 = i34 + 1;
                                                String strA3 = DCWall3D.a(this.a, s, i35 | (((bArr[i34] ? 1 : 0) & 255) << 8) | ((bArr[i36] ? 1 : 0) & 255), i23);
                                                int iA4 = a(bArr, i36 + 1, 4, imageArr, nVarArr);
                                                Image[] imageArr3 = imageArr[0];
                                                n nVar3 = nVarArr[0];
                                                int i37 = iA4 + 1;
                                                int i38 = bArr[iA4];
                                                String[] strArr = new String[i38];
                                                for (int i39 = 0; i39 < i38; i39++) {
                                                    int i40 = i37;
                                                    int i41 = i37 + 1;
                                                    int i42 = i41 + 1;
                                                    int i43 = (((bArr[i40] ? 1 : 0) & 255) << 24) | (((bArr[i41] ? 1 : 0) & 255) << 16);
                                                    int i44 = i42 + 1;
                                                    int i45 = i43 | (((bArr[i42] ? 1 : 0) & 255) << 8);
                                                    i37 = i44 + 1;
                                                    strArr[i39] = DCWall3D.a(this.a, s, i45 | ((bArr[i44] ? 1 : 0) & 255), i23);
                                                }
                                                int iA5 = a(bArr, i37, i38, imageArr, nVarArr);
                                                Image[] imageArr4 = imageArr[0];
                                                n nVar4 = nVarArr[0];
                                                iA2 = iA5 + 1;
                                                int i46 = (bArr[iA5] ? 1 : 0) & 255;
                                                int i47 = i46;
                                                if (i46 == 255) {
                                                    i47 = -1;
                                                }
                                                DCWall3D.a(this.a, s, fVar, i23, strA3, nVar3, imageArr3, strArr, nVar4, imageArr4, i47);
                                                break;
                                            case 2:
                                                int i48 = iA2 + 1;
                                                int i49 = ((bArr[iA2] ? 1 : 0) & 255) << 24;
                                                int i50 = i48 + 1;
                                                int i51 = i49 | (((bArr[i48] ? 1 : 0) & 255) << 16);
                                                int i52 = i50 + 1;
                                                String strA4 = DCWall3D.a(this.a, s, i51 | (((bArr[i50] ? 1 : 0) & 255) << 8) | ((bArr[i52] ? 1 : 0) & 255), i23);
                                                int iA6 = a(bArr, i52 + 1, 4, imageArr, nVarArr);
                                                Image[] imageArr5 = imageArr[0];
                                                n nVar5 = nVarArr[0];
                                                int i53 = iA6 + 1;
                                                int i54 = (bArr[iA6] ? 1 : 0) & 255;
                                                int i55 = i53 + 1;
                                                int i56 = (bArr[i53] ? 1 : 0) & 255;
                                                iA2 = i55 + 1;
                                                int i57 = (bArr[i55] ? 1 : 0) & 255;
                                                int i58 = i57;
                                                if (i57 == 255) {
                                                    i58 = -1;
                                                }
                                                DCWall3D.a(this.a, s, fVar, i23, strA4, nVar5, imageArr5, i54, i56, i58);
                                                break;
                                            case 3:
                                                int i59 = iA2 + 1;
                                                int i60 = (bArr[iA2] ? 1 : 0) & 255;
                                                int i61 = i59 + 1;
                                                int i62 = ((bArr[i59] ? 1 : 0) & 255) << 24;
                                                int i63 = i61 + 1;
                                                int i64 = i62 | (((bArr[i61] ? 1 : 0) & 255) << 16);
                                                int i65 = i63 + 1;
                                                int i66 = i64 | (((bArr[i63] ? 1 : 0) & 255) << 8);
                                                int i67 = i65 + 1;
                                                String strA5 = DCWall3D.a(this.a, s, i66 | ((bArr[i65] ? 1 : 0) & 255), i23);
                                                int i68 = i67 + 1;
                                                int i69 = ((bArr[i67] ? 1 : 0) & 255) << 24;
                                                int i70 = i68 + 1;
                                                int i71 = i69 | (((bArr[i68] ? 1 : 0) & 255) << 16);
                                                int i72 = i70 + 1;
                                                String strA6 = DCWall3D.a(this.a, s, i71 | (((bArr[i70] ? 1 : 0) & 255) << 8) | ((bArr[i72] ? 1 : 0) & 255), i23);
                                                int iA7 = a(bArr, i72 + 1, 3, imageArr, nVarArr);
                                                Image[] imageArr6 = imageArr[0];
                                                n nVar6 = nVarArr[0];
                                                int i73 = iA7 + 1;
                                                int i74 = (bArr[iA7] ? 1 : 0) & 255;
                                                iA2 = i73 + 1;
                                                int i75 = (bArr[i73] ? 1 : 0) & 255;
                                                int i76 = i75;
                                                if (i75 == 255) {
                                                    i76 = -1;
                                                }
                                                DCWall3D.a(fVar, i23, i60, strA5, strA6, nVar6, imageArr6, i74, i76);
                                                break;
                                            case 4:
                                                int i77 = iA2 + 1;
                                                int i78 = ((bArr[iA2] ? 1 : 0) & 255) << 24;
                                                int i79 = i77 + 1;
                                                int i80 = i78 | (((bArr[i77] ? 1 : 0) & 255) << 16);
                                                int i81 = i79 + 1;
                                                String strA7 = DCWall3D.a(this.a, s, i80 | (((bArr[i79] ? 1 : 0) & 255) << 8) | ((bArr[i81] ? 1 : 0) & 255), i23);
                                                iA2 = a(bArr, i81 + 1, 1, imageArr, nVarArr);
                                                DCWall3D.a(this.a, s, fVar, i23, 1, strA7, nVarArr[0], imageArr[0], -1);
                                                break;
                                        }
                                    }
                                    DCWall3D.a(this.a, s, fVar, 1);
                                    DCWall3D.m6a(fVar);
                                    fVar.c(0);
                                    this.c[s] = fVar;
                                    if (vector.size() > 0) {
                                        short[] sArr = new short[vector.size()];
                                        for (int i82 = 0; i82 < vector.size(); i82++) {
                                            sArr[i82] = (short) ((Integer) vector.elementAt(i82)).intValue();
                                        }
                                        this.f125a[s] = sArr;
                                    }
                                }
                            }
                        }
                        this.bN++;
                        iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                        if (this.bN >= this.bM) {
                            return;
                        }
                    } while (iCurrentTimeMillis < 100);
                    return;
                }
                if (!this.K) {
                    this.bM = c.a();
                    if (this.bM > 0) {
                        this.bN = 0;
                        this.K = true;
                        return;
                    }
                }
                DCWall3D.a(this.a, false);
                this.J = false;
                s.b.aA();
            }
            int i83 = this.bF;
            this.bF = this.bG;
            this.bG = -1;
            int i84 = this.bL;
            while (true) {
                i84--;
                if (i84 < 0) {
                    break;
                } else if (this.h[i84] == this.bF) {
                    this.bL = i84;
                    break;
                }
            }
            int i85 = this.bF;
            if (i85 < this.bH) {
                this.f124b = this.c[i85];
                if (!this.H) {
                    this.f124b.c(this.f128c[this.bF] & 255);
                } else if (this.bF != 0 || q.de < 1 || q.de > 4) {
                    this.f124b.c(0);
                } else {
                    this.f124b.c(q.de + 1);
                }
                DCWall3D.a(this.a, i85, this.f124b, 2);
                this.f124b.g();
                DCWall3D.a(this.a, i85, this.f124b, 3);
                this.I = DCWall3D.m7e(i85);
            } else if (i85 < this.bH + this.bJ) {
                if (this.f126b[i85 - this.bI] == null) {
                    r(i85);
                }
                this.f = this.f126b[i85 - this.bI];
                this.I = DCWall3D.m7e(i85);
            } else {
                if (this.f127c[i85 - this.bK] == null) {
                    s(i85);
                }
                this.g = this.f127c[i85 - this.bK];
                this.I = false;
            }
            DCWall3D.a(this.a, i83, this.bF, this.f124b);
            if (this.g != null) {
                if (DCWall3D.a(this.a, this.bF)) {
                    t(this.g[0]);
                } else {
                    t(this.g[1]);
                }
            }
        }
        s.b.aA();
    }

    private boolean d(int i) {
        return i < this.bH;
    }

    private static int a(byte[] bArr, int i, int i2, Image[][] imageArr, n[] nVarArr) {
        imageArr[0] = null;
        nVarArr[0] = null;
        int[] iArr = new int[i2];
        byte[] bArr2 = new byte[i2];
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i;
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 16);
            int i8 = i6 + 1;
            int i9 = i7 | ((bArr[i6] & 255) << 8);
            int i10 = i8 + 1;
            iArr[i3] = i9 | (bArr[i8] & 255);
            z2 |= iArr[i3] != -1;
            i = i10 + 1;
            bArr2[i3] = bArr[i10];
            z |= bArr2[i3] == 2 || bArr2[i3] == 3;
        }
        if (z2) {
            if (z) {
                nVarArr[0] = new n(c.a(iArr, false), true);
            } else {
                imageArr[0] = new Image[i2];
                for (int i11 = 0; i11 < i2; i11++) {
                    Image imageA = null;
                    if (bArr2[i11] == 0) {
                        imageA = p.getImage(iArr[i11]);
                    } else if (bArr2[i11] == 1) {
                        imageA = c.a(iArr[i11], 0, 65536);
                    }
                    imageArr[0][i11] = imageA;
                }
            }
        }
        return i;
    }

    private void r(int i) {
        byte[] bArr = this.f123a;
        short s = this.e[this.bH + (i - this.bI)];
        int i2 = s + 1;
        int i3 = bArr[s] & 255;
        short[] sArr = new short[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2;
            i2++;
            sArr[i4] = (short) (bArr[i5] & 255);
            if (sArr[i4] == 255) {
                sArr[i4] = -1;
            }
        }
        this.f126b[i - this.bI] = sArr;
    }

    private void s(int i) {
        byte[] bArr = this.f123a;
        short s = this.e[this.bH + this.bJ + (i - this.bK)];
        short[] sArr = {(short) (bArr[s] & 255), (short) (bArr[s + 1] & 255)};
        if (sArr[0] == 255) {
            sArr[0] = -1;
        }
        if (sArr[1] == 255) {
            sArr[1] = -1;
        }
        this.f127c[i - this.bK] = sArr;
    }

    final void t(int i) {
        short s = -1;
        if (this.bL > 0) {
            s = this.h[this.bL - 1];
        }
        if (i != -1) {
            if (i == -2) {
                if (this.f == null || this.f.length <= 0) {
                    return;
                }
                t(this.f[0]);
                return;
            }
            if (i == -3) {
                this.H = false;
                this.bG = s;
                this.bL--;
                return;
            }
            if (i >= 0) {
                short s2 = this.d[i];
                if (s2 != -1) {
                    this.H = true;
                    this.bG = s2;
                    if (d(this.bF)) {
                        this.f128c[this.bF] = (byte) this.f124b.ai;
                        if (this.bF == 0 && this.f124b.ai == 1) {
                            this.f128c[this.bF] = 8;
                        }
                    }
                    if (s == s2) {
                        this.H = false;
                        this.bL--;
                    } else if (this.I) {
                        short[] sArr = this.h;
                        int i2 = this.bL;
                        this.bL = i2 + 1;
                        sArr[i2] = (short) this.bF;
                    }
                }
                DCWall3D.a(this.a, this.bF, i);
            }
        }
    }

    final void u(int i) {
        if (this.c[i] != null) {
            this.c[i].i();
            this.c[i] = null;
        }
    }

    public final int e() {
        if (this.J) {
            return (this.bN * 100) / this.bM;
        }
        return -1;
    }
}
