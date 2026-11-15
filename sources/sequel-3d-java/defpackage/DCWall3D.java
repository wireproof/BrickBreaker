package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: sequel-3d-java.jar:DCWall3D.class */
public class DCWall3D extends h {
    private s a;
    private s b;
    private s c;
    private boolean d;
    private boolean e;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int f0b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int f1c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private int f2d;
    private boolean f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static long f3a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static long f4b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static f f5a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static f f6b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static f f7c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int f8a;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static int f9e;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static int f11g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static boolean f13h;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static e f14a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static v f15a;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static f f16d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static f f17e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Object[] f18a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static b f19a;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static f f20f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static f f21g;
    private static boolean j;
    private static boolean g = true;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static int f10f = 0;
    private static int h = 3000;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f12a = {55, 52, 54, 52, 55, 54, 54, 52};
    private static boolean i = false;

    /* JADX WARN: Code duplicated, block: B:352:0x117c  */
    /* JADX WARN: Code duplicated, block: B:357:0x119f  */
    /* JADX WARN: Code duplicated, block: B:359:0x11b8  */
    /* JADX WARN: Code duplicated, block: B:368:0x11f2  */
    /* JADX WARN: Code duplicated, block: B:370:0x123e  */
    /* JADX WARN: Code duplicated, block: B:372:0x124b  */
    /* JADX WARN: Code duplicated, block: B:374:0x1261  */
    /* JADX WARN: Code duplicated, block: B:376:0x1288  */
    /* JADX WARN: Code duplicated, block: B:378:0x129e  */
    /* JADX WARN: Code duplicated, block: B:382:0x1308  */
    /* JADX WARN: Code duplicated, block: B:383:0x1311  */
    /* JADX WARN: Code duplicated, block: B:385:0x131e  */
    /* JADX WARN: Code duplicated, block: B:386:0x1326  */
    /* JADX WARN: Code duplicated, block: B:388:0x1332  */
    /* JADX WARN: Code duplicated, block: B:390:0x1339  */
    /* JADX WARN: Code duplicated, block: B:391:0x133d  */
    /* JADX WARN: Code duplicated, block: B:393:0x1344  */
    /* JADX WARN: Code duplicated, block: B:394:0x134c  */
    /* JADX WARN: Code duplicated, block: B:404:0x1378  */
    /* JADX WARN: Code duplicated, block: B:407:0x1385  */
    /* JADX WARN: Code duplicated, block: B:408:0x138b  */
    /* JADX WARN: Code duplicated, block: B:410:0x1392  */
    /* JADX WARN: Code duplicated, block: B:411:0x1398  */
    /* JADX WARN: Code duplicated, block: B:413:0x139f  */
    /* JADX WARN: Code duplicated, block: B:414:0x13ad  */
    /* JADX WARN: Code duplicated, block: B:416:0x13cc  */
    /* JADX WARN: Code duplicated, block: B:420:0x13d8  */
    /* JADX WARN: Code duplicated, block: B:423:0x13e2  */
    /* JADX WARN: Code duplicated, block: B:425:0x13e8  */
    /* JADX WARN: Code duplicated, block: B:426:0x13ec  */
    /* JADX WARN: Code duplicated, block: B:428:0x13f2  */
    /* JADX WARN: Code duplicated, block: B:434:0x1421  */
    /* JADX WARN: Code duplicated, block: B:439:0x148c  */
    /* JADX WARN: Code duplicated, block: B:441:0x1499  */
    /* JADX WARN: Code duplicated, block: B:442:0x149d  */
    /* JADX WARN: Code duplicated, block: B:443:0x14a1  */
    /* JADX WARN: Code duplicated, block: B:444:0x14a5  */
    /* JADX WARN: Code duplicated, block: B:445:0x14af  */
    /* JADX WARN: Code duplicated, block: B:447:0x14b5  */
    /* JADX WARN: Code duplicated, block: B:448:0x14c0  */
    /* JADX WARN: Code duplicated, block: B:449:0x14c4  */
    /* JADX WARN: Code duplicated, block: B:453:0x14d1  */
    /* JADX WARN: Code duplicated, block: B:455:0x14d9  */
    /* JADX WARN: Code duplicated, block: B:465:0x14fb  */
    /* JADX WARN: Code duplicated, block: B:466:0x1505  */
    /* JADX WARN: Code duplicated, block: B:467:0x150f  */
    /* JADX WARN: Code duplicated, block: B:469:0x1518  */
    /* JADX WARN: Code duplicated, block: B:470:0x1521  */
    /* JADX WARN: Code duplicated, block: B:472:0x152b  */
    /* JADX WARN: Code duplicated, block: B:474:0x1532  */
    /* JADX WARN: Code duplicated, block: B:475:0x1536  */
    /* JADX WARN: Code duplicated, block: B:476:0x153a  */
    /* JADX WARN: Code duplicated, block: B:478:0x1540  */
    /* JADX WARN: Code duplicated, block: B:479:0x1544  */
    /* JADX WARN: Code duplicated, block: B:480:0x1548  */
    /* JADX WARN: Code duplicated, block: B:522:0x143d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x1559 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x154c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:0x118a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:0x1190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[LOOP:5: B:350:0x1174->B:548:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h
    public final void a(int i2) {
        int iCurrentTimeMillis;
        int i3;
        int i4;
        int i5;
        Object[] objArr;
        int i6;
        n nVar;
        int i7;
        Object[] objArr2;
        boolean zA;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        if (!this.d) {
            if (!this.e) {
                this.f0b = 6;
                this.f1c = 0;
                this.e = true;
                return;
            }
            if (this.f1c >= this.f0b) {
                this.d = true;
                this.e = false;
                this.c = this.a;
                a();
                return;
            }
            switch (this.f1c) {
                case 0:
                    a.a();
                    break;
                case 1:
                    try {
                        Font fontM104a = t.m104a(0, 8);
                        t.m104a(1, 8);
                        Font fontM104a2 = t.m104a(1, 0);
                        f5a = new f(fontM104a, 16777215, -1);
                        f6b = new f(fontM104a2, 16777215, 0);
                        f20f = new f(fontM104a2, 16711680, 16777215);
                        f21g = new f(fontM104a2, 16777215, 0);
                        f7c = new f(fontM104a2, 255, 16777215);
                        n.a(f6b, f5a, f21g, f20f);
                    } catch (IOException unused) {
                    }
                    break;
                case 2:
                    n.a(new b(a.a(new int[]{131087, 131087, 131087}, false)), new b(a.a(new int[]{131089, 131089, 131089}, false)));
                    n.b(new b(a.a(new int[]{131088, 131088, 131088}, false)), new b(a.a(new int[]{131086, 131086, 131086}, false)));
                    break;
                case 3:
                    Object[] objArr3 = new Object[12];
                    a(objArr3, this, f6b);
                    this.a = new s(65542, objArr3);
                    break;
                case 4:
                    d();
                    break;
                case 5:
                    for (int i14 = 0; i14 < a.m9a(); i14++) {
                        a.c();
                    }
                    break;
            }
            this.f1c++;
            return;
        }
        if (this.c != this.b) {
            this.b = this.c;
        }
        if (this.b != null) {
            s sVar = this.b;
            if (sVar.f272b != -1) {
                while (true) {
                    if (sVar.f272b == -1) {
                        h.f92a.m38a();
                    } else if (!sVar.f284c) {
                        byte b = sVar.f271a != -1 ? sVar.b[sVar.f271a] : (byte) -1;
                        byte b2 = sVar.b[sVar.f272b];
                        if (sVar.f271a != -1) {
                            if (b != -1) {
                                if (b != b2 && !m3a((int) b, (int) b2)) {
                                    Object[] objArr4 = sVar.a;
                                    switch (b) {
                                        case 0:
                                            r.b();
                                            if (i) {
                                                objArr4[8] = null;
                                            }
                                            break;
                                        case 1:
                                            if (b2 != 0) {
                                                r.b();
                                            }
                                            break;
                                        case 2:
                                            if (b2 != 1) {
                                                j.f();
                                            }
                                            break;
                                        case 4:
                                            objArr4[11] = null;
                                            if (((b) objArr4[10]) != null) {
                                                ((b) objArr4[10]).m24a();
                                                objArr4[10] = null;
                                            }
                                            break;
                                    }
                                    int length = sVar.b.length;
                                    while (true) {
                                        length--;
                                        if (length >= 0) {
                                            if (sVar.b[length] == b && sVar.a(length)) {
                                                sVar.d(length);
                                            }
                                        }
                                    }
                                }
                            } else if (sVar.a(sVar.f271a)) {
                                sVar.d(sVar.f271a);
                            }
                            switch (sVar.f271a) {
                                case 32:
                                    j.e();
                                    break;
                                case 36:
                                    z.m154c(f18a);
                                    f18a = null;
                                    break;
                            }
                            System.gc();
                            sVar.f273a = null;
                            sVar.f274b = null;
                            sVar.c = null;
                            t.m85b();
                        }
                        sVar.j = 0;
                        if (b2 == -1 || b2 == b) {
                            int i15 = sVar.f272b;
                            if (sVar.a(i15) && sVar.f275a[i15] == null) {
                                sVar.f286e = new short[]{(short) i15};
                            } else {
                                sVar.f286e = new short[0];
                            }
                        } else {
                            if (!m3a((int) b2, (int) b)) {
                                switch (b2) {
                                    case 0:
                                        i13 = 1;
                                        break;
                                    case 1:
                                        i13 = 1;
                                        break;
                                    case 2:
                                        i13 = 1;
                                        break;
                                    default:
                                        i13 = 0;
                                        break;
                                }
                                sVar.j = i13;
                            }
                            int i16 = 0;
                            for (int i17 = 0; i17 < sVar.b.length; i17++) {
                                if (sVar.b[i17] == b2 && sVar.a(i17) && sVar.f275a[i17] == null) {
                                    i16++;
                                }
                            }
                            sVar.f286e = new short[i16];
                            int i18 = 0;
                            for (int i19 = 0; i19 < sVar.b.length; i19++) {
                                if (sVar.b[i19] == b2 && sVar.a(i19) && sVar.f275a[i19] == null) {
                                    int i20 = i18;
                                    i18++;
                                    sVar.f286e[i20] = (short) i19;
                                }
                            }
                        }
                        Object[] objArr5 = sVar.a;
                        switch (sVar.f272b) {
                            case 3:
                                i11 = ((boolean[]) objArr5[1])[7] ? 2 : 0;
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
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
                            case 21:
                            case 22:
                            case 28:
                            case 33:
                            case 34:
                            case 35:
                            default:
                                i11 = 0;
                                break;
                            case 23:
                            case 25:
                            case 26:
                            case 27:
                            case 29:
                            case 31:
                                i11 = 30;
                                break;
                            case 24:
                                i11 = 11;
                                break;
                            case 30:
                                i11 = 100;
                                break;
                            case 32:
                                i11 = 1;
                                break;
                            case 36:
                                i11 = 1;
                                break;
                        }
                        sVar.k = i11;
                        sVar.h = sVar.j + sVar.k + sVar.f286e.length;
                        if (sVar.h > 0) {
                            a(sVar.a, true);
                            sVar.i = 0;
                            sVar.f284c = true;
                            switch (sVar.f272b) {
                                case 38:
                                    i12 = f15a.a(2) ? 0 : 100;
                                    break;
                                case 39:
                                case 41:
                                default:
                                    i12 = -1;
                                    break;
                                case 40:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                    i12 = 0;
                                    break;
                            }
                            s.l = i12;
                            sVar.f285d = false;
                            t.m85b();
                        }
                        i3 = sVar.f271a;
                        sVar.f271a = sVar.f272b;
                        sVar.f272b = -1;
                        i4 = sVar.g;
                        while (true) {
                            i4--;
                            if (i4 < 0) {
                                if (sVar.f283d[i4] == sVar.f271a) {
                                    sVar.g = i4;
                                }
                            }
                        }
                        i5 = sVar.f271a;
                        if (i5 < sVar.f279c) {
                            sVar.f273a = sVar.f275a[i5];
                            if (sVar.f281a) {
                                sVar.f273a.b(sVar.f287c[sVar.f271a] & 255);
                            } else if (sVar.f271a == 0 || z.m < 1 || z.m <= 3) {
                                sVar.f273a.b(0);
                            } else {
                                sVar.f273a.b(0);
                            }
                            a(sVar.a, i5, sVar.f273a, 2);
                            sVar.f273a.m72b();
                            a(sVar.a, i5, sVar.f273a, 3);
                            sVar.f282b = m5a(i5);
                        } else if (i5 < sVar.f279c + sVar.e) {
                            if (sVar.f277b[i5 - sVar.d] == null) {
                                sVar.m81a(i5);
                            }
                            sVar.f274b = sVar.f277b[i5 - sVar.d];
                            sVar.f282b = m5a(i5);
                        } else {
                            if (sVar.f278c[i5 - sVar.f280f] == null) {
                                sVar.b(i5);
                            }
                            sVar.c = sVar.f278c[i5 - sVar.f280f];
                            sVar.f282b = false;
                        }
                        objArr = sVar.a;
                        i6 = sVar.f271a;
                        nVar = sVar.f273a;
                        switch (i6) {
                            case 21:
                                z.a(nVar);
                                break;
                            case 24:
                                h = 5000;
                                break;
                            case 30:
                                f10f = 0;
                                t.m85b();
                                if (z.f354b) {
                                    t.a(1, 0);
                                } else {
                                    t.a(9, 0);
                                }
                                z.d();
                                break;
                            case 32:
                                if (i6 == 32) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z.m143a(z);
                                break;
                            case 36:
                                if (i3 != 44 || ((i3 == 45 && z.m == 1) || (i3 == 30 && ((int[]) objArr[2])[3] == 5))) {
                                    z.k();
                                    b();
                                }
                                if (i3 == 44) {
                                    i8 = 2;
                                } else if (i3 == 45) {
                                    i8 = 1;
                                } else if (i3 == 30) {
                                    switch (z.m) {
                                        case 1:
                                            if (z.x != 0 || z.w <= 0) {
                                                i10 = 0;
                                            } else {
                                                i10 = 3;
                                            }
                                            i8 = i10;
                                            break;
                                        case 2:
                                            if (f8a <= 0) {
                                                i9 = 0;
                                            } else {
                                                i9 = 3;
                                            }
                                            i8 = i9;
                                            break;
                                        default:
                                            i8 = 0;
                                            break;
                                    }
                                } else {
                                    i8 = ((int[]) objArr[2])[3];
                                }
                                z.a(f18a, i8, z.m);
                                break;
                        }
                        ((int[]) objArr[2])[0] = i3;
                        if (((boolean[]) objArr[1])[1] || i3 != 26) {
                            a(objArr, i6);
                        }
                        objArr[4] = nVar;
                        n.m79c(sVar.f271a);
                        if (sVar.c != null) {
                            i7 = sVar.f271a;
                            objArr2 = sVar.a;
                            switch (i7) {
                                case 37:
                                    if (((int[]) objArr2[2])[2] == -1) {
                                        zA = true;
                                    } else {
                                        zA = false;
                                    }
                                    break;
                                case 38:
                                    zA = f15a.a(2);
                                    break;
                                case 39:
                                    zA = true;
                                    break;
                                case 40:
                                    if (e.f70a[0] != 1) {
                                        e.f70a[3] = 0;
                                    } else {
                                        e.f70a[3] = 1;
                                    }
                                    zA = false;
                                    break;
                                case 41:
                                    zA = f15a.a(5);
                                    break;
                                case 42:
                                case 46:
                                    if (g) {
                                        g = false;
                                        b();
                                        zA = true;
                                    } else {
                                        zA = false;
                                    }
                                    break;
                                case 43:
                                    if (z.m == 3) {
                                        zA = true;
                                    } else {
                                        zA = false;
                                    }
                                    break;
                                case 44:
                                    if (z.m == 1 || z.f364d) {
                                        zA = true;
                                    } else {
                                        zA = false;
                                    }
                                    break;
                                case 45:
                                    zA = (z.m != 1 && !z.f364d) || (z.m == 2 && f8a > 0);
                                    break;
                                case 47:
                                    zA = f15a.a(3);
                                    break;
                                case 48:
                                    if (m6a()) {
                                        zA = true;
                                    } else {
                                        zA = false;
                                    }
                                    break;
                                default:
                                    zA = false;
                                    break;
                            }
                            if (zA) {
                                sVar.c(sVar.c[0]);
                            } else {
                                sVar.c(sVar.c[1]);
                            }
                        }
                    } else if (sVar.i < sVar.h) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        do {
                            if (sVar.f285d) {
                                a.c();
                            } else if (sVar.i < sVar.j) {
                                byte b3 = sVar.b[sVar.f272b];
                                Object[] objArr6 = sVar.a;
                                h.f93b = true;
                                if (b3 == 0) {
                                    int iM98e = t.m98e() - (t.m98e() >> 2);
                                    int iA = (t.a() - (t.a() >> 2)) - t.c();
                                    int iM98e2 = (t.m98e() - iM98e) >> 1;
                                    int iA2 = (t.a() - iA) >> 1;
                                    objArr6[8] = new n();
                                    ((n) objArr6[8]).a(1, 1, 3);
                                    ((n) objArr6[8]).a(0, 1, t.m87a(399), (Image[]) null, -1);
                                    t.m85b();
                                    ((n) objArr6[8]).a(1, 0);
                                    ((n) objArr6[8]).a(4);
                                    ((n) objArr6[8]).a(iM98e2, iA2, iM98e, iA);
                                    r.a();
                                }
                                if (b3 == 1 && r.f262a == null) {
                                    r.a();
                                }
                            } else if (sVar.i < sVar.k) {
                                int i21 = sVar.i - sVar.j;
                                Object[] objArr7 = sVar.a;
                                int i22 = sVar.f272b;
                                boolean z2 = false;
                                h.f93b = true;
                                boolean z3 = z2;
                                switch (i22) {
                                    case 3:
                                        z3 = z2;
                                        if (((boolean[]) objArr7[1])[7]) {
                                            if (i21 == 0) {
                                                e();
                                                z3 = z2;
                                            } else if (i21 == 1) {
                                                z3 = z2;
                                                b();
                                                ((boolean[]) objArr7[1])[7] = false;
                                                z3 = z2;
                                            }
                                        }
                                        break;
                                    case 23:
                                        if (i21 == 0) {
                                            objArr7[11] = a.b(131081);
                                            z3 = z2;
                                        } else {
                                            z3 = true;
                                        }
                                        break;
                                    case 24:
                                        z3 = z2;
                                        if (i21 == 0) {
                                            h.f93b = true;
                                            if (((b) objArr7[10]) == null) {
                                                z3 = z2;
                                                objArr7[10] = new b(a.a(131084, false), false);
                                                z3 = z2;
                                            }
                                        }
                                        break;
                                    case 26:
                                        if (i21 == 2) {
                                            ((boolean[]) objArr7[1])[3] = true;
                                            a(objArr7);
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(t.m96a(131076));
                                            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                                            try {
                                                int i23 = dataInputStream.readByte();
                                                k.f194a = new int[4][i23];
                                                for (int i24 = 0; i24 < i23; i24++) {
                                                    for (int i25 = 0; i25 < 4; i25++) {
                                                        k.f194a[i25][i24] = dataInputStream.readInt();
                                                    }
                                                }
                                                dataInputStream.close();
                                                byteArrayInputStream.close();
                                            } catch (IOException unused2) {
                                            }
                                            t.a(34, 467, null, 0);
                                            k.a(k.f194a[1], k.f194a[3], k.f194a[0], k.f194a[2], k.a(), 34, 5);
                                            z3 = z2;
                                        } else {
                                            z3 = true;
                                        }
                                        break;
                                    case 27:
                                        if (i21 == 0) {
                                            f15a.a();
                                            z3 = z2;
                                        } else {
                                            z3 = true;
                                        }
                                        break;
                                    case 29:
                                        if (i21 == 0) {
                                            f15a.a(4);
                                            f15a.a();
                                            z3 = z2;
                                        } else {
                                            z3 = true;
                                        }
                                        break;
                                    case 30:
                                        if (((boolean[]) objArr7[1])[2]) {
                                            if (z.U != 7 && !z.f354b) {
                                                z3 = z2;
                                                z3 = z2;
                                                z.f350a = 2500;
                                                z3 = z2;
                                            }
                                        } else if (i21 >= 0 && i21 < 14) {
                                            j.m42b(i21);
                                            z3 = z2;
                                        } else if (i21 < 15 || i21 >= 25) {
                                            z3 = z2;
                                            if (i21 == 26) {
                                                z.g();
                                                z3 = z2;
                                            }
                                        } else {
                                            z.m121a(i21);
                                            z3 = z2;
                                        }
                                        break;
                                    case 31:
                                        if (i21 == 0) {
                                            f14a.b();
                                            z3 = z2;
                                        } else {
                                            z3 = true;
                                        }
                                        break;
                                    case 32:
                                        z3 = z2;
                                        if (i21 == 0) {
                                            j.d();
                                            z3 = z2;
                                        }
                                        break;
                                    case 36:
                                        Object[] objArr8 = new Object[2];
                                        z.m153b(objArr8);
                                        f18a = objArr8;
                                        z.j();
                                        z3 = z2;
                                        break;
                                }
                                z3 = z2;
                                z3 = z2;
                                z3 = z2;
                                z3 = z2;
                                z3 = z2;
                                if (z3) {
                                    try {
                                        Thread.sleep(100L);
                                    } catch (Exception unused3) {
                                    }
                                }
                            } else {
                                short s = sVar.f286e[(sVar.i - sVar.j) - sVar.k];
                                boolean z4 = !(s == 6 || s == 7) || ((s != 6 || ((int[]) sVar.a[2])[2] == -1) && t.m83a().length != 1);
                                if (z4) {
                                    byte[] bArr = sVar.f269a;
                                    short s2 = sVar.f270a[s];
                                    int i26 = s2 + 1;
                                    byte b4 = bArr[s2];
                                    Vector vector = new Vector();
                                    Image[][] imageArr = new Image[1][];
                                    b[] bVarArr = new b[1];
                                    int i27 = i26 + 1;
                                    boolean z5 = bArr[i26];
                                    int i28 = i27 + 1;
                                    boolean z6 = bArr[i27];
                                    n nVar2 = new n();
                                    a(sVar.a, s, nVar2, 0);
                                    a(s, nVar2, z5 ? 1 : 0, b4 == true ? 1 : 0, z6 ? 1 : 0);
                                    int i29 = i28 + 1;
                                    nVar2.a(bArr[i28] ? 1 : 0);
                                    int i30 = i29 + 1;
                                    int i31 = ((bArr[i29] ? 1 : 0) & 255) << 24;
                                    int i32 = i30 + 1;
                                    int i33 = i31 | (((bArr[i30] ? 1 : 0) & 255) << 16);
                                    int i34 = i32 + 1;
                                    String strA = a(sVar.a, s, i33 | (((bArr[i32] ? 1 : 0) & 255) << 8) | ((bArr[i34] ? 1 : 0) & 255), -1);
                                    int iA3 = s.a(bArr, i34 + 1, 1, imageArr, bVarArr);
                                    Image image = imageArr[0] == null ? null : imageArr[0][0];
                                    b bVar = bVarArr[0];
                                    int i35 = iA3 + 1;
                                    if ((strA != null && strA.length() != 0) || bVar != null || image != null) {
                                        if (bVar != null) {
                                            nVar2.a(bVar == null ? strA : null, bVar);
                                        } else {
                                            nVar2.a(image == null ? strA : null, image);
                                        }
                                    }
                                    int i36 = i35 + 1;
                                    boolean z7 = bArr[i35];
                                    int i37 = i36 + 1;
                                    int i38 = (bArr[i36] ? 1 : 0) & 255;
                                    if (i38 != 255) {
                                        vector.addElement(new Integer(z7 ? 1 : 0));
                                        vector.addElement(new Integer(i38));
                                    }
                                    nVar2.a(z7 ? 1 : 0, 0);
                                    int i39 = i37 + 1;
                                    boolean z8 = bArr[i37];
                                    int iA4 = i39 + 1;
                                    int i40 = (bArr[i39] ? 1 : 0) & 255;
                                    if (i40 != 255) {
                                        vector.addElement(new Integer(z8 ? 1 : 0));
                                        vector.addElement(new Integer(i40));
                                    }
                                    nVar2.a(z8 ? 1 : 0, 1);
                                    for (int i41 = 0; i41 < b4; i41++) {
                                        int i42 = iA4;
                                        iA4++;
                                        boolean z9 = bArr[i42];
                                        switch (z9 ? 1 : 0) {
                                            case 0:
                                                int i43 = iA4 + 1;
                                                int i44 = ((bArr[iA4] ? 1 : 0) & 255) << 24;
                                                int i45 = i43 + 1;
                                                int i46 = i44 | (((bArr[i43] ? 1 : 0) & 255) << 16);
                                                int i47 = i45 + 1;
                                                String strA2 = a(sVar.a, s, i46 | (((bArr[i45] ? 1 : 0) & 255) << 8) | ((bArr[i47] ? 1 : 0) & 255), i41);
                                                int iA5 = s.a(bArr, i47 + 1, 3, imageArr, bVarArr);
                                                Image[] imageArr2 = imageArr[0];
                                                b bVar2 = bVarArr[0];
                                                iA4 = iA5 + 1;
                                                int i48 = (bArr[iA5] ? 1 : 0) & 255;
                                                int i49 = i48;
                                                if (i48 == 255) {
                                                    i49 = -1;
                                                }
                                                a(sVar.a, s, nVar2, i41, z9 ? 1 : 0, strA2, bVar2, imageArr2, i49);
                                                break;
                                            case 1:
                                                int i50 = iA4 + 1;
                                                int i51 = ((bArr[iA4] ? 1 : 0) & 255) << 24;
                                                int i52 = i50 + 1;
                                                int i53 = i51 | (((bArr[i50] ? 1 : 0) & 255) << 16);
                                                int i54 = i52 + 1;
                                                String strA3 = a(sVar.a, s, i53 | (((bArr[i52] ? 1 : 0) & 255) << 8) | ((bArr[i54] ? 1 : 0) & 255), i41);
                                                int iA6 = s.a(bArr, i54 + 1, 4, imageArr, bVarArr);
                                                Image[] imageArr3 = imageArr[0];
                                                b bVar3 = bVarArr[0];
                                                int i55 = iA6 + 1;
                                                int i56 = bArr[iA6];
                                                String[] strArr = new String[i56];
                                                for (int i57 = 0; i57 < i56; i57++) {
                                                    int i58 = i55;
                                                    int i59 = i55 + 1;
                                                    int i60 = i59 + 1;
                                                    int i61 = (((bArr[i58] ? 1 : 0) & 255) << 24) | (((bArr[i59] ? 1 : 0) & 255) << 16);
                                                    int i62 = i60 + 1;
                                                    int i63 = i61 | (((bArr[i60] ? 1 : 0) & 255) << 8);
                                                    i55 = i62 + 1;
                                                    strArr[i57] = a(sVar.a, s, i63 | ((bArr[i62] ? 1 : 0) & 255), i41);
                                                }
                                                int iA7 = s.a(bArr, i55, i56, imageArr, bVarArr);
                                                Image[] imageArr4 = imageArr[0];
                                                b bVar4 = bVarArr[0];
                                                iA4 = iA7 + 1;
                                                int i64 = (bArr[iA7] ? 1 : 0) & 255;
                                                int i65 = i64;
                                                if (i64 == 255) {
                                                    i65 = -1;
                                                }
                                                int i66 = i41;
                                                int i67 = i65;
                                                if (m4a(sVar.a, (int) s, i66)) {
                                                    if (bVar3 == null && bVar4 == null) {
                                                        nVar2.a(i66, strA3, imageArr3, strArr, imageArr4, i67);
                                                    } else {
                                                        nVar2.a(i66, strA3, bVar3, strArr, bVar4, i67);
                                                    }
                                                }
                                                break;
                                            case 2:
                                                int i68 = iA4 + 1;
                                                int i69 = ((bArr[iA4] ? 1 : 0) & 255) << 24;
                                                int i70 = i68 + 1;
                                                int i71 = i69 | (((bArr[i68] ? 1 : 0) & 255) << 16);
                                                int i72 = i70 + 1;
                                                String strA4 = a(sVar.a, s, i71 | (((bArr[i70] ? 1 : 0) & 255) << 8) | ((bArr[i72] ? 1 : 0) & 255), i41);
                                                int iA8 = s.a(bArr, i72 + 1, 4, imageArr, bVarArr);
                                                Image[] imageArr5 = imageArr[0];
                                                b bVar5 = bVarArr[0];
                                                int i73 = iA8 + 1;
                                                int i74 = (bArr[iA8] ? 1 : 0) & 255;
                                                int i75 = i73 + 1;
                                                int i76 = (bArr[i73] ? 1 : 0) & 255;
                                                iA4 = i75 + 1;
                                                int i77 = (bArr[i75] ? 1 : 0) & 255;
                                                int i78 = i77;
                                                if (i77 == 255) {
                                                    i78 = -1;
                                                }
                                                int i79 = i41;
                                                int i80 = i78;
                                                if (m4a(sVar.a, (int) s, i79)) {
                                                    if (bVar5 != null) {
                                                        nVar2.a(i79, strA4, bVar5, i74, i76, i80);
                                                    } else {
                                                        nVar2.a(i79, strA4, imageArr5, i74, i76, i80);
                                                    }
                                                }
                                                break;
                                            case 3:
                                                int i81 = iA4 + 1;
                                                int i82 = (bArr[iA4] ? 1 : 0) & 255;
                                                int i83 = i81 + 1;
                                                int i84 = ((bArr[i81] ? 1 : 0) & 255) << 24;
                                                int i85 = i83 + 1;
                                                int i86 = i84 | (((bArr[i83] ? 1 : 0) & 255) << 16);
                                                int i87 = i85 + 1;
                                                int i88 = i86 | (((bArr[i85] ? 1 : 0) & 255) << 8);
                                                int i89 = i87 + 1;
                                                String strA5 = a(sVar.a, s, i88 | ((bArr[i87] ? 1 : 0) & 255), i41);
                                                int i90 = i89 + 1;
                                                int i91 = ((bArr[i89] ? 1 : 0) & 255) << 24;
                                                int i92 = i90 + 1;
                                                int i93 = i91 | (((bArr[i90] ? 1 : 0) & 255) << 16);
                                                int i94 = i92 + 1;
                                                String strA6 = a(sVar.a, s, i93 | (((bArr[i92] ? 1 : 0) & 255) << 8) | ((bArr[i94] ? 1 : 0) & 255), i41);
                                                int iA9 = s.a(bArr, i94 + 1, 3, imageArr, bVarArr);
                                                Image[] imageArr6 = imageArr[0];
                                                b bVar6 = bVarArr[0];
                                                int i95 = iA9 + 1;
                                                int i96 = (bArr[iA9] ? 1 : 0) & 255;
                                                iA4 = i95 + 1;
                                                int i97 = (bArr[i95] ? 1 : 0) & 255;
                                                int i98 = i97;
                                                if (i97 == 255) {
                                                    i98 = -1;
                                                }
                                                int i99 = i41;
                                                int i100 = i98;
                                                if (bVar6 != null) {
                                                    nVar2.a(i99, i82, strA5, strA6, bVar6, i96, i100);
                                                } else {
                                                    nVar2.a(i99, i82, strA5, strA6, imageArr6, i96, i100);
                                                }
                                                break;
                                            case 4:
                                                int i101 = iA4 + 1;
                                                int i102 = ((bArr[iA4] ? 1 : 0) & 255) << 24;
                                                int i103 = i101 + 1;
                                                int i104 = i102 | (((bArr[i101] ? 1 : 0) & 255) << 16);
                                                int i105 = i103 + 1;
                                                String strA7 = a(sVar.a, s, i104 | (((bArr[i103] ? 1 : 0) & 255) << 8) | ((bArr[i105] ? 1 : 0) & 255), i41);
                                                iA4 = s.a(bArr, i105 + 1, 1, imageArr, bVarArr);
                                                a(sVar.a, s, nVar2, i41, 1, strA7, bVarArr[0], imageArr[0], -1);
                                                break;
                                        }
                                    }
                                    a(sVar.a, s, nVar2, 1);
                                    int iM98e3 = t.m98e();
                                    int iA10 = t.a();
                                    int i106 = 0;
                                    int i107 = 0;
                                    if (a(nVar2)) {
                                        int iM98e4 = t.m98e();
                                        int iA11 = t.a() - t.c();
                                        iM98e3 = nVar2.m69a(iM98e4);
                                        iA10 = nVar2.m70a(iM98e3, iA11);
                                        i106 = (iM98e4 - iM98e3) >> 1;
                                        i107 = (iA11 - iA10) >> 1;
                                    }
                                    nVar2.a(i106, i107, iM98e3, iA10);
                                    nVar2.b(0);
                                    sVar.f275a[s] = nVar2;
                                    if (vector.size() > 0) {
                                        short[] sArr = new short[vector.size()];
                                        for (int i108 = 0; i108 < vector.size(); i108++) {
                                            sArr[i108] = (short) ((Integer) vector.elementAt(i108)).intValue();
                                        }
                                        sVar.f276a[s] = sArr;
                                    }
                                }
                            }
                            sVar.i++;
                            iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                            if (sVar.i < sVar.h) {
                            }
                        } while (iCurrentTimeMillis < 100);
                    } else {
                        if (!sVar.f285d) {
                            sVar.h = a.m9a();
                            if (sVar.h > 0) {
                                sVar.i = 0;
                                sVar.f285d = true;
                            }
                        }
                        a(sVar.a, false);
                        sVar.f284c = false;
                        h.f92a.m38a();
                        i3 = sVar.f271a;
                        sVar.f271a = sVar.f272b;
                        sVar.f272b = -1;
                        i4 = sVar.g;
                        while (true) {
                            i4--;
                            if (i4 < 0) {
                                if (sVar.f283d[i4] == sVar.f271a) {
                                    sVar.g = i4;
                                }
                            }
                        }
                        i5 = sVar.f271a;
                        if (i5 < sVar.f279c) {
                            sVar.f273a = sVar.f275a[i5];
                            if (sVar.f281a) {
                                sVar.f273a.b(sVar.f287c[sVar.f271a] & 255);
                            } else if (sVar.f271a == 0) {
                                sVar.f273a.b(0);
                            } else {
                                sVar.f273a.b(0);
                            }
                            a(sVar.a, i5, sVar.f273a, 2);
                            sVar.f273a.m72b();
                            a(sVar.a, i5, sVar.f273a, 3);
                            sVar.f282b = m5a(i5);
                        } else if (i5 < sVar.f279c + sVar.e) {
                            if (sVar.f277b[i5 - sVar.d] == null) {
                                sVar.m81a(i5);
                            }
                            sVar.f274b = sVar.f277b[i5 - sVar.d];
                            sVar.f282b = m5a(i5);
                        } else {
                            if (sVar.f278c[i5 - sVar.f280f] == null) {
                                sVar.b(i5);
                            }
                            sVar.c = sVar.f278c[i5 - sVar.f280f];
                            sVar.f282b = false;
                        }
                        objArr = sVar.a;
                        i6 = sVar.f271a;
                        nVar = sVar.f273a;
                        switch (i6) {
                            case 21:
                                z.a(nVar);
                                break;
                            case 24:
                                h = 5000;
                                break;
                            case 30:
                                f10f = 0;
                                t.m85b();
                                if (z.f354b) {
                                    t.a(1, 0);
                                } else {
                                    t.a(9, 0);
                                }
                                z.d();
                                break;
                            case 32:
                                if (i6 == 32) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z.m143a(z);
                                break;
                            case 36:
                                if (i3 != 44) {
                                    z.k();
                                    b();
                                } else {
                                    z.k();
                                    b();
                                }
                                if (i3 == 44) {
                                    i8 = 2;
                                } else if (i3 == 45) {
                                    i8 = 1;
                                } else if (i3 == 30) {
                                    switch (z.m) {
                                        case 1:
                                            if (z.x != 0) {
                                                i10 = 0;
                                            } else {
                                                i10 = 0;
                                            }
                                            i8 = i10;
                                            break;
                                        case 2:
                                            if (f8a <= 0) {
                                                i9 = 0;
                                            } else {
                                                i9 = 3;
                                            }
                                            i8 = i9;
                                            break;
                                        default:
                                            i8 = 0;
                                            break;
                                    }
                                } else {
                                    i8 = ((int[]) objArr[2])[3];
                                }
                                z.a(f18a, i8, z.m);
                                break;
                        }
                        ((int[]) objArr[2])[0] = i3;
                        if (((boolean[]) objArr[1])[1]) {
                            a(objArr, i6);
                        } else {
                            a(objArr, i6);
                        }
                        objArr[4] = nVar;
                        n.m79c(sVar.f271a);
                        if (sVar.c != null) {
                            i7 = sVar.f271a;
                            objArr2 = sVar.a;
                            switch (i7) {
                                case 37:
                                    if (((int[]) objArr2[2])[2] == -1) {
                                        zA = true;
                                    } else {
                                        zA = false;
                                    }
                                    break;
                                case 38:
                                    zA = f15a.a(2);
                                    break;
                                case 39:
                                    zA = true;
                                    break;
                                case 40:
                                    if (e.f70a[0] != 1) {
                                        e.f70a[3] = 0;
                                    } else {
                                        e.f70a[3] = 1;
                                    }
                                    zA = false;
                                    break;
                                case 41:
                                    zA = f15a.a(5);
                                    break;
                                case 42:
                                case 46:
                                    if (g) {
                                        g = false;
                                        b();
                                        zA = true;
                                    } else {
                                        zA = false;
                                    }
                                    break;
                                case 43:
                                    if (z.m == 3) {
                                        zA = true;
                                    } else {
                                        zA = false;
                                    }
                                    break;
                                case 44:
                                    if (z.m == 1) {
                                        zA = true;
                                    } else {
                                        zA = true;
                                    }
                                    break;
                                case 45:
                                    if (z.m != 1) {
                                    }
                                    break;
                                case 47:
                                    zA = f15a.a(3);
                                    break;
                                case 48:
                                    if (m6a()) {
                                        zA = true;
                                    } else {
                                        zA = false;
                                    }
                                    break;
                                default:
                                    zA = false;
                                    break;
                            }
                            if (zA) {
                                sVar.c(sVar.c[0]);
                            } else {
                                sVar.c(sVar.c[1]);
                            }
                        }
                    }
                }
            } else {
                sVar.c(a(sVar.a, sVar.f271a, i2));
                if (sVar.f273a != null) {
                    r.a(i2);
                    int[] iArrM73a = sVar.f273a.m73a(i2);
                    sVar.f287c[sVar.f271a] = (byte) sVar.f273a.d();
                    if (iArrM73a != null) {
                        if (iArrM73a[0] == 1) {
                            sVar.c(iArrM73a[1]);
                        } else if (iArrM73a[0] == 0) {
                            boolean z10 = false;
                            short[] sArr2 = sVar.f276a[sVar.f271a];
                            if (sArr2 != null) {
                                int i109 = 0;
                                while (i109 < sArr2.length) {
                                    int i110 = i109;
                                    int i111 = i109 + 1;
                                    short s3 = sArr2[i110];
                                    i109 = i111 + 1;
                                    short s4 = sArr2[i111];
                                    if (s3 == iArrM73a[1]) {
                                        sVar.c(s4);
                                        z10 = true;
                                    }
                                }
                            }
                            if (!z10 && t.b(iArrM73a[1]) == 2) {
                                sVar.c(-3);
                            }
                        }
                    }
                }
            }
            if (this.f2d != -1) {
                this.f2d = this.b.a();
            }
        }
    }

    private void d() {
        if (this.f) {
            return;
        }
        byte[] bArrM96a = t.m96a(786464);
        int i2 = 1;
        for (int i3 = bArrM96a[0]; i3 > 0; i3--) {
            int i4 = i2;
            int i5 = i2 + 1;
            byte b = bArrM96a[i4];
            int i6 = i5 + 1;
            int i7 = (bArrM96a[i5] & 255) << 24;
            int i8 = i6 + 1;
            int i9 = i7 | ((bArrM96a[i6] & 255) << 16);
            int i10 = i8 + 1;
            int i11 = i9 | ((bArrM96a[i8] & 255) << 8);
            int i12 = i10 + 1;
            int i13 = i11 | (bArrM96a[i10] & 255);
            int i14 = i12 + 1;
            int i15 = (bArrM96a[i12] & 255) << 24;
            int i16 = i14 + 1;
            int i17 = i15 | ((bArrM96a[i14] & 255) << 16);
            int i18 = i16 + 1;
            int i19 = i17 | ((bArrM96a[i16] & 255) << 8);
            int i20 = i18 + 1;
            int i21 = i19 | (bArrM96a[i18] & 255);
            i2 = i20 + 1;
            byte b2 = bArrM96a[i20];
            Image imageA = null;
            if (i21 != -1) {
                Image imageM8a = a.m8a(i21);
                imageA = imageM8a;
                if (imageM8a == null) {
                    imageA = t.a(i21);
                }
            }
            t.a(b, i13, imageA, b2);
        }
        this.f = true;
    }

    @Override // defpackage.h
    public final void a(Graphics graphics) {
        if (this.e) {
            a(graphics, (this.f1c * 50) / this.f0b);
            return;
        }
        if (this.b != null) {
            if (this.f2d != -1) {
                a(graphics, 100);
                return;
            }
            s sVar = this.b;
            if (sVar.f284c) {
                int iMin = sVar.f285d ? 100 + (0 / sVar.h) : Math.min(100, ((sVar.i + 1) * 100) / sVar.h);
                if (s.l != -1) {
                    iMin = s.l;
                }
                if (sVar.f285d) {
                    b(graphics, iMin);
                    return;
                } else {
                    b(graphics, iMin);
                    return;
                }
            }
            Object[] objArr = sVar.a;
            int i2 = sVar.f271a;
            switch (i2) {
                case 23:
                    graphics.setColor(16777215);
                    graphics.fillRect(0, 0, t.m98e(), t.a());
                    graphics.drawImage((Image) objArr[11], t.m98e() >> 1, t.a() >> 1, 3);
                    break;
                case 24:
                    graphics.setColor(16777215);
                    graphics.fillRect(0, 0, t.m98e(), t.a());
                    ((b) objArr[10]).a(graphics, t.m98e() >> 1, t.a() >> 1);
                    break;
                case 26:
                    n.a(graphics, 0, 0, t.m98e(), t.a(), 1981423, 65873, 1);
                    if (k.f188a < 0) {
                        if (k.f188a == -1) {
                            k.f190b.a(graphics, 0, 0);
                        }
                        if (k.f188a == -2) {
                            k.f191c.a(graphics, 0, 0);
                        }
                    } else if (k.a != null) {
                        k.a.a(graphics, k.f > 1 ? k.f193b.getWidth() + 5 : 0, 0);
                        if (k.f188a > -1 && k.f > 1) {
                            int i3 = (k.d / 120) % 5;
                            graphics.drawImage(k.f192a, 5 - i3, t.a() / 2, 6);
                            graphics.drawImage(k.f193b, (t.m98e() - 5) + i3, t.a() / 2, 10);
                        }
                    }
                    break;
                case 27:
                case 28:
                case 29:
                case 34:
                case 35:
                    n.a(graphics, 0, 0, t.m98e(), t.a(), 1981423, 65873, 1);
                    v vVar = f15a;
                    if (vVar.f320b && vVar.a != null) {
                        vVar.a.a(graphics, 0, 0);
                    }
                    break;
                case 30:
                    j.a(graphics);
                    break;
                case 31:
                case 33:
                    b(graphics);
                    e eVar = f14a;
                    if (eVar.f71a != null) {
                        eVar.f71a.a(graphics, 0, 0);
                    }
                    break;
                case 32:
                    n.a(graphics, 0, 0, t.m98e(), t.a(), 1981423, 65873, 1);
                    z.a(graphics, i2 == 32);
                    break;
                case 36:
                    z.a(f18a, graphics);
                    break;
            }
            if (sVar.f273a != null) {
                Object[] objArr2 = sVar.a;
                int i4 = sVar.f271a;
                n nVar = sVar.f273a;
                if (a(nVar)) {
                    graphics.setColor(16777215);
                    graphics.fillRect(0, 0, t.m98e(), t.a());
                } else {
                    b(graphics);
                }
                nVar.a(graphics);
                if (i4 == 0 && ((n) objArr2[5]) != null) {
                    ((n) objArr2[5]).a(graphics);
                }
                if (i4 == 19 && m6a() && !i) {
                    j = true;
                    ((n) objArr2[8]).a(graphics);
                }
            }
        }
    }

    @Override // defpackage.h
    public final void a(int i2, int i3) {
        int iM86a;
        if (this.e || this.b == null) {
            return;
        }
        s sVar = this.b;
        if (sVar.f284c) {
            return;
        }
        if (sVar.f273a != null && !j) {
            sVar.f273a.c(i2, i3);
        }
        if (sVar.a != null) {
            Object[] objArr = sVar.a;
            int i4 = sVar.f271a;
            int iM86a2 = t.m86a(i2);
            if (i4 == 19 && m6a() && !i) {
                if ((i3 == 3 && i2 == 1) || (i3 == 0 && t.m86a(i2) == 53)) {
                    i = true;
                    j = false;
                    b();
                    t.m85b();
                    t.a(0, 0);
                    t.a(5, 0);
                } else {
                    ((n) objArr[8]).c(i2, i3);
                }
            }
            boolean z = (i3 == 0 && iM86a2 == 53) || (i3 == 3 && t.b(i2) == 0);
            switch (i4) {
                case 0:
                    if (i3 == 0 && t.m92b(16) != null) {
                        if (((int[]) objArr[0]) == null) {
                            objArr[0] = new int[f12a.length];
                        }
                        ((int[]) objArr[0])[((int[]) objArr[2])[4] % f12a.length] = iM86a2;
                        boolean z2 = false;
                        for (int i5 = 0; i5 < f12a.length && !z2; i5++) {
                            if (((int[]) objArr[0])[((((int[]) objArr[2])[4] + i5) + 1) % f12a.length] != f12a[i5]) {
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            f13h = true;
                            z.a = true;
                            int iM98e = t.m98e() - (t.m98e() >> 2);
                            int iA = (t.a() - (t.a() >> 2)) - t.c();
                            int iM98e2 = (t.m98e() - iM98e) >> 1;
                            int iA2 = (t.a() - iA) >> 1;
                            ((int[]) objArr[2])[5] = 2000;
                            objArr[5] = new n();
                            ((n) objArr[5]).a(1, 1, 3);
                            ((n) objArr[5]).a(0, 1, t.m87a(436), (Image[]) null, -1);
                            ((n) objArr[5]).a(1, 0);
                            ((n) objArr[5]).a(4);
                            ((n) objArr[5]).a(iM98e2, iA2, iM98e, iA);
                        }
                        ((int[]) objArr[2])[4] = ((int[]) objArr[2])[4] + 1;
                        break;
                    }
                    break;
                case 6:
                    if (i3 == 0) {
                        if (iM86a2 == 50 || iM86a2 == 56) {
                            t.m101a(t.m83a()[((n) objArr[6]).d()][1]);
                        }
                    }
                    break;
                case 23:
                case 24:
                    if (z) {
                        h = 0;
                    }
                    break;
                case 26:
                    if ((i3 == 0 || i3 == 1) && ((iM86a = t.m86a(i2)) == 52 || iM86a == 54)) {
                        f.f74a = 0;
                    }
                    if (k.a != null) {
                        if (k.f186a != null) {
                            int iM86a3 = i3 == 0 ? t.m86a(i2) : 0;
                            if (k.f188a >= 0) {
                                if (iM86a3 == 52) {
                                    int i6 = k.b - 1;
                                    k.b = i6;
                                    if (i6 < 0) {
                                        k.b = k.f186a.length - 1;
                                    }
                                } else if (iM86a3 == 54) {
                                    int i7 = k.b + 1;
                                    k.b = i7;
                                    if (i7 > k.f186a.length - 1) {
                                        k.b = 0;
                                    }
                                }
                            }
                        }
                        k.a.c(i2, i3);
                    }
                    break;
                case 27:
                case 28:
                case 29:
                case 34:
                case 35:
                    v vVar = f15a;
                    if (vVar.f320b && !vVar.f321c && vVar.a != null) {
                        vVar.a.c(i2, i3);
                        break;
                    }
                    break;
                case 30:
                    z.b(i2, i3);
                    break;
                case 31:
                case 33:
                    e eVar = f14a;
                    if (eVar.f71a != null) {
                        eVar.f71a.c(i2, i3);
                    }
                    break;
                case 32:
                    z.m144a(i2, i3, i4 == 32);
                    break;
                case 36:
                    if (f18a != null) {
                        z.b(f18a, i2, i3);
                    }
                    break;
            }
        }
    }

    @Override // defpackage.h
    public final void b(int i2) {
        if (this.e || this.b == null) {
            return;
        }
        if (i2 != 1) {
            if (i2 == 5) {
                ((boolean[]) this.b.a[1])[6] = true;
                return;
            }
            return;
        }
        s sVar = this.b;
        Object[] objArr = sVar.a;
        z.d();
        s sVar2 = ((DCWall3D) objArr[3]).a;
        if (sVar2 != null && sVar2.a() == -1) {
            ((boolean[]) objArr[1])[0] = true;
        }
        ((int[]) objArr[2])[1] = -1;
        if (sVar.f273a == null || sVar.f284c) {
            return;
        }
        sVar.f273a.m72b();
    }

    @Override // defpackage.h
    public final String[][] a() {
        return new String[][]{new String[]{t.m87a(375)}, new String[]{t.m87a(376)}, new String[]{t.m87a(377)}, new String[]{t.m87a(378)}, new String[]{t.m87a(379)}};
    }

    @Override // defpackage.h
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String mo1a(int i2) {
        return new StringBuffer().append("").append(i2).toString();
    }

    private void c(int i2) {
        if (this.d) {
            s sVar = this.a;
            int i3 = sVar.f279c;
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                } else {
                    sVar.d(i3);
                }
            }
            if (sVar.f272b == -1) {
                sVar.f272b = sVar.f271a;
            }
            sVar.f271a = -1;
            sVar.f284c = false;
        }
        t.m90a(i2);
        this.f = false;
        d();
    }

    private static void a(Graphics graphics, int i2) {
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, t.m98e(), t.a());
        int iM98e = (t.m98e() * 88) / 176;
        int iA = (t.a() << 3) / 208;
        int i3 = iA;
        if (iA < 5) {
            i3 = 5;
        }
        int iM98e2 = (t.m98e() - iM98e) >> 1;
        int iA2 = (t.a() - i3) >> 1;
        graphics.setColor(0);
        graphics.drawRect(iM98e2, iA2, iM98e - 1, i3 - 1);
        graphics.fillRect(iM98e2 + 2, iA2 + 2, ((iM98e - 4) * i2) / 100, i3 - 4);
    }

    private static void a(Object[] objArr, DCWall3D dCWall3D, f fVar) {
        objArr[1] = new boolean[8];
        objArr[2] = new int[6];
        ((int[]) objArr[2])[1] = -1;
        ((int[]) objArr[2])[2] = -1;
        ((boolean[]) objArr[1])[5] = false;
        objArr[3] = dCWall3D;
        z.h();
        z.c();
        j.m64i();
        j.a(t.m98e(), t.a());
        j.g();
        f4b = (int) System.currentTimeMillis();
        f17e = fVar;
        ((boolean[]) objArr[1])[4] = t.m92b(5) != null;
        f14a = t.m106a();
        f15a = t.m105a();
        ((boolean[]) objArr[1])[5] = (f15a.f320b ? (char) 4 : (char) 2) == 4;
        try {
            f16d = new f(t.m104a(0, 8), 0, -1);
            objArr[9] = new f(t.m104a(0, 8), 16711680, -1);
        } catch (IOException unused) {
        }
        h.f93b = true;
        byte[] bArrM94a = t.m94a("wallrs");
        if (bArrM94a != null) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArrM94a));
                z.B = dataInputStream.readInt();
                z.C = dataInputStream.readInt();
                z.D = dataInputStream.readInt();
                z.E = dataInputStream.readInt();
                z.F = dataInputStream.readInt();
                z.G = dataInputStream.readInt();
                z.H = dataInputStream.readInt();
                i = dataInputStream.readBoolean();
                z.I = dataInputStream.readInt();
                z.O = dataInputStream.readInt();
                z.J = dataInputStream.readInt();
                z.L = dataInputStream.readInt();
                z.K = dataInputStream.readInt();
                z.p = dataInputStream.readInt();
                z.M = dataInputStream.readInt();
                z.N = dataInputStream.readInt();
                z.s = dataInputStream.readInt();
                g = dataInputStream.readByte() == 1;
                int i2 = dataInputStream.readInt();
                z.P = i2;
                z.Q = i2;
                z.o = dataInputStream.readInt();
                f8a = dataInputStream.readInt();
                z.v = dataInputStream.readInt();
                z.u = dataInputStream.readInt();
                z.x = dataInputStream.readInt();
                z.w = dataInputStream.readInt();
                z.y = dataInputStream.readInt();
                z.g = dataInputStream.readInt();
                z.t = dataInputStream.readInt();
                for (int i3 = 0; i3 < z.f418i.length; i3++) {
                    z.f417c[i3] = dataInputStream.readByte();
                }
                for (int i4 = 0; i4 < 9; i4++) {
                    z.f356a[i4] = dataInputStream.readByte() == 1;
                }
                for (int i5 = 0; i5 < 30; i5++) {
                    z.f357b[i5] = dataInputStream.readByte() == 1;
                }
                z.d = dataInputStream.readInt();
            } catch (IOException unused2) {
            }
        } else {
            e();
            b();
        }
        f19a = new b(a.a(196681), true);
        ((int[]) objArr[2])[1] = -1;
        ((boolean[]) objArr[1])[2] = false;
        h.f93b = true;
        if (t.m92b(7) != null) {
            ((int[]) objArr[2])[2] = t.b();
        } else if (t.m83a().length == 1) {
            ((int[]) objArr[2])[2] = 0;
        }
        byte[] bArrM94a2 = t.m94a("settings");
        if (bArrM94a2 != null) {
            ((int[]) objArr[2])[2] = bArrM94a2[0];
            ((DCWall3D) objArr[3]).c(((int[]) objArr[2])[2]);
            t.m99b((int) bArrM94a2[1]);
            z.f355c = bArrM94a2[3] == 1;
            ((boolean[]) objArr[1])[3] = bArrM94a2[4] == 1;
        }
        j.a();
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d4  */
    private static int a(Object[] objArr, int i2, int i3) {
        char c;
        if (i2 == 19 && m6a() && !i) {
            t.m85b();
            t.a(1, 0);
            ((n) objArr[8]).m73a(i3);
        }
        if (i2 != 30) {
            h.c = true;
        }
        if (((boolean[]) objArr[1])[6]) {
            ((boolean[]) objArr[1])[6] = false;
            return 0;
        }
        long j2 = 0;
        ((boolean[]) objArr[1])[2] = false;
        if (((boolean[]) objArr[1])[0]) {
            j2 = 0;
            ((boolean[]) objArr[1])[0] = false;
            if (i2 == 30) {
                return 13;
            }
            a(objArr, i2);
        }
        switch (i2) {
            case 23:
            case 24:
                if (i2 == 24) {
                    ((b) objArr[10]).b(i3);
                }
                int i4 = h - i3;
                h = i4;
                if (i4 < 0) {
                    return -2;
                }
                break;
            case 26:
                h.c = true;
                char c2 = 0;
                k.d += i3;
                if (k.f189a.length == 0) {
                    c = 2;
                } else {
                    n nVar = null;
                    if (k.b >= 0) {
                        nVar = k.f186a[k.b];
                    } else if (k.b == -1) {
                        nVar = k.f190b;
                    } else if (k.b == -2) {
                        nVar = k.f191c;
                    }
                    if (k.a == null || k.a != nVar) {
                        k.f188a = k.b;
                        n nVar2 = nVar;
                        k.a = nVar2;
                        nVar2.m72b();
                    } else {
                        int[] iArrM73a = k.a.m73a(i3);
                        if (iArrM73a != null) {
                            if (k.f188a < 0) {
                                if (k.f188a == -2) {
                                    k.b = k.c;
                                } else {
                                    c2 = 2;
                                }
                            } else if (iArrM73a[1] == k.e) {
                                String str = k.f189a[k.f188a];
                                k.f187a = str;
                                if (str.equals("nolink")) {
                                    k.c = k.f188a;
                                    k.b = -2;
                                } else if (h.a(k.f187a)) {
                                    c2 = 1;
                                } else {
                                    k.b = -1;
                                }
                            } else {
                                c2 = 2;
                            }
                        }
                    }
                    if (c2 != 0) {
                        k.f188a = 0;
                        k.b = 0;
                        t.m85b();
                        k.a = null;
                        k.f186a = null;
                        k.f190b = null;
                        k.f191c = null;
                        k.f192a = null;
                        k.f193b = null;
                    }
                    c = c2;
                }
                char c3 = c;
                if (c != 0) {
                    ((boolean[]) objArr[1])[1] = c3 == 1;
                    return -3;
                }
                break;
            case 27:
            case 28:
            case 29:
            case 34:
            case 35:
                int iM112a = f15a.m112a(i3);
                if (iM112a != 0) {
                    ((boolean[]) objArr[1])[5] = iM112a == 4;
                    return i2 == 29 ? -3 : -2;
                }
                break;
            case 30:
                long jCurrentTimeMillis = System.currentTimeMillis();
                f3a = j2;
                int i5 = (int) (jCurrentTimeMillis - f4b);
                i3 = i5;
                if (i5 < 25) {
                    return -1;
                }
                f4b = f3a;
                f9e += i3;
                int iMin = Math.min(i3, 80);
                z.s += iMin;
                int i6 = 0;
                int i7 = f10f + iMin;
                f10f = i7;
                int i8 = i7 / 25;
                f10f -= i8 * 25;
                f11g++;
                if (f9e >= 1000) {
                    f9e = 0;
                    f11g = 0;
                }
                System.currentTimeMillis();
                for (int i9 = 0; i9 < i8; i9++) {
                    int iA = z.a(25);
                    i6 = iA;
                    if (iA != 0) {
                        System.currentTimeMillis();
                        z.S = 0;
                        if (i6 == 4) {
                            return 13;
                        }
                        if (i6 == 5) {
                            z.m142h(-1);
                            return 15;
                        }
                        if (i6 == 6) {
                            return 16;
                        }
                        if (i6 == 7) {
                            z.m142h(-1);
                            return 17;
                        }
                    }
                }
                System.currentTimeMillis();
                z.S = 0;
                if (i6 == 4) {
                    return 13;
                }
                if (i6 == 5) {
                    z.m142h(-1);
                    return 15;
                }
                if (i6 == 6) {
                    return 16;
                }
                if (i6 == 7) {
                    z.m142h(-1);
                    return 17;
                }
                break;
            case 31:
            case 33:
                e eVar = f14a;
                h.c = true;
                boolean z = false;
                if (eVar.f72a == null) {
                    eVar.b();
                }
                if (eVar.f71a != eVar.f72a[e.f70a[3]]) {
                    eVar.f71a = eVar.f72a[e.f70a[3]];
                    if (e.f70a[3] == 1) {
                        if (e.f70a[0] > 1) {
                            eVar.b[1] = 0;
                        } else {
                            eVar.b[1] = -7;
                        }
                        eVar.f71a.a(e.a[e.f70a[2]][0], (Image) null);
                        String string = "";
                        for (int i10 = 1; i10 <= 1; i10++) {
                            string = new StringBuffer().append(string).append(e.a(e.f70a[2], 1)).toString();
                        }
                        eVar.f71a.a(0, 1, string, (Image[]) null, -1);
                        eVar.f71a.b(t.m98e(), t.a());
                    }
                    eVar.f71a.m72b();
                } else {
                    int[] iArrM73a2 = eVar.f71a.m73a(i3);
                    if (iArrM73a2 != null) {
                        z = false;
                        if (iArrM73a2[0] == 0) {
                            if (iArrM73a2[1] == 5) {
                                e.f70a[3] = eVar.b[e.f70a[3]];
                                if (e.f70a[3] == -7) {
                                    z = true;
                                    eVar.f71a = null;
                                    eVar.f72a = null;
                                }
                            }
                        } else if (iArrM73a2[0] == 1 && e.f70a[3] == 0) {
                            e.f70a[2] = iArrM73a2[1];
                            e.f70a[3] = 1;
                        }
                    }
                }
                if (z) {
                    return -2;
                }
                break;
            case 32:
                int i11 = z.i(i3);
                z.ap = 0;
                if (i11 == 2) {
                    return -3;
                }
                break;
            case 36:
                int iM155a = z.m155a(f18a, i3);
                if (iM155a != -1) {
                    return iM155a;
                }
                break;
        }
        if (((int[]) objArr[2])[5] <= 0) {
            return -1;
        }
        ((int[]) objArr[2])[5] = ((int[]) objArr[2])[5] - i3;
        if (((int[]) objArr[2])[5] > 0 || ((n) objArr[5]) == null) {
            return -1;
        }
        ((n) objArr[5]).m78d();
        objArr[5] = null;
        return -1;
    }

