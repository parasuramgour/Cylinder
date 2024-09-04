package com.demo.main.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bankId;
	private String name;
	private String baddress;
	private String ifscno;

	public Bank() {
		super();
	}

	public Bank(long bankId, String name, String baddress, String ifscno) {
		super();
		this.bankId = bankId;
		this.name = name;
		this.baddress = baddress;
		this.ifscno = ifscno;
	}

	public long getBankId() {
		return bankId;
	}

	public void setBankId(long bankId) {
		this.bankId = bankId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBaddress() {
		return baddress;
	}

	public void setBaddress(String baddress) {
		this.baddress = baddress;
	}

	public String getIfscno() {
		return ifscno;
	}

	public void setIfscno(String ifscno) {
		this.ifscno = ifscno;
	}

}
