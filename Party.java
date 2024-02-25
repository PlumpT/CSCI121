public class Party {

    // creates an int variable that represents how many guests at a party
    private int numGuests;

    // creates a get method for numGuests allowing access to it
    public int getNumGuests() {
        return numGuests;
    }
    // creates a set method for numGuests making it possible to alter it
    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    // creates a method that displays some text
    public void displayInvitation() {
        System.out.println("Please come to my party!");
    }

}
