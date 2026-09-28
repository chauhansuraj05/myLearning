package manyTOmany;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

public class SCDriver {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("abc");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        
        Courses c1 = new Courses();
        c1.setCoursename("Java");
        c1.setFees(5000);

        Courses c2 = new Courses();
        c2.setCoursename("SQL");
        c2.setFees(3000);

        
        Student s1 = new Student();
        s1.setName("Suraj");
        s1.setAge(22);
        s1.setGender("Male");

        List<Courses> courseList = new ArrayList<>();
        courseList.add(c1);
        courseList.add(c2);

        s1.setCourses(courseList);

        em.persist(c1);
        em.persist(c2);

        em.persist(s1);

        et.commit();

       

        em.close();
        emf.close();
    }
}
