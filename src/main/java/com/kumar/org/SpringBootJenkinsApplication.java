package com.kumar.org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	
	public static void main(String[] args) {
		logger.info("good msg");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
		logger.info("good morning");
		logger.info("good night");
		logger.info("hello everyone");
	}

}
