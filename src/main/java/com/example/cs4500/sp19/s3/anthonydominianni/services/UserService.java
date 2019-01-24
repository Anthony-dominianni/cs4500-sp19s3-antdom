package com.example.cs4500.sp19.s3.anthonydominianni.services;

import java.util.ArrayList;
import com.example.cs4500.sp19.s3.anthonydominianni.models.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
	static ArrayList<User> users = new ArrayList<User>();
	static {
		users.add(new User(123, "alice", "alice", "Alice", "Wonderland"));
		users.add(new User(234, "bob", "bob", "Bob", "Marley"));
	}
	
	@GetMapping("/api/user")
	public ArrayList<User> findAllUsers() {
		return users;
	}
	
	@GetMapping("/api/user/{userId}")
	public User findUserById(
		@PathVariable("userId") Integer id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	

}