package oneTooneBi;

import jakarta.persistence.*;

public class FecthSingleRecord {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = em.find(Person.class, 1);
		
		System.out.println("Id :"+p.getId());
		System.out.println("Name :"+p.getName());
		System.out.println("Age :"+p.getAge());
		System.out.println("Date Of Birth :" +p.getP().getDob());
		System.out.println("Adhar Number :"+p.getP().getAdharNo());
		
		
		Adhar a = em.find(Adhar.class, 1);
		System.out.println(a.getP().getName());
	}

}
 