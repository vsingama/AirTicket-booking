package com.air.dao;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

import com.air.domain.*;

public interface BookingDetailsDAO {

	public FlightDetails bookTicket(int flightID,Date date,int seats,String type) throws Exception;
	
	public BookingDetails confirmTicket(int flightID, String emailID, long userid,String type, int passCount, Date sqlDate) throws Exception;

	public TicketDetails getTicketDetails(String email, String conf) throws Exception;
	
	public List<TicketDetails> getBookingDetails(long userid) throws Exception;
	
	public int cancelTicket(String conf) throws Exception;
}

