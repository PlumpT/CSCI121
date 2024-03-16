public class Pizza {

    // creates the data fields for the Pizza class
    private String[] toppings;
    private double price;

    // creates constructor called Pizza that takes two parameters
    public Pizza(String[] toppings, int numToppings){
        // checks if number of toppings exceeds limit
        if (numToppings > 10){
            System.out.println("The limit of toppings is 10");
        }

        // copy toppings to toppings array
        this.toppings = new String[numToppings];
        System.arraycopy(toppings, 0, this.toppings, 0, numToppings);

        // calculates the price of the pizza
        this.price = 14 + (2 * numToppings);

    }

    // returns the price of the pizza
    public double getPrice() {
        return price;
    }

    // returns a string representation of the Pizza object, including toppings and price
    public String toString() {
        StringBuilder description = new StringBuilder("Pizza with toppings: ");
        for (int i = 0; i < toppings.length; i++) {
            description.append(toppings[i]);
            if (i < toppings.length - 1) {
                description.append(", ");
            }
        }
        description.append("\nPrice: $").append(price);
        return description.toString();
    }

}
