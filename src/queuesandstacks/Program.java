package queuesandstacks;

public class Program {
    public static void main(String[] args){
        // Testing array as stack
        ArrayStack stack = new ArrayStack();
        stack.stack(5);

        stack.push(2); //4
        stack.push(15); //3
        stack.push(13); //2
        stack.push(8); //1
        stack.push(16); //0
//        stack.push(13); //-1

        System.out.println("current head is: " + stack.indexHead);
//
        System.out.println("popped: "+ stack.pop());
        System.out.println("popped: "+ stack.pop());
        System.out.println("popped: "+ stack.pop());
        System.out.println("popped: "+ stack.pop());
        System.out.println("popped: "+ stack.pop());


        System.out.println("current head is: " + stack.indexHead);
//
        System.out.println("peeked now: " + stack.peek());

        stack.push(12); //0
        System.out.println("current head is: " + stack.indexHead);
        System.out.println("peeked: " + stack.peek());

        stack.push(11); //0
        System.out.println("current head is: " + stack.indexHead);
        System.out.println("peeked: " + stack.peek());

        // testing linked list as stack
        LinkedListStack stack2 = new LinkedListStack();
        stack2.stack();

        stack2.push(2); //4
        stack2.push(15); //3
        stack2.push(13); //2
        stack2.push(8); //1
        stack2.push(16); //0
//        stack.push(13); //-1

        System.out.println("current head is: " + stack2.stackList.head.data);
//
        System.out.println("popped: "+ stack2.pop());
        System.out.println("popped: "+ stack2.pop());
        System.out.println("popped: "+ stack2.pop());
        System.out.println("popped: "+ stack2.pop());
        System.out.println("popped: "+ stack2.pop());

        System.out.println("peeked now: " + stack2.peek());

        stack2.push(12); //0
        System.out.println("current head is: " + stack2.stackList.head.data);
        System.out.println("peeked: " + stack2.peek());

        stack2.push(11); //0
        System.out.println("current head is: " + stack2.stackList.head.data);
        System.out.println("peeked: " + stack2.peek());

    }
}
