package hashcode;

public class HOne {

    String name;
    String loc;
    double pn;
    int a;

    public HOne(String name, String loc, double pn, int a) {
        this.name = name;
        this.loc = loc;
        this.pn = pn;
        this.a = a;
    }

    
    public int hashCode() {
        return name.hashCode()
             + loc.hashCode()
             + Double.hashCode(pn)
             + Integer.hashCode(a);
    }

}