    private static void b(Graphics graphics) {
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, t.m98e(), t.a());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final void m2a(Object[] objArr, int i2, int i3) {
        switch (i3) {
            case 1:
                h.f92a.f91a = true;
                break;
            case 2:
                z.m = 3;
                z.n = 1;
                break;
            case 3:
            case 24:
            case 25:
                if (i3 != 3) {
                    z.f355c = i3 == 24;
                    a(objArr);
                }
                z.m = 1;
                z.Y = z.x;
                z.Z = z.y;
                z.f = z.g;
                break;
            case 4:
                b();
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                z.a(t.m98e(), t.a());
                z.b();
                if (i3 == 11) {
                    z.i = 0;
                } else if (i3 == 10) {
                    z.Y = z.x;
                    z.X = z.w;
                    z.Z = z.y;
                    z.f = z.g;
                } else if (i3 == 9) {
                    z.x = 0;
                    z.y = 0;
                    z.w = 5;
                    z.p = 0;
                    z.g = 0;
                    z.P = 0;
                } else if (i3 == 8) {
                    a(false);
                    z.X = z.u;
                    z.Y = z.v;
                    z.m139b(z.o);
                } else if (i3 == 7) {
                    a(true);
                    z.o = 0;
                    f8a = 4;
                    z.v = 0;
                    z.u = 5;
                    z.N++;
                    z.m139b(z.o);
                }
                z.U = 1;
                z.e();
                b();
                break;
            case 16:
                ((int[]) objArr[2])[3] = 4;
                break;
            case 17:
                ((int[]) objArr[2])[3] = 5;
                break;
            case 18:
                ((boolean[]) objArr[1])[2] = true;
                break;
            case 20:
            case 29:
                t.m99b(((n) objArr[4]).m74b(i3 == 29 ? 0 : 2));
                t.b(65539, 1);
                a(objArr);
                break;
            case 22:
            case 32:
                z.f355c = ((n) objArr[4]).m74b(4) == 1;
                a(objArr);
                break;
            case 23:
                b();
                break;
            case 26:
            case 27:
            case 28:
                if (i3 != 26) {
                    z.f355c = i3 == 27;
                    a(objArr);
                }
                z.m = 2;
                z.Y = z.v;
                break;
            case 33:
                ((int[]) objArr[2])[2] = ((n) objArr[7]).d();
                if (((int[]) objArr[2])[2] != t.b()) {
                    ((DCWall3D) objArr[3]).c(((int[]) objArr[2])[2]);
                    j.a();
                    a(objArr);
                }
                break;
            case 34:
                ((boolean[]) objArr[1])[7] = true;
                break;
            case 35:
                z.aq = 0;
                break;
            case 36:
                b(true);
                f16d = null;
                break;
            case 37:
                b(false);
                f16d = null;
                break;
            case 38:
                ((int[]) objArr[2])[2] = ((n) objArr[6]).d();
                ((DCWall3D) objArr[3]).c(((int[]) objArr[2])[2]);
                j.a();
                a(objArr);
                objArr[6] = null;
                break;
        }
    }

