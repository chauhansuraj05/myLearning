package array2;

public class Addition2DArray {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int[][] res = new int[arr1.length][arr2[0].length];

		// print arr1
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				System.out.print(arr1[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("======================");

		// print arr2
		for (int row = 0; row < arr2.length; row++) {
			for (int col = 0; col < arr2[row].length; col++) {
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("======================");

		// print res
		for (int row = 0; row < res.length; row++) {
			for (int col = 0; col < res[row].length; col++) {
				System.out.print(res[row][col] + " ");
			}
			System.out.println();
		}

		// Addition Logic...
		for (int row = 0; row < res.length; row++) {
			for (int col = 0; col < res[row].length; col++) {
				res[row][col] = arr1[row][col] + arr2[row][col];
			}
		}

		System.out.println("======================");
		
		// print res
		for (int row = 0; row < res.length; row++) {
			for (int col = 0; col < res[row].length; col++) {
				System.out.print(res[row][col] + " ");
			}
			System.out.println();
		}
	}
}
