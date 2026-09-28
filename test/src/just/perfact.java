package just;

import java.util.*;

public class perfact {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }

        if (sum == a) {
            System.out.println(a + " is a Perfect Number");
        } else {
            System.out.println(a + " is NOT a Perfect Number");
        }
    }
}
