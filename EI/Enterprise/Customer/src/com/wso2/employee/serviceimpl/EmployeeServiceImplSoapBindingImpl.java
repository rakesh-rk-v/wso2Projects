/**
 * EmployeeServiceImplSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wso2.employee.serviceimpl;

import com.wso2.employee.vivo.Employee;

public class EmployeeServiceImplSoapBindingImpl implements com.wso2.employee.serviceimpl.EmployeeServiceImpl{
    public com.wso2.employee.vivo.Employee getDetails(java.lang.String id) throws java.rmi.RemoteException {
    	System.out.println("Get Method Called");
        return new Employee("1","Rakesh","EEE","9182446593","8");
    }

    public com.wso2.employee.vivo.Employee insert(com.wso2.employee.vivo.Employee emp) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String delete(java.lang.String id) throws java.rmi.RemoteException {
        return null;
    }

}
