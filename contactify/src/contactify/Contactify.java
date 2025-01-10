package contactify;
import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Contactify {

	public static void main(String[] args) throws Exception {

		Contact contact;
		
		//database connection parameters
		String url = "jdbc:mysql://localhost:3306/contactify_db";
		String user = "root";
		String password = "boot2894$hift";
		
		//resgister jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection using driver manager, using this connection create a statement
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		
		//create a scanner object to take an integer as input to look for a contact by contact_id
		Scanner scan = new Scanner(System.in);
		System.out.println("Contact Id?");
		int result = scan.nextInt();
		
		
	    //try catch to test resultset creating and the output of database query results to the terminal
		try {
			
			ResultSet rs = stmt.executeQuery("select * from contact where contact_id = " + result);
			System.out.println("Connection Successful");
			
			
			//using an array list as the size is dynamics, pushing each contact into an index of the array list
			ArrayList<String> testArr = new ArrayList();
			
			
			//print the database results to terminal
			while(rs.next()) {
				testArr.add("First Name: " + rs.getString(2) +
				            ", Last Name: " + rs.getString(3) +
						    ", Zip Code: " + rs.getString(4) + "\n");
			}
			
			int numOfFoundContacts = testArr.size();
			System.out.println("**Results**");
			System.out.println(testArr);
			System.out.println("Number of Contacts Found: " + numOfFoundContacts);
			
			//close the jdbc connection
			conn.close();
			System.out.println("Connection Closed!");
			
		} catch (Exception e) {
			System.out.print(e);	
		}
		
	}
}
