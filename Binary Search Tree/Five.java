package BST;

import java.util.ArrayList;

//Time complexity is O(H);
public class Five {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //build the bse
    public static Node build(Node root,int val){
        if(root==null){
            root= new Node(val);
            return root;
        }
        if(root.data<val){
            root.right = build(root.right, val);
        }
        else{
            root.left = build(root.left, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null ) {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    //print the left to root paths
    public static void printThePathFromLeafToRoot(Node root,ArrayList<Integer> path) {
        //base case
        if(root == null){
            return;
        }
        //arraylist to store the path
        //add the root to the path
        path.add(root.data);
        //if the both become null print the path
        if(root.left == null && root.right == null){
            printThePath(path);
        }
        printThePathFromLeafToRoot(root.left, path);
        printThePathFromLeafToRoot(root.right, path);
        //backtracking
        //remove the last element of the list
        path.remove(path.size()-1);
    }
    //print the path
    public static void printThePath(ArrayList<Integer> path) {
        for(int i = 0 ; i <path.size();i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int values[]={8,5,10,3,6,11,14};
        Node root = null;
        for(int i =0;i<values.length;i++){
            root = build(root, values[i]);//assign to root because root se hi build kar rahe hai
        }
        inorder(root);
        System.out.println();
        printThePathFromLeafToRoot(root, new ArrayList<>());
        
    }
}
