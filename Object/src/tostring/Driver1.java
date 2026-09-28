package tostring;

public class Driver1 {

    public static void main(String[] args) {

        SOne obj1 = new SOne("Ravi", "Black", 987654, 101);
        STwo obj2 = new STwo("Sona", "White", 456789, 202);
        SThree obj3 = new SThree("Amit", "Blue", 33, 303);
        SFour obj4 = new SFour("Neha", "Red", 9001, 404);
        SFive obj5 = new SFive("Karan", "Silver", 778899, 505);

        System.out.println(obj1);
        System.out.println("========================"); 

        System.out.println(obj2);
        System.out.println("========================");

        System.out.println(obj3);
        System.out.println("========================");

        System.out.println(obj4);
        System.out.println("========================");

        System.out.println(obj5);
    }
}
