package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: original-2d.jar:h.class */
public final class h implements Runnable, CommandListener {
    private static String[][] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f224a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[][][] f225a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f226a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String[] f227a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Thread f228a;
    private static boolean b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String[][][] f229a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[][] f230a;
    private boolean c = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f231a;
    private boolean d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private l f232a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private l[] f233a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[] f234b;
    private boolean e;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static final String[] f235b = {"", "createAccount", "login", "reportStats", "getLeaderBoard", "createValidatedAccount", "findAccountByPhoneNumber"};

    public h() {
        f226a = new int[24];
        f227a = new String[15];
        f226a[18] = -7;
        f226a[0] = c.a().mo1a().length;
        f226a[1] = 1;
        f225a = new int[f226a[0]][2][f226a[1]];
        f224a = d.m38b(3) == null;
        if (!f224a) {
            f230a = new int[f226a[0] + 1][4];
            f227a[0] = "";
            f227a[11] = "";
            f227a[3] = "";
            f227a[1] = "";
            f227a[4] = "";
            f227a[12] = "1030";
            f227a[13] = "yes";
            f227a[5] = "0";
            f227a[6] = d.m38b(2);
            f227a[7] = new StringBuffer().append("").append(System.getProperty("microedition-locale")).toString();
            f226a[21] = 0;
            f226a[22] = f226a[0] - 1;
        }
        f231a = new StringBuffer().append("hs").append(f227a[12]).toString();
        b();
    }

    public final int a(int i, int[] iArr, String str) {
        if (i != -1) {
            f226a[13] = i;
            f226a[19] = a(i, iArr);
            return f226a[19];
        }
        int[] iArr2 = f226a;
        iArr2[8] = iArr2[8] + iArr[0];
        a();
        return 0;
    }

