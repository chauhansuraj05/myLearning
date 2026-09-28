package array3;

import java.util.Scanner;

public class Question8  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

       
        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("\nRow Max Values:");
        for (int i = 0; i < rows; i++) {
            int max = arr[i][0];

            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max)
                    max = arr[i][j];
            }

            System.out.println(": " + max);
        }

       
        System.out.println("\nRow Sum Values:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;

            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }

            System.out.println("Row " + i + " Sum = " + sum);
        }

        
        System.out.println("\nColumn Min Values:");
        for (int j = 0; j < cols; j++) {
            int min = arr[0][j];

            for (int i = 0; i < rows; i++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] < min)
                    min = arr[i][j];
            }

            System.out.println(": " + min);
        }

        sc.close();
    }
}
