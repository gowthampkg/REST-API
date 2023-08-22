package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Qn_01 {
	@GetMapping("welcome")
	public String hello() {
		return "Welcome String Boot!";
	}
}
