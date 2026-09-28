package abstraction;

public interface Demo {
	 void greet();
	 int a = 10;
	 
	 default void print() {
		 System.out.println("Thank you...");
	 }
	 
	 public static void main(String[] args) {
		 System.out.println("Main Starts");
		 
		 System.out.println("Main Ends");
	 }
}
