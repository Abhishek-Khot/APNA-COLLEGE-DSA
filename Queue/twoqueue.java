package QUEUE;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;


public class twoqueue {
    static class QueueB{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
    }
    //empty check if not empty then push
    public static boolean isEmpty(){
        return QueueB.q1.isEmpty() && QueueB.q2.isEmpty();
    }
    //push because stack

    public static void push(int data){
        if(!QueueB.q1.isEmpty()){
            QueueB.q1.add(data);
        }else{
            QueueB.q2.add(data);
        }
    }
    //pop
    public static int pop(){
        if(QueueB.q1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int top = -1;
        //case 1-->pencil se explain in book
        if(!QueueB.q1.isEmpty()){
            while (!QueueB.q1.isEmpty()) {
                top = QueueB.q1.remove(); //this means --> last element poped 123 me 3 return 3
    
                if(QueueB.q1.isEmpty()){
                    break;
                }
                QueueB.q2.add(top);
                
            }
        }
        else{
            while (!QueueB.q2.isEmpty()) {
                top = QueueB.q2.remove(); 
                if(QueueB.q2.isEmpty()){
                    break;
                }
                QueueB.q1.add(top);
                
            }
        }
        return top;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int top =-1;
        //case 1
        if(!QueueB.q1.isEmpty()){
        while (!QueueB.q1.isEmpty()) {
            top = QueueB.q1.remove();
            if(QueueB.q1.isEmpty()){
                break;
            }
            QueueB.q2.add(top);
        }
    }
        else{
           
                while (!QueueB.q1.isEmpty()) {
                    top = QueueB.q1.remove();
                    if(QueueB.q1.isEmpty()){
                        break;
                    }
                    QueueB.q1.add(top);
                }
                
        }
        return top;
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }
}
