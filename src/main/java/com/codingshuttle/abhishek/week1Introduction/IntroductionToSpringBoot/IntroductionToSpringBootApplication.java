package com.codingshuttle.abhishek.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {
	@Autowired
 Apple apple1;
@Autowired
	Apple apple2;
@Autowired
DBService dbService;
	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		apple1.eatapple();
		apple2.eatapple();

		System.out.println(dbService.getData());
	}
}
