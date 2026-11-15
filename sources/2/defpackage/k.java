package defpackage;

import javax.microedition.lcdui.Graphics;

/* JADX INFO: loaded from: bbr-2.jar:k.class */
public final class k {
    public int aV;
    public int aW;
    public int aX = -1;
    int aY;
    private int aZ;
    public int ba;
    boolean[] c;
    int[] H;
    aa[] a;
    private aa[] b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    ay[] f105c;
    private boolean[] d;
    boolean[] e;
    ay h;
    int bb;
    private int bc;
    boolean j;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    aa f106d;
    ay i;
    int bd;
    private int be;
    private int bf;
    int bg;
    int bh;
    public int[][] f;
    private boolean k;
    public int bi;
    private int bj;
    private int bk;
    private int bl;
    private int bm;
    int bn;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private c f107a;
    private int bo;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private c f108b;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private aa f109e;
    private boolean l;
    int bp;
    int bq;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    ay f110j;
    private int br;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    boolean[] f111f;
    int[] I;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    aa[] f112c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private aa[] f113d;
    int[] J;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    ay[] f114d;
    private int bs;
    private int bt;
    private int bu;
    boolean[] g;
    int[] K;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    aa[] f115e;
    int[] L;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    ay[] f116e;
    boolean m;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    ay f117k;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    ay[] f118f;
    int bv;
    public boolean n;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    p f119a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private r f120a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    a f121a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public bc f122a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public af f123a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    z f124a;
    private int bw;
    private boolean o;
    private int[] M;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    z f125b;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    ay[] f126g;
    int bx;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    ay[][] f127a;
    int by;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    ay[] f128h;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    ay f129l;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    ay f130m;
    boolean p;
    int bz;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    ay[] f131i;
    int bA;
    private boolean q;
    int bB;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    z[] f132a;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    boolean[] f133h;
    int bC;
    private int bD;
    private int bE;
    public int bF;
    public int bG;
    public int bH;
    public int bI;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    String f134b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    String f135c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    String f136d;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    String[] f137c;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    ax f138j;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    ax f139k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    ax f140l;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    String f141e;
    private int bJ;
    int bK;
    int bL;
    private int bM;
    int bN;
    boolean r;
    boolean s;
    boolean t;
    int bO;
    int bP;
    int[] N;
    int[] O;
    int bQ;
    int bR;
    boolean u;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    String[] f142d;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    ay[] f143j;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    String[] f144e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    e f145a;
    int bS;
    private int bT;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    ay[] f146k;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private aa f147f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private aa f148g;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    String[][] f149c;
    private int bU;
    boolean v;
    int bV;
    private boolean w;
    int bW;
    int bX;
    private int bY;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private z f150c;

    public k(p pVar, r rVar, ax axVar, ax axVar2) {
        this.f119a = pVar;
        this.f120a = rVar;
        this.f121a = new a(this.f119a);
        this.f138j = axVar2;
        this.f139k = axVar;
        System.out.println("Init");
        this.f122a = new bc(this.f119a, this.f121a, this);
        this.f123a = new af(this.f119a, this);
        this.f132a = new z[10];
        for (int i = 0; i < this.f132a.length; i++) {
            this.f132a[i] = new z();
        }
        this.f150c = new z();
        this.f147f = new aa();
        this.f148g = new aa();
        this.f107a = new c();
        this.f109e = new aa();
        this.f108b = new c();
        this.f124a = new z();
        this.f125b = new z();
        this.f125b.j = new aa();
        this.f133h = new boolean[10];
        this.M = new int[10];
        this.f106d = new aa(0, 0);
    }

    public final int m() {
        if (this.n) {
            return 0;
        }
        return ((this.f119a.G || this.f119a.C) && this.f119a.a()[0] == 3) ? 20 : 30;
    }

