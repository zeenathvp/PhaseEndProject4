package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class SportyShoesNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesNewApplication.class, args);
	}

}
