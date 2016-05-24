package com.air.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.air.Constants;
import com.air.domain.*;

public class BookingDetailsDAOImpl implements BookingDetailsDAO{
	
	  Connection con;
	  PreparedStatement stmt;
	  PreparedStatement stmt1;
	  PreparedStatement pstmt;
	  ResultSet rs;
	  ResultSet rs1;
	  ResultSet rs2;

	@Override
	public FlightDetails bookTicket(int flightID,Date date,int seats,String type) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside flight booking");
		
		FlightDetails fd = null;
		try{
			con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
		
		stmt=con.prepareStatement("select flightid,carrier,starting,destination,timeofdepart,image,seats,fare,numofstops,arrivaltime from flightdetails where flightid=?");
		
		
		stmt.setInt(1, flightID);
		rs=stmt.executeQuery();
		
		if(rs.next())
		{
			fd = new FlightDetails();
			fd.setFlightid(rs.getInt(1));
			fd.setCarrier(rs.getString(2));
			fd.setStarting(rs.getString(3));
			fd.setDestination(rs.getString(4));
			fd.setTypeofClass(type);
			fd.setTimeofdeparture(rs.getString(5));
			fd.setImage(rs.getString(6));	
			fd.setSeatscount(rs.getInt(7));
			fd.setFare(rs.getLong(8));
			fd.setStops(rs.getInt(9));	
			fd.setDestinationTime(rs.getString(10));
			fd.setJourneyDate(date);
			fd.setPassCount(seats);
		}
	
		}catch(Exception e){
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
		return fd;
	}

	
	@Override
	public BookingDetails confirmTicket(int flightID, String emailID ,long userid,String type, int passCount, Date sqlDate)
			throws Exception {
		try{
			con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
		
			
			stmt1= con.prepareStatement("select dbms_random.string('X', 10) from dual");
			rs= stmt1.executeQuery();
			
			String value = null;
			
			if(rs.next())
			{
			   value= rs.getString(1);
			}
			

		pstmt=con.prepareStatement("insert into bookingdetails values(?,?,?,?,?,?,?)");
		
		pstmt.setString(1, emailID);
		pstmt.setInt(2, flightID);
		pstmt.setString(3, value);
		pstmt.setLong(4, userid);
		pstmt.setString(5, type);
		pstmt.setInt(6, passCount);
		pstmt.setDate(7, sqlDate);
		
		
		int i=pstmt.executeUpdate();
			
		if(i==1){
			System.out.println("Ticket is booked");
		}
		
		return getDetails(value);
		
		}catch(Exception e){
			
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
	}

	
	public BookingDetails getDetails(String value) throws Exception
	{
		BookingDetails bd = null;
		try{
			con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
		
		stmt=con.prepareStatement("select * from bookingdetails where confirmationid = ?");
		
		stmt.setString(1, value);
		rs= stmt.executeQuery();
		
		if(rs.next())
		{
	       bd= new BookingDetails();
		   bd.setEmailID(rs.getString(1));
		   bd.setFlightID(rs.getInt(2));
		   bd.setConfirmationID(rs.getString(3));
		   bd.setUserid(rs.getLong(4));
		   bd.setClasstype(rs.getString(5));
		   bd.setPasscount(rs.getInt(6));
		   bd.setDate(rs.getDate(7));
		}
		
	}catch(Exception e){
			
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
		
		return bd;
	}

	@Override
	public TicketDetails getTicketDetails(String email, String conf)
			throws Exception {
		// TODO Auto-generated method stub
		TicketDetails td = new TicketDetails();
		BookingDetails bd = null;
		Registration res= null;
		FlightDetails fds= null;
		
		try{
			con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
		
		stmt=con.prepareStatement("select * from bookingdetails where emailid= ? and confirmationid = ?");
		
		stmt.setString(1, email);
		stmt.setString(2, conf);
		rs= stmt.executeQuery();
		
		if(rs.next())
		{
		   bd= new BookingDetails();
		   bd.setEmailID(rs.getString(1));
		   bd.setFlightID(rs.getInt(2));
		   bd.setConfirmationID(rs.getString(3));
		   bd.setUserid(rs.getLong(4));
		   bd.setClasstype(rs.getString(5));
		   bd.setPasscount(rs.getInt(6));
		   bd.setDate(rs.getDate(7));
		  
		   td.setBookingDetails(bd);
		}
		 	
		stmt1=con.prepareStatement("select * from registration where userid= ?");
		
		stmt1.setLong(1, td.getBookingDetails().getUserid());
			rs1= stmt1.executeQuery();
		if(rs1.next())
		{
			res = new Registration();
			res.setFirstname(rs1.getString(2));
			res.setLastname(rs1.getString(3));
			res.setEmailID(rs1.getString(4));
			res.setNationality(rs1.getString(6));
			res.setPhonenum(rs1.getLong(7));
			res.setPassportnun(rs1.getString(8));
			res.setAddress(rs1.getString(10));
			td.setRegister(res);
		}
		
		pstmt=con.prepareStatement("select * from flightdetails where flightid= ?");
		
		pstmt.setLong(1, td.getBookingDetails().getFlightID());
			rs2= pstmt.executeQuery();
		if(rs2.next())
		{
			fds = new FlightDetails();
			fds.setFlightid(rs2.getLong(1));
			fds.setCarrier(rs2.getString(2));
			fds.setStarting(rs2.getString(3));
			fds.setDestination(rs2.getString(4));
			fds.setTypeofClass(rs2.getString(5));
			fds.setTimeofdeparture(rs2.getString(6));
			fds.setImage(rs2.getString(7));
			fds.setSeatscount(rs2.getInt(8));
			fds.setFare(rs2.getLong(9));
			fds.setStops(rs2.getInt(10));
			fds.setDestinationTime(rs2.getString(11));
			td.setFlightDetails(fds);
	}
		
	}catch(Exception e){
			
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
		
		return td;
	}
	
	
	public int bookedTickets(Date date,long flightID) throws Exception{
		BookingDetails bd= null;
		try{
			con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
		
		stmt=con.prepareStatement("select * from bookingdetails where journeydate= ? and flightid = ?");
		
		stmt.setDate(1, date);
		stmt.setLong(2, flightID);
			
		rs= stmt.executeQuery();
	
		int count =0;
		
		if(rs.next())
		{
		   bd= new BookingDetails();
		   bd.setPasscount(rs.getInt(6));
		   count=bd.getPasscount();
		}
	   	
		return count;
		
	}catch(Exception e){
			
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
			
		
	}


	@Override
	public List<TicketDetails> getBookingDetails(long userid) throws Exception {
		// TODO Auto-generated method stub
	
		BookingDetails bd= null;
		FlightDetails fds= null;
		TicketDetails td= null;
		ArrayList<TicketDetails> cbd = new ArrayList<>();
		try{
			con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
	
		stmt=con.prepareStatement("select bd.emailid,bd.flightid,bd.confirmationid,fd.starting,fd.destination,fd.image from bookingdetails bd, flightdetails fd where bd.userid= ? and fd.flightid=bd.flightid");
		
		stmt.setLong(1, userid);
		rs= stmt.executeQuery();
		
		while(rs.next())
		{
		   bd = new BookingDetails();
		   fds= new FlightDetails();
		   td= new TicketDetails();
		   bd.setEmailID(rs.getString(1));
		   bd.setFlightID(rs.getInt(2));
		   bd.setConfirmationID(rs.getString(3));
		   bd.setUserid(userid);
		   td.setBookingDetails(bd);
		   fds.setStarting(rs.getString(4));
		   fds.setDestination(rs.getString(5));
		   fds.setImage(rs.getString(6));
		   td.setFlightDetails(fds);
		   cbd.add(td);	
		}
		rs.close();
		
	}catch(Exception e){			
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
		return cbd;
	}


	@Override
	public int cancelTicket(String conf) throws Exception {
		// TODO Auto-generated method stub
		BookingDetails bd = null;
		try{
			con=DriverManager.getConnection(Constants.DB_URL,Constants.DB_USER,Constants.DB_PWD);
		
		stmt=con.prepareStatement("select * from bookingdetails where confirmationid = ?");
		
		stmt.setString(1, conf);
		rs= stmt.executeQuery();
		
		if(rs.next())
		{
	       bd= new BookingDetails();
		   bd.setEmailID(rs.getString(1));
		   bd.setFlightID(rs.getInt(2));
		   bd.setConfirmationID(rs.getString(3));
		   bd.setUserid(rs.getLong(4));
		   bd.setClasstype(rs.getString(5));
		   bd.setPasscount(rs.getInt(6));
		   bd.setDate(rs.getDate(7));
		}
		
		int value= bd.getFlightID();
		
		if(value > 0)
		{
			pstmt=con.prepareStatement("delete from bookingdetails where confirmationid = ?");
			
			pstmt.setString(1, conf);
			int val = pstmt.executeUpdate();
			return val;
		}
		else
		{
			return 0;
		}
		
	}catch(Exception e){
			
			throw new Exception("Could not fetch details");
		}finally{
			if(null!=con){
				con.close();
			}
		}
		
		
	}
}
