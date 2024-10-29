package LinkedList2;
public class LL3 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head =null;
    public static Node tail= null;

    //add first
    public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //print the linkedlist
    public static void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    //function for zigzac
    public static void ZigZac(){
        //find the mid
        Node slow = head;
        Node fast = head.next;
        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast= fast.next.next;
        }
        Node mid = slow;
        //reverse the second half
        Node currNode = mid.next;
        mid.next = null;
        Node preNode = null;
        Node nextNode;
        while (currNode!=null) {
            nextNode = currNode.next;
            currNode.next = preNode;
            //updation
            preNode = currNode;
            currNode = nextNode;
        }
        //merge in zigzac fashion
        Node leftHead = head;
        Node rightHead = preNode;//because the currNode go until null and the prev node for currnode is head for second half
        Node leftH,rightH;//temporary storage for ramaining linkedlist
        while (leftHead!=null&&rightHead!=null) {
            leftH = leftHead.next;//store
            leftHead.next = rightHead;
            rightH = rightHead.next;//store
            rightHead.next = leftH;
            //updation
            leftHead = leftH;
            rightHead = rightH;
        }

    }
    public static void main(String[] args) {
        LL3 ll = new LL3();
        ll.add(6);
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.print();
        ll.ZigZac();
        System.out.println();
        ll.print();
    }
}
