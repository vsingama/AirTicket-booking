package com.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.air.service.BookingDetailsService;
import com.air.service.BookingDetailsServiceImpl;
import com.air.domain.*;

/**
 * Servlet implementation class MyBooking
 */
@WebServlet("/MyBooking")
public class MyBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyBooking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=request.getParameter("emailID");
		String conf=request.getParameter("confirmation");
	 
		BookingDetailsService service = new BookingDetailsServiceImpl();
		
		try
		{
			TicketDetails fights =  service.getTicketDetails(email, conf);
				if(null!=fights){
					request.setAttribute("display", fights);
					RequestDispatcher rd = request.getRequestDispatcher("displayTicket.jsp");
					rd.forward(request, response);					
				}else{
					response.sendRedirect("searchResultFail.html");
				}
			
			}//try
		catch(Exception e)
		{
		
		e.printStackTrace();	
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email=request.getParameter("emailID");
		String conf=request.getParameter("confirmation");
	 
		BookingDetailsService service = new BookingDetailsServiceImpl();
		
		try
		{
			TicketDetails fights =  service.getTicketDetails(email, conf);
				if(null!=fights){
					request.setAttribute("display", fights);
					RequestDispatcher rd = request.getRequestDispatcher("displayTicket.jsp");
					rd.forward(request, response);					
				}else{
					response.sendRedirect("searchResultFail.html");
				}
			
			}//try
		catch(Exception e)
		{
		
		e.printStackTrace();	
		}	
	}
		
}
