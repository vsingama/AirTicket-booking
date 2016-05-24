package com.air.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Collection;

import com.air.domain.*;


public interface FlightDetailsDAO {

	public Collection<FlightDetails> getFlights(String origin, String dest, int count,Date journeyDate, String date) throws SQLException, Exception;
	
}