    public final boolean a(int i) {
        this.d = i == 1;
        if (f224a) {
            if (f226a[0] == 1 || this.d) {
                f226a[18] = 1;
                return true;
            }
        } else {
            if (this.d && (f227a[3].equals("") || f227a[3] == null)) {
                f226a[18] = 5;
                return true;
            }
            if (this.d) {
                f226a[18] = 12;
                f227a[11] = d.m30a(379);
                f226a[9] = 3;
                this.e = true;
                return true;
            }
        }
        f226a[18] = 0;
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m54a(int i) {
        c.m20b();
        int iB = 0;
        if (this.f233a == null) {
            if (f224a) {
                d();
            } else {
                c();
            }
        }
        if (this.e) {
            f228a = new Thread(this);
            f228a.start();
            this.e = false;
        }
        if (this.f232a != this.f233a[f226a[18]] || this.c) {
            this.f232a = this.f233a[f226a[18]];
            this.c = false;
            if (f224a) {
                if (f226a[18] == 1) {
                    if (this.d || f226a[0] <= 1) {
                        this.f234b[1] = -7;
                    } else {
                        this.f234b[1] = 0;
                    }
                    this.f232a.a(a[f226a[13]][0], (Image) null);
                    String string = "";
                    for (int i2 = 1; i2 <= 1; i2++) {
                        string = new StringBuffer().append(string).append(m56a(f226a[13], 1)).toString();
                    }
                    this.f232a.a(0, 1, string, (Image[]) null, -1);
                    this.f232a.b(d.d(), d.a());
                }
            } else if (f226a[18] == 0 && this.d) {
                this.f234b[0] = -7;
                if (f227a[3].equals("")) {
                    this.f233a[0].a(2);
                } else {
                    this.f233a[0].a(2, 0, new StringBuffer().append(d.m30a(356)).append(" (").append(f227a[1]).append(")").toString(), (Image[]) null, 3);
                }
                this.f233a[0].b(d.d(), d.a());
            } else if (f226a[18] == 0) {
                if (f227a[3].equals("")) {
                    this.f233a[0].a(2);
                } else {
                    this.f233a[0].a(2, 0, new StringBuffer().append(d.m30a(356)).append(" (").append(f227a[1]).append(")").toString(), (Image[]) null, 3);
                }
                this.f233a[0].b(d.d(), d.a());
            } else {
                if (f226a[18] == 14 || f226a[18] == 15) {
                    this.f232a.a(a[f226a[13]][0], (Image) null);
                    this.f232a.a(0, 1, m57a(), (Image[]) null, -1);
                } else if (f226a[18] == 12) {
                    this.f232a.a(0, 1, f227a[11], (Image[]) null, -1);
                } else if (f226a[18] == 16) {
                    this.f232a.a(d.m30a(373), (Image) null);
                    this.f232a.a(0, 1, f227a[11], (Image[]) null, -1);
                } else if (f226a[18] == 13) {
                    this.f233a[13].a(0, 1, d.a(d.m30a(369), new String[]{f227a[1]}), (Image[]) null, -1);
                } else if (f226a[18] == 11) {
                    int iM106a = this.f233a[11].m106a();
                    this.f233a[11].a(0, 0, f227a[1], d.m30a(364), null, 12, -1);
                    this.f233a[11].a(1, 3, "", d.m30a(366), null, 4, -1);
                    this.f232a.b(d.d(), d.a());
                    this.f233a[11].b(iM106a);
                } else if (f226a[18] == 3 || f226a[18] == 4 || f226a[18] == 5 || f226a[18] == 7 || f226a[18] == 9 || f226a[18] == 10) {
                }
                this.f232a.b(d.d(), d.a());
            }
            this.f232a.a();
        } else {
            int[] iArrM105a = this.f232a.m105a(i);
            if (iArrM105a != null) {
                iB = f224a ? b(iArrM105a) : a(iArrM105a);
            }
        }
        return iB;
    }

    public final void a(Graphics graphics) {
        if (this.f232a != null) {
            this.f232a.a(graphics, 0, 0);
        }
    }

    public final void a(int i, int i2) {
        if (this.f232a != null) {
            boolean z = false;
            if (i2 == 0 && d.m28a(i) == 53) {
                if (f226a[18] == 15) {
                    f226a[13] = (f226a[13] + 1) % (f226a[0] + 2);
                    this.c = true;
                    z = true;
                } else if (f226a[18] == 14) {
                    f226a[13] = (f226a[13] + 1) % f226a[0];
                    this.c = true;
                    z = true;
                }
            }
            if (z) {
                return;
            }
            this.f232a.c(i, i2);
        }
    }

    public final void commandAction(Command command, Displayable displayable) {
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int[] m55a(int i, int i2) {
        return i == -1 ? new int[]{f226a[8]} : f225a[i][i2 - 1];
    }

    private int a(int i, int[] iArr) {
        int i2 = 2;
        int[] iArr2 = new int[1];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr2[i3] = iArr[i3];
        }
        if (iArr2[0] <= f225a[i][0][0]) {
            return -1;
        }
        for (int i4 = 0; i4 >= 0; i4--) {
            if (iArr2[0] > f225a[i][0][0]) {
                f225a[i][1] = f225a[i][0];
                i2 = 2 - 1;
                f225a[i][0] = iArr2;
                break;
            }
            if (iArr2[0] <= f225a[i][0][0]) {
                f225a[i][1] = iArr2;
                break;
            }
        }
        a();
        return i2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static String m56a(int i, int i2) {
        String string = new StringBuffer().append(i2).append(". ").toString();
        for (int i3 = 0; i3 < 1; i3++) {
            string = new StringBuffer().append(string).append(c.a().a(f225a[f226a[13]][i2 - 1][0])).toString();
            if (i2 != 0) {
                string = new StringBuffer().append(string).append(" ").toString();
            }
        }
        return string;
    }

    private static void a() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (f224a) {
                for (int i = 0; i < f226a[0]; i++) {
                    for (int i2 = 0; i2 < 1; i2++) {
                        for (int i3 = 0; i3 < f226a[1]; i3++) {
                            dataOutputStream.writeInt(f225a[i][i2][i3]);
                        }
                    }
                }
            } else {
                dataOutputStream.writeInt(f226a[6]);
                dataOutputStream.writeInt(f226a[7]);
                dataOutputStream.writeInt(f226a[8]);
                dataOutputStream.writeUTF(f227a[1]);
                dataOutputStream.writeUTF(f227a[3]);
                for (int i4 = 0; i4 < f226a[0]; i4++) {
                    for (int i5 = 0; i5 < 1; i5++) {
                        for (int i6 = 0; i6 < f226a[1]; i6++) {
                            dataOutputStream.writeInt(f225a[i4][i5][i6]);
                        }
                    }
                }
            }
            d.a(f231a, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            byteArrayOutputStream.close();
        } catch (Exception unused) {
        }
    }

    private static void b() {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(d.a(f231a));
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            if (f224a) {
                for (int i = 0; i < f226a[0]; i++) {
                    for (int i2 = 0; i2 < 1; i2++) {
                        for (int i3 = 0; i3 < f226a[1]; i3++) {
                            f225a[i][i2][i3] = dataInputStream.readInt();
                        }
                    }
                }
            } else {
                f226a[6] = dataInputStream.readInt();
                f226a[7] = dataInputStream.readInt();
                f226a[8] = dataInputStream.readInt();
                f227a[1] = dataInputStream.readUTF();
                f227a[3] = dataInputStream.readUTF();
                for (int i4 = 0; i4 < f226a[0]; i4++) {
                    for (int i5 = 0; i5 < 1; i5++) {
                        for (int i6 = 0; i6 < f226a[1]; i6++) {
                            f225a[i4][i5][i6] = dataInputStream.readInt();
                        }
                    }
                }
            }
            dataInputStream.close();
            byteArrayInputStream.close();
        } catch (Exception unused) {
        }
    }

