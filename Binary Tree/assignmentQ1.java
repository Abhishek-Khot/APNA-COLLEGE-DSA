package Bintree;

import LinkedList.node;

//efficient way-->approach 2 
public class assignmentQ1 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    public static boolean isUnivalued(Node root){
        if(root == null){
            return true;
        }
        if(root.left !=null&&root.left.data != root.data){
            return false;
        }
        if(root.right !=null&&root.right.data != root.data){
            return false;
        }
        boolean isLeftUnivalued = isUnivalued(root.left);
        if(isLeftUnivalued ==false){
            return false;
        }
        boolean isRightUnivalued = isUnivalued(root.right);
        if(isRightUnivalued==false){
            return false;
        }
        return true;
    }
    
   
    public static void main(String[] args) {
         /*
                        1
                       /  \
                      2    3
                     /  \   \
                    4    5   6     ANSWER =3
         */
        Node root = new Node(6);
        root.left = new Node(6);
        root.left.left= new Node(6);
        root.left.right = new Node(9);
        root.right = new Node(6);
        root.right.left = new Node(6);
        root.right.right = new Node(6);
        if(isUnivalued(root)==true){
            System.out.println("Univalued ");
        }
        else{
            System.out.println("Not univalued ");
        }
    }
}
