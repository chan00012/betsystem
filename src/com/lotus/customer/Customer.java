package com.lotus.customer;

import java.math.BigDecimal;

public class Customer {

	private BigDecimal balance;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	
	
	public Customer(){
		firstname = "";
		lastname = "";
		balance = new BigDecimal("0.00");
	}
	
	public Customer(String username, String password, String firstname, String lastname) {
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.balance = new BigDecimal("0.00");
	}


	public BigDecimal getBalance() {
		return balance;
	}


	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	
	

	public String getUsername() {
		return username;
	}

	

	public void setUsername(String username) {
		this.username = username;
	}

	

	public String getPassword() {
		return password;
	}

	

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
