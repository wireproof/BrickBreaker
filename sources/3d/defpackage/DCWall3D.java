package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-3d.jar:DCWall3D.class */
public class DCWall3D extends s {
    private i a;
    private i b;
    private i c;
    private boolean V;
    private boolean J;
    private int bM;
    private int bN;
    private int cF;
    private boolean W;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static long f0a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static long f1b;
    public static l i;
    public static l j;
    public static l k;
    public static l l;
    public static int cG;
    private static int cH;
    private static int cJ;
    private static boolean Y;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static b f2a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static a f3b;
    private static l m;
    private static l n;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Object[] f4b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static Object[] f5c;
    private static boolean X = true;
    private static int cI = 0;
    private static int cK = 3000;
    private static int[] ar = {55, 52, 54, 52, 55, 54, 54, 52};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x046f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0483  */
    /* JADX WARN: Code duplicated, block: B:104:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:108:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:110:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:113:0x0504  */
    /* JADX WARN: Code duplicated, block: B:118:0x0523  */
    /* JADX WARN: Code duplicated, block: B:119:0x0528  */
    /* JADX WARN: Code duplicated, block: B:121:0x052e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0538  */
    /* JADX WARN: Code duplicated, block: B:124:0x053f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0544  */
    /* JADX WARN: Code duplicated, block: B:127:0x054b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0555  */
    /* JADX WARN: Code duplicated, block: B:130:0x056d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0585  */
    /* JADX WARN: Code duplicated, block: B:135:0x059e  */
    /* JADX WARN: Code duplicated, block: B:137:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:138:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:142:0x05dc A[LOOP:7: B:140:0x05d6->B:142:0x05dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0632  */
    /* JADX WARN: Code duplicated, block: B:147:0x0642  */
    /* JADX WARN: Code duplicated, block: B:149:0x0654  */
    /* JADX WARN: Code duplicated, block: B:151:0x065c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0676  */
    /* JADX WARN: Code duplicated, block: B:154:0x0688  */
    /* JADX WARN: Code duplicated, block: B:161:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:163:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:165:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:166:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:168:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:169:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:171:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:172:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:174:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:179:0x0712  */
    /* JADX WARN: Code duplicated, block: B:204:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:208:0x07de  */
    /* JADX WARN: Code duplicated, block: B:210:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:212:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:214:0x0804  */
    /* JADX WARN: Code duplicated, block: B:215:0x0809  */
    /* JADX WARN: Code duplicated, block: B:217:0x081a  */
    /* JADX WARN: Code duplicated, block: B:218:0x081f A[PHI: r14
      0x081f: PHI (r14v1 int) = 
      (r14v0 int)
      (r14v0 int)
      (r14v0 int)
      (r14v0 int)
      (r14v0 int)
      (r14v2 int)
      (r14v0 int)
      (r14v0 int)
      (r14v0 int)
      (r14v0 int)
     binds: [B:67:0x036d, B:216:0x0817, B:213:0x0801, B:207:0x07db, B:160:0x06a9, B:126:0x0548, B:95:0x0455, B:85:0x0428, B:72:0x03e5, B:69:0x03d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:220:0x082a  */
    /* JADX WARN: Code duplicated, block: B:222:0x084b  */
    /* JADX WARN: Code duplicated, block: B:225:0x086a  */
    /* JADX WARN: Code duplicated, block: B:264:0x0515 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0515 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x04ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x03da  */
    /* JADX WARN: Code duplicated, block: B:73:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x0405  */
    /* JADX WARN: Code duplicated, block: B:80:0x040a  */
    /* JADX WARN: Code duplicated, block: B:81:0x040f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0420  */
    /* JADX WARN: Code duplicated, block: B:84:0x0425  */
    /* JADX WARN: Code duplicated, block: B:86:0x042b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0430  */
    /* JADX WARN: Code duplicated, block: B:89:0x0439  */
    /* JADX WARN: Code duplicated, block: B:90:0x043d  */
    /* JADX WARN: Code duplicated, block: B:93:0x044d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0452  */
    /* JADX WARN: Code duplicated, block: B:96:0x0458  */
    /* JADX WARN: Code duplicated, block: B:97:0x045d  */
    /* JADX WARN: Code duplicated, block: B:99:0x046a  */
    @Override // defpackage.s
    public final void k(int i2) {
        int iY;
        int i3;
        int iM53c;
        char c;
        f fVar;
        char c2;
        char c3;
        b bVar;
        boolean z;
        int[] iArrM14a;
        String string;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iA;
        int iB;
        int i9;
        boolean z2;
        int iC;
        int iV;
        int iM8a;
        boolean z3;
        int i10;
        if (!this.V) {
            if (!this.J) {
                this.bM = 6;
                this.bN = 0;
                this.J = true;
                return;
            }
            if (this.bN >= this.bM) {
                this.V = true;
                this.J = false;
                this.c = this.a;
                aA();
                return;
            }
            switch (this.bN) {
                case 0:
                    c.initialize();
                    break;
                case 1:
                    try {
                        Font font = Font.getFont(32, 0, 8);
                        Font font2 = Font.getFont(32, 1, 8);
                        Font font3 = Font.getFont(32, 1, 0);
                        Image image = p.getImage(131106);
                        Image image2 = p.getImage(131104);
                        Image image3 = p.getImage(131108);
                        i = new l(image, p.m32a(131107), font, 0, -1);
                        j = new l(image2, p.m32a(131105), font2, 0, 16777215);
                        k = new l(image2, p.m32a(131105), font3, 0, 16777215);
                        if (image3 != null) {
                            l = new l(image3, p.m32a(131109), font3, 65280, -1);
                        } else {
                            l = j;
                        }
                        l lVar = k;
                        l lVar2 = i;
                        l lVar3 = j;
                        f.f29a = lVar;
                        f.f30b = lVar2;
                        f.f31c = lVar3;
                        p.a(j);
                    } catch (IOException unused) {
                    }
                    break;
                case 2:
                    short[][] sArrA = c.a(new int[]{196637, 196637, 196637}, false);
                    short[][] sArrA2 = c.a(new int[]{262183, 262183, 262183}, false);
                    n nVar = new n(sArrA, true);
                    n nVar2 = new n(sArrA2, true);
                    f.a = nVar;
                    f.b = nVar2;
                    f.k = 0;
                    for (int i11 = 0; i11 < nVar.d.length; i11++) {
                        nVar.b(i11, -1, true);
                        f.k = Math.max(f.k, nVar.k[3] + 2);
                    }
                    f.l = 0;
                    for (int i12 = 0; i12 < nVar2.d.length; i12++) {
                        nVar2.b(i12, -1, true);
                        f.l = Math.max(f.l, nVar2.k[3] + 2);
                    }
                    short[][] sArrA3 = c.a(new int[]{262151, 262151, 262151}, false);
                    short[][] sArrA4 = c.a(new int[]{196628, 196628, 196628}, false);
                    n nVar3 = new n(sArrA3, true);
                    n nVar4 = new n(sArrA4, true);
                    f.u = 0;
                    f.v = 0;
                    for (int i13 = 0; i13 < nVar3.d.length; i13++) {
                        nVar3.b(i13, -1, true);
                        f.u = Math.max(f.u, nVar3.k[2] + 2);
                    }
                    for (int i14 = 0; i14 < nVar4.d.length; i14++) {
                        nVar4.b(i14, -1, true);
                        f.v = Math.max(f.v, nVar4.k[2] + 2);
                    }
                    f.c = nVar3;
                    f.d = nVar4;
                    break;
                case 3:
                    Object[] objArr = new Object[10];
                    a(objArr, this, k);
                    this.a = new i(65536, objArr);
                    break;
                case 4:
                    O();
                    break;
                case 5:
                    for (int i15 = 0; i15 < c.a(); i15++) {
                        c.d();
                    }
                    break;
            }
            this.bN++;
            return;
        }
        if (this.c != this.b) {
            this.b = this.c;
        }
        if (this.b != null) {
            i iVar = this.b;
            if (iVar.bG != -1) {
                iVar.D();
            } else {
                Object[] objArr2 = iVar.a;
                int i16 = iVar.bF;
                int i17 = i2;
                if (i16 != 31) {
                    s.ay = true;
                }
                if (!((boolean[]) objArr2[5])[6]) {
                    long j2 = 0;
                    ((boolean[]) objArr2[5])[2] = false;
                    if (!((boolean[]) objArr2[5])[0]) {
                        switch (i16) {
                            case 24:
                            case 25:
                                i10 = cK - i17;
                                cK = i10;
                                if (i10 < 0) {
                                    i3 = -2;
                                } else {
                                    if (((int[]) objArr2[3])[4] > 0) {
                                        ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                        if (((int[]) objArr2[3])[4] <= 0) {
                                            ((f) objArr2[7]).i();
                                            objArr2[7] = null;
                                        }
                                    }
                                    i3 = -1;
                                }
                                break;
                            case 26:
                            default:
                                if (((int[]) objArr2[3])[4] > 0) {
                                    ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                    if (((int[]) objArr2[3])[4] <= 0) {
                                        ((f) objArr2[7]).i();
                                        objArr2[7] = null;
                                    }
                                }
                                i3 = -1;
                                break;
                            case 27:
                                s.ay = true;
                                c = 0;
                                j.bU += i17;
                                if (j.f130d.length == 0) {
                                    c2 = 2;
                                } else {
                                    fVar = null;
                                    if (j.bS >= 0) {
                                        fVar = j.d[j.bS];
                                    } else if (j.bS == -1) {
                                        fVar = j.f131d;
                                    } else if (j.bS == -2) {
                                        fVar = j.e;
                                    }
                                    if (j.c == null) {
                                        j.bR = j.bS;
                                        f fVar2 = fVar;
                                        j.c = fVar2;
                                        fVar2.g();
                                    } else {
                                        j.bR = j.bS;
                                        f fVar3 = fVar;
                                        j.c = fVar3;
                                        fVar3.g();
                                    }
                                    if (j.L) {
                                        c = 1;
                                        j.L = false;
                                    }
                                    if (c != 0) {
                                        j.bR = 0;
                                        j.bS = 0;
                                        p.L();
                                        j.c = null;
                                        j.d = null;
                                        j.f131d = null;
                                        j.e = null;
                                        j.b = null;
                                        j.f132c = null;
                                    }
                                    c2 = c;
                                }
                                c3 = c2;
                                if (c2 != 0) {
                                    if (c3 == 1) {
                                        ((boolean[]) objArr2[5])[1] = true;
                                    }
                                    i3 = -3;
                                } else {
                                    if (((int[]) objArr2[3])[4] > 0) {
                                        ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                        if (((int[]) objArr2[3])[4] <= 0) {
                                            ((f) objArr2[7]).i();
                                            objArr2[7] = null;
                                        }
                                    }
                                    i3 = -1;
                                }
                                break;
                            case 28:
                            case 29:
                            case 30:
                            case 40:
                            case 41:
                                iM8a = f3b.m8a(i17);
                                if (iM8a != 0) {
                                    if (iM8a == 4) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    ((boolean[]) objArr2[5])[5] = z3;
                                    if (i16 == 30) {
                                        i3 = -3;
                                    } else {
                                        i3 = -2;
                                    }
                                } else {
                                    if (((int[]) objArr2[3])[4] > 0) {
                                        ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                        if (((int[]) objArr2[3])[4] <= 0) {
                                            ((f) objArr2[7]).i();
                                            objArr2[7] = null;
                                        }
                                    }
                                    i3 = -1;
                                }
                                break;
                            case 31:
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                f0a = j2;
                                i5 = (int) (jCurrentTimeMillis - f1b);
                                i17 = i5;
                                if (i5 >= 25) {
                                    f1b = f0a;
                                    cH += i17;
                                    int iMin = Math.min(i17, 80);
                                    q.dl += iMin;
                                    i6 = 0;
                                    int i18 = cI + iMin;
                                    cI = i18;
                                    i7 = i18 / 25;
                                    cI -= i7 * 25;
                                    cJ++;
                                    if (cH >= 1000) {
                                        cH = 0;
                                        cJ = 0;
                                    }
                                    System.currentTimeMillis();
                                    i8 = 0;
                                    while (true) {
                                        if (i8 >= i7) {
                                            if (i16 == 37) {
                                                iB = q.b(f4b, 25);
                                                i6 = iB;
                                                if (iB != -1) {
                                                    i3 = -2;
                                                    break;
                                                }
                                            } else {
                                                iA = q.a(25);
                                                i6 = iA;
                                                if (iA == 0) {
                                                }
                                            }
                                            i8++;
                                        }
                                        System.currentTimeMillis();
                                        q.dV = 0;
                                        if (i6 == 4) {
                                            i3 = 17;
                                        } else if (i6 == 5) {
                                            q.u(-1);
                                            i3 = 19;
                                        } else if (i6 == 6) {
                                            i3 = 20;
                                        } else if (i6 == 7) {
                                            q.u(-1);
                                            i3 = 21;
                                        } else {
                                            if (((int[]) objArr2[3])[4] > 0) {
                                                ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                                if (((int[]) objArr2[3])[4] <= 0) {
                                                    ((f) objArr2[7]).i();
                                                    objArr2[7] = null;
                                                }
                                            }
                                            i3 = -1;
                                        }
                                    }
                                } else {
                                    i3 = -1;
                                }
                                break;
                            case 32:
                            case 39:
                                bVar = f2a;
                                s.ay = true;
                                z = false;
                                if (bVar.f17a == null) {
                                    bVar.a();
                                }
                                if (bVar.f16a != bVar.f17a[b.f15a[3]]) {
                                    bVar.f16a = bVar.f17a[b.f15a[3]];
                                    if (b.f15a[3] == 1) {
                                        if (b.f15a[0] > 1) {
                                            bVar.b[1] = 0;
                                        } else {
                                            bVar.b[1] = -7;
                                        }
                                        bVar.f16a.a(b.a[b.f15a[2]][0], null);
                                        string = "";
                                        for (i4 = 1; i4 <= 1; i4++) {
                                            string = new StringBuffer().append(string).append(b.a(b.f15a[2], 1)).toString();
                                        }
                                        bVar.f16a.a(0, 1, string, (Image[]) null, -1);
                                        bVar.f16a.a(p.i(), p.m(), false);
                                    }
                                    bVar.f16a.g();
                                } else {
                                    iArrM14a = bVar.f16a.m14a(i17);
                                    if (iArrM14a != null) {
                                        z = false;
                                        if (iArrM14a[0] == 0) {
                                            if (iArrM14a[1] == 5) {
                                                b.f15a[3] = bVar.b[b.f15a[3]];
                                                if (b.f15a[3] == -7) {
                                                    z = true;
                                                    bVar.f16a = null;
                                                    bVar.f17a = null;
                                                }
                                            }
                                        } else if (iArrM14a[0] == 1) {
                                            b.f15a[2] = iArrM14a[1];
                                            b.f15a[3] = 1;
                                        }
                                    }
                                }
                                if (z) {
                                    i3 = -2;
                                } else {
                                    if (((int[]) objArr2[3])[4] > 0) {
                                        ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                        if (((int[]) objArr2[3])[4] <= 0) {
                                            ((f) objArr2[7]).i();
                                            objArr2[7] = null;
                                        }
                                    }
                                    i3 = -1;
                                }
                                break;
                            case 33:
                            case 34:
                                iV = q.v(i17);
                                q.fk = 0;
                                if (iV == 1) {
                                    i3 = 16;
                                } else if (iV == 2) {
                                    i3 = -3;
                                } else {
                                    if (((int[]) objArr2[3])[4] > 0) {
                                        ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                        if (((int[]) objArr2[3])[4] <= 0) {
                                            ((f) objArr2[7]).i();
                                            objArr2[7] = null;
                                        }
                                    }
                                    i3 = -1;
                                }
                                break;
                            case 35:
                            case 36:
                                if (i16 == 36) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                iC = q.c(i17, z2);
                                q.fw = 0;
                                if (iC == 1) {
                                    i3 = 14;
                                } else if (iC == 2) {
                                    i3 = -3;
                                } else {
                                    if (((int[]) objArr2[3])[4] > 0) {
                                        ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                        if (((int[]) objArr2[3])[4] <= 0) {
                                            ((f) objArr2[7]).i();
                                            objArr2[7] = null;
                                        }
                                    }
                                    i3 = -1;
                                }
                                break;
                            case 37:
                                i9 = cK - i17;
                                cK = i9;
                                if (i9 < 0) {
                                    i3 = -2;
                                } else {
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    f0a = j2;
                                    i5 = (int) (jCurrentTimeMillis2 - f1b);
                                    i17 = i5;
                                    if (i5 >= 25) {
                                        f1b = f0a;
                                        cH += i17;
                                        int iMin2 = Math.min(i17, 80);
                                        q.dl += iMin2;
                                        i6 = 0;
                                        int i19 = cI + iMin2;
                                        cI = i19;
                                        i7 = i19 / 25;
                                        cI -= i7 * 25;
                                        cJ++;
                                        if (cH >= 1000) {
                                            cH = 0;
                                            cJ = 0;
                                        }
                                        System.currentTimeMillis();
                                        i8 = 0;
                                        while (true) {
                                            if (i8 >= i7) {
                                                if (i16 == 37) {
                                                    iB = q.b(f4b, 25);
                                                    i6 = iB;
                                                    if (iB != -1) {
                                                        i3 = -2;
                                                        break;
                                                    }
                                                } else {
                                                    iA = q.a(25);
                                                    i6 = iA;
                                                    if (iA == 0) {
                                                    }
                                                }
                                                i8++;
                                            }
                                            System.currentTimeMillis();
                                            q.dV = 0;
                                            if (i6 == 4) {
                                                i3 = 17;
                                            } else if (i6 == 5) {
                                                q.u(-1);
                                                i3 = 19;
                                            } else if (i6 == 6) {
                                                i3 = 20;
                                            } else if (i6 == 7) {
                                                q.u(-1);
                                                i3 = 21;
                                            } else {
                                                if (((int[]) objArr2[3])[4] > 0) {
                                                    ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                                    if (((int[]) objArr2[3])[4] <= 0) {
                                                        ((f) objArr2[7]).i();
                                                        objArr2[7] = null;
                                                    }
                                                }
                                                i3 = -1;
                                            }
                                        }
                                    } else {
                                        i3 = -1;
                                    }
                                }
                                break;
                            case 38:
                                iY = q.y(i17);
                                q.fK = 0;
                                if (iY == 1) {
                                    i3 = 15;
                                } else {
                                    if (((int[]) objArr2[3])[4] > 0) {
                                        ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                        if (((int[]) objArr2[3])[4] <= 0) {
                                            ((f) objArr2[7]).i();
                                            objArr2[7] = null;
                                        }
                                    }
                                    i3 = -1;
                                }
                                break;
                            case 42:
                                iM53c = q.m53c(f5c, i17);
                                if (iM53c != -1) {
                                    i3 = iM53c;
                                } else {
                                    if (((int[]) objArr2[3])[4] > 0) {
                                        ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                        if (((int[]) objArr2[3])[4] <= 0) {
                                            ((f) objArr2[7]).i();
                                            objArr2[7] = null;
                                        }
                                    }
                                    i3 = -1;
                                }
                                break;
                        }
                    } else {
                        j2 = 0;
                        ((boolean[]) objArr2[5])[0] = false;
                        if (i16 != 31) {
                            m4b(objArr2, i16);
                            switch (i16) {
                                case 24:
                                case 25:
                                    i10 = cK - i17;
                                    cK = i10;
                                    if (i10 < 0) {
                                        i3 = -2;
                                    } else {
                                        if (((int[]) objArr2[3])[4] > 0) {
                                            ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                            if (((int[]) objArr2[3])[4] <= 0 && ((f) objArr2[7]) != null) {
                                                ((f) objArr2[7]).i();
                                                objArr2[7] = null;
                                            }
                                        }
                                        i3 = -1;
                                    }
                                    break;
                                case 26:
                                default:
                                    if (((int[]) objArr2[3])[4] > 0) {
                                        ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                        if (((int[]) objArr2[3])[4] <= 0) {
                                            ((f) objArr2[7]).i();
                                            objArr2[7] = null;
                                        }
                                    }
                                    i3 = -1;
                                    break;
                                case 27:
                                    s.ay = true;
                                    c = 0;
                                    j.bU += i17;
                                    if (j.f130d.length == 0) {
                                        c2 = 2;
                                    } else {
                                        fVar = null;
                                        if (j.bS >= 0) {
                                            fVar = j.d[j.bS];
                                        } else if (j.bS == -1) {
                                            fVar = j.f131d;
                                        } else if (j.bS == -2) {
                                            fVar = j.e;
                                        }
                                        if (j.c == null && j.c == fVar) {
                                            int[] iArrM14a2 = j.c.m14a(i17);
                                            if (iArrM14a2 != null) {
                                                if (j.bR < 0) {
                                                    if (j.bR == -2) {
                                                        j.bS = j.bT;
                                                    } else {
                                                        c = 2;
                                                    }
                                                } else if (iArrM14a2[1] == j.bV) {
                                                    String str = j.f130d[j.bR];
                                                    j.f129d = str;
                                                    if (str.equals("nolink")) {
                                                        j.bT = j.bR;
                                                        j.bS = -2;
                                                    } else if (!j.L) {
                                                        j.L = true;
                                                        new Thread(new j()).start();
                                                    }
                                                } else {
                                                    c = 2;
                                                }
                                            }
                                        } else {
                                            j.bR = j.bS;
                                            f fVar4 = fVar;
                                            j.c = fVar4;
                                            fVar4.g();
                                        }
                                        if (j.L && j.M) {
                                            c = 1;
                                            j.L = false;
                                        }
                                        if (c != 0) {
                                            j.bR = 0;
                                            j.bS = 0;
                                            p.L();
                                            j.c = null;
                                            j.d = null;
                                            j.f131d = null;
                                            j.e = null;
                                            j.b = null;
                                            j.f132c = null;
                                        }
                                        c2 = c;
                                    }
                                    c3 = c2;
                                    if (c2 != 0) {
                                        if (c3 == 1) {
                                            ((boolean[]) objArr2[5])[1] = true;
                                        }
                                        i3 = -3;
                                    } else {
                                        if (((int[]) objArr2[3])[4] > 0) {
                                            ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                            if (((int[]) objArr2[3])[4] <= 0) {
                                                ((f) objArr2[7]).i();
                                                objArr2[7] = null;
                                            }
                                        }
                                        i3 = -1;
                                    }
                                    break;
                                case 28:
                                case 29:
                                case 30:
                                case 40:
                                case 41:
                                    iM8a = f3b.m8a(i17);
                                    if (iM8a != 0) {
                                        if (iM8a == 4) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        ((boolean[]) objArr2[5])[5] = z3;
                                        if (i16 == 30) {
                                            i3 = -3;
                                        } else {
                                            i3 = -2;
                                        }
                                    } else {
                                        if (((int[]) objArr2[3])[4] > 0) {
                                            ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                            if (((int[]) objArr2[3])[4] <= 0) {
                                                ((f) objArr2[7]).i();
                                                objArr2[7] = null;
                                            }
                                        }
                                        i3 = -1;
                                    }
                                    break;
                                case 31:
                                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                                    f0a = j2;
                                    i5 = (int) (jCurrentTimeMillis3 - f1b);
                                    i17 = i5;
                                    if (i5 >= 25) {
                                        f1b = f0a;
                                        cH += i17;
                                        int iMin3 = Math.min(i17, 80);
                                        q.dl += iMin3;
                                        i6 = 0;
                                        int i110 = cI + iMin3;
                                        cI = i110;
                                        i7 = i110 / 25;
                                        cI -= i7 * 25;
                                        cJ++;
                                        if (cH >= 1000) {
                                            cH = 0;
                                            cJ = 0;
                                        }
                                        System.currentTimeMillis();
                                        i8 = 0;
                                        while (true) {
                                            if (i8 >= i7) {
                                                if (i16 == 37) {
                                                    iB = q.b(f4b, 25);
                                                    i6 = iB;
                                                    if (iB != -1) {
                                                        i3 = -2;
                                                        break;
                                                    }
                                                } else {
                                                    iA = q.a(25);
                                                    i6 = iA;
                                                    if (iA == 0) {
                                                    }
                                                }
                                                i8++;
                                            }
                                            System.currentTimeMillis();
                                            q.dV = 0;
                                            if (i6 == 4) {
                                                i3 = 17;
                                            } else if (i6 == 5) {
                                                q.u(-1);
                                                i3 = 19;
                                            } else if (i6 == 6) {
                                                i3 = 20;
                                            } else if (i6 == 7) {
                                                q.u(-1);
                                                i3 = 21;
                                            } else {
                                                if (((int[]) objArr2[3])[4] > 0) {
                                                    ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                                    if (((int[]) objArr2[3])[4] <= 0) {
                                                        ((f) objArr2[7]).i();
                                                        objArr2[7] = null;
                                                    }
                                                }
                                                i3 = -1;
                                            }
                                        }
                                    } else {
                                        i3 = -1;
                                    }
                                    break;
                                case 32:
                                case 39:
                                    bVar = f2a;
                                    s.ay = true;
                                    z = false;
                                    if (bVar.f17a == null) {
                                        bVar.a();
                                    }
                                    if (bVar.f16a != bVar.f17a[b.f15a[3]]) {
                                        bVar.f16a = bVar.f17a[b.f15a[3]];
                                        if (b.f15a[3] == 1) {
                                            if (b.f15a[0] > 1) {
                                                bVar.b[1] = 0;
                                            } else {
                                                bVar.b[1] = -7;
                                            }
                                            bVar.f16a.a(b.a[b.f15a[2]][0], null);
                                            string = "";
                                            while (i4 <= 1) {
                                                string = new StringBuffer().append(string).append(b.a(b.f15a[2], 1)).toString();
                                            }
                                            bVar.f16a.a(0, 1, string, (Image[]) null, -1);
                                            bVar.f16a.a(p.i(), p.m(), false);
                                        }
                                        bVar.f16a.g();
                                    } else {
                                        iArrM14a = bVar.f16a.m14a(i17);
                                        if (iArrM14a != null) {
                                            z = false;
                                            if (iArrM14a[0] == 0) {
                                                if (iArrM14a[1] == 5) {
                                                    b.f15a[3] = bVar.b[b.f15a[3]];
                                                    if (b.f15a[3] == -7) {
                                                        z = true;
                                                        bVar.f16a = null;
                                                        bVar.f17a = null;
                                                    }
                                                }
                                            } else if (iArrM14a[0] == 1 && b.f15a[3] == 0) {
                                                b.f15a[2] = iArrM14a[1];
                                                b.f15a[3] = 1;
                                            }
                                        }
                                    }
                                    if (z) {
                                        i3 = -2;
                                    } else {
                                        if (((int[]) objArr2[3])[4] > 0) {
                                            ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                            if (((int[]) objArr2[3])[4] <= 0) {
                                                ((f) objArr2[7]).i();
                                                objArr2[7] = null;
                                            }
                                        }
                                        i3 = -1;
                                    }
                                    break;
                                case 33:
                                case 34:
                                    iV = q.v(i17);
                                    q.fk = 0;
                                    if (iV == 1) {
                                        i3 = 16;
                                    } else if (iV == 2) {
                                        i3 = -3;
                                    } else {
                                        if (((int[]) objArr2[3])[4] > 0) {
                                            ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                            if (((int[]) objArr2[3])[4] <= 0) {
                                                ((f) objArr2[7]).i();
                                                objArr2[7] = null;
                                            }
                                        }
                                        i3 = -1;
                                    }
                                    break;
                                case 35:
                                case 36:
                                    if (i16 == 36) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    iC = q.c(i17, z2);
                                    q.fw = 0;
                                    if (iC == 1) {
                                        i3 = 14;
                                    } else if (iC == 2) {
                                        i3 = -3;
                                    } else {
                                        if (((int[]) objArr2[3])[4] > 0) {
                                            ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                            if (((int[]) objArr2[3])[4] <= 0) {
                                                ((f) objArr2[7]).i();
                                                objArr2[7] = null;
                                            }
                                        }
                                        i3 = -1;
                                    }
                                    break;
                                case 37:
                                    i9 = cK - i17;
                                    cK = i9;
                                    if (i9 < 0) {
                                        i3 = -2;
                                    } else {
                                        long jCurrentTimeMillis4 = System.currentTimeMillis();
                                        f0a = j2;
                                        i5 = (int) (jCurrentTimeMillis4 - f1b);
                                        i17 = i5;
                                        if (i5 >= 25) {
                                            f1b = f0a;
                                            cH += i17;
                                            int iMin4 = Math.min(i17, 80);
                                            q.dl += iMin4;
                                            i6 = 0;
                                            int i111 = cI + iMin4;
                                            cI = i111;
                                            i7 = i111 / 25;
                                            cI -= i7 * 25;
                                            cJ++;
                                            if (cH >= 1000) {
                                                cH = 0;
                                                cJ = 0;
                                            }
                                            System.currentTimeMillis();
                                            i8 = 0;
                                            while (true) {
                                                if (i8 >= i7) {
                                                    if (i16 == 37) {
                                                        iB = q.b(f4b, 25);
                                                        i6 = iB;
                                                        if (iB != -1) {
                                                            i3 = -2;
                                                            break;
                                                        }
                                                    } else {
                                                        iA = q.a(25);
                                                        i6 = iA;
                                                        if (iA == 0) {
                                                        }
                                                    }
                                                    i8++;
                                                }
                                                System.currentTimeMillis();
                                                q.dV = 0;
                                                if (i6 == 4) {
                                                    i3 = 17;
                                                } else if (i6 == 5) {
                                                    q.u(-1);
                                                    i3 = 19;
                                                } else if (i6 == 6) {
                                                    i3 = 20;
                                                } else if (i6 == 7) {
                                                    q.u(-1);
                                                    i3 = 21;
                                                } else {
                                                    if (((int[]) objArr2[3])[4] > 0) {
                                                        ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                                        if (((int[]) objArr2[3])[4] <= 0) {
                                                            ((f) objArr2[7]).i();
                                                            objArr2[7] = null;
                                                        }
                                                    }
                                                    i3 = -1;
                                                }
                                            }
                                        } else {
                                            i3 = -1;
                                        }
                                    }
                                    break;
                                case 38:
                                    iY = q.y(i17);
                                    q.fK = 0;
                                    if (iY == 1) {
                                        i3 = 15;
                                    } else {
                                        if (((int[]) objArr2[3])[4] > 0) {
                                            ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                            if (((int[]) objArr2[3])[4] <= 0) {
                                                ((f) objArr2[7]).i();
                                                objArr2[7] = null;
                                            }
                                        }
                                        i3 = -1;
                                    }
                                    break;
                                case 42:
                                    iM53c = q.m53c(f5c, i17);
                                    if (iM53c != -1) {
                                        i3 = iM53c;
                                    } else {
                                        if (((int[]) objArr2[3])[4] > 0) {
                                            ((int[]) objArr2[3])[4] = ((int[]) objArr2[3])[4] - i17;
                                            if (((int[]) objArr2[3])[4] <= 0) {
                                                ((f) objArr2[7]).i();
                                                objArr2[7] = null;
                                            }
                                        }
                                        i3 = -1;
                                    }
                                    break;
                            }
                        } else {
                            i3 = 17;
                        }
                    }
                } else {
                    ((boolean[]) objArr2[5])[6] = false;
                    i3 = 0;
                }
                iVar.t(i3);
                if (iVar.f124b != null) {
                    int[] iArrM14a3 = iVar.f124b.m14a(i2);
                    iVar.f128c[iVar.bF] = (byte) iVar.f124b.ai;
                    if (iArrM14a3 != null) {
                        if (iArrM14a3[0] == 1) {
                            iVar.t(iArrM14a3[1]);
                        } else if (iArrM14a3[0] == 0) {
                            boolean z4 = false;
                            short[] sArr = iVar.f125a[iVar.bF];
                            if (sArr != null) {
                                int i20 = 0;
                                while (i20 < sArr.length) {
                                    int i21 = i20;
                                    int i22 = i20 + 1;
                                    short s = sArr[i21];
                                    i20 = i22 + 1;
                                    short s2 = sArr[i22];
                                    if (s == iArrM14a3[1]) {
                                        iVar.t(s2);
                                        z4 = true;
                                    }
                                }
                            }
                            if (!z4 && p.g(iArrM14a3[1]) == 2) {
                                iVar.t(-3);
                            }
                        }
                    }
                }
            }
            if (this.cF != -1) {
                this.cF = this.b.e();
            }
        }
    }

