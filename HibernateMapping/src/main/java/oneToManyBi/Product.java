package oneToManyBi;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
 
@Entity(name = "Product_p")
@Table(name = "Product_Table")
public class Product {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name ;
		private double price;
		
		@OneToMany(mappedBy ="p")
		private List<Review> r;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public List<Review> getR() {
			return r;
		}

		public void setR(List<Review> r) {
			this.r = r;
		}
		
		
}

