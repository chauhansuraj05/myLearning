package firstJDBc;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class PrepareExecution {
	
	public static void main(String[] args) {
		   String url = "jdbc:postgresql://localhost:5432/school";
		   String username = "postgres";
		   String pwd = "root";
		   
		   try {
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(url,username,pwd);
		
		PreparedStatement  preparedStatement =connection.prepareStatement("INSERT INTO student Values(?,?,?);");
		preparedStatement.setInt(1,108);
		preparedStatement.setString(2,"ABC");
		preparedStatement.setInt(3, 100);
		
		preparedStatement.execute();
		
		System.out.println("Record Inserted"); 
		connection.close();
		}catch(ClassNotFoundException |SQLException e) {
		e.printStackTrace();
	 } 
	}

}
 