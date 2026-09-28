package exceptionHan;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("Main Start....");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		try {
			int c = a / b;
			System.out.println("Result : "+c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Handled1...");
		}
		
		System.out.println("Main End....");
	}
}
