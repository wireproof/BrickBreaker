package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:z.class */
public final class z {
    public aa a;
    public aa h;
    public aa i;
    public boolean af;
    public int dk;
    public int n;
    public aa j;
    private aa[] f;
    public aa k;
    private aa l;
    private aa m;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private aa f178n;
    private aa o;
    private aa p;
    private aa q;
    private aa r;

    private void F() {
        this.k = new aa();
        this.l = new aa();
        this.m = new aa();
        this.f178n = new aa();
        this.o = new aa();
        this.p = new aa();
        this.q = new aa();
        this.r = new aa();
    }

    final void G() {
        this.k.set(0, 0);
        this.l.set(0, 0);
        this.m.set(0, 0);
        this.f178n.set(0, 0);
        this.o.set(0, 0);
        this.p.set(0, 0);
        this.q.set(0, 0);
        this.r.set(0, 0);
    }

    z() {
        this.a = new aa(0, 0);
        this.h = new aa(0, 0);
        this.i = new aa(0, 0);
        this.dk = 0;
        this.n = 4096;
        this.af = false;
        F();
    }

    z(aa aaVar, aa aaVar2, aa aaVar3) {
        this.dk = 2;
        this.a = aaVar;
        this.h = new aa(aaVar);
        this.i = aaVar2;
        aaVar2.length();
        this.j = aaVar3;
        this.af = false;
        F();
    }

    public final void c(int i, int i2, int i3, int i4, int i5) {
        this.dk = 0;
        this.a.set(i, i2);
        this.h.set(i, i2);
        this.i.set(i3, i4);
        this.i.length();
        this.n = i5;
        this.af = false;
        G();
    }

    public final void n(int i) {
        if (this.i.x == 0 && this.i.y == 0) {
            return;
        }
        this.h.set(this.a.x, this.a.y);
        this.a.f((this.i.x * i) / 1000, (this.i.y * i) / 1000);
        if (this.dk == 1) {
            Object[] objArr = null;
            this.f = new aa[objArr.length << 1];
            aa aaVar = new aa();
            aa aaVar2 = new aa();
            for (int i2 = 0; i2 < objArr.length; i2++) {
                aa aaVar3 = null;
                aa aaVar4 = null;
                aaVar.set(aaVar3.x, aaVar4.y);
                aa aaVar5 = null;
                aa aaVar6 = null;
                aaVar2.set(aaVar5.x, aaVar6.y);
                aaVar2.c(aaVar);
                int i3 = -aaVar2.x;
                aaVar2.x = aaVar2.y;
                aaVar2.y = i3;
                aaVar2.I();
                aaVar2.x(this.n);
                this.f[i2 << 1] = new aa(null);
                this.f[i2 << 1].b(aaVar2);
                this.f[(i2 << 1) + 1] = new aa(null);
                this.f[(i2 << 1) + 1].b(aaVar2);
            }
        }
    }

    public final int a(int i, int i2, int i3) {
        if (this.dk == 2) {
            if (this.a.x < 0 && this.i.x < 0) {
                return 1;
            }
            if (this.a.x + this.j.x > i2 && this.i.x > 0) {
                return 2;
            }
            if (this.a.y >= 0 || this.i.y >= 0) {
                return (this.a.y + this.j.y <= i3 || this.i.y <= 0) ? 0 : 4;
            }
            return 3;
        }
        int i4 = 0;
        if (this.a.x - this.n < 0 && this.i.x < 0) {
            this.k.set(-4096, 0);
            H();
            i4 = 1;
        } else if (this.a.x + this.n > i2 && this.i.x > 0) {
            this.k.set(4096, 0);
            H();
            i4 = 2;
        } else if (this.a.y - this.n < 0 && this.i.y < 0) {
            this.k.set(0, -4096);
            H();
            i4 = 3;
        } else if (this.a.y + this.n > i3 && this.i.y > 0) {
            this.k.set(0, 4096);
            H();
            i4 = 4;
        }
        if (i4 != 0 && this.dk == 0) {
            if (this.i.y < 0 && this.i.y > -19) {
                this.i.y = -19;
            } else if (this.i.y > 0 && this.i.y < 19) {
                this.i.y = 19;
            }
        }
        return i4;
    }

