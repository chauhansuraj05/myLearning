package array3;

public class Question2 {
public static void main(String[] args) {
	int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1[i].length;j++) {
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println("=====================");
	
	int[][] trans = new int[arr1[0].length][arr1.length];
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1[i].length;j++) {
			trans[j][i]= arr1[i][j];	
//			System.out.print(trans[i][j]+" ");
//			Do NOT print transpose while you are still creating it
		}
		System.out.println();
	}
	
	for(int i=0;i<trans.length;i++) {
		for(int j=0;j<trans[i].length;j++) {
			System.out.print(trans[i][j]+" ");	
		}
		System.out.println();
	}
	
	
}
}
