package queuesandstacks;

public class ArrayStack {

    /**
     * This is a class that implements a Stack(LIFO) using an Array
     * @param args
     */

    // initialize an array as stackArray
    // initialize a head index
    int[] stackArray;
    int indexHead;

    // initialize a stack by setting the array to a fixed length,
    // and setting indexHead to a value
    public void stack(int length){
            this.stackArray = new int[length];
            this.indexHead = length - 1;
        }

    // to get the size, return the difference between the stack origin length and the index of head
    public int size(){
        return this.stackArray.length - this.indexHead;
    }


    // stack is empty if the value at indexHead is zero or -1
    public boolean isEmpty(){
        return stackArray[this.indexHead] == 0 || stackArray[this.indexHead] == -1;
    }

    // to peek: return the value of the element at indexHead in the list, if empty, return -1.
    public int peek () {
        if(isEmpty()){
            return -1;
        }
        else{
           return this.stackArray[this.indexHead];
        }
    }


    public void push(int val) {
        // if array is empty, set new value to first index (counting from top to 0)
        if (isEmpty() ) {
            stackArray[this.indexHead] = val;
        }
        // else if index is greater than 0 and less than length of the array,
        // set value to the next index after current index head
        // decrement head by 1
        else if ( this.indexHead > 0 && this.indexHead < stackArray.length) {
            stackArray[this.indexHead - 1 ] = val;
            this.indexHead = this.indexHead - 1;
        }
        // else throw exception that stack is full
        else{
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
    }

        public Integer pop () {
            // get the value to be popped
            int val = stackArray[this.indexHead];

            // set popped value to -1 (this is how we pop)
            stackArray[this.indexHead] = -1;

            // if the current head is not the root head, i.e. we are not popping the first item in the array,
            // set new head to the previous index before the popped index
            if (this.indexHead != stackArray.length - 1) {
                this.indexHead = this.indexHead + 1;
            }
            return val;

        }

    }
