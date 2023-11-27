import java.sql.*;
import java.util.*;
public class Employee {

	static int[] count;
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);


			String jdbc = "jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";
			String user = "root";
			String pass="Rk@918244";
			
			Connection con = DriverManager.getConnection(jdbc,user,pass);
			PreparedStatement stmt=
			con.prepareStatement("insert into employee (ename,gender,doj,user_id)values(?,?,?,?)");
			while(true) {
				System.out.print("Employee Name :");
				stmt.setString(1,sc.nextLine());
				System.out.print("Employee Gender :");
				stmt.setString(2,sc.nextLine());
				System.out.println("Employee DOJ (YYYY-MM-DD)FORMAT ONLY :");
				stmt.setString(3,sc.nextLine());
				System.out.print("Employee User_Id :");
				stmt.setString(4, sc.nextLine());
				System.out.println("Do You Want To Again Insert Y/N");
				String opt=sc.nextLine();
				stmt.addBatch();
				if(opt.equals("N")|| opt.equals("n")) 
				break;
				
				}
			count = stmt.executeBatch();
			System.out.println("\n"+count.length+" rows affected");
			sc.close();
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	
	}

}
