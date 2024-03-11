public class ItemOrder {

    // creates attributes for ItemOrder class
    private Item item;
    private int quantity;

    // creates constructor for ItemOrder that initializes the attributes
    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    // get method for item
    public Item getItem() {
        return item;
    }

    // get method for quantity
    public int getQuantity() {
        return quantity;
    }

    // method for calculating price of the item order
    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }

}
