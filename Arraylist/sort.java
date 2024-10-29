package Arraylist;

import java.util.ArrayList;

import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(9);
        //print as it is
        System.out.println(list);
        System.out.println("Assending by default ");
        Collections.sort(list);
        System.out.println(list);//print sorted list
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order list ");
        System.out.println(list);
    }
}
