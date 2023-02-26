package com.techacademy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBootController {


	@GetMapping("/")
	public String index() {
		return "Hello SpringBoot!";
	}

	@GetMapping("now")
	public String dispTime() {
		String now = LocalDateTime.now().format( DateTimeFormatter.ofPattern("HH:mm:ss"));

		return "現在時刻:" + now;
	}




}
