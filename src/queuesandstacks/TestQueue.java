package queuesandstacks;

public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        queue.queue(5); // indices: 0,1,2,3,4

        System.out.println(queue.isEmpty()); // returns true
        queue.enqueue(12); //[12]
        queue.enqueue(5);  //[12,5]
        System.out.println(queue.isEmpty()); // returns false
        System.out.println(queue.dequeue()); // returns 12, queue = [-1, 5]
        queue.enqueue(11); // [-1,5,11]
        queue.enqueue(4); // [-1,5,11,4]
        queue.enqueue(31); // [-1,5,11,4,31]
        System.out.println("CurrentHeadIndex: "+queue.indexHead +", CurrentTailIndex: "+queue.indexTail); // 1, 4
        queue.enqueue(1); // [1,5,11,4,31]
        System.out.println("QueueSize: "+ queue.size()); // 5
        System.out.println("CurrentHeadIndex: "+queue.indexHead +", CurrentTailIndex: "+queue.indexTail); // 1, 0
        System.out.println(queue.dequeue()); // returns 5, queue = [1, -1, 11, 4, 31]
        System.out.println(queue.dequeue()); // returns 11, queue = [1, -1, -1, 4, 31]
        System.out.println(queue.dequeue()); // returns 4, queue = [1, -1, -1, -1, 31]
        System.out.println("CurrentHeadIndex: "+queue.indexHead +", CurrentTailIndex: "+queue.indexTail); // 4, 0
        queue.enqueue(46); // [1, 46, -1, -1, 31]
        System.out.println("CurrentHeadIndex: "+queue.indexHead +", CurrentTailIndex: "+queue.indexTail); // 4, 1
        queue.enqueue(88); // [1, 46, 88, -1, 31]
        System.out.println("CurrentHeadIndex: "+queue.indexHead +", CurrentTailIndex: "+queue.indexTail); // 4, 2
        System.out.println("QueueSize: "+ queue.size()); // 4

        // FIXED THE BUG HERE, IT WAS AN EDGE CASE
        System.out.println(queue.dequeue()); // returns 31, queue = [1, 46, 88, -1, -1]
        System.out.println("CurrentHeadIndex: "+queue.indexHead +", CurrentTailIndex: "+queue.indexTail); // 0, 2
        System.out.println(queue.dequeue()); // returns 1, queue = [-1, 46, 88, -1, -1]
        System.out.println("CurrentHeadIndex: "+queue.indexHead +", CurrentTailIndex: "+queue.indexTail); // 1, 2
        System.out.println(queue.dequeue()); // returns 46, queue = [-1, -1, 88, -1, -1]
        System.out.println(queue.dequeue()); // returns 88, queue = [-1, -1, -1, -1, -1]
        System.out.println("QueueSize: "+ queue.size()); // 0
        System.out.println(queue.isEmpty()); // returns true
    }
    }
