public class Person {

    // creates attributes of person class
    private String first;
    private String second;

    // creates a Person constructor that takes two arguments
    public Person(String first, String second){
        this.first = first;
        this.second = second;
    }

    // creates a get method for first and last name
    public String getFirst(){
        return first;
    }

    public String getSecond(){
        return second;
    }
}
