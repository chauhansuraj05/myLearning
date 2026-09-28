package arrayyy;

public class RightShiftnth {
 public static void main(String[] args) {
	 
	 int[] arr = {1,2,4,5,6};
	 
	int n = 3;
	while(n>0) {
		for(int i = arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]= 0;
		n--;		
	}
	for(int i = 0;i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
}
