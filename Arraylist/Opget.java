package Arraylist;

import java.util.ArrayList;

public class Opget {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        //get element of index i
        int element = list.get(2);
        System.out.println("Element at index 2 is "+element);
        //remove element at index i
        list.remove(2);
        System.out.println("Removed element at index 2 "+list);
    }
}
