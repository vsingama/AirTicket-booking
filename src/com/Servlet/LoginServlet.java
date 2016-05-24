package com.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.air.service.RegistrationService;
import com.air.service.RegistrationServiceImpl;
import com.air.domain.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		
		HttpSession session=request.getSession();
		if(session != null){
		response.setContentType("text/html");

				
		String email=request.getParameter("username");
		String password=request.getParameter("password");
		
		RegistrationService rs = new RegistrationServiceImpl();
		
		//BookingDetailsService service = new BookingDetailsServiceImpl();		
		try
		{
			String str = "";
			session.setAttribute("fname", str);
			Registration register =  rs.getUser(email,password);
				if(null!=register){
					str=  register.getFirstname();
					
					session.setAttribute("userid",register.getUserid());
					session.setAttribute("fname",str);
					session.setAttribute("lname", register.getLastname());
					
					RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
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
		else
		{
			response.sendRedirect("index.jsp");
		}
	}
}
