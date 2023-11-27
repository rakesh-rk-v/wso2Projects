package com.wso2.employee.serviceimpl;

import com.wso2.employee.service.EmployeeService;
import com.wso2.employee.vivo.Employee;

public class EmployeeServiceImpl {
	EmployeeService empserv = new EmployeeService();
	
	public Employee getDetails(String id) {
		return empserv.getElementById(id);
	}
	
	public Employee insert(Employee emp) {
		return empserv.insert(emp);
	}
	public String delete(String id) {
		return empserv.delete(id);
	}

}
//E:\Enterprise\Employee\WebContent\wsdl\EmployeeServiceImpl.wsdl