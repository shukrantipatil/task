package shukranti;

class even extends Thread
{
	int i;
   public void run()
   {
	for( i=1;i<=10;i++)
	{
		if(i%2==0)
		{
			System.out.println("Even Thread i=" +i);
		}
	try
	{
		Thread.sleep(100);
	}
	catch(Exception e){}
	}
   }
}
class odd extends Thread
{
	public void run()
	{
		int j;
			for( j=1;j<=10;j++)
			{
				if(j%2!=0)
				{
					System.out.println("Odd Thread j="+j);
				}
				try
	{
		Thread.sleep(500);
	}
	catch(Exception e){}
			}
	}
}
class Exp16_EvenOdd
{
public static void main( String args[])
{
even e1 = new even();
e1.start();
odd o1=new odd();
o1.start();
}
}
