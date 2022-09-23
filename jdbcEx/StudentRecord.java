
	
	package jdbcEx;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

	public class StudentRecord {
		
		
		Connection con;
		PreparedStatement pstStatement;
		ResultSet rsSet;
		
		public StudentRecord() throws ClassNotFoundException, SQLException {
			con = MyConnection.getMyConnection();
			System.out.println("connection get open");
			
		}
		
		public void getData(float minPercentage,float maxPercentage) throws SQLException {
			pstStatement = con.prepareStatement("select * from student where marks between ? and ?");
			pstStatement.setFloat(1,minPercentage);
			pstStatement.setFloat(2, maxPercentage);
			rsSet = pstStatement.executeQuery();//DRL
			
			while(rsSet.next()) {
				
				System.out.println(rsSet.getInt(1) +"\t");
				System.out.println(rsSet.getString(2) +"\t");
				System.out.println(rsSet.getDate(3) +"\t");
				System.out.println(rsSet.getString(4) +"\t");
				System.out.println(rsSet.getFloat(5) +"\t");
				System.out.println();
				
			}
		}
		
		public void insertRecord(int studentId,String Name,LocalDate dob,String city,float percentage) throws SQLException
		{
			
			pstStatement = con.prepareStatement("insert into customer values(?,?,?,?,?)");
			pstStatement.setInt(1, studentId);
			pstStatement.setString(2, Name);
			pstStatement.setObject(3, dob);
			pstStatement.setString(4, city);
			pstStatement.setFloat(5, percentage);
			
			int n = pstStatement.executeUpdate();//DML
			System.out.println(n+" record is insrted");
					
					
		}

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub

			StudentRecord s = new StudentRecord();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the max and min range of percentage");
			int minPercentage =sc.nextInt();
			int maxPercentage = sc.nextInt();
			s.getData(minPercentage, maxPercentage);
			
			System.out.println("Enter the students details:");
			int studentId=sc.nextInt();
			String Name =sc.nextLine();
			CharSequence dob= sc.nextLine();
			LocalDate ldate= LocalDate.parse(dob);
			String city= sc.nextLine();
			float percentage= sc.nextFloat();
			
			s.insertRecord(studentId, Name,ldate, city, percentage);
			
			
		}

	}
