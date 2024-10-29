package QUEUE;

//queue using linked list----> microsoft

public class LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class queue {
        //both are initialize to null
        static Node  head=null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head ==null&&tail ==null;
        }
        //add
        public static void add(int data){
            Node newNode = new Node(data);
            //if it is empty
            if(head == null){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
           int front = head.data;
           //for single element
           if(head == tail){
             head = tail = null;
           }
           else{
            head = head.next;
           }
           return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            //peek means first element-->means head data
            return head.data;

        }
    }
    public static void main(String[] args) {
        queue q = new queue();//CREATED A OBJ OF CLASS queue
        q.add(1);//queue is static class and
        //and q not static
        //you can use
        queue.add(2);//directly
        q.add(3);
        q.add(7);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        //output ==> 123 because fifo order
        while (!q.isEmpty()) {//padte vakt asa pado--> jab tak queue empty nahi hota
            System.out.println(q.peek());
            q.remove();
        }
//following will resolve all errors
        // // queue  = new queue();//CREATED A OBJ OF CLASS queue
        // queue.add(1);//queue is static class and
        // //and q not static
        // //you can use
        // queue.add(2);//directly
        // queue.add(3);
        // queue.add(7);
        // System.out.println(queue.remove());
        // queue.add(4);
        // System.out.println(queue.remove());
        // queue.add(5);

        // //output ==> 123 because fifo order
        // while (!queue.isEmpty()) {//padte vakt asa pado--> jab tak queue empty nahi hota
        //     System.out.println(queue.peek());
        //     queue.remove();
        // }
    }
}
