package queuesandstacks;

public class LinkedListStack {

    /**
     * This is a class that implements a Stack(LIFO) using a linked list
     * The peek, pop and push arguments are represented.
     * @param args
     */

    // create variable of linked list type
    LinkedList stackList;

    // initialize a new stack by setting it to an empty linked list
    public void stack(){
         this.stackList = new LinkedList();
    }

   // size of the stack is equal to length of the linked list which will be continuously updated.
    public int size(){
        return this.stackList.length;
    }

    // return as empty if head of the linked list points to null.
    public boolean isEmpty(){
        return this.stackList.head == null;
    }

    // to peek: simply return the data of the node item at the head of the stack
    public int peek () {
        if(isEmpty()){
            return -1;
        }
        else{
            return this.stackList.head.data;
        }
    }

    // to push, if stack is empty, set value and next respectively,
    // else:,
    public void push(int val) {
        if(isEmpty()){
            stackList.head = new Node();
            stackList.head.data = val;
            stackList.head.next = null;
            stackList.length +=1;
        }else {
            Node currentHead = stackList.head;
            Node newHead = new Node();
            stackList.head = newHead;
            newHead.data = val;
            newHead.next = currentHead;
        }
    }

    // to pop, return -1 if empty, else return data at current head,
    // and set current head.next to new head then redirect current head.next pointer to null:
    public Integer pop () {
        if(isEmpty()){
            return -1;
        }else {
            Node currentHead = stackList.head;
            Node nextHead = currentHead.next;
            int poppedData = currentHead.data;
            currentHead.next = null;
            stackList.head = nextHead;
            return poppedData;
        }
    }

}
