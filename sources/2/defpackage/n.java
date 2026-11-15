package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: bbr-2.jar:n.class */
public final class n {
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private bb[] a;
    private int[] P;
    private int[] Q;
    private int[] R;
    private int cd;
    private boolean x;
    private boolean y;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private d[] f153a;
    private int ce;
    private int cf;
    private int cg;
    private int ch;
    private boolean z = true;
    private static final int[] S = new int[1];
    private static final int[] T = {Integer.MAX_VALUE};
    private static bb[] b;

    public n(int i, boolean z) throws IOException {
        this.cd = Integer.MAX_VALUE;
        if (i == -1) {
            if (b == null) {
                b = new bb[]{new bb(true, this)};
            }
            this.a = b;
            this.P = T;
            this.R = S;
            this.Q = S;
            return;
        }
        if (!z) {
            ar.M();
        }
        DataInputStream dataInputStreamM22a = ba.m22a(i);
        int i2 = dataInputStreamM22a.read();
        boolean z2 = (i2 & 1) == 0;
        boolean z3 = (i2 & 2) == 0;
        int i3 = dataInputStreamM22a.read();
        this.P = new int[i3];
        this.Q = new int[i3];
        if (i3 > 1) {
            this.R = new int[i3];
        }
        this.a = new bb[i3];
        this.x = dataInputStreamM22a.read() == 1;
        this.y = dataInputStreamM22a.read() == 1;
        if (z2) {
            this.aa = dataInputStreamM22a.readByte();
            this.ab = dataInputStreamM22a.readByte();
            this.ac = dataInputStreamM22a.read();
            this.ad = dataInputStreamM22a.read();
        } else {
            this.aa = dataInputStreamM22a.readShort();
            this.ab = dataInputStreamM22a.readShort();
            this.ac = dataInputStreamM22a.readShort();
            this.ad = dataInputStreamM22a.readShort();
        }
        dataInputStreamM22a.read();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = dataInputStreamM22a.read();
            if (i3 > 1) {
                this.R[i4] = i5;
            }
            if (!d(i4)) {
                this.a[i4] = new bb(false, this);
            }
        }
        boolean z4 = false;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = z3 ? dataInputStreamM22a.read() : dataInputStreamM22a.readShort() & 65535;
            if (i8 == 0) {
                i8 = Integer.MAX_VALUE;
                z4 = true;
            }
            this.P[i7] = i8;
            this.Q[i7] = i6;
            i6 += i8;
        }
        if (!z4) {
            this.cd = this.Q[i3 - 1] + this.P[i3 - 1];
        }
        boolean z5 = dataInputStreamM22a.read() == 1;
        this.ce = this.aa;
        this.cf = this.ab;
        this.cg = this.ac;
        this.ch = this.ad;
        if (z5) {
            if (z2) {
                this.ce = dataInputStreamM22a.readByte();
                this.cf = dataInputStreamM22a.readByte();
                this.cg = dataInputStreamM22a.read();
                this.ch = dataInputStreamM22a.read();
            } else {
                this.ce = dataInputStreamM22a.readShort();
                this.cf = dataInputStreamM22a.readShort();
                this.cg = dataInputStreamM22a.readShort();
                this.ch = dataInputStreamM22a.readShort();
            }
            this.f153a = new d[6];
            for (int i9 = 0; i9 < 6; i9++) {
                this.f153a[i9] = new d(i9, this.cd);
                this.f153a[i9].a(dataInputStreamM22a, z2);
            }
        }
        for (int i10 = 0; i10 < i3; i10++) {
            if (!d(i10)) {
                this.a[i10].a(dataInputStreamM22a, z2, z);
            }
        }
        dataInputStreamM22a.close();
        if (i3 > 1) {
            for (int i11 = 0; i11 < i3; i11++) {
                int i12 = this.R[i11];
                if (d(i11)) {
                    this.a[i11] = this.a[i12];
                }
            }
        }
    }

    public final int n() {
        return this.aa;
    }

    public final int o() {
        return this.ab;
    }

    public final int p() {
        return this.ac;
    }

    public final int q() {
        return this.ad;
    }

    public final int getX() {
        return this.ce;
    }

    public final int getY() {
        return this.cf;
    }

    public final int getWidth() {
        return this.cg;
    }

    public final int getHeight() {
        return this.ch;
    }

    public final int r() {
        return this.a.length;
    }

    public final boolean c() {
        return this.x;
    }

    public final int getDuration() {
        return this.cd;
    }

    public final int h(int i) {
        return this.Q[i];
    }

    public final int i(int i) {
        return this.P[i];
    }

    public final void e(int i, int i2, int i3) {
        int i4;
        int length = this.P.length;
        while (true) {
            length--;
            if (length < 0) {
                i4 = -1;
                break;
            } else if (i3 >= this.Q[length]) {
                i4 = length;
                break;
            }
        }
        int i5 = i4;
        if (!this.y) {
            i3 -= this.Q[i5];
        }
        this.a[i5].e(i, i2, i3);
    }

    public final bb a(int i) {
        return this.a[i];
    }

    public final boolean d(int i) {
        return this.a.length > 1 && this.R[i] != 255;
    }

    public final int a(int i, int i2, boolean z) {
        return this.f153a[i].a(i2, z);
    }

    public final boolean d() {
        if (this.f153a == null) {
            return false;
        }
        int i = 6;
        do {
            i--;
            if (i < 0) {
                return false;
            }
        } while (this.f153a[i].l() <= 0);
        return true;
    }

    public final void m() {
        int length = this.a.length;
        while (true) {
            length--;
            if (length < 0) {
                ar.a(this, -1);
                return;
            }
            this.a[length].X();
        }
    }

    public final boolean e() {
        return this.z;
    }
}
