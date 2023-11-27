package com.knot.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.knot.student.Student;
import com.knot.student.db.StudentDBConn;
import com.knot.student.inter.StudentInter;

public class StudentService implements StudentInter{

	@Override
	public Student getStudents(String id) {
		System.out.println("This Is Student Service  id= "+id);
		return new Student(id,"Rakesh","9181446593");
	}
	
	public Student insert(Student std) {
		Connection con = StudentDBConn.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(StudentDBConn.insert);
			pst.setString(1, std.getId());
			pst.setString(2, std.getName());
			pst.setString(3,std.getMobile());
			int f =pst.executeUpdate();
			System.out.println(f);
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		std.setId(null);
		return std;
		
	}

}
