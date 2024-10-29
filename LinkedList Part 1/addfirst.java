package LinkedList;

import java.util.*;

import java.util.LinkedList;

public class addfirst {
    //creating a node
    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    //head and tell
    public static Node head;
    public static Node tail;
    //methods to do add
    //add at first
    public void add(int data){
        //1.create new node
        Node newNode = new Node(data);
        //empty node condition
        if(head==null){
            head = tail = newNode;
            return;
        }
        //2.new node next points to head
        newNode.next = head;
        //3.newNode is head now
        head = newNode;


    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
