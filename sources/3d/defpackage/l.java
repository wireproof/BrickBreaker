package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-3d.jar:l.class */
public final class l {
    private Image d;
    private Font a;
    private int cm;
    private int cn;
    private boolean O;
    private int co;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte f133a;
    private byte b;
    private byte[] e;
    private short[] j;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private int[] an;

    public l(Image image, DataInputStream dataInputStream, Font font, int i, int i2) throws IOException {
        int i3;
        if (image == null) {
            this.a = font;
            this.cm = i;
            this.cn = i2;
            this.O = i2 != -1;
            return;
        }
        this.d = image;
        int i4 = dataInputStream.readShort();
        this.co = dataInputStream.readByte();
        this.f133a = dataInputStream.readByte();
        this.b = dataInputStream.readByte();
        int i5 = 1;
        while (true) {
            i3 = i5;
            if (i3 >= (i4 << 2) / 3) {
                break;
            } else {
                i5 = i3 << 1;
            }
        }
        this.an = new int[i3];
        this.e = new byte[i4];
        this.j = new short[i4];
        this.f = new byte[i4];
        this.g = new byte[i4];
        this.h = new byte[i4];
        while (i4 > 0) {
            int i6 = dataInputStream.read();
            char c = dataInputStream.readChar();
            while (true) {
                char c2 = c;
                int i7 = i6;
                i6 = i7 - 1;
                if (i7 > 0) {
                    i4--;
                    this.e[i4] = dataInputStream.readByte();
                    this.j[i4] = dataInputStream.readShort();
                    this.f[i4] = dataInputStream.readByte();
                    this.g[i4] = dataInputStream.readByte();
                    this.h[i4] = dataInputStream.readByte();
                    a(c2, (short) i4);
                    c = (char) (c2 + 1);
                }
            }
        }
    }

    private int a(char c) {
        int iB = b(c);
        int iB2 = iB;
        if (iB == -1) {
            iB2 = b(' ');
        }
        return iB2;
    }

    public final int stringWidth(String str) {
        if (this.d == null) {
            return this.a.stringWidth(str) + (this.O ? 2 : 0);
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i += this.f[a(str.charAt(i2))] + this.co;
        }
        if (this.co < 0) {
            i -= this.co;
        }
        return i;
    }

    public final int charWidth(char c) {
        if (this.d == null) {
            return this.a.charWidth(c);
        }
        return this.f[a(c)] + this.co;
    }

    public final int g() {
        return (this.d == null && this.O) ? 2 : 0;
    }

    public final int getHeight() {
        if (this.d != null) {
            return this.f133a + this.b;
        }
        return this.a.getHeight() + (this.O ? 2 : 0);
    }

    public final void a(Graphics graphics, String str, int i, int i2, int i3) {
        if (this.d == null) {
            graphics.setFont(this.a);
            int color = graphics.getColor();
            if (this.O) {
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
                graphics.setColor(this.cn);
                graphics.drawString(str, i, i2 - 1, i3);
                graphics.drawString(str, i - 1, i2, i3);
                graphics.drawString(str, i + 1, i2, i3);
                graphics.drawString(str, i, i2 + 1, i3);
            }
            graphics.setColor(this.cm);
            graphics.drawString(str, i, i2, i3);
            graphics.setColor(color);
            return;
        }
        if ((i3 & 1) != 0) {
            i -= stringWidth(str) >> 1;
        } else if ((i3 & 8) != 0) {
            i -= stringWidth(str);
        }
        if ((i3 & 16) != 0) {
            i2 += this.f133a;
        } else if ((i3 & 32) != 0) {
            i2 -= this.b;
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
            int iA = a(cCharAt);
            byte b = this.f[iA];
            if (cCharAt != ' ') {
                byte b2 = this.h[iA];
                byte b3 = this.g[iA];
                int i5 = clipX + clipWidth;
                int i6 = clipY + clipHeight;
                int iMax = Math.max(clipX, i);
                int iMax2 = Math.max(clipY, i2 - b2);
                graphics.setClip(iMax, iMax2, Math.max(iMax, Math.min(i5, i + b)) - iMax, Math.max(iMax2, Math.min(i6, (i2 - b2) + b3)) - iMax2);
                graphics.drawImage(this.d, i - (this.e[iA] & 255), (i2 - this.j[iA]) - b2, 20);
            }
            i += b + this.co;
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    public final void a(Graphics graphics, char c, int i, int i2, int i3) {
        if (this.d == null) {
            graphics.setFont(this.a);
            int color = graphics.getColor();
            if (this.O) {
                i++;
                i2++;
                graphics.setColor(this.cn);
                graphics.drawChar(c, i, i2 - 1, 20);
                graphics.drawChar(c, i - 1, i2, 20);
                graphics.drawChar(c, i + 1, i2, 20);
                graphics.drawChar(c, i, i2 + 1, 20);
            }
            graphics.setColor(this.cm);
            graphics.drawChar(c, i, i2, 20);
            graphics.setColor(color);
            return;
        }
        int i4 = i2 + this.f133a;
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        int iA = a(c);
        byte b = this.f[iA];
        if (c != ' ') {
            byte b2 = this.h[iA];
            byte b3 = this.g[iA];
            int i5 = clipX + clipWidth;
            int i6 = clipY + clipHeight;
            int iMax = Math.max(clipX, i);
            int iMax2 = Math.max(clipY, i4 - b2);
            graphics.setClip(iMax, iMax2, Math.max(iMax, Math.min(i5, i + b)) - iMax, Math.max(iMax2, Math.min(i6, (i4 - b2) + b3)) - iMax2);
            graphics.drawImage(this.d, i - (this.e[iA] & 255), (i4 - this.j[iA]) - b2, 20);
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    private void a(char c, short s) {
        int iC = c(c);
        for (int i = 0; i < this.an.length; i++) {
            if (this.an[iC & (this.an.length - 1)] == 0) {
                this.an[iC & (this.an.length - 1)] = (c << 16) | (s & 65535);
                return;
            }
            iC++;
        }
    }

    private int b(char c) {
        int i;
        int iC = c(c);
        for (int i2 = 0; i2 < this.an.length && (i = this.an[iC & (this.an.length - 1)]) != 0; i2++) {
            if ((i >>> 16) == c) {
                return i & 65535;
            }
            iC++;
        }
        return -1;
    }

    private static int c(char c) {
        return (c + 4660) * (c + 17185);
    }
}