    private static void e() {
        z.a();
        for (int i2 = 0; i2 < e.f70a[0]; i2++) {
            for (int i3 = 0; i3 < 1; i3++) {
                for (int i4 = 0; i4 < e.f70a[1]; i4++) {
                    e.f69a[i2][i3][i4] = 0;
                }
            }
        }
        e.a();
        z.s = 0;
        z.t = -1;
        g = true;
        z.n = -1;
        z.P = 0;
        i = false;
        z.a = false;
        z.f355c = false;
        for (int i5 = 0; i5 < 9; i5++) {
            z.f356a[i5] = false;
        }
        for (int i6 = 0; i6 < 30; i6++) {
            z.f357b[i6] = false;
        }
        z.o = 0;
        f8a = 0;
        z.v = 0;
        z.u = 5;
        z.x = 0;
        z.w = 5;
        z.y = 0;
        z.g = 0;
        z.p = 0;
        for (int i7 = 0; i7 < z.f418i.length; i7++) {
            z.f417c[i7] = 0;
        }
    }

    private static void a(boolean z) {
        if (z.u <= 0) {
            f8a--;
            z.u = 5;
        }
        if (z) {
            z.o = 0;
            f8a = 4;
            z.v = 0;
            z.u = 5;
        }
    }

    private static String a(Object[] objArr, int i2, int i3, int i4) {
        if (i2 == 2) {
            if (i4 == 0 && ((boolean[]) objArr[1])[5]) {
                i3 = 437;
            }
        } else if (i2 == 0) {
            if (i4 == 0) {
                return f15a.m113a();
            }
            if (i4 == 10) {
                return null;
            }
        }
        return t.m87a(i3);
    }

