package chapter5;

import java.util.Scanner;

public class phoneBillCalculator {

    static double overageChargePerMinute = 0.25;
    static double taxRate = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]){
        double planRate = getPlanFee();
        int overageMinutes = getOverageMinutes();
        scanner.close();
        double subTotal = calculateSubTotal(planRate, overageChargePerMinute, overageMinutes);
        double tax = calculateTax(taxRate, subTotal);
        double grandTotal = calculateGrandTotal(subTotal, tax);

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $"+ planRate);
        System.out.println("Overage: $"+ (overageMinutes * overageChargePerMinute));
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $"+grandTotal);
    }

    public static double getPlanFee(){
        System.out.println("Enter your plan fee: ");
        return scanner.nextDouble();
    }

    public static int getOverageMinutes(){
        System.out.println("Enter Overage Minutes: ");
        return scanner.nextInt();
    }

    public static double calculateSubTotal(double planRate, double overageChargePerMinute, int overageMinutes){
        double subtotal = Math.round(planRate + (overageMinutes * overageChargePerMinute));
        return subtotal;
    }

    public static double calculateTax(double taxRate, double subTotal){
        double tax = taxRate * subTotal;
        return tax;
    }

    public static double calculateGrandTotal(double subTotal, double tax){
        return subTotal + tax;
    }
}
