package com.example.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanSCopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach= context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach= context.getBean("myCoach", Coach.class);
		
		
		boolean result= (coach==alphaCoach);
		
		System.out.println("\nPointing to the same object: "+result);
		System.out.println("\nMemory location for Coach"+coach);
		System.out.println("\nMemory location for alphaCoach" +alphaCoach);
		
		
		context.close();
		

	}

}
