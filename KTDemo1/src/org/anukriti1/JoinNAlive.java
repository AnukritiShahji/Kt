package org.anukriti1;

public class JoinNAlive
{
	public static void main(String[] args) throws InterruptedException 
	{
		Aaa obj1=new Aaa();
		Bbb obj2=new Bbb();
		
		obj1.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		  
		
		obj1.join();
		obj2.join();
		
		//System.out.println(obj2.isAlive());
		
		System.out.println("Good Bye");
		System.out.println("Name of Thread1:"+obj1.getName());
		  System.out.println("Name of Thread:"+obj2.getName());
		  System.out.println("Priority of Thread1:"+obj1.getPriority());
		
		 
		obj1.setName("Anukriti");
		System.out.println("After changing name"+ " "+obj1.getName());
	}
}

class Aaa extends Thread
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("Aa");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}

class Bbb extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Bb");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	}