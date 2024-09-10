package com.project.onlinemovieticketbook.admin.entity;

public class UpdatePrice {
	
	private int id;
	
	private int price;

	public UpdatePrice(int id, int price) {
		super();
		this.id = id;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
