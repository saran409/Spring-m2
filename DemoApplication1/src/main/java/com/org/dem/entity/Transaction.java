package com.org.dem.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Transaction {
	@Value("#{3000+2500}")
	private int amount;
	@Value("${date}")
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
