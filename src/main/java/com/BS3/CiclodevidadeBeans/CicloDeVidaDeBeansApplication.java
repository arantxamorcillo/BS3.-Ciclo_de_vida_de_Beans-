package com.BS3.CiclodevidadeBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CicloDeVidaDeBeansApplication {

	@Autowired
	FirstClassService firtsclasservice;

	public static void main(String[] args) {

		SpringApplication.run(CicloDeVidaDeBeansApplication.class, args);
	}

	@PostConstruct
	public void HelloFirstClass(){
		String message = firtsclasservice.getMessage();
		System.out.println(message);
	}
}
