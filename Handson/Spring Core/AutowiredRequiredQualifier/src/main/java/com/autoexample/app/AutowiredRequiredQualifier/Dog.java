package com.autoexample.app.AutowiredRequiredQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@Qualifier
public class Dog implements Animal {

	public String character() {

		return "Booo";
	}

}
