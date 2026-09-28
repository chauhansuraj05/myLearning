package array2;

public class Array$2D {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		System.out.println(arr[0][1]);
		System.out.println(arr[2][2]);
		
		arr[0][1] = 5;
		arr[2][2] = 1;
		
		System.out.println(arr[0][1]);
		System.out.println(arr[2][2]);
		
		System.out.println("================");
		
		System.out.println(arr);
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		System.out.println("================");
		
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			
			System.out.println();
			
		}
	}
}
