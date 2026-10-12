package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentInfoRunner implements CommandLineRunner {

	@Override
	public void run(String... args) {
		System.out.println("Application Started");
		System.out.println("Student Name: Evidence Ejimone");
		System.out.println("Course: Spring Boot");
		System.out.println("Status: Training");
	}

}
