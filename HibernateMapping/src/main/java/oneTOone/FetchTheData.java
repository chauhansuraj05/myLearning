package oneTOone;

import com.ty.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FetchTheData {  
	public static void main(String[] args) {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
		    EntityManager em = emf.createEntityManager();
		    EntityTransaction et = em.getTransaction();
		    
		    Car c = em.find(Car.class, 1);
		  
		    System.out.println(c.getId());
		    System.out.println(c.getBrand());
		    System.out.println(c.getPrice());
		    System.out.println(c.getEngine().getHorsePower());
	}
	 	
}

