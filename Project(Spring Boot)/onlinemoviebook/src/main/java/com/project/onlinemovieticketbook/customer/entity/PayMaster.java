package com.project.onlinemovieticketbook.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paymentgateway")
public class PayMaster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Accountno")
	private int accountno;
	@Column(name="CCNO")
	private int ccno;
	@Column(name="CVV")
	private int cvv;
	
	public PayMaster() {
		
	}

	public PayMaster(int id, String name, int accountno, int ccno, int cvv) {
		super();
		this.id = id;
		this.name = name;
		this.accountno = accountno;
		this.ccno = ccno;
		this.cvv = cvv;
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

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public int getCcno() {
		return ccno;
	}

	public void setCcno(int ccno) {
		this.ccno = ccno;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
	

}
