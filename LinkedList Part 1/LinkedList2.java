package LinkedList;

public class LinkedList2 {
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
        while (temp!= null && i<idx-1) {//to find the prev node and add the newNode next to the prev node
            temp = temp.next;//to travel2
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(10, 2);
        ll.add(11, 3);
        ll.add(12, 4);
        ll.Print();
    }
}
