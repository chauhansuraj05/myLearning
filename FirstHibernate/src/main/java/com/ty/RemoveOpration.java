package com.ty;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class RemoveOpration {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee ee = em.find(Employee.class,1);

		
		et.begin();
		em.remove(ee);
		et.commit();
			
				
	}

}
