package com.spring.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String getMsg()
	{
		return "Welcome to Spring MVC world!!!!";
	}
	
	
	public String getMsgAgain() {
		return "Welcome to Spring MVC world!!!! again";
	}

}
