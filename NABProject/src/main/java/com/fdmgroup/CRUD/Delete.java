package com.fdmgroup.CRUD;

import java.util.Iterator;
import java.util.List;

import com.fdmgroup.groceryitems.Item;

public class Delete {

	public void deleteItem(Item deleteItem, List<Item> listItems) {

		for (Item item : listItems) {
			if (item.getId() == deleteItem.getId()) {
				listItems.remove(item);
			}
		}

	}

	public void deleteItembyId(Integer id, List<Item> listItems) {
		Iterator<Item> iter = listItems.iterator();

		for (Item item : listItems) {
			if (item.getId() == id) {
				listItems.remove(item);
			}
		}

	}

}
