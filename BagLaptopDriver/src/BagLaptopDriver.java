public class BagLaptopDriver {

    public static void main(String[] args) {

        Bag bag = new Bag("Skybags", "Black");

        System.out.println("Bag Brand: " + bag.getBrand());
        System.out.println("Bag Color: " + bag.getColor());

        System.out.println("Laptop Brand: " + bag.getLaptop().getBrand());
        System.out.println("Laptop RAM: " + bag.getLaptop().getRam() + "GB");
    }
}
