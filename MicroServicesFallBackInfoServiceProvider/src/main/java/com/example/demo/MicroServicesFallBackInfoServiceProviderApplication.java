package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class MicroServicesFallBackInfoServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesFallBackInfoServiceProviderApplication.class, args);
	}

	@GetMapping(value = "/fallBackService")
	public String fallBackInfo() {
		return "This info is provided by fallback Service";
	}

}
