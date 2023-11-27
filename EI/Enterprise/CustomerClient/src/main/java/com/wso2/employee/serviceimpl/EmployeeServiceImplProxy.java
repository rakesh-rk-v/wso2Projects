package com.wso2.employee.serviceimpl;

public class EmployeeServiceImplProxy implements com.wso2.employee.serviceimpl.EmployeeServiceImpl {
  private String _endpoint = null;
  private com.wso2.employee.serviceimpl.EmployeeServiceImpl employeeServiceImpl = null;
  
  public EmployeeServiceImplProxy() {
    _initEmployeeServiceImplProxy();
  }
  
  public EmployeeServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmployeeServiceImplProxy();
  }
  
  private void _initEmployeeServiceImplProxy() {
    try {
      employeeServiceImpl = (new com.wso2.employee.serviceimpl.EmployeeServiceImplServiceLocator()).getEmployeeServiceImpl();
      if (employeeServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)employeeServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)employeeServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (employeeServiceImpl != null)
      ((javax.xml.rpc.Stub)employeeServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.wso2.employee.serviceimpl.EmployeeServiceImpl getEmployeeServiceImpl() {
    if (employeeServiceImpl == null)
      _initEmployeeServiceImplProxy();
    return employeeServiceImpl;
  }
  
  public com.wso2.employee.vivo.Employee getDetails(java.lang.String id) throws java.rmi.RemoteException{
    if (employeeServiceImpl == null)
      _initEmployeeServiceImplProxy();
    return employeeServiceImpl.getDetails(id);
  }
  
  public com.wso2.employee.vivo.Employee insert(com.wso2.employee.vivo.Employee emp) throws java.rmi.RemoteException{
    if (employeeServiceImpl == null)
      _initEmployeeServiceImplProxy();
    return employeeServiceImpl.insert(emp);
  }
  
  public java.lang.String delete(java.lang.String id) throws java.rmi.RemoteException{
    if (employeeServiceImpl == null)
      _initEmployeeServiceImplProxy();
    return employeeServiceImpl.delete(id);
  }
  
  
}