package test;

public class Left {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4};

        int temp = a[0];

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        a[a.length - 1] = temp;

        System.out.print("Left Rotated Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
