package Exe_26;


public class ItemList<T> extends ArrayList<T> {

	public void checkout() {

		int totalPrice = 0;

		for (int i=0;i<size();i++) {
			int price = ((Item)get(i)).getItemPrice();
			int quantity = ((Item)get(i)).getItemQuantity();
			System.out.println(((Item)get(i)).getItemName() + "  " + price + " * " + quantity + " = " + price * quantity);

			totalPrice += (price * quantity);

		}

		System.out.println("-------------------------\n\t\tRs " + totalPrice);
	}

    public Item contains(int id) {
        
        for (int i=0;i<size();i++) {
            if(((Item)get(i)).getItemId()==id)
                return ((Item)get(i));
        }
        return null;
    }

}
