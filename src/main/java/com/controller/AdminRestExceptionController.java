package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AdminRestExceptionController {
	
	@ExceptionHandler(DeleteCredentialsException.class)
	public ResponseEntity<?> handleDeleteexception(DeleteCredentialsException e, WebRequest req)
	{
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UpdateCredentialsException.class)
	public ResponseEntity<?> handleupdateexception(UpdateCredentialsException e, WebRequest req)
	{
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(AddCredentialsException.class)
	public ResponseEntity<?> handledeleteexception(DeleteBookingException e, WebRequest req)
	{
		return new ResponseEntity<> (e.toString(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(FindCredentialsException.class)
	public ResponseEntity<?> handleupdateexception(UpdateBookingException e, WebRequest req)
	{
		return new ResponseEntity<> (e.toString(),HttpStatus.NOT_FOUND);
	}

}