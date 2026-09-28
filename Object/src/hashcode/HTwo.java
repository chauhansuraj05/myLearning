package hashcode;

public class HTwo {

    String name;
    String city;
    String state;
    String country;

    public HTwo(String name, String city, String state, String country) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    
    public int hashCode() {
        return name.hashCode()
             + city.hashCode()
             + state.hashCode()
             + country.hashCode();
    }
}
