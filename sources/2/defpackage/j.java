package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:j.class */
public final class j {
    byte[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    byte f104a;

    public j(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        int i3 = i2 + 1;
        this.a = new byte[]{bArr[i], bArr[i2]};
        this.f104a = bArr[i3];
        iArr[0] = i3 + 1;
    }
}
