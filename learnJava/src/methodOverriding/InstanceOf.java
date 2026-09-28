package methodOverriding;

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}
class D extends B{
	
}

public class InstanceOf {
	public static void main(String[] args) {
		B b = new C();
		System.out.println(b instanceof C);
		System.out.println(b instanceof D);
		System.out.println(b instanceof Object);
		System.out.println(b instanceof  A);
		
		
	}
}

//##Golden interview rule
//
//instanceof checks right-side object
//Not left-side reference
//If object belongs to the class or any of its parents → true
//
//##One-line final answer
//
//👉 b instanceof A is true because the actual object is C, and 
//C indirectly extends A, so it IS-A A, even though the reference type is B.
