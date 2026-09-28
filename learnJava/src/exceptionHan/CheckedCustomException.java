package exceptionHan;

import java.util.Scanner;

class MarriageException extends RuntimeException{
	
	String message;
	
	public MarriageException(String message) {
		super(message);
	}
}

public class CheckedCustomException {
	
	public static void checkEligibility(int age) throws MarriageException {
		if(age < 18 || age > 60) {
			throw new MarriageException("Thoda Sabr Kro..");
		}else {
			System.out.println("Sadhi Mubark Ho...");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		
			try {
				checkEligibility(age);
			}catch(MarriageException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
	}
}
