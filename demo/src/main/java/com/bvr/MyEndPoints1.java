package com.bvr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoints1 {
	
	@RequestMapping("/mypage")
	public String myString() {
		return "FirstMicroServiceExample - update";
	}
	
	//request parameter using query String
	
	@RequestMapping("/second")
	public String sayHello(@RequestParam String name) {
		return "Welcome : "+ name;
	}
	
	//request mapping using path variable
	
	@RequestMapping(path="/pathvarexample/{name}")
	public String sayHello2(@PathVariable String name) {
		return "path Definition : "+ name;
	}
	
	@GetMapping("/secondsamplebean")
	public SecondSampleBean printMessage() {
		return new SecondSampleBean("For Oracle India");
	}
	

}
