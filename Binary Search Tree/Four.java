package BST;
//Time complexity is O(H);
public class Four {
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
    //print in range
    public static void printInRange(Node root,int k1,int k2 ) {
        if(root == null){
            return ;
        }
        if(root.data>=k1&&root.data<=k2){
            //print inorder
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data>k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i =0;i<values.length;i++){
            root = build(root, values[i]);//assign to root because root se hi build kar rahe hai
        }
        // inorder(root);
        System.out.println();

        printInRange(root, 5, 12);
        
    }
}
