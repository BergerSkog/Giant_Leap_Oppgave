package com.example.restservice;

import main.java.com.example.restservice.Parkeringscontroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication


/*
classen som starter API-en
 */

@ComponentScan(basePackageClasses= Parkeringscontroller.class)
 public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
