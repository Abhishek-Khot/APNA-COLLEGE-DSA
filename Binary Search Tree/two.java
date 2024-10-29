package BST;
//Time complexity is O(H);
public class two {
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
    //build the bse
    public static Node build(Node root,int val){
        if(root==null){
            root= new Node(val);
            return root;
        }
        if(root.data<val){
            root.right = build(root.right, val);
        }
        else{
            root.left = build(root.left, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null ) {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    //search
    //four cases
    public static boolean search(Node root,int key){
        //if root is null --> not found anywhere in the bst
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
        
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root = null;
        for(int i =0;i<values.length;i++){
            root = build(root, values[i]);//assign to root because root se hi build kar rahe hai
        }
        inorder(root);
        System.out.println();
        if(search(root, 3)){
            System.out.println("Found in BST");
        }
        else {
            System.out.println("Not found in BST");
        }
    }
}
