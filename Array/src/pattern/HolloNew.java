package pattern;

public class HolloNew {
   public static void main(String[] args) {
	   int n = 5;

	   for(int i = 1; i <= n; i++) {
	       for(int j = 1; j <= n; j++) {

	           if(i + j == 4 || i + j == 8 || Math.abs(i - j) == 2) {
	               System.out.print("* ");
	           } else {
	               System.out.print("  ");
	           }
	       }
	       System.out.println();
	   }

}

}
