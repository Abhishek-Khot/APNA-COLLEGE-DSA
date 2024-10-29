package Bintree;

import java.lang.Math;

public class BinaryTree7 {
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
        int height = Math.max(leftHeight, rightHeight)+1;
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
    //sum of nodes
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        int totalSum = leftSum+rightSum+root.data;
        return totalSum;

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
        System.out.println("Sum of all nodes is : "+sumOfNodes(root));
    }
}
