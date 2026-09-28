package com.bms.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "branch_id")
	@SequenceGenerator(name = "branch_id", initialValue = 101, allocationSize = 1, sequenceName = "branch_id")
	private int id;
	private String name;
	private String location;
	
	@ManyToOne()
	@JoinColumn(name = "bank_id")
	private Bank bank;
	
	@OneToMany(mappedBy = "branch")
	List<Loan> loan;
	
	@OneToMany(mappedBy = "branch")
	List<Customer> customer;
	
	@OneToMany(mappedBy = "branch")
	List<Accounts> accounts;

	public List<Accounts> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Accounts> accounts) {
		this.accounts = accounts;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public List<Loan> getLoan() {
		return loan;
	}

	public void setLoan(List<Loan> loan) {
		this.loan = loan;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
}
