/**
 * StudentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.knot.student;

public interface StudentService extends javax.xml.rpc.Service {
    public java.lang.String getStudentAddress();

    public com.knot.student.Student getStudent() throws javax.xml.rpc.ServiceException;

    public com.knot.student.Student getStudent(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
