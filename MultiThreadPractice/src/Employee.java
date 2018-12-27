
public class Employee  {

	  synchronized void produce() throws InterruptedException
	{
		  System.out.print(Thread.currentThread().getName()+"hello");
	wait();
	
	
	
	}

	synchronized void consume()
	{	
	
	notify();
	System.out.print(Thread.currentThread().getName()+"released");
	
	}

}
