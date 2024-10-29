package Bintree;
                                                             //efficient way-->approach 2 
public class BinaryTree9 {
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
    //height of tree
    public static int height(Node root){
        if(root ==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int totalHeight = Math.max(leftHeight, rightHeight)+1;
        return totalHeight;
    }
    //diameter of the BST
    static class Info {
        int diam;
        int ht;
        Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diaMeter(Node root){
        Info leftInfo = diaMeter(root.left);
        Info rightInfo = diaMeter(root.right);
        int diameter = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int height = Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(diameter, height);
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
        System.out.println("Height is :");
       System.out.println(diaMeter(root).ht);
       System.out.println("Diameter is :");
        System.out.println(diaMeter(root).diam);
    }
}
