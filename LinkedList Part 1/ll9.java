package LinkedList;

import java.util.*;

public class ll9 {
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

    
    public void reverse(){//see the dry run you will get
        Node prev = null;//before head points to the null
        Node curr = tail = head;//head is assign to tail because the head become tail 
        //head is pointing to null after revesing the list--> conclusion is head become tail
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;//prev become the curr
            curr = next;//curr become next
        }
        head = prev;
    }
    public static void main(String[] args) {
        ll9 ll = new ll9();
        ll.addLast(1);//node 3
        ll.addLast(2);//node 4
        ll.addLast(3);//node 4
        ll.addLast(4);//node 4
        ll.addLast(5);
        ll.addLast(6);
        ll.Print();
        ll.reverse();
        ll.Print();        

    }
}
