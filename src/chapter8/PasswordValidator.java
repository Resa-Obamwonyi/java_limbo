package chapter8;

import java.util.Locale;
import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args){
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();

        System.out.println("Enter your old password: ");
        String oldPassword = scanner.next();


        System.out.println("Enter your new password: ");
        String newPassword = scanner.next();

        scanner.close();

        if(newPassword.equals(oldPassword)){
            System.out.println("New password must be different from previous password.");
        }
        else if(newPassword.contains(username)){
            System.out.println("New password must not contain your username.");
        }
        else if(newPassword.length() < 8){
            System.out.println("New password must be at least 8 characters.");
        }
        else if(newPassword.equals(newPassword.toLowerCase())){
            System.out.println("New password must contain at least one capital letter.");
        }
        else if(newPassword.matches("[a-zA-Z0-9]*")){
            System.out.println("New password must contain at least one special character.");
        }
        else{
            System.out.println("New password is valid.");
        }
    }
}
