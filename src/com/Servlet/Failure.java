package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/failure")
public class Failure extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<center>");
		
		out.println("<font color='red'>User registration failed</font>");
		
		
		out.println("Request Parameters:");
	    @SuppressWarnings("rawtypes")
		Enumeration enum1 = req.getParameterNames();
	    while (enum1.hasMoreElements()) {
	      String name = (String) enum1.nextElement();
	      String values[] = req.getParameterValues(name);
	      if (values != null) {
	        for (int i = 0; i < values.length; i++) {
	          out.println(name + " (" + i + "): " + values[i]);
	          System.out.println();
	        }
	      }
	    }
	    out.println("</center>");
	    out.println("Error Message:"+req.getAttribute("ERROR"));
	    out.println("<a href='registration.html'>New User Registration</a>");
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	

}