    public final void h(int i) {
        if (i != 0) {
            if (i == 1 && this.f117k == null) {
                this.f117k = new ay(ar.a(1835021), false);
                this.f126g = new ay[3];
                this.f126g[0] = new ay(ar.a(1245230), true);
                this.f126g[1] = new ay(ar.a(1245215), true);
                this.f126g[2] = new ay(ar.a(2359304), true);
                this.f127a = new ay[7][10];
                this.f127a[0][0] = new ay(ar.a(1572869), true);
                this.f127a[0][1] = new ay(ar.a(1835027), true);
                this.f127a[0][2] = new ay(ar.a(1900570), true);
                this.f127a[0][3] = new ay(ar.a(1769480), true);
                this.f127a[0][4] = new ay(ar.a(2228228), true);
                this.f127a[0][5] = new ay(ar.a(1769497), true);
                this.f127a[0][6] = new ay(ar.a(1245210), true);
                this.f127a[0][7] = new ay(ar.a(1966118), true);
                this.f127a[0][8] = new ay(ar.a(1966113), true);
                this.f127a[0][9] = new ay(ar.a(1376266), true);
                this.f127a[1][0] = new ay(ar.a(1507333), true);
                this.f127a[1][1] = new ay(ar.a(1769491), true);
                this.f127a[1][2] = new ay(ar.a(1900572), true);
                this.f127a[1][3] = new ay(ar.a(1900577), true);
                this.f127a[1][4] = new ay(ar.a(1769495), true);
                this.f127a[1][5] = new ay(ar.a(1638400), true);
                this.f127a[1][6] = new ay(ar.a(2228226), true);
                this.f127a[1][7] = new ay(ar.a(1572875), true);
                this.f127a[1][8] = new ay(ar.a(1507351), true);
                this.f127a[1][9] = new ay(ar.a(1310761), true);
                this.f127a[2][0] = new ay(ar.a(2162689), true);
                this.f127a[2][1] = new ay(ar.a(1441811), true);
                this.f127a[2][2] = new ay(ar.a(1703950), true);
                this.f127a[2][3] = new ay(ar.a(1441797), true);
                this.f127a[2][4] = new ay(ar.a(1245219), true);
                this.f127a[2][5] = new ay(ar.a(2162700), true);
                this.f127a[2][6] = new ay(ar.a(1835010), true);
                this.f127a[2][7] = new ay(ar.a(2162704), true);
                this.f127a[2][8] = new ay(ar.a(2031650), true);
                this.f127a[2][9] = new ay(ar.a(2162695), true);
                this.f127a[3][0] = new ay(ar.a(1245221), true);
                this.f127a[3][1] = new ay(ar.a(1572888), true);
                this.f127a[3][2] = new ay(ar.a(1835013), true);
                this.f127a[3][3] = new ay(ar.a(1572906), true);
                this.f127a[3][4] = new ay(ar.a(2031624), true);
                this.f127a[3][5] = new ay(ar.a(1638434), true);
                this.f127a[3][6] = new ay(ar.a(2097160), true);
                this.f127a[3][7] = new ay(ar.a(1376258), true);
                this.f127a[3][8] = new ay(ar.a(1835036), true);
                this.f127a[3][9] = new ay(ar.a(1769488), true);
                this.f127a[4][0] = new ay(ar.a(2228237), true);
                this.f127a[4][1] = new ay(ar.a(2031631), true);
                this.f127a[4][2] = new ay(ar.a(1638403), true);
                this.f127a[4][3] = new ay(ar.a(1376262), true);
                this.f127a[4][4] = new ay(ar.a(1835033), true);
                this.f127a[4][5] = new ay(ar.a(1507352), true);
                this.f127a[4][6] = new ay(ar.a(1638417), true);
                this.f127a[4][7] = new ay(ar.a(1245208), true);
                this.f127a[4][8] = new ay(ar.a(1703968), true);
                this.f127a[4][9] = new ay(ar.a(1966096), true);
                this.f127a[5][0] = new ay(ar.a(2031634), true);
                this.f127a[5][1] = new ay(ar.a(1835032), true);
                this.f127a[5][2] = new ay(ar.a(2031618), true);
                this.f127a[5][3] = new ay(ar.a(1769493), true);
                this.f127a[5][4] = new ay(ar.a(1572901), true);
                this.f127a[5][5] = new ay(ar.a(1703965), true);
                this.f127a[5][6] = new ay(ar.a(2162706), true);
                this.f127a[5][7] = new ay(ar.a(1966082), true);
                this.f127a[5][8] = new ay(ar.a(1572891), true);
                this.f127a[5][9] = new ay(ar.a(1835028), true);
                this.f127a[6][0] = new ay(ar.a(2162693), true);
                this.f127a[6][1] = new ay(ar.a(1900553), true);
                this.f127a[6][2] = new ay(ar.a(2031636), true);
                this.f127a[6][3] = new ay(ar.a(2162702), true);
                this.f127a[6][4] = new ay(ar.a(1900581), true);
                this.f127a[6][5] = new ay(ar.a(1900564), true);
                this.f127a[6][6] = new ay(ar.a(1572877), true);
                this.f127a[6][7] = new ay(ar.a(1572887), true);
                this.f127a[6][8] = new ay(ar.a(1900544), true);
                this.f127a[6][9] = new ay(ar.a(1900574), true);
                this.f131i = new ay[8];
                this.f131i[0] = new ay(ar.a(1900568), false);
                this.f131i[1] = new ay(ar.a(1376282), false);
                this.f131i[2] = new ay(ar.a(1441795), false);
                this.f131i[3] = new ay(ar.a(2031640), false);
                this.f131i[4] = new ay(ar.a(2097164), false);
                this.f131i[5] = new ay(ar.a(2162699), false);
                this.f131i[6] = new ay(ar.a(1507341), false);
                this.f131i[7] = new ay(ar.a(1769472), false);
                this.f128h = new ay[3];
                this.f128h[0] = new ay(ar.a(1638402), true);
                this.f128h[1] = new ay(ar.a(1507335), true);
                this.f128h[2] = new ay(ar.a(2097158), true);
                this.f129l = new ay(ar.a(2359302), false);
                this.f130m = new ay(ar.a(2359303), true);
                this.f114d = new ay[3];
                this.f114d[0] = new ay(ar.a(1245202), false);
                this.f114d[1] = new ay(ar.a(2359311), false);
                this.f114d[2] = new ay(ar.a(1376275), false);
                this.f110j = new ay(ar.a(2359305), false);
                this.i = new ay(ar.a(2359298), false);
            } else if (i == 2 && this.f116e == null) {
                this.f116e = new ay[22];
                this.f116e[0] = new ay(ar.a(1703963), false);
                this.f116e[1] = new ay(ar.a(1245232), false);
                this.f116e[2] = new ay(ar.a(1376269), false);
                this.f116e[3] = new ay(ar.a(1638436), false);
                this.f116e[4] = new ay(ar.a(2031620), false);
                this.f116e[5] = new ay(ar.a(2162701), false);
                this.f116e[6] = new ay(ar.a(1507356), false);
                this.f116e[7] = new ay(ar.a(2228227), false);
                this.f116e[8] = new ay(ar.a(1703957), false);
                this.f116e[9] = new ay(ar.a(1572900), false);
                this.f116e[10] = new ay(ar.a(1572905), false);
                this.f116e[11] = new ay(ar.a(1835016), false);
                this.f116e[12] = new ay(ar.a(1966116), false);
                this.f116e[13] = new ay(ar.a(1835020), false);
                this.f116e[14] = new ay(ar.a(1441800), false);
                this.f116e[15] = new ay(ar.a(1703952), false);
                this.f116e[16] = new ay(ar.a(1703955), false);
                this.f116e[17] = new ay(ar.a(1310764), false);
                this.f116e[18] = new ay(ar.a(1245224), false);
                this.f116e[19] = new ay(ar.a(1900554), false);
                this.f116e[20] = new ay(ar.a(1966080), false);
                this.f116e[21] = new ay(ar.a(2031625), false);
            } else if (i == 3 && this.f105c == null && (this.f119a.G || !this.f119a.F)) {
                this.f105c = new ay[21];
                this.f105c[0] = new ay(ar.a(1572897), true);
                this.f105c[1] = new ay(ar.a(1900549), true);
                this.f105c[2] = new ay(ar.a(1835019), true);
                this.f105c[3] = new ay(ar.a(1703953), true);
                this.f105c[4] = new ay(ar.a(1769486), true);
                this.f105c[5] = new ay(ar.a(2293766), true);
                this.f105c[6] = new ay(ar.a(2228260), true);
                this.f105c[7] = new ay(ar.a(2228262), true);
                this.f105c[8] = new ay(ar.a(2228234), true);
                this.f105c[9] = new ay(ar.a(1376267), true);
                this.f105c[10] = new ay(ar.a(2359310), true);
                this.f105c[11] = new ay(ar.a(1441798), true);
                this.f105c[12] = new ay(ar.a(2228263), true);
                this.f105c[13] = new ay(ar.a(2228261), true);
                this.f105c[14] = new ay(ar.a(2293769), true);
                this.f105c[15] = new ay(ar.a(2031626), true);
                this.f105c[16] = new ay(ar.a(2293778), true);
                this.f105c[17] = new ay(ar.a(2293768), true);
                this.f105c[18] = new ay(ar.a(2228258), true);
                this.f105c[19] = new ay(ar.a(1966088), true);
                this.f105c[20] = new ay(ar.a(2293761), true);
                this.h = new ay(ar.a(1966097), true);
            } else if (i == 4 && this.c == null) {
                this.c = new boolean[5];
                this.H = new int[5];
                this.a = new aa[5];
                this.b = new aa[5];
                this.d = new boolean[5];
                this.e = new boolean[21];
                for (int i2 = 0; i2 < 5; i2++) {
                    this.a[i2] = new aa();
                    this.b[i2] = new aa();
                }
                this.f111f = new boolean[5];
                this.I = new int[5];
                this.f112c = new aa[5];
                this.f113d = new aa[5];
                this.J = new int[5];
                for (int i3 = 0; i3 < 5; i3++) {
                    this.f112c[i3] = new aa();
                    this.f113d[i3] = new aa();
                }
                this.g = new boolean[5];
                this.K = new int[5];
                this.f115e = new aa[5];
                this.L = new int[5];
                for (int i4 = 0; i4 < 5; i4++) {
                    this.f115e[i4] = new aa();
                }
            } else if (i == 5 && this.f118f == null && (this.f119a.G || !this.f119a.F)) {
                this.f118f = new ay[2];
                this.f118f[0] = new ay(ar.a(1835039), false);
                this.f118f[1] = new ay(ar.a(1572868), false);
            } else if (i == 6 && this.f137c == null && (this.f119a.G || !this.f119a.F)) {
                this.f137c = new String[21];
                this.f137c[0] = ba.c(61);
                this.f137c[1] = ba.c(62);
                this.f137c[2] = ba.c(63);
                this.f137c[3] = ba.c(64);
                this.f137c[4] = ba.c(65);
                this.f137c[5] = ba.c(68);
                this.f137c[6] = ba.c(69);
                this.f137c[7] = ba.c(67);
                this.f137c[8] = ba.c(66);
                this.f137c[9] = ba.c(70);
                this.f137c[10] = ba.c(81);
                this.f137c[11] = ba.c(71);
                this.f137c[12] = ba.c(73);
                this.f137c[13] = ba.c(74);
                this.f137c[14] = ba.c(75);
                this.f137c[15] = ba.c(72);
                this.f137c[16] = ba.c(79);
                this.f137c[17] = ba.c(80);
                this.f137c[18] = ba.c(76);
                this.f137c[19] = ba.c(78);
                this.f137c[20] = ba.c(77);
            } else if (i == 7 && this.f142d == null) {
                this.f142d = new String[5];
                this.f142d[0] = ba.c(327689);
                this.f142d[1] = ba.c(327685);
                this.f142d[2] = ba.c(327686);
                this.f142d[3] = ba.c(327687);
                this.f142d[4] = ba.c(327688);
                this.f134b = ba.c(54);
                this.f136d = ba.c(55);
            } else if (i == 8 && this.f143j == null) {
                this.f143j = new ay[8];
                this.f143j[0] = new ay(ar.a(2162709), true);
                this.f143j[1] = new ay(ar.a(1900578), true);
                this.f143j[2] = new ay(ar.a(1572883), true);
                this.f143j[3] = new ay(ar.a(1703939), true);
                this.f143j[4] = new ay(ar.a(2031651), true);
                this.f143j[5] = new ay(ar.a(1966117), true);
                this.f143j[6] = new ay(ar.a(1507337), true);
                this.f143j[7] = new ay(ar.a(2162714), true);
                this.f146k = new ay[2];
                this.f146k[0] = new ay(ar.a(2359307), true);
                this.f146k[1] = new ay(ar.a(2359308), true);
            } else if (i == 9 && this.f145a == null && (this.f119a.G || !this.f119a.F)) {
                this.f145a = new e();
                this.f145a.b(3, am.aq.length, 3);
                this.f144e = new String[am.aq.length];
                for (int i5 = 1; i5 < am.aq.length; i5++) {
                    this.f144e[i5] = ba.c(am.aq[i5]);
                }
                int iE = ba.E() - 10;
                this.f140l = this.f138j;
                this.f149c = new String[6][];
                this.f149c[0] = e.a(ba.c(56), this.f138j, iE);
                this.f149c[1] = e.a(ba.c(60), this.f138j, iE);
                this.f149c[2] = e.a(ba.c(57), this.f140l, iE);
                this.f149c[3] = e.a(ba.c(58), this.f140l, iE);
                this.f149c[4] = e.a(ba.c(59), this.f140l, iE);
                this.f149c[5] = e.a(ba.c(196623), this.f140l, iE);
            }
        }
        if (i >= 10) {
            if (this.f119a.a()[0] == 3) {
                af afVar = this.f123a;
                if (i - 10 == 0) {
                    afVar.h = new int[50][5];
                    afVar.dn = afVar.a.a()[2];
                    afVar.n = new ay[afVar.dn + 1];
                    int[] iArr = {2359325, 2359325, 2359318, 1376278, 2359323, 2359320, 2359316, 1966101, 2359322, 2359321, 2359324, 1835046, -1};
                    for (int i6 = 0; i6 < afVar.dn + 1; i6++) {
                        afVar.n[i6] = new ay(ar.a(iArr), true);
                    }
                    int iC = afVar.n[0].C();
                    afVar.n[0].b(7, -2, true);
                    afVar.co = afVar.n[0].getWidth() << 12;
                    afVar.cp = afVar.n[0].getHeight() << 12;
                    afVar.n[0].b(iC, -2, true);
                    return;
                }
                return;
            }
            bc bcVar = this.f122a;
            int i7 = i - 10;
            if (i7 == 0) {
                if (bcVar.f52a != null && bcVar.f52a[0][0][0] != null) {
                    for (int i8 = 0; i8 < 4; i8++) {
                        for (int i9 = 0; i9 < 3; i9++) {
                            for (int i10 = 0; i10 < 4; i10++) {
                                bcVar.f52a[i8][i9][i10].m();
                                bcVar.f52a[i8][i9][i10] = null;
                            }
                        }
                    }
                }
                bcVar.f52a = null;
            } else if (i7 == 1 && bcVar.b == null) {
                bcVar.b = new ay[am.A.length][];
                for (int i11 = 0; i11 < bcVar.b.length; i11++) {
                    bcVar.b[i11] = new ay[am.A[i11].length];
                    for (int i12 = 0; i12 < bcVar.b[i11].length; i12++) {
                        bcVar.b[i11][i12] = new ay(ar.a(am.A[i11][i12], true), true);
                    }
                }
            } else if (i7 == 2 && bcVar.o == null) {
                bcVar.o = new ay[am.as.length];
                for (int i13 = 0; i13 < bcVar.o.length; i13++) {
                    bcVar.o[i13] = new ay(ar.a(am.as[i13]), true);
                }
            } else if (i7 == 3 && bcVar.p == null && (bcVar.f54a.G || !bcVar.f54a.F)) {
                bcVar.p = new ay[7];
                bcVar.p[0] = new ay(ar.a(1572902, true), true);
                bcVar.p[1] = new ay(ar.a(1966104, true), true);
                bcVar.p[2] = new ay(ar.a(1638424, true), true);
                bcVar.p[3] = new ay(ar.a(1245222, true), false);
                bcVar.p[4] = new ay(ar.a(1507340, true), true);
                bcVar.p[5] = new ay(ar.a(1310763, true), true);
                bcVar.p[6] = new ay(ar.a(2490379, true), true);
            } else if (i7 == 4) {
                bcVar.f52a = new ay[4][3][4];
                int iS = bcVar.f54a.s();
                int i14 = bcVar.f54a.a()[3];
                for (int i15 = 0; i15 < 4; i15++) {
                    for (int i16 = 0; i16 < 3; i16++) {
                        for (int i17 = 0; i17 < 4; i17++) {
                            bcVar.f52a[i15][i16][i17] = new ay(ar.a(am.a[iS][i14][i15][i16][i17], true), false);
                        }
                    }
                }
            }
            if (i7 >= 10) {
                a aVar = bcVar.f55a;
                int i18 = i7 - 10;
                if (i18 == 0) {
                    aVar.f2a = new h();
                    return;
                }
                if (i18 == 1) {
                    aVar.f3a = new as(27525139, aVar.f2a);
                    return;
                }
                if (i18 == 2) {
                    aVar.a = new i(aVar.f5a.a()[2], aVar.f2a, aVar.f3a);
                    return;
                }
                if (i18 == 3) {
                    new f(27000834, aVar.f2a);
                    aVar.f2a = null;
                    aVar.f3a = null;
                    return;
                }
                if (i18 == 4) {
                    int i19 = aVar.f5a.a()[0];
                    int[] iArrB = aVar.f5a.b();
                    w[] wVarArr = aVar.a.a;
                    aVar.f4a = new boolean[wVarArr.length];
                    if (iArrB == null) {
                        for (int i20 = 0; i20 < aVar.f4a.length; i20++) {
                            aVar.f4a[i20] = true;
                        }
                    } else {
                        for (int i21 : iArrB) {
                            aVar.f4a[i21] = true;
                        }
                    }
                    aVar.f6a = 0;
                    for (int i22 = 0; i22 < aVar.f4a.length; i22++) {
                        if (aVar.f4a[i22] && wVarArr[i22].r != 4) {
                            aVar.f6a++;
                        }
                    }
                    if (i19 == 4 || i19 == 7) {
                        for (int i23 = 0; i23 < aVar.f4a.length; i23++) {
                            if (wVarArr[i23].r == 3) {
                                aVar.f4a[i23] = false;
                                aVar.f6a--;
                            }
                        }
                        return;
                    }
                    return;
                }
                if (i18 != 5) {
                    if (i18 == 6) {
                        aVar.f9a[0] = aVar.a.aA;
                        aVar.f9a[1] = aVar.a.aB;
                        aVar.f9a[2] = aVar.a.aC;
                        aVar.f9a[3] = aVar.a.aD;
                        aVar.f9a[4] = aVar.a.aJ;
                        aVar.f9a[5] = aVar.a.aE;
                        aVar.f9a[6] = aVar.a.aF;
                        aVar.f9a[7] = aVar.a.aG;
                        aVar.f9a[8] = aVar.a.aH;
                        aVar.f9a[9] = aVar.a.aI;
                        aVar.f9a[10] = aVar.a.aK;
                        aVar.f9a[11] = aVar.a.aL;
                        aVar.f9a[12] = aVar.a.aM;
                        aVar.f9a[13] = aVar.a.aN;
                        aVar.f9a[14] = aVar.a.aO;
                        aVar.f9a[15] = aVar.a.aP;
                        aVar.f9a[16] = aVar.a.aQ;
                        aVar.f9a[17] = aVar.a.aR;
                        aVar.f9a[18] = aVar.a.aS;
                        aVar.f9a[19] = aVar.a.aT;
                        aVar.f9a[20] = aVar.a.aU;
                        return;
                    }
                    return;
                }
                aVar.f0a = new int[aVar.f6a][2];
                aVar.f1a = new int[aVar.f6a][][];
                aVar.b = new int[aVar.f6a][];
                aVar.c = new int[aVar.f6a][];
                aVar.f = 0;
                aVar.g = 0;
                w[] wVarArr2 = aVar.a.a;
                int i24 = 0;
                for (int i25 = 0; i25 < wVarArr2.length; i25++) {
                    if (aVar.f4a[i25]) {
                        w wVar = wVarArr2[i25];
                        if (wVar.r != 4) {
                            if (wVar.r == 2) {
                                ak akVar = (ak) wVar.b;
                                aVar.f0a[i24][0] = 2;
                                aVar.f0a[i24][1] = akVar.dl;
                                aVar.a(i24, akVar.a, akVar.ac, akVar.ad);
                                aVar.a(i24, akVar.a);
                                aVar.d = akVar.di;
                                aVar.e = akVar.dj;
                                aVar.f7b = akVar.ac * akVar.di;
                                aVar.f8c = akVar.ad * akVar.dj;
                            } else if (wVar.r == 3) {
                                aq aqVar = (aq) wVar.b;
                                aVar.f0a[i24][0] = 3;
                                aVar.f0a[i24][1] = aqVar.dl;
                                aVar.a(i24, aqVar.a, aqVar.ac, aqVar.ad);
                                aVar.a(i24, aqVar.a);
                            } else if (wVar.r == 1) {
                                ad adVar = (ad) wVar.b;
                                aVar.f0a[i24][0] = 1;
                                aVar.f0a[i24][1] = adVar.dl;
                                aVar.a(i24, adVar.a, adVar.ac, adVar.ad);
                                aVar.a(i24, adVar.a);
                                aVar.d = adVar.di;
                                aVar.e = adVar.dj << 1;
                                aVar.f7b = adVar.ac * adVar.di;
                                aVar.f8c = adVar.ad * adVar.dj;
                            } else if (wVar.r == 0) {
                                ah ahVar = (ah) wVar.b;
                                aVar.f0a[i24][0] = 0;
                                aVar.f0a[i24][1] = ahVar.dl;
                                aVar.a(i24, ahVar.a, ahVar.ac, ahVar.ad);
                                aVar.a(i24, ahVar.a);
                                aVar.d = ahVar.di << 1;
                                aVar.e = ahVar.dj << 1;
                                aVar.f7b = ahVar.ac * ahVar.di;
                                aVar.f8c = ahVar.ad * ahVar.dj;
                            }
                            i24++;
                        }
                    }
                }
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                w[] wVarArr3 = aVar.a.a;
                for (int i31 = 0; i31 < wVarArr3.length; i31++) {
                    if (aVar.f4a[i31]) {
                        w wVar2 = wVarArr3[i31];
                        if (wVar2.r == 4) {
                            for (ac acVar : ((aj) wVar2.b).a) {
                                int i32 = acVar.r;
                                if (i32 == 0) {
                                    i26++;
                                } else if (i32 == 1) {
                                    i27++;
                                } else if (i32 == 2) {
                                    i28++;
                                } else if (i32 == 3) {
                                    i29++;
                                } else if (i32 == 4) {
                                    i30++;
                                }
                            }
                        }
                    }
                }
                aVar.f10a = new av[i26];
                aVar.f11a = new m[i27];
                aVar.f12a = new y[i28];
                aVar.f13a = new s[i29];
                aVar.f14a = new t[i30];
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                for (int i38 = 0; i38 < wVarArr3.length; i38++) {
                    if (aVar.f4a[i38]) {
                        w wVar3 = wVarArr3[i38];
                        if (wVar3.r == 4) {
                            ac[] acVarArr = ((aj) wVar3.b).a;
                            for (int i39 = 0; i39 < acVarArr.length; i39++) {
                                int i40 = acVarArr[i39].r;
                                if (i40 == 0) {
                                    int i41 = i33;
                                    i33++;
                                    aVar.f10a[i41] = (av) acVarArr[i39].a;
                                } else if (i40 == 1) {
                                    int i42 = i34;
                                    i34++;
                                    aVar.f11a[i42] = (m) acVarArr[i39].a;
                                } else if (i40 == 2) {
                                    int i43 = i35;
                                    i35++;
                                    aVar.f12a[i43] = (y) acVarArr[i39].a;
                                } else if (i40 == 3) {
                                    int i44 = i36;
                                    i36++;
                                    aVar.f13a[i44] = (s) acVarArr[i39].a;
                                } else if (i40 == 4) {
                                    int i45 = i37;
                                    i37++;
                                    aVar.f14a[i45] = (t) acVarArr[i39].a;
                                }
                            }
                        }
                    }
                }
                aVar.f15b = new boolean[aVar.f14a.length];
                w[] wVarArr4 = aVar.a.a;
                for (int i46 = 0; i46 < aVar.f14a.length; i46++) {
                    byte b = aVar.f14a[i46].b;
                    if (aVar.f4a[b]) {
                        aVar.f15b[i46] = true;
                        for (int i47 = 0; i47 < aVar.f14a[i46].b; i47++) {
                            w wVar4 = wVarArr4[i47];
                            if (!aVar.f4a[i47] || wVar4.r == 4) {
                                b = (byte) (b - 1);
                            }
                        }
                        aVar.f14a[i46].b = b;
                    }
                }
            }
        }
    }

