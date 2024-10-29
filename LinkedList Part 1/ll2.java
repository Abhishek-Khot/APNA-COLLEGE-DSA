package LinkedList;

import java.util.*;

public class ll2 {
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
    public void deleteNthNode(int n){
        int size =0;
        Node temp = head;
        while(temp!=null) {
         temp = temp.next;
         size++;
        }
        if(n==size){//to size is 10 then 10 elt from last is head only
            head = head.next;
            return;
        }
        int i =1;
        int iFindEnd = size-n;//prev node
        Node prev = head;//prev is start with head
        while(i<iFindEnd){
         prev = prev.next;
         i++;
        }
        prev.next = prev.next.next;//prev.next will point to next.next
        return;
     }
    public static void main(String[] args) {
        ll2 ll = new ll2();
        ll.addLast(1);//node 3
        ll.addLast(2);//node 4
        ll.addLast(3);//node 4
        ll.addLast(4);//node 4
        ll.addLast(5);
        ll.addLast(6);
        ll.Print();
        ll.deleteNthNode(3);
        ll.Print();        

    }
}
