package com.ty;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAllData {

     public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
			
	Query query= em.createQuery("SELECT e from Employee e" );
      
   List<Employee> e = query.getResultList();
   
   for(Employee e1 : e) {  
	   System.out.println("Id :"+e1.getId());
	   System.out.println("name :"+e1.getName());
	   System.out.println("Age :"+e1.getAge());
   }
			
				
					
		}

	}