    public final void i(int i) {
        int i2;
        int i3;
        boolean z;
        this.aY = i;
        if (!this.n) {
            this.bK = this.f119a.a()[0];
            if (this.aY == 0) {
                bc bcVar = this.f122a;
                int i4 = bcVar.f55a.f6a;
                bcVar.a = new z[i4][];
                bcVar.G = new int[i4][];
                bcVar.H = new int[i4][];
                for (int i5 = 0; i5 < i4; i5++) {
                    int length = bcVar.f55a.b[i5].length;
                    bcVar.a[i5] = new z[length];
                    bcVar.G[i5] = new int[length];
                    bcVar.H[i5] = new int[length];
                    int[][] iArr = bcVar.f55a.f1a[i5];
                    int iA = bcVar.f55a.a(i5);
                    int iB = bcVar.f55a.b(iA);
                    int iC = bcVar.f55a.c(iA);
                    for (int i6 = 0; i6 < length; i6++) {
                        bcVar.a[i5][i6] = new z(new aa((iArr[i6][0] * iB) << 12, (iArr[i6][1] * iC) << 12), new aa(0, 0), new aa(iB << 12, iC << 12));
                    }
                }
                for (int i7 = 0; i7 < 4; i7++) {
                    for (int i8 = 0; i8 < 3; i8++) {
                        for (int i9 = 0; i9 < 4; i9++) {
                            bcVar.f52a[i7][i8][i9].z(0);
                        }
                    }
                }
                bcVar.f57g = bcVar.f55a.g;
                bcVar.f = bcVar.f55a.f;
                bcVar.ew = (bcVar.f57g * bcVar.f54a.m42w()) / 100;
                av[] avVarArr = bcVar.f55a.f10a;
                m[] mVarArr = bcVar.f55a.f11a;
                y[] yVarArr = bcVar.f55a.f12a;
                t[] tVarArr = bcVar.f55a.f14a;
                bcVar.f53a = new c[mVarArr.length + yVarArr.length];
                int i10 = 0;
                for (int i11 = 0; i11 < mVarArr.length; i11++) {
                    byte[] bArr = mVarArr[i11].a;
                    bcVar.f53a[i10] = new c(new aa((bArr[0] * bcVar.f55a.b(0)) << 12, (bArr[1] * bcVar.f55a.c(0)) << 12), (mVarArr[i11].f152a * bcVar.f55a.b(0)) << 12, mVarArr[i11].b << 12, 0);
                    i10++;
                }
                for (int i12 = 0; i12 < yVarArr.length; i12++) {
                    byte[] bArr2 = yVarArr[i12].a;
                    bcVar.f53a[i10] = new c(new aa((bArr2[0] * bcVar.f55a.b(0)) << 12, (bArr2[1] * bcVar.f55a.c(0)) << 12), (yVarArr[i12].f177a * bcVar.f55a.b(0)) << 12, yVarArr[i12].b << 12, 1);
                    i10++;
                }
                bcVar.c = new z[tVarArr.length];
                int iB2 = bcVar.f55a.b(0);
                int iC2 = bcVar.f55a.c(0);
                boolean[] zArr = bcVar.f55a.f15b;
                for (int i13 = 0; i13 < bcVar.c.length; i13++) {
                    if (zArr[i13]) {
                        byte[] bArr3 = tVarArr[i13].a;
                        bcVar.c[i13] = new z(new aa((bArr3[0] * iB2) << 12, (bArr3[1] * iC2) << 12), new aa(0, 0), new aa(bcVar.p[2].getWidth() << 12, bcVar.p[2].getHeight() << 12));
                    }
                }
                bcVar.f58a = new boolean[i4];
                for (int i14 = 0; i14 < bcVar.f58a.length; i14++) {
                    bcVar.f58a[i14] = true;
                }
                for (int i15 = 0; i15 < tVarArr.length; i15++) {
                    if (zArr[i15]) {
                        bcVar.f58a[tVarArr[i15].b] = tVarArr[i15].Z;
                    }
                }
                bcVar.ex = -1;
                bcVar.ez = -1;
                bcVar.g = new aa[avVarArr.length];
                bcVar.l = new boolean[avVarArr.length];
                bcVar.aF = new int[avVarArr.length];
                bcVar.aG = new int[avVarArr.length];
                for (int i16 = 0; i16 < avVarArr.length; i16++) {
                    byte[] bArr4 = avVarArr[i16].a;
                    bcVar.g[i16] = new aa((bArr4[0] * bcVar.f55a.b(0)) << 12, (bArr4[1] * bcVar.f55a.c(0)) << 12);
                    bcVar.l[i16] = false;
                    bcVar.aF[i16] = 0;
                    bcVar.aG[i16] = 0;
                }
                bcVar.eA = 0;
                this.bF = this.f122a.f55a.f7b << 12;
                bc bcVar2 = this.f122a;
                this.bG = (bcVar2.f55a.f8c + (11 * bcVar2.f55a.c(0))) << 12;
            } else if (this.aY == 1) {
                af afVar = this.f123a;
                afVar.ag = false;
                afVar.dn = afVar.a.a()[2];
                afVar.dm = -1;
                afVar.h[0][0] = 0;
                afVar.h[0][3] = 2;
                for (int i17 = 0; i17 < afVar.dn; i17++) {
                    afVar.h[i17][1] = 0;
                    afVar.h[i17][2] = 0;
                }
                afVar.dq = 0;
                afVar.dr = 0;
                afVar.ds = 0;
                afVar.dt = 0;
                int i18 = afVar.dn - 1;
                int i19 = 1;
                if (i18 % 2 != 0) {
                    afVar.h[1][0] = 2;
                    afVar.h[1][3] = 4;
                    afVar.h[1][1] = 0;
                    afVar.h[1][2] = 1;
                    afVar.dt = 1;
                    i19 = 1 + 1;
                }
                int i20 = i18 / 2;
                int i21 = i19;
                int iJ = p.j(i19);
                int i22 = afVar.h[iJ][1] - 1;
                int i23 = afVar.h[iJ][2];
                int i24 = 0;
                int iS = afVar.a.s();
                int i25 = (i20 * am.i[iS][0]) / (am.i[iS][0] + am.i[iS][1]);
                int i26 = i20 - i25;
                for (int i27 = 0; i27 < i20; i27++) {
                    int i28 = p.j(100) < 70 ? 1 : 2;
                    if (i24 == i25) {
                        i28 = 1;
                    } else if (i27 - i24 >= i26) {
                        i28 = 2;
                    }
                    if (i28 == 2) {
                        i24++;
                    }
                    afVar.h[i19][0] = i28;
                    afVar.h[i19][3] = 4;
                    afVar.h[i19][1] = i22;
                    afVar.h[i19][2] = i23;
                    i19++;
                    while (true) {
                        int iJ2 = p.j(i19);
                        int i29 = afVar.h[iJ2][1];
                        int i30 = afVar.h[iJ2][2];
                        int i31 = p.j(100) > 60 ? 0 : 1;
                        int iJ3 = p.j(3) - 1;
                        if (iJ3 != 0) {
                            i31 = 0;
                        }
                        i2 = i29 - i31;
                        i3 = i30 - iJ3;
                        if (i2 != 0) {
                            afVar.dn = afVar.a.a()[2];
                            int i32 = 0;
                            while (true) {
                                if (i32 >= afVar.dn) {
                                    z = false;
                                    break;
                                } else {
                                    if (i2 == afVar.h[i32][1] && i3 == afVar.h[i32][2]) {
                                        z = true;
                                        break;
                                    }
                                    i32++;
                                }
                            }
                            if (!z && (afVar.dt - afVar.ds != 2 || (i3 <= afVar.dt && i3 >= afVar.ds))) {
                                break;
                            }
                        }
                    }
                    i22 = i2;
                    i23 = i3;
                    if (i3 < afVar.ds) {
                        afVar.ds = i23;
                    }
                    if (i23 > afVar.dt) {
                        afVar.dt = i23;
                    }
                }
                int i33 = i21;
                for (int i34 = i19; i34 < afVar.dn; i34++) {
                    afVar.h[i34][0] = afVar.h[i33][0];
                    afVar.h[i34][3] = afVar.h[i33][3];
                    afVar.h[i34][1] = -afVar.h[i33][1];
                    afVar.h[i34][2] = afVar.h[i33][2];
                    i33++;
                }
                for (int i35 = 1; i35 < afVar.dn; i35++) {
                    afVar.h[i35][4] = 7000 + p.j(7000);
                    int i36 = afVar.h[i35][1];
                    int i37 = afVar.h[i35][2];
                    if (i36 < afVar.dq) {
                        afVar.dq = i36;
                    } else if (i36 > afVar.dr) {
                        afVar.dr = i36;
                    }
                    if (i37 < afVar.ds) {
                        afVar.ds = i37;
                    } else if (i37 > afVar.dt) {
                        afVar.dt = i37;
                    }
                    afVar.n[i35].b(((afVar.h[i35][0] << 2) + afVar.h[i35][3]) - 1, -2, true);
                    afVar.n[i35].z(afVar.n[i35].r() - 1);
                }
                afVar.n[afVar.dn].b(12, -2, true);
                afVar.f17do = Math.max(4, (afVar.dr - afVar.dq) + 1 + 2) * afVar.co;
                afVar.dp = Math.max(ba.H() << 12, 5 * afVar.cp);
                int i38 = afVar.f17do >> 1;
                int i39 = (((-afVar.ds) + 1) * afVar.cp) + (afVar.cp >> 1);
                int iJ4 = p.j(65280);
                aa aaVar = new aa(ar.m(iJ4) * (afVar.co >> 12), ar.n(iJ4) * (afVar.cp >> 12));
                afVar.b = new z[afVar.dn];
                for (int i40 = 0; i40 < afVar.dn; i40++) {
                    int width = afVar.n[i40].getWidth() << 12;
                    int height = afVar.n[i40].getHeight() << 12;
                    afVar.b[i40] = new z(new aa((i38 + (afVar.h[i40][1] * afVar.co)) - (width >> 1), (i39 + (afVar.h[i40][2] * afVar.cp)) - (height >> 1)), aaVar, new aa(width, height));
                }
                this.bF = this.f123a.f17do;
                this.bG = this.f123a.dp;
            }
            g();
            this.bC = 0;
            this.n = true;
            this.r = false;
            this.s = false;
            this.v = false;
            this.t = false;
            this.p = false;
            this.bX = 0;
            if (this.bK == 4) {
                this.bL = 60000;
            } else if (this.bK == 7) {
                this.bL = 30000;
                this.bd = 3600000;
            }
            int i41 = this.f119a.a()[4];
            if (i41 <= 0 || this.f119a.i[i41]) {
                this.bS = 0;
            } else {
                this.bS = i41;
                int i42 = 0;
                for (int i43 = 1; i43 < am.aq.length; i43++) {
                    if (this.f119a.i[i43] || i43 == this.bS) {
                        i42++;
                    }
                }
                String string = new StringBuffer().append(ba.c(262152)).append(" (").append(i42).append("/").append(am.aq.length - 1).append(")").toString();
                for (int i44 = 1; i44 < am.aq.length; i44++) {
                    if (this.f119a.i[i44] || i44 == this.bS) {
                        e eVar = new e();
                        eVar.b(1, 1, 3);
                        eVar.e(6);
                        eVar.a(this.f138j, this.f139k, (ax) null, (ax) null);
                        eVar.f79v[0] = 1;
                        ay ayVarA = this.f143j[2].a();
                        if (i44 != this.bS) {
                            ayVarA.b(0, 1, true);
                            ayVarA.P();
                        }
                        eVar.a(string, ayVarA, 1);
                        eVar.a(0, 1, this.f144e[i44], (ay) null, 0);
                        e eVar2 = this.f145a;
                        int i45 = i44;
                        if (eVar2.f85w[i45] != -1) {
                            eVar2.f(i45);
                        }
                        eVar2.f85w[i45] = 7;
                        eVar2.f101a[i45] = eVar;
                    } else {
                        this.f145a.f(i44);
                    }
                }
                this.f145a.g(this.bS);
                this.f145a.b(0, 5, ba.E(), (ba.H() - ba.G()) - 5);
            }
            this.bT = 1000;
        }
        k();
        bd.f61b.aa();
    }

