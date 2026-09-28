package cab2;

import java.util.*;

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
			case 1: {
				cab = createCabs(new Mini());
				cab.printThanks();
				break;
			}
			case 2: {
				 cab = createCabs(new Sedan());
				 cab.printThanks();
			}break;
			case 3: {
				 cab = createCabs(new Luxry());
				 cab.printThanks();
			}break;
			
			default : {
				System.out.println("Choose Valid Ride Options");
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
