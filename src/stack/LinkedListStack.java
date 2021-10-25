package stack;
import java.util.LinkedList;

public class LinkedListStack {

    public static void main(String[] args){
        LinkedList<Integer> newStack = new LinkedList<Integer>();
        System.out.println(isEmpty(newStack));
        push(newStack, 8);
        push(newStack, 17);
        push(newStack, 11);
        push(newStack, 34);
        push(newStack, 2);
        System.out.println(peek(newStack));
        System.out.println(newStack);
        System.out.println(pop(newStack));
        System.out.println(newStack);
    }

    public static boolean isEmpty(LinkedList<Integer> stackList){
        return stackList.isEmpty();
    }

    public static void push(LinkedList<Integer> stackList, int value){
        stackList.addLast(value);
    }

    public static Integer pop(LinkedList<Integer> stackList){
        return stackList.removeLast();
    }

    public static Integer peek(LinkedList<Integer> stackList){
        return stackList.getLast();
    }
}
