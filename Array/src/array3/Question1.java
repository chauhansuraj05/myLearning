package array3;

public class Question1 {
public static void main(String[] args) {
	int[][] aar1 = { {1,3,5},{2,7,8},{6,9,5}};
	int[][] aar2 = { {4,3,5},{3,6,3},{4,9,6}};
	
	for (int i=0;i<aar1.length;i++) {
		for (int j=0;j<aar1[i].length;j++) {
			System.out.print(aar1[i][j]+" "); 
		}
	System.out.println();
	}
	
	System.out.println("\n=================");
	for (int i=0;i<aar2.length;i++) {
		for (int j=0;j<aar2[i].length;j++) {
			System.out.print(aar2[i][j]+" "); 
		}
	System.out.println();
	}
	
	System.out.println("=====================");
	
	int[][] res = new int[aar1.length][aar2.length];
	for (int i=0;i<res.length;i++) {
		for (int j=0;j<res[i].length;j++) {
			System.out.print(aar1[i][j]+ aar2[i][j]+" "); 
		}
	System.out.println();
	}
			
	
}
}