    private void O() {
        if (this.W) {
            return;
        }
        byte[] bArrA = p.a(393240);
        int i2 = 1;
        for (int i3 = bArrA[0]; i3 > 0; i3--) {
            int i4 = i2;
            int i5 = i2 + 1;
            byte b = bArrA[i4];
            int i6 = i5 + 1;
            int i7 = (bArrA[i5] & 255) << 24;
            int i8 = i6 + 1;
            int i9 = i7 | ((bArrA[i6] & 255) << 16);
            int i10 = i8 + 1;
            int i11 = i9 | ((bArrA[i8] & 255) << 8);
            int i12 = i10 + 1;
            int i13 = i11 | (bArrA[i10] & 255);
            int i14 = i12 + 1;
            int i15 = (bArrA[i12] & 255) << 24;
            int i16 = i14 + 1;
            int i17 = i15 | ((bArrA[i14] & 255) << 16);
            int i18 = i16 + 1;
            int i19 = i17 | ((bArrA[i16] & 255) << 8);
            int i20 = i18 + 1;
            int i21 = i19 | (bArrA[i18] & 255);
            i2 = i20 + 1;
            byte b2 = bArrA[i20];
            Image image = null;
            if (i21 != -1) {
                Image imageA = c.a(i21, 0, 65536);
                image = imageA;
                if (imageA == null) {
                    image = p.getImage(i21);
                }
            }
            p.a(b, i13, image, b2);
        }
        this.W = true;
    }

