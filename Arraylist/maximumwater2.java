package Arraylist;

import java.util.ArrayList;

import java.lang.Math;

public class maximumwater2 {

    public static int waterStored(ArrayList<Integer> height) {
        int lp = 0;
        int rp = height.size()-1;
        int maxWater =0;
        while (lp<rp) {
            //calculater the water
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater= ht*width;
            maxWater = Math.max(maxWater, currWater);
            //condition (means lp++ and rp--)
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        //1,8,6,7,5,4,8,3,7
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(7);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // height.add(1);
        System.out.println(waterStored(height));
    }
}
