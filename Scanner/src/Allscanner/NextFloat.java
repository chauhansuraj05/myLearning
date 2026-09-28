package Allscanner;

import java.util.Scanner;

public class NextFloat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        System.out.print("Enter the first number: ");
        float a = sc.nextFloat();

        System.out.print("Enter the second number: ");
        float b = sc.nextFloat();

        System.out.print("Enter the third number: ");
        float c = sc.nextFloat();

        float addition = a + b + c;
        float multiplication = a * b * c;
        float subtraction = a - b - c;

        float division = 0;
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
