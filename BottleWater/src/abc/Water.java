package abc;

public class Water {

    private String type;
    private double temperature;

    
    public String getType() {
        return type;
    }

    public double getTemperature() {
        return temperature;
    }

    
    public void setType(String type) {
        this.type = type;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

 
    Water() {}

    
    Water(String type, double temperature) {
        this.type = type;
        this.temperature = temperature;
    }
}
