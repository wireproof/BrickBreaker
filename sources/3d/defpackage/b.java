package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-3d.jar:b.class */
public final class b {
    static String[][] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static int[][][] f14a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    static int[] f15a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    f f16a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    f[] f17a;
    int[] b;

    public b() {
        f15a = new int[5];
        f15a[0] = s.b.b().length;
        f15a[1] = 1;
        f14a = new int[f15a[0]][2][f15a[1]];
        c();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007b A[PHI: r7
      0x007b: PHI (r7v5 int) = (r7v3 int), (r7v6 int) binds: [B:12:0x0052, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0099 A[LOOP:1: B:9:0x0040->B:19:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x008b A[SYNTHETIC] */
    public static int a(int i, int[] iArr, String str) {
        int i2;
        f15a[2] = i;
        int[] iArr2 = f15a;
        int i3 = 2;
        int[] iArr3 = new int[1];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr3[i4] = iArr[i4];
        }
        if (iArr3[0] > f14a[i][0][0]) {
            for (int i5 = 0; i5 >= 0; i5--) {
                if (iArr3[0] > f14a[i][i5][0]) {
                    f14a[i][i5 + 1] = f14a[i][i5];
                    i3--;
                    if (i5 == 0) {
                        f14a[i][i5] = iArr3;
                        break;
                    }
                    if (iArr3[0] <= f14a[i][i5][0]) {
                        f14a[i][i5 + 1] = iArr3;
                        break;
                    }
                } else {
                    if (iArr3[0] <= f14a[i][i5][0]) {
                        f14a[i][i5 + 1] = iArr3;
                        break;
                    }
                }
            }
            b();
            i2 = i3;
        } else {
            i2 = -1;
        }
        iArr2[4] = i2;
        return f15a[4];
    }

    static String a(int i, int i2) {
        String string = new StringBuffer().append(1).append(". ").toString();
        for (int i3 = 0; i3 < 1; i3++) {
            string = new StringBuffer().append(new StringBuffer().append(string).append(s.b.e(f14a[f15a[2]][0][0])).toString()).append(" ").toString();
        }
        return string;
    }

    static void b() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            for (int i = 0; i < f15a[0]; i++) {
                for (int i2 = 0; i2 < 1; i2++) {
                    for (int i3 = 0; i3 < f15a[1]; i3++) {
                        dataOutputStream.writeInt(f14a[i][i2][i3]);
                    }
                }
            }
            p.a("hs", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            byteArrayOutputStream.close();
        } catch (Exception unused) {
        }
    }

    private static void c() {
        try {
            byte[] bArrM34a = p.m34a("hs");
            if (bArrM34a != null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM34a);
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                for (int i = 0; i < f15a[0]; i++) {
                    for (int i2 = 0; i2 < 1; i2++) {
                        for (int i3 = 0; i3 < f15a[1]; i3++) {
                            f14a[i][i2][i3] = dataInputStream.readInt();
                        }
                    }
                }
                dataInputStream.close();
                byteArrayInputStream.close();
            }
        } catch (Exception unused) {
        }
    }

    public final void a() {
        a = s.b.b();
        this.f17a = new f[2];
        this.b = new int[2];
        if (f15a[0] != 1) {
            this.f17a[0] = new f();
            this.b[0] = -7;
            this.f17a[0].a(0, f15a[0], 0);
            this.f17a[0].a(p.c(529), null);
            for (int i = 0; i < f15a[0]; i++) {
                this.f17a[0].a(i, 0, a[i][0], (Image[]) null, i);
            }
            this.f17a[0].f38m[0] = 0;
            this.f17a[0].f38m[1] = 5;
            this.f17a[0].a(p.i(), p.m(), false);
        }
        this.f17a[1] = new f();
        this.f17a[1].a(1, 1, 0);
        this.f17a[1].f38m[1] = 5;
    }
}
