package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdUsingGitHubactionsApplication {

	@GetMapping("/welcome")
	public String welcome()
	{
		return "<h1> Welcome String </h1>" ;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CicdUsingGitHubactionsApplication.class, args);
	}

}
