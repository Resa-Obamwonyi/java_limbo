package queuesandstacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayQueue {
    public static void main(String[] args){
        Integer[] newQueue = new Integer[] {};
        dequeue(newQueue);
        System.out.println(isEmpty(newQueue));
        newQueue = enqueue(newQueue, 67);
        newQueue = enqueue(newQueue, 45);
        newQueue = enqueue(newQueue, 2);
        newQueue = enqueue(newQueue, 56);
        newQueue = dequeue(newQueue);
        newQueue = dequeue(newQueue);
        System.out.println(newQueue.length);

    }

    public static boolean isEmpty(Integer[] queueArray){
        return queueArray.length == 0;
    }

    public static void printer(Integer val, String action){
        if(val==-1){
            System.out.println("Queue is Empty");
        }else{
            System.out.println(action+ " "+ val);
        };
    }

    public static Integer[] dequeue(Integer[] queueArray){

        // first check if queue is empty
        if(isEmpty(queueArray)){
            printer(-1, "dequeued");
            return queueArray;
        }
        else {
            // get value to be dequeued
            int value = queueArray[0];

            // convert to array list
            List<Integer> queueArrayList = new ArrayList<Integer>();
            Collections.addAll(queueArrayList, queueArray);

            // remove first item
            queueArrayList.remove(0);

            // convert back to list
            Integer[] newQueueArray = new Integer[queueArrayList.size()];
            newQueueArray = queueArrayList.toArray(newQueueArray);

            printer(value, "dequeued");
            return newQueueArray;
        }
    }

     public static Integer[] enqueue(Integer[] queueArray, Integer newValue){
        // convert to array List
        List<Integer> queueArrayList = new ArrayList<Integer>();
        Collections.addAll(queueArrayList, queueArray);

        //Add new item
        queueArrayList.add(queueArray.length, newValue);

        Integer[] newQueueArray;
        newQueueArray = queueArrayList.toArray(queueArray);
        return newQueueArray;
    }
}
