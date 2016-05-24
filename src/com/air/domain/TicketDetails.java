package com.air.domain;

public class TicketDetails {
	
	private BookingDetails bookingDetails;
	private Registration register;
	private FlightDetails flightDetails;
	
	public Registration getRegister() {
		return register;
	}
	public void setRegister(Registration register) {
		this.register = register;
	}
	public FlightDetails getFlightDetails() {
		return flightDetails;
	}
	public void setFlightDetails(FlightDetails flightDetails) {
		this.flightDetails = flightDetails;
	}
	
	
	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	

}