    @Override // defpackage.s
    public final void a(Graphics graphics) {
        if (this.J) {
            a(graphics, (this.bN * 50) / this.bM);
            return;
        }
        if (this.b != null) {
            if (this.cF != -1) {
                a(graphics, 100);
                return;
            }
            i iVar = this.b;
            if (iVar.J) {
                int iMin = iVar.K ? 100 + (0 / iVar.bM) : Math.min(100, ((iVar.bN + 1) * 100) / iVar.bM);
                if (i.bQ != -1) {
                    iMin = i.bQ;
                }
                if (iVar.K) {
                    d(graphics, iMin, iVar.bG);
                } else {
                    d(graphics, iMin, iVar.bG);
                }
            } else {
                Object[] objArr = iVar.a;
                int i2 = iVar.bF;
                switch (i2) {
                    case 24:
                        graphics.setColor(16777215);
                        graphics.fillRect(0, 0, p.i(), p.m());
                        graphics.drawImage((Image) objArr[0], p.i() >> 1, p.m() >> 1, 3);
                        break;
                    case 25:
                        graphics.setColor(16777215);
                        graphics.fillRect(0, 0, p.i(), p.m());
                        int height = n.getHeight();
                        for (int i3 = 0; i3 < ((String[]) objArr[1]).length; i3++) {
                            n.a(graphics, ((String[]) objArr[1])[i3], p.i() >> 1, ((p.m() - (((String[]) objArr[1]).length * height)) >> 1) + (i3 * (height + 1)), 17);
                        }
                        break;
                    case 27:
                        e.a(graphics);
                        h.B();
                        e.b(graphics);
                        if (j.bR < 0) {
                            if (j.bR == -1) {
                                j.f131d.a(graphics, 0, 0);
                            }
                            if (j.bR == -2) {
                                j.e.a(graphics, 0, 0);
                            }
                        } else if (j.c != null) {
                            j.c.a(graphics, j.bW > 1 ? j.f132c.getWidth() + 5 : 0, 0);
                            if (j.bR > -1 && j.bW > 1) {
                                int i4 = (j.bU / 120) % 5;
                                graphics.drawImage(j.b, 5 - i4, p.m() / 2, 6);
                                graphics.drawImage(j.f132c, (p.i() - 5) + i4, p.m() / 2, 10);
                            }
                        }
                        break;
                    case 28:
                    case 29:
                    case 30:
                    case 40:
                    case 41:
                        c(graphics);
                        a aVar = f3b;
                        if (aVar.f13e && !aVar.f && aVar.a != null) {
                            aVar.a.a(graphics, 0, 0);
                        }
                        break;
                    case 31:
                        h.a(graphics);
                        break;
                    case 32:
                    case 39:
                        c(graphics);
                        b bVar = f2a;
                        if (bVar.f16a != null) {
                            bVar.f16a.a(graphics, 0, 0);
                        }
                        break;
                    case 33:
                    case 34:
                        q.a(graphics, i2 == 34);
                        break;
                    case 35:
                    case 36:
                        q.b(graphics, i2 == 36);
                        break;
                    case 37:
                        q.a(f4b, graphics);
                        break;
                    case 38:
                        q.e(graphics);
                        break;
                    case 42:
                        q.b(f5c, graphics);
                        break;
                }
                if (iVar.f124b != null) {
                    Object[] objArr2 = iVar.a;
                    int i5 = iVar.bF;
                    f fVar = iVar.f124b;
                    if (a(fVar)) {
                        graphics.setColor(16777215);
                        graphics.fillRect(0, 0, p.i(), p.m());
                    } else {
                        c(graphics);
                    }
                    fVar.a(graphics);
                    if (i5 == 0 && ((f) objArr2[7]) != null) {
                        ((f) objArr2[7]).a(graphics);
                    }
                }
            }
            if (iVar.bF == 31 || iVar.bF == 5 || iVar.bF == 6 || iVar.bF == 37 || iVar.bF == 24 || iVar.bF == 28) {
                return;
            }
            h.b(graphics);
        }
    }

