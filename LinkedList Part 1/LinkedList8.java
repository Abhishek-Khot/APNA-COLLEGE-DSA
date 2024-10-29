package LinkedList;

import java.util.*;

public class LinkedList8 {
    //create the node
    public static class Node{
        int data;
        Node next;
        public Node(int data)//constructor
        {
            this.data= data;
            this.next = null;
        }
    }
    //head and tail node
    public static Node head;
    public static Node tail;
    public static int size;
    //2.add at the last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head = tail = newNode ;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    //print the linked list
    public void Print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Search(int key){
        Node temp = head;
        int i= 0;
        while (temp!=null) {
            if(temp.data==key){
                return i;
            }
            temp =temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        // if(idx==-1){
        //     //if key not found then the idx is -1 only not increase
        //     return -1;
        // }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }
    public static void main(String[] args) {
        LinkedList8 ll = new LinkedList8();
        ll.addLast(1);//node 3
        ll.addLast(2);//node 4
        ll.addLast(3);//node 4
        ll.addLast(4);//node 4
        ll.Print();
        int key= 4;
        int ans = ll.recursiveSearch(key);
        System.out.println("Found at index "+ans);
        int key1= 5;
        int ans2 = ll.recursiveSearch(key);
        System.out.println("Found at index "+ans);

        

    }
}
