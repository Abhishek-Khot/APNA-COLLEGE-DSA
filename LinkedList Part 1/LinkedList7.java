package LinkedList;

import java.util.*;

public class LinkedList7 {
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
    public static void main(String[] args) {
        LinkedList7 ll = new LinkedList7();
        ll.addLast(1);//node 3
        ll.addLast(2);//node 4
        ll.addLast(3);//node 4
        ll.addLast(4);//node 4
        ll.Print();
        int key =4;
        int idx =ll.Search(key);
        System.out.println("The data is at index "+idx);
        

    }
}
