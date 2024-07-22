package com.bvr;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("oracleprops")
public class ExampleProperty {

	public ExampleProperty() {
		// TODO Auto-generated constructor stub
	}
	
	private String greeting ; //= "Thankyou";

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	

}
