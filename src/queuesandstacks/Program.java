package queuesandstacks;

public class Program {
    public static void main(String[] args){
        LinkedListStack stack = new LinkedListStack();
        stack.stack();

        stack.push(2); //4
        stack.push(15); //3
        stack.push(13); //2
        stack.push(8); //1
        stack.push(16); //0
//        stack.push(13); //-1

        System.out.println("current head is: " + stack.stackList.head.data);
//
        System.out.println("popped: "+ stack.pop());
        System.out.println("popped: "+ stack.pop());
        System.out.println("popped: "+ stack.pop());
        System.out.println("popped: "+ stack.pop());
        System.out.println("popped: "+ stack.pop());

        System.out.println("peeked now: " + stack.peek());

        stack.push(12); //0
        System.out.println("current head is: " + stack.stackList.head.data);
        System.out.println("peeked: " + stack.peek());

        stack.push(11); //0
        System.out.println("current head is: " + stack.stackList.head.data);
        System.out.println("peeked: " + stack.peek());

    }
}
