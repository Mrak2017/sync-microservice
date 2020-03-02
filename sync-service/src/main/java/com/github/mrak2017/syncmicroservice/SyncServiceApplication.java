package com.github.mrak2017.syncmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SyncServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SyncServiceApplication.class, args);
		System.out.println("Hello world from sync");
	}

}
