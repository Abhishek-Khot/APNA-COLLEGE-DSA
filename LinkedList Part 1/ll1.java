package LinkedList;

// import java.util.*;

public class ll1 {
    // create the node
    public static class Node {
        int data;
        Node next;

        public Node(int data)// constructor
        {
            this.data = data;
            this.next = null;
        }
    }

    // head and tail node
    public static Node head;
    public static Node tail;
    public static int size;

    // 2.add at the last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    // print the linked list
    public void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // finding the mid node
    public Node midNode(Node head) {
        Node slow = head;
        Node first = head;
        while (first != null && first.next != null) {
            slow = slow.next;// +1
            first = first.next.next;
        }
        return slow;// slow is my middle node
    }

    public boolean isPalindrome(Node head) {
        // 1]find the mid
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = midNode(head);

        // 2]reverse the second half
        Node prev = null;// head ka previous
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// because the null previous is head of second half
        Node left = head;
        // 3 compare
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;

        }
        return true;
    }

    public static void main(String[] args) {
        ll1 ll = new ll1();
        ll.addLast(1);// node 3
        ll.addLast(2);// node 4
        ll.addLast(3);// node 4
        ll.addLast(2);// node 4
        ll.addLast(1);
        // ll.addLast(6);
        ll.Print();
        System.out.println(ll.isPalindrome(head));

    }
}
