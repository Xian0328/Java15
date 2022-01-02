class CTest6 implements Runnable
{
   private String id;
   public CTest6(String str)
   {
      id=str;
   }
   public void run()
   {
      for(int i=1;i<=5;i++)
      {
         try
         {
        	 Thread.sleep((int)(100*Math.random()));
         }
         catch(InterruptedException e) {}
         System.out.println(id+" "+i);
      }
   }
}
public class class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest6 hi=new CTest6("Hello");
	    CTest6 bye=new CTest6("Good bye");
	    CTest6 morning=new CTest6("Good morning");
	    CTest6 night=new CTest6("Good night");
	    Thread t1=new Thread(hi);
	    Thread t2=new Thread(bye);
	    Thread t3=new Thread(morning);
	    Thread t4=new Thread(night);
	    t1.start();
	    try
	    {
	    	t1.join();
	    	t3.start();
	    	t3.join();
	    	t4.start();
	    	t4.join();
	    	t2.start();
	    	t2.join();
	    }
	    catch(InterruptedException e) {}
	    System.out.println("All Thread are finished");
	}

}
