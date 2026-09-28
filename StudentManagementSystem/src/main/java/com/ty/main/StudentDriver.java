package com.ty.main;
import java.util.Scanner;

import com.ty.service.AdminService;
import com.ty.service.CourseService;
import com.ty.service.StudentService;

public class StudentDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========== STUDENT MANAGEMENT SYSTEM ==========");
            System.out.println("1. Admin Menu");
            System.out.println("2. Student Menu");
            System.out.println("3. System Features"); 
            System.out.println("4. EXIT");
            System.out.print("Enter Your Choice: ");

            int mainChoice = sc.nextInt();

            switch (mainChoice) {

               
            
                case 1:
                	  AdminService as =new  AdminService();
                       as.adminService();
                    break;
                        
                case 2:
                	  StudentService ss= new StudentService();
                         ss.studentService();
                    break;
                
                case 3:
                	CourseService cs = new CourseService();
                	   cs.courseService();
                    break;
                    
                case 4:return; 

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        }
    }
}
