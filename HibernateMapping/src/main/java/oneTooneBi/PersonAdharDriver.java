package oneTooneBi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersonAdharDriver {
      
	public static void main(String[] args) {
		  EntityManagerFactory emf =
	                Persistence.createEntityManagerFactory("abc");

	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();
	        
	        et.begin();
	         Person p = new Person();
	         p.setName("Ravi");
	         p.setAge(23);
	         
	         Adhar a = new Adhar();
	         a.setAdharNo(1234567901);
	         a.setDob("09-04-1999");
	         p.setP(a);
	         a.setP(p);
	         
	         em.persist(a);
	         em.persist(p);
	         et.commit();
	         
	         
	         

	}
}
