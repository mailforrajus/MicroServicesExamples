package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerControllerClient {

	@Autowired
	private LoadBalancerClient loadBalancer;

	@RequestMapping(value = "/getServersideInfo")
	public ResponseEntity<String> getEmployee() throws RestClientException, IOException {

		ServiceInstance serviceInstance = loadBalancer.choose("Service-Provider");

		System.out.println(serviceInstance.getUri());

		String baseUrl = serviceInstance.getUri().toString();

		baseUrl = baseUrl + "/getProducerInfo";

		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForEntity(baseUrl, String.class);
	}
}