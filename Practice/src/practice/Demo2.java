package practice;

public class Demo2 {
   public static void demo(int a) {
	   if(a>10) {
		   return;
	   }
	   
		   System.out.println(a);
		   demo(++a);
//		   demo(a+1);
	   
   }
   
   public static void main(String[] args) {
	demo(1);
}
}
