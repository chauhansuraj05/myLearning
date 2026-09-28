package practice;

public class Demo {
	
	public static void demo(char ch) {
		if(ch>='a') {
			System.out.println(ch);
			demo(--ch);
		}
		
	}
    public static void main(String[] args) {
	 demo('z');
}
}
