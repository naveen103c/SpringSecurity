package com.security.controller;

import java.util.List;
import com.security.modals.*;
import com.security.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
	
	@Autowired
	UserServices userServices;
	
	//Get All Users
	@GetMapping("/")
	public List<User> getAllUsers() {
		return userServices.getAllUsers();	
	}
	
		//Get Single User
		@GetMapping("/{UserName}")
		public User getUser(@PathVariable("UserName")String UserName) {
			return userServices.getUser(UserName);	
		}		
		//Add User
		@PostMapping("/")
		public User addUser(@RequestBody User user) {
			return userServices.addUser(user);	
		}
}
