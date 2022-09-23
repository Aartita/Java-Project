package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class FirstDatabaseEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aftrbatch","root","Aarti@123");
		
		//Create Statement
		Statement statement = con.createStatement();	
		
		//execute statement
		ResultSet rSet = statement.executeQuery("Select * from contact");
		
		//retrieve the result
		while(rSet.next()) {
			
			System.out.println(rSet.getInt("contact_id") +"\t");
			System.out.println(rSet.getString("pname") +"\t");
			System.out.println(rSet.getString("phone_no") +"\t");
			System.out.println();
			
		}
		
		//close the connection
		statement.close();
		con.close();

	}

}
