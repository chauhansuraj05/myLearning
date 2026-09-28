package com.ty;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FindDataByIDNamedParameter {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("abc");
        EntityManager em = emf.createEntityManager();

        
        Query query = em.createQuery("SELECT e FROM Employee e WHERE e.id = :id");

        query.setParameter("id", 2);

       Employee e1 = (Employee)query.getSingleResult();
        
        
     	   System.out.println("Id :"+e1.getId());
     	   System.out.println("name :"+e1.getName());
     	   System.out.println("Age :"+e1.getAge());
        


        em.close();
        emf.close();
    }
} 
