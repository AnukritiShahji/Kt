package org.anukriti1;

public class SleepDemo 
{
	public static void main(String[] args) 
	{
		A obj1=new A();
		B obj2=new B();
		
		obj1.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		
		
	}
}

class A extends Thread
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

class B extends Thread
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