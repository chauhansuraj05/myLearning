package race;

class SharedBox {
    int number = 0;

    void update() {
        number = number + 1;   
    }
}

public class Example6 {
    public static void main(String[] args) {

        SharedBox box = new SharedBox();

        Runnable r1 = () -> {
            for (int i = 0; i < 1000; i++) {
                box.update();
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 1000; i++) {
                box.update();
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

        System.out.println("Final value: " + box.number);
    }
}
