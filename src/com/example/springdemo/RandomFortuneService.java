package com.example.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Value("${foo.fortunes}")
	private String fortunes;
	
	private String[] data;
	
	@Override
	public String getFortune() {
		data = fortunes.split(",");
		int randomIndex = (int)(Math.random() * data.length) % data.length;
		return data[randomIndex];
	}

}