    private static void a(Object[] objArr, int i2, n nVar, int i3) {
        if (i3 != 0) {
            if (i3 == 1) {
                switch (i2) {
                    case 5:
                        nVar.b(null, f16d, f16d, f16d);
                        break;
                    case 6:
                        objArr[6] = nVar;
                        nVar.b(null, f16d, f16d, (f) objArr[9]);
                        break;
                    case 7:
                        objArr[7] = nVar;
                        break;
                }
            }
            if (i3 == 2) {
                int iD = t.d();
                switch (i2) {
                    case 3:
                        nVar.d(0, iD);
                        nVar.d(4, z.f355c ? 1 : 0);
                        break;
                    case 8:
                        nVar.d(2, iD);
                        nVar.d(4, z.f355c ? 1 : 0);
                        break;
                    case 19:
                        nVar.a(t.m87a(317));
                        nVar.m71a();
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m3a(int i2, int i3) {
        return i2 == 0 && i3 == 1;
    }

    private static void a(Object[] objArr, boolean z) {
        if (z) {
            t.m91d();
            ((int[]) objArr[2])[1] = -1;
        }
    }

    private static void b(boolean z) {
        int iD = t.d();
        if (!z) {
            iD = 0;
        } else if (iD == 0) {
            iD = 3;
        }
        t.m99b(iD);
    }

    private static void a(Object[] objArr, int i2) {
        int i3;
        if (((boolean[]) objArr[1])[1] && (i2 == 26 || ((int[]) objArr[2])[0] == 26)) {
            return;
        }
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 32:
                i3 = 65538;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 17:
            case 23:
                i3 = -1;
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 31:
            case 33:
            case 34:
            case 35:
                i3 = -1;
                break;
            case 30:
                int iM122a = z.m122a();
                i3 = iM122a;
                z.R = iM122a;
                break;
            case 36:
                i3 = 65541;
                break;
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 47:
                i3 = -1;
                break;
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            default:
                i3 = -1;
                break;
        }
        if (i3 == -1) {
            t.m91d();
        } else if (i3 != ((int[]) objArr[2])[1]) {
            t.b(i3, -1);
        }
        ((int[]) objArr[2])[1] = i3;
    }

    private static void a(Object[] objArr) {
        h.f93b = true;
        byte[] bArr = new byte[5];
        bArr[0] = (byte) ((int[]) objArr[2])[2];
        bArr[1] = (byte) t.d();
        bArr[3] = z.f355c ? (byte) 1 : (byte) 0;
        bArr[4] = ((boolean[]) objArr[1])[3] ? (byte) 1 : (byte) 0;
        t.a("settings", bArr);
    }

    public static void b() {
        h.f93b = true;
        if (f13h) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(z.B);
            dataOutputStream.writeInt(z.C);
            dataOutputStream.writeInt(z.D);
            dataOutputStream.writeInt(z.E);
            dataOutputStream.writeInt(z.F);
            dataOutputStream.writeInt(z.G);
            dataOutputStream.writeInt(z.H);
            dataOutputStream.writeBoolean(i);
            dataOutputStream.writeInt(z.I);
            dataOutputStream.writeInt(z.O);
            dataOutputStream.writeInt(z.J);
            dataOutputStream.writeInt(z.L);
            dataOutputStream.writeInt(z.K);
            dataOutputStream.writeInt(z.p);
            dataOutputStream.writeInt(z.M);
            dataOutputStream.writeInt(z.N);
            dataOutputStream.writeInt(z.s);
            dataOutputStream.writeByte(g ? 1 : 0);
            dataOutputStream.writeInt(z.P);
            dataOutputStream.writeInt(z.o);
            dataOutputStream.writeInt(f8a);
            dataOutputStream.writeInt(z.v);
            dataOutputStream.writeInt(z.u);
            dataOutputStream.writeInt(z.x);
            dataOutputStream.writeInt(z.w);
            dataOutputStream.writeInt(z.y);
            dataOutputStream.writeInt(z.g);
            dataOutputStream.writeInt(z.t);
            for (int i2 = 0; i2 < z.f418i.length; i2++) {
                dataOutputStream.writeByte(z.f417c[i2]);
            }
            for (int i3 = 0; i3 < 9; i3++) {
                dataOutputStream.writeByte(z.f356a[i3] ? 1 : 0);
            }
            for (int i4 = 0; i4 < 30; i4++) {
                dataOutputStream.writeByte(z.f357b[i4] ? 1 : 0);
            }
            dataOutputStream.writeInt(z.d);
        } catch (IOException unused) {
        }
        t.b("wallrs", byteArrayOutputStream.toByteArray());
    }

    private static boolean a(n nVar) {
        return nVar.a() == 4 || nVar.a() == 5;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m4a(Object[] objArr, int i2, int i3) {
        switch (i2) {
            case 0:
                if (i3 == 7) {
                    return false;
                }
                if (i3 == 6) {
                    return ((boolean[]) objArr[1])[4] && ((boolean[]) objArr[1])[3];
                }
                if (i3 == 1) {
                    return ((boolean[]) objArr[1])[4] && !((boolean[]) objArr[1])[3];
                }
                if (i3 == 0) {
                    return f15a.m113a() != null;
                }
                if (i3 == 10 || i3 == 5) {
                    return false;
                }
                return i3 == 4 ? true : true;
            case 1:
                return (i3 != 1 && i3 == 3) ? true : true;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                return true;
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
                return i3 != 3 || t.m83a().length > 1;
            case 8:
                if (i3 == 1) {
                    return false;
                }
                return i3 == 2 || i3 != 3;
        }
    }

    private static void a(int i2, n nVar, int i3, int i4, int i5) {
        if (i2 != 6 && i2 != 7) {
            nVar.a(i3, i4, i5);
            if (i2 == 0) {
                nVar.m75c();
                return;
            }
            return;
        }
        String[][] strArrM83a = t.m83a();
        nVar.a(i3, strArrM83a.length, i5);
        int i6 = i2 == 6 ? 38 : 33;
        for (int i7 = 0; i7 < strArrM83a.length; i7++) {
            nVar.a(i7, 0, strArrM83a[i7][0], (Image[]) null, i6);
        }
    }

    private static void a(Object[] objArr, int i2, n nVar, int i3, int i4, String str, b bVar, Image[] imageArr, int i5) {
        if (m4a(objArr, i2, i3)) {
            if (bVar != null) {
                nVar.a(i3, i4, str, bVar, i5);
            } else {
                nVar.a(i3, i4, str, imageArr, i5);
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m5a(int i2) {
        switch (i2) {
            case 5:
            case 6:
            case 23:
            case 24:
                return false;
            default:
                return true;
        }
    }

    private static void b(Graphics graphics, int i2) {
        int iM98e = t.m98e();
        int iA = t.a();
        if (j.f160c != null) {
            j.f160c.c(0);
            j.a(graphics, f19a);
            f17e.a(graphics, new StringBuffer().append("").append(i2).append("%").toString(), iM98e >> 1, (((iA - j.f160c.f()) - j.f160c.h()) - f17e.b()) - 2, 17);
            j.f160c.a(graphics, iM98e >> 1, iA - j.f160c.h());
            int iG = j.f160c.g();
            graphics.setClip((iM98e - iG) >> 1, 0, (iG * i2) / 100, iA);
            j.f160c.c(1);
            j.f160c.a(graphics, iM98e >> 1, iA - j.f160c.h());
            graphics.setClip(0, 0, iM98e, iA);
            return;
        }
        n.a(graphics, 0, 0, iM98e, iA, 1981423, 65873, 1);
        int i3 = iM98e >> 1;
        int iMax = Math.max(iA >> 6, 8);
        int i4 = (iM98e - i3) >> 1;
        int i5 = (iA - iMax) >> 1;
        f17e.a(graphics, new StringBuffer().append("").append(i2).append("%").toString(), iM98e >> 1, (i5 - f17e.b()) - 2, 17);
        graphics.setColor(16777215);
        graphics.drawRect(i4, i5, i3 - 1, iMax - 1);
        graphics.setColor(11612419);
        graphics.fillRect(i4 + 2, i5 + 2, ((i3 - 4) * i2) / 100, iMax - 4);
    }

    public static void c() {
        if (t.m102c(1) == 14) {
            t.a(1, 1);
        } else if (t.m102c(3) == 14) {
            t.a(1, 3);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m6a() {
        return z.a || z.m145f() >= 3;
    }
}
