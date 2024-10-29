package QUEUE;

import java.util.*;

import java.util.LinkedList;

public class queuex {
    //array for primitive and ll for non primitive
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
