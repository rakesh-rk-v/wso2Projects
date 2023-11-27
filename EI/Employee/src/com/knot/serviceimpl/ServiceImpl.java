package com.knot.serviceimpl;

import com.knot.repo.EmployeeInter;
import com.knot.service.EmpService;
import com.knot.vo.Employee;

public class ServiceImpl implements EmployeeInter{
	EmpService serv = new EmpService();
	@Override
	public Employee getById(String id) {
		System.out.println("Get Element by id Method called");
		return serv.getById(id);
	}
	@Override
	public String returnStr(String str) {
		System.out.println("The  String str in ServiceIMPL method = "+str);
		return serv.returnStr(str);
	}
	

}
