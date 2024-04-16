package com.example.PersonalWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class PersonalWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalWebApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
