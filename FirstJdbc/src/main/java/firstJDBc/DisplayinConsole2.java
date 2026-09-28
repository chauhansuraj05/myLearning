package firstJDBc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DisplayinConsole2 {
   public static void main(String[] args) {
	try {
		Class.forName("org.postgresql.Driver");
		 
		String url = "jdbc:postgresql://localhost:5432/school";
		String username = "postgres";
		String pwd = "root";
		
		Connection connection = DriverManager.getConnection(url,username,pwd);
  	    System.out.println(connection);
  	  

	    Statement stmt = connection.createStatement();
	     	    
	   String select = "SELECT * FROM student";
	   stmt.execute(select);
	    ResultSet resultSet = stmt.getResultSet();
	    while(resultSet.next()) {
	    	System.out.print(resultSet.getInt(1)+" ");
	    	System.out.print(resultSet.getString("name")+" ");
	    	System.out.print(resultSet.getInt("age")+" ");
	    	System.out.println();
	    }
	    
	    
	   
	    	
	}catch(ClassNotFoundException |SQLException e) {
		e.printStackTrace();
		
	}
}
}
