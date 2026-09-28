package test;

public class Reverse {


    public static void main(String[] args) {

        String a = "Java";
        String c = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            c = c + a.charAt(i);
        }

        System.out.println("Reversed : " + c);
    }
}