    public final boolean a(z zVar) {
        if (zVar.dk == 0) {
            if (this.a.x + this.n <= zVar.a.x - zVar.n || this.a.x - this.n >= zVar.a.x + zVar.n || this.a.y + this.n <= zVar.a.y - zVar.n || this.a.y - this.n >= zVar.a.y + zVar.n) {
                return false;
            }
            this.l.a(this.a);
            this.l.c(zVar.a);
            if (this.l.m0a(this.l) >= al.e(this.n + zVar.n, this.n + zVar.n) || this.l.m0a(this.i) > 0) {
                return false;
            }
            this.k.a(this.l);
            return true;
        }
        if (zVar.dk == 2) {
            if (this.a.x + this.n <= zVar.a.x || this.a.x - this.n >= zVar.a.x + zVar.j.x || this.a.y + this.n <= zVar.a.y || this.a.y - this.n >= zVar.a.y + zVar.j.y) {
                return false;
            }
            for (int i = 0; i < 4; i++) {
                this.l.a(this.a);
                if (i == 0) {
                    this.r.set(zVar.a.x, zVar.a.y + zVar.j.y);
                } else if (i == 1) {
                    this.r.set(zVar.a.x + zVar.j.x, zVar.a.y + zVar.j.y);
                } else if (i == 2) {
                    this.r.set(zVar.a.x, zVar.a.y);
                } else {
                    this.r.set(zVar.a.x + zVar.j.x, zVar.a.y);
                }
                this.l.c(this.r);
                if (this.a.x - this.n < this.r.x && this.a.x + this.n > this.r.x && this.a.y - this.n < this.r.y && this.a.y + this.n > this.r.y) {
                    aa aaVar = this.q;
                    if (this.a.x + this.n > zVar.a.x && this.a.x - this.n < zVar.a.x + zVar.j.x && this.a.y + this.n > zVar.a.y && this.a.y - this.n < zVar.a.y + zVar.j.y) {
                        aaVar.set(Math.min(this.a.x + this.n, zVar.a.x + zVar.j.x) - Math.max(this.a.x - this.n, zVar.a.x), Math.min(this.a.y + this.n, zVar.a.y + zVar.j.y) - Math.max(this.a.y - this.n, zVar.a.y));
                    } else {
                        aaVar.set(0, 0);
                    }
                    int iAbs = Math.abs(this.a.x - this.h.x);
                    int iD = iAbs != 0 ? al.d(al.e(this.q.x, 13), iAbs) : Integer.MAX_VALUE;
                    int iAbs2 = Math.abs(this.a.y - this.h.y);
                    int iD2 = iAbs2 != 0 ? al.d(al.e(this.q.y, 13), iAbs2) : Integer.MAX_VALUE;
                    if (this.l.m0a(this.i) <= 0) {
                        if (iD2 <= iD) {
                            if (this.i.y > 0) {
                                this.k.set(0, -4096);
                                return true;
                            }
                            if (this.i.y >= 0) {
                                return true;
                            }
                            this.k.set(0, 4096);
                            return true;
                        }
                        if (this.i.x > 0) {
                            this.k.set(-4096, 0);
                            return true;
                        }
                        if (this.i.x >= 0) {
                            return true;
                        }
                        this.k.set(4096, 0);
                        return true;
                    }
                }
            }
            if (this.i.x > 0 && this.a.y > zVar.a.y && this.a.y < zVar.a.y + zVar.j.y && this.a.x - this.n < zVar.a.x + (zVar.j.x >> 1) && this.a.x + this.n > zVar.a.x) {
                this.k.set(4096, 0);
                return true;
            }
            if (this.i.y > 0 && this.a.x > zVar.a.x && this.a.x < zVar.a.x + zVar.j.x && this.a.y - this.n < zVar.a.y + (zVar.j.y >> 1) && this.a.y + this.n > zVar.a.y) {
                this.k.set(0, 4096);
                return true;
            }
            if (this.i.x < 0 && this.a.y > zVar.a.y && this.a.y < zVar.a.y + zVar.j.y && this.a.x - this.n < zVar.a.x + zVar.j.x && this.a.x + this.n > zVar.a.x + (zVar.j.x >> 1)) {
                this.k.set(-4096, 0);
                return true;
            }
            if (this.i.y >= 0 || this.a.x <= zVar.a.x || this.a.x >= zVar.a.x + zVar.j.x || this.a.y - this.n >= zVar.a.y + zVar.j.y || this.a.y + this.n <= zVar.a.y + (zVar.j.y >> 1)) {
                return false;
            }
            this.k.set(0, -4096);
            return true;
        }
        if (zVar.dk != 1) {
            if (zVar.dk != 3 || this.a.x + this.n <= zVar.a.x - (zVar.j.x >> 1) || this.a.x - this.n >= zVar.a.x + (zVar.j.x >> 1) || this.a.y + this.n <= zVar.a.y - (zVar.j.y >> 1) || this.a.y - this.n >= zVar.a.y + (zVar.j.y >> 1)) {
                return false;
            }
            if ((this.i.x == 0 && this.i.y > 0) || (this.i.y > 0 && this.a.x > zVar.a.x - (zVar.j.x >> 1) && this.a.x < zVar.a.x + (zVar.j.x >> 1) && this.a.y < zVar.a.y + (zVar.j.y >> 1) && this.a.y + this.n > zVar.a.y - (zVar.j.y >> 1))) {
                int iE = al.e(al.d(zVar.a.x - this.a.x, zVar.j.x >> 1), zVar.n) >> 12;
                this.p.set(-ar.n(iE << 8), -ar.m(iE << 8));
                this.p.x(this.i.length());
                this.i.a(this.p);
                return true;
            }
            if ((this.i.x == 0 && this.i.y > 0) || (this.i.y > 0 && this.a.x + al.e(al.d(80 << 12, 100 << 12), this.n) > zVar.a.x - (zVar.j.x >> 1) && this.a.x - al.e(al.d(80 << 12, 100 << 12), this.n) < zVar.a.x + (zVar.j.x >> 1) && this.a.y < zVar.a.y + (zVar.j.y >> 1) && this.a.y + this.n > zVar.a.y - (zVar.j.y >> 1))) {
                int iE2 = al.e(al.d(zVar.a.x - this.a.x, zVar.j.x >> 1), zVar.n) >> 12;
                int iAbs3 = iE2;
                if (iE2 > 52 || iAbs3 < -52) {
                    iAbs3 = (iAbs3 > 64 || iAbs3 < -64) ? (iAbs3 / Math.abs(iAbs3)) * 96 : (iAbs3 / Math.abs(iAbs3)) * 52;
                }
                this.p.set(-ar.n(iAbs3 << 8), -ar.m(iAbs3 << 8));
                this.p.x(this.i.length());
                this.i.a(this.p);
                return true;
            }
            if (this.i.x > 0 && this.a.y > zVar.a.y && this.a.y < zVar.a.y + zVar.j.y && this.a.x - this.n < zVar.a.x + zVar.j.x && this.a.x + this.n > zVar.a.x) {
                return true;
            }
            if (this.i.x >= 0 || this.a.y <= zVar.a.y || this.a.y >= zVar.a.y + zVar.j.y || this.a.x - this.n >= zVar.a.x + zVar.j.x || this.a.x + this.n <= zVar.a.x) {
                return this.i.y < 0 && this.a.x > zVar.a.x && this.a.x < zVar.a.x + zVar.j.x && this.a.y - this.n < zVar.a.y + zVar.j.y && this.a.y + this.n > zVar.a.y;
            }
            return true;
        }
        aa aaVar2 = null;
        int i2 = zVar.a.x + aaVar2.x;
        aa aaVar3 = null;
        int i3 = zVar.a.x + aaVar3.x;
        aa aaVar4 = null;
        int i4 = zVar.a.y + aaVar4.y;
        aa aaVar5 = null;
        int i5 = zVar.a.y + aaVar5.y;
        for (int i6 = 1; i6 < objArr.length; i6++) {
            aa aaVar6 = null;
            int i7 = zVar.a.x + aaVar6.x;
            aa aaVar7 = null;
            int i8 = zVar.a.y + aaVar7.y;
            if (i7 < i2) {
                i2 = i7;
            }
            if (i7 > i3) {
                i3 = i7;
            }
            if (i8 < i4) {
                i4 = i8;
            }
            if (i8 > i5) {
                i5 = i8;
            }
        }
        if (this.a.x + this.n <= i2 || this.a.x - this.n >= i3 || this.a.y + this.n <= i4 || this.a.y - this.n >= i5) {
            return false;
        }
        for (int i9 = 0; i9 < objArr.length; i9++) {
            this.l.a(this.a);
            aa aaVar8 = this.l;
            aa aaVar9 = null;
            int i10 = zVar.a.x + aaVar9.x;
            aa aaVar10 = null;
            int i11 = zVar.a.y + aaVar10.y;
            aaVar8.x -= i10;
            aaVar8.y -= i11;
            if (this.l.m0a(this.l) < al.e(this.n, this.n) && this.l.m0a(this.i) <= 0) {
                this.k.a(this.l);
                return true;
            }
        }
        int i12 = 0;
        while (i12 < zVar.f.length) {
            this.m.a(zVar.f[i12]);
            this.m.b(zVar.a);
            this.f178n.a(zVar.f[i12 == zVar.f.length - 1 ? 0 : i12 + 1]);
            this.f178n.b(zVar.a);
            this.f178n.c(this.m);
            this.o.a(this.a);
            this.o.c(this.m);
            aa aaVar11 = this.f178n;
            aa aaVar12 = this.o;
            if (al.e(aaVar11.x, aaVar12.y) - al.e(aaVar11.y, aaVar12.x) < 0) {
                return false;
            }
            if (i12 == zVar.f.length - 1) {
                this.p.a(zVar.a);
                this.p.c(this.a);
                if (this.p.m0a(this.i) >= 0) {
                    this.k.a(this.p);
                    return true;
                }
            }
            i12++;
        }
        return false;
    }

