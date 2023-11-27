import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FileInput {
	public static void main(String[] args) {
		try {


			String jdbc = "jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";
			String user = "root";
			String pass = "Rk@918244";

			String Query = "insert into files values(?,?,?,?,?)  ";

			Connection con = DriverManager.getConnection(jdbc, user, pass);
			PreparedStatement stmt = con.prepareStatement(Query);
			BufferedReader lineReader = new BufferedReader(new FileReader("‪E:\\Jar\\Spring.csv"));
	            String lineText = null;
				int batchSize = 10;
				int count = 0;
				while ((lineText = lineReader.readLine()) != null) {
					String[] data = lineText.split(",");
					String sno = data[0];
					String modulo = data[1];
					String question = data[2];
					String option = data[3];
					String answer = data[4];
					
					stmt.setString(1, sno);
					stmt.setString(2, modulo);
					stmt.setString(3, question);
					stmt.setString(4, option);
					stmt.setString(5, answer);

					stmt.addBatch();

					if (count % batchSize == 0) {
						stmt.executeBatch();
					}
				}
				stmt.executeBatch();
				lineReader.readLine();
				lineReader.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
