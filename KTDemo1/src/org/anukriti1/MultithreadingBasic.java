package org.anukriti1;

public class MultithreadingBasic extends Thread
{


	public static void main(String[] args) 
	{
	
	 Hi hi=new Hi();
	 Hello hello=new Hello();
	  
	 hi.show();
	 hello.show();

	}

}
 class Hi
 {
	 public static void show() {
	  for(int i=0;i<5;i++)
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
 
 class Hello
 {
	 public void show()
	 {
		 for(int i=0;i<5;i++)
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