    private void j(int i) {
        this.bA = i;
        this.f125b.j.set(this.f127a[this.by][this.bA].m8a().ac << 12, this.f127a[this.by][this.bA].m8a().ad << 12);
    }

    private void g() {
        this.bA = 2;
        int[] iArrC = this.f119a.c();
        if (iArrC[0] == 16751365 || iArrC[0] == 4134657 || iArrC[0] == 3409153 || iArrC[0] == 10033) {
            this.by = 4;
        } else if (iArrC[0] == 16763397) {
            this.by = 3;
        } else if (iArrC[0] == 16776453) {
            this.by = 6;
        } else if (iArrC[0] == 3186944 || iArrC[0] == 210976) {
            this.by = 2;
        } else if (iArrC[0] == 2334719) {
            this.by = 1;
        } else if (iArrC[0] == 669400 || iArrC[0] == 1310779) {
            this.by = 0;
        } else if (iArrC[0] == 7864472 || iArrC[0] == 3342367) {
            this.by = 5;
        } else {
            this.by = 0;
        }
        int i = this.f127a[this.by][this.bA].m8a().ac;
        int i2 = this.f127a[this.by][this.bA].m8a().ad;
        z zVar = this.f125b;
        int i3 = this.bF >> 1;
        int i4 = this.bG - ((20 - (i2 >> 1)) << 12);
        zVar.dk = 3;
        zVar.a.set(i3, i4);
        zVar.h.set(i3, i4);
        zVar.i.set(0, 0);
        zVar.i.length();
        zVar.j.set(i << 12, i2 << 12);
        zVar.n = 53 << 12;
        zVar.G();
        this.f107a.a(this.f125b.a, (this.f121a.c(0) * 5) << 12, 5000 << 12, 1);
        this.f109e.set(0, 0);
        this.f108b.a(this.f109e, (this.f121a.c(0) * 30) << 12, 5000 << 12, 0);
        int height = (this.f126g[0].getHeight() >> 1) << 12;
        this.f124a.c(this.f125b.a.x, (this.f125b.a.y - (this.f125b.j.y / 2)) - height, 0, 0, height);
        this.f124a.af = true;
        this.q = true;
        this.bw = -1;
        for (int i5 = 0; i5 < this.M.length; i5++) {
            this.M[i5] = -1;
        }
        this.o = false;
        this.bs = 0;
        this.bu = 0;
        for (int i6 = 0; i6 < 5; i6++) {
            this.g[i6] = false;
            this.K[i6] = 21;
            this.f115e[i6].set(this.f124a.a.x, this.f124a.a.y);
            this.L[i6] = 0;
        }
        for (int i7 = 0; i7 < 10; i7++) {
            this.f133h[i7] = false;
        }
        for (int i8 = 0; i8 < 5; i8++) {
            this.f111f[i8] = false;
            this.I[i8] = 0;
            this.J[i8] = 0;
        }
        this.br = 0;
        this.bE = 0;
        int iE = this.bF - (ba.E() << 12);
        int iH = this.bG - (ba.H() << 12);
        this.bH = al.d(al.e(iE, this.f124a.a.x), this.bF);
        this.bI = al.d(al.e(iH, this.f124a.a.y), this.bG);
        for (int i9 = 0; i9 < 21; i9++) {
            this.e[i9] = false;
        }
        for (int i10 = 0; i10 < 5; i10++) {
            this.d[i10] = false;
            this.c[i10] = false;
        }
        h();
        this.bN = 600;
        this.f106d.set(0, 0);
        this.f135c = ba.a(this.f134b, new String[]{Integer.toString(this.f119a.m41v())});
        if (!this.f119a.G || this.p) {
            a(this.f135c);
            this.w = false;
        } else {
            a(ba.a(this.f136d, new String[]{Integer.toString(this.f119a.cC + 1)}));
            this.w = true;
        }
        this.ba = 0;
        this.f147f.set(0, 0);
        this.f148g.set(0, 0);
    }

    private void h() {
        this.bv = -1;
        this.bk = 0;
        this.bb = 0;
        this.bc = 0;
        if (this.bi > 0) {
            i();
        }
        this.bi = 0;
        if (this.bj > 0) {
            j();
        }
        this.bj = 0;
        this.bd = 0;
        this.be = 0;
        this.bf = 0;
        this.bg = 0;
        this.bh = 0;
        this.k = false;
        this.bl = 0;
        this.bn = 0;
        this.bo = 0;
        this.bp = 0;
        this.bq = 0;
        this.bx = 0;
        this.bz = -1;
        this.j = false;
    }

