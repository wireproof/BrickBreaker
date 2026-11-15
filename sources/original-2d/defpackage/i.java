package defpackage;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: original-2d.jar:i.class */
public final class i implements Runnable {
    private static l a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static l[] f236a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f237a;
    private static int b = 0;
    private static int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int f238a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String[] f239a = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static String[] f240b = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static l f241b = null;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static l f242c = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image f243a = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Image f244b = null;

    public static int a(int i) {
        c.m20b();
        int i2 = 0;
        f238a += i;
        if (f239a.length == 0) {
            return 2;
        }
        l lVar = null;
        if (b >= 0) {
            lVar = f236a[b];
        } else if (b == -1) {
            lVar = f241b;
        } else if (b == -2) {
            lVar = f242c;
        }
        if (a == null || a != lVar) {
            a = lVar;
            a.a();
        } else {
            int[] iArrM105a = a.m105a(i);
            if (iArrM105a != null) {
                if (b < 0) {
                    if (b == -2) {
                        b = c;
                    } else {
                        i2 = 2;
                    }
                } else if (iArrM105a[1] == 5) {
                    i2 = 2;
                } else {
                    f237a = f239a[b];
                    if (f237a == null) {
                        c = b;
                        b = -2;
                    } else if (c.a(f237a)) {
                        i2 = 1;
                    } else {
                        b = -1;
                    }
                }
            }
        }
        if (i2 != 0) {
            b = 0;
            d.b();
            a = null;
            f236a = null;
        }
        return i2;
    }

    public static void a(Graphics graphics) {
        if (b < 0) {
            if (b == -1) {
                f241b.a(graphics, 0, 0);
            }
            if (b == -2) {
                f242c.a(graphics, 0, 0);
                return;
            }
            return;
        }
        if (a != null) {
            a.a(graphics, f244b.getWidth() + 5, 0);
            if (b == -1 || f239a.length <= 1) {
                return;
            }
            int i = (f238a / 40) % 5;
            graphics.drawImage(f243a, 5 - i, d.a() / 2, 6);
            graphics.drawImage(f244b, (d.d() - 5) + i, d.a() / 2, 10);
        }
    }

    public static void a(int i, int i2) {
        if (a != null) {
            if (f236a != null) {
                int iM28a = 0;
                if (i2 == 0) {
                    iM28a = d.m28a(i);
                }
                if (b >= 0) {
                    if (iM28a == 52) {
                        b--;
                        if (b < 0) {
                            b = f236a.length - 1;
                        }
                    } else if (iM28a == 54) {
                        b++;
                        if (b > f236a.length - 1) {
                            b = 0;
                        }
                    }
                }
            }
            a.c(i, i2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (c.a(f237a)) {
            return;
        }
        b = -1;
    }

    private static String[] a() {
        String strM38b = d.m38b(5);
        if (strM38b == null) {
            return new String[]{"none"};
        }
        int i = 0;
        int i2 = 0;
        int length = 0;
        while (true) {
            int i3 = length;
            if (i3 >= strM38b.length()) {
                break;
            }
            i2++;
            if (strM38b.startsWith("none!.!", i3) || strM38b.substring(i3).equals("none")) {
                length = i3 + "none".length() + "!.!".length();
            } else {
                i++;
                int iIndexOf = strM38b.indexOf("!.!", i3);
                if (iIndexOf == -1) {
                    break;
                }
                length = iIndexOf + "!.!".length();
            }
        }
        if (i == 0) {
            return new String[0];
        }
        f240b = new String[i2];
        int length2 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int iIndexOf2 = strM38b.indexOf("!.!", length2);
            int length3 = iIndexOf2;
            if (iIndexOf2 == -1) {
                length3 = strM38b.length();
            }
            if (length2 < length3) {
                f240b[i4] = strM38b.substring(length2, length3);
            } else {
                f240b[i4] = "nolink";
            }
            length2 = length3 + "!.!".length();
        }
        f239a = new String[i];
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            if (!"none".equals(f240b[i6])) {
                if ("nolink".equals(f240b[i6])) {
                    f239a[i5] = null;
                } else {
                    f239a[i5] = new StringBuffer().append(f240b[i6]).append("&aid=").append("1030").append("&clk=0&car=").append(d.m38b(2)).append("&lng=").append(d.m30a(388)).toString();
                }
                i5++;
            }
        }
        return f239a;
    }

    public static void a(String[] strArr, Image[] imageArr, String[] strArr2, Image[] imageArr2) {
        f243a = d.m26a(65552);
        f244b = d.m26a(65553);
        d.a(24, 390, null, 0);
        int width = f243a.getWidth() + f244b.getWidth() + 10;
        f236a = new l[a().length];
        int i = 0;
        for (int i2 = 0; i2 < f240b.length; i2++) {
            int i3 = 0;
            if (!"none".equals(f240b[i2])) {
                Image image = null;
                if (imageArr != null && imageArr[i2] != null) {
                    image = imageArr[i2];
                }
                String str = null;
                if (strArr != null && strArr[i2] != null) {
                    str = strArr[i2];
                }
                Image image2 = null;
                if (imageArr2 != null && imageArr2[i2] != null) {
                    image2 = imageArr2[i2];
                    i3 = 1;
                }
                String str2 = null;
                if (strArr2 != null && strArr2[i2] != null) {
                    str2 = strArr2[i2];
                }
                l lVarMo17a = c.a().mo17a();
                lVarMo17a.a(1, 2, i3);
                lVarMo17a.a(str, image);
                if (image2 != null) {
                    lVarMo17a.a(0, 1, (String) null, new Image[]{image2}, 0);
                    lVarMo17a.a(1, 1, str2, (Image[]) null, 0);
                } else {
                    lVarMo17a.a(0, 1, str2, (Image[]) null, 0);
                }
                lVarMo17a.a(24, 0);
                lVarMo17a.a(5, 1);
                lVarMo17a.b(d.d() - width, d.a());
                f236a[i] = lVarMo17a;
                i++;
            }
        }
        f242c = c.a().mo17a();
        f242c.a(1, 1, 0);
        f242c.a(d.m30a(345), (Image) null);
        f242c.a(0, 1, d.m30a(389), (Image[]) null, 0);
        f242c.a(1, 0);
        f242c.b(d.d(), d.a());
        f241b = c.a().mo17a();
        f241b.a(1, 1, 0);
        f241b.a(d.m30a(345), (Image) null);
        f241b.a(0, 1, d.m30a(344), (Image[]) null, 0);
        f241b.a(1, 0);
        f241b.b(d.d(), d.a());
    }
}
