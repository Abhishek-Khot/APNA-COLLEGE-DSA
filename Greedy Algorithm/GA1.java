package Greedy;

import java.util.*;
public class GA1 {
    public static void main(String[] args) {
        //solving the activity selection problem
        int start[] ={1,3,0,5,8,5};
        int end[] ={2,4,6,7,9,9};
        //condition 1 : normal way when the end is sorting 
        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct =0;

        //for first activity
        maxAct =1;
        ans.add(0);
        int endOfPreviousActivity = end[0];
        //start alway start from 1 bcz first activity already counted
        for(int i =0;i<end.length;i++){
            if(start[i]>=endOfPreviousActivity){
                ans.add(i);
                maxAct++;
                //update end of previous activity
                endOfPreviousActivity = end[i];
            }
        }
        System.out.println("The maximum activities are "+maxAct);
        for(int i =0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");//our values of i stored in the arraylist i indicates which acitivity is passed in if loop
        }
        System.out.println();

    }
}
