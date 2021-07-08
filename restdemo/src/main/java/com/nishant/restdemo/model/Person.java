package com.nishant.restdemo.model;


public class Person {
	
	private String name;
	private String branchName;
	private long accountNumber;
	private double amount;
	private String ifsc;
	public Person(String name, String branchName, long accountNumber, double amount, String ifsc) {
		super();
		this.name = name;
		this.branchName = branchName;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.ifsc = ifsc;
	}
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	@Override
	public String toString() {
		return "AccountDetails [name=" + name + ", branchName=" + branchName + ", accountNumber=" + accountNumber
				+ ", amount=" + amount + ", ifsc=" + ifsc + "]";
	}
	

}
