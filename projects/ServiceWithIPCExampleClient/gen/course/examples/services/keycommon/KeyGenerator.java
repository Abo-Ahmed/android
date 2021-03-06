/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: H:\\Andriod\\Android project\\ServiceWithIPCExampleClient\\src\\course\\examples\\services\\keycommon\\KeyGenerator.aidl
 */
package course.examples.services.keycommon;
public interface KeyGenerator extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements course.examples.services.keycommon.KeyGenerator
{
private static final java.lang.String DESCRIPTOR = "course.examples.services.keycommon.KeyGenerator";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an course.examples.services.keycommon.KeyGenerator interface,
 * generating a proxy if needed.
 */
public static course.examples.services.keycommon.KeyGenerator asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof course.examples.services.keycommon.KeyGenerator))) {
return ((course.examples.services.keycommon.KeyGenerator)iin);
}
return new course.examples.services.keycommon.KeyGenerator.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getKey:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getKey();
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements course.examples.services.keycommon.KeyGenerator
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public java.lang.String getKey() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getKey, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public java.lang.String getKey() throws android.os.RemoteException;
}
