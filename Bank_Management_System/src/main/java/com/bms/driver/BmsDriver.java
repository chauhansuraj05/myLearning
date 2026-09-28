package com.bms.driver;

import jakarta.persistence.EntityManagerFactory;
import java.util.Scanner;
import com.bms.service.CustomerService;
import jakarta.persistence.*;


public class BmsDriver {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 while (true) {

	            System.out.println("\n========== BANk MANAGEMENT SYSTEM ==========");
	            System.out.println("1. Manage Bank");
	            System.out.println("2. Manage Branch");
	            System.out.println("3. Manage Customer"); 
	            System.out.println("4. Manage Account");
	            System.out.println("5. Manage loan");
	            System.out.println("6. EXIT");
	            System.out.println("");
	            
	            System.out.print("Enter Your Choice: ");

	            int mainChoice = sc.nextInt();

	            switch (mainChoice) {

	               
	                //Manage Bank
	                case 1:
	                    break;
	                       
	                //Manage Branch
	                case 2:
	                    break;
	                
	                //Manage Customer
	                case 3:
	                	CustomerService cs = new CustomerService();
	                	cs.customerMenu();
	                    break;
	                    
	                //Manage Account    
	                case 4:
	                    break;
	                    
	                //Manage loan
	                case 5:
	                	break;	                    
	                    
	                case 6:return; 

	                default:
	                    System.out.println("Invalid Choice! Try Again.");
	            }
	        }

		 
	}

}
