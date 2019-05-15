package com.demo.dis.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class DemoController {

	@Value("${service.instance.name}")
	private String instance;
	
	@RequestMapping("/")
	public String message() {
		return "Hello "+ instance;
	}
}
