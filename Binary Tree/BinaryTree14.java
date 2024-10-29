package Bintree;

public class BinaryTree14 {
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
    public static Node lowestCommanAncestor(Node root,int n1,int n2){
        if(root == null){
            return null;
        }
        if(root.data==n1||root.data ==n2){
            //root itself or one is true (means the root is n1 or n2)
            return root;
        }
        Node lcaInLeft = lowestCommanAncestor(root.left, n1, n2);
        Node lcaInRight = lowestCommanAncestor(root.right, n1, n2);

        if(lcaInLeft== null) {
             return lcaInRight;
        }
        if(lcaInRight ==  null) {
            return lcaInLeft;
        }
        return root;

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
        int n1 =4,n2 = 6;
        System.out.println(lowestCommanAncestor(root, n1, n2).data);

    }
}
