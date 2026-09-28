package abc;

public class BottleWaterDriver {

    public static void main(String[] args) {

        Bottle bottle = new Bottle("Milton", 1.0);

        System.out.println("Bottle Brand: " + bottle.getBrand());
        System.out.println("Bottle Capacity: " + bottle.getCapacity() + " L");

        System.out.println("Water Type: " + bottle.getWater().getType());
        System.out.println("Water Temperature: " + bottle.getWater().getTemperature() + "°C");
    }
}
