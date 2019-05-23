package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.demoConfig;

@RestController
public class Demo {
	
	@Autowired
	private demoConfig conf;	
	
	@RequestMapping("demo")
	public String demo() {
		return conf.getName();
	}

}
