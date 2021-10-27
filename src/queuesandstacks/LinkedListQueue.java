package queuesandstacks;

public class LinkedListQueue {
    /**
     * This class implements a Queue (FIFO) using a linked list
     */

    public static void main(String args[]){
        LinkedList queueList = new LinkedList();
        enqueue(queueList, 8);
        enqueue(queueList, 22);
        System.out.println(isEmpty(queueList));
        enqueue(queueList, 3);
        enqueue(queueList, 76);
        enqueue(queueList, 1);
        enqueue(queueList, 9);
        transverse(queueList);
        System.out.println("------------------");
        dequeue(queueList);
        System.out.println("------------------");
        transverse(queueList);
        System.out.println("------------------");
        dequeue(queueList);
        System.out.println("------------------");
        transverse(queueList);
    }

    public static boolean isEmpty(LinkedList queue) {
        return queue.head == null;
    }

    public static void enqueue(LinkedList queue, int value){
       Node new_node = new Node();

       if(isEmpty(queue)){
           queue.head = new_node;
           queue.head.data = value;
           queue.head.next = null;
       }else{
           int num = 1;
           Node current_head = new Node();
           current_head = queue.head;

           while(num < queue.length){
               current_head = current_head.next;
               num++;
           }
           new_node.data = value;
           new_node.next = null;
           current_head.next = new_node;
       }
       queue.length++;
    }

    public static void dequeue(LinkedList queue){
        if(isEmpty(queue)){
            System.out.println("Queue is empty");
        }
        else{
            Node prev_head = new Node();
            prev_head = queue.head;
            queue.head = prev_head.next;
            prev_head.next = null;
            queue.length--;
            System.out.println("Dequeued: " + prev_head.data);
        }
    }

    public static void transverse(LinkedList queue){
        int num = 1;
        Node current_head = new Node();
        current_head = queue.head;
        while(num <= queue.length && current_head != null){
            System.out.println(current_head.data);
            current_head = current_head.next;
            num++;
        }
    }
}
