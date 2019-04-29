package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class MicroServiceserviceProviderChildServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceserviceProviderChildServiceApplication.class, args);
	}

	@GetMapping(value = "/getChildServieInfo")
	public String childServiceProviderInfo() {
		return "This info is from child Service";
	}

}
