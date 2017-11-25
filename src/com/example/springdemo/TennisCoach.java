package com.example.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoah: inside default constructor");
	}
	
	@PostConstruct
	public void doMyStartStuff() {
		System.out.println(">> TennisCoach: inside doMyStartStuff");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> TennisCoach: inside doCleanUpStuff");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
