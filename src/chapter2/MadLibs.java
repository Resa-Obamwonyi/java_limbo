package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){
        // Enter an adjective
        System.out.println("Enter an adjective:");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();

        // Enter a season
        System.out.println("Enter a season:");
        String season = scanner.next();

        // Enter a number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("On a " +adjective+" "+season+ " day, I drink a minimum of "+number+ " cups of coffee.");
    }
}
