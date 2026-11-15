package defpackage;

import com.nokia.mid.ui.FullCanvas;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordStore;

/* JADX INFO: loaded from: bbr-3d.jar:p.class */
public final class p extends FullCanvas implements PlayerListener {
    private static s a;
    private static boolean R;
    private static int cv;
    private static String e;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static Image f135e;
    private static int cw;
    private static int cx;
    private static String f;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static Image f136f;
    private static int cy;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Hashtable f137a;
    private static Font b;
    private static boolean S;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static p f138a;
    private static int[] aq;
    private static int cz;
    private static l h;
    private static int cA;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static final String[] f139e = {"audio/midi", "audio/wav", "audio/amr", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Hashtable f140b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Player f141a;
    private static int cB;
    private static int cC;
    private static int cD;
    private static boolean T;
    private static String g;
    private static byte[] i;
    private static int cE;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static String[] f142f;
    private static String[][] d;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static String[] f143g;
    private static boolean U;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static a f144a;

    public p() {
        aq = new int[5];
        cz = -1;
    }

    public static void I() {
        if (f141a != null) {
            a(f141a);
        }
    }

    protected final void keyReleased(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 <= cz; i4++) {
            if (aq[i4] == i2) {
                i3++;
            }
            if (i4 + i3 <= cz) {
                aq[i4] = aq[i4 + i3];
            }
        }
        cz -= i3;
        if (i2 == -6 || i2 == -7) {
            return;
        }
        a.b(i2, 1);
    }

    public static void J() {
        a(f141a);
        cB = -1;
        f141a = null;
    }

    protected final void hideNotify() {
        try {
            a.pauseApp();
        } catch (Throwable unused) {
        }
    }

    public static byte[] a(int i2) {
        byte[] bArrB = null;
        if (i2 != -1) {
            a(new StringBuffer().append("r").append(i2 >>> 16).toString());
            bArrB = b(i2 & 65535);
        }
        return bArrB;
    }

    public static void z(int i2) {
        if (i2 == 0) {
            for (int i3 = 0; i3 <= cz; i3++) {
                a.b(aq[i3], 1);
            }
            cz = -1;
        }
        if (i2 == 0) {
            T = true;
        }
        if (i2 == 3) {
            T = false;
        }
    }

