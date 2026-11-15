package defpackage;

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
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordStore;

/* JADX INFO: loaded from: sequel-3d-java.jar:t.class */
public final class t extends GameCanvas implements PlayerListener {
    private static h a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f288a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f289a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f290a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image f291a;
    private static int b;
    private static int c;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static String f292b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Image f293b;
    private static int d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Hashtable f294a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Font f295a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static t f296a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f297a;
    private static int e;
    private static int f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Graphics f298a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Player f300a;
    private static int g;
    private static int h;
    private static int i;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static String f301c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static byte[] f302a;
    private static int j;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static String[] f303b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String[][] f304a;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static String[] f305c;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean f307b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static v f308a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static d f309a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final String[] f299a = {"audio/midi", "audio/wav", "audio/amr", "audio/mpeg"};

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static String f306d = "";

    public t() {
        super(false);
        setFullScreenMode(true);
        f297a = new int[5];
        e = -1;
    }

    protected final void keyPressed(int i2) {
        m103c(3);
        int i3 = e + 1;
        e = i3;
        if (i3 >= f297a.length) {
            int[] iArr = f297a;
            f297a = new int[iArr.length + 1];
            System.arraycopy(iArr, 0, f297a, 0, iArr.length);
        }
        f297a[e] = i2;
        if (i2 == -6 || i2 == -6) {
            if (f289a != -1) {
                a.a(f289a, 3);
            }
        } else if (i2 != -7 && i2 != -7) {
            a.a(i2, 0);
        } else if (c != -1) {
            a.a(c, 3);
        }
    }

    public static int a() {
        return f296a.getHeight();
    }

    private static Player a(int i2, int i3, int i4) {
        Player player = null;
        try {
            Player playerM100a = m100a(i2);
            player = playerM100a;
            if (playerM100a.getState() != 300) {
                player.prefetch();
            }
            player.setLoopCount(i3);
            VolumeControl control = player.getControl("VolumeControl");
            if (control != null) {
                control.setLevel(i4 * 20);
            }
            player.start();
        } catch (Exception unused) {
        }
        return player;
    }

    public static int b() {
        return j;
    }

