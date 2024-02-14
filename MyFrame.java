import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    // creates GUI components
    JButton order;
    JComboBox pizzas;
    JRadioButton small;
    JRadioButton med;
    JRadioButton Lrg;
    JRadioButton Super;
    JCheckBox Pepper;
    JCheckBox Pepperoni;
    JCheckBox Meatball;
    double total;

    // creates MyFrame constructor
    MyFrame() {

        // formats order button
        order = new JButton();
        order.setBounds(300, 400, 100, 50);
        order.setText("Order");
        order.addActionListener(this);

        // formats pizza ComboBox
        String[] pizzaTypes = {"Cheese", "Veggie", "Pepperoni", "Meatball", "Margherita", "BBQ Chicken", "Hawaiian", "Buffalo"};
        pizzas = new JComboBox(pizzaTypes);
        pizzas.addActionListener(this);
        pizzas.setBounds(80, 200, 100, 25);

        // formats size buttons
        small = new JRadioButton("Small $5");
        small.addActionListener(this);
        med = new JRadioButton("Medium $10");
        med.addActionListener(this);
        Lrg = new JRadioButton("Large $15");
        Lrg.addActionListener(this);
        Super = new JRadioButton("Super $20");
        Super.addActionListener(this);

        // creates ButtonGroup and adds size buttons to it
        ButtonGroup group = new ButtonGroup();
        group.add(small);
        group.add(med);
        group.add(Lrg);
        group.add(Super);

        // creates a panel that contains the size buttons
        JPanel radioPanel = new JPanel();
        radioPanel.setBounds(300, 200, 100, 130);
        radioPanel.add(small);
        radioPanel.add(med);
        radioPanel.add(Lrg);
        radioPanel.add(Super);

        // formats CheckBox items
        Pepper = new JCheckBox("Pepper");
        Pepper.addActionListener(this);
        Pepperoni = new JCheckBox("Pepperoni");
        Pepperoni.addActionListener(this);
        Meatball = new JCheckBox("Meatball");
        Meatball.addActionListener(this);
        JCheckBox extraCheese = new JCheckBox("Extra Cheese");

        // creates a panel and adds CheckBox items
        JPanel toppingsPanel = new JPanel();
        toppingsPanel.setBounds(500, 200, 100, 200);
        toppingsPanel.add(Pepper);
        toppingsPanel.add(Pepperoni);
        toppingsPanel.add(Meatball);
        toppingsPanel.add(extraCheese);

        // creates a label called Toppings
        JLabel tLabel = new JLabel("Toppings");
        tLabel.setBounds(512, 130, 100, 100);
        tLabel.setFont(new Font("Comic Sans", Font.BOLD, 15));

        // creates a label called Sizes
        JLabel sLabel = new JLabel("Sizes");
        sLabel.setBounds(327, 130, 100, 100);
        sLabel.setFont(new Font("Comic Sans", Font.BOLD, 15));

        // creates a label called Type
        JLabel typeLabel = new JLabel("Type");
        typeLabel.setBounds(110, 135, 100, 100);
        typeLabel.setFont(new Font("Comic Sans", Font.BOLD, 15));

        // formats the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(700, 500);
        //this.setResizable(false);
        this.setTitle("Pizza Town Order");
        this.getContentPane().setBackground(new Color(255, 213, 128));
        this.setVisible(true);

        // adds components to the frame
        this.add(order);
        this.add(pizzas);
        this.add(radioPanel);
        this.add(toppingsPanel);
        this.add(tLabel);
        this.add(sLabel);
        this.add(typeLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // initializes variables called basePrice, priceAddOns, and total
        double basePrice = 0;
        double priceAddOns = 0;
        total = 0;

        // if one size is clicked then sets a certain amount to variable basePrice
        if(small.isSelected()) {
            basePrice = 5;
        } else if (med.isSelected()) {
            basePrice = 10;
        } else if (Lrg.isSelected()) {
            basePrice = 15;
        } else if (Super.isSelected()) {
            basePrice = 20;
        }

        // if one topping is clicked then adds 1 to variable priceAddOns
        if (Pepper.isSelected()) {
            priceAddOns++;
        }
        if (Pepperoni.isSelected()) {
            priceAddOns++;
        }
        if (Meatball.isSelected()) {
            priceAddOns++;
        }

        // if priceAddOns is the same as 1, 2, or 3 then it sets a certain amount to priceAddOns
        if (priceAddOns == 1) {
            priceAddOns = .50;
        } else if (priceAddOns == 2) {
            priceAddOns = 1;
        } else if (priceAddOns == 3) {
            priceAddOns = 1.25;
        }

        // calculates the total price
        total = basePrice + priceAddOns;

        // if order button is clicked then MyFrame closes and opens up OrderReceived frame
        if(e.getSource()==order) {
            this.dispose();
            OrderReceived myOrder = new OrderReceived();
        }

    }
    // creates getTotal method
    double getTotal() {
        return total;
    }
}
