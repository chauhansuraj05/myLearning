package manyTomanyBi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchSingleData {
	
	public static void main(String[] args) {
		EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("abc");

        EntityManager em = emf.createEntityManager();
        
        Student s = em.find(Student.class, 1);
        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        System.out.println(s.getC());
        
        
	}

}
