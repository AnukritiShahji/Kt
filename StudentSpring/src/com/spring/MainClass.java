package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("stubean.xml");
		
        System.out.println("Student details:"+context);  
		
		System.out.println((Student) context.getBean("student1"));
         
	}
	
	

}
