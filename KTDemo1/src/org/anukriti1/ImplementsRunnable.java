package org.anukriti1;

public class ImplementsRunnable
{
	public static void main(String[] args) {
		
	Runnable h = new Go();
	Runnable h1= new Come();
	
	
	Thread t1=new Thread(h);
	Thread t2=new Thread(h1);

	t1.start();

//	try {
//		Thread.sleep(10);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	t2.start();
	}
}

class Go implements Runnable
{
	public void run()
	{
	for(int i =0;i<5;i++)
	{
	System.out.println("Hi");
    try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
 
class Come implements Runnable
{
	public void run()
	{
	for(int i =0;i<5;i++)
	{
	System.out.println("Hello");
    try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}