package oneTOone;

import jakarta.persistence.*;
import jakarta.persistence.Persistence;

public class TestFindDriver {  
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
		EntityManager em = emf.createEntityManager();
		EntityManager em1 = emf.createEntityManager();
		
		
		
		Car c = em.find(Car.class, 1);z
		System.out.println(c.getBrand());
		System.out.println(c.getPrice());
		System.out.println(c.getEngine().getHorsePower());
		
		Car c1 = em.find(Car.class, 1);
		System.out.println(c1.getBrand());
		System.out.println(c1.getPrice());
		System.out.println(c1.getEngine().getHorsePower());
		
		Car c2 = em1.find(Car.class, 1);
		System.out.println(c1.getBrand());
	    System.out.println(c1.getPrice());
        System.out.println(c1.getEngine().getHorsePower());

	}

}
