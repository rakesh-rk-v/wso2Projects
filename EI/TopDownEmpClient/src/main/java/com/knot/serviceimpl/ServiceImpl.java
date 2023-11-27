/**
 * ServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.knot.serviceimpl;

public interface ServiceImpl extends java.rmi.Remote {
    public java.lang.String returnStr(java.lang.String str) throws java.rmi.RemoteException;
    public com.knot.vo.Employee getById(java.lang.String id) throws java.rmi.RemoteException;
}
