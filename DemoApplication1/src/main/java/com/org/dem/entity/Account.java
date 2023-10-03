package com.org.dem.entity;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.org.dem.entity.Account;

@Component
public class Account {
	@Value("101")
	private int accountId;
	@Value("${name}")
	private String name;
	
	
	@Autowired
	private Policy policy;
	
	@Autowired
	private List<Transaction> allTransactions;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accountId, String name) {
		super();
		this.accountId = accountId;
		this.name = name;
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
