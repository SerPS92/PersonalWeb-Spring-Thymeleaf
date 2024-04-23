package com.example.PersonalWeb;

import com.example.PersonalWeb.service.MailSenderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class PersonalWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalWebApplication.class, args);
		System.out.println(SpringVersion.getVersion());
		System.out.println("Application start");
	}

}
