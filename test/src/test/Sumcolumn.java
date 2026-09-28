package test;

public class Sumcolumn {

    public static void main(String[] args) {

        int a[][] = {{1, 2}, {3, 4}};

        System.out.println("Sum of Columns:");

        for (int j = 0; j < 2; j++) {
            int sum = 0;

            for (int i = 0; i < 2; i++) {
                sum = sum + a[i][j];
            }

            System.out.println(sum);
        }
    }
}
