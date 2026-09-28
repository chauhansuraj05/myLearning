package abstraction;

abstract class Incomplete{
	abstract public void print();
}


public class Driver1 extends Incomplete {
	
	public void print() {
		System.out.println("Good Morning...");
	}
	
	public static void main(String[] args) {
			Driver1 driver1 = new Driver1();
			driver1.print();
	}
}
