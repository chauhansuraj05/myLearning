package exceptionHan;

import java.io.FileNotFoundException;

public class ExceptionPropagation {
	
	void d3() {
		throw new ArithmeticException("Hrsdvj");
	}

	void d2() {
		d3();
	}

	void d1()  {
		d2();
	}
	
	public static void main(String[] args) {
		System.out.println("=====================");
		ExceptionPropagation e = new ExceptionPropagation();
		
		try {
			e.d1();
		}catch(Exception f) {
			f.printStackTrace();
			System.out.println(f.getMessage());
		}
		
		System.out.println("========================");
	}
}
