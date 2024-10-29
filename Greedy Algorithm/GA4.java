package Greedy;

import java.util.Arrays;
import java.lang.Math;


public class GA4 {
    public static void main(String[] args) {
        int[] A ={1,2,3};
        int[] B ={2,1,3};


        Arrays.sort(A);
        Arrays.sort(B);

        int minAbsolutePairVal =0;

        for(int i =0;i<A.length;i++){
            minAbsolutePairVal += Math.abs(A[i]-B[i]);
        }
        System.out.println("The Absolute pair of the arrays is "+ minAbsolutePairVal);
    }
}
