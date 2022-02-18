package binarytree;

public class Tree {
    //    insert(root, value);
    public void insert(Node root, int value){
        // if root is null, create then return
        if(root == null){
            root = new Node(value);
            return;
        }

        // if left is null, create then return
        if(root.left == null){
            root.left = new Node(value);
            return;
        }
        // if right is null, create, set root to is complete,  then return
        if(root.right == null){
            root.right = new Node(value);
            root.isFull = true;
            return;
        }

        // if root is complete, check if root.left is complete, create, then return
        if(root.isFull && !root.left.isFull){
            insert(root.left, value);
//            root.left.isFull = true;
            return;
        }

        // if root is complete, check if root.right is complete, create, then return
        if(root.isFull && !root.right.isFull){
            insert(root.right, value);
//            root.right.isFull = true;
            return;
        }
    }


    // print tree
    public void printTree(Node root){
        while( root != null){
            System.out.println(root.value);
            printTree(root.left);
            printTree(root.right);
        }
    }
}
