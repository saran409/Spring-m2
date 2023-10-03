package com.cg.demo.entity;

public class Transaction {
	private int amount;
	private String transactionDate;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int amount, String transactionDate) {
		super();
		this.amount = amount;
		this.transactionDate = transactionDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	@Override
	public String toString() {
		return "Transaction [amount=" + amount + ", transactionDate=" + transactionDate + "]";
	}
	
	

}
