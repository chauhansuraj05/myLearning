package manyToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FetchSingleData {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        Review review = em.find(Review.class, 1);
        System.out.println(review.getId());
        System.out.println(review.getRatings());
        System.out.println(review.getComments());
        System.out.println(review.getProduct().getName());
        
//        Product p = em.find(Product.class,1);
//        System.out.println(p.getTd());
//        System.out.println(p.getName());
//        System.out.println(p.getPrice());
        
	}

}
