package com.air.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.air.domain.*;
import com.air.Constants;

public class FlightDetailsDAOImpl implements FlightDetailsDAO {


	 Connection con;
	  PreparedStatement stmt;
	  PreparedStatement stmt1;
		PreparedStatement pstmt;
		ResultSet rs;
		
	
	@Override
	public Collection<FlightDetails> getFlights(String origin, String dest, int count,Date journeyDate,String type)
			throws SQLException, Exception {
		// TODO Auto-generated method stub
	
		FlightDetails fd = null;
		BookingDetailsDAOImpl dao = new BookingDetailsDAOImpl();
		List<FlightDetails> fds = new ArrayList<FlightDetails>();
		try{
		con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
			
		String query = "select * from flightdetails where starting= ? and destination = ?";
		stmt=con.prepareStatement(query);
		stmt.setString(1, origin);
		stmt.setString(2, dest);
		
		rs=stmt.executeQuery();
		
		while(rs.next())
		{
			fd = new FlightDetails();
			fd.setFlightid(rs.getInt(1));
			int booked=dao.bookedTickets(journeyDate,fd.getFlightid());
			fd.setCarrier(rs.getString(2));
			fd.setStarting(rs.getString(3));
			fd.setDestination(rs.getString(4));
			fd.setTypeofClass(type);
			fd.setTimeofdeparture(rs.getString(6));
			fd.setImage(rs.getString(7));
			fd.setSeatscount(rs.getInt(8)-booked);
			fd.setFare(rs.getLong(9)*count);
			fd.setStops(rs.getInt(10));
			fd.setJourneyDate(journeyDate);
			fd.setDestinationTime(rs.getString(11));
			fd.setPassCount(count);
			fds.add(fd);			
		}
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
		
		return fds;

	}

}
