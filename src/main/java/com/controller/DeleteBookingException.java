package com.controller;

import java.util.Arrays;

public class DeleteBookingException extends RuntimeException

{
	private static int BookingId;
	public DeleteBookingException(int bookingId) {
		super("BookingId"+ BookingId +"not found");
		this.BookingId=BookingId;
	}
	@Override
	public String toString() {
		return "DeleteBookingException ";
	}
	
	
    
}