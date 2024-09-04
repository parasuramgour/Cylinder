package com.demo.main.Service;

import com.demo.main.Entity.Bank;

import com.demo.main.Entity.GasBooking;
import com.demo.main.Entity.SurrenderCylinder;
import com.demo.main.Exception.BankIdException;
import com.demo.main.Exception.BookingIdException;

public interface CustomerService {

	public GasBooking addGasBooking(GasBooking gasBooking, int customerId);

	public GasBooking updateGasBooking(GasBooking gasBooking, long gasBookingId) throws BookingIdException;

	public GasBooking getGasBooking(long gasBookingId) throws BookingIdException;

	public String deleteGasBooking(long gasBookingId) throws BookingIdException;

	public GasBooking bookingdetails(long gasBookingId) throws BookingIdException;

	public SurrenderCylinder addSurrenderCylinder(SurrenderCylinder surrenderCylinder, int customerId);

	public SurrenderCylinder updateSurrenderCylinder(SurrenderCylinder surrenderCylinder, long surrenderId)
			throws Exception;

	public SurrenderCylinder viewSurrenderCylinder(long surrenderId) throws Exception;

	public String removeSurrenderCylinder(long surrenderId) throws Exception;

	public Bank updateBank(Bank bank, long bankId) throws BankIdException;

	public Bank viewBank(long bankId) throws BankIdException;
}
