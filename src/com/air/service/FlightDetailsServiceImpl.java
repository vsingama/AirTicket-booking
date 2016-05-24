package com.air.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Collection;

import com.air.domain.*;
import com.air.dao.*;

public class FlightDetailsServiceImpl implements FlightDetailsService {
	
	FlightDetailsDAO dao = new FlightDetailsDAOImpl();

	@Override
	public Collection<FlightDetails> getFlights(String origin, String dest, int count, Date journeyDate,String type)
			throws SQLException, Exception {
		// TODO Auto-generated method stub
				
		return dao.getFlights(origin,dest,count,journeyDate,type);
	}

}
