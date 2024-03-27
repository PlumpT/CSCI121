import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestPatient {

    public static void main(String[] args) {
        // creates an object of the Patient class
        Patient patient1 = new Patient();

        // creates scanner object
        Scanner sc = new Scanner(System.in);

        // variables to store user input
        String bloodTypeInput;
        String rhFactorInput;

        // Input for Patient Two
        System.out.println("Patient Two\nEnter ID number: ");
        int idInput = sc.nextInt();
        System.out.println("Enter age: ");
        byte ageInput = sc.nextByte();
        sc.nextLine();
        System.out.println("Enter Blood Type (O, A, B, AB): ");
        bloodTypeInput = sc.nextLine().toUpperCase();
        System.out.println("\nEnter Rh Factor (+ or -): ");
        rhFactorInput = sc.nextLine();

        // creates BloodData object for Patient Two
        BloodData pTwoBloodData = new BloodData(bloodTypeInput, rhFactorInput);
        // creates Patient Two object
        Patient patient2 = new Patient(idInput, ageInput, pTwoBloodData);

        // Input for Patient Three
        System.out.println("Patient Three\nEnter ID number: ");
        idInput = sc.nextInt();
        System.out.println("Enter age: ");
        ageInput = sc.nextByte();
        sc.nextLine();
        System.out.println("Enter Blood Type (O, A, B, AB): ");
        bloodTypeInput = sc.nextLine();
        System.out.println("Enter Rh Factor (+ or -): ");
        rhFactorInput = sc.next();

        // creates BloodData object for Patient Three
        BloodData pThreeBloodData = new BloodData();
        // creates Patient Three object
        Patient patient3 = new Patient(idInput, ageInput, pThreeBloodData);

        // Displays information
        String patient1Info = "Patient 1\n" + patient1;
        String patient2Info = "Patient 2\n" + patient2;
        String patient3Info = "Patient 3\n" + patient3;

        // Displays information in a message box
        JOptionPane.showMessageDialog(null, patient1Info + "\n\n" + patient2Info + "\n\n" + patient3Info);
    }



}
