
package hashcode;

public class HThree {

    String product;
    String brand;
    String model;
    String color;

    public HThree(String product, String brand, String model, String color) {
        this.product = product;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    
    public int hashCode() {
        return product.hashCode()
             + brand.hashCode()
             + model.hashCode()
             + color.hashCode();
    }
}
