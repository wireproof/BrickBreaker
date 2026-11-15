package defpackage;

import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: sequel-3d-java.jar:k.class */
public final class k implements Runnable {
    static n a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static n[] f186a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static String f187a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static int f188a;
    static int b;
    static int c;
    public static int d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static String[] f189a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    static n f190b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    static n f191c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static Image f192a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    static Image f193b;
    static int e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static int[][] f194a;
    static int f;

    @Override // java.lang.Runnable
    public final void run() {
        if (h.a(f187a)) {
            return;
        }
        b = -1;
    }

    public static String[] a() {
        String strM92b = t.m92b(5);
        if (strM92b == null) {
            return new String[]{"none"};
        }
        int i = 0;
        int length = 0;
        while (true) {
            int i2 = length;
            if (i2 >= strM92b.length()) {
                break;
            }
            i++;
            int iIndexOf = strM92b.indexOf("!.!", i2);
            if (iIndexOf == -1) {
                break;
            }
            length = iIndexOf + "!.!".length();
        }
        String[] strArr = new String[i];
        int length2 = 0;
        String strM87a = t.m87a(468);
        for (int i3 = 0; i3 < i; i3++) {
            int iIndexOf2 = strM92b.indexOf("!.!", length2);
            int length3 = iIndexOf2;
            if (iIndexOf2 == -1) {
                length3 = strM92b.length();
            }
            if (length2 < length3) {
                String strSubstring = strM92b.substring(length2, length3);
                if ("none".equals(strSubstring)) {
                    strArr[i3] = null;
                } else if ("nolink".equals(strSubstring)) {
                    strArr[i3] = "nolink";
                } else {
                    if (strSubstring.indexOf("aid=") == -1) {
                        strSubstring = new StringBuffer().append(strSubstring).append("&aid=1104").toString();
                    }
                    if (strSubstring.indexOf("clk=") == -1) {
                        strSubstring = new StringBuffer().append(strSubstring).append("&clk=0").toString();
                    }
                    if (strSubstring.indexOf("car=") == -1) {
                        strSubstring = new StringBuffer().append(strSubstring).append("&car=").append(t.m92b(2)).toString();
                    }
                    if (strSubstring.indexOf("lng") == -1) {
                        strSubstring = new StringBuffer().append(strSubstring).append("&lng=").append(strM87a).toString();
                    }
                    strArr[i3] = strSubstring;
                }
            } else {
                strArr[i3] = "nolink";
            }
            String strA = t.a(new StringBuffer().append("DCHOC-GMG-").append(i3).toString());
            if (strA != null && !strA.equals("")) {
                String strTrim = strA.trim();
                String str = strTrim;
                if (strTrim.equals("none") || str.equals(t.m92b(25))) {
                    str = null;
                }
                strArr[i3] = str;
            }
            length2 = length3 + "!.!".length();
        }
        return strArr;
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int i, int i2) {
        int length = iArr.length;
        String[] strArr2 = new String[length];
        Image[] imageArr = new Image[length];
        String[] strArr3 = new String[length];
        Image[] imageArr2 = new Image[length];
        for (int i3 = 0; i3 < length; i3++) {
            strArr2[i3] = t.m87a(iArr[i3]);
            imageArr[i3] = t.a(iArr2[i3]);
            strArr3[i3] = t.m87a(iArr3[i3]);
            imageArr2[i3] = t.a(iArr4[i3]);
        }
        f189a = strArr;
        f = 0;
        for (String str : strArr) {
            if (str != null) {
                f++;
            }
        }
        e = 34;
        int width = 0;
        if (f > 1) {
            f192a = t.a(65536);
            f193b = t.a(65537);
            width = f192a.getWidth() + f193b.getWidth() + 10;
        }
        f189a = new String[f];
        f186a = new n[f];
        int i4 = 0;
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (strArr[i5] != null) {
                f189a[i4] = strArr[i5];
                int i6 = 0;
                Image image = imageArr[i5] != null ? imageArr[i5] : null;
                String str2 = strArr2[i5] != null ? strArr2[i5] : null;
                Image image2 = null;
                if (imageArr2[i5] != null) {
                    image2 = imageArr2[i5];
                    i6 = 1;
                }
                String string = strArr3[i5] != null ? new StringBuffer().append(strArr3[i5]).append(t.c(2)).toString() : null;
                n nVar = new n();
                nVar.a(1, 2, i6);
                nVar.a(str2, image);
                if (image2 != null) {
                    nVar.a(0, 1, (String) null, new Image[]{image2}, 0);
                    nVar.a(1, 1, string, (Image[]) null, 0);
                } else {
                    nVar.a(0, 1, string, (Image[]) null, 0);
                }
                nVar.a(34, 0);
                nVar.a(5, 1);
                nVar.b(t.m98e() - width, t.a());
                f186a[i4] = nVar;
                i4++;
            }
        }
        String strM87a = t.m87a(459);
        n nVar2 = new n();
        f191c = nVar2;
        nVar2.a(1, 1, 0);
        f191c.a(strM87a, (Image) null);
        f191c.a(0, 1, t.m87a(469), (Image[]) null, 0);
        f191c.a(1, 0);
        f191c.b(t.m98e(), t.a());
        n nVar3 = new n();
        f190b = nVar3;
        nVar3.a(1, 1, 0);
        f190b.a(strM87a, (Image) null);
        f190b.a(0, 1, t.m87a(458), (Image[]) null, 0);
        f190b.a(1, 0);
        f190b.b(t.m98e(), t.a());
    }
}
