package methodOverriding;

class Namrata{
	 void dance() {
		System.out.println("Salsa...");
	}
}

class Riya extends Namrata{
	
	void dance() {
		System.out.println("Classical...");
	}
}

public class CabDriver {
	public static void main(String[] args) {
		Riya r1 = new Riya();
		r1.dance();
		
		System.out.println("=================");
		
		Namrata n = new Riya(); // upcasting
		n.dance();
		
		System.out.println("=================");
		
		Namrata n2 = new Namrata();
		n2.dance();
	}
}
