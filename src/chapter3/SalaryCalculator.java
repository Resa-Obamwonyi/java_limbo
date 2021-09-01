package chapter3;

/*
Multi line comment
If statement class
All sales people get a payment of $1000 dollars a week.
Sales people who exceed 10 sales get an additional bonus of $250.
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]){

        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get what I don't know
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Quick detour for bonus owners
        if(sales > quota){
             salary = salary + bonus;
        }
        // Output
        System.out.println("The employee's salary is $"+salary);
    }
}
