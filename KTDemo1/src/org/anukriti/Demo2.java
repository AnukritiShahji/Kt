package org.anukriti;


import java.util.HashMap;

public class Demo2 
{

		public static void main(String args[])
		{
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		String str = "one two one three four one";

		String[] a = str.split(" ");

		int count = 1;
		{
			for(int i = 0; i < a.length; i++)
			{
			
			if(hm.containsKey(a[i])) 
			{
				count = hm.get(a[i]);
				hm.put(a[i], count+1);
			}
			else {
				hm.put(a[i], count);
				
			}	
			
			}
			System.out.println(hm);}}}
