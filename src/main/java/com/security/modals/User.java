package com.security.modals;

public class User {
	String userName;	
	String password;
	String email;
	public User() {		
	}
	public User(String userName, String password,String email){
		super();
		this.userName=userName;
		this.password=password;
		this.email=email;
		}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
