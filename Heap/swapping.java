package Heap;

import java.util.ArrayList;

public class swapping {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        while(!arr.isEmpty()) {
            int temp = arr.get(0);//1
            arr.set(0,arr.size()-1);//2
            arr.set(arr.size()-1, temp);//1
            arr.remove(arr.size()-1);
        }
        for(int i =0;i<arr.size();i++){
            System.out.println(arr.get(i)+" ");
        }
    }
}
