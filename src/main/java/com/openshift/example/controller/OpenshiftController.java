package com.openshift.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OpenshiftController {

	@GetMapping("/")
	public String heading() {
		return "<h1>Openshift Example</h1>";
	}

	@GetMapping("{user}")
	public String welcomeUser(@PathVariable String user) {
		return "Hello " + user + "  welcome to my website.";
	}

}
