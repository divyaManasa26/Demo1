package com.bvr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoint2 {

	public MyEndPoint2() {
		// TODO Auto-generated constructor stub
	}

	
	@Autowired
	private UserDaoService services;
	
	@GetMapping("/users")
	public List<User>retriveAll(){
		return services.findAll();
	}
	
}
