package pattern;

import java.util.Scanner;

public class PrintDigonals {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value");
	        
	        int n = sc.nextInt();

	        for (int row = 0; row < n; row++) {
	            for (int col = 0; col < n; col++) {
	                if(row>col)
	                	System.out.print("* ");
	                else
	                	System.out.print("  ");
	            }
	            System.out.println();
	        }

	        sc.close();
	    }

}
