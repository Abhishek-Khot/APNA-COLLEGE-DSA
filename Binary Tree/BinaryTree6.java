package Bintree;

import java.lang.Math;

public class BinaryTree6 {
    static class Node{
        int data;
        Node left;
        Node right ;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //height of BST
    public static int heightOfBST(Node root){
        //base case
        if(root == null) {
            return 0;
        }
        int leftHeight = heightOfBST(root.left);
        int rightHeight = heightOfBST(root.right);
        int height = Math.max(leftHeight, rightHeight)+1;//plus one because 
        //height of leaf node is one
        return height;
    }
    //number of nodes function
    public static int numberOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = numberOfNodes(root.left);
        int rightCount = numberOfNodes(root.right);
        int totalCount = leftCount+rightCount+1;
        return totalCount;
    }

    public static void main(String[] args) {
        /*
                        1
                       /  \
                      2    3
                     /  \   \
                    4    5   6     ANSWER =3
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left= new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        System.out.println("HEIGHT IS : "+heightOfBST(root));
        System.out.println("Number of Nodes are : "+numberOfNodes(root));
    }
}
