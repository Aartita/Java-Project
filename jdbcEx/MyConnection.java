package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	
	static Connection con;
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		
		
		if(con==null) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/aftrbatch","root","Aarti@123");
			
		    return con;
	}
		else {
			
			return con;
		}
	
	}

}
