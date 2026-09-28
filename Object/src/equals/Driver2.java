package equals;

public class Driver2 {
 public static void main(String[] args) {
	    EOne e1 = new EOne("ravi","black","Malad","Mumbai");
		EOne e2 = new EOne("ravi","black","Malad","Mumbai");
		
		System.out.println(e1.equals(e2));
		
		System.out.println("===============================================");
		
		ETwo i1 = new ETwo(2,3,4,5);
		ETwo i2 = new ETwo(2,3,4,5);
		
		System.out.println(i1.equals(i2));
		
		System.out.println("================================================");
       
		EThree o1 =
	            new EThree(
	                1, 9876543210L, 4.5f,
	                55000.75, true, 'A',
	                "Ravi", 25, 5000.0
	            );

	    	EThree o2 =
	            new EThree(
	                1, 9876543210L, 4.5f,
	                55000.75, true, 'A',
	                "Ravi", 25, 5000.0
	            );

	        System.out.println(o1.equals(o2)); 
	        
	     System.out.println("==================================================");
	   
	        EFour ee1 =
	            new EFour(1, "Ravi", "Mumbai", 25);

	    	EFour ee2 =
	            new EFour(1, "Ravi", "Mumbai", 25);

	        System.out.println(ee1.equals(ee2)); 
	        
	     System.out.println("===============================================");
	        
	        EFive d1 =
	             new EFive(1, "Ravi", 25, 50000.0);

	     	EFive d2 =
	             new EFive(1, "Ravi", 25, 50000.0);

	         System.out.println(d1.equals(d2)); 

}
}
