package thread;
class Count{
	 static int count = 0;
	 public static void incresCount() {
		 count++;
	 }
}
public class RaceCondition {
    public static void main(String[] args) {
		Runnable n = ()->{
			for(int i = 0; i <= 1000 ;i++) {
				Count.incresCount();
			}
		};
		
		Runnable n1 = ()->{
			for(int i = 0; i <= 1000 ;i++) {
				Count.incresCount();
			}
		};
		
		Thread t1 = new Thread(n);
		Thread t2 = new Thread(n1);
		t1.start();
        t2.start();
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println(Count.count);
	}
}
