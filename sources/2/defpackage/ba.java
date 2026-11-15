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

/* JADX INFO: loaded from: bbr-2.jar:ba.class */
public final class ba extends FullCanvas implements PlayerListener {
    private static bd a;
    private static boolean aq;
    private static boolean ar;
    private static int ej;
    private static String h;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static Image f40h;
    private static int ek;
    private static int el;
    private static String i;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static Image f41i;
    private static int em;
    private static Hashtable c;
    private static Font b;
    private static boolean as;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ba f42a;
    private static int[] aA;
    private static int en;
    private static int[] aB;
    private static int eo;
    private static int[] aC;
    private static int ep;
    private static int[] aD;
    private static int eq;
    private static ax q;
    private static int er;
    private static Hashtable d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Player f44a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Player f45b;
    private static int es;
    private static int et;
    private static int eu;
    private static boolean aw;
    private static String j;
    private static byte[] l;
    private static int ev;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static String[] f46i;
    private static String[][] e;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static String[] f47j;
    private static boolean ax;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static ap f48b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static b f49a;
    private static boolean at = false;
    private static boolean au = false;
    private static boolean av = false;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static final String[] f43h = {"audio/midi", "audio/wav", "audio/amr", "audio/mpeg"};

    public ba() {
        aA = new int[5];
        aB = new int[5];
        aC = new int[5];
        aD = new int[5];
        en = -1;
        eo = -1;
        ep = -1;
        eq = -1;
    }

    public static void Q() {
        if (f45b != null) {
            a(f45b);
        }
    }

    public static void A(int i2) {
        if (i2 != -1) {
            try {
                Player playerM23a = m23a(i2);
                playerM23a.prefetch();
                d.put(new Integer(i2), playerM23a);
            } catch (Exception unused) {
            }
        }
    }

