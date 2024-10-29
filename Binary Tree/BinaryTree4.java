package Bintree;


import java.util.LinkedList;
import java.util.Queue;;

public class BinaryTree4 {
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
        public static void levelOrder(Node root){
            //check if the root is null
            if(root==null){
                return;
            }
            //add root and null in queue
            Queue<Node> q = new LinkedList<>();
            //add root and null in queue
            q.add(root);
            q.add(null);
            //loop
            while (!q.isEmpty()) {
                //current node
                Node currNode = q.remove();
                //if currNode is null then print next line and if queue is empty then break else not empty then add null at last
                if(currNode==null){
                    System.out.println();
                    //imp--> after every line add null 
                    //empty huva simply return
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                //if currNode is not null 
                //then print the data and check for left and right child not null then print
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    
        
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        tree.levelOrder(root);
    }
}
