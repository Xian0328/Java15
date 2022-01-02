class PrePaid extends Thread
{
	private static int sum=200;//(a)
	public void run()//(b)
	{
		int fee;
		while(sum>10)
		{
			fee=(int)(100*Math.random());//(b)
			talk(fee);
		}
	}
	public synchronized static void talk(int n)//(c)
	{
		int s=sum-n;
		try
		{
			sleep((int)(1000*Math.random()));//(c)
		}
		catch(InterruptedException e) {}
		if(s>0)
		{
			sum=s;
			System.out.println("通話費"+n+"元，餘額："+sum+"元");
		}
	}
}
public class class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrePaid p1=new PrePaid();
		PrePaid p2=new PrePaid();
		PrePaid p3=new PrePaid();
		p1.start();
		p2.start();
		p3.start();
	}

}
