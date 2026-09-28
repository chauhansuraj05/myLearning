package com.ty;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FindDataByIDPostionalParameter {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("abc");
        EntityManager em = emf.createEntityManager();

        
        Query query = em.createQuery("SELECT e FROM Employee e WHERE e.id = ?1");

        query.setParameter(1, 2);
    
          Employee e = (Employee)query.getSingleResult();
     
        
     
     	   System.out.println("Id :"+e.getId());
     	   System.out.println("name :"+e.getName());
     	   System.out.println("Age :"+e.getAge());
        
        em.close();
        emf.close();
    }
}
