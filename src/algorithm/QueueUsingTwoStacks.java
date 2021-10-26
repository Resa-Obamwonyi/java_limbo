package algorithm;
import java.util.Stack;

public class QueueUsingTwoStacks {
    private static Stack<Integer> stack1 = new Stack<>(); // Enqueue operations will be done in stack1
    private static Stack<Integer> stack2 = new Stack<>(); // Dequeue operations will be done in stack2


    public static void main (String[] args){
        QueueUsingTwoStacks newQueue = new QueueUsingTwoStacks();
        newQueue.enqueue(13);
        newQueue.enqueue(7);
        newQueue.enqueue(12);
        newQueue.enqueue(19);
        newQueue.dequeue();
        newQueue.enqueue(18);
        newQueue.dequeue();
        System.out.println(newQueue);
    }

    public void enqueue(int val){
        stack1.push(val);
    }

    public void dequeue(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                System.out.print("All stacks are currently empty, please enqueue to a queue.stack");
            }
            else{
                while (! stack1.isEmpty()){ // While queue.stack one isn't empty, pop out of it and push to stack2 so it can then be dequeued.
                    stack2.push(stack1.pop());
                }
            }
        }
        System.out.println(stack2.pop());
    }

}
