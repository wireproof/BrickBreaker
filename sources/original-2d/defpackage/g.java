package defpackage;

import javax.microedition.io.Connector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

/* JADX INFO: loaded from: original-2d.jar:g.class */
public final class g implements CommandListener, Runnable {
    private static l[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static l f216a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f217a;
    private static String b;
    private static String c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f218a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Form f219a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static TextField f220a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Command f221a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Command f222b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static g f223a;

    public static void a(String str) {
        b = str;
    }

    /* JADX INFO: Removed unreachable split cross block B:60:0x01bd */
    public static int a(int i) {
        c.m20b();
        int i2 = 0;
        if (f218a == -1) {
            b();
            return 2;
        }
        if (a == null) {
            a();
        }
        if (f216a == null || f216a != a[f218a]) {
            if (f218a != 1) {
                f216a = a[f218a];
                f216a.a();
                return 0;
            }
            if (f216a == null) {
                return 0;
            }
            f216a = null;
            d.b();
            d.c(false);
            f220a = new TextField(d.m30a(347), "", 15, 3);
            f219a = new Form(d.m30a(348));
            f219a.append(f220a);
            f219a.append(b);
            f221a = new Command(d.m30a(339), 1, 0);
            f219a.addCommand(f221a);
            f222b = new Command(d.m30a(338), 2, 0);
            f219a.addCommand(f222b);
            if (f223a == null) {
                f223a = new g();
            }
            f219a.setCommandListener(f223a);
            c.a((Displayable) f219a);
            return 0;
        }
        if (f218a == 2) {
            try {
                f217a = f220a.getString();
                if (f217a == null || f217a.equals("")) {
                    f218a = 5;
                } else {
                    d.m25a();
                    MessageConnection messageConnectionOpen = Connector.open(new StringBuffer().append("sms://").append(f217a).toString());
                    TextMessage textMessageNewMessage = messageConnectionOpen.newMessage("text");
                    textMessageNewMessage.setAddress(new StringBuffer().append("sms://").append(f217a).toString());
                    textMessageNewMessage.setPayloadText(b);
                    messageConnectionOpen.send(textMessageNewMessage);
                    messageConnectionOpen.close();
                    f218a = 3;
                }
            } catch (Exception unused) {
                f218a = 4;
            }
        } else {
            int[] iArrM105a = f216a.m105a(i);
            if (iArrM105a != null) {
                if (f218a == 0) {
                    if (iArrM105a[1] == 5) {
                        i2 = 2;
                    } else {
                        f218a = 1;
                    }
                }
                if (f218a == 3 || f218a == 4) {
                    i2 = 1;
                }
                if (f218a == 5) {
                    f218a = 1;
                }
            }
        }
        if (i2 != 0) {
            b();
        }
        return i2;
    }

    private static void a() {
        if (c == null) {
            c = d.m30a(346);
        }
        a = new l[6];
        for (int i = 0; i < 6; i++) {
            String strM30a = null;
            int i2 = -1;
            int i3 = -1;
            if (i == 0) {
                strM30a = c;
                i2 = 1;
                i3 = 5;
            }
            if (i == 2) {
                strM30a = d.m30a(349);
            }
            if (i == 3) {
                strM30a = d.m30a(350);
                i2 = 1;
            }
            if (i == 4) {
                strM30a = d.m30a(352);
                i2 = 1;
            }
            if (i == 5) {
                strM30a = d.m30a(351);
                i2 = 1;
            }
            a[i] = c.a().mo17a();
            a[i].a(1, 1, 0);
            a[i].a(d.m30a(348), (Image) null);
            a[i].a(0, 1, strM30a, (Image[]) null, 0);
            a[i].b(d.d(), d.a());
            if (i2 != -1) {
                a[i].a(i2, 0);
            }
            if (i3 != -1) {
                a[i].a(i3, 1);
            }
        }
    }

    public static void a(Graphics graphics) {
        if (f216a != null) {
            f216a.a(graphics, 0, 0);
        }
    }

    public static void a(int i, int i2) {
        if (f216a != null) {
            f216a.c(i, i2);
        }
    }

    private static void b() {
        d.b();
        f218a = 0;
        a = null;
        f216a = null;
        b = null;
        c = null;
        f221a = null;
        f222b = null;
        f219a = null;
        f220a = null;
        f223a = null;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (f218a == 1) {
            if (command == f221a) {
                f218a = 2;
            } else {
                f218a = -1;
            }
            d.c(true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
