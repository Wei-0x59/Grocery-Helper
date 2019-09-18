package com.fdmgroup.listeners;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	
	@Override
	public void contextInitialized(ServletContextEvent applicationContextEvent) {
		ServletContext applicationContext = applicationContextEvent.getServletContext();
		
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent applicationContextEvent) {
		System.out.println("Application Context Destroyed");
		ServletContext applicationContext = applicationContextEvent.getServletContext();
		
	}

	
	
	
	
	
	

}
