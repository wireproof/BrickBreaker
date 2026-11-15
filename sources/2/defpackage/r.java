package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:r.class */
public final class r {
    private DCWall2 a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private k f158a;
    private ay o;
    private ay p;
    private ay q;
    private boolean L;
    private e c;
    private int cK;
    private boolean M;
    private int cL;
    private boolean N;
    private boolean O;
    private int cM;
    private int cN;
    private static final int[] aa = {54, 54, 56, 52, 56, 54, 50, 54};
    private boolean m;
    private int[] ab;
    private int cO;
    private e d;
    private int cP;
    private boolean P;
    private boolean Q;
    private boolean R;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ao f161a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ap f162a;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private ax n;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private ax f163o;

    /* JADX INFO: renamed from: p, reason: collision with other field name */
    private ax f164p;
    private ax g;
    private boolean W;

    /* JADX INFO: renamed from: N, reason: collision with other field name */
    private int[] f165N;
    private int bQ;
    private int bR;
    private int[] ac;
    private int cQ;
    private int cR;
    private int cS;
    private e e;
    private int cT;
    private boolean X;
    private String[] f;
    private int[] ad;
    private int cU;
    private boolean Y;
    private int cV;
    public boolean[] j = new boolean[17];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private p f160a = new p(this);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private q f159a = new q(this.f160a);

    public r(DCWall2 dCWall2, ax axVar, ax axVar2) {
        this.cL = -1;
        this.cN = -1;
        this.R = false;
        this.a = dCWall2;
        this.f158a = new k(this.f160a, this, axVar, axVar2);
        this.g = axVar2;
        this.Q = ba.d(5) != null;
        this.P = ba.d(23) != null;
        this.f161a = ba.m27a();
        this.U = this.f161a.j(2);
        this.f162a = ba.a();
        this.R = this.f162a.y() == 4;
        this.T = this.f162a.j(2);
        try {
            this.n = new ax(null, null, Font.getFont(32, 0, 8), 13421772, -1);
            this.f163o = new ax(null, null, Font.getFont(32, 0, 8), 0, -1);
        } catch (IOException unused) {
        }
        B();
        this.cL = -1;
        if (ba.d(7) != null) {
            this.cN = ba.F();
        } else if (ba.b().length == 1) {
            this.cN = 0;
        }
        byte[] bArrM24a = ba.m24a("settings");
        if (bArrM24a != null) {
            this.cN = bArrM24a[0];
            this.a.p(this.cN);
            byte b = bArrM24a[1];
            ba.B(b);
            ba.C(b);
            this.O = bArrM24a[3] == 1;
            this.f160a.cF = bArrM24a[4];
            this.f160a.cG = bArrM24a[5];
        }
        this.ad = new int[4];
    }

