package com.Servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.air.service.*;


/**
 * Servlet implementation class CreateLogin
 */
@WebServlet("/CreateLogin")
public class CreateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateLogin() {
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
				
		String pass =request.getParameter("password").trim();
		
		String cpass=request.getParameter("cpassword").trim();
		
		String userid=request.getParameter("custid").trim();
		
		long id = Integer.parseInt(userid);
		
		RegistrationService rs = new RegistrationServiceImpl();
	
		try
		{	
			if(pass.equals(cpass)){
				
				  int i = rs.createUser(id,pass);
				if(i > 0){
					RequestDispatcher rd = request.getRequestDispatcher("userlogin.jsp");
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
	
		
		
	}

}
