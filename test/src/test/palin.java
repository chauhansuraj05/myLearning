package test;

public class palin {

    public static void main(String[] args) {

        String s = "suraj";
        String a = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            a = a + s.charAt(i);
        }

        if (s.equals(a)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not Palindrome String");
        }
    }
}
