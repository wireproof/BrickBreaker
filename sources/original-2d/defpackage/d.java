package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordStore;

/* JADX INFO: loaded from: original-2d.jar:d.class */
public final class d extends GameCanvas implements PlayerListener {
    private static c a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f75a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f76a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f77a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image f78a;
    private static int b;
    private static int c;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static String f79b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Image f80b;
    private static int d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Hashtable f81a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Font f82a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean f83b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static d f84a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final String[] f85a = {"audio/midi", "audio/wav", "audio/amr", "audio/mpeg"};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Player f86a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Player f87b;
    private static int e;
    private static int f;
    private static int g;
    private static int h;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static boolean f88c;
    private static int i;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static String f89c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static byte[] f90a;
    private static int j;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static String[] f91b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static String[] f92c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static boolean f93d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static e f94a;

    public d() {
        super(false);
        setFullScreenMode(true);
    }

    public final void keyPressed(int i2) {
        if (i2 == -6 || i2 == -6) {
            if (f76a != -1) {
                a.a(f76a, 3);
            }
        } else if (i2 != -7 && i2 != -7) {
            a.a(i2, 0);
        } else if (c != -1) {
            a.a(c, 3);
        }
    }

    private static void a(Player player) {
        if (player != null) {
            try {
                player.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int a() {
        return f84a.getHeight();
    }

    public static DataInputStream a(int i2) {
        if (i2 != -1) {
            return new DataInputStream(new ByteArrayInputStream(m24a(i2)));
        }
        return null;
    }

    public static byte[] a(String str) {
        c.m20b();
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
    public static boolean m22a() {
        return f88c;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m23a(int i2) {
        f = i2;
        if (f == 0) {
            m33d();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m24a(int i2) {
        byte[] bArrB = null;
        if (i2 != -1) {
            m27a(new StringBuffer().append("r").append(i2 >>> 16).toString());
            bArrB = b(i2 & 65535);
        }
        return bArrB;
    }

    private static Player a(int i2, int i3) {
        Player player = null;
        try {
            Player playerM36a = m36a(i2);
            player = playerM36a;
            if (playerM36a.getState() != 300) {
                player.prefetch();
            }
            player.setLoopCount(i3);
            VolumeControl control = player.getControl("VolumeControl");
            if (control != null) {
                control.setLevel(100);
            }
            player.start();
        } catch (Exception unused) {
        }
        return player;
    }

    private static byte[] b(int i2) {
        int length = f90a.length;
        int iM35b = m35b(4);
        int iM35b2 = m35b(8 + (i2 * 4));
        int iM35b3 = i2 == iM35b - 1 ? length - iM35b2 : m35b((8 + (i2 * 4)) + 4) - iM35b2;
        byte[] bArr = new byte[iM35b3];
        System.arraycopy(f90a, iM35b2, bArr, 0, iM35b3);
        return bArr;
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
    public static void m25a() {
        f83b = true;
        f84a.repaint();
        f84a.serviceRepaints();
        f83b = false;
    }

    public static void a(boolean z) {
        f93d = !z;
    }

    public final void showNotify() {
        try {
            a.startApp();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Image m26a(int i2) {
        Image imageCreateImage = null;
        if (i2 != -1) {
            byte[] bArrM24a = m24a(i2);
            imageCreateImage = Image.createImage(bArrM24a, 0, bArrM24a.length);
        }
        return imageCreateImage;
    }

    public static void b() {
        f76a = -1;
        f78a = null;
        f77a = null;
        c = -1;
        f80b = null;
        f79b = null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static void m27a(String str) {
        if (str.equals(f89c)) {
        }
        c.m20b();
        f89c = str;
        try {
            switch (i) {
                case 0:
                    f90a = new byte[4];
                    InputStream resourceAsStream = f84a.getClass().getResourceAsStream(str);
                    resourceAsStream.read(f90a, 0, 4);
                    int iM35b = m35b(0);
                    f90a = new byte[iM35b];
                    for (int i2 = 4; i2 < iM35b; i2 += resourceAsStream.read(f90a, i2, iM35b - i2)) {
                    }
                    resourceAsStream.close();
                    break;
                case 1:
                    f90a = a(str);
                    break;
            }
        } catch (Exception unused) {
            f89c = null;
            f90a = null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m28a(int i2) {
        int i3;
        if ((i2 >= 48 && i2 <= 57) || i2 == 42 || i2 == 35) {
            return i2;
        }
        int gameAction = 0;
        try {
            gameAction = f84a.getGameAction(i2);
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

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static int m29b() {
        return f82a.getHeight() + 2 + 2 + 2;
    }

    public static int c() {
        return g;
    }

    public static void a(int i2, int i3, Image image, int i4) {
        f81a.put(new Integer(0 | i2), new Integer(i3));
        f81a.put(new Integer(16777216 | i2), m30a(i3));
        if (image != null) {
            f81a.put(new Integer(33554432 | i2), image);
        }
        f81a.put(new Integer(50331648 | i2), new Integer(i4));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m30a(int i2) {
        String utf = null;
        if (i2 != -1) {
            try {
                m27a(new StringBuffer().append("l").append(j).append("_").append(i2 >>> 16).toString());
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(b(i2 & 65535)));
                utf = dataInputStream.readUTF();
                dataInputStream.close();
            } catch (Exception unused) {
            }
        }
        return utf;
    }

    public static void b(boolean z) {
        if (!z) {
            Display.getDisplay(a).vibrate(0);
        }
        f88c = z;
    }

    private static void g() {
        if (g == 0 || f87b == null) {
            return;
        }
        try {
            if (f87b.getState() == 0) {
                f87b = a(e, h);
            } else {
                f87b.start();
            }
        } catch (Exception unused) {
        }
    }

    public static int d() {
        return f84a.getWidth();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m31a(int i2, int i3) {
        if (g == 0 || i2 == -1) {
            return;
        }
        m33d();
        e();
        h = i3;
        f87b = a(i2, i3);
        e = i2;
    }

    public static void a(String str, byte[] bArr) {
        c.m20b();
        if (f93d) {
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

    public static void b(int i2, int i3) {
        String str = (String) f81a.get(new Integer(16777216 | i2));
        Image image = (Image) f81a.get(new Integer(33554432 | i2));
        int iIntValue = ((Integer) f81a.get(new Integer(50331648 | i2))).intValue();
        boolean z = true;
        int i4 = -1;
        if (i3 == 0) {
            if (iIntValue == 0 || iIntValue == 1) {
                if (f76a != -1) {
                    if (iIntValue < b) {
                        i4 = f76a;
                    } else {
                        z = false;
                    }
                }
            } else if (c == -1) {
                z = false;
            } else if (iIntValue > d) {
                i4 = c;
                z = false;
            }
            if (i4 != -1) {
                b();
                if (z) {
                    b(i4, 3);
                } else {
                    b(i4, 1);
                }
            }
        } else if (i3 != 1) {
            z = false;
        }
        if (z) {
            f76a = i2;
            f78a = image;
            f77a = str;
            b = iIntValue;
            return;
        }
        c = i2;
        f80b = image;
        f79b = str;
        d = iIntValue;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static void m32c() {
        if (f87b != null) {
            try {
                f87b.stop();
            } catch (Exception unused) {
            }
        }
    }

    public static void c(boolean z) {
        f84a.setFullScreenMode(z);
        if (!z) {
            f75a = true;
        } else {
            f75a = false;
            c.a((Displayable) f84a);
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static void m33d() {
        a(f86a);
        f86a = null;
    }

    public final void keyRepeated(int i2) {
        if (i2 == -6 || i2 == -6 || i2 == -7 || i2 == -7) {
            return;
        }
        a.a(i2, 2);
    }

    public final void paint(Graphics graphics) {
        if (f83b) {
            a.a(graphics);
            a(graphics);
        }
    }

    public final void playerUpdate(Player player, String str, Object obj) {
    }

    public final void keyReleased(int i2) {
        if (i2 == -6 || i2 == -6 || i2 == -7 || i2 == -7) {
            return;
        }
        a.a(i2, 1);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m34b(int i2) {
        g = i2;
        if (g == 0) {
            e();
        } else {
            a(f87b);
            g();
        }
    }

    private static String a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf(str2);
        return iIndexOf >= 0 ? new StringBuffer().append(str.substring(0, iIndexOf)).append(str3).append(str.substring(iIndexOf + str2.length())).toString() : str;
    }

    public static void c(int i2) {
        if (f88c) {
            Display.getDisplay(a).vibrate(i2);
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static int m35b(int i2) {
        return ((f90a[i2] & 255) << 24) | ((f90a[i2 + 1] & 255) << 16) | ((f90a[i2 + 2] & 255) << 8) | (f90a[i2 + 3] & 255);
    }

    public static void a(c cVar) {
        if (f84a == null) {
            f84a = new d();
        }
        a = cVar;
    }

    public static void e() {
        a(f87b);
        e = -1;
        f87b = null;
    }

    public final void hideNotify() {
        try {
            if (f75a) {
                return;
            }
            a.pauseApp();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static Player m36a(int i2) {
        try {
            Player playerCreatePlayer = Manager.createPlayer(new ByteArrayInputStream(m24a(i2)), f85a[m41f()]);
            playerCreatePlayer.addPlayerListener(f84a);
            return playerCreatePlayer;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void f() {
        c.m20b();
        f92c = new String[15];
        try {
            DataInputStream dataInputStream = new DataInputStream(f84a.getClass().getResourceAsStream("p"));
            while (true) {
                try {
                    f92c[dataInputStream.readByte() - 1] = dataInputStream.readUTF();
                } catch (EOFException unused) {
                    dataInputStream.close();
                    f91b = new String[1];
                    f91b[0] = m30a(1);
                    f81a = new Hashtable();
                    f76a = -1;
                    c = -1;
                    f82a = Font.getFont(32, 1, 8);
                }
            }
        } catch (Exception unused2) {
            f91b = new String[1];
            f91b[0] = m30a(1);
            f81a = new Hashtable();
            f76a = -1;
            c = -1;
            f82a = Font.getFont(32, 1, 8);
        }
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static int m37e() {
        return f;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static String m38b(int i2) {
        return f92c[i2 - 1];
    }

    private static void a(Graphics graphics) {
        graphics.setClip(0, 0, d(), a());
        int iA = a() - 2;
        graphics.setFont(f82a);
        if (f76a != -1) {
            if (f78a != null) {
                graphics.drawImage(f78a, 2, iA - f78a.getHeight(), 20);
            } else {
                int i2 = iA - 1;
                graphics.setColor(0);
                graphics.drawString(f77a, 2, i2, 36);
                graphics.drawString(f77a, 3, i2 - 1, 36);
                graphics.drawString(f77a, 4, i2, 36);
                graphics.drawString(f77a, 3, i2 + 1, 36);
                graphics.setColor(16777215);
                graphics.drawString(f77a, 3, i2, 36);
            }
        }
        if (c != -1) {
            if (f80b != null) {
                graphics.drawImage(f80b, (d() - 2) - f80b.getWidth(), iA - f80b.getHeight(), 20);
                return;
            }
            int iD = d() - 2;
            int i3 = iA - 1;
            graphics.setColor(0);
            graphics.drawString(f79b, iD - 1, i3, 40);
            graphics.drawString(f79b, iD, i3 - 1, 40);
            graphics.drawString(f79b, iD + 1, i3, 40);
            graphics.drawString(f79b, iD, i3 + 1, 40);
            graphics.setColor(16777215);
            graphics.drawString(f79b, iD, i3, 40);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static e m39a() {
        if (f94a == null) {
            f94a = new e();
        }
        return f94a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static h m40a() {
        return new h();
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    private static int m41f() {
        return 0;
    }

    static {
        String[] strArr = {".mid", ".wav", ".amr", ".mp3"};
    }
}
