package com.knot.student;

public class StudentProxy implements com.knot.student.Student {
  private String _endpoint = null;
  private com.knot.student.Student student = null;
  
  public StudentProxy() {
    _initStudentProxy();
  }
  
  public StudentProxy(String endpoint) {
    _endpoint = endpoint;
    _initStudentProxy();
  }
  
  private void _initStudentProxy() {
    try {
      student = (new com.knot.student.StudentServiceLocator()).getStudent();
      if (student != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)student)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)student)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (student != null)
      ((javax.xml.rpc.Stub)student)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.knot.student.Student getStudent() {
    if (student == null)
      _initStudentProxy();
    return student;
  }
  
  public java.lang.String get(java.lang.String id) throws java.rmi.RemoteException{
    if (student == null)
      _initStudentProxy();
    return student.get(id);
  }
  
  
}