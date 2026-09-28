package firstJDBc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class InsertOpration {
	 public static void main(String[] args) {
      try {
    	  Class.forName("org.postgresql.Driver");
    	  
    	  String url ="jdbc:postgresql://localhost:5432/school";
    	  String username = "postgres";
    	  String pwd = "root";
    	  
    	  Connection connection = DriverManager.getConnection(url,username,pwd);
    	  System.out.println(connection);
    	  
    	  Statement stmt = connection.createStatement();
    	  
    	  String sql = "INSERT INTO student VALUES(103;l,'Navin',21)";
    	  stmt.execute(sql);
//    	  String update = "UPDATE STUDENT SET age= 40 WHERE id = 103 ";
//    	  stmt.execute(update);
    	  
    	  connection.close();
      }catch(ClassNotFoundException e) {
    	  e.fillInStackTrace();
      }catch(SQLException e) {
    	  e.printStackTrace();
      }
} 
}



