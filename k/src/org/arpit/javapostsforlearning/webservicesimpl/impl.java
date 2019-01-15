package org.arpit.javapostsforlearning.webservicesimpl;

import java.sql.SQLException;

import org.arpit.javapostsforlearning.webservices.HelloWorld;
import org.arpit.javapostsforlearning.webservices.HelloWorldService;

public class impl {
	
	public static void main(String a[])
	{
		HelloWorldService hws=new HelloWorldService();
		HelloWorld hwsport = hws.getHelloWorld();
	((javax.xml.ws.BindingProvider)hwsport).getRequestContext().put("com.sun.xml.internal.ws.request.timeout", 10000);
		
		
		  for(int i=0;i<3;i++) { System.out.print(hwsport.sayHelloWorld("hekankj")); }
		 
		
		
		/*
		 * Thread t1 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { try {
		 * System.out.print(System.currentTimeMillis());
		 * System.out.print(Thread.currentThread().getName()+" "+hwsport.sayHelloWorld(
		 * "hello"));
		 * 
		 * } catch(Exception e) { e.printStackTrace(); } } });
		 * 
		 * 
		 * Thread t2 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { try {
		 * System.out.print(System.currentTimeMillis());
		 * System.out.print(Thread.currentThread().getName()+" "+hwsport.sayHelloWorld(
		 * "hello"));
		 * 
		 * } catch(Exception e) { e.printStackTrace(); } } }); Thread t3 = new
		 * Thread(new Runnable() {
		 * 
		 * @Override public void run() { try {
		 * System.out.print(System.currentTimeMillis());
		 * System.out.print(Thread.currentThread().getName()+" "+hwsport.sayHelloWorld(
		 * "hello"));
		 * 
		 * } catch(Exception e) { e.printStackTrace(); } } });
		 * 
		 * t1.start(); t2.start(); t3.start();
		 */
		 
	
		
	
	}

}
