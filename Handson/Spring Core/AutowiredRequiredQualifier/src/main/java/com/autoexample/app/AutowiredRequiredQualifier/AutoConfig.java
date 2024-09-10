package com.autoexample.app.AutowiredRequiredQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autowire")
public class AutoConfig {
	@Autowired
	@Qualifier("dog")
	private Animal animal;
	
	@GetMapping
	public String fetchChatacter() {
		return animal.character();
	}
}
