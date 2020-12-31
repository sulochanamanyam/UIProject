package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UIController {

	@GetMapping("/ui")
	public String getUI() {
		return "hello from ui from chandra";
		
	}
}
