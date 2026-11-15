package defpackage;

import com.nokia.mid.ui.DirectUtils;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:b.class */
public final class b {
    private static int[][] d = new int[4][];
    private int h;
    private int i;
    private int[] b = new int[13];
    private Vector a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Vector f26b;
    private Vector c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private Vector f27d;
    private int j;
    private int k;
    private int l;
    private int m;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int[] f28c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private int[] f29d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private l f30a;
    private static int[] e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Graphics f31a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image f32a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Graphics f33b;
    private static int[] f;
    private static int[] g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static int[] f34h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static int[] f35i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static int[] f36j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private static int[] f37k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private static int[] f38l;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private static int[] f39m;
    private static int[] n;
    private int[] o;
    private int[] p;

    public b() {
        m12a();
    }

    private static void a(int i, int i2, boolean z, int[][] iArr) {
        if (iArr[i] == null || i2 > iArr[i].length) {
            if (z) {
                i2 = (i2 * 120) / 100;
            }
            iArr[i] = new int[i2];
        }
    }

    public final void a(int i) {
        this.b[2] = i;
    }

    private int[] a(int[][] iArr) {
        return this.b[0] != -8355712 ? iArr[1] : iArr[0];
    }

    private void a(int i, int i2, int i3) {
        int iSin = ab.sin(i);
        int iCos = ab.cos(i);
        int i4 = this.h;
        int i5 = this.i;
        int i6 = ((-i4) * i2) >> 10;
        int i7 = i6 + (((i4 << 1) * i2) >> 10);
        int i8 = ((-i5) * i3) >> 10;
        int i9 = i8 + (((i5 << 1) * i3) >> 10);
        this.f28c[0] = (i6 * iCos) - (i8 * iSin);
        this.f29d[0] = (i8 * iCos) + (i6 * iSin);
        this.f28c[1] = (i7 * iCos) - (i8 * iSin);
        this.f29d[1] = (i8 * iCos) + (i7 * iSin);
        this.f28c[2] = (i7 * iCos) - (i9 * iSin);
        this.f29d[2] = (i9 * iCos) + (i7 * iSin);
        this.f28c[3] = (i6 * iCos) - (i9 * iSin);
        this.f29d[3] = (i9 * iCos) + (i6 * iSin);
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = 4;
        while (true) {
            i14--;
            if (i14 < 0) {
                break;
            }
            if (this.f28c[i14] > i11) {
                i11 = this.f28c[i14];
            }
            if (this.f28c[i14] < i10) {
                i10 = this.f28c[i14];
            }
            if (this.f29d[i14] > i13) {
                i13 = this.f29d[i14];
            }
            if (this.f29d[i14] < i12) {
                i12 = this.f29d[i14];
            }
        }
        int i15 = i10 >> 16;
        int i16 = i12 >> 16;
        int i17 = (i13 >> 16) + 1;
        this.j = ((i11 >> 16) + 1) - i15;
        if (this.j == 0) {
            this.j = 1;
        }
        this.k = i17 - i16;
        if (this.k == 0) {
            this.k = 1;
        }
        this.l = i15;
        this.m = i16;
    }

    public final int a() {
        return this.b[10];
    }

