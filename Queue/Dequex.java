package QUEUE;
import java.util.*;
import java.util.LinkedList;
import java.util.Deque;
// import java.awt.List;

public class Dequex {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);//1
        deque.addFirst(2);//2 1
        deque.addFirst(3);//3 2 1
        System.out.println(deque);
        deque.removeFirst();//2 1
        deque.addLast(4);//2 1 4
        deque.removeFirst();//1 4
        System.out.println(deque);
        System.out.println("First element is : "+deque.getFirst());//1
        deque.getLast();//4
        System.out.println("Last element is :"+deque.getLast());//4
    }
    
}