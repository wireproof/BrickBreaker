package defpackage;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: sequel-3d-java.jar:a.class */
public final class a {
    private static int[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Hashtable f22a;
    private static int[] b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f23a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int f24b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Vector f25a = new Vector(190, 190);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static short[] f26a = new short[190];
    private static int[] c = new int[190];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static byte[] f27a = new byte[190];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static short[] f28b = new short[190];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[][] f29a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Vector f30b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static short[] f31c;
    private static int[] d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Object f32a;

    public static void a() {
        w wVarM95a = t.m95a(786438);
        int iA = wVarM95a.a() >> 2;
        f29a = new int[iA][];
        for (int i = 0; i < iA; i++) {
            try {
                w wVarM95a2 = t.m95a(wVarM95a.c());
                int iA2 = wVarM95a2.a() / 3;
                f29a[i] = new int[iA2];
                for (int i2 = 0; i2 < iA2; i2++) {
                    f29a[i][i2] = (wVarM95a2.b() << 16) | (wVarM95a2.b() << 8) | wVarM95a2.b() | (-16777216);
                }
                f29a[i][0] = 0;
            } catch (IOException unused) {
            }
        }
    }

    public static void b() {
        f24b = 0;
    }

    public static aa a(int i, boolean z) {
        if (!z) {
            f24b = 0;
        }
        aa aaVar = null;
        try {
            aaVar = new aa(i, z);
        } catch (IOException unused) {
        }
        return aaVar;
    }

    public static aa a(int i) {
        return a(i, false);
    }

    public static aa[] a(int[] iArr, boolean z) {
        aa[] aaVarArr = new aa[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            aaVarArr[i] = a(iArr[i], false);
        }
        return aaVarArr;
    }

    public static aa[] a(int[] iArr) {
        return a(iArr, false);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Image m8a(int i) {
        return a(i, 0, 1024).a;
    }

    public static Image b(int i) {
        return a(i, 0, 1024).a;
    }

    private static c a(int i, int i2, int i3) {
        c cVarA = null;
        if (i != -1) {
            cVarA = null;
            w wVarM95a = t.m95a(i);
            try {
                cVarA = a(wVarM95a.c(), wVarM95a.b(), 0, ((wVarM95a.b() >> 4) + 1) << 10);
            } catch (IOException unused) {
            }
            c cVar = cVarA;
            if (f22a == null) {
                f22a = new Hashtable();
            }
            f22a.put(new StringBuffer().append("").append(0).append(".").append(1024).append(".").append(1024).append(".").append(i).toString(), cVar);
        }
        return cVarA;
    }

    public static void a(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        iArr[1] = 0;
        int i5 = (i4 - 1) << 8;
        int iM10a = m10a(i, i2, i5);
        if (iM10a != -1) {
            iArr[0] = iM10a;
            iArr[1] = i3;
            return;
        }
        int iM10a2 = m10a(-1, 0, 0);
        int i6 = iM10a2;
        if (iM10a2 == -1) {
            int size = f25a.size();
            i6 = size;
            if (size == c.length) {
                int[] iArr2 = new int[i6 << 1];
                byte[] bArr = new byte[i6 << 1];
                short[] sArr = new short[i6 << 1];
                short[] sArr2 = new short[i6 << 1];
                System.arraycopy(c, 0, iArr2, 0, i6);
                System.arraycopy(f27a, 0, bArr, 0, i6);
                System.arraycopy(f26a, 0, sArr, 0, i6);
                System.arraycopy(f28b, 0, sArr2, 0, i6);
                c = iArr2;
                f27a = bArr;
                f26a = sArr;
                f28b = sArr2;
            }
            f26a[i6] = 0;
        }
        c[i6] = i;
        f27a[i6] = (byte) i2;
        f28b[i6] = (short) i5;
        if (i6 == f25a.size()) {
            f25a.addElement(null);
        }
        if (z) {
            f25a.setElementAt(a(i, i2, 0, i4 << 10), i6);
        } else {
            int i7 = i6;
            if (b == null) {
                b = new int[950];
            }
            int i8 = f23a * 5;
            int i9 = i8;
            if (i8 == b.length) {
                int[] iArr3 = new int[b.length << 1];
                System.arraycopy(b, 0, iArr3, 0, i9);
                b = iArr3;
            }
            b[i9] = i7;
            b[i9 + 1] = i;
            b[i9 + 2] = i2;
            b[i9 + 3] = 0;
            b[i9 + 4] = i4;
            f23a++;
            while (i9 > 0 && b[i9 + 1] < b[(i9 + 1) - 5]) {
                int[] iArr4 = b;
                int i10 = 5;
                int i11 = i9 - 5;
                int i12 = i9;
                while (true) {
                    i10--;
                    if (i10 >= 0) {
                        int i13 = iArr4[i12];
                        iArr4[i12] = iArr4[i11];
                        iArr4[i11] = i13;
                        i12++;
                        i11++;
                    }
                }
                i9 -= 5;
            }
        }
        iArr[0] = i6;
        iArr[1] = i3;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m9a() {
        return f23a;
    }

    public static void c() {
        int i = f24b * 5;
        int i2 = i + 1;
        int i3 = b[i];
        if (m12a(i3) == null) {
            int i4 = i2 + 1;
            int i5 = b[i2];
            int i6 = i4 + 1;
            f25a.setElementAt(a(i5, b[i4], b[i6], b[i6 + 1] << 10), i3);
        }
        int i7 = f24b + 1;
        f24b = i7;
        if (i7 == f23a) {
            b = null;
            f24b = 0;
            f23a = 0;
        }
    }

    private static c a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int length;
        if (i2 == 253) {
            return new c(i);
        }
        byte[] bArrM96a = t.m96a(i);
        int i7 = (bArrM96a[0] << 8) | (bArrM96a[1] & 255);
        int[] iArr = null;
        if (i2 == 254 || i2 == 255) {
            i5 = i2;
            i6 = 2;
            int length2 = (bArrM96a.length - 2) / i7;
            length = i2 == 254 ? length2 / 3 : length2 >> 2;
        } else {
            i6 = 10;
            length = (bArrM96a.length - 10) / i7;
            iArr = f29a[i2];
            i5 = -1;
        }
        int[] iArr2 = iArr;
        int i8 = length;
        int i9 = i5;
        int i10 = i6;
        int i11 = 4;
        if (i9 == -1) {
            i11 = 1;
        } else if (i9 == 254) {
            i11 = 3;
        }
        int iA = a(i7, i4);
        int iA2 = a(i8, i4);
        int[] iArr3 = new int[iA * iA2];
        int i12 = 0;
        for (int i13 = 0; i13 < iA2; i13++) {
            int i14 = i13;
            if (i4 != 1024) {
                i14 = (i14 << 10) / i4;
            }
            int i15 = (i14 * i7 * i11) + i10;
            if (i9 == -1 && i4 == 1024) {
                int i16 = i15;
                int i17 = iA;
                while (true) {
                    i17--;
                    if (i17 >= 0) {
                        int i18 = i12;
                        i12++;
                        int i19 = i16;
                        i16++;
                        iArr3[i18] = iArr2[bArrM96a[i19] & 255];
                    }
                }
            } else {
                for (int i20 = 0; i20 < iA; i20++) {
                    int i21 = i20;
                    if (i4 != 1024) {
                        i21 = (i21 << 10) / i4;
                    }
                    int i22 = i15 + (i21 * i11);
                    if (i9 == -1) {
                        int i23 = i12;
                        i12++;
                        iArr3[i23] = iArr2[bArrM96a[i22] & 255];
                    } else {
                        int i24 = (bArrM96a[i22] & 255) << 16;
                        int i25 = i22 + 1;
                        int i26 = (bArrM96a[i25] & 255) << 8;
                        int i27 = i25 + 1;
                        int i28 = bArrM96a[i27] & 255;
                        if (i9 == 255) {
                            int i29 = i12;
                            i12++;
                            iArr3[i29] = ((bArrM96a[i27 + 1] & 255) << 24) | i24 | i26 | i28;
                        } else {
                            int i30 = i12;
                            i12++;
                            iArr3[i30] = (-16777216) | i24 | i26 | i28;
                        }
                    }
                }
            }
        }
        int i31 = iA2;
        if (i3 != 0) {
            if ((i3 & 3) == 3) {
                int i32 = 0;
                int i33 = iA * i31;
                int i34 = i33 >> 1;
                int i35 = i33 - 1;
                while (i35 >= i34) {
                    int i36 = iArr3[i35];
                    int i37 = i35;
                    i35 = i37 - 1;
                    iArr3[i37] = iArr3[i32];
                    int i38 = i32;
                    i32++;
                    iArr3[i38] = i36;
                }
            } else if ((i3 & 1) == 0) {
                int i39 = (i31 - 1) * iA;
                int i40 = (i31 >> 1) * iA;
                int i41 = iA;
                while (true) {
                    i41--;
                    if (i41 < 0) {
                        break;
                    }
                    int i42 = i41;
                    int i43 = i39 + i41;
                    int i44 = i42 + i40;
                    while (i42 < i44) {
                        int i45 = iArr3[i42];
                        iArr3[i42] = iArr3[i43];
                        iArr3[i43] = i45;
                        i42 += iA;
                        i43 -= iA;
                    }
                }
            } else {
                int i46 = iA >> 1;
                int i47 = 0;
                while (true) {
                    int i48 = i47;
                    i31--;
                    if (i31 < 0) {
                        break;
                    }
                    int i49 = (i48 + iA) - 1;
                    int i50 = i48 + i46;
                    while (i48 < i50) {
                        int i51 = iArr3[i48];
                        int i52 = i48;
                        i48++;
                        iArr3[i52] = iArr3[i49];
                        int i53 = i49;
                        i49 = i53 - 1;
                        iArr3[i53] = i51;
                    }
                    i47 = i48 + (iA - i46);
                }
            }
        }
        return new c(Image.createRGBImage(iArr3, a(i7, i4), a(i8, i4), i9 != 254));
    }

    private static int a(int i, int i2) {
        int i3 = (i * i2) >> 10;
        if (i3 > 0) {
            return i3;
        }
        return 1;
    }

    public static void a(aa aaVar, int i) {
        if (aaVar == null) {
            return;
        }
        int i2 = aaVar.i();
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            if (!aaVar.m17a(i2)) {
                int[][] iArrA = aaVar.m16a(i2).a();
                int length = iArrA.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        int[] iArr = iArrA[length];
                        int i3 = iArr[0];
                        if (i3 == 1) {
                            int i4 = iArr[3];
                            int i5 = f26a[i4] + i;
                            int i6 = i5;
                            if (i5 < 0) {
                                i6 = 0;
                            }
                            f26a[i4] = (short) i6;
                        } else if (i3 == 9) {
                            int i7 = iArr[4];
                            short[] sArr = f31c;
                            sArr[i7] = (short) (sArr[i7] + i);
                            if (f31c[i7] <= 0) {
                                f31c[i7] = 0;
                                b bVarM13a = m13a(i7);
                                if (bVarM13a != null) {
                                    bVarM13a.m24a();
                                    f30b.setElementAt(null, i7);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static int m10a(int i, int i2, int i3) {
        int size = f25a.size();
        while (true) {
            size--;
            if (size < 0) {
                return -1;
            }
            if (c[size] == i && (i == -1 || (i2 == (f27a[size] & 255) && i3 == f28b[size]))) {
                return size;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v41, types: [int] */
    /* JADX WARN: Type inference failed for: r2v57, types: [int] */
    /* JADX WARN: Type inference failed for: r2v69, types: [int] */
    public static byte[] a(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = (i << 10) >> 10;
        int i8 = i7 > 0 ? i7 : 1;
        int i9 = (i2 << 10) >> 10;
        int i10 = i9 > 0 ? i9 : 1;
        int i11 = 65531 - (65531 % ((i8 << 2) + 1));
        int i12 = ((i8 * i10) << 2) + i10;
        int i13 = ((i12 - 1) / i11) + 1;
        int i14 = i12 + 6 + (i13 * 5);
        byte[] bArr2 = new byte[i14 + 57];
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
        bArr2[18] = (byte) (i8 >> 8);
        bArr2[19] = (byte) i8;
        bArr2[22] = (byte) (i10 >> 8);
        bArr2[23] = (byte) i10;
        bArr2[24] = 8;
        bArr2[25] = 6;
        int iA = a(bArr2, 12, 17);
        bArr2[29] = iA >> 24;
        bArr2[30] = (byte) (iA >> 16);
        bArr2[31] = (byte) (iA >> 8);
        bArr2[32] = (byte) iA;
        bArr2[33] = i14 >> 24;
        bArr2[34] = (byte) (i14 >> 16);
        bArr2[35] = (byte) (i14 >> 8);
        bArr2[36] = (byte) i14;
        bArr2[37] = 73;
        bArr2[38] = 68;
        bArr2[39] = 65;
        bArr2[40] = 84;
        bArr2[41] = 120;
        int i15 = 33 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        bArr2[42] = 1;
        int i16 = 1;
        int i17 = i11;
        int i18 = 0;
        int i19 = i8 << 2;
        for (int i20 = 0; i20 < i13; i20++) {
            if (i20 == i13 - 1) {
                bArr2[i15] = 1;
                i17 = ((i12 - 1) % i11) + 1;
            }
            int i21 = i15 + 1;
            int i22 = i21 + 1;
            bArr2[i21] = (byte) i17;
            int i23 = i22 + 1;
            bArr2[i22] = (byte) (i17 >> 8);
            int i24 = i17 ^ 65535;
            int i25 = i23 + 1;
            bArr2[i23] = (byte) i24;
            i15 = i25 + 1;
            bArr2[i25] = (byte) (i24 >> 8);
            int i26 = 0;
            while (i18 < i10 && i26 < i17) {
                int i27 = i26 + 1;
                i15++;
                int i28 = i18 * (i << 2);
                for (int i29 = 0; i29 < i8; i29++) {
                    int i30 = i28 + (i29 << 2);
                    int i31 = i15;
                    int i32 = i15 + 1;
                    bArr2[i31] = bArr[i30];
                    int i33 = i32 + 1;
                    int i34 = i30 + 1;
                    bArr2[i32] = bArr[i34];
                    int i35 = i33 + 1;
                    int i36 = i34 + 1;
                    bArr2[i33] = bArr[i36];
                    i15 = i35 + 1;
                    bArr2[i35] = bArr[i36 + 1];
                }
                i26 = i27 + i19;
                i18++;
            }
            int i37 = i16;
            int i38 = i15 - i17;
            int i39 = i37 >>> 16;
            int i40 = i37 & 65535;
            int i41 = i17 + i38;
            while (i38 < i41) {
                i40 = (i40 + ((bArr2[i38] ? 1 : 0) & 255)) % 65521;
                i39 = (i39 + i40) % 65521;
                i38++;
            }
            i16 = (i39 << 16) + i40;
        }
        int i42 = i15;
        int i43 = i15 + 1;
        bArr2[i42] = i16 >> 24;
        int i44 = i43 + 1;
        bArr2[i43] = (byte) (i16 >>> 16);
        int i45 = i44 + 1;
        bArr2[i44] = (byte) (i16 >>> 8);
        int i46 = i45 + 1;
        bArr2[i45] = (byte) i16;
        int iA2 = a(bArr2, 37, i46 - 37);
        int i47 = i46 + 1;
        bArr2[i46] = iA2 >> 24;
        int i48 = i47 + 1;
        bArr2[i47] = (byte) (iA2 >>> 16);
        int i49 = i48 + 1;
        bArr2[i48] = (byte) (iA2 >>> 8);
        bArr2[i49] = (byte) iA2;
        int i50 = i49 + 5;
        int i51 = i50 + 1;
        bArr2[i50] = 73;
        int i52 = i51 + 1;
        bArr2[i51] = 69;
        int i53 = i52 + 1;
        bArr2[i52] = 78;
        int i54 = i53 + 1;
        bArr2[i53] = 68;
        int i55 = i54 + 1;
        bArr2[i54] = -82;
        int i56 = i55 + 1;
        bArr2[i55] = 66;
        bArr2[i56] = 96;
        bArr2[i56 + 1] = -126;
        return bArr2;
    }

    private static int a(byte[] bArr, int i, int i2) {
        if (a == null) {
            a = new int[256];
            for (int i3 = 0; i3 < 256; i3++) {
                int i4 = i3;
                for (int i5 = 0; i5 < 8; i5++) {
                    i4 = (i4 & 1) != 0 ? (-306674912) ^ (i4 >>> 1) : i4 >>> 1;
                    a[i3] = i4;
                }
            }
        }
        int i6 = -1;
        int i7 = i2 + i;
        while (i < i7) {
            i6 = a[(i6 ^ bArr[i]) & 255] ^ (i6 >>> 8);
            i++;
        }
        return i6 ^ (-1);
    }

    public static void d() {
        int size = f25a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (f26a[size] == 0 && m12a(size) != null) {
                f25a.setElementAt(null, size);
                c[size] = -1;
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m11a(int i, boolean z) {
        if (d == null) {
            d = new int[190];
            f31c = new short[190];
            f30b = new Vector(190);
        }
        int size = f30b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i == d[i2] && f30b.elementAt(i2) != null) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 < size && f30b.elementAt(i3) != null) {
            i3++;
        }
        if (i3 >= d.length) {
            int length = d.length;
            int i4 = length << 1;
            short[] sArr = new short[i4];
            int[] iArr = new int[i4];
            System.arraycopy(f31c, 0, sArr, 0, length);
            System.arraycopy(d, 0, iArr, 0, length);
            f31c = sArr;
            d = iArr;
        }
        if (i3 == size) {
            f30b.addElement(null);
        }
        if (f32a == null) {
            f32a = new Object();
        }
        f30b.setElementAt(f32a, i3);
        d[i3] = i;
        b bVar = new b(a(i, z));
        bVar.a(0, -2, false);
        f30b.setElementAt(bVar, i3);
        return i3;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static c m12a(int i) {
        return (c) f25a.elementAt(i);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static b m13a(int i) {
        return (b) f30b.elementAt(i);
    }
}
