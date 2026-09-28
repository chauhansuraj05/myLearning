package arrrr;

import java.util.Scanner;

public class ArrayWhile {

   
    public static void acceptArray(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter " + arr.length + " numbers:");

        int i = 0;  

        while (i < arr.length) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++; 
        }
    }

  
    public static void printArray(int[] arr) {
        System.out.println("\nArray elements are:");

        int i = 0; 

        while (i < arr.length) {
            System.out.println("Index " + i + ": " + arr[i]);
            i++; 
        }
    }

   
    public static void main(String[] args) {

       
        int[] arr = new int[6];

       
        acceptArray(arr);

       
        printArray(arr);
    }
}
