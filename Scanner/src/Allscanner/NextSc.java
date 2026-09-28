package Allscanner;

import java.util.Scanner;

public class NextSc {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");

        System.out.print("Enter your name: ");
        String name = sc.next(); 

        System.out.print("Enter your city: ");
        String city = sc.next();  

        System.out.println("---------------------");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);

        sc.close();
    }
}
