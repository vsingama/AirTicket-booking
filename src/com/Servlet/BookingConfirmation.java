package com.Servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.air.service.*;
import com.air.domain.BookingDetails;

/**
 * Servlet implementation class BookingConfirmation
 */
@WebServlet("/BookingConfirmation")
public class BookingConfirmation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingConfirmation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
				
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String email=request.getParameter("email");
		String country=request.getParameter("nationality");
		String mnum=request.getParameter("phonenumber");
		String passport=request.getParameter("passport");
		String address=request.getParameter("address");
		
		
		RegistrationService rs = new RegistrationServiceImpl();
		
		int flightID=Integer.parseInt(request.getParameter("flightID").trim());
		String type=request.getParameter("type");
		int passCount=Integer.parseInt(request.getParameter("passCount").trim());
		String emailID=request.getParameter("email");
		//long userid =0;
		
		long id=Integer.parseInt(request.getParameter("userid").trim());

		BookingDetailsService service = new BookingDetailsServiceImpl();
		
		try
		{
			java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("jDate")); 
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());	
			
			if(id >0 ){
				//userid = Integer.parseInt((String) session.getAttribute("userid"));
				rs.updateUser(id,fname, lname, emailID, country, mnum, passport, address);
			}
			else{
			 id =  rs.saveUser(fname,lname,email,country,mnum,passport,address);
			}
			BookingDetails fights =  service.confirmTicket(flightID, emailID, id,type,passCount,sqlDate);
				if(null!=fights){
					request.setAttribute("confirm", fights);
					RequestDispatcher rd = request.getRequestDispatcher("confirmTicket.jsp");
					rd.forward(request, response);
					
				}else{
					response.sendRedirect("searchResultFail.html");
				}
			}
		catch(Exception e)
		{
		e.printStackTrace();	
		}	
	}
}