    private static boolean a(String str) {
        boolean z = false;
        if (str.equals(g)) {
            z = true;
        } else {
            s.ay = true;
            g = null;
            i = null;
            try {
                i = new byte[4];
                InputStream resourceAsStream = f138a.getClass().getResourceAsStream(str);
                if (resourceAsStream != null) {
                    resourceAsStream.read(i, 0, 4);
                    int iH = h(0);
                    i = new byte[iH];
                    for (int i2 = 4; i2 < iH; i2 += resourceAsStream.read(i, i2, iH - i2)) {
                    }
                    resourceAsStream.close();
                    g = str;
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    protected final void keyRepeated(int i2) {
        if (i2 == -6 || i2 == -7) {
            return;
        }
        a.b(i2, 2);
    }

    public static void b(String str) {
        f137a.put(new Integer(16777216), str);
        if (cv == 0) {
            e = str;
        }
        if (cx == 0) {
            f = str;
        }
    }

    public static int g(int i2) {
        return ((Integer) f137a.get(new Integer(50331648 | i2))).intValue();
    }

    public static void K() {
        a((Player) null);
    }

    public static void setVisible(boolean z) {
        R = true;
        Display.getDisplay(s.b).setCurrent(f138a);
    }

    public static void L() {
        cv = -1;
        f135e = null;
        e = null;
        cx = -1;
        f136f = null;
        f = null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static DataInputStream m32a(int i2) {
        if (i2 != -1) {
            return new DataInputStream(new ByteArrayInputStream(a(i2)));
        }
        return null;
    }

    public static void a(s sVar) {
        if (f138a == null) {
            f138a = new p();
        }
        a = sVar;
    }

    public static void j(int i2, int i3) {
        if (T || cC == 0 || i2 == -1) {
            return;
        }
        J();
        cD = i3;
        f141a = a(i2, i3, cC);
        cB = i2;
    }

    public static int i() {
        return f138a.getWidth();
    }

    private static int h(int i2) {
        return ((i[i2] & 255) << 24) | ((i[i2 + 1] & 255) << 16) | ((i[i2 + 2] & 255) << 8) | (i[i2 + 3] & 255);
    }

    public static int i(int i2) {
        int i3;
        int i4;
        if ((i2 >= 97 && i2 <= 122) || (i2 >= 65 && i2 <= 90)) {
            int i5 = i2;
            if (i2 >= 48 && i5 <= 57) {
                i4 = i5 - 48;
            } else if ((i5 < 97 || i5 > 122) && (i5 < 65 || i5 > 90)) {
                i4 = -1;
            } else {
                if (i5 >= 65 && i5 <= 90) {
                    i5 += 32;
                }
                if (i5 == 114) {
                    i4 = 1;
                } else if (i5 == 116) {
                    i4 = 2;
                } else if (i5 == 121) {
                    i4 = 3;
                } else if (i5 == 102) {
                    i4 = 4;
                } else if (i5 == 103) {
                    i4 = 5;
                } else if (i5 == 104) {
                    i4 = 6;
                } else if (i5 == 118) {
                    i4 = 7;
                } else if (i5 == 98) {
                    i4 = 8;
                } else if (i5 == 110) {
                    i4 = 9;
                } else {
                    i4 = i5 == 109 ? 0 : -1;
                }
            }
            int i6 = i4;
            if (i4 != -1) {
                i2 = i6 + 48;
            }
        }
        if (i2 == 74 || i2 == 106) {
            i2 = 35;
        }
        if (i2 == 85 || i2 == 117) {
            i2 = 42;
        }
        if ((i2 >= 48 && i2 <= 57) || i2 == 42 || i2 == 35) {
            return i2;
        }
        int gameAction = 0;
        try {
            gameAction = f138a.getGameAction(i2);
        } catch (Exception unused) {
        }
        if (gameAction == 0) {
            return 0;
        }
        if (gameAction == 8) {
            i3 = 53;
        } else if (gameAction == 1) {
            i3 = 50;
        } else if (gameAction == 6) {
            i3 = 56;
        } else if (gameAction == 2) {
            i3 = 52;
        } else {
            i3 = gameAction == 5 ? 54 : 0;
        }
        return i3;
    }

    public static int j() {
        return cE;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:25:0x0113  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0116 A[SYNTHETIC] */
    public static void initialize() {
        int i2;
        int i3;
        Vector vector;
        int i4;
        int i5;
        int i6;
        String appProperty;
        s.ay = true;
        f143g = new String[22];
        try {
            InputStream resourceAsStream = f138a.getClass().getResourceAsStream("p");
            if (resourceAsStream != null) {
                DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
                while (true) {
                    try {
                        f143g[dataInputStream.readByte() - 1] = dataInputStream.readUTF();
                    } catch (EOFException unused) {
                        dataInputStream.close();
                        for (i2 = 1; i2 <= 22; i2++) {
                            appProperty = s.b.getAppProperty(new StringBuffer().append("DCHOC-").append(i2).toString());
                            if (appProperty != null) {
                                f143g[i2 - 1] = appProperty;
                            }
                        }
                        i3 = 0;
                        vector = new Vector();
                        do {
                            cE = i3;
                            vector.addElement(c(0));
                            vector.addElement(c(1));
                            vector.addElement(c(509));
                            i3++;
                        } while (a(new StringBuffer().append("l").append(i3).append("_0").toString()));
                        d = new String[i3][2];
                        f142f = new String[i3];
                        i4 = 0;
                        i5 = 0;
                        for (i6 = 0; i6 < i3; i6++) {
                            int i7 = i4;
                            int i8 = i4 + 1;
                            d[i6][0] = (String) vector.elementAt(i7);
                            int i9 = i8 + 1;
                            f142f[i6] = (String) vector.elementAt(i8);
                            if (f142f[i6].equals(f143g[6])) {
                                i5 = i6;
                            }
                            i4 = i9 + 1;
                            d[i6][1] = (String) vector.elementAt(i9);
                        }
                        cE = i5;
                        f137a = new Hashtable();
                        cv = -1;
                        cx = -1;
                        Font font = Font.getFont(32, 1, 8);
                        b = font;
                        cA = font.getHeight() + 2 + 2 + 2;
                        f140b = new Hashtable();
                    }
                }
            }
        } catch (Exception unused2) {
        }
        while (i2 <= 22) {
            appProperty = s.b.getAppProperty(new StringBuffer().append("DCHOC-").append(i2).toString());
            if (appProperty != null) {
                f143g[i2 - 1] = appProperty;
            }
        }
        i3 = 0;
        vector = new Vector();
        do {
            cE = i3;
            vector.addElement(c(0));
            vector.addElement(c(1));
            vector.addElement(c(509));
            i3++;
        } while (a(new StringBuffer().append("l").append(i3).append("_0").toString()));
        d = new String[i3][2];
        f142f = new String[i3];
        i4 = 0;
        i5 = 0;
        while (i6 < i3) {
            int i10 = i4;
            int i11 = i4 + 1;
            d[i6][0] = (String) vector.elementAt(i10);
            int i12 = i11 + 1;
            f142f[i6] = (String) vector.elementAt(i11);
            if (f142f[i6].equals(f143g[6])) {
                i5 = i6;
            }
            i4 = i12 + 1;
            d[i6][1] = (String) vector.elementAt(i12);
        }
        cE = i5;
        f137a = new Hashtable();
        cv = -1;
        cx = -1;
        Font font2 = Font.getFont(32, 1, 8);
        b = font2;
        cA = font2.getHeight() + 2 + 2 + 2;
        f140b = new Hashtable();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static Player m33a(int i2) {
        try {
            Player playerCreatePlayer = Manager.createPlayer(new ByteArrayInputStream(a(i2)), f139e[0]);
            playerCreatePlayer.addPlayerListener(f138a);
            return playerCreatePlayer;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void M() {
        S = true;
        f138a.repaint();
        f138a.serviceRepaints();
        S = false;
    }

    public static void N() {
        U = true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m34a(String str) {
        s.ay = true;
        byte[] record = null;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore(str, false);
            record = recordStoreOpenRecordStore.getRecord(1);
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception unused) {
        }
        return record;
    }

    public static String[][] a() {
        return d;
    }

    public static void a(int i2, int i3, Image image, int i4) {
        f137a.put(new Integer(0 | i2), new Integer(i3));
        f137a.put(new Integer(16777216 | i2), c(i3));
        if (image != null) {
            f137a.put(new Integer(33554432 | i2), image);
        }
        f137a.put(new Integer(50331648 | i2), new Integer(i4));
    }

    private static byte[] b(int i2) {
        int length = i.length;
        int iH = h(4);
        int iH2 = h(8 + (i2 << 2));
        int iH3 = i2 == iH - 1 ? length - iH2 : h((8 + (i2 << 2)) + 4) - iH2;
        byte[] bArr = new byte[iH3];
        System.arraycopy(i, iH2, bArr, 0, iH3);
        return bArr;
    }

    public static void A(int i2) {
        cC = i2;
        if (i2 == 0) {
            J();
            return;
        }
        a(f141a);
        if (T || cC == 0 || f141a == null) {
            return;
        }
        f141a = a(cB, cD, cC);
    }

    public final void paint(Graphics graphics) {
        if (S) {
            a.a(graphics);
            int width = f138a.getWidth();
            int height = f138a.getHeight();
            graphics.setClip(0, 0, width, height);
            int i2 = height - 2;
            graphics.setFont(b);
            if (cv != -1) {
                if (f135e != null) {
                    graphics.drawImage(f135e, 2, i2 - f135e.getHeight(), 20);
                } else {
                    int i3 = i2 - 1;
                    graphics.setColor(0);
                    graphics.drawString(e, 2, i3, 36);
                    graphics.drawString(e, 3, i3 - 1, 36);
                    graphics.drawString(e, 4, i3, 36);
                    graphics.drawString(e, 3, i3 + 1, 36);
                    graphics.setColor(16777215);
                    graphics.drawString(e, 3, i3, 36);
                }
            }
            if (cx != -1) {
                if (f136f != null) {
                    graphics.drawImage(f136f, (width - 2) - f136f.getWidth(), i2 - f136f.getHeight(), 20);
                    return;
                }
                int i4 = width - 2;
                int i5 = i2 - 1;
                graphics.setColor(0);
                graphics.drawString(f, i4 - 1, i5, 40);
                graphics.drawString(f, i4, i5 - 1, 40);
                graphics.drawString(f, i4 + 1, i5, 40);
                graphics.drawString(f, i4, i5 + 1, 40);
                graphics.setColor(16777215);
                graphics.drawString(f, i4, i5, 40);
            }
        }
    }

    private static Player a(int i2, int i3, int i4) {
        Player playerM33a = null;
        try {
            Player player = (Player) f140b.get(new Integer(i2));
            playerM33a = player;
            if (player == null || playerM33a.getState() == 0) {
                playerM33a = m33a(i2);
            }
            if (playerM33a.getState() != 300) {
                playerM33a.prefetch();
            }
            playerM33a.setLoopCount(i3);
            VolumeControl control = playerM33a.getControl("VolumeControl");
            if (control != null) {
                control.setLevel(i4 * 20);
            }
            playerM33a.start();
        } catch (Exception unused) {
        }
        return playerM33a;
    }

    public static void a(String str, byte[] bArr) {
        s.ay = true;
        if (U) {
            return;
        }
        try {
            RecordStore.deleteRecordStore(str);
        } catch (Exception unused) {
        }
        if (bArr != null) {
            try {
                RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore(str, true);
                recordStoreOpenRecordStore.addRecord(bArr, 0, bArr.length);
                recordStoreOpenRecordStore.closeRecordStore();
            } catch (Exception unused2) {
            }
        }
    }

    protected final void keyPressed(int i2) {
        z(3);
        int i3 = cz + 1;
        cz = i3;
        if (i3 >= aq.length) {
            int[] iArr = aq;
            aq = new int[iArr.length + 1];
            System.arraycopy(iArr, 0, aq, 0, iArr.length);
        }
        aq[cz] = i2;
        if (i2 == -6) {
            if (cv != -1) {
                a.b(cv, 3);
            }
        } else if (i2 != -7) {
            a.b(i2, 0);
        } else if (cx != -1) {
            a.b(cx, 3);
        }
    }

    public static void B(int i2) {
        if (i2 == 0) {
            a((Player) null);
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static String m35b(int i2) {
        String str = null;
        int[][] iArr = {new int[]{-1, -2, -2, -2, -2}, new int[]{-1, -2, -2, -2, -1}, new int[]{-1, 530, -2, 531, 532}};
        String str2 = f143g[21];
        if (str2 != null) {
            String strC = c(iArr[2][Integer.parseInt(str2)]);
            str = strC;
            if (strC != null && str.length() == 1) {
                str = null;
            }
        }
        return str != null ? str : "";
    }

    public static String a(String str, String[] strArr) {
        try {
            if (strArr.length == 1) {
                str = a(str, "%U", strArr[0]);
            } else {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    str = a(str, new StringBuffer().append("%").append(i2).append("U").toString(), strArr[i2]);
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static int k() {
        return cC;
    }

    public static Image getImage(int i2) {
        Image imageCreateImage = null;
        if (i2 != -1) {
            byte[] bArrA = a(i2);
            imageCreateImage = Image.createImage(bArrA, 0, bArrA.length);
        }
        return imageCreateImage;
    }

    public static String c(int i2) {
        String utf = null;
        if (i2 == -1) {
            return null;
        }
        if (i2 == -2) {
            return "";
        }
        try {
            a(new StringBuffer().append("l").append(cE).append("_").append(i2 >>> 16).toString());
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(b(i2 & 65535)));
            utf = dataInputStream.readUTF();
            dataInputStream.close();
        } catch (Exception unused) {
        }
        return utf;
    }

    public static int l() {
        return cA;
    }

    public static void C(int i2) {
        cE = i2;
    }

    public static void b(String str, byte[] bArr) {
        s.ay = true;
        try {
            RecordStore.deleteRecordStore(str);
        } catch (Exception unused) {
        }
        if (bArr != null) {
            try {
                RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore(str, true);
                recordStoreOpenRecordStore.addRecord(bArr, 0, bArr.length);
                recordStoreOpenRecordStore.closeRecordStore();
            } catch (Exception unused2) {
            }
        }
    }

    public static void k(int i2, int i3) {
        String str = (String) f137a.get(new Integer(16777216 | i2));
        Image image = (Image) f137a.get(new Integer(33554432 | i2));
        int iIntValue = ((Integer) f137a.get(new Integer(50331648 | i2))).intValue();
        boolean z = true;
        int i4 = -1;
        if (i3 == 0) {
            if (iIntValue == 0 || iIntValue == 1) {
                if (cv != -1) {
                    if (iIntValue < cw) {
                        i4 = cv;
                    } else {
                        z = false;
                    }
                }
            } else if (cx == -1) {
                z = false;
            } else if (iIntValue > cy) {
                i4 = cx;
                z = false;
            }
            if (i4 != -1) {
                L();
                if (z) {
                    k(i4, 3);
                } else {
                    k(i4, 1);
                }
            }
        } else if (i3 != 1) {
            z = false;
        }
        if (z) {
            cv = i2;
            f135e = image;
            e = str;
            cw = iIntValue;
            return;
        }
        cx = i2;
        f136f = image;
        f = str;
        cy = iIntValue;
    }

    public final void playerUpdate(Player player, String str, Object obj) {
    }

    private static String a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf(str2);
        return iIndexOf >= 0 ? new StringBuffer().append(str.substring(0, iIndexOf)).append(str3).append(str.substring(iIndexOf + str2.length())).toString() : str;
    }

    public static int m() {
        return f138a.getHeight();
    }

    private static void a(Player player) {
        if (player != null) {
            try {
                player.stop();
                player.setMediaTime(0L);
            } catch (Exception unused) {
            }
        }
    }

    public static int j(int i2) {
        if (i2 == 1) {
            return cv;
        }
        if (i2 == 3) {
            return cx;
        }
        return -1;
    }

    protected final void showNotify() {
        try {
            if (R) {
                R = false;
            } else {
                a.startApp();
            }
        } catch (Throwable unused) {
        }
    }

    public static String d(int i2) {
        return f143g[i2 - 1];
    }

    public static void a(l lVar) {
        int height;
        h = lVar;
        if (lVar == null || (height = h.getHeight() + 2 + 2) <= cA) {
            return;
        }
        cA = height;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static a m36a() {
        if (f144a == null) {
            f144a = new a();
        }
        return f144a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static b m37a() {
        return new b();
    }

    static {
        String[] strArr = {".mid", ".wav", ".amr", ".mp3"};
    }
}
