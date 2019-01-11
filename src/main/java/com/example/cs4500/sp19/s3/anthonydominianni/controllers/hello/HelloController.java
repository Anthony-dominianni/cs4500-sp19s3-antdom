package com.example.cs4500.sp19.s3.anthonydominianni.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/api/hello/string")
	public String sayHello() {
		return "Hello CS4500!";
	}
	
	@RequestMapping("api/hello/object") 
	public HelloObject sayHelloObject() {
		HelloObject obj = new HelloObject("Hello Object CS4500!");
		return obj;
	}
}
