package com.example.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext-lifecycle-method.xml");
		
		Coach coach= context.getBean("myCoach", Coach.class);
		
		System.out.println("---------> LIFECyCLE METHODS \n"+coach.getDailyWorkout());
		
		context.close();
		
	}

}
