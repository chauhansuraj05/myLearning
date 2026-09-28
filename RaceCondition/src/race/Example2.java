package race;

class SharedText {
    static StringBuilder sb = new StringBuilder();

    static void addChar() {
        sb.append("A");
    }
}

public class Example2 {
    public static void main(String[] args) throws Exception {

        Runnable r = () -> {
            for (int i = 0; i <= 1000; i++) {
                SharedText.addChar();
            }
        };
        
        Runnable r1 = () -> {
            for (int i = 0; i <= 1000; i++) {
                SharedText.addChar();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Length: " + SharedText.sb.length());
    }
}
