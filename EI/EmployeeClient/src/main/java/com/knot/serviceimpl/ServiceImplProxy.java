package com.knot.serviceimpl;

public class ServiceImplProxy implements com.knot.serviceimpl.ServiceImpl {
  private String _endpoint = null;
  private com.knot.serviceimpl.ServiceImpl serviceImpl = null;
  
  public ServiceImplProxy() {
    _initServiceImplProxy();
  }
  
  public ServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceImplProxy();
  }
  
  private void _initServiceImplProxy() {
    try {
      serviceImpl = (new com.knot.serviceimpl.ServiceImplServiceLocator()).getServiceImpl();
      if (serviceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceImpl != null)
      ((javax.xml.rpc.Stub)serviceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.knot.serviceimpl.ServiceImpl getServiceImpl() {
    if (serviceImpl == null)
      _initServiceImplProxy();
    return serviceImpl;
  }
  
  public java.lang.String returnStr(java.lang.String str) throws java.rmi.RemoteException{
    if (serviceImpl == null)
      _initServiceImplProxy();
    return serviceImpl.returnStr(str);
  }
  
  public com.knot.vo.Employee getById(java.lang.String id) throws java.rmi.RemoteException{
    if (serviceImpl == null)
      _initServiceImplProxy();
    return serviceImpl.getById(id);
  }
  
  
}