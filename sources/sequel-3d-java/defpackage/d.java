package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: sequel-3d-java.jar:d.class */
public final class d {
    private static int[][] a = new int[4][];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f54a;
    private int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[] f55a = new int[13];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Vector f56a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Vector f57b;
    private Vector c;
    private Vector d;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int f58c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private int f59d;
    private int e;
    private int f;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[] f60b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int[] f61c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private c f62a;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static int[] f63d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Graphics f64a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image f65a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Graphics f66b;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static int[] f67e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static int[] f68f;
    private static int[] g;
    private static int[] h;
    private static int[] i;
    private static int[] j;
    private static int[] k;
    private int[] l;
    private int[] m;

    public d() {
        m27a();
    }

    private static void a(int i2, int i3, boolean z, int[][] iArr) {
        if (iArr[i2] == null || i3 > iArr[i2].length) {
            if (z) {
                i3 = (i3 * 120) / 100;
            }
            iArr[i2] = new int[i3];
        }
    }

    private int[] a(int[][] iArr) {
        return this.f55a[0] != -8355712 ? iArr[1] : iArr[0];
    }

    private void a(int i2, int i3, int i4) {
        int iA = p.a(i2);
        int iB = p.b(i2);
        int i5 = this.f54a;
        int i6 = this.b;
        int i7 = ((-i5) * i3) >> 10;
        int i8 = i7 + (((i5 << 1) * i3) >> 10);
        int i9 = ((-i6) * i4) >> 10;
        int i10 = i9 + (((i6 << 1) * i4) >> 10);
        this.f60b[0] = (i7 * iB) - (i9 * iA);
        this.f61c[0] = (i9 * iB) + (i7 * iA);
        this.f60b[1] = (i8 * iB) - (i9 * iA);
        this.f61c[1] = (i9 * iB) + (i8 * iA);
        this.f60b[2] = (i8 * iB) - (i10 * iA);
        this.f61c[2] = (i10 * iB) + (i8 * iA);
        this.f60b[3] = (i7 * iB) - (i10 * iA);
        this.f61c[3] = (i10 * iB) + (i7 * iA);
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = 4;
        while (true) {
            i15--;
            if (i15 < 0) {
                break;
            }
            if (this.f60b[i15] > i12) {
                i12 = this.f60b[i15];
            }
            if (this.f60b[i15] < i11) {
                i11 = this.f60b[i15];
            }
            if (this.f61c[i15] > i14) {
                i14 = this.f61c[i15];
            }
            if (this.f61c[i15] < i13) {
                i13 = this.f61c[i15];
            }
        }
        int i16 = i11 >> 16;
        int i17 = i13 >> 16;
        int i18 = (i14 >> 16) + 1;
        this.f58c = ((i12 >> 16) + 1) - i16;
        if (this.f58c == 0) {
            this.f58c = 1;
        }
        this.f59d = i18 - i17;
        if (this.f59d == 0) {
            this.f59d = 1;
        }
        this.e = i16;
        this.f = i17;
    }

    public final int a() {
        return this.f55a[10];
    }

    public final int b() {
        return this.f55a[11];
    }

