package com.knot.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.knot.quiries.Query;
import com.knot.repo.EmployeeInter;
import com.knot.util.Db;
import com.knot.vo.Employee;

public class EmpService implements EmployeeInter	{
	Connection con = Db.getConnection();
	PreparedStatement pst;
	ResultSet res ;

	@Override
	public Employee getById(String id) {
		Employee emp = new Employee();
		try {
		 pst = con.prepareStatement(Query.getDetailsById);
			pst.setString(1, id);
			res = pst.executeQuery();
			while (res.next()) {
				emp.setId(res.getString("id"));
				emp.setName(res.getString(2));
				emp.setMobile(res.getString(3));

			}
			res.close();
			con.close();
			pst.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public String returnStr(String str) {
		System.out.println("The Return String str in Service method = "+str);
		return str;
	}

}
