import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JTextField iNameText;
    JTextField priceText;
    JTextField amountText;
    JButton add;
    JButton showCart;
    ShoppingCart cart;


    MyFrame() {

        // creates colors
        Color smokeyBlack = new Color(19, 18, 0);
        Color desertSand = new Color(228, 197, 175);
        Color celeste = new Color(175, 206, 228);

        //setting frame color
        getContentPane().setBackground(celeste);

        //setting title label
        JLabel title = new JLabel("Shopping Cart");
        title.setForeground(smokeyBlack);
        title.setFont(new Font("Ariel", Font.BOLD, 18));
        title.setBounds(190, 10, 200, 30);

        //setting Item Name label
        JLabel iName = new JLabel("Item Name:");
        iName.setForeground(smokeyBlack);
        iName.setFont(new Font("Ariel", Font.BOLD, 16));
        iName.setBounds(30, 45, 100, 30);

        iNameText = new JTextField();
        iNameText.setBounds(25, 75, 100, 25);
        iNameText.setBackground(desertSand);
        iNameText.setFont(new Font("Comic Sans", Font.BOLD, 15));

        //setting add button
        add = new JButton("Add to Cart");
        add.setBounds(200, 150, 100, 50);
        add.setBackground(desertSand);
        add.addActionListener(this);

        // setting show cart button
        showCart = new JButton("Show Cart");
        showCart.setBounds(200, 250, 100, 50);
        showCart.setBackground(desertSand);
        showCart.addActionListener(this);

        //setting price label
        JLabel price = new JLabel("Price");
        price.setBounds(230, 45, 70, 30);
        price.setForeground(smokeyBlack);
        price.setFont(new Font("Ariel", Font.BOLD, 16));

        //setting text field for price
        priceText = new JTextField();
        priceText.setBounds(200, 75, 100, 25);
        priceText.setBackground(desertSand);
        priceText.setFont(new Font("Comic Sans", Font.BOLD, 15));

        //setting amount label
        JLabel amount = new JLabel("Amount");
        amount.setFont(new Font("Ariel", Font.BOLD, 16));
        amount.setForeground(smokeyBlack);
        amount.setBounds(380, 45, 100, 30);

        //setting text field for Amount
        amountText = new JTextField();
        amountText.setBounds(360, 75, 100, 25);
        amountText.setBackground(desertSand);
        amountText.setFont(new Font("Comic Sans", Font.BOLD, 15));

        //formatting frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setTitle("Shopping Cart");
        this.setResizable(false);

        //adding all the components to the frame
        this.add(amount);
        this.add(iNameText);
        this.add(price);
        this.add(priceText);
        this.add(title);
        this.add(iName);
        this.add(add);
        this.add(showCart);
        this.add(amountText);

        this.setVisible(true);

        // creates a cart
        cart = new ShoppingCart();
    }

    private void addToCart() {

        String itemName = iNameText.getText();
        double price = Double.parseDouble(priceText.getText());
        int quantity = Integer.parseInt(amountText.getText());

        // creates an Item
        Item item = new Item(itemName, price);

        // creates an ItemOrder
        ItemOrder itemOrder = new ItemOrder(item, quantity);

        // add an ItemOrder to the cart
        cart.add(itemOrder);

    }

    private void showCart() {
        // Display total price
        JOptionPane.showMessageDialog(this,"Item added to cart. \nTotal Price of Cart: $" + cart.calculateTotalPrice());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // when clicked adds ItemOrder to cart and resets text fields
       if (e.getSource()== add) {
           addToCart();
           iNameText.setText("");
           priceText.setText("");
           amountText.setText("");
        }
       // when clicked shows price of cart
       if (e.getSource()== showCart) {
           showCart();
       }
    }
}

