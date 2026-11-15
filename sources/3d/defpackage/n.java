package defpackage;

import com.nokia.mid.ui.DirectUtils;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-3d.jar:n.class */
public final class n {
    public short[][] d;
    public short[] k;
    private int cp;
    public int cq;
    private int cr;
    private boolean P;
    private int cs;
    private int ct;

    public n(short[][] sArr, boolean z) {
        this.d = sArr;
        int length = sArr.length;
        while (true) {
            length--;
            if (length < 0) {
                b(0, -1, false);
                return;
            } else if (sArr[length] != null) {
                c.a(sArr[length], 1);
            }
        }
    }

    public n(short[] sArr) {
        this(new short[][]{sArr}, true);
    }

    public final void k(int i) {
        this.cr += i;
        short s = this.k[6 + (this.cp << 1)];
        while (true) {
            short s2 = s;
            if (this.cr < s2) {
                return;
            }
            this.cr -= s2;
            if (this.P) {
                this.cr = 0;
            }
            short s3 = this.k[4];
            this.cp++;
            if (this.cp >= s3) {
                if (this.ct > 0) {
                    this.ct--;
                }
                this.cp = 0;
                if (this.ct == 0) {
                    this.cp = s3 - 1;
                }
            }
            int i2 = 5 + (this.cp << 1);
            this.cq = this.k[i2] & Short.MAX_VALUE;
            s = this.k[i2 + 1];
        }
    }

    public final void c(Graphics graphics, int i, int i2) {
        short[] sArr = this.k;
        int i3 = i - sArr[0];
        int i4 = i2 - sArr[1];
        int i5 = this.cq + (sArr[this.cq] * 5) + 1;
        int i6 = i5 + 1;
        int i7 = sArr[i5];
        while (true) {
            i7--;
            if (i7 < 0) {
                return;
            }
            int i8 = i6;
            int i9 = i6 + 1;
            short s = sArr[i8];
            if (s == 1) {
                int i10 = i9 + 1;
                int i11 = sArr[i9] + i3;
                int i12 = i10 + 1;
                int i13 = sArr[i10] + i4;
                i6 = i12 + 1;
                short s2 = sArr[i12];
                Image image = (Image) c.a.elementAt(s2 & 2047);
                int i14 = s2 >>> 13;
                if (i14 != 0) {
                    int i15 = 0;
                    if ((i14 & 1) != 0) {
                        i15 = 8192;
                    }
                    if ((i14 & 2) != 0) {
                        i15 |= 16384;
                    }
                    DirectUtils.getDirectGraphics(graphics).drawImage(image, i11, i13, 20, i15);
                } else {
                    graphics.drawImage(image, i11, i13, 20);
                }
            } else {
                int i16 = i9 + 1;
                int i17 = sArr[i9] << 16;
                int i18 = i16 + 1;
                graphics.setColor(i17 | (sArr[i16] & 65535));
                if (s == 4) {
                    int i19 = i18 + 1;
                    int i20 = i3 + sArr[i18];
                    int i21 = i19 + 1;
                    int i22 = i4 + sArr[i19];
                    int i23 = i21 + 1;
                    int i24 = i3 + sArr[i21];
                    i6 = i23 + 1;
                    graphics.drawLine(i20, i22, i24, i4 + sArr[i23]);
                } else if (s == 3) {
                    int i25 = i18 + 1;
                    int i26 = i3 + sArr[i18];
                    int i27 = i25 + 1;
                    int i28 = i4 + sArr[i25];
                    int i29 = i27 + 1;
                    short s3 = sArr[i27];
                    i6 = i29 + 1;
                    graphics.drawRect(i26, i28, s3, sArr[i29]);
                } else if (s == 2) {
                    int i30 = i18 + 1;
                    int i31 = i3 + sArr[i18];
                    int i32 = i30 + 1;
                    int i33 = i4 + sArr[i30];
                    int i34 = i32 + 1;
                    short s4 = sArr[i32];
                    i6 = i34 + 1;
                    graphics.fillRect(i31, i33, s4, sArr[i34]);
                } else if (s == 5) {
                    int i35 = i18 + 1;
                    int i36 = i3 + sArr[i18];
                    int i37 = i35 + 1;
                    int i38 = i4 + sArr[i35];
                    int i39 = i37 + 1;
                    short s5 = sArr[i37];
                    i6 = i39 + 1;
                    c.a(graphics, i36, i38, s5, sArr[i39]);
                } else {
                    int i40 = i18 + 1;
                    short s6 = sArr[i18];
                    c.a(graphics, i3, i4, sArr, i40, s6);
                    i6 = i40 + (s6 << 1);
                }
            }
        }
    }

    public final void b(int i, int i2, boolean z) {
        this.k = this.d[i];
        this.cs = i2;
        this.P = z;
        y(0);
    }

    public final int h() {
        int i = 0;
        while (this.k != this.d[i]) {
            i++;
        }
        return i;
    }

    public final void y(int i) {
        this.cp = i;
        this.cq = this.k[5 + (this.cp << 1)] & Short.MAX_VALUE;
        this.ct = this.cs;
        this.cr = 0;
    }

    public final boolean c() {
        return this.ct == 0;
    }

    public final void H() {
        if (this.d == null) {
            return;
        }
        int length = this.d.length;
        while (true) {
            length--;
            if (length < 0) {
                c.e();
                this.d = null;
                return;
            } else if (this.d[length] != null) {
                c.a(this.d[length], -1);
            }
        }
    }
}
