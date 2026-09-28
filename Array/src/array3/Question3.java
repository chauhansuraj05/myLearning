package array3;

public class Question3 {
    public static void main(String[] args) {

        int[][] arr = {
            {10, 60, 30},
            {90, 50, 100},
            {27, 67, 19}
        };

        for (int i = 0; i < arr.length; i++) {

            int max = arr[i][0];   

            
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                
            }

           
            System.out.println(": " + max);
        }
    }
}



