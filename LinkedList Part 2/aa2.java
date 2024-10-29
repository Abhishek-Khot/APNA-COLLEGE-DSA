package LinkedList2;

public class aa2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;

    public static void deleteMandN(int m, int n) {
        Node temp = head;
        while (temp!= null) {
            // keep so start from 1 because while should contain one updation condition so
            for (int i = 1; i < m; i++) {
                temp = temp.next;
            }
            for (int i = 0; i < n; i++) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        int m = 2, n = 1;
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(6);
        head1.next.next.next.next = new Node(7);

        printLinkedList(head1);

        deleteMandN(m, n);
        System.out.println();

        printLinkedList(head1);

    }
}
