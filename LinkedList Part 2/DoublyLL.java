package LinkedList2;

public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first function
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public static int removeFirst() {
        if (head == null) {
            System.out.println("empty doubly linked list");
            return -1;
        }
        // if the linked list contains the one node
        if (size == 1) {
            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // print the doubly linked list
    public static void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //reverse the doubly linked list
    public static void reverseLinkedList(){
        Node currNode = head;
        Node preNode = null;
        Node nextNode;
        while (currNode!= null) {
            nextNode = currNode.next;
            currNode.next = preNode;
            currNode.prev = nextNode;
            preNode = currNode;
            currNode = nextNode;
        }
        head = preNode;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printLinkedList();
        System.out.println();
        System.out.println("size of the doubly linked list is " + dll.size);

        // dll.removeFirst();
        // dll.printLinkedList();
        // System.out.println();
        // System.out.println("size of the doubly linked list is " + dll.size);

        // dll.removeFirst();
        // dll.printLinkedList();
        // System.out.println();
        // System.out.println("size of the doubly linked list is " + dll.size);

        dll.reverseLinkedList();
        dll.printLinkedList();
    }
}
