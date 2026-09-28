package com.bms.service;

import java.util.Scanner;

import com.bms.dob.CustomerDAO;

public class CustomerService {
     
	public void customerMenu() {
			
			Scanner sc = new Scanner(System.in);
			 while (true) {

		            System.out.println("1. Create a new Customer");
		            System.out.println("2. View All Customer");
		            System.out.println("3. Update a Customer"); 
		            System.out.println("4. Delete a Customer");
		            System.out.println("5. Back To MainMenu" );
		            System.out.println("");
		            System.out.print("Enter Your Choice: ");

		            int mainChoice1 = sc.nextInt();
		            CustomerDAO d1 = new CustomerDAO();

		            switch (mainChoice1)
		            {

		               
		                case 1:
		                	d1.createCustomer();
		                    break;
		                       
		                
		                case 2:
		                	d1.viewRecords();
		                    break;
		                
		              
		                case 3:
		                	d1.updateRecord();
		                    break;
		                    
		                  
		                case 4:
		                	d1.deleteRecord();
		                    break;
		                     
		                case 5:
		                	return; 

		                default:
		                    System.out.println("Invalid Choice! Try Again.");
		            }
			 }
	}
}


     
	
