package array3;

public class Question7 {
public static void main(String[] args) {
	
 char[][] arr = new char[3][3];
 
 for(int i = 0;i<arr.length;i++) {
	 for(int j= 0; j<arr[i].length;j++) {
		 if(i==j) {
			 System.out.print('*'+" ");
		 }else if(i+j==arr.length-1) {
			 System.out.print('*'+" ");
		 }else {
			 System.out.print(' '+" ");
		 }
	 }
	 System.out.println();
 }
 
 System.out.println("=========================");
 
 for(int i = 0;i<arr.length;i++) {
	 for(int j= 0; j<arr[i].length;j++) {
		 if(i==1&&j==1) {
			 System.out.print(' '+" ");
		 }else {
			 System.out.print('*'+" ");
		 }
	 }
	 System.out.println();
 }
 
 System.out.println("========================");
 
 for(int i = 0;i<arr.length;i++) {
	 for(int j= 0; j<arr[i].length;j++) {
		 
		 if(j==0||j==2||i==1) {
			 arr[i][j] ='*';
		 }else {
			 arr[i][j] =' ';
		 } 
	 }
	 System.out.println();
 }
 
 for(int i = 0;i<arr.length;i++) {
	 for(int j= 0; j<arr[i].length;j++) {
		 
		System.out.print(arr[i][j]+ " ");
	 }
	 System.out.println();
 }

}
}
