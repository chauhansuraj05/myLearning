package race;

class SharedData {
    static int[] arr = new int[1];   

    static void update() {
        arr[0] = arr[0] + 1;         
    }
}

public class Example1 {
    public static void main(String[] args) {

        Runnable r1 = () -> {
            for (int i = 0; i < 1000; i++) {
                SharedData.update();
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 1000; i++) {
                SharedData.update();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final value: " + SharedData.arr[0]);
    }
}
