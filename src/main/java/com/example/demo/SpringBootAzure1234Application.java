package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class SpringBootAzure1234Application {

	@GetMapping(value="/message")
	public String getMethodName() {
		return "baris bicer....................................baris.ucus sayisi 2000000";
	}
	
	
	@GetMapping(value="/heas")
	public String getMethodName2() {
		return "baris bicer....................................Heassssssssssss-Ucus date";
	}
	
	
	@GetMapping(value="/heasmessage")
	public String getMethodName3() {
		return "this message is coming from CI/CD process";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzure1234Application.class, args);
	}

}
