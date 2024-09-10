package com.project.onlinemovieticketbook.distributor.entity;

public class DistributorLogin {
	
	private int id;
	
	private String distributor;
	
	private String password;
	
	public DistributorLogin() {
		
	}

	public DistributorLogin(int id, String distributor, String password) {
		super();
		this.id = id;
		this.distributor = distributor;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
