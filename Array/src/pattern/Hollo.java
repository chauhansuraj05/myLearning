package pattern;

public class Hollo {
	
	public static void main(String[] args) {
		int n = 5;
		int a = 0;
		int b = 0;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2 != 0)
			{
				b++;
			}
		}
		a = b-2;
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				if(i +j == n-a || i + j == n+b|| i-j==n-b || j-i==n-b )
					
					System.out.print(" * ");
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}


