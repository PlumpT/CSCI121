import java.util.Scanner;

public class TestBloodData {

    public static void main(String[] args){
        // creates variables
        String bloodTypeInput;
        String rhInput;

        // creates default BloodData object
        BloodData defaultBloodData = new BloodData();

        // creates scanner object and reads user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter blood type (O, A, B, AB): ");
        bloodTypeInput = sc.nextLine().toUpperCase();
        System.out.println("Enter rh factor (+ or -): ");
        rhInput = sc.nextLine();

        // creates BloodData object with overloaded constructor
        BloodData overLoadBloodData = new BloodData(bloodTypeInput, rhInput);

        // displays information
        System.out.println("Default object:\n" + defaultBloodData);
        System.out.println("OverLoad object:\n" + overLoadBloodData);

        // changes defaultBloodData object
        defaultBloodData.setBloodType(bloodTypeInput);
        defaultBloodData.setRhFactor(rhInput);

        // displays the new information
        System.out.println("After Changes\n" + defaultBloodData);
    }

}
