package com.fdmgroup.groceryitems;

public class Item {
	
	private int id;
	private String itemName;
	private String category;
	
	
	
	public Item(int id, String itemName, String category) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.category = category;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	

}
