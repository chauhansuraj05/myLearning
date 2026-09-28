package array3;

public class Question5 {
public static void main(String[] args) {
	 char[][] arr = new char[3][3];
	 
	 for (int i =0; i<arr.length;i++) {
		 for (int j= 0;j<arr[i].length;j++) {
			 if (i==1 && j==1) {
				 arr[i][j]= ' ';
			 }else {
				 arr[i][j]='*';
			 }
		 }
	 }
	 
	 for (int i =0; i<arr.length;i++) {
		 for (int j= 0;j<arr[i].length;j++) {
			 System.out.print(arr[i][j]+ " ");
		 }
		 System.out.println();
	 }
}
}
