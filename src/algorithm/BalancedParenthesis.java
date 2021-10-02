package algorithm;
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

    public static void main(String str) {
        Stack<Character> stack= new Stack<>();
        // First, we need to traverse an input string and pick each character at a time.

        for(int i=0; i<str.length(); i++){
            // If the current character is starting bracket ‘{‘, ‘(‘, ‘[‘ then push it in a stack.
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
                stack.push(str.charAt(i));
            //If the current character is a closing bracket ‘}’, ‘)’, ‘]’
                // and the top of the stack is a starting bracket then pop from the stack.

            } else if(!stack.empty() && (
                            (str.charAt(i) == ']' && stack.peek() == '[') ||
                            (str.charAt(i) == '}' && stack.peek() == '{') ||
                            (str.charAt(i) == ')' && stack.peek() == '(')
            )){
                    stack.pop();
            } else{
                stack.push(str.charAt(i));
            }
        }
    // if the stack is empty then it is balanced parentheses otherwise it is not balanced.
        System.out.println(stack.isEmpty());
    }
}
