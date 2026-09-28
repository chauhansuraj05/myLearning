package race;

class Account {
    int balance = 3000;

    void withdraw() {
        balance = balance - 100;
    }
}

public class Example3 {
    public static void main(String[] args) throws Exception {

        Account acc = new Account();

        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                acc.withdraw();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start(); 
        
        
        

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + acc.balance);
    }
}
