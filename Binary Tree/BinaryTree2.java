package Bintree;

import LinkedList.node;
import STACKC.stock;

public class BinaryTree2 {
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
    static class BinaryTree {
        static int idx=-1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnNode = new Node(nodes[idx]);
            newnNode.left = BuildTree(nodes);
            newnNode.right = BuildTree(nodes);
            return newnNode ;
        }
    
        
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(root.data);
    }
}