package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: sequel-3d-java.jar:w.class */
public final class w {
    boolean a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    int f322a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    DataInputStream f323a;

    w() {
    }

    public final int a() {
        if (this.a) {
            return this.f322a;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        return byteArrayOutputStream.size();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, java.lang.Throwable] */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m114a() {
        ?? r0;
        try {
            r0 = this.f323a.readBoolean();
            return r0;
        } catch (EOFException e) {
            throw r0;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [byte, java.lang.Throwable] */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final byte m115a() {
        ?? r0;
        try {
            r0 = this.f323a.readByte();
            return r0;
        } catch (EOFException e) {
            throw r0;
        } catch (IOException unused) {
            return (byte) 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [int, java.lang.Throwable] */
    public final int b() {
        ?? unsignedByte;
        try {
            unsignedByte = this.f323a.readUnsignedByte();
            return unsignedByte;
        } catch (EOFException e) {
            throw unsignedByte;
        } catch (IOException unused) {
            return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, short] */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final short m116a() {
        ?? r0;
        try {
            r0 = this.f323a.readShort();
            return r0;
        } catch (EOFException e) {
            throw r0;
        } catch (IOException unused) {
            return (short) 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [int, java.lang.Throwable] */
    public final int c() {
        ?? r0;
        try {
            r0 = this.f323a.readInt();
            return r0;
        } catch (EOFException e) {
            throw r0;
        } catch (IOException unused) {
            return 0;
        }
    }
}
