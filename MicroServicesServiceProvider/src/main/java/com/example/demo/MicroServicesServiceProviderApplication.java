package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class MicroServicesServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesServiceProviderApplication.class, args);
	}

	@RequestMapping(value = "/getProducerInfo")
	public String getMessage() {
		return "This is from Producer";
	}

}
