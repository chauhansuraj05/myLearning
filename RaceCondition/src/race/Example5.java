package race;


class SharedCounter {
    static long value = 0;

    static void increment() {
        value = value + 1;   
    }
}

public class Example5 {
    public static void main(String[] args) {

        Runnable r1 = () -> {
            for (int i = 0; i < 1000; i++) {
                SharedCounter.increment();
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 1000; i++) {
                SharedCounter.increment();
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

        System.out.println("Final value: " + SharedCounter.value);
    }
}

