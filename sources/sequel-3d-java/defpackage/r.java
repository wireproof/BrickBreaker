package defpackage;

import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

/* JADX INFO: loaded from: sequel-3d-java.jar:r.class */
public final class r {
    private static final int[] a = {65561, 131072, 65562, 131072, 65565, 131073, 65566, 131073, 65563, 131074, 65564, 131075};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static g[] f262a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static i[] f263a;
    private static int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static float f264a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static final int[] f265b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int f266a;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static float f267b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static int[] f268c;

    public static void a() {
        f262a = new g[6];
        f263a = new i[6];
        for (int i2 = 0; i2 < 6; i2++) {
            f262a[i2] = new g(a[i2 << 1]);
            f262a[i2].a(g.m37a(196677));
            f263a[i2] = new i();
            i iVar = f263a[i2];
            int i3 = a[(i2 << 1) + 1];
            iVar.a = null;
            try {
                DataInputStream dataInputStreamM93a = t.m93a(i3);
                short sA = i.a(dataInputStreamM93a);
                iVar.a = new float[sA * 10];
                new StringBuffer().append("rid ").append(i3).append(" anim len: ").append((int) sA).toString();
                for (int i4 = 0; i4 < sA; i4++) {
                    for (int i5 = 0; i5 < 3; i5++) {
                        iVar.a[(i4 * 10) + i5] = i.a(dataInputStreamM93a) / 10.0f;
                    }
                    for (int i6 = 3; i6 < 7; i6++) {
                        iVar.a[(i4 * 10) + i6] = i.a(dataInputStreamM93a) / 32000.0f;
                    }
                    for (int i7 = 7; i7 < 10; i7++) {
                        iVar.a[(i4 * 10) + i7] = i.a(dataInputStreamM93a) / 32000.0f;
                    }
                }
                dataInputStreamM93a.close();
            } catch (Throwable unused) {
            }
            iVar.a();
        }
        b(0);
    }

    public static void b() {
        f262a = null;
        f263a = null;
    }

    public static void a(Graphics graphics) {
        m.a(30.0f, -89.0f, -451.0f, -81.0f, -66.0f, 137.0f, 0.0f, -1.0f, 0.0f);
        for (int i2 = 0; i2 < 6; i2++) {
            f262a[i2].e();
            i iVar = f263a[i2];
            int i3 = h;
            int i4 = i;
            float f2 = f267b;
            float[] fArr = iVar.a;
            float f3 = 1.0f - f2;
            int i5 = i3 * 10;
            int i6 = i4 * 10;
            iVar.e = (f3 * fArr[i5]) + (f2 * fArr[i6]);
            iVar.f = (f3 * fArr[i5 + 1]) + (f2 * fArr[i6 + 1]);
            iVar.g = (f3 * fArr[i5 + 2]) + (f2 * fArr[i6 + 2]);
            float f4 = fArr[i5 + 3];
            float f5 = fArr[i5 + 4];
            float f6 = fArr[i5 + 5];
            float f7 = fArr[i5 + 6];
            float f8 = fArr[i6 + 3];
            float f9 = fArr[i6 + 4];
            float f10 = fArr[i6 + 5];
            float f11 = fArr[i6 + 6];
            if ((f5 * f9) + (f6 * f10) + (f7 * f11) + (f4 * f8) < 0.0f) {
                f2 = -f2;
            }
            iVar.d = (f3 * f4) + (f2 * f8);
            iVar.f94a = (f3 * f5) + (f2 * f9);
            iVar.b = (f3 * f6) + (f2 * f10);
            iVar.c = (f3 * f7) + (f2 * f11);
            float f12 = iVar.d;
            float f13 = iVar.f94a;
            float f14 = iVar.b;
            float f15 = iVar.c;
            float f16 = f14;
            float f17 = f13;
            float f18 = f12;
            if (Math.abs(f12) < 1.0E-4f) {
                f18 = 0.0f;
            }
            if (Math.abs(f17) < 1.0E-4f) {
                f17 = 0.0f;
            }
            if (Math.abs(f16) < 1.0E-4f) {
                f16 = 0.0f;
            }
            if (Math.abs(f15) < 1.0E-4f) {
                f15 = 0.0f;
            }
            float fSqrt = 1.0f / ((float) Math.sqrt((((f18 * f18) + (f17 * f17)) + (f16 * f16)) + (f15 * f15)));
            iVar.d *= fSqrt;
            iVar.f94a *= fSqrt;
            iVar.b *= fSqrt;
            iVar.c *= fSqrt;
            iVar.h = (f3 * fArr[i5 + 7]) + (f2 * fArr[i6 + 7]);
            iVar.i = (f3 * fArr[i5 + 8]) + (f2 * fArr[i6 + 8]);
            iVar.j = (f3 * fArr[i5 + 9]) + (f2 * fArr[i6 + 9]);
            f262a[i2].b(0.5f, 1.0f, 0.0f, 0.0f);
            i iVar2 = f263a[i2];
            g gVar = f262a[i2];
            gVar.a(iVar2.e, iVar2.g, iVar2.f);
            gVar.a(iVar2.f94a, iVar2.c, -iVar2.b, iVar2.d);
            gVar.b(10.0f * iVar2.h, 10.0f * iVar2.j, 10.0f * iVar2.i);
            graphics.setColor(-1);
            f262a[i2].f();
        }
    }

