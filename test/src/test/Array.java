package test;

public class Array {
     
    public static void main(String[] args) {

        int arr[] = {10, 5, 20, 8, 30, 25};

        int max = arr[0];   

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max : " + max);
    }
}
