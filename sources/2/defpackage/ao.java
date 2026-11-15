package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:ao.class */
public final class ao {
    private static String[][] d;
    static int[][][] e;
    static int[] at;
    private boolean ah;
    e f;
    private e[] c;
    private int[] au;

    public ao() {
        at = new int[5];
        at[0] = bd.f61b.a().length;
        at[1] = 1;
        e = new int[at[0]][6][at[1]];
        K();
    }

    public final boolean j(int i) {
        this.ah = i == 1;
        if (at[0] == 1 || this.ah) {
            at[3] = 1;
        } else {
            at[3] = 0;
        }
        return (i == 2 || i == 1) ? false : true;
    }

    public final int g(int i) {
        bd.aI = true;
        int i2 = 0;
        if (this.c == null) {
            L();
        }
        if (this.f != this.c[at[3]]) {
            this.f = this.c[at[3]];
            if (at[3] == 1) {
                if (this.ah || at[0] <= 1) {
                    this.au[1] = -7;
                } else {
                    this.au[1] = 0;
                }
                this.f.a(d[at[2]][0], (Image) null, 1);
                String string = "";
                for (int i3 = 1; i3 <= 5; i3++) {
                    string = new StringBuffer().append(string).append(a(at[2], i3)).toString();
                    if (i3 < 5) {
                        string = new StringBuffer().append(string).append("\\n").toString();
                    }
                }
                this.f.a(0, 1, string, (Image[]) null, -1);
                this.f.a(ba.E(), ba.H(), false);
            }
            this.f.d();
        } else {
            int[] iArrA = this.f.a(i);
            if (iArrA != null) {
                i2 = 0;
                if (iArrA[0] == 0) {
                    if (iArrA[1] == 5) {
                        at[3] = this.au[at[3]];
                        if (at[3] == -7) {
                            i2 = 1;
                            this.f = null;
                            this.c = null;
                        }
                    }
                } else if (iArrA[0] == 1 && at[3] == 0) {
                    at[2] = iArrA[1];
                    at[3] = 1;
                }
            }
        }
        return i2;
    }

    private static String a(int i, int i2) {
        String string = new StringBuffer().append(i2).append(". ").toString();
        for (int i3 = 0; i3 < 1; i3++) {
            string = new StringBuffer().append(string).append(bd.f61b.a(e[at[2]][i2 - 1][0])).toString();
            if (i2 != 0) {
                string = new StringBuffer().append(string).append(" ").toString();
            }
        }
        return string;
    }

    static void J() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            for (int i = 0; i < at[0]; i++) {
                for (int i2 = 0; i2 < 5; i2++) {
                    for (int i3 = 0; i3 < at[1]; i3++) {
                        dataOutputStream.writeInt(e[i][i2][i3]);
                    }
                }
            }
            ba.a("hs", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            byteArrayOutputStream.close();
        } catch (Exception unused) {
        }
    }

    private static void K() {
        try {
            byte[] bArrM24a = ba.m24a("hs");
            if (bArrM24a != null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM24a);
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                for (int i = 0; i < at[0]; i++) {
                    for (int i2 = 0; i2 < 5; i2++) {
                        for (int i3 = 0; i3 < at[1]; i3++) {
                            e[i][i2][i3] = dataInputStream.readInt();
                        }
                    }
                }
                dataInputStream.close();
                byteArrayInputStream.close();
            }
        } catch (Exception unused) {
        }
    }

    public final void L() {
        d = bd.f61b.a();
        this.c = new e[2];
        this.au = new int[2];
        if (at[0] != 1) {
            this.c[0] = new e();
            this.au[0] = -7;
            this.c[0].b(0, at[0], 0);
            this.c[0].a(ba.c(41), (Image) null, 1);
            for (int i = 0; i < at[0]; i++) {
                this.c[0].a(i, 0, d[i][0], (Image[]) null, i);
            }
            this.c[0].f79v[0] = 0;
            this.c[0].f79v[1] = 5;
            this.c[0].a(ba.E(), ba.H(), false);
        }
        this.c[1] = new e();
        this.c[1].b(1, 1, 0);
        this.c[1].f79v[1] = 5;
    }
}
