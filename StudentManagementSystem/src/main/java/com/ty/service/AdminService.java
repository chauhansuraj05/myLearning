package com.ty.service;


import java.util.List;
import java.util.Scanner;

import com.ty.dao.AdminDao;
import com.ty.dao.CourseDao;
import com.ty.entity.Course;
import com.ty.entity.Student;

public class AdminService {
	
	public void adminService() {
		
		Scanner sc = new Scanner(System.in);
		
		
        while (true) {
            System.out.println("\n----- ADMIN MENU -----");
            System.out.println("1. Add / Update / Delete Courses (CRUD)");
            System.out.println("2. View All Students");
            System.out.println("3. View All Courses");
            System.out.println("4. View All Enrollments");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter Your Choice: ");

            int adminChoice = sc.nextInt();
 
            switch (adminChoice) {
                case 1:
                	AdminDao ado = new AdminDao();
                    ado.addStudent();
                    break;
                case 2:
                	AdminDao ado1 = new AdminDao();
                	 List<Student> students = ado1.getStudents();

                	    for (Student student : students) {

                	        System.out.println("Student Id   : " + student.getId());
                	        System.out.println("Student Name : " + student.getName());
                	        System.out.println("Student Email: " + student.getEmail());
                	        System.out.println("Student DOB  : " + student.getDob());
                	        System.out.println("--------------------------------");
                	    }
                	    break;
                   
                case 3:
                  CourseDao cd = new CourseDao();
                    cd.addCourse();

                    break;
                case 4:
                	 CourseDao cd1 = new CourseDao();
                	 List<Course> courses = cd1.getCourse();

             	    for (Course courses1 : courses) {

             	        System.out.println("Course Id   : " + courses1.getId());
             	        System.out.println("Course Name : " + courses1.getName());
             	        System.out.println("Course credits : " + courses1.getCredits());
             	        System.out.println("--------------------------------");
             	    }
             	    break;
                   
                case 5:
                    System.out.println("Returning to Main Menu...");
                    break; 
                default:
                    System.out.println("Invalid Admin Choice");
            }

            if (adminChoice == 5)
                break;
        }
	}

	
}
