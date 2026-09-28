package thread;

public class Lamda {
   public static void main(String[] args) {
	 Runnable r1 = () ->{
		 
		 for(int i = 0;i < 5;i++) {
			 try {
				Thread.sleep(500);
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
				System.out.println("byee");
			}
	 };
	 Runnable r2 = () ->{
		 for(int i = 0;i < 5;i++) {
				System.out.println("Hii");
			}
	 };

	 Thread t1 = new Thread(r1);
	 Thread t2 = new Thread(r2);

	 t1.start();
	 try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 t2.start();
	 
//	 for(int i = 0;i < 5;i++) {
//			System.out.println("Hello");
//		}
}
}
