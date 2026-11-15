package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:aa.class */
public final class aa {
    public int x;
    public int y;

    aa() {
        this.x = 0;
        this.y = 0;
    }

    aa(aa aaVar) {
        this.x = aaVar.x;
        this.y = aaVar.y;
    }

    aa(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public final void a(aa aaVar) {
        this.x = aaVar.x;
        this.y = aaVar.y;
    }

    public final void set(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public final void b(aa aaVar) {
        this.x += aaVar.x;
        this.y += aaVar.y;
    }

    public final void f(int i, int i2) {
        this.x += i;
        this.y += i2;
    }

    public final void c(aa aaVar) {
        this.x -= aaVar.x;
        this.y -= aaVar.y;
    }

    public final void I() {
        int length = length();
        int i = length;
        if (length == 0) {
            i = 1;
        }
        this.x = al.d(this.x, i);
        this.y = al.d(this.y, i);
    }

    public final void x(int i) {
        this.x = al.e(this.x, i);
        this.y = al.e(this.y, i);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m0a(aa aaVar) {
        return al.e(this.x, aaVar.x) + al.e(this.y, aaVar.y);
    }

    public final int length() {
        return ((int) Math.sqrt((al.e(this.x, this.x) + al.e(this.y, this.y)) >> 12)) << 12;
    }
}
