package BST;



public class one {
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
    //build
    public static Node build(Node root,int val){
        //starting is null so create a new node
        if(root == null) {
            root = new Node(val);//assign new value in root
            return root;
        }
        if(root.data< val){
            root.right=build(root.right,val);
        }
        else{
            root.left = build(root.left, val);
        }
        return root;
    }
    //inorder traversal
    public static void inorder(Node root){
        //inorder == left root right
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node root){
        //inorder == left root right
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        inorder(root.left);
        inorder(root.right);
    }
    public static void postorder(Node root){
        //inorder == left root right
        if(root == null){
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int values[]={ 100, 85, 45, 55, 120, 20, 70, 90, 115, 65, 130, 145};
        Node root = null;// null starting -->no nodes are present
        for(int i =0;i<values.length;i++){
            root = build(root, values[i]);
        }
        inorder(root); 
        preorder(root);   
        postorder(root);
    }
}
