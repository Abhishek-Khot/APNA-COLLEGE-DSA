package Bintree;

public class BinaryTree16 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static int tranForm(Node root){
        if(root==null){
            return 0;
        }
        int leftChild = tranForm(root.left);
        int rightChild = tranForm(root.right);
        int data = root.data;
        int newLeft = root.left == null?0:root.left.data;
        int newRight = root.right == null?0:root.right.data;
        root.data = newLeft+leftChild+newRight+rightChild;
        // root.left.data--> new leftChild--> previous
        return data;

    }
    //print the binary tree by using the preorder

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"   ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        /*
         *       1
         *      / \
         *     2   3
              / \   \
         *   4   5   6 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        tranForm(root);
        preorder(root);
    }
}
