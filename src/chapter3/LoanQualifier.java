package chapter3;

/*
Nested If statements
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String args[]){
        int requiredSalary = 30000;
        int requiredYears = 2;

        System.out.println("Enter your annual salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer: ");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary){
            if(years >= requiredYears){
                System.out.println("Congrats!! You qualify for a Loan.");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job for at least "
                        +years+ " years");
            }
        }
        else{
            System.out.println("Sorry, You must earn at least $" +requiredSalary);
        }
    }
}
