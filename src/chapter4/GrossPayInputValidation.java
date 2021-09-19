package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String args[]){
        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid input, your hours must be between 1 and 40. Try again");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        double grossPay = hoursWorked * rate;
        System.out.println("Gross pay is: $"+grossPay);
    }
}
