import javax.swing.*;
import java.util.Scanner; //Needed for before GUI was done
//Ren Grunberg and Thomas Heffernan worked together on this assignment

public class UseDinnerParty {
    public static void main(String[] args) {
        //new MyFrame();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyFrame();
            }
        });

//Below was done before GUI:
//        int numGuests; // creates a variable called numGuests
//        Party party1 = new Party(); // creates a Party object
//        DinnerParty aDinnerParty = new DinnerParty();
//        Scanner sc = new Scanner(System.in); // creates a scanner object
//
//        System.out.println("Enter number of guests for the party"); // Asks user for input
//
//        numGuests = sc.nextInt(); // reads user input and sets it to numGuests variable
//
//        party1.setNumGuests(numGuests); // sets variable to party1 object
//
//        System.out.println("The party has " + party1.getNumGuests() + " guests"); // displays how many guests are coming to the party
//
//        party1.displayInvitation(); // calls method from party class
//
//        System.out.println("Enter number of guests for the dinner party");
//
//        aDinnerParty.setNumGuests(sc.nextInt());
//
//        System.out.println("Enter the menu options -- 1 for chicken and 2 for Vegi");
//
//        aDinnerParty.setChoices(sc.nextInt());
//
//        System.out.println("The dinner party has " + aDinnerParty.getNumGuests() + " guests");
//
//        System.out.println("Menu option " + aDinnerParty.getChoices() + " will be served");
//
//        aDinnerParty.displayInvitation();

    }
}
