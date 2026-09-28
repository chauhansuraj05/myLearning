package manyToOne;

import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class ReviewProductDriver {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        et.begin();

        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(60000);

        Review review = new Review();
        review.setRatings(3);
        review.setComments("Good");

        Review review1 = new Review();
        review1.setRatings(1);
        review1.setComments("Bad");

       
        review.setProduct(product);
        review1.setProduct(product);

        List<Review> list = new ArrayList<>();
        list.add(review);
        list.add(review1);


        
        em.persist(review);
        em.persist(review1);
        em.persist(product);

        et.commit();
        em.close();
        emf.close();	}

}
