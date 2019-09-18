package com.fdmgroup.CRUD;

import com.fdmgroup.groceryitems.Item;

public class Create {
	
	public Item createAnItem(int itemid, String itemName, String catogery ) {
		Item newItem = new Item(itemid, itemName, catogery); 
		return newItem;
	}

}
