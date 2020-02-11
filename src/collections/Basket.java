package collections;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	 private List<Item> itemList = new ArrayList<Item>();
	
	 public void addItems(Item item, int amount) {
		 for(int i = 0; i < amount; i++) {
			 itemList.add(item);
		 }
	 }
	 
	public static void main(String[] args) {
		Basket customerOne = new Basket();
		Basket customerTwo = new Basket();

		
		Item milk = new Item("Sut", 1.5, ItemType.READY_MEAL);
		Item bread = new Item("Bread", 1.1, ItemType.READY_MEAL);

		customerOne.addItems(milk, 4);
		
	}

}
