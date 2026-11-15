package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-3d.jar:c.class */
public final class c {
    private static int[] c;
    private static int[] d;
    private static int f;
    private static int g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[][] f19a;
    public static Vector a = new Vector(231, 231);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static short[] f18a = new short[231];
    private static int[] e = new int[231];
    private static short[] b = new short[231];

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static int[] f20f = new int[32];

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static int[] f21g = new int[32];
    private static int[] h = new int[32];
    private static int[] i = new int[32];
    private static int[] j = new int[32];
    private static int[] k = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static final short[] f22c = {0, 0, 0, 0, 1, 7, Short.MAX_VALUE, 0, 0};

    public static void initialize() {
        byte[] bArrA = p.a(327811);
        int length = bArrA.length >> 2;
        f19a = new int[length][];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i2;
            int i5 = i2 + 1;
            int i6 = i5 + 1;
            int i7 = (bArrA[i4] << 24) | ((bArrA[i5] & 255) << 16);
            int i8 = i6 + 1;
            int i9 = i7 | ((bArrA[i6] & 255) << 8);
            i2 = i8 + 1;
            byte[] bArrA2 = p.a(i9 | (bArrA[i8] & 255));
            int length2 = bArrA2.length / 3;
            f19a[i3] = new int[length2];
            while (true) {
                length2--;
                if (length2 >= 0) {
                    f19a[i3][length2] = (bArrA2[length2 * 3] << 24) | ((bArrA2[(length2 * 3) + 1] & 255) << 16) | ((bArrA2[(length2 * 3) + 2] & 255) << 8) | 255;
                }
            }
        }
    }

    private static short[] a(int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i2 == -1) {
            return f22c;
        }
        byte[] bArrA = p.a(i2);
        int length = bArrA.length;
        short[] sArr = new short[((bArrA[0] & 255) << 8) | (bArrA[1] & 255)];
        boolean z2 = (bArrA[2] & 1) == 0;
        boolean z3 = (bArrA[2] & 2) == 0;
        int i8 = bArrA[3] & 255;
        if (z2) {
            sArr[0] = bArrA[4];
            sArr[1] = bArrA[5];
            sArr[2] = (short) (bArrA[6] & 255);
            i3 = 4 + 1 + 1 + 1 + 1;
            sArr[3] = (short) (bArrA[7] & 255);
        } else {
            sArr[0] = (short) ((bArrA[4] << 8) | (bArrA[5] & 255));
            sArr[1] = (short) ((bArrA[6] << 8) | (bArrA[7] & 255));
            sArr[2] = (short) ((bArrA[8] << 8) | (bArrA[9] & 255));
            i3 = 4 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
            sArr[3] = (short) ((bArrA[10] << 8) | (bArrA[11] & 255));
        }
        if (i8 != 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = i3;
                i3++;
                sArr[5 + (i9 << 1)] = (short) (bArrA[i10] & 255);
            }
            for (int i11 = 0; i11 < i8; i11++) {
                if (z3) {
                    int i12 = i3;
                    i3++;
                    sArr[6 + (i11 << 1)] = (short) (bArrA[i12] & 255);
                } else {
                    int i13 = i3;
                    int i14 = i3 + 1;
                    i3 = i14 + 1;
                    sArr[6 + (i11 << 1)] = (short) ((bArrA[i13] << 8) | (bArrA[i14] & 255));
                }
            }
        } else {
            i8 = 1;
            sArr[5] = 255;
            sArr[6] = Short.MAX_VALUE;
        }
        sArr[4] = (short) i8;
        int i15 = 5 + (i8 << 1);
        for (int i16 = 0; i16 < i8; i16++) {
            int i17 = i15;
            short s = sArr[5 + (i16 << 1)];
            if (s == 255) {
                int i18 = 0;
                int i19 = i15;
                i15++;
                int i20 = i3;
                i3++;
                int i21 = bArrA[i20] & 255;
                while (i21 != 0) {
                    int i22 = i15;
                    int i23 = i15 + 1;
                    sArr[i22] = (short) (i21 - 1);
                    if (z2) {
                        int i24 = i23 + 1;
                        int i25 = i3;
                        int i26 = i3 + 1;
                        sArr[i23] = bArrA[i25];
                        int i27 = i24 + 1;
                        int i28 = i26 + 1;
                        sArr[i24] = bArrA[i26];
                        int i29 = i27 + 1;
                        int i30 = i28 + 1;
                        sArr[i27] = (short) (bArrA[i28] & 255);
                        i15 = i29 + 1;
                        i7 = i30 + 1;
                        sArr[i29] = (short) (bArrA[i30] & 255);
                    } else {
                        int i31 = i23 + 1;
                        int i32 = i3;
                        int i33 = i3 + 1;
                        int i34 = i33 + 1;
                        sArr[i23] = (short) ((bArrA[i32] << 8) | (bArrA[i33] & 255));
                        int i35 = i31 + 1;
                        int i36 = i34 + 1;
                        int i37 = bArrA[i34] << 8;
                        int i38 = i36 + 1;
                        sArr[i31] = (short) (i37 | (bArrA[i36] & 255));
                        int i39 = i35 + 1;
                        int i40 = i38 + 1;
                        int i41 = bArrA[i38] << 8;
                        int i42 = i40 + 1;
                        sArr[i35] = (short) (i41 | (bArrA[i40] & 255));
                        i15 = i39 + 1;
                        int i43 = i42 + 1;
                        int i44 = bArrA[i42] << 8;
                        i7 = i43 + 1;
                        sArr[i39] = (short) (i44 | (bArrA[i43] & 255));
                    }
                    int i45 = i7;
                    i3 = i7 + 1;
                    i21 = bArrA[i45] & 255;
                    i18++;
                }
                sArr[i19] = (short) i18;
                int i46 = 0;
                int i47 = i15;
                if (i3 < length) {
                    i15++;
                    int i48 = i3;
                    i3++;
                    byte b2 = bArrA[i48];
                    while (true) {
                        byte b3 = b2;
                        if (b3 == 0) {
                            break;
                        }
                        int i49 = i15;
                        int i50 = i15 + 1;
                        sArr[i49] = b3;
                        if (b3 != 1) {
                            int i51 = i50 + 1;
                            int i52 = i3;
                            int i53 = i3 + 1;
                            sArr[i50] = bArrA[i52];
                            i15 = i51 + 1;
                            int i54 = i53 + 1;
                            int i55 = bArrA[i53] << 8;
                            i3 = i54 + 1;
                            sArr[i51] = (short) (i55 | (bArrA[i54] & 255));
                            if (!z2) {
                                int i56 = 4;
                                if (b3 == 6) {
                                    i3++;
                                    int i57 = bArrA[i3] & 255;
                                    i15++;
                                    sArr[i15] = (short) i57;
                                    i56 = i57 << 1;
                                }
                                while (true) {
                                    i56--;
                                    if (i56 < 0) {
                                        break;
                                    }
                                    int i58 = i15;
                                    i15++;
                                    int i59 = i3;
                                    int i60 = i3 + 1;
                                    i3 = i60 + 1;
                                    sArr[i58] = (short) ((bArrA[i59] << 8) | (bArrA[i60] & 255));
                                }
                            } else if (b3 == 6) {
                                i3++;
                                int i61 = bArrA[i3] & 255;
                                i15++;
                                sArr[i15] = (short) i61;
                                int i62 = i61 << 1;
                                while (true) {
                                    i62--;
                                    if (i62 < 0) {
                                        break;
                                    }
                                    int i63 = i15;
                                    i15++;
                                    int i64 = i3;
                                    i3++;
                                    sArr[i63] = bArrA[i64];
                                }
                            } else {
                                int i65 = i15 + 1;
                                int i66 = i3 + 1;
                                sArr[i15] = bArrA[i3];
                                int i67 = i65 + 1;
                                int i68 = i66 + 1;
                                sArr[i65] = bArrA[i66];
                                if (b3 == 4) {
                                    int i69 = i67 + 1;
                                    int i70 = i68 + 1;
                                    sArr[i67] = bArrA[i68];
                                    i15 = i69 + 1;
                                    i3 = i70 + 1;
                                    sArr[i69] = bArrA[i70];
                                } else {
                                    int i71 = i67 + 1;
                                    int i72 = i68 + 1;
                                    sArr[i67] = (short) (bArrA[i68] & 255);
                                    i15 = i71 + 1;
                                    i3 = i72 + 1;
                                    sArr[i71] = (short) (bArrA[i72] & 255);
                                }
                            }
                        } else {
                            if (z2) {
                                int i73 = i50 + 1;
                                int i74 = i3;
                                int i75 = i3 + 1;
                                sArr[i50] = bArrA[i74];
                                i4 = i73 + 1;
                                i5 = i75 + 1;
                                sArr[i73] = bArrA[i75];
                            } else {
                                int i76 = i50 + 1;
                                int i77 = i3;
                                int i78 = i3 + 1;
                                int i79 = i78 + 1;
                                sArr[i50] = (short) ((bArrA[i77] << 8) | (bArrA[i78] & 255));
                                i4 = i76 + 1;
                                int i80 = i79 + 1;
                                int i81 = bArrA[i79] << 8;
                                i5 = i80 + 1;
                                sArr[i76] = (short) (i81 | (bArrA[i80] & 255));
                            }
                            int i82 = i5;
                            int i83 = i5 + 1;
                            int i84 = bArrA[i82] & 255;
                            int i85 = (i84 >> 4) + 1;
                            int i86 = i84 & 15;
                            int i87 = i83 + 1;
                            int i88 = bArrA[i83] << 24;
                            int i89 = i87 + 1;
                            int i90 = i88 | ((bArrA[i87] & 255) << 16);
                            int i91 = i89 + 1;
                            int i92 = i90 | ((bArrA[i89] & 255) << 8);
                            int i93 = i91 + 1;
                            int i94 = i92 | (bArrA[i91] & 255);
                            i3 = i93 + 1;
                            int i95 = bArrA[i93] & 255;
                            int i96 = i4;
                            i15 = i4 + 1;
                            boolean z4 = true;
                            int i97 = 0;
                            if (i95 == 255) {
                                i97 = i86;
                                z4 = false;
                            }
                            int i98 = i95 | (i97 << 13) | ((i85 - 1) << 11);
                            int iA = a(i94, i98);
                            if (iA == -1) {
                                int iA2 = a(-1, 0);
                                int i99 = iA2;
                                if (iA2 != -1) {
                                    e[i99] = i94;
                                    b[i99] = (short) i98;
                                } else {
                                    int size = a.size();
                                    i99 = size;
                                    if (size == e.length) {
                                        int[] iArr = new int[i99 << 1];
                                        short[] sArr2 = new short[i99 << 1];
                                        short[] sArr3 = new short[i99 << 1];
                                        System.arraycopy(e, 0, iArr, 0, i99);
                                        System.arraycopy(b, 0, sArr2, 0, i99);
                                        System.arraycopy(f18a, 0, sArr3, 0, i99);
                                        e = iArr;
                                        b = sArr2;
                                        f18a = sArr3;
                                    }
                                    e[i99] = i94;
                                    b[i99] = (short) i98;
                                    f18a[i99] = 0;
                                }
                                if (i99 == a.size()) {
                                    a.addElement(null);
                                }
                                if (z) {
                                    a.setElementAt(a(i94, i98 & 2047, i97, i85 << 16), i99);
                                } else {
                                    if (d == null) {
                                        d = new int[1155];
                                    }
                                    int i100 = f * 5;
                                    int i101 = i100;
                                    if (i100 == d.length) {
                                        int[] iArr2 = new int[d.length << 1];
                                        System.arraycopy(d, 0, iArr2, 0, i101);
                                        d = iArr2;
                                    }
                                    d[i101] = i99;
                                    d[i101 + 1] = i94;
                                    d[i101 + 2] = i98 & 2047;
                                    d[i101 + 3] = i97;
                                    d[i101 + 4] = i85;
                                    f++;
                                    while (i101 > 0 && d[i101 + 1] < d[(i101 + 1) - 5]) {
                                        int[] iArr3 = d;
                                        int i102 = 5;
                                        int i103 = i101 - 5;
                                        int i104 = i101;
                                        while (true) {
                                            i102--;
                                            if (i102 >= 0) {
                                                int i105 = iArr3[i104];
                                                iArr3[i104] = iArr3[i103];
                                                iArr3[i103] = i105;
                                                i104++;
                                                i103++;
                                            }
                                        }
                                        i101 -= 5;
                                    }
                                }
                                i6 = z4 ? i99 | (i86 << 13) : i99;
                            } else {
                                i6 = z4 ? iA | (i86 << 13) : iA;
                            }
                            sArr[i96] = (short) i6;
                        }
                        i46++;
                        if (i3 == length) {
                            break;
                        }
                        int i106 = i3;
                        i3++;
                        b2 = bArrA[i106];
                    }
                }
                sArr[i47] = (short) i46;
            } else {
                i17 = sArr[5 + (s << 1)] | Short.MIN_VALUE;
            }
            sArr[5 + (i16 << 1)] = (short) i17;
        }
        return sArr;
    }

    public static short[] a(int i2) {
        return a(i2, true);
    }

    public static short[][] a(int[] iArr, boolean z) {
        short[][] sArr = new short[iArr.length][];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            sArr[i2] = a(iArr[i2], z);
        }
        return sArr;
    }

    public static short[][] a(int[] iArr) {
        return a(iArr, true);
    }

    public static Image a(int i2, int i3, int i4) {
        Image imageA = null;
        if (i2 != -1) {
            byte[] bArrA = p.a(i2);
            imageA = a((bArrA[1] << 24) | ((bArrA[2] & 255) << 16) | ((bArrA[3] & 255) << 8) | (bArrA[4] & 255), bArrA[5] & 255, 0, i4 * ((bArrA[0] >> 4) + 1));
        }
        return imageA;
    }

    public static int a() {
        return f;
    }

    public static void d() {
        int i2 = g * 5;
        int i3 = i2 + 1;
        int i4 = d[i2];
        int i5 = i3 + 1;
        int i6 = d[i3];
        int i7 = i5 + 1;
        a.setElementAt(a(i6, d[i5], d[i7], d[i7 + 1] << 16), i4);
        int i8 = g + 1;
        g = i8;
        if (i8 == f) {
            d = null;
            g = 0;
            f = 0;
        }
    }

    private static Image a(int i2, int i3, int i4, int i5) {
        byte[] bArrA;
        if (i3 == 253) {
            return p.getImage(i2);
        }
        byte[] bArrA2 = p.a(i2);
        int i6 = (bArrA2[0] << 8) | (bArrA2[1] & 255);
        if (i3 < 254) {
            bArrA = a(f19a[i3], bArrA2, i6, (bArrA2.length - 10) / i6, -1, 10, i4, i5);
        } else {
            int length = (bArrA2.length - 2) / i6;
            bArrA = a(null, bArrA2, i6, i3 == 254 ? length / 3 : length >> 2, i3, 2, i4, i5);
        }
        return Image.createImage(bArrA, 0, bArrA.length);
    }

    public static void a(short[] sArr, int i2) {
        int i3 = sArr[4];
        while (true) {
            i3--;
            if (i3 < 0) {
                return;
            }
            short s = sArr[5 + (i3 << 1)];
            if ((s & Short.MIN_VALUE) == 0) {
                int i4 = s + (sArr[s] * 5) + 1;
                int i5 = i4 + 1;
                int i6 = sArr[i4];
                while (true) {
                    i6--;
                    if (i6 >= 0) {
                        short s2 = sArr[i5];
                        if (s2 == 1) {
                            int i7 = i5 + 3;
                            i5 = i7 + 1;
                            int i8 = sArr[i7] & 2047;
                            int i9 = f18a[i8] + i2;
                            int i10 = i9;
                            if (i9 < 0) {
                                i10 = 0;
                            }
                            f18a[i8] = (short) i10;
                        } else if (s2 == 6) {
                            int i11 = i5 + 3;
                            i5 = i11 + 1 + (sArr[i11] << 1);
                        } else {
                            i5 += 7;
                        }
                    }
                }
            }
        }
    }

    private static int a(int i2, int i3) {
        int size = a.size();
        while (true) {
            size--;
            if (size < 0) {
                return -1;
            }
            if (e[size] == i2 && (i2 == -1 || i3 == b[size])) {
                return size;
            }
        }
    }

    public static void a(Graphics graphics, int i2, int i3, int i4, int i5) {
        int i6 = i5 * i5;
        int i7 = (i5 << 8) / i4;
        int i8 = i7 * i7;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1;
        for (int i12 = -i5; i12 <= 0; i12++) {
            int i13 = i6 - (i12 * i12);
            while (i9 <= i4) {
                if (((i10 * i8) >> 16) <= i13 && (i9 == i4 || ((((i10 + i11) + 2) * i8) >> 16) > i13)) {
                    graphics.fillRect((i2 - i9) - 1, i3 + i12, (i9 << 1) + 1, 1);
                    if (i12 == 0) {
                        break;
                    }
                    graphics.fillRect((i2 - i9) - 1, i3 - i12, (i9 << 1) + 1, 1);
                    break;
                }
                i11 += 2;
                i10 += i11;
                i9++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v148, types: [int] */
    /* JADX WARN: Type inference failed for: r2v165, types: [int] */
    /* JADX WARN: Type inference failed for: r2v176, types: [int] */
    /* JADX WARN: Type inference failed for: r2v34, types: [int] */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v60, types: [int] */
    /* JADX WARN: Type inference failed for: r2v72, types: [int] */
    public static byte[] a(int[] iArr, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        boolean z = (i6 & 1) > 0;
        boolean z2 = (i6 & 2) > 0;
        boolean z3 = i4 == -1 && i5 != 0;
        int i9 = 4;
        int i10 = 4;
        int length = 0;
        if (i4 == -1) {
            i9 = 1;
            i10 = 1;
            length = (3 * iArr.length) + 4 + 4 + 4 + 1 + 4 + 4 + 4;
        } else if (i4 == 254) {
            i10 = 3;
        }
        int i11 = (i2 * i7) >> 16;
        int i12 = i11 > 0 ? i11 : 1;
        int i13 = (i3 * i7) >> 16;
        int i14 = i13 > 0 ? i13 : 1;
        int i15 = 65531 - (65531 % ((i12 * i9) + 1));
        int i16 = (i12 * i14 * i9) + i14;
        int i17 = ((i16 - 1) / i15) + 1;
        int i18 = i16 + 6 + (i17 * 5);
        byte[] bArr2 = new byte[i18 + 57 + length];
        bArr2[0] = -119;
        bArr2[1] = 80;
        bArr2[2] = 78;
        bArr2[3] = 71;
        bArr2[4] = 13;
        bArr2[5] = 10;
        bArr2[6] = 26;
        bArr2[7] = 10;
        bArr2[11] = 13;
        bArr2[12] = 73;
        bArr2[13] = 72;
        bArr2[14] = 68;
        bArr2[15] = 82;
        bArr2[18] = (byte) (i12 >> 8);
        bArr2[19] = (byte) i12;
        bArr2[22] = (byte) (i14 >> 8);
        bArr2[23] = (byte) i14;
        bArr2[24] = 8;
        bArr2[25] = (byte) (i4 == -1 ? 3 : 6);
        int iA = a(bArr2, 12, 17);
        bArr2[29] = iA >> 24;
        bArr2[30] = (byte) (iA >> 16);
        bArr2[31] = (byte) (iA >> 8);
        bArr2[32] = (byte) iA;
        int i19 = 33;
        if (i4 == -1) {
            int length2 = iArr.length * 3;
            bArr2[35] = (byte) (length2 >> 8);
            bArr2[36] = (byte) length2;
            bArr2[37] = 80;
            bArr2[38] = 76;
            bArr2[39] = 84;
            bArr2[40] = 69;
            int i20 = 41;
            for (int i21 = 0; i21 < iArr.length; i21++) {
                int i22 = i20;
                int i23 = i20 + 1;
                bArr2[i22] = iArr[i21] >> 24;
                int i24 = i23 + 1;
                bArr2[i23] = (byte) (iArr[i21] >> 16);
                i20 = i24 + 1;
                bArr2[i24] = (byte) (iArr[i21] >> 8);
            }
            int iA2 = a(bArr2, (i20 - length2) - 4, length2 + 4);
            int i25 = i20;
            int i26 = i20 + 1;
            bArr2[i25] = iA2 >> 24;
            int i27 = i26 + 1;
            bArr2[i26] = (byte) (iA2 >>> 16);
            int i28 = i27 + 1;
            bArr2[i27] = (byte) (iA2 >>> 8);
            bArr2[i28] = (byte) iA2;
            int i29 = i28 + 1 + 3;
            int i30 = i29 + 1;
            bArr2[i29] = 1;
            int i31 = i30 + 1;
            bArr2[i30] = 116;
            int i32 = i31 + 1;
            bArr2[i31] = 82;
            int i33 = i32 + 1;
            bArr2[i32] = 78;
            bArr2[i33] = 83;
            int i34 = i33 + 1 + 1;
            int iA3 = a(bArr2, i34 - 5, 5);
            int i35 = i34 + 1;
            bArr2[i34] = iA3 >> 24;
            int i36 = i35 + 1;
            bArr2[i35] = (byte) (iA3 >>> 16);
            int i37 = i36 + 1;
            bArr2[i36] = (byte) (iA3 >>> 8);
            i19 = i37 + 1;
            bArr2[i37] = (byte) iA3;
        }
        int i38 = i19;
        int i39 = i19 + 1;
        bArr2[i38] = i18 >> 24;
        int i40 = i39 + 1;
        bArr2[i39] = (byte) (i18 >> 16);
        int i41 = i40 + 1;
        bArr2[i40] = (byte) (i18 >> 8);
        int i42 = i41 + 1;
        bArr2[i41] = (byte) i18;
        int i43 = i42 + 1;
        bArr2[i42] = 73;
        int i44 = i43 + 1;
        bArr2[i43] = 68;
        int i45 = i44 + 1;
        bArr2[i44] = 65;
        int i46 = i45 + 1;
        bArr2[i45] = 84;
        int i47 = i46 + 1;
        bArr2[i46] = 120;
        int i48 = i47 + 1;
        bArr2[i47] = 1;
        int i49 = 1;
        int i50 = i15;
        int i51 = 0;
        boolean z4 = i7 == 65536 && i6 == 0 && z3;
        int i52 = i9 * i12;
        for (int i53 = 0; i53 < i17; i53++) {
            if (i53 == i17 - 1) {
                bArr2[i48] = 1;
                i50 = i16 % i15;
            }
            int i54 = i48 + 1;
            int i55 = i54 + 1;
            bArr2[i54] = (byte) i50;
            int i56 = i55 + 1;
            bArr2[i55] = (byte) (i50 >> 8);
            int i57 = i50 ^ 65535;
            int i58 = i56 + 1;
            bArr2[i56] = (byte) i57;
            i48 = i58 + 1;
            bArr2[i58] = (byte) (i57 >> 8);
            int i59 = 0;
            while (i51 < i14 && i59 < i50) {
                int i60 = i59 + 1;
                i48++;
                int i61 = z2 ? (i14 - i51) - 1 : i51;
                if (i7 != 65536) {
                    i61 = (i61 << 16) / i7;
                }
                int i62 = i61 * i2;
                for (int i63 = 0; i63 < i12; i63++) {
                    int i64 = z ? (i12 - i63) - 1 : i63;
                    if (i7 != 65536) {
                        i64 = (i64 << 16) / i7;
                    }
                    int i65 = i5 + ((i62 + i64) * i10);
                    int i66 = i48;
                    i48++;
                    bArr2[i66] = bArr[i65];
                    if (i4 != -1) {
                        int i67 = i48 + 1;
                        int i68 = i65 + 1;
                        bArr2[i48] = bArr[i68];
                        int i69 = i67 + 1;
                        int i70 = i68 + 1;
                        bArr2[i67] = bArr[i70];
                        i48 = i69 + 1;
                        bArr2[i69] = i4 == 255 ? bArr[i70 + 1] : (byte) -1;
                    }
                }
                i59 = i60 + i52;
                i51++;
            }
            if (!z4) {
                int i71 = i49;
                int i72 = i48 - i50;
                int i73 = i71 >>> 16;
                int i74 = i71 & 65535;
                int i75 = i50 + i72;
                while (i72 < i75) {
                    i74 = (i74 + ((bArr2[i72] ? 1 : 0) & 255)) % 65521;
                    i73 = (i73 + i74) % 65521;
                    i72++;
                }
                i49 = (i73 << 16) + i74;
            }
        }
        if (z4) {
            int i76 = i48;
            int i77 = i48 + 1;
            bArr2[i76] = bArr[2];
            int i78 = i77 + 1;
            bArr2[i77] = bArr[3];
            int i79 = i78 + 1;
            bArr2[i78] = bArr[4];
            int i80 = i79 + 1;
            bArr2[i79] = bArr[5];
            int i81 = i80 + 1;
            bArr2[i80] = bArr[6];
            int i82 = i81 + 1;
            bArr2[i81] = bArr[7];
            i8 = i82 + 1;
            bArr2[i82] = bArr[8];
            bArr2[i8] = bArr[9];
        } else {
            int i83 = i48;
            int i84 = i48 + 1;
            bArr2[i83] = i49 >> 24;
            int i85 = i84 + 1;
            bArr2[i84] = (byte) (i49 >>> 16);
            int i86 = i85 + 1;
            bArr2[i85] = (byte) (i49 >>> 8);
            int i87 = i86 + 1;
            bArr2[i86] = (byte) i49;
            int iA4 = a(bArr2, i42, i87 - i42);
            int i88 = i87 + 1;
            bArr2[i87] = iA4 >> 24;
            int i89 = i88 + 1;
            bArr2[i88] = (byte) (iA4 >>> 16);
            i8 = i89 + 1;
            bArr2[i89] = (byte) (iA4 >>> 8);
            bArr2[i8] = (byte) iA4;
        }
        int i90 = i8 + 5;
        int i91 = i90 + 1;
        bArr2[i90] = 73;
        int i92 = i91 + 1;
        bArr2[i91] = 69;
        int i93 = i92 + 1;
        bArr2[i92] = 78;
        int i94 = i93 + 1;
        bArr2[i93] = 68;
        int i95 = i94 + 1;
        bArr2[i94] = -82;
        int i96 = i95 + 1;
        bArr2[i95] = 66;
        bArr2[i96] = 96;
        bArr2[i96 + 1] = -126;
        return bArr2;
    }

    private static int a(byte[] bArr, int i2, int i3) {
        if (c == null) {
            c = new int[256];
            for (int i4 = 0; i4 < 256; i4++) {
                int i5 = i4;
                for (int i6 = 0; i6 < 8; i6++) {
                    i5 = (i5 & 1) != 0 ? (-306674912) ^ (i5 >>> 1) : i5 >>> 1;
                    c[i4] = i5;
                }
            }
        }
        int i7 = -1;
        int i8 = i3 + i2;
        while (i2 < i8) {
            i7 = c[(i7 ^ bArr[i2]) & 255] ^ (i7 >>> 8);
            i2++;
        }
        return i7 ^ (-1);
    }

    public static void e() {
        int size = a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (f18a[size] == 0 && a.elementAt(size) != null) {
                a.setElementAt(null, size);
                e[size] = -1;
            }
        }
    }

    public static void a(Graphics graphics, int i2, int i3, short[] sArr, int i4, int i5) {
        if (i5 > f20f.length) {
            f20f = new int[i5];
            f21g = new int[i5];
            h = new int[i5];
            i = new int[i5];
            j = new int[i5];
            k = new int[i5];
        }
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = i4;
            int i8 = i4 + 1;
            i[i6] = (sArr[i7] + i2) << 16;
            i4 = i8 + 1;
            f21g[i6] = sArr[i8] + i3;
        }
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = i9 + 1;
            int i11 = i10;
            if (i10 == i5) {
                i11 = 0;
            }
            h[i9] = f21g[i11];
            j[i9] = i[i11];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i5; i13++) {
            int i14 = h[i13] - f21g[i13];
            int i15 = i14;
            if (i14 != 0) {
                if (i15 < 0) {
                    int i16 = f21g[i13];
                    f21g[i13] = h[i13];
                    h[i13] = i16;
                    int i17 = i[i13];
                    i[i13] = j[i13];
                    j[i13] = i17;
                    i15 = -i15;
                }
                int[] iArr = j;
                int i18 = i13;
                iArr[i18] = iArr[i18] - i[i13];
                int[] iArr2 = j;
                int i19 = i13;
                iArr2[i19] = iArr2[i19] / i15;
            }
            int i20 = f21g[i13];
            int i21 = h[i13];
            boolean z = false;
            boolean z2 = false;
            int i22 = i12;
            while (true) {
                i22--;
                if (i22 < 0) {
                    break;
                }
                if (k[i22] == i20) {
                    z = true;
                }
                if (k[i22] == i21) {
                    z2 = true;
                }
            }
            if (!z) {
                int i23 = i12;
                i12++;
                k[i23] = i20;
            }
            if (!z2) {
                int i24 = i12;
                i12++;
                k[i24] = i21;
            }
        }
        for (int i25 = 0; i25 < i12; i25++) {
            for (int i26 = i25 + 1; i26 < i12; i26++) {
                if (k[i25] > k[i26]) {
                    int i27 = k[i25];
                    k[i25] = k[i26];
                    k[i26] = i27;
                }
            }
        }
        int i28 = k[0];
        int i29 = 1;
        do {
            int i30 = 0;
            int i31 = i5;
            while (true) {
                i31--;
                if (i31 < 0) {
                    break;
                }
                if (f21g[i31] <= i28 && h[i31] > i28) {
                    int i32 = i30;
                    i30++;
                    f20f[i32] = i31;
                }
            }
            for (int i33 = 0; i33 < i30; i33++) {
                for (int i34 = i33 + 1; i34 < i30; i34++) {
                    int i35 = f20f[i33];
                    int i36 = i[i35];
                    int i37 = f20f[i34];
                    int i38 = i[i37];
                    if (i36 > i38 || (i36 == i38 && j[i35] > j[i37])) {
                        f20f[i34] = i35;
                        f20f[i33] = i37;
                    }
                }
            }
            int i39 = i29;
            i29++;
            int i40 = k[i39];
            if (i29 == i12) {
                i40++;
            }
            if (i30 == 2) {
                int i41 = f20f[0];
                int i42 = f20f[1];
                while (i28 < i40) {
                    int i43 = i[i41];
                    int i44 = (i43 >> 16) + ((i43 & 65535) >> 15);
                    int i45 = i[i42];
                    graphics.fillRect(i44, i28, (((i45 >> 16) + ((i45 & 65535) >> 15)) + 1) - i44, 1);
                    int[] iArr3 = i;
                    iArr3[i41] = iArr3[i41] + j[i41];
                    int[] iArr4 = i;
                    iArr4[i42] = iArr4[i42] + j[i42];
                    i28++;
                }
            } else {
                while (i28 < i40) {
                    int i46 = Integer.MIN_VALUE;
                    int i47 = 0;
                    while (i47 < i30) {
                        int i48 = i47;
                        int i49 = i47 + 1;
                        int i50 = f20f[i48];
                        int i51 = i[i50];
                        int i52 = (i51 >> 16) + ((i51 & 65535) >> 15);
                        int i53 = i52;
                        if (i52 < i46) {
                            i53 = i46;
                        }
                        i47 = i49 + 1;
                        int i54 = f20f[i49];
                        int i55 = i[i54];
                        int i56 = (i55 >> 16) + ((i55 & 65535) >> 15) + 1;
                        i46 = i56;
                        graphics.fillRect(i53, i28, i56 - i53, 1);
                        int[] iArr5 = i;
                        iArr5[i50] = iArr5[i50] + j[i50];
                        int[] iArr6 = i;
                        iArr6[i54] = iArr6[i54] + j[i54];
                    }
                    i28++;
                }
            }
        } while (i29 < i12);
    }
}
