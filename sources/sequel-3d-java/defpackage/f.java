package defpackage;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: loaded from: sequel-3d-java.jar:f.class */
public final class f {
    private Font a;
    private int b;
    private int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f73a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static int f74a;

    public f(Font font, int i, int i2) {
        this.a = font;
        this.b = i;
        this.c = i2;
        this.f73a = i2 != -1;
    }

    public final int a(String str) {
        return this.a.stringWidth(str) + (this.f73a ? 2 : 0);
    }

    public final int a(char c) {
        return this.a.charWidth(c);
    }

    public final int a() {
        return this.f73a ? 2 : 0;
    }

    public final int b() {
        return this.a.getHeight() + (this.f73a ? 2 : 0);
    }

    public final void a(Graphics graphics, String str, int i, int i2, int i3) {
        graphics.setFont(this.a);
        int color = graphics.getColor();
        if (this.f73a) {
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
            graphics.setColor(this.c);
            graphics.drawString(str, i, i2 - 1, i3);
            graphics.drawString(str, i - 1, i2, i3);
            graphics.drawString(str, i + 1, i2, i3);
            graphics.drawString(str, i, i2 + 1, i3);
        }
        graphics.setColor(this.b);
        graphics.drawString(str, i, i2, i3);
        graphics.setColor(color);
    }

    public final void a(Graphics graphics, char c, int i, int i2, int i3) {
        graphics.setFont(this.a);
        int color = graphics.getColor();
        if (this.f73a) {
            i++;
            i2++;
            graphics.setColor(this.c);
            graphics.drawChar(c, i, i2 - 1, 20);
            graphics.drawChar(c, i - 1, i2, 20);
            graphics.drawChar(c, i + 1, i2, 20);
            graphics.drawChar(c, i, i2 + 1, 20);
        }
        graphics.setColor(this.b);
        graphics.drawChar(c, i, i2, 20);
        graphics.setColor(color);
    }
}
