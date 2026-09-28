package abstraction;

abstract class Neelam{
	abstract void greet();
	abstract void print();
}

// 0% implementation...
abstract class A extends Neelam{
	//	abstract void greet();
	//	abstract void print();
}

// 50% implementation...
abstract class B extends A{
	//	abstract void print();
	
	@Override
	void greet() {
		System.out.println("Happy Holiii...");
	}
}

//100% implementation...
class C extends B{
	//	@Override
	//	void greet() {
	//		System.out.println("Happy Holiii...");
	//	}
	
	void print() {
		System.out.println("Happy Dipawali...");
	}
}

public class Driver2 {
	public static void main(String[] args) {
		C c = new C();
		c.greet();
		c.print();
	}
}
