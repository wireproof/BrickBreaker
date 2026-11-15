package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: original-2d.jar:b.class */
public final class b {
    private Image a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Font f59a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f60a;
    private int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f61a;
    private int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte f62a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private byte f63b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte[] f64a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private short[] f65a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private byte[] f66b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private byte[] f67c;
    private byte[] d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[] f68a;

    public b(Image image, DataInputStream dataInputStream, Font font, int i, int i2) throws IOException {
        int i3;
        if (image == null) {
            this.f59a = font;
            this.f60a = i;
            this.b = i2;
            this.f61a = i2 != -1;
            return;
        }
        this.a = image;
        int i4 = dataInputStream.readShort();
        this.c = dataInputStream.readByte();
        this.f62a = dataInputStream.readByte();
        this.f63b = dataInputStream.readByte();
        int i5 = 1;
        while (true) {
            i3 = i5;
            if (i3 >= (i4 * 4) / 3) {
                break;
            } else {
                i5 = i3 << 1;
            }
        }
        a(i3);
        this.f64a = new byte[i4];
        this.f65a = new short[i4];
        this.f66b = new byte[i4];
        this.f67c = new byte[i4];
        this.d = new byte[i4];
        while (i4 > 0) {
            int i6 = dataInputStream.read();
            char c = dataInputStream.readChar();
            while (true) {
                char c2 = c;
                int i7 = i6;
                i6 = i7 - 1;
                if (i7 > 0) {
                    i4--;
                    this.f64a[i4] = dataInputStream.readByte();
                    this.f65a[i4] = dataInputStream.readShort();
                    this.f66b[i4] = dataInputStream.readByte();
                    this.f67c[i4] = dataInputStream.readByte();
                    this.d[i4] = dataInputStream.readByte();
                    a(c2, (short) i4);
                    c = (char) (c2 + 1);
                }
            }
        }
    }

    private int b(char c) {
        int iC = c(c);
        int iC2 = iC;
        if (iC == -1) {
            iC2 = c(' ');
        }
        return iC2;
    }

    public final int a(String str) {
        if (this.a == null) {
            return this.f59a.stringWidth(str) + (this.f61a ? 2 : 0);
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i += this.f66b[b(str.charAt(i2))] + this.c;
        }
        if (this.c < 0) {
            i -= this.c;
        }
        return i;
    }

    public final int a(char c) {
        if (this.a == null) {
            return this.f59a.charWidth(c);
        }
        return this.f66b[b(c)] + this.c;
    }

    public final int a() {
        if (this.a != null) {
            return this.f62a + this.f63b;
        }
        return this.f59a.getHeight() + (this.f61a ? 2 : 0);
    }

    public final void a(Graphics graphics, String str, int i, int i2, int i3) {
        if (this.a == null) {
            graphics.setFont(this.f59a);
            int color = graphics.getColor();
            if (this.f61a) {
                if ((i3 & 4) != 0) {
                    i++;
                } else if ((i3 & 8) != 0) {
                    i--;
                }
                if ((i3 & 16) != 0) {
                    i2++;
                } else if ((i3 & 32) != 0) {
                    i2--;
                }
                graphics.setColor(this.b);
                graphics.drawString(str, i, i2 - 1, i3);
                graphics.drawString(str, i - 1, i2, i3);
                graphics.drawString(str, i + 1, i2, i3);
                graphics.drawString(str, i, i2 + 1, i3);
            }
            graphics.setColor(this.f60a);
            graphics.drawString(str, i, i2, i3);
            graphics.setColor(color);
            return;
        }
        if ((i3 & 1) != 0) {
            i -= a(str) >> 1;
        } else if ((i3 & 8) != 0) {
            i -= a(str);
        }
        if ((i3 & 16) != 0) {
            i2 += this.f62a;
        } else if ((i3 & 32) != 0) {
            i2 -= this.f63b;
        }
        if ((i3 & 2) != 0) {
            return;
        }
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            int iB = b(cCharAt);
            byte b = this.f66b[iB];
            if (cCharAt != ' ') {
                byte b2 = this.d[iB];
                byte b3 = this.f67c[iB];
                int i5 = clipX + clipWidth;
                int i6 = clipY + clipHeight;
                int iMax = Math.max(clipX, i);
                int iMax2 = Math.max(clipY, i2 - b2);
                graphics.setClip(iMax, iMax2, Math.max(iMax, Math.min(i5, i + b)) - iMax, Math.max(iMax2, Math.min(i6, (i2 - b2) + b3)) - iMax2);
                graphics.drawImage(this.a, i - (this.f64a[iB] & 255), (i2 - this.f65a[iB]) - b2, 20);
            }
            i += b + this.c;
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    public final void a(Graphics graphics, char c, int i, int i2, int i3) {
        if (this.a == null) {
            graphics.setFont(this.f59a);
            int color = graphics.getColor();
            if (this.f61a) {
                if ((i3 & 4) != 0) {
                    i++;
                } else if ((i3 & 8) != 0) {
                    i--;
                }
                if ((i3 & 16) != 0) {
                    i2++;
                } else if ((i3 & 32) != 0) {
                    i2--;
                }
                graphics.setColor(this.b);
                graphics.drawChar(c, i, i2 - 1, i3);
                graphics.drawChar(c, i - 1, i2, i3);
                graphics.drawChar(c, i + 1, i2, i3);
                graphics.drawChar(c, i, i2 + 1, i3);
            }
            graphics.setColor(this.f60a);
            graphics.drawChar(c, i, i2, i3);
            graphics.setColor(color);
            return;
        }
        if ((i3 & 1) != 0) {
            i -= a(c) >> 1;
        } else if ((i3 & 8) != 0) {
            i -= a(c);
        }
        if ((i3 & 16) != 0) {
            i2 += this.f62a;
        } else if ((i3 & 32) != 0) {
            i2 -= this.f63b;
        }
        if ((i3 & 2) != 0) {
            return;
        }
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        int iB = b(c);
        byte b = this.f66b[iB];
        if (c != ' ') {
            byte b2 = this.d[iB];
            byte b3 = this.f67c[iB];
            int i4 = clipX + clipWidth;
            int i5 = clipY + clipHeight;
            int iMax = Math.max(clipX, i);
            int iMax2 = Math.max(clipY, i2 - b2);
            graphics.setClip(iMax, iMax2, Math.max(iMax, Math.min(i4, i + b)) - iMax, Math.max(iMax2, Math.min(i5, (i2 - b2) + b3)) - iMax2);
            graphics.drawImage(this.a, i - (this.f64a[iB] & 255), (i2 - this.f65a[iB]) - b2, 20);
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    private void a(int i) {
        this.f68a = new int[i];
    }

    private void a(char c, short s) {
        int iD = d(c);
        for (int i = 0; i < this.f68a.length; i++) {
            if (this.f68a[iD & (this.f68a.length - 1)] == 0) {
                this.f68a[iD & (this.f68a.length - 1)] = (c << 16) | (s & 65535);
                return;
            }
            iD++;
        }
    }

    private int c(char c) {
        int i;
        int iD = d(c);
        for (int i2 = 0; i2 < this.f68a.length && (i = this.f68a[iD & (this.f68a.length - 1)]) != 0; i2++) {
            if ((i >>> 16) == c) {
                return i & 65535;
            }
            iD++;
        }
        return -1;
    }

    private static int d(char c) {
        return (c + 4660) * (c + 17185);
    }
}
