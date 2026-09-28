package Allscanner;

import java.util.Scanner;

public class NextByte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");

        
        System.out.print("Enter the first number: ");
        byte a = sc.nextByte();

        System.out.print("Enter the second number: ");
        byte b = sc.nextByte();

        System.out.print("Enter the third number: ");
        byte c = sc.nextByte();

      
        int addition = a + b + c;
        int multiplication = a * b * c;
        int subtraction = a - b - c;

        int division = 0;
        if (b != 0 && c != 0) {
            division = a / b / c;
        } else {
            System.out.println("Division skipped (cannot divide by zero)");
        }

        // Output
        System.out.println("----------------------------");
        System.out.println("Addition: " + addition);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Division: " + division);

        sc.close();
    }
}