    public final void z() {
        this.M = true;
        this.cL = -1;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02ab A[PHI: r8
      0x02ab: PHI (r8v9 int) = (r8v7 int), (r8v10 int) binds: [B:116:0x0285, B:118:0x029c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x02c9 A[LOOP:1: B:113:0x0274->B:123:0x02c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x02bb A[SYNTHETIC] */
    public final int c(int i, int i2) {
        char c;
        int i3;
        boolean z;
        if (!this.S) {
            bd.aI = true;
        }
        if (this.V) {
            this.X = false;
            this.V = false;
            return 0;
        }
        if (this.M) {
            this.M = false;
            if (i == 43) {
                return 6;
            }
            if (i == 47) {
                return 20;
            }
        }
        if (this.Y) {
            s(i);
            this.Y = false;
        }
        if (this.X && (i == 40 || i == 43 || i == 47)) {
            int i4 = this.cT;
            this.cT += i2;
            if (this.cT < 1000) {
                return -1;
            }
            this.cT = 1000;
            if (i4 < 1000) {
                s(i);
            }
            int[] iArrA = this.e.a(i2);
            if (iArrA == null || iArrA[0] != 0 || iArrA[1] != 1) {
                return -1;
            }
            this.X = false;
            s(i);
            this.S = true;
            return -1;
        }
        switch (i) {
            case 27:
                if (this.L || this.o.h()) {
                    this.L = false;
                    return -2;
                }
                this.o.n(i2);
                break;
            case 28:
                if (this.L || this.p.h()) {
                    return -2;
                }
                this.p.n(i2);
                break;
            case 29:
                if (this.f161a.g(i2) != 0) {
                    return -3;
                }
                break;
            case 30:
            case 31:
                bd.aI = true;
                char c2 = 0;
                aw.dS += i2;
                if (aw.f22g.length == 0) {
                    c = 2;
                } else {
                    e eVar = null;
                    if (aw.dQ >= 0) {
                        eVar = aw.d[aw.dQ];
                    } else if (aw.dQ == -1) {
                        eVar = aw.h;
                    } else if (aw.dQ == -2) {
                        eVar = aw.i;
                    }
                    if (aw.g == null || aw.g != eVar) {
                        aw.dP = aw.dQ;
                        e eVar2 = eVar;
                        aw.g = eVar2;
                        eVar2.d();
                    } else {
                        int[] iArrA2 = aw.g.a(i2);
                        if (iArrA2 != null) {
                            if (aw.dP < 0) {
                                if (aw.dP == -2) {
                                    aw.dQ = aw.dR;
                                } else {
                                    c2 = 2;
                                }
                            } else if (iArrA2[1] == aw.dT) {
                                String str = aw.f22g[aw.dP];
                                aw.f21g = str;
                                if (str.equals("nolink")) {
                                    aw.dR = aw.dP;
                                    aw.dQ = -2;
                                } else if (bd.b(aw.f21g)) {
                                    c2 = 1;
                                } else {
                                    aw.dQ = -1;
                                }
                            } else {
                                c2 = 2;
                            }
                        }
                    }
                    if (c2 != 0) {
                        aw.dP = 0;
                        aw.dQ = 0;
                        ba.U();
                        aw.g = null;
                        aw.d = null;
                        aw.h = null;
                        aw.i = null;
                        aw.f23d = null;
                        aw.e = null;
                    }
                    c = c2;
                }
                char c3 = c;
                if (c != 0) {
                    this.N = c3 == 1;
                    return -3;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 42:
            case 44:
            case 46:
            case 48:
                int iG = this.f162a.g(i2);
                if (iG != 0) {
                    this.R = iG == 4;
                    return i == 34 ? -3 : -2;
                }
                break;
            case 35:
            case 41:
                if (this.f161a.g(i2) != 0) {
                    return -2;
                }
                break;
            case 40:
                int iG2 = this.f160a.g(i2);
                if (iG2 == 1) {
                    return 16;
                }
                if (iG2 == 2) {
                    return 17;
                }
                break;
            case 43:
                int iG3 = this.f158a.g(i2);
                if (iG3 == 1) {
                    return 6;
                }
                if (iG3 == 2) {
                    return 8;
                }
                if (iG3 == 3) {
                    if (this.m) {
                        return 8;
                    }
                    int[] iArr = {this.f160a.m40u()};
                    ao.at[2] = 0;
                    int[] iArr2 = ao.at;
                    int i5 = 6;
                    int[] iArr3 = new int[1];
                    for (int i6 = 0; i6 < iArr.length; i6++) {
                        iArr3[i6] = iArr[i6];
                    }
                    if (iArr3[0] > ao.e[0][4][0]) {
                        for (int i7 = 4; i7 >= 0; i7--) {
                            if (iArr3[0] > ao.e[0][i7][0]) {
                                ao.e[0][i7 + 1] = ao.e[0][i7];
                                i5--;
                                if (i7 == 0) {
                                    ao.e[0][i7] = iArr3;
                                } else if (iArr3[0] <= ao.e[0][i7][0]) {
                                    ao.e[0][i7 + 1] = iArr3;
                                }
                            } else if (iArr3[0] <= ao.e[0][i7][0]) {
                                ao.e[0][i7 + 1] = iArr3;
                            }
                            ao.J();
                            i3 = i5;
                        }
                        ao.J();
                        i3 = i5;
                    } else {
                        i3 = -1;
                    }
                    iArr2[4] = i3;
                    return this.f161a.j(1) ? 7 : 8;
                }
                break;
            case 45:
                q qVar = this.f159a;
                qVar.n.n(i2);
                int[] iArrA3 = qVar.b.a(i2);
                if (iArrA3 == null || iArrA3[0] != 0) {
                    z = false;
                } else {
                    if (qVar.n != null) {
                        qVar.n.m();
                        qVar.n = null;
                    }
                    if (qVar.b != null) {
                        qVar.b.f();
                        qVar.b = null;
                    }
                    z = true;
                }
                if (z) {
                    return -2;
                }
                break;
            case 47:
                int iG4 = this.f158a.g(i2);
                if (iG4 == 1) {
                    return 20;
                }
                if (iG4 == 2) {
                    return 21;
                }
                break;
            case 49:
                this.q.n(i2);
                if (this.q.h()) {
                    return -2;
                }
                break;
        }
        if (this.cP <= 0) {
            return -1;
        }
        this.cP -= i2;
        if (this.cP > 0 || this.d == null) {
            return -1;
        }
        this.d.f();
        this.d = null;
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0bdd  */
    public final void a(int i, Graphics graphics) {
        int i2;
        int i3;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        switch (i) {
            case 27:
                graphics.setColor(16777215);
                graphics.fillRect(0, 0, ba.E(), ba.H());
                this.o.c(graphics, ba.E() >> 1, ba.H() >> 1);
                break;
            case 28:
                graphics.setColor(16777215);
                graphics.fillRect(0, 0, ba.E(), ba.H());
                this.p.c(graphics, ba.E() >> 1, ba.H() >> 1);
                break;
            case 29:
            case 35:
            case 41:
                b(graphics, i);
                ao aoVar = this.f161a;
                if (aoVar.f != null) {
                    aoVar.f.a(graphics, 0, 0);
                }
                break;
            case 30:
            case 31:
                b(graphics, i);
                if (aw.dP < 0) {
                    if (aw.dP == -1) {
                        aw.h.a(graphics, 0, 0);
                    }
                    if (aw.dP == -2) {
                        aw.i.a(graphics, 0, 0);
                    }
                } else if (aw.g != null) {
                    aw.g.a(graphics, aw.dU > 1 ? aw.e.getWidth() + 5 : 0, 0);
                    if (aw.dP > -1 && aw.dU > 1) {
                        int i4 = (aw.dS / 120) % 5;
                        graphics.drawImage(aw.f23d, 5 - i4, ba.H() / 2, 6);
                        graphics.drawImage(aw.e, (ba.E() - 5) + i4, ba.H() / 2, 10);
                    }
                }
                break;
            case 32:
            case 33:
            case 34:
            case 42:
            case 44:
            case 46:
            case 48:
                b(graphics, i);
                ap apVar = this.f162a;
                if (apVar.ak && apVar.f != null) {
                    apVar.f.a(graphics, 0, 0);
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
                graphics.setColor(0);
                graphics.fillRect(0, 0, ba.E(), ba.H());
                break;
            case 40:
                this.f160a.b(graphics);
                break;
            case 43:
            case 47:
                k kVar = this.f158a;
                if (kVar.u) {
                    int iE = ba.E();
                    int iH = ba.H();
                    int iE2 = ba.E();
                    int iH2 = ba.H();
                    if (kVar.f119a.G || !kVar.f119a.E) {
                        int[] iArrC = kVar.f119a.c();
                        iA = iArrC[0];
                        iA2 = iArrC[1];
                        iA3 = iArrC[2];
                        iA4 = iArrC[3];
                    } else {
                        iA = am.d[4][0][0];
                        iA2 = am.d[4][0][1];
                        iA3 = am.d[4][0][2];
                        iA4 = am.d[4][0][3];
                    }
                    if (kVar.bN < 600) {
                        int i5 = kVar.bN < 300 ? kVar.bN : 300 - (kVar.bN - 300);
                        int i6 = kVar.bv == 1 ? 0 : 16777215;
                        iA2 = k.a(i6, iA2, i5, 600);
                        iA = k.a(i6, iA, i5, 600);
                        iA3 = k.a(i6, iA3, i5, 600);
                        iA4 = k.a(i6, iA4, i5, 600);
                    }
                    int i7 = kVar.bF > (iE2 << 12) ? ((((kVar.bF - (iE2 << 12)) >> 1) - kVar.bH) / 2) >> 12 : 0;
                    int iMax = ((iH2 * 38) / 50) + Math.max(0, (((kVar.bG - (iH2 << 12)) - kVar.bI) / 2) >> 12);
                    e.a(graphics, 0, 0, iE2, iMax, iA, iA2, 1);
                    if (iMax < iH2) {
                        e.a(graphics, 0, iMax, iE2, iH2 - iMax, iA3, iA4, 1);
                    }
                    if (kVar.N == null) {
                        kVar.bQ = iE2 >> 3;
                        kVar.bQ += iE2 % kVar.bQ;
                        kVar.bR = iH2 >> 3;
                        kVar.bR += iH2 % kVar.bR;
                        kVar.N = new int[kVar.bQ * kVar.bR];
                        int length = kVar.N.length;
                        while (true) {
                            length--;
                            if (length >= 0) {
                                kVar.N[length] = 1435011208;
                            }
                        }
                    }
                    int height = kVar.f139k.getHeight();
                    int height2 = kVar.f138j.getHeight();
                    if (kVar.t) {
                        graphics.setClip(0, 0, iE2, iH2 - ba.G());
                        int i8 = 0;
                        while (true) {
                            int i9 = i8;
                            if (i9 < iH2 - ba.G()) {
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10;
                                    if (i11 < iE2) {
                                        graphics.drawRGB(kVar.N, 0, kVar.bQ, i11, i9, kVar.bQ, kVar.bR, true);
                                        i10 = i11 + kVar.bQ;
                                    }
                                }
                                i8 = i9 + kVar.bR;
                            } else {
                                kVar.f145a.b(graphics);
                            }
                        }
                    } else {
                        kVar.f117k.z(0);
                        int i12 = kVar.f117k.m8a().ad;
                        int i13 = i12 / 4;
                        int i14 = (iE2 >> 1) + i7;
                        int i15 = iMax - i13;
                        int i16 = ((iMax - i12) - (i13 << 1)) - 5;
                        if (kVar.f141e != null || kVar.bK == 3) {
                            int height3 = iMax - (((i12 + (i13 << 1)) - kVar.f138j.getHeight()) >> 1);
                            String str = kVar.f141e;
                            String str2 = str;
                            if (str == null) {
                                str2 = kVar.f135c;
                            }
                            kVar.f138j.a(graphics, str2, i14, height3, 33);
                        } else if (kVar.bK == 4 || kVar.bK == 7) {
                            kVar.a(graphics, kVar.f117k, (kVar.bL + 999) / 1000, i14, i15, 1);
                        } else {
                            int i17 = kVar.bC;
                            if (kVar.s) {
                                i17 = (kVar.bC * kVar.bO) / 2000;
                            }
                            kVar.a(graphics, kVar.f117k, i17, i14, i15, 1);
                        }
                        int i18 = kVar.bF >> 12;
                        graphics.setColor(iA4);
                        graphics.fillRect(((iE2 - i18) >> 1) - 5, 0, 5, iH2);
                        graphics.fillRect(((iE2 - i18) >> 1) + i18, 0, 5, iH2);
                        int iMin = Math.min(iE2, kVar.bF >> 12);
                        int i19 = (iE2 - iMin) >> 1;
                        if (kVar.f119a.G || kVar.bK == 3 || kVar.bK == 7 || kVar.bK == 4) {
                            graphics.setColor(16777215);
                            graphics.fillRect(i19, i16, iMin, kVar.f146k[1].getHeight());
                        } else {
                            graphics.setClip(i19, 0, iMin, iH2);
                            kVar.f146k[0].c(graphics, i19, i16);
                            int i20 = kVar.f121a.g - kVar.f122a.f57g;
                            int i21 = kVar.f121a.g - kVar.f122a.ew;
                            if (i20 > i21) {
                                i20 = i21;
                            }
                            int i22 = (-kVar.f146k[1].getWidth()) + ((iMin * i20) / i21);
                            if (kVar.bX <= 0 || kVar.bX % 500 <= 250) {
                                kVar.f146k[1].c(graphics, i19 + i22, i16);
                            }
                            graphics.setClip(0, 0, iE2, iH2);
                        }
                        if (kVar.bv >= 0) {
                            kVar.f118f[kVar.bv].c(graphics, iE2 >> 1, i16);
                        }
                        if (kVar.s) {
                            int i23 = height >> 1;
                            int width = kVar.f143j[3].getWidth();
                            int height4 = kVar.f143j[3].getHeight();
                            int height5 = kVar.f143j[4].getHeight();
                            int i24 = width + (i23 << 1);
                            int i25 = (i23 << 1) + ((height2 * 5) / 2) + height;
                            if (!kVar.f119a.G) {
                                i25 += height + height5;
                                if (kVar.bK == 2) {
                                    i25 += height4 + 1;
                                    if (kVar.bS > 0) {
                                        i25 += height4 + 1;
                                    }
                                }
                            }
                            int iG = (i16 - i25) >> 1;
                            if (i16 < i25) {
                                iG = ((iH2 - ba.G()) - i25) >> 1;
                            }
                            int i26 = (iE2 - i24) >> 1;
                            graphics.setClip(i26, iG, i24, i25);
                            int i27 = 0;
                            while (true) {
                                int i28 = i27;
                                if (i28 < i25) {
                                    int i29 = 0;
                                    while (true) {
                                        int i30 = i29;
                                        if (i30 < i24) {
                                            graphics.drawRGB(kVar.N, 0, kVar.bQ, i26 + i30, iG + i28, kVar.bQ, kVar.bR, true);
                                            i29 = i30 + kVar.bQ;
                                        }
                                    }
                                    i27 = i28 + kVar.bR;
                                } else {
                                    int i31 = iG + i23 + height2;
                                    kVar.f138j.a(graphics, kVar.f142d[0], iE2 >> 1, i31, 33);
                                    int i32 = i31 + (height2 >> 1) + height;
                                    kVar.f139k.a(graphics, kVar.f142d[1], iE2 >> 1, i32, 33);
                                    int i33 = i32 + height2;
                                    kVar.f138j.a(graphics, Integer.toString(kVar.f119a.m40u() + ((kVar.bC * (2000 - kVar.bO)) / 2000)), iE2 >> 1, i33, 33);
                                    int width2 = (iE2 - kVar.f143j[4].getWidth()) >> 1;
                                    if (kVar.bO > 0) {
                                        int i34 = height2 >> 1;
                                        kVar.f143j[0].c(graphics, width2, i33 - i34);
                                        kVar.f143j[1].c(graphics, iE2 - width2, i33 - i34);
                                    }
                                    if (!kVar.f119a.G) {
                                        int i35 = i33 + height;
                                        int width3 = kVar.f143j[5].getWidth();
                                        int i36 = (iE2 - width3) >> 1;
                                        kVar.f143j[4].c(graphics, iE2 >> 1, i35);
                                        kVar.f139k.a(graphics, kVar.f142d[2], i36, i35, 20);
                                        kVar.f143j[5].c(graphics, iE2 >> 1, i35 + height);
                                        g gVarM8a = kVar.f143j[5].m8a();
                                        int iMin2 = Math.min(gVarM8a.ac, ((gVarM8a.ac * kVar.f119a.m40u()) / 586740) + ((((gVarM8a.ac * kVar.bC) / 586740) * kVar.bP) / 1000)) + (iE2 >> 1) + gVarM8a.aa;
                                        graphics.setClip(i36, 0, width3, iH2);
                                        if (kVar.bO != 0 || kVar.bP >= 1000) {
                                            kVar.f143j[6].c(graphics, iMin2, i35 + height);
                                        } else {
                                            kVar.f143j[7].c(graphics, iMin2, i35 + height);
                                        }
                                        graphics.setClip(0, 0, iE2, iH2);
                                        if (kVar.bO == 0 && kVar.bP < 1000) {
                                            int height6 = height + (kVar.f143j[5].getHeight() >> 1);
                                            kVar.f143j[0].c(graphics, width2, i35 + height6);
                                            kVar.f143j[1].c(graphics, iE2 - width2, i35 + height6);
                                        }
                                        int i37 = i35 + height5;
                                        int i38 = (height4 - height) >> 1;
                                        if (kVar.bK == 2 && kVar.bS > 0) {
                                            int i39 = i37 + 1;
                                            kVar.f143j[3].c(graphics, iE2 >> 1, i39);
                                            i37 = i39 + height4;
                                            int width4 = kVar.f143j[2].getWidth();
                                            int width5 = ((iE2 - width) >> 1) + (((kVar.f143j[3].getWidth() - ((width4 * 3) / 2)) - kVar.f139k.stringWidth(kVar.f142d[3])) >> 1);
                                            kVar.f143j[2].c(graphics, width5, i37 - (height4 >> 1));
                                            kVar.f139k.a(graphics, kVar.f142d[3], width5 + ((width4 * 3) / 2), i37 - i38, 36);
                                        }
                                        if (kVar.bK == 2) {
                                            int i40 = i37 + 1;
                                            kVar.f143j[3].c(graphics, iE2 >> 1, i40);
                                            kVar.f139k.a(graphics, kVar.f142d[4], iE2 >> 1, (i40 + height4) - i38, 33);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i41 = kVar.bH >> 12;
                    int i42 = kVar.bI >> 12;
                    if (!kVar.s) {
                        if (kVar.aY == 0) {
                            bc bcVar = kVar.f122a;
                            int i43 = kVar.bH;
                            int i44 = kVar.bI;
                            int i45 = bcVar.f55a.f6a;
                            for (int i46 = 0; i46 < i45; i46++) {
                                if (bcVar.f58a[i46] || i46 == bcVar.ez) {
                                    int[] iArr = bcVar.f55a.b[i46];
                                    int[] iArr2 = bcVar.f55a.c[i46];
                                    int iA5 = bcVar.f55a.a(i46);
                                    for (int i47 = 0; i47 < iArr.length; i47++) {
                                        int i48 = (bcVar.a[i46][i47].a.x - i43) >> 12;
                                        int i49 = (bcVar.a[i46][i47].a.y - i44) >> 12;
                                        int i50 = iArr[i47];
                                        if (bcVar.G[i46][i47] > 0) {
                                            bcVar.o[iA5].y(80 - bcVar.G[i46][i47]);
                                            bcVar.o[iA5].c(graphics, i48, i49);
                                        } else if (bcVar.H[i46][i47] > 0) {
                                            ay ayVar = bcVar.f52a[iArr2[i47]][iA5][3];
                                            ayVar.y(bcVar.H[i46][i47]);
                                            ayVar.c(graphics, i48, i49);
                                            ayVar.y(ayVar.A());
                                        } else if (i50 != -1) {
                                            if (i50 == 6 && bcVar.f57g <= bcVar.ew) {
                                                i50++;
                                            }
                                            if (i46 == bcVar.ez) {
                                                int iA6 = bcVar.f52a[0][0][0].A();
                                                if (i50 < 4) {
                                                    ay ayVar2 = bcVar.f52a[iArr2[i47]][iA5][i50];
                                                    ayVar2.y(bcVar.ey);
                                                    ayVar2.c(graphics, i48, i49);
                                                    ayVar2.y(ayVar2.A());
                                                } else if ((bcVar.f58a[bcVar.ez] && bcVar.ey < 200) || (!bcVar.f58a[bcVar.ez] && bcVar.ey > iA6 - 200)) {
                                                    bcVar.o[iA5].c(graphics, i48, i49);
                                                } else if (bcVar.f58a[bcVar.ez]) {
                                                    bcVar.b[iA5][i50 - 4].c(graphics, i48, i49);
                                                }
                                            } else if (i50 < 4) {
                                                bcVar.f52a[iArr2[i47]][iA5][i50].c(graphics, i48, i49);
                                            } else {
                                                bcVar.b[iA5][i50 - 4].c(graphics, i48, i49);
                                            }
                                        }
                                    }
                                }
                            }
                            for (int i51 = 0; i51 < bcVar.f53a.length; i51++) {
                                bcVar.p[bcVar.f53a[i51].type == 0 ? (char) 0 : (char) 1].c(graphics, (bcVar.f53a[i51].a.x - i43) >> 12, (bcVar.f53a[i51].a.y - i44) >> 12);
                            }
                            boolean[] zArr = bcVar.f55a.f15b;
                            for (int i52 = 0; i52 < bcVar.c.length; i52++) {
                                if (zArr[i52] || bcVar.ex == i52) {
                                    int i53 = (bcVar.c[i52].a.x - i43) >> 12;
                                    int i54 = (bcVar.c[i52].a.y - i44) >> 12;
                                    if (bcVar.ex == i52) {
                                        bcVar.p[3].c(graphics, i53, i54);
                                    } else {
                                        bcVar.p[2].c(graphics, i53, i54);
                                    }
                                }
                            }
                            for (int i55 = 0; i55 < bcVar.g.length; i55++) {
                                int i56 = (bcVar.g[i55].x - i43) >> 12;
                                int i57 = (bcVar.g[i55].y - i44) >> 12;
                                if (bcVar.l[i55]) {
                                    bcVar.p[5].y(bcVar.aF[i55]);
                                }
                                bcVar.p[bcVar.l[i55] ? (char) 5 : (char) 4].c(graphics, i56, i57);
                            }
                        } else if (kVar.aY == 1) {
                            af afVar = kVar.f123a;
                            int i58 = kVar.bH;
                            int i59 = kVar.bI;
                            for (int i60 = 0; i60 < afVar.dn; i60++) {
                                if (afVar.h[i60][3] > 0) {
                                    int i61 = afVar.h[i60][0];
                                    int width6 = ((afVar.b[i60].a.x - i58) >> 12) + (afVar.n[i60].getWidth() >> 1);
                                    int height7 = ((afVar.b[i60].a.y - i59) >> 12) + (afVar.n[i60].getHeight() >> 1);
                                    afVar.n[i60].c(graphics, width6, height7);
                                    if (i61 == 0) {
                                        afVar.n[afVar.dn].c(graphics, width6, height7);
                                    }
                                }
                            }
                        }
                    }
                    if (!kVar.r) {
                        if (kVar.e[0] && !kVar.p) {
                            kVar.f105c[0].c(graphics, (kVar.f124a.a.x - kVar.bH) >> 12, (kVar.f124a.a.y - kVar.bI) >> 12);
                        }
                        if (!kVar.p && !kVar.r) {
                            for (int i62 = 0; i62 < 5; i62++) {
                                if (kVar.g[i62]) {
                                    kVar.f116e[kVar.K[i62]].y(kVar.L[i62]);
                                    kVar.f116e[kVar.K[i62]].c(graphics, (kVar.f115e[i62].x >> 12) - i41, (kVar.f115e[i62].y >> 12) - i42);
                                }
                            }
                        }
                        int i63 = (kVar.f125b.a.x - kVar.bH) >> 12;
                        int i64 = (kVar.f125b.a.y - kVar.bI) >> 12;
                        if (kVar.bb > 0) {
                            kVar.h.c(graphics, i63, i64);
                        }
                        char c = 0;
                        if (kVar.bd > 0) {
                            c = 1;
                        } else if (kVar.bp > 0) {
                            c = 2;
                        }
                        if (kVar.bq > 0 && kVar.f124a.i.y > 0) {
                            int i65 = kVar.f124a.a.x >> 12;
                            int i66 = kVar.f124a.a.y >> 12;
                            int i67 = (kVar.f125b.a.y - (kVar.f125b.j.y >> 1)) - (kVar.f124a.a.y + kVar.f124a.n);
                            int iE3 = al.e(kVar.f124a.i.x, al.d(i67, kVar.f124a.i.y));
                            if (kVar.f124a.a.x + iE3 > kVar.f125b.a.x - (kVar.f125b.j.x >> 1) && kVar.f124a.a.x + iE3 < kVar.f125b.a.x + (kVar.f125b.j.x >> 1)) {
                                int iB = kVar.f121a.b(0);
                                int iE4 = al.e(al.d(kVar.f125b.a.x - (kVar.f124a.a.x + iE3), kVar.f125b.j.x >> 1), kVar.f125b.n) >> 12;
                                int i68 = -ar.n(iE4 << 8);
                                int i69 = -ar.m(iE4 << 8);
                                int iE5 = al.e(i68, iB << 12);
                                int iE6 = al.e(i69, iB << 12);
                                int i70 = iE5 >> 12;
                                int i71 = iE6 >> 12;
                                graphics.setColor(16777215);
                                for (int i72 = 0; i72 < 10; i72++) {
                                    kVar.f110j.c(graphics, ((i65 + (iE3 >> 12)) - i41) + (i70 * i72), ((i66 + (i67 >> 12)) - i42) + (i71 * i72));
                                }
                            }
                        }
                        if (!kVar.p && !kVar.v) {
                            kVar.f126g[c].c(graphics, ((kVar.f124a.a.x - kVar.bH) + al.e(al.d(kVar.f124a.i.x, 1000 << 12), kVar.ba << 12)) >> 12, ((kVar.f124a.a.y - kVar.bI) + al.e(al.d(kVar.f124a.i.y, 1000 << 12), kVar.ba << 12)) >> 12);
                            for (int i73 = 0; i73 < 10; i73++) {
                                if (kVar.f133h[i73]) {
                                    kVar.f126g[c].c(graphics, (kVar.f132a[i73].a.x - kVar.bH) >> 12, (kVar.f132a[i73].a.y - kVar.bI) >> 12);
                                }
                            }
                        }
                    }
                    if (kVar.p) {
                        kVar.f129l.c(graphics, (kVar.f125b.a.x - kVar.bH) >> 12, (kVar.f125b.a.y - kVar.bI) >> 12);
                    } else if (!kVar.r) {
                        int iJ = 0;
                        int iJ2 = 0;
                        if (kVar.bn > 0) {
                            kVar.f122a.p[6].c(graphics, (kVar.f125b.a.x - kVar.bH) >> 12, (kVar.f125b.a.y - kVar.bI) >> 12);
                        }
                        if (kVar.bh > 0) {
                            kVar.f130m.c(graphics, (kVar.f125b.a.x - kVar.bH) >> 12, (kVar.f125b.a.y - kVar.bI) >> 12);
                            iJ = p.j(4) - 2;
                            iJ2 = p.j(4) - 2;
                        }
                        if (kVar.bz > -1) {
                            kVar.f131i[kVar.bz].c(graphics, ((kVar.f125b.a.x - kVar.bH) + iJ) >> 12, ((kVar.f125b.a.y - kVar.bI) + iJ2) >> 12);
                        } else {
                            kVar.f127a[kVar.by][kVar.bA + (kVar.bx > 0 ? 5 : 0)].c(graphics, ((kVar.f125b.a.x - kVar.bH) + iJ) >> 12, ((kVar.f125b.a.y - kVar.bI) + iJ2) >> 12);
                        }
                    }
                    if (kVar.bg > 0) {
                        for (int i74 = 0; i74 < 9; i74++) {
                            int i75 = iH >> 3;
                            if (kVar.bg > 1200) {
                                i75 = (i75 * (-(kVar.bg - 2200))) / 1000;
                            } else if (kVar.bg < 1000) {
                                i75 = (i75 * kVar.bg) / 1000;
                            }
                            graphics.setColor(16777215);
                            graphics.fillRect(0, ((iH >> 3) * i74) - (i75 >> 1), iE, i75);
                        }
                    }
                    for (int i76 = 0; i76 < 5; i76++) {
                        if (kVar.f111f[i76]) {
                            kVar.f114d[kVar.I[i76]].y(kVar.J[i76]);
                            kVar.f114d[kVar.I[i76]].c(graphics, (kVar.f112c[i76].x >> 12) - i41, (kVar.f112c[i76].y >> 12) - i42);
                        }
                    }
                    if (kVar.j && !kVar.s) {
                        kVar.i.g((kVar.f106d.x >> 12) - i41, (kVar.f106d.y >> 12) - i42);
                    }
                    if (!kVar.r) {
                        for (int i77 = 0; i77 < 5; i77++) {
                            if (kVar.c[i77]) {
                                kVar.f105c[kVar.H[i77]].c(graphics, (kVar.a[i77].x >> 12) - i41, (kVar.a[i77].y >> 12) - i42);
                            }
                        }
                        if ((kVar.f125b.a.y >> 12) - i42 > iH) {
                            int i78 = (kVar.f125b.a.x >> 12) - i41;
                            graphics.setColor(16777215);
                            if (i78 < 0) {
                                graphics.fillTriangle(0, iH - 20, 10, iH - 30, 10, iH - 10);
                            } else if (i78 > iE) {
                                graphics.fillTriangle(iE, iH - 20, iE - 10, iH - 30, iE - 10, iH - 10);
                            } else if (kVar.bA == 0) {
                                kVar.f128h[0].g(i78, iH - 10);
                            } else if (kVar.bA == 4) {
                                kVar.f128h[2].g(i78, iH - 10);
                            } else {
                                kVar.f128h[1].g(i78, iH - 10);
                            }
                        }
                    }
                    if (kVar.v) {
                        int length2 = kVar.f149c[kVar.bV].length;
                        ax axVar = (kVar.bV == 1 || kVar.bV == 0) ? kVar.f138j : kVar.f140l;
                        ax axVar2 = axVar;
                        int height8 = axVar.getHeight();
                        if (kVar.O == null) {
                            kVar.O = new int[kVar.bQ * kVar.bR];
                            int length3 = kVar.O.length;
                            while (true) {
                                length3--;
                                if (length3 >= 0) {
                                    kVar.O[length3] = 1996488704;
                                }
                            }
                        }
                        graphics.setClip(0, 0, iE, iH);
                        int i79 = 0;
                        while (true) {
                            int i80 = i79;
                            if (i80 < iH) {
                                int i81 = 0;
                                while (true) {
                                    int i82 = i81;
                                    if (i82 < iE) {
                                        graphics.drawRGB(kVar.O, 0, kVar.bQ, i82, i80, kVar.bQ, kVar.bR, true);
                                        i81 = i82 + kVar.bQ;
                                    }
                                }
                                i79 = i80 + kVar.bR;
                            } else {
                                int iG2 = ((iH - ba.G()) - (length2 * height8)) >> 1;
                                if (kVar.f119a.G || kVar.bV == 3) {
                                    iG2 -= height8 << 1;
                                }
                                if (iG2 < 0) {
                                    iG2 = 0;
                                }
                                for (int i83 = 0; i83 < length2; i83++) {
                                    axVar2.a(graphics, kVar.f149c[kVar.bV][i83], iE >> 1, iG2, 17);
                                    iG2 += height8;
                                }
                                if (kVar.f119a.G || kVar.bV == 3) {
                                    int i84 = iG2 + height8;
                                    axVar2.a(graphics, kVar.f142d[1], iE >> 1, i84, 17);
                                    axVar2.a(graphics, Integer.toString(kVar.f119a.m40u()), iE >> 1, i84 + height8, 17);
                                }
                            }
                        }
                    }
                    if (kVar.m && kVar.bW >= 0) {
                        kVar.f139k.a(graphics, kVar.f137c[kVar.bW], 10, 10, 20);
                    }
                }
                break;
            case 45:
                q qVar = this.f159a;
                if (qVar.b != null) {
                    int iE7 = ba.E();
                    int iH3 = ba.H();
                    int iS = qVar.a.s();
                    e.a(graphics, 0, 0, ba.E(), ba.H(), am.B[iS][0], am.B[iS][1], 1);
                    qVar.n.c(graphics, iE7 >> 1, iH3 / 3);
                    qVar.b.b(graphics);
                }
                break;
            case 49:
                graphics.setColor(16777215);
                graphics.fillRect(0, 0, ba.E(), ba.H());
                this.q.c(graphics, ba.E() >> 1, ba.H() >> 1);
                break;
        }
        if (this.X) {
            int iE8 = ba.E();
            int iH4 = ba.H();
            int i85 = (this.e.ac * this.cT) / 1000;
            int i86 = (this.e.ad * this.cT) / 1000;
            int i87 = (iE8 - i85) >> 1;
            int i88 = (iH4 - i86) >> 1;
            if (!this.f160a.E || this.f160a.G) {
                int[] iArrC2 = this.f160a.c();
                i2 = iArrC2[0];
                i3 = iArrC2[1];
            } else {
                i2 = am.d[4][0][0];
                i3 = am.d[4][0][1];
            }
            graphics.setColor(i3);
            graphics.drawRect(i87 - 1, i88 - 1, i85 + 1, i86 + 1);
            e.a(graphics, i87, i88, i85, i86, i2, i3, 1);
            if (this.cT == 1000) {
                this.e.a(graphics, i87, i88);
            }
        }
        if (ba.G() > 0) {
            c(graphics);
        }
    }

    public final void a(int i, int i2, e eVar) {
        switch (i2) {
            case 0:
                this.S = false;
                if (i == 31) {
                    eVar.g(7);
                }
                if (this.cV == 1) {
                    eVar.g(2);
                } else if (this.cV == 2) {
                    eVar.g(3);
                }
                this.cV = 0;
                break;
            case 4:
            case 15:
            case 16:
                this.S = false;
                break;
            case 39:
                bd.f61b.aD = true;
                break;
            case 40:
                this.S = false;
                A();
                this.f160a.n();
                this.Y = true;
                break;
            case 43:
            case 47:
                if (i != 15 && i != 16) {
                    A();
                }
                this.S = true;
                if (this.f160a.a()[0] == 3) {
                    this.f158a.i(1);
                } else {
                    this.f158a.i(0);
                }
                this.Y = true;
                break;
            case 45:
                this.S = false;
                A();
                this.f159a.b.d();
                this.f160a.B = false;
                break;
            case 49:
                ba.U();
                ba.h(14, 0);
                break;
        }
        if (i == 4 || i == 15 || i == 16) {
            saveSettings();
        }
        this.cM = i;
        if ((!this.N || i != 31) && (!this.N || (i2 != 31 && this.cM != 31))) {
            int i3 = -1;
            switch (i2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 13:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 29:
                case 41:
                    i3 = 524288;
                    break;
                case 28:
                case 49:
                    i3 = 524288;
                    break;
                case 40:
                case 43:
                case 45:
                case 47:
                    int iS = this.f160a.s();
                    if (iS == 0) {
                        i3 = 655360;
                    } else if (iS == 1) {
                        i3 = 720896;
                    } else if (iS != 2) {
                        i3 = iS != 3 ? 917504 : 851968;
                    } else {
                        i3 = 786432;
                    }
                    break;
            }
            if (i3 == -1) {
                ba.T();
            } else if (i3 != this.cL) {
                ba.i(i3, -1);
            }
            this.cL = i3;
        }
        this.c = eVar;
        this.cK = i2;
    }

    public final void f(int i, int i2, int i3) {
        int iQ = ba.q(i2);
        boolean z = (i3 == 0 && iQ == 53) || (i3 == 3 && ba.o(i2) == 0);
        if (this.X && !this.M && (i == 40 || i == 43 || i == 47)) {
            if (this.cT >= 1000) {
                this.e.m32b(i2, i3);
                return;
            } else {
                if (z) {
                    this.cT = 1000;
                    s(i);
                }
                return;
            }
        }
        switch (i) {
            case 0:
                if (i3 == 0 && ba.d(16) != null) {
                    if (this.ab == null) {
                        this.ab = new int[aa.length];
                    }
                    this.ab[this.cO % aa.length] = iQ;
                    boolean z2 = false;
                    for (int i4 = 0; i4 < aa.length && !z2; i4++) {
                        if (this.ab[((this.cO + i4) + 1) % aa.length] != aa[i4]) {
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        this.m = true;
                        k kVar = this.f158a;
                        kVar.bW = -1;
                        kVar.m = true;
                        this.f160a.x();
                        int iE = ba.E() - (ba.E() >> 2);
                        int iH = (ba.H() - (ba.H() >> 2)) - ba.G();
                        int iE2 = (ba.E() - iE) >> 1;
                        int iH2 = (ba.H() - iH) >> 1;
                        this.cP = 2000;
                        this.d = new e();
                        this.d.b(1, 1, 3);
                        this.d.a(0, 1, ba.c(21), (Image[]) null, -1);
                        this.d.f79v[0] = 1;
                        this.d.e(4);
                        this.d.b(iE2, iH2, iE, iH);
                    }
                    this.cO++;
                    break;
                }
                break;
            case 8:
                if (i3 == 0) {
                    if (iQ == 50 || iQ == 56) {
                        ba.b(ba.b()[this.c.as][1]);
                    }
                }
                break;
            case 27:
            case 28:
                if (z) {
                    this.L = true;
                }
                break;
            case 29:
            case 35:
            case 41:
                ao aoVar = this.f161a;
                if (aoVar.f != null) {
                    aoVar.f.m32b(i2, i3);
                }
                break;
            case 30:
            case 31:
                if (aw.g != null) {
                    if (aw.d != null) {
                        int iQ2 = i3 == 0 ? ba.q(i2) : 0;
                        if (aw.dP >= 0) {
                            if (iQ2 == 52) {
                                int i5 = aw.dQ - 1;
                                aw.dQ = i5;
                                if (i5 < 0) {
                                    aw.dQ = aw.d.length - 1;
                                }
                            } else if (iQ2 == 54) {
                                int i6 = aw.dQ + 1;
                                aw.dQ = i6;
                                if (i6 > aw.d.length - 1) {
                                    aw.dQ = 0;
                                }
                            }
                        }
                    }
                    aw.g.m32b(i2, i3);
                }
                break;
            case 32:
            case 33:
            case 34:
            case 42:
            case 44:
            case 46:
            case 48:
                ap apVar = this.f162a;
                if (apVar.ak && !apVar.al && apVar.f != null) {
                    apVar.f.m32b(i2, i3);
                    break;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 45:
                q qVar = this.f159a;
                if (qVar.b != null) {
                    qVar.b.m32b(i2, i3);
                }
                break;
            case 40:
                this.f160a.b(i2, i3);
                break;
            case 43:
            case 47:
                k kVar2 = this.f158a;
                if (kVar2.t) {
                    kVar2.f145a.m32b(i2, i3);
                    break;
                } else {
                    if (i3 == 0 || i3 == 1) {
                        int i7 = 0;
                        switch (ba.q(i2)) {
                            case 50:
                                i7 = 4;
                                break;
                            case 52:
                                i7 = 1;
                                break;
                            case 53:
                                i7 = 16;
                                break;
                            case 54:
                                i7 = 2;
                                break;
                            case 56:
                                i7 = 8;
                                break;
                        }
                        if (i3 == 0) {
                            kVar2.aV |= i7;
                            kVar2.aW |= i7;
                        } else {
                            kVar2.aV &= i7 ^ (-1);
                        }
                    } else if (i3 == 3) {
                        kVar2.aX = i2;
                    }
                    if (kVar2.m && i3 == 0) {
                        if (i2 == 49) {
                            if (kVar2.aY == 1) {
                                kVar2.f123a.ag = true;
                            } else if (kVar2.aY == 0) {
                                bc bcVar = kVar2.f122a;
                                bcVar.Y();
                                bcVar.Z();
                                bcVar.f = 0;
                                bcVar.f57g = 0;
                            }
                            break;
                        } else if (i2 == 55) {
                            int i8 = kVar2.bW + 1;
                            kVar2.bW = i8;
                            kVar2.bW = i8 % 21;
                            break;
                        } else if (i2 == 57 && kVar2.bW >= 0) {
                            kVar2.l(kVar2.bW);
                            kVar2.bW = -1;
                            break;
                        }
                    }
                }
                break;
            case 49:
                if (z) {
                    this.q.y(this.q.A());
                }
                break;
        }
    }

    public final boolean e(int i) {
        switch (i) {
            case 50:
                return this.cN == -1;
            case 51:
                return this.T;
            case 52:
                return true;
            case 53:
                return this.U;
            case 54:
                return false;
            case 55:
                return false;
            case 56:
            case 61:
                return this.f162a.j(5);
            case 57:
            case 60:
                return this.f162a.j(3);
            case 58:
                return this.f160a.B;
            case 59:
                return (this.f160a.D || this.f160a.E) ? false : true;
            case 62:
                return this.f160a.cD == 0 || this.f160a.cC >= am.j.length;
            case 63:
                return this.f160a.cF < 0;
            case 64:
                return this.f160a.cG < 0;
            case 65:
                return this.f160a.cz > 3;
            default:
                return false;
        }
    }

    public final void a(int i, Graphics graphics, e eVar) {
        if (a(eVar)) {
            graphics.setColor(16777215);
            graphics.fillRect(0, 0, ba.E(), ba.H());
        } else {
            b(graphics, i);
        }
        eVar.b(graphics);
        if (i == 0 && this.d != null) {
            this.d.b(graphics);
        }
        if (ba.G() > 0) {
            c(graphics);
        }
    }

    private static void b(Graphics graphics, int i) {
        int iE = ba.E();
        int iH = ba.H();
        int i2 = am.du;
        int i3 = am.dv;
        if (i == 4 || i == 9 || i == 10) {
            i2 = am.dw;
            i3 = am.dx;
        } else if (i == 2) {
            i2 = am.dy;
            i3 = am.dz;
        } else if (i == 3) {
            i2 = am.dA;
            i3 = am.dB;
        } else if (i == 29) {
            i2 = am.dC;
            i3 = am.dD;
        } else if (i == 31) {
            i2 = am.dE;
            i3 = am.dF;
        } else if (i == 12) {
            i2 = am.dG;
            i3 = am.dH;
        }
        e.a(graphics, 0, 0, iE, iH, i2, i3, 1);
    }

    public final void q(int i) {
        switch (i) {
            case 2:
                this.O = true;
                break;
            case 3:
                this.cV = 1;
                this.f160a.G = false;
                break;
            case 4:
                this.cV = 2;
                this.f160a.G = true;
                this.f158a.n = false;
                this.f160a.p();
                break;
            case 5:
            case 16:
                this.f158a.n = false;
                break;
            case 9:
            case 13:
            case 22:
            case 32:
                this.f160a.cF = this.c.f96F[5];
                saveSettings();
                break;
            case 10:
            case 23:
            case 33:
                char c = 1;
                if (i == 10 || i == 23) {
                    c = 2;
                }
                int i2 = this.c.f96F[c];
                ba.B(i2);
                ba.C(i2);
                saveSettings();
                ba.i(589824, 1);
                break;
            case 11:
            case 12:
            case 24:
            case 25:
            case 34:
            case 35:
            case 37:
                this.f160a.u();
                this.f160a.v();
                ba.a("gamedata", (byte[]) null, 1);
                this.f160a.cF = -1;
                this.f160a.cG = -1;
                for (int i3 = 0; i3 < ao.at[0]; i3++) {
                    for (int i4 = 0; i4 < 5; i4++) {
                        for (int i5 = 0; i5 < ao.at[1]; i5++) {
                            ao.e[i3][i4][i5] = 0;
                        }
                    }
                }
                ao.J();
                saveSettings();
                break;
            case 14:
            case 27:
                B();
                break;
            case 15:
                this.f160a.u();
                A();
                break;
            case 18:
                this.f160a.cF = 1;
                saveSettings();
                break;
            case 19:
                this.f160a.cF = 0;
                saveSettings();
                break;
            case 26:
                this.f160a.cG = this.c.f96F[5];
                saveSettings();
                break;
            case 28:
                this.f158a.n = false;
                this.f160a.p();
                break;
            case 29:
                this.f160a.v();
                A();
                break;
            case 30:
                this.f160a.cG = 1;
                saveSettings();
                break;
            case 31:
                this.f160a.cG = 0;
                saveSettings();
                break;
            case 36:
                this.cN = this.c.as;
                if (this.cN != ba.F()) {
                    this.a.p(this.cN);
                    saveSettings();
                    this.f = null;
                    k kVar = this.f158a;
                    kVar.f137c = null;
                    kVar.f142d = null;
                    kVar.f145a = null;
                    kVar.f134b = null;
                    kVar.f136d = null;
                    kVar.f144e = null;
                    kVar.f149c = null;
                }
                break;
            case 38:
                a(true);
                break;
            case 39:
                a(false);
                break;
            case 40:
                this.cN = this.c.as;
                this.a.p(this.cN);
                saveSettings();
                break;
        }
    }

    public final String a(int i, int i2, int i3) {
        if (i == 3) {
            if (i3 == 0 && this.R) {
                i2 = 20;
            }
        } else if (i == 0) {
            if (i3 == 0) {
                return this.f162a.a();
            }
            if (i3 != 12) {
                if (i3 == 4) {
                    return ba.c(41);
                }
                if (i3 == 5) {
                }
            }
        } else if ((i2 != -2 || ((i != 4 || i3 != 3) && ((i != 15 || i3 != 3) && (i != 16 || i3 != 3)))) && i2 == 44 && this.P) {
            return ba.a(ba.c(i2), new String[]{ba.m20b()});
        }
        String strC = ba.c(i2);
        if (strC == null || strC.length() != 0) {
            return strC;
        }
        return null;
    }

    public final void a(int i, e eVar, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                switch (i) {
                    case 7:
                        eVar.a((ax) null, this.f163o, this.n, this.f163o);
                        break;
                    case 8:
                        eVar.a((ax) null, this.f163o, this.n, this.f163o);
                        break;
                }
            }
            if (i2 == 2) {
                int I = ba.I();
                switch (i) {
                    case 4:
                        eVar.f96F[1] = I;
                        break;
                    case 15:
                        eVar.f96F[2] = I;
                        eVar.f96F[5] = this.f160a.cF;
                        break;
                    case 16:
                        eVar.f96F[2] = I;
                        eVar.f96F[5] = this.f160a.cG;
                        break;
                }
            }
        }
    }

    public static boolean f(int i) {
        return (i == 9 && ba.b().length == 1) ? false : true;
    }

    public static boolean a(int i, int i2) {
        return i2 == 1 || i == 1;
    }

    public final int k(int i) {
        switch (i) {
            case 0:
                return this.W ? 0 : 10;
            case 1:
            default:
                return 0;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 20;
        }
    }

    public final void d(int i, int i2) {
        switch (i) {
            case 0:
                if (i2 == 0 && i2 == 0) {
                    this.f164p = this.g;
                    Font.getFont(32, 1, 8);
                    this.W = true;
                }
                if (i2 == 1) {
                    this.f158a.h(1);
                } else if (i2 == 2) {
                    this.f158a.h(2);
                } else if (i2 == 3) {
                    this.f158a.h(3);
                } else if (i2 == 4) {
                    this.f158a.h(5);
                } else if (i2 == 5) {
                    this.f158a.h(8);
                }
                break;
            case 3:
                if (i2 == 0 && this.T) {
                    this.f162a.L();
                }
                if (i2 == 1) {
                    if (this.U) {
                        this.f161a.L();
                    }
                    break;
                } else if (i2 == 2) {
                }
                break;
            case 4:
                if (i2 == 0) {
                    this.o = new ay(ar.a(1245185), false);
                } else if (i2 == 1) {
                    this.p = new ay(ar.a(1245186, false), false);
                } else if (i2 == 2) {
                    ba.A(524288);
                    ba.A(589824);
                    ba.A(917504);
                    ba.A(655360);
                    ba.A(720896);
                    ba.A(786432);
                    ba.A(851968);
                } else if (i2 == 3) {
                    this.q = new ay(ar.a(2162718), false);
                }
                break;
        }
    }

    public final void r(int i) {
        switch (i) {
            case 0:
                this.f164p = null;
                this.W = false;
                break;
            case 4:
                this.o.m();
                this.o = null;
                if (this.p != null) {
                    this.p.m();
                    this.p = null;
                }
                if (this.q != null) {
                    this.q.m();
                    this.q = null;
                }
                break;
        }
    }

    public final int l(int i) {
        switch (i) {
            case 29:
            case 30:
            case 31:
            case 34:
            case 38:
                return 100;
            case 32:
            case 33:
            case 35:
            case 36:
            case 37:
            case 39:
            case 41:
            case 42:
            case 44:
            case 46:
            default:
                return 0;
            case 40:
                return this.f160a.m();
            case 43:
                if (this.cK == 15) {
                    return 0;
                }
                this.cS = this.f160a.m();
                return this.cS + this.f158a.m();
            case 45:
                return 10;
            case 47:
                return this.f158a.m();
        }
    }

    public final void a(int i, boolean z) {
        if (!z) {
            bd.f61b.aa();
            return;
        }
        ba.T();
        ba.R();
        this.cL = -1;
        this.ad[0] = am.du;
        this.ad[1] = am.dv;
        this.cU = 16777215;
        if (i == 43 && this.f160a.E) {
            this.cU = 4473924;
        }
        int iS = this.f160a.s();
        if (i == 45) {
            this.ad[0] = am.B[iS][0];
            this.ad[1] = am.B[iS][1];
            return;
        }
        if ((i == 43 && this.f160a.D) || ((i == 40 && !this.f160a.C) || (i == 43 && this.f160a.E))) {
            this.ad[0] = am.d[iS][0][0];
            this.ad[1] = am.d[iS][0][1];
            this.ad[2] = am.d[iS][0][2];
            this.ad[3] = am.d[iS][0][3];
            return;
        }
        if (i == 43 || i == 47 || i == 40) {
            int[] iArrC = this.f160a.c();
            this.ad[0] = iArrC[0];
            this.ad[1] = iArrC[1];
            this.ad[2] = iArrC[2];
            this.ad[3] = iArrC[3];
        }
    }

    public final void e(int i, int i2) {
        String[] strArr;
        switch (i) {
            case 29:
                if (i2 == 1) {
                    this.f161a.j(0);
                    this.f161a.L();
                }
                break;
            case 30:
            case 31:
                if (i2 == 1) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(ba.a(983042));
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        int i3 = dataInputStream.readByte();
                        aw.D = new int[4][i3];
                        for (int i4 = 0; i4 < i3; i4++) {
                            for (int i5 = 0; i5 < 4; i5++) {
                                aw.D[i5][i4] = dataInputStream.readInt();
                            }
                        }
                        dataInputStream.close();
                        byteArrayInputStream.close();
                        break;
                    } catch (IOException unused) {
                    }
                    ba.a(34, 327695, null, 0);
                    String strD = ba.d(5);
                    if (strD == null) {
                        strArr = new String[]{"none"};
                    } else {
                        int i6 = 0;
                        int length = 0;
                        while (true) {
                            int i7 = length;
                            if (i7 < strD.length()) {
                                i6++;
                                int iIndexOf = strD.indexOf("!.!", i7);
                                if (iIndexOf != -1) {
                                    length = iIndexOf + "!.!".length();
                                }
                            }
                        }
                        String[] strArr2 = new String[i6];
                        int length2 = 0;
                        String strC = ba.c(327696);
                        for (int i8 = 0; i8 < i6; i8++) {
                            int iIndexOf2 = strD.indexOf("!.!", length2);
                            int length3 = iIndexOf2;
                            if (iIndexOf2 == -1) {
                                length3 = strD.length();
                            }
                            if (length2 < length3) {
                                String strSubstring = strD.substring(length2, length3);
                                if ("none".equals(strSubstring)) {
                                    strArr2[i8] = null;
                                } else if ("nolink".equals(strSubstring)) {
                                    strArr2[i8] = "nolink";
                                } else {
                                    if (strSubstring.indexOf("aid=") == -1) {
                                        strSubstring = new StringBuffer().append(strSubstring).append("&aid=1132").toString();
                                    }
                                    if (strSubstring.indexOf("clk=") == -1) {
                                        strSubstring = new StringBuffer().append(strSubstring).append("&clk=0").toString();
                                    }
                                    if (strSubstring.indexOf("car=") == -1) {
                                        strSubstring = new StringBuffer().append(strSubstring).append("&car=").append(ba.d(2)).toString();
                                    }
                                    if (strSubstring.indexOf("lng") == -1) {
                                        strSubstring = new StringBuffer().append(strSubstring).append("&lng=").append(strC).toString();
                                    }
                                    strArr2[i8] = strSubstring;
                                }
                            } else {
                                strArr2[i8] = "nolink";
                            }
                            String strM21a = ba.m21a(new StringBuffer().append("DCHOC-GMG-").append(i8).toString());
                            if (strM21a != null && !strM21a.equals("")) {
                                String strTrim = strM21a.trim();
                                String str = strTrim;
                                if (strTrim.equals("none") || str.equals(ba.d(25))) {
                                    str = null;
                                }
                                strArr2[i8] = str;
                            }
                            length2 = length3 + "!.!".length();
                        }
                        strArr = strArr2;
                    }
                    aw.a(aw.D[1], aw.D[3], aw.D[0], aw.D[2], strArr, 34, 5);
                } else if (i2 == 2) {
                    saveSettings();
                }
                break;
            case 34:
                if (i2 == 1) {
                    this.f162a.j(4);
                    this.f162a.L();
                }
                break;
            case 38:
            case 45:
                q qVar = this.f159a;
                if (i2 == 0) {
                    int iS = qVar.a.s();
                    if (iS == 0) {
                        qVar.n = new ay(ar.a(2162707), true);
                    } else if (iS == 1) {
                        qVar.n = new ay(ar.a(1769501), true);
                    } else if (iS == 2) {
                        qVar.n = new ay(ar.a(1966093), true);
                    } else {
                        qVar.n = new ay(ar.a(1638416), true);
                    }
                    String strC2 = ba.c(am.ap[qVar.a.cz % am.ap.length]);
                    qVar.b = new e();
                    qVar.b.b(1, 1, 3);
                    qVar.b.e(2);
                    qVar.b.a(0, 1, strC2, (ay) null, 0);
                    qVar.b.f79v[0] = 1;
                    int iE = ba.E();
                    int iH = ((((ba.H() << 1) / 3) << 1) - ba.G()) - (qVar.n.getHeight() >> 1);
                    int iD = qVar.b.d(iE);
                    int iB = qVar.b.b(iD, iH);
                    qVar.b.b((iE - iD) >> 1, ((ba.H() - ba.G()) - iB) + 15, iD, iB);
                }
                break;
            case 43:
                if (i2 >= this.cS) {
                    this.f158a.h(i2 - this.cS);
                    break;
                }
            case 40:
                this.f160a.c(i, i2);
                break;
            case 47:
                this.f158a.h(i2);
                break;
        }
        if (this.f == null) {
            if ((i == 40 || i == 43 || i == 47) && i2 == 1) {
                this.f = new String[17];
                for (int i9 = 0; i9 < 17; i9++) {
                    this.f[i9] = ba.c(am.ar[i9]);
                }
            }
        }
    }

    private static void a(boolean z) {
        int I = ba.I();
        if (!z) {
            I = 0;
        } else if (I == 0) {
            I = 3;
        }
        ba.C(I);
        ba.B(I);
    }

    private void saveSettings() {
        byte[] bArr = new byte[6];
        bArr[0] = (byte) this.cN;
        bArr[1] = (byte) ba.I();
        bArr[3] = this.O ? (byte) 1 : (byte) 0;
        bArr[4] = (byte) this.f160a.cF;
        bArr[5] = (byte) this.f160a.cG;
        ba.a("settings", bArr, 1);
    }

    private void A() {
        if (ba.a().y() == 4 || this.m) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            this.f160a.a(dataOutputStream);
            dataOutputStream.close();
            ba.a("gamedata", byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException unused) {
        }
    }

    private void B() {
        byte[] bArrM24a = ba.m24a("gamedata");
        if (bArrM24a != null) {
            try {
                this.f160a.a(new DataInputStream(new ByteArrayInputStream(bArrM24a)));
            } catch (IOException unused) {
            }
        }
    }

    public final void C() {
        this.V = true;
    }

    private static boolean a(e eVar) {
        return eVar.N == 4 || eVar.N == 5;
    }

    private boolean b(int i, int i2) {
        switch (i) {
            case 0:
                if (i2 == 8) {
                    return false;
                }
                if (i2 == 1) {
                    return this.Q && !this.O;
                }
                if (i2 == 7) {
                    return this.Q && this.O;
                }
                if (i2 == 4) {
                    return ba.c(41) != null;
                }
                if (i2 == 0) {
                    return this.f162a.a() != null;
                }
                if (i2 == 12 || i2 == 5) {
                    return false;
                }
                if (i2 == 10) {
                    return this.P;
                }
                return true;
            case 4:
                if (i2 == 0) {
                    return false;
                }
                if (i2 == 1) {
                    return true;
                }
                if (i2 == 2) {
                    return false;
                }
                if (i2 == 4) {
                    return ba.b().length > 1;
                }
                return i2 != 3;
            case 15:
                if (i2 == 1) {
                    return false;
                }
                if (i2 == 2) {
                    return true;
                }
                return (i2 == 4 || i2 == 3) ? false : true;
            case 16:
                if (i2 == 1) {
                    return false;
                }
                if (i2 == 2) {
                    return true;
                }
                return (i2 == 4 || i2 == 3) ? false : true;
            default:
                return true;
        }
    }

    public final void a(int i, e eVar, int i2, int i3, int i4) {
        if (i != 8 && i != 9) {
            eVar.b(i2, i3, i4);
            return;
        }
        String[][] strArrB = ba.b();
        eVar.b(i2, strArrB.length, i4);
        int i5 = i == 8 ? 40 : 36;
        for (int i6 = 0; i6 < strArrB.length; i6++) {
            eVar.a(i6, 0, strArrB[i6][0], (Image[]) null, i5);
        }
    }

    public static void a(e eVar, String str, ay ayVar, int i) {
        eVar.a(ayVar == null ? str : null, ayVar, i);
    }

    public static void a(e eVar, String str, Image image, int i) {
        eVar.a(image == null ? str : null, image, i);
    }

    public final void a(e eVar, int i, int i2) {
        eVar.f79v[i2] = i;
    }

    public final void a(int i, e eVar, int i2, int i3, String str, ay ayVar, Image[] imageArr, int i4) {
        if (b(i, i2)) {
            if (ayVar != null) {
                eVar.a(i2, i3, str, ayVar, i4);
            } else {
                eVar.a(i2, i3, str, imageArr, i4);
            }
            if (i == 0) {
                boolean z = false;
                if (i2 == 1) {
                    if (!b(0, 1) || !this.R) {
                        z = true;
                    }
                } else if (i2 == 0 && this.R) {
                    z = true;
                }
                if (z) {
                    int[] iArr = {300, 300, 300, 300, 1000, 300};
                    if (eVar.f103e == null) {
                        eVar.f103e = new int[eVar.ae][];
                    }
                    eVar.f103e[i2] = iArr;
                    ax axVar = this.f164p;
                    if (eVar.f71a == null) {
                        eVar.f71a = new ax[eVar.ae];
                    }
                    eVar.f71a[i2] = axVar;
                }
            }
        }
    }

    public final void a(int i, e eVar, int i2, String str, ay ayVar, Image[] imageArr, String[] strArr, ay ayVar2, Image[] imageArr2, int i3) {
        if (b(i, i2)) {
            if (ayVar == null && ayVar2 == null) {
                eVar.a(i2, str, imageArr, strArr, imageArr2, i3);
                return;
            }
            eVar.a(i2, str, (Image[]) null, strArr, (Image[]) null, i3);
            eVar.f97G[i2] = Math.max(eVar.f97G[i2], ayVar2 != null ? ayVar2.D() : 0);
            eVar.f89a[i2] = ayVar;
            eVar.f100b[i2] = ayVar2;
        }
    }

    public final void a(int i, e eVar, int i2, String str, ay ayVar, Image[] imageArr, int i3, int i4, int i5) {
        if (b(i, i2)) {
            if (ayVar == null) {
                eVar.a(i2, str, imageArr, i3, i4, i5);
            } else {
                eVar.a(i2, str, (Image[]) null, i3, i4, i5);
                eVar.f89a[i2] = ayVar;
            }
        }
    }

    public static void a(e eVar, int i) {
        eVar.e(i);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m44a(e eVar) {
        int iE = ba.E();
        int iH = ba.H();
        int i = 0;
        int i2 = 0;
        if (a(eVar)) {
            int iE2 = ba.E();
            int iH2 = ba.H() - ba.G();
            iE = eVar.d(iE2);
            iH = eVar.b(iE, iH2);
            i = (iE2 - iE) >> 1;
            i2 = (iH2 - iH) >> 1;
        }
        eVar.b(i, i2, iE, iH);
    }

    public static boolean g(int i) {
        switch (i) {
            case 7:
            case 8:
            case 27:
            case 28:
                return false;
            default:
                return true;
        }
    }

    public final void b(Graphics graphics, int i, int i2) {
        int iE = ba.E();
        int iH = ba.H();
        int i3 = (iE * 17) / 27;
        int iMax = Math.max(iH / 37, 5);
        int i4 = (iE - i3) >> 1;
        int i5 = (iH - iMax) >> 1;
        int i6 = (i3 * i) / 100;
        if (i2 == 43 || i2 == 47) {
            int i7 = (iH * 38) / 50;
            e.a(graphics, 0, 0, iE, i7, this.ad[0], this.ad[1], 1);
            e.a(graphics, 0, i7, iE, iH - i7, this.ad[2], this.ad[3], 1);
            i5 = (i7 - iMax) >> 1;
        } else {
            e.a(graphics, 0, 0, iE, iH, this.ad[0], this.ad[1], 1);
        }
        graphics.setColor(this.ad[0]);
        graphics.fillRect(i4, i5, i3, iMax);
        graphics.setColor(this.cU);
        graphics.fillRect(i4, i5, i6, iMax);
        if (ba.G() > 0) {
            c(graphics);
        }
    }

    public final void a(int i, int i2, int i3, Graphics graphics) {
        int iE = ba.E();
        int iH = ba.H();
        if (this.f165N == null) {
            this.bQ = iE >> 2;
            this.bQ += iE % this.bQ;
            this.bR = iH >> 2;
            this.bR += iH % this.bR;
            this.f165N = new int[this.bQ * this.bR];
        }
        int i4 = (i & 16777215) | (((i2 * 255) / 400) << 24);
        int length = this.f165N.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            } else {
                this.f165N[length] = i4;
            }
        }
        graphics.setClip(0, 0, iE, iH);
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= iH) {
                return;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 < iE) {
                    graphics.drawRGB(this.f165N, 0, this.bQ, i8, i6, this.bQ, this.bR, true);
                    i7 = i8 + this.bQ;
                }
            }
            i5 = i6 + this.bR;
        }
    }

    private void c(Graphics graphics) {
        if (ba.r(1) == -1 && (ba.r(3) == -1 || ba.r(3) == 9)) {
            return;
        }
        if (this.ac == null) {
            this.cQ = ba.E() >> 2;
            this.cQ += ba.E() % this.cQ;
            this.cR = ba.G();
            this.ac = new int[this.cQ * this.cR];
            for (int i = 0; i < this.ac.length; i++) {
                this.ac[i] = 855638016;
            }
        }
        graphics.setClip(0, 0, ba.E(), ba.H());
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= ba.E()) {
                return;
            }
            graphics.drawRGB(this.ac, 0, this.cQ, i3, ba.H() - this.cR, this.cQ, this.cR, true);
            i2 = i3 + this.cQ;
        }
    }

    public final boolean h(int i) {
        if (this.f160a.cF == 0 && i < 12) {
            return false;
        }
        if ((this.f160a.cG == 0 && i >= 12) || this.j[i] || this.X) {
            return false;
        }
        this.j[i] = true;
        if (this.e == null) {
            this.e = new e();
            this.e.b(1, 1, 3);
            this.e.e(2);
            this.e.f79v[0] = 1;
        }
        this.e.a(0, 1, this.f[i], (ay) null, 0);
        this.e.a((ba.E() * 9) / 10, ((ba.H() - (ba.G() << 1)) * 9) / 10, false);
        this.cT = 0;
        this.X = true;
        s(0);
        this.S = false;
        bd.f61b.aa();
        return true;
    }

    private void s(int i) {
        if (this.X) {
            if (this.cT < 1000) {
                ba.U();
                return;
            } else {
                this.e.d();
                return;
            }
        }
        if (i == 40) {
            this.f160a.l();
        } else if (i == 43 || i == 47) {
            this.f158a.l();
        }
    }
}