    private void c() {
        String[][] strArrMo1a = c.a().mo1a();
        a = new String[f226a[0] + 2][1];
        for (int i = f226a[0] - 1; i >= 0; i--) {
            a[i] = strArrMo1a[i];
        }
        a[f226a[0]] = new String[]{d.m30a(385), d.m30a(384)};
        a[f226a[0] + 1] = new String[]{d.m30a(376), ""};
        this.f233a = new l[17];
        this.f234b = new int[17];
        for (int i2 = 16; i2 >= 0; i2--) {
            this.f233a[i2] = c.a().mo17a();
        }
        this.f233a[0].a(0, 4, 0);
        this.f233a[0].a(d.m30a(353), (Image) null);
        if (f226a[0] > 1) {
            this.f233a[0].a(0, 0, d.m30a(354), (Image[]) null, 1);
        } else {
            this.f233a[0].a(0, 0, d.m30a(354), (Image[]) null, 14);
        }
        this.f233a[0].a(1, 0, d.m30a(355), (Image[]) null, 5);
        this.f233a[0].a(3, 0, d.m30a(358), (Image[]) null, 4);
        this.f233a[0].a(0, 0);
        this.f233a[0].a(5, 1);
        this.f234b[0] = -7;
        if (f226a[0] > 1) {
            this.f233a[1].a(0, f226a[0], 0);
            this.f233a[1].a(d.m30a(354), (Image) null);
            for (int i3 = 0; i3 < f226a[0]; i3++) {
                this.f233a[1].a(i3, 0, a[i3][0], (Image[]) null, i3);
            }
            this.f233a[1].a(0, 0);
            this.f233a[1].a(5, 1);
            this.f234b[1] = 0;
        }
        this.f233a[2].a(0, f226a[0] + 2, 0);
        this.f233a[2].a(d.m30a(353), (Image) null);
        for (int i4 = 0; i4 < f226a[0] + 2; i4++) {
            this.f233a[2].a(i4, 0, a[i4][0], (Image[]) null, i4);
        }
        this.f233a[2].a(0, 0);
        this.f233a[2].a(5, 1);
        this.f234b[2] = 0;
        this.f233a[3].a(1, 1, 0);
        this.f233a[3].a(d.m30a(356), (Image) null);
        this.f233a[3].a(0, 1, d.m30a(357), (Image[]) null, -1);
        this.f233a[3].a(2, 0);
        this.f233a[3].a(7, 1);
        this.f234b[3] = 0;
        this.f233a[4].a(1, 1, 0);
        this.f233a[4].a(d.m30a(358), (Image) null);
        this.f233a[4].a(0, 1, d.m30a(359), (Image[]) null, -1);
        this.f233a[4].a(5, 1);
        this.f234b[4] = 0;
        this.f233a[5].a(1, 1, 0);
        this.f233a[5].a(d.m30a(360), (Image) null);
        this.f233a[5].a(0, 1, d.m30a(361), (Image[]) null, -1);
        this.f233a[5].a(1, 0);
        this.f233a[5].a(5, 1);
        this.f234b[5] = 0;
        this.f233a[6].a(0, 2, 0);
        this.f233a[6].a(d.m30a(353), (Image) null);
        this.f233a[6].a(0, 0, d.m30a(363), (Image[]) null, 7);
        this.f233a[6].a(1, 0, d.m30a(370), (Image[]) null, 10);
        this.f233a[6].a(0, 0);
        this.f233a[6].a(5, 1);
        this.f234b[6] = 0;
        this.f233a[7].a(1, 1, 0);
        this.f233a[7].a(d.m30a(363), (Image) null);
        this.f233a[7].a(0, 1, d.m30a(362), (Image[]) null, -1);
        this.f233a[7].a(1, 0);
        this.f233a[7].a(5, 1);
        this.f234b[7] = 8;
        this.f233a[8].a(0, 3, 0);
        this.f233a[8].a(d.m30a(363), (Image) null);
        this.f233a[8].a(0, 0, "", d.m30a(364), null, 12, -1);
        String strM38b = d.m38b(8);
        String str = strM38b;
        if (strM38b == null || str.equals("")) {
            str = "";
        }
        this.f233a[8].a(1, 2, str, d.m30a(365), null, 20, -1);
        this.f233a[8].a(2, 0, d.m30a(363), (Image[]) null, 9);
        this.f233a[8].a(1, 0);
        this.f233a[8].a(5, 1);
        this.f234b[8] = 6;
        this.f233a[9].a(1, 1, 0);
        this.f233a[9].a(d.m30a(375), (Image) null);
        this.f233a[9].a(0, 1, d.m30a(367), (Image[]) null, -1);
        this.f233a[9].a(11, 1);
        this.f234b[9] = 13;
        this.f233a[10].a(1, 1, 0);
        this.f233a[10].a(d.m30a(370), (Image) null);
        this.f233a[10].a(0, 1, d.m30a(371), (Image[]) null, -1);
        this.f233a[10].a(1, 0);
        this.f233a[10].a(5, 1);
        this.f234b[10] = 11;
        this.f233a[11].a(0, 3, 0);
        this.f233a[11].a(d.m30a(370), (Image) null);
        this.f233a[11].a(0, 0, "", d.m30a(364), null, 12, -1);
        this.f233a[11].a(1, 3, "", d.m30a(366), null, 4, -1);
        this.f233a[11].a(2, 0, d.m30a(370), (Image[]) null, 12);
        this.f233a[11].a(1, 0);
        this.f233a[11].a(5, 1);
        this.f234b[11] = 6;
        this.f233a[12].a(1, 1, 0);
        this.f233a[12].a(d.m30a(375), (Image) null);
        this.f233a[12].a(0, 1, d.m30a(372), (Image[]) null, -1);
        this.f233a[12].a(11, 1);
        this.f234b[12] = 2;
        this.f233a[13].a(1, 1, 0);
        this.f233a[13].a(d.m30a(368), (Image) null);
        this.f233a[13].a(1, 0);
        this.f234b[13] = 0;
        this.f233a[14].a(1, 1, 0);
        if (f226a[0] > 1) {
            this.f233a[14].a(12, 0);
        }
        this.f233a[14].a(5, 1);
        if (f226a[0] > 1) {
            this.f234b[14] = 1;
        } else {
            this.f234b[14] = 0;
        }
        this.f233a[15].a(1, 1, 0);
        this.f233a[15].a(12, 0);
        this.f233a[15].a(5, 1);
        this.f234b[15] = 2;
        this.f233a[16].a(1, 1, 0);
        this.f233a[16].a(5, 1);
        this.f234b[16] = 0;
        for (int i5 = 16; i5 >= 0; i5--) {
            if (i5 != 1 || f226a[0] > 1) {
                this.f233a[i5].b(d.d(), d.a());
            }
        }
    }

