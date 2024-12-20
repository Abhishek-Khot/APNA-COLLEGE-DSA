package Bintree;

public class BinaryTree12 {
    static class Node {
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
    public static void KthLevel(Node root,int level,int k){
        if(root== null){
            return;
        }

        if(level == k){
            System.out.print(root.data+" ");
        }
        KthLevel(root.left,level+1,k);
        KthLevel(root.right,level+1,k);

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
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        KthLevel(root, 1, 3);
   }
}
