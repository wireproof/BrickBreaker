package defpackage;

import java.io.DataInputStream;

/* JADX INFO: loaded from: bbr-2.jar:d.class */
public final class d {
    private int r;
    private int[] q;

    /* JADX INFO: renamed from: r, reason: collision with other field name */
    private int[] f62r;
    private int[] s;

    /* JADX INFO: renamed from: s, reason: collision with other field name */
    private int f63s;
    private static final int[] t = new int[0];

    public d(int i, int i2) {
        this.r = i;
        this.f63s = i2;
    }

    public final void a(DataInputStream dataInputStream, boolean z) {
        int i = dataInputStream.read();
        if (i == 0) {
            this.q = t;
            this.f62r = t;
            this.s = t;
        } else {
            this.q = new int[i];
            this.f62r = new int[i];
            this.s = new int[i];
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f62r[i2] = dataInputStream.readInt();
            this.s[i2] = dataInputStream.read();
            int i3 = -1;
            if (this.r == 0 || this.r == 3 || this.r == 4) {
                i3 = dataInputStream.readInt();
            } else if (this.r == 1 || this.r == 2) {
                i3 = z ? dataInputStream.readByte() : dataInputStream.readShort();
            } else if (this.r == 5) {
                i3 = dataInputStream.readInt();
            }
            this.q[i2] = i3;
        }
    }

    public final int a(int i, boolean z) {
        int i2;
        int i3;
        if (this.f62r.length == 0) {
            if (this.r == 0) {
                return -8355712;
            }
            return (this.r == 3 || this.r == 4) ? 1024 : 0;
        }
        int length = this.f62r.length;
        while (true) {
            length--;
            if (length < 0) {
                i2 = -1;
                break;
            }
            if (i >= this.f62r[length]) {
                i2 = length;
                break;
            }
        }
        int i4 = i2;
        if (this.s[i4] == 1) {
            return this.q[i4];
        }
        int i5 = i - this.f62r[i4];
        int i6 = i4 + 1;
        int i7 = i6;
        if (i6 != this.f62r.length) {
            i3 = this.f62r[i7] - this.f62r[i4];
        } else {
            if (!z) {
                return this.q[i4];
            }
            i7 = 0;
            i3 = this.f63s - this.f62r[i4];
        }
        if (this.s[i4] == 0) {
            return this.r == 0 ? ar.b(this.q[i4], this.q[i7], i5, i3) : ar.c(this.q[i4], this.q[i7], i5, i3);
        }
        return -1;
    }

    public final int l() {
        return this.f62r.length;
    }
}
