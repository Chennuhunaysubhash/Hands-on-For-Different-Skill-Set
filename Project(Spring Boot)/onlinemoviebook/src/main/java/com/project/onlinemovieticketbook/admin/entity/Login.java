package com.project.onlinemovieticketbook.admin.entity;

public class Login {
	
	private int id;
	
	private String userName;
	
	private String password;
	
	public Login() {
		
	}

	public Login(int id, String userName, String password) {
		//super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
}
