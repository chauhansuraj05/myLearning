package pattern;

public class Pyramid {
	public static void main(String[] args) {
	int n = 7;
	
	for(int i = 1; i <= n ;i++) {
		for(int  j = 1; j<= 2*n - 1;j++) {
			if (i + j >= n + 1 && j - i <= n-1 && (i + j)%2 != 0 ) {
				System.out.print(" * ");
			}else {
				System.out.print("   ");
			}
		}
		System.out.println();
	}
		
	}
}
