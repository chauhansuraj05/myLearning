package pattern;

import java.util.Scanner;

public class HolloNew1 {
	
		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter value of n: ");
		        int n = sc.nextInt();

		        int k = n / 2 - 1;   

		        for(int i = 1; i <= n; i++) {
		            for(int j = 1; j <= n; j++) {

		                if(i + j == n - k + 1
		                   || i + j == n + k + 1
		                   || i - j == k
		                   || i - j == -k) {

		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.println();
		        }
		    }
		

	}


