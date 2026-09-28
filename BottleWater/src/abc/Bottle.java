package abc;

public class Bottle {

    private String brand;         
    private double capacity;      
    private Water water = new Water("Mineral", 20);

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    
    public String getBrand() {
        return brand;
    }

    public double getCapacity() {
        return capacity;
    }

    public Water getWater() {
        return water;
    }

  
    Bottle() {}

    
    Bottle(String brand, double capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }
}
