class CTest2 extends Thread
{
   private String id;
   public CTest2(String str)
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
public class class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest2 hi=new CTest2("Hello");
	    CTest2 bye=new CTest2("Good bye");
	    CTest2 morning=new CTest2("Good morning");
	    hi.start();
	    bye.start();
	    morning.start();
	}

}
