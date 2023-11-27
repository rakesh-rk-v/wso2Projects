/**
 * StudentServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.knot.student;

public class StudentServiceLocator extends org.apache.axis.client.Service implements com.knot.student.StudentService {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StudentServiceLocator() {
    }


    public StudentServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StudentServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Student
    private java.lang.String Student_address = "http://localhost:8080/Student/services/Student";

    public java.lang.String getStudentAddress() {
        return Student_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StudentWSDDServiceName = "Student";

    public java.lang.String getStudentWSDDServiceName() {
        return StudentWSDDServiceName;
    }

    public void setStudentWSDDServiceName(java.lang.String name) {
        StudentWSDDServiceName = name;
    }

    public com.knot.student.Student getStudent() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Student_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStudent(endpoint);
    }

    public com.knot.student.Student getStudent(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.knot.student.StudentSoapBindingStub _stub = new com.knot.student.StudentSoapBindingStub(portAddress, this);
            _stub.setPortName(getStudentWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStudentEndpointAddress(java.lang.String address) {
        Student_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.knot.student.Student.class.isAssignableFrom(serviceEndpointInterface)) {
                com.knot.student.StudentSoapBindingStub _stub = new com.knot.student.StudentSoapBindingStub(new java.net.URL(Student_address), this);
                _stub.setPortName(getStudentWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Student".equals(inputPortName)) {
            return getStudent();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://student.knot.com", "StudentService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://student.knot.com", "Student"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Student".equals(portName)) {
            setStudentEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