    /* JADX WARN: Code duplicated, block: B:349:0x0b1c A[PHI: r47
      0x0b1c: PHI (r47v10 int) = (r47v5 int), (r47v11 int) binds: [B:345:0x0b08, B:347:0x0b12] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:351:0x0b23  */
    /* JADX WARN: Code duplicated, block: B:479:0x0b2d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x0b34 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0b34 A[SYNTHETIC] */
    public final void a(c cVar, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (!((this.f55a[0] == -8355712 && this.f55a[3] == 1024 && this.f55a[4] == 1024 && this.f55a[2] == 0 && this.f55a[9] == 0 && this.f55a[10] <= 1 && this.f55a[11] <= 1) ? false : true)) {
            Image image = cVar.a;
            int i9 = i2 + this.f55a[7];
            int i10 = i3 + this.f55a[8];
            boolean zA = cVar.a();
            if (i4 != 0) {
                int i11 = (i4 & 1) != 0 ? 2 : 0;
                if ((i4 & 2) != 0) {
                    i11 |= 1;
                }
                if ((i4 & 4) != 0) {
                    i11 |= 5;
                } else if ((i4 & 8) != 0) {
                    i11 = 3;
                } else if ((i4 & 16) != 0) {
                    i11 |= 6;
                }
                if (zA) {
                    this.f66b.drawRegion(image, 0, 0, cVar.f53a, cVar.b, i11, i9, i10, 20);
                    return;
                } else {
                    this.f66b.drawRegion(image, 0, 0, cVar.b(), cVar.m25a(), i11, i9, i10, 20);
                    return;
                }
            }
            int clipX = 0;
            int clipY = 0;
            int clipWidth = 0;
            int clipHeight = 0;
            if (zA) {
                clipX = this.f66b.getClipX();
                clipY = this.f66b.getClipY();
                clipWidth = this.f66b.getClipWidth();
                clipHeight = this.f66b.getClipHeight();
                if ((i4 & 4) == 0 && (i4 & 16) == 0) {
                    i7 = cVar.f53a;
                    i8 = cVar.b;
                } else {
                    i7 = cVar.b;
                    i8 = cVar.f53a;
                }
                if (i9 + i7 <= clipX || i10 + i8 <= clipY || i9 >= clipX + clipWidth || i10 >= clipY + clipHeight) {
                    return;
                } else {
                    this.f66b.clipRect(i9, i10, i7, i8);
                }
            }
            if (i4 == 0) {
                if (zA) {
                    i9 = i9;
                }
                this.f66b.drawImage(image, i9, i10, 20);
            }
            if (zA) {
                this.f66b.setClip(clipX, clipY, clipWidth, clipHeight);
                return;
            }
            return;
        }
        boolean z = true;
        int[] iArr = cVar.f51a;
        if (iArr != null) {
            boolean z2 = false;
            int i12 = 13;
            while (true) {
                i12--;
                if (i12 < 0) {
                    break;
                }
                if (i12 != 12 && iArr[i12] != this.f55a[i12]) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                z = false;
            }
        }
        int[][] iArr2 = cVar.f52a;
        int[][] iArr3 = iArr2;
        if (iArr2 == null) {
            iArr3 = new int[5][];
            cVar.f52a = iArr3;
        }
        this.f54a = cVar.b();
        this.b = cVar.m25a();
        if (iArr == null || iArr[5] != 0 || i4 != iArr[6]) {
            int i13 = this.f54a * this.b;
            int[][] iArr4 = cVar.f52a;
            a(0, i13, false, iArr4);
            cVar.a(iArr4[0], 0, this.f54a, 0, 0, this.f54a, this.b);
            if (cVar.a.isMutable()) {
                int[] iArr5 = iArr4[0];
                int i14 = this.f54a;
                int i15 = this.b;
                int iO = o();
                int i16 = i14 * i15;
                while (true) {
                    i16--;
                    if (i16 < 0) {
                        break;
                    } else if (iArr5[i16] == iO) {
                        iArr5[i16] = 0;
                    }
                }
            }
            int[] iArr6 = iArr4[0];
            int i17 = this.f54a;
            int i18 = this.b;
            if (i4 != 0) {
                if ((i4 & 3) == 3) {
                    int i19 = 0;
                    int i20 = i17 * i18;
                    int i21 = i20 >> 1;
                    int i22 = i20 - 1;
                    while (i22 >= i21) {
                        int i23 = iArr6[i22];
                        int i24 = i22;
                        i22 = i24 - 1;
                        iArr6[i24] = iArr6[i19];
                        int i25 = i19;
                        i19++;
                        iArr6[i25] = i23;
                    }
                } else if ((i4 & 1) != 0) {
                    int i26 = i17 >> 1;
                    int i27 = 0;
                    int i28 = i18;
                    while (true) {
                        i28--;
                        if (i28 < 0) {
                            break;
                        }
                        int i29 = (i27 + i17) - 1;
                        int i30 = i27 + i26;
                        while (i27 < i30) {
                            int i31 = iArr6[i27];
                            int i32 = i27;
                            i27++;
                            iArr6[i32] = iArr6[i29];
                            int i33 = i29;
                            i29 = i33 - 1;
                            iArr6[i33] = i31;
                        }
                        i27 += i17 - i26;
                    }
                } else if ((i4 & 2) != 0) {
                    int i34 = (i18 - 1) * i17;
                    int i35 = (i18 >> 1) * i17;
                    int i36 = i17;
                    while (true) {
                        i36--;
                        if (i36 < 0) {
                            break;
                        }
                        int i37 = i36;
                        int i38 = i34 + i36;
                        int i39 = i37 + i35;
                        while (i37 < i39) {
                            int i40 = iArr6[i37];
                            iArr6[i37] = iArr6[i38];
                            iArr6[i38] = i40;
                            i37 += i17;
                            i38 -= i17;
                        }
                    }
                }
                if ((i4 & 8) != 0) {
                    int i41 = 0;
                    int i42 = i17 * i18;
                    int i43 = i42 >> 1;
                    int i44 = i42 - 1;
                    while (i44 >= i43) {
                        int i45 = iArr6[i44];
                        int i46 = i44;
                        i44 = i46 - 1;
                        iArr6[i46] = iArr6[i41];
                        int i47 = i41;
                        i41++;
                        iArr6[i47] = i45;
                    }
                } else if ((i4 & 4) != 0 || (i4 & 16) != 0) {
                    a(0, i17 * i18, true, a);
                    int[] iArr7 = a[0];
                    int i48 = i17 * i18;
                    while (true) {
                        i48--;
                        if (i48 < 0) {
                            break;
                        } else {
                            iArr7[i48] = iArr6[i48];
                        }
                    }
                    int i49 = 0;
                    if ((i4 & 4) == 0) {
                        int i50 = i17;
                        while (true) {
                            i50--;
                            if (i50 < 0) {
                                break;
                            }
                            int i51 = i50;
                            int i52 = i18;
                            while (true) {
                                i52--;
                                if (i52 >= 0) {
                                    int i53 = i49;
                                    i49++;
                                    iArr6[i53] = iArr7[i51];
                                    i51 += i17;
                                }
                            }
                        }
                    } else {
                        for (int i54 = 0; i54 < i17; i54++) {
                            int i55 = ((i18 - 1) * i17) + i54;
                            int i56 = i18;
                            while (true) {
                                i56--;
                                if (i56 >= 0) {
                                    int i57 = i49;
                                    i49++;
                                    iArr6[i57] = iArr7[i55];
                                    i55 -= i17;
                                }
                            }
                        }
                    }
                }
            }
            z = true;
        }
        if ((i4 & 4) != 0 || (i4 & 16) != 0) {
            int i58 = this.f54a;
            this.f54a = this.b;
            this.b = i58;
        }
        int i59 = this.f54a;
        int i60 = this.f55a[3];
        int i61 = this.f55a[4];
        int i62 = (i59 * i60) >> 10;
        if (i62 < 1) {
            return;
        }
        int i63 = this.b;
        int i64 = i63;
        int i65 = (i63 * i61) >> 10;
        if (i65 < 1) {
            return;
        }
        int i66 = this.f55a[2];
        int i67 = this.f55a[0];
        if (z || iArr == null || i67 != iArr[0]) {
            if (i67 != -8355712) {
                int[][] iArr8 = cVar.f52a;
                int[] iArr9 = iArr8[0];
                a(1, this.f54a * this.b, false, iArr8);
                int[] iArr10 = iArr8[1];
                int i68 = i67 & (-16777216);
                int i69 = ((i67 & 16711680) - 8388608) << 1;
                int i70 = i69;
                if (i69 == 16646144) {
                    i70 = 16711680;
                }
                int i71 = ((i67 & 65280) - 32768) << 1;
                int i72 = i71;
                if (i71 == 65024) {
                    i72 = 65280;
                }
                int i73 = ((i67 & 255) - 128) << 1;
                int i74 = i73;
                if (i73 == 254) {
                    i74 = 255;
                }
                if (!cVar.a.isMutable()) {
                    if (i68 != 255) {
                        int i75 = i68 >>> 8;
                        if (i70 == 0 && i72 == 0 && i74 == 0) {
                            int i76 = this.f54a * this.b;
                            while (true) {
                                i76--;
                                if (i76 < 0) {
                                    break;
                                }
                                int i77 = iArr9[i76];
                                iArr10[i76] = (((i77 >>> 24) * i75) & (-16777216)) | (i77 & 16777215);
                            }
                        } else {
                            int i78 = this.f54a * this.b;
                            while (true) {
                                i78--;
                                if (i78 < 0) {
                                    break;
                                }
                                int i79 = iArr9[i78];
                                int i80 = (i79 & 16711680) + i70;
                                int i81 = i80;
                                if (i80 > 16711680) {
                                    i81 = 16711680;
                                } else if (i81 < 0) {
                                    i81 = 0;
                                }
                                int i82 = (i79 & 65280) + i72;
                                int i83 = i82;
                                if (i82 > 65280) {
                                    i83 = 65280;
                                } else if (i83 < 0) {
                                    i83 = 0;
                                }
                                int i84 = (i79 & 255) + i74;
                                int i85 = i84;
                                if (i84 > 255) {
                                    i85 = 255;
                                } else if (i85 < 0) {
                                    i85 = 0;
                                }
                                iArr10[i78] = (((i79 >>> 24) * i75) & (-16777216)) | i81 | i83 | i85;
                            }
                        }
                    } else {
                        int i86 = this.f54a * this.b;
                        while (true) {
                            i86--;
                            if (i86 < 0) {
                                break;
                            }
                            int i87 = iArr9[i86];
                            int i88 = (i87 & 16711680) + i70;
                            int i89 = i88;
                            if (i88 > 16711680) {
                                i89 = 16711680;
                            } else if (i89 < 0) {
                                i89 = 0;
                            }
                            int i90 = (i87 & 65280) + i72;
                            int i91 = i90;
                            if (i90 > 65280) {
                                i91 = 65280;
                            } else if (i91 < 0) {
                                i91 = 0;
                            }
                            int i92 = (i87 & 255) + i74;
                            int i93 = i92;
                            if (i92 > 255) {
                                i93 = 255;
                            } else if (i93 < 0) {
                                i93 = 0;
                            }
                            iArr10[i86] = (i87 & (-16777216)) | i89 | i91 | i93;
                        }
                    }
                } else if (i70 == 0 && i72 == 0 && i74 == 0) {
                    int i94 = this.f54a * this.b;
                    while (true) {
                        i94--;
                        if (i94 < 0) {
                            break;
                        }
                        int i95 = iArr9[i94];
                        if ((i95 & (-16777216)) == 0) {
                            iArr10[i94] = 0;
                        } else {
                            iArr10[i94] = i68 | (i95 & 16777215);
                        }
                    }
                } else {
                    int i96 = this.f54a * this.b;
                    while (true) {
                        i96--;
                        if (i96 < 0) {
                            break;
                        }
                        int i97 = iArr9[i96];
                        if ((i97 & (-16777216)) == 0) {
                            iArr10[i96] = 0;
                        } else {
                            int i98 = (i97 & 16711680) + i70;
                            int i99 = i98;
                            if (i98 > 16711680) {
                                i99 = 16711680;
                            } else if (i99 < 0) {
                                i99 = 0;
                            }
                            int i100 = (i97 & 65280) + i72;
                            int i101 = i100;
                            if (i100 > 65280) {
                                i101 = 65280;
                            } else if (i101 < 0) {
                                i101 = 0;
                            }
                            int i102 = (i97 & 255) + i74;
                            int i103 = i102;
                            if (i102 > 255) {
                                i103 = 255;
                            } else if (i103 < 0) {
                                i103 = 0;
                            }
                            iArr10[i96] = i68 | i99 | i101 | i103;
                        }
                    }
                }
            }
            z = true;
        }
        int[] iArrA = a(iArr3);
        if (iArr == null || i66 != iArr[2] || i60 != iArr[3] || i61 != iArr[4]) {
            z = true;
        }
        if (i66 != 0) {
            if (z) {
                int[][] iArr11 = iArr3;
                if (this.f61c == null) {
                    this.f60b = new int[4];
                    this.f61c = new int[4];
                }
                int[] iArrA2 = a(iArr11);
                int i104 = this.f54a;
                int i105 = this.b;
                a(i66, i60, i61);
                a(2, this.f58c * this.f59d, true, iArr11);
                int[] iArr12 = iArr11[2];
                int i106 = this.f58c;
                int iA = p.a(-i66);
                int iB = p.b(-i66);
                int i107 = (iA << 10) / i60;
                int i108 = (iA << 10) / i61;
                int i109 = (iB << 10) / i60;
                int i110 = (iB << 10) / i61;
                int i111 = ((this.e * i109) - (this.f * i107)) + (i104 << 14);
                int i112 = (this.f * i110) + (this.e * i108) + (i105 << 14);
                boolean zM30a = m30a(1);
                int i113 = zM30a ? -32768 : 0;
                int i114 = 0;
                int i115 = this.f59d;
                while (true) {
                    i115--;
                    if (i115 < 0) {
                        break;
                    }
                    int i116 = i111;
                    int i117 = i112;
                    i111 -= i107;
                    i112 += i110;
                    int i118 = 0;
                    int i119 = 0;
                    for (int i120 = 0; i120 < 2; i120++) {
                        int i121 = 0;
                        int i122 = 0;
                        int i123 = i116;
                        int i124 = i109;
                        int i125 = i104;
                        if (i120 == 1) {
                            i123 = i117;
                            i124 = i108;
                            i125 = i105;
                        }
                        int i126 = i125 << 15;
                        if (i123 < i113) {
                            i121 = i106;
                            if (i124 > 0) {
                                i121 = (-(i123 - i113)) / i124;
                                if (i123 + (i121 * i124) < i113) {
                                    i121++;
                                }
                            }
                        } else if (i123 >= i126) {
                            i121 = i106;
                            if (i124 < 0) {
                                i121 = (i123 - i126) / (-i124);
                                if (i123 + (i121 * i124) >= i126) {
                                    i121++;
                                }
                            }
                        }
                        int i127 = i123 + ((i106 * i124) - i124);
                        if (i127 < i113) {
                            i122 = i106;
                            if (i124 < 0) {
                                i122 = (i127 - i113) / i124;
                                if (i127 - (i122 * i124) < i113) {
                                    i122++;
                                }
                            }
                        } else if (i127 >= i126) {
                            i122 = i106;
                            if (i124 > 0) {
                                i122 = (i127 - i126) / i124;
                                if (i127 - (i122 * i124) >= i126) {
                                    i122++;
                                }
                            }
                        }
                        if (i122 > i119) {
                            int i128 = i122;
                            i119 = i128;
                            if (i128 >= i106) {
                                i119 = i106;
                                break;
                            }
                            if (i121 > i118) {
                                i6 = i121;
                                i118 = i6;
                                if (i6 >= i106) {
                                    i118 = i106;
                                    break;
                                }
                            }
                        } else {
                            if (i121 > i118) {
                                i6 = i121;
                                i118 = i6;
                                if (i6 >= i106) {
                                    i118 = i106;
                                    break;
                                }
                            }
                        }
                    }
                    if (i118 + i119 >= i106) {
                        i118 = 0;
                        i119 = i106;
                    } else if (i118 != 0) {
                        i116 += i118 * i109;
                        i117 += i118 * i108;
                    }
                    int i129 = i114 + i106;
                    int i130 = i118 + i114;
                    int i131 = i129 - i119;
                    while (i114 < i130) {
                        int i132 = i114;
                        i114++;
                        iArr12[i132] = 0;
                    }
                    if (zM30a) {
                        while (i114 < i131) {
                            int i133 = i114;
                            i114++;
                            iArr12[i133] = m29a(iArrA2, i116 >> 7, i117 >> 7, i104, i105);
                            i116 += i109;
                            i117 += i108;
                        }
                    } else {
                        while (i114 < i131) {
                            int i134 = i114;
                            i114++;
                            iArr12[i134] = iArrA2[(i116 >> 15) + ((i117 >> 15) * i104)];
                            i116 += i109;
                            i117 += i108;
                        }
                    }
                    while (i114 < i129) {
                        int i135 = i114;
                        i114++;
                        iArr12[i135] = 0;
                    }
                }
            } else {
                a(i66, i60, i61);
            }
            int iA2 = p.a(i66);
            int iB2 = p.b(i66);
            int i136 = ((((-i2) << 1) - this.f54a) * i60) >> 10;
            int i137 = ((((-i3) << 1) - this.b) * i61) >> 10;
            i59 = this.f58c;
            i64 = this.f59d;
            i2 = -((((i136 * iB2) - (i137 * iA2)) + (i59 << 15)) >> 16);
            i3 = -((((i137 * iB2) + (i136 * iA2)) + (i64 << 15)) >> 16);
            iArrA = iArr3[2];
        } else if (i60 != 1024 || i61 != 1024) {
            a(2, i62 * i65, true, iArr3);
            int[] iArr13 = iArr3[2];
            if (z) {
                int i138 = (i59 << 10) / i62;
                int i139 = (i64 << 10) / i65;
                int i140 = 0;
                int i141 = 0;
                if (!m30a(1)) {
                    int i142 = i65;
                    while (true) {
                        i142--;
                        if (i142 < 0) {
                            break;
                        }
                        int i143 = ((i140 >> 10) * i59) << 10;
                        int i144 = i62;
                        while (true) {
                            i144--;
                            if (i144 >= 0) {
                                int i145 = i141;
                                i141++;
                                iArr13[i145] = iArrA[i143 >> 10];
                                i143 += i138;
                                if (i144 > 8) {
                                    int i146 = i141 + 1;
                                    iArr13[i141] = iArrA[i143 >> 10];
                                    int i147 = i143 + i138;
                                    int i148 = i146 + 1;
                                    iArr13[i146] = iArrA[i147 >> 10];
                                    int i149 = i147 + i138;
                                    int i150 = i148 + 1;
                                    iArr13[i148] = iArrA[i149 >> 10];
                                    int i151 = i149 + i138;
                                    int i152 = i150 + 1;
                                    iArr13[i150] = iArrA[i151 >> 10];
                                    int i153 = i151 + i138;
                                    int i154 = i152 + 1;
                                    iArr13[i152] = iArrA[i153 >> 10];
                                    int i155 = i153 + i138;
                                    int i156 = i154 + 1;
                                    iArr13[i154] = iArrA[i155 >> 10];
                                    int i157 = i155 + i138;
                                    int i158 = i156 + 1;
                                    iArr13[i156] = iArrA[i157 >> 10];
                                    int i159 = i157 + i138;
                                    i141 = i158 + 1;
                                    iArr13[i158] = iArrA[i159 >> 10];
                                    i143 = i159 + i138;
                                    i144 -= 8;
                                }
                            }
                        }
                        i140 += i139;
                    }
                } else {
                    int i160 = i65;
                    while (true) {
                        i160--;
                        if (i160 < 0) {
                            break;
                        }
                        int i161 = 0;
                        int i162 = i140 >> 2;
                        int i163 = i62;
                        while (true) {
                            i163--;
                            if (i163 >= 0) {
                                int i164 = i141;
                                i141++;
                                iArr13[i164] = m29a(iArrA, i161 >> 2, i162, i59, i64);
                                i161 += i138;
                            }
                        }
                        i140 += i139;
                    }
                }
            }
            iArrA = iArr13;
            i59 = i62;
            i64 = i65;
            i2 = (i2 * i60) >> 10;
            i3 = (i3 * i61) >> 10;
        }
        if (this.f55a[10] > 1 || this.f55a[11] > 1) {
            if (z) {
                int[] iArr14 = iArrA;
                int i165 = i59;
                int i166 = i64;
                int i167 = this.f55a[10];
                int[][] iArr15 = iArr3;
                int i168 = this.f55a[11];
                int i169 = i167;
                if (i169 < 1) {
                    i169 = 1;
                }
                if (i168 < 1) {
                    i168 = 1;
                }
                int i170 = i165 * i166;
                a(3, i170, true, iArr15);
                a(4, i170, true, iArr15);
                int[] iArr16 = iArr15[3];
                int[] iArr17 = iArr15[4];
                int i171 = 65536 / (((i169 << 1) + 1) * ((i168 << 1) + 1));
                int i172 = i170;
                while (true) {
                    i172--;
                    if (i172 < 0) {
                        break;
                    } else {
                        iArr16[i172] = 0;
                    }
                }
                for (int i173 = 0; i173 <= 24; i173 += 8) {
                    int i174 = i173;
                    iArr17[0] = (iArr14[0] >>> i174) & 255;
                    int i175 = 1;
                    int i176 = (i165 + 1) - 1;
                    while (i175 < i176) {
                        iArr17[i175] = ((iArr14[i175] >>> i174) & 255) + iArr17[i175 - 1];
                        i175++;
                    }
                    int i177 = i166;
                    while (true) {
                        i177--;
                        if (i177 < 1) {
                            break;
                        }
                        int i178 = i175;
                        i175++;
                        iArr17[i178] = ((iArr14[i175] >>> i174) & 255) + iArr17[i175 - i165];
                        int i179 = (i175 + i165) - 1;
                        while (i175 < i179) {
                            iArr17[i175] = ((((iArr14[i175] >>> i174) & 255) + iArr17[i175 - 1]) - iArr17[(i175 - i165) - 1]) + iArr17[i175 - i165];
                            i175++;
                        }
                    }
                    int i180 = 0;
                    for (int i181 = 0; i181 < i166; i181++) {
                        int i182 = i181 - i168;
                        int i183 = i182;
                        if (i182 < 0) {
                            i183 = 0;
                        }
                        int i184 = i181 + i168;
                        int i185 = i184;
                        if (i184 >= i166) {
                            i185 = i166 - 1;
                        }
                        int i186 = i183 * i165;
                        int i187 = i185 * i165;
                        for (int i188 = 0; i188 < i165; i188++) {
                            int i189 = i188 - i169;
                            int i190 = i189;
                            if (i189 < 0) {
                                i190 = 0;
                            }
                            int i191 = i188 + i169;
                            int i192 = i191;
                            if (i191 >= i165) {
                                i192 = i165 - 1;
                            }
                            int i193 = i180;
                            i180++;
                            iArr16[i193] = iArr16[i193] | ((((((iArr17[i192 + i187] + iArr17[i190 + i186]) - iArr17[i190 + i187]) - iArr17[i192 + i186]) * i171) >> 16) << i173);
                        }
                    }
                }
                iArrA = iArr16;
            } else {
                iArrA = iArr3[3];
            }
        }
        a(iArrA, this.f55a[7] + i2, this.f55a[8] + i3, i59, i64);
        this.f55a[5] = 0;
        this.f55a[6] = i4;
        int[] iArr18 = this.f55a;
        if (iArr18 == null) {
            cVar.f51a = null;
            return;
        }
        int length = iArr18.length;
        if (cVar.f51a == null) {
            cVar.f51a = new int[length];
        }
        int i194 = length;
        while (true) {
            i194--;
            if (i194 < 0) {
                return;
            } else {
                cVar.f51a[i194] = iArr18[i194];
            }
        }
    }

