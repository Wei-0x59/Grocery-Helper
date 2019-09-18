package com.fdmgroup.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.CRUD.Create;
import com.fdmgroup.CRUD.IdGenerator;
import com.fdmgroup.groceryitems.Item;

public class AddItemServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		
		Create createItem = new Create();
		IdGenerator generateId = new IdGenerator(); 
		
		String newItemName = (String) request.getParameter("itemname");
		String newItemCat = (String) request.getParameter("itemcat");

		ServletContext applicationContext = getServletContext();
		
		List<Item> itemList = (List<Item>) applicationContext.getAttribute("itemlist");
		Integer currentId = (Integer) applicationContext.getAttribute("itemid");
		
		
		
		Item newItem =  createItem.createAnItem(generateId.IdGenerate(currentId), newItemName, newItemCat);
		itemList.add(newItem);
		System.out.println(currentId);
		applicationContext.setAttribute("itemid", currentId+1);
		applicationContext.setAttribute("itemlist", itemList);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
		
		try {
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
		
		
		

		
		
	}
	
	

}
