package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpJenkinsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpJenkinsAppApplication.class, args);
		System.out.println("It is a continuous integration job");

	}

}
