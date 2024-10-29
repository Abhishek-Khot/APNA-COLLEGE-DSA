package Bintree;

import java.util.ArrayList;
public class BinaryTree13 {
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
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        //base case
        if(root== null){
            //explained in notes
            return false;
        }
        //add root to arraylist
        path.add(root);
        if(root.data == n){
            //agar current root ka data equal to n the true
            return true;
        }
        boolean foundInLeft = getPath(root.left,n,path);
        boolean foundInRight = getPath(root.right,n,path);
        if(foundInLeft||foundInRight){
            return true;
        }
        //if not found then remove all elements from the arraylist
        path.remove(path.size()-1);
        return false;
    }
    public static Node LowestCommonPath(Node root,int n1,int n2){
        //for storing the path1 and path2
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);
        int i =0;
        for(;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;//explained in notes
            }
        }
        Node lca = path1.get(i-1);
        return lca;
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
        int n1 =4,n2 = 5;
        System.out.print(LowestCommonPath(root,n1,n2).data);

    }
}
