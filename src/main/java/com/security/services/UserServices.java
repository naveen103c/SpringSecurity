package com.security.services;

import org.springframework.stereotype.Service;
import com.security.modals.*;
import java.util.*;

@Service
public class UserServices {	
	List<User> list=new ArrayList<>();
	public UserServices() {
		list.add(new User("Naveen","pass1","naveen@brkgb.com"));
		list.add(new User("Manish","pass2","manish@brkgb.com"));
		list.add(new User("Amit","pass3","amit@brkgb.com"));
	}
	public List<User> getAllUsers() {
		return this.list;
	}
	public User getUser(String userName) {
		return this.list.stream().filter((user)->user.getUserName().equals(userName)).findAny().orElse(null);
	}
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
