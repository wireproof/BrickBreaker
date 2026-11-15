package defpackage;

import javax.microedition.m3g.TriangleStripArray;
import javax.microedition.m3g.VertexArray;
import javax.microedition.m3g.VertexBuffer;

/* JADX INFO: loaded from: bbr-3d.jar:k.class */
public final class k extends t {
    private static final int[][] n = {new int[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}};
    private static final int[][] o = {new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0}};
    private byte[] d;
    private VertexArray a;
    private int bY;
    private int bZ;
    private int ca;
    private int cb;
    private int cc;
    private int cd;
    private int ce;
    private int cf;
    private int cg;
    private int ch;
    private int ci;
    private int cj;
    private int ck;
    private boolean N;
    private boolean[] c = new boolean[49];
    private int bX = 0;
    private int[] am = new int[40];
    private int cl = 0;

    public final void E() {
        int i = 0;
        this.m = new short[588];
        this.d = new byte[588];
        float f = -500.0f;
        for (int i2 = 0; i2 < 7; i2++) {
            float f2 = -500.0f;
            for (int i3 = 0; i3 < 7; i3++) {
                int i4 = i;
                int i5 = i + 1;
                this.m[i4] = (short) (f2 + 142.85715f);
                int i6 = i5 + 1;
                this.m[i5] = 0;
                int i7 = i6 + 1;
                this.m[i6] = (short) f;
                int i8 = i7 + 1;
                this.m[i7] = (short) f2;
                int i9 = i8 + 1;
                this.m[i8] = 0;
                int i10 = i9 + 1;
                this.m[i9] = (short) f;
                int i11 = i10 + 1;
                this.m[i10] = (short) (f2 + 142.85715f);
                int i12 = i11 + 1;
                this.m[i11] = 0;
                int i13 = i12 + 1;
                this.m[i12] = (short) (f + 142.85715f);
                int i14 = i13 + 1;
                this.m[i13] = (short) f2;
                int i15 = i14 + 1;
                this.m[i14] = 0;
                i = i15 + 1;
                this.m[i15] = (short) (f + 142.85715f);
                f2 += 142.85715f;
            }
            f += 142.85715f;
        }
        int[] iArr = new int[49];
        for (int i16 = 0; i16 < 49; i16++) {
            iArr[i16] = 4;
        }
        this.f163a = new TriangleStripArray(0, iArr);
        this.f166b = new VertexArray(this.m.length / 3, 3, 2);
        this.a = new VertexArray(this.d.length / 3, 3, 1);
        this.a = new VertexBuffer();
        this.f166b.set(0, this.m.length / 3, this.m);
        this.a.setPositions(this.f166b, 1.0f, (float[]) null);
        v(2);
        w(3);
        a(this.c);
        aB();
    }

    private void a(boolean[] zArr) {
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            for (int i3 = 0; i3 < 7; i3++) {
                byte b = zArr[(i2 * 7) + i3] ? (byte) -56 : (byte) 0;
                byte b2 = zArr[(i2 * 7) + i3] ? (byte) 30 : (byte) 0;
                int i4 = i;
                int i5 = i + 1;
                this.d[i4] = b;
                int i6 = i5 + 1;
                this.d[i5] = b2;
                int i7 = i6 + 1;
                this.d[i6] = 0;
                int i8 = i7 + 1;
                this.d[i7] = b;
                int i9 = i8 + 1;
                this.d[i8] = b2;
                int i10 = i9 + 1;
                this.d[i9] = 0;
                int i11 = i10 + 1;
                this.d[i10] = b;
                int i12 = i11 + 1;
                this.d[i11] = b2;
                int i13 = i12 + 1;
                this.d[i12] = 0;
                int i14 = i13 + 1;
                this.d[i13] = b;
                int i15 = i14 + 1;
                this.d[i14] = b2;
                i = i15 + 1;
                this.d[i15] = 0;
            }
        }
        this.a.set(0, this.d.length / 3, this.d);
        this.a.setColors(this.a);
    }

    private void v(int i) {
        for (int i2 = 0; i2 < 21; i2++) {
            this.c[i2] = n[i][i2] == 1;
        }
    }

    private void w(int i) {
        for (int i2 = 21; i2 < 49; i2++) {
            this.c[i2] = o[i][i2 - 21] == 1;
        }
    }

    public final void x(int i) {
        this.cc = i;
        this.cd = -1;
        this.ch = -1;
        this.cj = 0;
        this.ci = 0;
        switch (this.cc) {
            case 0:
                this.ce = q.r() % 2 == 0 ? 3 : 0;
                break;
            case 1:
            case 3:
                this.ce = 0;
                break;
            case 2:
                this.ce = 3;
                break;
        }
        switch (this.cc) {
            case 0:
                this.cf = 3;
                this.cg = 2;
                break;
            case 1:
                this.cf = 5;
                this.cg = 4;
                break;
            case 2:
            case 3:
                this.cf = 1;
                this.cg = 0;
                break;
        }
        a(false);
        b(false);
        a(this.c);
        switch (this.cc) {
            case 0:
                this.ca = 250;
                this.cb = 3;
                break;
            case 1:
            case 3:
                this.ca = 500;
                this.cb = 4;
                break;
            case 2:
                this.ca = 150;
                this.cb = 5;
                break;
        }
    }

    private boolean a(boolean z) {
        int i = this.ce;
        if (z) {
            i = this.bY;
        }
        if (i == this.cd) {
            return false;
        }
        v(i);
        this.cd = i;
        return true;
    }

    private boolean b(boolean z) {
        int i = this.cg;
        if (z) {
            i = this.cf;
        }
        if (i == this.ch) {
            return false;
        }
        w(i);
        this.ch = i;
        return true;
    }

    public final void a(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (length != 0) {
            int i3 = 0;
            while (true) {
                char cCharAt = str.charAt(i);
                i++;
                if (i >= length) {
                    break;
                } else if (!((cCharAt == ' ' || cCharAt == '.' || cCharAt == '!' || cCharAt == '?' || cCharAt == ';' || cCharAt == ':' || cCharAt == '>' || cCharAt == '/') ? false : true)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 > 0) {
                int i4 = i - i3;
                if (i3 > 2) {
                    for (int i5 = 0; i5 < i3; i5 += 5) {
                        if (i2 < this.am.length - 1) {
                            int i6 = i2;
                            int i7 = i2 + 1;
                            this.am[i6] = (i4 + i5) * 40;
                            i2 = i7 + 1;
                            this.am[i7] = ((i4 + i5) * 40) + 80;
                        }
                    }
                }
            }
            if (i >= length) {
                break;
            }
        }
        this.cl = i2;
        this.ci = 0;
    }

    private void i(int i, int i2) {
        this.bX = i;
        this.bY = this.ce == 3 ? 1 : (q.r() % 2) + 1;
        this.cj = 0;
        this.bZ = i2;
    }

    public final void F() {
        if (this.N) {
            return;
        }
        this.N = true;
        this.cj = 0;
        this.ck = 0;
    }

    public final boolean b() {
        return this.N;
    }

    public final int f() {
        return this.ck;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0144  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final void d(int i) {
        if (this.N) {
            this.ck += i;
            this.cj += i;
            if (this.ck > 5000) {
                for (int i2 = 0; i2 < this.c.length; i2++) {
                    this.c[i2] = false;
                }
            } else if (this.cj > 50) {
                this.cj = 0;
                this.c[q.r() % 49] = false;
            }
            a(this.c);
            return;
        }
        this.cj = Math.min(this.cj + i, this.bZ);
        boolean zA = false;
        switch (this.bX) {
            case 0:
                if (this.cj < this.bZ) {
                    zA = false | a(false);
                } else if (q.r() % 100 < this.cb) {
                    i(1, this.ca);
                } else {
                    i(0, 100);
                }
                break;
            case 1:
                if (this.cj < this.bZ) {
                    zA = false | a(true);
                } else {
                    i(0, 100);
                }
                break;
        }
        boolean z = false | zA;
        this.ci += i;
        boolean z2 = false;
        for (int i3 = 0; i3 < this.cl; i3 += 2) {
            if (this.ci >= this.am[i3] && this.ci < this.am[i3 + 1]) {
                z2 = true;
                if (z || b(z2)) {
                    a(this.c);
                }
            }
        }
        if (z || b(z2)) {
            a(this.c);
        }
    }
}
