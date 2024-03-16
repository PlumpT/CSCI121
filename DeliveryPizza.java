public class DeliveryPizza extends Pizza{

    // creates data fields for DeliveryPizza class
    private double deliveryFee;
    private String deliveryAddress;

    // creates a DeliveryPizza constructor
    // holds three parameters
    public DeliveryPizza(String[] toppings, String deliveryAddress, int numToppings) {
        super(toppings, numToppings);

        this.deliveryAddress = deliveryAddress;

        // calculates delivery fee
        if (getPrice() > 18) {
            this.deliveryFee = 3;
        } else {
            this.deliveryFee = 5;
        }

    }

    // returns a string representation of the DeliveryPizza object
    // including toppings, price, delivery fee, and delivery address
    public String toString() {
        return super.toString() + "\nDelivery Fee: $" + deliveryFee + "\nDelivery Address: " + deliveryAddress;
    }
}
