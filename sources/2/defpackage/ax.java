package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:ax.class */
public final class ax {
    Image f;
    Font a;
    private int dV;
    private int dW;
    boolean am;
    int dX;
    private int dY;
    private int dZ;
    private byte[] h;
    private short[] j;
    byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private byte[] f24j;
    private byte[] k;
    private int[] az;

    public ax(Image image, DataInputStream dataInputStream, Font font, int i, int i2) throws IOException {
        int i3;
        if (image == null) {
            this.a = font;
            this.dV = i;
            this.dW = i2;
            this.am = i2 != -1;
            return;
        }
        this.f = image;
        int i4 = dataInputStream.readShort();
        this.dX = dataInputStream.readByte();
        this.dY = dataInputStream.readByte();
        this.dZ = dataInputStream.readByte();
        int i5 = 1;
        while (true) {
            i3 = i5;
            if (i3 >= (i4 << 2) / 3) {
                break;
            } else {
                i5 = i3 << 1;
            }
        }
        this.az = new int[i3];
        this.h = new byte[i4];
        this.j = new short[i4];
        this.i = new byte[i4];
        this.f24j = new byte[i4];
        this.k = new byte[i4];
        while (i4 > 0) {
            int i6 = dataInputStream.read();
            char c = dataInputStream.readChar();
            while (true) {
                char c2 = c;
                int i7 = i6;
                i6 = i7 - 1;
                if (i7 > 0) {
                    i4--;
                    this.h[i4] = dataInputStream.readByte();
                    this.j[i4] = dataInputStream.readShort();
                    this.i[i4] = dataInputStream.readByte();
                    this.f24j[i4] = dataInputStream.readByte();
                    this.k[i4] = dataInputStream.readByte();
                    a(c2, (short) i4);
                    c = (char) (c2 + 1);
                }
            }
        }
    }

    final int a(char c) {
        int iB = b(c);
        int iB2 = iB;
        if (iB == -1) {
            iB2 = b(' ');
        }
        return iB2;
    }

    public final int stringWidth(String str) {
        if (this.f == null) {
            return this.a.stringWidth(str) + (this.am ? 2 : 0);
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i += this.i[a(str.charAt(i2))] + this.dX;
        }
        if (this.dX < 0) {
            i -= this.dX;
        }
        return i;
    }

    public final int getHeight() {
        if (this.f != null) {
            return this.dY + this.dZ;
        }
        return this.a.getHeight() + (this.am ? 2 : 0);
    }

    public final void a(Graphics graphics, String str, int i, int i2, int i3) {
        if (this.f == null) {
            graphics.setFont(this.a);
            int color = graphics.getColor();
            if (this.am) {
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
                graphics.setColor(this.dW);
                graphics.drawString(str, i, i2 - 1, i3);
                graphics.drawString(str, i - 1, i2, i3);
                graphics.drawString(str, i + 1, i2, i3);
                graphics.drawString(str, i, i2 + 1, i3);
            }
            graphics.setColor(this.dV);
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
            i2 += this.dY;
        } else if ((i3 & 32) != 0) {
            i2 -= this.dZ;
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
            byte b = this.i[iA];
            if (cCharAt != ' ') {
                byte b2 = this.k[iA];
                byte b3 = this.f24j[iA];
                int i5 = clipX + clipWidth;
                int i6 = clipY + clipHeight;
                int iMax = Math.max(clipX, i);
                int iMax2 = Math.max(clipY, i2 - b2);
                graphics.setClip(iMax, iMax2, Math.max(iMax, Math.min(i5, i + b)) - iMax, Math.max(iMax2, Math.min(i6, (i2 - b2) + b3)) - iMax2);
                graphics.drawImage(this.f, i - (this.h[iA] & 255), (i2 - this.j[iA]) - b2, 20);
            }
            i += b + this.dX;
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    private void a(char c, short s) {
        int iC = c(c);
        for (int i = 0; i < this.az.length; i++) {
            if (this.az[iC & (this.az.length - 1)] == 0) {
                this.az[iC & (this.az.length - 1)] = (c << 16) | (s & 65535);
                return;
            }
            iC++;
        }
    }

    private int b(char c) {
        int i;
        int iC = c(c);
        for (int i2 = 0; i2 < this.az.length && (i = this.az[iC & (this.az.length - 1)]) != 0; i2++) {
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
