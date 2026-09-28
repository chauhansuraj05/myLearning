package numberpattern;

public class NumberPattern2 {
   public static void main(String[] args) {
	int n = 6;
	int a = 1;
	
	for (int i = 1; i<=n; i++)
	{
		for(int j =1; j <= i; j++)
		{
			if(j <= i) {
				
				if(i==n || i==j || j==1)
				{
					System.out.print("1  ");
				}
				else
				{
					System.out.print(a++ + "  ");
				}
			}
			else {
				System.out.println("   ");
			}
			
		}
		System.out.println();
	}
}
}
