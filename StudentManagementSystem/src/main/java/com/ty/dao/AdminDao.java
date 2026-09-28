package com.ty.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ty.entity.Student;

import java.sql.ResultSet;

public class AdminDao {
	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:postgresql://localhost:5432/studentdb?user=postgres&password=root";
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url);
			PreparedStatement ps = conn.prepareStatement("Insert into students values(?,?,?,?)");
			
			System.out.println("~~~~~~~~ Enter Student details ~~~~~~~~");
			System.out.println();
			System.out.println("Student id : ");
			int id = sc.nextInt();
			ps.setInt(1 ,id);
			
			System.out.println("Student Name : ");
			String name = sc.next();
			ps.setString(2, name);
			
			System.out.println("Student Email id : ");
			String email = sc.next();
			ps.setString(3, email);
			
			System.out.println("Student DOB : ");
			String date = sc.next();
			ps.setString(4, date);
			
			
			
			
			ps.execute();
			
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}



public List<Student> getStudents() {

    ArrayList<Student> students = new ArrayList<>();
    String sql = "SELECT * FROM students";

    try {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/studentdb",
                               "postgres",
                               "root");

        PreparedStatement preparedStatement =
                connection.prepareStatement(sql);

        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {

            Student student = new Student();

            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setEmail(rs.getString("email"));
            student.setDob(rs.getString("dob"));

            students.add(student);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return students;
}
}


