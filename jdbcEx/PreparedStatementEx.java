package jdbcEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementEx {
	
	
	Connection con;
	PreparedStatement pstStatement;
	ResultSet rsSet;
	
	public PreparedStatementEx() throws ClassNotFoundException, SQLException {
		con = MyConnection.getMyConnection();
		System.out.println("connection get open");
		
	}
	
	public void getData(float minSalary,float maxSalary) throws SQLException {
		pstStatement = con.prepareStatement("select * from employee where salary between ? and ?");
		pstStatement.setFloat(1,minSalary);
		pstStatement.setFloat(2, maxSalary);
		rsSet = pstStatement.executeQuery();//DRL
		
		while(rsSet.next()) {
			
			System.out.println(rsSet.getInt(1) +"\t");
			System.out.println(rsSet.getString(2) +"\t");
			System.out.println(rsSet.getFloat(3) +"\t");
			System.out.println(rsSet.getDate(4) +"\t");
			System.out.println(rsSet.getString(5) +"\t");
			System.out.println();
			
		}
	}
	
	public void insertRecord(int custId,String custName,String address,String phoneNo) throws SQLException
	{
		
		pstStatement = con.prepareStatement("insert into customer values(?,?,?,?)");
		pstStatement.setInt(1, custId);
		pstStatement.setString(2, custName);
		pstStatement.setString(3, address);
		pstStatement.setString(4, phoneNo);
		
		int n = pstStatement.executeUpdate();//DML
		System.out.println(n+" record is insrted");
				
				
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		PreparedStatementEx p1 = new PreparedStatementEx();
		p1.getData(50000, 80000);
		p1.insertRecord(107, "Rohit", "Mumbai","7039676663");
	}

}
