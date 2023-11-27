package com.wso2.employee.repo;

import com.wso2.employee.vivo.Employee;

public interface EmployeeRepo {
 
	public Employee insert(Employee id);
	public Employee getElementById(String id);
	public String delete(String id);
	public String updateName(String Id);
}
