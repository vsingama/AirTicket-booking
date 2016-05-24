package com.air.service;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

import com.air.dao.*;
import com.air.domain.BookingDetails;
import com.air.domain.FlightDetails;
import com.air.domain.TicketDetails;

public class BookingDetailsServiceImpl implements BookingDetailsService{
	
	BookingDetailsDAO dao = new BookingDetailsDAOImpl();

	@Override
	public FlightDetails bookTicket(int flightID,Date date,int seats,String type) throws Exception {
		// TODO Auto-generated method stub
		return dao.bookTicket(flightID,date,seats,type);
	}

	@Override
	public BookingDetails confirmTicket(int flightID, String emailID, long userid,String type, int passCount, Date sqlDate)
			throws Exception {
		// TODO Auto-generated method stub
		return dao.confirmTicket(flightID, emailID, userid,type,passCount,sqlDate);
	}

	@Override
	public TicketDetails getTicketDetails(String email, String conf)
			throws Exception {
		// TODO Auto-generated method stub
		
		return dao.getTicketDetails(email, conf);
	}

	@Override
	public List<TicketDetails> getBookingDetails(long userid) throws Exception {
		// TODO Auto-generated method stub
		return dao.getBookingDetails(userid);
	}

	@Override
	public int cancelTicket(String conf) throws Exception {
		// TODO Auto-generated method stub
		return dao.cancelTicket(conf);
	}

}
