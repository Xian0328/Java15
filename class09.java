class CTest4 extends Thread implements Runnable
{
	private String id;
	private int sec;
	public CTest4(String str,int s)
	{
		id=str;
		sec=s;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				sleep(sec);
			}
			catch(InterruptedException e) {}
			System.out.println(id+" is running");
		}
	}
}
public class class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest4 s1=new CTest4("Thread 1",1000);
		CTest4 s2=new CTest4("Thread 2", 2500);
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		t1.start();
		t2.start();
	}

}
