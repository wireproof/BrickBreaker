package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:c.class */
public final class c {
    public aa a;
    private int n;
    private int o;
    public int type;
    private int p;
    private int q;
    private aa b;
    private aa c;

    c() {
        this.a = new aa(0, 0);
        this.n = 4096;
        this.o = 4096;
        this.type = 0;
        this.p = 2000;
        this.q = 0;
        this.b = new aa();
        this.c = new aa();
    }

    c(aa aaVar, int i, int i2, int i3) {
        this.a = aaVar;
        this.n = i;
        this.o = i2;
        this.type = i3;
        this.p = 2000;
        this.q = 0;
        this.b = new aa();
        this.c = new aa();
    }

    public final void a(aa aaVar, int i, int i2, int i3) {
        this.a = aaVar;
        this.n = i;
        this.o = i2;
        this.type = i3;
        this.p = 2000;
        this.q = 0;
        this.b.set(0, 0);
        this.c.set(0, 0);
    }

    public final aa a(aa aaVar, aa aaVar2, int i, int i2) {
        this.b.a(aaVar2);
        if (this.q <= 0) {
            this.c.a(this.type == 0 ? this.a : aaVar);
            this.c.c(this.type == 0 ? aaVar : this.a);
            int length = this.c.length();
            if (length == 0) {
                return this.b;
            }
            if (length < this.n) {
                int iE = al.e(al.d(i2 << 12, 1000 << 12), al.e(al.d(this.n - length, this.n), this.o));
                this.c.I();
                this.c.x(iE);
                this.b.b(this.c);
                this.b.I();
                this.b.x(i);
                this.p -= i2;
                if (this.p <= 0) {
                    this.q = 1000;
                }
            } else if (this.p < 2000) {
                this.p += i2;
            }
        } else {
            this.q -= i2;
            if (this.q <= 0) {
                this.p = 2000;
            }
        }
        return this.b;
    }
}
