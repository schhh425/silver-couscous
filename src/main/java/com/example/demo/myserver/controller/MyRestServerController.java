package com.example.demo.myserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestServerController {

	@GetMapping("/hello/{name}")
	public String hellWord(@PathVariable("name") String name) {
		return "hello" + name;
	}
}
