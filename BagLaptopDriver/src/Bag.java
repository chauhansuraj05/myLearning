public class Bag {

    private String brand;                   
    private String color;                  
    private Laptop laptop = new Laptop("HP", 16); 

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Laptop getLaptop() {
        return laptop;
    }

   
    Bag() {}

   
    Bag(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
}
