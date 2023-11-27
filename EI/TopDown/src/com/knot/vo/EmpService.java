package com.knot.vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpService 	{
	Connection con = Db.getConnection();
	PreparedStatement pst;
	ResultSet res ;

	public Employee getById(String id) {
		Employee emp = new Employee();
		try {
		 pst = con.prepareStatement("select *from Employee where id = ?");
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

	public String returnStr(String str) {
		System.out.println("The Return String str in Service method = "+str);
		return str;
	}

}
