package com.project.onlinemovieticketbook.admin.entity;

public class UpdateStatus {
	
	private int id;
	
	private String status;
	
	public UpdateStatus() {
		
	}

	public UpdateStatus(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
