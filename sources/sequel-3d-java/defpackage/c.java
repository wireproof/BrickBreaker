package defpackage;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: sequel-3d-java.jar:c.class */
public final class c {
    Image a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    Graphics f50a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int[] f51a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int[][] f52a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int f53a;
    int b;

    public c(Image image) {
        this.a = image;
        if (image.isMutable()) {
            this.f50a = image.getGraphics();
        }
    }

    public c(int i, int i2) {
        this.a = Image.createImage(i, i2);
        this.f50a = this.a.getGraphics();
    }

    public c(int i) {
        this(t.a(i));
    }

    public final void a(int i, int i2) {
        this.f53a = i;
        this.b = i2;
        if (this.a.isMutable()) {
            if (a()) {
                this.f50a.setClip(0, 0, i, i2);
            } else {
                this.f50a.setClip(0, 0, this.a.getWidth(), this.a.getHeight());
            }
        }
    }

    public final boolean a() {
        return (this.f53a == 0 || this.b == 0) ? false : true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m25a() {
        return this.b != 0 ? this.b : this.a.getHeight();
    }

    public final void a(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a.getRGB(iArr, i, i2, i3, i4, i5, i6);
    }

    public final int b() {
        return this.f53a != 0 ? this.f53a : this.a.getWidth();
    }
}
