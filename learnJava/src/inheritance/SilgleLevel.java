package inheritance;

class A {
	static int a = 20;
}

class B extends A {
//	static int a = 20;

	static int b = 30;
}

public class SilgleLevel {
	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(B.b);

		System.out.println("=============");
		
		System.out.println(B.a);
	}
}
