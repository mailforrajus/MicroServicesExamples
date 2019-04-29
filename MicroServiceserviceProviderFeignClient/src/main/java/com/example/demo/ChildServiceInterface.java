package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "child-service-Provider")
public interface ChildServiceInterface {

	@GetMapping(value = "/getChildServieInfo")
	public String getChildServiceInfo();

}
