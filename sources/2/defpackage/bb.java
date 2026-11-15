package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Hashtable;

/* JADX INFO: loaded from: bbr-2.jar:bb.class */
public final class bb {
    private g[] a;
    private int[][] E;
    private static Hashtable e;
    private l b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private n f50b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static final g[] f51b = new g[0];
    private static final int[][] F = new int[0][];
    private static int[] aE = new int[2];

    public bb(boolean z, n nVar) {
        if (z) {
            this.a = f51b;
            this.E = F;
        }
        this.f50b = nVar;
    }

    public final void a(DataInputStream dataInputStream, boolean z, boolean z2) throws IOException {
        short s;
        int i;
        int i2;
        if (e == null) {
            e = new Hashtable();
        }
        if (z) {
            dataInputStream.read();
            dataInputStream.read();
        } else {
            dataInputStream.readShort();
            dataInputStream.readShort();
        }
        int i3 = dataInputStream.read();
        if (i3 == 0) {
            this.a = f51b;
        } else {
            this.a = new g[i3];
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = dataInputStream.read();
            if (z) {
                s = dataInputStream.readByte();
                dataInputStream.readByte();
                i = dataInputStream.read();
                i2 = dataInputStream.read();
            } else {
                s = dataInputStream.readShort();
                dataInputStream.readShort();
                i = dataInputStream.readShort();
                i2 = dataInputStream.readShort();
            }
            this.a[i4] = new g(s, i, i2, i5);
        }
        int i6 = dataInputStream.readShort();
        if (i6 == 0) {
            this.E = F;
        } else {
            this.E = new int[i6][];
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int[] iArr = null;
            int i8 = dataInputStream.read();
            if (i8 == 1) {
                iArr = new int[5];
                if (z) {
                    iArr[1] = dataInputStream.readByte();
                    iArr[2] = dataInputStream.readByte();
                } else {
                    iArr[1] = dataInputStream.readShort();
                    iArr[2] = dataInputStream.readShort();
                }
                int i9 = dataInputStream.read();
                ar.a(dataInputStream.readInt(), dataInputStream.read(), i9 & 15, (i9 >> 4) + 1, z2, aE);
                iArr[3] = aE[0];
                iArr[4] = aE[1];
            } else if (i8 == 9) {
                iArr = new int[5];
                if (z) {
                    iArr[1] = dataInputStream.readByte();
                    iArr[2] = dataInputStream.readByte();
                } else {
                    iArr[1] = dataInputStream.readShort();
                    iArr[2] = dataInputStream.readShort();
                }
                dataInputStream.read();
                iArr[4] = ar.b(dataInputStream.readInt(), z2);
            } else if (i8 == 7) {
                iArr = new int[5];
                if (z) {
                    iArr[1] = dataInputStream.readByte();
                    iArr[2] = dataInputStream.readByte();
                    iArr[3] = dataInputStream.read();
                    iArr[4] = dataInputStream.read();
                } else {
                    iArr[1] = dataInputStream.readShort();
                    iArr[2] = dataInputStream.readShort();
                    iArr[3] = dataInputStream.readShort();
                    iArr[4] = dataInputStream.readShort();
                }
            } else {
                int i10 = (-16777216) | (dataInputStream.read() << 16) | (dataInputStream.read() << 8) | dataInputStream.read();
                boolean z3 = false;
                int i11 = 2;
                if (i8 == 8 || i8 == 6) {
                    i11 = i8 == 8 ? 6 : 2;
                    z3 = true;
                } else {
                    iArr = new int[6];
                }
                if (!z) {
                    int i12 = 4;
                    int i13 = 2;
                    if (z3) {
                        int i14 = dataInputStream.read();
                        int[] iArr2 = new int[3 + (i14 * i11)];
                        iArr = iArr2;
                        iArr2[2] = i14;
                        i13 = 3;
                        i12 = i14 * i11;
                    }
                    for (int i15 = 0; i15 < i12; i15++) {
                        iArr[i13 + i15] = dataInputStream.readShort();
                    }
                } else if (z3) {
                    int i16 = dataInputStream.read();
                    int[] iArr3 = new int[3 + (i16 * i11)];
                    iArr = iArr3;
                    iArr3[2] = i16;
                    int i17 = i16 * i11;
                    for (int i18 = 0; i18 < i17; i18++) {
                        iArr[i18 + 3] = dataInputStream.readByte();
                    }
                } else {
                    iArr[2] = dataInputStream.readByte();
                    iArr[3] = dataInputStream.readByte();
                    if (i8 == 4) {
                        iArr[4] = dataInputStream.readByte();
                        iArr[5] = dataInputStream.readByte();
                    } else {
                        iArr[4] = dataInputStream.read();
                        iArr[5] = dataInputStream.read();
                    }
                }
                iArr[1] = i10;
            }
            iArr[0] = i8;
            this.E[i7] = iArr;
        }
    }

