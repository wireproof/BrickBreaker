package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:ar.class */
public final class ar {
    private static int[] av;
    private static Hashtable b;
    private static int[] aw;
    private static int dN;
    private static int dO;
    private static Vector e = new Vector(944, 944);
    private static short[] g = new short[944];
    private static int[] ax = new int[944];

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static byte[] f20e = new byte[944];
    private static short[] h = new short[944];
    private static int[][] C;
    private static Vector f;
    private static short[] i;
    private static int[] ay;

    public static void initialize() {
        byte[] bArrA = ba.a(27918364);
        int length = bArrA.length >> 2;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArrA));
        C = new int[length][];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                byte[] bArrA2 = ba.a(dataInputStream.readInt());
                int length2 = bArrA2.length / 3;
                C[i2] = new int[length2];
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrA2);
                for (int i3 = 0; i3 < length2; i3++) {
                    C[i2][i3] = (byteArrayInputStream.read() << 16) | (byteArrayInputStream.read() << 8) | byteArrayInputStream.read() | (-16777216);
                }
                C[i2][0] = 0;
            } catch (IOException unused) {
            }
        }
    }

    public static void M() {
        dO = 0;
    }

    public static n a(int i2, boolean z) {
        if (!z) {
            dO = 0;
        }
        n nVar = null;
        try {
            nVar = new n(i2, z);
        } catch (IOException unused) {
        }
        return nVar;
    }

    public static n a(int i2) {
        return a(i2, false);
    }

    public static n[] a(int[] iArr) {
        n[] nVarArr = new n[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            nVarArr[i2] = a(iArr[i2], false);
        }
        return nVarArr;
    }

    public static Image getImage(int i2) {
        return a(i2, 0, 1024).c;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Image m3a(int i2) {
        return a(i2, 0, 1024).c;
    }

    private static l a(int i2, int i3, int i4) {
        l lVarA = null;
        if (i2 != -1) {
            lVarA = null;
            DataInputStream dataInputStreamM22a = ba.m22a(i2);
            try {
                int i5 = (dataInputStreamM22a.read() >> 4) + 1;
                int i6 = dataInputStreamM22a.readInt();
                int i7 = dataInputStreamM22a.read();
                dataInputStreamM22a.close();
                lVarA = a(i6, i7, 0, i5 * 1024);
            } catch (IOException unused) {
            }
            l lVar = lVarA;
            if (b == null) {
                b = new Hashtable();
            }
            b.put(new StringBuffer().append("").append(0).append(".").append(1024).append(".").append(1024).append(".").append(i2).toString(), lVar);
        }
        return lVarA;
    }

    public static void a(int i2, int i3, int i4, int i5, boolean z, int[] iArr) {
        boolean z2 = true;
        int i6 = 0;
        iArr[1] = 0;
        if (i3 != 253 && i3 == 255) {
            i6 = i4;
            z2 = false;
        }
        int i7 = ((i5 - 1) << 8) | i6;
        int iB = b(i2, i3, i7);
        if (iB != -1) {
            iArr[0] = iB;
            if (z2) {
                iArr[1] = i4;
                return;
            }
            return;
        }
        int iB2 = b(-1, 0, 0);
        int i8 = iB2;
        if (iB2 == -1) {
            int size = e.size();
            i8 = size;
            if (size == ax.length) {
                int[] iArr2 = new int[i8 << 1];
                byte[] bArr = new byte[i8 << 1];
                short[] sArr = new short[i8 << 1];
                short[] sArr2 = new short[i8 << 1];
                System.arraycopy(ax, 0, iArr2, 0, i8);
                System.arraycopy(f20e, 0, bArr, 0, i8);
                System.arraycopy(g, 0, sArr, 0, i8);
                System.arraycopy(h, 0, sArr2, 0, i8);
                ax = iArr2;
                f20e = bArr;
                g = sArr;
                h = sArr2;
            }
            g[i8] = 0;
        }
        ax[i8] = i2;
        f20e[i8] = (byte) i3;
        h[i8] = (short) i7;
        if (i8 == e.size()) {
            e.addElement(null);
        }
        if (z) {
            e.setElementAt(a(i2, i3, i6, i5 << 10), i8);
        } else {
            int i9 = i8;
            int i10 = i6;
            if (aw == null) {
                aw = new int[4720];
            }
            int i11 = dN * 5;
            int i12 = i11;
            if (i11 == aw.length) {
                int[] iArr3 = new int[aw.length << 1];
                System.arraycopy(aw, 0, iArr3, 0, i12);
                aw = iArr3;
            }
            aw[i12] = i9;
            aw[i12 + 1] = i2;
            aw[i12 + 2] = i3;
            aw[i12 + 3] = i10;
            aw[i12 + 4] = i5;
            dN++;
            while (i12 > 0 && aw[i12 + 1] < aw[(i12 + 1) - 5]) {
                int[] iArr4 = aw;
                int i13 = 5;
                int i14 = i12 - 5;
                int i15 = i12;
                while (true) {
                    i13--;
                    if (i13 >= 0) {
                        int i16 = iArr4[i15];
                        iArr4[i15] = iArr4[i14];
                        iArr4[i14] = i16;
                        i15++;
                        i14++;
                    }
                }
                i12 -= 5;
            }
        }
        iArr[0] = i8;
        if (z2) {
            iArr[1] = i4;
        }
    }

    public static int z() {
        return dN;
    }

    public static void N() {
        int i2 = dO * 5;
        int i3 = i2 + 1;
        int i4 = aw[i2];
        if (m4a(i4) == null) {
            int i5 = i3 + 1;
            int i6 = aw[i3];
            int i7 = i5 + 1;
            e.setElementAt(a(i6, aw[i5], aw[i7], aw[i7 + 1] << 10), i4);
        }
        int i8 = dO + 1;
        dO = i8;
        if (i8 == dN) {
            aw = null;
            dO = 0;
            dN = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v158, types: [int] */
    /* JADX WARN: Type inference failed for: r2v175, types: [int] */
    /* JADX WARN: Type inference failed for: r2v38, types: [int] */
    /* JADX WARN: Type inference failed for: r2v48, types: [int] */
    /* JADX WARN: Type inference failed for: r2v64, types: [int] */
    /* JADX WARN: Type inference failed for: r2v76, types: [int] */
    private static l a(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int length;
        int i8;
        if (i3 == 253) {
            return new l(i2);
        }
        byte[] bArrA = ba.a(i2);
        int i9 = (bArrA[0] << 8) | (bArrA[1] & 255);
        int[] iArr = null;
        if (i3 == 254 || i3 == 255) {
            i6 = i3;
            i7 = 2;
            int length2 = (bArrA.length - 2) / i9;
            length = i3 == 254 ? length2 / 3 : length2 >> 2;
        } else {
            i7 = 10;
            length = (bArrA.length - 10) / i9;
            iArr = C[i3];
            i6 = -1;
        }
        int[] iArr2 = iArr;
        int i10 = length;
        int i11 = i6;
        int i12 = i7;
        boolean z = (i4 & 1) != 0;
        boolean z2 = (i4 & 2) != 0;
        boolean z3 = i11 == -1 && i12 != 0;
        int i13 = 4;
        int i14 = 4;
        int length3 = 0;
        if (i11 == -1) {
            i13 = 1;
            i14 = 1;
            length3 = (3 * iArr2.length) + 4 + 4 + 4 + 1 + 4 + 4 + 4;
        } else if (i11 == 254) {
            i14 = 3;
        }
        int i15 = (i9 * i5) >> 10;
        int i16 = i15 > 0 ? i15 : 1;
        int i17 = (i10 * i5) >> 10;
        int i18 = i17 > 0 ? i17 : 1;
        int i19 = 65531 - (65531 % ((i16 * i13) + 1));
        int i20 = (i16 * i18 * i13) + i18;
        int i21 = ((i20 - 1) / i19) + 1;
        int i22 = i20 + 6 + (i21 * 5);
        byte[] bArr = new byte[i22 + 57 + length3];
        bArr[0] = -119;
        bArr[1] = 80;
        bArr[2] = 78;
        bArr[3] = 71;
        bArr[4] = 13;
        bArr[5] = 10;
        bArr[6] = 26;
        bArr[7] = 10;
        bArr[11] = 13;
        bArr[12] = 73;
        bArr[13] = 72;
        bArr[14] = 68;
        bArr[15] = 82;
        bArr[18] = (byte) (i16 >> 8);
        bArr[19] = (byte) i16;
        bArr[22] = (byte) (i18 >> 8);
        bArr[23] = (byte) i18;
        bArr[24] = 8;
        bArr[25] = (byte) (i11 == -1 ? 3 : 6);
        int iA = a(bArr, 12, 17);
        bArr[29] = iA >> 24;
        bArr[30] = (byte) (iA >> 16);
        bArr[31] = (byte) (iA >> 8);
        bArr[32] = (byte) iA;
        int i23 = 33;
        if (i11 == -1) {
            int length4 = iArr2.length * 3;
            bArr[35] = (byte) (length4 >> 8);
            bArr[36] = (byte) length4;
            bArr[37] = 80;
            bArr[38] = 76;
            bArr[39] = 84;
            bArr[40] = 69;
            int i24 = 41;
            for (int i25 = 0; i25 < iArr2.length; i25++) {
                int i26 = i24;
                int i27 = i24 + 1;
                bArr[i26] = (byte) (iArr2[i25] >> 16);
                int i28 = i27 + 1;
                bArr[i27] = (byte) (iArr2[i25] >> 8);
                i24 = i28 + 1;
                bArr[i28] = (byte) iArr2[i25];
            }
            int iA2 = a(bArr, (i24 - length4) - 4, length4 + 4);
            int i29 = i24;
            int i30 = i24 + 1;
            bArr[i29] = iA2 >> 24;
            int i31 = i30 + 1;
            bArr[i30] = (byte) (iA2 >>> 16);
            int i32 = i31 + 1;
            bArr[i31] = (byte) (iA2 >>> 8);
            bArr[i32] = (byte) iA2;
            int i33 = i32 + 1 + 3;
            int i34 = i33 + 1;
            bArr[i33] = 1;
            int i35 = i34 + 1;
            bArr[i34] = 116;
            int i36 = i35 + 1;
            bArr[i35] = 82;
            int i37 = i36 + 1;
            bArr[i36] = 78;
            bArr[i37] = 83;
            int i38 = i37 + 1 + 1;
            int iA3 = a(bArr, i38 - 5, 5);
            int i39 = i38 + 1;
            bArr[i38] = iA3 >> 24;
            int i40 = i39 + 1;
            bArr[i39] = (byte) (iA3 >>> 16);
            int i41 = i40 + 1;
            bArr[i40] = (byte) (iA3 >>> 8);
            i23 = i41 + 1;
            bArr[i41] = (byte) iA3;
        }
        int i42 = i23;
        int i43 = i23 + 1;
        bArr[i42] = i22 >> 24;
        int i44 = i43 + 1;
        bArr[i43] = (byte) (i22 >> 16);
        int i45 = i44 + 1;
        bArr[i44] = (byte) (i22 >> 8);
        int i46 = i45 + 1;
        bArr[i45] = (byte) i22;
        int i47 = i46 + 1;
        bArr[i46] = 73;
        int i48 = i47 + 1;
        bArr[i47] = 68;
        int i49 = i48 + 1;
        bArr[i48] = 65;
        int i50 = i49 + 1;
        bArr[i49] = 84;
        int i51 = i50 + 1;
        bArr[i50] = 120;
        int i52 = i51 + 1;
        bArr[i51] = 1;
        int i53 = 1;
        int i54 = i19;
        int i55 = 0;
        boolean z4 = i5 == 1024 && i4 == 0 && z3;
        int i56 = i13 * i16;
        for (int i57 = 0; i57 < i21; i57++) {
            if (i57 == i21 - 1) {
                bArr[i52] = 1;
                i54 = ((i20 - 1) % i19) + 1;
            }
            int i58 = i52 + 1;
            int i59 = i58 + 1;
            bArr[i58] = (byte) i54;
            int i60 = i59 + 1;
            bArr[i59] = (byte) (i54 >> 8);
            int i61 = i54 ^ 65535;
            int i62 = i60 + 1;
            bArr[i60] = (byte) i61;
            i52 = i62 + 1;
            bArr[i62] = (byte) (i61 >> 8);
            int i63 = 0;
            while (i55 < i18 && i63 < i54) {
                int i64 = i63 + 1;
                i52++;
                int i65 = z2 ? (i18 - i55) - 1 : i55;
                if (i5 != 1024) {
                    i65 = (i65 << 10) / i5;
                }
                int i66 = (i65 * i9 * i14) + i12;
                if (i11 != -1 || i5 != 1024) {
                    for (int i67 = 0; i67 < i16; i67++) {
                        int i68 = z ? (i16 - i67) - 1 : i67;
                        if (i5 != 1024) {
                            i68 = (i68 << 10) / i5;
                        }
                        int i69 = i66 + (i68 * i14);
                        int i70 = i52;
                        i52++;
                        bArr[i70] = bArrA[i69];
                        if (i11 != -1) {
                            int i71 = i52 + 1;
                            int i72 = i69 + 1;
                            bArr[i52] = bArrA[i72];
                            int i73 = i71 + 1;
                            int i74 = i72 + 1;
                            bArr[i71] = bArrA[i74];
                            i52 = i73 + 1;
                            bArr[i73] = i11 == 255 ? bArrA[i74 + 1] : (byte) -1;
                        }
                    }
                } else if (z) {
                    int i75 = (i66 + i16) - 1;
                    int i76 = i16;
                    while (true) {
                        i76--;
                        if (i76 >= 0) {
                            int i77 = i52;
                            i52++;
                            int i78 = i75;
                            i75 = i78 - 1;
                            bArr[i77] = bArrA[i78];
                        }
                    }
                } else {
                    int i79 = i66;
                    int i80 = i16;
                    while (true) {
                        i80--;
                        if (i80 >= 0) {
                            int i81 = i52;
                            i52++;
                            int i82 = i79;
                            i79++;
                            bArr[i81] = bArrA[i82];
                        }
                    }
                }
                i63 = i64 + i56;
                i55++;
            }
            if (!z4) {
                int i83 = i53;
                int i84 = i52 - i54;
                int i85 = i83 >>> 16;
                int i86 = i83 & 65535;
                int i87 = i54 + i84;
                while (i84 < i87) {
                    i86 = (i86 + ((bArr[i84] ? 1 : 0) & 255)) % 65521;
                    i85 = (i85 + i86) % 65521;
                    i84++;
                }
                i53 = (i85 << 16) + i86;
            }
        }
        if (z4) {
            int i88 = i52;
            int i89 = i52 + 1;
            bArr[i88] = bArrA[2];
            int i90 = i89 + 1;
            bArr[i89] = bArrA[3];
            int i91 = i90 + 1;
            bArr[i90] = bArrA[4];
            int i92 = i91 + 1;
            bArr[i91] = bArrA[5];
            int i93 = i92 + 1;
            bArr[i92] = bArrA[6];
            int i94 = i93 + 1;
            bArr[i93] = bArrA[7];
            i8 = i94 + 1;
            bArr[i94] = bArrA[8];
            bArr[i8] = bArrA[9];
        } else {
            int i95 = i52;
            int i96 = i52 + 1;
            bArr[i95] = i53 >> 24;
            int i97 = i96 + 1;
            bArr[i96] = (byte) (i53 >>> 16);
            int i98 = i97 + 1;
            bArr[i97] = (byte) (i53 >>> 8);
            int i99 = i98 + 1;
            bArr[i98] = (byte) i53;
            int iA4 = a(bArr, i46, i99 - i46);
            int i100 = i99 + 1;
            bArr[i99] = iA4 >> 24;
            int i101 = i100 + 1;
            bArr[i100] = (byte) (iA4 >>> 16);
            i8 = i101 + 1;
            bArr[i101] = (byte) (iA4 >>> 8);
            bArr[i8] = (byte) iA4;
        }
        int i102 = i8 + 5;
        int i103 = i102 + 1;
        bArr[i102] = 73;
        int i104 = i103 + 1;
        bArr[i103] = 69;
        int i105 = i104 + 1;
        bArr[i104] = 78;
        int i106 = i105 + 1;
        bArr[i105] = 68;
        int i107 = i106 + 1;
        bArr[i106] = -82;
        int i108 = i107 + 1;
        bArr[i107] = 66;
        bArr[i108] = 96;
        bArr[i108 + 1] = -126;
        return new l(Image.createImage(bArr, 0, bArr.length));
    }

    public static void a(n nVar, int i2) {
        if (nVar == null) {
            return;
        }
        int iR = nVar.r();
        while (true) {
            iR--;
            if (iR < 0) {
                return;
            }
            if (!nVar.d(iR)) {
                int[][] iArrA = nVar.a(iR).a();
                int length = iArrA.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        int[] iArr = iArrA[length];
                        int i3 = iArr[0];
                        if (i3 == 1) {
                            int i4 = iArr[3];
                            int i5 = g[i4] + i2;
                            int i6 = i5;
                            if (i5 < 0) {
                                i6 = 0;
                            }
                            g[i4] = (short) i6;
                        } else if (i3 == 9) {
                            int i7 = iArr[4];
                            short[] sArr = i;
                            sArr[i7] = (short) (sArr[i7] + i2);
                            if (i[i7] <= 0) {
                                i[i7] = 0;
                                ay ayVarM5a = m5a(i7);
                                if (ayVarM5a != null) {
                                    ayVarM5a.m();
                                    f.setElementAt(null, i7);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static int b(int i2, int i3, int i4) {
        int size = e.size();
        while (true) {
            size--;
            if (size < 0) {
                return -1;
            }
            if (ax[size] == i2 && (i2 == -1 || (i3 == (f20e[size] & 255) && i4 == h[size]))) {
                return size;
            }
        }
    }

    private static int a(byte[] bArr, int i2, int i3) {
        if (av == null) {
            av = new int[256];
            for (int i4 = 0; i4 < 256; i4++) {
                int i5 = i4;
                for (int i6 = 0; i6 < 8; i6++) {
                    i5 = (i5 & 1) != 0 ? (-306674912) ^ (i5 >>> 1) : i5 >>> 1;
                    av[i4] = i5;
                }
            }
        }
        int i7 = -1;
        int i8 = i3 + i2;
        while (i2 < i8) {
            i7 = av[(i7 ^ bArr[i2]) & 255] ^ (i7 >>> 8);
            i2++;
        }
        return i7 ^ (-1);
    }

    public static void O() {
        int size = e.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (g[size] == 0 && m4a(size) != null) {
                e.setElementAt(null, size);
                ax[size] = -1;
            }
        }
    }

    public static int b(int i2, boolean z) {
        if (ay == null) {
            ay = new int[944];
            i = new short[944];
            f = new Vector(944);
        }
        int size = f.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i2 == ay[i3] && m5a(i3) != null) {
                return i3;
            }
        }
        int i4 = 0;
        while (i4 < size && m5a(i4) != null) {
            i4++;
        }
        if (i4 >= ay.length) {
            int length = ay.length;
            int i5 = length << 1;
            short[] sArr = new short[i5];
            int[] iArr = new int[i5];
            System.arraycopy(i, 0, sArr, 0, length);
            System.arraycopy(ay, 0, iArr, 0, length);
            i = sArr;
            ay = iArr;
        }
        if (i4 == size) {
            f.addElement(null);
        }
        f.setElementAt(new ay(), i4);
        ay[i4] = i2;
        f.setElementAt(new ay(a(i2, z)), i4);
        return i4;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static l m4a(int i2) {
        return (l) e.elementAt(i2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static ay m5a(int i2) {
        return (ay) f.elementAt(i2);
    }

    public static int b(int i2, int i3, int i4, int i5) {
        int iC = c(i2 >>> 24, i3 >>> 24, i4, i5);
        int iC2 = c((i2 >> 16) & 255, (i3 >> 16) & 255, i4, i5);
        int iC3 = c(i2 & 65280, i3 & 65280, i4, i5);
        return (iC << 24) | (iC2 << 16) | (iC3 & 65280) | c(i2 & 255, i3 & 255, i4, i5);
    }

    public static int c(int i2, int i3, int i4, int i5) {
        return i2 + (((i3 - i2) * i4) / i5);
    }

    public static final int m(int i2) {
        return al.f(ab.cos(i2), 32768);
    }

    public static final int n(int i2) {
        return al.f(ab.sin(i2), 32768);
    }
}
