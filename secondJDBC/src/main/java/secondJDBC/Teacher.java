package secondJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Teacher {
	
	public static void main(String[] args) {
   	 
   	 Scanner sc = new Scanner(System.in);
   	 
   	   String url = "jdbc:postgresql://localhost:5432/school";
		   String username = "postgres";
		   String pwd = "root";
 
		   try {
			   Class.forName("org.postgresql.Driver");
		   Connection  conn = DriverManager.getConnection(url,username,pwd);
		    
//		   PreparedStatement  ps = conn.prepareStatement("INSERT INTO teacher Values(?,?,?,?);");
//		   
//		   System.out.println("Enter the id : ");
//		   int value1 = sc.nextInt();
//		   ps.setInt(1, value1);
//		   
//		   System.out.println("Enter the name : "); 
//		   String value2 = sc.next();
//		   ps.setString(2, value2); 
//		   
//		   System.out.println("Enter the gender : ");
//		   String value3 = sc.next(); 
//		   ps.setString(3, value3);
//		   
//		   System.out.println("Enter the subject : ");
//		   String value4 = sc.next();
//		   ps.setString(4, value4); 
//		   
//		   ps.execute(); 

//		   
		     
		  
//		   String sql = "UPDATE teacher SET gender = ? WHERE id = ?";
//		   PreparedStatement ps = conn.prepareStatement(sql);
//
//		   System.out.print("Enter Gender: ");
//		   String gender = sc.next();
//		   ps.setString(1, gender);
//
//		   System.out.print("Enter Teacher ID: ");
//		   int id = sc.nextInt();
//		   ps.setInt(2, id);
//
//		   ps.executeUpdate();
//		   conn.close();   
		   
	       
		   String sql = "DELETE FROM teacher WHERE id = ?";
		   PreparedStatement ps = conn.prepareStatement(sql);

		   System.out.print("Enter Teacher ID : ");
		   int id = sc.nextInt();

		   ps.setInt(1, id);

		   ps.executeUpdate();

		  

		   conn.close();
 
 
		   


		                                        	  
		   }catch(ClassNotFoundException | SQLException e) {
			   e.printStackTrace(); 
		   }
	}

}


