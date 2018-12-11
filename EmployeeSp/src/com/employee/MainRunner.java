package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainRunner {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Employ.xml");
		System.out.println("Employee Details:" + context );
		System.out.println((Employee) context.getBean("Employee"));

	}

}
