package queuesandstacks;

public class LinkedListQueue {
    /**
     * This class implements a Queue (FIFO) using a linked list
     */
    LinkedList queueLList;

    public void queue(){
        this.queueLList = new LinkedList();
        this.queueLList.head = null;
    }

    public boolean isEmpty() {
        return this.queueLList.head == null;
    }

    public int size(){
        return this.queueLList.length;
    }

    public void enqueue(int value){
       Node new_node = new Node();

       if(isEmpty()){
           this.queueLList.head = new_node;
           this.queueLList.head.data = value;
           this.queueLList.head.next = null;
       }else{
           int num = 1;
           Node current_head = this.queueLList.head;

           while(num < this.queueLList.length){
               current_head = current_head.next;
               num++;
           }
           new_node.data = value;
           new_node.next = null;
           current_head.next = new_node;
       }
        this.queueLList.length ++;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            Node prev_head = this.queueLList.head;
            this.queueLList.head = prev_head.next;
            prev_head.next = null;
            this.queueLList.length--;
            System.out.println("Dequeued: " + prev_head.data);
        }
    }
}
