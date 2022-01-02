
class CTest extends Thread
{
   private String id;
   public CTest(String str)//(a)
   {
      id=str;
   }
   public void run()//(b)
   {
      for(int i=1;i<=5;i++)
      {
         for(int j=0;j<100000000;j++);
         System.out.println(id+" "+i);
      }
   }
}
public class class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest hi=new CTest("Hello");//(c)
	    CTest bye=new CTest("Good bye");
	    hi.run();
	    bye.run();
	}

}
/*(d)
Hello 1
Hello 2
Hello 3
Hello 4
Hello 5
Good bye 1
Good bye 2
Good bye 3
Good bye 4
Good bye 5
程式執行會先將Hello執行完再執行Good bye
*/