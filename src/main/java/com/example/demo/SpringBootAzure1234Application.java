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
		return "baris bicer....................................";
	}
	
	
	@GetMapping(value="/heas")
	public String getMethodName2() {
		return "baris bicer....................................Heassssssssssss";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzure1234Application.class, args);
	}

}
