package com.demo.main.Service;

import java.time.LocalDate;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.demo.main.Entity.Customer;
import com.demo.main.Entity.Cylinder;
import com.demo.main.Entity.GasBooking;
import com.demo.main.Exception.BankIdException;
import com.demo.main.Exception.BookingIdException;
import com.demo.main.Exception.CustomerIdException;
import com.demo.main.Exception.CylinderIdException;

public interface AdminService {

	public Admin addAdmin(Admin admin);

	public Admin updateAdmin(Admin admin, long adminId) throws Exception;

	public Admin viewAdmin(long adminId) throws Exception;

	public String removeAdmin(long adminId) throws Exception;
	

	public Customer addCustomer(Customer customer);

	public Customer updateCustomer(Customer customer, int customerId) throws CustomerIdException;

	public Customer viewCustomer(int customerId) throws CustomerIdException;

	public String removeCustomer(int customerId) throws CustomerIdException;
	

	public String removeBank(long bankId) throws BankIdException;
	

	public Cylinder updateCylinder(Cylinder cylinder, long cylinderId) throws CylinderIdException;

	public Cylinder viewCylinder(long cylinderId) throws CylinderIdException;

	public String removeCylinder(long cylinderId) throws CylinderIdException;

	public List<GasBooking> listofbooking(LocalDate d1, LocalDate d2);

	public GasBooking bookingdetails(int customerId) throws BookingIdException;

	public double calculateMonthlyRevenue(LocalDate date1, LocalDate date2);

}
