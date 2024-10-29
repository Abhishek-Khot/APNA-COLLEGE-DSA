package LinkedList2;

public class LL2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public  Node head;
    public static Node tail;

    public void print(Node head) {
        Node temp = head;
        while (temp!=null) {
            //temp.next kel tr last elt rahanar
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;// here next because the we want the mid from first half
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        // mid
        Node mid = getMid(head);
        // left and right
        // here the complete ll will divide into sigle sigle part for left and right
        // part and then merge those left and right part
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // merge
        return merge(newLeft, newRight);
    }

    public static Node merge(Node head1, Node head2) {
        Node mergell = new Node(-1);
        Node temp = mergell;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        // for remaining element
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        LL2 ll = new LL2();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print(ll.head);
        System.out.println();
        ll.head = ll.mergeSort(ll.head);
        ll.print(ll.head);
    }
}
