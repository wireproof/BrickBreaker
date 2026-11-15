package defpackage;

import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:aw.class */
public final class aw implements Runnable {
    static e g;
    static e[] d;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    static String f21g;
    static int dP;
    static int dQ;
    static int dR;
    public static int dS;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    static String[] f22g;
    static e h;
    static e i;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    static Image f23d;
    static Image e;
    static int dT;
    static int[][] D;
    static int dU;

    @Override // java.lang.Runnable
    public final void run() {
        if (bd.b(f21g)) {
            return;
        }
        dQ = -1;
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int i2, int i3) {
        int length = iArr.length;
        String[] strArr2 = new String[length];
        Image[] imageArr = new Image[length];
        String[] strArr3 = new String[length];
        Image[] imageArr2 = new Image[length];
        for (int i4 = 0; i4 < length; i4++) {
            strArr2[i4] = ba.c(iArr[i4]);
            imageArr[i4] = ba.getImage(iArr2[i4]);
            strArr3[i4] = ba.c(iArr3[i4]);
            imageArr2[i4] = ba.getImage(iArr4[i4]);
        }
        f22g = strArr;
        dU = 0;
        for (String str : strArr) {
            if (str != null) {
                dU++;
            }
        }
        dT = 34;
        int width = 0;
        if (dU > 1) {
            f23d = ba.getImage(983040);
            e = ba.getImage(983041);
            width = f23d.getWidth() + e.getWidth() + 10;
        }
        f22g = new String[dU];
        d = new e[dU];
        int i5 = 0;
        for (int i6 = 0; i6 < strArr.length; i6++) {
            if (strArr[i6] != null) {
                f22g[i5] = strArr[i6];
                int i7 = 0;
                Image image = imageArr[i6] != null ? imageArr[i6] : null;
                String str2 = strArr2[i6] != null ? strArr2[i6] : null;
                Image image2 = null;
                if (imageArr2[i6] != null) {
                    image2 = imageArr2[i6];
                    i7 = 1;
                }
                String string = strArr3[i6] != null ? new StringBuffer().append(strArr3[i6]).append(ba.b(2)).toString() : null;
                e eVar = new e();
                eVar.b(1, 2, i7);
                eVar.a(str2, image, 1);
                if (image2 != null) {
                    eVar.a(0, 1, (String) null, new Image[]{image2}, 0);
                    eVar.a(1, 1, string, (Image[]) null, 0);
                } else {
                    eVar.a(0, 1, string, (Image[]) null, 0);
                }
                eVar.f79v[0] = 34;
                eVar.f79v[1] = 5;
                eVar.a(ba.E() - width, ba.H(), false);
                d[i5] = eVar;
                i5++;
            }
        }
        String strC = ba.c(49);
        e eVar2 = new e();
        i = eVar2;
        eVar2.b(1, 1, 0);
        i.a(strC, (Image) null, 1);
        i.a(0, 1, ba.c(327697), (Image[]) null, 0);
        i.f79v[0] = 1;
        i.a(ba.E(), ba.H(), false);
        e eVar3 = new e();
        h = eVar3;
        eVar3.b(1, 1, 0);
        h.a(strC, (Image) null, 1);
        h.a(0, 1, ba.c(327698), (Image[]) null, 0);
        h.f79v[0] = 1;
        h.a(ba.E(), ba.H(), false);
    }
}