    public final void H() {
        if (this.k.x == 0 && this.k.y == 0) {
            return;
        }
        int iD = 2 * al.d(this.i.m0a(this.k), this.k.m0a(this.k));
        this.i.set(this.i.x - al.e(iD, this.k.x), this.i.y - al.e(iD, this.k.y));
        if (this.af) {
            if (this.i.y <= 0) {
                if (this.i.x > 0) {
                    if ((-this.i.y) < al.e(this.i.x, al.f(1758, 10000))) {
                        int length = this.i.length();
                        this.i.x = al.e(length, al.f(9875, 10000));
                        this.i.y = -al.e(length, al.f(1736, 10000));
                        return;
                    }
                    return;
                }
                if ((-this.i.y) < al.e(-this.i.x, al.f(1758, 10000))) {
                    int length2 = this.i.length();
                    this.i.x = -al.e(length2, al.f(9875, 10000));
                    this.i.y = -al.e(length2, al.f(1736, 10000));
                    return;
                }
                return;
            }
            if (this.i.x > 0) {
                if (this.i.y < al.e(this.i.x, al.f(1758, 10000))) {
                    int length3 = this.i.length();
                    this.i.x = al.e(length3, al.f(9875, 10000));
                    this.i.y = al.e(length3, al.f(1736, 10000));
                }
            } else if (this.i.y < al.e(-this.i.x, al.f(1758, 10000))) {
                int length4 = this.i.length();
                this.i.x = -al.e(length4, al.f(9875, 10000));
                this.i.y = al.e(length4, al.f(1736, 10000));
            }
            if (this.i.x == 0) {
                this.i.x = al.f(1, 10);
            }
        }
    }
}
