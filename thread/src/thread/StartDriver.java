package thread;

class Start extends Thread{
 public void run() {
	 for(int i = 0;i < 5;i++) {
		 try {
			 Thread.sleep(1000);
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 System.out.println("hello");
	 }
 } 
  


public class StartDriver{
	public static void main(String[] args) {
		Start s = new Start();
				s.start();
		
		for(int i = 0;i < 5;i++) {
			System.out.println("byee");
		}
	}
}
}