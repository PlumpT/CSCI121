import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // creates scanner object
        Scanner sc = new Scanner(System.in);

        // creates integer variable called arraySize
        int arraySize;

        // prompts user to choose the size of the array up to 20
        System.out.println("Enter the size of the array (up to 20)");

        // assigns input to variable arraySize
        arraySize = sc.nextInt();

        // creates a list of doubles that hold up to 20 items
        double[] list = new double[arraySize];

        // creates integer variable called i
        int i;

        // a loop that asks user for input and assigns it to the list
        for(i = 0; i < list.length; i++) {
            System.out.println("Enter a number to add to the list: position " + (i + 1));
            list[i] = sc.nextDouble();
        }

        // prints every item in the list
        for(i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

}
