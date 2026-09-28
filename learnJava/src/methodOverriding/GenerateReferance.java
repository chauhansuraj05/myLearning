package methodOverriding;

public class GenerateReferance extends Object {
	
	public String toString() {
		return "hell world "; 
	}

	public static void main(String[] args) {
		GenerateReferance g1 = new GenerateReferance();
		System.out.println(g1.toString());

		System.out.println("====================");
		System.out.println(g1.getClass());

		System.out.println("====================");
		System.out.println(g1.getClass().getName());
		
		System.out.println("====================");
		System.out.println(g1.getClass().getName()+"@");
		
		System.out.println("====================");
		System.out.println(g1.hashCode());
		
		System.out.println("====================");
		System.out.println(g1.getClass().getName()+"@"+Integer.toHexString(g1.hashCode()));
		

	}
}
