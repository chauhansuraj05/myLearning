package firstJDBc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayPrepareExecution {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/school";
        String username = "postgres";
        String pwd = "root";

        try {
            
            Class.forName("org.postgresql.Driver");

            
            Connection connection = DriverManager.getConnection(url, username, pwd);
         
            String sQ = "SELECT * FROM student;";
            PreparedStatement p = connection.prepareStatement(sQ);
           

            ResultSet rs = p.executeQuery();

           
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1)+" " +   
                          rs.getString(2)+" " +
                         rs.getInt(3)+" "	
                );
            }
 
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
