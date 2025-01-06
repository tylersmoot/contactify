package contactify;
import java.sql.*;

public class ContactRepository {
	
	public Connection conn;
	
	public ContactRepository(Connection conn) {
		this.conn = conn;
	}
	
	public String findById(int id) throws SQLException {
		String query = "SELECT * FROM contactify_db WHERE contact_id =" + id;
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		
	    System.out.println(rs.getString(2));
	    return rs.getString(2);
		
	}
	
	
	
	
}
	


