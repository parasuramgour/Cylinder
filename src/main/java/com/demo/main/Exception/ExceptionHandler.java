package com.demo.main.Exception;

import java.util.Date;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ExceptionHandler {

	public ResponseEntity<?> handleBookingIdException(BookingIdException bookingIdException, WebRequest webRequest) {
		ErrorDetails errordetails = new ErrorDetails(new Date(), bookingIdException.getMessage(),
				webRequest.getDescription(false));
		return new ResponseEntity<>(errordetails, HttpStatus.NOT_FOUND);
	}

	public ResponseEntity<?> handleSurrenderCylinderIdException(
			SurrenderCylinderIdException surrenderCylinderIdException, WebRequest webRequest) {
		ErrorDetails errordetails = new ErrorDetails(new Date(), surrenderCylinderIdException.getMessage(),
				webRequest.getDescription(false));

		return new ResponseEntity<>(errordetails, HttpStatus.NOT_FOUND);

	}

	public ResponseEntity<?> handleCustomerIdException(CustomerIdException customerIdException, WebRequest webRequest) {
		ErrorDetails errordetails = new ErrorDetails(new Date(), customerIdException.getMessage(),
				webRequest.getDescription(false));

		return new ResponseEntity<>(errordetails, HttpStatus.NOT_FOUND);

	}

	public ResponseEntity<?> handleCylinderIdException(CylinderIdException cylinderIdException, WebRequest webRequest) {
		ErrorDetails errordetails = new ErrorDetails(new Date(), cylinderIdException.getMessage(),
				webRequest.getDescription(false));
		return new ResponseEntity<>(errordetails, HttpStatus.NOT_FOUND);
	}

	public ResponseEntity<?> handleBankIdException(BankIdException bankIdException, WebRequest webRequest) {
		ErrorDetails errordetails = new ErrorDetails(new Date(), bankIdException.getMessage(),
				webRequest.getDescription(false));
		return new ResponseEntity<>(errordetails, HttpStatus.NOT_FOUND);

	}

}
