package QUEUE;

import java.util.*;


public class queueB {
      class queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();//static obj can access only static stacks

        public static boolean isEmpty() {
            return s1.isEmpty();
        }
        //add
        public static void add(int data){
            //all element tranfer to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            //push into s1
            s1.push(data);
            //tranfer from s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            //input is 123 then stack is 321 
            //so we are doing this
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();//all data is in s1

        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
        

    }

    public static void main(String[] args) {
        // queue q = new queueB.queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        }
    }

