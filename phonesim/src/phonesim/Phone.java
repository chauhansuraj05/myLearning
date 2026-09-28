package phonesim;

public class Phone {

	private String brand;
	private String color;
	private Sim sim = new Sim("Airtel",1234567890);
	
	public void setbrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
	 return color;
	}
	
	public Sim getSim() {
		return sim;
	}
	
	Phone() {
       
    }
	Phone(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
}
