package QUEUE;

                                        //////circular queue//////

public class array1 {
    static class  queue {
        static int arr[];//array to implement
        static int size;
        static int rear;
        static int front;
        queue(int n){
            arr = new int[n];//new array of size n
            size = n;
            rear = -1;
            front =-1;//for implementing the cicular queue 
        }
        public static boolean isEmpty(){
            return rear ==-1&&front ==-1;
        }
        public static boolean isFull(){
           return (rear+1)%size == front;//if the front is after the rear so full
        }
        //add
        public static void add(int data){
            if(isFull()){//size - 1 means last index
                System.out.print("Queue is full");
                return;
            }
            //for adding the first element 
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;//as it is a circular queue
            arr[rear]=data;//store the data where the rear points in array
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            //if we remove the last element
            if(rear==front){
               front = rear = -1;
            }
            else{
                front = (front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            //peek means first element
            return arr[front];//the rear point at last and front point on elt from starting -->while removing so first element is at front

        }
    }
    public static void main(String[] args) {
        queue q = new queue(3);
        q.add(1);
        q.add(2);
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
    }
}
