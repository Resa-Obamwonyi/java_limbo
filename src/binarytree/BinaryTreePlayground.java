package binarytree;

public class BinaryTreePlayground {
   public static void main(String[] args){
       Node root = new Node(5);

       Tree myNewTree = new Tree();
       myNewTree.insert(root, 3);
       myNewTree.printTree(root);
   }

}
