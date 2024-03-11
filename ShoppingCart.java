import java.util.ArrayList;

public class ShoppingCart {


    // stores ItemOrder in an ArrayList and initializes it
    ArrayList<ItemOrder> list = new ArrayList<ItemOrder>();

    // method to add ItemOrder to list
    public void add(ItemOrder itemOrder) {
        list.add(itemOrder);
    }

    // method to remove an ItemOrder from the list
    public void remove(ItemOrder itemOrder) {
        list.remove(itemOrder);
    }

    // method to search the list for an ItemOrder
    public boolean search(ItemOrder itemOrder) {
        return list.contains(itemOrder);
    }

    // calculates the total prices of the shopping cart
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (ItemOrder itemOrder : list) {
            totalPrice += itemOrder.getTotalPrice();
        }
        return totalPrice;
    }

}
