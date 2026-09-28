package race;

class Flag {
    static boolean done = false;

    static void finish() {
        done = true;
    }
}

public class Example4 {
    public static void main(String[] args) throws Exception {

        Runnable r1 = () -> {
            for (int i = 0; i < 1000; i++) {
                Flag.finish();
            }
        };

        Runnable r2 = () -> {
            if (!Flag.done) {
                System.out.println("Not finished yet");
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
