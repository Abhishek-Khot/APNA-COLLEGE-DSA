package LinkedList2;

public class assignment1 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node getIntersectionNode(Node headA, Node headB) {
        Node temp1 = headA, temp2 = headB;
        while (temp1 != null) {
            while (temp2 != null) {
                temp2 = temp2.next;
                if (temp1 == temp2) {
                    return temp2;
                }
            }
            // updation - go to initial position
            temp2 = headB;
            temp1 = temp1.next;
        }
        return null;
    }
    //optimized approach --> not give the TLE
    public static Node getIntersectionNode2(Node headA, Node headB){
        Node temp1 = headA,temp2 = headB;
        while (temp1!=temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1 == null && temp2 == null){
                return null;
            }
            if(temp1==null){
                temp1 = headB;
            }
            if(temp2==null){
                temp2=headA;
            }
        }
        return temp1;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(6);
        head1.next.next.next.next = new Node(7);

        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = head1.next.next.next;
        Node newNode =getIntersectionNode2(head1,head2);
        System.out.println(newNode.data);
    }
}