    public static String a(String str) {
        return h.f92a.getAppProperty(str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String[][] m83a() {
        return f304a;
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

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m84a() {
        f307b = true;
    }

    public static Image a(int i2) {
        Image imageCreateImage = null;
        if (i2 != -1) {
            byte[] bArrM96a = m96a(i2);
            imageCreateImage = Image.createImage(bArrM96a, 0, bArrM96a.length);
        }
        return imageCreateImage;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m85b() {
        f289a = -1;
        f291a = null;
        f290a = null;
        c = -1;
        f293b = null;
        f292b = null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m86a(int i2) {
        int i3;
        if ((i2 >= 48 && i2 <= 57) || i2 == 42 || i2 == 35) {
            return i2;
        }
        int gameAction = 0;
        if (i2 != -11111) {
            try {
                gameAction = f296a.getGameAction(i2);
            } catch (Exception unused) {
            }
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

    public static int c() {
        return f;
    }

    public static int d() {
        return h;
    }

    public static int b(int i2) {
        return ((Integer) f294a.get(new Integer(50331648 | i2))).intValue();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m87a(int i2) {
        String utf = null;
        if (i2 == -1) {
            return null;
        }
        if (i2 == -2) {
            return "";
        }
        try {
            m88a(new StringBuffer().append("l").append(j).append("_").append(i2 >>> 16).toString());
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(m97b(i2 & 65535)));
            utf = dataInputStream.readUTF();
            dataInputStream.close();
        } catch (Exception unused) {
        }
        return utf;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m88a(String str) {
        boolean z = false;
        if (str.equals(f301c)) {
            z = true;
        } else {
            h.f93b = true;
            h.c = true;
            f301c = null;
            f302a = null;
            try {
                f302a = new byte[4];
                InputStream resourceAsStream = f296a.getClass().getResourceAsStream(new StringBuffer().append(f306d).append(str).toString());
                if (resourceAsStream != null) {
                    resourceAsStream.read(f302a, 0, 4);
                    int iD = d(0);
                    f302a = new byte[iD];
                    for (int i2 = 4; i2 < iD; i2 += resourceAsStream.read(f302a, i2, iD - i2)) {
                    }
                    resourceAsStream.close();
                    f301c = str;
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public static void a(int i2, int i3) {
        String str = (String) f294a.get(new Integer(16777216 | i2));
        Image image = (Image) f294a.get(new Integer(33554432 | i2));
        int iIntValue = ((Integer) f294a.get(new Integer(50331648 | i2))).intValue();
        boolean z = true;
        int i4 = -1;
        if (i3 == 0) {
            if (iIntValue == 0 || iIntValue == 1) {
                if (f289a != -1) {
                    if (iIntValue < b) {
                        i4 = f289a;
                    } else {
                        z = false;
                    }
                } else if (c != -1) {
                }
            } else if (c == -1) {
                z = false;
            } else if (iIntValue > d) {
                i4 = c;
                z = false;
            }
            if (i4 != -1) {
                m85b();
                if (z) {
                    a(i4, 3);
                } else {
                    a(i4, 1);
                }
            }
        } else if (i3 != 1) {
            z = false;
        }
        if (z) {
            f289a = i2;
            f291a = image;
            f290a = str;
            b = iIntValue;
            return;
        }
        c = i2;
        f293b = image;
        f292b = str;
        d = iIntValue;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static void m89c() {
        if (f300a != null) {
            try {
                f300a.stop();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(boolean z) {
        f288a = true;
        Display.getDisplay(h.f92a).setCurrent(f296a);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m90a(int i2) {
        j = i2;
    }

    public final void paint(Graphics graphics) {
    }

    protected final void keyRepeated(int i2) {
        if (i2 == -6 || i2 == -6 || i2 == -7 || i2 == -7) {
            return;
        }
        a.a(i2, 2);
    }

    public final void playerUpdate(Player player, String str, Object obj) {
        if (str == "deviceUnavailable") {
            try {
                if (player.getState() != 0) {
                    m89c();
                }
            } catch (Exception unused) {
                return;
            }
        }
        if (str != "deviceAvailable" || player.getState() == 0 || h == 0) {
            return;
        }
        h();
    }

    protected final void keyReleased(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 <= e; i4++) {
            if (f297a[i4] == i2) {
                i3++;
            }
            if (i4 + i3 <= e) {
                f297a[i4] = f297a[i4 + i3];
            }
        }
        e -= i3;
        if (i2 == -6 || i2 == -6 || i2 == -7 || i2 == -7) {
            return;
        }
        a.a(i2, 1);
    }

    public static void a(String str, byte[] bArr) {
        h.f93b = true;
        h.c = true;
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

    private static String a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf(str2);
        return iIndexOf >= 0 ? new StringBuffer().append(str.substring(0, iIndexOf)).append(str3).append(str.substring(iIndexOf + str2.length())).toString() : str;
    }

    private static int d(int i2) {
        return ((f302a[i2] & 255) << 24) | ((f302a[i2 + 1] & 255) << 16) | ((f302a[i2 + 2] & 255) << 8) | (f302a[i2 + 3] & 255);
    }

    public static void a(h hVar) {
        if (f296a == null) {
            f296a = new t();
        }
        a = hVar;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static void m91d() {
        a(f300a);
        g = -1;
        f300a = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x008d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0103  */
    /* JADX WARN: Code duplicated, block: B:27:0x0139  */
    /* JADX WARN: Code duplicated, block: B:38:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x013c A[SYNTHETIC] */
    public static void e() {
        int i2;
        int i3;
        Vector vector;
        int i4;
        int i5;
        int i6;
        String appProperty;
        h.f93b = true;
        h.c = true;
        f305c = new String[25];
        if (!"null".equals("null")) {
            f306d = "null";
        }
        try {
            InputStream resourceAsStream = f296a.getClass().getResourceAsStream(new StringBuffer().append(f306d).append("p").toString());
            if (resourceAsStream != null) {
                DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
                while (true) {
                    try {
                        f305c[dataInputStream.readByte() - 1] = dataInputStream.readUTF();
                    } catch (EOFException unused) {
                        dataInputStream.close();
                        for (i2 = 1; i2 <= 25; i2++) {
                            appProperty = h.f92a.getAppProperty(new StringBuffer().append("DCHOC-").append(i2).toString());
                            if (appProperty != null) {
                                f305c[i2 - 1] = appProperty;
                            }
                        }
                        i3 = 0;
                        vector = new Vector();
                        do {
                            j = i3;
                            vector.addElement(m87a(0));
                            vector.addElement(m87a(1));
                            vector.addElement(m87a(440));
                            i3++;
                        } while (m88a(new StringBuffer().append("l").append(i3).append("_0").toString()));
                        f304a = new String[i3][2];
                        f303b = new String[i3];
                        i4 = 0;
                        i5 = 0;
                        for (i6 = 0; i6 < i3; i6++) {
                            int i7 = i4;
                            int i8 = i4 + 1;
                            f304a[i6][0] = (String) vector.elementAt(i7);
                            int i9 = i8 + 1;
                            f303b[i6] = (String) vector.elementAt(i8);
                            if (f303b[i6].equals(f305c[6])) {
                                i5 = i6;
                            }
                            i4 = i9 + 1;
                            f304a[i6][1] = (String) vector.elementAt(i9);
                        }
                        j = i5;
                        f294a = new Hashtable();
                        f289a = -1;
                        c = -1;
                        Font fontM104a = m104a(1, 8);
                        f295a = fontM104a;
                        f = fontM104a.getHeight() + 2 + 2 + 2;
                        f298a = f296a.getGraphics();
                    }
                }
            }
        } catch (Exception unused2) {
        }
        while (i2 <= 25) {
            appProperty = h.f92a.getAppProperty(new StringBuffer().append("DCHOC-").append(i2).toString());
            if (appProperty != null) {
                f305c[i2 - 1] = appProperty;
            }
        }
        i3 = 0;
        vector = new Vector();
        do {
            j = i3;
            vector.addElement(m87a(0));
            vector.addElement(m87a(1));
            vector.addElement(m87a(440));
            i3++;
        } while (m88a(new StringBuffer().append("l").append(i3).append("_0").toString()));
        f304a = new String[i3][2];
        f303b = new String[i3];
        i4 = 0;
        i5 = 0;
        while (i6 < i3) {
            int i10 = i4;
            int i11 = i4 + 1;
            f304a[i6][0] = (String) vector.elementAt(i10);
            int i12 = i11 + 1;
            f303b[i6] = (String) vector.elementAt(i11);
            if (f303b[i6].equals(f305c[6])) {
                i5 = i6;
            }
            i4 = i12 + 1;
            f304a[i6][1] = (String) vector.elementAt(i12);
        }
        j = i5;
        f294a = new Hashtable();
        f289a = -1;
        c = -1;
        Font fontM104a2 = m104a(1, 8);
        f295a = fontM104a2;
        f = fontM104a2.getHeight() + 2 + 2 + 2;
        f298a = f296a.getGraphics();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static String m92b(int i2) {
        String string = f305c[i2 - 1];
        if (i2 == 5) {
            string = null;
            if (string != null) {
                String str = f305c[24];
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
                    String appProperty = h.f92a.getAppProperty(new StringBuffer().append("DCHOC-GMG-").append(i4).toString());
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

    private static void a(Player player) {
        if (player != null) {
            try {
                player.stop();
                player.deallocate();
                player.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static DataInputStream m93a(int i2) {
        if (i2 != -1) {
            return new DataInputStream(new ByteArrayInputStream(m96a(i2)));
        }
        return null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m94a(String str) {
        h.f93b = true;
        h.c = true;
        byte[] record = null;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore(str, false);
            record = recordStoreOpenRecordStore.getRecord(1);
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception unused) {
        }
        return record;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static w m95a(int i2) {
        w wVar = null;
        if (i2 != -1) {
            int i3 = i2 & 65535;
            m88a(new StringBuffer().append("r").append(i2 >>> 16).toString());
            int length = f302a.length;
            int iD = d(4);
            int iD2 = d(8 + (i3 << 2));
            int iD3 = i3 == iD - 1 ? length - iD2 : d((8 + (i3 << 2)) + 4) - iD2;
            byte[] bArr = f302a;
            int i4 = iD3;
            w wVar2 = new w();
            wVar2.f323a = new DataInputStream(new ByteArrayInputStream(bArr, iD2, i4));
            wVar2.f322a = i4;
            wVar2.a = true;
            wVar = wVar2;
        }
        return wVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m96a(int i2) {
        byte[] bArrM97b = null;
        if (i2 != -1) {
            m88a(new StringBuffer().append("r").append(i2 >>> 16).toString());
            bArrM97b = m97b(i2 & 65535);
        }
        return bArrM97b;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static byte[] m97b(int i2) {
        int length = f302a.length;
        int iD = d(4);
        int iD2 = d(8 + (i2 << 2));
        int iD3 = i2 == iD - 1 ? length - iD2 : d((8 + (i2 << 2)) + 4) - iD2;
        byte[] bArr = new byte[iD3];
        System.arraycopy(f302a, iD2, bArr, 0, iD3);
        return bArr;
    }

    public static void f() {
        a.a(f298a);
        Graphics graphics = f298a;
        graphics.setClip(0, 0, f296a.getWidth(), f296a.getHeight());
        int width = f296a.getWidth();
        int height = f296a.getHeight() - 2;
        graphics.setFont(f295a);
        if (f289a != -1) {
            if (f291a != null) {
                graphics.drawImage(f291a, 2, height - f291a.getHeight(), 20);
            } else {
                int i2 = height - 1;
                graphics.setColor(0);
                graphics.drawString(f290a, 2, i2, 36);
                graphics.drawString(f290a, 3, i2 - 1, 36);
                graphics.drawString(f290a, 4, i2, 36);
                graphics.drawString(f290a, 3, i2 + 1, 36);
                graphics.setColor(16777215);
                graphics.drawString(f290a, 3, i2, 36);
            }
        }
        if (c != -1) {
            if (f293b != null) {
                graphics.drawImage(f293b, (width - 2) - f293b.getWidth(), height - f293b.getHeight(), 20);
            } else {
                int i3 = width - 2;
                int i4 = height - 1;
                graphics.setColor(0);
                graphics.drawString(f292b, i3 - 1, i4, 40);
                graphics.drawString(f292b, i3, i4 - 1, 40);
                graphics.drawString(f292b, i3 + 1, i4, 40);
                graphics.drawString(f292b, i3, i4 + 1, 40);
                graphics.setColor(16777215);
                graphics.drawString(f292b, i3, i4, 40);
            }
        }
        f296a.flushGraphics();
    }

    protected final void showNotify() {
        if (f288a) {
            f288a = false;
        } else {
            try {
                a.startApp();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(int i2, int i3, Image image, int i4) {
        f294a.put(new Integer(0 | i2), new Integer(i3));
        f294a.put(new Integer(16777216 | i2), m87a(i3));
        if (image != null) {
            f294a.put(new Integer(33554432 | i2), image);
        }
        f294a.put(new Integer(50331648 | i2), new Integer(i4));
    }

    private static void h() {
        if (h == 0 || f300a == null) {
            return;
        }
        try {
            if (f300a.getState() == 0) {
                f300a = a(g, i, h);
            } else {
                f300a.start();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static int m98e() {
        return f296a.getWidth();
    }

    public static void b(int i2, int i3) {
        if (h == 0 || i2 == -1) {
            return;
        }
        a((Player) null);
        m91d();
        i = i3;
        f300a = a(i2, i3, h);
        g = i2;
    }

    public static void b(String str, byte[] bArr) {
        h.f93b = true;
        h.c = true;
        if (f307b) {
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

    public static String c(int i2) {
        String str = null;
        int[][] iArr = {new int[]{-1, -2, -2, -2, -2}, new int[]{-1, -2, -2, -2, -1}, new int[]{-1, 462, -2, 463, 464}};
        String strM92b = m92b(22);
        if (strM92b != null) {
            String strM87a = m87a(iArr[2][Integer.parseInt(strM92b)]);
            str = strM87a;
            if (strM87a != null && str.length() == 1) {
                str = null;
            }
        }
        return str != null ? str : "";
    }

    public static void g() {
        a((Player) null);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m99b(int i2) {
        h = i2;
        if (i2 == 0) {
            m91d();
        } else {
            a(f300a);
            h();
        }
    }

    protected final void hideNotify() {
        try {
            a.pauseApp();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static Player m100a(int i2) {
        try {
            Player playerCreatePlayer = Manager.createPlayer(new ByteArrayInputStream(m96a(i2)), f299a[0]);
            playerCreatePlayer.addPlayerListener(f296a);
            return playerCreatePlayer;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m101a(String str) {
        f294a.put(new Integer(16777216), str);
        if (f289a == 0) {
            f290a = str;
        }
        if (c == 0) {
            f292b = str;
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static int m102c(int i2) {
        if (i2 == 1) {
            return f289a;
        }
        if (i2 == 3) {
            return c;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static void m103c(int i2) {
        if (i2 == 0) {
            for (int i3 = 0; i3 <= e; i3++) {
                a.a(f297a[i3], 1);
            }
            e = -1;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Font m104a(int i2, int i3) {
        if (i2 == 1) {
            i2 = 0;
        }
        return Font.getFont(32, i2, i3);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static v m105a() {
        if (f308a == null) {
            f308a = new v();
        }
        return f308a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static e m106a() {
        return new e();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static d m107a() {
        if (f309a == null) {
            f309a = new d();
        }
        return f309a;
    }

    static {
        String[] strArr = {".mid", ".wav", ".amr", ".mp3"};
        char[] cArr = {'#', 8722, '-'};
        int[] iArr = {65538, 65539, 65540, 65541};
    }
}
