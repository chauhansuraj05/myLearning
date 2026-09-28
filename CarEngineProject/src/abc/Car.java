package abc;

public class Car {

    private String carModel;
    private Engine engine = new Engine(1200);

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    Car() {}

    Car(String carModel) {
        this.carModel = carModel;
    }
}
