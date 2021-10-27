package queuesandstacks;

public class LinkedListStack {

    /**
     * This is a class that implements a Stack(LIFO) using a linked list
     * The peek, pop and push arguments are represented.
     * @param args
     */

    public static void main(String[] args){
        LinkedList newStack = new LinkedList();
        System.out.println(isEmpty(newStack));
        peek(newStack);

        push(newStack, 8);
        push(newStack, 17);
        push(newStack, 11);
        push(newStack, 34);
        push(newStack, 67);

        pop(newStack);
        peek(newStack);
        pop(newStack);
        peek(newStack);
        pop(newStack);
        peek(newStack);
    }

    public static boolean isEmpty(LinkedList stackHead) {
        return stackHead.head == null;
    }

    public static void push(LinkedList stackList, int value){
        // instantiate a new head
        Node new_head = new Node();

        if(isEmpty(stackList)){
            new_head.data = value;
            new_head.next = null;
        }
        else {
            new_head.data = value;
            new_head.next = stackList.head;
        }

        stackList.head = new_head;
        stackList.length = stackList.length + 1;
    }

    public static void pop(LinkedList stackList){
        if(isEmpty(stackList)){
           printer(-1);
        }

        else if(stackList.length == 1){
            int popped_data = stackList.head.data;
            stackList.head = null;
            printer(popped_data);
        }

        else {
            // get data to be popped
            int popped_data = stackList.head.data;

            // set the current head.next to a variable
            Node initial_next = stackList.head.next;

            // set the next of the current next to another variable
            Node new_next = initial_next.next;

            // set the head of the stackList to the current next
            stackList.head = initial_next;

            // set the next of the new head to the new next
            stackList.head.next = new_next;

            // reduce length of stack by 1
            stackList.length = stackList.length - 1;

            // send popped data to printer
            printer(popped_data);
        }
    }

    public static void peek(LinkedList stackList) {
        if (stackList.head != null) {
            printer(stackList.head.data);
        }else {
            printer(-1);
        }
    }

    public static void printer(Integer val){
        if(val==-1){
            System.out.println("Stack is Empty");
        }else{
            System.out.println(val);
        };
    }
}
