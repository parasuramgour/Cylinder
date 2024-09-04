//package com.demo.main.ServiceImplementation;
//
////import java.time.LocalDate;
//
//
////import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.demo.main.Entity.Admin;
//import com.demo.main.Entity.Bank;
//import com.demo.main.Entity.Customer;
//import com.demo.main.Entity.Cylinder;
////import com.demo.main.Entity.GasBooking;
//import com.demo.main.Exception.BankIdException;
////import com.demo.main.Exception.BookingIdException;
//import com.demo.main.Exception.CustomerIdException;
//import com.demo.main.Exception.CylinderIdException;
//import com.demo.main.Repository.AdminRepository;
//import com.demo.main.Repository.BankRepository;
//import com.demo.main.Repository.CustomerRepository;
//import com.demo.main.Repository.CylinderRepository;
////import com.demo.main.Repository.GasBookingRepository;
//import com.demo.main.Service.AdminService;
//
//@Service
//public class AdminServiceImplementation implements AdminService {
//
//	@Autowired
//	private AdminRepository adminRepository;
//
//	@Autowired
//	private CustomerRepository customerRepository;
//
//	@Autowired
//	private BankRepository bankRepository;
//
//	@Autowired
//	private CylinderRepository cylinderRepository;
//
//	//@Autowired
//	//private GasBookingRepository gasBookingRepository;
//
//	@Override
//	public Admin addAdmin(Admin admin) {
//		Admin admin2 = adminRepository.save(admin);
//
//		return admin2;
//	}
//
//	@Override
//	public Admin updateAdmin(Admin admin, long adminId) throws Exception {
//		Admin admin2 = adminRepository.findById(adminId).orElseThrow(() -> new Exception("Admin not found"));
//		admin2.setEmail(admin.getEmail());
//		return admin2;
//	}
//
//	@Override
//	public Admin viewAdmin(long adminId) throws Exception {
//		Admin admin2 = adminRepository.findById(adminId).orElseThrow(() -> new Exception("Admin not found"));
//		return admin2;
//	}
//
//	@Override
//	public String removeAdmin(long adminId) throws Exception {
//		Admin admin2 = adminRepository.findById(adminId).orElseThrow(() -> new Exception("Admin not found"));
//		adminRepository.delete(admin2);
//		return "Removed Succeessfully";
//	}
//
//	@Override
//	public Customer addCustomer(Customer customer) {
//		Cylinder cylinder2 = cylinderRepository.save(customer.getCylinder());
//		Bank bank2 = bankRepository.save(customer.getBank());
//		customer.setCylinder(cylinder2);
//		customer.setBank(bank2);
//		return customerRepository.save(customer);
//	}
//
//	@Override
//	public Customer updateCustomer(Customer customer, int customerId) throws CustomerIdException {
//		Customer customer2 = customerRepository.findById(customerId)
//				.orElseThrow(() -> new CustomerIdException("Customer not found"));
//		return customer2;
//	}
//
//	@Override
//	public Customer viewCustomer(int customerId) throws CustomerIdException {
//		Customer customer2 = customerRepository.findById(customerId)
//				.orElseThrow(() -> new CustomerIdException("Customer not found"));
//		return customer2;
//	}
//
//	@Override
//	public String removeCustomer(int customerId) throws CustomerIdException {
//		Customer customer2 = customerRepository.findById(customerId)
//				.orElseThrow(() -> new CustomerIdException("Customer not found"));
//		customerRepository.delete(customer2);
//		return "Removed Suceessfully";
//	}
//
//	@Override
//	public String removeBank(long bankId) throws BankIdException {
//		Bank bank2 = bankRepository.findById(bankId).orElseThrow(() -> new BankIdException("Bank not found"));
//		bankRepository.delete(bank2);
//		return "Removed Succeesssfully";
//	}
//
//	@Override
//	public Cylinder updateCylinder(Cylinder cylinder, long cylinderId) throws CylinderIdException {
//		Cylinder cylinder2 = cylinderRepository.findById(cylinderId)
//				.orElseThrow(() -> new CylinderIdException("Cylinder not Found"));
//		cylinder2.setCylinderType(cylinder.getCylinderType());
//		cylinder2.setCylinderPrice(cylinder.getCylinderPrice());
//		return cylinder2;
//	}
//
//	@Override
//	public Cylinder viewCylinder(long cylinderId) throws CylinderIdException {
//		Cylinder cylinder2 = cylinderRepository.findById(cylinderId)
//				.orElseThrow(() -> new CylinderIdException("Cylinder not Found"));
//		return cylinder2;
//	}
//
//	@Override
//	public String removeCylinder(long cylinderId) throws CylinderIdException {
//		Cylinder cylinder2 = cylinderRepository.findById(cylinderId)
//				.orElseThrow(() -> new CylinderIdException("Cylinder not Found"));
//		cylinderRepository.delete(cylinder2);
//		return "Removed Succeessfully";
//	}
//
////	@Override
////	public GasBooking bookingdetails(long customerId) throws BookingIdException  {
////	GasBooking bookingdetails2 = gasBookingRepository.findById(customerId).orElseThrow(() -> new BookingIdException("Customer not found"));
////	return bookingdetails2;
////	}
////
////	
////	@Override
////	public double calculateMonthlyRevenue(LocalDate date1, LocalDate date2) {
////		List<GasBooking> gasbooking2 = gasBookingRepository.findByBookingBookingDates(date1, date2);
////		double totalRevenue = 0.0;
////		for (GasBooking gasbooking : gasbooking2) {
////			totalRevenue += gasbooking.getBill();
////
////		}
////		return totalRevenue;
////	}
////
////	@Override
////	public List<GasBooking> listofbooking(LocalDate d1, LocalDate d2) {
////		List<GasBooking> booking2 = gasBookingRepository.findByBookingBookingDates(d1, d2);
////		return booking2;
////	}
//
//}
 