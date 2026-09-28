package newone;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Practice {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school","postgres","root");
			System.out.println("sucessfull");
			
			Statement stmt =connection.createStatement();
		  
			
		
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
