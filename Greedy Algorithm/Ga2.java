package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ga2 {
    public static void main(String[] args) {
        int start[] ={1,3,0,5,8,5};
        int end[] ={2,4,6,7,9,9};
        int activities[][]= new int[start.length][3];
        //three because we will store the index,start,end
        for(int i =0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //use lambda function to sort according to end 
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        
        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct =0;
        
        //first activity start
        ans.add(activities[0][0]);
        maxAct = 1;
        //remaining activities
        int ending = activities[0][2];
        for(int i =1;i<end.length;i++){
            if(activities[i][1]>= ending){
                ans.add(activities[i][0]);
                maxAct++;
                ending = activities[i][2];
            }
        }
        System.out.println("The maximum activities are "+maxAct);
        for(int i =0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");//our values of i stored in the arraylist i indicates which acitivity is passed in if loop
            //for what value of i it is showing acitvity is going on--> that is stored in ans arraylist
        }
        System.out.println();


    }
}