    public final void e(int i, int i2, int i3) {
        boolean z = false;
        int clipX = 0;
        int clipY = 0;
        int clipWidth = 0;
        int clipHeight = 0;
        b bVarM26a = ba.m26a();
        int i4 = bVarM26a.i();
        int iJ = bVarM26a.j();
        bVarM26a.a(i, i2);
        int length = this.E.length;
        for (int i5 = 0; i5 < length; i5++) {
            int[] iArr = this.E[i5];
            int i6 = iArr[0];
            if (i6 == 1) {
                int i7 = iArr[1];
                int i8 = iArr[2];
                l lVarM4a = ar.m4a(iArr[3]);
                int i9 = iArr[4];
                int i10 = (i9 & 1) != 0 ? 1 : 0;
                if ((i9 & 2) != 0) {
                    i10 |= 2;
                }
                bVarM26a.a(lVarM4a, i7, i8, i10, 20);
            } else if (i6 == 7) {
                if (z) {
                    bVarM26a.setClip(clipX, clipY, clipWidth, clipHeight);
                } else {
                    z = true;
                    clipX = bVarM26a.getClipX();
                    clipY = bVarM26a.getClipY();
                    clipWidth = bVarM26a.getClipWidth();
                    clipHeight = bVarM26a.getClipHeight();
                }
                bVarM26a.clipRect(iArr[1] + i, iArr[2] + i2, iArr[3], iArr[4]);
            } else if (i6 == 9) {
                int i11 = iArr[1] + i;
                int i12 = iArr[2] + i2;
                ay ayVarM5a = ar.m5a(iArr[4]);
                n nVarM7a = ayVarM5a.m7a();
                if ((i11 - nVarM7a.getX()) + nVarM7a.getWidth() > bVarM26a.getClipX() && (i12 - nVarM7a.getY()) + nVarM7a.getHeight() > bVarM26a.getClipY() && i11 - nVarM7a.getX() < bVarM26a.getClipX() + bVarM26a.getClipWidth() && i12 - nVarM7a.getY() < bVarM26a.getClipY() + bVarM26a.getClipHeight()) {
                    ayVarM5a.b(0, -2, false);
                    ayVarM5a.y(i3);
                    ayVarM5a.g(i11, i12);
                }
            } else {
                bVarM26a.b(iArr[1]);
                if (i6 == 4) {
                    bVarM26a.drawLine(iArr[2], iArr[3], iArr[4], iArr[5]);
                } else if (i6 == 2) {
                    bVarM26a.fillRect(iArr[2], iArr[3], iArr[4], iArr[5]);
                } else if (i6 == 5) {
                    bVarM26a.a(iArr[2], iArr[3], iArr[4], iArr[5]);
                } else if (i6 == 6) {
                    bVarM26a.a(iArr, 3, iArr[2]);
                } else {
                    bVarM26a.b(iArr, 3, iArr[2]);
                }
            }
        }
        if (z) {
            bVarM26a.setClip(clipX, clipY, clipWidth, clipHeight);
        }
        bVarM26a.a(i4, iJ);
    }

    public final g a(int i) {
        int length = this.a.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
        } while (this.a[length].az != 0);
        return this.a[length];
    }

    public final int[][] a() {
        return this.E;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final l m29a() {
        if (this.b == null) {
            this.b = new l(this.f50b.p(), this.f50b.q());
        }
        return this.b;
    }

    public final boolean j() {
        int[][] iArr = this.E;
        int length = iArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (iArr[length][0] != 9);
        return true;
    }

    public final void X() {
        if (this.b != null) {
            this.b = null;
        }
    }
}
