package pattern;

public class PyramidRight {

	public static void main(String[] args) {
		int n = 3;
		
		for(int i = 1; i <=  2*n - 1 ;i++) {
			for(int  j = 1; j<= n;j++) {
				if (j<=i && i+j <= n*2 ) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
			
		}
	}



