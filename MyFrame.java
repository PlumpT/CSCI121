import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JTextField numGuestsText;
    JTextField numDGText;
    JButton ok;
    JRadioButton Chicken;
    JRadioButton Vegi;

    MyFrame() {

        Color coral = new Color(255, 140, 140);
        Color pear = new Color(209, 221, 147);
        Color violet = new Color(194, 213, 244);
        Color teal = new Color(189, 238, 237);

        //setting frame color
        getContentPane().setBackground(teal);

        //setting title
        JLabel title = new JLabel("T&R Dinner Planner");
        title.setForeground(coral);
        title.setFont(new Font("Ariel", Font.BOLD, 18));
        title.setBounds(150, 10, 200, 30);

        //setting party label
        JLabel party = new JLabel("Party");
        party.setForeground(coral);
        party.setFont(new Font("Ariel", Font.BOLD, 16));
        party.setBounds(50, 50, 80, 30);

        //setting number of guests label
        JLabel numGuests = new JLabel("Number Guests:");
        numGuests.setForeground(coral);
        numGuests.setFont(new Font("Ariel", Font.BOLD, 14));
        numGuests.setBounds(20, 60, 150, 50);

        numGuestsText = new JTextField();
        numGuestsText.setBounds(150, 75, 50, 25);
        numGuestsText.setBackground(pear);
        numGuestsText.setFont(new Font("Comic Sans", Font.BOLD, 15));

        //setting ok button
        ok = new JButton("OK");
        ok.setBounds(190, 320, 75, 50);
        ok.setBackground(pear);
        ok.addActionListener(this);

        //setting dinner party label
        JLabel dinnerParty = new JLabel("Dinner Party");
        dinnerParty.setBounds(50, 100, 100, 100);
        dinnerParty.setForeground(coral);
        dinnerParty.setFont(new Font("Ariel", Font.BOLD, 16));

        //setting number of guest label
        JLabel numDinnerG = new JLabel("Number Dinner Guests:");
        numDinnerG.setBounds(20, 150, 200, 50);
        numDinnerG.setForeground(coral);
        numDinnerG.setFont(new Font("Ariel", Font.BOLD, 14));

        //setting text field
        numDGText = new JTextField();
        numDGText.setBounds(200, 165, 50, 25);
        numDGText.setBackground(pear);
        numDGText.setFont(new Font("Comic Sans", Font.BOLD, 15));

        //setting menu option label
        JLabel menuOption = new JLabel("Menu Option:");
        menuOption.setFont(new Font("Ariel", Font.BOLD, 16));
        menuOption.setForeground(coral);
        menuOption.setBounds(20, 200, 150, 100);

        //setting chicken and vegi radio boxes
        Chicken = new JRadioButton("Chicken");
        Chicken.setBackground(pear);
        Vegi = new JRadioButton("Vegi");
        Vegi.setBackground(pear);

        ButtonGroup group = new ButtonGroup();
        group.add(Chicken);
        group.add(Vegi);

        JPanel menuOptionsPanel = new JPanel();
        menuOptionsPanel.setBackground(teal);
        menuOptionsPanel.setBounds(150, 233, 135, 50);
        menuOptionsPanel.add(Chicken);
        menuOptionsPanel.add(Vegi);

        //formatting frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setTitle("T&R Dinner Planner");
        this.setResizable(false);

        //adding all the components to the frame
        this.add(menuOptionsPanel);
        this.add(menuOption);
        this.add(numDGText);
        this.add(numDinnerG);
        this.add(dinnerParty);
        this.add(numGuestsText);
        this.add(numGuests);
        this.add(title);
        this.add(party);
        this.add(ok);

        this.setVisible(true);
    }

    private void invitations(){
        //declaring variables that hold inputed text from GUI
        int partyGuestsNum = Integer.parseInt(numGuestsText.getText());
        int dinnerGuestsNum = Integer.parseInt(numDGText.getText());
        int menuOption = Chicken.isSelected() ? 1 : 2; //if chicken is selected sets it to 1 if not sets it to 2

        //creating new Party
        Party myParty = new Party();
        myParty.setNumGuests(partyGuestsNum);

        //creating new DinnerParty
        DinnerParty myDinnerParty = new DinnerParty();
        myDinnerParty.setNumGuests(dinnerGuestsNum);
        myDinnerParty.setChoices(menuOption);

        //creative piece, learned how to use StringBuilder for party invitation GUI
        StringBuilder inviteMessage = new StringBuilder();
        inviteMessage.append("Party Invitation:\n\n");
        inviteMessage.append("Number of guests for the party: ").append(myParty.getNumGuests()).append("\n");
        inviteMessage.append("Please come to my party!!\n\n");
        inviteMessage.append("Dinner Party Invitation: \n\n");
        inviteMessage.append("Number of guests for the dinner party: ").append(myDinnerParty.getNumGuests()).append("\n");
        inviteMessage.append("Menu option ").append(menuOption == 1 ? "Chicken" : "Vegi").append(" will be served\n");
        inviteMessage.append("Please come to my party!");

        JOptionPane.showMessageDialog(this, inviteMessage.toString());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== ok) {
            invitations();
        }
    }
}
