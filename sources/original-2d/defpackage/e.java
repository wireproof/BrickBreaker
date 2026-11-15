package defpackage;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDletStateChangeException;

/* JADX INFO: loaded from: original-2d.jar:e.class */
public final class e implements Runnable {
    private l a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private l[] f95a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f96a = d.m38b(10);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f97a;
    private int b;
    private int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f98a;
    private int d;
    private int e;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f99b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private boolean f100c;

    public e() {
        this.f97a = 0;
        this.f100c = this.f96a != null;
        this.f99b = !"nolink".equals(this.f96a);
        String strM38b = d.m38b(11);
        if (strM38b != null) {
            this.c = Integer.parseInt(strM38b) * 1000;
        }
        String strM38b2 = d.m38b(12);
        if (strM38b2 != null) {
            this.e = Integer.parseInt(strM38b2);
            if (this.e != 0) {
                byte[] bArrA = d.a("pc");
                byte[] bArr = bArrA;
                if (bArrA != null) {
                    this.d = bArr[0];
                } else {
                    bArr = new byte[1];
                }
                this.d++;
                bArr[0] = (byte) this.d;
                d.a(true);
                d.a("pc", bArr);
                if (this.d > this.e) {
                    this.f97a = 1;
                }
            }
        }
    }

    public final boolean a(int i) {
        if (!this.f100c) {
            return false;
        }
        if (i != 2) {
            if (i != 4) {
                return false;
            }
            this.f98a = false;
            this.f97a = 2;
            return true;
        }
        d.a(false);
        if (this.d > this.e) {
            this.f97a = 1;
            return true;
        }
        this.f97a = 0;
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.microedition.midlet.MIDletStateChangeException */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m42a(int i) throws MIDletStateChangeException {
        if (!this.f100c) {
            return 2;
        }
        int i2 = 0;
        boolean z = false;
        if (this.f95a == null) {
            a();
        }
        if (this.a == null || this.a != this.f95a[this.f97a]) {
            this.a = this.f95a[this.f97a];
            this.a.a();
        } else {
            int[] iArrM105a = this.a.m105a(i);
            if (iArrM105a != null) {
                if (iArrM105a[1] == 1) {
                    this.f98a = true;
                    i2 = 4;
                } else if (iArrM105a[1] == 24) {
                    c.a(this.f96a);
                    i2 = 3;
                    z = true;
                } else if (iArrM105a[1] == 5) {
                    this.f98a = true;
                    i2 = 4;
                } else if (iArrM105a[1] == 6) {
                    i2 = 3;
                    z = true;
                }
            }
        }
        if (i2 != 0) {
            this.f97a = 0;
            d.b();
            this.a = null;
            this.f95a = null;
        }
        if (z) {
            try {
                c.a().destroyApp(false);
            } catch (Exception unused) {
            }
        }
        return i2;
    }

    public final void a(Graphics graphics) {
        if (this.f100c && this.a != null) {
            this.a.a(graphics, 0, 0);
        }
    }

    public final void a(int i, int i2) {
        if (this.f100c && this.a != null) {
            this.a.c(i, i2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    private void a() {
        String strM30a;
        String string;
        String strM30a2;
        String strM30a3 = d.m30a(392);
        if (this.e > 0) {
            strM30a3 = new StringBuffer().append(strM30a3).append("\\n").append(d.a(d.m30a(395), new String[]{new StringBuffer().append("").append((this.e - this.d) + 1).toString()})).toString();
            strM30a = this.d > this.e ? d.m30a(394) : d.m30a(393);
        } else {
            strM30a = d.m30a(393);
        }
        if (this.f99b) {
            d.a(24, 390, null, 0);
            string = new StringBuffer().append(strM30a).append("\\n").append(d.m30a(396)).toString();
            strM30a2 = d.m30a(399);
        } else {
            string = new StringBuffer().append(strM30a).append("\\n").append(d.m30a(397)).toString();
            strM30a2 = d.m30a(397);
        }
        this.f95a = new l[3];
        this.f95a[0] = c.a().mo17a();
        this.f95a[0].a(1, 2, 0);
        this.f95a[0].a(d.m30a(391), (Image) null);
        this.f95a[0].a(1, 1, strM30a3, (Image[]) null, 0);
        this.f95a[0].a(1, 0);
        this.f95a[0].b(d.d(), d.a());
        this.f95a[1] = c.a().mo17a();
        this.f95a[1].a(1, 2, 0);
        this.f95a[1].a(d.m30a(391), (Image) null);
        this.f95a[1].a(1, 1, string, (Image[]) null, 0);
        if (this.f99b) {
            this.f95a[1].a(24, 0);
        }
        this.f95a[1].a(6, 1);
        this.f95a[1].b(d.d(), d.a());
        this.f95a[2] = c.a().mo17a();
        this.f95a[2].a(1, 2, 0);
        this.f95a[2].a(d.m30a(391), (Image) null);
        this.f95a[2].a(1, 1, strM30a2, (Image[]) null, 0);
        if (this.f99b) {
            this.f95a[2].a(24, 0);
        }
        if (this.d > this.e) {
            this.f95a[2].a(6, 1);
        } else {
            this.f95a[2].a(5, 1);
        }
        this.f95a[2].b(d.d(), d.a());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m43a(int i) {
        if (!this.f98a || this.c == 0) {
            return;
        }
        this.b += i;
        if (this.b > this.c) {
            this.f97a = 1;
            this.f98a = false;
            c.a().b(5);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String m44a() {
        if (this.f100c) {
            return d.m30a(398);
        }
        return null;
    }
}
