package com.BS3.CiclodevidadeBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CicloDeVidaDeBeansApplication {

	@Autowired
	FirstClassService firtsclasservice;

	public static void main(String[] args) {

		SpringApplication.run(CicloDeVidaDeBeansApplication.class, args);
	}

	@Bean
	CommandLineRunner ejecutame(){
		return p ->
		{
			System.out.println("Hello second class");
		};
	}

	@Bean
	CommandLineRunner ejecutame2(){
		return p ->
		{
			System.out.println("It's Third class here!");
		};
	}

	@PostConstruct
	public void HelloFirstClass(){
		String message = firtsclasservice.getMessage();
		System.out.println(message);
	}
}
