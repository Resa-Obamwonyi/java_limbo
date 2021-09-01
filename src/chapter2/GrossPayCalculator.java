package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        // Algorithm to calculate gross pay
        // Get number of hours employee works
        System.out.println("Enter the number of hours employee worked: ");

        // to read from the input
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get hourly pay rate
        System.out.println("Enter the employee's pay rate per hour: ");
        double rate = scanner.nextDouble();
        scanner.close();

        // Multiply hours worked by hourly pay rate
        double grossPay = hours * rate;

        // Display result
        System.out.println("The employee's gross pay is " + grossPay);
    }
}
