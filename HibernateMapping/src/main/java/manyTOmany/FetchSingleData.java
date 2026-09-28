package manyTOmany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import oneTomany.Student;

public class FetchSingleData {

	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        Student s = em.find(Student.class, 1);
        
        System.out.println("ID :"+ s.getId());
        System.out.println("Name :"+s.getName());
        System.out.println("Age :"+s.getAge());
        System.out.println("Gender :"+s.getGender());
        System.out.println("Courses :"+ s.getCourses() );
        

	}    
}
