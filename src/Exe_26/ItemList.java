package Exe_26;

import java.util.ArrayList;

public class ItemList<T> extends ArrayList<T> {

	public void checkout(ItemList<Item> itemList) {

		int totalPrice = 0;

		for (Item item : itemList) {
			int price = item.getItemPrice();
			int quantity = item.getItemQuantity();
			System.out.println(item.getItemName() + "  " + price + " * "
					+ quantity + " = " + price * quantity);

			totalPrice += (price * quantity);

		}

		System.out.println("Total amount : " + totalPrice);
	}

}
