package hashcode;

public class Driver3 {

    public static void main(String[] args) {

        
        HOne h1 = new HOne("Sona", "Mumbai", 2.3, 3);
        HOne h2 = new HOne("Sona", "Mumbai", 2.3, 3);

        System.out.println("HOne:");
        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());
        System.out.println(h1.hashCode() == h2.hashCode());
        System.out.println("--------------------------------");

        
        HTwo t1 = new HTwo("Ravi", "Mumbai", "MH", "India");
        HTwo t2 = new HTwo("Ravi", "Mumbai", "MH", "India");

        System.out.println("HTwo:");
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t1.hashCode() == t2.hashCode());
        System.out.println("--------------------------------");

   
        HThree th1 = new HThree("Phone", "Samsung", "S23", "Black");
        HThree th2 = new HThree("Phone", "Samsung", "S23", "Black");

        System.out.println("HThree:");
        System.out.println(th1.hashCode());
        System.out.println(th2.hashCode());
        System.out.println(th1.hashCode() == th2.hashCode());
        System.out.println("--------------------------------");

     
        HFour f1 = new HFour("Java", (short) 2025, (byte) 1, true);
        HFour f2 = new HFour("Java", (short) 2025, (byte) 1, true);

        System.out.println("HFour:");
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());
        System.out.println(f1.hashCode() == f2.hashCode());
        System.out.println("--------------------------------");

     
        HFive fi1 = new HFive("Maths", 90, 89.5, 'B');
        HFive fi2 = new HFive("Maths", 90, 89.5, 'B');

        System.out.println("HFive:");
        System.out.println(fi1.hashCode());
        System.out.println(fi2.hashCode());
        System.out.println(fi1.hashCode() == fi2.hashCode());
    }
}
