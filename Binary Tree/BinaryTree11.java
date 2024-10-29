package Bintree;

import java.util.Queue;

import java.util.LinkedList;

import java.util.HashMap;

import java.util.*;

public class BinaryTree11 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    //info class for storing the both value and key
    static class Info {
        Node node;
        int hoDi;
        Info(Node node,int hoDi ){
            this.hoDi=hoDi;
            this.node= node;
        }
        
    }
    //top view
    public static void topView(Node root){
        //level order traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map =  new HashMap<>();
        int min =0,max = 0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            //q is type of Info so use Info
            Info cur = q.remove();
            if(cur == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);//for next level
                }
            }
            else{
                if(!map.containsKey(cur.hoDi)){
                    map.put(cur.hoDi, cur.node);
                }
                if(cur.node.left != null){
                    q.add(new Info(cur.node.left,cur.hoDi-1));
                    min = Math.min(min, cur.hoDi-1);
                }
                if(cur.node.right != null){
                    q.add(new Info(cur.node.right,cur.hoDi+1));
                    max = Math.max(max, cur.hoDi+1);
                }
            }
        }
        for(int i =min;i<=max;i++){
            System.out.print(map.get(i).data+ " ");
        }
    }
    public static void main(String[] args) {
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
        topView(root);
    }
}
