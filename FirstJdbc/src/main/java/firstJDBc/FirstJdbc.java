package firstJDBc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbc {
public static void main(String[] args) {
	try {
        // Load PostgreSQL Driver
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver Loaded");

        // Create connection
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/school",
                "postgres",
                "root"
        );

        System.out.println("Connection Established");
        System.out.println(connection);

        // Create statement
        Statement statement = connection.createStatement();
        System.out.println("Statement created");

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
}
}



        
