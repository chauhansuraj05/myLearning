
package mobile;

public class MobileShop {

    
    Vivo vivo = new Vivo();
    Samsung samsung = new Samsung();
    IPhone iphone = new IPhone();

    public Mobile sell(Mobile m) {
        return m;
    }
}
