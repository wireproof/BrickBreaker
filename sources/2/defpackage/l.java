package defpackage;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:l.class */
public final class l {
    Image c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    Graphics f151c;
    int[] b;
    int[][] g;
    int bZ;
    int ca;
    int cb;
    int cc;

    public l(Image image) {
        this.c = image;
        if (image.isMutable()) {
            this.f151c = image.getGraphics();
        }
    }

    public l(int i, int i2) {
        this.c = Image.createImage(i, i2);
        this.f151c = this.c.getGraphics();
    }

    public l(int i) {
        this(ba.getImage(i));
    }

    public final void d(int i, int i2, int i3) {
        this.bZ = 0;
        this.ca = 0;
        this.cb = i2;
        this.cc = i3;
        if (this.c.isMutable()) {
            if (b()) {
                this.f151c.setClip(0, 0, i2, i3);
            } else {
                this.f151c.setClip(0, 0, this.c.getWidth(), this.c.getHeight());
            }
        }
    }

    public final boolean b() {
        return (this.cb == 0 || this.cc == 0) ? false : true;
    }

    public final int getHeight() {
        return this.cc != 0 ? this.cc : this.c.getHeight();
    }

    public final void getRGB(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        if (b()) {
            i3 = i3;
            i4 = i4;
        }
        this.c.getRGB(iArr, i, i2, i3, i4, i5, i6);
    }

    public final int getWidth() {
        return this.cb != 0 ? this.cb : this.c.getWidth();
    }
}
