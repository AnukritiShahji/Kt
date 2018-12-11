package org.anukriti.interfaces;

public class Basic1 
{
public static void main(String[] args)
{
Bank b=new Sbi();
System.out.println("SBI rate of interest is:"+b.rateOfInterest());
	
}
}
 
interface Bank
{
	float rateOfInterest();
}

class Sbi implements Bank
{
	public float rateOfInterest()
	{
		return 3.0f;
	}
}
	class Pnb implements Bank
	{
		public float rateOfInterest()
		{
			return 5.2f;
		}}
 
		class Hdfc implements Bank
		{
			public float rateOfInterest()
			{
				return 4.0f;
			}
		}

