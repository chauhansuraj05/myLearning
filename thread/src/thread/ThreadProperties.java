package thread;

public class ThreadProperties {
     public static void main(String[] args) {
		Runnable r1 = () ->{	
		 for(int i = 0;i < 5;i++) {
			System.out.println("byee");
		  }
		};
		
		System.out.println("===================");
		System.out.println("Praent Thrad id :"+ Thread.currentThread().getId());
		System.out.println("Praent Thrad Name :"+Thread.currentThread().getName());
		System.out.println("Before Praent Thrad Priority :"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println(" Aftar Praent Thrad id"+Thread.currentThread().getPriority());
		System.out.println("===================");
		
		Thread t1 = new Thread(r1);
		System.out.println(t1.getId());
		System.out.println("===================");
		
		System.out.println("Thread Name1 :" +t1.getName());
		t1.setName("Ram");
		System.out.println("Thread Name2 :" +t1.getName());
		
		System.out.println("===================");
		
		System.out.println("Before Thread Priority :"+ t1.getPriority());
		t1.setPriority(10);
		System.out.println("Before Thread Priority :"+ t1.getPriority());

		
	}
}
