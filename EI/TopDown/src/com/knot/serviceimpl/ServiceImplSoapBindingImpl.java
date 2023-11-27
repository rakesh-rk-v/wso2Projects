/**
 * ServiceImplSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.knot.serviceimpl;

import com.knot.vo.EmpService;

public class ServiceImplSoapBindingImpl implements com.knot.serviceimpl.ServiceImpl{
    public java.lang.String returnStr(java.lang.String str) throws java.rmi.RemoteException {
        return str;
    }

    public com.knot.vo.Employee getById(java.lang.String id) throws java.rmi.RemoteException {
    	EmpService emp = new EmpService();
        return emp.getById(id);
    }

}
