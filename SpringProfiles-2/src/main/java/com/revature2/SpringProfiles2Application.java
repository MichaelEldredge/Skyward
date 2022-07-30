package com.revature2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.revature2")
@SpringBootApplication
public class SpringProfiles2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringProfiles2Application.class, args);
	}

}
