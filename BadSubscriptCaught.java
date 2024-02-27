import java.util.Scanner;

public class BadSubscriptCaught {

    public static void main(String[] args) {
        // creates scanner object
        Scanner sc = new Scanner(System.in);

        // creates a list of doubles that hold up to 20 items
        String[] list = new String[3];

        // creates integer variable called i
        int i;

        // a loop that asks user for input and assigns it to the list
        for(i = 0; i < list.length; i++) {
            System.out.println("Enter a first name to add to the list");
            list[i] = sc.nextLine();
        }

        // prints every item in the list
        for(i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        // creates boolean variable to true
        boolean a = true;

        // creates an exception
        do {
            try {
                System.out.println("Enter a number");
                i = sc.nextInt();
                System.out.println(list[i]);
                a = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please Enter a Number 0-2");
            }
        }while (a);
    }

}
