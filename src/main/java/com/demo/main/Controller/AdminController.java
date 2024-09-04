//package com.demo.main.Controller;
//
////import java.time.LocalDate;
//
////import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.demo.main.Entity.Admin;
//import com.demo.main.Entity.Customer;
//import com.demo.main.Entity.Cylinder;
////import com.demo.main.Entity.GasBooking;
//import com.demo.main.Exception.BankIdException;
////import com.demo.main.Exception.BookingIdException;
//import com.demo.main.Exception.CustomerIdException;
//import com.demo.main.Exception.CylinderIdException;
//import com.demo.main.Service.AdminService;
//
//@RestController
//public class AdminController {
//
//	@Autowired
//	public AdminService adminService;
//
//	@PostMapping("/addAdmin")
//	public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
//		Admin admin2 = adminService.addAdmin(admin);
//		return new ResponseEntity<Admin>(admin2, HttpStatus.CREATED);
//	}
//
//	@PutMapping("/updateAdmin")
//	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin, @RequestParam long adminId) throws Exception {
//		Admin admin2 = adminService.updateAdmin(admin, adminId);
//		return new ResponseEntity<Admin>(admin2, HttpStatus.ACCEPTED);
//	}
//
//	@GetMapping("/viewAdmin")
//	public ResponseEntity<Admin> viewAdmin(@RequestParam long adminId) throws Exception {
//		Admin admin2 = adminService.viewAdmin(adminId);
//		return new ResponseEntity<Admin>(admin2, HttpStatus.FOUND);
//	}
//
//	@DeleteMapping("/removeAdmin")
//	public ResponseEntity<String> removeAdmin(@RequestParam long adminId) throws Exception {
//		String admin2 = adminService.removeAdmin(adminId);
//		return new ResponseEntity<String>(admin2, HttpStatus.OK);
//	}
//
//	@PostMapping("/addCustomer")
//	public ResponseEntity<Customer>  addCustomer(@RequestBody Customer customer) {
//		Customer customer2 = adminService.addCustomer(customer); 
//		return new ResponseEntity<Customer>(customer2, HttpStatus.CREATED);
//	}
//
//	@PutMapping("/updateCustomer")
//	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @RequestParam int customerId)
//			throws CustomerIdException {
//		Customer customer2 = adminService.updateCustomer(customer, customerId);
//		return new ResponseEntity<Customer>(customer2, HttpStatus.ACCEPTED);
//	}
//
//	@GetMapping("/viewCustomer")
//	public ResponseEntity<Customer> viewCustomer(@RequestParam int customerId) throws CustomerIdException {
//		Customer customer2 = adminService.viewCustomer(customerId);
//		return new ResponseEntity<Customer>(customer2, HttpStatus.FOUND);
//	}
//
//	@DeleteMapping("/removeCustomer")
//	public ResponseEntity<String> removeCustomer(@RequestParam int customerId) throws CustomerIdException {
//		String customer2 = adminService.removeCustomer(customerId);
//		return new ResponseEntity<String>(customer2, HttpStatus.OK);
//	}
//
//	@DeleteMapping("/removeBank")
//	public ResponseEntity<String> removeBank(@RequestParam long bankId) throws BankIdException {
//		String bank2 = adminService.removeBank(bankId);
//		return new ResponseEntity<String>(bank2, HttpStatus.OK);
//	}
//
//	@PutMapping("/updateCylinder")
//	public ResponseEntity<Cylinder> updateCylinder(@RequestBody Cylinder cylinder, @RequestParam long cylinderId)
//			throws CylinderIdException {
//		Cylinder cylinder2 = adminService.updateCylinder(cylinder, cylinderId);
//		return new ResponseEntity<Cylinder>(cylinder2, HttpStatus.ACCEPTED);
//	}
//
//	@GetMapping("/viewCylinder")
//	public ResponseEntity<Cylinder> viewCylinder(@RequestParam long cylinderId) throws CylinderIdException {
//		Cylinder cylinder2 = adminService.viewCylinder(cylinderId);
//		return new ResponseEntity<Cylinder>(cylinder2, HttpStatus.FOUND);
//	}
//
//	@DeleteMapping("/removeCylinder")
//	public ResponseEntity<String> removeCylinder(@RequestParam long cylinderId) throws CylinderIdException {
//		String cylinder2 = adminService.removeCylinder(cylinderId );
//		return new ResponseEntity<String>(cylinder2, HttpStatus.OK);
//	}
//
////	@GetMapping("/bookingdetails")
////	public ResponseEntity<GasBooking> bookingdetails(@RequestParam long customerId) throws BookingIdException {
////		GasBooking gasBooking2 = adminService.bookingdetails(customerId);
////		return new ResponseEntity<GasBooking>(gasBooking2, HttpStatus.FOUND);
////	}
//
////	@GetMapping("/calculateMonthlyRevenue")
////	public ResponseEntity<Double> calculateMonthlyRevenue(@RequestParam LocalDate date1,
////			@RequestParam LocalDate date2) {
////		double d1 = adminService.calculateMonthlyRevenue(date1, date2);
////		return new ResponseEntity<Double>(d1, HttpStatus.FOUND);
////
////	}
////
////	@GetMapping("/listofbooking")
////	public ResponseEntity<List<GasBooking>> listofbooking(@RequestParam LocalDate d1, @RequestParam LocalDate d2) {
////		List<GasBooking> gasbooking2 = adminService.listofbooking(d1, d2);
////		return new ResponseEntity<List<GasBooking>>(gasbooking2, HttpStatus.FOUND);
////	}
//
//}
