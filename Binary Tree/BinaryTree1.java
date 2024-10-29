package Bintree;
public class BinaryTree1 {
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
    static class BinaryTree{
        static int idx=-1;//static because in recursion the value will change and start with -1 to change it to 0 then 1 and so on 
        //start should be from 0 so -1
        public static Node BuildTree(int nodes[]){
            idx++;//first node in tree
            if(nodes[idx] == -1){//if value is -1 then assign null
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right= BuildTree(nodes);
            return newNode;
        }
        
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        // System.out.println(root); return address because you know that
        System.out.println(root.data);
    }
}
