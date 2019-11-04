package com.example.demo.myserver.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestServerController {

	@GetMapping("/hello/{name}")
	public String hellWordGet(@PathVariable("name") String name) {
		return "hello:" + name + " you get me";
	}

	@PostMapping("/hello/{name}")
	public String hellWordPost(@PathVariable("name") String name) {
		return "hello:" + name + " you post me,i will remember you ";
	}

	@DeleteMapping("/hello/{name}")
	public String hellWordDelete(@PathVariable("name") String name) {
		return "goodbye:" + name;
	}

	@PutMapping("/hello/{name}")
	public String hellWordPut(@PathVariable("name") String name) {
		return "hello:" + name + " you put me";
	}
}
