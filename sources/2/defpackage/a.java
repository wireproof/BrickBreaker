package defpackage;

/* JADX INFO: loaded from: bbr-2.jar:a.class */
public final class a {
    i a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int[][] f0a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int[][][] f1a;
    int[][] b;
    int[][] c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    h f2a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    as f3a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    boolean[] f4a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    p f5a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int f6a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    int f7b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    int f8c;
    int d;
    int e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int[] f9a = new int[21];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    av[] f10a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    m[] f11a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    y[] f12a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    s[] f13a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    t[] f14a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    boolean[] f15b;
    int f;
    int g;

    public a(p pVar) {
        this.f5a = pVar;
    }

    final void a(int i, az[] azVarArr, int i2, int i3) {
        this.f1a[i] = new int[a(azVarArr)][2];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            for (int i6 = 0; i6 < i2; i6++) {
                az azVar = azVarArr[(i5 * i2) + i6];
                if (azVar != null && azVar.g != null) {
                    this.f1a[i][i4][0] = i6;
                    this.f1a[i][i4][1] = i5;
                    i4++;
                }
            }
        }
    }

    private static int a(az[] azVarArr) {
        int i = 0;
        for (int i2 = 0; i2 < azVarArr.length; i2++) {
            if (azVarArr[i2] != null && azVarArr[i2].g != null) {
                i++;
            }
        }
        return i;
    }

    final void a(int i, az[] azVarArr) {
        int iA = a(azVarArr);
        this.b[i] = new int[iA];
        this.c[i] = new int[iA];
        int i2 = 0;
        for (az azVar : azVarArr) {
            if (azVar != null && azVar.g != null) {
                int i3 = azVar.r;
                int i4 = i3;
                if (i3 == 6) {
                    if (this.f5a.G) {
                        i4 = 5;
                        this.g++;
                    } else {
                        this.f++;
                    }
                } else if (i4 != 4) {
                    this.g++;
                }
                this.b[i][i2] = i4;
                this.c[i][i2] = azVar.eh;
                i2++;
            }
        }
    }

    public final int a(int i) {
        return this.f0a[i][1];
    }

    public final int b(int i) {
        return i == 0 ? this.d >> 1 : this.d;
    }

    public final int c(int i) {
        return i == 2 ? this.e : this.e >> 1;
    }
}