    public static void a(int i2) {
        f264a += 0.001f * i2;
        if (d == e) {
            h = d;
            i = e;
            f267b = 0.0f;
            return;
        }
        float f2 = (15.0f * f264a) + d;
        int i3 = (int) f2;
        h = i3;
        i = i3 + 1;
        f267b = f2 - h;
        if (h < e) {
            if (i >= e) {
                i = f;
                return;
            }
            return;
        }
        d = f;
        e = g;
        switch (f266a) {
            case 0:
                int i4 = z.m136e() % 3 < 1 ? 2 : 4;
                f = f265b[i4];
                g = f265b[i4 + 1];
                break;
            case 2:
                int i5 = z.m136e() % 5 < 1 ? 10 : 8;
                f = f265b[i5];
                g = f265b[i5 + 1];
                break;
            case 4:
                f = f265b[6];
                g = f265b[7];
                break;
            case 5:
                if (b == 1) {
                    f = f265b[12];
                    g = f265b[13];
                } else if (b > 1) {
                    f = f265b[16];
                    g = f265b[17];
                }
                break;
        }
        b++;
        f264a = 0.0f;
        if (c != f266a) {
            f266a = c;
            b = 0;
        }
    }

    public static void b(int i2) {
        f266a = i2;
        c = i2;
        b = 0;
        switch (i2) {
            case 0:
                d = f265b[2];
                e = f265b[3];
                f = f265b[4];
                g = f265b[5];
                break;
            case 1:
                d = f265b[0];
                e = f265b[1];
                f = f265b[0];
                g = f265b[1];
                break;
            case 2:
                d = f265b[8];
                e = f265b[9];
                f = f265b[10];
                g = f265b[11];
                break;
            case 3:
                d = f265b[6];
                e = f265b[7];
                f = f265b[6];
                g = f265b[7];
                break;
            case 4:
                d = f265b[6];
                e = f265b[7];
                f = f265b[14];
                g = f265b[15];
                break;
            case 5:
                d = f265b[0];
                e = f265b[1];
                f = f265b[0];
                g = f265b[1];
                break;
        }
        f264a = 0.0f;
    }

    public static void a(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (length != 0) {
            int i4 = 0;
            while (true) {
                char cCharAt = str.charAt(i2);
                i2++;
                if (i2 >= length) {
                    break;
                } else if (!((cCharAt == ' ' || cCharAt == '.' || cCharAt == '!' || cCharAt == '?' || cCharAt == ';' || cCharAt == ':' || cCharAt == '>' || cCharAt == '/') ? false : true)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 > 0) {
                int i5 = i2 - i4;
                if (i4 > 2) {
                    for (int i6 = 0; i6 < i4; i6 += 5) {
                        if (i3 < f268c.length - 1) {
                            int i7 = i3;
                            int i8 = i3 + 1;
                            f268c[i7] = (i5 + i6) * 40;
                            i3 = i8 + 1;
                            f268c[i8] = ((i5 + i6) * 40) + 80;
                        }
                    }
                }
            }
            if (i2 >= length) {
                return;
            }
        }
    }

    static {
        new int[1][][0] = new int[]{128, 0};
        new int[1][][0] = new int[]{128, 256};
        f264a = 0.0f;
        f265b = new int[]{0, 56, 56, 130, 130, 145, 150, 172, 172, 188, 188, 225, 230, 339, 345, 404, 410, 439};
        f268c = new int[40];
    }
}
