package com.isaccanedo.advcal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.isaccanedo.advcal")
public class AdvcalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvcalApplication.class, args);
	}
}
