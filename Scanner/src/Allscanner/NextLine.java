package Allscanner;

import java.util.Scanner;

public class NextLine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=============================");

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();   

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.println("------------------------");
        System.out.println("Full Name: " + name);
        System.out.println("Address: " + address);

        sc.close();
    }
}
