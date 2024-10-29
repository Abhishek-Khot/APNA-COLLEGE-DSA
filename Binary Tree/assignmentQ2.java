package Bintree;

//efficient way-->approach 2 
public class assignmentQ2 {
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
    public static Node mirror(Node root){

        if(root == null){
            return null;
        }
        Node newNode = new Node(root.data);
        Node leftmirror = mirror(root.left);
        Node rightmirror = mirror(root.right);
        newNode.left =rightmirror;
        newNode.right = leftmirror;
        return newNode;
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
        System.out.println(mirror(root));
        
    }
}
