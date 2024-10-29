package LinkedList2;

public class LinkedList2 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static boolean detectCycle(){
        Node slow = head,fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast ){
                return true;
            } 
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head,fast = head;
        boolean iscycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                iscycle = true;
                break;
            }
        }
        if(iscycle == false){
            return ;
        }
        //finding the meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        System.out.println(detectCycle());
        removeCycle();
        System.out.println(detectCycle());
    }
}
