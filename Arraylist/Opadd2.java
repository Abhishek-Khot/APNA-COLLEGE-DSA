package Arraylist;

import java.util.ArrayList;

public class Opadd2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(1,9);
        System.out.println(list);

    }
}
