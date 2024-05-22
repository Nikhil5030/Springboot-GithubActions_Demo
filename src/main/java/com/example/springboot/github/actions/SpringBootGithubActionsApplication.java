package com.example.springboot.github.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGithubActionsApplication {

	@GetMapping("/welcome")
	public String message(){
		return "Welcome to Github Actions CI CD Workflow With Docker!!!";
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringBootGithubActionsApplication.class, args);
	}

}
