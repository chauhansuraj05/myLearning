package com.ty.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ty.entity.Course;
import com.ty.entity.Student;

public class CourseDao {
	
	

	public void addCourse() {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:postgresql://localhost:5432/studentdb?user=postgres&password=root";
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement ps = conn.prepareStatement("Insert into courses values(?,?,?)");
			
			System.out.println("~~~~~~~~ Enter Student details ~~~~~~~~");
			System.out.println();
			System.out.println("Course id : ");
			int id = sc.nextInt();
			ps.setInt(1 ,id);
			
			System.out.println("Course Name : ");
			String name = sc.next();
			ps.setString(2, name);
			
			System.out.println("Course  Credits: ");
			int credits = sc.nextInt();
			ps.setInt(3, credits);
						
			ps.execute();
			
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public List<Course> getCourse() {

	    ArrayList<Course> courses = new ArrayList<>();
	    String sql = "SELECT * FROM courses";

	    try {
	        Connection connection = DriverManager
	                .getConnection("jdbc:postgresql://localhost:5432/studentdb",
	                               "postgres",
	                               "root");

	        PreparedStatement preparedStatement =
	                connection.prepareStatement(sql);

	        ResultSet rs = preparedStatement.executeQuery();

	        while (rs.next()) {

	        	Course course = new Course();

	        	course.setId(rs.getInt("id"));
	        	course.setName(rs.getString("name"));
	        	course.setCredits(rs.getInt("credits"));
	        	courses.add(course);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return courses;
	}
		


}
