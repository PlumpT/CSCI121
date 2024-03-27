public class Patient {

    // creates variables
    private int id;
    byte age;
    BloodData bloodData;

    // default constructor
    Patient() {
        this.id = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }

    // overloaded constructor
    Patient(int id, byte age, BloodData bloodData) {
        this.id = id;
        this.age = age;
        this.bloodData = bloodData;
    }

    // getter methods
    public int getId() {return id;}
    public byte getAge() {return age;}
    public BloodData getBloodData() {return bloodData;}

    // creates toString methods so it can be displayed as a string
    @Override
    public String toString() {
        return "ID number: " + id + "\nAge: " + age + "\nBlood Data: " + bloodData;
    }
}
