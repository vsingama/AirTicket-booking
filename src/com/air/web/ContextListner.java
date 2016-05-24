package com.air.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ContextListner  implements
		ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
		System.out.println("********  Application is undeployed   **********");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("********  Application is Started   **********");

	}

}
