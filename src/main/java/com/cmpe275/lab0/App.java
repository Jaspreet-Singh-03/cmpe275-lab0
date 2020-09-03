package com.cmpe275.lab0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main Application which reads the beans.xml
 */
public class App 
{
    public static void main( String[] args )
    {
    	// context obj is used to read through the beans defined in Beans.xml
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	
    	// using greeter interface to get the "greeter" bean of class HelloSpringWorld (IoC) 
    	Greeter obj = (Greeter) context.getBean("greeter");
    	
    	// the obj formed from bean is used to call getGreeting method and print output to console
		System.out.println(obj.getGreeting());
    }
}
