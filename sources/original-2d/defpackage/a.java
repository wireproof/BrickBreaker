package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: original-2d.jar:a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public short[][] f46a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f47a;
    public int b;
    public int c;
    private int d;
    private int e;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f48b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private boolean f49c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private boolean f50d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public short f51a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public short f52b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[][] f57a;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static int[] f58d;
    private static boolean a = "null".equals("null");

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image[] f53a = new Image[0];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f54a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int[] f55b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static int[] f56c = new int[0];
    private static int f = 0;

    public a(short[][] sArr, boolean z) {
        this.f48b = true;
        this.f49c = true;
        this.f46a = sArr;
        int length = sArr.length;
        while (true) {
            length--;
            if (length < 0) {
                a(0, z, true);
                return;
            } else {
                short[] sArr2 = sArr[length];
                if (sArr2 != null) {
                    a(sArr2, 1);
                }
            }
        }
    }

    public a(short[] sArr, boolean z) {
        this(new short[][]{sArr}, z);
    }

    public static short[] a(int i) {
        int i2;
        short s;
        if (i == -1) {
            return null;
        }
        byte[] bArrM24a = d.m24a(i);
        int i3 = 0 + 1 + 1;
        int i4 = (bArrM24a[0] << 8) | (bArrM24a[1] & 255);
        boolean z = (i4 & 16384) == 16384;
        boolean z2 = (i4 & 32768) == 32768;
        short[] sArr = new short[(short) (i4 & (-49153))];
        sArr[4] = 1;
        if (z) {
            i3++;
            sArr[4] = bArrM24a[2];
        }
        if (z2) {
            int i5 = i3;
            int i6 = i3 + 1;
            sArr[0] = bArrM24a[i5];
            int i7 = i6 + 1;
            sArr[1] = bArrM24a[i6];
            int i8 = i7 + 1;
            sArr[2] = (short) (bArrM24a[i7] & 255);
            i2 = i8 + 1;
            sArr[3] = (short) (bArrM24a[i8] & 255);
        } else {
            int i9 = i3;
            int i10 = i3 + 1;
            int i11 = i10 + 1;
            sArr[0] = (short) ((bArrM24a[i9] << 8) | (bArrM24a[i10] & 255));
            int i12 = i11 + 1;
            int i13 = bArrM24a[i11] << 8;
            int i14 = i12 + 1;
            sArr[1] = (short) (i13 | (bArrM24a[i12] & 255));
            int i15 = i14 + 1;
            int i16 = bArrM24a[i14] << 8;
            int i17 = i15 + 1;
            sArr[2] = (short) (i16 | (bArrM24a[i15] & 255));
            int i18 = i17 + 1;
            int i19 = bArrM24a[i17] << 8;
            i2 = i18 + 1;
            sArr[3] = (short) (i19 | (bArrM24a[i18] & 255));
        }
        short s2 = (short) (6 + (sArr[4] << 1));
        for (int i20 = 0; i20 < sArr[4]; i20++) {
            short s3 = s2;
            short s4 = -1;
            short s5 = Short.MAX_VALUE;
            if (z) {
                int i21 = i2;
                int i22 = i2 + 1;
                s4 = bArrM24a[i21];
                int i23 = i22 + 1;
                int i24 = bArrM24a[i22] << 8;
                i2 = i23 + 1;
                s5 = (short) (i24 | (bArrM24a[i23] & 255));
            }
            if (s4 == -1) {
                int i25 = i2;
                int i26 = i2 + 1;
                short s6 = (short) (bArrM24a[i25] & 255);
                i2 = i26 + 1;
                short s7 = (short) (bArrM24a[i26] & 255);
                short s8 = s2;
                short s9 = (short) (s2 + 1);
                sArr[s8] = s7;
                while (true) {
                    short s10 = (short) (s7 - 1);
                    s7 = s10;
                    if (s10 < 0) {
                        break;
                    }
                    short s11 = (short) (s9 + 1);
                    int i27 = i2;
                    int i28 = i2 + 1;
                    sArr[s9] = (short) (bArrM24a[i27] & 255);
                    if (z2) {
                        short s12 = (short) (s11 + 1);
                        int i29 = i28 + 1;
                        sArr[s11] = bArrM24a[i28];
                        short s13 = (short) (s12 + 1);
                        int i30 = i29 + 1;
                        sArr[s12] = bArrM24a[i29];
                        short s14 = (short) (s13 + 1);
                        int i31 = i30 + 1;
                        sArr[s13] = (short) (bArrM24a[i30] & 255);
                        s9 = (short) (s14 + 1);
                        i2 = i31 + 1;
                        sArr[s14] = (short) (bArrM24a[i31] & 255);
                    } else {
                        short s15 = (short) (s11 + 1);
                        int i32 = i28 + 1;
                        int i33 = bArrM24a[i28] << 8;
                        int i34 = i32 + 1;
                        sArr[s11] = (short) (i33 | (bArrM24a[i32] & 255));
                        short s16 = (short) (s15 + 1);
                        int i35 = i34 + 1;
                        int i36 = bArrM24a[i34] << 8;
                        int i37 = i35 + 1;
                        sArr[s15] = (short) (i36 | (bArrM24a[i35] & 255));
                        short s17 = (short) (s16 + 1);
                        int i38 = i37 + 1;
                        int i39 = bArrM24a[i37] << 8;
                        int i40 = i38 + 1;
                        sArr[s16] = (short) (i39 | (bArrM24a[i38] & 255));
                        s9 = (short) (s17 + 1);
                        int i41 = i40 + 1;
                        int i42 = bArrM24a[i40] << 8;
                        i2 = i41 + 1;
                        sArr[s17] = (short) (i42 | (bArrM24a[i41] & 255));
                    }
                }
                short s18 = s9;
                s2 = (short) (s9 + 1);
                sArr[s18] = s6;
                while (true) {
                    short s19 = (short) (s6 - 1);
                    s6 = s19;
                    if (s19 < 0) {
                        break;
                    }
                    short s20 = (short) (bArrM24a[i2] & 7);
                    short s21 = (short) (s2 + 1);
                    sArr[s2] = s20;
                    int i43 = (bArrM24a[i2] >> 6) & 3;
                    int i44 = i2;
                    int i45 = i2 + 1;
                    int i46 = ((bArrM24a[i44] >> 3) & 7) + 1;
                    if (s20 == 0) {
                        int i47 = i45 + 1;
                        int i48 = bArrM24a[i45] << 24;
                        int i49 = i47 + 1;
                        int i50 = i48 | (bArrM24a[i47] << 16);
                        int i51 = i49 + 1;
                        int i52 = i50 | (bArrM24a[i49] << 8);
                        int i53 = i51 + 1;
                        int i54 = i52 | (bArrM24a[i51] & 255);
                        short s22 = 0;
                        if (a) {
                            i53++;
                            s22 = (short) (bArrM24a[i53] & 255);
                        }
                        if (z2) {
                            short s23 = (short) (s21 + 1);
                            int i55 = i53;
                            int i56 = i53 + 1;
                            sArr[s21] = bArrM24a[i55];
                            s = (short) (s23 + 1);
                            i2 = i56 + 1;
                            sArr[s23] = bArrM24a[i56];
                        } else {
                            short s24 = (short) (s21 + 1);
                            int i57 = i53;
                            int i58 = i53 + 1;
                            int i59 = i58 + 1;
                            sArr[s21] = (short) ((bArrM24a[i57] << 8) | (bArrM24a[i58] & 255));
                            s = (short) (s24 + 1);
                            int i60 = i59 + 1;
                            int i61 = bArrM24a[i59] << 8;
                            i2 = i60 + 1;
                            sArr[s24] = (short) (i61 | (bArrM24a[i60] & 255));
                        }
                        short s25 = s;
                        s2 = (short) (s + 1);
                        sArr[s25] = a(i54, s22, i43, i46, true);
                    } else {
                        short s26 = (short) (s21 + 1);
                        int i62 = i45 + 1;
                        sArr[s21] = (short) (bArrM24a[i45] & 65535);
                        short s27 = (short) (s26 + 1);
                        int i63 = i62 + 1;
                        int i64 = bArrM24a[i62] << 8;
                        int i65 = i63 + 1;
                        sArr[s26] = (short) (i64 | (bArrM24a[i63] & 255));
                        if (z2) {
                            short s28 = (short) (s27 + 1);
                            int i66 = i65 + 1;
                            sArr[s27] = bArrM24a[i65];
                            short s29 = (short) (s28 + 1);
                            int i67 = i66 + 1;
                            sArr[s28] = bArrM24a[i66];
                            if (s20 == 5) {
                                short s30 = (short) (s29 + 1);
                                int i68 = i67 + 1;
                                sArr[s29] = bArrM24a[i67];
                                short s31 = (short) (s30 + 1);
                                int i69 = i68 + 1;
                                sArr[s30] = bArrM24a[i68];
                                short s32 = (short) (s31 + 1);
                                int i70 = i69 + 1;
                                sArr[s31] = bArrM24a[i69];
                                s2 = (short) (s32 + 1);
                                i2 = i70 + 1;
                                sArr[s32] = bArrM24a[i70];
                            } else if (s20 == 3) {
                                short s33 = (short) (s29 + 1);
                                int i71 = i67 + 1;
                                sArr[s29] = bArrM24a[i67];
                                s2 = (short) (s33 + 1);
                                i2 = i71 + 1;
                                sArr[s33] = bArrM24a[i71];
                            } else {
                                short s34 = (short) (s29 + 1);
                                int i72 = i67 + 1;
                                sArr[s29] = (short) (bArrM24a[i67] & 255);
                                s2 = (short) (s34 + 1);
                                i2 = i72 + 1;
                                sArr[s34] = (short) (bArrM24a[i72] & 255);
                            }
                        } else {
                            short s35 = (short) (s27 + 1);
                            int i73 = i65 + 1;
                            int i74 = bArrM24a[i65] << 8;
                            int i75 = i73 + 1;
                            sArr[s27] = (short) (i74 | (bArrM24a[i73] & 255));
                            short s36 = (short) (s35 + 1);
                            int i76 = i75 + 1;
                            int i77 = bArrM24a[i75] << 8;
                            int i78 = i76 + 1;
                            sArr[s35] = (short) (i77 | (bArrM24a[i76] & 255));
                            short s37 = (short) (s36 + 1);
                            int i79 = i78 + 1;
                            int i80 = bArrM24a[i78] << 8;
                            int i81 = i79 + 1;
                            sArr[s36] = (short) (i80 | (bArrM24a[i79] & 255));
                            s2 = (short) (s37 + 1);
                            int i82 = i81 + 1;
                            int i83 = bArrM24a[i81] << 8;
                            i2 = i82 + 1;
                            sArr[s37] = (short) (i83 | (bArrM24a[i82] & 255));
                            if (s20 == 5) {
                                short s38 = (short) (s2 + 1);
                                int i84 = i2 + 1;
                                int i85 = bArrM24a[i2] << 8;
                                int i86 = i84 + 1;
                                sArr[s2] = (short) (i85 | (bArrM24a[i84] & 255));
                                s2 = (short) (s38 + 1);
                                int i87 = i86 + 1;
                                int i88 = bArrM24a[i86] << 8;
                                i2 = i87 + 1;
                                sArr[s38] = (short) (i88 | (bArrM24a[i87] & 255));
                            }
                        }
                    }
                }
                sArr[6 + (i20 << 1)] = s3;
            } else {
                sArr[6 + (i20 << 1)] = (short) (sArr[6 + (s4 << 1)] | Short.MIN_VALUE);
            }
            sArr[6 + (i20 << 1) + 1] = s5;
        }
        return sArr;
    }

    public static short[][] a(int[] iArr) {
        short[][] sArr = new short[iArr.length][];
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return sArr;
            }
            sArr[length] = a(iArr[length]);
        }
    }

    public final short[] a() {
        return this.f46a[this.f47a];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m12a(int i) {
        if (this.f46a[this.f47a] == null) {
            return;
        }
        this.e += i;
        while (this.e >= this.d) {
            if (this.f48b) {
                this.e = 0;
            } else {
                this.e -= this.d;
            }
            m15b();
        }
    }

    public final void a(Graphics graphics, int i, int i2) {
        short[] sArr = this.f46a[this.f47a];
        if (sArr == null) {
            return;
        }
        int i3 = i - sArr[0];
        int i4 = i2 - sArr[1];
        int i5 = i3 + this.f51a;
        int i6 = i4 + this.f52b;
        int i7 = this.c + (sArr[this.c] * 5) + 1;
        int i8 = sArr[i7];
        while (true) {
            i8--;
            if (i8 < 0) {
                return;
            }
            int i9 = i7 + 1;
            short s = sArr[i9];
            if (s == 0) {
                int i10 = i9 + 1;
                short s2 = sArr[i10];
                int i11 = i10 + 1;
                short s3 = sArr[i11];
                i7 = i11 + 1;
                short s4 = sArr[i7];
                int i12 = s4 >>> 13;
                Image image = f53a[(short) (s4 & 2047)];
                if (i12 != 0) {
                    int i13 = 0;
                    if ((i12 & 1) != 0) {
                        i13 = 2;
                    }
                    if ((i12 & 2) != 0) {
                        i13 |= 1;
                    }
                    graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), i13, i5 + s2, i6 + s3, 20);
                } else {
                    graphics.drawImage(image, i5 + s2, i6 + s3, 20);
                }
            } else {
                int i14 = i9 + 1;
                int i15 = sArr[i14] << 16;
                i7 = i14 + 1;
                graphics.setColor(i15 | (sArr[i7] & 65535));
                if (s == 3) {
                    int i16 = i7 + 1;
                    int i17 = i5 + sArr[i16];
                    int i18 = i16 + 1;
                    int i19 = i6 + sArr[i18];
                    int i20 = i18 + 1;
                    int i21 = i5 + sArr[i20];
                    i7 = i20 + 1;
                    graphics.drawLine(i17, i19, i21, i6 + sArr[i7]);
                } else if (s == 2) {
                    int i22 = i7 + 1;
                    int i23 = i5 + sArr[i22];
                    int i24 = i22 + 1;
                    int i25 = i6 + sArr[i24];
                    int i26 = i24 + 1;
                    short s5 = sArr[i26];
                    i7 = i26 + 1;
                    graphics.drawRect(i23, i25, s5, sArr[i7]);
                } else if (s == 1) {
                    int i27 = i7 + 1;
                    int i28 = i5 + sArr[i27];
                    int i29 = i27 + 1;
                    int i30 = i6 + sArr[i29];
                    int i31 = i29 + 1;
                    short s6 = sArr[i31];
                    i7 = i31 + 1;
                    graphics.fillRect(i28, i30, s6, sArr[i7]);
                } else if (s == 4) {
                    int i32 = i7 + 1;
                    int i33 = i5 + sArr[i32];
                    int i34 = i32 + 1;
                    int i35 = i6 + sArr[i34];
                    int i36 = i34 + 1;
                    short s7 = sArr[i36];
                    i7 = i36 + 1;
                    a(graphics, i33, i35, s7, sArr[i7], 1);
                } else if (s == 5) {
                    int i37 = i7 + 1;
                    int i38 = i5 + sArr[i37];
                    int i39 = i37 + 1;
                    int i40 = i6 + sArr[i39];
                    int i41 = i39 + 1;
                    int i42 = i5 + sArr[i41];
                    int i43 = i41 + 1;
                    int i44 = i6 + sArr[i43];
                    int i45 = i43 + 1;
                    int i46 = i5 + sArr[i45];
                    i7 = i45 + 1;
                    a(graphics, i38, i40, i42, i44, i46, i6 + sArr[i7], 1);
                }
            }
        }
    }

    public final void a(int i, boolean z, boolean z2) {
        this.f47a = i;
        if (this.f46a[this.f47a] == null) {
            return;
        }
        this.f50d = false;
        b(0);
        this.f49c = z;
        this.f48b = z2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m13a() {
        return this.f46a.length;
    }

    public final void b(int i) {
        short[] sArr = this.f46a[this.f47a];
        if (sArr == null) {
            return;
        }
        this.b = i;
        this.c = sArr[6 + (this.b << 1)] & Short.MAX_VALUE;
        this.d = sArr[6 + (this.b << 1) + 1];
        this.f50d = false;
        this.e = 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m14a() {
        if (this.f46a[this.f47a] == null) {
            return true;
        }
        return !this.f49c && this.f50d;
    }

    public final int b() {
        short[] sArr = this.f46a[this.f47a];
        if (sArr != null) {
            return sArr[0];
        }
        return 0;
    }

    public final int c() {
        short[] sArr = this.f46a[this.f47a];
        if (sArr != null) {
            return sArr[1];
        }
        return 0;
    }

    public final int d() {
        short[] sArr = this.f46a[this.f47a];
        if (sArr != null) {
            return sArr[2];
        }
        return 0;
    }

    public final int e() {
        short[] sArr = this.f46a[this.f47a];
        if (sArr != null) {
            return sArr[3];
        }
        return 0;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private void m15b() {
        short[] sArr = this.f46a[this.f47a];
        short s = sArr[4];
        int i = this.b + 1;
        this.b = i;
        if (i >= s) {
            if (this.f49c) {
                this.b = 0;
            } else {
                this.f50d = true;
                this.b = s - 1;
            }
        }
        int i2 = 6 + (this.b << 1);
        this.c = sArr[i2] & Short.MAX_VALUE;
        this.d = sArr[i2 + 1];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m16a() throws IOException {
        byte[] bArrA = a(new int[]{0, 0}, new byte[1], 1, 1, -1, 0, 0, 1);
        Image.createImage(bArrA, 0, bArrA.length);
        if (a) {
            DataInputStream dataInputStreamA = d.a(131502);
            f57a = new int[dataInputStreamA.readInt()][];
            for (int i = 0; i < f57a.length; i++) {
                byte[] bArrM24a = d.m24a(dataInputStreamA.readInt());
                int length = bArrM24a.length / 3;
                f57a[i] = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    f57a[i][i2] = ((bArrM24a[i2 * 3] & 255) << 24) | ((bArrM24a[(i2 * 3) + 1] & 255) << 16) | ((bArrM24a[(i2 * 3) + 2] & 255) << 8) | 255;
                }
            }
            dataInputStreamA.close();
        }
    }

    private static short a(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int iA;
        if (z && a) {
            i5 = 0;
        } else {
            i2 |= i3 << 13;
            i5 = i3;
        }
        int i6 = i2 | ((i4 - 1) << 11);
        int iA2 = a(f55b, i, 1);
        if (iA2 != -1 && f56c[iA2] == i6) {
            return z ? (short) (iA2 | (i3 << 13)) : (short) iA2;
        }
        if (f == 0) {
            Image[] imageArr = new Image[f53a.length + 1];
            System.arraycopy(f53a, 0, imageArr, 0, f53a.length);
            f53a = imageArr;
            f55b = a(f55b, new int[]{i});
            f56c = a(f56c, new int[]{i6});
            f54a = a(f54a, new int[]{0});
            iA = f55b.length - 1;
        } else {
            iA = a(f55b, -1, 1);
            f55b[iA] = i;
            f56c[iA] = i6;
            f--;
        }
        if (a) {
            f53a[iA] = a(i, i6, i5, i4);
            f56c[iA] = i6;
            return z ? (short) (iA | (i3 << 13)) : (short) iA;
        }
        byte[] bArrM24a = d.m24a(i);
        f53a[iA] = Image.createImage(bArrM24a, 0, bArrM24a.length);
        return (short) iA;
    }

    private static Image a(int i, int i2, int i3, int i4) {
        byte[] bArrA;
        byte[] bArrM24a = d.m24a(i);
        int i5 = (bArrM24a[0] << 8) | (bArrM24a[1] & 255);
        int i6 = (bArrM24a[2] << 8) | (bArrM24a[3] & 255);
        if ((i2 & 2047) < 254) {
            bArrA = a(f57a[i2 & 2047], bArrM24a, i5, i6, -1, 12, i3, i4);
        } else {
            bArrA = (i2 & 2047) == 254 ? a((int[]) null, bArrM24a, i5, i6, 254, 4, i3, i4) : a((int[]) null, bArrM24a, i5, i6, 255, 4, i3, i4);
        }
        return Image.createImage(bArrA, 0, bArrA.length);
    }

    private static void a(short[] sArr, int i) {
        int i2 = sArr[4];
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            short s = sArr[6 + (i2 << 1)];
            if (s >= 0) {
                int i3 = s + (sArr[s] * 5) + 1;
                int i4 = i3 + 1;
                int i5 = sArr[i3];
                while (true) {
                    i5--;
                    if (i5 >= 0) {
                        short s2 = sArr[i4];
                        if (s2 == 0) {
                            int i6 = i4 + 3;
                            i4 = i6 + 1;
                            int i7 = sArr[i6] & 2047;
                            int[] iArr = f54a;
                            iArr[i7] = iArr[i7] + i;
                        } else {
                            i4 += 7;
                            if (s2 == 5) {
                                i4 += 2;
                            }
                        }
                    }
                }
            }
        }
    }

    private static int a(int[] iArr, int i, int i2) {
        if (iArr == null) {
            return -1;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= iArr.length) {
                return -1;
            }
            if (iArr[i4] == i) {
                return i4;
            }
            i3 = i4 + i2;
        }
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        int length = iArr == null ? 0 : iArr.length;
        int i = length;
        int[] iArr3 = new int[length + iArr2.length];
        if (iArr != null) {
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        System.arraycopy(iArr2, 0, iArr3, i, iArr2.length);
        return iArr3;
    }

    public static void a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6 = i4 * i4;
        int i7 = (i4 << 8) / i3;
        int i8 = i7 * i7;
        int i9 = -i4;
        while (true) {
            int i10 = i9;
            if (i10 > 0) {
                return;
            }
            int i11 = i6 - (i10 * i10);
            int i12 = i3;
            while (true) {
                int i13 = i12;
                if (i13 < 0) {
                    break;
                }
                if ((((i13 * i13) * i8) >> 16) <= i11) {
                    graphics.fillRect((i - i13) - 1, i2 + i10, (i13 << 1) + 1, i5);
                    graphics.fillRect((i - i13) - 1, (i2 - i10) - (i5 - 1), (i13 << 1) + 1, i5);
                    break;
                }
                i12 = i13 - i5;
            }
            i9 = i10 + i5;
        }
    }

    public static void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 > i6) {
            i2 = i6;
            i6 = i2;
            i = i5;
            i5 = i;
        }
        if (i2 > i4) {
            i4 = i2;
            i2 = i4;
            i3 = i;
            i = i3;
        }
        if (i4 > i6) {
            int i8 = i4;
            i4 = i6;
            i6 = i8;
            int i9 = i3;
            i3 = i5;
            i5 = i9;
        }
        int i10 = i << 16;
        int i11 = i3 << 16;
        int i12 = i5 << 16;
        int iMax = ((i12 - i10) * i7) / Math.max(i6 - i2, 1);
        int iMax2 = ((i11 - i10) * i7) / Math.max(i4 - i2, 1);
        int iMax3 = ((i12 - i11) * i7) / Math.max(i6 - i4, 1);
        int i13 = i10;
        int i14 = i10;
        int i15 = i2;
        int i16 = i4;
        if (iMax <= iMax2) {
            while (i15 < i16) {
                graphics.fillRect(i13 >> 16, i15, (i14 >> 16) - (i13 >> 16), i7);
                i13 += iMax;
                i14 += iMax2;
                i15 += i7;
            }
        } else {
            while (i15 < i16) {
                graphics.fillRect(i14 >> 16, i15, (i13 >> 16) - (i14 >> 16), i7);
                i13 += iMax;
                i14 += iMax2;
                i15 += i7;
            }
        }
        int i17 = i6;
        int i18 = i11;
        if (i11 >= i13) {
            while (i15 < i17) {
                graphics.fillRect(i13 >> 16, i15, (i18 >> 16) - (i13 >> 16), i7);
                i13 += iMax;
                i18 += iMax3;
                i15 += i7;
            }
            return;
        }
        while (i15 < i17) {
            graphics.fillRect(i18 >> 16, i15, (i13 >> 16) - (i18 >> 16), i7);
            i13 += iMax;
            i18 += iMax3;
            i15 += i7;
        }
    }

    private static byte[] a(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        boolean z = (i5 & 1) > 0;
        boolean z2 = (i5 & 2) > 0;
        int i8 = 4;
        int i9 = 4;
        int length = 0;
        if (i3 == -1) {
            i8 = 1;
            i9 = 1;
            length = (3 * iArr.length) + 4 + 4 + 4 + 1 + 4 + 4 + 4;
        }
        if (i3 == 254) {
            i9 = 3;
        }
        int i10 = i2 * i6;
        int i11 = i * i6;
        int i12 = 65531 - (65531 % ((i11 * i8) + 1));
        int i13 = (i11 * i10 * i8) + i10;
        int i14 = ((i13 - 1) / i12) + 1;
        int i15 = 6 + i13 + (i14 * 5);
        byte[] bArr2 = new byte[37 + length + 4 + 4 + i15 + 4 + 8];
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
        bArr2[18] = (byte) (i11 >> 8);
        bArr2[19] = (byte) i11;
        bArr2[22] = (byte) (i10 >> 8);
        bArr2[23] = (byte) i10;
        bArr2[24] = 8;
        bArr2[25] = (byte) (i3 == -1 ? 3 : 6);
        int iA = a(bArr2, 12, 17);
        bArr2[29] = (byte) (iA >> 24);
        bArr2[30] = (byte) (iA >> 16);
        bArr2[31] = (byte) (iA >> 8);
        bArr2[32] = (byte) iA;
        int i16 = 33;
        if (i3 == -1) {
            int length2 = iArr.length * 3;
            bArr2[35] = (byte) (length2 >> 8);
            bArr2[36] = (byte) length2;
            bArr2[37] = 80;
            bArr2[38] = 76;
            bArr2[39] = 84;
            bArr2[40] = 69;
            int i17 = 41;
            for (int i18 = 0; i18 < iArr.length; i18++) {
                int i19 = i17;
                int i20 = i17 + 1;
                bArr2[i19] = (byte) (iArr[i18] >> 24);
                int i21 = i20 + 1;
                bArr2[i20] = (byte) (iArr[i18] >> 16);
                i17 = i21 + 1;
                bArr2[i21] = (byte) (iArr[i18] >> 8);
            }
            int iA2 = a(bArr2, (i17 - length2) - 4, length2 + 4);
            int i22 = i17;
            int i23 = i17 + 1;
            bArr2[i22] = (byte) (iA2 >>> 24);
            int i24 = i23 + 1;
            bArr2[i23] = (byte) (iA2 >>> 16);
            int i25 = i24 + 1;
            bArr2[i24] = (byte) (iA2 >>> 8);
            bArr2[i25] = (byte) iA2;
            int i26 = i25 + 1 + 3;
            int i27 = i26 + 1;
            bArr2[i26] = 1;
            int i28 = i27 + 1;
            bArr2[i27] = 116;
            int i29 = i28 + 1;
            bArr2[i28] = 82;
            int i30 = i29 + 1;
            bArr2[i29] = 78;
            bArr2[i30] = 83;
            int i31 = i30 + 1 + 1;
            int iA3 = a(bArr2, i31 - 5, 5);
            int i32 = i31 + 1;
            bArr2[i31] = (byte) (iA3 >>> 24);
            int i33 = i32 + 1;
            bArr2[i32] = (byte) (iA3 >>> 16);
            int i34 = i33 + 1;
            bArr2[i33] = (byte) (iA3 >>> 8);
            i16 = i34 + 1;
            bArr2[i34] = (byte) iA3;
        }
        int i35 = i16;
        int i36 = i16 + 1;
        bArr2[i35] = (byte) (i15 >> 24);
        int i37 = i36 + 1;
        bArr2[i36] = (byte) (i15 >> 16);
        int i38 = i37 + 1;
        bArr2[i37] = (byte) (i15 >> 8);
        int i39 = i38 + 1;
        bArr2[i38] = (byte) i15;
        int i40 = i39 + 1;
        bArr2[i39] = 73;
        int i41 = i40 + 1;
        bArr2[i40] = 68;
        int i42 = i41 + 1;
        bArr2[i41] = 65;
        int i43 = i42 + 1;
        bArr2[i42] = 84;
        int i44 = i43 + 1;
        bArr2[i43] = 120;
        int i45 = i44 + 1;
        bArr2[i44] = 1;
        int iA4 = 1;
        int i46 = i12;
        int i47 = 0;
        for (int i48 = 0; i48 < i14; i48++) {
            if (i48 == i14 - 1) {
                int i49 = i45;
                i7 = i45 + 1;
                bArr2[i49] = 1;
                i46 = i13 % i12;
            } else {
                int i50 = i45;
                i7 = i45 + 1;
                bArr2[i50] = 0;
            }
            int i51 = i7;
            int i52 = i7 + 1;
            bArr2[i51] = (byte) i46;
            int i53 = i52 + 1;
            bArr2[i52] = (byte) (i46 >> 8);
            int i54 = i46 ^ 65535;
            int i55 = i53 + 1;
            bArr2[i53] = (byte) i54;
            i45 = i55 + 1;
            bArr2[i55] = (byte) (i54 >> 8);
            int i56 = 0;
            while (i47 < i10 && i56 < i46) {
                i56++;
                int i57 = i45;
                i45++;
                bArr2[i57] = 0;
                int i58 = z2 ? (i10 - i47) - i6 : i47;
                if (i6 != 1) {
                    i58 /= i6;
                }
                int i59 = i58 * i;
                for (int i60 = 0; i60 < i11; i60++) {
                    int i61 = z ? (i11 - i60) - i6 : i60;
                    if (i6 != 1) {
                        i61 /= i6;
                    }
                    int i62 = i4 + ((i59 + i61) * i9);
                    int i63 = i45;
                    i45++;
                    int i64 = i62 + 1;
                    bArr2[i63] = bArr[i62];
                    if (i3 != -1) {
                        int i65 = i45 + 1;
                        int i66 = i64 + 1;
                        bArr2[i45] = bArr[i64];
                        int i67 = i65 + 1;
                        int i68 = i66 + 1;
                        bArr2[i65] = bArr[i66];
                        i45 = i67 + 1;
                        bArr2[i67] = i3 == 255 ? bArr[i68] : (byte) -1;
                    }
                    i56 += i8;
                }
                i47++;
            }
            iA4 = a(bArr2, i45 - i46, i46, iA4);
        }
        int i69 = i45;
        int i70 = i45 + 1;
        bArr2[i69] = (byte) (iA4 >>> 24);
        int i71 = i70 + 1;
        bArr2[i70] = (byte) (iA4 >>> 16);
        int i72 = i71 + 1;
        bArr2[i71] = (byte) (iA4 >>> 8);
        int i73 = i72 + 1;
        bArr2[i72] = (byte) iA4;
        int iA5 = a(bArr2, i39, i73 - i39);
        int i74 = i73 + 1;
        bArr2[i73] = (byte) (iA5 >>> 24);
        int i75 = i74 + 1;
        bArr2[i74] = (byte) (iA5 >>> 16);
        int i76 = i75 + 1;
        bArr2[i75] = (byte) (iA5 >>> 8);
        bArr2[i76] = (byte) iA5;
        int i77 = i76 + 1 + 4;
        int i78 = i77 + 1;
        bArr2[i77] = 73;
        int i79 = i78 + 1;
        bArr2[i78] = 69;
        int i80 = i79 + 1;
        bArr2[i79] = 78;
        int i81 = i80 + 1;
        bArr2[i80] = 68;
        int i82 = i81 + 1;
        bArr2[i81] = -82;
        int i83 = i82 + 1;
        bArr2[i82] = 66;
        bArr2[i83] = 96;
        bArr2[i83 + 1] = -126;
        return bArr2;
    }

    private static int a(byte[] bArr, int i, int i2, int i3) {
        int i4 = i3 >>> 16;
        int i5 = i3 & 65535;
        int i6 = i2 + i;
        for (int i7 = i; i7 < i6; i7++) {
            i5 = (i5 + (bArr[i7] & 255)) % 65521;
            i4 = (i4 + i5) % 65521;
        }
        return (i4 << 16) + i5;
    }

    private static int a(byte[] bArr, int i, int i2) {
        if (f58d == null) {
            f58d = new int[256];
            for (int i3 = 0; i3 < 256; i3++) {
                int i4 = i3;
                for (int i5 = 0; i5 < 8; i5++) {
                    i4 = (i4 & 1) != 0 ? (-306674912) ^ (i4 >>> 1) : i4 >>> 1;
                    f58d[i3] = i4;
                }
            }
        }
        int i6 = -1;
        int i7 = i2 + i;
        while (i < i7) {
            i6 = f58d[(i6 ^ bArr[i]) & 255] ^ (i6 >>> 8);
            i++;
        }
        return i6 ^ (-1);
    }
}
