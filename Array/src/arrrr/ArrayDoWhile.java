package arrrr;

import java.util.Scanner;
public class ArrayDoWhile {

	  public static void main(String[] args) {

	       
	        int[] arr = new int[6];

	       
	        acceptArray(arr);

	     
	        printArray(arr);
	    }

    public static void acceptArray(int[] arr) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        System.out.println("Enter " + arr.length + " numbers:");


        do {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        } while (i < arr.length);
    }

    
    public static void printArray(int[] arr) {

        int i = 0;
        System.out.println("\nArray elements are:");

      
        do {
            System.out.println("Index " + i + ": " + arr[i]);
            i++;
        } while (i < arr.length);
    }
  
}
