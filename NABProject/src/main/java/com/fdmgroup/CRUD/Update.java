package com.fdmgroup.CRUD;

import java.util.List;

import com.fdmgroup.groceryitems.Item;

public class Update {
	
	public void updateItem(Integer id, String name, String catogery, List<Item> items) {
		for (Item item : items) {
			if(item.getId() == id) {
				item.setCategory(catogery);
				item.setItemName(name);
			}
		}
		
		
		
		
	}
	

}
