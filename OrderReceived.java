import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class OrderReceived {

    // creates GUI components
    JFrame frame = new JFrame();

    JLabel label = new JLabel();


    // creates OrderReceived constructor
    OrderReceived() {

        DecimalFormat df = new DecimalFormat("#.00");

        // sets text of label to be the total price
        label.setText("$" + (df.format(Main.getFrame().getTotal())));

        // formats the label
        label.setBounds(110, 40, 100, 100);
        label.setFont(new Font(null, Font.PLAIN, 25));

        // formats frame
        frame.setTitle("Total");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

        // adds label to frame
        frame.add(label);

    }

}
