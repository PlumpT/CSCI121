public class Item {

    // creates the attribute of the Item class
    private String name;
    private double price;

    // creates constructor for Item class that initializes the attributes
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // get method for name
    public String getName() {
        return name;
    }

    // get method for price
    public double getPrice () {
        return price;
    }


}
