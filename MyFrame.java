import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox<String> choiceComboBox;
    JTextField[] toppingsFields;
    JButton order;
    JTextField addressField;
    Pizza pizza;

    MyFrame() {

        // panel for toppingsLabel
        JPanel enterPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        JLabel toppingsLabel = new JLabel("Enter toppings (max 10): ");
        enterPanel.add(toppingsLabel);

        // panel for entering toppings
        JPanel toppingsPanel = new JPanel(new GridLayout(0, 2));
        toppingsFields = new JTextField[10];
        Font font = new Font("Arial", Font.BOLD, 14);
        for (int i = 0; i < 10; i++) {
            toppingsFields[i] = new JTextField();
            toppingsFields[i].setBackground(new Color(171, 217, 237));
            toppingsFields[i].setFont(font);
            toppingsPanel.add(toppingsFields[i]);
        }
        toppingsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // panel for selecting delivery option
        JPanel deliveryPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel deliveryLabel = new JLabel("Delivery?");
        deliveryLabel.setFont(new Font("Arial", Font.BOLD, 15));
        String[] deliveryChoice = {"Yes", "No"};
        choiceComboBox = new JComboBox<>(deliveryChoice);
        deliveryPanel.add(deliveryLabel);
        deliveryPanel.add(choiceComboBox);
        deliveryPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // panel for entering delivery address
        JPanel addressPanel = new JPanel(new GridLayout(1, 2));
        JLabel addressLabel = new JLabel("Enter address: ");
        addressField = new JTextField();
        addressPanel.add(addressLabel);
        addressPanel.add(addressField);
        addressPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // panel for order button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        order = new JButton("Order");
        order.addActionListener(this);
        buttonPanel.add(order);

        // panel for delivery address and order button
        JPanel southPanel = new JPanel(new BorderLayout());
        southPanel.add(addressPanel, BorderLayout.NORTH);
        southPanel.add(buttonPanel, BorderLayout.SOUTH);

        // panel for entering toppings and toppings label
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(enterPanel, BorderLayout.NORTH);
        centerPanel.add(toppingsPanel, BorderLayout.CENTER);

        // setting up the layout of the frame
        this.setLayout(new BorderLayout());
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(deliveryPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);

        // setting frame properties
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setTitle("Pizza Order");
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // when order button is clicked
        if (e.getSource()== order) {
            // collects toppings entered by the user
            String[] toppings = new String[10];
            int numToppings = 0;
            for (int i = 0; i < 10; i++){
                if (!toppingsFields[i].getText().isEmpty()){
                    toppings[numToppings] = toppingsFields[i].getText();
                    numToppings++;
                }
            }

            // checks what choice the user selected
            String deliveryChoice = (String) choiceComboBox.getSelectedItem();
            boolean delivery = deliveryChoice.equals("Yes");
            String deliveryAddress = delivery ? addressField.getText() : "";

            // if yes creates DeliveryPizza object else creates Pizza object
            if (delivery){
                pizza = new DeliveryPizza(toppings, deliveryAddress, numToppings);
            } else {
                pizza = new Pizza(toppings, numToppings);
            }

            // shows order details
            JOptionPane.showMessageDialog(this, pizza.toString(), "Pizza Order", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
