package defpackage;

import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-3d.jar:j.class */
public final class j implements Runnable {
    static f c;
    static f[] d;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    static String f129d;
    static int bR;
    static int bS;
    static int bT;
    static boolean L;
    static boolean M;
    public static int bU;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    static String[] f130d;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    static f f131d;
    static f e;
    static Image b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    static Image f132c;
    static int bV;
    static int[][] m;
    static int bW;

    @Override // java.lang.Runnable
    public final void run() {
        M = false;
        if (!s.b(f129d)) {
            bS = -1;
        }
        M = true;
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int i, int i2) {
        int length = iArr.length;
        String[] strArr2 = new String[length];
        Image[] imageArr = new Image[length];
        String[] strArr3 = new String[length];
        Image[] imageArr2 = new Image[length];
        for (int i3 = 0; i3 < length; i3++) {
            strArr2[i3] = p.c(iArr[i3]);
            imageArr[i3] = p.getImage(iArr2[i3]);
            strArr3[i3] = p.c(iArr3[i3]);
            imageArr2[i3] = p.getImage(iArr4[i3]);
        }
        f130d = strArr;
        bW = 0;
        for (String str : strArr) {
            if (str != null) {
                bW++;
            }
        }
        bV = 34;
        int width = 0;
        if (bW > 1) {
            b = p.getImage(131102);
            f132c = p.getImage(131103);
            width = b.getWidth() + f132c.getWidth() + 10;
        }
        f130d = new String[bW];
        d = new f[bW];
        int i4 = 0;
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (strArr[i5] != null) {
                f130d[i4] = strArr[i5];
                int i6 = 0;
                Image image = imageArr[i5] != null ? imageArr[i5] : null;
                String str2 = strArr2[i5] != null ? strArr2[i5] : null;
                Image image2 = null;
                if (imageArr2[i5] != null) {
                    image2 = imageArr2[i5];
                    i6 = 1;
                }
                String string = strArr3[i5] != null ? new StringBuffer().append(strArr3[i5]).append(p.m35b(2)).toString() : null;
                f fVar = new f();
                fVar.a(1, 2, i6);
                fVar.a(str2, image);
                if (image2 != null) {
                    fVar.a(0, 1, (String) null, new Image[]{image2}, 0);
                    fVar.a(1, 1, string, (Image[]) null, 0);
                } else {
                    fVar.a(0, 1, string, (Image[]) null, 0);
                }
                fVar.f38m[0] = 34;
                fVar.f38m[1] = 5;
                fVar.a(p.i() - width, p.m(), false);
                d[i4] = fVar;
                i4++;
            }
        }
        String strC = p.c(528);
        f fVar2 = new f();
        e = fVar2;
        fVar2.a(1, 1, 0);
        e.a(strC, null);
        e.a(0, 1, p.c(536), (Image[]) null, 0);
        e.f38m[0] = 1;
        e.a(p.i(), p.m(), false);
        f fVar3 = new f();
        f131d = fVar3;
        fVar3.a(1, 1, 0);
        f131d.a(strC, null);
        f131d.a(0, 1, p.c(527), (Image[]) null, 0);
        f131d.f38m[0] = 1;
        f131d.a(p.i(), p.m(), false);
    }
}
