package firstJDBc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Agedeletion {
   public static void main(String[] args) {
	try {
		Class.forName("org.postgresql.Driver");
		 
		String url = "jdbc:postgresql://localhost:5432/school";
		String username = "postgres";
		String pwd = "root";
		
		Connection connection = DriverManager.getConnection(url,username,pwd);
  	    System.out.println(connection);
  	  

	    Statement stmt = connection.createStatement();
	     
//	    String sql = "INSERT INTO agedrop VALUES(103,'sona',22)";
//  	  stmt.execute(sql);
  	  
//  	 String update = "UPDATE agedrop SET age= 40 WHERE id = 103 ";
//	  stmt.execute(update);
	    
	   String delete = "DELETE FROM agedrop WHERE age = 21";
	    int count =  stmt.executeUpdate(delete);
	  
		System.out.println("No. of Record Deleted" + count);
		
	}catch(ClassNotFoundException |SQLException e) {
		e.printStackTrace();
		
	}
}
}
