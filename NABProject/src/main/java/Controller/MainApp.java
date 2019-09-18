package Controller;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.CRUD.*;
import com.fdmgroup.groceryitems.Item;

public class MainApp {

	
	
	public static void main(String[] args) {
		int currentId = 0;
		Create createItem = new Create();
		IdGenerator generateId= new IdGenerator();
		Delete deleteItem = new Delete();
		
		List<Item> itemList = new ArrayList<Item>();
		Item potatos = createItem.createAnItem(generateId.IdGenerate(currentId), "potatos", "veg");
		itemList.add(potatos);
		System.out.println(itemList.get(0).getItemName());
		Item tomato = createItem.createAnItem(generateId.IdGenerate(currentId), "tomatos", "veg");
		itemList.add(tomato);
		System.out.println(itemList.get(1).getItemName());
		
		deleteItem.deleteItem(potatos, itemList);
		
		
	
		
		
		
		
	}
}
