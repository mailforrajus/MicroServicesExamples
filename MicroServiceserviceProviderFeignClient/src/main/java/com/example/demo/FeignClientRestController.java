package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignClientRestController {
	@Autowired
	private ChildServiceInterface childServiceInterface;

	@RequestMapping(value = "/getProducerInfo")
	public String getMessage() {
		return "This is from Producer";
	}

	@RequestMapping(value = "/getChildServiceInfoProvider")
	public String getMessageFromChildService() {
		return childServiceInterface.getChildServiceInfo();
	}
}
