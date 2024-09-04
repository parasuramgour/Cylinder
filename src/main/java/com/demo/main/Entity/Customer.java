package com.demo.main.Entity;

import java.util.List;

//import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
//import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
//@PrimaryKeyJoinColumn(name = "customer_Id")
public class Customer {

	public Customer() {
		super();
	}

	public Customer(int customerId, String customername, String address, long mobile, String email, long accno,
			Cylinder cylinder, Bank bank, List<GasBooking> gasBooking) {
		super();
		this.customerId = customerId;
		this.customername = customername;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.accno = accno;
		this.cylinder = cylinder;
		this.bank = bank;
		this.gasBooking = gasBooking;
	}
//
	public Cylinder getCylinder() {
		return cylinder;
	}

	public void setCylinder(Cylinder cylinder) {
		this.cylinder = cylinder;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public List<GasBooking> getGasBooking() {
		return gasBooking;
	}

	public void setGasBooking(List<GasBooking> gasBooking) {
		this.gasBooking = gasBooking;
	}
//
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customername;
	private String address;
	private long mobile;
	private String email;
	private long accno;
//
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customername;
	}

	public void setCustomerName(String customername) {
		this.customername = customername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	@OneToOne
	private Cylinder cylinder;

	@OneToOne
	private Bank bank;

	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "customer")

	private List<GasBooking> gasBooking;

}
