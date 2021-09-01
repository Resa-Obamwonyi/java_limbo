package chapter3;

/*
If else
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){
        int quota = 10;

        System.out.println("Enter the number of sales you made this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota){
            System.out.println("Congratulations!! You met your quota.");
        }
        else{
            int saleShort = quota-sales;
            System.out.println("You did not meet your quota. You were "+saleShort+ " sales short.");
        }
    }
}
