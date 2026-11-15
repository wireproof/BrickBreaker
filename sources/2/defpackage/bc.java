package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:bc.class */
public final class bc {
    z[][] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    ay[][][] f52a;
    ay[][] b;
    ay[] o;
    public ay[] p;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    c[] f53a;
    aa[] g;
    boolean[] l;
    int[] aF;
    int[] aG;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    p f54a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    a f55a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    k f56a;
    int f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    public int f57g;
    public int ew;
    z[] c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    boolean[] f58a;
    int ex;
    int[][] G;
    int[][] H;
    int ey;
    int ez;
    int eA;
    public boolean az;
    int eB;
    int eC;
    boolean aA;
    private aa v = new aa();

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private aa f59l = new aa();
    private aa w = new aa();
    z d = new z();
    private boolean ay = false;
    private aa t = new aa();
    private aa k = new aa();
    private aa u = new aa();

    bc(p pVar, a aVar, k kVar) {
        this.f54a = pVar;
        this.f55a = aVar;
        this.f56a = kVar;
    }

    final void d(aa aaVar) {
        int iJ = p.j(1000);
        int[] iArr = this.f55a.f9a;
        int i = -1;
        if (iArr[8] <= 0 || this.ay || this.ew >= 10) {
            int i2 = 0;
            while (i2 < 21) {
                if (iJ >= iArr[i2] || this.f56a.c(i2) || iArr[i2] <= 0) {
                    iJ -= iArr[i2];
                    i2++;
                } else {
                    i = i2;
                    i2 = 21;
                }
            }
        } else {
            i = 8;
            this.ay = true;
        }
        if (i >= 0) {
            if (i == 8) {
                this.ay = true;
            }
            this.w.set(0, 125 << 12);
            this.f56a.b(i, aaVar.x, aaVar.y, this.w.x, this.w.y);
        }
    }

