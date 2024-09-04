package com.demo.main.Entity;

import java.time.LocalDate;

import com.demo.Securities.Entity.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class SurrenderCylinder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long surrenderId;
	private LocalDate surrenderdate;

	public SurrenderCylinder() {
		super();
	}

	public SurrenderCylinder(long surrenderId, LocalDate surrenderdate, Customer customer) {
		super();
		this.surrenderId = surrenderId;
		this.surrenderdate = surrenderdate;
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getSurrenderId() {
		return surrenderId;
	}

	public void setSurrenderId(long surrenderId) {
		this.surrenderId = surrenderId;
	}

	public LocalDate getSurrenderdate() {
		return surrenderdate;
	}

	public void setSurrenderdate(LocalDate surrenderdate) {
		this.surrenderdate = surrenderdate;
	}

	@OneToOne
	private Customer customer;

}
