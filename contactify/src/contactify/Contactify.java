package contactify;
import java.sql.*;
import java.util.Scanner;

public class Contactify {

	public static void main(String[] args) throws Exception {

		Contact contact;
		String url = "jdbc:mysql://localhost:3306/contactify_db";
		String user = "root";
		String password = "boot2894$hift";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		
	
		try {
			
			ResultSet rs = stmt.executeQuery("select * from contact");
			System.out.println("Connection Successful");
			//print the database results to terminal
			
			while(rs.next()) {
				
				System.out.print("{");
				System.out.print("First name:" + " " + rs.getString(2) + ", ");
				System.out.print("Last name:" + " " + rs.getString(3) + ", ");
				System.out.print("Zip Code:" + " " + rs.getString(4));
				System.out.println("}, ");		
			}
			
			conn.close();
			System.out.println("Connection Closed!");
			
		} catch (Exception e) {
			System.out.print(e);	
		}
		

	}

}
