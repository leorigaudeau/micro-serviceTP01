package com.example.TP01;


import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp01Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp01Application.class, args);
		
		final Logger logger = Logger.getLogger(Tp01Application.class);
//		if(logger.isDebugEnabled()){
//		    logger.debug("This is debug");
//		}
//		logger.error("This is error : ");
//		logger.error("This is error");
		
		
	}

}
