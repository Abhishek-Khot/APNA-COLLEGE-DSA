package Bintree;
                                                             //inefficient way 
public class BinaryTree8 {
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
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftdiameter = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiameter = diameter(root.right);
        int rightHeight = height(root.right);
        int selfdiam = leftHeight+rightHeight +1;
        // return Math.max(rightDiameter, selfHeight,selfdiam);//show error
        return Math.max(Math.max(rightDiameter,leftdiameter) ,selfdiam);

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
        System.out.println(height(root));
        System.out.println(diameter(root));
    }
}
