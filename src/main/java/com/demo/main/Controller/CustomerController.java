package com.demo.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.Entity.Bank;
import com.demo.main.Entity.GasBooking;
import com.demo.main.Entity.SurrenderCylinder;
import com.demo.main.Exception.BankIdException;
import com.demo.main.Exception.BookingIdException;
import com.demo.main.Service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	public CustomerService customerService;

	@PostMapping("/addGasBooking")
	public ResponseEntity<GasBooking> addGasBooking(@RequestBody GasBooking gasBooking, @RequestParam int customerId) {
		GasBooking gasbooking2 = customerService.addGasBooking(gasBooking, customerId);

		return new ResponseEntity<GasBooking>(gasbooking2, HttpStatus.CREATED);
	}

	@PutMapping("/updateGasBooking")
	public ResponseEntity<GasBooking> updateGasBooking(@RequestBody GasBooking gasBooking,
			@RequestParam long gasBookingId) throws BookingIdException {
		GasBooking gasbooking2 = customerService.updateGasBooking(gasBooking, gasBookingId);
		return new ResponseEntity<GasBooking>(gasbooking2, HttpStatus.ACCEPTED);
	}

	@GetMapping("/getGasBooking")
	public ResponseEntity<GasBooking> getGasBooking(@RequestParam long gasBookingId) throws BookingIdException {
		GasBooking gasbooking2 = customerService.getGasBooking(gasBookingId);
		return new ResponseEntity<GasBooking>(gasbooking2, HttpStatus.FOUND);
	}

	@DeleteMapping("/deleteGasBooking")
	public ResponseEntity<String> deleteGasBooking(@RequestParam long gasBookingId) throws BookingIdException {
		String gasbooking2 = customerService.deleteGasBooking(gasBookingId);
		return new ResponseEntity<String>(gasbooking2, HttpStatus.OK);
	}

	@GetMapping("/bookingdetails")
	public ResponseEntity<GasBooking> bookingdetails(@RequestParam long gasBookingId) throws BookingIdException {
		GasBooking gasbooking2 = customerService.bookingdetails(gasBookingId);
		return new ResponseEntity<GasBooking>(gasbooking2, HttpStatus.FOUND);
	}

	@PostMapping("/addSurrenderCylinder")
	public ResponseEntity<SurrenderCylinder> addSurrenderCylinder(@RequestBody SurrenderCylinder surrenderCylinder,
			@RequestParam int customerId) {
		SurrenderCylinder surrendercylinder2 = customerService.addSurrenderCylinder(surrenderCylinder, customerId);
		return new ResponseEntity<SurrenderCylinder>(surrendercylinder2, HttpStatus.CREATED);
	}

	@PutMapping("/updateSurrenderCylinder")
	public ResponseEntity<SurrenderCylinder> updateSurrenderCylinder(@RequestBody SurrenderCylinder surrenderCylinder,
			@RequestParam long surrenderId) throws Exception {
		SurrenderCylinder surrendercylinder2 = customerService.updateSurrenderCylinder(surrenderCylinder, surrenderId);
		return new ResponseEntity<SurrenderCylinder>(surrendercylinder2, HttpStatus.ACCEPTED);
	}

	@GetMapping("/viewSurrenderCylinder")
	public ResponseEntity<SurrenderCylinder> viewSurrenderCylinder(@RequestParam long surrenderId) throws Exception {
		SurrenderCylinder surrendercylinder2 = customerService.viewSurrenderCylinder(surrenderId);
		return new ResponseEntity<SurrenderCylinder>(surrendercylinder2, HttpStatus.FOUND);
	}

	@DeleteMapping("/removeSurrenderCylinder")
	public ResponseEntity<String> removeSurrenderCylinder(@RequestParam long surrenderId) throws Exception {
		String surrendercylinder2 = customerService.removeSurrenderCylinder(surrenderId);
		return new ResponseEntity<String>(surrendercylinder2, HttpStatus.OK);
	}

	@PutMapping("/updateBank")
	public ResponseEntity<Bank> updateBank(@RequestBody Bank bank, @RequestParam long bankId) throws BankIdException {
		Bank bank2 = customerService.updateBank(bank, bankId);
		return new ResponseEntity<Bank>(bank2, HttpStatus.ACCEPTED);
	}

	@GetMapping("/viewBank")
	public ResponseEntity<Bank> viewBank(@RequestParam long bankId) throws BankIdException {
		Bank bank2 = customerService.viewBank(bankId);
		return new ResponseEntity<Bank>(bank2, HttpStatus.FOUND);
	}

}