    protected final void keyReleased(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 <= en; i4++) {
            if (aA[i4] == i2) {
                i3++;
            }
            if (i4 + i3 <= en) {
                aA[i4] = aA[i4 + i3];
            }
        }
        en -= i3;
        if (ep < 4) {
            int[] iArr = aC;
            int i5 = ep + 1;
            ep = i5;
            iArr[i5] = i2;
        }
        au = true;
    }

    protected final void hideNotify() {
        try {
            a.pauseApp();
        } catch (Throwable unused) {
        }
    }

    public static byte[] a(int i2) {
        byte[] bArrM25b = null;
        if (i2 != -1) {
            a(new StringBuffer().append("r").append(i2 >>> 16).toString());
            bArrM25b = m25b(i2 & 65535);
        }
        return bArrM25b;
    }

    protected final void keyRepeated(int i2) {
        if (i2 == -6 || i2 == -7) {
            return;
        }
        if (eq < 4) {
            int[] iArr = aD;
            int i3 = eq + 1;
            eq = i3;
            iArr[i3] = i2;
        }
        av = true;
    }

    private static boolean a(String str) {
        boolean z = false;
        if (str.equals(j)) {
            z = true;
        } else {
            bd.aI = true;
            j = null;
            l = null;
            try {
                l = new byte[4];
                InputStream resourceAsStream = f42a.getClass().getResourceAsStream(str);
                if (resourceAsStream != null) {
                    resourceAsStream.read(l, 0, 4);
                    int iP = p(0);
                    l = new byte[iP];
                    for (int i2 = 4; i2 < iP; i2 += resourceAsStream.read(l, i2, iP - i2)) {
                    }
                    resourceAsStream.close();
                    j = str;
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public static void b(String str) {
        c.put(new Integer(16777216), str);
        if (ej == 0) {
            h = str;
        }
        if (el == 0) {
            i = str;
        }
    }

    public static int o(int i2) {
        return ((Integer) c.get(new Integer(50331648 | i2))).intValue();
    }

    public static void R() {
        a((Player) null);
        f44a = null;
    }

    public static void setVisible(boolean z) {
        aq = false;
        ar = true;
        Display.getDisplay(bd.f61b).setCurrent(f42a);
    }

    public static void a(bd bdVar) {
        if (f42a == null) {
            f42a = new ba();
        }
        a = bdVar;
    }

    public static int E() {
        return f42a.getWidth();
    }

    public static int F() {
        return ev;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:25:0x0111  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0114 A[SYNTHETIC] */
    public static void initialize() {
        int i2;
        int i3;
        Vector vector;
        int i4;
        int i5;
        int i6;
        String appProperty;
        bd.aI = true;
        f47j = new String[25];
        try {
            InputStream resourceAsStream = f42a.getClass().getResourceAsStream("p");
            if (resourceAsStream != null) {
                DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
                while (true) {
                    try {
                        f47j[dataInputStream.readByte() - 1] = dataInputStream.readUTF();
                    } catch (EOFException unused) {
                        dataInputStream.close();
                        for (i2 = 1; i2 <= 25; i2++) {
                            appProperty = bd.f61b.getAppProperty(new StringBuffer().append("DCHOC-").append(i2).toString());
                            if (appProperty != null) {
                                f47j[i2 - 1] = appProperty;
                            }
                        }
                        i3 = 0;
                        vector = new Vector();
                        do {
                            ev = i3;
                            vector.addElement(c(0));
                            vector.addElement(c(1));
                            vector.addElement(c(3));
                            i3++;
                        } while (a(new StringBuffer().append("l").append(i3).append("_0").toString()));
                        e = new String[i3][2];
                        f46i = new String[i3];
                        i4 = 0;
                        i5 = 0;
                        for (i6 = 0; i6 < i3; i6++) {
                            int i7 = i4;
                            int i8 = i4 + 1;
                            e[i6][0] = (String) vector.elementAt(i7);
                            int i9 = i8 + 1;
                            f46i[i6] = (String) vector.elementAt(i8);
                            if (f46i[i6].equals(f47j[6])) {
                                i5 = i6;
                            }
                            i4 = i9 + 1;
                            e[i6][1] = (String) vector.elementAt(i9);
                        }
                        ev = i5;
                        c = new Hashtable();
                        ej = -1;
                        el = -1;
                        Font font = Font.getFont(32, 1, 8);
                        b = font;
                        er = font.getHeight() + 2 + 2 + 2;
                        d = new Hashtable();
                    }
                }
            }
        } catch (Exception unused2) {
        }
        while (i2 <= 25) {
            appProperty = bd.f61b.getAppProperty(new StringBuffer().append("DCHOC-").append(i2).toString());
            if (appProperty != null) {
                f47j[i2 - 1] = appProperty;
            }
        }
        i3 = 0;
        vector = new Vector();
        do {
            ev = i3;
            vector.addElement(c(0));
            vector.addElement(c(1));
            vector.addElement(c(3));
            i3++;
        } while (a(new StringBuffer().append("l").append(i3).append("_0").toString()));
        e = new String[i3][2];
        f46i = new String[i3];
        i4 = 0;
        i5 = 0;
        while (i6 < i3) {
            int i10 = i4;
            int i11 = i4 + 1;
            e[i6][0] = (String) vector.elementAt(i10);
            int i12 = i11 + 1;
            f46i[i6] = (String) vector.elementAt(i11);
            if (f46i[i6].equals(f47j[6])) {
                i5 = i6;
            }
            i4 = i12 + 1;
            e[i6][1] = (String) vector.elementAt(i12);
        }
        ev = i5;
        c = new Hashtable();
        ej = -1;
        el = -1;
        Font font2 = Font.getFont(32, 1, 8);
        b = font2;
        er = font2.getHeight() + 2 + 2 + 2;
        d = new Hashtable();
    }

    public static String[][] b() {
        return e;
    }

    public static void B(int i2) {
        et = i2;
        if (i2 == 0) {
            T();
            return;
        }
        a(f45b);
        if (aw || et == 0 || f45b == null) {
            return;
        }
        f45b = a(es, eu, et);
    }

    private static Player a(int i2, int i3, int i4) {
        Player playerM23a = null;
        try {
            Player player = (Player) d.get(new Integer(i2));
            playerM23a = player;
            if (player == null || playerM23a.getState() == 0) {
                playerM23a = m23a(i2);
            }
            if (playerM23a.getState() != 300) {
                playerM23a.prefetch();
            }
            playerM23a.setLoopCount(i3);
            VolumeControl control = playerM23a.getControl("VolumeControl");
            if (control != null) {
                control.setLevel(i4 * 20);
            }
            playerM23a.start();
        } catch (Exception unused) {
        }
        return playerM23a;
    }

    public static void C(int i2) {
        if (i2 == 0) {
            R();
        }
    }

    protected final void keyPressed(int i2) {
        int i3 = en + 1;
        en = i3;
        if (i3 >= aA.length) {
            int[] iArr = aA;
            aA = new int[iArr.length + 1];
            System.arraycopy(iArr, 0, aA, 0, iArr.length);
        }
        aA[en] = i2;
        if (eo < 4) {
            int[] iArr2 = aB;
            int i4 = eo + 1;
            eo = i4;
            iArr2[i4] = i2;
        }
        at = true;
    }

    public static String b(int i2) {
        String str = null;
        int[][] iArr = {new int[]{-1, -2, -2, -2, -2}, new int[]{-1, -2, -2, -2, -1}, new int[]{-1, 327690, -2, 327691, 327692}};
        String strD = d(22);
        if (strD != null) {
            String strC = c(iArr[2][Integer.parseInt(strD)]);
            str = strC;
            if (strC != null && str.length() == 1) {
                str = null;
            }
        }
        return str != null ? str : "";
    }

    public static void S() {
        if (at) {
            for (int i2 = 0; i2 <= eo; i2++) {
                D(3);
                int i3 = aB[i2];
                if (i3 == -6) {
                    if (ej != -1) {
                        a.b(ej, 3);
                    }
                } else if (i3 != -7) {
                    a.b(i3, 0);
                } else if (el != -1) {
                    a.b(el, 3);
                }
            }
            at = false;
            eo = -1;
        }
        if (au) {
            for (int i4 = 0; i4 <= ep; i4++) {
                int i5 = aC[i4];
                int i6 = 0;
                for (int i7 = 0; i7 <= en; i7++) {
                    if (aA[i7] == i5) {
                        i6++;
                    }
                    if (i7 + i6 <= en) {
                        aA[i7] = aA[i7 + i6];
                    }
                }
                en -= i6;
                if (i5 != -6 && i5 != -7) {
                    a.b(i5, 1);
                }
            }
            au = false;
            ep = -1;
        }
        if (av) {
            for (int i8 = 0; i8 <= eq; i8++) {
                a.b(aD[i8], 2);
            }
            av = false;
            eq = -1;
        }
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

    public static int G() {
        return er;
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
            a(new StringBuffer().append("l").append(ev).append("_").append(i2 >>> 16).toString());
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(m25b(i2 & 65535)));
            utf = dataInputStream.readUTF();
            dataInputStream.close();
        } catch (Exception unused) {
        }
        return utf;
    }

    public static void a(String str, byte[] bArr, int i2) {
        bd.aI = true;
        if (!ax || i2 == 1) {
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
    }

    public static void h(int i2, int i3) {
        String str = (String) c.get(new Integer(16777216 | i2));
        Image image = (Image) c.get(new Integer(33554432 | i2));
        int iIntValue = ((Integer) c.get(new Integer(50331648 | i2))).intValue();
        boolean z = true;
        int i4 = -1;
        if (i3 == 0) {
            if (iIntValue == 0 || iIntValue == 1) {
                if (ej != -1) {
                    if (iIntValue < ek) {
                        i4 = ej;
                    } else {
                        z = false;
                    }
                }
            } else if (el == -1) {
                z = false;
            } else if (iIntValue > em) {
                i4 = el;
                z = false;
            }
            if (i4 != -1) {
                U();
                if (z) {
                    h(i4, 3);
                } else {
                    h(i4, 1);
                }
            }
        } else if (i3 != 1) {
            z = false;
        }
        if (z) {
            ej = i2;
            f40h = image;
            h = str;
            ek = iIntValue;
            return;
        }
        el = i2;
        f41i = image;
        i = str;
        em = iIntValue;
    }

    public final void playerUpdate(Player player, String str, Object obj) {
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static String m20b() {
        int i2 = (Integer.parseInt("1132") * 10000) + Integer.parseInt(d(2));
        String string = "";
        int i3 = 1;
        do {
            int i4 = (i2 / i3) % 36;
            i2 -= i4 * i3;
            i3 *= 36;
            string = i4 > 9 ? new StringBuffer().append("").append((char) ((i4 - 10) + 65)).append(string).toString() : new StringBuffer().append(i4).append(string).toString();
        } while (i2 > 0);
        return string;
    }

    public static int H() {
        return f42a.getHeight();
    }

    public static void a(ax axVar) {
        int height;
        q = axVar;
        if (axVar == null || (height = q.getHeight() + 2 + 2) <= er) {
            return;
        }
        er = height;
    }

    public static String d(int i2) {
        String string = f47j[i2 - 1];
        if (i2 == 5) {
            string = null;
            if (string != null) {
                String str = f47j[24];
                boolean z = true;
                int length = 0;
                int i3 = 0;
                while (length < string.length()) {
                    i3++;
                    int iIndexOf = string.indexOf("!.!", length);
                    int length2 = iIndexOf;
                    if (iIndexOf == -1) {
                        length2 = string.length();
                    }
                    length = length2 + "!.!".length();
                }
                String[] strArr = new String[i3];
                int length3 = 0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    int iIndexOf2 = string.indexOf("!.!", length3);
                    int length4 = iIndexOf2;
                    if (iIndexOf2 == -1) {
                        length4 = string.length();
                    }
                    String strSubstring = string.substring(length3, length4);
                    String appProperty = bd.f61b.getAppProperty(new StringBuffer().append("DCHOC-GMG-").append(i4).toString());
                    String str2 = appProperty;
                    if (appProperty != null && !str2.equals("")) {
                        if (str2.equals(str)) {
                            str2 = "none";
                        }
                        strSubstring = str2;
                    }
                    if (!strSubstring.equals("none") && z) {
                        z = false;
                    }
                    strArr[i4] = strSubstring;
                    length3 = length4 + "!.!".length();
                }
                if (!z) {
                    string = strArr[0];
                    for (int i5 = 1; i5 < strArr.length; i5++) {
                        string = new StringBuffer().append(string).append("!.!").append(strArr[i5]).toString();
                    }
                }
            }
        }
        return string;
    }

    public static void T() {
        a(f45b);
        es = -1;
        f45b = null;
    }

    public static void D(int i2) {
        if (i2 == 0) {
            for (int i3 = 0; i3 <= en; i3++) {
                a.b(aA[i3], 1);
            }
            en = -1;
        }
        if (i2 == 0) {
            aw = true;
        }
        if (i2 == 3) {
            aw = false;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m21a(String str) {
        return bd.f61b.getAppProperty(str);
    }

    public static void U() {
        ej = -1;
        f40h = null;
        h = null;
        el = -1;
        f41i = null;
        i = null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static DataInputStream m22a(int i2) {
        if (i2 != -1) {
            return new DataInputStream(new ByteArrayInputStream(a(i2)));
        }
        return null;
    }

    public static void i(int i2, int i3) {
        if (aw || et == 0 || i2 == -1) {
            return;
        }
        T();
        eu = i3;
        f45b = a(i2, i3, et);
        es = i2;
    }

    private static int p(int i2) {
        return ((l[i2] & 255) << 24) | ((l[i2 + 1] & 255) << 16) | ((l[i2 + 2] & 255) << 8) | (l[i2 + 3] & 255);
    }

    public static int q(int i2) {
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
            gameAction = f42a.getGameAction(i2);
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

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static Player m23a(int i2) {
        try {
            Player playerCreatePlayer = Manager.createPlayer(new ByteArrayInputStream(a(i2)), f43h[0]);
            playerCreatePlayer.addPlayerListener(f42a);
            return playerCreatePlayer;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void V() {
        as = true;
        f42a.repaint();
        f42a.serviceRepaints();
        as = false;
    }

    public static void W() {
        ax = true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m24a(String str) {
        bd.aI = true;
        byte[] record = null;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore(str, false);
            record = recordStoreOpenRecordStore.getRecord(1);
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception unused) {
        }
        return record;
    }

    public static void a(int i2, int i3, Image image, int i4) {
        c.put(new Integer(0 | i2), new Integer(i3));
        c.put(new Integer(16777216 | i2), c(i3));
        if (image != null) {
            c.put(new Integer(33554432 | i2), image);
        }
        c.put(new Integer(50331648 | i2), new Integer(i4));
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static byte[] m25b(int i2) {
        int length = l.length;
        int iP = p(4);
        int iP2 = p(8 + (i2 << 2));
        int iP3 = i2 == iP - 1 ? length - iP2 : p((8 + (i2 << 2)) + 4) - iP2;
        byte[] bArr = new byte[iP3];
        System.arraycopy(l, iP2, bArr, 0, iP3);
        return bArr;
    }

    public final void paint(Graphics graphics) {
        if (as) {
            a.b(graphics);
            int width = f42a.getWidth();
            int height = f42a.getHeight();
            graphics.setClip(0, 0, width, height);
            int i2 = height - 2;
            graphics.setFont(b);
            if (ej != -1) {
                if (f40h != null) {
                    graphics.drawImage(f40h, 2, i2 - f40h.getHeight(), 20);
                } else if (q != null) {
                    q.a(graphics, h, 2, i2, 36);
                } else {
                    int i3 = i2 - 1;
                    graphics.setColor(0);
                    graphics.drawString(h, 2, i3, 36);
                    graphics.drawString(h, 3, i3 - 1, 36);
                    graphics.drawString(h, 4, i3, 36);
                    graphics.drawString(h, 3, i3 + 1, 36);
                    graphics.setColor(16777215);
                    graphics.drawString(h, 3, i3, 36);
                }
            }
            if (el != -1) {
                if (f41i != null) {
                    graphics.drawImage(f41i, (width - 2) - f41i.getWidth(), i2 - f41i.getHeight(), 20);
                    return;
                }
                if (q != null) {
                    q.a(graphics, i, (f42a.getWidth() - 2) - q.stringWidth(i), i2, 36);
                    return;
                }
                int i4 = width - 2;
                int i5 = i2 - 1;
                graphics.setColor(0);
                graphics.drawString(i, i4 - 1, i5, 40);
                graphics.drawString(i, i4, i5 - 1, 40);
                graphics.drawString(i, i4 + 1, i5, 40);
                graphics.drawString(i, i4, i5 + 1, 40);
                graphics.setColor(16777215);
                graphics.drawString(i, i4, i5, 40);
            }
        }
    }

    public static void a(String str, byte[] bArr) {
        bd.aI = true;
        if (ax) {
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

    public static int I() {
        return et;
    }

    public static Image getImage(int i2) {
        Image imageCreateImage = null;
        if (i2 != -1) {
            byte[] bArrA = a(i2);
            imageCreateImage = Image.createImage(bArrA, 0, bArrA.length);
        }
        return imageCreateImage;
    }

    public static void E(int i2) {
        ev = i2;
    }

    private static String a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf(str2);
        return iIndexOf >= 0 ? new StringBuffer().append(str.substring(0, iIndexOf)).append(str3).append(str.substring(iIndexOf + str2.length())).toString() : str;
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

    public static int r(int i2) {
        if (i2 == 1) {
            return ej;
        }
        if (i2 == 3) {
            return el;
        }
        return -1;
    }

    protected final void showNotify() {
        try {
            if (ar) {
                ar = false;
            } else {
                a.startApp();
            }
        } catch (Throwable unused) {
        }
    }

    public static ap a() {
        if (f48b == null) {
            f48b = new ap();
        }
        return f48b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static b m26a() {
        if (f49a == null) {
            f49a = new b();
        }
        return f49a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static ao m27a() {
        return new ao();
    }

    static {
        String[] strArr = {".mid", ".wav", ".amr", ".mp3"};
        char[] cArr = {'#', 8722, '-'};
    }
}
