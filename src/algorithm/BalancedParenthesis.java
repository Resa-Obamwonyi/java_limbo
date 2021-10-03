package algorithm;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
//    Write a java code to check balanced parentheses in an expression using stack.
//    Given an expression containing characters ‘{‘,’}’,'(‘,’)’,'[‘,’]’. We have to write a code to check whether an input string has valid parentheses.
//    An input string is valid if:
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//            Example –
//    i) {[]}) – Invalid
//    ii) {()}[] – Valid

    public static void main(String[] args) {
//        printArray(args);
        System.out.println("Enter a pattern of Parenthesis: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        Stack<Character> stack3 = new Stack<>();

        //        if (str.find([A-Za-z])){return }

        if(str.trim().isEmpty()){
            System.out.println("Empty input string");
            return;
        }
        if (str.trim().length() % 2 != 0) {
            System.out.println(false);
            return;
        }


        // First, we need to traverse an input string and pick each character at a time.

        for (int i = 0; i < str.length(); i++) {
            // If the current character is an opening bracket then push it into stack1.
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                stack1.push(str.charAt(i));
                // else push it into stack2.
            } else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
                stack2.push(str.charAt(i));
            }
        }

        if(stack1.isEmpty() || stack2.isEmpty()){
          System.out.println(false);
          return;
        }

        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println(true);
            return;
        }

        System.out.println("stack 1 is " + stack1.size());
        System.out.println("stack 2 is " + stack2.size());
        System.out.println("stack 1 content " + stack1.toString());
        System.out.println("stack 2 "+ stack2.toString());

        // Compare peek of stack 1 against peek of stack 2, if it doesn't match, push stack 2 to stack 3 and pop it off stack 2
        int breaker = str.length();
        int count = 0;

        while (count < breaker) {
            if(!stack1.isEmpty() && !stack2.isEmpty()){
            if (isClosingBracket(stack1.peek(), stack2.peek())) {
                stack1.pop();
                stack2.pop();
                replaceFromTempStack(stack2, stack3);
            } else {
                var i = stack2.pop();
                stack3.push(i);
            }

            if(stack1.isEmpty() && stack2.isEmpty() && stack3.isEmpty()){
                System.out.println(true);
                return;
            }
                System.out.println("count is " + count);
                System.out.println("stack 1 content " + stack1.toString());
                System.out.println("stack 2 "+ stack2.toString());
                System.out.println("stack 3 content " + stack3.toString());
            }
            count+=1;
        }

        System.out.println(stack1.isEmpty() && stack2.isEmpty() && stack3.isEmpty());
        return;
//            System.out.println(true);
        }

//        else{
//            System.out.println(false);
//            return;
//        }

        // put contents of stack 3 in stack 2
//        while(!stack3.isEmpty()) {
//            stack2.push(stack3.pop());
//        }


    static boolean isClosingBracket(char open, char close){
        // check for open
        var openings = "{[(";
        var closing = "}])";
         int i = openings.indexOf(open);
         int j = closing.indexOf(close);
         if(i >= 0 && i == j){
             return true;
         }
         return false;
    }

    static void replaceFromTempStack(Stack<Character> stack2, Stack<Character> stack3){
        while(!stack3.isEmpty()) {
          stack2.push(stack3.pop());
       }
    }
}
