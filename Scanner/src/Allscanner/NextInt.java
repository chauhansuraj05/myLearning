package Allscanner;

import java.util.Scanner;

public class NextInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================");

       
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

       
        int addition = a + b + c;
        int multiplication = a * b * c;
        int subtraction = a - b - c;

       
        int division = 0;
        if (b != 0 && c != 0) {
            division = a / b / c;
        } else {
            System.out.println("Division skipped");
        }

       
        System.out.println("------------------------------");
        System.out.println("Addition: " + addition);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Division: " + division);


       
        sc.close();
    }
}
