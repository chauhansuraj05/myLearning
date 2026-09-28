package arrrr;

import java.util.*;

public class NewArr {
public static void main(String[] args) {
	
	int[] arr = new int[6];
	
	acceptArray(arr);
	
	printArray(arr);

	
}


public static void acceptArray(int[] arr) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Size: "+ arr.length);
	 
	 for(int i = 0; i < arr.length;i++) {
		 System.out.println("Enter number "+ (i+1)+ ":");
		 arr[i]= sc.nextInt();
	 }
	
}
public static void printArray(int[] arr) {
	  System.out.println("\nArray elements are:");
	  for (int i = 0; i < arr.length; i++) {
	    System.out.println("Index " + i + ": " + arr[i]);
	        }
	    }
 
	 
}

