package com.bvr;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	public UserDaoService() {
		// TODO Auto-generated constructor stub
	}

	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 3;
	
	static {
		
		users.add(new User(1,"Shaurya", new Date()));
		users.add(new User(2,"Divya", new Date()));
		users.add(new User(3,"Phani", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
}

