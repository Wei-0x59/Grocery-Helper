package com.fdmgroup.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.groceryitems.Item;

public class SearchByCategoryServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		String category = (String) request.getParameter("category");

		ServletContext applicationContext = getServletContext();
		
		List<Item> itemList = (List<Item>) applicationContext.getAttribute("itemlist");
		
		List<Item> categoryList = new ArrayList<Item>();
		
		for (Item item : itemList) {
			if(category.equals(item.getCategory())) {
				categoryList.add(item);
			}
		}
		
		applicationContext.setAttribute("catList", categoryList);
	}

	
	
	
	

}
