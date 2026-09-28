package com.ty;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FirstHibernate {
	
   public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");	
	System.out.println(emf);
	
   EntityManager em	= emf.createEntityManager();
   System.out.println("Crud Opration"); 
   
  EntityTransaction et = em.getTransaction();
  System.out.println("Transaction Started");
  
  et.begin();

  Employee ee = new Employee();
  ee.setAge(24);
  ee.setName("Sona");
  ee.setId(103);
  
  em.persist(ee);

  et.commit();
  
   
 }     
}
