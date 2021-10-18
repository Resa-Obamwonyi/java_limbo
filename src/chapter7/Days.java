package chapter7;

import java.util.Scanner;

public class Days {
    private static String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your figure for the day of the week: ");
        int dayValue = scanner.nextInt();
        System.out.println(getDay(dayValue));

        scanner.close();
    }

    public static String getDay(int value){
            String currentDay = days[value-1];
            return  currentDay;
    }
}
