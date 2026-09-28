package com.ty;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InertionInHibernate {
	
   public static void main(String[] args) {
	   
	   //Establish Connection
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");	
	
	//CRUD Operation
    EntityManager em	= emf.createEntityManager();   
   
   //Start Transaction
    EntityTransaction et = em.getTransaction();
 
  
  et.begin();

  Student s = new Student();
  
  s.setId(1);
  em.persist(s);   
  et.commit();
  
  Employee ee = new Employee();
  ee.setAge(24);
  ee.setName("Mona");
  ee.setId(3);
  
  em.persist(ee);

  et.commit();
  
   
 }     
}
