package inheritance;

class B2 {
	void greet() {
		System.out.println("eeeeeeeeeeeee");
	}
}

class C2 extends B2 {

}

class D2 extends B2 {

}

public class HierarchicalLevel {
	public static void main(String[] args) {
		D2 d2 = new D2();
		d2.greet();

		C2 c2 = new C2();
		c2.greet();
	}
}
