package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Load Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Retrieve spring bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//Testing if they are the same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing at the same reference: " + result);
		
		System.out.println("\nReference of theCoach object: " + theCoach);
		System.out.println("\nReference of alphaCoach object: " + alphaCoach);
		
		//Closing context
		context.close();
	}

}
