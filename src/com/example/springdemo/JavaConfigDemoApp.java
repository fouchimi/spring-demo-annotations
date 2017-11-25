package com.example.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //Retrieve spring bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//Call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();
	}

}
