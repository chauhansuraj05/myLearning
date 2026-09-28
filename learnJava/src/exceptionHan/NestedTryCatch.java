package exceptionHan;

import java.util.Scanner;

public class NestedTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numerator");
		int a = sc.nextInt();
		System.out.println("Enter Denomerator");
		int b = sc.nextInt();
		
		int[] arr = {1,2,3,4,5,6};
		
		try {
			int c = a / b;
			System.out.println(c);
			
			try {
				System.out.println(arr[c]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("I am Inner Catch --> Handled1");
			}
		}catch (ArithmeticException e) {
			System.out.println("I am Outer Catch --> Handled2");
		}
		sc.close();
	}
}
