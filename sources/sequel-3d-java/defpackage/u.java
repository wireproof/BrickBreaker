package defpackage;

/* JADX INFO: loaded from: sequel-3d-java.jar:u.class */
public final class u {
    private q[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[][] f310a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private c f311a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private aa f312a;
    private static final q[] b = new q[0];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static final int[][] f313b = new int[0][];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f314a = new int[2];

    public u(boolean z, aa aaVar) {
        if (z) {
            this.a = b;
            this.f310a = f313b;
        }
        this.f312a = aaVar;
    }

    public final void a(w wVar, boolean z, boolean z2) {
        int iM116a;
        int iM116a2;
        int[] iArr;
        if (z) {
            wVar.b();
            wVar.b();
        } else {
            wVar.m116a();
            wVar.m116a();
        }
        int iB = wVar.b();
        if (iB == 0) {
            this.a = b;
        } else {
            this.a = new q[iB];
            for (int i = 0; i < iB; i++) {
                int iB2 = wVar.b();
                if (z) {
                    wVar.m115a();
                    wVar.m115a();
                    iM116a = wVar.b();
                    iM116a2 = wVar.b();
                } else {
                    wVar.m116a();
                    wVar.m116a();
                    iM116a = wVar.m116a();
                    iM116a2 = wVar.m116a();
                }
                this.a[i] = new q(iM116a, iM116a2, iB2);
            }
        }
        int iM116a3 = wVar.m116a();
        if (iM116a3 == 0) {
            this.f310a = f313b;
        } else {
            this.f310a = new int[iM116a3][];
        }
        for (int i2 = 0; i2 < iM116a3; i2++) {
            int iB3 = wVar.b();
            if (iB3 == 1) {
                iArr = new int[5];
                if (z) {
                    iArr[1] = wVar.m115a();
                    iArr[2] = wVar.m115a();
                } else {
                    iArr[1] = wVar.m116a();
                    iArr[2] = wVar.m116a();
                }
                int iB4 = wVar.b();
                a.a(wVar.c(), wVar.b(), iB4 & 15, (iB4 >> 4) + 1, z2, f314a);
                iArr[3] = f314a[0];
                iArr[4] = f314a[1];
            } else if (iB3 == 9) {
                iArr = new int[5];
                if (z) {
                    iArr[1] = wVar.m115a();
                    iArr[2] = wVar.m115a();
                } else {
                    iArr[1] = wVar.m116a();
                    iArr[2] = wVar.m116a();
                }
                wVar.b();
                iArr[4] = a.m11a(wVar.c(), z2);
            } else {
                int iC = wVar.c();
                iArr = new int[6];
                if (z) {
                    iArr[2] = wVar.m115a();
                    iArr[3] = wVar.m115a();
                    if (iB3 == 4) {
                        iArr[4] = wVar.m115a();
                        iArr[5] = wVar.m115a();
                    } else {
                        iArr[4] = wVar.b();
                        iArr[5] = wVar.b();
                    }
                } else {
                    for (int i3 = 0; i3 < 4; i3++) {
                        iArr[i3 + 2] = wVar.m116a();
                    }
                }
                iArr[1] = iC;
            }
            iArr[0] = iB3;
            this.f310a[i2] = iArr;
        }
    }

    public final void a(int i, int i2, int i3) {
        d dVarM107a = t.m107a();
        int iH = dVarM107a.h();
        int i4 = dVarM107a.i();
        dVarM107a.a(i, i2);
        int length = this.f310a.length;
        for (int i5 = 0; i5 < length; i5++) {
            int[] iArr = this.f310a[i5];
            int i6 = iArr[0];
            if (i6 == 1) {
                int i7 = iArr[1];
                int i8 = iArr[2];
                c cVarM12a = a.m12a(iArr[3]);
                int i9 = iArr[4];
                int i10 = (i9 & 1) != 0 ? 1 : 0;
                if ((i9 & 2) != 0) {
                    i10 |= 2;
                }
                dVarM107a.a(cVarM12a, i7, i8, i10, 20);
            } else if (i6 == 9) {
                int i11 = iArr[1] + i;
                int i12 = iArr[2] + i2;
                b bVarM13a = a.m13a(iArr[4]);
                aa aaVarM21a = bVarM13a.m21a();
                if ((i11 - aaVarM21a.e()) + aaVarM21a.g() > dVarM107a.m() && (i12 - aaVarM21a.f()) + aaVarM21a.h() > dVarM107a.n() && i11 - aaVarM21a.e() < dVarM107a.m() + dVarM107a.l() && i12 - aaVarM21a.f() < dVarM107a.n() + dVarM107a.k()) {
                    bVarM13a.a(i3);
                    bVarM13a.a(i11, i12);
                }
            } else {
                dVarM107a.a(iArr[1]);
                if (i6 == 4) {
                    dVarM107a.c(iArr[2], iArr[3], iArr[4], iArr[5]);
                } else if (i6 == 3) {
                    dVarM107a.a(iArr[2], iArr[3], iArr[4], iArr[5]);
                } else if (i6 == 2) {
                    dVarM107a.b(iArr[2], iArr[3], iArr[4], iArr[5]);
                }
            }
        }
        dVarM107a.a(iH, i4);
    }

    public final q a(int i) {
        int length = this.a.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
        } while (this.a[length].c != 0);
        return this.a[length];
    }

    public final int[][] a() {
        return this.f310a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final c m109a() {
        if (this.f311a == null) {
            this.f311a = new c(this.f312a.c(), this.f312a.d());
        }
        return this.f311a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m110a() {
        int[][] iArr = this.f310a;
        int length = iArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (iArr[length][0] != 9);
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m111a() {
        if (this.f311a != null) {
            this.f311a = null;
        }
    }
}
