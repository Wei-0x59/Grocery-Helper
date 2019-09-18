package com.fdmgroup.CRUD;

import java.util.List;

import com.fdmgroup.groceryitems.Item;

public class Read {
	
	public Item read(int id, List<Item> itemsList) {
		for (Item item : itemsList) {
			if(item.getId()==id) {
				return item;
			}
		}
		return null;
	}
	
	

}
