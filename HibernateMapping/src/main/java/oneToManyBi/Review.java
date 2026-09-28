package oneToManyBi;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;


@Entity(name = "Review_r")
@Table(name = "Review_Table")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double ratings;
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product p;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}
	

}
