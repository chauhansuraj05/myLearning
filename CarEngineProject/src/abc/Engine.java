package abc;

public class Engine {

    private double horsePower;

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    Engine() {}

    Engine(double horsePower) {
        this.horsePower = horsePower;
    }
}
