package secondJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Collage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:postgresql://localhost:5432/school";
        String username = "postgres";
        String pwd = "root";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, username, pwd);

            PreparedStatement ps = conn.prepareStatement( "INSERT INTO collage VALUES (?, ?)" );

            System.out.println("Enter the id : ");
            int value1 = sc.nextInt();
            ps.setInt(1, value1);

            sc.nextLine(); 

            System.out.println("Enter the name : "); 
            String value2 = sc.nextLine(); 
            ps.setString(2, value2);

            ps.executeUpdate();
            conn.close();

           

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