    public final boolean a(z zVar, int i) {
        boolean z = false;
        int i2 = this.f55a.f6a;
        z zVar2 = null;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < i2; i4++) {
            if (this.f58a[i4]) {
                int[] iArr = this.f55a.b[i4];
                int[] iArr2 = this.f55a.c[i4];
                int iA = this.f55a.a(i4);
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    if (iArr[i5] != -1) {
                        this.v.a(zVar.i);
                        if (zVar.a(this.a[i4][i5])) {
                            if (i == 0) {
                                this.u.set((this.a[i4][i5].a.x + al.d(this.a[i4][i5].j.x, 2)) - zVar.a.x, (this.a[i4][i5].a.y + al.d(this.a[i4][i5].j.y, 2)) - zVar.a.y);
                                int iM0a = this.u.m0a(this.u);
                                if (iM0a < i3) {
                                    this.t.set(i4, i5);
                                    i3 = iM0a;
                                    this.k.a(zVar.k);
                                }
                            } else if (i == 2 && (iArr[i5] == 4 || (iArr[i5] == 6 && this.f57g > this.ew))) {
                                this.u.set((this.a[i4][i5].a.x + al.d(this.a[i4][i5].j.x, 2)) - zVar.a.x, (this.a[i4][i5].a.y + al.d(this.a[i4][i5].j.y, 2)) - zVar.a.y);
                                int iM0a2 = this.u.m0a(this.u);
                                if (iM0a2 < i3) {
                                    this.t.set(i4, i5);
                                    i3 = iM0a2;
                                    this.k.a(zVar.k);
                                }
                            }
                            if (iArr[i5] != 4 && (iArr[i5] != 6 || this.f57g <= this.ew)) {
                                z = true;
                                this.eA = 0;
                                this.G[i4][i5] = 80;
                            }
                            if (iArr[i5] != 4 && iArr[i5] != 5) {
                                this.f56a.a(0, this.a[i4][i5].a.x, this.a[i4][i5].a.y, this.v.x, this.v.y);
                            }
                            if (iArr[i5] == 3) {
                                if (this.f56a.bi != 0 && this.f56a.f[i4][i5] == 4) {
                                    this.f57g++;
                                }
                                this.f56a.bB = 300;
                                iArr[i5] = -1;
                                this.f56a.m(100);
                                d(this.a[i4][i5].a);
                            }
                            if (iArr[i5] == 2) {
                                if (i == 0) {
                                    iArr[i5] = 3;
                                    this.f56a.m(100);
                                } else if (i == 1 || i == 2) {
                                    iArr[i5] = -1;
                                    this.f56a.m(200);
                                }
                                d(this.a[i4][i5].a);
                            }
                            if (iArr[i5] == 1) {
                                if (i == 0) {
                                    iArr[i5] = 2;
                                    this.f56a.m(100);
                                } else if (i == 1 || i == 2) {
                                    iArr[i5] = -1;
                                    this.f56a.m(300);
                                }
                                d(this.a[i4][i5].a);
                            }
                            if (iArr[i5] == 0) {
                                if (i == 0) {
                                    iArr[i5] = 1;
                                    this.f56a.m(100);
                                } else if (i == 1 || i == 2) {
                                    iArr[i5] = -1;
                                    this.f56a.m(400);
                                }
                                d(this.a[i4][i5].a);
                            }
                            if (iArr[i5] == -1) {
                                this.f57g--;
                                this.H[i4][i5] = this.f52a[iArr2[i5]][iA][3].A();
                            }
                            if (iArr[i5] == 6 && this.f57g <= this.ew) {
                                this.f56a.m(100);
                                iArr[i5] = -1;
                                this.f--;
                                if (this.f == 0) {
                                    Z();
                                    Y();
                                }
                            }
                            if (iArr[i5] == 4 && i != 1) {
                                this.az = true;
                            }
                            if (iArr[i5] == 5) {
                                this.f56a.a(1, this.a[i4][i5].a.x, this.a[i4][i5].a.y, this.v.x, this.v.y);
                                iArr[i5] = -1;
                                this.f57g--;
                                if (zVar2 == null) {
                                    zVar2 = new z();
                                }
                                zVar2.c(this.a[i4][i5].a.x, this.a[i4][i5].a.y, 0, 0, al.e(this.a[i4][i5].j.x, al.f(3, 2)));
                                a(zVar2, 1);
                                this.f56a.m(20);
                            }
                        }
                    }
                }
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            zVar.k.a(this.k);
            zVar.H();
            zVar.i.x += p.t() << 12;
            zVar.i.y += p.t() << 12;
            if (zVar.i.x == 0) {
                zVar.i.x = 20480;
            }
            if (zVar.i.y == 0) {
                zVar.i.y = 20480;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m30a(z zVar, int i) {
        for (int i2 = 0; i2 < this.f53a.length; i2++) {
            aa aaVarA = this.f53a[i2].a(zVar.a, zVar.i, zVar.i.length(), i);
            zVar.i.set(aaVarA.x, aaVarA.y);
        }
    }

    public final int a(z zVar) {
        for (int i = 0; i < this.g.length; i++) {
            if (!this.l[i] && this.aF[i] <= 0 && zVar.a.x + zVar.n > this.g[i].x - zVar.n && zVar.a.x - zVar.n < this.g[i].x + zVar.n && zVar.a.y + zVar.n > this.g[i].y - zVar.n && zVar.a.y - zVar.n < this.g[i].y + zVar.n) {
                this.f59l.a(zVar.a);
                this.f59l.c(this.g[i]);
                if (this.f59l.m0a(this.f59l) < al.e(zVar.n + zVar.n, zVar.n + zVar.n)) {
                    this.l[i] = true;
                    this.aF[i] = 0;
                    this.aG[i] = zVar.i.length();
                    zVar.a.set(this.g[i].x, this.g[i].y);
                    zVar.i.set(0, 0);
                    return i;
                }
            }
        }
        return -1;
    }

    public final void b(z zVar, int i) {
        int iA = ((256 * (this.aF[i] % this.p[5].A())) / this.p[5].A()) << 8;
        zVar.i.set(ar.n(iA), -ar.m(iA));
        if (this.aG[i] < 190) {
            this.aG[i] = 190;
        }
        zVar.i.x(this.aG[i]);
        this.l[i] = false;
        this.aF[i] = 175;
    }

    public final void b(z zVar) {
        t[] tVarArr = this.f55a.f14a;
        boolean[] zArr = this.f55a.f15b;
        for (int i = 0; i < this.c.length; i++) {
            if (zArr[i] && zVar.a(this.c[i])) {
                zArr[i] = false;
                this.ex = i;
                this.p[3].z(0);
                this.ez = tVarArr[i].b;
                if (this.f58a[this.ez]) {
                    this.f58a[this.ez] = false;
                    this.ey = this.f52a[0][0][0].A();
                } else {
                    this.f58a[this.ez] = true;
                    this.ey = 0;
                }
            }
        }
    }

    final void Y() {
        int i = this.f55a.f6a;
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = this.f55a.b[i2];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (iArr[i3] != -1) {
                    iArr[i3] = -1;
                    this.f56a.a(0, this.a[i2][i3].a.x, this.a[i2][i3].a.y, 0, 0);
                }
            }
        }
    }

    final void Z() {
        boolean[] zArr = this.f55a.f15b;
        for (int i = 0; i < zArr.length; i++) {
            zArr[i] = false;
        }
    }
}
