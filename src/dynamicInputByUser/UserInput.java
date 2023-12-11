package dynamicInputByUser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class UserInput {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/youtude";
			String username = "root";
			String password = "kumar@1999mukesh";
			Connection con = DriverManager.getConnection(url,username,password);
		    String q ="insert into student(sName,sCity) values(?,?)";
		    
		    PreparedStatement pstmt = con.prepareStatement(q);
		    Scanner scn = new Scanner(System.in);
		    System.out.println("Enter Student name :");
		    String name = scn.nextLine();
		    System.out.println("Enter Student city :");
		    String city = scn.nextLine();
		    
		    pstmt.setString(1, name);
		    pstmt.setString(2, city);
		    
		    pstmt.executeUpdate();
		    System.out.println("Insert Data in the Student Tabale Successfully...");
		    con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
