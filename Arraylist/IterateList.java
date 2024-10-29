package Arraylist;

import java.util.ArrayList;

public class IterateList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("size of list is (size is hole number )"+list.size());//FOUR
        //iterate
        for(int i = 0 ; i < list.size() ; ++i){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();





    }
}
