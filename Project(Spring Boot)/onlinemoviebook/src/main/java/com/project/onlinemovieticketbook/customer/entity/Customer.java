package com.project.onlinemovieticketbook.customer.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Password")
	private String password;
	@Column(name="Location")
	private String location;
	@Column(name="Phoneno")
	private String phoneNo;
	
	// used by hibernate 
	public Customer()
	{
		
	}

	public Customer(String name, String password, String location, String phoneNo) {
		//super();
		this.name = name;
		this.password = password;
		this.location = location;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", location=" + location
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	
}
