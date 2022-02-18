package binarytree;

public class Node {
    /**
     * This is a class that implements the instance of a node for a binary tree
     * It has value, right and left variables
     */

    int value;
    Node left = null;
    Node right = null;
    Boolean isFull = false;

    public Node(int value){
        this.value = value;
    }
}