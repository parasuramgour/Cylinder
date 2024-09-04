package com.demo.main.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.demo.main.Entity.Bank;
//import com.demo.main.Entity.Customer;
import com.demo.main.Entity.GasBooking;
import com.demo.main.Entity.SurrenderCylinder;
import com.demo.main.Exception.BankIdException;
import com.demo.main.Exception.BookingIdException;
import com.demo.main.Exception.SurrenderCylinderIdException;
import com.demo.main.Repository.BankRepository;
import com.demo.main.Repository.GasBookingRepository;
import com.demo.main.Repository.SurrenderCylinderRepository;
import com.demo.main.Service.CustomerService;

@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	private GasBookingRepository gasBookingRepository;

	@Autowired
	private SurrenderCylinderRepository surrenderCylinderRepository;

	@Autowired
	private BankRepository bankRepository;

	@Override
	public GasBooking addGasBooking(GasBooking gasBooking, int customerId) {
		GasBooking gasbooking2 = gasBookingRepository.save(gasBooking);

		return gasbooking2;
	}

	@Override
	public GasBooking updateGasBooking(GasBooking gasBooking, long gasBookingId) throws BookingIdException {
		GasBooking gasbooking2 = gasBookingRepository.findById(gasBookingId)
				.orElseThrow(() -> new BookingIdException("Booking not found"));
		gasbooking2.setStatus(gasBooking.isStatus());
		return gasbooking2;
	}

	@Override
	public GasBooking getGasBooking(long gasBookingId) throws BookingIdException {
		GasBooking gasbooking2 = gasBookingRepository.findById(gasBookingId)
				.orElseThrow(() -> new BookingIdException("Booking not found"));
		return gasbooking2;

	}

	@Override
	public String deleteGasBooking(long gasBookingId) throws BookingIdException {
		GasBooking gasbooking2 = gasBookingRepository.findById(gasBookingId)
				.orElseThrow(() -> new BookingIdException("Booking not found"));
		gasBookingRepository.delete(gasbooking2);
		;
		return "Removed successfully";
	}

	@Override
	public GasBooking bookingdetails(long gasBookingId) throws BookingIdException {
		GasBooking gasbooking2 = gasBookingRepository.findById(gasBookingId)
				.orElseThrow(() -> new BookingIdException("Details not found"));
		return gasbooking2;
	}

	@Override
	public SurrenderCylinder addSurrenderCylinder(SurrenderCylinder surrenderCylinder, int customerId) {
		SurrenderCylinder surrendercylinder2 = surrenderCylinderRepository.save(surrenderCylinder);

		return surrendercylinder2;
	}

	@Override
	public SurrenderCylinder updateSurrenderCylinder(SurrenderCylinder surrenderCylinder, long surrenderId)
			throws SurrenderCylinderIdException {
		SurrenderCylinder surrendercylinder2 = surrenderCylinderRepository.findById(surrenderId)
				.orElseThrow(() -> new SurrenderCylinderIdException("Surrender not found"));
		surrendercylinder2.setSurrenderdate(surrenderCylinder.getSurrenderdate());
		return surrendercylinder2;
	}

	@Override
	public SurrenderCylinder viewSurrenderCylinder(long surrenderId) throws SurrenderCylinderIdException {
		SurrenderCylinder surrendercylinder2 = surrenderCylinderRepository.findById(surrenderId)
				.orElseThrow(() -> new SurrenderCylinderIdException("Surrender not found"));
		return surrendercylinder2;
	}

	@Override
	public String removeSurrenderCylinder(long surrenderId) throws SurrenderCylinderIdException {
		SurrenderCylinder surrendercylinder2 = surrenderCylinderRepository.findById(surrenderId)
				.orElseThrow(() -> new SurrenderCylinderIdException("Surrender not found"));
		surrenderCylinderRepository.delete(surrendercylinder2);
		return "Removed Successfully";
	}

	@Override
	public Bank updateBank(Bank bank, long bankId) throws BankIdException {
		Bank bank2 = bankRepository.findById(bankId).orElseThrow(() -> new BankIdException("Bank not found"));
		bank2.setBaddress(bank.getBaddress());
		return bank2;
	}

	@Override
	public Bank viewBank(long bankId) throws BankIdException {
		Bank bank2 = bankRepository.findById(bankId).orElseThrow(() -> new BankIdException("Bank not found"));
		return bank2;
	}

}
