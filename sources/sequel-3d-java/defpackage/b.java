package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: loaded from: sequel-3d-java.jar:b.class */
public final class b {
    private aa[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private aa f44a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f45a;
    private int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f46a;
    private int c;
    private int d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Vector f48a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Vector f49b;
    private int g = f;
    private int h;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean f47b = true;
    private static int e = 10;
    private static int f = 1 << e;

    public b(aa aaVar) {
        a((aa[]) null, aaVar, -2);
    }

    public b(aa[] aaVarArr) {
        if (aaVarArr.length == 1) {
            a((aa[]) null, aaVarArr[0], -1);
        } else {
            a(aaVarArr, (aa) null, -1);
        }
    }

    public b(aa aaVar, boolean z) {
        a((aa[]) null, aaVar, z ? -1 : 1);
    }

    public b() {
    }

    private void a(aa[] aaVarArr, aa aaVar, int i) {
        if (this.a != null) {
            m24a();
        } else if (this.f44a != null) {
            this.f44a.m18a();
        }
        this.a = aaVarArr;
        if (aaVarArr != null) {
            int length = aaVarArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                } else {
                    a.a(aaVarArr[length], 1);
                }
            }
        } else {
            a.a(aaVar, 1);
            this.f44a = aaVar;
        }
        a(0, i, true);
    }

    public final int a() {
        return this.f44a.i();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final aa m21a() {
        return this.f44a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final q m22a() {
        return this.f44a.m16a(this.f45a).a(0);
    }

    public final void a(int i) {
        int i2 = i;
        int iJ = this.f44a.j();
        boolean z = this.d == -1 || this.d > 1;
        boolean z2 = z;
        if (z) {
            i2 %= iJ;
        } else if (i2 > iJ) {
            i2 = iJ;
        }
        c(0);
        boolean z3 = this.f46a;
        int i3 = this.g;
        this.f46a = false;
        this.g = f;
        b(i2);
        this.g = i3;
        this.f46a = z3;
        if (z2) {
            this.h = i / iJ;
        }
    }

    public final void b(int i) {
        if (i > 0) {
            int i2 = i * this.g;
            i = i2;
            if (i2 == 0 && this.g > 0) {
                i = 1;
            }
        }
        int iB = this.f44a.b(this.f45a);
        this.b += i;
        if (this.b < 0) {
            this.b -= Integer.MIN_VALUE;
        }
        while ((this.b >> e) >= iB) {
            int i3 = iB << e;
            this.b -= i3;
            if (this.f46a) {
                this.b = 0;
            }
            int i4 = this.f44a.i();
            this.f45a++;
            if (this.f45a >= i4) {
                if (this.d > 0) {
                    this.d--;
                }
                if (this.d == 0) {
                    this.f45a = i4 - 1;
                    this.b = i3 - 1;
                    return;
                } else {
                    this.f45a = 0;
                    this.h++;
                }
            }
            iB = this.f44a.b(this.f45a);
        }
    }

    public final void a(int i, int i2) {
        aa aaVar = this.f44a;
        u uVarM16a = aaVar.m16a(this.f45a);
        int[][] iArrA = uVarM16a.a();
        int length = iArrA.length;
        if (length == 0) {
            return;
        }
        d dVarM107a = t.m107a();
        int iD = dVarM107a.d();
        int iA = this.f44a.a(this.f45a) + (this.b >> e);
        if ((iD & (-16777216)) == 0) {
            return;
        }
        int iA2 = aaVar.a();
        int iB = aaVar.b();
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        c cVar = null;
        if (length == 1) {
            int[] iArr = iArrA[0];
            if (iArr[0] == 1) {
                z2 = true;
                z = true;
                iA2 = -iArr[1];
                iB = -iArr[2];
                cVar = a.m12a(iArr[3]);
                int i4 = iArr[4];
                if ((i4 & 1) != 0) {
                    i3 = 1;
                }
                if ((i4 & 2) != 0) {
                    i3 |= 2;
                }
            }
        }
        if (!z2) {
            if (iD != -8355712 || dVarM107a.a() > 1 || dVarM107a.b() > 1 || dVarM107a.g() != 0) {
                z2 = true;
            } else if (dVarM107a.e() != 1024 || dVarM107a.f() != 1024 || dVarM107a.c() != 0) {
                int i5 = 0;
                while (i5 < length) {
                    switch (iArrA[i5][0]) {
                        case 1:
                        case 5:
                        case 7:
                        case 9:
                            z2 = true;
                            i5 = length;
                            break;
                    }
                    i5++;
                }
            }
        }
        int iJ = iA + (this.h * aaVar.j());
        if (!z2) {
            aaVar.a(i, i2, iJ);
            return;
        }
        boolean z3 = f47b && aaVar.m19b();
        if (!z) {
            int iC = aaVar.c();
            int iD2 = aaVar.d();
            boolean zM33a = false;
            if (z3) {
                cVar = uVarM16a.m109a();
                if (!uVarM16a.m110a()) {
                    zM33a = dVarM107a.m33a(cVar);
                }
            } else {
                uVarM16a.m111a();
                if (f48a == null) {
                    f48a = new Vector();
                    f49b = new Vector();
                }
                boolean z4 = false;
                cVar = null;
                int size = f49b.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        c cVar2 = (c) f49b.elementAt(size);
                        cVar = cVar2;
                        cVar2.a(0, 0);
                        if (iC <= cVar.b() && iD2 <= cVar.m25a()) {
                            f49b.removeElementAt(size);
                            z4 = true;
                        }
                    }
                }
                if (!z4) {
                    cVar = new c((iC * 12) / 10, (iD2 * 12) / 10);
                }
                if (iC != cVar.b() || iD2 != cVar.m25a()) {
                    cVar.a(iC, iD2);
                }
                f48a.addElement(cVar);
            }
            if (!zM33a) {
                dVarM107a.m32c();
                int iJ2 = dVarM107a.j();
                dVarM107a.m27a();
                dVarM107a.b(iJ2);
                d.a(cVar, iC, iD2);
                dVarM107a.a(0, 0);
                dVarM107a.a(cVar);
                aaVar.a(iA2, iB, iJ);
                dVarM107a.m31b();
            }
        }
        int iH = dVarM107a.h();
        int i6 = dVarM107a.i();
        dVarM107a.a(i, i2);
        dVarM107a.a(cVar, -iA2, -iB, i3, 20);
        dVarM107a.a(iH, i6);
        if (z3 || z) {
            return;
        }
        f48a.removeElement(cVar);
        f49b.addElement(cVar);
    }

    public final void a(Graphics graphics, int i, int i2) {
        d dVarM107a = t.m107a();
        Graphics graphicsM28a = dVarM107a.m28a();
        dVarM107a.a(graphics);
        a(i, i2);
        dVarM107a.a(graphicsM28a);
    }

    public final void a(int i, int i2, boolean z) {
        if (this.a != null) {
            this.f44a = this.a[i];
        }
        this.c = i2;
        this.f46a = z;
        c(0);
    }

    public final int b() {
        if (this.a == null) {
            return 0;
        }
        int i = 0;
        while (this.f44a != this.a[i]) {
            i++;
        }
        return i;
    }

    public final int c() {
        if (this.a == null) {
            return this.f44a != null ? 1 : 0;
        }
        return this.a.length;
    }

    public final void c(int i) {
        this.f45a = i;
        this.h = 0;
        if (this.c != -2) {
            this.d = this.c;
        } else if (this.f44a.m15a()) {
            this.d = -1;
        } else {
            this.d = 1;
        }
        this.b = 0;
    }

    public final int d() {
        return this.f45a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m23a() {
        return this.d == 0;
    }

    public final int e() {
        return this.f44a.e();
    }

    public final int f() {
        return this.f44a.f();
    }

    public final int g() {
        return this.f44a.g();
    }

    public final int h() {
        return this.f44a.h();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m24a() {
        if (this.a != null) {
            int length = this.a.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                } else {
                    this.a[length].m18a();
                }
            }
            a.d();
            this.a = null;
        } else if (this.f44a != null) {
            this.f44a.m18a();
            a.d();
        }
        this.f44a = null;
    }
}
