package com.air.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Collection;

import com.air.domain.FlightDetails;

public interface FlightDetailsService {

	public Collection<FlightDetails> getFlights(String origin, String dest, int count, Date journeyDate, String type) throws SQLException, Exception;
}
