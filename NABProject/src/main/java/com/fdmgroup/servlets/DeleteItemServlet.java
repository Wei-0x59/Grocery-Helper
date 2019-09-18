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
import com.fdmgroup.CRUD.Delete;
import com.fdmgroup.CRUD.IdGenerator;
import com.fdmgroup.groceryitems.Item;

public class DeleteItemServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Delete deleteItem = new Delete();

		String ItemId = request.getParameter("itemid");

		Integer itemId = Integer.parseInt(ItemId);

		System.out.println(ItemId);

		ServletContext applicationContext = getServletContext();

		List<Item> itemList = (List<Item>) applicationContext.getAttribute("itemlist");
		

		deleteItem.deleteItembyId(itemId, itemList);

		applicationContext.setAttribute("itemlist", itemList);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");

		try {
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
