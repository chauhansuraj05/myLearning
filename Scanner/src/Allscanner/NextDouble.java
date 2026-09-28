package Allscanner;

import java.util.Scanner;

public class NextDouble {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");

        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter the third number: ");
        double c = sc.nextDouble();

        double addition = a + b + c;
        double multiplication = a * b * c;
        double subtraction = a - b - c;

        double division = 0;
        if (b != 0 && c != 0) {
            division = a / b / c;
        } else {
            System.out.println("Division skipped");
        }

        System.out.println("----------------------------");
        System.out.println("Addition: " + addition);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Division: " + division);

        sc.close();
    }
}
