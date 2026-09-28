package oneTOone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CarEngineDriver { 
	public static void main(String[] args) {
		
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
	    EntityManager em = emf.createEntityManager();
	    EntityTransaction et = em.getTransaction();
	    System.out.println("Table Craeted");
	    
	    et.begin();
	    
	    Car c = new Car();
	    c.setBrand("Sky");
	    c.setPrice(20000000);
	    	   
	    
	    Engine e = new Engine();
	    e.setHorsePower(5000);
	    c.setEngine(e);
	    
	    em.persist(e);
	    em.persist(c);
	    et.commit();
	    
	    em.close();
	    emf.close();
	}

}
