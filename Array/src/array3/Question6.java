package array3;

public class Question6 {
public static void main(String[] args) {
    int[][] arr = {
            {10, 6, 20},
            {18, 3, 11},
            {7, 1, 12}
    };
    
    for(int i = 0; i<arr.length;i++) {
    	for (int j = 0; j<arr[i].length;j++) {
    		System.out.print(arr[i][j] +" ");
    	}
    	System.out.println();
    }
    
    System.out.println("==========================");
    
    for(int i = 0; i<arr.length;i++) {
    	int max =arr[i][0];
    	for (int j = 0; j<arr[i].length;j++) {
    		System.out.print(arr[i][j] +" ");
    		if(arr[i][j]>max) {
    			max = arr[i][j];
    		}
    	}
    	System.out.println(":"+ max);
    }
    
    System.out.println("=========================");
   
    for (int j = 0; j < arr[0].length; j++) {

        int min = arr[0][j]; 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][j] + " ");

            if (arr[i][j] < min) {
                min = arr[i][j];
            }
        }
        System.out.println(": " + min); 
    }
    
    System.out.println("========================");
    

    for(int i = 0; i<arr.length;i++) {
    	int sum =0;
    	for (int j = 0; j<arr[i].length;j++) {
    		System.out.print(arr[i][j] +" ");
    		
    		sum += arr[i][j];
    		
    		
    	}
    	System.out.println(":"+sum);
    }


}
}
