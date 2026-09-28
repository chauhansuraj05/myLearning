package array2;

public class Driver1 {
	public static void main(String[] args) {
		char[] arr = new char[5];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//System.out.println(arr[889]);
		
		System.out.println("=================");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=================");
		
		double[] arr2 = {12.0,10,50.44,56,34,78,100};
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("=================");
		System.out.println(arr);
	}
}
