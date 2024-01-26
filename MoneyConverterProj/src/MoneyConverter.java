import java.util.Scanner;
public class MoneyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an amount");
        Float fl1 = sc.nextFloat();
        int num1 = (int) (fl1 * 100);
        int quarters = num1 / 25;
        int num2 = num1 % 25;
        int dimes = num2 / 10;
        int num3 = num2 % 10;
        int nickels = num3 / 5;
        int num4 = num3 % 5;
        int pennies = num4 / 1;

        System.out.println("USD");
        System.out.println("Quarters:" + quarters);
        System.out.println("Dimes:" + dimes);
        System.out.println("Nickels:" + nickels);
        System.out.println("Pennies:" + pennies);

        int fiftyc = num1 / 50;
        int rem1 = num1 % 50;
        int twentyc = rem1 / 20;
        int rem2 = rem1 % 20;
        int tenc = rem2 / 10;
        int rem3 = rem2 % 10;
        int fivec = rem3 / 5;
        int rem4 = rem3 % 5;
        int twoc = rem4 / 2;
        int rem5 = rem4 % 2;
        int onec = rem5 / 1;

        System.out.println("EUR");
        System.out.println("50 cent:" + fiftyc);
        System.out.println("20 cent:" + twentyc);
        System.out.println("10 cent:" + tenc);
        System.out.println("5 cent:" + fivec);
        System.out.println("2 cent:" + twoc);
        System.out.println("1 cent:" + onec);

    }
}
