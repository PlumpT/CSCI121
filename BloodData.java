public class BloodData {

    // enum class that represents blood types
    enum BloodType {
        O, A, B, AB
    }

    // String fields
    String bloodType;
    String rhFactor;

    // default constructor
    BloodData() {
        this.bloodType = String.valueOf(BloodType.O);
        this.rhFactor = "+";
    }

    // overloaded constructor
    BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    // getter and setter methods for both fields
    public String getBloodType() {return bloodType;}
    public void setBloodType(String bloodType) {this.bloodType = bloodType;}
    public String getRhFactor() {return rhFactor;}
    public void setRhFactor(String rhFactor) {this.rhFactor = rhFactor;}

    // creates toString method so it can be displayed as a string
    @Override
    public String toString() {
        return "Blood Type: " + bloodType + " " + "Rh Factor: " + rhFactor;
    }
}
