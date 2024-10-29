package Bintree;

public class BinaryTree15 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    //lowest common ancestor
    public static Node lowestcommonAncestor(Node root,int n1,int n2){
        if(root==null) {
            return null;
        }
        if(root.data==n1||root.data==n2){
            return root;
        }
        Node FoundAtLeft = lowestcommonAncestor(root.left, n1, n2);
        Node FoundAtRight = lowestcommonAncestor(root.right, n1, n2);
        if(FoundAtLeft==null){
            return FoundAtRight;
        }
        if(FoundAtRight==null){
            return FoundAtLeft;
        }
        return root;

    }
    //lca distance
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDistance =  lcaDist(root.left, n);
        int rightDistance = lcaDist(root.right, n);
        if(leftDistance == -1&&rightDistance==-1){
            return -1;
        }
        if(leftDistance==-1){
            return rightDistance+1;
        }
        else if(rightDistance == -1){
            return leftDistance+1;
        }
        else{
            return rightDistance+1;
        }
    }
    //min dist b/w two node
    public static int minDistace(Node root,int n1,int n2){
        Node lca = lowestcommonAncestor(root, n1, n2);
        int dist1= lcaDist(lca,n1);//lca to n1
        int dist2 = lcaDist(lca,n2);//lca to n2
        return dist1+dist2;
        
    }
    public static void main(String[] args) {
        /*
         *       1
         *      / \
         *     2   3
              / \   \
         *   4   5   6 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        int n1 = 9, n2 = 6;
        System.out.println(minDistace(root, n1, n2));

    }
}
