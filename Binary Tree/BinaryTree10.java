package Bintree;

public class BinaryTree10 {
    static class  Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left= null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node root,Node subroot){
        if(root==null&&subroot==null){
            return true;
        }
        //third condition bcz both are null then it is subtree
        else if (root==null||subroot==null||root.data!=subroot.data) {//one true then extra nodes are present
            return false;
        }
        if(!isIdentical(root.left, subroot.left)){
            return false;
        }
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subroot){
        //base
        if(root==null){
            return false;//nodes are not present

        }
        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        // check in left and right tree  
        boolean leftAns = isSubtree(root.left, subroot);
        boolean rightAns = isSubtree(root.right, subroot);
        return leftAns|| rightAns ;//explained in book
        //more effective --> bcz or rules says that first one is true then return true - if false then go for another condition
        // return isSubtree(root.left, subroot)||isSubtree(root.right, subroot);
    }
    public static void main(String[] args) {
        //root node
        //first tree
         /*
                        1
                       /  \
                      2    3
                     /  \   \
                    4    5   6     
         */
        // first tree ==> root node 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
         /*
                      2   
                     /  \  
                    4    5  
         */
        //second tree==> subroot node
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        System.out.println(isSubtree(root, subroot));


    }
}
