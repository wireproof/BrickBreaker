package defpackage;

import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.m3g.Background;
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Graphics3D;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Transform;

/* JADX INFO: loaded from: bbr-3d.jar:e.class */
public final class e {
    private static Graphics3D a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Background f23a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static Camera f24a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Transform f25a;
    private static Transform b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static float[] f26a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static float f27a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static float f28b = 45.0f;
    private static float c;
    private static int h;
    private static int i;
    private static int j;

    private e() {
    }

    public static final void a(int i2, int i3) {
        new Hashtable();
        new Hashtable();
        new Group();
        a = Graphics3D.getInstance();
        Background background = new Background();
        f23a = background;
        background.setColorClearEnable(false);
        f23a.setDepthClearEnable(true);
        h = i2;
        i = i3;
        j = i3;
        c = h / j;
        f24a = new Camera();
        a(f28b);
        f25a = new Transform();
        b = new Transform();
        f26a = new float[16];
    }

    public static final Graphics3D a() {
        return a;
    }

    public static final void a(Object obj) {
        ((Graphics) obj).setClip(0, 0, h, j);
        a.bindTarget(obj, true, 0);
        a.clear(f23a);
        a.resetLights();
    }

    public static final void b(Object obj) {
        a.releaseTarget();
        ((Graphics) obj).setClip(0, 0, h, i);
    }

    public static final void a(float[] fArr) {
        b.set(f25a);
        b.invert();
        b.transform(fArr);
        f24a.getProjection(b);
        b.transform(fArr);
        fArr[0] = (((0.5f * h) * fArr[0]) / fArr[2]) + (h >> 1);
        fArr[1] = ((((-0.5f) * j) * fArr[1]) / fArr[2]) + (j >> 1);
    }

    public static final void a(float f) {
        f27a = f;
        f24a.setPerspective(f27a, c, 150.0f, 15000.0f);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final Transform m12a() {
        return f25a;
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
        float f19 = (f17 * f9) - (f18 * f8);
        float f20 = (f18 * 0.0f) - (f16 * f9);
        float f21 = (f16 * f8) - (f17 * 0.0f);
        float fSqrt3 = 1.0f / ((float) Math.sqrt(((f19 * f19) + (f20 * f20)) + (f21 * f21)));
        float f22 = f19 * fSqrt3;
        float f23 = f20 * fSqrt3;
        float f24 = f21 * fSqrt3;
        float f25 = (f23 * f18) - (f24 * f17);
        f26a[0] = f22;
        f26a[1] = f25;
        f26a[2] = -f16;
        f26a[3] = f;
        f26a[4] = f23;
        f26a[5] = (f24 * f16) - (f22 * f18);
        f26a[6] = -f17;
        f26a[7] = f2;
        f26a[8] = f24;
        f26a[9] = (f22 * f17) - (f23 * f16);
        f26a[10] = -f18;
        f26a[11] = f3;
        f26a[12] = 0.0f;
        f26a[13] = 0.0f;
        f26a[14] = 0.0f;
        f26a[15] = 1.0f;
        f25a.set(f26a);
        a.setCamera(f24a, f25a);
    }
}