    @Override // defpackage.s
    public final void b(int i2, int i3) {
        if (this.J || this.b == null) {
            return;
        }
        i iVar = this.b;
        if (iVar.J) {
            return;
        }
        if (iVar.f124b != null) {
            iVar.f124b.m15b(i2, i3);
        }
        if (iVar.a != null) {
            Object[] objArr = iVar.a;
            int i4 = iVar.bF;
            int i5 = p.i(i2);
            boolean z = (i3 == 0 && i5 == 53) || (i3 == 3 && p.g(i2) == 0);
            switch (i4) {
                case 0:
                    if (i3 == 0 && p.d(16) != null) {
                        if (((int[]) objArr[2]) == null) {
                            objArr[2] = new int[ar.length];
                        }
                        ((int[]) objArr[2])[((int[]) objArr[3])[3] % ar.length] = i5;
                        boolean z2 = false;
                        for (int i6 = 0; i6 < ar.length && !z2; i6++) {
                            if (((int[]) objArr[2])[((((int[]) objArr[3])[3] + i6) + 1) % ar.length] != ar[i6]) {
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            Y = true;
                            q.Z = true;
                            int i7 = p.i() - (p.i() >> 2);
                            int iM = (p.m() - (p.m() >> 2)) - p.l();
                            int i8 = (p.i() - i7) >> 1;
                            int iM2 = (p.m() - iM) >> 1;
                            ((int[]) objArr[3])[4] = 2000;
                            objArr[7] = new f();
                            ((f) objArr[7]).a(1, 1, 3);
                            ((f) objArr[7]).a(0, 1, p.c(506), (Image[]) null, -1);
                            ((f) objArr[7]).f38m[0] = 1;
                            ((f) objArr[7]).a(4);
                            ((f) objArr[7]).a(i8, iM2, i7, iM);
                        }
                        ((int[]) objArr[3])[3] = ((int[]) objArr[3])[3] + 1;
                        break;
                    }
                    break;
                case 6:
                    if (i3 == 0) {
                        if (i5 == 50 || i5 == 56) {
                            p.b(p.a()[((f) objArr[8]).ai][1]);
                        }
                    }
                    break;
                case 24:
                case 25:
                case 37:
                    if (z) {
                        cK = 0;
                    }
                    break;
                case 27:
                    if (j.c != null) {
                        if (j.d != null) {
                            int i9 = i3 == 0 ? p.i(i2) : 0;
                            if (j.bR >= 0) {
                                if (i9 == 52) {
                                    int i10 = j.bS - 1;
                                    j.bS = i10;
                                    if (i10 < 0) {
                                        j.bS = j.d.length - 1;
                                    }
                                } else if (i9 == 54) {
                                    int i11 = j.bS + 1;
                                    j.bS = i11;
                                    if (i11 > j.d.length - 1) {
                                        j.bS = 0;
                                    }
                                }
                            }
                        }
                        j.c.m15b(i2, i3);
                    }
                    break;
                case 28:
                case 29:
                case 30:
                case 40:
                case 41:
                    a aVar = f3b;
                    if (aVar.f13e && !aVar.f && aVar.a != null) {
                        aVar.a.m15b(i2, i3);
                        break;
                    }
                    break;
                case 31:
                    q.b(i2, i3);
                    break;
                case 32:
                case 39:
                    b bVar = f2a;
                    if (bVar.f16a != null) {
                        bVar.f16a.m15b(i2, i3);
                    }
                    break;
                case 33:
                case 34:
                    q.c(i2, i3, i4 == 34);
                    break;
                case 35:
                case 36:
                    q.d(i2, i3, i4 == 36);
                    break;
                case 38:
                    q.n(i2, i3);
                    break;
                case 42:
                    if (f5c != null) {
                        q.d(f5c, i2, i3);
                    }
                    break;
            }
        }
    }

    @Override // defpackage.s
    public final void D(int i2) {
        if (this.J || this.b == null) {
            return;
        }
        if (i2 != 1) {
            if (i2 == 5) {
                ((boolean[]) this.b.a[5])[6] = true;
                return;
            }
            return;
        }
        i iVar = this.b;
        Object[] objArr = iVar.a;
        q.U();
        i iVar2 = ((DCWall3D) objArr[4]).a;
        if (iVar2 != null && iVar2.e() == -1) {
            ((boolean[]) objArr[5])[0] = true;
        }
        ((int[]) objArr[3])[0] = -1;
        if (iVar.f124b == null || iVar.J) {
            return;
        }
        iVar.f124b.g();
    }

    @Override // defpackage.s
    public final String[][] b() {
        return new String[][]{new String[]{p.c(441)}, new String[]{p.c(442)}, new String[]{p.c(443)}, new String[]{p.c(444)}, new String[]{p.c(445)}};
    }

    @Override // defpackage.s
    public final String e(int i2) {
        return new StringBuffer().append("").append(i2).toString();
    }

    private void E(int i2) {
        if (this.V) {
            i iVar = this.a;
            int i3 = iVar.bH;
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                } else {
                    iVar.u(i3);
                }
            }
            if (iVar.bG == -1) {
                iVar.bG = iVar.bF;
            }
            iVar.bF = -1;
            iVar.J = false;
        }
        p.C(i2);
        this.W = false;
        O();
    }

    private static void a(Graphics graphics, int i2) {
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, p.i(), p.m());
        int i3 = (p.i() * 88) / 176;
        int iM = (p.m() << 3) / 208;
        int i4 = iM;
        if (iM < 5) {
            i4 = 5;
        }
        int i5 = (p.i() - i3) >> 1;
        int iM2 = (p.m() - i4) >> 1;
        graphics.setColor(0);
        graphics.drawRect(i5, iM2, i3 - 1, i4 - 1);
        graphics.fillRect(i5 + 2, iM2 + 2, ((i3 - 4) * i2) / 100, i4 - 4);
    }

    private static void a(Object[] objArr, DCWall3D dCWall3D, l lVar) {
        objArr[3] = new int[5];
        objArr[5] = new boolean[8];
        ((int[]) objArr[3])[0] = -1;
        ((int[]) objArr[3])[1] = -1;
        ((boolean[]) objArr[5])[5] = false;
        objArr[4] = dCWall3D;
        q.an();
        q.init();
        h.C();
        ((boolean[]) objArr[5])[7] = true;
        h.c(p.i(), p.m());
        h.w();
        h.t();
        f1b = (int) System.currentTimeMillis();
        n = lVar;
        ((boolean[]) objArr[5])[4] = p.d(5) != null;
        f2a = p.m37a();
        f3b = p.m36a();
        ((boolean[]) objArr[5])[5] = (f3b.f13e ? (char) 4 : (char) 2) == 4;
        try {
            m = new l(null, null, Font.getFont(32, 0, 8), 0, -1);
        } catch (IOException unused) {
        }
        byte[] bArrM34a = p.m34a("wallrs");
        if (bArrM34a != null) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArrM34a));
                q.dB = dataInputStream.readInt();
                q.dC = dataInputStream.readInt();
                q.dD = dataInputStream.readInt();
                q.dE = dataInputStream.readInt();
                q.dF = dataInputStream.readInt();
                q.dG = dataInputStream.readInt();
                q.dH = dataInputStream.readInt();
                q.dI = dataInputStream.readInt();
                q.dO = dataInputStream.readInt();
                q.dJ = dataInputStream.readInt();
                q.dL = dataInputStream.readInt();
                q.dK = dataInputStream.readInt();
                q.di = dataInputStream.readInt();
                q.dM = dataInputStream.readInt();
                q.dN = dataInputStream.readInt();
                q.dl = dataInputStream.readInt();
                X = dataInputStream.readByte() == 1;
                int i2 = dataInputStream.readInt();
                q.dP = i2;
                q.dQ = i2;
                q.dh = dataInputStream.readInt();
                cG = dataInputStream.readInt();
                q.dq = dataInputStream.readInt();
                q.dp = dataInputStream.readInt();
                q.ds = dataInputStream.readInt();
                q.dr = dataInputStream.readInt();
                q.dt = dataInputStream.readInt();
                q.cX = dataInputStream.readInt();
                q.f146do = dataInputStream.readInt();
                q.ar();
                for (int i3 = 0; i3 < q.B.length; i3++) {
                    q.aI[i3] = dataInputStream.readByte();
                }
                for (int i4 = 0; i4 < 5; i4++) {
                    if (q.i(i4)) {
                        q.f162h[i4] = true;
                    }
                }
                for (int i5 = 0; i5 < 41; i5++) {
                    q.f145d[i5] = dataInputStream.readByte() == 1;
                }
                q.cQ = dataInputStream.readInt();
            } catch (IOException unused2) {
            }
        } else {
            P();
            Q();
        }
        ((int[]) objArr[3])[0] = -1;
        ((boolean[]) objArr[5])[2] = false;
        if (p.d(7) != null) {
            ((int[]) objArr[3])[1] = p.j();
        } else if (p.a().length == 1) {
            ((int[]) objArr[3])[1] = 0;
        }
        byte[] bArrM34a2 = p.m34a("settings");
        if (bArrM34a2 != null) {
            ((int[]) objArr[3])[1] = bArrM34a2[0];
            ((DCWall3D) objArr[4]).E(((int[]) objArr[3])[1]);
            byte b = bArrM34a2[1];
            p.A(b);
            p.B(b);
            q.ac = bArrM34a2[3] == 1;
            ((boolean[]) objArr[5])[3] = bArrM34a2[4] == 1;
        }
        h.n();
    }

    public static final void a(Object[] objArr, int i2, int i3, f fVar) {
        int i4;
        switch (i3) {
            case 11:
                q.b(fVar);
                break;
            case 25:
                cK = 5000;
                break;
            case 31:
                cI = 0;
                p.L();
                if (q.ab) {
                    p.k(1, 0);
                } else {
                    p.k(9, 0);
                }
                q.U();
                break;
            case 33:
            case 34:
                q.f(i3 == 34);
                break;
            case 35:
            case 36:
                q.a(i3 == 36, q.x(q.n()));
                break;
            case 37:
                cK = 5000000;
                Object[] objArr2 = new Object[14];
                q.b(objArr2);
                f4b = objArr2;
                q.c(objArr2);
                break;
            case 38:
                q.av();
                break;
            case 42:
                if (i2 == 51 || ((i2 == 52 && q.de == 1) || (i2 == 31 && ((int[]) objArr[3])[2] == 5))) {
                    q.aw();
                    Q();
                }
                if (i2 != 51) {
                    if (i2 != 52) {
                        if (i2 != 31) {
                            switch (q.de) {
                                case 1:
                                    i4 = (q.ds == 0 || q.dr <= 0) ? 0 : 3;
                                    break;
                                case 2:
                                    i4 = cG <= 0 ? 0 : 3;
                                    break;
                                default:
                                    i4 = 0;
                                    break;
                            }
                        } else {
                            i4 = ((int[]) objArr[3])[2];
                        }
                    } else {
                        i4 = 1;
                    }
                } else {
                    i4 = 2;
                }
                q.c(f5c, i4, q.de);
                break;
        }
        if (((boolean[]) objArr[5])[1]) {
            ((boolean[]) objArr[5])[1] = false;
        } else {
            p.z(3);
            m4b(objArr, i3);
        }
        objArr[6] = fVar;
    }

    public static final boolean a(Object[] objArr, int i2) {
        switch (i2) {
            case 43:
                return ((int[]) objArr[3])[1] == -1;
            case 44:
                return f3b.a(2);
            case 45:
                return true;
            case 46:
                if (b.f15a[0] != 1) {
                    b.f15a[3] = 0;
                    return false;
                }
                b.f15a[3] = 1;
                return false;
            case 47:
                return f3b.a(5);
            case 48:
            case 55:
                if (!X) {
                    return false;
                }
                X = false;
                Q();
                return true;
            case 49:
                return q.de == 4 || q.de == 3;
            case 50:
                return q.e();
            case 51:
                return q.de != 1 || q.af;
            case 52:
                if (q.de != 1 || q.af) {
                    return q.de == 2 && cG > 0;
                }
                return true;
            case 53:
                return true;
            case 54:
                return q.g();
            case 56:
                return f3b.a(3);
            case 57:
                return false;
            default:
                return false;
        }
    }

    private static void c(Graphics graphics) {
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, p.i(), p.m());
    }

    public static final void a(Object[] objArr, int i2, int i3) {
        switch (i3) {
            case 1:
                q.de = 3;
                break;
            case 2:
                q.de = 4;
                q.df = 4;
                break;
            case 3:
                s.b.at = true;
                break;
            case 4:
            case 28:
            case 29:
                if (i3 != 4) {
                    q.ac = i3 == 28;
                    a(objArr);
                }
                q.de = 1;
                q.ep = q.ds;
                q.eq = q.dt;
                q.cW = q.cX;
                break;
            case 5:
                Q();
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                q.l(p.i(), p.m());
                q.T();
                if (i3 == 12) {
                    q.cZ = 0;
                } else if (i3 == 11) {
                    q.ep = q.ds;
                    q.eo = q.dr;
                    q.eq = q.dt;
                    q.cW = q.cX;
                } else if (i3 == 10) {
                    q.ds = 0;
                    q.dt = 0;
                    q.dr = 5;
                    q.di = 0;
                    q.cX = 0;
                    q.dP = 0;
                } else if (i3 == 9) {
                    c(false);
                    q.eo = q.dp;
                    q.ep = q.dq;
                    q.L(q.dh);
                } else if (i3 == 8) {
                    c(true);
                    q.dh = 0;
                    cG = 4;
                    q.dq = 0;
                    q.dp = 5;
                    q.dN++;
                    q.L(q.dh);
                }
                q.eb = 1;
                q.Y();
                Q();
                break;
            case 20:
                ((int[]) objArr[3])[2] = 4;
                break;
            case 21:
                ((int[]) objArr[3])[2] = 5;
                break;
            case 22:
                q.cL = 3000;
                ((boolean[]) objArr[5])[2] = true;
                break;
            case 24:
            case 35:
                int i4 = ((f) objArr[6]).f57w[i3 == 35 ? (char) 0 : (char) 2];
                p.A(i4);
                p.B(i4);
                p.j(131111, 1);
                a(objArr);
                break;
            case 26:
            case 38:
                q.ac = ((f) objArr[6]).f57w[4] == 1;
                a(objArr);
                break;
            case 27:
                Q();
                break;
            case 30:
            case 31:
            case 32:
                if (i3 != 30) {
                    q.ac = i3 == 31;
                    a(objArr);
                }
                q.de = 2;
                q.ep = q.dq;
                break;
            case 33:
                q.de = 3;
                q.df = ((f) objArr[6]).ai + 1;
                break;
            case 34:
                q.fl = 0;
                break;
            case 39:
                ((int[]) objArr[3])[1] = ((f) objArr[9]).ai;
                if (((int[]) objArr[3])[1] != p.j()) {
                    ((DCWall3D) objArr[4]).E(((int[]) objArr[3])[1]);
                    h.n();
                    a(objArr);
                }
                break;
            case 40:
                P();
                Q();
                break;
            case 41:
                d(true);
                m = null;
                break;
            case 42:
                d(false);
                m = null;
                break;
            case 43:
                ((int[]) objArr[3])[1] = ((f) objArr[8]).ai;
                ((DCWall3D) objArr[4]).E(((int[]) objArr[3])[1]);
                h.n();
                a(objArr);
                objArr[8] = null;
                break;
        }
    }

    private static void P() {
        q.S();
        for (int i2 = 0; i2 < b.f15a[0]; i2++) {
            for (int i3 = 0; i3 < 1; i3++) {
                for (int i4 = 0; i4 < b.f15a[1]; i4++) {
                    b.f14a[i2][i3][i4] = 0;
                }
            }
        }
        b.b();
        q.ar();
        q.dl = 0;
        q.f146do = -1;
        X = true;
        q.df = -1;
        q.dP = 0;
        q.cX = 0;
        q.ac = false;
        for (int i5 = 0; i5 < 41; i5++) {
            q.f145d[i5] = false;
        }
        q.dh = 0;
        cG = 0;
        q.dq = 0;
        q.dp = 5;
        q.ds = 0;
        q.dr = 5;
        q.dt = 0;
        q.di = 0;
        for (int i6 = 0; i6 < q.B.length; i6++) {
            q.aI[i6] = 0;
        }
        for (int i7 = 0; i7 < 5; i7++) {
            q.f162h[i7] = false;
        }
    }

    private static void c(boolean z) {
        if (q.dp <= 0) {
            cG--;
            q.dp = 5;
        }
        if (z) {
            q.dh = 0;
            cG = 4;
            q.dq = 0;
            q.dp = 5;
        }
    }

    public static final String a(Object[] objArr, int i2, int i3, int i4) {
        if (i2 == 2) {
            if (i4 == 0 && ((boolean[]) objArr[5])[5]) {
                i3 = 507;
            }
        } else if (i2 == 0) {
            if (i4 == 0) {
                return f3b.m9a();
            }
            if (i4 == 12) {
                return null;
            }
        }
        return p.c(i3);
    }

    public static final void a(Object[] objArr, int i2, f fVar, int i3) {
        if (i3 != 0) {
            if (i3 == 1) {
                switch (i2) {
                    case 5:
                        fVar.a((l) null, m, m);
                        break;
                    case 6:
                        objArr[8] = fVar;
                        fVar.a((l) null, m, m);
                        break;
                    case 7:
                        objArr[9] = fVar;
                        break;
                }
            }
            if (i3 == 2) {
                int iK = p.k();
                switch (i2) {
                    case 0:
                        fVar.f51b[2] = p.c((q.ds == 0 || q.dr <= 0) ? 379 : 380);
                        fVar.f53s[4] = q.f162h[0] ? 0 : 1;
                        fVar.f53s[5] = q.f162h[1] ? 0 : 1;
                        fVar.f();
                        break;
                    case 3:
                        fVar.f57w[0] = iK;
                        fVar.f57w[4] = q.ac ? 1 : 0;
                        break;
                    case 8:
                        fVar.f57w[2] = iK;
                        fVar.f57w[4] = q.ac ? 1 : 0;
                        break;
                    case 12:
                        fVar.f53s[1] = q.f162h[2] ? 0 : 1;
                        fVar.f53s[2] = q.f162h[3] ? 0 : 1;
                        fVar.f53s[3] = q.f162h[4] ? 0 : 1;
                        fVar.f();
                        break;
                }
            }
        }
    }

    public static final boolean b(Object[] objArr, int i2) {
        if (i2 == 6 || i2 == 7) {
            return (i2 != 6 || ((int[]) objArr[3])[1] == -1) && p.a().length != 1;
        }
        return true;
    }

    public static boolean a(int i2, int i3) {
        return i2 == 0 && i3 == 1;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final int m1a(Object[] objArr, int i2) {
        switch (i2) {
            case 0:
                return ((boolean[]) objArr[5])[7] ? 0 : 1;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final void m2a(Object[] objArr, int i2) {
        switch (i2) {
            case 0:
                ((boolean[]) objArr[5])[7] = false;
                break;
            case 4:
                objArr[0] = null;
                objArr[1] = null;
                break;
        }
    }

    /* JADX INFO: renamed from: k, reason: collision with other method in class */
    public static int m3k(int i2) {
        switch (i2) {
            case 24:
            case 26:
            case 27:
            case 28:
            case 30:
            case 32:
            case 35:
            case 36:
            case 42:
                return 3;
            case 25:
            case 37:
                return 11;
            case 29:
            case 33:
            case 34:
            case 38:
            case 39:
            case 40:
            case 41:
            default:
                return 0;
            case 31:
                return 5;
        }
    }

    public static final void a(Object[] objArr, boolean z) {
        if (z) {
            p.J();
            p.K();
            ((int[]) objArr[3])[0] = -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void b(Object[] objArr, int i2, int i3) {
        String[] strArr;
        boolean z = false;
        switch (i2) {
            case 24:
                if (i3 == 0) {
                    objArr[0] = c.a(196617, 0, 65536);
                } else {
                    z = true;
                }
                break;
            case 25:
                if (i3 == 0) {
                    objArr[1] = f.a(p.c(377), n, p.i() - 12);
                }
                h.f(i3);
                break;
            case 27:
                if (i3 == 2) {
                    ((boolean[]) objArr[5])[3] = true;
                    a(objArr);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(p.a(196609));
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        int i4 = dataInputStream.readByte();
                        j.m = new int[4][i4];
                        for (int i5 = 0; i5 < i4; i5++) {
                            for (int i6 = 0; i6 < 4; i6++) {
                                j.m[i6][i5] = dataInputStream.readInt();
                            }
                        }
                        dataInputStream.close();
                        byteArrayInputStream.close();
                        break;
                    } catch (IOException unused) {
                    }
                    p.a(34, 534, null, 0);
                    String strD = p.d(5);
                    if (strD == null) {
                        strArr = new String[]{"none"};
                    } else {
                        int i7 = 0;
                        int length = 0;
                        while (true) {
                            int i8 = length;
                            if (i8 < strD.length()) {
                                i7++;
                                int iIndexOf = strD.indexOf("!.!", i8);
                                if (iIndexOf != -1) {
                                    length = iIndexOf + "!.!".length();
                                }
                            }
                        }
                        String[] strArr2 = new String[i7];
                        int length2 = 0;
                        String strC = p.c(535);
                        for (int i9 = 0; i9 < i7; i9++) {
                            int iIndexOf2 = strD.indexOf("!.!", length2);
                            int length3 = iIndexOf2;
                            if (iIndexOf2 == -1) {
                                length3 = strD.length();
                            }
                            if (length2 < length3) {
                                String strSubstring = strD.substring(length2, length3);
                                if ("none".equals(strSubstring)) {
                                    strArr2[i9] = null;
                                } else if (!"nolink".equals(strArr2[i9])) {
                                    if (strSubstring.indexOf("aid=") == -1) {
                                        strSubstring = new StringBuffer().append(strSubstring).append("&aid=1104").toString();
                                    }
                                    if (strSubstring.indexOf("clk=") == -1) {
                                        strSubstring = new StringBuffer().append(strSubstring).append("&clk=0").toString();
                                    }
                                    if (strSubstring.indexOf("car=") == -1) {
                                        strSubstring = new StringBuffer().append(strSubstring).append("&car=").append(p.d(2)).toString();
                                    }
                                    if (strSubstring.indexOf("lng") == -1) {
                                        strSubstring = new StringBuffer().append(strSubstring).append("&lng=").append(strC).toString();
                                    }
                                }
                                strArr2[i9] = strSubstring;
                            } else {
                                strArr2[i9] = "nolink";
                            }
                            length2 = length3 + "!.!".length();
                        }
                        strArr = strArr2;
                    }
                    j.a(j.m[1], j.m[3], j.m[0], j.m[2], strArr, 34, 5);
                } else {
                    z = true;
                }
                break;
            case 28:
                if (i3 == 0) {
                    f3b.a();
                } else {
                    z = true;
                }
                break;
            case 30:
                if (i3 == 0) {
                    f3b.a(4);
                    f3b.a();
                } else {
                    z = true;
                }
                break;
            case 31:
                if (!((boolean[]) objArr[5])[2]) {
                    if (i3 == 0) {
                        q.W();
                    } else {
                        z = true;
                    }
                }
                break;
            case 32:
                if (i3 == 0) {
                    f2a.a();
                } else {
                    z = true;
                }
                break;
            case 35:
            case 36:
                if (i3 == 0) {
                    q.at();
                } else {
                    z = true;
                }
                break;
            case 37:
                h.f(i3);
                break;
            case 42:
                if (i3 == 0) {
                    Object[] objArr2 = new Object[5];
                    q.m50g(objArr2);
                    f5c = objArr2;
                    q.m51h(objArr2);
                } else {
                    z = true;
                }
                break;
        }
        if (z) {
            try {
                Thread.sleep(100L);
            } catch (Exception unused2) {
            }
        }
    }

    public static void F(int i2) {
        switch (i2) {
            case 37:
                q.ao();
                f4b = null;
                e.f28b = 45.0f;
                e.a(45.0f);
            case 35:
            case 36:
                q.ar();
                q.au();
                break;
            case 42:
                q.m52i(f5c);
                f5c = null;
                break;
        }
        System.gc();
    }

    private static void d(boolean z) {
        int iK = p.k();
        if (!z) {
            iK = 0;
        } else if (iK == 0) {
            iK = 3;
        }
        p.B(iK);
        p.A(iK);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static void m4b(Object[] objArr, int i2) {
        int i3;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            case 25:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                i3 = 131110;
                break;
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 21:
            case 24:
                i3 = -1;
                break;
            case 23:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            default:
                i3 = -1;
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 32:
            case 39:
            case 40:
            case 41:
                i3 = -1;
                break;
            case 31:
                int iO = q.o();
                i3 = iO;
                q.dU = iO;
                break;
            case 42:
                i3 = -1;
                break;
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 56:
                i3 = -1;
                break;
        }
        if (i3 == -1) {
            p.J();
        } else if (i3 != ((int[]) objArr[3])[0]) {
            p.j(i3, -1);
        }
        ((int[]) objArr[3])[0] = i3;
    }

    private static void a(Object[] objArr) {
        byte[] bArr = new byte[5];
        bArr[0] = (byte) ((int[]) objArr[3])[1];
        bArr[1] = (byte) p.k();
        bArr[3] = q.ac ? (byte) 1 : (byte) 0;
        bArr[4] = ((boolean[]) objArr[5])[3] ? (byte) 1 : (byte) 0;
        p.b("settings", bArr);
    }

    public static void Q() {
        if (Y) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(q.dB);
            dataOutputStream.writeInt(q.dC);
            dataOutputStream.writeInt(q.dD);
            dataOutputStream.writeInt(q.dE);
            dataOutputStream.writeInt(q.dF);
            dataOutputStream.writeInt(q.dG);
            dataOutputStream.writeInt(q.dH);
            dataOutputStream.writeInt(q.dI);
            dataOutputStream.writeInt(q.dO);
            dataOutputStream.writeInt(q.dJ);
            dataOutputStream.writeInt(q.dL);
            dataOutputStream.writeInt(q.dK);
            dataOutputStream.writeInt(q.di);
            dataOutputStream.writeInt(q.dM);
            dataOutputStream.writeInt(q.dN);
            dataOutputStream.writeInt(q.dl);
            dataOutputStream.writeByte(X ? 1 : 0);
            dataOutputStream.writeInt(q.dP);
            dataOutputStream.writeInt(q.dh);
            dataOutputStream.writeInt(cG);
            dataOutputStream.writeInt(q.dq);
            dataOutputStream.writeInt(q.dp);
            dataOutputStream.writeInt(q.ds);
            dataOutputStream.writeInt(q.dr);
            dataOutputStream.writeInt(q.dt);
            dataOutputStream.writeInt(q.cX);
            dataOutputStream.writeInt(q.f146do);
            for (int i2 = 0; i2 < q.B.length; i2++) {
                dataOutputStream.writeByte(q.aI[i2]);
            }
            for (int i3 = 0; i3 < 41; i3++) {
                dataOutputStream.writeByte(q.f145d[i3] ? 1 : 0);
            }
            dataOutputStream.writeInt(q.cQ);
        } catch (IOException unused) {
        }
        p.a("wallrs", byteArrayOutputStream.toByteArray());
    }

    private static boolean a(f fVar) {
        return fVar.D == 4 || fVar.D == 5;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m5a(Object[] objArr, int i2, int i3) {
        switch (i2) {
            case 0:
                if (i3 == 9) {
                    return false;
                }
                if (i3 == 8) {
                    return ((boolean[]) objArr[5])[4] && ((boolean[]) objArr[5])[3];
                }
                if (i3 == 1) {
                    return ((boolean[]) objArr[5])[4] && !((boolean[]) objArr[5])[3];
                }
                if (i3 == 0) {
                    return f3b.m9a() != null;
                }
                return i3 != 12;
            case 3:
                if (i3 == 1) {
                    return false;
                }
                if (i3 == 0) {
                    return true;
                }
                if (i3 == 2) {
                    return false;
                }
                return i3 != 3 || p.a().length > 1;
            case 8:
                if (i3 == 1) {
                    return false;
                }
                return i3 == 2 || i3 != 3;
            default:
                return true;
        }
    }

    public static void a(int i2, f fVar, int i3, int i4, int i5) {
        if (i2 != 6 && i2 != 7) {
            fVar.a(i3, i4, i5);
            if (i2 == 0) {
                fVar.as = 1;
                return;
            }
            return;
        }
        String[][] strArrA = p.a();
        fVar.a(i3, strArrA.length, i5);
        int i6 = i2 == 6 ? 43 : 39;
        for (int i7 = 0; i7 < strArrA.length; i7++) {
            fVar.a(i7, 0, strArrA[i7][0], (Image[]) null, i6);
        }
    }

    public static void a(f fVar, String str, n nVar) {
        fVar.a(nVar == null ? str : null, null);
        fVar.f39n |= nVar != null;
        fVar.f43e = nVar;
    }

    public static void a(f fVar, String str, Image image) {
        fVar.a(image == null ? str : null, image);
    }

    public static void a(f fVar, int i2, int i3) {
        fVar.f38m[i3] = i2;
    }

    public static final void a(Object[] objArr, int i2, f fVar, int i3, int i4, String str, n nVar, Image[] imageArr, int i5) {
        if (m5a(objArr, i2, i3)) {
            if (nVar == null) {
                fVar.a(i3, i4, str, imageArr, i5);
            } else {
                fVar.a(i3, i4, str, (Image[]) null, i5);
                fVar.f50a[i3] = nVar;
            }
        }
    }

    public static final void a(Object[] objArr, int i2, f fVar, int i3, String str, n nVar, Image[] imageArr, String[] strArr, n nVar2, Image[] imageArr2, int i4) {
        if (m5a(objArr, i2, i3)) {
            if (nVar == null && nVar2 == null) {
                fVar.a(i3, str, imageArr, strArr, imageArr2, i4);
                return;
            }
            fVar.a(i3, str, (Image[]) null, strArr, (Image[]) null, i4);
            fVar.f58x[i3] = Math.max(fVar.f58x[i3], nVar2 != null ? nVar2.d.length : 0);
            fVar.f50a[i3] = nVar;
            fVar.f61b[i3] = nVar2;
        }
    }

    public static final void a(Object[] objArr, int i2, f fVar, int i3, String str, n nVar, Image[] imageArr, int i4, int i5, int i6) {
        if (m5a(objArr, i2, i3)) {
            if (nVar == null) {
                fVar.a(i3, str, imageArr, i4, i5, i6);
            } else {
                fVar.a(i3, str, (Image[]) null, i4, i5, i6);
                fVar.f50a[i3] = nVar;
            }
        }
    }

    public static void a(f fVar, int i2, int i3, String str, String str2, n nVar, Image[] imageArr, int i4, int i5) {
        if (nVar == null) {
            fVar.a(i2, i3, str, str2, imageArr, i4, i5);
        } else {
            fVar.a(i2, i3, str, str2, (Image[]) null, i4, i5);
            fVar.f50a[i2] = nVar;
        }
    }

    public static void a(f fVar, int i2) {
        fVar.a(i2);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m6a(f fVar) {
        int i2 = p.i();
        int iM = p.m();
        int i3 = 0;
        int i4 = 0;
        if (a(fVar)) {
            int i5 = p.i();
            int iM2 = p.m() - p.l();
            i2 = fVar.m13b(i5);
            iM = fVar.b(i2, iM2);
            i3 = (i5 - i2) >> 1;
            i4 = (iM2 - iM) >> 1;
        }
        fVar.a(i3, i4, i2, iM);
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static boolean m7e(int i2) {
        switch (i2) {
            case 5:
            case 6:
            case 24:
            case 25:
                return false;
            default:
                return true;
        }
    }

    private static void d(Graphics graphics, int i2, int i3) {
        int iM;
        int i4;
        int i5 = p.i();
        int iM2 = p.m();
        graphics.setColor(47851);
        graphics.fillRect(0, 0, i5, iM2);
        int i6 = iM2 >> 6;
        if (i3 != 37 || X) {
            q.h = null;
        } else if (q.h == null) {
            q.ap();
        }
        if (q.h != null) {
            iM = p.m() - (i6 * 7);
            i4 = i5 / 3;
            q.d(graphics);
        } else {
            iM = (p.m() - i6) >> 1;
            i4 = i5 >> 1;
        }
        int i7 = i4 / 11;
        int i8 = (i7 * 10) + 22;
        int i9 = (i5 - i8) >> 1;
        graphics.setColor(16777215);
        graphics.drawRect(i9, iM, i8 + 1, i7 + 4 + 1);
        graphics.setColor(16777215);
        for (int i10 = 0; i10 < 10; i10++) {
            if (i2 / 10 >= i10) {
                graphics.fillRect(i9 + 1 + 2, iM + 1 + 2, i7, i7);
                i9 += i7 + 2;
            }
        }
    }

    public static void R() {
        System.out.println("Replace sk");
        if (p.j(1) == 14) {
            p.k(1, 1);
        } else if (p.j(3) == 14) {
            p.k(1, 3);
        }
    }
}