    public final int b() {
        return this.b[11];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m11a() {
        return this.b[0] == -8355712 && !m14a(2) && this.b[9] == 0 && this.b[10] <= 1 && this.b[11] <= 1;
    }

    /* JADX WARN: Code duplicated, block: B:305:0x0a32 A[PHI: r45
      0x0a32: PHI (r45v10 int) = (r45v5 int), (r45v11 int) binds: [B:301:0x0a1e, B:303:0x0a28] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:307:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:436:0x0a43 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x0a4a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0a4a A[SYNTHETIC] */
    public final void a(l lVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (!((this.b[0] == -8355712 && this.b[3] == 1024 && this.b[4] == 1024 && this.b[2] == 0 && this.b[9] == 0 && this.b[10] <= 1 && this.b[11] <= 1) ? false : true)) {
            Image image = lVar.c;
            int width = i + this.b[7];
            int height = i2 + this.b[8];
            boolean zB = lVar.b();
            int clipX = 0;
            int clipY = 0;
            int clipWidth = 0;
            int clipHeight = 0;
            if (zB) {
                clipX = this.f33b.getClipX();
                clipY = this.f33b.getClipY();
                clipWidth = this.f33b.getClipWidth();
                clipHeight = this.f33b.getClipHeight();
                if ((i3 & 4) == 0 && (i3 & 16) == 0) {
                    i6 = lVar.cb;
                    i7 = lVar.cc;
                } else {
                    i6 = lVar.cc;
                    i7 = lVar.cb;
                }
                if (width + i6 <= clipX || height + i7 <= clipY || width >= clipX + clipWidth || height >= clipY + clipHeight) {
                    return;
                } else {
                    this.f33b.clipRect(width, height, i6, i7);
                }
            }
            if (i3 == 0) {
                if (zB) {
                    width = width;
                    height = height;
                }
                this.f33b.drawImage(image, width, height, 20);
            } else {
                int i8 = (i3 & 1) != 0 ? 8192 : 0;
                if ((i3 & 2) != 0) {
                    i8 |= 16384;
                }
                if ((i3 & 4) != 0) {
                    i8 |= 270;
                } else if ((i3 & 8) != 0) {
                    i8 |= 180;
                } else if ((i3 & 16) != 0) {
                    i8 |= 90;
                }
                if (zB) {
                    width = (i3 & 1) != 0 ? width - (image.getWidth() - (0 + lVar.cb)) : width;
                    height = (i3 & 2) != 0 ? height - (image.getHeight() - (0 + lVar.cc)) : height;
                }
                DirectUtils.getDirectGraphics(this.f33b).drawImage(image, width, height, 20, i8);
            }
            if (zB) {
                this.f33b.setClip(clipX, clipY, clipWidth, clipHeight);
                return;
            }
            return;
        }
        boolean z = true;
        int[] iArr = lVar.b;
        if (iArr != null) {
            boolean z2 = false;
            int i9 = 13;
            while (true) {
                i9--;
                if (i9 < 0) {
                    break;
                }
                if (i9 != 12 && iArr[i9] != this.b[i9]) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                z = false;
            }
        }
        int[][] iArr2 = lVar.g;
        int[][] iArr3 = iArr2;
        if (iArr2 == null) {
            iArr3 = new int[5][];
            lVar.g = iArr3;
        }
        this.h = lVar.getWidth();
        this.i = lVar.getHeight();
        if (iArr == null || iArr[5] != 0 || i3 != iArr[6]) {
            int i10 = this.h * this.i;
            int[][] iArr4 = lVar.g;
            a(0, i10, false, iArr4);
            lVar.getRGB(iArr4[0], 0, this.h, 0, 0, this.h, this.i);
            if (lVar.c.isMutable()) {
                int[] iArr5 = iArr4[0];
                int i11 = this.h;
                int i12 = this.i;
                int iH = h();
                int i13 = i11 * i12;
                while (true) {
                    i13--;
                    if (i13 < 0) {
                        break;
                    } else if (iArr5[i13] == iH) {
                        iArr5[i13] = 0;
                    }
                }
            }
            int[] iArr6 = iArr4[0];
            int i14 = this.h;
            int i15 = this.i;
            if (i3 != 0) {
                if ((i3 & 3) == 3) {
                    int i16 = 0;
                    int i17 = i14 * i15;
                    int i18 = i17 >> 1;
                    int i19 = i17 - 1;
                    while (i19 >= i18) {
                        int i20 = iArr6[i19];
                        int i21 = i19;
                        i19 = i21 - 1;
                        iArr6[i21] = iArr6[i16];
                        int i22 = i16;
                        i16++;
                        iArr6[i22] = i20;
                    }
                } else if ((i3 & 1) != 0) {
                    int i23 = i14 >> 1;
                    int i24 = 0;
                    int i25 = i15;
                    while (true) {
                        i25--;
                        if (i25 < 0) {
                            break;
                        }
                        int i26 = (i24 + i14) - 1;
                        int i27 = i24 + i23;
                        while (i24 < i27) {
                            int i28 = iArr6[i24];
                            int i29 = i24;
                            i24++;
                            iArr6[i29] = iArr6[i26];
                            int i30 = i26;
                            i26 = i30 - 1;
                            iArr6[i30] = i28;
                        }
                        i24 += i14 - i23;
                    }
                } else if ((i3 & 2) != 0) {
                    int i31 = (i15 - 1) * i14;
                    int i32 = (i15 >> 1) * i14;
                    int i33 = i14;
                    while (true) {
                        i33--;
                        if (i33 < 0) {
                            break;
                        }
                        int i34 = i33;
                        int i35 = i31 + i33;
                        int i36 = i34 + i32;
                        while (i34 < i36) {
                            int i37 = iArr6[i34];
                            iArr6[i34] = iArr6[i35];
                            iArr6[i35] = i37;
                            i34 += i14;
                            i35 -= i14;
                        }
                    }
                }
                if ((i3 & 8) != 0) {
                    int i38 = 0;
                    int i39 = i14 * i15;
                    int i40 = i39 >> 1;
                    int i41 = i39 - 1;
                    while (i41 >= i40) {
                        int i42 = iArr6[i41];
                        int i43 = i41;
                        i41 = i43 - 1;
                        iArr6[i43] = iArr6[i38];
                        int i44 = i38;
                        i38++;
                        iArr6[i44] = i42;
                    }
                } else if ((i3 & 4) != 0 || (i3 & 16) != 0) {
                    a(0, i14 * i15, true, d);
                    int[] iArr7 = d[0];
                    int i45 = i14 * i15;
                    while (true) {
                        i45--;
                        if (i45 < 0) {
                            break;
                        } else {
                            iArr7[i45] = iArr6[i45];
                        }
                    }
                    int i46 = 0;
                    if ((i3 & 4) == 0) {
                        int i47 = i14;
                        while (true) {
                            i47--;
                            if (i47 < 0) {
                                break;
                            }
                            int i48 = i47;
                            int i49 = i15;
                            while (true) {
                                i49--;
                                if (i49 >= 0) {
                                    int i50 = i46;
                                    i46++;
                                    iArr6[i50] = iArr7[i48];
                                    i48 += i14;
                                }
                            }
                        }
                    } else {
                        for (int i51 = 0; i51 < i14; i51++) {
                            int i52 = ((i15 - 1) * i14) + i51;
                            int i53 = i15;
                            while (true) {
                                i53--;
                                if (i53 >= 0) {
                                    int i54 = i46;
                                    i46++;
                                    iArr6[i54] = iArr7[i52];
                                    i52 -= i14;
                                }
                            }
                        }
                    }
                }
            }
            z = true;
        }
        if ((i3 & 4) != 0 || (i3 & 16) != 0) {
            int i55 = this.h;
            this.h = this.i;
            this.i = i55;
        }
        int i56 = this.h;
        int i57 = this.b[3];
        int i58 = this.b[4];
        int i59 = (i56 * i57) >> 10;
        if (i59 < 1) {
            return;
        }
        int i60 = this.i;
        int i61 = i60;
        int i62 = (i60 * i58) >> 10;
        if (i62 < 1) {
            return;
        }
        int i63 = this.b[2];
        int i64 = this.b[0];
        if (z || iArr == null || i64 != iArr[0]) {
            if (i64 != -8355712) {
                int[][] iArr8 = lVar.g;
                int[] iArr9 = iArr8[0];
                a(1, this.h * this.i, false, iArr8);
                int[] iArr10 = iArr8[1];
                int i65 = i64 & (-16777216);
                int i66 = ((i64 & 16711680) - 8388608) << 1;
                int i67 = i66;
                if (i66 == 16646144) {
                    i67 = 16711680;
                }
                int i68 = ((i64 & 65280) - 32768) << 1;
                int i69 = i68;
                if (i68 == 65024) {
                    i69 = 65280;
                }
                int i70 = ((i64 & 255) - 128) << 1;
                int i71 = i70;
                if (i70 == 254) {
                    i71 = 255;
                }
                if (!lVar.c.isMutable()) {
                    int i72 = i65 >>> 24;
                    int i73 = i72;
                    if (i72 == 255) {
                        i73 = 256;
                    }
                    int i74 = i73 << 16;
                    int i75 = this.h * this.i;
                    while (true) {
                        i75--;
                        if (i75 < 0) {
                            break;
                        }
                        int i76 = iArr9[i75];
                        int i77 = (i76 & 16711680) + i67;
                        int i78 = i77;
                        if (i77 > 16711680) {
                            i78 = 16711680;
                        } else if (i78 < 0) {
                            i78 = 0;
                        }
                        int i79 = (i76 & 65280) + i69;
                        int i80 = i79;
                        if (i79 > 65280) {
                            i80 = 65280;
                        } else if (i80 < 0) {
                            i80 = 0;
                        }
                        int i81 = (i76 & 255) + i71;
                        int i82 = i81;
                        if (i81 > 255) {
                            i82 = 255;
                        } else if (i82 < 0) {
                            i82 = 0;
                        }
                        iArr10[i75] = (((i76 >>> 24) * i74) & (-16777216)) | i78 | i80 | i82;
                    }
                } else {
                    int i83 = this.h * this.i;
                    while (true) {
                        i83--;
                        if (i83 < 0) {
                            break;
                        }
                        int i84 = iArr9[i83];
                        if ((i84 & (-16777216)) == 0) {
                            iArr10[i83] = 0;
                        } else {
                            int i85 = (i84 & 16711680) + i67;
                            int i86 = i85;
                            if (i85 > 16711680) {
                                i86 = 16711680;
                            } else if (i86 < 0) {
                                i86 = 0;
                            }
                            int i87 = (i84 & 65280) + i69;
                            int i88 = i87;
                            if (i87 > 65280) {
                                i88 = 65280;
                            } else if (i88 < 0) {
                                i88 = 0;
                            }
                            int i89 = (i84 & 255) + i71;
                            int i90 = i89;
                            if (i89 > 255) {
                                i90 = 255;
                            } else if (i90 < 0) {
                                i90 = 0;
                            }
                            iArr10[i83] = i65 | i86 | i88 | i90;
                        }
                    }
                }
            }
            z = true;
        }
        int[] iArrA = a(iArr3);
        if (iArr == null || i63 != iArr[2] || i57 != iArr[3] || i58 != iArr[4]) {
            z = true;
        }
        if (i63 != 0) {
            if (z) {
                int[][] iArr11 = iArr3;
                if (this.f29d == null) {
                    this.f28c = new int[4];
                    this.f29d = new int[4];
                }
                int[] iArrA2 = a(iArr11);
                int i91 = this.h;
                int i92 = this.i;
                a(i63, i57, i58);
                a(2, this.j * this.k, true, iArr11);
                int[] iArr12 = iArr11[2];
                int i93 = this.j;
                int iSin = ab.sin(-i63);
                int iCos = ab.cos(-i63);
                int i94 = (iSin << 10) / i57;
                int i95 = (iSin << 10) / i58;
                int i96 = (iCos << 10) / i57;
                int i97 = (iCos << 10) / i58;
                int i98 = ((this.l * i96) - (this.m * i94)) + (i91 << 14);
                int i99 = (this.m * i97) + (this.l * i95) + (i92 << 14);
                boolean zM14a = m14a(1);
                int i100 = zM14a ? -32768 : 0;
                int i101 = 0;
                int i102 = this.k;
                while (true) {
                    i102--;
                    if (i102 < 0) {
                        break;
                    }
                    int i103 = i98;
                    int i104 = i99;
                    i98 -= i94;
                    i99 += i97;
                    int i105 = 0;
                    int i106 = 0;
                    for (int i107 = 0; i107 < 2; i107++) {
                        int i108 = 0;
                        int i109 = 0;
                        int i110 = i103;
                        int i111 = i96;
                        int i112 = i91;
                        if (i107 == 1) {
                            i110 = i104;
                            i111 = i95;
                            i112 = i92;
                        }
                        int i113 = i112 << 15;
                        if (i110 < i100) {
                            i108 = i93;
                            if (i111 > 0) {
                                i108 = (-(i110 - i100)) / i111;
                                if (i110 + (i108 * i111) < i100) {
                                    i108++;
                                }
                            }
                        } else if (i110 >= i113) {
                            i108 = i93;
                            if (i111 < 0) {
                                i108 = (i110 - i113) / (-i111);
                                if (i110 + (i108 * i111) >= i113) {
                                    i108++;
                                }
                            }
                        }
                        int i114 = i110 + ((i93 * i111) - i111);
                        if (i114 < i100) {
                            i109 = i93;
                            if (i111 < 0) {
                                i109 = (i114 - i100) / i111;
                                if (i114 - (i109 * i111) < i100) {
                                    i109++;
                                }
                            }
                        } else if (i114 >= i113) {
                            i109 = i93;
                            if (i111 > 0) {
                                i109 = (i114 - i113) / i111;
                                if (i114 - (i109 * i111) >= i113) {
                                    i109++;
                                }
                            }
                        }
                        if (i109 > i106) {
                            int i115 = i109;
                            i106 = i115;
                            if (i115 >= i93) {
                                i106 = i93;
                                break;
                            }
                            if (i108 > i105) {
                                i5 = i108;
                                i105 = i5;
                                if (i5 >= i93) {
                                    i105 = i93;
                                    break;
                                }
                            }
                        } else {
                            if (i108 > i105) {
                                i5 = i108;
                                i105 = i5;
                                if (i5 >= i93) {
                                    i105 = i93;
                                    break;
                                }
                            }
                        }
                    }
                    if (i105 + i106 >= i93) {
                        i105 = 0;
                        i106 = i93;
                    } else if (i105 != 0) {
                        i103 += i105 * i96;
                        i104 += i105 * i95;
                    }
                    int i116 = i101 + i93;
                    int i117 = i105 + i101;
                    int i118 = i116 - i106;
                    while (i101 < i117) {
                        int i119 = i101;
                        i101++;
                        iArr12[i119] = 0;
                    }
                    if (zM14a) {
                        while (i101 < i118) {
                            int i120 = i101;
                            i101++;
                            iArr12[i120] = m13a(iArrA2, i103 >> 7, i104 >> 7, i91, i92);
                            i103 += i96;
                            i104 += i95;
                        }
                    } else {
                        while (i101 < i118) {
                            int i121 = i101;
                            i101++;
                            iArr12[i121] = iArrA2[(i103 >> 15) + ((i104 >> 15) * i91)];
                            i103 += i96;
                            i104 += i95;
                        }
                    }
                    while (i101 < i116) {
                        int i122 = i101;
                        i101++;
                        iArr12[i122] = 0;
                    }
                }
            } else {
                a(i63, i57, i58);
            }
            int iSin2 = ab.sin(i63);
            int iCos2 = ab.cos(i63);
            int i123 = ((((-i) << 1) - this.h) * i57) >> 10;
            int i124 = ((((-i2) << 1) - this.i) * i58) >> 10;
            i56 = this.j;
            i61 = this.k;
            i = -((((i123 * iCos2) - (i124 * iSin2)) + (i56 << 15)) >> 16);
            i2 = -((((i124 * iCos2) + (i123 * iSin2)) + (i61 << 15)) >> 16);
            iArrA = iArr3[2];
        } else if (i57 != 1024 || i58 != 1024) {
            a(2, i59 * i62, true, iArr3);
            int[] iArr13 = iArr3[2];
            if (z) {
                int i125 = (i56 << 10) / i59;
                int i126 = (i61 << 10) / i62;
                int i127 = 0;
                int i128 = 0;
                if (!m14a(1)) {
                    int i129 = i62;
                    while (true) {
                        i129--;
                        if (i129 < 0) {
                            break;
                        }
                        int i130 = ((i127 >> 10) * i56) << 10;
                        int i131 = i59;
                        while (true) {
                            i131--;
                            if (i131 >= 0) {
                                int i132 = i128;
                                i128++;
                                iArr13[i132] = iArrA[i130 >> 10];
                                i130 += i125;
                                if (i131 > 8) {
                                    int i133 = i128 + 1;
                                    iArr13[i128] = iArrA[i130 >> 10];
                                    int i134 = i130 + i125;
                                    int i135 = i133 + 1;
                                    iArr13[i133] = iArrA[i134 >> 10];
                                    int i136 = i134 + i125;
                                    int i137 = i135 + 1;
                                    iArr13[i135] = iArrA[i136 >> 10];
                                    int i138 = i136 + i125;
                                    int i139 = i137 + 1;
                                    iArr13[i137] = iArrA[i138 >> 10];
                                    int i140 = i138 + i125;
                                    int i141 = i139 + 1;
                                    iArr13[i139] = iArrA[i140 >> 10];
                                    int i142 = i140 + i125;
                                    int i143 = i141 + 1;
                                    iArr13[i141] = iArrA[i142 >> 10];
                                    int i144 = i142 + i125;
                                    int i145 = i143 + 1;
                                    iArr13[i143] = iArrA[i144 >> 10];
                                    int i146 = i144 + i125;
                                    i128 = i145 + 1;
                                    iArr13[i145] = iArrA[i146 >> 10];
                                    i130 = i146 + i125;
                                    i131 -= 8;
                                }
                            }
                        }
                        i127 += i126;
                    }
                } else {
                    int i147 = i62;
                    while (true) {
                        i147--;
                        if (i147 < 0) {
                            break;
                        }
                        int i148 = 0;
                        int i149 = i127 >> 2;
                        int i150 = i59;
                        while (true) {
                            i150--;
                            if (i150 >= 0) {
                                int i151 = i128;
                                i128++;
                                iArr13[i151] = m13a(iArrA, i148 >> 2, i149, i56, i61);
                                i148 += i125;
                            }
                        }
                        i127 += i126;
                    }
                }
            }
            iArrA = iArr13;
            i56 = i59;
            i61 = i62;
            i = (i * i57) >> 10;
            i2 = (i2 * i58) >> 10;
        }
        if (this.b[10] > 1 || this.b[11] > 1) {
            if (z) {
                int[] iArr14 = iArrA;
                int i152 = i56;
                int i153 = i61;
                int i154 = this.b[10];
                int[][] iArr15 = iArr3;
                int i155 = this.b[11];
                int i156 = i154;
                if (i156 < 1) {
                    i156 = 1;
                }
                if (i155 < 1) {
                    i155 = 1;
                }
                int i157 = i152 * i153;
                a(3, i157, true, iArr15);
                a(4, i157, true, iArr15);
                int[] iArr16 = iArr15[3];
                int[] iArr17 = iArr15[4];
                int i158 = 65536 / (((i156 << 1) + 1) * ((i155 << 1) + 1));
                int i159 = i157;
                while (true) {
                    i159--;
                    if (i159 < 0) {
                        break;
                    } else {
                        iArr16[i159] = 0;
                    }
                }
                for (int i160 = 0; i160 <= 24; i160 += 8) {
                    int i161 = i160;
                    iArr17[0] = (iArr14[0] >>> i161) & 255;
                    int i162 = 1;
                    int i163 = (i152 + 1) - 1;
                    while (i162 < i163) {
                        iArr17[i162] = ((iArr14[i162] >>> i161) & 255) + iArr17[i162 - 1];
                        i162++;
                    }
                    int i164 = i153;
                    while (true) {
                        i164--;
                        if (i164 < 1) {
                            break;
                        }
                        int i165 = i162;
                        i162++;
                        iArr17[i165] = ((iArr14[i162] >>> i161) & 255) + iArr17[i162 - i152];
                        int i166 = (i162 + i152) - 1;
                        while (i162 < i166) {
                            iArr17[i162] = ((((iArr14[i162] >>> i161) & 255) + iArr17[i162 - 1]) - iArr17[(i162 - i152) - 1]) + iArr17[i162 - i152];
                            i162++;
                        }
                    }
                    int i167 = 0;
                    for (int i168 = 0; i168 < i153; i168++) {
                        int i169 = i168 - i155;
                        int i170 = i169;
                        if (i169 < 0) {
                            i170 = 0;
                        }
                        int i171 = i168 + i155;
                        int i172 = i171;
                        if (i171 >= i153) {
                            i172 = i153 - 1;
                        }
                        int i173 = i170 * i152;
                        int i174 = i172 * i152;
                        for (int i175 = 0; i175 < i152; i175++) {
                            int i176 = i175 - i156;
                            int i177 = i176;
                            if (i176 < 0) {
                                i177 = 0;
                            }
                            int i178 = i175 + i156;
                            int i179 = i178;
                            if (i178 >= i152) {
                                i179 = i152 - 1;
                            }
                            int i180 = i167;
                            i167++;
                            iArr16[i180] = iArr16[i180] | ((((((iArr17[i179 + i174] + iArr17[i177 + i173]) - iArr17[i177 + i174]) - iArr17[i179 + i173]) * i158) >> 16) << i160);
                        }
                    }
                }
                iArrA = iArr16;
            } else {
                iArrA = iArr3[3];
            }
        }
        a(iArrA, this.b[7] + i, this.b[8] + i2, i56, i61);
        this.b[5] = 0;
        this.b[6] = i3;
        int[] iArr18 = this.b;
        if (iArr18 == null) {
            lVar.b = null;
            return;
        }
        int length = iArr18.length;
        if (lVar.b == null) {
            lVar.b = new int[length];
        }
        int i181 = length;
        while (true) {
            i181--;
            if (i181 < 0) {
                return;
            } else {
                lVar.b[i181] = iArr18[i181];
            }
        }
    }

    private void a(int[] iArr, int i, int i2, int i3, int i4) {
        if (i3 <= 0 || i4 <= 0) {
            return;
        }
        int clipX = this.f33b.getClipX();
        int i5 = clipX;
        int clipWidth = clipX + this.f33b.getClipWidth();
        if (clipWidth <= 0) {
            return;
        }
        int clipY = this.f33b.getClipY();
        int i6 = clipY;
        int clipHeight = clipY + this.f33b.getClipHeight();
        if (clipHeight <= 0) {
            return;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i >= clipWidth || i2 >= clipHeight || i + i3 <= i5 || i2 + i4 <= i6) {
            return;
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = i3;
        int i10 = i4;
        if (i + i3 > clipWidth) {
            i9 -= (i + i3) - clipWidth;
        }
        if (i < i5) {
            i7 = 0 - (i - i5);
            i9 += i - i5;
            i = i5;
        }
        if (i2 + i4 > clipHeight) {
            i10 -= (i2 + i4) - clipHeight;
        }
        if (i2 < i6) {
            i8 = 0 - (i2 - i6);
            i10 += i2 - i6;
            i2 = i6;
        }
        if (i7 + (i8 * i3) + (i10 * i3) > iArr.length) {
            a(1, i9 * i10, true, d);
            int[] iArr2 = d[1];
            int i11 = i7 + (i8 * i3);
            int i12 = i3 - i9;
            int i13 = 0;
            int i14 = i10;
            while (true) {
                i14--;
                if (i14 < 0) {
                    break;
                }
                int i15 = i11 + i9;
                while (i11 < i15) {
                    int i16 = i13;
                    i13++;
                    int i17 = i11;
                    i11++;
                    iArr2[i16] = iArr[i17];
                }
                i11 += i12;
            }
            i7 = 0;
            i8 = 0;
            i3 = i9;
            iArr = iArr2;
        }
        int i18 = this.b[9];
        if (i18 == 0) {
            this.f33b.drawRGB(iArr, (i8 * i3) + i7, i3, i, i2, i9, i10, true);
            return;
        }
        if (this.f30a == null) {
            return;
        }
        a(2, i3 * i4, true, d);
        int[] iArr3 = d[2];
        this.f30a.getRGB(iArr3, (i8 * i3) + i7, i3, i, i2, i9, i10);
        if (i18 != 1) {
            int i19 = i3 * i4;
            while (true) {
                i19--;
                if (i19 < 0) {
                    break;
                }
                int i20 = iArr3[i19];
                int i21 = iArr[i19];
                int i22 = i21 >>> 24;
                int i23 = ((i21 & 16711935) * i22) >> 8;
                int i24 = (i20 & 16711680) - (i23 & 16711680);
                int i25 = i24;
                if (i24 < 0) {
                    i25 = 0;
                }
                int i26 = (i20 & 65280) - ((((i21 & 65280) * i22) >> 8) & 65280);
                int i27 = i26;
                if (i26 < 0) {
                    i27 = 0;
                }
                int i28 = (i20 & 255) - (i23 & 255);
                int i29 = i28;
                if (i28 < 0) {
                    i29 = 0;
                }
                iArr3[i19] = i25 | i27 | i29;
            }
        } else {
            int i30 = i3 * i4;
            while (true) {
                i30--;
                if (i30 < 0) {
                    break;
                }
                int i31 = iArr3[i30];
                int i32 = iArr[i30];
                int i33 = i32 >>> 24;
                int i34 = ((i32 & 16711935) * i33) >> 8;
                int i35 = (i31 & 16711680) + (i34 & 16711680);
                int i36 = i35;
                if (i35 > 16711680) {
                    i36 = 16711680;
                }
                int i37 = (i31 & 65280) + ((((i32 & 65280) * i33) >> 8) & 65280);
                int i38 = i37;
                if (i37 > 65280) {
                    i38 = 65280;
                }
                int i39 = (i31 & 255) + (i34 & 255);
                int i40 = i39;
                if (i39 > 255) {
                    i40 = 255;
                }
                iArr3[i30] = i36 | i38 | i40;
            }
        }
        this.f33b.drawRGB(iArr3, (i8 * i3) + i7, i3, i, i2, i9, i10, false);
    }

    public final int c() {
        return this.b[2];
    }

    public final int d() {
        return this.b[0];
    }

    public final int e() {
        return this.b[3];
    }

    public final int f() {
        return this.b[4];
    }

    public final void setScale(int i, int i2) {
        this.b[3] = i;
        this.b[4] = i2;
    }

    public final int g() {
        return this.b[9];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m12a() {
        this.b[0] = -8355712;
        this.b[2] = 0;
        setScale(1024, 1024);
        this.b[9] = 0;
        this.b[10] = 0;
        this.b[11] = 0;
        this.b[1] = 0;
    }

    public final void fillRect(int i, int i2, int i3, int i4) {
        int i5 = this.b[12];
        int i6 = i5 >>> 24;
        if (i6 == 0) {
            return;
        }
        if (this.b[2] != 0) {
            a(0, 8, false, d);
            int[] iArr = d[0];
            iArr[0] = i;
            iArr[1] = i2;
            iArr[2] = (i + i3) - 1;
            iArr[3] = i2;
            iArr[4] = iArr[2];
            iArr[5] = (i2 + i4) - 1;
            iArr[6] = i;
            iArr[7] = iArr[5];
            a(iArr, 0, 4);
            return;
        }
        int i7 = this.b[3];
        int i8 = this.b[4];
        int i9 = ((i * i7) >> 10) + this.b[7];
        int i10 = ((i2 * i8) >> 10) + this.b[8];
        int i11 = (i3 * i7) >> 10;
        int i12 = (i4 * i8) >> 10;
        if (i6 == 255) {
            this.f33b.fillRect(i9, i10, i11, i12);
            return;
        }
        int i13 = i11 * i12;
        a(0, i13, true, d);
        int[] iArr2 = d[0];
        while (true) {
            i13--;
            if (i13 < 0) {
                a(iArr2, i9, i10, i11, i12);
                return;
            }
            iArr2[i13] = i5;
        }
    }

    public final void b(int i) {
        this.b[12] = i;
        this.f33b.setColor(i);
    }

    public final void c(int i) {
        this.b[0] = i;
    }

    public final void a(l lVar) {
        a(lVar.f151c);
        this.f30a = lVar;
        int[] iArr = lVar.b;
        if (iArr != null) {
            iArr[5] = iArr[5] + 1;
        }
    }

    public final void a(Graphics graphics) {
        this.f33b = graphics;
        this.f30a = null;
    }

    private int h() {
        if (e == null) {
            int i = (-65281) | (-16777216);
            if (e == null) {
                e = new int[1];
                Image imageCreateImage = Image.createImage(1, 1);
                f32a = imageCreateImage;
                f31a = imageCreateImage.getGraphics();
            }
            f31a.setColor(i);
            f31a.fillRect(0, 0, 1, 1);
            f32a.getRGB(e, 0, 1, 0, 0, 1, 1);
        }
        return e[0];
    }

    public final void a(int i, int i2) {
        this.b[7] = i;
        this.b[8] = i2;
    }

    public final int i() {
        return this.b[7];
    }

    public final int j() {
        return this.b[8];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static int m13a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i >> 8;
        int i10 = i2 >> 8;
        int i11 = (i10 * i3) + i9;
        if (i9 != -1 && i10 != -1) {
            i7 = iArr[i11];
            i8 = i9 < i3 - 1 ? iArr[i11 + 1] : i7 & 16777215;
            i6 = i8 & 16777215;
            i5 = i7 & 16777215;
            if (i10 < i4 - 1) {
                int i12 = i11 + i3;
                if (i9 < i3 - 1) {
                    i6 = iArr[i12 + 1];
                }
                i5 = iArr[i12];
            }
        } else if (i9 == -1) {
            int i13 = i11 + 1;
            if (i10 == -1) {
                int i14 = iArr[i13 + i3];
                i6 = i14;
                int i15 = i14 & 16777215;
                i5 = i15;
                i8 = i15;
                i7 = i15;
            } else {
                int i16 = iArr[i13];
                i8 = i16;
                int i17 = i16 & 16777215;
                i6 = i17;
                i7 = i17;
                if (i10 < i4 - 1) {
                    i6 = iArr[i13 + i3];
                }
                i5 = i6 & 16777215;
            }
        } else {
            int i18 = i11 + i3;
            int i19 = iArr[i18];
            i5 = i19;
            int i20 = i19 & 16777215;
            i6 = i20;
            i7 = i20;
            if (i9 < i3 - 1) {
                i6 = iArr[i18 + 1];
            }
            i8 = i6 & 16777215;
        }
        int i21 = i2 & 255;
        int i22 = i & 255;
        int i23 = i7 >>> 24;
        int i24 = i23 + ((((i5 >>> 24) - i23) * i21) >> 8);
        int i25 = i8 >>> 24;
        int i26 = (i24 + ((((i25 + ((((i6 >>> 24) - i25) * i21) >> 8)) - i24) * i22) >> 8)) << 24;
        int i27 = i7 & 16711935;
        int i28 = (i27 + ((((i5 & 16711935) - i27) * i21) >> 8)) & 16711935;
        int i29 = i8 & 16711935;
        int i30 = i26 | ((i28 + (((((i29 + ((((i6 & 16711935) - i29) * i21) >> 8)) & 16711935) - i28) * i22) >> 8)) & 16711935);
        int i31 = i7 & 65280;
        int i32 = i31 + ((((i5 & 65280) - i31) * i21) >> 8);
        int i33 = i8 & 65280;
        return i30 | ((i32 + ((((i33 + ((((i6 & 65280) - i33) * i21) >> 8)) - i32) * i22) >> 8)) & 65280);
    }

    public final void drawLine(int i, int i2, int i3, int i4) {
        int i5 = this.b[3];
        int i6 = this.b[4];
        int i7 = this.b[7];
        int i8 = this.b[8];
        if (i5 != 1024 || i6 != 1024) {
            i = (i * i5) >> 10;
            i3 = (i3 * i5) >> 10;
            i2 = (i2 * i6) >> 10;
            i4 = (i4 * i6) >> 10;
        }
        if (this.b[2] != 0) {
            int iCos = ab.cos(this.b[2]);
            int iSin = ab.sin(this.b[2]);
            int i9 = ((i * iCos) - (i2 * iSin)) >> 15;
            i2 = ((i2 * iCos) + (i * iSin)) >> 15;
            i = i9;
            int i10 = ((i3 * iCos) - (i4 * iSin)) >> 15;
            i4 = ((i4 * iCos) + (i3 * iSin)) >> 15;
            i3 = i10;
        }
        int i11 = i + i7;
        int i12 = i3 + i7;
        int i13 = i2 + i8;
        int i14 = i4 + i8;
        if (!m14a(2)) {
            this.f33b.drawLine(i11, i13, i12, i14);
            return;
        }
        int i15 = i11;
        int i16 = i13;
        int iAbs = Math.abs(i12 - i11) + 3;
        int iAbs2 = Math.abs(i14 - i13) + 3;
        a(3, iAbs * iAbs2, true, d);
        int[] iArr = d[3];
        int i17 = this.b[12];
        int i18 = i17 >>> 24;
        int i19 = i18;
        if (i18 == 255) {
            i19 = 256;
        }
        int i20 = i17 & 16777215;
        if (iAbs >= iAbs2) {
            int i21 = iAbs - 1;
            if (i12 < i11) {
                i11 = i12;
                i12 = i11;
                i13 = i14;
                i14 = i13;
                i15 = i11;
                i16 = i13;
            }
            int i22 = i12 - i11;
            int i23 = i22 != 0 ? ((i14 - i13) << 16) / i22 : 0;
            int i24 = i23 < 0 ? iAbs2 - 2 : 0;
            int i25 = i24 << 16;
            if (i23 <= 65535) {
                i25 += i23;
            }
            int i26 = i25;
            for (int i27 = 0; i27 <= i22; i27++) {
                int i28 = i27 + ((i25 >> 16) * i21);
                int i29 = i25 & 65535;
                iArr[i28] = ((((65535 - i29) * i19) >> 16) << 24) | i20;
                if (i29 != 0) {
                    iArr[i28 + i21] = (((i29 * i19) >> 16) << 24) | i20;
                }
                i25 += i23;
            }
            a(iArr, i15, i16 - i24, i21, iAbs2);
            int i30 = i26;
            for (int i31 = 0; i31 <= i22; i31++) {
                int i32 = i31 + ((i30 >> 16) * i21);
                iArr[i32] = 0;
                iArr[i32 + i21] = 0;
                i30 += i23;
            }
            return;
        }
        int i33 = iAbs2 - 1;
        if (i14 < i13) {
            i11 = i12;
            i12 = i11;
            i13 = i14;
            i14 = i13;
            i15 = i11;
            i16 = i13;
        }
        int i34 = i14 - i13;
        int i35 = i34 != 0 ? ((i12 - i11) << 16) / i34 : 0;
        int i36 = i35 < 0 ? iAbs - 2 : 0;
        int i37 = i36 << 16;
        if (i35 <= 65535) {
            i37 += i35;
        }
        int i38 = i34 * iAbs;
        int i39 = i37;
        for (int i40 = 0; i40 <= i38; i40 += iAbs) {
            int i41 = (i37 >> 16) + i40;
            int i42 = i37 & 65535;
            iArr[i41] = ((((65535 - i42) * i19) >> 16) << 24) | i20;
            if (i42 != 0) {
                iArr[i41 + 1] = (((i42 * i19) >> 16) << 24) | i20;
            }
            i37 += i35;
        }
        a(iArr, i15 - i36, i16, iAbs, i33);
        int i43 = i39;
        int i44 = 0;
        while (true) {
            int i45 = i44;
            if (i45 > i38) {
                return;
            }
            int i46 = (i43 >> 16) + i45;
            iArr[i46] = 0;
            iArr[i46 + 1] = 0;
            i43 += i35;
            i44 = i45 + iAbs;
        }
    }

    public final int k() {
        return this.b[1];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m14a(int i) {
        return (this.b[1] & i) == i;
    }

    public final void d(int i) {
        this.b[1] = i;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void m15b() {
        int size = this.a.size() - 1;
        int[] iArr = (int[]) this.a.elementAt(size);
        this.a.removeElementAt(size);
        int i = 13;
        while (true) {
            i--;
            if (i < 0) {
                this.f27d.addElement(iArr);
                a((Graphics) this.f26b.elementAt(size));
                this.f26b.removeElementAt(size);
                this.f30a = (l) this.c.elementAt(size);
                this.c.removeElementAt(size);
                b(this.b[12]);
                return;
            }
            this.b[i] = iArr[i];
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public final void m16c() {
        int[] iArr;
        if (this.a == null) {
            this.a = new Vector();
            this.f27d = new Vector();
            this.f26b = new Vector();
            this.c = new Vector();
        }
        this.a.addElement(this.b);
        this.f26b.addElement(this.f33b);
        this.c.addElement(this.f30a);
        if (this.f27d.size() > 0) {
            iArr = (int[]) this.f27d.elementAt(0);
            this.f27d.removeElementAt(0);
        } else {
            iArr = new int[13];
        }
        int i = 13;
        while (true) {
            i--;
            if (i < 0) {
                this.b = iArr;
                return;
            }
            iArr[i] = this.b[i];
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m17a(l lVar) {
        int[] iArr = lVar.b;
        if (iArr == null) {
            return false;
        }
        int i = 13;
        while (true) {
            i--;
            if (i < 0) {
                return true;
            }
            switch (i) {
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    if (this.b[i] != iArr[i]) {
                        return false;
                    }
                    break;
            }
        }
    }

    public final int getClipHeight() {
        return this.f33b.getClipHeight();
    }

    public final int getClipWidth() {
        return this.f33b.getClipWidth();
    }

    public final int getClipX() {
        return this.f33b.getClipX();
    }

    public final int getClipY() {
        return this.f33b.getClipY();
    }

    public final void setClip(int i, int i2, int i3, int i4) {
        this.f33b.setClip(i, i2, i3, i4);
    }

    public final void clipRect(int i, int i2, int i3, int i4) {
        int clipX = this.f33b.getClipX();
        int clipY = this.f33b.getClipY();
        int clipWidth = this.f33b.getClipWidth();
        int clipHeight = this.f33b.getClipHeight();
        if (i + i3 <= clipX || i2 + i4 <= clipY || i >= clipX + clipWidth || i2 >= clipY + clipHeight) {
            this.f33b.setClip(clipX, clipY, 0, 0);
            return;
        }
        int i5 = i + i3;
        int i6 = i5;
        if (i5 > clipX + clipWidth) {
            i6 = clipX + clipWidth;
        }
        if (i < clipX) {
            i = clipX;
        }
        int i7 = i2 + i4;
        int i8 = i7;
        if (i7 > clipY + clipHeight) {
            i8 = clipY + clipHeight;
        }
        if (i2 < clipY) {
            i2 = clipY;
        }
        this.f33b.setClip(i, i2, i6 - i, i8 - i2);
    }

    public final void a(int[] iArr, int i, int i2) {
        int i3 = this.b[3];
        int i4 = this.b[4];
        int i5 = this.b[7];
        int i6 = this.b[8];
        if (this.o == null || this.o.length < i2) {
            this.o = new int[i2];
            this.p = new int[i2];
        }
        int i7 = this.b[2];
        int iSin = ab.sin(i7);
        int iCos = ab.cos(i7);
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = i;
            int i10 = i + 1;
            int i11 = (iArr[i9] * i3) >> 10;
            i = i10 + 1;
            int i12 = (iArr[i10] * i4) >> 10;
            this.o[i8] = (((i11 * iCos) - (i12 * iSin)) >> 15) + i5;
            this.p[i8] = (((i12 * iCos) + (i11 * iSin)) >> 15) + i6;
        }
        if (m11a()) {
            if (i2 == 3) {
                DirectUtils.getDirectGraphics(this.f33b).fillTriangle(this.o[0], this.p[0], this.o[1], this.p[1], this.o[2], this.p[2], this.b[12]);
                return;
            } else {
                DirectUtils.getDirectGraphics(this.f33b).fillPolygon(this.o, 0, this.p, 0, i2, this.b[12]);
                return;
            }
        }
        boolean zM14a = m14a(2);
        if (f == null || i2 > f.length) {
            f = new int[i2];
            g = new int[i2];
            f34h = new int[i2];
            f35i = new int[i2];
            f36j = new int[i2];
            f38l = new int[i2];
        }
        if (zM14a && (f37k == null || i2 > f37k.length)) {
            f37k = new int[i2];
        }
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = Integer.MIN_VALUE;
        int i17 = 0;
        int i18 = 0;
        int i19 = zM14a ? this.b[12] | (-16777216) : 0;
        int[] iArr2 = null;
        if (zM14a) {
            for (int i20 = 0; i20 < i2; i20++) {
                int i21 = this.o[i20];
                if (i21 > i15) {
                    i15 = i21;
                }
                if (i21 < i13) {
                    i13 = i21;
                }
                int i22 = this.p[i20];
                if (i22 > i16) {
                    i16 = i22;
                }
                if (i22 < i14) {
                    i14 = i22;
                }
            }
            i18 = (i16 - i14) + 1;
            int i23 = (i15 - i13) + 1;
            i17 = i23;
            a(0, i23 * i18, true, d);
            iArr2 = d[0];
        }
        for (int i24 = 0; i24 < i2; i24++) {
            if (zM14a) {
                f35i[i24] = (this.o[i24] - i13) << 16;
                g[i24] = this.p[i24] - i14;
            } else {
                f35i[i24] = this.o[i24] << 16;
                g[i24] = this.p[i24];
            }
        }
        for (int i25 = 0; i25 < i2; i25++) {
            int i26 = i25 + 1;
            int i27 = i26;
            if (i26 == i2) {
                i27 = 0;
            }
            f34h[i25] = g[i27];
            f36j[i25] = f35i[i27];
        }
        int i28 = 0;
        for (int i29 = 0; i29 < i2; i29++) {
            int i30 = f34h[i29] - g[i29];
            int i31 = i30;
            if (i30 != 0) {
                if (i31 < 0) {
                    int i32 = g[i29];
                    g[i29] = f34h[i29];
                    f34h[i29] = i32;
                    int i33 = f35i[i29];
                    f35i[i29] = f36j[i29];
                    f36j[i29] = i33;
                    i31 = -i31;
                }
                int[] iArr3 = f36j;
                int i34 = i29;
                iArr3[i34] = iArr3[i34] - f35i[i29];
                int[] iArr4 = f36j;
                int i35 = i29;
                iArr4[i35] = iArr4[i35] / i31;
            }
            int i36 = g[i29];
            int i37 = f34h[i29];
            boolean z = false;
            boolean z2 = false;
            int i38 = i28;
            while (true) {
                i38--;
                if (i38 < 0) {
                    break;
                }
                if (f38l[i38] == i36) {
                    z = true;
                }
                if (f38l[i38] == i37) {
                    z2 = true;
                }
            }
            if (!z) {
                int i39 = i28;
                i28++;
                f38l[i39] = i36;
            }
            if (!z2) {
                int i40 = i28;
                i28++;
                f38l[i40] = i37;
            }
        }
        for (int i41 = 0; i41 < i28; i41++) {
            for (int i42 = i41 + 1; i42 < i28; i42++) {
                if (f38l[i41] > f38l[i42]) {
                    int i43 = f38l[i41];
                    f38l[i41] = f38l[i42];
                    f38l[i42] = i43;
                }
            }
        }
        int i44 = f38l[0];
        int i45 = 1;
        int i46 = -1;
        do {
            int i47 = 0;
            int i48 = i2;
            while (true) {
                i48--;
                if (i48 < 0) {
                    break;
                }
                if (g[i48] <= i44 && f34h[i48] > i44) {
                    int i49 = i47;
                    i47++;
                    f[i49] = i48;
                }
            }
            if (zM14a && i47 != i46) {
                int i50 = i47;
                while (true) {
                    i50--;
                    if (i50 < 0) {
                        break;
                    } else {
                        f37k[i50] = Integer.MAX_VALUE;
                    }
                }
                i46 = i47;
            }
            for (int i51 = 0; i51 < i47; i51++) {
                for (int i52 = i51 + 1; i52 < i47; i52++) {
                    int i53 = f[i51];
                    int i54 = f35i[i53];
                    int i55 = f[i52];
                    int i56 = f35i[i55];
                    if (i54 > i56 || (i54 == i56 && f36j[i53] > f36j[i55])) {
                        f[i52] = i53;
                        f[i51] = i55;
                    }
                }
            }
            int i57 = i45;
            i45++;
            int i58 = f38l[i57];
            if (i45 == i28) {
                i58++;
            }
            while (i44 < i58) {
                int i59 = Integer.MIN_VALUE;
                if (zM14a) {
                    int i60 = i44 * i17;
                    int i61 = i60;
                    int i62 = i60 + i17;
                    while (i61 < i62) {
                        int i63 = i61;
                        i61++;
                        iArr2[i63] = 0;
                    }
                }
                int i64 = 0;
                while (i64 < i47) {
                    int i65 = i64;
                    int i66 = i64 + 1;
                    int i67 = f[i65];
                    int i68 = f35i[i67];
                    i64 = i66 + 1;
                    int i69 = f[i66];
                    int i70 = f35i[i69];
                    int i71 = (i68 >> 16) + ((i68 & 65535) >> 15);
                    int i72 = (i70 >> 16) + ((i70 & 65535) >> 15) + 1;
                    if (i71 < i59) {
                        i71 = i59;
                    }
                    i59 = i72;
                    if (zM14a) {
                        int i73 = i64 - 2;
                        int i74 = i64 - 1;
                        int i75 = i72 - i71;
                        int i76 = (i44 * i17) + i71;
                        int i77 = i76;
                        int i78 = i76 + i75;
                        while (i77 < i78) {
                            int i79 = i77;
                            i77++;
                            iArr2[i79] = i19;
                        }
                        if (f37k[i73] != Integer.MAX_VALUE) {
                            int i80 = i71 - f37k[i73];
                            if (i80 < 0) {
                                a(iArr2, ((i44 - 1) * i17) + i71, -i80, i19, true);
                            } else if (i80 > 0) {
                                a(iArr2, (i44 * i17) + f37k[i73], i80, i19, true);
                            }
                        }
                        if (f37k[i74] != Integer.MAX_VALUE) {
                            int i81 = i72 - f37k[i74];
                            if (i81 < 0) {
                                a(iArr2, (i44 * i17) + i72, -i81, i19, false);
                            } else if (i81 > 0) {
                                a(iArr2, ((i44 - 1) * i17) + f37k[i74], i81, i19, false);
                            }
                        }
                        f37k[i73] = i71;
                        f37k[i74] = i72;
                    } else {
                        this.f33b.fillRect(i71, i44, i72 - i71, 1);
                    }
                    int[] iArr5 = f35i;
                    iArr5[i67] = iArr5[i67] + f36j[i67];
                    int[] iArr6 = f35i;
                    iArr6[i69] = iArr6[i69] + f36j[i69];
                }
                i44++;
            }
        } while (i45 < i28);
        if (zM14a) {
            a(iArr2, i13, i14, i17, i18);
        }
    }

    private static void a(int[] iArr, int i, int i2, int i3, boolean z) {
        int i4 = i3 & 16777215;
        if (i2 == 1) {
            iArr[i] = iArr[i] | Integer.MIN_VALUE | i4;
            return;
        }
        int i5 = 65535 / (i2 + 1);
        int i6 = 0;
        if (!z) {
            i6 = 65535;
            i5 = -i5;
        }
        int i7 = i6 + i5;
        int i8 = i2 + i;
        while (i < i8) {
            int i9 = i;
            i++;
            iArr[i9] = iArr[i9] | ((i7 >> 8) << 24) | i4;
            i7 += i5;
        }
    }

    public final void b(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < 2; i5++) {
            if (i5 == 1 && (f39m == null || f39m.length < (i3 << 1))) {
                f39m = new int[i3 << 1];
            }
            int i6 = 3;
            for (int i7 = 0; i7 < i2; i7++) {
                int i8 = iArr[i6];
                int i9 = iArr[i6 + 1];
                int i10 = iArr[i6 + 4];
                int i11 = iArr[i6 + 5];
                int i12 = i6 + 6;
                int i13 = i12;
                i6 = i12;
                if (i7 == i2 - 1) {
                    i13 = 3;
                }
                int i14 = iArr[i13 + 2];
                int i15 = iArr[i13 + 3];
                int i16 = iArr[i13];
                int i17 = iArr[i13 + 1];
                if (i8 != i10 || i9 != i11 || i14 != i16 || i15 != i17) {
                    int iM18a = m18a(i8 - i10, i9 - i11) + m18a(i10 - i14, i11 - i15) + m18a(i14 - i16, i15 - i17);
                    int i18 = iM18a > 8 ? iM18a / 8 : 1;
                    if (i5 == 0) {
                        i3 += i18;
                    } else {
                        int i19 = 32768 / i18;
                        int i20 = 0;
                        for (int i21 = 0; i21 < i18; i21++) {
                            int i22 = i4;
                            int i23 = i4 + 1;
                            f39m[i22] = (short) a(i8, i10, i14, i16, i20);
                            i4 = i23 + 1;
                            f39m[i23] = (short) a(i9, i11, i15, i17, i20);
                            i20 += i19;
                        }
                    }
                } else if (i5 == 0) {
                    i3++;
                } else {
                    int i24 = i4;
                    int i25 = i4 + 1;
                    f39m[i24] = (short) i8;
                    i4 = i25 + 1;
                    f39m[i25] = (short) i9;
                }
            }
        }
        a(f39m, 0, i3);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static int m18a(int i, int i2) {
        int iAbs = Math.abs(i2);
        int iAbs2 = Math.abs(i);
        return iAbs2 > iAbs ? iAbs2 + ((iAbs * 106) >> 8) : iAbs + ((iAbs2 * 106) >> 8);
    }

    private static int a(int i, int i2, int i3, int i4, int i5) {
        int i6 = 32768 - i5;
        int i7 = (i6 * i6) >> 15;
        int i8 = (i5 * i5) >> 15;
        return ((((((i7 * i6) >> 15) * i) + ((((i5 * 3) * i7) >> 15) * i2)) + ((((i8 * 3) * i6) >> 15) * i3)) + (((i8 * i5) >> 15) * i4)) >> 15;
    }

    public final void a(int i, int i2, int i3, int i4) {
        int i5 = (i3 * this.b[3]) >> 10;
        int i6 = (i4 * this.b[4]) >> 10;
        if (i5 <= 0 || i6 <= 0) {
            return;
        }
        int i7 = (i * this.b[3]) >> 10;
        int i8 = (i2 * this.b[4]) >> 10;
        if (this.b[2] != 0) {
            int i9 = i5 >> 1;
            int i10 = i6 >> 1;
            int i11 = i7 + i9;
            int i12 = i8 + i10;
            int iCos = ab.cos(this.b[2]);
            int iSin = ab.sin(this.b[2]);
            i7 = (((i11 * iCos) - (i12 * iSin)) >> 15) - i9;
            i8 = (((i12 * iCos) + (i11 * iSin)) >> 15) - i10;
        }
        int i13 = i7 + this.b[7];
        int i14 = i8 + this.b[8];
        if (m11a()) {
            this.f33b.fillArc(i13, i14, i5, i6, 0, 360);
            return;
        }
        boolean zM14a = m14a(2);
        int i15 = i5 >> 1;
        int i16 = 65536;
        int i17 = (i6 << 16) / i5;
        if (i6 > i5) {
            i15 = i6 >> 1;
            i16 = (i5 << 16) / i6;
            i17 = 65536;
        }
        int i18 = i6 + 1;
        if (n == null || i18 > n.length) {
            n = new int[(i18 * 12) / 10];
        }
        for (int i19 = 0; i19 < i18; i19++) {
            n[i19] = -1;
        }
        if (zM14a) {
            a(0, i5 * i6, true, d);
        }
        int[] iArr = d[0];
        int i20 = zM14a ? this.b[12] | (-16777216) : 0;
        int i21 = 1 - i15;
        int i22 = 1;
        int i23 = (-i15) << 1;
        int i24 = 0;
        int i25 = i15;
        while (i24 < i25) {
            if (i21 >= 0) {
                i25--;
                i23 += 2;
                i21 += i23;
            }
            i24++;
            i22 += 2;
            i21 += i22;
            n[((i15 - i25) * i17) >> 16] = i24;
            n[((i15 + i25) * i17) >> 16] = i24;
            n[((i15 - i24) * i17) >> 16] = i25;
            n[((i15 + i24) * i17) >> 16] = i25;
        }
        n[(i15 * i17) >> 16] = i15;
        int i26 = i5 & 1;
        int i27 = Integer.MIN_VALUE;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        for (int i31 = 0; i31 < i6; i31++) {
            int i32 = n[i31];
            if (i32 != -1) {
                int i33 = ((i15 - i32) * i16) >> 16;
                int i34 = (((i15 + i32) * i16) >> 16) + i26;
                if (zM14a) {
                    int i35 = 0;
                    while (i35 < i33) {
                        int i36 = i30;
                        i30++;
                        iArr[i36] = 0;
                        i35++;
                    }
                    while (i35 < i34) {
                        int i37 = i30;
                        i30++;
                        iArr[i37] = i20;
                        i35++;
                    }
                    while (i35 < i5) {
                        int i38 = i30;
                        i30++;
                        iArr[i38] = 0;
                        i35++;
                    }
                    if (i27 != Integer.MIN_VALUE) {
                        int i39 = i33 - i28;
                        if (i39 < 0) {
                            a(iArr, ((i31 - 1) * i5) + i33, -i39, i20, true);
                        } else if (i39 > 0) {
                            a(iArr, (i31 * i5) + i28, i39, i20, true);
                        }
                        int i40 = i34 - i29;
                        if (i40 < 0) {
                            a(iArr, (i31 * i5) + i34, -i40, i20, false);
                        } else if (i40 > 0) {
                            a(iArr, ((i31 - 1) * i5) + i29, i40, i20, false);
                        }
                    }
                    i27 = i31;
                    i28 = i33;
                    i29 = i34;
                } else {
                    this.f33b.fillRect(i13 + i33, i14 + i31, i34 - i33, 1);
                }
            } else if (zM14a) {
                int i41 = i5;
                while (true) {
                    i41--;
                    if (i41 >= 0) {
                        int i42 = i30;
                        i30++;
                        iArr[i42] = 0;
                    }
                }
            }
        }
        if (zM14a) {
            a(iArr, i13, i14, i5, i6);
        }
    }

    public final void a(l lVar, int i, int i2) {
        Graphics graphics = lVar.f151c;
        int color = graphics.getColor();
        graphics.setColor(h());
        graphics.fillRect(0, 0, i, i2);
        graphics.setColor(color);
    }
}
