package com.bms.dob;

import java.util.List;
import java.util.Scanner;

import com.bms.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CustomerDAO {

	Scanner sc = new Scanner(System.in);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void createCustomer() {

	    System.out.println("Enter Number of Records to Enter:");
	    int input = sc.nextInt();
	    sc.nextLine();   

	    for (int i = 1; i <= input; i++) {

	        System.out.println("\nEntering Details for Customer " + i);

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Age: ");
	        int age = sc.nextInt();
	        sc.nextLine();  

	        System.out.print("Enter Email: ");
	        String email = sc.nextLine();

	        System.out.print("Enter Gender: ");
	        String gender = sc.nextLine();

	        System.out.print("Enter Address: ");
	        String address = sc.nextLine();

	        System.out.print("Enter Phone Number: ");
	        long phNo = sc.nextLong();   
	        sc.nextLine();   

	        Customer c = new Customer();
	        c.setName(name);
	        c.setAge(age);
	        c.setEmail(email);
	        c.setGender(gender);
	        c.setAddress(address);
	        c.setPhNo(phNo);

	        et.begin();
	        em.persist(c);
	        et.commit();

	        System.out.println("✅ Customer " + i + " Saved Successfully!");
	    }
	}	
	public void viewRecords()
	{
		Query query = em.createQuery("SELECT c FROM Customer c");
		
		List<Customer> ls = query.getResultList();
		for(Customer c : ls)
		{
			System.out.println("Id : " + c.getId());
			System.out.println("Name : " + c.getName());
			System.out.println("Age : " + c.getAge());
			System.out.println("Gender : " + c.getGender());
			System.out.println("Email : " + c.getEmail());
			System.out.println("Phone Number : " + c.getPhNo());
			System.out.println("Address : " + c.getAddress());
			System.out.println();
			System.out.println("=========================================");
			System.out.println();
		}
		
	}
	
	public void updateRecord() {

	    System.out.println("Enter Customer ID to Update:");
	    int id = sc.nextInt();
	    sc.nextLine();

	    System.out.println("Enter New Name:");
	    String name = sc.nextLine();

	    System.out.println("Enter New Age:");
	    int age = sc.nextInt();
	    sc.nextLine();

	    System.out.println("Enter New Email:");
	    String email = sc.nextLine();

	    System.out.println("Enter New Gender:");
	    String gender = sc.nextLine();

	    System.out.println("Enter New Address:");
	    String address = sc.nextLine();

	    System.out.println("Enter New Phone Number:");
	    long phNo = sc.nextLong();
	    sc.nextLine();

	    et.begin();

	    Query query = em.createQuery(
	        "UPDATE Customer c SET c.name = :name, c.age = :age, c.email = :email,c.gender = :gender,c.address = :address, c.phNo = :phNo ,WHERE c.id = :id" 

	    );

	    query.setParameter("name", name);
	    query.setParameter("age", age);
	    query.setParameter("email", email);
	    query.setParameter("gender", gender);
	    query.setParameter("address", address);
	    query.setParameter("phNo", phNo);
	    query.setParameter("id", id);

	    int res = query.executeUpdate();

	    et.commit();

	    if (res > 0) {
	        System.out.println("Record Updated");
	    } else {
	        System.out.println("Customer Not Found!");
	    }
	}
	
	public void deleteRecord() {

	    System.out.println("Enter Customer ID to Delete:");
	    int id = sc.nextInt();
	    sc.nextLine();

	    et.begin();

	    Query query = em.createQuery(
	        "DELETE FROM Customer c WHERE c.id = :id"
	    );

	    query.setParameter("id", id);

	    int res = query.executeUpdate();

	    et.commit();

	    if (res > 0) {
	        System.out.println("Record Deleted");
	    } else {
	        System.out.println("Customer Not Found!");
	    }
	}
	
	
}