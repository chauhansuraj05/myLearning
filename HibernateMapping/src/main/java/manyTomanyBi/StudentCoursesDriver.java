package manyTomanyBi;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;



public class StudentCoursesDriver {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("abc");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        
        Student s1 = new Student();
        s1.setName("Suraj");
        s1.setAge(21);
        s1.setGender("Male");

        Student s2 = new Student();
        s2.setName("Rahul");
        s2.setAge(22);
        s2.setGender("Male");

       
        Courses c1 = new Courses();
        c1.setCoursename("Java");
        c1.setFees(15000);

        Courses c2 = new Courses();
        c2.setCoursename("SQL");
        c2.setFees(10000);

      
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);

        List<Courses> courseList = new ArrayList<>();
        courseList.add(c1);
        courseList.add(c2);

       
        c1.setS(studentList);
        c2.setS(studentList);

        s1.setC(courseList);
        s2.setC(courseList);

       
        et.begin();

        em.persist(c1);
        em.persist(c2);
        em.persist(s1);
        em.persist(s2);

        et.commit();

        em.close();
        emf.close();

    }
    
}