    private void i() {
        this.bi = 0;
        int i = this.f121a.f6a;
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = this.f121a.b[i2];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if ((this.f[i2][i3] == 4 || this.f[i2][i3] == 2 || this.f[i2][i3] == 1 || this.f[i2][i3] == 0) && iArr[i3] != -1) {
                    iArr[i3] = this.f[i2][i3];
                }
            }
        }
    }

    private void j() {
        this.bj = 0;
        int i = this.f121a.f6a;
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = this.f121a.b[i2];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if ((this.f[i2][i3] == 3 || this.f[i2][i3] == 2 || this.f[i2][i3] == 1 || this.f[i2][i3] == 0 || this.f[i2][i3] == 5) && iArr[i3] != -1) {
                    iArr[i3] = this.f[i2][i3];
                }
            }
        }
    }

    private void k(int i) {
        if (this.aY == 0) {
            this.f122a.m30a(this.f124a, i);
            this.f122a.b(this.f124a);
            for (int i2 = 0; i2 < 10; i2++) {
                if (this.f133h[i2]) {
                    this.f122a.m30a(this.f132a[i2], i);
                    this.f122a.b(this.f132a[i2]);
                    if (this.M[i2] == -1) {
                        this.M[i2] = this.f122a.a(this.f132a[i2]);
                        this.o = true;
                    }
                }
            }
            if (this.bw == -1) {
                this.bw = this.f122a.a(this.f124a);
                if (this.bw != -1) {
                    this.o = true;
                }
            }
        }
        if (this.o) {
            this.f122a.eA = 0;
            if ((this.aW & 16) != 0) {
                if (this.aY == 0) {
                    if (this.bw > -1) {
                        this.f122a.b(this.f124a, this.bw);
                        this.f124a.i.I();
                        if (this.be > 0) {
                            this.f124a.i.x(300 << 12);
                        } else {
                            this.f124a.i.x(190 << 12);
                        }
                    }
                    for (int i3 = 0; i3 < 10; i3++) {
                        if (this.f133h[i3] && this.M[i3] > -1) {
                            this.f122a.b(this.f132a[i3], this.M[i3]);
                            this.f132a[i3].i.I();
                            if (this.be > 0) {
                                this.f132a[i3].i.x(300 << 12);
                            } else {
                                this.f132a[i3].i.x(190 << 12);
                            }
                        }
                    }
                }
                this.bw = -1;
                this.o = false;
                for (int i4 = 0; i4 < 10; i4++) {
                    this.M[i4] = -1;
                }
            }
        }
        if (!this.e[0] || this.q || (this.aW & 16) == 0) {
            return;
        }
        a(1, this.f124a.a.x, this.f124a.a.y, 0, 0);
        this.j = true;
        this.i.y(0);
        this.f106d.set(this.f124a.a.x, this.f124a.a.y);
        this.f150c.c(this.f124a.a.x, this.f124a.a.y, 0, 0, (this.f121a.b(0) * 6) << 12);
        if (this.aY == 0) {
            this.f122a.a(this.f150c, 1);
        } else if (this.aY == 1) {
            this.f123a.a(this.f150c);
        }
        this.e[0] = false;
    }

    public final int g(int i) {
        int i2;
        int i3;
        int iJ;
        boolean z;
        boolean z2;
        int iJ2 = bd.f61b.J();
        this.u = false;
        if (this.aX == 9) {
            return 1;
        }
        this.aZ += iJ2;
        if (this.aZ < 16) {
            this.u = true;
            return 0;
        }
        int i4 = this.aZ;
        int i5 = i4;
        if (i4 > 250) {
            i5 = 250;
        }
        this.aZ = 0;
        if (this.m && this.bW >= 0) {
            this.u = true;
            return 0;
        }
        boolean zH = false;
        if (this.q) {
            this.f122a.eA = 0;
        }
        if (this.bT > 0) {
            this.bT -= i5;
            if (this.bT <= 0) {
                if (this.aY == 0) {
                    zH = this.f119a.G ? this.f120a.h(12) : this.bK == 7 ? this.f120a.h(6) : this.f120a.h(0);
                    if (this.f121a.f10a.length > 0) {
                        zH = this.f119a.G ? this.f120a.h(13) : this.f120a.h(1);
                    }
                    if (this.f121a.f14a.length > 0) {
                        zH = this.f119a.G ? this.f120a.h(15) : this.f120a.h(3);
                    }
                    if (this.f121a.f11a.length > 0 || this.f121a.f12a.length > 0) {
                        zH = this.f119a.G ? this.f120a.h(14) : this.f120a.h(2);
                    }
                }
                if (this.aY == 1) {
                    zH = this.f119a.G ? this.f120a.h(16) : this.f120a.h(5);
                }
            }
        }
        if (!this.f119a.G && this.bK != 3 && this.bK != 7 && this.bK != 4) {
            if (this.bY > this.f122a.ew && this.f122a.f57g <= this.f122a.ew) {
                zH = this.f120a.h(4);
                this.bX = 2000;
            }
            this.bY = this.f122a.f57g;
            this.bX -= i5;
        }
        if (zH) {
            this.f125b.i.x = 0;
            k();
        }
        int i6 = i5;
        if (!this.r) {
            if (this.aY == 0) {
                bc bcVar = this.f122a;
                int i7 = bcVar.f54a.a()[0];
                if (bcVar.f54a.G || i7 == 4 || i7 == 7) {
                    boolean z3 = false;
                    for (boolean z4 : bcVar.f55a.f15b) {
                        if (z4) {
                            z3 = true;
                        }
                    }
                    z2 = bcVar.f57g == 0 && !z3;
                } else {
                    z2 = bcVar.f == 0;
                }
                this.r = z2;
            } else if (this.aY == 1) {
                this.r = this.f123a.ag;
            }
            if (this.bk > 0) {
                i6 /= 4;
                this.bk -= i5;
            }
            this.bx -= i6;
            if (((this.aV & 1) != 0 && this.bh <= 0) || this.bl == -1) {
                int i8 = ((this.bl == -1 ? 1500 : this.bf > 0 ? 100 : 280) * 240) / 240;
                if (this.f125b.i.x > 0) {
                    this.f125b.i.x = 0;
                }
                this.f125b.i.x -= al.d((i8 * i5) << 12, 10 << 12);
                if (this.f125b.i.x < (-(i8 << 12))) {
                    this.f125b.i.x = -(i8 << 12);
                }
            } else if (((this.aV & 2) == 0 || this.bh > 0) && this.bl != 1) {
                if (this.f125b.i.x < 0) {
                    this.f125b.i.x += al.d((this.bf > 0 ? 100 : i5 * 280) << 12, 10 << 12);
                    if (this.f125b.i.x > 0) {
                        this.f125b.i.x = 0;
                    }
                }
                if (this.f125b.i.x > 0) {
                    this.f125b.i.x -= al.d((this.bf > 0 ? 100 : i5 * 280) << 12, 10 << 12);
                    if (this.f125b.i.x < 0) {
                        this.f125b.i.x = 0;
                    }
                }
            } else {
                int i9 = ((this.bl == 1 ? 1500 : this.bf > 0 ? 100 : 280) * 240) / 240;
                if (this.f125b.i.x < 0) {
                    this.f125b.i.x = 0;
                }
                this.f125b.i.x += al.d((i9 * i5) << 12, 10 << 12);
                if (this.f125b.i.x > (i9 << 12)) {
                    this.f125b.i.x = i9 << 12;
                }
            }
            if (this.bz > -1) {
                this.f131i[this.bz].n(i5);
                if (this.f131i[this.bz].h()) {
                    this.f131i[this.bz].y(0);
                    this.bz = -1;
                }
            }
            if (this.bl == -1 || this.bl == 1) {
                this.bm += i5;
                if (this.bm > 5) {
                    this.bm = 0;
                    a(2, this.f125b.a.x, this.f125b.a.y, 0, 0);
                }
            }
            if ((this.aW & 16) != 0 && this.q) {
                this.q = false;
                int i10 = 49152 + ((7680 * this.bD) / 300);
                this.f124a.i.x = ((ar.m(i10) * 190) * 240) / 240;
                this.f124a.i.y = ((ar.n(i10) * 190) * 240) / 240;
            }
            int i11 = i6;
            if (this.bb > 0) {
                this.bb -= i11;
                this.h.n(i11);
                this.bc += i11;
                if (this.aY == 0 && this.bc % 160 > 80) {
                    bc bcVar2 = this.f122a;
                    z zVar = this.f125b;
                    int i12 = zVar.a.x - (zVar.j.x >> 1);
                    int i13 = zVar.a.x + (zVar.j.x >> 1);
                    bcVar2.aA = false;
                    bcVar2.eB = 0;
                    bcVar2.eC = 0;
                    int i14 = bcVar2.f55a.f6a;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (bcVar2.f58a[i15]) {
                            int[] iArr = bcVar2.f55a.b[i15];
                            for (int i16 = 0; i16 < iArr.length; i16++) {
                                if (iArr[i16] != -1 && iArr[i16] != 4 && bcVar2.a[i15][i16].a.x > i12 && bcVar2.a[i15][i16].a.x < i13) {
                                    if (!bcVar2.aA) {
                                        bcVar2.eB = i15;
                                        bcVar2.eC = i16;
                                        bcVar2.aA = true;
                                    } else if (bcVar2.a[bcVar2.eB][bcVar2.eC].a.y < bcVar2.a[i15][i16].a.y) {
                                        bcVar2.eB = i15;
                                        bcVar2.eC = i16;
                                    }
                                }
                            }
                        }
                    }
                    if (bcVar2.aA) {
                        bcVar2.G[bcVar2.eB][bcVar2.eC] = 80;
                    }
                }
                if (this.bc > 500) {
                    this.bc = 0;
                    if (this.aY == 0) {
                        bc bcVar3 = this.f122a;
                        if (bcVar3.aA) {
                            int[] iArr2 = bcVar3.f55a.b[bcVar3.eB];
                            int[] iArr3 = bcVar3.f55a.c[bcVar3.eB];
                            int iA = bcVar3.f55a.a(bcVar3.eB);
                            int i17 = bcVar3.eB;
                            int i18 = bcVar3.eC;
                            if (iArr2[i18] != 4 && iArr2[i18] != 5) {
                                bcVar3.f56a.a(0, bcVar3.a[i17][i18].a.x, bcVar3.a[i17][i18].a.y, 0, 0);
                            }
                            if (iArr2[i18] == 3) {
                                iArr2[i18] = -1;
                                bcVar3.f56a.m(100);
                                bcVar3.d(bcVar3.a[i17][i18].a);
                                if (bcVar3.f56a.bi != 0 && bcVar3.f56a.f[i17][i18] == 4) {
                                    bcVar3.f57g++;
                                }
                            }
                            if (iArr2[i18] == 2) {
                                iArr2[i18] = 3;
                                bcVar3.f56a.m(100);
                                bcVar3.d(bcVar3.a[i17][i18].a);
                            }
                            if (iArr2[i18] == 1) {
                                iArr2[i18] = 2;
                                bcVar3.f56a.m(100);
                                bcVar3.d(bcVar3.a[i17][i18].a);
                            }
                            if (iArr2[i18] == 0) {
                                iArr2[i18] = 1;
                                bcVar3.f56a.m(100);
                                bcVar3.d(bcVar3.a[i17][i18].a);
                            }
                            if (iArr2[i18] == -1) {
                                bcVar3.f57g--;
                                bcVar3.H[i17][i18] = bcVar3.f52a[iArr3[i18]][iA][3].A();
                            }
                            if (iArr2[i18] == 6 && bcVar3.f57g <= bcVar3.ew) {
                                bcVar3.f56a.m(100);
                                iArr2[i18] = -1;
                                bcVar3.f--;
                                if (bcVar3.f == 0) {
                                    bcVar3.Y();
                                }
                            }
                            if (iArr2[i18] == 5) {
                                bcVar3.f56a.a(1, bcVar3.a[i17][i18].a.x, bcVar3.a[i17][i18].a.y, 0, 0);
                                iArr2[i18] = -1;
                                bcVar3.f57g--;
                                bcVar3.d.c(bcVar3.a[i17][i18].a.x, bcVar3.a[i17][i18].a.y, 0, 0, al.e(bcVar3.a[i17][i18].j.x, al.f(3, 2)));
                                bcVar3.a(bcVar3.d, 1);
                                bcVar3.f56a.m(20);
                            }
                        }
                    } else if (this.aY == 1) {
                        af afVar = this.f123a;
                        z zVar2 = this.f125b;
                        int i19 = zVar2.a.x - (zVar2.j.x >> 1);
                        int i20 = zVar2.a.x + (zVar2.j.x >> 1);
                        int i21 = -1;
                        for (int i22 = 0; i22 < afVar.dn; i22++) {
                            if (afVar.h[i22][3] > 0 && afVar.b[i22].a.x <= i20 && afVar.b[i22].a.x + afVar.b[i22].j.x >= i19 && (i21 == -1 || afVar.b[i22].a.y > afVar.b[i21].a.y || (afVar.b[i22].a.y == afVar.b[i21].a.y && ((afVar.b[i21].a.x > i19 && afVar.b[i21].a.x < i19 + ((i20 - i19) >> 1)) || (afVar.b[i21].a.x < i19 && afVar.b[i21].a.x + afVar.b[i21].j.x > i19 + ((i20 - i19) >> 1)))))) {
                                i21 = i22;
                            }
                        }
                        if (i21 != -1) {
                            afVar.a(i21, null);
                        }
                    }
                }
            }
            if (!this.r) {
                bc bcVar4 = this.f122a;
                if (bcVar4.eA > 10000) {
                    bcVar4.eA = 0;
                    z = true;
                } else {
                    z = false;
                }
                if (z && this.bK != 7) {
                    b(1, this.f125b.a.x, this.bI, 0, 125 << 12);
                    System.out.println("LASER!");
                }
            }
            int i23 = i6;
            if (this.bd > 0) {
                this.bd -= i23;
            }
            int i24 = i6;
            if (this.be > 0) {
                this.be -= i24;
                if (this.be <= 0) {
                    this.f124a.i.I();
                    this.f124a.i.x(190 << 12);
                    for (int i25 = 0; i25 < this.f133h.length; i25++) {
                        if (this.f133h[i25]) {
                            this.f132a[i25].i.I();
                            this.f132a[i25].i.x(190 << 12);
                        }
                    }
                }
            }
            int i26 = i6;
            if (this.bf > 0) {
                this.bf -= i26;
            }
            int i27 = i6;
            if (this.bg > 0) {
                this.bg -= i27;
            }
            int i28 = i6;
            if (this.bh > 0) {
                this.bh -= i28;
            }
            int i29 = i6;
            if (this.bi > 0) {
                this.bi -= i29;
                if (this.bi <= 0) {
                    i();
                }
            }
            int i30 = i6;
            if (this.bj > 0) {
                this.bj -= i30;
                if (this.bj <= 0) {
                    j();
                }
            }
            int i31 = i6;
            if (this.bn > 0) {
                this.bn -= i31;
            }
            int i32 = i6;
            if (this.bo > 0) {
                this.bo -= i32;
                if (this.l) {
                    this.l = false;
                    this.f109e.set(0, 0);
                    int i33 = this.f124a.a.x >> 12;
                    int i34 = this.f124a.a.y >> 12;
                    int i35 = ((i33 + 1000) * (i33 + 1000)) + ((i34 + 1000) * (i34 + 1000));
                    int i36 = this.f121a.f6a;
                    boolean z5 = false;
                    for (int i37 = 0; i37 < i36; i37++) {
                        int[] iArr4 = this.f121a.b[i37];
                        int[][] iArr5 = this.f121a.f1a[i37];
                        int iA2 = this.f121a.a(i37);
                        int iB = this.f121a.b(iA2);
                        int iC = this.f121a.c(iA2);
                        for (int i38 = 0; i38 < iArr4.length; i38++) {
                            if (iArr4[i38] == 3 || iArr4[i38] == 2 || iArr4[i38] == 1 || iArr4[i38] == 0) {
                                int i39 = iArr5[i38][0] * iB;
                                int i40 = iArr5[i38][1] * iC;
                                int i41 = ((i33 - i39) * (i33 - i39)) + ((i34 - i40) * (i34 - i40));
                                if (i41 < i35) {
                                    this.f109e.set(i39 << 12, i40 << 12);
                                    i35 = i41;
                                    z5 = true;
                                }
                            }
                        }
                    }
                    if (!z5) {
                        this.bo = 0;
                    }
                }
                if (this.bo <= 0) {
                    this.f124a.i.I();
                    this.f124a.i.x(190 << 12);
                }
            }
            int i42 = i6;
            if (this.bp > 0) {
                this.bp -= i42;
            }
            int i43 = i6;
            if (this.bq > 0) {
                this.bq -= i43;
            }
            if (this.j) {
                this.i.n(i6);
                if (this.i.h()) {
                    this.i.y(0);
                    this.j = false;
                }
            }
            a(this.f124a.a, i6);
            for (int i44 = 0; i44 < 10; i44++) {
                if (this.f133h[i44]) {
                    a(this.f132a[i44].a, i6);
                }
            }
            this.ba += i6;
            if (!this.p) {
                boolean z6 = false;
                while (this.ba > 13) {
                    if (this.aY == 0) {
                        boolean zA = false;
                        if (this.bp > 0) {
                            this.f122a.az = false;
                        }
                        z zVar3 = this.f124a;
                        int i45 = 0;
                        boolean z7 = true;
                        do {
                            if (z7) {
                                zA = this.bd > 0 ? this.f122a.a(zVar3, 2) : this.f122a.a(zVar3, 0);
                                if (this.bp > 0 && this.f122a.az) {
                                    this.k = true;
                                }
                            }
                            zVar3 = this.f132a[i45];
                            z7 = this.f133h[i45];
                            i45++;
                        } while (i45 < this.f133h.length);
                        if (zA) {
                            z6 = true;
                        }
                    }
                    this.f124a.n(13);
                    if (this.f124a.a(this.f125b) && !this.q) {
                        this.bx = 50;
                    }
                    for (int i46 = 0; i46 < 10; i46++) {
                        if (this.f133h[i46]) {
                            this.f132a[i46].n(13);
                            if (this.f132a[i46].a(0, this.bF, this.bG) == 4) {
                                this.f133h[i46] = false;
                                this.f132a[i46].G();
                            }
                            if (this.f132a[i46].a(this.f125b)) {
                                this.bx = 50;
                            }
                        }
                    }
                    if (this.bo > 0) {
                        if (this.bw == -1) {
                            aa aaVarA = this.f108b.a(this.f124a.a, this.f124a.i, this.f124a.i.length(), 13);
                            this.f124a.i.set(aaVarA.x, aaVarA.y);
                            int i47 = this.be > 0 ? 300 << 12 : 190 << 12;
                            if (this.f124a.i.length() > i47) {
                                this.f124a.i.I();
                                this.f124a.i.x(i47);
                            }
                            if (this.f124a.i.x == 0 && this.f124a.i.y == 0) {
                                this.f124a.i.y = 190 << 12;
                                System.out.println("HOMING BALL SPEED IS ZERO !");
                            }
                        }
                        for (int i48 = 0; i48 < this.f133h.length; i48++) {
                            if (this.f133h[i48] && this.M[i48] == -1) {
                                aa aaVarA2 = this.f108b.a(this.f132a[i48].a, this.f132a[i48].i, this.f132a[i48].i.length(), 13);
                                this.f132a[i48].i.set(aaVarA2.x, aaVarA2.y);
                                int i49 = this.be > 0 ? 300 << 12 : 190 << 12;
                                if (this.f124a.i.length() > i49) {
                                    this.f132a[i48].i.I();
                                    this.f132a[i48].i.x(i49);
                                }
                                if (this.f132a[i48].i.x == 0 && this.f132a[i48].i.y == 0) {
                                    this.f132a[i48].i.y = 190 << 12;
                                }
                            }
                        }
                    }
                    if (this.bn > 0) {
                        aa aaVarA3 = this.f107a.a(this.f124a.a, this.f124a.i, this.f124a.i.length(), 13);
                        this.f124a.i.set(aaVarA3.x, aaVarA3.y);
                        for (int i50 = 0; i50 < 10; i50++) {
                            if (this.f133h[i50]) {
                                aa aaVarA4 = this.f107a.a(this.f132a[i50].a, this.f132a[i50].i, this.f132a[i50].i.length(), 13);
                                this.f132a[i50].i.set(aaVarA4.x, aaVarA4.y);
                            }
                        }
                    }
                    boolean z8 = false;
                    if ((this.f124a.a(0, this.bF, this.bG) == 4 || this.k) && !this.p && this.bK != 7) {
                        z8 = true;
                        for (int i51 = 0; i51 < 10; i51++) {
                            if (this.f133h[i51] && z8) {
                                this.f124a.G();
                                this.f124a.c(this.f132a[i51].a.x, this.f132a[i51].a.y, this.f132a[i51].i.x, this.f132a[i51].i.y, this.f132a[i51].n);
                                this.f133h[i51] = false;
                                z8 = false;
                            }
                        }
                        if (this.k) {
                            z8 = true;
                        }
                        if (z8) {
                            this.p = true;
                            this.f129l.y(0);
                            if (this.f119a.m41v() == 1 && this.bK != 7) {
                                this.f135c = ba.a(this.f134b, new String[]{"0"});
                                a(this.f135c);
                            }
                        }
                    }
                    if (z8) {
                        break;
                    }
                    if (this.bo > 0 && z6) {
                        this.l = true;
                    }
                    this.ba -= 13;
                }
            }
            if (this.p) {
                this.f129l.n(i5);
                if (this.f129l.h()) {
                    if (this.bi > 0) {
                        i();
                    }
                    if (this.bj > 0) {
                        j();
                    }
                    if (this.bK == 7) {
                        this.r = true;
                    } else if (this.f119a.f()) {
                        this.r = true;
                        this.v = true;
                        this.bg = 0;
                        this.bU = 8000;
                        if (this.f119a.G) {
                            this.bV = 0;
                        } else if (this.f119a.b[this.f119a.cw][this.f119a.cv][0] == 2) {
                            this.bV = 2;
                        } else {
                            this.bV = 5;
                        }
                        l();
                    } else {
                        g();
                    }
                    this.p = false;
                }
            }
            this.f125b.n(i5);
            int i52 = this.q ? this.f125b.j.x / 4 : 0;
            if (this.f125b.a.x < i52) {
                this.f125b.a.x = i52;
                if (this.bl == -1) {
                    this.bl = 0;
                    this.f125b.i.x = 0;
                }
            } else if (this.f125b.a.x > this.bF - i52) {
                this.f125b.a.x = this.bF - i52;
                if (this.bl == 1) {
                    this.bl = 0;
                    this.f125b.i.x = 0;
                }
            }
            if (this.q) {
                if (this.f125b.i.x < 0 && this.f125b.a.x > (this.f125b.j.x >> 1)) {
                    if (this.bD > 0) {
                        this.bD = 0;
                    }
                    this.bD = Math.max(-300, this.bD - i5);
                } else if (this.f125b.i.x > 0 && this.f125b.a.x < this.bF - (this.f125b.j.x >> 1)) {
                    if (this.bD < 0) {
                        this.bD = 0;
                    }
                    this.bD = Math.min(300, this.bD + i5);
                } else if (this.bD < 0) {
                    this.bD += i5;
                    if (this.bD > 0) {
                        this.bD = 0;
                    }
                } else if (this.bD > 0) {
                    this.bD -= i5;
                    if (this.bD < 0) {
                        this.bD = 0;
                    }
                }
                this.f124a.a.x = this.f125b.a.x;
            }
            if (this.r) {
                for (int i53 = 0; i53 < 5; i53++) {
                    this.c[i53] = false;
                    this.d[i53] = false;
                }
                h();
            }
        } else if (this.v) {
            if (this.bV != 3 && this.bV != 4) {
                this.bU -= i5;
                if (this.bU < 0) {
                    if (this.bV != 2 && this.bV != 5) {
                        return 2;
                    }
                    this.f119a.m38s();
                    return 2;
                }
            } else if (this.aX == 1 || (this.aW & 16) != 0) {
                this.f119a.r();
                return (this.f119a.G || this.bV != 3) ? 2 : 3;
            }
        } else if (this.s) {
            for (int i54 = 0; i54 < this.f143j.length; i54++) {
                this.f143j[i54].n(i5);
            }
            if (this.t) {
                int[] iArrA = this.f145a.a(i5);
                if (iArrA != null && iArrA[0] == 0) {
                    if (iArrA[1] != 1) {
                        return 1;
                    }
                    this.f119a.r();
                    return 2;
                }
            } else if (this.bO > 0) {
                this.bO -= i5;
                if (this.aX == 14 || (this.aW & 16) != 0) {
                    this.bO = 0;
                    this.bP = 1000;
                }
                if (this.bO <= 0) {
                    this.bO = 0;
                    l();
                }
            } else if (!this.f119a.G && this.bP < 1000) {
                this.bP += i5;
                if (this.aX == 14 || (this.aW & 16) != 0) {
                    this.bP = 1000;
                }
                if (this.bP >= 1000) {
                    this.bP = 1000;
                    l();
                }
            } else if (this.aX == 38 || this.aX == 1 || (this.aW & 16) != 0) {
                this.f119a.m(this.bC);
                if (this.bS > 0) {
                    this.t = true;
                    l();
                } else {
                    if (!(this.f119a.G && this.f119a.cC == am.j.length - 1) && (this.f119a.G || !this.f119a.E || this.f119a.F)) {
                        this.f119a.r();
                        return 2;
                    }
                    this.r = true;
                    this.v = true;
                    this.s = false;
                    if (this.f119a.G || !this.f119a.E || this.f119a.F || this.f119a.cz == 3) {
                        this.bV = 3;
                    } else {
                        this.bV = 4;
                    }
                    l();
                }
            }
        } else {
            this.bE += i5;
            if (this.bE > 1000) {
                this.s = true;
                if (this.bC > 0) {
                    this.bO = 2000;
                    this.bP = 0;
                } else {
                    this.bO = 0;
                    this.bP = 1000;
                }
                l();
            }
        }
        if (this.aY == 0) {
            if (!this.v) {
                bc bcVar5 = this.f122a;
                int i55 = i5;
                for (int i56 = 0; i56 < 4; i56++) {
                    for (int i57 = 0; i57 < 3; i57++) {
                        for (int i58 = 0; i58 < 4; i58++) {
                            bcVar5.f52a[i56][i57][i58].n(i55);
                        }
                    }
                }
                for (int i59 = 0; i59 < bcVar5.b.length; i59++) {
                    for (int i60 = 0; i60 < bcVar5.b[i59].length; i60++) {
                        bcVar5.b[i59][i60].n(i55);
                    }
                }
                for (int i61 = 0; i61 < bcVar5.l.length; i61++) {
                    if (bcVar5.l[i61]) {
                        int[] iArr6 = bcVar5.aF;
                        int i62 = i61;
                        iArr6[i62] = iArr6[i62] + i55;
                    } else if (bcVar5.aF[i61] > 0) {
                        int[] iArr7 = bcVar5.aF;
                        int i63 = i61;
                        iArr7[i63] = iArr7[i63] - i55;
                    }
                }
                if (bcVar5.p != null) {
                    for (int i64 = 0; i64 < bcVar5.p.length; i64++) {
                        bcVar5.p[i64].n(i55);
                    }
                    if (bcVar5.p[3].h()) {
                        bcVar5.ex = -1;
                    }
                }
                int i65 = bcVar5.f55a.f6a;
                for (int i66 = 0; i66 < i65; i66++) {
                    if (bcVar5.f58a[i66]) {
                        int length = bcVar5.f55a.b[i66].length;
                        for (int i67 = 0; i67 < length; i67++) {
                            int[] iArr8 = bcVar5.G[i66];
                            int i68 = i67;
                            iArr8[i68] = iArr8[i68] - i55;
                            int[] iArr9 = bcVar5.H[i66];
                            int i69 = i67;
                            iArr9[i69] = iArr9[i69] - i55;
                        }
                    }
                }
                if (bcVar5.ez >= 0) {
                    if (bcVar5.f58a[bcVar5.ez]) {
                        bcVar5.ey += i55;
                        if (bcVar5.ey > bcVar5.f52a[0][0][0].A()) {
                            bcVar5.ez = -1;
                        }
                    } else {
                        bcVar5.ey -= i55;
                        if (bcVar5.ey < 0) {
                            bcVar5.ez = -1;
                        }
                    }
                }
                bcVar5.eA += i55;
            }
            if (!this.r) {
                k(i6);
                if (!this.q && !this.p && (this.bK == 4 || this.bK == 7)) {
                    this.bL -= i5;
                    this.bM = this.bL + 999;
                    if (this.bL < 0) {
                        this.r = true;
                        h();
                        if (this.bK != 7) {
                            this.v = true;
                            this.bU = 8000;
                            this.bV = 1;
                            l();
                        }
                    }
                }
            }
        } else if (this.aY == 1 && !this.r) {
            this.f123a.a(this.f124a);
            for (int i70 = 0; i70 < this.f133h.length; i70++) {
                if (this.f133h[i70]) {
                    this.f123a.a(this.f132a[i70]);
                }
            }
            af afVar2 = this.f123a;
            int i71 = i6;
            boolean z9 = false;
            for (int i72 = 0; i72 < afVar2.dn; i72++) {
                afVar2.b[i72].n(i71);
                if (afVar2.h[i72][3] > 0) {
                    if (afVar2.b[i72].a(0, afVar2.f17do, afVar2.dp - (2 * afVar2.cp)) != 0) {
                        z9 = true;
                    }
                    int[] iArr10 = afVar2.h[i72];
                    iArr10[4] = iArr10[4] + i71;
                    if ((afVar2.h[i72][0] == 2 || afVar2.h[i72][0] == 0) && afVar2.h[i72][4] > 14000) {
                        k kVar = afVar2.f16a;
                        int i73 = 0;
                        for (int i74 = 0; i74 < am.aj.length; i74++) {
                            if (afVar2.f16a.c(am.ai[i74]) || (am.ai[i74] == 20 && afVar2.dm == -1)) {
                                afVar2.ah[i74] = 0;
                            } else {
                                afVar2.ah[i74] = am.aj[i74];
                            }
                            i73 += afVar2.ah[i74];
                        }
                        int iJ3 = i73 > 0 ? p.j(i73) : 0;
                        int i75 = 0;
                        int i76 = 0;
                        while (true) {
                            if (i76 >= afVar2.ah.length) {
                                i3 = am.ai[0];
                                break;
                            }
                            int i77 = i75 + afVar2.ah[i76];
                            i75 = i77;
                            if (i77 >= iJ3) {
                                i3 = am.ai[i76];
                                break;
                            }
                            i76++;
                        }
                        kVar.b(i3, (afVar2.b[i72].j.x >> 1) + afVar2.b[i72].a.x, (afVar2.b[i72].j.y >> 1) + afVar2.b[i72].a.y, afVar2.s.x, afVar2.s.y);
                        afVar2.h[i72][4] = 7000 + p.j(7000);
                    }
                }
            }
            if (z9) {
                int iJ4 = p.j(65280);
                int iM = ar.m(iJ4) * (afVar2.co >> 12);
                int iN = ar.n(iJ4) * (afVar2.cp >> 12);
                for (int i78 = 0; i78 < afVar2.dn; i78++) {
                    afVar2.b[i78].i.x = iM;
                    afVar2.b[i78].i.y = iN;
                }
            }
            for (int i79 = 0; i79 < afVar2.n.length; i79++) {
                afVar2.n[i79].n(i71);
            }
            for (int i80 = 0; i80 < afVar2.dn; i80++) {
                if (afVar2.h[i80][3] == 0 && afVar2.h[i80][0] == 0) {
                    afVar2.ag = true;
                    for (int i81 = 0; i81 < afVar2.dn; i81++) {
                        if (afVar2.h[i81][3] > 0) {
                            afVar2.h[i81][3] = -1;
                            afVar2.f16a.a(0, afVar2.b[i81].a.x + ((afVar2.n[i81].getWidth() >> 1) << 12), afVar2.b[i81].a.y + ((afVar2.n[i81].getHeight() >> 1) << 12), afVar2.b[i81].i.x, afVar2.b[i81].i.y);
                        }
                    }
                    afVar2.h[i80][3] = -1;
                }
                if (afVar2.h[i80][3] == 0) {
                    afVar2.f16a.a(0, afVar2.b[i80].a.x + ((afVar2.n[i80].getWidth() >> 1) << 12), afVar2.b[i80].a.y + ((afVar2.n[i80].getHeight() >> 1) << 12), afVar2.b[i80].i.x, afVar2.b[i80].i.y);
                    if (afVar2.h[i80][0] != 0) {
                        k kVar2 = afVar2.f16a;
                        int i82 = 0;
                        for (int i83 = 0; i83 < am.al.length; i83++) {
                            if (afVar2.f16a.c(am.ak[i83])) {
                                afVar2.f18ag[i83] = 0;
                            } else {
                                afVar2.f18ag[i83] = am.al[i83];
                            }
                            i82 += afVar2.f18ag[i83];
                        }
                        int iJ5 = p.j(i82);
                        int i84 = 0;
                        int i85 = 0;
                        while (true) {
                            if (i85 >= afVar2.f18ag.length) {
                                i2 = am.ak[0];
                                break;
                            }
                            int i86 = i84 + afVar2.f18ag[i85];
                            i84 = i86;
                            if (i86 >= iJ5) {
                                i2 = am.ak[i85];
                                break;
                            }
                            i85++;
                        }
                        kVar2.b(i2, afVar2.b[i80].a.x, afVar2.b[i80].a.y, afVar2.s.x, afVar2.s.y);
                    }
                    afVar2.dm = i80;
                    afVar2.h[i80][3] = -1;
                }
            }
            k(i5);
        }
        this.f126g[0].n(i5);
        this.f126g[1].n(i5);
        this.f126g[2].n(i5);
        this.f130m.n(i5);
        if (this.bv >= 0) {
            this.f118f[this.bv].n(i5);
            if (this.f118f[this.bv].h()) {
                this.bv = -1;
            }
        }
        if (this.bN < 600) {
            this.bN += i5;
        }
        if (this.f141e != null) {
            this.bJ -= i5;
            if (this.bJ < 0) {
                this.f141e = null;
                if (this.w) {
                    a(this.f135c);
                    this.w = false;
                }
            }
        }
        int i87 = i6;
        int iE = ba.E() << 12;
        int iH = ba.H() << 12;
        int i88 = this.bF - iE;
        int i89 = this.bG - iH;
        int i90 = i89;
        if (i89 < 0) {
            i90 = 0;
        }
        boolean z10 = false;
        z zVar4 = this.f124a;
        for (int i91 = 0; i91 < this.f133h.length; i91++) {
            if (this.f133h[i91]) {
                z10 = true;
                if (zVar4.a.y < this.f132a[i91].a.y) {
                    zVar4 = this.f132a[i91];
                }
            }
        }
        if (z10) {
            this.f147f.a(this.f125b.a);
        } else {
            this.f147f.a(zVar4.a);
            this.f148g.a(zVar4.i);
            this.f148g.x(al.f(1, 4));
            this.f147f.b(this.f148g);
        }
        this.f147f.x = this.f147f.x > this.bF ? this.bF : this.f147f.x;
        this.f147f.y = this.f147f.y > this.bG ? this.bG : this.f147f.y;
        this.f147f.x = this.f147f.x < 0 ? 0 : this.f147f.x;
        this.f147f.y = this.f147f.y < 0 ? 0 : this.f147f.y;
        int iD = al.d(al.e(i88, this.f147f.x), this.bF);
        if (this.r && (!this.v || this.bV == 3 || this.bV == 4)) {
            iD = (this.bF - iE) >> 1;
            iJ = this.bG - ((iH * 12) / 8);
        } else if (zVar4.a.y < (iH << 1) / 3) {
            iJ = 0;
        } else {
            iJ = zVar4.a.y < this.bG - ((iH << 1) / 3) ? zVar4.a.y - (iH / 3) : i90;
        }
        if (this.bB > 0) {
            this.bB -= i87;
            iD = (iD + p.j(15)) - 7;
            iJ = (iJ + p.j(15)) - 7;
        }
        int i92 = iD - this.bH;
        int i93 = iJ - this.bI;
        int iD2 = al.d(al.e(iE, i87 << 12), 1500 << 12);
        int iD3 = al.d(al.e(iH, i87 << 12), 1500 << 12);
        int i94 = i92 > 0 ? i92 > iD2 ? iD2 : i92 : i92 < (-iD2) ? -iD2 : i92;
        int i95 = i93 > 0 ? i93 > iD3 ? iD3 : i93 : i93 < (-iD3) ? -iD3 : i93;
        if (this.bF > iE) {
            this.bH += i94;
        }
        this.bI += i95;
        int i96 = i6;
        for (int i97 = 0; i97 < 5; i97++) {
            if (this.f111f[i97]) {
                this.f112c[i97].f((this.f113d[i97].x * i96) / 1000, (this.f113d[i97].y * i96) / 1000);
                int[] iArr11 = this.J;
                int i98 = i97;
                iArr11[i98] = iArr11[i98] + i96;
                if (this.J[i97] > this.f114d[this.I[i97]].A()) {
                    this.f111f[i97] = false;
                }
            }
        }
        if (!this.r) {
            int i99 = i6;
            for (int i100 = 0; i100 < 5; i100++) {
                if (this.d[i100]) {
                    l(this.H[i100]);
                    this.c[i100] = false;
                    this.d[i100] = false;
                } else if (this.c[i100]) {
                    this.a[i100].f((this.b[i100].x * i99) / 1000, (this.b[i100].y * i99) / 1000);
                    if (this.a[i100].x + (15 << 12) > this.f125b.a.x - (this.f125b.j.x >> 1) && this.a[i100].x - (15 << 12) < this.f125b.a.x + (this.f125b.j.x >> 1) && this.a[i100].y + (15 << 12) > this.f125b.a.y - (this.f125b.j.y >> 1) && this.a[i100].y - (15 << 12) < this.f125b.a.y + (this.f125b.j.y >> 1) && !this.p) {
                        this.d[i100] = true;
                    }
                    if (this.a[i100].y - (15 << 12) > this.bG) {
                        this.c[i100] = false;
                    }
                }
            }
            if (this.f105c != null) {
                for (int i101 = 0; i101 < this.f105c.length; i101++) {
                    if (this.f105c[i101] != null) {
                        this.f105c[i101].n(i99);
                    }
                }
            }
        }
        this.aX = -1;
        this.aV &= -17;
        this.aW &= -17;
        this.u = true;
        return 0;
    }

    private void k() {
        this.aX = -1;
        this.aV = 0;
        this.aW = 0;
    }

    public final void l() {
        ba.U();
        switch (this.aY) {
            case 0:
            case 1:
                if (!this.s) {
                    if (this.v && (this.bV == 3 || this.bV == 4)) {
                        ba.h(1, 0);
                    } else if (!this.v || (this.bV != 0 && this.bV != 2 && this.bV != 5 && this.bV != 1)) {
                        ba.h(9, 0);
                    }
                } else if (this.bO > 0 || (!this.f119a.G && this.bP < 1000)) {
                    ba.h(14, 0);
                } else if (!this.t && this.bS > 0) {
                    ba.h(38, 0);
                } else if (!this.t) {
                    ba.h(1, 0);
                } else {
                    this.f145a.d();
                }
                break;
        }
    }

    public final void a(Graphics graphics, ay ayVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        ayVar.z(0);
        int i7 = ayVar.m8a().ac;
        int i8 = i2 - i7;
        int i9 = i;
        if (i == 0) {
            i5 = 1;
        } else {
            int i10 = 0;
            while (i9 > 0) {
                i9 /= 10;
                i10++;
            }
            i5 = i10;
        }
        int i11 = i8 + ((i5 * i7) >> 1);
        do {
            ayVar.z(i % 10);
            ayVar.c(graphics, i11, i3);
            i11 -= i7;
            i6 = i / 10;
            i = i6;
        } while (i6 != 0);
    }

    private void a(aa aaVar, int i) {
        this.bs += i;
        if (this.bs > 5) {
            this.bs = 0;
            if (this.bd > 0) {
                this.K[this.bu] = 0 + this.bt;
                this.bt++;
                if (this.bt > 20) {
                    this.bt = 0;
                }
            } else {
                this.K[this.bu] = 21;
            }
            this.f115e[this.bu].a(aaVar);
            this.L[this.bu] = 0;
            this.g[this.bu] = true;
            this.bu++;
            if (this.bu >= 5) {
                this.bu = 0;
            }
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (this.g[i2]) {
                int[] iArr = this.L;
                int i3 = i2;
                iArr[i3] = iArr[i3] + i;
                if (this.L[i2] > this.f116e[this.K[i2]].A()) {
                    this.g[i2] = false;
                }
            }
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5) {
        this.I[this.br] = i;
        this.f112c[this.br].set(i2, i3);
        this.f113d[this.br].set(i4, i5);
        this.J[this.br] = 0;
        this.f111f[this.br] = true;
        this.br++;
        if (this.br >= 5) {
            this.br = 0;
        }
    }

    public final void b(int i, int i2, int i3, int i4, int i5) {
        int i6 = -1;
        for (int i7 = 0; i7 < 5; i7++) {
            if (!this.c[i7]) {
                i6 = i7;
                break;
            }
        }
        if (i6 != -1) {
            this.H[i6] = i;
            this.a[i6].set(i2, i3);
            this.b[i6].set(i4, i5);
            this.c[i6] = true;
        }
    }

    public final boolean c(int i) {
        for (int i2 = 0; i2 < 5; i2++) {
            if (this.c[i2] && this.H[i2] == i) {
                return true;
            }
        }
        if (i == 12) {
            if (this.bd > 0) {
                return true;
            }
            for (int i3 = 0; i3 < 5; i3++) {
                if (this.c[i3] && (this.H[i3] == i || this.H[i3] == 2)) {
                    return true;
                }
            }
            return false;
        }
        if (i == 2) {
            if (this.bp > 0) {
                return true;
            }
            for (int i4 = 0; i4 < 5; i4++) {
                if (this.c[i4] && (this.H[i4] == i || this.H[i4] == 12)) {
                    return true;
                }
            }
            return false;
        }
        if (i != 7) {
            return i == 18 && this.bj != 0;
        }
        if (this.bi != 0) {
            return true;
        }
        int i5 = this.f121a.f6a;
        for (int i6 = 0; i6 < i5; i6++) {
            int[] iArr = this.f121a.b[i6];
            for (int i7 = 0; i7 < iArr.length; i7++) {
                if (iArr[i7] == 4 || iArr[i7] == 2 || iArr[i7] == 1 || iArr[i7] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    final void l(int i) {
        switch (i) {
            case 1:
                this.bb = 5000;
                break;
            case 2:
                this.bd = 7000;
                break;
            case 3:
                int i2 = 0;
                for (int i3 = 0; i3 < 10; i3++) {
                    if (!this.f133h[i3] && i2 < 2) {
                        i2++;
                        this.f133h[i3] = true;
                        int length = this.f124a.i.length();
                        int i4 = length;
                        if (length == 0) {
                            i4 = 190 << 12;
                        }
                        this.f132a[i3].a.a(this.f124a.a);
                        this.f132a[i3].n = this.f124a.n;
                        this.f132a[i3].af = true;
                        int iJ = p.j(256) << 8;
                        this.f132a[i3].i.x = al.e(ar.m(iJ), i4);
                        this.f132a[i3].i.y = al.e(ar.n(iJ), i4);
                    }
                }
                break;
            case 4:
                this.bk = 12000;
                break;
            case 5:
                this.bn = 15000;
                break;
            case 6:
                this.bo = 5000;
                this.l = true;
                if (this.q) {
                    this.q = false;
                }
                break;
            case 7:
                if (this.bi <= 0) {
                    this.bi = 12000;
                    if (this.bj > 0) {
                        j();
                    }
                    int i5 = this.f121a.f6a;
                    this.f = new int[i5][];
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        int[] iArr = this.f121a.b[i6];
                        this.f[i6] = new int[iArr.length];
                        for (int i7 = 0; i7 < iArr.length; i7++) {
                            this.f[i6][i7] = iArr[i7];
                            if (iArr[i7] == 4 || iArr[i7] == 2 || iArr[i7] == 1 || iArr[i7] == 0) {
                                z = false;
                                iArr[i7] = 3;
                            }
                        }
                    }
                    if (z) {
                        this.bi = 0;
                        i();
                    }
                } else {
                    this.bi = 12000;
                }
                break;
            case 8:
                this.f119a.w();
                this.f135c = ba.a(this.f134b, new String[]{Integer.toString(this.f119a.m41v())});
                a(this.f135c);
                break;
            case 9:
                this.bA--;
                if (this.bA < 0) {
                    this.bA = 0;
                } else if (this.bA == 0) {
                    this.bz = 7;
                } else if (this.bA == 1) {
                    this.bz = 6;
                } else if (this.bA == 2) {
                    this.bz = 5;
                } else if (this.bA == 3) {
                    this.bz = 4;
                }
                j(this.bA);
                break;
            case 10:
                this.bq = 15000;
                break;
            case 11:
                this.be = 5000;
                this.f124a.i.I();
                this.f124a.i.x(300 << 12);
                for (int i8 = 0; i8 < this.f133h.length; i8++) {
                    if (this.f133h[i8]) {
                        this.f132a[i8].i.I();
                        this.f132a[i8].i.x(300 << 12);
                    }
                }
                break;
            case 12:
                this.bp = 8000;
                break;
            case 13:
                this.bh = 2500;
                break;
            case 14:
                if (this.f125b.a.x > (this.bF >> 1)) {
                    this.bl = -1;
                } else {
                    this.bl = 1;
                }
                break;
            case 15:
                this.bf = 5000;
                break;
            case 16:
                this.bg = 2200;
                break;
            case 17:
                this.k = true;
                break;
            case 18:
                if (this.bj <= 0) {
                    this.bj = 10000;
                    if (this.bi > 0) {
                        i();
                    }
                    int i9 = this.f121a.f6a;
                    this.f = new int[i9][];
                    for (int i10 = 0; i10 < i9; i10++) {
                        int[] iArr2 = this.f121a.b[i10];
                        this.f[i10] = new int[iArr2.length];
                        for (int i11 = 0; i11 < iArr2.length; i11++) {
                            this.f[i10][i11] = iArr2[i11];
                            if (iArr2[i11] == 3 || iArr2[i11] == 2 || iArr2[i11] == 1 || iArr2[i11] == 0 || iArr2[i11] == 5) {
                                iArr2[i11] = 4;
                            }
                        }
                    }
                } else {
                    this.bj = 10000;
                }
                break;
            case 19:
                this.bA++;
                if (this.bA > 4) {
                    this.bA = 4;
                } else if (this.bA == 1) {
                    this.bz = 0;
                } else if (this.bA == 2) {
                    this.bz = 1;
                } else if (this.bA == 3) {
                    this.bz = 2;
                } else if (this.bA == 4) {
                    this.bz = 3;
                }
                j(this.bA);
                break;
            case 20:
                af afVar = this.f123a;
                if (afVar.dm != -1) {
                    afVar.h[afVar.dm][3] = 4;
                    afVar.n[afVar.dm].b((afVar.h[afVar.dm][0] * 3) + afVar.h[afVar.dm][3], -2, true);
                    afVar.dm = -1;
                    for (int i12 = 0; i12 < afVar.h.length; i12++) {
                        if (afVar.h[i12][3] == -1) {
                            afVar.dm = i12;
                        }
                    }
                }
                break;
        }
        this.e[i] = true;
        this.bN = 0;
        a(this.f137c[i]);
        if (i < 11) {
            this.bv = 0;
        } else {
            this.bv = 1;
        }
        this.f118f[this.bv].z(0);
    }

    public final void m(int i) {
        this.bC += i;
    }

    private void a(String str) {
        if (str != null) {
            this.f141e = str;
            this.bJ = 1500;
        }
    }

    public static int a(int i, int i2, int i3, int i4) {
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        int i8 = i5 + (((((i >> 16) & 255) - i5) * i3) / 600);
        int i9 = i6 + (((((i >> 8) & 255) - i6) * i3) / 600);
        return (i8 << 16) | (i9 << 8) | (i7 + ((((i & 255) - i7) * i3) / 600));
    }
}
