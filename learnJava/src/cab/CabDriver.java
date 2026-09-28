package cab;

import java.util.Scanner;

public class CabDriver {
	
	static Cab createCabs(Cab cab) {
		return cab;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================");
		System.out.println("     WELCOME to OLA    ");
		System.out.println("=======================");
		System.out.println("Press 1 : to Book Mini...");
		System.out.println("Press 2 : to Book Sedan...");
		System.out.println("Press 3 : to Book Luxry...");
		System.out.println("Choose your Ride...\n");
		
		Cab cab = null;
		
		while(cab == null) {
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : {
				cab = createCabs(new Mini());
				//System.out.println(cab);
				//System.out.println("Thanks For Booking Mini Cab...");
				cab.printThanks();
				break;
			}
			case 2 : {
				cab = createCabs(new Sedan());
				//System.out.println(cab);
				//System.out.println("Thanks For Booking Sedan Cab...");
				cab.printThanks();
			}break;
			case 3 : {
				cab = createCabs(new Luxry());
				//System.out.println(cab);
				//System.out.println("Thanks For Booking Luxry Cab...");
				cab.printThanks();
			}break;
			default : {
				System.err.println("Choose Valid Ride Option...");
				System.out.println();
				System.out.println("=======================");
				System.out.println("     WELCOME to OLA    ");
				System.out.println("=======================");
				System.out.println("Press 1 : to Book Mini...");
				System.out.println("Press 2 : to Book Sedan...");
				System.out.println("Press 3 : to Book Luxry...");
				System.out.println("Choose your Ride...\n");
			}
		}
		}
		
		sc.close();
	}
}
