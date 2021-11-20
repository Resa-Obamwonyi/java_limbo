package queuesandstacks;


public class ArrayQueue {
    /**
     * Implements a queue using an array
     * Methods are dequeue, enqueue, size, and isEmpty
     */
    // initialize an array as queueArray
    // initialize a queue head index
    // initialize a queue tail index

    int[] queueArray;
    int indexHead;
    int indexTail;


    public void queue(int length){
        this.queueArray = new int[length];
        this.indexHead = -1; // indicating that this queue is empty.
        this.indexTail = -1; // same as above
    }

    // queue is empty if indexHead and indexTail are both -1
    public boolean isEmpty(){
        return this.indexHead == -1 && this.indexTail == -1;
    }

    // to get the size, return the difference between the stack origin length and the index of head, or
    // if queue is empty, return 0
    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            int size = 0;
            for (int value: this.queueArray) {
                if(value != -1){
                    size++;
                }
            }
            return size;
        }
    }

    public void enqueue(int val) {
        // if array is empty, set indexHead and indexTail to 0,
        // set new value to first index (counting from 0)
        if (isEmpty() ) {
            this.indexHead = 0;
            this.indexTail = 0;
            queueArray[this.indexHead] = val;
        }
        // else if indexTail less than length of the array,
        // increment current indexTail by 1
        // set value to the new current index tail

        else if (this.indexTail < queueArray.length - 1) {
            this.indexTail = this.indexTail + 1;
            queueArray[this.indexTail ] = val;
        }
        // if the queue is not full,(i.e, there is a -1 value at the front, set the new tail to 0 and insert there
        else if((this.indexTail - this.indexHead) < queueArray.length - 1 && this.indexTail == queueArray.length -1){
            this.indexTail = 0;
            queueArray[this.indexTail ] = val;
        }
        // else throw an exception that the queue is full
        else{
            throw new ArrayIndexOutOfBoundsException("Queue is full");
        }
    }

    public Integer dequeue () {
        // get the value to be removed
        int val = queueArray[this.indexHead];

        // set removed value to -1 (this is how we dequeue)
        queueArray[this.indexHead] = -1;

        // if the current head is not the root head, i.e. we are not dequeueing the first item in the queue,
        // and the current head is not the last index, set new head to the next index after the dequeued index
        // else if we are dequeueing the one and only element in the array, set indexHead and indexTail to -1 to
        // indicate empty
        if (this.indexHead != this.indexTail && this.indexHead != this.queueArray.length - 1) {
            this.indexHead = this.indexHead + 1;
        } else if(this.indexHead == this.queueArray.length -1){
            this.indexHead = 0;
        }
        else{
            this.indexHead = -1;
            this.indexTail = -1;
        }
        return val;

    }

}
