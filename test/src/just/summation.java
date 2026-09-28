package just;

public class summation {
    public static void main(String[] args) {
	     int a = 123;
	    int sum = 0;
	       
	     while(a>0) {
	    	 sum = sum+(a%10);
	    	 a/=10;
	     }
	     System.out.println(sum );
    }
}