    private void a(int[] iArr, int i2, int i3, int i4, int i5) {
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        int clipX = this.f66b.getClipX();
        int i6 = clipX;
        int clipWidth = clipX + this.f66b.getClipWidth();
        if (clipWidth <= 0) {
            return;
        }
        int clipY = this.f66b.getClipY();
        int i7 = clipY;
        int clipHeight = clipY + this.f66b.getClipHeight();
        if (clipHeight <= 0) {
            return;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i2 >= clipWidth || i3 >= clipHeight || i2 + i4 <= i6 || i3 + i5 <= i7) {
            return;
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = i4;
        int i11 = i5;
        if (i2 + i4 > clipWidth) {
            i10 -= (i2 + i4) - clipWidth;
        }
        if (i2 < i6) {
            i8 = 0 - (i2 - i6);
            i10 += i2 - i6;
            i2 = i6;
        }
        if (i3 + i5 > clipHeight) {
            i11 -= (i3 + i5) - clipHeight;
        }
        if (i3 < i7) {
            i9 = 0 - (i3 - i7);
            i11 += i3 - i7;
            i3 = i7;
        }
        int i12 = this.f55a[9];
        if (i12 == 0) {
            this.f66b.drawRGB(iArr, (i9 * i4) + i8, i4, i2, i3, i10, i11, true);
            return;
        }
        if (this.f62a == null) {
            return;
        }
        a(2, i4 * i5, true, a);
        int[] iArr2 = a[2];
        this.f62a.a(iArr2, (i9 * i4) + i8, i4, i2, i3, i10, i11);
        if (i12 != 1) {
            int i13 = i4 * i5;
            while (true) {
                i13--;
                if (i13 < 0) {
                    break;
                }
                int i14 = iArr2[i13];
                int i15 = iArr[i13];
                int i16 = i15 >>> 24;
                int i17 = ((i15 & 16711935) * i16) >> 8;
                int i18 = (i14 & 16711680) - (i17 & 16711680);
                int i19 = i18;
                if (i18 < 0) {
                    i19 = 0;
                }
                int i20 = (i14 & 65280) - ((((i15 & 65280) * i16) >> 8) & 65280);
                int i21 = i20;
                if (i20 < 0) {
                    i21 = 0;
                }
                int i22 = (i14 & 255) - (i17 & 255);
                int i23 = i22;
                if (i22 < 0) {
                    i23 = 0;
                }
                iArr2[i13] = i19 | i21 | i23;
            }
        } else {
            int i24 = i4 * i5;
            while (true) {
                i24--;
                if (i24 < 0) {
                    break;
                }
                int i25 = iArr2[i24];
                int i26 = iArr[i24];
                int i27 = i26 >>> 24;
                int i28 = ((i26 & 16711935) * i27) >> 8;
                int i29 = (i25 & 16711680) + (i28 & 16711680);
                int i30 = i29;
                if (i29 > 16711680) {
                    i30 = 16711680;
                }
                int i31 = (i25 & 65280) + ((((i26 & 65280) * i27) >> 8) & 65280);
                int i32 = i31;
                if (i31 > 65280) {
                    i32 = 65280;
                }
                int i33 = (i25 & 255) + (i28 & 255);
                int i34 = i33;
                if (i33 > 255) {
                    i34 = 255;
                }
                iArr2[i24] = i30 | i32 | i34;
            }
        }
        this.f66b.drawRGB(iArr2, (i9 * i4) + i8, i4, i2, i3, i10, i11, false);
    }

    public final int c() {
        return this.f55a[2];
    }

    public final int d() {
        return this.f55a[0];
    }

    public final int e() {
        return this.f55a[3];
    }

    public final int f() {
        return this.f55a[4];
    }

    public final int g() {
        return this.f55a[9];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m27a() {
        this.f55a[0] = -8355712;
        this.f55a[2] = 0;
        this.f55a[3] = 1024;
        this.f55a[4] = 1024;
        this.f55a[9] = 0;
        this.f55a[10] = 0;
        this.f55a[11] = 0;
        this.f55a[1] = 0;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        int i6 = this.f55a[3];
        int i7 = this.f55a[4];
        this.f66b.drawRect(((i2 * i6) >> 10) + this.f55a[7], ((i3 * i7) >> 10) + this.f55a[8], (i4 * i6) >> 10, (i5 * i7) >> 10);
    }

    public final void b(int i2, int i3, int i4, int i5) {
        int i6 = this.f55a[12];
        int i7 = i6 >>> 24;
        if (i7 == 0) {
            return;
        }
        if (this.f55a[2] != 0) {
            a(0, 8, false, a);
            int[] iArr = a[0];
            iArr[0] = i2;
            iArr[1] = i3;
            iArr[2] = (i2 + i4) - 1;
            iArr[3] = i3;
            iArr[4] = iArr[2];
            iArr[5] = (i3 + i5) - 1;
            iArr[6] = i2;
            iArr[7] = iArr[5];
            int i8 = this.f55a[3];
            int i9 = this.f55a[4];
            int i10 = this.f55a[7];
            int i11 = this.f55a[8];
            if (this.l == null || this.l.length < 4) {
                this.l = new int[4];
                this.m = new int[4];
            }
            int i12 = this.f55a[2];
            int iA = p.a(i12);
            int iB = p.b(i12);
            int i13 = 0;
            for (int i14 = 0; i14 < 4; i14++) {
                int i15 = i13;
                int i16 = i13 + 1;
                int i17 = (iArr[i15] * i8) >> 10;
                i13 = i16 + 1;
                int i18 = (iArr[i16] * i9) >> 10;
                this.l[i14] = (((i17 * iB) - (i18 * iA)) >> 15) + i10;
                this.m[i14] = (((i18 * iB) + (i17 * iA)) >> 15) + i11;
            }
            boolean zM30a = m30a(2);
            if (f67e == null || 4 > f67e.length) {
                f67e = new int[4];
                f68f = new int[4];
                g = new int[4];
                h = new int[4];
                i = new int[4];
                k = new int[4];
            }
            if (zM30a && (j == null || 4 > j.length)) {
                j = new int[4];
            }
            int i19 = Integer.MAX_VALUE;
            int i20 = Integer.MAX_VALUE;
            int i21 = Integer.MIN_VALUE;
            int i22 = Integer.MIN_VALUE;
            int i23 = 0;
            int i24 = 0;
            int i25 = zM30a ? this.f55a[12] | (-16777216) : 0;
            int[] iArr2 = null;
            if (zM30a) {
                for (int i26 = 0; i26 < 4; i26++) {
                    int i27 = this.l[i26];
                    if (i27 > i21) {
                        i21 = i27;
                    }
                    if (i27 < i19) {
                        i19 = i27;
                    }
                    int i28 = this.m[i26];
                    if (i28 > i22) {
                        i22 = i28;
                    }
                    if (i28 < i20) {
                        i20 = i28;
                    }
                }
                i24 = (i22 - i20) + 1;
                int i29 = (i21 - i19) + 1;
                i23 = i29;
                a(0, i29 * i24, true, a);
                iArr2 = a[0];
            }
            for (int i30 = 0; i30 < 4; i30++) {
                if (zM30a) {
                    h[i30] = (this.l[i30] - i19) << 16;
                    f68f[i30] = this.m[i30] - i20;
                } else {
                    h[i30] = this.l[i30] << 16;
                    f68f[i30] = this.m[i30];
                }
            }
            for (int i31 = 0; i31 < 4; i31++) {
                int i32 = i31 + 1;
                int i33 = i32;
                if (i32 == 4) {
                    i33 = 0;
                }
                g[i31] = f68f[i33];
                i[i31] = h[i33];
            }
            int i34 = 0;
            for (int i35 = 0; i35 < 4; i35++) {
                int i36 = g[i35] - f68f[i35];
                int i37 = i36;
                if (i36 != 0) {
                    if (i37 < 0) {
                        int i38 = f68f[i35];
                        f68f[i35] = g[i35];
                        g[i35] = i38;
                        int i39 = h[i35];
                        h[i35] = i[i35];
                        i[i35] = i39;
                        i37 = -i37;
                    }
                    int[] iArr3 = i;
                    int i40 = i35;
                    iArr3[i40] = iArr3[i40] - h[i35];
                    int[] iArr4 = i;
                    int i41 = i35;
                    iArr4[i41] = iArr4[i41] / i37;
                }
                int i42 = f68f[i35];
                int i43 = g[i35];
                boolean z = false;
                boolean z2 = false;
                int i44 = i34;
                while (true) {
                    i44--;
                    if (i44 < 0) {
                        break;
                    }
                    if (k[i44] == i42) {
                        z = true;
                    }
                    if (k[i44] == i43) {
                        z2 = true;
                    }
                }
                if (!z) {
                    int i45 = i34;
                    i34++;
                    k[i45] = i42;
                }
                if (!z2) {
                    int i46 = i34;
                    i34++;
                    k[i46] = i43;
                }
            }
            for (int i47 = 0; i47 < i34; i47++) {
                for (int i48 = i47 + 1; i48 < i34; i48++) {
                    if (k[i47] > k[i48]) {
                        int i49 = k[i47];
                        k[i47] = k[i48];
                        k[i48] = i49;
                    }
                }
            }
            int i50 = k[0];
            int i51 = 1;
            int i52 = -1;
            do {
                int i53 = 0;
                int i54 = 4;
                while (true) {
                    i54--;
                    if (i54 < 0) {
                        break;
                    }
                    if (f68f[i54] <= i50 && g[i54] > i50) {
                        int i55 = i53;
                        i53++;
                        f67e[i55] = i54;
                    }
                }
                if (zM30a && i53 != i52) {
                    int i56 = i53;
                    while (true) {
                        i56--;
                        if (i56 < 0) {
                            break;
                        } else {
                            j[i56] = Integer.MAX_VALUE;
                        }
                    }
                    i52 = i53;
                }
                for (int i57 = 0; i57 < i53; i57++) {
                    for (int i58 = i57 + 1; i58 < i53; i58++) {
                        int i59 = f67e[i57];
                        int i60 = h[i59];
                        int i61 = f67e[i58];
                        int i62 = h[i61];
                        if (i60 > i62 || (i60 == i62 && i[i59] > i[i61])) {
                            f67e[i58] = i59;
                            f67e[i57] = i61;
                        }
                    }
                }
                int i63 = i51;
                i51++;
                int i64 = k[i63];
                if (i51 == i34) {
                    i64++;
                }
                while (i50 < i64) {
                    int i65 = Integer.MIN_VALUE;
                    if (zM30a) {
                        int i66 = i50 * i23;
                        int i67 = i66;
                        int i68 = i66 + i23;
                        while (i67 < i68) {
                            int i69 = i67;
                            i67++;
                            iArr2[i69] = 0;
                        }
                    }
                    int i70 = 0;
                    while (i70 < i53) {
                        int i71 = i70;
                        int i72 = i70 + 1;
                        int i73 = f67e[i71];
                        int i74 = h[i73];
                        i70 = i72 + 1;
                        int i75 = f67e[i72];
                        int i76 = h[i75];
                        int i77 = (i74 >> 16) + ((i74 & 65535) >> 15);
                        int i78 = (i76 >> 16) + ((i76 & 65535) >> 15) + 1;
                        if (i77 < i65) {
                            i77 = i65;
                        }
                        i65 = i78;
                        if (zM30a) {
                            int i79 = i70 - 2;
                            int i80 = i70 - 1;
                            int i81 = i78 - i77;
                            int i82 = (i50 * i23) + i77;
                            int i83 = i82;
                            int i84 = i82 + i81;
                            while (i83 < i84) {
                                int i85 = i83;
                                i83++;
                                iArr2[i85] = i25;
                            }
                            if (j[i79] != Integer.MAX_VALUE) {
                                int i86 = i77 - j[i79];
                                if (i86 < 0) {
                                    a(iArr2, ((i50 - 1) * i23) + i77, -i86, i25, true);
                                } else if (i86 > 0) {
                                    a(iArr2, (i50 * i23) + j[i79], i86, i25, true);
                                }
                            }
                            if (j[i80] != Integer.MAX_VALUE) {
                                int i87 = i78 - j[i80];
                                if (i87 < 0) {
                                    a(iArr2, (i50 * i23) + i78, -i87, i25, false);
                                } else if (i87 > 0) {
                                    a(iArr2, ((i50 - 1) * i23) + j[i80], i87, i25, false);
                                }
                            }
                            j[i79] = i77;
                            j[i80] = i78;
                        } else {
                            this.f66b.fillRect(i77, i50, i78 - i77, 1);
                        }
                        int[] iArr5 = h;
                        iArr5[i73] = iArr5[i73] + i[i73];
                        int[] iArr6 = h;
                        iArr6[i75] = iArr6[i75] + i[i75];
                    }
                    i50++;
                }
            } while (i51 < i34);
            if (zM30a) {
                a(iArr2, i19, i20, i23, i24);
                return;
            }
            return;
        }
        int i88 = this.f55a[3];
        int i89 = this.f55a[4];
        int i90 = ((i2 * i88) >> 10) + this.f55a[7];
        int i91 = ((i3 * i89) >> 10) + this.f55a[8];
        int i92 = (i4 * i88) >> 10;
        int i93 = (i5 * i89) >> 10;
        if (i7 == 255) {
            this.f66b.fillRect(i90, i91, i92, i93);
            return;
        }
        int i94 = i92 * i93;
        a(0, i94, true, a);
        int[] iArr7 = a[0];
        while (true) {
            i94--;
            if (i94 < 0) {
                a(iArr7, i90, i91, i92, i93);
                return;
            }
            iArr7[i94] = i6;
        }
    }

    public final void a(int i2) {
        this.f55a[12] = i2;
        this.f66b.setColor(i2);
    }

    public final void a(c cVar) {
        a(cVar.f50a);
        this.f62a = cVar;
        int[] iArr = cVar.f51a;
        if (iArr != null) {
            iArr[5] = iArr[5] + 1;
        }
    }

    public final void a(Graphics graphics) {
        this.f66b = graphics;
        this.f62a = null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final Graphics m28a() {
        return this.f66b;
    }

    private static int o() {
        if (f63d == null) {
            int i2 = (-65281) | (-16777216);
            if (f63d == null) {
                f63d = new int[1];
                Image imageCreateImage = Image.createImage(1, 1);
                f65a = imageCreateImage;
                f64a = imageCreateImage.getGraphics();
            }
            f64a.setColor(i2);
            f64a.fillRect(0, 0, 1, 1);
            f65a.getRGB(f63d, 0, 1, 0, 0, 1, 1);
        }
        return f63d[0];
    }

    public final void a(int i2, int i3) {
        this.f55a[7] = i2;
        this.f55a[8] = i3;
    }

    public final int h() {
        return this.f55a[7];
    }

    public final int i() {
        return this.f55a[8];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static int m29a(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i2 >> 8;
        int i11 = i3 >> 8;
        int i12 = (i11 * i4) + i10;
        if (i10 != -1 && i11 != -1) {
            i8 = iArr[i12];
            i9 = i10 < i4 - 1 ? iArr[i12 + 1] : i8 & 16777215;
            i7 = i9 & 16777215;
            i6 = i8 & 16777215;
            if (i11 < i5 - 1) {
                int i13 = i12 + i4;
                if (i10 < i4 - 1) {
                    i7 = iArr[i13 + 1];
                }
                i6 = iArr[i13];
            }
        } else if (i10 == -1) {
            int i14 = i12 + 1;
            if (i11 == -1) {
                int i15 = iArr[i14 + i4];
                i7 = i15;
                int i16 = i15 & 16777215;
                i6 = i16;
                i9 = i16;
                i8 = i16;
            } else {
                int i17 = iArr[i14];
                i9 = i17;
                int i18 = i17 & 16777215;
                i7 = i18;
                i8 = i18;
                if (i11 < i5 - 1) {
                    i7 = iArr[i14 + i4];
                }
                i6 = i7 & 16777215;
            }
        } else {
            int i19 = i12 + i4;
            int i20 = iArr[i19];
            i6 = i20;
            int i21 = i20 & 16777215;
            i7 = i21;
            i8 = i21;
            if (i10 < i4 - 1) {
                i7 = iArr[i19 + 1];
            }
            i9 = i7 & 16777215;
        }
        int i22 = i3 & 255;
        int i23 = i2 & 255;
        int i24 = i8 >>> 24;
        int i25 = i24 + ((((i6 >>> 24) - i24) * i22) >> 8);
        int i26 = i9 >>> 24;
        int i27 = (i25 + ((((i26 + ((((i7 >>> 24) - i26) * i22) >> 8)) - i25) * i23) >> 8)) << 24;
        int i28 = i8 & 16711935;
        int i29 = (i28 + ((((i6 & 16711935) - i28) * i22) >> 8)) & 16711935;
        int i30 = i9 & 16711935;
        int i31 = i27 | ((i29 + (((((i30 + ((((i7 & 16711935) - i30) * i22) >> 8)) & 16711935) - i29) * i23) >> 8)) & 16711935);
        int i32 = i8 & 65280;
        int i33 = i32 + ((((i6 & 65280) - i32) * i22) >> 8);
        int i34 = i9 & 65280;
        return i31 | ((i33 + ((((i34 + ((((i7 & 65280) - i34) * i22) >> 8)) - i33) * i23) >> 8)) & 65280);
    }

    public final void c(int i2, int i3, int i4, int i5) {
        int i6 = this.f55a[3];
        int i7 = this.f55a[4];
        int i8 = this.f55a[7];
        int i9 = this.f55a[8];
        if (i6 != 1024 || i7 != 1024) {
            i2 = (i2 * i6) >> 10;
            i4 = (i4 * i6) >> 10;
            i3 = (i3 * i7) >> 10;
            i5 = (i5 * i7) >> 10;
        }
        if (this.f55a[2] != 0) {
            int iB = p.b(this.f55a[2]);
            int iA = p.a(this.f55a[2]);
            int i10 = ((i2 * iB) - (i3 * iA)) >> 15;
            i3 = ((i3 * iB) + (i2 * iA)) >> 15;
            i2 = i10;
            int i11 = ((i4 * iB) - (i5 * iA)) >> 15;
            i5 = ((i5 * iB) + (i4 * iA)) >> 15;
            i4 = i11;
        }
        int i12 = i2 + i8;
        int i13 = i4 + i8;
        int i14 = i3 + i9;
        int i15 = i5 + i9;
        if (!m30a(2)) {
            this.f66b.drawLine(i12, i14, i13, i15);
            return;
        }
        int i16 = i12;
        int i17 = i14;
        int iAbs = Math.abs(i13 - i12) + 3;
        int iAbs2 = Math.abs(i15 - i14) + 3;
        a(3, iAbs * iAbs2, true, a);
        int[] iArr = a[3];
        int i18 = this.f55a[12];
        int i19 = i18 >>> 24;
        int i20 = i19;
        if (i19 == 255) {
            i20 = 256;
        }
        int i21 = i18 & 16777215;
        if (iAbs >= iAbs2) {
            int i22 = iAbs - 1;
            if (i13 < i12) {
                i12 = i13;
                i13 = i12;
                i14 = i15;
                i15 = i14;
                i16 = i12;
                i17 = i14;
            }
            int i23 = i13 - i12;
            int i24 = i23 != 0 ? ((i15 - i14) << 16) / i23 : 0;
            int i25 = i24 < 0 ? iAbs2 - 2 : 0;
            int i26 = i25 << 16;
            if (i24 <= 65535) {
                i26 += i24;
            }
            int i27 = i26;
            for (int i28 = 0; i28 <= i23; i28++) {
                int i29 = i28 + ((i26 >> 16) * i22);
                int i30 = i26 & 65535;
                iArr[i29] = ((((65535 - i30) * i20) >> 16) << 24) | i21;
                if (i30 != 0) {
                    iArr[i29 + i22] = (((i30 * i20) >> 16) << 24) | i21;
                }
                i26 += i24;
            }
            a(iArr, i16, i17 - i25, i22, iAbs2);
            int i31 = i27;
            for (int i32 = 0; i32 <= i23; i32++) {
                int i33 = i32 + ((i31 >> 16) * i22);
                iArr[i33] = 0;
                iArr[i33 + i22] = 0;
                i31 += i24;
            }
            return;
        }
        int i34 = iAbs2 - 1;
        if (i15 < i14) {
            i12 = i13;
            i13 = i12;
            i14 = i15;
            i15 = i14;
            i16 = i12;
            i17 = i14;
        }
        int i35 = i15 - i14;
        int i36 = i35 != 0 ? ((i13 - i12) << 16) / i35 : 0;
        int i37 = i36 < 0 ? iAbs - 2 : 0;
        int i38 = i37 << 16;
        if (i36 <= 65535) {
            i38 += i36;
        }
        int i39 = i35 * iAbs;
        int i40 = i38;
        for (int i41 = 0; i41 <= i39; i41 += iAbs) {
            int i42 = (i38 >> 16) + i41;
            int i43 = i38 & 65535;
            iArr[i42] = ((((65535 - i43) * i20) >> 16) << 24) | i21;
            if (i43 != 0) {
                iArr[i42 + 1] = (((i43 * i20) >> 16) << 24) | i21;
            }
            i38 += i36;
        }
        a(iArr, i16 - i37, i17, iAbs, i34);
        int i44 = i40;
        int i45 = 0;
        while (true) {
            int i46 = i45;
            if (i46 > i39) {
                return;
            }
            int i47 = (i44 >> 16) + i46;
            iArr[i47] = 0;
            iArr[i47 + 1] = 0;
            i44 += i36;
            i45 = i46 + iAbs;
        }
    }

    public final int j() {
        return this.f55a[1];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m30a(int i2) {
        return (this.f55a[1] & i2) == i2;
    }

    public final void b(int i2) {
        this.f55a[1] = i2;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void m31b() {
        int size = this.f56a.size() - 1;
        int[] iArr = (int[]) this.f56a.elementAt(size);
        this.f56a.removeElementAt(size);
        int i2 = 13;
        while (true) {
            i2--;
            if (i2 < 0) {
                this.d.addElement(iArr);
                a((Graphics) this.f57b.elementAt(size));
                this.f57b.removeElementAt(size);
                this.f62a = (c) this.c.elementAt(size);
                this.c.removeElementAt(size);
                a(this.f55a[12]);
                return;
            }
            this.f55a[i2] = iArr[i2];
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public final void m32c() {
        int[] iArr;
        if (this.f56a == null) {
            this.f56a = new Vector();
            this.d = new Vector();
            this.f57b = new Vector();
            this.c = new Vector();
        }
        this.f56a.addElement(this.f55a);
        this.f57b.addElement(this.f66b);
        this.c.addElement(this.f62a);
        if (this.d.size() > 0) {
            iArr = (int[]) this.d.elementAt(0);
            this.d.removeElementAt(0);
        } else {
            iArr = new int[13];
        }
        int i2 = 13;
        while (true) {
            i2--;
            if (i2 < 0) {
                this.f55a = iArr;
                return;
            }
            iArr[i2] = this.f55a[i2];
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m33a(c cVar) {
        int[] iArr = cVar.f51a;
        if (iArr == null) {
            return false;
        }
        int i2 = 13;
        while (true) {
            i2--;
            if (i2 < 0) {
                return true;
            }
            switch (i2) {
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    if (this.f55a[i2] != iArr[i2]) {
                        return false;
                    }
                    break;
            }
        }
    }

    public final int k() {
        return this.f66b.getClipHeight();
    }

    public final int l() {
        return this.f66b.getClipWidth();
    }

    public final int m() {
        return this.f66b.getClipX();
    }

    public final int n() {
        return this.f66b.getClipY();
    }

    private static void a(int[] iArr, int i2, int i3, int i4, boolean z) {
        int i5 = i4 & 16777215;
        if (i3 == 1) {
            iArr[i2] = iArr[i2] | Integer.MIN_VALUE | i5;
            return;
        }
        int i6 = 65535 / (i3 + 1);
        int i7 = 0;
        if (!z) {
            i7 = 65535;
            i6 = -i6;
        }
        int i8 = i7 + i6;
        int i9 = i3 + i2;
        while (i2 < i9) {
            int i10 = i2;
            i2++;
            iArr[i10] = iArr[i10] | ((i8 >> 8) << 24) | i5;
            i8 += i6;
        }
    }

    public static void a(c cVar, int i2, int i3) {
        Graphics graphics = cVar.f50a;
        int color = graphics.getColor();
        graphics.setColor(o());
        graphics.fillRect(0, 0, i2, i3);
        graphics.setColor(color);
    }
}
