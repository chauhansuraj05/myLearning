package com.ty.service;

import java.util.Scanner;

public class StudentService {
	
	public void studentService() {
		
		Scanner sc = new Scanner(System.in);
		  while (true) {
              System.out.println("\n----- STUDENT MENU -----");
              System.out.println("1. Register New Student");
              System.out.println("2. Update Student Profile");
              System.out.println("3. Enroll in a Course");
              System.out.println("4. View Enrolled Courses");
              System.out.println("5. Back to Main Menu");
              System.out.print("Enter Your Choice: ");

              int studentChoice = sc.nextInt();

              switch (studentChoice) {
                  case 1:
                      System.out.println("Register New Student");
                      break;
                  case 2:
                      System.out.println("Update Student Profile");
                      break;
                  case 3:
                      System.out.println("Enroll in a Course");
                      break;
                  case 4:
                      System.out.println("View Enrolled Courses");
                      break;
                  case 5:
                      System.out.println("Returning to Main Menu...");
                      break;
                  default:
                      System.out.println("Invalid Student Choice");
              }

              if (studentChoice == 5)
                  break;
          }

	}

}