    private int a(int[] iArr) {
        int i = 0;
        if (iArr[0] == 0) {
            if (iArr[1] == 1) {
                if (f226a[18] == 5) {
                    f226a[18] = 6;
                } else if (f226a[18] == 10 || f226a[18] == 7 || f226a[18] == 13) {
                    f226a[18] = this.f234b[f226a[18]];
                    if (f226a[18] == 12) {
                        f227a[11] = d.m30a(379);
                        f226a[9] = 2;
                        this.e = true;
                    }
                }
            } else if (iArr[1] == 5) {
                if (f226a[18] == 10 || f226a[18] == 7) {
                    f226a[18] = 6;
                } else {
                    f226a[18] = this.f234b[f226a[18]];
                    if (f226a[18] == -7) {
                        i = 1;
                        this.f232a = null;
                        this.f233a = null;
                    }
                }
            } else if (iArr[1] == 2) {
                if (f226a[18] == 3) {
                    f226a[18] = 0;
                    f227a[3] = "";
                    f226a[6] = 0;
                    a();
                }
            } else if (iArr[1] == 7) {
                if (f226a[18] == 3) {
                    f226a[18] = 0;
                }
            } else if (iArr[1] == 11) {
                if (f226a[18] == 12 || f226a[18] == 9) {
                    b = true;
                    f226a[18] = 0;
                }
            } else if (iArr[1] == 12) {
                if (f226a[18] == 15) {
                    f226a[13] = (f226a[13] + 1) % (f226a[0] + 2);
                    this.c = true;
                } else if (f226a[18] == 14) {
                    f226a[13] = (f226a[13] + 1) % f226a[0];
                    this.c = true;
                }
            }
        } else if (iArr[0] == 1) {
            if (f226a[18] == 11) {
                if (iArr[1] == 12) {
                    f227a[1] = this.f233a[11].m108a(0);
                    f227a[4] = this.f233a[11].m108a(1);
                    f226a[18] = 12;
                    f227a[11] = d.m30a(379);
                    f226a[9] = 2;
                    this.e = true;
                }
            } else if (f226a[18] == 8) {
                if (iArr[1] == 9) {
                    f227a[1] = this.f233a[8].m108a(0);
                    f227a[2] = this.f233a[8].m108a(1);
                    f226a[18] = 9;
                    f227a[11] = d.m30a(379);
                    f226a[9] = 1;
                    this.e = true;
                }
            } else if (f226a[18] == 0) {
                f226a[13] = 0;
                if (iArr[1] != 5 || f227a[3].equals("")) {
                    f226a[18] = iArr[1];
                } else {
                    f226a[18] = 12;
                    f227a[11] = d.m30a(379);
                    f226a[9] = 3;
                    this.e = true;
                }
            } else if (f226a[18] == 1) {
                f226a[13] = iArr[1];
                f226a[18] = 14;
            } else if (f226a[18] == 2) {
                f226a[13] = iArr[1];
                f226a[18] = 15;
            } else if (f226a[18] == 6) {
                f226a[18] = iArr[1];
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static String m57a() {
        StringBuffer stringBuffer = new StringBuffer("");
        if (f226a[18] == 14) {
            for (int i = 0; i < 1; i++) {
                for (int i2 = 0; i2 < f226a[1]; i2++) {
                    stringBuffer.append(" ");
                    stringBuffer.append(c.a().a(f225a[f226a[13]][0][i2]));
                    if (i2 < f226a[1] - 1) {
                        stringBuffer.append(" ");
                    }
                }
                stringBuffer.append("\\n");
            }
            stringBuffer.append("\\n");
            stringBuffer.append(d.m30a(377));
            stringBuffer.append(": ");
            stringBuffer.append(f226a[8]);
        } else if (f226a[13] < f226a[0]) {
            for (int i3 = 0; i3 < f230a[f226a[13]][0]; i3++) {
                stringBuffer.append(f229a[f226a[13]][i3][0]);
                stringBuffer.append(". ");
                stringBuffer.append(f229a[f226a[13]][i3][1]);
                stringBuffer.append(": ");
                for (int i4 = 2; i4 < f230a[f226a[13]][1]; i4++) {
                    try {
                        stringBuffer.append(c.a().a(Integer.parseInt(f229a[f226a[13]][i3][i4])));
                    } catch (NumberFormatException unused) {
                        stringBuffer.append(f229a[f226a[13]][i3][i4]);
                    }
                }
                stringBuffer.append("\\n");
            }
            stringBuffer.append("\\n");
            stringBuffer.append(d.a(d.m30a(378), new String[]{new StringBuffer().append("").append(f230a[f226a[13]][2]).toString(), new StringBuffer().append("").append(f230a[f226a[13]][3]).toString()}));
            stringBuffer.append("\\n\\n");
            stringBuffer.append(f227a[0]);
        } else if (f226a[13] == f226a[0]) {
            for (int i5 = 0; i5 < f230a[f226a[13]][0]; i5++) {
                stringBuffer.append(f229a[f226a[13]][i5][0]);
                stringBuffer.append(". ");
                stringBuffer.append(f229a[f226a[13]][i5][1]);
                stringBuffer.append(": ");
                for (int i6 = 2; i6 < f230a[f226a[13]][1]; i6++) {
                    stringBuffer.append(f229a[f226a[13]][i5][i6]);
                }
                stringBuffer.append("\\n");
            }
            stringBuffer.append("\\n");
            stringBuffer.append(d.a(d.m30a(378), new String[]{new StringBuffer().append("").append(f230a[f226a[13]][2]).toString(), new StringBuffer().append("").append(f230a[f226a[13]][3]).toString()}));
            stringBuffer.append("\\n\\n");
            stringBuffer.append(f227a[0]);
        } else {
            stringBuffer.append(d.m30a(387));
            stringBuffer.append(": ");
            stringBuffer.append(f227a[1]);
            stringBuffer.append("\\n\\n");
            stringBuffer.append(d.m30a(210));
            stringBuffer.append(" ");
            stringBuffer.append(d.m30a(384));
            stringBuffer.append(": ");
            stringBuffer.append(f226a[5]);
            stringBuffer.append("\\n");
            stringBuffer.append(d.m30a(386));
            stringBuffer.append(": ");
            stringBuffer.append(f226a[4]);
            stringBuffer.append("\\n\\n");
            stringBuffer.append(f227a[0]);
        }
        return stringBuffer.toString();
    }

    private void d() {
        a = c.a().mo1a();
        this.f233a = new l[17];
        this.f234b = new int[17];
        if (f226a[0] != 1) {
            this.f233a[0] = c.a().mo17a();
            this.f234b[0] = -7;
            this.f233a[0].a(0, f226a[0], 0);
            this.f233a[0].a(d.m30a(380), (Image) null);
            for (int i = 0; i < f226a[0]; i++) {
                this.f233a[0].a(i, 0, a[i][0], (Image[]) null, i);
            }
            this.f233a[0].a(0, 0);
            this.f233a[0].a(5, 1);
            this.f233a[0].b(d.d(), d.a());
        }
        this.f233a[1] = c.a().mo17a();
        this.f233a[1].a(1, 1, 0);
        this.f233a[1].a(5, 1);
    }

    private int b(int[] iArr) {
        int i = 0;
        if (iArr[0] == 0) {
            if (iArr[1] == 5) {
                f226a[18] = this.f234b[f226a[18]];
                if (f226a[18] == -7) {
                    i = 1;
                    this.f232a = null;
                    this.f233a = null;
                }
            }
        } else if (iArr[0] == 1 && f226a[18] == 0) {
            f226a[13] = iArr[1];
            f226a[18] = 1;
        }
        return i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpConnection httpConnection = null;
        DataInputStream dataInputStreamOpenDataInputStream = null;
        f227a[10] = null;
        b = false;
        while (f226a[9] != 0) {
            try {
                HttpConnection httpConnectionOpen = Connector.open(new StringBuffer().append(d.m38b(4)).append("services/hybrid/").append(f235b[f226a[9]]).toString());
                httpConnection = httpConnectionOpen;
                httpConnectionOpen.setRequestMethod("POST");
                httpConnection.setRequestProperty("Content-Type", "application/octet-stream");
                httpConnection.setRequestProperty("Accept-Language", d.m30a(388));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeUTF(f227a[12]);
                dataOutputStream.writeUTF(f227a[6]);
                dataOutputStream.writeUTF(c.a().getAppProperty("MIDlet-Version"));
                switch (f226a[9]) {
                    case 1:
                    case 5:
                        dataOutputStream.writeUTF(f227a[1]);
                        dataOutputStream.writeUTF(f227a[2]);
                        dataOutputStream.writeUTF(d.m30a(388));
                        dataOutputStream.writeUTF(f227a[7]);
                        dataOutputStream.writeUTF(f227a[5]);
                        dataOutputStream.writeUTF(f227a[13]);
                        break;
                    case 2:
                        dataOutputStream.writeUTF(f227a[1]);
                        dataOutputStream.writeUTF(f227a[4]);
                        dataOutputStream.writeUTF(f227a[5]);
                        break;
                    case 3:
                        dataOutputStream.writeUTF(f227a[3]);
                        dataOutputStream.writeInt(f226a[6]);
                        dataOutputStream.writeInt(f226a[7]);
                        dataOutputStream.writeInt(f226a[8]);
                        dataOutputStream.writeUTF(m58b());
                        break;
                    case 4:
                        dataOutputStream.writeUTF(f227a[3]);
                        dataOutputStream.writeInt(5);
                        dataOutputStream.writeInt(3);
                        dataOutputStream.writeInt(f226a[21]);
                        dataOutputStream.writeInt(f226a[22]);
                        break;
                }
                try {
                    dataOutputStream.close();
                } catch (IOException unused) {
                }
                httpConnection.setRequestProperty("Content-Length", new StringBuffer().append("").append(byteArrayOutputStream.toByteArray().length).toString());
                DataOutputStream dataOutputStreamOpenDataOutputStream = httpConnection.openDataOutputStream();
                dataOutputStreamOpenDataOutputStream.write(byteArrayOutputStream.toByteArray());
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                }
                try {
                    dataOutputStreamOpenDataOutputStream.close();
                } catch (IOException unused3) {
                }
                dataInputStreamOpenDataInputStream = httpConnection.openDataInputStream();
                synchronized (this) {
                    try {
                        if (b) {
                            f226a[9] = 0;
                        } else {
                            f226a[12] = dataInputStreamOpenDataInputStream.readInt();
                            if (f226a[12] == 0) {
                                switch (f226a[9]) {
                                    case 1:
                                        a();
                                        f226a[15] = 0;
                                        f226a[18] = 13;
                                        f226a[9] = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case 6:
                                        f226a[6] = 1;
                                        f227a[3] = dataInputStreamOpenDataInputStream.readUTF();
                                        a();
                                        StringBuffer stringBuffer = new StringBuffer();
                                        String[] strArr = f227a;
                                        strArr[11] = stringBuffer.append(strArr[11]).append(" ").append(d.m30a(381)).toString();
                                        f226a[9] = 3;
                                        break;
                                    case 3:
                                        f226a[7] = 0;
                                        f226a[8] = 0;
                                        int[] iArr = f226a;
                                        iArr[6] = iArr[6] + 1;
                                        a();
                                        StringBuffer stringBuffer2 = new StringBuffer();
                                        String[] strArr2 = f227a;
                                        strArr2[11] = stringBuffer2.append(strArr2[11]).append(" ").append(d.m30a(382)).toString();
                                        f226a[9] = 4;
                                        break;
                                    case 4:
                                        f227a[0] = dataInputStreamOpenDataInputStream.readUTF();
                                        f226a[5] = dataInputStreamOpenDataInputStream.readInt();
                                        f226a[4] = dataInputStreamOpenDataInputStream.readInt();
                                        f226a[2] = dataInputStreamOpenDataInputStream.readInt();
                                        f226a[3] = dataInputStreamOpenDataInputStream.readInt();
                                        int i = 0;
                                        f229a = new String[f226a[0] + 1][8][f226a[1] + 2];
                                        while (dataInputStreamOpenDataInputStream.readBoolean()) {
                                            f230a[i][0] = dataInputStreamOpenDataInputStream.readInt();
                                            f230a[i][1] = dataInputStreamOpenDataInputStream.readInt();
                                            f230a[i][3] = dataInputStreamOpenDataInputStream.readInt();
                                            f230a[i][2] = dataInputStreamOpenDataInputStream.readInt();
                                            for (int i2 = 0; i2 < f230a[i][0]; i2++) {
                                                for (int i3 = 0; i3 < f230a[i][1]; i3++) {
                                                    f229a[i][i2][i3] = dataInputStreamOpenDataInputStream.readUTF();
                                                }
                                            }
                                            i++;
                                        }
                                        a();
                                        StringBuffer stringBuffer3 = new StringBuffer();
                                        String[] strArr3 = f227a;
                                        strArr3[11] = stringBuffer3.append(strArr3[11]).append(" ").append(d.m30a(383)).toString();
                                        f226a[18] = 2;
                                    default:
                                        f226a[9] = 0;
                                        break;
                                }
                            } else {
                                f227a[10] = dataInputStreamOpenDataInputStream.readUTF();
                                f226a[18] = 16;
                                f227a[11] = f227a[10];
                                if (f227a[11] == null) {
                                    f227a[11] = d.m30a(374);
                                }
                                f226a[9] = 0;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception unused4) {
                synchronized (this) {
                    if (!b && (f226a[12] == 100 || f226a[12] == 200)) {
                        f227a[3] = "";
                        f227a[4] = "";
                        a();
                    }
                    f226a[18] = 16;
                    f227a[11] = f227a[10];
                    if (f227a[11] == null) {
                        f227a[11] = d.m30a(374);
                    }
                    f226a[9] = 0;
                }
            }
            try {
                dataInputStreamOpenDataInputStream.close();
            } catch (Exception unused5) {
            }
            dataInputStreamOpenDataInputStream = null;
            try {
                httpConnection.close();
            } catch (Exception unused6) {
            }
            this.c = true;
        }
        f228a = null;
        System.gc();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static String m58b() {
        StringBuffer stringBuffer = new StringBuffer("{");
        for (int i = 0; i < f226a[0]; i++) {
            if (i > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append(new StringBuffer().append("\"T-").append(i).append("\":{\"key\":\"T-").append(i).append("-C-0\",\"order\":\"d\",\"table\":[").toString());
            for (int i2 = 0; i2 < f226a[1]; i2++) {
                if (i2 > 0) {
                    stringBuffer.append(",");
                }
                stringBuffer.append(new StringBuffer().append("{\"T-").append(i).append("-C-").append(i2).append("\":[").append(f225a[i][0][i2]).append("]}").toString());
            }
            stringBuffer.append("]}");
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
