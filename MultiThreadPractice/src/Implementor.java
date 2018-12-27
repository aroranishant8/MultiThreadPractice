
public class Implementor implements Runnable {

	Employee e=new Employee();
	static Thread t1,t2;
	
	public static void main(String a[]) throws InterruptedException
	{
		Implementor i=new Implementor();
		
		t1=new Thread(i);		
		t2=new Thread(i);
		t1.start();
		
		t2.start();
		
		
	}

	
	@Override
	public void run(){
		// TODO Auto-generated method stub
		try {
			if(Thread.currentThread().getName().equalsIgnoreCase("Thread-0"))
			e.produce();
			else
			if(Thread.currentThread().getName().equalsIgnoreCase("Thread-1")) {
				Thread.sleep(5000);
			e.consume();}
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
