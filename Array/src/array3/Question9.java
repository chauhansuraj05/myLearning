package array3;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix (n): ");
        int n = sc.nextInt();

        char[][] arr = new char[n][n];

        // 1️⃣ X Pattern (Cross)
        System.out.println("\nX Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    System.out.print("* ");
                } 
                else if (i + j == n - 1) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n=========================\n");

        // 2️⃣ Hollow Center Pattern
        System.out.println("Hollow Center Pattern:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (n % 2 != 0 && i == n / 2 && j == n / 2) {
                    // center position (only for odd n)
                    System.out.print("  ");
                } 
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
