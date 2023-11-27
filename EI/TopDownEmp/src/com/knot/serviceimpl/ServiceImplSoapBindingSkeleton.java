/**
 * ServiceImplSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.knot.serviceimpl;

public class ServiceImplSoapBindingSkeleton implements com.knot.serviceimpl.ServiceImpl, org.apache.axis.wsdl.Skeleton {
    private com.knot.serviceimpl.ServiceImpl impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://serviceimpl.knot.com", "str"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("returnStr", _params, new javax.xml.namespace.QName("http://serviceimpl.knot.com", "returnStrReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://serviceimpl.knot.com", "returnStr"));
        _oper.setSoapAction("returnStr");
        _myOperationsList.add(_oper);
        if (_myOperations.get("returnStr") == null) {
            _myOperations.put("returnStr", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("returnStr")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://serviceimpl.knot.com", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getById", _params, new javax.xml.namespace.QName("http://serviceimpl.knot.com", "getByIdReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://vo.knot.com", "Employee"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://serviceimpl.knot.com", "getById"));
        _oper.setSoapAction("getById");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getById") == null) {
            _myOperations.put("getById", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getById")).add(_oper);
    }

    public ServiceImplSoapBindingSkeleton() {
        this.impl = new com.knot.serviceimpl.ServiceImplSoapBindingImpl();
    }

    public ServiceImplSoapBindingSkeleton(com.knot.serviceimpl.ServiceImpl impl) {
        this.impl = impl;
    }
    public java.lang.String returnStr(java.lang.String str) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.returnStr(str);
        return ret;
    }

    public com.knot.vo.Employee getById(java.lang.String id) throws java.rmi.RemoteException
    {
        com.knot.vo.Employee ret = impl.getById(id);
        return ret;
    }

}
