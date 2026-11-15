package defpackage;

import java.io.DataInputStream;

/* JADX INFO: loaded from: sequel-3d-java.jar:i.class */
public final class i {
    float[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    float f94a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    float j;

    public static final short a(DataInputStream dataInputStream) {
        short s = 0;
        for (int i = 0; i < 16; i += 8) {
            s = (short) (s | ((dataInputStream.readByte() & 255) << i));
        }
        return s;
    }

    final void a() {
        int length = this.a.length / 10;
        for (int i = 0; i < length; i++) {
            float[] fArr = this.a;
            int i2 = i * 10;
            fArr[i2] = fArr[i2];
            float[] fArr2 = this.a;
            int i3 = (i * 10) + 1;
            fArr2[i3] = fArr2[i3] * (-1.0f);
            float[] fArr3 = this.a;
            int i4 = (i * 10) + 2;
            fArr3[i4] = fArr3[i4];
            for (int i5 = 0; i5 < 4; i5++) {
                float f = this.a[(i * 10) + 3 + i5];
                float f2 = f;
                if (Math.abs(f) < 0.001f) {
                    f2 = 0.0f;
                }
                this.a[(i * 10) + 3 + i5] = f2;
            }
        }
    }
}
