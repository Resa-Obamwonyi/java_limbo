package algorithm;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.*;

public class BalancedParenthesis {
//    Write a java code to check balanced parentheses in an expression using stack.
//    Given an expression containing characters ‘{‘,’}’,'(‘,’)’,'[‘,’]’. We have to write a code to check whether an input string has valid parentheses.

    public static void main(String[] args) {
        System.out.println("Enter a pattern of Parenthesis: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        Stack<Character> stack3 = new Stack<>();

        if (str.matches("A-Za-z")){
            System.out.println(false);
            return;
        }

        if(str.trim().isEmpty()){
            System.out.println("Empty input string");
            return;
        }
        if (str.trim().length() % 2 != 0) {
            System.out.println(false);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                stack1.push(str.charAt(i));
            } else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
                stack2.push(str.charAt(i));
            }
        }

        if(stack1.isEmpty() || stack2.isEmpty()){
          System.out.println(false);
          return;
        }

        int breaker = str.length();
        int count = 0;

        while (count < breaker && (!stack1.isEmpty() && !stack2.isEmpty())) {
                if (isClosingBracket(stack1.peek(), stack2.peek())) {
                    stack1.pop();
                    stack2.pop();
                    replaceFromTempStack(stack2, stack3);
                } else {
                    var i = stack2.pop();
                    stack3.push(i);
                }
                if(stack2.isEmpty() && !stack3.isEmpty()){
                    replaceFromTempStack(stack2, stack3);
                }
                if(stack1.isEmpty() && stack2.isEmpty() && stack3.isEmpty()){
                    System.out.println(true);
                    return;
                }
                count+=1;
            }
        System.out.println(false);
        }

    static boolean isClosingBracket(char open, char close){
        // check for open
        var openings = "{[(";
        var closing = "}])";
         int i = openings.indexOf(open);
         int j = closing.indexOf(close);
        return i >= 0 && i == j;
    }

    static void replaceFromTempStack(Stack<Character> stack2, Stack<Character> stack3){
        while(!stack3.isEmpty()) {
          stack2.push(stack3.pop());
       }
    }
}
