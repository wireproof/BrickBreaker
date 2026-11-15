package defpackage;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: bbr-2.jar:DCWall2.class */
public class DCWall2 extends bd {
    private v a;
    private v b;
    private v c;
    private boolean I;
    private boolean J;
    private int cH;
    private int cI;
    private int cJ;
    private boolean K;
    private ax k;
    private ax j;
    private ax m;

    /* JADX WARN: Code duplicated, block: B:132:0x0816  */
    /* JADX WARN: Code duplicated, block: B:134:0x082f  */
    /* JADX WARN: Code duplicated, block: B:136:0x084f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0856  */
    /* JADX WARN: Code duplicated, block: B:139:0x0860  */
    /* JADX WARN: Code duplicated, block: B:141:0x0866  */
    /* JADX WARN: Code duplicated, block: B:143:0x0877  */
    /* JADX WARN: Code duplicated, block: B:146:0x0882  */
    /* JADX WARN: Code duplicated, block: B:180:0x089e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x087a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.bd
    public final void n(int i) {
        int[] iArrA;
        Object[] objArr;
        short[] sArr;
        int i2;
        int i3;
        short s;
        short s2;
        boolean z;
        int iZ;
        int iCurrentTimeMillis;
        if (!this.I) {
            if (!this.J) {
                this.cH = 6;
                this.cI = 0;
                this.J = true;
                return;
            }
            if (this.cI >= this.cH) {
                this.I = true;
                this.J = false;
                this.c = this.a;
                aa();
                return;
            }
            switch (this.cI) {
                case 0:
                    ar.initialize();
                    break;
                case 1:
                    try {
                        Font font = Font.getFont(32, 0, 8);
                        Font font2 = Font.getFont(32, 1, 8);
                        Image image = ba.getImage(393216);
                        Image image2 = ba.getImage(131072);
                        Image image3 = ba.getImage(262144);
                        this.k = new ax(image, ba.m22a(458752), font, 0, -1);
                        this.j = new ax(image2, ba.m22a(196608), font2, 16777215, 0);
                        this.m = new ax(image3, ba.m22a(327680), font2, 13421772, 0);
                        ax axVar = this.k;
                        ax axVar2 = this.k;
                        ax axVar3 = this.j;
                        ax axVar4 = this.m;
                        e.f65a = axVar;
                        e.f66b = axVar2;
                        e.f67c = axVar3;
                        e.f68d = axVar4;
                        ba.a(this.k);
                    } catch (IOException unused) {
                    }
                    break;
                case 2:
                    n[] nVarArrA = ar.a(new int[]{1245189, 1245191, 1245190});
                    n[] nVarArrA2 = ar.a(new int[]{1245192, 1245194, 1245193});
                    ay ayVar = new ay(nVarArrA, true);
                    ay ayVar2 = new ay(nVarArrA2, true);
                    e.a = ayVar;
                    e.b = ayVar2;
                    e.t = 0;
                    for (int i4 = 0; i4 < ayVar.D(); i4++) {
                        ayVar.b(i4, -1, true);
                        e.t = Math.max(e.t, ayVar.getHeight() + 2);
                    }
                    e.u = 0;
                    for (int i5 = 0; i5 < ayVar2.D(); i5++) {
                        ayVar2.b(i5, -1, true);
                        e.u = Math.max(e.u, ayVar2.getHeight() + 2);
                    }
                    n[] nVarArrA3 = ar.a(new int[]{1245195, 1245196});
                    n[] nVarArrA4 = ar.a(new int[]{1245197, 1245198});
                    ay ayVar3 = new ay(nVarArrA3, true);
                    ay ayVar4 = new ay(nVarArrA4, true);
                    e.F = 0;
                    e.G = 0;
                    for (int i6 = 0; i6 < ayVar3.D(); i6++) {
                        ayVar3.b(i6, -1, true);
                        e.F = Math.max(e.F, ayVar3.getWidth() + 2);
                    }
                    for (int i7 = 0; i7 < ayVar4.D(); i7++) {
                        ayVar4.b(i7, -1, true);
                        e.G = Math.max(e.G, ayVar4.getWidth() + 2);
                    }
                    e.e = ayVar3;
                    e.f = ayVar4;
                    break;
                case 3:
                    this.a = new v(65536, new r(this, this.k, this.j));
                    break;
                case 4:
                    y();
                    break;
                case 5:
                    for (int i8 = 0; i8 < ar.z(); i8++) {
                        ar.N();
                    }
                    break;
            }
            this.cI++;
            return;
        }
        if (this.c != this.b) {
            this.b = this.c;
        }
        if (this.b != null) {
            v vVar = this.b;
            if (vVar.dg != 0) {
                bd.aI = true;
                if (vVar.dg != 3) {
                    vVar.v(vVar.b.c(vVar.cK, i));
                    if (vVar.f168c != null) {
                        iArrA = vVar.f168c.a(i);
                        vVar.f174d[vVar.cK] = (byte) vVar.f168c.as;
                        if (iArrA != null) {
                            if (iArrA[0] == 1) {
                                vVar.v(iArrA[1]);
                            } else if (iArrA[0] == 0) {
                                objArr = false;
                                sArr = vVar.f171a[vVar.cK];
                                if (sArr != null) {
                                    i3 = 0;
                                    while (i3 < sArr.length) {
                                        int i9 = i3;
                                        int i10 = i3 + 1;
                                        s = sArr[i9];
                                        i3 = i10 + 1;
                                        s2 = sArr[i10];
                                        if (s == iArrA[1]) {
                                            vVar.v(s2);
                                            objArr = true;
                                        }
                                    }
                                }
                                if (objArr == false && (i2 = iArrA[1]) != -1 && ba.o(i2) == 2) {
                                    vVar.v(-3);
                                }
                            }
                        }
                    }
                } else if (vVar.cI < vVar.cH) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    do {
                        if (vVar.ac) {
                            ar.N();
                        } else {
                            int i11 = vVar.cI;
                            if (i11 < vVar.dd) {
                                vVar.b.d(vVar.c[vVar.cW], i11);
                            } else {
                                int i12 = i11 - vVar.dd;
                                if (i12 < vVar.de) {
                                    vVar.b.e(vVar.cW, i12);
                                } else {
                                    short s3 = vVar.f[i12 - vVar.de];
                                    if (v.f176a == null) {
                                        v.f176a = new Hashtable();
                                    }
                                    byte[] bArr = vVar.f166b;
                                    short s4 = vVar.f167b[s3];
                                    int i13 = s4 + 1;
                                    byte b = bArr[s4];
                                    Vector vector = new Vector();
                                    Image[][] imageArr = new Image[1][];
                                    ay[] ayVarArr = new ay[1];
                                    int i14 = i13 + 1;
                                    boolean z2 = bArr[i13];
                                    int i15 = i14 + 1;
                                    boolean z3 = bArr[i14];
                                    e eVar = new e();
                                    vVar.b.a(s3, eVar, 0);
                                    vVar.b.a(s3, eVar, z2 ? 1 : 0, b == true ? 1 : 0, z3 ? 1 : 0);
                                    int i16 = i15 + 1;
                                    r.a(eVar, bArr[i15] ? 1 : 0);
                                    String strA = vVar.b.a(s3, v.a(bArr, i16), -1);
                                    int iA = v.a(bArr, i16 + 4, 1, imageArr, ayVarArr);
                                    Image image4 = imageArr[0] == null ? null : imageArr[0][0];
                                    ay ayVar5 = ayVarArr[0];
                                    int i17 = iA + 1;
                                    boolean z4 = bArr[iA];
                                    if (strA != null || ayVar5 != null || image4 != null) {
                                        if (ayVar5 != null) {
                                            r.a(eVar, strA, ayVar5, z4 ? 1 : 0);
                                        } else {
                                            r.a(eVar, strA, image4, z4 ? 1 : 0);
                                        }
                                    }
                                    int i18 = i17 + 1;
                                    boolean z5 = bArr[i17];
                                    int i19 = i18 + 1;
                                    int i20 = (bArr[i18] ? 1 : 0) & 255;
                                    if (i20 != 255) {
                                        vector.addElement(new Integer(z5 ? 1 : 0));
                                        vector.addElement(new Integer(i20));
                                    }
                                    vVar.b.a(eVar, z5 ? 1 : 0, 0);
                                    int i21 = i19 + 1;
                                    boolean z6 = bArr[i19];
                                    int iA2 = i21 + 1;
                                    int i22 = (bArr[i21] ? 1 : 0) & 255;
                                    if (i22 != 255) {
                                        vector.addElement(new Integer(z6 ? 1 : 0));
                                        vector.addElement(new Integer(i22));
                                    }
                                    vVar.b.a(eVar, z6 ? 1 : 0, 1);
                                    for (int i23 = 0; i23 < b; i23++) {
                                        int i24 = iA2;
                                        iA2++;
                                        boolean z7 = bArr[i24];
                                        switch (z7 ? 1 : 0) {
                                            case 0:
                                                String strA2 = vVar.b.a(s3, v.a(bArr, iA2), i23);
                                                int iA3 = v.a(bArr, iA2 + 4, 3, imageArr, ayVarArr);
                                                iA2 = iA3 + 1;
                                                vVar.b.a(s3, eVar, i23, z7 ? 1 : 0, strA2, ayVarArr[0], imageArr[0], v.a(bArr[iA3] ? (byte) 1 : (byte) 0));
                                                break;
                                            case 1:
                                                String strA3 = vVar.b.a(s3, v.a(bArr, iA2), i23);
                                                int iA4 = v.a(bArr, iA2 + 4, 4, imageArr, ayVarArr);
                                                Image[] imageArr2 = imageArr[0];
                                                ay ayVar6 = ayVarArr[0];
                                                int i25 = iA4 + 1;
                                                int i26 = bArr[iA4];
                                                String[] strArr = new String[i26];
                                                for (int i27 = 0; i27 < i26; i27++) {
                                                    int iA5 = v.a(bArr, i25);
                                                    i25 += 4;
                                                    strArr[i27] = vVar.b.a(s3, iA5, i23);
                                                }
                                                int iA6 = v.a(bArr, i25, i26, imageArr, ayVarArr);
                                                iA2 = iA6 + 1;
                                                vVar.b.a(s3, eVar, i23, strA3, ayVar6, imageArr2, strArr, ayVarArr[0], imageArr[0], v.a(bArr[iA6] ? (byte) 1 : (byte) 0));
                                                break;
                                            case 2:
                                                String strA4 = vVar.b.a(s3, v.a(bArr, iA2), i23);
                                                int iA7 = v.a(bArr, iA2 + 4, 4, imageArr, ayVarArr);
                                                Image[] imageArr3 = imageArr[0];
                                                ay ayVar7 = ayVarArr[0];
                                                int i28 = iA7 + 1;
                                                int i29 = (bArr[iA7] ? 1 : 0) & 255;
                                                int i30 = i28 + 1;
                                                int i31 = (bArr[i28] ? 1 : 0) & 255;
                                                iA2 = i30 + 1;
                                                vVar.b.a(s3, eVar, i23, strA4, ayVar7, imageArr3, i29, i31, v.a(bArr[i30] ? (byte) 1 : (byte) 0));
                                                break;
                                            case 3:
                                                iA2 = v.a(bArr, iA2 + 9, 3, imageArr, ayVarArr) + 2;
                                                break;
                                            case 4:
                                                String strA5 = vVar.b.a(s3, v.a(bArr, iA2), i23);
                                                iA2 = v.a(bArr, iA2 + 4, 1, imageArr, ayVarArr);
                                                vVar.b.a(s3, eVar, i23, 1, strA5, ayVarArr[0], imageArr[0], -1);
                                                break;
                                        }
                                    }
                                    vVar.b.a(s3, eVar, 1);
                                    vVar.b.m44a(eVar);
                                    eVar.g(0);
                                    vVar.f170b[s3] = eVar;
                                    if (vector.size() > 0) {
                                        short[] sArr2 = new short[vector.size()];
                                        for (int i32 = 0; i32 < vector.size(); i32++) {
                                            sArr2[i32] = (short) ((Integer) vector.elementAt(i32)).intValue();
                                        }
                                        vVar.f171a[s3] = sArr2;
                                    }
                                }
                            }
                        }
                        vVar.cI++;
                        iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                        if (vVar.cI < vVar.cH) {
                        }
                    } while (iCurrentTimeMillis < 50);
                } else if (vVar.ac || (iZ = ar.z()) <= 0) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (!vVar.ad) {
                        vVar.ad = true;
                        vVar.f175a = jCurrentTimeMillis2;
                    }
                    if (((int) (jCurrentTimeMillis2 - vVar.f175a)) < 150) {
                        z = false;
                    } else {
                        vVar.ad = false;
                        z = true;
                    }
                    if (z) {
                        vVar.D();
                    }
                } else {
                    vVar.cI = 0;
                    vVar.cH = iZ;
                    vVar.ac = true;
                }
            } else if (vVar.cW != -1) {
                bd.aI = true;
                vVar.E();
            } else {
                vVar.v(vVar.b.c(vVar.cK, i));
                if (vVar.f168c != null) {
                    iArrA = vVar.f168c.a(i);
                    vVar.f174d[vVar.cK] = (byte) vVar.f168c.as;
                    if (iArrA != null) {
                        if (iArrA[0] == 1) {
                            vVar.v(iArrA[1]);
                        } else if (iArrA[0] == 0) {
                            objArr = false;
                            sArr = vVar.f171a[vVar.cK];
                            if (sArr != null) {
                                i3 = 0;
                                while (i3 < sArr.length) {
                                    int i33 = i3;
                                    int i110 = i3 + 1;
                                    s = sArr[i33];
                                    i3 = i110 + 1;
                                    s2 = sArr[i110];
                                    if (s == iArrA[1]) {
                                        vVar.v(s2);
                                        objArr = true;
                                    }
                                }
                            }
                            if (objArr == false) {
                                vVar.v(-3);
                            }
                        }
                    }
                }
            }
            if (this.cJ != -1) {
                this.cJ = this.b.x();
            }
        }
    }

    private void y() {
        if (this.K) {
            return;
        }
        byte[] bArrA = ba.a(27983879);
        int length = bArrA.length;
        int i = 0;
        while (i < length) {
            int i2 = i;
            int i3 = i + 1;
            byte b = bArrA[i2];
            int iA = v.a(bArrA, i3);
            int i4 = i3 + 4;
            int i5 = i4 + 1;
            boolean z = bArrA[i4] == 1;
            int iA2 = v.a(bArrA, i5);
            int i6 = i5 + 4;
            i = i6 + 1;
            byte b2 = bArrA[i6];
            Image image = null;
            if (iA2 != -1) {
                image = z ? ar.getImage(iA2) : ba.getImage(iA2);
            }
            ba.a(b, iA, image, b2);
        }
        this.K = true;
    }

    @Override // defpackage.bd
    public final void b(Graphics graphics) {
        if (this.J) {
            a(graphics, (this.cI * 50) / this.cH);
            return;
        }
        if (this.b != null) {
            if (this.cJ != -1) {
                a(graphics, 50 + (this.cJ >> 1));
                return;
            }
            v vVar = this.b;
            if (vVar.g()) {
                vVar.b.b(graphics, vVar.x(), vVar.cW);
                return;
            }
            vVar.b.a(vVar.cK, graphics);
            if (vVar.f168c != null) {
                vVar.b.a(vVar.cK, graphics, vVar.f168c);
            }
        }
    }

    @Override // defpackage.bd
    public final void b(int i, int i2) {
        if (this.J || this.b == null) {
            return;
        }
        v vVar = this.b;
        if ((vVar.dg == 0 || vVar.dg == 5) ? false : true) {
            return;
        }
        if (vVar.f168c != null) {
            vVar.f168c.m32b(i, i2);
        }
        if (vVar.b != null) {
            vVar.b.f(vVar.cK, i, i2);
        }
    }

    @Override // defpackage.bd
    public final void o(int i) {
        if (this.J || this.b == null) {
            return;
        }
        if (i != 1) {
            if (i == 5) {
                this.b.b.C();
            }
        } else {
            v vVar = this.b;
            if (vVar.g()) {
                return;
            }
            vVar.b.z();
        }
    }

    @Override // defpackage.bd
    public final String[][] a() {
        return new String[][]{new String[]{ba.c(53)}};
    }

    @Override // defpackage.bd
    public final String a(int i) {
        return new StringBuffer().append("").append(i).toString();
    }

    public final void p(int i) {
        if (this.I) {
            v vVar = this.a;
            vVar.ae = true;
            if (vVar.cW == -1) {
                vVar.cW = vVar.cK;
            }
            if (vVar.dg != 0) {
                vVar.dg = 1;
                vVar.E();
            }
        }
        ba.E(i);
        this.K = false;
        y();
    }

    private static void a(Graphics graphics, int i) {
        int iE = ba.E();
        int iH = ba.H();
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, iE, iH);
        int i2 = (iE * 17) / 27;
        int iMax = Math.max(iH / 37, 5);
        int i3 = (iE - i2) >> 1;
        int i4 = (iH - iMax) >> 1;
        graphics.setColor(11184810);
        graphics.fillRect(i3, i4, i2, iMax);
        graphics.setColor(0);
        graphics.fillRect(i3, i4, (i2 * i) / 100, iMax);
    }
}
