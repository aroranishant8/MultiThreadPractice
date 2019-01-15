package org.arpit.javapostsforlearning.webservicesimpl;


import org.arpit.javapostsforlearning.webservices.HelloWorld;
import org.arpit.javapostsforlearning.webservices.HelloWorldService;

public class impl {
	static HelloWorldService hws;
	static HelloWorld hwsport;
	
	static void initialisewebservice()
	{
		 hws = new HelloWorldService();
		 hwsport = hws.getHelloWorld();
		((javax.xml.ws.BindingProvider) hwsport).getRequestContext().put("com.sun.xml.internal.ws.request.timeout",
				11000);
	}

	public static void main(String a[]) throws InterruptedException {

		initialisewebservice();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName()+"is started");
					System.out.println(hwsport.sayHelloWorld(""));
					System.out.println(Thread.currentThread().getName()+"is ended");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName()+"is started");
					System.out.println(hwsport.sayHelloWorld(""));
					System.out.println(Thread.currentThread().getName()+"is ended");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName()+"is started");
					System.out.println(hwsport.sayHelloWorld(""));
					System.out.println(Thread.currentThread().getName()+"is ended");

				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		
		t1.start();		
		//t2.start();
		//t3.start();

	}

}
