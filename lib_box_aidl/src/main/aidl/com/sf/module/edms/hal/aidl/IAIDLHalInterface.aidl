// IDriverInterface.aidl
package com.sf.module.edms.hal.aidl;
import com.sf.module.edms.hal.aidl.CallBack;

// Declare any non-default types here with import statements

interface IAIDLHalInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void request(String request,CallBack callBack);
}
