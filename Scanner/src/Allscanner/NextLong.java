package Allscanner;

import java.util.Scanner;

public class NextLong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================");

        
        System.out.print("Enter the first number: ");
        long a = sc.nextLong();

        System.out.print("Enter the second number: ");
        long b = sc.nextLong();

        System.out.print("Enter the third number: ");
        long c = sc.nextLong();

        
        long addition = a + b + c;
        long multiplication = a * b * c;
        long subtraction = a - b - c;

        long division = 0;
        if (b != 0 && c != 0) {
            division = a / b / c;
        } else {
            System.out.println("Division skipped (cannot divide by zero)");
        }

       
        System.out.println("------------------------------");
        System.out.println("Addition: " + addition);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Division: " + division);

        sc.close();
    }
}
