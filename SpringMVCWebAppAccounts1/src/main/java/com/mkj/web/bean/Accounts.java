package com.mkj.web.bean;

import javax.validation.constraints.*;

public class Accounts {
	
	@NotEmpty(message="name cannot be left blank")
	private String name;
	
	@Min(message="Balance cannot be less than 10000",value=10000)
	private int balance;
	
	@Email(message="Wrong email address")
	private String email;
	
	
	public Accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Accounts(String name, int balance, String email) {
		super();
		this.name = name;
		this.balance = balance;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Accounts [name=" + name + ", balance=" + balance + ", email=" + email + "]";
	}
	
	
}
