package com.cg.demo.entity;

import java.util.List;
import java.util.Objects;

public class Account {
	private int accountId;
	private String name;
	private Policy policy;
	private List<Transaction> allTransactions;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountId, String name, Policy policy, List<Transaction> allTransactions) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.policy = policy;
		this.allTransactions = allTransactions;
	}
	
	public Account(int accountId, String name, Policy policy) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.policy = policy;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public List<Transaction> getAllTransactions() {
		return allTransactions;
	}
	public void setAllTransactions(List<Transaction> allTransactions) {
		this.allTransactions = allTransactions;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountId, allTransactions, name, policy);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return accountId == other.accountId && Objects.equals(allTransactions, other.allTransactions)
				&& Objects.equals(name, other.name) && Objects.equals(policy, other.policy);
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", policy=" + policy + ", allTransactions="
				+ allTransactions + "]";
	}
	
	
	
	

}
