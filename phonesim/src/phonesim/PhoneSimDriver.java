package phonesim;



public class PhoneSimDriver {

    public static void main(String[] args) {

        Phone phone = new Phone("Samsung", "Blue");

        System.out.println("Phone Brand: " + phone.getBrand());
        System.out.println("Phone Color: " + phone.getColor());

        System.out.println("SIM Company: " + phone.getSim().getCompany());
        System.out.println("SIM Number: " + phone.getSim().getNumber());
    }
}
