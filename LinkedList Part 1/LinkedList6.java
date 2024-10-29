package LinkedList;

import java.util.*;

public class LinkedList6 {
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
    
    //methods
    //1.add at the first
    public void addFirst(int data){
        //1.create
        Node newNode=new Node(data);
        size++;
        //corner case
        if(head ==null){
            head = tail = newNode;
            return;//work is done as it is a single node
        }

        newNode.next = head;
        head = newNode;
    }
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
    //add at index i
    public void add(int data,int idx){
        Node newNode = new Node(data);
        size++;
        if (idx < 0) {
            System.out.println("Index out of bounds");
            return;
        }
        if(head == null || idx==0){
            addFirst(data);//because it do not have the prev node so add at first
            return;
        }
        Node temp = head;
        int i =0;
        while (temp!= null && i<idx-1) {
            //idx-1 bcz the temp.next point to second node (-1) and prev is (-1) ===> idx-2 
            //to find the prev node and add the newNode next to the prev node
            temp = temp.next;//to travel2
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //REMOVE FROM FIRST
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;
        }
        else if (size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;//--->important
        size--;
        return val;
    }
    //remove from last
    public int removeLast(){
        if(size==0){
            System.out.println("The linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        //prev node is node at index size()-2 --> prev: idx-1
        Node prev =head;
        for(int i =0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;//tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static void main(String[] args) {
        LinkedList6 ll = new LinkedList6();
        ll.addFirst(2);//node 1
        ll.addFirst(1);//node 2
        ll.addLast(3);//node 3
        ll.addLast(4);//node 4
        ll.Print();
        ll.removeFirst();
        ll.Print();
        System.out.println("size of the linkedlist is "+size);
        ll.removeLast();
        ll.Print();
        System.out.println("size of the linkedlist is "+size);
        

    }
}
