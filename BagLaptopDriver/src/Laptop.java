
public class Laptop {

    private String brand;
    private int ram;

    
    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

   
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    
    Laptop() {}

   
    Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }
}
