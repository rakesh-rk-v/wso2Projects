package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class employee 
{
	public static void main(String[] args)
	{
		try 
		{
			String jdbc = "jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";
			String user = "root";
			String pass="Rk@918244";
		
			Connection con = DriverManager.getConnection(jdbc,user,pass);
			Statement stmt= con.createStatement();
			ResultSet re = stmt.executeQuery("select * from persons");
			while(re.next()) 
			{
				System.out.println(re.getInt(1) + "\t" + re.getString(2) + "\t" + re.getString(3) + "\t"
						+ re.getString(4) + re.getBlob(6));
			}
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	
	}

}


