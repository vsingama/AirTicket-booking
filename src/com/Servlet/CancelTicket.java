package com.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.air.domain.TicketDetails;
import com.air.service.BookingDetailsService;
import com.air.service.BookingDetailsServiceImpl;

/**
 * Servlet implementation class CancelTicket
 */
@WebServlet("/CancelTicket")
public class CancelTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CancelTicket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long id=Integer.parseInt(request.getParameter("userid").trim());
		
		BookingDetailsService service = new BookingDetailsServiceImpl();
		
		try
		{
			List<TicketDetails> details = service.getBookingDetails(id);
				if(null!=details){
					request.setAttribute("display", details);
					RequestDispatcher rd = request.getRequestDispatcher("cancelTicket.jsp");
					rd.forward(request, response);					
				}
				else{
					
				}
			}
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
	}

}
