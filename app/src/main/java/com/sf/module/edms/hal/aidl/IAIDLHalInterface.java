/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/jonesleborn/Documents/GitHub/OzJcenter/app/src/main/aidl/com/sf/module/edms/hal/aidl/IAIDLHalInterface.aidl
 */
package com.sf.module.edms.hal.aidl;
// Declare any non-default types here with import statements

public interface IAIDLHalInterface extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements IAIDLHalInterface
{
private static final String DESCRIPTOR = "com.sf.module.edms.hal.com.sf.module.edms.hal.aidl.IAIDLHalInterface";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.sf.module.edms.hal.com.sf.module.edms.hal.aidl.IAIDLHalInterface interface,
 * generating a proxy if needed.
 */
public static IAIDLHalInterface asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof IAIDLHalInterface))) {
return ((IAIDLHalInterface)iin);
}
return new Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
String descriptor = DESCRIPTOR;
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(descriptor);
return true;
}
case TRANSACTION_request:
{
data.enforceInterface(descriptor);
String _arg0;
_arg0 = data.readString();
CallBack _arg1;
_arg1 = CallBack.Stub.asInterface(data.readStrongBinder());
this.request(_arg0, _arg1);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements IAIDLHalInterface
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
public String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
@Override public void request(String request, CallBack callBack) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(request);
_data.writeStrongBinder((((callBack!=null))?(callBack.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_request, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_request = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
public void request(String request, CallBack callBack) throws android.os.RemoteException;
}
