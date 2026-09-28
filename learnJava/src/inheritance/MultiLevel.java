package inheritance;

class A1{
	int c = 90;
}

class B1 extends A1{
	int b = 80;
}

class C1 extends B1{
	int a = 70;
}

public class MultiLevel {
	public static void main(String[] args) {
		A1 aa = new A1();
		System.out.println(aa.c);
		
		B1 bb = new B1();
		System.out.println(bb.b);
		
		C1 cc = new C1();
		System.out.println(cc.a);
		
		System.out.println("===========");
		
		System.out.println(cc.b);
		System.out.println(cc.c);
	}
}
