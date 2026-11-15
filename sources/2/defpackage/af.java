package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:af.class */
public final class af {
    int co;
    int cp;
    p a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    k f16a;
    int[][] h;
    ay[] n;
    int dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    int f17do;
    int dp;
    int dq;
    int dr;
    int ds;
    int dt;
    boolean ag;
    z[] b;
    int dm = -1;

    /* JADX INFO: renamed from: ag, reason: collision with other field name */
    int[] f18ag = new int[am.al.length];
    int[] ah = new int[am.aj.length];
    aa s = new aa(0, 125 << 12);

    public af(p pVar, k kVar) {
        this.a = pVar;
        this.f16a = kVar;
    }

    public final void a(z zVar) {
        for (int i = 0; i < this.dn; i++) {
            if (this.h[i][3] > 0 && zVar.a(this.b[i])) {
                a(i, zVar);
                zVar.H();
            }
        }
    }

    public final void a(int i, z zVar) {
        if (this.h[i][0] != 0) {
            if (this.h[i][3] > 0) {
                int[] iArr = this.h[i];
                iArr[3] = iArr[3] - 1;
                if (this.h[i][3] > 0) {
                    this.n[i].b(((this.h[i][0] << 2) + this.h[i][3]) - 1, -2, true);
                }
                if (zVar != null) {
                    this.f16a.a(0, zVar.a.x, zVar.a.y, zVar.i.x, zVar.i.y);
                    return;
                } else {
                    this.f16a.a(0, this.b[i].a.x + (this.b[i].j.x >> 1), this.b[i].a.y + (this.b[i].j.y >> 1), this.b[i].i.x, this.b[i].i.y);
                    return;
                }
            }
            return;
        }
        boolean z = true;
        for (int i2 = 1; i2 < this.dn; i2++) {
            if (this.h[i2][3] > 0) {
                z = false;
            }
        }
        if (!z || this.h[i][3] <= 0) {
            return;
        }
        int[] iArr2 = this.h[i];
        iArr2[3] = iArr2[3] - 1;
        if (this.h[i][3] > 0) {
            this.n[i].b(((this.h[i][0] << 2) + this.h[i][3]) - 1, -2, true);
        }
        if (zVar != null) {
            this.f16a.a(0, zVar.a.x, zVar.a.y, zVar.i.x, zVar.i.y);
        } else {
            this.f16a.a(0, this.b[i].a.x + (this.b[i].j.x >> 1), this.b[i].a.y + (this.b[i].j.y >> 1), this.b[i].i.x, this.b[i].i.y);
        }
    }
}
