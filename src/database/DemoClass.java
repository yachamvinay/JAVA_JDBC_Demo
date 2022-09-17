package database;
import java.sql.*;
public class DemoClass {
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/greatlearning","root","vinay123");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while(rs.next())
				System.out.println(rs.getInt("rollno")+" "+rs.getDouble("marks")+" "+rs.getString("studname"));
			
			con.close();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
	}
	}
}
