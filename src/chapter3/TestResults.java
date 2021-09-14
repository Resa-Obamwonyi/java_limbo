package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String args[]) {
        // Get test score
        System.out.println("Enter your test result: ");
        Scanner scanner = new Scanner(System.in);

        double score = scanner.nextDouble();

        // Determine letter grade
        char grade;
        if(score < 60){
            // char data types use the single quotation marks. Double quotation marks are for String
            grade = 'F';
        } else if(score < 70){
            grade = 'D';
        } else if(score < 80){
            grade = 'C';
        } else if(score < 90){
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println("Your grade is "+grade);
    }
}
