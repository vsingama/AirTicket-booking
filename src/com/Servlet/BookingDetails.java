package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.air.domain.FlightDetails;
import com.air.service.FlightDetailsService;
import com.air.service.FlightDetailsServiceImpl;

/**
 * Servlet implementation class BookingDetails
 */
@WebServlet("/BookingDetails")
public class BookingDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		
		String type= "economy";		
		int count=Integer.parseInt(request.getParameter("person").trim());
		
		FlightDetailsService service = new FlightDetailsServiceImpl();

	
		try
		{
			java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("startdate")); 
						
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());	
			
			if((null!=starting && starting.length()>0)&&(null!=dest && dest.length()>0)){
				Collection<FlightDetails> fights = service.getFlights(starting,dest,count,sqlDate,type);
				if(null!=fights){
					request.setAttribute("book", fights);
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
}
