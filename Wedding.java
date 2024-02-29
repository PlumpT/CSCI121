public class Wedding {

    // creates attributes for wedding class
    private String date;
    private Couple couple1;
    private String location;

    // creates a wedding constructor that takes two arguments
    Wedding(Couple couple1, String date, String location){
        this.couple1 = couple1;
        this.date = date;
        this.location = location;
    }

    // creates get method for each attribute
    public Couple getCouple1() {
        return couple1;
    }
    public String getDate(){
        return date;
    }
    public String getLocation(){
        return location;
    }
}
