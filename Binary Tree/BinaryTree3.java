package Bintree;

import java.util.*;

public class BinaryTree3 {
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
        //preorder
        public static void preorder(Node root){
            if(root==null){
                // System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        //inorder
        public static void inorder(Node root){
            if(root==null){
                // System.out.print(-1+" ");
                return ;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        //postorder
        public static void Postorder(Node root){
            if(root==null){
                // System.out.print(-1+" ");
                return ;
            }
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data+" ");
        }
        
        
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println("Preorder");
        tree.preorder(root);
        System.out.println("\nInorder");
        tree.inorder(root);
        System.out.println("\nPostorder");
        tree.Postorder(root);

    }
}
