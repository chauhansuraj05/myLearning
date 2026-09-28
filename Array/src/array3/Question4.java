package array3;

public class Question4 {
	public static void main(String[] args) {
		int[][] arr = {{10,6,20},{18,3,11},{7,1,12}};
		
		// print arr
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		
		for(int row = 0; row < arr.length; row++) {
			int max = 0;
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
				if(arr[row][col] > max)
					max = arr[row][col];
			}
			System.out.print(""
					+ ": "+max);
			System.out.println();
		}
	}
}
