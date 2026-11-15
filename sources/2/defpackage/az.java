package defpackage;

import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:az.class */
public final class az {
    int r;
    int eh;
    private final int ei;
    Image g;

    public az(int i) {
        this.ei = i;
    }

    public final void a(h hVar) {
        if (this.g == null) {
            byte[] bArrA = ba.a(this.ei);
            this.r = (bArrA[0] << 24) | ((bArrA[1] & 255) << 16) | ((bArrA[2] & 255) << 8) | (bArrA[3] & 255);
            this.eh = (bArrA[4] << 24) | ((bArrA[5] & 255) << 16) | ((bArrA[6] & 255) << 8) | (bArrA[7] & 255);
            int i = (bArrA[8] << 24) | ((bArrA[9] & 255) << 16) | ((bArrA[10] & 255) << 8) | (bArrA[11] & 255);
            if (i != -1) {
                this.g = ar.m3a(i);
            }
        }
    }
}
