package LinkedList2;

import java.util.LinkedList;

public class LL1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);;
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
        System.out.println(ll.getFirst());
    }
}