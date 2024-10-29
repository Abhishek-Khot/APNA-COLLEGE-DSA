package QUEUE;

public class array {
    static class  queue {
        static int arr[];//array to implement
        static int size;
        static int rear;
        queue(int n){
            arr = new int[n];//new array of size n
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear ==-1;
        }
        //add
        public static void add(int data){
            if(rear == size -1){//size - 1 means last index
                System.out.print("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear]=data;//store the data where the rear points in array
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i =0;i<rear;i++){
                arr[i]=arr[i+1];//making second element as first element
            }
            rear = rear - 1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            //peek means first element
            return arr[0];
        }
    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        //output ==> 123 because fifo order
        while (!q.isEmpty()) {//padte vakt asa pado--> jab tak queue empty nahi hota
            System.out.println(q.peek());
            q.remove();
        }
    }
}
