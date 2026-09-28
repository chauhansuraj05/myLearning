package oneTomany;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentCoursesDriver {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        Student s = new Student();
        s.setName("Suraj");
        s.setAge(21);
        s.setGender("Male");

        Courses c1 = new Courses();
        c1.setCoursename("Java");
        c1.setFees(15000);

        Courses c2 = new Courses();
        c2.setCoursename("SQL");
        c2.setFees(10000);

        List<Courses> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);

        s.setCourses(list);

        em.persist(c1);
        em.persist(c2);
        em.persist(s);   

        et.commit();

        em.close();
        emf.close();
    }
}
