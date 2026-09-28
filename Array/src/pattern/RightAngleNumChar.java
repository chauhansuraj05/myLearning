package pattern;

import java.util.Scanner;

public class RightAngleNumChar {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
     

        for (int row = 0; row < n; row++) {
        	
        	 int num = 1;
            for (int col = 0; col <= row; col++) {
                if((row + col)% 2 ==0) {
                	System.out.print((char)(num + 96)+" ");
                	num++;
                }else {
                	System.out.print(num++  +"  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
