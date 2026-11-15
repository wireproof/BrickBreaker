package defpackage;

import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.m3g.Background;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Transform;

/* JADX INFO: loaded from: sequel-3d-java.jar:m.class */
public final class m {
    private static Graphics3D a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Background f196a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Camera f197a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Transform f198a;
    private static Transform b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static float[] f199a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static float f200a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static float f201b = 45.0f;
    private static float c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f202a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int f203b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static int f204c;

    private m() {
    }

    public static final void a(int i, int i2) {
        new Hashtable();
        new Hashtable();
        new Group();
        a = Graphics3D.getInstance();
        Background background = new Background();
        f196a = background;
        background.setColorClearEnable(false);
        f196a.setDepthClearEnable(true);
        f202a = i;
        f203b = i2;
        f204c = i2;
        c = f202a / f204c;
        f197a = new Camera();
        f200a = f201b;
        f197a.setPerspective(f200a, c, 150.0f, 15000.0f);
        f198a = new Transform();
        b = new Transform();
        f199a = new float[16];
    }

    public static final Graphics3D a() {
        return a;
    }

    public static final void a(Object obj) {
        ((Graphics) obj).setClip(0, 0, f202a, f204c);
        a.bindTarget(obj, true, 0);
        a.clear(f196a);
        a.resetLights();
    }

    public static final void b(Object obj) {
        a.releaseTarget();
        ((Graphics) obj).setClip(0, 0, f202a, f203b);
    }

    public static final void a(float[] fArr) {
        b.set(f198a);
        b.invert();
        b.transform(fArr);
        f197a.getProjection(b);
        b.transform(fArr);
        fArr[0] = (((0.5f * f202a) * fArr[0]) / fArr[2]) + (f202a >> 1);
        fArr[1] = ((((-0.5f) * f204c) * fArr[1]) / fArr[2]) + (f204c >> 1);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final Transform m67a() {
        return f198a;
    }

    public static final void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = f4 - f;
        float f11 = f5 - f2;
        float f12 = f6 - f3;
        float fSqrt = 1.0f / ((float) Math.sqrt(((f10 * f10) + (f11 * f11)) + (f12 * f12)));
        float f13 = f10 * fSqrt;
        float f14 = f11 * fSqrt;
        float f15 = f12 * fSqrt;
        if (f13 < 1.0E-4f && f13 > -1.0E-4f) {
            f13 = 0.0f;
        }
        if (f14 < 1.0E-4f && f14 > -1.0E-4f) {
            f14 = 0.0f;
        }
        if (f15 < 1.0E-4f && f15 > -1.0E-4f) {
            f15 = 0.0f;
        }
        float fSqrt2 = 1.0f / ((float) Math.sqrt(((f13 * f13) + (f14 * f14)) + (f15 * f15)));
        float f16 = f13 * fSqrt2;
        float f17 = f14 * fSqrt2;
        float f18 = f15 * fSqrt2;
        float f19 = (f17 * 0.0f) - (f18 * f8);
        float f20 = (f18 * 0.0f) - (f16 * 0.0f);
        float f21 = (f16 * f8) - (f17 * 0.0f);
        float fSqrt3 = 1.0f / ((float) Math.sqrt(((f19 * f19) + (f20 * f20)) + (f21 * f21)));
        float f22 = f19 * fSqrt3;
        float f23 = f20 * fSqrt3;
        float f24 = f21 * fSqrt3;
        float f25 = (f23 * f18) - (f24 * f17);
        f199a[0] = f22;
        f199a[1] = f25;
        f199a[2] = -f16;
        f199a[3] = f;
        f199a[4] = f23;
        f199a[5] = (f24 * f16) - (f22 * f18);
        f199a[6] = -f17;
        f199a[7] = f2;
        f199a[8] = f24;
        f199a[9] = (f22 * f17) - (f23 * f16);
        f199a[10] = -f18;
        f199a[11] = f3;
        f199a[12] = 0.0f;
        f199a[13] = 0.0f;
        f199a[14] = 0.0f;
        f199a[15] = 1.0f;
        f198a.set(f199a);
        a.setCamera(f197a, f198a);
    }
}
