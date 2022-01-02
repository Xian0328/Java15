class CTest3 implements Runnable
{
   private String id;
   public CTest3(String str)
   {
      id=str;
   }
   public void run()
   {
      for(int i=1;i<=5;i++)
      {
         for(int j=0;j<100000000;j++);
         System.out.println(id+" "+i);
      }
   }
}
public class class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest3 hi=new CTest3("Hello");
	    CTest3 bye=new CTest3("Good bye");
	    CTest3 morning=new CTest3("Good morning");
	    Thread t1=new Thread(hi);
	    Thread t2=new Thread(bye);
	    Thread t3=new Thread(morning);
	    t1.start();
	    t2.start();
	    t3.start();
	}

}
