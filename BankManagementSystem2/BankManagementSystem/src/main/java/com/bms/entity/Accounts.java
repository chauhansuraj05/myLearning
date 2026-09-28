package com.bms.entity;

import jakarta.persistence.*;

@Entity
public class Accounts {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accounts_id")
	@SequenceGenerator(name = "accounts_id", initialValue = 201, allocationSize = 1, sequenceName = "accounts_id")
	private int id;
	private long accNo;
	private String ifsc;
	private double amount;
	
	@ManyToOne
	@JoinColumn(name = "branch_id")
	private Branch branch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
}
