package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: loaded from: bbr-2.jar:ay.class */
public final class ay {
    private n[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private n f25a;
    private int ea;
    private int eb;
    private boolean an;
    private int ec;
    private int ed;
    private boolean ao;
    private static Vector g;
    private static Vector h;
    private int eg;
    private static boolean ap = true;
    private static int ee = 10;
    private static int ef = 1 << ee;

    private ay(n[] nVarArr) {
        this.eg = ef;
        a(nVarArr, -2);
    }

    public ay(n nVar) {
        this(new n[]{nVar});
    }

    public ay(n[] nVarArr, boolean z) {
        this.eg = ef;
        a(nVarArr, z ? -1 : 1);
    }

    public ay(n nVar, boolean z) {
        this(new n[]{nVar}, z);
    }

    public ay() {
        this.eg = ef;
    }

    public final ay a() {
        if (this.ec == -2) {
            return new ay(this.a);
        }
        return new ay(this.a, this.ec == -1);
    }

    private void a(n[] nVarArr, int i) {
        if (this.a != null) {
            m();
        }
        this.a = nVarArr;
        int length = nVarArr.length;
        while (true) {
            length--;
            if (length < 0) {
                b(0, i, true);
                return;
            }
            ar.a(nVarArr[length], 1);
        }
    }

    public final int r() {
        return this.f25a.r();
    }

    public final int A() {
        return this.f25a.getDuration();
    }

    private int B() {
        return this.f25a.h(this.ea) + (this.eb >> ee);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final n m7a() {
        return this.f25a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final g m8a() {
        return this.f25a.a(this.ea).a(0);
    }

    public final void y(int i) {
        z(0);
        boolean z = this.an;
        int i2 = this.eg;
        this.an = false;
        this.eg = ef;
        n(i);
        this.eg = i2;
        this.an = z;
    }

    public final void n(int i) {
        if (i > 0) {
            int i2 = i * this.eg;
            i = i2;
            if (i2 == 0 && this.eg > 0) {
                i = 1;
            }
        }
        if (this.ao) {
            this.eb -= i;
            while (this.eb < 0) {
                this.ea--;
                if (this.ea == -1) {
                    if (this.ed > 0) {
                        this.ed--;
                    }
                    this.ea = this.f25a.r() - 1;
                    if (this.ed == 0) {
                        this.ea = 0;
                        this.eb = 0;
                        return;
                    }
                }
                int i3 = this.f25a.i(this.ea);
                int i4 = i3;
                if (i3 != Integer.MAX_VALUE) {
                    i4 <<= ee;
                }
                this.eb += i4;
                if (this.an) {
                    this.eb = i4 - 1;
                }
            }
            return;
        }
        int i5 = this.f25a.i(this.ea);
        int i6 = i5;
        int i7 = i5 << ee;
        this.eb += i;
        while ((this.eb >> ee) >= i6) {
            this.eb -= i7;
            if (this.an) {
                this.eb = 0;
            }
            int iR = this.f25a.r();
            this.ea++;
            if (this.ea >= iR) {
                if (this.ed > 0) {
                    this.ed--;
                }
                this.ea = 0;
                if (this.ed == 0) {
                    this.ea = iR - 1;
                    this.eb = i7 - 1;
                    return;
                }
            }
            int i8 = this.f25a.i(this.ea);
            i6 = i8;
            i7 = i8 << ee;
        }
    }

    public final void g(int i, int i2) {
        b bVarM26a = ba.m26a();
        int iD = bVarM26a.d();
        int iC = bVarM26a.c();
        int iE = bVarM26a.e();
        int iF = bVarM26a.f();
        int iB = B();
        n nVar = this.f25a;
        boolean zD = this.f25a.d();
        if (zD) {
            i += this.f25a.d() ? this.f25a.a(1, B(), m9i()) : 0;
            i2 += this.f25a.d() ? this.f25a.a(2, B(), m9i()) : 0;
            boolean zM9i = m9i();
            int iA = nVar.a(5, iB, zM9i);
            if (iD == -8355712) {
                iD = nVar.a(0, iB, zM9i);
            }
            iC += iA;
            iE = (nVar.a(3, iB, zM9i) * iE) >> 10;
            iF = (nVar.a(4, iB, zM9i) * iF) >> 10;
        }
        if ((iD & (-16777216)) == 0) {
            return;
        }
        if (zD) {
            bVarM26a.m16c();
            bVarM26a.c(iD);
            bVarM26a.a(iC);
            bVarM26a.setScale(iE, iF);
        }
        bb bbVarA = nVar.a(this.ea);
        int iN = nVar.n();
        int iO = nVar.o();
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        l lVarM4a = null;
        if (bVarM26a.d() != -8355712 || bVarM26a.e() != 1024 || bVarM26a.f() != 1024 || bVarM26a.c() != 0 || bVarM26a.g() != 0 || bVarM26a.a() > 1 || bVarM26a.b() > 1) {
            int[][] iArrA = bbVarA.a();
            int length = iArrA.length;
            z2 = bVarM26a.a() > 1 || bVarM26a.b() > 1;
            int i4 = 0;
            while (i4 < length) {
                int[] iArr = iArrA[i4];
                switch (iArr[0]) {
                    case 1:
                        if (length == 1) {
                            z = true;
                            iN = -iArr[1];
                            iO = -iArr[2];
                            lVarM4a = ar.m4a(iArr[3]);
                            int i5 = iArr[4];
                            if ((i5 & 1) != 0) {
                                i3 = 1;
                            }
                            if ((i5 & 2) != 0) {
                                i3 |= 2;
                            }
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 8:
                    default:
                        continue;
                        i4++;
                        break;
                    case 5:
                        if (iArr[4] == iArr[5] || bVarM26a.c() == 0) {
                        }
                        i4++;
                        break;
                    case 7:
                    case 9:
                        break;
                }
                z2 = true;
                i4 = length;
                i4++;
            }
        }
        if (iD != -8355712) {
            z2 = true;
        }
        if (!z2) {
            nVar.e(i, i2, iB);
            if (zD) {
                bVarM26a.m15b();
                return;
            }
            return;
        }
        boolean z3 = ap && nVar.e();
        if (!z) {
            int iP = nVar.p();
            int iQ = nVar.q();
            if (z3) {
                lVarM4a = bbVarA.m29a();
            } else {
                if (g == null) {
                    g = new Vector();
                    h = new Vector();
                }
                boolean z4 = false;
                lVarM4a = null;
                int size = h.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        l lVar = (l) h.elementAt(size);
                        lVarM4a = lVar;
                        lVar.d(0, 0, 0);
                        if (iP <= lVarM4a.getWidth() && iQ <= lVarM4a.getHeight()) {
                            h.removeElementAt(size);
                            z4 = true;
                        }
                    }
                }
                if (!z4) {
                    lVarM4a = new l((iP * 12) / 10, (iQ * 12) / 10);
                }
                if (iP != lVarM4a.c.getWidth() || iQ != lVarM4a.getHeight()) {
                    lVarM4a.d(0, iP, iQ);
                }
                g.addElement(lVarM4a);
            }
            if (!(bbVarA.j() ? false : bVarM26a.m17a(lVarM4a))) {
                bVarM26a.m16c();
                int iK = bVarM26a.k();
                bVarM26a.m12a();
                bVarM26a.d(iK);
                bVarM26a.a(lVarM4a, iP, iQ);
                bVarM26a.a(0, 0);
                bVarM26a.a(lVarM4a);
                nVar.e(iN, iO, iB);
                bVarM26a.m15b();
            }
        }
        int i6 = bVarM26a.i();
        int iJ = bVarM26a.j();
        bVarM26a.a(i, i2);
        bVarM26a.a(lVarM4a, -iN, -iO, i3, 20);
        bVarM26a.a(i6, iJ);
        if (!z3 && !z) {
            g.removeElement(lVarM4a);
            h.addElement(lVarM4a);
        }
        if (zD) {
            bVarM26a.m15b();
        }
    }

    public final void c(Graphics graphics, int i, int i2) {
        ba.m26a().a(graphics);
        g(i, i2);
    }

    public final void b(int i, int i2, boolean z) {
        this.f25a = this.a[i];
        this.ec = i2;
        this.an = z;
        if (this.ao) {
            z(this.f25a.r() - 1);
        } else {
            z(0);
        }
    }

    public final int C() {
        int i = 0;
        while (this.f25a != this.a[i]) {
            i++;
        }
        return i;
    }

    public final int D() {
        return this.a.length;
    }

    public final void z(int i) {
        this.ea = i;
        this.ed = this.ec;
        if (this.ec == -2) {
            this.ed = 1;
            if (this.f25a.c()) {
                this.ed = -1;
            }
        }
        if (this.ao) {
            this.eb = (this.f25a.i(i) << ee) - 1;
        } else {
            this.eb = 0;
        }
    }

    public final boolean h() {
        return this.ed == 0;
    }

    public final int i() {
        return this.f25a.getX();
    }

    public final int j() {
        return this.f25a.getY();
    }

    public final int getWidth() {
        return this.f25a.getWidth();
    }

    public final int getHeight() {
        return this.f25a.getHeight();
    }

    public final void m() {
        if (this.a == null) {
            return;
        }
        int length = this.a.length;
        while (true) {
            length--;
            if (length < 0) {
                ar.O();
                this.a = null;
                return;
            }
            this.a[length].m();
        }
    }

    public final void P() {
        this.ao = true;
    }

    /* JADX INFO: renamed from: i, reason: collision with other method in class */
    private boolean m9i() {
        if (this.ed != 0) {
            return (this.ed == 1 && this.ea == this.f25a.r() - 1) ? false : true;
        }
        return false;
    }
}
