package com.autoexample.app.AutowiredRequiredQualifier;

import org.springframework.stereotype.Service;

@Service
public class Cat implements Animal {

	public String character() {
		return "weon";
	}

}
