package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//Load spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve spring bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//Call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();
	}

}
