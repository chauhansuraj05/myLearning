package thread;

public class Join {
   public static void main(String[] args) {
	   Runnable r1 = () ->{
			 for(int i = 0;i < 5;i++) {
					System.out.println("I am Child Thrad ");
				}
		 };
		 
      Thread t1 = new Thread(r1);
      t1.start();
//      t1.join();
      try {
    	  t1.join();
      }catch(Exception e) {
    	  System.out.println(e.getMessage());
    	  
      }
      
      for(int i = 0;i < 5;i++) {
//    	  try {
//        	  Thread.currentThread().join();
//          }catch(Exception e) {
//        	  System.out.println(e.getMessage());
//        	  
//          } not working cheack it
			System.out.println("I am parent Thrad");
		}
     
}
}
