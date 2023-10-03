package com.cg.demo.entity;

import java.util.Objects;

public class Policy {
	String policyName;

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Policy(String policyName) {
		super();
		this.policyName = policyName;
	}


	public String getPolicyName() {
		return policyName;
	}


	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}


	@Override
	public int hashCode() {
		return Objects.hash(policyName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Policy other = (Policy) obj;
		return Objects.equals(policyName, other.policyName);
	}

	@Override
	public String toString() {
		return "Policy [policyName=" + policyName + "]";
	}
	
	
	

}
