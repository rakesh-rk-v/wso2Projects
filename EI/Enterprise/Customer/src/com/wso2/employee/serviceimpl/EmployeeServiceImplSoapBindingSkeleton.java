/**
 * EmployeeServiceImplSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wso2.employee.serviceimpl;

public class EmployeeServiceImplSoapBindingSkeleton implements com.wso2.employee.serviceimpl.EmployeeServiceImpl, org.apache.axis.wsdl.Skeleton {
    private com.wso2.employee.serviceimpl.EmployeeServiceImpl impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://serviceimpl.employee.wso2.com", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getDetails", _params, new javax.xml.namespace.QName("http://serviceimpl.employee.wso2.com", "getDetailsReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://vivo.employee.wso2.com", "Employee"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://serviceimpl.employee.wso2.com", "getDetails"));
        _oper.setSoapAction("getDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDetails") == null) {
            _myOperations.put("getDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDetails")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://serviceimpl.employee.wso2.com", "emp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vivo.employee.wso2.com", "Employee"), com.wso2.employee.vivo.Employee.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("insert", _params, new javax.xml.namespace.QName("http://serviceimpl.employee.wso2.com", "insertReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://vivo.employee.wso2.com", "Employee"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://serviceimpl.employee.wso2.com", "insert"));
        _oper.setSoapAction("insert");
        _myOperationsList.add(_oper);
        if (_myOperations.get("insert") == null) {
            _myOperations.put("insert", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("insert")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://serviceimpl.employee.wso2.com", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("delete", _params, new javax.xml.namespace.QName("http://serviceimpl.employee.wso2.com", "deleteReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://serviceimpl.employee.wso2.com", "delete"));
        _oper.setSoapAction("delete");
        _myOperationsList.add(_oper);
        if (_myOperations.get("delete") == null) {
            _myOperations.put("delete", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("delete")).add(_oper);
    }

    public EmployeeServiceImplSoapBindingSkeleton() {
        this.impl = new com.wso2.employee.serviceimpl.EmployeeServiceImplSoapBindingImpl();
    }

    public EmployeeServiceImplSoapBindingSkeleton(com.wso2.employee.serviceimpl.EmployeeServiceImpl impl) {
        this.impl = impl;
    }
    public com.wso2.employee.vivo.Employee getDetails(java.lang.String id) throws java.rmi.RemoteException
    {
        com.wso2.employee.vivo.Employee ret = impl.getDetails(id);
        return ret;
    }

    public com.wso2.employee.vivo.Employee insert(com.wso2.employee.vivo.Employee emp) throws java.rmi.RemoteException
    {
        com.wso2.employee.vivo.Employee ret = impl.insert(emp);
        return ret;
    }

    public java.lang.String delete(java.lang.String id) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.delete(id);
        return ret;
    }

}
