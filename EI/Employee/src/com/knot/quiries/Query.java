package com.knot.quiries;

public class Query {
	public static String nameChange = "Update Employee set name = ? where id = ?";
	public static String insert = "insert into employee values(?,?,?,?,?)"; 
	public static String getDetailsById = "select * from Employee where id = ? ";
	public static String deleteById = "delete from Employee where id = ? ";
}
