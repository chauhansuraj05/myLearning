package com.ty.service;

import java.util.Scanner;

public class CourseService {
	
	public void courseService() {
		  
		Scanner sc = new Scanner(System.in);

		
		while (true) {
            System.out.println("\n----- SYSTEM FEATURES -----");
            System.out.println("1. Batch Add Students");
            System.out.println("2. Connection Pooling Demo");
            System.out.println("3. Metadata (DB + ResultSet)");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter Your Choice: ");

            int sysChoice = sc.nextInt();

            switch (sysChoice) {
                case 1:
                    System.out.println("Batch Add Students");
                    break;
                case 2:
                    System.out.println("Connection Pooling Demo");
                    break;
                case 3:
                    System.out.println("Metadata (DB + ResultSet)");
                    break;
                case 4:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid System Feature Choice");
            }

            if (sysChoice == 4)
                break;
        }
	}

}
