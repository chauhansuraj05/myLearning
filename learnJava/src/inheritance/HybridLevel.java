package inheritance;

class A3{
	void goodMorning() {
		System.out.println("Good Morning Dear Bear...");
	}
}
class B3 extends A3{
	void greet() {
		System.out.println("eeeeeeeeeeeee");
	}
}

class C3 extends B3 {
	void print() {
		System.out.println("I am print method...");
	}
}

class D3 extends B3 {
	void goodNight() {
		System.out.println("Good Night Dear...");
	}
}

public class HybridLevel {
	public static void main(String[] args) {
		C3 c3 = new C3();
		c3.goodMorning();
		
		D3 d3 = new D3();
		d3.goodMorning();
	}
}
