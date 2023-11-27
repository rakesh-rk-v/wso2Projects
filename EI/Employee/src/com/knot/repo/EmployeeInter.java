package com.knot.repo;

import com.knot.vo.Employee;

public interface EmployeeInter {
	public Employee getById(String id);
	public String returnStr(String str);

}
