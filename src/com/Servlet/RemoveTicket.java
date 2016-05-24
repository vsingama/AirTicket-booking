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
 * Servlet implementation class RemoveTicket
 */
@WebServlet("/RemoveTicket")
public class RemoveTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveTicket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String conf=request.getParameter("confirmation").trim();
		System.out.println("confirmation : " + conf);
		BookingDetailsService service = new BookingDetailsServiceImpl();
		
		try
		{
			int details = service.cancelTicket(conf);
				if(details > 0){
					request.setAttribute("display", details);
					RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
					rd.forward(request, response);					
				}
				else{
					System.out.println("No tickets found for the given confirmation ID");
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
