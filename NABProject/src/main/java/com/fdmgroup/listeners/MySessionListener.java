package com.fdmgroup.listeners;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.fdmgroup.groceryitems.Item;

public class MySessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent sessionEvent) {
		System.out.println("Session Created");
		ServletContext applicationContext = sessionEvent.getSession().getServletContext();
		
		List<Item> itemsList = new ArrayList<Item>(); 
		List<Item> catList = new ArrayList<Item>();
		
		Integer itemId = 0;
		applicationContext.setAttribute("itemlist", itemsList);
		applicationContext.setAttribute("itemid", itemId);
		applicationContext.setAttribute("catList", catList);

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		System.out.println("Session Destroyed");
		ServletContext applicationContext = sessionEvent.getSession().getServletContext();
//remove attributes
		HttpSession sessionContext = sessionEvent.getSession();

	}

}
