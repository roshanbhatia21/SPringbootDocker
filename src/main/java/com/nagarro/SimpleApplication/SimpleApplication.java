package com.nagarro.SimpleApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApplication {

	public static void main(String[] args) {
		System.out.println("WELCOME");
		SpringApplication.run(SimpleApplication.class, args);
	}

}
