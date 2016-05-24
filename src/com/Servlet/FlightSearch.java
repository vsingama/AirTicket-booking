package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.air.domain.*;
import com.air.service.*;

/**
 * Servlet implementation class FlightSearch
 */
@WebServlet("/FlightSearch")
public class FlightSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	  Connection con;
	  PreparedStatement stmt;
	  PreparedStatement stmt1;
	  PreparedStatement pstmt;
	  ResultSet rs;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
			
		int flightID=Integer.parseInt(request.getParameter("flightID").trim());
		System.out.println("flightid : " + flightID);
		int seats=Integer.parseInt(request.getParameter("seatCount").trim());
	    String type=request.getParameter("type").trim();
		BookingDetailsService service = new BookingDetailsServiceImpl(); 
		System.out.println("inside flight search");
		try
		{
			java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date")); 
			
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());	
			
			if(flightID>0){
				FlightDetails fights =  service.bookTicket(flightID,sqlDate,seats,type);
				if(null!=fights){
					System.out.println("servlet : " + fights.getDestinationTime());		
					request.setAttribute("custom", fights);
					RequestDispatcher rd = request.getRequestDispatcher("bookTicket.jsp");
					rd.forward(request, response);
					
				}else{
					response.sendRedirect("searchResultFail.html");
				}
			}
			
			}//try
		catch(Exception e)
		{
		
		e.printStackTrace();	
		}
		out.flush();
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
			
		String starting=request.getParameter("starting").trim();
		String dest=request.getParameter("dest").trim();
		String type=request.getParameter("classType").trim();
		int count=Integer.parseInt(request.getParameter("person").trim());
			
		FlightDetailsService service = new FlightDetailsServiceImpl();
		
		try
		{
			java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("startdate")); 
			
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
			if((null!=starting && starting.length()>0)&&(null!=dest && dest.length()>0)){
				Collection<FlightDetails> fights = service.getFlights(starting,dest,count,sqlDate,type);
				if(null!=fights){
					request.setAttribute("flights", fights);
					RequestDispatcher rd = request.getRequestDispatcher("showFlights.jsp");
					rd.forward(request, response);
					
				}else{
					response.sendRedirect("searchResultFail.html");
				}			
			}
			
			}//try
		catch(Exception e)
		{
		
		e.printStackTrace();	
		}
		out.flush();
		out.close();
		
		
	}

}
