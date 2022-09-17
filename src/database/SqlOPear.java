package database;
import java.sql.*;
import java.util.Scanner;
public class SqlOPear {
	public static void main(String[] args) throws Exception
	{
		Connection con=null;
		PreparedStatement ps=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno: ");
		int id=sc.nextInt();
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter english marks:");
		float marks=sc.nextFloat();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jdbc","root","vinay123");
			String str="Insert into student(rollno, studname, marks) values(?,?,?)";
			ps=con.prepareStatement(str);
			ps.setInt(1, id);
			ps.setString(2,  name);
			ps.setFloat(3, marks);
			
			int ans=ps.executeUpdate();
			if(ans>0)
			{
				System.out.println("Record inserted");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
	}
	}

}
