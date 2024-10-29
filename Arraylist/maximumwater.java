package Arraylist;

import java.util.ArrayList;

import java.lang.Math;

public class maximumwater {

    public static int waterStored(ArrayList<Integer> height) {
        int maxWATER = 0;
        for(int i =0;i<height.size();i++){
            for(int j =i+1;j<height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));//we are using arraylist
                int width = j-i;
                int currWater = ht*width;
                maxWATER = Math.max(maxWATER, currWater);
            }
        }
        return maxWATER;
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
