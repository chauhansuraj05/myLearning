package Allscanner;

import java.util.Scanner;

public class NextCharAt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================");

        System.out.print("Enter a word: ");
        char first = sc.next().charAt(0);
        
        System.out.println("Enter a word: ");
        String word = sc.next();   
        char firstChar = word.charAt(0);

        System.out.println("----------------------");
        System.out.println("Word: " + word);
        System.out.println("First Character: " + firstChar);
        System.out.println("First Char: "+first);

        sc.close();
        
    }
}
