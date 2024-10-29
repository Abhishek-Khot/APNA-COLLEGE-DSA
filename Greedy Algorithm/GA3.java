package Greedy;

import java.util.*;


public class GA3 {
    public static void main(String[] args) {
        int[] val = {60,100,120};
        int[] weight ={10,20,30};
        int w = 50;


        //create a 2 d array for the ratio because it may or may not be in ascending order
        //also you can create a 2D array of index,val,wt,ratio but no need
        //create for index and ratio only
        int ratio[][] = new int[val.length][2];
        for(int i =0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = (val[i]/weight[i]);
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int capacity = w;
        int totalVal = 0;
        //we want descending order
        for(int i = ratio.length-1;i>=0;i--){
            int index = ratio[i][0];
            if(capacity>= weight[index]){
                capacity -=weight[index];
                totalVal += val[index];
            }
            else{
                totalVal = totalVal+(ratio[i][1]*capacity);
                capacity =0;
                break;
            }
        }
        System.out.println("Total value is "+totalVal);
    }
}
