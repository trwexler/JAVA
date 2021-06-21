package com.codingdojo.stringsAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsAssignmentApplication.class, args);
	}
	
	@RequestMapping("/")
	public String root() {
		return "You're doing great!";
	}
	
	@RequestMapping("/random")
	public String boot() {
		return "Doesn't Spring Boot RUUUUL?!";
	}
	

}



