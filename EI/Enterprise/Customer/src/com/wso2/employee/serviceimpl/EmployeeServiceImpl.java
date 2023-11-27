/**
 * EmployeeServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wso2.employee.serviceimpl;

public interface EmployeeServiceImpl extends java.rmi.Remote {
    public com.wso2.employee.vivo.Employee getDetails(java.lang.String id) throws java.rmi.RemoteException;
    public com.wso2.employee.vivo.Employee insert(com.wso2.employee.vivo.Employee emp) throws java.rmi.RemoteException;
    public java.lang.String delete(java.lang.String id) throws java.rmi.RemoteException;
}
