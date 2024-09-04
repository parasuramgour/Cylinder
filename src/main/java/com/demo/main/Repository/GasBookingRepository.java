package com.demo.main.Repository;

//import java.time.LocalDate;



//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.demo.main.Entity.GasBooking;

@Repository
public interface GasBookingRepository extends JpaRepository<GasBooking, Long> {

	//List<GasBooking> findByBookingBookingDates(LocalDate d1, LocalDate d2);

	//GasBooking findByCustomerCustomerId(long customerId);

}
