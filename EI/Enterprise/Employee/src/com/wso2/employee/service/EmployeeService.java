package com.wso2.employee.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wso2.employee.dbutil.DBConn;
import com.wso2.employee.quiries.Query;
import com.wso2.employee.repo.EmployeeRepo;
import com.wso2.employee.vivo.Employee;

public class EmployeeService implements EmployeeRepo{
	Connection con = DBConn.getConnection();
	PreparedStatement pst;
	ResultSet res ;
	@Override
	public Employee insert(Employee std) {
		try {
			pst = con.prepareStatement(Query.insert);
			pst.setString(1, std.getId());
			pst.setString(2, std.getName());
			pst.setString(3,std.getMobile());
			pst.setString(4,std.getDept());
			pst.setString(5,std.getAddress());
			int f =pst.executeUpdate();
			System.out.println(f);
			con.close();
			pst.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		return std;
	}

	@Override
	public Employee getElementById(String id) {
		Employee emp = new Employee();
		try {
		 pst = con.prepareStatement(Query.getDetailsById);
			pst.setString(1, id);
			res = pst.executeQuery();
			while (res.next()) {
				emp.setId(res.getString("id"));
				emp.setName(res.getString(2));
				emp.setMobile(res.getString(3));
				emp.setDept(res.getString(4));
				emp.setAddress(res.getString(5));
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
	public String delete(String id) {
		try {
	pst = con.prepareStatement(Query.deleteById);
	pst.setString(1, id);
	 int flag = pst.executeUpdate();
	 if(flag < 0) {
		 return "The Id Value is Not Presented In The Database";
	 }
	 
	 pst.close();
	 con.close();
	
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "Employee having id ="+id+"Deleted Successfully";

	

}

	@Override
	public String updateName(String id) {
		try {
			pst = con.prepareStatement(Query.deleteById);
			pst.setString(1, id);
			 int flag = pst.executeUpdate();
			 if(flag < 0) {
				 return "The Id Value is Not Presented In The Database";
			 }
			 
			 pst.close();
			 con.close();
			
			}
				catch(Exception e) {
					e.printStackTrace();
				}
				return "Employee having id ="+id+" Updated Successfully";
	}
}
