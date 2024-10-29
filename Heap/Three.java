package Heap;

import java.util.ArrayList;

public class Three {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();
        //create a function to add 
        // add the data at last index
        // public static void add(int data) {//cant write static because arraylist is dynamic
        // public  void add(int data) {
        //     arr.add(data);// in arraylist automatical add at last index
        //     //arr.size()-1 is last index
        //     int parent = (arr.size()-1-1)/2;
        //     while (arr.get(arr.size()-1)<arr.get(parent)) {
        //         int temp = arr.get(arr.size()-1);//temp = child;
        //         arr.set(arr.size()-1,arr.get(parent));//set child = parent
        //         arr.set(arr.get(parent), temp);       //set parent = temp
        //         x =parent;
        //         parent  =(x-1)/2;

        //     }
        // }
        //correct version--above also correct
        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int parent = (x-1)/2;
            while (arr.get(x)<arr.get(parent)) {
                int temp = arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent, temp);
                //updation
                x =parent;
                parent  =(x-1)/2;
            }

        }
        public void peek(){
            System.out.println(arr.get(0));
        }
        public static void main(String[] args) {
            
        }

    }
}
