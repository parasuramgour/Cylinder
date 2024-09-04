package com.demo.main.Entity;

import java.time.LocalDate;

import com.demo.Securities.Entity.Customer;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class GasBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long gasBookingId;
	private LocalDate bookingDate;
	private boolean status;
	private float bill;

	public GasBooking() {
		super();
	}

	public GasBooking(long gasBookingId, LocalDate bookingDate, boolean status, float bill, Customer customer) {
		super();
		this.gasBookingId = gasBookingId;
		this.bookingDate = bookingDate;
		this.status = status;
		this.bill = bill;
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getGasBookingId() {
		return gasBookingId;
	}

	public void setGasBookingId(long gasBookingId) {
		this.gasBookingId = gasBookingId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public float getBill() {
		return bill;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}
 
	@ManyToOne
	@JsonBackReference
	private Customer customer;

	 

}
