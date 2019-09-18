package com.fdmgroup.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.CRUD.Create;
import com.fdmgroup.CRUD.IdGenerator;
import com.fdmgroup.CRUD.Update;
import com.fdmgroup.groceryitems.Item;

public class UpdateItemServlet extends HttpServlet {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Update update = new Update(); 
		
		
		String newItemId = (String) request.getParameter("itemid");
		String newItemName = (String) request.getParameter("itemname");
		String newItemCat = (String) request.getParameter("itemcat");
		
		System.out.println(newItemName);
		System.out.println(newItemCat);
		
		Integer itemId = Integer.parseInt(newItemId.trim());

		ServletContext applicationContext = getServletContext();
		
		List<Item> itemList = (List<Item>) applicationContext.getAttribute("itemlist");
		
		update.updateItem(itemId, newItemName, newItemCat, itemList);
		
		applicationContext.setAttribute("itemlist", itemList);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
		
		try {
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
		
		
		

		
		
	}
	

}
