import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PracticeJdbc {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String dbUrl="jdbc:mysql://localhost:3306/covalense_db";
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
