package Arraylist;

import java.util.*;

public class pairsum2 {

    public static boolean pairSum(ArrayList<Integer> list,int target){
        int leftPointer =0;
        int rightPointer = list.size()-1;
        while (leftPointer<rightPointer) {
            //case 1
            if(list.get(leftPointer)+list.get(rightPointer)==target){
                return true;
            }
            else if(list.get(leftPointer)+list.get(rightPointer)<target){
                leftPointer++;
            }
            else{
                rightPointer--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // 1,2,3,4,5,6 and tar =5;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 11;
        boolean ans = pairSum(list, target);
        System.out.println(ans);
    }
}
