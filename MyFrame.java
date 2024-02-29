import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JTextField nameText;
    JTextField nameTwoText;
    JTextField locationText;
    JTextField dateText;
    JButton ok;


    MyFrame() {

        Color smokeyBlack = new Color(19, 18, 0);
        Color desertSand = new Color(228, 197, 175);
        Color celeste = new Color(197, 255, 253);
        Color lapis = new Color(0, 100, 148);

        //setting frame color
        getContentPane().setBackground(desertSand);

        //setting title label
        JLabel title = new JLabel("Wedding Info");
        title.setForeground(smokeyBlack);
        title.setFont(new Font("Ariel", Font.BOLD, 18));
        title.setBounds(190, 10, 200, 30);

        //setting bride label
        JLabel party = new JLabel("Bride");
        party.setForeground(smokeyBlack);
        party.setFont(new Font("Ariel", Font.BOLD, 16));
        party.setBounds(50, 45, 50, 30);

        nameText = new JTextField();
        nameText.setBounds(25, 75, 100, 25);
        nameText.setBackground(celeste);
        nameText.setFont(new Font("Comic Sans", Font.BOLD, 15));

        //setting ok button
        ok = new JButton("OK");
        ok.setBounds(190, 320, 75, 50);
        ok.setBackground(celeste);
        ok.addActionListener(this);

        //setting dinner party label
        JLabel dinnerParty = new JLabel("Groom");
        dinnerParty.setBounds(380, 45, 70, 30);
        dinnerParty.setForeground(smokeyBlack);
        dinnerParty.setFont(new Font("Ariel", Font.BOLD, 16));

        //setting text field for bride name
        nameTwoText = new JTextField();
        nameTwoText.setBounds(360, 70, 100, 25);
        nameTwoText.setBackground(celeste);
        nameTwoText.setFont(new Font("Comic Sans", Font.BOLD, 15));

        //setting menu option label
        JLabel menuOption = new JLabel("Location");
        menuOption.setFont(new Font("Ariel", Font.BOLD, 16));
        menuOption.setForeground(smokeyBlack);
        menuOption.setBounds(40, 150, 100, 30);

        //setting label for first and last name directions
        JLabel enterFandL = new JLabel("(Enter First and Last Name)");
        enterFandL.setFont(new Font("Ariel", Font.BOLD, 14));
        enterFandL.setBounds(150, 20, 200, 50);

        //setting text field for groom name
        locationText = new JTextField();
        locationText.setBounds(28, 180, 100, 25);
        locationText.setBackground(celeste);
        locationText.setFont(new Font("Comic Sans", Font.BOLD, 15));

        //label for date field
        JLabel date = new JLabel("Date");
        date.setFont(new Font("Ariel", Font.BOLD, 16));
        date.setBounds(55, 220, 50, 30);

        //setting date field
        dateText = new JTextField("mm/dd/year");
        dateText.setBounds(30, 250, 100, 25);
        dateText.setBackground(celeste);
        dateText.setFont(new Font("Comic Sans", Font.BOLD, 15));

        //formatting frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setTitle("Wedding Info");
        this.setResizable(false);

        //adding all the components to the frame
        //this.add(menuOptionsPanel);
        this.add(menuOption);
        this.add(nameText);
        //this.add(numDinnerG);
        this.add(dinnerParty);
        this.add(nameTwoText);
        //this.add(numGuests);
        this.add(title);
        this.add(party);
        this.add(ok);
        this.add(enterFandL);
        this.add(locationText);
        this.add(date);
        this.add(dateText);

        this.setVisible(true);
    }

    private void invitations(){
        //retrieving info inputted from fields
        String brideFirstName = nameText.getText();
        String brideLastName = " ";
        String groomFirstName = nameTwoText.getText();
        String groomLastName = " ";
        String location = locationText.getText();
        String date = dateText.getText();

        //creating new People
        Person bride = new Person(brideFirstName, brideLastName);
        Person groom = new Person(groomFirstName, groomLastName);

        //creating new Couple
        Couple couple = new Couple(bride, groom);

        //creating a new Wedding
        Wedding wedding = new Wedding(couple, date, location);

        //creative piece, learned how to use StringBuilder for party invitation GUI
        StringBuilder Message = new StringBuilder();
        Message.append("Wedding Information:\n\n");
        Message.append("Bride and Groom: ").append(brideFirstName).append(" ").append(brideLastName).append("and ").append(groomFirstName).append(" ").append(groomLastName).append("\n");
        Message.append("Date: ").append(date).append("\n");
        Message.append("Location: ").append(location).append("\n");


        JOptionPane.showMessageDialog(this, Message.toString());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== ok) {
            invitations();
        }
    }
}
