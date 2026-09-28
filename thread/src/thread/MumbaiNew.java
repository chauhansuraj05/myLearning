package thread;

class MumbaiNew implements Runnable{
 public void run() {
	 for(int i = 0;i < 5;i++) {
			System.out.println("hello");
		}
 }
}

class Driver{
	public static void main(String[] args) {
		MumbaiNew n = new MumbaiNew();
		Thread t = new Thread(n);
		t.start();
		
		for(int i = 0;i < 5;i++) {
			System.out.println("byee");
		}
	}
}
