package defpackage;

/* JADX INFO: loaded from: sequel-3d-java.jar:aa.class */
public final class aa {
    private int a;
    private int b;
    private int c;
    private int d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private u[] f33a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[] f34a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[] f35b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int[] f36c;
    private int e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f37a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f38b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private boolean f39c = true;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static final int[] f40d = new int[1];

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static final int[] f41e = {Integer.MAX_VALUE};

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static u[] f42b;

    public aa(int i, boolean z) {
        this.e = Integer.MAX_VALUE;
        if (i == -1) {
            if (f42b == null) {
                f42b = new u[]{new u(true, this)};
            }
            this.f33a = f42b;
            this.f34a = f41e;
            this.f36c = f40d;
            this.f35b = f40d;
            return;
        }
        if (!z) {
            a.b();
        }
        w wVarM95a = t.m95a(i);
        int iB = wVarM95a.b();
        boolean z2 = (iB & 1) == 0;
        boolean z3 = (iB & 2) == 0;
        int iB2 = wVarM95a.b();
        this.f34a = new int[iB2];
        this.f35b = new int[iB2];
        if (iB2 > 1) {
            this.f36c = new int[iB2];
        }
        this.f33a = new u[iB2];
        this.f37a = wVarM95a.m114a();
        this.f38b = wVarM95a.m114a();
        if (z2) {
            this.a = wVarM95a.m115a();
            this.b = wVarM95a.m115a();
            this.c = wVarM95a.b();
            this.d = wVarM95a.b();
        } else {
            this.a = wVarM95a.m116a();
            this.b = wVarM95a.m116a();
            this.c = wVarM95a.m116a();
            this.d = wVarM95a.m116a();
        }
        wVarM95a.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            int iB3 = wVarM95a.b();
            if (iB2 > 1) {
                this.f36c[i2] = iB3;
            }
            if (!m17a(i2)) {
                this.f33a[i2] = new u(false, this);
            }
        }
        boolean z4 = false;
        int i3 = 0;
        for (int i4 = 0; i4 < iB2; i4++) {
            int iB4 = z3 ? wVarM95a.b() : wVarM95a.m116a() & 65535;
            if (iB4 == 0) {
                iB4 = Integer.MAX_VALUE;
                z4 = true;
            }
            this.f34a[i4] = iB4;
            this.f35b[i4] = i3;
            i3 += iB4;
        }
        if (!z4) {
            this.e = this.f35b[iB2 - 1] + this.f34a[iB2 - 1];
        }
        wVarM95a.m114a();
        for (int i5 = 0; i5 < iB2; i5++) {
            if (!m17a(i5)) {
                this.f33a[i5].a(wVarM95a, z2, z);
            }
        }
        if (iB2 > 1) {
            for (int i6 = 0; i6 < iB2; i6++) {
                int i7 = this.f36c[i6];
                if (m17a(i6)) {
                    this.f33a[i6] = this.f33a[i7];
                }
            }
        }
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.a;
    }

    public final int f() {
        return this.b;
    }

    public final int g() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    public final int i() {
        return this.f33a.length;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m15a() {
        return this.f37a;
    }

    public final int j() {
        return this.e;
    }

    public final int a(int i) {
        return this.f35b[i];
    }

    public final int b(int i) {
        return this.f34a[i];
    }

    public final void a(int i, int i2, int i3) {
        int i4;
        int i5 = i3;
        int i6 = this.e;
        if (i5 >= i6) {
            i5 %= i6;
        }
        int i7 = i5;
        int length = this.f34a.length;
        while (true) {
            length--;
            if (length < 0) {
                i4 = -1;
                break;
            } else if (i7 >= this.f35b[length]) {
                i4 = length;
                break;
            }
        }
        int i8 = i4;
        if (!this.f38b) {
            i3 = i5 - this.f35b[i8];
        }
        this.f33a[i8].a(i, i2, i3);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final u m16a(int i) {
        return this.f33a[i];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m17a(int i) {
        return this.f33a.length > 1 && this.f36c[i] != 255;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m18a() {
        int length = this.f33a.length;
        while (true) {
            length--;
            if (length < 0) {
                a.a(this, -1);
                return;
            }
            this.f33a[length].m111a();
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final boolean m19b() {
        return this.f39c;
    }
}
