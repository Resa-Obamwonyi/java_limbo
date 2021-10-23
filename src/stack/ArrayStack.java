package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayStack {

    /**
     * This is a class that implements a Stack using and Array
     * @param args
     */

    public static void main (String[] args){
        Integer[] newStack = new Integer[] {};
        peek(newStack);
        newStack = push(newStack, 4);
        newStack = push(newStack, 9);
        newStack = push(newStack, 11);
        newStack = push(newStack, 5);
        peek(newStack);
        System.out.println("Current Stack Length: " + newStack.length);
        newStack = pop(newStack);
        System.out.println("Current Stack Length: " + newStack.length);
        peek(newStack);
        System.out.println("Current Stack Length: " + newStack.length);
        newStack = pop(newStack);
        System.out.println("Current Stack Length: " + newStack.length);
        peek(newStack);
    }

    public static boolean isEmpty(Integer[] stackArray){
        return stackArray.length == 0;
    }

    public static void peek(Integer[] stackArray){
        if(isEmpty(stackArray)){
            printer(-1, "Peeked");
        }
        else{
            printer(stackArray[0], "Peeked");
        };
    }

    public static void printer(Integer val, String action){
        if(val==-1){
            System.out.println("Stack is Empty");
        }else{
            System.out.println(action+ " "+ val);
        };
    }

    public static Integer[] pop(Integer[] stackArray){

            // first check if stack is empty
            if(isEmpty(stackArray)){
                printer(-1, "Popped");
            }
                // get value to be popped
                int popped_value = stackArray[0];

                // convert to array list
                List<Integer> stackArrayList = new ArrayList<Integer>();
                Collections.addAll(stackArrayList, stackArray);

                // remove first item
                stackArrayList.remove(0);

                // convert back to list
                Integer[] newStackArray = new Integer[stackArrayList.size()];
                newStackArray = stackArrayList.toArray(newStackArray);

                printer(popped_value, "Popped");
                return newStackArray;

    }

    public static Integer[] push(Integer[] stackArray, Integer newValue){
        // convert to array List
        List<Integer> stackArrayList = new ArrayList<Integer>();
        Collections.addAll(stackArrayList, stackArray);

        //Add new item
        stackArrayList.add(0, newValue);

        Integer[] newStackArray;
        newStackArray = stackArrayList.toArray(stackArray);
        return newStackArray;
    }

}
