package LinkedList;

public class addlast {
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
    
    //methods
    //1.add at the first
    public void addFirst(int data){
        //1.create
        Node newNode=new Node(data);
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
        if(head ==null){
            head = tail = newNode ;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public static void main(String[] args) {
        addlast ll = new addlast();  //creating linked list
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
    }
}
