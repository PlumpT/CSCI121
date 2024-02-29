public class Couple {

    // creates attributes for couple class
    private Person bride;
    private Person groom;

    // creates couple constructor that takes two arguments
    public Couple(Person bride, Person groom){
        this.bride = bride;
        this.groom = groom;
    }

    // creates a get method for bride and groom
    public Person getBride(){
        return bride;
    }

    public Person getGroom(){
        return groom;
    }
}
