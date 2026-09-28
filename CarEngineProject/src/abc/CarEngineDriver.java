package abc;

public class CarEngineDriver {

    public static void main(String[] args) {

        Car car = new Car("Honda");

        String name = car.getCarModel();
        System.out.println("Car Model: " + name);

        System.out.println("Horse Power: " + car.getEngine().getHorsePower());
    }
}
